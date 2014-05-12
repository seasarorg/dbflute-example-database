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
 * The abstract condition-query of white_date_adjustment.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDateAdjustmentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDateAdjustmentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_date_adjustment";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as equal. (NullAllowed: if null, no condition)
     */
    public void setDateAdjustmentId_Equal(Long dateAdjustmentId) {
        doSetDateAdjustmentId_Equal(dateAdjustmentId);
    }

    protected void doSetDateAdjustmentId_Equal(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_EQ, dateAdjustmentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDateAdjustmentId_GreaterThan(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_GT, dateAdjustmentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDateAdjustmentId_LessThan(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_LT, dateAdjustmentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDateAdjustmentId_GreaterEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_GE, dateAdjustmentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDateAdjustmentId_LessEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_LE, dateAdjustmentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of dateAdjustmentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of dateAdjustmentId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDateAdjustmentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentIdList The collection of dateAdjustmentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateAdjustmentId_InScope(Collection<Long> dateAdjustmentIdList) {
        doSetDateAdjustmentId_InScope(dateAdjustmentIdList);
    }

    protected void doSetDateAdjustmentId_InScope(Collection<Long> dateAdjustmentIdList) {
        regINS(CK_INS, cTL(dateAdjustmentIdList), getCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentIdList The collection of dateAdjustmentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateAdjustmentId_NotInScope(Collection<Long> dateAdjustmentIdList) {
        doSetDateAdjustmentId_NotInScope(dateAdjustmentIdList);
    }

    protected void doSetDateAdjustmentId_NotInScope(Collection<Long> dateAdjustmentIdList) {
        regINS(CK_NINS, cTL(dateAdjustmentIdList), getCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDateAdjustmentId_IsNull() { regDateAdjustmentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDateAdjustmentId_IsNotNull() { regDateAdjustmentId(CK_ISNN, DOBJ); }

    protected void regDateAdjustmentId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID"); }
    protected abstract ConditionValue getCValueDateAdjustmentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDate_Equal(java.util.Date adjustedDate) {
        regAdjustedDate(CK_EQ,  fCTPD(adjustedDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDate_GreaterThan(java.util.Date adjustedDate) {
        regAdjustedDate(CK_GT,  fCTPD(adjustedDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDate_LessThan(java.util.Date adjustedDate) {
        regAdjustedDate(CK_LT,  fCTPD(adjustedDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDate_GreaterEqual(java.util.Date adjustedDate) {
        regAdjustedDate(CK_GE,  fCTPD(adjustedDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDate_LessEqual(java.util.Date adjustedDate) {
        regAdjustedDate(CK_LE, fCTPD(adjustedDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * <pre>e.g. setAdjustedDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAdjustedDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueAdjustedDate(), "ADJUSTED_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of adjustedDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of adjustedDate. (NullAllowed: if null, no to-condition)
     */
    public void setAdjustedDate_DateFromTo(Date fromDate, Date toDate) {
        setAdjustedDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     */
    public void setAdjustedDate_IsNull() { regAdjustedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     */
    public void setAdjustedDate_IsNotNull() { regAdjustedDate(CK_ISNN, DOBJ); }

    protected void regAdjustedDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedDate(), "ADJUSTED_DATE"); }
    protected abstract ConditionValue getCValueAdjustedDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDatetime_Equal(java.sql.Timestamp adjustedDatetime) {
        regAdjustedDatetime(CK_EQ,  adjustedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDatetime_GreaterThan(java.sql.Timestamp adjustedDatetime) {
        regAdjustedDatetime(CK_GT,  adjustedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDatetime_LessThan(java.sql.Timestamp adjustedDatetime) {
        regAdjustedDatetime(CK_LT,  adjustedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDatetime_GreaterEqual(java.sql.Timestamp adjustedDatetime) {
        regAdjustedDatetime(CK_GE,  adjustedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedDatetime_LessEqual(java.sql.Timestamp adjustedDatetime) {
        regAdjustedDatetime(CK_LE, adjustedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * <pre>e.g. setAdjustedDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAdjustedDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueAdjustedDatetime(), "ADJUSTED_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of adjustedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of adjustedDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setAdjustedDatetime_DateFromTo(Date fromDate, Date toDate) {
        setAdjustedDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     */
    public void setAdjustedDatetime_IsNull() { regAdjustedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     */
    public void setAdjustedDatetime_IsNotNull() { regAdjustedDatetime(CK_ISNN, DOBJ); }

    protected void regAdjustedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedDatetime(), "ADJUSTED_DATETIME"); }
    protected abstract ConditionValue getCValueAdjustedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedTime_Equal(java.sql.Time adjustedTime) {
        regAdjustedTime(CK_EQ,  adjustedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedTime_GreaterThan(java.sql.Time adjustedTime) {
        regAdjustedTime(CK_GT,  adjustedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedTime_LessThan(java.sql.Time adjustedTime) {
        regAdjustedTime(CK_LT,  adjustedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedTime_GreaterEqual(java.sql.Time adjustedTime) {
        regAdjustedTime(CK_GE,  adjustedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedTime_LessEqual(java.sql.Time adjustedTime) {
        regAdjustedTime(CK_LE, adjustedTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     */
    public void setAdjustedTime_IsNull() { regAdjustedTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_TIME: {TIME(8)}
     */
    public void setAdjustedTime_IsNotNull() { regAdjustedTime(CK_ISNN, DOBJ); }

    protected void regAdjustedTime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedTime(), "ADJUSTED_TIME"); }
    protected abstract ConditionValue getCValueAdjustedTime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedInteger_Equal(Integer adjustedInteger) {
        doSetAdjustedInteger_Equal(adjustedInteger);
    }

    protected void doSetAdjustedInteger_Equal(Integer adjustedInteger) {
        regAdjustedInteger(CK_EQ, adjustedInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedInteger_GreaterThan(Integer adjustedInteger) {
        regAdjustedInteger(CK_GT, adjustedInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedInteger_LessThan(Integer adjustedInteger) {
        regAdjustedInteger(CK_LT, adjustedInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedInteger_GreaterEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_GE, adjustedInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedInteger_LessEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_LE, adjustedInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param minNumber The min number of adjustedInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of adjustedInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAdjustedInteger(), "ADJUSTED_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedIntegerList The collection of adjustedInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedInteger_InScope(Collection<Integer> adjustedIntegerList) {
        doSetAdjustedInteger_InScope(adjustedIntegerList);
    }

    protected void doSetAdjustedInteger_InScope(Collection<Integer> adjustedIntegerList) {
        regINS(CK_INS, cTL(adjustedIntegerList), getCValueAdjustedInteger(), "ADJUSTED_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedIntegerList The collection of adjustedInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedInteger_NotInScope(Collection<Integer> adjustedIntegerList) {
        doSetAdjustedInteger_NotInScope(adjustedIntegerList);
    }

    protected void doSetAdjustedInteger_NotInScope(Collection<Integer> adjustedIntegerList) {
        regINS(CK_NINS, cTL(adjustedIntegerList), getCValueAdjustedInteger(), "ADJUSTED_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     */
    public void setAdjustedInteger_IsNull() { regAdjustedInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     */
    public void setAdjustedInteger_IsNotNull() { regAdjustedInteger(CK_ISNN, DOBJ); }

    protected void regAdjustedInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedInteger(), "ADJUSTED_INTEGER"); }
    protected abstract ConditionValue getCValueAdjustedInteger();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedStringLong_Equal(Long adjustedNamedStringLong) {
        doSetAdjustedNamedStringLong_Equal(adjustedNamedStringLong);
    }

    protected void doSetAdjustedNamedStringLong_Equal(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_EQ, adjustedNamedStringLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedStringLong_GreaterThan(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_GT, adjustedNamedStringLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedStringLong_LessThan(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_LT, adjustedNamedStringLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedStringLong_GreaterEqual(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_GE, adjustedNamedStringLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedStringLong_LessEqual(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_LE, adjustedNamedStringLong);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedNamedStringLong. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of adjustedNamedStringLong. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedNamedStringLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLongList The collection of adjustedNamedStringLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedNamedStringLong_InScope(Collection<Long> adjustedNamedStringLongList) {
        doSetAdjustedNamedStringLong_InScope(adjustedNamedStringLongList);
    }

    protected void doSetAdjustedNamedStringLong_InScope(Collection<Long> adjustedNamedStringLongList) {
        regINS(CK_INS, cTL(adjustedNamedStringLongList), getCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLongList The collection of adjustedNamedStringLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedNamedStringLong_NotInScope(Collection<Long> adjustedNamedStringLongList) {
        doSetAdjustedNamedStringLong_NotInScope(adjustedNamedStringLongList);
    }

    protected void doSetAdjustedNamedStringLong_NotInScope(Collection<Long> adjustedNamedStringLongList) {
        regINS(CK_NINS, cTL(adjustedNamedStringLongList), getCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedStringLong_IsNull() { regAdjustedNamedStringLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedStringLong_IsNotNull() { regAdjustedNamedStringLong(CK_ISNN, DOBJ); }

    protected void regAdjustedNamedStringLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG"); }
    protected abstract ConditionValue getCValueAdjustedNamedStringLong();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedTypedLong_Equal(Long adjustedNamedTypedLong) {
        doSetAdjustedNamedTypedLong_Equal(adjustedNamedTypedLong);
    }

    protected void doSetAdjustedNamedTypedLong_Equal(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_EQ, adjustedNamedTypedLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedTypedLong_GreaterThan(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_GT, adjustedNamedTypedLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedTypedLong_LessThan(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_LT, adjustedNamedTypedLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedTypedLong_GreaterEqual(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_GE, adjustedNamedTypedLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedNamedTypedLong_LessEqual(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_LE, adjustedNamedTypedLong);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedNamedTypedLong. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of adjustedNamedTypedLong. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedNamedTypedLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLongList The collection of adjustedNamedTypedLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedNamedTypedLong_InScope(Collection<Long> adjustedNamedTypedLongList) {
        doSetAdjustedNamedTypedLong_InScope(adjustedNamedTypedLongList);
    }

    protected void doSetAdjustedNamedTypedLong_InScope(Collection<Long> adjustedNamedTypedLongList) {
        regINS(CK_INS, cTL(adjustedNamedTypedLongList), getCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLongList The collection of adjustedNamedTypedLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedNamedTypedLong_NotInScope(Collection<Long> adjustedNamedTypedLongList) {
        doSetAdjustedNamedTypedLong_NotInScope(adjustedNamedTypedLongList);
    }

    protected void doSetAdjustedNamedTypedLong_NotInScope(Collection<Long> adjustedNamedTypedLongList) {
        regINS(CK_NINS, cTL(adjustedNamedTypedLongList), getCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedTypedLong_IsNull() { regAdjustedNamedTypedLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedTypedLong_IsNotNull() { regAdjustedNamedTypedLong(CK_ISNN, DOBJ); }

    protected void regAdjustedNamedTypedLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG"); }
    protected abstract ConditionValue getCValueAdjustedNamedTypedLong();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointStringLong_Equal(Long adjustedPinpointStringLong) {
        doSetAdjustedPinpointStringLong_Equal(adjustedPinpointStringLong);
    }

    protected void doSetAdjustedPinpointStringLong_Equal(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_EQ, adjustedPinpointStringLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointStringLong_GreaterThan(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_GT, adjustedPinpointStringLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointStringLong_LessThan(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_LT, adjustedPinpointStringLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointStringLong_GreaterEqual(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_GE, adjustedPinpointStringLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointStringLong_LessEqual(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_LE, adjustedPinpointStringLong);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPinpointStringLong. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of adjustedPinpointStringLong. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedPinpointStringLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLongList The collection of adjustedPinpointStringLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedPinpointStringLong_InScope(Collection<Long> adjustedPinpointStringLongList) {
        doSetAdjustedPinpointStringLong_InScope(adjustedPinpointStringLongList);
    }

    protected void doSetAdjustedPinpointStringLong_InScope(Collection<Long> adjustedPinpointStringLongList) {
        regINS(CK_INS, cTL(adjustedPinpointStringLongList), getCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLongList The collection of adjustedPinpointStringLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedPinpointStringLong_NotInScope(Collection<Long> adjustedPinpointStringLongList) {
        doSetAdjustedPinpointStringLong_NotInScope(adjustedPinpointStringLongList);
    }

    protected void doSetAdjustedPinpointStringLong_NotInScope(Collection<Long> adjustedPinpointStringLongList) {
        regINS(CK_NINS, cTL(adjustedPinpointStringLongList), getCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointStringLong_IsNull() { regAdjustedPinpointStringLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointStringLong_IsNotNull() { regAdjustedPinpointStringLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPinpointStringLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG"); }
    protected abstract ConditionValue getCValueAdjustedPinpointStringLong();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointTypedLong_Equal(Long adjustedPinpointTypedLong) {
        doSetAdjustedPinpointTypedLong_Equal(adjustedPinpointTypedLong);
    }

    protected void doSetAdjustedPinpointTypedLong_Equal(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_EQ, adjustedPinpointTypedLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointTypedLong_GreaterThan(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_GT, adjustedPinpointTypedLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointTypedLong_LessThan(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_LT, adjustedPinpointTypedLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointTypedLong_GreaterEqual(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_GE, adjustedPinpointTypedLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPinpointTypedLong_LessEqual(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_LE, adjustedPinpointTypedLong);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPinpointTypedLong. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of adjustedPinpointTypedLong. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedPinpointTypedLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLongList The collection of adjustedPinpointTypedLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedPinpointTypedLong_InScope(Collection<Long> adjustedPinpointTypedLongList) {
        doSetAdjustedPinpointTypedLong_InScope(adjustedPinpointTypedLongList);
    }

    protected void doSetAdjustedPinpointTypedLong_InScope(Collection<Long> adjustedPinpointTypedLongList) {
        regINS(CK_INS, cTL(adjustedPinpointTypedLongList), getCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLongList The collection of adjustedPinpointTypedLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedPinpointTypedLong_NotInScope(Collection<Long> adjustedPinpointTypedLongList) {
        doSetAdjustedPinpointTypedLong_NotInScope(adjustedPinpointTypedLongList);
    }

    protected void doSetAdjustedPinpointTypedLong_NotInScope(Collection<Long> adjustedPinpointTypedLongList) {
        regINS(CK_NINS, cTL(adjustedPinpointTypedLongList), getCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointTypedLong_IsNull() { regAdjustedPinpointTypedLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointTypedLong_IsNotNull() { regAdjustedPinpointTypedLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPinpointTypedLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG"); }
    protected abstract ConditionValue getCValueAdjustedPinpointTypedLong();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as equal. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPlainLong_Equal(Long adjustedPlainLong) {
        doSetAdjustedPlainLong_Equal(adjustedPlainLong);
    }

    protected void doSetAdjustedPlainLong_Equal(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_EQ, adjustedPlainLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPlainLong_GreaterThan(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_GT, adjustedPlainLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPlainLong_LessThan(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_LT, adjustedPlainLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPlainLong_GreaterEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_GE, adjustedPlainLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAdjustedPlainLong_LessEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_LE, adjustedPlainLong);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPlainLong. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of adjustedPlainLong. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedPlainLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLongList The collection of adjustedPlainLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedPlainLong_InScope(Collection<Long> adjustedPlainLongList) {
        doSetAdjustedPlainLong_InScope(adjustedPlainLongList);
    }

    protected void doSetAdjustedPlainLong_InScope(Collection<Long> adjustedPlainLongList) {
        regINS(CK_INS, cTL(adjustedPlainLongList), getCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLongList The collection of adjustedPlainLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedPlainLong_NotInScope(Collection<Long> adjustedPlainLongList) {
        doSetAdjustedPlainLong_NotInScope(adjustedPlainLongList);
    }

    protected void doSetAdjustedPlainLong_NotInScope(Collection<Long> adjustedPlainLongList) {
        regINS(CK_NINS, cTL(adjustedPlainLongList), getCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     */
    public void setAdjustedPlainLong_IsNull() { regAdjustedPlainLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     */
    public void setAdjustedPlainLong_IsNotNull() { regAdjustedPlainLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPlainLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG"); }
    protected abstract ConditionValue getCValueAdjustedPlainLong();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedString_Equal(String adjustedString) {
        doSetAdjustedString_Equal(fRES(adjustedString));
    }

    protected void doSetAdjustedString_Equal(String adjustedString) {
        regAdjustedString(CK_EQ, adjustedString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedString_NotEqual(String adjustedString) {
        doSetAdjustedString_NotEqual(fRES(adjustedString));
    }

    protected void doSetAdjustedString_NotEqual(String adjustedString) {
        regAdjustedString(CK_NES, adjustedString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedStringList The collection of adjustedString as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedString_InScope(Collection<String> adjustedStringList) {
        doSetAdjustedString_InScope(adjustedStringList);
    }

    public void doSetAdjustedString_InScope(Collection<String> adjustedStringList) {
        regINS(CK_INS, cTL(adjustedStringList), getCValueAdjustedString(), "ADJUSTED_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedStringList The collection of adjustedString as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedString_NotInScope(Collection<String> adjustedStringList) {
        doSetAdjustedString_NotInScope(adjustedStringList);
    }

    public void doSetAdjustedString_NotInScope(Collection<String> adjustedStringList) {
        regINS(CK_NINS, cTL(adjustedStringList), getCValueAdjustedString(), "ADJUSTED_STRING");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setAdjustedString_PrefixSearch(String adjustedString) {
        setAdjustedString_LikeSearch(adjustedString, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)} <br />
     * <pre>e.g. setAdjustedString_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adjustedString The value of adjustedString as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdjustedString_LikeSearch(String adjustedString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adjustedString), getCValueAdjustedString(), "ADJUSTED_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdjustedString_NotLikeSearch(String adjustedString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adjustedString), getCValueAdjustedString(), "ADJUSTED_STRING", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     */
    public void setAdjustedString_IsNull() { regAdjustedString(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     */
    public void setAdjustedString_IsNullOrEmpty() { regAdjustedString(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     */
    public void setAdjustedString_IsNotNull() { regAdjustedString(CK_ISNN, DOBJ); }

    protected void regAdjustedString(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAdjustedString(), "ADJUSTED_STRING"); }
    protected abstract ConditionValue getCValueAdjustedString();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateAdjustmentCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateAdjustmentCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateAdjustmentCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateAdjustmentCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateAdjustmentCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateAdjustmentCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteDateAdjustmentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateAdjustmentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteDateAdjustmentCQ sq);

    protected WhiteDateAdjustmentCB xcreateScalarConditionCB() {
        WhiteDateAdjustmentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDateAdjustmentCB xcreateScalarConditionPartitionByCB() {
        WhiteDateAdjustmentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDateAdjustmentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "DATE_ADJUSTMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDateAdjustmentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDateAdjustmentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDateAdjustmentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATE_ADJUSTMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDateAdjustmentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDateAdjustmentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDateAdjustmentCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteDateAdjustmentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteDateAdjustmentCQ sq);

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
    protected WhiteDateAdjustmentCB newMyCB() {
        return new WhiteDateAdjustmentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteDateAdjustmentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
