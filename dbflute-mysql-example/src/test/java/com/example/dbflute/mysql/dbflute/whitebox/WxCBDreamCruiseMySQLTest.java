package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.ManualOrderBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.HpSpecifiedColumn;
import org.seasar.dbflute.cbean.coption.ColumnConversionOption;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberSecurity;
import com.example.dbflute.mysql.dbflute.exentity.MemberService;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.4C (2012/04/26 Wednesday)
 */
public class WxCBDreamCruiseMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberSecurityBhv memberSecurityBhv;
    private MemberServiceBhv memberServiceBhv;

    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    public void test_DreamCruise_ColumnQuery_basic() throws Exception {
        // ## Arrange ##
        List<Member> expectedList = selectMyOnlyProductMember();
        MemberCB cb = new MemberCB();
        cb.specify().columnBirthdate();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().notExistsPurchaseList(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.columnQuery(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.specify().columnMemberId();
                            }
                        }).notEqual(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().columnMemberId());
                            }
                        });
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
        assertEquals(expectedList, memberList);
    }

    public void test_DreamCruise_ColumnQuery_calculation_basic() throws Exception {
        // ## Arrange ##
        List<Member> expectedList = selectMyOnlyProductMember();
        MemberCB cb = new MemberCB();
        cb.specify().columnBirthdate();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().notExistsPurchaseList(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        HpSpecifiedColumn pointColumn = dreamCruiseCB.specify().specifyMemberServiceAsOne()
                                .columnServicePointCount();
                        subCB.columnQuery(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.specify().columnMemberId();
                            }
                        }).notEqual(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().columnMemberId());
                            }
                        }).multiply(pointColumn).divide(pointColumn);
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
        assertEquals(expectedList, memberList);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsAll(sql, "*", "/"));
    }

    protected List<Member> selectMyOnlyProductMember() throws Exception {
        MemberCB cb = new MemberCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().derivedPurchaseList().countDistinct(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnMemberId();
                    }
                }).equal(1);
            }
        });
        return memberBhv.selectList(cb);
    }

    public void test_DreamCruise_ColumnQuery_relation_convert() throws Exception {
        // ## Arrange ##
        List<Member> expectedList = selectMyOnlyProductMember();
        MemberCB cb = new MemberCB();
        cb.specify().columnBirthdate();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().notExistsPurchaseList(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.columnQuery(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.specify().columnMemberId();
                            }
                        }).notEqual(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnMemberId());
                            }
                        }).convert(new ColumnConversionOption().trunc(1));
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
        assertEquals(expectedList, memberList);
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("trunc"));
    }

    // ===================================================================================
    //                                                                          LikeSearch
    //                                                                          ==========
    public void test_DreamCruise_LikeSearch_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        LikeSearchOption option = new LikeSearchOption().likeContain();
        option.addCompoundColumn(dreamCruiseCB.specify().columnMemberAccount());
        cb.query().setMemberName_LikeSearch("P", option);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        boolean existsAccountOnly = false;
        boolean existsBoth = false;
        for (Member member : memberList) {
            log(member);
            String memberName = member.getMemberName();
            String memberAccount = member.getMemberAccount();
            if (!memberName.contains("P") && memberAccount.contains("P")) {
                existsAccountOnly = true;
            }
            if (memberName.contains("P") && memberAccount.contains("P")) {
                existsBoth = true;
            }
        }
        assertTrue(existsAccountOnly);
        assertTrue(existsBoth);
    }

    // ===================================================================================
    //                                                                         ManualOrder
    //                                                                         ===========
    public void test_DreamCruise_ManualOrder_basic() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
        Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
        for (MemberService service : serviceList) {
            serviceMap.put(service.getMemberId(), service);
        }
        MemberCB cb = new MemberCB();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        ManualOrderBean mob = new ManualOrderBean();
        mob.multiply(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
        cb.query().addOrderBy_MemberId_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        Integer previousSortValue = null;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer servicePointCount = serviceMap.get(memberId).getServicePointCount();
            Integer sortValue = memberId * servicePointCount;
            if (previousSortValue != null && previousSortValue > sortValue) {
                fail();
            }
            previousSortValue = sortValue;
            log(member.getMemberId() + ", " + servicePointCount + ", " + sortValue);
        }
    }

    public void test_DreamCruise_ManualOrder_union() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberSecurity> securityList = memberSecurityBhv.selectList(new MemberSecurityCB());
        Map<Integer, MemberSecurity> securityMap = new HashMap<Integer, MemberSecurity>();
        for (MemberSecurity security : securityList) {
            securityMap.put(security.getMemberId(), security);
        }
        MemberCB cb = new MemberCB();
        //cb.setupSelect_MemberSecurityAsOne(); // auto-resolved
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
            }
        });
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        ManualOrderBean mob = new ManualOrderBean();
        mob.multiply(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnReminderUseCount());
        cb.query().addOrderBy_MemberId_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        Integer previousSortValue = null;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer useCount = securityMap.get(memberId).getReminderUseCount();
            Integer sortValue = memberId * useCount;
            if (previousSortValue != null && previousSortValue > sortValue) {
                fail();
            }
            previousSortValue = sortValue;
            log(member.getMemberId() + ", " + useCount + ", " + sortValue);
        }
    }
}
