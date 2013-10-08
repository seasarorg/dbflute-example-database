package com.example.dbflute.oracle.dbflute.vendor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.bhv.core.BehaviorCommandMeta;
import org.seasar.dbflute.bhv.proposal.callback.SimpleTraceableSqlStringFilter;
import org.seasar.dbflute.bhv.proposal.callback.TraceableSqlAdditionalInfoProvider;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.unit.core.thread.ThreadFireExecution;
import org.seasar.dbflute.unit.core.thread.ThreadFireOption;
import org.seasar.dbflute.unit.core.thread.ThreadFireResource;

import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

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
    //                                                                       Query Timeout
    //                                                                       =============
    public void test_QueryTimeout_insert() throws Exception {
        threadFire(new ThreadFireExecution<Void>() {
            public Void execute(ThreadFireResource resource) {
                final long threadId = Thread.currentThread().getId();
                if (threadId % 2 == 0) {
                    Member member = new Member();
                    member.setMemberName("lock");
                    member.setMemberAccount("same");
                    member.setMemberStatusCode_Formalized();
                    memberBhv.insert(member);
                    sleep(5000); // more 2 seconds because of Oracle in VM
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
        }, new ThreadFireOption().threadCount(2).repeatCount(1).expectExceptionAny("ORA-01013"));
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
                        // {} is NG on Oracle so filtered
                        // ' (single quotation) is NG when update on Oracle (why?)
                        return "marks:{Q*@;+()[]'&%$#\"!\\>=<_^~-|.,}1234567890";
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
                member.setMemberId(3L);
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
                try {
                    memberBhv.outsideSql().call(spPmb);
                    if (front) {
                        fail();
                    }
                } catch (SQLFailureException e) {
                    if (!front) {
                        throw e;
                    }
                    log(e.getMessage());
                }
            }
            // ## Assert ##
        } finally {
            CallbackContext.clearSqlStringFilterOnThread();
        }
    }
}
