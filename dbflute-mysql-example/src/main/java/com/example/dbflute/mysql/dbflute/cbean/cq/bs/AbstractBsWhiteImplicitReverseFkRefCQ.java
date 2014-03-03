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
 * The abstract condition-query of white_implicit_reverse_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitReverseFkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitReverseFkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_reverse_fk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefId The value of whiteImplicitReverseFkRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkRefId_Equal(Integer whiteImplicitReverseFkRefId) {
        doSetWhiteImplicitReverseFkRefId_Equal(whiteImplicitReverseFkRefId);
    }

    protected void doSetWhiteImplicitReverseFkRefId_Equal(Integer whiteImplicitReverseFkRefId) {
        regWhiteImplicitReverseFkRefId(CK_EQ, whiteImplicitReverseFkRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefId The value of whiteImplicitReverseFkRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkRefId_GreaterThan(Integer whiteImplicitReverseFkRefId) {
        regWhiteImplicitReverseFkRefId(CK_GT, whiteImplicitReverseFkRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefId The value of whiteImplicitReverseFkRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkRefId_LessThan(Integer whiteImplicitReverseFkRefId) {
        regWhiteImplicitReverseFkRefId(CK_LT, whiteImplicitReverseFkRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefId The value of whiteImplicitReverseFkRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkRefId_GreaterEqual(Integer whiteImplicitReverseFkRefId) {
        regWhiteImplicitReverseFkRefId(CK_GE, whiteImplicitReverseFkRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefId The value of whiteImplicitReverseFkRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkRefId_LessEqual(Integer whiteImplicitReverseFkRefId) {
        regWhiteImplicitReverseFkRefId(CK_LE, whiteImplicitReverseFkRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of whiteImplicitReverseFkRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkRefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueWhiteImplicitReverseFkRefId(), "WHITE_IMPLICIT_REVERSE_FK_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefIdList The collection of whiteImplicitReverseFkRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkRefId_InScope(Collection<Integer> whiteImplicitReverseFkRefIdList) {
        doSetWhiteImplicitReverseFkRefId_InScope(whiteImplicitReverseFkRefIdList);
    }

    protected void doSetWhiteImplicitReverseFkRefId_InScope(Collection<Integer> whiteImplicitReverseFkRefIdList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkRefIdList), getCValueWhiteImplicitReverseFkRefId(), "WHITE_IMPLICIT_REVERSE_FK_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkRefIdList The collection of whiteImplicitReverseFkRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkRefId_NotInScope(Collection<Integer> whiteImplicitReverseFkRefIdList) {
        doSetWhiteImplicitReverseFkRefId_NotInScope(whiteImplicitReverseFkRefIdList);
    }

    protected void doSetWhiteImplicitReverseFkRefId_NotInScope(Collection<Integer> whiteImplicitReverseFkRefIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkRefIdList), getCValueWhiteImplicitReverseFkRefId(), "WHITE_IMPLICIT_REVERSE_FK_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setWhiteImplicitReverseFkRefId_IsNull() { regWhiteImplicitReverseFkRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setWhiteImplicitReverseFkRefId_IsNotNull() { regWhiteImplicitReverseFkRefId(CK_ISNN, DOBJ); }

    protected void regWhiteImplicitReverseFkRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWhiteImplicitReverseFkRefId(), "WHITE_IMPLICIT_REVERSE_FK_REF_ID"); }
    protected abstract ConditionValue getCValueWhiteImplicitReverseFkRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
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
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_GreaterThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GT, whiteImplicitReverseFkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_LessThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LT, whiteImplicitReverseFkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_GreaterEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GE, whiteImplicitReverseFkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_LessEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LE, whiteImplicitReverseFkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @param minNumber The min number of whiteImplicitReverseFkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of whiteImplicitReverseFkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
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
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_NotInScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkIdList), getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk where ...)} <br />
     * white_implicit_reverse_fk by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFk'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteImplicitReverseFk for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitReverseFk(SubQuery<WhiteImplicitReverseFkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFk(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFk");
    }
    public abstract String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFk(WhiteImplicitReverseFkCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk where ...)} <br />
     * white_implicit_reverse_fk by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFk'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteImplicitReverseFk for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitReverseFk(SubQuery<WhiteImplicitReverseFkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFk(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFk");
    }
    public abstract String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFk(WhiteImplicitReverseFkCQ sq);

    protected void regWhiteImplicitReverseFkId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID"); }
    protected abstract ConditionValue getCValueWhiteImplicitReverseFkId();

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
    public void setValidBeginDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
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
    public void setValidBeginDate_DateFromTo(Date fromDate, Date toDate) {
        setValidBeginDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regValidBeginDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueValidBeginDate(), "VALID_BEGIN_DATE"); }
    protected abstract ConditionValue getCValueValidBeginDate();

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
    public void setValidEndDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
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
    public void setValidEndDate_DateFromTo(Date fromDate, Date toDate) {
        setValidEndDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regValidEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueValidEndDate(), "VALID_END_DATE"); }
    protected abstract ConditionValue getCValueValidEndDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteImplicitReverseFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteImplicitReverseFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteImplicitReverseFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteImplicitReverseFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteImplicitReverseFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteImplicitReverseFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitReverseFkRefCQ sq);

    protected WhiteImplicitReverseFkRefCB xcreateScalarConditionCB() {
        WhiteImplicitReverseFkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitReverseFkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitReverseFkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitReverseFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "WHITE_IMPLICIT_REVERSE_FK_REF_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitReverseFkRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitReverseFkRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitReverseFkRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WHITE_IMPLICIT_REVERSE_FK_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitReverseFkRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitReverseFkRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteImplicitReverseFkRefCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteImplicitReverseFkRefCB newMyCB() {
        return new WhiteImplicitReverseFkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteImplicitReverseFkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
