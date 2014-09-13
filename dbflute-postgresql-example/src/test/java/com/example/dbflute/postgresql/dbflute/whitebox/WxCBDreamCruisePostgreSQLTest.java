package com.example.dbflute.postgresql.dbflute.whitebox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.dbflute.bhv.UpdateOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.ManualOrderBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.chelper.HpSpecifiedColumn;
import org.seasar.dbflute.cbean.coption.ColumnConversionOption;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.cbean.MemberServiceCB;
import com.example.dbflute.postgresql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberServiceBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.dbflute.exentity.MemberService;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/09/13 Saturday)
 */
public class WxCBDreamCruisePostgreSQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
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
    //                                                                        MysticRythms
    //                                                                        ============
    public void test_ColumnQuery_MysticRythms_basic() throws Exception {
        // ## Arrange ##
        {
            Member member = new Member();
            member.setBirthdate(toDate("2014/09/10"));
            UpdateOption<MemberCB> option = new UpdateOption<MemberCB>().allowNonQueryUpdate();
            memberBhv.varyingQueryUpdate(member, new MemberCB(), option);
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toDate("2015/04/05"));
            }
        }).convert(new ColumnConversionOption().addMonth(dreamCruiseCB.specify().columnVersionNo()));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessThan(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toDate("2014/09/01"));
            }
        }).convert(new ColumnConversionOption().addDay(dreamCruiseCB.specify().columnMemberId()).addMinute(1));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toDate("2006/09/26"));
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            log(memberId, member.getMemberName());
            assertTrue(memberId >= 9);
            if (memberId.equals(9)) {
                markHere("exists");
            }
        }
        assertMarked("exists");
        String sql = cb.toDisplaySql();
        assertContains(sql,
                "where dfloc.birthdate <= cast('2015-04-05' as timestamp) + (dfloc.version_no || 'months')::interval");
        assertContains(
                sql,
                "and dfloc.birthdate < cast(cast('2014-09-01' as timestamp) + (dfloc.member_id || 'days')::interval as timestamp) + '1 minutes'");
        assertContains(sql, "and dfloc.birthdate >= '2006-09-26'");
    }

    public void test_ColumnQuery_MysticRythms_timestamp() throws Exception {
        // ## Arrange ##
        {
            Member member = new Member();
            member.setFormalizedDatetime(toTimestamp("2014/09/10 12:34:56"));
            UpdateOption<MemberCB> option = new UpdateOption<MemberCB>().allowNonQueryUpdate();
            memberBhv.varyingQueryUpdate(member, new MemberCB(), option);
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toTimestamp("2015/04/05 12:34:56"));
            }
        }).convert(new ColumnConversionOption().addMonth(dreamCruiseCB.specify().columnVersionNo()));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toTimestamp("2014/09/01 15:00:00"));
            }
        }).convert(new ColumnConversionOption().addDay(dreamCruiseCB.specify().columnMemberId()).addHour(-3));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toTimestamp("2006/09/26 12:34:56.789"));
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member.getMemberId(), member.getMemberName());
            assertTrue(member.getMemberId() >= 10);
        }
        String sql = cb.toDisplaySql();
        assertContains(
                sql,
                "where dfloc.formalized_datetime <= cast('2015-04-05 12:34:56.000' as timestamp) + (dfloc.version_no || 'months')::interval");
        assertContains(
                sql,
                "and dfloc.formalized_datetime <= cast(cast('2014-09-01 15:00:00.000' as timestamp) + (dfloc.member_id || 'days')::interval as timestamp) + '-3 hours'");
        assertContains(sql, "and dfloc.formalized_datetime >= '2006-09-26 12:34:56.789'");
    }

    public void test_ColumnQuery_MysticRhythms_subtract() throws Exception {
        // ## Arrange ##
        {
            Member member = new Member();
            member.setBirthdate(toDate("2014/09/10"));
            UpdateOption<MemberCB> option = new UpdateOption<MemberCB>().allowNonQueryUpdate();
            memberBhv.varyingQueryUpdate(member, new MemberCB(), option);
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toDate("2006/09/26"));
            }
        }).convert(new ColumnConversionOption().subtractMonth(dreamCruiseCB.specify().columnVersionNo()));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toDate("2014/09/20"));
            }
        }).convert(new ColumnConversionOption().subtractDay(dreamCruiseCB.specify().columnMemberId()).addMinute(-1));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toDate("2015/04/05"));
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            log(memberId, member.getMemberName());
            assertTrue(memberId <= 9);
            if (memberId.equals(9)) {
                markHere("exists");
            }
        }
        assertMarked("exists");
        String sql = cb.toDisplaySql();
        assertContains(sql,
                "where dfloc.birthdate >= cast('2006-09-26' as timestamp) - (dfloc.version_no || 'months')::interval");
        assertContains(
                sql,
                "and dfloc.birthdate <= cast(cast('2014-09-20' as timestamp) - (dfloc.member_id || 'days')::interval as timestamp) + '-1 minutes'");
        assertContains(sql, "and dfloc.birthdate <= '2015-04-05'");
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

    // PostgreSQL: unsupported? "order by column * derived-column"
    //public void test_DreamCruise_ManualOrder_derivedColumn_basic() throws Exception {
    //    // ## Arrange ##
    //    ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
    //    Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
    //    for (MemberService service : serviceList) {
    //        serviceMap.put(service.getMemberId(), service);
    //    }
    //    MemberCB cb = new MemberCB();
    //    cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
    //        public void query(PurchaseCB subCB) {
    //            subCB.specify().columnPurchasePrice();
    //        }
    //    }, Member.ALIAS_highestPurchasePrice);
    //    MemberCB dreamCruiseCB = cb.dreamCruiseCB();
    //    ManualOrderBean mob = new ManualOrderBean();
    //    mob.multiply(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_highestPurchasePrice));
    //    cb.query().addOrderBy_MemberId_Asc().withManualOrder(mob);
    //
    //    // ## Act ##
    //    ListResultBean<Member> memberList = memberBhv.selectList(cb);
    //
    //    // ## Assert ##
    //    assertHasAnyElement(memberList);
    //    String sql = cb.toDisplaySql();
    //    log(ln() + sql);
    //    String exp = "dfloc.MEMBER_ID * HIGHEST_PURCHASE_PRICE";
    //    assertTrue(sql.contains("order by " + exp + " asc"));
    //}
    //
    //public void test_DreamCruise_ManualOrder_derivedColumn_twice() throws Exception {
    //    // ## Arrange ##
    //    ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
    //    Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
    //    for (MemberService service : serviceList) {
    //        serviceMap.put(service.getMemberId(), service);
    //    }
    //    MemberCB cb = new MemberCB();
    //    cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
    //        public void query(PurchaseCB subCB) {
    //            subCB.specify().columnPurchasePrice();
    //        }
    //    }, Member.ALIAS_highestPurchasePrice);
    //    cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
    //        public void query(PurchaseCB subCB) {
    //            subCB.specify().columnPurchaseCount();
    //        }
    //    }, Member.ALIAS_loginCount);
    //    MemberCB dreamCruiseCB = cb.dreamCruiseCB();
    //    ManualOrderBean mob = new ManualOrderBean();
    //    mob.multiply(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_highestPurchasePrice));
    //    mob.plus(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_loginCount));
    //    cb.query().addOrderBy_MemberId_Asc().withManualOrder(mob);
    //
    //    // ## Act ##
    //    ListResultBean<Member> memberList = memberBhv.selectList(cb);
    //
    //    // ## Assert ##
    //    assertHasAnyElement(memberList);
    //    String sql = cb.toDisplaySql();
    //    log(ln() + sql);
    //    String exp = "(dfloc.MEMBER_ID * HIGHEST_PURCHASE_PRICE) + LOGIN_COUNT";
    //    assertTrue(sql.contains("order by " + exp + " asc"));
    //}

    // org.postgresql.util.PSQLException: ERROR: invalid UNION/INTERSECT/EXCEPT ORDER BY clause
    // Only result column names can be used, not expressions or functions.
    // Add the expression/function to every SELECT, or move the UNION into a FROM clause.
    //public void test_DreamCruise_ManualOrder_union() throws Exception {
    //    // ## Arrange ##
    //    ListResultBean<MemberSecurity> securityList = memberSecurityBhv.selectList(new MemberSecurityCB());
    //    Map<Integer, MemberSecurity> securityMap = new HashMap<Integer, MemberSecurity>();
    //    for (MemberSecurity security : securityList) {
    //        securityMap.put(security.getMemberId(), security);
    //    }
    //    MemberCB cb = new MemberCB();
    //    //cb.setupSelect_MemberSecurityAsOne(); // auto-resolved
    //    cb.union(new UnionQuery<MemberCB>() {
    //        public void query(MemberCB unionCB) {
    //        }
    //    });
    //    MemberCB dreamCruiseCB = cb.dreamCruiseCB();
    //    ManualOrderBean mob = new ManualOrderBean();
    //    mob.multiply(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnReminderUseCount());
    //    cb.query().addOrderBy_MemberId_Asc().withManualOrder(mob);
    //
    //    // ## Act ##
    //    ListResultBean<Member> memberList = memberBhv.selectList(cb);
    //
    //    // ## Assert ##
    //    assertHasAnyElement(memberList);
    //    Integer previousSortValue = null;
    //    for (Member member : memberList) {
    //        Integer memberId = member.getMemberId();
    //        Integer useCount = securityMap.get(memberId).getReminderUseCount();
    //        Integer sortValue = memberId * useCount;
    //        if (previousSortValue != null && previousSortValue > sortValue) {
    //            fail();
    //        }
    //        previousSortValue = sortValue;
    //        log(member.getMemberId() + ", " + useCount + ", " + sortValue);
    //    }
    //}
}
