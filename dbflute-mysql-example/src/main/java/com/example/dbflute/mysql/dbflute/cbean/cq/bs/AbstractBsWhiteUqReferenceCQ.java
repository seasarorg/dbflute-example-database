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
 * The abstract condition-query of white_uq_reference.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqReferenceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqReferenceCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_reference";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceId The value of uqReferenceId as equal. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceId_Equal(Long uqReferenceId) {
        doSetUqReferenceId_Equal(uqReferenceId);
    }

    protected void doSetUqReferenceId_Equal(Long uqReferenceId) {
        regUqReferenceId(CK_EQ, uqReferenceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceId The value of uqReferenceId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceId_GreaterThan(Long uqReferenceId) {
        regUqReferenceId(CK_GT, uqReferenceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceId The value of uqReferenceId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceId_LessThan(Long uqReferenceId) {
        regUqReferenceId(CK_LT, uqReferenceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceId The value of uqReferenceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceId_GreaterEqual(Long uqReferenceId) {
        regUqReferenceId(CK_GE, uqReferenceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceId The value of uqReferenceId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceId_LessEqual(Long uqReferenceId) {
        regUqReferenceId(CK_LE, uqReferenceId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqReferenceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqReferenceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqReferenceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqReferenceId(), "UQ_REFERENCE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceIdList The collection of uqReferenceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceId_InScope(Collection<Long> uqReferenceIdList) {
        doSetUqReferenceId_InScope(uqReferenceIdList);
    }

    protected void doSetUqReferenceId_InScope(Collection<Long> uqReferenceIdList) {
        regINS(CK_INS, cTL(uqReferenceIdList), getCValueUqReferenceId(), "UQ_REFERENCE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceIdList The collection of uqReferenceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceId_NotInScope(Collection<Long> uqReferenceIdList) {
        doSetUqReferenceId_NotInScope(uqReferenceIdList);
    }

    protected void doSetUqReferenceId_NotInScope(Collection<Long> uqReferenceIdList) {
        regINS(CK_NINS, cTL(uqReferenceIdList), getCValueUqReferenceId(), "UQ_REFERENCE_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select FK_TO_PK_ID from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteUqReferenceRefByFkToPkIdList</span>(new SubQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteUqReferenceRefByFkToPkIdList for 'exists'. (NotNull)
     */
    public void existsWhiteUqReferenceRefByFkToPkIdList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "UQ_REFERENCE_ID", "FK_TO_PK_ID", subQueryPropertyName, "whiteUqReferenceRefByFkToPkIdList");
    }
    public abstract String keepUqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select FK_TO_PK_ID from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteUqReferenceRefByFkToPkIdList</span>(new SubQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqReferenceRefByFkToPkIdList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "UQ_REFERENCE_ID", "FK_TO_PK_ID", subQueryPropertyName, "whiteUqReferenceRefByFkToPkIdList");
    }
    public abstract String keepUqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_PK_ID from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdAsOne'.
     * @param subQuery The sub-query of WhiteUqReferenceRefByFkToPkIdList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqReferenceRefByFkToPkIdList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "UQ_REFERENCE_ID", "FK_TO_PK_ID", subQueryPropertyName, "whiteUqReferenceRefByFkToPkIdList");
    }
    public abstract String keepUqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_PK_ID from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdAsOne'.
     * @param subQuery The sub-query of WhiteUqReferenceRefByFkToPkIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqReferenceRefByFkToPkIdList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "UQ_REFERENCE_ID", "FK_TO_PK_ID", subQueryPropertyName, "whiteUqReferenceRefByFkToPkIdList");
    }
    public abstract String keepUqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery);

    public void xsderiveWhiteUqReferenceRefByFkToPkIdList(String function, SubQuery<WhiteUqReferenceRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "UQ_REFERENCE_ID", "FK_TO_PK_ID", subQueryPropertyName, "whiteUqReferenceRefByFkToPkIdList", aliasName, option);
    }
    public abstract String keepUqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteUqReferenceRefByFkToPkIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void query(WhiteUqReferenceRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqReferenceRefCB> derivedWhiteUqReferenceRefByFkToPkIdList() {
        return xcreateQDRFunctionWhiteUqReferenceRefByFkToPkIdList();
    }
    protected HpQDRFunction<WhiteUqReferenceRefCB> xcreateQDRFunctionWhiteUqReferenceRefByFkToPkIdList() {
        return new HpQDRFunction<WhiteUqReferenceRefCB>(new HpQDRSetupper<WhiteUqReferenceRefCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteUqReferenceRefByFkToPkIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteUqReferenceRefByFkToPkIdList(String function, SubQuery<WhiteUqReferenceRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "UQ_REFERENCE_ID", "FK_TO_PK_ID", subQueryPropertyName, "whiteUqReferenceRefByFkToPkIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery);
    public abstract String keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqReferenceId_IsNull() { regUqReferenceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqReferenceId_IsNotNull() { regUqReferenceId(CK_ISNN, DOBJ); }

    protected void regUqReferenceId(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceId(), "UQ_REFERENCE_ID"); }
    abstract protected ConditionValue getCValueUqReferenceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCode The value of uqReferenceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_Equal(String uqReferenceCode) {
        doSetUqReferenceCode_Equal(fRES(uqReferenceCode));
    }

    protected void doSetUqReferenceCode_Equal(String uqReferenceCode) {
        regUqReferenceCode(CK_EQ, uqReferenceCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCode The value of uqReferenceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_NotEqual(String uqReferenceCode) {
        doSetUqReferenceCode_NotEqual(fRES(uqReferenceCode));
    }

    protected void doSetUqReferenceCode_NotEqual(String uqReferenceCode) {
        regUqReferenceCode(CK_NES, uqReferenceCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCodeList The collection of uqReferenceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_InScope(Collection<String> uqReferenceCodeList) {
        doSetUqReferenceCode_InScope(uqReferenceCodeList);
    }

    public void doSetUqReferenceCode_InScope(Collection<String> uqReferenceCodeList) {
        regINS(CK_INS, cTL(uqReferenceCodeList), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCodeList The collection of uqReferenceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_NotInScope(Collection<String> uqReferenceCodeList) {
        doSetUqReferenceCode_NotInScope(uqReferenceCodeList);
    }

    public void doSetUqReferenceCode_NotInScope(Collection<String> uqReferenceCodeList) {
        regINS(CK_NINS, cTL(uqReferenceCodeList), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCode The value of uqReferenceCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_PrefixSearch(String uqReferenceCode) {
        setUqReferenceCode_LikeSearch(uqReferenceCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)} <br />
     * <pre>e.g. setUqReferenceCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqReferenceCode The value of uqReferenceCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqReferenceCode_LikeSearch(String uqReferenceCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqReferenceCode), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCode The value of uqReferenceCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqReferenceCode_NotLikeSearch(String uqReferenceCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqReferenceCode), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select FK_TO_UQ_CODE from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteUqReferenceRefByFkToUqCodeList</span>(new SubQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteUqReferenceRefByFkToUqCodeList for 'exists'. (NotNull)
     */
    public void existsWhiteUqReferenceRefByFkToUqCodeList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "UQ_REFERENCE_CODE", "FK_TO_UQ_CODE", subQueryPropertyName, "whiteUqReferenceRefByFkToUqCodeList");
    }
    public abstract String keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select FK_TO_UQ_CODE from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteUqReferenceRefByFkToUqCodeList</span>(new SubQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqReferenceRefByFkToUqCodeList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "UQ_REFERENCE_CODE", "FK_TO_UQ_CODE", subQueryPropertyName, "whiteUqReferenceRefByFkToUqCodeList");
    }
    public abstract String keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_UQ_CODE from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeAsOne'.
     * @param subQuery The sub-query of WhiteUqReferenceRefByFkToUqCodeList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqReferenceRefByFkToUqCodeList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "UQ_REFERENCE_CODE", "FK_TO_UQ_CODE", subQueryPropertyName, "whiteUqReferenceRefByFkToUqCodeList");
    }
    public abstract String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_UQ_CODE from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeAsOne'.
     * @param subQuery The sub-query of WhiteUqReferenceRefByFkToUqCodeList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqReferenceRefByFkToUqCodeList(SubQuery<WhiteUqReferenceRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "UQ_REFERENCE_CODE", "FK_TO_UQ_CODE", subQueryPropertyName, "whiteUqReferenceRefByFkToUqCodeList");
    }
    public abstract String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery);

    public void xsderiveWhiteUqReferenceRefByFkToUqCodeList(String function, SubQuery<WhiteUqReferenceRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "UQ_REFERENCE_CODE", "FK_TO_UQ_CODE", subQueryPropertyName, "whiteUqReferenceRefByFkToUqCodeList", aliasName, option);
    }
    public abstract String keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_uq_reference_ref where ...)} <br />
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteUqReferenceRefByFkToUqCodeList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void query(WhiteUqReferenceRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqReferenceRefCB> derivedWhiteUqReferenceRefByFkToUqCodeList() {
        return xcreateQDRFunctionWhiteUqReferenceRefByFkToUqCodeList();
    }
    protected HpQDRFunction<WhiteUqReferenceRefCB> xcreateQDRFunctionWhiteUqReferenceRefByFkToUqCodeList() {
        return new HpQDRFunction<WhiteUqReferenceRefCB>(new HpQDRSetupper<WhiteUqReferenceRefCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteUqReferenceRefByFkToUqCodeList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteUqReferenceRefByFkToUqCodeList(String function, SubQuery<WhiteUqReferenceRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefCB>", subQuery);
        WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "UQ_REFERENCE_CODE", "FK_TO_UQ_CODE", subQueryPropertyName, "whiteUqReferenceRefByFkToUqCodeList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery);
    public abstract String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameter(Object parameterValue);

    protected void regUqReferenceCode(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceCode(), "UQ_REFERENCE_CODE"); }
    abstract protected ConditionValue getCValueUqReferenceCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void query(WhiteUqReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteUqReferenceCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteUqReferenceCB>(new HpSSQSetupper<WhiteUqReferenceCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceCB> subQuery, HpSSQOption<WhiteUqReferenceCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteUqReferenceCB> subQuery, String operand, HpSSQOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceCB>", subQuery);
        WhiteUqReferenceCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteUqReferenceCQ subQuery);

    protected WhiteUqReferenceCB xcreateScalarConditionCB() {
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteUqReferenceCB xcreateScalarConditionPartitionByCB() {
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteUqReferenceCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceCB>", subQuery);
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "UQ_REFERENCE_ID", "UQ_REFERENCE_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqReferenceCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqReferenceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteUqReferenceCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteUqReferenceCB>(new HpQDRSetupper<WhiteUqReferenceCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteUqReferenceCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceCB>", subQuery);
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "UQ_REFERENCE_ID", "UQ_REFERENCE_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqReferenceCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqReferenceCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceCB>", subQuery);
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteUqReferenceCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteUqReferenceCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceCB>", subQuery);
        WhiteUqReferenceCB cb = new WhiteUqReferenceCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteUqReferenceCQ subQuery);

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
    protected String xabCB() { return WhiteUqReferenceCB.class.getName(); }
    protected String xabCQ() { return WhiteUqReferenceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
