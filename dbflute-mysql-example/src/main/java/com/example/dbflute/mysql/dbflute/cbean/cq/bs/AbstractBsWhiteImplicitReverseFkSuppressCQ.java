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
 * The abstract condition-query of white_implicit_reverse_fk_suppress.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitReverseFkSuppressCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitReverseFkSuppressCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_reverse_fk_suppress";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as equal. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_Equal(Integer whiteImplicitReverseFkSuppressId) {
        doSetWhiteImplicitReverseFkSuppressId_Equal(whiteImplicitReverseFkSuppressId);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_Equal(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_EQ, whiteImplicitReverseFkSuppressId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_GreaterThan(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_GT, whiteImplicitReverseFkSuppressId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_LessThan(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_LT, whiteImplicitReverseFkSuppressId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_GreaterEqual(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_GE, whiteImplicitReverseFkSuppressId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_LessEqual(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_LE, whiteImplicitReverseFkSuppressId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkSuppressId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of whiteImplicitReverseFkSuppressId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkSuppressId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressIdList The collection of whiteImplicitReverseFkSuppressId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_InScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        doSetWhiteImplicitReverseFkSuppressId_InScope(whiteImplicitReverseFkSuppressIdList);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_InScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkSuppressIdList), getCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressIdList The collection of whiteImplicitReverseFkSuppressId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkSuppressId_NotInScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        doSetWhiteImplicitReverseFkSuppressId_NotInScope(whiteImplicitReverseFkSuppressIdList);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_NotInScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkSuppressIdList), getCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setWhiteImplicitReverseFkSuppressId_IsNull() { regWhiteImplicitReverseFkSuppressId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setWhiteImplicitReverseFkSuppressId_IsNotNull() { regWhiteImplicitReverseFkSuppressId(CK_ISNN, DOBJ); }

    protected void regWhiteImplicitReverseFkSuppressId(ConditionKey k, Object v) { regQ(k, v, getCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID"); }
    abstract protected ConditionValue getCValueWhiteImplicitReverseFkSuppressId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as equal. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_Equal(Integer whiteImplicitReverseFkId) {
        doSetWhiteImplicitReverseFkId_Equal(whiteImplicitReverseFkId);
    }

    protected void doSetWhiteImplicitReverseFkId_Equal(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_EQ, whiteImplicitReverseFkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_GreaterThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GT, whiteImplicitReverseFkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_LessThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LT, whiteImplicitReverseFkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_GreaterEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GE, whiteImplicitReverseFkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_LessEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LE, whiteImplicitReverseFkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of whiteImplicitReverseFkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkId_InScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_InScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_InScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkIdList), getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10)}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_NotInScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkIdList), getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    protected void regWhiteImplicitReverseFkId(ConditionKey k, Object v) { regQ(k, v, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID"); }
    abstract protected ConditionValue getCValueWhiteImplicitReverseFkId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as equal. (NullAllowed: if null, no condition)
     */
    public void setValidBeginDate_Equal(java.util.Date validBeginDate) {
        regValidBeginDate(CK_EQ,  fCTPD(validBeginDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setValidBeginDate_GreaterThan(java.util.Date validBeginDate) {
        regValidBeginDate(CK_GT,  fCTPD(validBeginDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setValidBeginDate_LessThan(java.util.Date validBeginDate) {
        regValidBeginDate(CK_LT,  fCTPD(validBeginDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setValidBeginDate_GreaterEqual(java.util.Date validBeginDate) {
        regValidBeginDate(CK_GE,  fCTPD(validBeginDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setValidBeginDate_LessEqual(java.util.Date validBeginDate) {
        regValidBeginDate(CK_LE, fCTPD(validBeginDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * <pre>e.g. setValidBeginDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setValidBeginDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueValidBeginDate(), "VALID_BEGIN_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of validBeginDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of validBeginDate. (NullAllowed: if null, no to-condition)
     */
    public void setValidBeginDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setValidBeginDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regValidBeginDate(ConditionKey k, Object v) { regQ(k, v, getCValueValidBeginDate(), "VALID_BEGIN_DATE"); }
    abstract protected ConditionValue getCValueValidBeginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as equal. (NullAllowed: if null, no condition)
     */
    public void setValidEndDate_Equal(java.util.Date validEndDate) {
        regValidEndDate(CK_EQ,  fCTPD(validEndDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setValidEndDate_GreaterThan(java.util.Date validEndDate) {
        regValidEndDate(CK_GT,  fCTPD(validEndDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setValidEndDate_LessThan(java.util.Date validEndDate) {
        regValidEndDate(CK_LT,  fCTPD(validEndDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setValidEndDate_GreaterEqual(java.util.Date validEndDate) {
        regValidEndDate(CK_GE,  fCTPD(validEndDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setValidEndDate_LessEqual(java.util.Date validEndDate) {
        regValidEndDate(CK_LE, fCTPD(validEndDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setValidEndDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setValidEndDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueValidEndDate(), "VALID_END_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of validEndDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of validEndDate. (NullAllowed: if null, no to-condition)
     */
    public void setValidEndDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setValidEndDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regValidEndDate(ConditionKey k, Object v) { regQ(k, v, getCValueValidEndDate(), "VALID_END_DATE"); }
    abstract protected ConditionValue getCValueValidEndDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkSuppressCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkSuppressCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkSuppressCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkSuppressCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkSuppressCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkSuppressCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteImplicitReverseFkSuppressCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteImplicitReverseFkSuppressCB>(new HpSSQSetupper<WhiteImplicitReverseFkSuppressCB>() {
            public void setup(String function, SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery, HpSSQOption<WhiteImplicitReverseFkSuppressCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery, String operand, HpSSQOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkSuppressCB>", subQuery);
        WhiteImplicitReverseFkSuppressCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteImplicitReverseFkSuppressCQ subQuery);

    protected WhiteImplicitReverseFkSuppressCB xcreateScalarConditionCB() {
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteImplicitReverseFkSuppressCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkSuppressCB>", subQuery);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitReverseFkSuppressCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitReverseFkSuppressCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteImplicitReverseFkSuppressCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteImplicitReverseFkSuppressCB>(new HpQDRSetupper<WhiteImplicitReverseFkSuppressCB>() {
            public void setup(String function, SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkSuppressCB>", subQuery);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitReverseFkSuppressCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkSuppressCB>", subQuery);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteImplicitReverseFkSuppressCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitReverseFkSuppressCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkSuppressCB>", subQuery);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteImplicitReverseFkSuppressCQ subQuery);

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
    protected String xabCB() { return WhiteImplicitReverseFkSuppressCB.class.getName(); }
    protected String xabCQ() { return WhiteImplicitReverseFkSuppressCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
