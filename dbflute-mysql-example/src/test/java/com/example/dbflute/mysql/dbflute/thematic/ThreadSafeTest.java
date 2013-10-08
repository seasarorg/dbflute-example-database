package com.example.dbflute.mysql.dbflute.thematic;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;
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
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/20 Saturday)
 */
public class ThreadSafeTest extends UnitContainerTestCase {

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
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_conditionBean_threadSafe_sameExecution() {
        threadFire(new ThreadFireExecution<List<Member>>() {
            public List<Member> execute(ThreadFireResource resource) {
                // ## Arrange ##
                MemberCB cb = new MemberCB();
                cb.setupSelect_MemberStatus();
                cb.query().setMemberName_PrefixSearch("S");
                cb.query().addOrderBy_Birthdate_Desc().addOrderBy_MemberId_Asc();

                // ## Act ##
                ListResultBean<Member> memberList = memberBhv.selectList(cb);

                // ## Assert ##
                assertFalse(memberList.isEmpty());
                for (Member member : memberList) {
                    assertTrue(member.getMemberName().startsWith("S"));
                }
                return memberList;
            }
        }, new ThreadFireOption().expectSameResult());
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    public void test_outsideSql_threadSafe_sameExecution() {
        threadFire(new ThreadFireExecution<List<SimpleMember>>() {
            public List<SimpleMember> execute(ThreadFireResource resource) {
                // ## Arrange ##
                String path = MemberBhv.PATH_selectSimpleMember;

                SimpleMemberPmb pmb = new SimpleMemberPmb();
                pmb.setMemberName_PrefixSearch("S");

                Class<SimpleMember> entityType = SimpleMember.class;

                // ## Act ##
                List<SimpleMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

                // ## Assert ##
                assertNotSame(0, memberList.size());
                log("{SimpleMember}");
                for (SimpleMember entity : memberList) {
                    Integer memberId = entity.getMemberId();
                    String memberName = entity.getMemberName();
                    String memberStatusName = entity.getMemberStatusName();
                    log("    " + memberId + ", " + memberName + ", " + memberStatusName);
                    assertNotNull(memberId);
                    assertNotNull(memberName);
                    assertNotNull(memberStatusName);
                    assertTrue(memberName.startsWith("S"));
                }
                return memberList;
            }
        }, new ThreadFireOption().expectSameResult());
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_Deadlock_NextKeyLock_for_FK() { // uses original transactions
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

    public void test_insert_Deadlock_NextKeyLock_for_PK() { // uses original transactions
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
    public void test_update_OptimisticLock_basic() { // uses original transactions
        final int memberId = 3;
        final Member before = memberBhv.selectByPKValue(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();

        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                final long threadId = Thread.currentThread().getId();
                for (int i = 0; i < 30; i++) {
                    Purchase purchase = new Purchase();
                    purchase.setMemberId(3);
                    long currentMillis = currentTimestamp().getTime();
                    long keyMillis = currentMillis - (threadId * 10000) - (i * 10000);
                    purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                    purchase.setPurchaseCount(1234 + i);
                    purchase.setPurchasePrice(1234 + i);
                    purchase.setPaymentCompleteFlg_True();
                    purchase.setProductId(3);
                    purchaseBhv.insert(purchase);
                }
                markSet.add("success: " + threadId);
                return null;
            }
        }, new ThreadFireOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }

    public void test_update_OptimisticLock_checkRepeatableRead() { // uses original transactions
        final int memberId = 3;
        final Member before = memberBhv.selectByPKValue(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();

        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                final long threadId = Thread.currentThread().getId();
                log(memberBhv.selectByPKValue(3).getVersionNo());
                sleep(500);
                if (threadId % 2 == 0) {
                    Member member = new Member();
                    member.setMemberId(memberId);
                    member.setVersionNo(versionNo);
                    memberBhv.update(member);
                } else {
                    sleep(1000);
                    assertEquals(versionNo, memberBhv.selectByPKValue(3).getVersionNo()); // repeatable read
                    Member member = new Member();
                    member.setMemberId(memberId);
                    member.setVersionNo(versionNo);
                    memberBhv.update(member); // read committed
                }
                markSet.add("success: " + threadId);
                return null;
            }
        }, new ThreadFireOption().commitTx().threadCount(2).expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }

    public void test_update_Deadlock() { // uses original transactions
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
}
