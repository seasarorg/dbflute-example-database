/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_include_query.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteIncludeQueryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteIncludeQueryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_include_query";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryId The value of includeQueryId as equal. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryId_Equal(Long includeQueryId) {
        doSetIncludeQueryId_Equal(includeQueryId);
    }

    protected void doSetIncludeQueryId_Equal(Long includeQueryId) {
        regIncludeQueryId(CK_EQ, includeQueryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryId The value of includeQueryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryId_GreaterThan(Long includeQueryId) {
        regIncludeQueryId(CK_GT, includeQueryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryId The value of includeQueryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryId_LessThan(Long includeQueryId) {
        regIncludeQueryId(CK_LT, includeQueryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryId The value of includeQueryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryId_GreaterEqual(Long includeQueryId) {
        regIncludeQueryId(CK_GE, includeQueryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryId The value of includeQueryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryId_LessEqual(Long includeQueryId) {
        regIncludeQueryId(CK_LE, includeQueryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of includeQueryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of includeQueryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIncludeQueryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueIncludeQueryId(), "INCLUDE_QUERY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryIdList The collection of includeQueryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludeQueryId_InScope(Collection<Long> includeQueryIdList) {
        doSetIncludeQueryId_InScope(includeQueryIdList);
    }

    protected void doSetIncludeQueryId_InScope(Collection<Long> includeQueryIdList) {
        regINS(CK_INS, cTL(includeQueryIdList), getCValueIncludeQueryId(), "INCLUDE_QUERY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param includeQueryIdList The collection of includeQueryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludeQueryId_NotInScope(Collection<Long> includeQueryIdList) {
        doSetIncludeQueryId_NotInScope(includeQueryIdList);
    }

    protected void doSetIncludeQueryId_NotInScope(Collection<Long> includeQueryIdList) {
        regINS(CK_NINS, cTL(includeQueryIdList), getCValueIncludeQueryId(), "INCLUDE_QUERY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIncludeQueryId_IsNull() { regIncludeQueryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIncludeQueryId_IsNotNull() { regIncludeQueryId(CK_ISNN, DOBJ); }

    protected void regIncludeQueryId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIncludeQueryId(), "INCLUDE_QUERY_ID"); }
    protected abstract ConditionValue getCValueIncludeQueryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @param includeQueryVarchar The value of includeQueryVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludeQueryVarchar_Equal(String includeQueryVarchar) {
        doSetIncludeQueryVarchar_Equal(fRES(includeQueryVarchar));
    }

    protected void doSetIncludeQueryVarchar_Equal(String includeQueryVarchar) {
        regIncludeQueryVarchar(CK_EQ, includeQueryVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @param includeQueryVarchar The value of includeQueryVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludeQueryVarchar_NotEqual(String includeQueryVarchar) {
        doSetIncludeQueryVarchar_NotEqual(fRES(includeQueryVarchar));
    }

    protected void doSetIncludeQueryVarchar_NotEqual(String includeQueryVarchar) {
        regIncludeQueryVarchar(CK_NES, includeQueryVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @param includeQueryVarcharList The collection of includeQueryVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludeQueryVarchar_InScope(Collection<String> includeQueryVarcharList) {
        doSetIncludeQueryVarchar_InScope(includeQueryVarcharList);
    }

    public void doSetIncludeQueryVarchar_InScope(Collection<String> includeQueryVarcharList) {
        regINS(CK_INS, cTL(includeQueryVarcharList), getCValueIncludeQueryVarchar(), "INCLUDE_QUERY_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @param includeQueryVarcharList The collection of includeQueryVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludeQueryVarchar_NotInScope(Collection<String> includeQueryVarcharList) {
        doSetIncludeQueryVarchar_NotInScope(includeQueryVarcharList);
    }

    public void doSetIncludeQueryVarchar_NotInScope(Collection<String> includeQueryVarcharList) {
        regINS(CK_NINS, cTL(includeQueryVarcharList), getCValueIncludeQueryVarchar(), "INCLUDE_QUERY_VARCHAR");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     */
    public void setIncludeQueryVarchar_IsNull() { regIncludeQueryVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     */
    public void setIncludeQueryVarchar_IsNullOrEmpty() { regIncludeQueryVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     */
    public void setIncludeQueryVarchar_IsNotNull() { regIncludeQueryVarchar(CK_ISNN, DOBJ); }

    protected void regIncludeQueryVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIncludeQueryVarchar(), "INCLUDE_QUERY_VARCHAR"); }
    protected abstract ConditionValue getCValueIncludeQueryVarchar();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_INTEGER: {INT(10)}
     * @param includeQueryInteger The value of includeQueryInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryInteger_Equal(Integer includeQueryInteger) {
        doSetIncludeQueryInteger_Equal(includeQueryInteger);
    }

    protected void doSetIncludeQueryInteger_Equal(Integer includeQueryInteger) {
        regIncludeQueryInteger(CK_EQ, includeQueryInteger);
    }

    protected void regIncludeQueryInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIncludeQueryInteger(), "INCLUDE_QUERY_INTEGER"); }
    protected abstract ConditionValue getCValueIncludeQueryInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_DATE: {DATE(10)}
     * @param includeQueryDate The value of includeQueryDate as equal. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryDate_Equal(java.util.Date includeQueryDate) {
        regIncludeQueryDate(CK_EQ,  fCTPD(includeQueryDate));
    }

    protected void regIncludeQueryDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIncludeQueryDate(), "INCLUDE_QUERY_DATE"); }
    protected abstract ConditionValue getCValueIncludeQueryDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     * @param includeQueryDatetime The value of includeQueryDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setIncludeQueryDatetime_Equal(java.sql.Timestamp includeQueryDatetime) {
        regIncludeQueryDatetime(CK_EQ,  includeQueryDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     * <pre>e.g. setIncludeQueryDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of includeQueryDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of includeQueryDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setIncludeQueryDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueIncludeQueryDatetime(), "INCLUDE_QUERY_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of includeQueryDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of includeQueryDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setIncludeQueryDatetime_DateFromTo(Date fromDate, Date toDate) {
        setIncludeQueryDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     */
    public void setIncludeQueryDatetime_IsNull() { regIncludeQueryDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     */
    public void setIncludeQueryDatetime_IsNotNull() { regIncludeQueryDatetime(CK_ISNN, DOBJ); }

    protected void regIncludeQueryDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIncludeQueryDatetime(), "INCLUDE_QUERY_DATETIME"); }
    protected abstract ConditionValue getCValueIncludeQueryDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteIncludeQueryCB&gt;() {
     *     public void query(WhiteIncludeQueryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteIncludeQueryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteIncludeQueryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteIncludeQueryCB&gt;() {
     *     public void query(WhiteIncludeQueryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteIncludeQueryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteIncludeQueryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteIncludeQueryCB&gt;() {
     *     public void query(WhiteIncludeQueryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteIncludeQueryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteIncludeQueryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteIncludeQueryCB&gt;() {
     *     public void query(WhiteIncludeQueryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteIncludeQueryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteIncludeQueryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteIncludeQueryCB&gt;() {
     *     public void query(WhiteIncludeQueryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteIncludeQueryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteIncludeQueryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteIncludeQueryCB&gt;() {
     *     public void query(WhiteIncludeQueryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteIncludeQueryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteIncludeQueryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteIncludeQueryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteIncludeQueryCQ sq);

    protected WhiteIncludeQueryCB xcreateScalarConditionCB() {
        WhiteIncludeQueryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteIncludeQueryCB xcreateScalarConditionPartitionByCB() {
        WhiteIncludeQueryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteIncludeQueryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteIncludeQueryCB cb = new WhiteIncludeQueryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "INCLUDE_QUERY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteIncludeQueryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteIncludeQueryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteIncludeQueryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteIncludeQueryCB cb = new WhiteIncludeQueryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INCLUDE_QUERY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteIncludeQueryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteIncludeQueryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteIncludeQueryCB cb = new WhiteIncludeQueryCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteIncludeQueryCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteIncludeQueryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteIncludeQueryCB cb = new WhiteIncludeQueryCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteIncludeQueryCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteIncludeQueryCB newMyCB() {
        return new WhiteIncludeQueryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteIncludeQueryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
