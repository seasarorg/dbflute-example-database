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
 * The abstract condition-query of white_compound_pk_ref_many.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefManyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefManyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref_many";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_Equal(Integer multipleFirstId) {
        doSetMultipleFirstId_Equal(multipleFirstId);
    }

    protected void doSetMultipleFirstId_Equal(Integer multipleFirstId) {
        regMultipleFirstId(CK_EQ, multipleFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_GT, multipleFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_LT, multipleFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_GE, multipleFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_LE, multipleFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_InScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_INS, cTL(multipleFirstIdList), getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_NotInScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_NINS, cTL(multipleFirstIdList), getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleFirstId_IsNull() { regMultipleFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleFirstId_IsNotNull() { regMultipleFirstId(CK_ISNN, DOBJ); }

    protected void regMultipleFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID"); }
    protected abstract ConditionValue getCValueMultipleFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_Equal(Integer multipleSecondId) {
        doSetMultipleSecondId_Equal(multipleSecondId);
    }

    protected void doSetMultipleSecondId_Equal(Integer multipleSecondId) {
        regMultipleSecondId(CK_EQ, multipleSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_GT, multipleSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_LT, multipleSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_GE, multipleSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_LE, multipleSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_InScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_INS, cTL(multipleSecondIdList), getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_NotInScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_NINS, cTL(multipleSecondIdList), getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleSecondId_IsNull() { regMultipleSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleSecondId_IsNotNull() { regMultipleSecondId(CK_ISNN, DOBJ); }

    protected void regMultipleSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID"); }
    protected abstract ConditionValue getCValueMultipleSecondId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstId The value of refManyFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefManyFirstId_Equal(Integer refManyFirstId) {
        doSetRefManyFirstId_Equal(refManyFirstId);
    }

    protected void doSetRefManyFirstId_Equal(Integer refManyFirstId) {
        regRefManyFirstId(CK_EQ, refManyFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstId The value of refManyFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefManyFirstId_GreaterThan(Integer refManyFirstId) {
        regRefManyFirstId(CK_GT, refManyFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstId The value of refManyFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefManyFirstId_LessThan(Integer refManyFirstId) {
        regRefManyFirstId(CK_LT, refManyFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstId The value of refManyFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefManyFirstId_GreaterEqual(Integer refManyFirstId) {
        regRefManyFirstId(CK_GE, refManyFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstId The value of refManyFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefManyFirstId_LessEqual(Integer refManyFirstId) {
        regRefManyFirstId(CK_LE, refManyFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param minNumber The min number of refManyFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refManyFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefManyFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefManyFirstId(), "REF_MANY_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstIdList The collection of refManyFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyFirstId_InScope(Collection<Integer> refManyFirstIdList) {
        doSetRefManyFirstId_InScope(refManyFirstIdList);
    }

    protected void doSetRefManyFirstId_InScope(Collection<Integer> refManyFirstIdList) {
        regINS(CK_INS, cTL(refManyFirstIdList), getCValueRefManyFirstId(), "REF_MANY_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManyFirstIdList The collection of refManyFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyFirstId_NotInScope(Collection<Integer> refManyFirstIdList) {
        doSetRefManyFirstId_NotInScope(refManyFirstIdList);
    }

    protected void doSetRefManyFirstId_NotInScope(Collection<Integer> refManyFirstIdList) {
        regINS(CK_NINS, cTL(refManyFirstIdList), getCValueRefManyFirstId(), "REF_MANY_FIRST_ID");
    }

    protected void regRefManyFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefManyFirstId(), "REF_MANY_FIRST_ID"); }
    protected abstract ConditionValue getCValueRefManyFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondId The value of refManySecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefManySecondId_Equal(Integer refManySecondId) {
        doSetRefManySecondId_Equal(refManySecondId);
    }

    protected void doSetRefManySecondId_Equal(Integer refManySecondId) {
        regRefManySecondId(CK_EQ, refManySecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondId The value of refManySecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefManySecondId_GreaterThan(Integer refManySecondId) {
        regRefManySecondId(CK_GT, refManySecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondId The value of refManySecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefManySecondId_LessThan(Integer refManySecondId) {
        regRefManySecondId(CK_LT, refManySecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondId The value of refManySecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefManySecondId_GreaterEqual(Integer refManySecondId) {
        regRefManySecondId(CK_GE, refManySecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondId The value of refManySecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefManySecondId_LessEqual(Integer refManySecondId) {
        regRefManySecondId(CK_LE, refManySecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param minNumber The min number of refManySecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refManySecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefManySecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefManySecondId(), "REF_MANY_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondIdList The collection of refManySecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManySecondId_InScope(Collection<Integer> refManySecondIdList) {
        doSetRefManySecondId_InScope(refManySecondIdList);
    }

    protected void doSetRefManySecondId_InScope(Collection<Integer> refManySecondIdList) {
        regINS(CK_INS, cTL(refManySecondIdList), getCValueRefManySecondId(), "REF_MANY_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @param refManySecondIdList The collection of refManySecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManySecondId_NotInScope(Collection<Integer> refManySecondIdList) {
        doSetRefManySecondId_NotInScope(refManySecondIdList);
    }

    protected void doSetRefManySecondId_NotInScope(Collection<Integer> refManySecondIdList) {
        regINS(CK_NINS, cTL(refManySecondIdList), getCValueRefManySecondId(), "REF_MANY_SECOND_ID");
    }

    protected void regRefManySecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefManySecondId(), "REF_MANY_SECOND_ID"); }
    protected abstract ConditionValue getCValueRefManySecondId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @param refManyCode The value of refManyCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyCode_Equal(String refManyCode) {
        doSetRefManyCode_Equal(fRES(refManyCode));
    }

    protected void doSetRefManyCode_Equal(String refManyCode) {
        regRefManyCode(CK_EQ, refManyCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @param refManyCode The value of refManyCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyCode_NotEqual(String refManyCode) {
        doSetRefManyCode_NotEqual(fRES(refManyCode));
    }

    protected void doSetRefManyCode_NotEqual(String refManyCode) {
        regRefManyCode(CK_NES, refManyCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @param refManyCodeList The collection of refManyCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyCode_InScope(Collection<String> refManyCodeList) {
        doSetRefManyCode_InScope(refManyCodeList);
    }

    public void doSetRefManyCode_InScope(Collection<String> refManyCodeList) {
        regINS(CK_INS, cTL(refManyCodeList), getCValueRefManyCode(), "REF_MANY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @param refManyCodeList The collection of refManyCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyCode_NotInScope(Collection<String> refManyCodeList) {
        doSetRefManyCode_NotInScope(refManyCodeList);
    }

    public void doSetRefManyCode_NotInScope(Collection<String> refManyCodeList) {
        regINS(CK_NINS, cTL(refManyCodeList), getCValueRefManyCode(), "REF_MANY_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @param refManyCode The value of refManyCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyCode_PrefixSearch(String refManyCode) {
        setRefManyCode_LikeSearch(refManyCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setRefManyCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refManyCode The value of refManyCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefManyCode_LikeSearch(String refManyCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refManyCode), getCValueRefManyCode(), "REF_MANY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @param refManyCode The value of refManyCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefManyCode_NotLikeSearch(String refManyCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refManyCode), getCValueRefManyCode(), "REF_MANY_CODE", likeSearchOption);
    }

    protected void regRefManyCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefManyCode(), "REF_MANY_CODE"); }
    protected abstract ConditionValue getCValueRefManyCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @param refManyName The value of refManyName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyName_Equal(String refManyName) {
        doSetRefManyName_Equal(fRES(refManyName));
    }

    protected void doSetRefManyName_Equal(String refManyName) {
        regRefManyName(CK_EQ, refManyName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @param refManyName The value of refManyName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyName_NotEqual(String refManyName) {
        doSetRefManyName_NotEqual(fRES(refManyName));
    }

    protected void doSetRefManyName_NotEqual(String refManyName) {
        regRefManyName(CK_NES, refManyName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @param refManyNameList The collection of refManyName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyName_InScope(Collection<String> refManyNameList) {
        doSetRefManyName_InScope(refManyNameList);
    }

    public void doSetRefManyName_InScope(Collection<String> refManyNameList) {
        regINS(CK_INS, cTL(refManyNameList), getCValueRefManyName(), "REF_MANY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @param refManyNameList The collection of refManyName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyName_NotInScope(Collection<String> refManyNameList) {
        doSetRefManyName_NotInScope(refManyNameList);
    }

    public void doSetRefManyName_NotInScope(Collection<String> refManyNameList) {
        regINS(CK_NINS, cTL(refManyNameList), getCValueRefManyName(), "REF_MANY_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @param refManyName The value of refManyName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefManyName_PrefixSearch(String refManyName) {
        setRefManyName_LikeSearch(refManyName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setRefManyName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refManyName The value of refManyName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefManyName_LikeSearch(String refManyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refManyName), getCValueRefManyName(), "REF_MANY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @param refManyName The value of refManyName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefManyName_NotLikeSearch(String refManyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refManyName), getCValueRefManyName(), "REF_MANY_NAME", likeSearchOption);
    }

    protected void regRefManyName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefManyName(), "REF_MANY_NAME"); }
    protected abstract ConditionValue getCValueRefManyName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @param refManyDatetime The value of refManyDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRefManyDatetime_Equal(java.sql.Timestamp refManyDatetime) {
        regRefManyDatetime(CK_EQ,  refManyDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @param refManyDatetime The value of refManyDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefManyDatetime_GreaterThan(java.sql.Timestamp refManyDatetime) {
        regRefManyDatetime(CK_GT,  refManyDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @param refManyDatetime The value of refManyDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefManyDatetime_LessThan(java.sql.Timestamp refManyDatetime) {
        regRefManyDatetime(CK_LT,  refManyDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @param refManyDatetime The value of refManyDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefManyDatetime_GreaterEqual(java.sql.Timestamp refManyDatetime) {
        regRefManyDatetime(CK_GE,  refManyDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @param refManyDatetime The value of refManyDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefManyDatetime_LessEqual(java.sql.Timestamp refManyDatetime) {
        regRefManyDatetime(CK_LE, refManyDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRefManyDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of refManyDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of refManyDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRefManyDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRefManyDatetime(), "REF_MANY_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of refManyDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of refManyDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setRefManyDatetime_DateFromTo(Date fromDate, Date toDate) {
        setRefManyDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regRefManyDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefManyDatetime(), "REF_MANY_DATETIME"); }
    protected abstract ConditionValue getCValueRefManyDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefManyCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteCompoundPkRefManyCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefManyCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteCompoundPkRefManyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefManyCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteCompoundPkRefManyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefManyCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteCompoundPkRefManyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefManyCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteCompoundPkRefManyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefManyCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteCompoundPkRefManyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefManyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefManyCQ sq);

    protected WhiteCompoundPkRefManyCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefManyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefManyCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefManyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteCompoundPkRefManyCB newMyCB() {
        return new WhiteCompoundPkRefManyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteCompoundPkRefManyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
