/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exbhv;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.Entity;
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

import com.example.dbflute.mysql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.mysql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import com.mysql.jdbc.RowData;

/**
 * The behavior of member. <br />
 * You can implement your original methods here. <br />
 * This class is NOT overrided when re-generating. <br />
 * @author DBFlute(AutoGenerator)
 */
public class MemberBhv extends com.example.dbflute.mysql.dbflute.bsbhv.BsMemberBhv {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(MemberBhv.class);

    // ===================================================================================
    //                                                                          CSV Output
    //                                                                          ==========
    /**
     * 会員の購入数の集計CSVを作成する。<br />
     * 大量件数になる可能性があるため、カーソルフェッチで実現している。<br />
     * 「現場ソリューション DBFlute」における「大量件数」の例題。<br />
     * @param pmb The parameter bean of Purchase Summary Member. (NotNull)
     */
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        final PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final Date birthdate = cursor.getBirthdate();
                    final Timestamp formalizedDatetime = cursor.getFormalizedDatetime();
                    final BigDecimal purchaseSummary = cursor.getPurchaseSummary();

                    // ここではただログに出力するだけ
                    // (本当はCSVファイルへの出力)
                    final String c = ", ";
                    _log.debug(memberId + c + memberName + c + birthdate + c + formalizedDatetime + c + purchaseSummary);

                }// ResultSetのCloseはFrameworkが行うので必要なし
                return null;// ここで処理が完結してるので戻り値は不要
            }
        };
        outsideSql().cursorHandling().selectCursor(PATH_selectPurchaseSummaryMember, pmb, handler);
    }

    // ===================================================================================
    //                                                                       Internal Info
    //                                                                       =============
    protected ConcurrentHashMap<String, Object> _loggingMarkMap = new ConcurrentHashMap<String, Object>();
    protected ConcurrentHashMap<String, Integer> _fetchSizeMap = new ConcurrentHashMap<String, Integer>();
    protected ConcurrentHashMap<String, Class<?>> _rowDataClassMap = new ConcurrentHashMap<String, Class<?>>();
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

    public ConcurrentHashMap<String, Class<?>> getRowDataClassMap() {
        return _rowDataClassMap;
    }

    @Override
    protected <RESULT> RESULT invoke(BehaviorCommand<RESULT> behaviorCommand) {
        _loggingMarkMap.clear();
        return super.invoke(behaviorCommand);
    }

    @Override
    protected <ENTITY extends Entity> SelectListCBCommand<ENTITY> newSelectListCBCommand() {
        return new SelectListCBCommand<ENTITY>() {
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
                                RowData rowData = extractRowDataOnResutSet((com.mysql.jdbc.ResultSetImpl) rs);
                                _rowDataClassMap.put("selectList", rowData.getClass());
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
    protected com.mysql.jdbc.RowData extractRowDataOnResutSet(com.mysql.jdbc.ResultSetImpl rsImpl) {
        Field rowDataField = DfReflectionUtil.getWholeField(com.mysql.jdbc.ResultSetImpl.class, "rowData");
        return (com.mysql.jdbc.RowData) DfReflectionUtil.getValueForcedly(rowDataField, rsImpl);
    }

    protected List<?> extractRowsOnRowData(com.mysql.jdbc.RowData rowData) {
        Field rowsField = DfReflectionUtil.getWholeField(com.mysql.jdbc.RowDataStatic.class, "rows");
        return (List<?>) DfReflectionUtil.getValueForcedly(rowsField, rowData);
    }
}
