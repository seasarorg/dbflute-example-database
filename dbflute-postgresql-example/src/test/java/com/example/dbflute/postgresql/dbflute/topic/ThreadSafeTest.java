package com.example.dbflute.postgresql.dbflute.topic;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;
import org.seasar.dbflute.helper.HandyDate;
import org.seasar.dbflute.unit.core.cannonball.CannonballCar;
import org.seasar.dbflute.unit.core.cannonball.CannonballFinalizer;
import org.seasar.dbflute.unit.core.cannonball.CannonballOption;
import org.seasar.dbflute.unit.core.cannonball.CannonballRun;
import org.seasar.dbflute.unit.core.thread.ThreadFireExecution;
import org.seasar.dbflute.unit.core.thread.ThreadFireOption;
import org.seasar.dbflute.unit.core.thread.ThreadFireResource;
import org.seasar.dbflute.util.DfCollectionUtil;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.dbflute.exentity.Purchase;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

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
    public void test_ThreadSafe_conditionBean_sameExecution() {
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
    public void test_ThreadSafe_outsideSql_sameExecution() {
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
    public void test_ThreadSafe_insert_sameExecution() {
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        final Set<Integer> insertedIdSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Member member = new Member();
                member.setMemberName("name" + entryNumber);
                member.setMemberAccount("account" + entryNumber);
                member.setMemberStatusCode_Formalized();
                memberBhv.insert(member);
                markSet.add("success: " + entryNumber);
                insertedIdSet.add(member.getMemberId());
            }
        }, new CannonballOption().commitTx().expectSameResult().finalizer(new CannonballFinalizer() {
            public void run() {
                if (!insertedIdSet.isEmpty()) {
                    MemberCB cb = new MemberCB();
                    cb.query().setMemberId_InScope(insertedIdSet);
                    memberBhv.queryDelete(cb);
                }
            }
        }));
        log(markSet);
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_ThreadSafe_update_before_insert_sameExecution_alreadyUpdated() {
        final int memberId = 3;
        final Member before = memberBhv.selectByPKValue(memberId);
        final Long versionNo = before.getVersionNo();
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
                markHere("success");
            }
        }, new CannonballOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        assertMarked("success");
    }

    public void test_ThreadSafe_update_after_insert_sameExecution_mayBeDeadlock() {
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
        }, new CannonballOption().commitTx().repeatCount(5).expectExceptionAny("deadlock detected"));
        assertMarked("success");
    }
}
