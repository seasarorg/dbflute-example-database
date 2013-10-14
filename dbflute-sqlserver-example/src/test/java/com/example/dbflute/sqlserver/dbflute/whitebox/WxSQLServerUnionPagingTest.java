package com.example.dbflute.sqlserver.dbflute.whitebox;

import java.util.HashSet;
import java.util.Set;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.MemberWithdrawalDbm;
import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.SummaryWithdrawalDbm;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.sqlserver.dbflute.cbean.SummaryWithdrawalCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.SummaryWithdrawalBhv;
import com.example.dbflute.sqlserver.dbflute.exentity.Member;
import com.example.dbflute.sqlserver.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.sqlserver.dbflute.exentity.SummaryWithdrawal;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.7 (2010/12/02 Thursday)
 */
public class WxSQLServerUnionPagingTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;
    private SummaryWithdrawalBhv summaryWithdrawalBhv;

    public void test_UnionQuery_with_SpecifyColumn_selectListAndPage_basic_Tx() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.specify().columnMemberName();
        cb.query().setMemberStatusCode_Equal_Provisional();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberName_PrefixSearch("S");
            }
        });
        cb.query().addOrderBy_MemberName_Desc();

        final String pkCol = MemberDbm.getInstance().columnMemberId().getColumnDbName();
        final String specifiedCol = MemberDbm.getInstance().columnMemberName().getColumnDbName();
        final String implicitCol = MemberDbm.getInstance().columnMemberStatusCode().getColumnDbName();
        final String notCol = MemberDbm.getInstance().columnMemberAccount().getColumnDbName();

        final Set<String> markSet = new HashSet<String>();
        CallbackContext context = new CallbackContext();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                String displaySql = info.getDisplaySql();
                if (displaySql.contains("count(*)")) {
                    assertTrue(Srl.containsAll(displaySql, "count(*)", "union"));
                    assertTrue(Srl.contains(displaySql, pkCol));
                    assertTrue(Srl.contains(displaySql, specifiedCol));
                    assertTrue(Srl.contains(displaySql, implicitCol));
                    assertFalse(Srl.contains(displaySql, notCol));
                    markSet.add("handle");
                }
            }
        });

        CallbackContext.setCallbackContextOnThread(context);
        try {
            // ## Act ##
            ListResultBean<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertTrue(Srl.containsAll(cb.toDisplaySql(), pkCol, specifiedCol, implicitCol));
            assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
            assertNotSame(0, memberList.size());
            for (Member member : memberList) {
                assertNotNull(member.getMemberName());
                assertNull(member.getMemberAccount());
            }

            // ## Act ##
            cb.paging(5, 2);
            PagingResultBean<Member> memberPage = memberBhv.selectPage(cb);

            // ## Assert ##
            assertTrue(Srl.containsAll(cb.toDisplaySql(), pkCol, specifiedCol, implicitCol));
            assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
            assertNotSame(0, memberPage.size());
            for (Member member : memberPage) {
                assertNotNull(member.getMemberName());
                assertNull(member.getMemberAccount());
            }
            assertTrue(markSet.contains("handle")); // for count-select assert
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_UnionQuery_with_SpecifyColumn_selectListAndPage_noPrimaryKey_basic_Tx() throws Exception {
        // ## Arrange ##
        SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
        int countAll = summaryWithdrawalBhv.selectCount(cb);
        cb.specify().columnMemberName(); // all members have own different names
        cb.union(new UnionQuery<SummaryWithdrawalCB>() {
            public void query(SummaryWithdrawalCB unionCB) {
            }
        });
        cb.query().addOrderBy_MemberName_Asc();

        final String specifiedCol = SummaryWithdrawalDbm.getInstance().columnMemberName().getColumnDbName();
        final String notCol = SummaryWithdrawalDbm.getInstance().columnWithdrawalDatetime().getColumnDbName();

        final Set<String> markSet = new HashSet<String>();
        CallbackContext context = new CallbackContext();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                String displaySql = info.getDisplaySql();
                if (displaySql.contains("count(*)")) {
                    assertTrue(Srl.containsAll(displaySql, "count(*)", "union"));
                    assertTrue(Srl.contains(displaySql, specifiedCol));
                    assertFalse(Srl.contains(displaySql, notCol));
                    markSet.add("handle");
                }
            }
        });

        CallbackContext.setCallbackContextOnThread(context);
        try {
            // ## Act ##
            ListResultBean<SummaryWithdrawal> withdrawalList = summaryWithdrawalBhv.selectList(cb);

            // ## Assert ##
            assertEquals(withdrawalList.size(), countAll);
            assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
            assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
            assertNotSame(0, withdrawalList.size());
            for (SummaryWithdrawal withdrawal : withdrawalList) {
                assertNotNull(withdrawal.getMemberName());
                assertNull(withdrawal.getWithdrawalDatetime());
            }

            // ## Act ##
            cb.paging(2, 1);
            PagingResultBean<SummaryWithdrawal> withdrawalPage = summaryWithdrawalBhv.selectPage(cb);

            // ## Assert ##
            assertEquals(withdrawalPage.getAllRecordCount(), withdrawalList.size());
            assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
            assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
            assertNotSame(0, withdrawalPage.size());
            for (SummaryWithdrawal withdrawal : withdrawalPage) {
                assertNotNull(withdrawal.getMemberName());
                assertNull(withdrawal.getWithdrawalDatetime());
            }
            assertTrue(markSet.contains("handle")); // for count-select assert
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_UnionQuery_with_SpecifyColumn_selectListAndPage_noPrimaryKey_distinct_Tx() throws Exception {
        // ## Arrange ##
        SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
        int countAll = summaryWithdrawalBhv.selectCount(cb);
        cb.specify().columnMemberStatusCode(); // all members have the same status here
        cb.union(new UnionQuery<SummaryWithdrawalCB>() {
            public void query(SummaryWithdrawalCB unionCB) {
            }
        });
        cb.query().addOrderBy_MemberStatusCode_Asc();

        // ## Act ##
        ListResultBean<SummaryWithdrawal> withdrawalList = summaryWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertTrue(withdrawalList.size() < countAll); // should have no duplicated record
        String specifiedCol = SummaryWithdrawalDbm.getInstance().columnMemberStatusCode().getColumnDbName();
        String notCol = SummaryWithdrawalDbm.getInstance().columnWithdrawalDatetime().getColumnDbName();
        assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
        assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
        assertNotSame(0, withdrawalList.size());
        for (SummaryWithdrawal withdrawal : withdrawalList) {
            assertNotNull(withdrawal.getMemberStatusCode());
            assertNull(withdrawal.getWithdrawalDatetime());
        }

        // ## Act ##
        cb.paging(2, 1);
        PagingResultBean<SummaryWithdrawal> withdrawalPage = summaryWithdrawalBhv.selectPage(cb);

        // ## Assert ##
        // count-select in paging should get a corresponding count
        assertEquals(withdrawalPage.getAllRecordCount(), withdrawalList.size());
        assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
        assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
        assertNotSame(0, withdrawalPage.size());
        for (SummaryWithdrawal withdrawal : withdrawalPage) {
            assertNotNull(withdrawal.getMemberStatusCode());
            assertNull(withdrawal.getWithdrawalDatetime());
        }
    }

    public void test_UnionQuery_with_SpecifyColumn_selectListAndPage_text_Tx() throws Exception {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalDatetime();
        cb.union(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        String specifiedCol = MemberWithdrawalDbm.getInstance().columnWithdrawalDatetime().getColumnDbName();
        String notCol = MemberWithdrawalDbm.getInstance().columnWithdrawalReasonInputText().getColumnDbName();
        assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
        assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
        assertNotSame(0, withdrawalList.size());
        for (MemberWithdrawal withdrawal : withdrawalList) {
            assertNotNull(withdrawal.getWithdrawalDatetime());
            assertNull(withdrawal.getWithdrawalReasonInputText());
        }

        // ## Act ##
        cb.paging(5, 1);
        PagingResultBean<MemberWithdrawal> withdrawalPage = memberWithdrawalBhv.selectPage(cb); // expect no exception

        // ## Assert ##
        assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
        assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
        assertNotSame(0, withdrawalPage.size());
        for (MemberWithdrawal withdrawal : withdrawalPage) {
            assertNotNull(withdrawal.getWithdrawalDatetime());
            assertNull(withdrawal.getWithdrawalReasonInputText());
        }
        // also asserts count SQL
        cb.xsetupSelectCountIgnoreFetchScope(false); // internal
        assertTrue(Srl.contains(cb.toDisplaySql(), "count(*)"));
        assertTrue(Srl.contains(cb.toDisplaySql(), specifiedCol));
        assertFalse(Srl.contains(cb.toDisplaySql(), notCol));
    }
}