package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.7C (2012/08/06 Monday)
 */
public class WxCBMyselfDerivedMySqlTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                              (Specify)MyselfDerived
    //                                                              ======================
    // -----------------------------------------------------
    //                                               Ranking
    //                                               -------
    public void test_SpecifyMyselfDerived_ranking_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberServiceAsOne();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
            }
        }, Member.ALIAS_loginCount, new DerivedReferrerOption().plus(1));
        cb.query().queryMemberServiceAsOne().addOrderBy_ServicePointCount_Desc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        Integer previousPoint = null;
        Integer previousRank = null;
        boolean existsSame = false;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer servicePointCount = member.getMemberServiceAsOne().getServicePointCount();
            Integer pointRank = member.getLoginCount();
            log(memberId + ", " + servicePointCount + ", " + pointRank);
            if (previousPoint != null && previousPoint < servicePointCount) {
                fail();
            }
            if (previousRank != null && previousRank > pointRank) {
                fail();
            }
            if (previousRank != null && previousRank == pointRank) {
                assertEquals(servicePointCount, previousPoint);
                existsSame = true;
            }
            previousPoint = servicePointCount;
            previousRank = pointRank;
        }
        assertTrue(existsSame);
    }

    public void test_SpecifyMyselfDerived_ranking_derived() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        }, Member.ALIAS_highestPurchasePrice, new DerivedReferrerOption().coalesce(0));
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                            public void query(PurchaseCB subCB) {
                                subCB.specify().columnPurchasePrice();
                            }
                        }, null, new DerivedReferrerOption().coalesce(0));
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_highestPurchasePrice));
                    }
                });
            }
        }, Member.ALIAS_loginCount, new DerivedReferrerOption().plus(1));
        cb.query().addSpecifiedDerivedOrderBy_Desc(Member.ALIAS_highestPurchasePrice);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        Integer previousPrice = null;
        Integer previousRank = null;
        boolean existsSame = false;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer highestPurchasePrice = member.getHighestPurchasePrice();
            Integer pointRank = member.getLoginCount();
            log(memberId + ", " + highestPurchasePrice + ", " + pointRank);
            if (previousPrice != null && previousPrice < highestPurchasePrice) {
                fail();
            }
            if (previousRank != null && previousRank > pointRank) {
                fail();
            }
            if (previousRank != null && previousRank == pointRank) {
                assertEquals(highestPurchasePrice, previousPrice);
                existsSame = true;
            }
            previousPrice = highestPurchasePrice;
            previousRank = pointRank;
        }
        assertTrue(existsSame);
    }

    // -----------------------------------------------------
    //                                                 Union
    //                                                 -----
    public void test_SpecifyMyselfDerived_union() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberServiceAsOne();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.query().setMemberStatusCode_Equal_Formalized();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
                subCB.union(new UnionQuery<MemberCB>() {
                    public void query(MemberCB unionCB) {
                        unionCB.query().setMemberStatusCode_Equal_Provisional();
                        unionCB.columnQuery(new SpecifyQuery<MemberCB>() {
                            public void specify(MemberCB cb) {
                                cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                            }
                        }).greaterThan(new SpecifyQuery<MemberCB>() {
                            public void specify(MemberCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne()
                                        .columnServicePointCount());
                            }
                        });
                    }
                });
            }
        }, Member.ALIAS_loginCount, new DerivedReferrerOption().plus(1));
        cb.query().queryMemberServiceAsOne().addOrderBy_ServicePointCount_Desc();

        // ## Act ##
        try {
            memberBhv.selectList(cb);

            // ## Assert ##
            fail(); // because of inline-view
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                (Query)MyselfDerived
    //                                                                ====================
    // -----------------------------------------------------
    //                                               Ranking
    //                                               -------
    public void test_QueryMyselfDerived_ranking_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
            }
        }, Member.ALIAS_loginCount, new DerivedReferrerOption().plus(1));
        cb.query().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
            }
        }, new DerivedReferrerOption().plus(1)).lessEqual(3);
        cb.query().queryMemberServiceAsOne().addOrderBy_ServicePointCount_Desc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        Integer previousRank = null;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer pointRank = member.getLoginCount();
            log(memberId + ", " + pointRank);
            if (previousRank != null && previousRank > pointRank) {
                fail();
            }
            assertNull(member.getMemberServiceAsOne());
            assertTrue(pointRank <= 3);
            previousRank = pointRank;
        }
        assertEquals(3, memberList.size());
    }
}
