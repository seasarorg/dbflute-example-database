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
 * The abstract condition-query of white_variant_relation_master_bar.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterBarCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterBarCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_bar";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as equal. (NullAllowed: if null, no condition)
     */
    public void setMasterBarId_Equal(Long masterBarId) {
        doSetMasterBarId_Equal(masterBarId);
    }

    protected void doSetMasterBarId_Equal(Long masterBarId) {
        regMasterBarId(CK_EQ, masterBarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMasterBarId_GreaterThan(Long masterBarId) {
        regMasterBarId(CK_GT, masterBarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMasterBarId_LessThan(Long masterBarId) {
        regMasterBarId(CK_LT, masterBarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterBarId_GreaterEqual(Long masterBarId) {
        regMasterBarId(CK_GE, masterBarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterBarId_LessEqual(Long masterBarId) {
        regMasterBarId(CK_LE, masterBarId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterBarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of masterBarId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterBarId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMasterBarId(), "MASTER_BAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarIdList The collection of masterBarId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarId_InScope(Collection<Long> masterBarIdList) {
        doSetMasterBarId_InScope(masterBarIdList);
    }

    protected void doSetMasterBarId_InScope(Collection<Long> masterBarIdList) {
        regINS(CK_INS, cTL(masterBarIdList), getCValueMasterBarId(), "MASTER_BAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarIdList The collection of masterBarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarId_NotInScope(Collection<Long> masterBarIdList) {
        doSetMasterBarId_NotInScope(masterBarIdList);
    }

    protected void doSetMasterBarId_NotInScope(Collection<Long> masterBarIdList) {
        regINS(CK_NINS, cTL(masterBarIdList), getCValueMasterBarId(), "MASTER_BAR_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteVariantRelationReferrerAsVariantList</span>(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteVariantRelationReferrerAsVariantList for 'exists'. (NotNull)
     */
    public void existsWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteVariantRelationReferrerCB>", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", subQueryPropertyName, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteVariantRelationReferrerAsVariantList</span>(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteVariantRelationReferrerCB>", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", subQueryPropertyName, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * @param subQuery The sub-query of WhiteVariantRelationReferrerAsVariantList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteVariantRelationReferrerCB>", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMasterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", subQueryPropertyName, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * @param subQuery The sub-query of WhiteVariantRelationReferrerAsVariantList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteVariantRelationReferrerCB>", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMasterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", subQueryPropertyName, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery);

    public void xsderiveWhiteVariantRelationReferrerAsVariantList(String function, SubQuery<WhiteVariantRelationReferrerCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteVariantRelationReferrerCB>", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", subQueryPropertyName, "whiteVariantRelationReferrerAsVariantList", aliasName, option);
    }
    public abstract String keepMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteVariantRelationReferrerAsVariantList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationReferrerCB> derivedWhiteVariantRelationReferrerAsVariantList() {
        return xcreateQDRFunctionWhiteVariantRelationReferrerAsVariantList();
    }
    protected HpQDRFunction<WhiteVariantRelationReferrerCB> xcreateQDRFunctionWhiteVariantRelationReferrerAsVariantList() {
        return new HpQDRFunction<WhiteVariantRelationReferrerCB>(new HpQDRSetupper<WhiteVariantRelationReferrerCB>() {
            public void setup(String function, SubQuery<WhiteVariantRelationReferrerCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteVariantRelationReferrerAsVariantList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteVariantRelationReferrerAsVariantList(String function, SubQuery<WhiteVariantRelationReferrerCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteVariantRelationReferrerCB>", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", subQueryPropertyName, "whiteVariantRelationReferrerAsVariantList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery);
    public abstract String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterBarId_IsNull() { regMasterBarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterBarId_IsNotNull() { regMasterBarId(CK_ISNN, DOBJ); }

    protected void regMasterBarId(ConditionKey k, Object v) { regQ(k, v, getCValueMasterBarId(), "MASTER_BAR_ID"); }
    abstract protected ConditionValue getCValueMasterBarId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_Equal(String masterBarName) {
        doSetMasterBarName_Equal(fRES(masterBarName));
    }

    protected void doSetMasterBarName_Equal(String masterBarName) {
        regMasterBarName(CK_EQ, masterBarName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_NotEqual(String masterBarName) {
        doSetMasterBarName_NotEqual(fRES(masterBarName));
    }

    protected void doSetMasterBarName_NotEqual(String masterBarName) {
        regMasterBarName(CK_NES, masterBarName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarNameList The collection of masterBarName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_InScope(Collection<String> masterBarNameList) {
        doSetMasterBarName_InScope(masterBarNameList);
    }

    public void doSetMasterBarName_InScope(Collection<String> masterBarNameList) {
        regINS(CK_INS, cTL(masterBarNameList), getCValueMasterBarName(), "MASTER_BAR_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarNameList The collection of masterBarName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_NotInScope(Collection<String> masterBarNameList) {
        doSetMasterBarName_NotInScope(masterBarNameList);
    }

    public void doSetMasterBarName_NotInScope(Collection<String> masterBarNameList) {
        regINS(CK_NINS, cTL(masterBarNameList), getCValueMasterBarName(), "MASTER_BAR_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_PrefixSearch(String masterBarName) {
        setMasterBarName_LikeSearch(masterBarName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMasterBarName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterBarName The value of masterBarName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterBarName_LikeSearch(String masterBarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterBarName), getCValueMasterBarName(), "MASTER_BAR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterBarName_NotLikeSearch(String masterBarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterBarName), getCValueMasterBarName(), "MASTER_BAR_NAME", likeSearchOption);
    }

    protected void regMasterBarName(ConditionKey k, Object v) { regQ(k, v, getCValueMasterBarName(), "MASTER_BAR_NAME"); }
    abstract protected ConditionValue getCValueMasterBarName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterBarCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterBarCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterBarCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterBarCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterBarCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterBarCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteVariantRelationMasterBarCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteVariantRelationMasterBarCB>(new HpSSQSetupper<WhiteVariantRelationMasterBarCB>() {
            public void setup(String function, SubQuery<WhiteVariantRelationMasterBarCB> subQuery, HpSSQOption<WhiteVariantRelationMasterBarCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteVariantRelationMasterBarCB> subQuery, String operand, HpSSQOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("subQuery<WhiteVariantRelationMasterBarCB>", subQuery);
        WhiteVariantRelationMasterBarCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterBarCQ subQuery);

    protected WhiteVariantRelationMasterBarCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteVariantRelationMasterBarCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteVariantRelationMasterBarCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteVariantRelationMasterBarCB>", subQuery);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MASTER_BAR_ID", "MASTER_BAR_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterBarCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterBarCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteVariantRelationMasterBarCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteVariantRelationMasterBarCB>(new HpQDRSetupper<WhiteVariantRelationMasterBarCB>() {
            public void setup(String function, SubQuery<WhiteVariantRelationMasterBarCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteVariantRelationMasterBarCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteVariantRelationMasterBarCB>", subQuery);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MASTER_BAR_ID", "MASTER_BAR_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterBarCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterBarCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteVariantRelationMasterBarCB>", subQuery);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterBarCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationMasterBarCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteVariantRelationMasterBarCB>", subQuery);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationMasterBarCQ subQuery);

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
    protected String xabCB() { return WhiteVariantRelationMasterBarCB.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationMasterBarCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
