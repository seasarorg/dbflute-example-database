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
 * The abstract condition-query of white_variant_relation_master_foo.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterFooCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterFooCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_foo";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooId The value of masterFooId as equal. (NullAllowed: if null, no condition)
     */
    public void setMasterFooId_Equal(Long masterFooId) {
        doSetMasterFooId_Equal(masterFooId);
    }

    protected void doSetMasterFooId_Equal(Long masterFooId) {
        regMasterFooId(CK_EQ, masterFooId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooId The value of masterFooId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMasterFooId_GreaterThan(Long masterFooId) {
        regMasterFooId(CK_GT, masterFooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooId The value of masterFooId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMasterFooId_LessThan(Long masterFooId) {
        regMasterFooId(CK_LT, masterFooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooId The value of masterFooId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterFooId_GreaterEqual(Long masterFooId) {
        regMasterFooId(CK_GE, masterFooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooId The value of masterFooId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterFooId_LessEqual(Long masterFooId) {
        regMasterFooId(CK_LE, masterFooId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterFooId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of masterFooId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterFooId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMasterFooId(), "MASTER_FOO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooIdList The collection of masterFooId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooId_InScope(Collection<Long> masterFooIdList) {
        doSetMasterFooId_InScope(masterFooIdList);
    }

    protected void doSetMasterFooId_InScope(Collection<Long> masterFooIdList) {
        regINS(CK_INS, cTL(masterFooIdList), getCValueMasterFooId(), "MASTER_FOO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @param masterFooIdList The collection of masterFooId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooId_NotInScope(Collection<Long> masterFooIdList) {
        doSetMasterFooId_NotInScope(masterFooIdList);
    }

    protected void doSetMasterFooId_NotInScope(Collection<Long> masterFooIdList) {
        regINS(CK_NINS, cTL(masterFooIdList), getCValueMasterFooId(), "MASTER_FOO_ID");
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
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

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
     * @param subQuery The sub-query of MasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * @param subQuery The sub-query of WhiteVariantRelationReferrerAsVariantList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMasterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * @param subQuery The sub-query of WhiteVariantRelationReferrerAsVariantList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteVariantRelationReferrerAsVariantList(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMasterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    public void xsderiveWhiteVariantRelationReferrerAsVariantList(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList", al, op);
    }
    public abstract String keepMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

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
            public void setup(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteVariantRelationReferrerAsVariantList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteVariantRelationReferrerAsVariantList(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); // for saving query-value.
        String prpp = keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", sqpp, "whiteVariantRelationReferrerAsVariantList", rd, vl, prpp, op);
    }
    public abstract String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);
    public abstract String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterFooId_IsNull() { regMasterFooId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterFooId_IsNotNull() { regMasterFooId(CK_ISNN, DOBJ); }

    protected void regMasterFooId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterFooId(), "MASTER_FOO_ID"); }
    protected abstract ConditionValue getCValueMasterFooId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooName_Equal(String masterFooName) {
        doSetMasterFooName_Equal(fRES(masterFooName));
    }

    protected void doSetMasterFooName_Equal(String masterFooName) {
        regMasterFooName(CK_EQ, masterFooName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooName_NotEqual(String masterFooName) {
        doSetMasterFooName_NotEqual(fRES(masterFooName));
    }

    protected void doSetMasterFooName_NotEqual(String masterFooName) {
        regMasterFooName(CK_NES, masterFooName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooNameList The collection of masterFooName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooName_InScope(Collection<String> masterFooNameList) {
        doSetMasterFooName_InScope(masterFooNameList);
    }

    public void doSetMasterFooName_InScope(Collection<String> masterFooNameList) {
        regINS(CK_INS, cTL(masterFooNameList), getCValueMasterFooName(), "MASTER_FOO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooNameList The collection of masterFooName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooName_NotInScope(Collection<String> masterFooNameList) {
        doSetMasterFooName_NotInScope(masterFooNameList);
    }

    public void doSetMasterFooName_NotInScope(Collection<String> masterFooNameList) {
        regINS(CK_NINS, cTL(masterFooNameList), getCValueMasterFooName(), "MASTER_FOO_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterFooName_PrefixSearch(String masterFooName) {
        setMasterFooName_LikeSearch(masterFooName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMasterFooName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterFooName The value of masterFooName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterFooName_LikeSearch(String masterFooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterFooName), getCValueMasterFooName(), "MASTER_FOO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterFooName_NotLikeSearch(String masterFooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterFooName), getCValueMasterFooName(), "MASTER_FOO_NAME", likeSearchOption);
    }

    protected void regMasterFooName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterFooName(), "MASTER_FOO_NAME"); }
    protected abstract ConditionValue getCValueMasterFooName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterFooCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterFooCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterFooCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterFooCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterFooCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterFooCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteVariantRelationMasterFooCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<WhiteVariantRelationMasterFooCB>(new HpSSQSetupper<WhiteVariantRelationMasterFooCB>() {
            public void setup(String fn, SubQuery<WhiteVariantRelationMasterFooCB> sq, HpSSQOption<WhiteVariantRelationMasterFooCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<WhiteVariantRelationMasterFooCB> sq, String rd, HpSSQOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterFooCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterFooCQ sq);

    protected WhiteVariantRelationMasterFooCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteVariantRelationMasterFooCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterFooCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "MASTER_FOO_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterFooCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterFooCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteVariantRelationMasterFooCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteVariantRelationMasterFooCB>(new HpQDRSetupper<WhiteVariantRelationMasterFooCB>() {
            public void setup(String fn, SubQuery<WhiteVariantRelationMasterFooCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<WhiteVariantRelationMasterFooCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "MASTER_FOO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterFooCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterFooCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationMasterFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationMasterFooCQ sq);

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
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteVariantRelationMasterFooCB.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationMasterFooCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
