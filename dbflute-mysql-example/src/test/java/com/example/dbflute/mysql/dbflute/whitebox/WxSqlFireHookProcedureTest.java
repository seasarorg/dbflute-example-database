package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.HashSet;
import java.util.Set;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.bhv.core.BehaviorCommandMeta;
import org.seasar.dbflute.bhv.core.SqlFireHook;
import org.seasar.dbflute.bhv.core.SqlFireReadyInfo;
import org.seasar.dbflute.bhv.core.SqlFireResultInfo;
import org.seasar.dbflute.jdbc.ExecutionTimeInfo;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.DfTraceViewUtil;

import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.4C (2012/5/03 Wednesday)
 */
public class WxSqlFireHookProcedureTest extends UnitContainerTestCase {

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
        clearSqlLogHandler();
    }

    protected void clearSqlLogHandler() {
        CallbackContext.clearSqlFireHookOnThread();
        assertFalse(CallbackContext.isExistCallbackContextOnThread());
        assertFalse(CallbackContext.isExistBehaviorCommandHookOnThread());
        assertFalse(CallbackContext.isExistSqlFireHookOnThread());
        assertFalse(CallbackContext.isExistSqlLogHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlResultHandlerOnThread());
    }

    // ===================================================================================
    //                                                                           Procedure
    //                                                                           =========
    public void test_Procedure_basic() {
        // ## Arrange ##
        SpNoParameterPmb pmb = new SpNoParameterPmb();
        final Set<String> displaySqlSet = new HashSet<String>();
        final Set<String> markSet = new HashSet<String>();
        CallbackContext.setSqlFireHookOnThread(new SqlFireHook() {
            public void hookBefore(BehaviorCommandMeta meta, SqlFireReadyInfo fireReadyInfo) {
                markSet.add("hookBefore");
                assertFalse(meta.isConditionBean());
                assertFalse(meta.isSelect());
                assertTrue(meta.isProcedure());
                SqlLogInfo sqlLogInfo = fireReadyInfo.getSqlLogInfo();
                log(sqlLogInfo);
                String executedSql = sqlLogInfo.getExecutedSql();
                assertNotNull(executedSql);
                String displaySql = sqlLogInfo.getDisplaySql();
                assertNotNull(displaySql);
                log(ln() + displaySql);
                displaySqlSet.add(displaySql);
            }

            public void hookFinally(BehaviorCommandMeta meta, SqlFireResultInfo fireResultInfo) {
                markSet.add("hookFinally");
                assertFalse(meta.isConditionBean());
                assertFalse(meta.isSelect());
                assertTrue(meta.isProcedure());
                Object nativeResult = fireResultInfo.getNativeResult();
                Class<?> nativeType = nativeResult.getClass();
                assertTrue("nativeType=" + nativeType, Boolean.class.isAssignableFrom(nativeType));
                assertNull(fireResultInfo.getNativeCause());
                SqlLogInfo sqlLogInfo = fireResultInfo.getSqlLogInfo();
                log(sqlLogInfo);
                assertNotNull(sqlLogInfo);
                ExecutionTimeInfo timeInfo = fireResultInfo.getExecutionTimeInfo();
                log(timeInfo);
                assertNull(timeInfo.getCommandBeforeTimeMillis());
                assertNull(timeInfo.getCommandAfterTimeMillis());
                Long beforeTimeMillis = timeInfo.getSqlBeforeTimeMillis();
                Long afterTimeMillis = timeInfo.getSqlAfterTimeMillis();
                assertNotNull(beforeTimeMillis);
                assertNotNull(afterTimeMillis);
                log(DfTraceViewUtil.convertToPerformanceView(afterTimeMillis - beforeTimeMillis));
            }
        });

        // ## Act ##
        memberBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals(1, displaySqlSet.size());
        assertTrue(displaySqlSet.iterator().next().contains("call"));
        assertTrue(markSet.contains("hookBefore"));
        assertTrue(markSet.contains("hookFinally"));
    }
}
