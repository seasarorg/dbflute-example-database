package com.example.dbflute.mysql.dbflute.whitebox.runtime;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.QLog;
import org.seasar.dbflute.XLog;
import org.seasar.dbflute.bhv.SqlStringFilter;
import org.seasar.dbflute.bhv.core.BehaviorCommandMeta;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.resource.InternalMapContext;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.3 (2013/02/24 Sunday)
 */
public class WxInvokePathDetailTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                          After Care
    //                                                                          ==========
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        clearCallbackContext();
    }

    protected void clearCallbackContext() {
        CallbackContext.clearSqlStringFilterOnThread();
        assertFalse(CallbackContext.isExistCallbackContextOnThread());
        assertFalse(CallbackContext.isExistBehaviorCommandHookOnThread());
        assertFalse(CallbackContext.isExistSqlFireHookOnThread());
        assertFalse(CallbackContext.isExistSqlLogHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlResultHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlStringFilterOnThread());
    }

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_ConditionBean_basic() {
        // ## Arrange ##
        final List<String> markList = new ArrayList<String>();
        CallbackContext.setSqlStringFilterOnThread(new SqlStringFilter() {
            public String filterSelectCB(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterSelectCB");
                assertNotNull(InternalMapContext.getSavedInvokePath()); // because of logging enabled
                String invokePath = meta.getInvokePath();
                assertNotNull(InternalMapContext.getSavedInvokePath());
                assertEquals(invokePath, meta.getInvokePath());
                assertTrue(invokePath == meta.getInvokePath());
                return "-- " + invokePath + ln() + executedSql;
            }

            public String filterEntityUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterEntityUpdate");
                assertNotNull(InternalMapContext.getSavedInvokePath()); // because of logging enabled
                String invokePath = meta.getInvokePath();
                assertNotNull(InternalMapContext.getSavedInvokePath());
                assertEquals(invokePath, meta.getInvokePath());
                assertTrue(invokePath == meta.getInvokePath());
                return "-- " + invokePath + ln() + executedSql;
            }

            public String filterQueryUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterQueryUpdate");
                return null;
            }

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterOutsideSql");
                return null;
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterProcedure");
                return null;
            }
        });

        final List<SqlLogInfo> sqlLogInfoList = newArrayList();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlLogInfoList.add(info);
            }
        });

        AaaPage aaaPage = new AaaPage();
        try {
            // ## Act & Assert ##
            aaaPage.service();
            aaaPage.facade();
            Member member = new Member();
            member.setMemberId(3);
            member.setMemberName("test");
            memberBhv.updateNonstrict(member);

            assertEquals(3, markList.size());
            assertContainsKeywordAny(markList, "filterSelectCB");
            assertContainsKeywordAny(markList, "filterEntityUpdate");
            assertHasAnyElement(sqlLogInfoList);
            for (SqlLogInfo sqlLogInfo : sqlLogInfoList) {
                String executedSql = sqlLogInfo.getExecutedSql();
                assertTrue(executedSql.startsWith("-- "));
                assertTrue(executedSql.contains(getClass().getSimpleName()));
            }
            // *and visual judgment with DBFlute runtime
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_ConditionBean_noLogging() {
        // ## Arrange ##
        final List<String> markList = new ArrayList<String>();
        CallbackContext.setSqlStringFilterOnThread(new SqlStringFilter() {
            public String filterSelectCB(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterSelectCB");
                assertNull(InternalMapContext.getSavedInvokePath()); // because of logging disabled
                String invokePath = meta.getInvokePath();
                assertNotNull(InternalMapContext.getSavedInvokePath());
                assertEquals(invokePath, meta.getInvokePath());
                assertTrue(invokePath == meta.getInvokePath());
                return "-- " + invokePath + ln() + executedSql;
            }

            public String filterEntityUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterEntityUpdate");
                assertNull(InternalMapContext.getSavedInvokePath()); // because of logging disabled
                String invokePath = meta.getInvokePath();
                assertNotNull(InternalMapContext.getSavedInvokePath());
                assertEquals(invokePath, meta.getInvokePath());
                assertTrue(invokePath == meta.getInvokePath());
                return "-- " + invokePath + ln() + executedSql;
            }

            public String filterQueryUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterQueryUpdate");
                return null;
            }

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterOutsideSql");
                return null;
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterProcedure");
                return null;
            }
        });

        final List<SqlLogInfo> sqlLogInfoList = newArrayList();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlLogInfoList.add(info);
            }
        });
        XLog.unlock();
        QLog.unlock();
        XLog.setLoggingInHolidayMood(true);
        QLog.setLoggingInHolidayMood(true);

        AaaPage aaaPage = new AaaPage();
        try {
            // ## Act & Assert ##
            aaaPage.service();
            aaaPage.facade();
            Member member = new Member();
            member.setMemberId(3);
            member.setMemberName("test");
            memberBhv.updateNonstrict(member);

            assertEquals(3, markList.size());
            assertContainsKeywordAny(markList, "filterSelectCB");
            assertContainsKeywordAny(markList, "filterEntityUpdate");
            assertHasAnyElement(sqlLogInfoList);
            for (SqlLogInfo sqlLogInfo : sqlLogInfoList) {
                String executedSql = sqlLogInfo.getExecutedSql();
                assertTrue(executedSql.startsWith("-- "));
                assertTrue(executedSql.contains(getClass().getSimpleName()));
                log(ln() + executedSql);
            }
            // *and visual judgment with DBFlute runtime
        } finally {
            XLog.setLoggingInHolidayMood(false);
            QLog.setLoggingInHolidayMood(false);
            XLog.lock();
            QLog.lock();
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                        Helper Class
    //                                                                        ============
    protected class AaaPage {
        public void service() {
            new BbbService().bbb();
        }

        public void facade() {
            new DddFacade().ddd();
        }

        public void aaa() {
            memberBhv.selectList(new MemberCB());
        }
    }

    protected class BbbService {
        public void bbb() {
            memberBhv.selectList(new MemberCB());
        }

        public void page() {
            new AaaPage().aaa();
        }
    }

    protected class CccAction {
        public void service() {
            new BbbService().bbb();
        }

        public void facade() {
            new DddFacade().ddd();
        }

        public void ccc() {
            memberBhv.selectList(new MemberCB());
        }
    }

    protected class DddFacade {
        public void ddd() {
            memberBhv.selectList(new MemberCB());
        }

        public void action() {
            new CccAction().ccc();
        }
    }
}
