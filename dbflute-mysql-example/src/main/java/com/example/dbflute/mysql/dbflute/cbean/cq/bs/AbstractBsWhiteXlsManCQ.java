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
 * The abstract condition-query of white_xls_man.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteXlsManCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteXlsManCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
        return "white_xls_man";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as equal. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_Equal(Long xlsManId) {
        doSetXlsManId_Equal(xlsManId);
    }

    protected void doSetXlsManId_Equal(Long xlsManId) {
        regXlsManId(CK_EQ, xlsManId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_GreaterThan(Long xlsManId) {
        regXlsManId(CK_GT, xlsManId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_LessThan(Long xlsManId) {
        regXlsManId(CK_LT, xlsManId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_GreaterEqual(Long xlsManId) {
        regXlsManId(CK_GE, xlsManId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_LessEqual(Long xlsManId) {
        regXlsManId(CK_LE, xlsManId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of xlsManId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of xlsManId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setXlsManId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueXlsManId(), "XLS_MAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManIdList The collection of xlsManId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setXlsManId_InScope(Collection<Long> xlsManIdList) {
        doSetXlsManId_InScope(xlsManIdList);
    }

    protected void doSetXlsManId_InScope(Collection<Long> xlsManIdList) {
        regINS(CK_INS, cTL(xlsManIdList), getCValueXlsManId(), "XLS_MAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManIdList The collection of xlsManId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setXlsManId_NotInScope(Collection<Long> xlsManIdList) {
        doSetXlsManId_NotInScope(xlsManIdList);
    }

    protected void doSetXlsManId_NotInScope(Collection<Long> xlsManIdList) {
        regINS(CK_NINS, cTL(xlsManIdList), getCValueXlsManId(), "XLS_MAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setXlsManId_IsNull() { regXlsManId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setXlsManId_IsNotNull() { regXlsManId(CK_ISNN, DOBJ); }

    protected void regXlsManId(ConditionKey k, Object v) { regQ(k, v, getCValueXlsManId(), "XLS_MAN_ID"); }
    abstract protected ConditionValue getCValueXlsManId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_Equal(String stringConverted) {
        doSetStringConverted_Equal(fRES(stringConverted));
    }

    protected void doSetStringConverted_Equal(String stringConverted) {
        regStringConverted(CK_EQ, stringConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_NotEqual(String stringConverted) {
        doSetStringConverted_NotEqual(fRES(stringConverted));
    }

    protected void doSetStringConverted_NotEqual(String stringConverted) {
        regStringConverted(CK_NES, stringConverted);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_InScope(Collection<String> stringConvertedList) {
        doSetStringConverted_InScope(stringConvertedList);
    }

    public void doSetStringConverted_InScope(Collection<String> stringConvertedList) {
        regINS(CK_INS, cTL(stringConvertedList), getCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_NotInScope(Collection<String> stringConvertedList) {
        doSetStringConverted_NotInScope(stringConvertedList);
    }

    public void doSetStringConverted_NotInScope(Collection<String> stringConvertedList) {
        regINS(CK_NINS, cTL(stringConvertedList), getCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_PrefixSearch(String stringConverted) {
        setStringConverted_LikeSearch(stringConverted, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)} <br />
     * <pre>e.g. setStringConverted_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringConverted), getCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringConverted), getCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNull() { regStringConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNullOrEmpty() { regStringConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNotNull() { regStringConverted(CK_ISNN, DOBJ); }

    protected void regStringConverted(ConditionKey k, Object v) { regQ(k, v, getCValueStringConverted(), "STRING_CONVERTED"); }
    abstract protected ConditionValue getCValueStringConverted();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as equal. (NullAllowed: if null, no condition)
     */
    public void setTimestampConverted_Equal(java.sql.Timestamp timestampConverted) {
        regTimestampConverted(CK_EQ,  timestampConverted);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampConverted_GreaterThan(java.sql.Timestamp timestampConverted) {
        regTimestampConverted(CK_GT,  timestampConverted);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampConverted_LessThan(java.sql.Timestamp timestampConverted) {
        regTimestampConverted(CK_LT,  timestampConverted);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampConverted_GreaterEqual(java.sql.Timestamp timestampConverted) {
        regTimestampConverted(CK_GE,  timestampConverted);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampConverted_LessEqual(java.sql.Timestamp timestampConverted) {
        regTimestampConverted(CK_LE, timestampConverted);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * <pre>e.g. setTimestampConverted_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampConverted. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampConverted. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTimestampConverted_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTimestampConverted(), "TIMESTAMP_CONVERTED", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of timestampConverted. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of timestampConverted. (NullAllowed: if null, no to-condition)
     */
    public void setTimestampConverted_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTimestampConverted_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     */
    public void setTimestampConverted_IsNull() { regTimestampConverted(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     */
    public void setTimestampConverted_IsNotNull() { regTimestampConverted(CK_ISNN, DOBJ); }

    protected void regTimestampConverted(ConditionKey k, Object v) { regQ(k, v, getCValueTimestampConverted(), "TIMESTAMP_CONVERTED"); }
    abstract protected ConditionValue getCValueTimestampConverted();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteXlsManCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteXlsManCB>(new HpSSQSetupper<WhiteXlsManCB>() {
            public void setup(String function, SubQuery<WhiteXlsManCB> subQuery, HpSSQOption<WhiteXlsManCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteXlsManCB> subQuery, String operand, HpSSQOption<WhiteXlsManCB> option) {
        assertObjectNotNull("subQuery<WhiteXlsManCB>", subQuery);
        WhiteXlsManCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteXlsManCQ subQuery);

    protected WhiteXlsManCB xcreateScalarConditionCB() {
        WhiteXlsManCB cb = new WhiteXlsManCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteXlsManCB xcreateScalarConditionPartitionByCB() {
        WhiteXlsManCB cb = new WhiteXlsManCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteXlsManCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteXlsManCB>", subQuery);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "XLS_MAN_ID", "XLS_MAN_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteXlsManCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteXlsManCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteXlsManCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteXlsManCB>(new HpQDRSetupper<WhiteXlsManCB>() {
            public void setup(String function, SubQuery<WhiteXlsManCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteXlsManCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteXlsManCB>", subQuery);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "XLS_MAN_ID", "XLS_MAN_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteXlsManCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteXlsManCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteXlsManCB>", subQuery);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteXlsManCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteXlsManCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteXlsManCB>", subQuery);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteXlsManCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteXlsManCB.class.getName(); }
    protected String xabCQ() { return WhiteXlsManCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
