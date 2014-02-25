package com.example.dbflute.mysql.dbflute.vendor;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.helper.HandyDate;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.unit.core.thread.ThreadFireExecution;
import org.seasar.dbflute.unit.core.thread.ThreadFireFinallyRunner;
import org.seasar.dbflute.unit.core.thread.ThreadFireOption;
import org.seasar.dbflute.unit.core.thread.ThreadFireResource;
import org.seasar.dbflute.unit.core.transaction.TransactionResource;
import org.seasar.dbflute.util.DfCollectionUtil;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5B (2014/02/18 Tuesday)
 */
public class VendorLockTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    @Override
    protected boolean isSuppressTestCaseTransaction() {
        return true;
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_Deadlock_uniqueKey() throws Exception {
        final Timestamp purchaseDatetime = new HandyDate(currentDate()).moveToDayJust().getTimestamp();
        String expected = "Deadlock found"; // why?
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                Purchase purchase = purchaseBhv.selectByPKValue(3L);
                purchase.setMemberId(1);
                purchase.setProductId(1);
                purchase.setPurchaseDatetime(purchaseDatetime);
                purchaseBhv.insert(purchase);
                return null;
            }
        }, new ThreadFireOption().threadCount(3).repeatCount(1).expectExceptionAny(expected));

        /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        Failed to execute the SQL for insert.

        [Advice]
        Read the SQLException message.

        [SQLState]
        40001

        [ErrorCode]
        1213

        [SQLException]
        org.seasar.framework.exception.SSQLException
        [ESSR0072]SQLで例外(SQL=[insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
         values (?, ?, ?, ?, (? + 13), ?, ?, ?, ?, ?, ?)], Message=[1213], ErrorCode=40001, SQLState={3})...

        [NextException]
        com.mysql.jdbc.exceptions.jdbc4.MySQLTransactionRollbackException
        Deadlock found when trying to get lock; try restarting transaction

        [Behavior]
        PurchaseBhv.insert()

        [Display SQL]
        insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
         values (9, 9, '2014-02-18 16:57:52.032', 1, (1787 + 13), 1, '2014-02-18 16:57:51.999', 'pool-44-thread-15', '2014-02-18 16:57:51.999', 'pool-44-thread-15', 0)
        * * * * * * * * * */
    }

    public void test_insert_ForeignLockWait() throws Exception {
        final int memberId = 7;
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                if (resource.getThreadId() % 2 == 0) {
                    Member member = new Member();
                    member.setMemberId(memberId);
                    member.setMemberName("lock1");
                    memberBhv.updateNonstrict(member);
                    sleep(5000);
                } else {
                    sleep(300);
                    Purchase purchase = purchaseBhv.selectByPKValue(3L);
                    purchase.setMemberId(memberId);
                    purchase.setProductId(1);
                    purchase.setPurchaseDatetime(currentTimestamp());
                    InsertOption<PurchaseCB> option = new InsertOption<PurchaseCB>();
                    option.configure(new StatementConfig().queryTimeout(3));
                    purchaseBhv.varyingInsert(purchase, option);
                }
                return null;
            }
        }, new ThreadFireOption().threadCount(2).repeatCount(1).expectExceptionAny("timeout"));
    }

    public void test_insert_Deadlock_NextKeyLock_for_FK() {
        // {3, 6, 7} no deadlock (if no data since first, deadlock)
        // if unique index removed, {3, 6, 9} no deadlock but {3, 3} deadlock
        final Object[] parameters = new Object[] { 3, 7, 9 };
        final List<Purchase> removedPurchaseList = removePurchaseList(parameters);
        final ThreadFireOption fireOption = new ThreadFireOption().parameter(parameters).commitTx();
        fireOption.expectExceptionAny("Deadlock found");
        fireOption.finallyRunner(new ThreadFireFinallyRunner() {
            public void run() {
                InsertOption<PurchaseCB> insertOption = new InsertOption<PurchaseCB>();
                insertOption.disablePrimaryKeyIdentity();
                purchaseBhv.varyingBatchInsert(removedPurchaseList, insertOption);
            }
        });
        final Purchase source = purchaseBhv.selectByPKValueWithDeletedCheck(1L);
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                long threadId = resource.getThreadId();
                Integer memberId = resource.getParameter();

                // empty delete (update, for update) locks new record
                // (if it deletes existing records, second threads waits here)
                PurchaseCB cb = new PurchaseCB();
                cb.query().setMemberId_Equal(memberId);
                cb.disableCheckCountBeforeQueryUpdate();
                purchaseBhv.queryDelete(cb);

                Purchase inserted = source.clone();
                inserted.setMemberId(memberId);
                long randomMillis = currentTimestamp().getTime() + (threadId * 10000);
                inserted.setPurchaseDatetime(toTimestamp(randomMillis));

                resource.await(); // ready...go!
                purchaseBhv.insert(inserted);

                purchaseBhv.delete(inserted); // to revert
                return null;
            }
        }, fireOption);
    }

    protected List<Purchase> removePurchaseList(Object[] parameters) {
        TransactionResource tx = beginNewTransaction();
        try {
            List<Purchase> resultList = newArrayList();
            for (Object object : parameters) {
                Integer memberId = (Integer) object;
                PurchaseCB cb = new PurchaseCB();
                cb.query().setMemberId_Equal(memberId);
                ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);
                purchaseBhv.batchDeleteNonstrict(purchaseList);
                resultList.addAll(purchaseList);
            }
            return resultList;
        } finally {
            tx.commit();
        }
    }

    public void test_insert_Deadlock_NextKeyLock_for_PK() {
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        final Set<Integer> insertedIdSet = DfCollectionUtil.newHashSet();
        final Member source = memberBhv.selectByPKValueWithDeletedCheck(3);
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                long threadId = resource.getThreadId();

                // empty delete (update, for update) locks new record
                // (if it deletes existing records, second waits)
                MemberCB cb = new MemberCB();
                cb.query().setMemberId_Equal(99999);
                cb.disableCheckCountBeforeQueryUpdate();
                memberBhv.queryDelete(cb);

                Member inserted = source.clone();
                inserted.setMemberAccount(threadId + ":" + inserted.getMemberId());

                resource.await(); // ready...go!
                memberBhv.insert(inserted);

                markSet.add("success: " + threadId);
                insertedIdSet.add(inserted.getMemberId());
                return null;
            }
        }, new ThreadFireOption().commitTx().expectExceptionAny("Deadlock found"));
        log(markSet);
        if (!insertedIdSet.isEmpty()) {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_InScope(insertedIdSet);
            memberBhv.queryDelete(cb);
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_Deadlock_basic() {
        final int memberId = 3;
        final Member before = memberBhv.selectByPKValue(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();

        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                long threadId = Thread.currentThread().getId();
                Purchase purchase = new Purchase();
                purchase.setMemberId(3);
                long currentMillis = currentTimestamp().getTime();
                long keyMillis = currentMillis - (threadId * 10000000);
                purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                purchase.setPurchaseCount(1234);
                purchase.setPurchasePrice(1234);
                purchase.setPaymentCompleteFlg_True();
                purchase.setProductId(3);
                purchaseBhv.insert(purchase);

                // deadlock if update is executed after insert
                // (updateNonstrict() too)
                // ShareLock and ExclusiveLock are points
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                markSet.add("success: " + threadId);
                return null;
            }
        }, new ThreadFireOption().commitTx().expectExceptionAny("Deadlock found"));
        log(markSet);
    }

    public void test_update_Deadlock_simply() throws Exception {
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                Purchase purchase = purchaseBhv.selectByPKValue(3L);
                purchase.setMemberId(1);
                purchase.setProductId(1);
                long threadId = resource.getThreadId();
                long currentMillis = currentTimestamp().getTime();
                long keyMillis = currentMillis - (threadId * 10000000);
                purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                purchaseBhv.insert(purchase);

                Member member = new Member();
                member.setMemberId(1);
                member.setBirthdate(currentDate());
                memberBhv.updateNonstrict(member);
                return null;
            }
        }, new ThreadFireOption().threadCount(3).repeatCount(1).expectExceptionAny("Deadlock found"));
    }

    public void test_update_NonDeadlock_reverse() throws Exception {
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                Member member = new Member();
                member.setMemberId(1);
                member.setBirthdate(currentDate());
                memberBhv.updateNonstrict(member);

                Purchase purchase = purchaseBhv.selectByPKValue(3L);
                purchase.setMemberId(1);
                purchase.setProductId(1);
                long threadId = resource.getThreadId();
                long currentMillis = currentTimestamp().getTime();
                long keyMillis = currentMillis - (threadId * 10000000);
                purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                purchaseBhv.insert(purchase);
                return null;
            }
        }, new ThreadFireOption().threadCount(3).repeatCount(1)); // no deadlock
    }

    // ===================================================================================
    //                                                                              Delete
    //                                                                              ======
    public void test_delete_NonDeadlock() throws Exception {
        PurchaseCB cb = new PurchaseCB();
        cb.query().setMemberId_Equal(3);
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);
        List<Long> purchaseIdList = purchaseBhv.extractPurchaseIdList(purchaseList);
        assertTrue(purchaseIdList.size() > 2);
        final Stack<Long> stack = new Stack<Long>();
        stack.addAll(purchaseIdList);
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                Purchase purchase = new Purchase();
                purchase.setPurchaseId(stack.pop());
                purchaseBhv.deleteNonstrict(purchase);

                Member member = new Member();
                member.setMemberId(3);
                member.setBirthdate(currentDate());
                memberBhv.updateNonstrict(member);
                return null;
            }
        }, new ThreadFireOption().threadCount(3).repeatCount(1)); // no deadlock
    }
}
