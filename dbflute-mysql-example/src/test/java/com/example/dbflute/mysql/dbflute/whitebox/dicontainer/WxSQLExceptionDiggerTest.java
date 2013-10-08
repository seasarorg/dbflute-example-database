package com.example.dbflute.mysql.dbflute.whitebox.dicontainer;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.jdbc.SQLExceptionDigger;
import org.seasar.framework.exception.SQLRuntimeException;

import com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.8 (2010/12/16 Thursday)
 */
public class WxSQLExceptionDiggerTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                       DBFluteConfig
    //                                                                       =============
    public void test_SQLExceptionDigger_DBFluteConfig_S2Default() {
        // ## Arrange ##
        SQLException sqlEx = new SQLException("reason", "state", 99999);
        SQLRuntimeException s2Ex = new SQLRuntimeException(sqlEx);
        SQLExceptionDigger digger = DBFluteConfig.getInstance().getSQLExceptionDigger();

        // ## Act ##
        SQLException actual = digger.digUp(s2Ex);

        // ## Assert ##
        assertEquals(sqlEx, actual);
        assertEquals(sqlEx.getSQLState(), actual.getSQLState());
        assertEquals(sqlEx.getErrorCode(), actual.getErrorCode());
    }

    // ===================================================================================
    //                                                              BehaviorCommandInvoker
    //                                                              ======================
    public void test_SQLExceptionDigger_BehaviorCommandInvoker_basic() {
        // ## Arrange ##
        SQLException sqlEx = new SQLException("reason", "state", 99999);
        SQLRuntimeException s2Ex = new SQLRuntimeException(sqlEx);
        final RuntimeException cause = s2Ex;
        final Set<SQLException> exSet = new HashSet<SQLException>();
        BehaviorCommandInvoker invoker = new BehaviorCommandInvoker() {
            @Override
            protected void handleSQLException(SQLException e) {
                exSet.add(e);
            }

            @Override
            public String toString() {
                handleExecutionException(cause);
                return null;
            }

            @Override
            public SQLExceptionDigger getSQLExceptionDigger() {
                return DBFluteConfig.getInstance().getSQLExceptionDigger();
            }
        };

        // ## Act ##
        invoker.toString();

        // ## Assert ##
        assertHasAnyElement(exSet);
        SQLException actual = exSet.iterator().next();
        assertEquals(sqlEx, actual);
    }

    public void test_SQLExceptionDigger_BehaviorCommandInvoker_failureEx() {
        // ## Arrange ##
        SQLException sqlEx = new SQLException("reason", "state", 99999);
        SQLFailureException failureEx = new SQLFailureException("msg", sqlEx);
        final RuntimeException cause = failureEx;
        final Set<SQLException> exSet = new HashSet<SQLException>();
        BehaviorCommandInvoker invoker = new BehaviorCommandInvoker() {
            @Override
            protected void handleSQLException(SQLException e) {
                exSet.add(e);
            }

            @Override
            public String toString() {
                handleExecutionException(cause);
                return null;
            }

            @Override
            public SQLExceptionDigger getSQLExceptionDigger() {
                return DBFluteConfig.getInstance().getSQLExceptionDigger();
            }
        };

        // ## Act ##
        try {
            invoker.toString();

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertEquals(e, failureEx);
        }
        assertTrue(exSet.isEmpty());
    }

    public void test_SQLExceptionDigger_BehaviorCommandInvoker_illegalEx_has() {
        // ## Arrange ##
        SQLException sqlEx = new SQLException("reason", "state", 99999);
        IllegalStateException stateEx = new IllegalStateException("msg", sqlEx);
        final RuntimeException cause = stateEx;
        final Set<SQLException> exSet = new HashSet<SQLException>();
        BehaviorCommandInvoker invoker = new BehaviorCommandInvoker() {
            @Override
            protected void handleSQLException(SQLException e) {
                exSet.add(e);
            }

            @Override
            public String toString() {
                handleExecutionException(cause);
                return null;
            }

            @Override
            public SQLExceptionDigger getSQLExceptionDigger() {
                return DBFluteConfig.getInstance().getSQLExceptionDigger();
            }
        };

        // ## Act ##
        invoker.toString();

        // ## Assert ##
        assertFalse(exSet.isEmpty());
        SQLException actual = exSet.iterator().next();
        assertEquals(sqlEx, actual);
    }

    public void test_SQLExceptionDigger_BehaviorCommandInvoker_illegalEx_non() {
        // ## Arrange ##
        IllegalStateException stateEx = new IllegalStateException("msg");
        final RuntimeException cause = stateEx;
        final Set<SQLException> exSet = new HashSet<SQLException>();
        BehaviorCommandInvoker invoker = new BehaviorCommandInvoker() {
            @Override
            protected void handleSQLException(SQLException e) {
                exSet.add(e);
            }

            @Override
            public String toString() {
                handleExecutionException(cause);
                return null;
            }

            @Override
            public SQLExceptionDigger getSQLExceptionDigger() {
                return DBFluteConfig.getInstance().getSQLExceptionDigger();
            }
        };

        // ## Act ##
        try {
            invoker.toString();

            // ## Assert ##
            fail();
        } catch (IllegalStateException e) {
            // OK
            log(e.getMessage());
            assertEquals(e, stateEx);
        }
        assertTrue(exSet.isEmpty());
    }
}
