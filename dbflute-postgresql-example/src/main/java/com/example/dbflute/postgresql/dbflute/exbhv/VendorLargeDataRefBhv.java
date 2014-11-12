package com.example.dbflute.postgresql.dbflute.exbhv;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import org.seasar.dbflute.bhv.core.BehaviorCommand;
import org.seasar.dbflute.bhv.core.command.BatchUpdateNonstrictCommand;
import org.seasar.dbflute.bhv.core.command.SelectListCBCommand;
import org.seasar.dbflute.bhv.core.execution.SelectCBExecution;
import org.seasar.dbflute.jdbc.SqlLogInfo.SqlLogDisplaySqlBuilder;
import org.seasar.dbflute.s2dao.jdbc.TnResultSetHandler;
import org.seasar.dbflute.s2dao.metadata.TnPropertyType;
import org.seasar.dbflute.s2dao.sqlcommand.TnBatchUpdateDynamicCommand;
import org.seasar.dbflute.s2dao.sqlhandler.TnBasicParameterHandler;
import org.seasar.dbflute.s2dao.sqlhandler.TnBasicSelectHandler;
import org.seasar.dbflute.s2dao.sqlhandler.TnBatchUpdateHandler;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.postgresql.dbflute.bsbhv.BsVendorLargeDataRefBhv;
import com.example.dbflute.postgresql.dbflute.exentity.VendorLargeDataRef;

