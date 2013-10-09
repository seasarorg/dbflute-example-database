package com.example.dbflute.postgresql.dbflute.vendor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.bhv.core.ContextStack;
import org.seasar.dbflute.cbean.ConditionBeanContext;
import org.seasar.dbflute.cbean.EntityRowHandler;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.sqlclause.SqlClausePostgreSql;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;
import org.seasar.dbflute.outsidesql.OutsideSqlContext;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfReflectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.MemberStatusDbm;
import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.postgresql.dbflute.cbean.VendorDateFkCB;
import com.example.dbflute.postgresql.dbflute.cbean.VendorDatePkCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorDateFkBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorDatePkBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.dbflute.exentity.MemberStatus;
import com.example.dbflute.postgresql.dbflute.exentity.VendorDateFk;
import com.example.dbflute.postgresql.dbflute.exentity.VendorDatePk;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorCheckTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private VendorDatePkBhv vendorDatePkBhv;
    private VendorDateFkBhv vendorDateFkBhv;

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    public void test_batchUpdate_and_batchDelete_AlreadyUpdated() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.setMemberStatusCode_Provisional();
            member.setFormalizedDatetime(currentTimestamp());
            member.setBirthdate(currentTimestamp());
            if (count == 1) {
                member.setVersionNo(999999999L);
            } else {
                member.setVersionNo(member.getVersionNo()); // to keep same-set columns
            }
            ++count;
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdate(memberList);
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
            assertTrue(e instanceof BatchEntityAlreadyUpdatedException);
            log("batchUpdateCount=" + ((BatchEntityAlreadyUpdatedException) e).getBatchUpdateCount());
        }
        deleteMemberReferrer();
        try {
            memberBhv.batchDelete(memberList);
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
            assertTrue(e instanceof BatchEntityAlreadyUpdatedException);
            log("batchUpdateCount=" + ((BatchEntityAlreadyUpdatedException) e).getBatchUpdateCount());
        }
    }

    public void test_batchUpdateNonstrict_and_batchDeleteNonstrict_AlreadyDeleted() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.setMemberStatusCode_Provisional();
            member.setFormalizedDatetime(currentTimestamp());
            member.setBirthdate(currentTimestamp());
            if (count == 1) {
                member.setMemberId(9999999);
            } else {
                member.setMemberId(member.getMemberId()); // to keep same-set
            }
            ++count;
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdateNonstrict(memberList);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
        deleteMemberReferrer();
        try {
            memberBhv.batchDeleteNonstrict(memberList);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                    Insert in Cursor
    //                                                                    ================
    public void test_insert_in_selectCursor_of_conditionBean_sameTable() throws Exception {
        // ## Arrange ##
        final List<Integer> memberIdList = new ArrayList<Integer>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                Member member = new Member();
                member.setMemberName(memberName + count);
                member.setMemberAccount(memberName + count);
                member.setMemberStatusCode_Formalized();
                memberBhv.insert(member);
                memberIdList.add(member.getMemberId());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        cb.query().setMemberId_InScope(memberIdList);
        assertNotSame(0, memberBhv.selectCount(cb));
    }

    public void test_insert_in_selectCursor_of_conditionBean_diffTable() throws Exception {
        // ## Arrange ##
        final List<String> codeList = new ArrayList<String>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                MemberStatus memberStatus = new MemberStatus();
                String memberStatusCode;
                if (count >= 100) {
                    memberStatusCode = String.valueOf(count);
                } else if (count >= 10) {
                    memberStatusCode = "0" + count;
                } else {
                    memberStatusCode = "00" + count;
                }

                // because it forces classification setting at this project
                //memberStatus.setMemberStatusCode(memberStatusCode);
                ColumnInfo columnMemberStatusCode = MemberStatusDbm.getInstance().columnMemberStatusCode();
                DfReflectionUtil.invokeForcedly(columnMemberStatusCode.getWriteMethod(), memberStatus,
                        new Object[] { memberStatusCode });

                memberStatus.setMemberStatusName(memberName + count);
                memberStatus.setDescription("foo");
                memberStatus.setDisplayOrder(99999 + count);
                memberStatusBhv.insert(memberStatus);
                codeList.add(memberStatus.getMemberStatusCode());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        MemberStatusCB statusCB = new MemberStatusCB();
        statusCB.query().setMemberStatusCode_InScope(codeList);
        assertNotSame(0, memberStatusBhv.selectCount(statusCB));
    }

    // *Not Repro!
    //    // ===================================================================================
    //    //                                                                   Performance Check
    //    //                                                                   =================
    //    private VendorSimpleFooBhv vendorSimpleFooBhv;
    //    private VendorSimpleBarBhv vendorSimpleBarBhv;
    //    public void test_PerformanceCheck() {
    //        List<VendorSimpleBar> vendorSimpleBarList = new ArrayList<VendorSimpleBar>();
    //        for (int i = 0; i < 3000; i++) {
    //            VendorSimpleBar bar = new VendorSimpleBar();
    //            bar.setBarName("name");
    //            vendorSimpleBarList.add(bar);
    //        }
    //        vendorSimpleBarBhv.batchInsert(vendorSimpleBarList);
    //        VendorSimpleBarCB barCB = new VendorSimpleBarCB();
    //        barCB.fetchFirst(1);
    //        Integer barId = vendorSimpleBarBhv.selectEntityWithDeletedCheck(barCB).getBarId();
    //
    //        List<VendorSimpleFoo> vendorSimpleFooList = new ArrayList<VendorSimpleFoo>();
    //        for (int i = 0; i < 15000; i++) {
    //            VendorSimpleFoo foo = new VendorSimpleFoo();
    //            foo.setFooName("name");
    //            foo.setBarId(barId);
    //            vendorSimpleFooList.add(foo);
    //        }
    //        vendorSimpleFooBhv.batchInsert(vendorSimpleFooList);
    //
    //        VendorSimpleFooCB fooCB = new VendorSimpleFooCB();
    //        vendorSimpleFooBhv.selectList(fooCB);
    //        vendorSimpleFooBhv.selectList(fooCB);
    //
    //        fooCB.setupSelect_VendorSimpleBar();
    //        vendorSimpleFooBhv.selectList(fooCB);
    //
    //        fooCB.query().setFooName_NotEqual("AAA");
    //        fooCB.query().queryVendorSimpleBar().on().setBarName_Equal("name");
    //        fooCB.query().queryVendorSimpleBar().on().setBarId_LessEqual(99999999);
    //        vendorSimpleFooBhv.selectList(fooCB);
    //    }

    // ===================================================================================
    //                                                                        Date InScope
    //                                                                        ============
    public void test_dateInScope_query() {
        // ## Arrange ##
        Date date = DfTypeUtil.toDate("1965-03-03");
        {
            VendorDatePk vendorDatePk = new VendorDatePk();
            vendorDatePk.setFooDate(date);
            vendorDatePk.setFooName("test data");
            vendorDatePkBhv.insert(vendorDatePk);
        }

        VendorDatePkCB cb = new VendorDatePkCB();
        cb.query().setFooDate_InScope(DfCollectionUtil.newArrayList(date));

        // ## Act ##
        VendorDatePk actual = vendorDatePkBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("1965/03/03", DfTypeUtil.toString(actual.getFooDate(), "yyyy/MM/dd"));
    }

    public void test_dateInScope_LoadReferrer() {
        // ## Arrange ##
        Date date = DfTypeUtil.toDate("1965-03-03");
        {
            VendorDatePk vendorDatePk = new VendorDatePk();
            vendorDatePk.setFooDate(date);
            vendorDatePk.setFooName("test data");
            vendorDatePkBhv.insert(vendorDatePk);
            VendorDateFk vendorDateFk = new VendorDateFk();
            vendorDateFk.setBarId(99991);
            vendorDateFk.setBarDate(date);
            vendorDateFkBhv.insert(vendorDateFk);
            vendorDateFk.setBarId(99992);
            vendorDateFk.setBarDate(date);
            vendorDateFkBhv.insert(vendorDateFk);
        }
        VendorDatePkCB cb = new VendorDatePkCB();
        cb.query().setFooDate_InScope(DfCollectionUtil.newArrayList(date));
        VendorDatePk pk = vendorDatePkBhv.selectEntityWithDeletedCheck(cb);

        // ## Act ##
        vendorDatePkBhv.loadVendorDateFkList(pk, new ConditionBeanSetupper<VendorDateFkCB>() {
            public void setup(VendorDateFkCB cb) {
                cb.query().addOrderBy_BarId_Asc();
            }
        });

        // ## Assert ##
        List<VendorDateFk> vendorDateFkList = pk.getVendorDateFkList();
        assertEquals(Integer.valueOf(99991), vendorDateFkList.get(0).getBarId());
        assertEquals(Integer.valueOf(99992), vendorDateFkList.get(1).getBarId());
    }

    // ===================================================================================
    //                                                                      Paging Binding
    //                                                                      ==============
    public void test_paging_binding_basic() {
        doTest_paging_binding(false);
    }

    public void test_paging_binding_suppress() {
        doTest_paging_binding(true);
    }

    public void doTest_paging_binding(boolean suppress) {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        if (suppress) {
            ((SqlClausePostgreSql) cb.getSqlClause()).suppressPagingBinding();
        }
        cb.query().addOrderBy_MemberId_Asc();
        cb.paging(4, 3);
        assertEquals(3, cb.getFetchPageNumber());

        // ## Act ##
        PagingResultBean<Member> page = memberBhv.selectPage(cb); // re-select

        // ## Assert ##
        assertEquals(4, page.size());
        log("PagingResultBean.toString():" + ln() + " " + page);
        assertEquals(3, page.getCurrentPageNumber());
        assertEquals(20, page.getAllRecordCount());
        assertEquals(5, page.getAllPageCount());
        assertEquals(Integer.valueOf(9), page.get(0).getMemberId());

        String clause = cb.getSqlClause().getClause();
        log(ln() + clause);
        if (suppress) {
            assertTrue(clause.contains("limit 4 offset 8"));
        } else {
            assertTrue(clause
                    .contains("limit /*pmb.sqlClause.pagingBindingLimit*/0 offset /*pmb.sqlClause.pagingBindingOffset*/0"));
        }
    }
}
