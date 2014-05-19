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
 * The abstract condition-query of white_point_type_mapping.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePointTypeMappingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePointTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_point_type_mapping";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as equal. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingId_Equal(Long pointTypeMappingId) {
        doSetPointTypeMappingId_Equal(pointTypeMappingId);
    }

    protected void doSetPointTypeMappingId_Equal(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_EQ, pointTypeMappingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingId_GreaterThan(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_GT, pointTypeMappingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingId_LessThan(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_LT, pointTypeMappingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingId_GreaterEqual(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_GE, pointTypeMappingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingId_LessEqual(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_LE, pointTypeMappingId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pointTypeMappingId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of pointTypeMappingId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPointTypeMappingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingIdList The collection of pointTypeMappingId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPointTypeMappingId_InScope(Collection<Long> pointTypeMappingIdList) {
        doSetPointTypeMappingId_InScope(pointTypeMappingIdList);
    }

    protected void doSetPointTypeMappingId_InScope(Collection<Long> pointTypeMappingIdList) {
        regINS(CK_INS, cTL(pointTypeMappingIdList), getCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingIdList The collection of pointTypeMappingId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPointTypeMappingId_NotInScope(Collection<Long> pointTypeMappingIdList) {
        doSetPointTypeMappingId_NotInScope(pointTypeMappingIdList);
    }

    protected void doSetPointTypeMappingId_NotInScope(Collection<Long> pointTypeMappingIdList) {
        regINS(CK_NINS, cTL(pointTypeMappingIdList), getCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPointTypeMappingId_IsNull() { regPointTypeMappingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPointTypeMappingId_IsNotNull() { regPointTypeMappingId(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID"); }
    protected abstract ConditionValue getCValuePointTypeMappingId();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     */
    public void setPointTypeMappingMemberName_IsNull() { regPointTypeMappingMemberName(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     */
    public void setPointTypeMappingMemberName_IsNotNull() { regPointTypeMappingMemberName(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePointTypeMappingMemberName(), "POINT_TYPE_MAPPING_MEMBER_NAME"); }
    protected abstract ConditionValue getCValuePointTypeMappingMemberName();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     */
    public void setPointTypeMappingPriceCount_IsNull() { regPointTypeMappingPriceCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     */
    public void setPointTypeMappingPriceCount_IsNotNull() { regPointTypeMappingPriceCount(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingPriceCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePointTypeMappingPriceCount(), "POINT_TYPE_MAPPING_PRICE_COUNT"); }
    protected abstract ConditionValue getCValuePointTypeMappingPriceCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as equal. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingSaleDate_Equal(com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_EQ,  pointTypeMappingSaleDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingSaleDate_GreaterThan(com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_GT,  pointTypeMappingSaleDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingSaleDate_LessThan(com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_LT,  pointTypeMappingSaleDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingSaleDate_GreaterEqual(com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_GE,  pointTypeMappingSaleDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingSaleDate_LessEqual(com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_LE, pointTypeMappingSaleDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * <pre>e.g. setPointTypeMappingSaleDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingSaleDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingSaleDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPointTypeMappingSaleDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new com.example.dbflute.mysql.mytype.MySaleDate(fromDatetime.getTime()) : null), (toDatetime != null ? new com.example.dbflute.mysql.mytype.MySaleDate(toDatetime.getTime()) : null), getCValuePointTypeMappingSaleDate(), "POINT_TYPE_MAPPING_SALE_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pointTypeMappingSaleDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of pointTypeMappingSaleDate. (NullAllowed: if null, no to-condition)
     */
    public void setPointTypeMappingSaleDate_DateFromTo(Date fromDate, Date toDate) {
        setPointTypeMappingSaleDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     */
    public void setPointTypeMappingSaleDate_IsNull() { regPointTypeMappingSaleDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     */
    public void setPointTypeMappingSaleDate_IsNotNull() { regPointTypeMappingSaleDate(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingSaleDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePointTypeMappingSaleDate(), "POINT_TYPE_MAPPING_SALE_DATE"); }
    protected abstract ConditionValue getCValuePointTypeMappingSaleDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingWantedDatetime_Equal(java.util.Date pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_EQ,  fCTPD(pointTypeMappingWantedDatetime));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingWantedDatetime_GreaterThan(java.util.Date pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_GT,  fCTPD(pointTypeMappingWantedDatetime));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingWantedDatetime_LessThan(java.util.Date pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_LT,  fCTPD(pointTypeMappingWantedDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingWantedDatetime_GreaterEqual(java.util.Date pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_GE,  fCTPD(pointTypeMappingWantedDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPointTypeMappingWantedDatetime_LessEqual(java.util.Date pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_LE, fCTPD(pointTypeMappingWantedDatetime));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * <pre>e.g. setPointTypeMappingWantedDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingWantedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingWantedDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPointTypeMappingWantedDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValuePointTypeMappingWantedDatetime(), "POINT_TYPE_MAPPING_WANTED_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pointTypeMappingWantedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of pointTypeMappingWantedDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setPointTypeMappingWantedDatetime_DateFromTo(Date fromDate, Date toDate) {
        setPointTypeMappingWantedDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     */
    public void setPointTypeMappingWantedDatetime_IsNull() { regPointTypeMappingWantedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     */
    public void setPointTypeMappingWantedDatetime_IsNotNull() { regPointTypeMappingWantedDatetime(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingWantedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePointTypeMappingWantedDatetime(), "POINT_TYPE_MAPPING_WANTED_DATETIME"); }
    protected abstract ConditionValue getCValuePointTypeMappingWantedDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePointTypeMappingCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhitePointTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePointTypeMappingCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhitePointTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePointTypeMappingCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhitePointTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePointTypeMappingCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhitePointTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePointTypeMappingCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhitePointTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePointTypeMappingCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhitePointTypeMappingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhitePointTypeMappingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhitePointTypeMappingCQ sq);

    protected WhitePointTypeMappingCB xcreateScalarConditionCB() {
        WhitePointTypeMappingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePointTypeMappingCB xcreateScalarConditionPartitionByCB() {
        WhitePointTypeMappingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePointTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "POINT_TYPE_MAPPING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePointTypeMappingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePointTypeMappingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePointTypeMappingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "POINT_TYPE_MAPPING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePointTypeMappingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePointTypeMappingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePointTypeMappingCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePointTypeMappingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhitePointTypeMappingCQ sq);

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
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhitePointTypeMappingCB newMyCB() {
        return new WhitePointTypeMappingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhitePointTypeMappingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
