package com.example.dbflute.db2.dbflute.vendor;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.bhv.UpdateOption;
import org.seasar.dbflute.bhv.core.BehaviorCommandMeta;
import org.seasar.dbflute.bhv.proposal.callback.SimpleTraceableSqlStringFilter;
import org.seasar.dbflute.bhv.proposal.callback.TraceableSqlAdditionalInfoProvider;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.unit.core.thread.ThreadFireExecution;
import org.seasar.dbflute.unit.core.thread.ThreadFireOption;
import org.seasar.dbflute.unit.core.thread.ThreadFireResource;
import org.seasar.dbflute.unit.core.transaction.TransactionPerformer;

import com.example.dbflute.db2.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.db2.dbflute.cbean.MemberCB;
import com.example.dbflute.db2.dbflute.exbhv.MemberBhv;
import com.example.dbflute.db2.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.db2.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.db2.dbflute.exentity.Member;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4D (2013/06/16 Sunday)
 */
public class VendorJDBCTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                             Sensitive-or-not Cursor
    //                                                             =======================
    public void test_ResultSet_sensitiveOrNot_typeForwardOnly() {
        doTest_ResultSet_sensitiveOrNot(TestingResultSetType.FORWARD_ONLY);
    }

    public void test_ResultSet_sensitiveOrNot_typeScrollInsensitive() {
        doTest_ResultSet_sensitiveOrNot(TestingResultSetType.SCROLL_INSENSITIVE);
    }

    public void test_ResultSet_sensitiveOrNot_typeScrollSensitive() {
        doTest_ResultSet_sensitiveOrNot(TestingResultSetType.SCROLL_SENSITIVE);
    }

    public void doTest_ResultSet_sensitiveOrNot(final TestingResultSetType resultSetType) {
        // ## Arrange ##
        final ListResultBean<Member> beforeList = memberBhv.selectList(new MemberCB());
        final Date updateDate = currentDate();
        final boolean sensitive = TestingResultSetType.SCROLL_SENSITIVE.equals(resultSetType);

        // ## Act ##
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                long threadId = resource.getThreadId();
                log("threadId: " + threadId);
                if (threadId % 2 == 0) {
                    PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
                    PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
                        @Override
                        protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                            // ## Assert ##
                            assertEquals(resultSetType.type(), cursor.cursor().getType());
                            cursor.next();
                            log(cursor.getMemberName(), cursor.getBirthdate());
                            sleep(2000);
                            int fetchSizeMinusOne = 3; // already next() before here
                            int index = 0;
                            while (cursor.next()) {
                                Date birthdate = cursor.getBirthdate();
                                log(cursor.getMemberName(), birthdate);
                                if (birthdate != null) {
                                    if (sensitive && index >= fetchSizeMinusOne) {
                                        assertTrue(updateDate.getTime() == birthdate.getTime());
                                    } else {
                                        assertTrue(updateDate.getTime() != birthdate.getTime());
                                    }
                                }
                                ++index;
                            }
                            return null;
                        }
                    };
                    StatementConfig config = new StatementConfig().fetchSize(4);
                    if (TestingResultSetType.FORWARD_ONLY.equals(resultSetType)) {
                        config.typeForwardOnly();
                    } else if (TestingResultSetType.SCROLL_INSENSITIVE.equals(resultSetType)) {
                        config.typeScrollInsensitive();
                    } else if (sensitive) {
                        config.typeScrollSensitive();
                    } else {
                        fail();
                    }
                    memberBhv.outsideSql().configure(config).cursorHandling().selectCursor(pmb, handler);
                } else {
                    sleep(500);
                    MemberCB cb = new MemberCB();
                    Member member = new Member();
                    member.setBirthdate(updateDate);
                    memberBhv.varyingQueryUpdate(member, cb, new UpdateOption<MemberCB>().allowNonQueryUpdate());
                }
                return null;
            }
        }, new ThreadFireOption().commitTx().threadCount(2).repeatCount(1));
        performNewTransaction(new TransactionPerformer() {
            public boolean perform() {
                for (Member member : beforeList) {
                    log(member.getMemberName(), member.getUpdateUser());
                }
                UpdateOption<MemberCB> option = new UpdateOption<MemberCB>().disableCommonColumnAutoSetup();
                option.specify(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().columnBirthdate();
                        cb.specify().columnUpdateUser();
                        cb.specify().columnUpdateDatetime();
                    }
                });
                memberBhv.varyingBatchUpdateNonstrict(beforeList, option);
                return true;
            }
        });
    }

    private enum TestingResultSetType {
        FORWARD_ONLY(ResultSet.TYPE_FORWARD_ONLY), SCROLL_INSENSITIVE(ResultSet.TYPE_SCROLL_INSENSITIVE), SCROLL_SENSITIVE(
                ResultSet.TYPE_SCROLL_SENSITIVE);
        private int type;

        private TestingResultSetType(int type) {
            this.type = type;
        }

        public int type() {
            return type;
        }
    }

    // ===================================================================================
    //                                                                       Query Timeout
    //                                                                       =============
    public void test_QueryTimeout_insert() throws Exception {
        int repeatCount = 3; // repeat because DB2 reaction is fickleness
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                final long threadId = Thread.currentThread().getId();
                if (threadId % 2 == 0) {
                    Member member = new Member();
                    member.setMemberName("lock");
                    member.setMemberAccount("same");
                    member.setMemberStatusCode_Formalized();
                    memberBhv.insert(member);
                    sleep(3000);
                } else {
                    Member member = new Member();
                    member.setMemberName("wait");
                    member.setMemberAccount("same"); // same value to wait for lock
                    member.setMemberStatusCode_Formalized();
                    sleep(1000);
                    InsertOption<MemberCB> option = new InsertOption<MemberCB>();
                    option.configure(new StatementConfig().queryTimeout(1));
                    memberBhv.varyingInsert(member, option);
                }
                return null;
            }
        }, new ThreadFireOption().threadCount(2).repeatCount(repeatCount).expectExceptionAny("SQLCODE=-952"));
    }

    // ===================================================================================
    //                                                                  First Line Comment 
    //                                                                  ==================
    public void test_FirstLineComment_all_front() throws Exception {
        doTest_FirstLineComment_all(true);
    }

    public void test_FirstLineComment_all_rear() throws Exception {
        doTest_FirstLineComment_all(false);
    }

    protected void doTest_FirstLineComment_all(boolean front) throws Exception {
        // ## Arrange ##
        final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                infoList.add(info);
            }
        });
        Method actionMethod = MemberDbm.getInstance().columnBirthdate().getWriteMethod();
        SimpleTraceableSqlStringFilter filter = new SimpleTraceableSqlStringFilter(actionMethod,
                new TraceableSqlAdditionalInfoProvider() {
                    public String provide() {
                        return "marks:{?*@;+()[]'&%$#\"!\\>=<_^~-|.,}1234567890";
                    }
                }) {

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }
        };
        if (front) {
            filter.markingAtFront();
        }
        CallbackContext.setSqlStringFilterOnThread(filter);

        try {
            // ## Act ##
            {
                MemberCB cb = new MemberCB();
                memberBhv.selectList(cb);
            }
            {
                Member member = new Member();
                member.setMemberId(3);
                member.setBirthdate(currentDate());
                memberBhv.updateNonstrict(member);
            }
            {
                MemberCB cb = new MemberCB();
                cb.query().setMemberStatusCode_Equal_Provisional();
                Member member = new Member();
                memberBhv.queryUpdate(member, cb);
            }
            {
                PurchaseMaxPriceMemberPmb pmb = new PurchaseMaxPriceMemberPmb();
                pmb.paging(3, 2);
                memberBhv.outsideSql().manualPaging().selectPage(pmb);
            }
            {
                SpInOutParameterPmb spPmb = new SpInOutParameterPmb();
                spPmb.setVInVarchar("foo");
                spPmb.setVInoutVarchar("bar");
                memberBhv.outsideSql().call(spPmb);
            }
            // ## Assert ##
        } finally {
            CallbackContext.clearSqlStringFilterOnThread();
        }
    }
}