/**
 * The behavior of vendor_large_data_ref.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class VendorLargeDataRefBhv extends BsVendorLargeDataRefBhv {

    // ===================================================================================
    //                                                                       Internal Info
    //                                                                       =============
    protected ConcurrentHashMap<String, Object> _loggingMarkMap = new ConcurrentHashMap<String, Object>();
    protected ConcurrentHashMap<String, Integer> _fetchSizeMap = new ConcurrentHashMap<String, Integer>();
    protected ConcurrentHashMap<String, Vector<?>> _rowDataClassMap = new ConcurrentHashMap<String, Vector<?>>();
    protected Integer _latestFetchSize = null;

    public boolean contains_doLogSql() {
        return _loggingMarkMap.containsKey("doLogSql");
    }

    public boolean contains_buildDisplaySql() {
        return _loggingMarkMap.containsKey("buildDisplaySql");
    }

    public boolean contains_createSqlLogDisplaySqlBuilder() {
        return _loggingMarkMap.containsKey("createSqlLogDisplaySqlBuilder");
    }

    public ConcurrentHashMap<String, Integer> getFetchSizeMap() {
        return _fetchSizeMap;
    }

    public ConcurrentHashMap<String, Vector<?>> getRowDataClassMap() {
        return _rowDataClassMap;
    }

    @Override
    protected <RESULT> RESULT invoke(BehaviorCommand<RESULT> behaviorCommand) {
        _loggingMarkMap.clear();
        return super.invoke(behaviorCommand);
    }

    @Override
    protected <RESULT extends VendorLargeDataRef> SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new SelectListCBCommand<RESULT>() {
            @Override
            protected SelectCBExecution newSelectCBExecution(Map<String, Class<?>> argNameTypeMap,
                    TnResultSetHandler handler) {
                return new SelectCBExecution(_dataSource, _statementFactory, argNameTypeMap, handler) {
                    @Override
                    protected TnBasicParameterHandler newBasicParameterHandler(String executedSql) {
                        return new TnBasicSelectHandler(_dataSource, executedSql, _resultSetHandler, _statementFactory) {
                            @Override
                            protected void doLogSql(Object[] args, Class<?>[] argTypes, boolean logEnabled,
                                    boolean sqlFireHook, boolean hasSqlLog, boolean hasSqlResult, Object sqlLogRegistry) {
                                _loggingMarkMap.put("doLogSql", logEnabled + ", " + sqlFireHook + ", " + hasSqlLog
                                        + ", " + hasSqlResult);
                                super.doLogSql(args, argTypes, logEnabled, sqlFireHook, hasSqlLog, hasSqlResult,
                                        sqlLogRegistry);
                            };

                            @Override
                            protected String buildDisplaySql(String sql, Object[] args) {
                                _loggingMarkMap.put("buildDisplaySql", args);
                                return super.buildDisplaySql(sql, args);
                            }

                            @Override
                            protected SqlLogDisplaySqlBuilder createSqlLogDisplaySqlBuilder(
                                    String alreadyBuiltDisplaySql) {
                                _loggingMarkMap.put("createSqlLogDisplaySqlBuilder", new Object());
                                return super.createSqlLogDisplaySqlBuilder(alreadyBuiltDisplaySql);
                            }

                            @Override
                            protected PreparedStatement prepareStatement(Connection conn) {
                                PreparedStatement ps = super.prepareStatement(conn);
                                try {
                                    _fetchSizeMap.put("selectList", ps.getFetchSize());
                                } catch (SQLException e) {
                                    throw new IllegalStateException(e);
                                }
                                return ps;
                            }

                            @Override
                            protected ResultSet executeQuery(PreparedStatement ps) throws SQLException {
                                ResultSet rs = super.executeQuery(ps);
                                Vector<?> rowData = extractRowsOnResultSet(extractPhysicalRs(rs));
                                _rowDataClassMap.put("selectList", rowData);
                                return rs;
                            }
                        };
                    }
                };
            }
        };
    }

    @Override
    protected BatchUpdateNonstrictCommand newBatchUpdateNonstrictCommand() {
        return new BatchUpdateNonstrictCommand() {
            @Override
            protected TnBatchUpdateDynamicCommand newBatchUpdateDynamicCommand() {
                return new TnBatchUpdateDynamicCommand(_dataSource, _statementFactory) {
                    @Override
                    protected TnBatchUpdateHandler newBatchUpdateHandler(TnPropertyType[] boundPropTypes, String sql) {
                        return new TnBatchUpdateHandler(_dataSource, _statementFactory, sql, _beanMetaData,
                                boundPropTypes) {
                            @Override
                            protected void doLogSql(Object[] args, Class<?>[] argTypes, boolean logEnabled,
                                    boolean sqlFireHook, boolean hasSqlLog, boolean hasSqlResult, Object sqlLogRegistry) {
                                _loggingMarkMap.put("doLogSql", logEnabled + ", " + sqlFireHook + ", " + hasSqlLog
                                        + ", " + hasSqlResult);
                                super.doLogSql(args, argTypes, logEnabled, sqlFireHook, hasSqlLog, hasSqlResult,
                                        sqlLogRegistry);
                            };

                            @Override
                            protected String buildDisplaySql(String sql, Object[] args) {
                                _loggingMarkMap.put("buildDisplaySql", args);
                                return super.buildDisplaySql(sql, args);
                            }

                            @Override
                            protected SqlLogDisplaySqlBuilder createSqlLogDisplaySqlBuilder(
                                    String alreadyBuiltDisplaySql) {
                                _loggingMarkMap.put("createSqlLogDisplaySqlBuilder", new Object());
                                return super.createSqlLogDisplaySqlBuilder(alreadyBuiltDisplaySql);
                            }
                        };
                    }
                };
            }
        };
    }

    // ===================================================================================
    //                                                                   Reflection Helper
    //                                                                   =================
    protected org.postgresql.jdbc3.Jdbc3ResultSet extractPhysicalRs(ResultSet rs) { // nested
        Field field = DfReflectionUtil.getWholeField(org.apache.commons.dbcp.DelegatingResultSet.class, "_res");
        ResultSet firstRs = (ResultSet) DfReflectionUtil.getValueForcedly(field, rs);
        return (org.postgresql.jdbc3.Jdbc3ResultSet) DfReflectionUtil.getValueForcedly(field, firstRs);
    }

    protected Vector<?> extractRowsOnResultSet(org.postgresql.jdbc3.Jdbc3ResultSet rs) {
        Field physicalRsField = DfReflectionUtil.getWholeField(org.postgresql.jdbc3.Jdbc3ResultSet.class, "rows");
        return (Vector<?>) DfReflectionUtil.getValueForcedly(physicalRsField, rs);
    }
}
