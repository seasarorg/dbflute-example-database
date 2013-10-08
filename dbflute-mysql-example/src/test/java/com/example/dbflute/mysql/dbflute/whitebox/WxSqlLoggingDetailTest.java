package com.example.dbflute.mysql.dbflute.whitebox;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.QLog;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.jdbc.SqlResultHandler;
import org.seasar.dbflute.jdbc.SqlResultInfo;
import org.seasar.dbflute.util.DfReflectionUtil;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberStatus;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.6 (2010/11/10 Tuesday)
 */
public class WxSqlLoggingDetailTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    @Override
    protected boolean isUseOneTimeContainer() {
        return true;
    }

    // ===================================================================================
    //                                                                      Normal (Debug)
    //                                                                      ==============
    public void test_selectList_normal() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        assertTrue(memberBhv.contains_doLogSql());
        assertTrue(memberBhv.contains_buildDisplaySql());
        assertFalse(memberBhv.contains_createSqlLogDisplaySqlBuilder());
    }

    // ===================================================================================
    //                                                                             Nothing
    //                                                                             =======
    public void test_selectList_nothing() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        prepareQLogHoliday();

        // ## Act ##
        try {
            ListResultBean<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertHasAnyElement(memberList);
            assertFalse(memberBhv.contains_doLogSql());
            assertFalse(memberBhv.contains_buildDisplaySql());
            assertFalse(memberBhv.contains_createSqlLogDisplaySqlBuilder());
        } finally {
            prepareQLogRevival();
        }
    }

    // ===================================================================================
    //                                                                       SqlLogHandler
    //                                                                       =============
    public void test_selectList_sqlLogHandlerOnly_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
            }
        });

        // ## Act ##
        try {
            ListResultBean<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertHasAnyElement(memberList);
            assertTrue(memberBhv.contains_doLogSql());
            assertFalse(memberBhv.contains_buildDisplaySql());
            assertTrue(memberBhv.contains_createSqlLogDisplaySqlBuilder());
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_selectList_sqlLogHandlerOnly_lazyBuild() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
                String displaySql = info.getDisplaySql();
                log(ln() + displaySql);
                assertNotNull(displaySql);
                assertNotNull(getCachedDisplaySql(info));
            }
        });

        // ## Act ##
        try {
            ListResultBean<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertHasAnyElement(memberList);
            assertTrue(memberBhv.contains_doLogSql());
            assertTrue(memberBhv.contains_buildDisplaySql());
            assertTrue(memberBhv.contains_createSqlLogDisplaySqlBuilder());
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                    SqlResultHandler
    //                                                                    ================
    public void test_selectList_sqlResultHandlerOnly_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlResultHandlerOnThread(new SqlResultHandler() {
            public void handle(SqlResultInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
            }
        });

        // ## Act ##
        try {
            ListResultBean<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertHasAnyElement(memberList);
            assertTrue(memberBhv.contains_doLogSql());
            assertFalse(memberBhv.contains_buildDisplaySql());
            assertTrue(memberBhv.contains_createSqlLogDisplaySqlBuilder());
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlResultHandlerOnThread();
        }
    }

    public void test_selectList_sqlResultHandlerOnly_lazyBuild() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlResultHandlerOnThread(new SqlResultHandler() {
            public void handle(SqlResultInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
                String displaySql = info.getSqlLogInfo().getDisplaySql();
                log(ln() + displaySql);
                assertNotNull(displaySql);
                assertNotNull(getCachedDisplaySql(info));
            }
        });

        // ## Act ##
        try {
            ListResultBean<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertHasAnyElement(memberList);
            assertTrue(memberBhv.contains_doLogSql());
            assertTrue(memberBhv.contains_buildDisplaySql());
            assertTrue(memberBhv.contains_createSqlLogDisplaySqlBuilder());
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlResultHandlerOnThread();
        }
    }

    public void test_batchUpdateNonstrict_sqlResultHandlerOnly_lazyBuild() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        for (Member member : memberList) {
            member.setMemberStatusCode_Withdrawal();
        }
        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlResultHandlerOnThread(new SqlResultHandler() {
            public void handle(SqlResultInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
                String displaySql = info.getSqlLogInfo().getDisplaySql();
                log(ln() + displaySql);
                assertNotNull(displaySql);
                assertNotNull(getCachedDisplaySql(info));
            }
        });

        // ## Act ##
        try {
            memberBhv.batchUpdateNonstrict(memberList);

            // ## Assert ##
            assertHasAnyElement(memberList);
            assertTrue(memberBhv.contains_doLogSql());
            assertTrue(memberBhv.contains_buildDisplaySql());
            assertTrue(memberBhv.contains_createSqlLogDisplaySqlBuilder());
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlResultHandlerOnThread();
        }
    }

    public void test_batchInsert_sqlResultHandlerOnly_lazyBuild() {
        // ## Arrange ##
        List<MemberStatus> statusList = new ArrayList<MemberStatus>();
        for (int i = 0; i < 255; i++) {
            MemberStatus status = new MemberStatus();
            String indexStr = String.valueOf(i);
            String code = (indexStr.length() == 1 ? "00" + indexStr : (indexStr.length() == 2 ? "0" + indexStr
                    : indexStr));
            status.setMemberStatusCode(code);
            status.setMemberStatusName(code + " Name");
            status.setDisplayOrder(i + 1000);
            status.setDescription(code + " Desc");
            statusList.add(status);
        }
        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlResultHandlerOnThread(new SqlResultHandler() {
            public void handle(SqlResultInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
                String displaySql = info.getSqlLogInfo().getDisplaySql();
                log(ln() + displaySql);
                assertNotNull(displaySql);
                assertNotNull(getCachedDisplaySql(info));
                assertTrue(Srl.contains(displaySql, "values ('099'"));
                assertFalse(Srl.contains(displaySql, "values ('100'"));
            }
        });

        // ## Act ##
        try {
            memberStatusBhv.batchInsert(statusList);

            // ## Assert ##
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlResultHandlerOnThread();
        }
    }

    public void test_procedure_sqlResultHandlerOnly_lazyBuild() {
        // ## Arrange ##
        SpInOutParameterPmb pmb = new SpInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar"); // no point but for test overridden later
        pmb.setVInoutVarchar("qux");

        prepareQLogHoliday();
        final Set<String> traceSet = new HashSet<String>();
        CallbackContext.setSqlResultHandlerOnThread(new SqlResultHandler() {
            public void handle(SqlResultInfo info) {
                traceSet.add("handle");
                assertNull(getCachedDisplaySql(info));
                String displaySql = info.getSqlLogInfo().getDisplaySql();
                log(ln() + displaySql);
                assertNotNull(displaySql);
                assertNotNull(getCachedDisplaySql(info));
            }
        });

        // ## Act ##
        try {
            memberBhv.outsideSql().call(pmb);

            // ## Assert ##
            log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
            assertEquals("qux", pmb.getVOutVarchar());
            assertEquals("foo", pmb.getVInoutVarchar());
            assertEquals(1, traceSet.size());
        } finally {
            prepareQLogRevival();
            CallbackContext.clearSqlResultHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected void prepareQLogHoliday() {
        QLog.unlock();
        QLog.setLoggingInHolidayMood(true);
    }

    protected void prepareQLogRevival() {
        QLog.setLoggingInHolidayMood(false);
        QLog.lock();
    }

    protected String getCachedDisplaySql(SqlLogInfo info) {
        Field field = DfReflectionUtil.getWholeField(info.getClass(), "_cachedDisplaySql");
        return (String) DfReflectionUtil.getValueForcedly(field, info);
    }

    protected String getCachedDisplaySql(SqlResultInfo info) {
        return getCachedDisplaySql(info.getSqlLogInfo());
    }
}
