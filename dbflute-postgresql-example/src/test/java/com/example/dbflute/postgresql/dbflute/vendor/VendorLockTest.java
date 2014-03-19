package com.example.dbflute.postgresql.dbflute.vendor;

import java.sql.Timestamp;
import java.util.Set;

import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;
import org.seasar.dbflute.helper.HandyDate;
import org.seasar.dbflute.unit.core.cannonball.CannonballCar;
import org.seasar.dbflute.unit.core.cannonball.CannonballOption;
import org.seasar.dbflute.unit.core.cannonball.CannonballRun;
import org.seasar.dbflute.unit.core.thread.ThreadFireExecution;
import org.seasar.dbflute.unit.core.thread.ThreadFireOption;
import org.seasar.dbflute.unit.core.thread.ThreadFireResource;
import org.seasar.dbflute.util.DfCollectionUtil;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.dbflute.exentity.Purchase;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/20 Saturday)
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
    public void test_insert_after_empty_queryDelete_nonDeadlock() {
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        final Set<Integer> insertedIdSet = DfCollectionUtil.newHashSet();
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                long threadId = Thread.currentThread().getId();

                // empty delete (update, for update) locks new record
                // (if it deletes existing records, second waits)
                MemberCB cb = new MemberCB();
                cb.query().setMemberId_Equal(99999);
                memberBhv.queryDelete(cb);

                Member inserted = memberBhv.selectByPKValueWithDeletedCheck(3);
                inserted.setMemberAccount(threadId + ":" + inserted.getMemberId());
                inserted.setMemberId(null);
                memberBhv.insert(inserted);
                markSet.add("success: " + threadId);
                insertedIdSet.add(inserted.getMemberId());
                return null;
            }
        }, new ThreadFireOption().commitTx().expectSameResult());
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
    public void test_update_before_insert_alreadyUpdated() {
        final int memberId = 3;
        final Member before = memberBhv.selectByPKValue(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                final int entryNumber = car.getEntryNumber();
                for (int i = 0; i < 30; i++) {
                    Purchase purchase = new Purchase();
                    purchase.setMemberId(memberId);
                    purchase.setProductId((int) (entryNumber % 10) + 1);
                    long currentMillis = currentTimestamp().getTime();
                    long keyMillis = currentMillis - (entryNumber * 10000) - (i * 10000);
                    HandyDate handyDate = new HandyDate(new Timestamp(keyMillis));
                    purchase.setPurchaseDatetime(handyDate.addDay(entryNumber).getTimestamp());
                    purchase.setPurchaseCount(1234 + i);
                    purchase.setPurchasePrice(1234 + i);
                    purchase.setPaymentCompleteFlg_True();
                    purchaseBhv.insert(purchase);
                }
                markSet.add("success: " + entryNumber);
            }
        }, new CannonballOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }

    public void test_update_after_insert_mayBeDeadlock() {
        final Purchase source = purchaseBhv.selectByPKValueWithDeletedCheck(1L);
        source.setPurchaseId(null);
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Purchase purchase = source.clone();
                purchase.setMemberId(entryNumber % 2 == 1 ? 3 : 4);
                purchase.setProductId(entryNumber % 3 == 1 ? 3 : (entryNumber % 3 == 2 ? 4 : 5));
                long keyMillis = currentTimestamp().getTime() - (entryNumber * 1000);
                purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                purchaseBhv.insert(purchase);

                // deadlock if update is executed after insert including updateNonstrict()
                // ShareLock and ExclusiveLock are points
                Member member = new Member();
                member.setMemberId(3);
                memberBhv.updateNonstrict(member);
                markHere("success");
            }
        }, new CannonballOption().commitTx().expectExceptionAny("deadlock detected"));
        assertMarked("success");
    }
}
