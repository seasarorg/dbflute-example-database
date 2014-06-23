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

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkCQ extends AbstractBsWhiteCompoundPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkCIQ xcreateCIQ() {
        WhiteCompoundPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkCIQ xnewCIQ() {
        return new WhiteCompoundPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pkFirstId;
    public ConditionValue getPkFirstId()
    { if (_pkFirstId == null) { _pkFirstId = nCV(); }
      return _pkFirstId; }
    protected ConditionValue getCValuePkFirstId() { return getPkFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Asc() { regOBA("PK_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Desc() { regOBD("PK_FIRST_ID"); return this; }

    protected ConditionValue _pkSecondId;
    public ConditionValue getPkSecondId()
    { if (_pkSecondId == null) { _pkSecondId = nCV(); }
      return _pkSecondId; }
    protected ConditionValue getCValuePkSecondId() { return getPkSecondId(); }

    public Map<String, WhiteCompoundReferredPrimaryCQ> getPkSecondId_InScopeRelation_WhiteCompoundReferredPrimary() { return xgetSQueMap("pkSecondId_InScopeRelation_WhiteCompoundReferredPrimary"); }
    public String keepPkSecondId_InScopeRelation_WhiteCompoundReferredPrimary(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("pkSecondId_InScopeRelation_WhiteCompoundReferredPrimary", sq); }

    public Map<String, WhiteCompoundReferredPrimaryCQ> getPkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary() { return xgetSQueMap("pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary"); }
    public String keepPkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Asc() { regOBA("PK_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Desc() { regOBD("PK_SECOND_ID"); return this; }

    protected ConditionValue _pkName;
    public ConditionValue getPkName()
    { if (_pkName == null) { _pkName = nCV(); }
      return _pkName; }
    protected ConditionValue getCValuePkName() { return getPkName(); }

    /** 
     * Add order-by as ascend. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkName_Asc() { regOBA("PK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkName_Desc() { regOBD("PK_NAME"); return this; }

    protected ConditionValue _referredId;
    public ConditionValue getReferredId()
    { if (_referredId == null) { _referredId = nCV(); }
      return _referredId; }
    protected ConditionValue getCValueReferredId() { return getReferredId(); }

    public Map<String, WhiteCompoundReferredNormallyCQ> getReferredId_InScopeRelation_WhiteCompoundReferredNormally() { return xgetSQueMap("referredId_InScopeRelation_WhiteCompoundReferredNormally"); }
    public String keepReferredId_InScopeRelation_WhiteCompoundReferredNormally(WhiteCompoundReferredNormallyCQ sq) { return xkeepSQue("referredId_InScopeRelation_WhiteCompoundReferredNormally", sq); }

    public Map<String, WhiteCompoundReferredNormallyCQ> getReferredId_NotInScopeRelation_WhiteCompoundReferredNormally() { return xgetSQueMap("referredId_NotInScopeRelation_WhiteCompoundReferredNormally"); }
    public String keepReferredId_NotInScopeRelation_WhiteCompoundReferredNormally(WhiteCompoundReferredNormallyCQ sq) { return xkeepSQue("referredId_NotInScopeRelation_WhiteCompoundReferredNormally", sq); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_ReferredId_Asc() { regOBA("REFERRED_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_ReferredId_Desc() { regOBD("REFERRED_ID"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteCompoundPkCQ bq = (WhiteCompoundPkCQ)bqs;
        WhiteCompoundPkCQ uq = (WhiteCompoundPkCQ)uqs;
        if (bq.hasConditionQueryWhiteCompoundReferredNormally()) {
            uq.queryWhiteCompoundReferredNormally().reflectRelationOnUnionQuery(bq.queryWhiteCompoundReferredNormally(), uq.queryWhiteCompoundReferredNormally());
        }
        if (bq.hasConditionQueryWhiteCompoundReferredPrimary()) {
            uq.queryWhiteCompoundReferredPrimary().reflectRelationOnUnionQuery(bq.queryWhiteCompoundReferredPrimary(), uq.queryWhiteCompoundReferredPrimary());
        }
        if (bq.hasConditionQueryWhiteCompoundPkRefManyAsMax()) {
            uq.queryWhiteCompoundPkRefManyAsMax().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPkRefManyAsMax(), uq.queryWhiteCompoundPkRefManyAsMax());
        }
        if (bq.hasConditionQueryWhiteCompoundPkRefManyAsMin()) {
            uq.queryWhiteCompoundPkRefManyAsMin().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPkRefManyAsMin(), uq.queryWhiteCompoundPkRefManyAsMin());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundReferredNormallyCQ queryWhiteCompoundReferredNormally() {
        return getConditionQueryWhiteCompoundReferredNormally();
    }
    public WhiteCompoundReferredNormallyCQ getConditionQueryWhiteCompoundReferredNormally() {
        String prop = "whiteCompoundReferredNormally";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundReferredNormally()); xsetupOuterJoinWhiteCompoundReferredNormally(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundReferredNormallyCQ xcreateQueryWhiteCompoundReferredNormally() {
        String nrp = xresolveNRP("white_compound_pk", "whiteCompoundReferredNormally"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundReferredNormallyCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundReferredNormally", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundReferredNormally() { xregOutJo("whiteCompoundReferredNormally"); }
    public boolean hasConditionQueryWhiteCompoundReferredNormally() { return xhasQueRlMap("whiteCompoundReferredNormally"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundReferredPrimaryCQ queryWhiteCompoundReferredPrimary() {
        return getConditionQueryWhiteCompoundReferredPrimary();
    }
    public WhiteCompoundReferredPrimaryCQ getConditionQueryWhiteCompoundReferredPrimary() {
        String prop = "whiteCompoundReferredPrimary";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundReferredPrimary()); xsetupOuterJoinWhiteCompoundReferredPrimary(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundReferredPrimaryCQ xcreateQueryWhiteCompoundReferredPrimary() {
        String nrp = xresolveNRP("white_compound_pk", "whiteCompoundReferredPrimary"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundReferredPrimaryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundReferredPrimary", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundReferredPrimary() { xregOutJo("whiteCompoundReferredPrimary"); }
    public boolean hasConditionQueryWhiteCompoundReferredPrimary() { return xhasQueRlMap("whiteCompoundReferredPrimary"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkRefManyCQ queryWhiteCompoundPkRefManyAsMax() {
        return getConditionQueryWhiteCompoundPkRefManyAsMax();
    }
    public WhiteCompoundPkRefManyCQ getConditionQueryWhiteCompoundPkRefManyAsMax() {
        String prop = "whiteCompoundPkRefManyAsMax";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundPkRefManyAsMax()); xsetupOuterJoinWhiteCompoundPkRefManyAsMax(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundPkRefManyCQ xcreateQueryWhiteCompoundPkRefManyAsMax() {
        String nrp = xresolveNRP("white_compound_pk", "whiteCompoundPkRefManyAsMax"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundPkRefManyCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundPkRefManyAsMax", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundPkRefManyAsMax() { xregOutJo("whiteCompoundPkRefManyAsMax"); }
    public boolean hasConditionQueryWhiteCompoundPkRefManyAsMax() { return xhasQueRlMap("whiteCompoundPkRefManyAsMax"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkRefManyCQ queryWhiteCompoundPkRefManyAsMin() {
        return getConditionQueryWhiteCompoundPkRefManyAsMin();
    }
    public WhiteCompoundPkRefManyCQ getConditionQueryWhiteCompoundPkRefManyAsMin() {
        String prop = "whiteCompoundPkRefManyAsMin";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundPkRefManyAsMin()); xsetupOuterJoinWhiteCompoundPkRefManyAsMin(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundPkRefManyCQ xcreateQueryWhiteCompoundPkRefManyAsMin() {
        String nrp = xresolveNRP("white_compound_pk", "whiteCompoundPkRefManyAsMin"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundPkRefManyCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundPkRefManyAsMin", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundPkRefManyAsMin() { xregOutJo("whiteCompoundPkRefManyAsMin"); }
    public boolean hasConditionQueryWhiteCompoundPkRefManyAsMin() { return xhasQueRlMap("whiteCompoundPkRefManyAsMin"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteCompoundPkCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundPkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br />
     * {exists (select ... from white_compound_pk_ref where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefList(SubQuery<WhiteCompoundPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefCB>", subQuery);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(cb.query());
        registerExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefList");
    }
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList"); }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList", sq); }

    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br />
     * {exists (select ... from white_compound_pk_ref_many where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefManyToPKList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefManyToPKList(SubQuery<WhiteCompoundPkRefManyCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefManyCB>", subQuery);
        WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList(cb.query());
        registerExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_MANY_FIRST_ID, REF_MANY_SECOND_ID", pp, "whiteCompoundPkRefManyToPKList");
    }
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList"); }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br />
     * {not exists (select ... from white_compound_pk_ref where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefList(SubQuery<WhiteCompoundPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefCB>", subQuery);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefList");
    }
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br />
     * {not exists (select ... from white_compound_pk_ref_many where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefManyToPKList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefManyToPKList(SubQuery<WhiteCompoundPkRefManyCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefManyCB>", subQuery);
        WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList(cb.query());
        registerNotExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_MANY_FIRST_ID, REF_MANY_SECOND_ID", pp, "whiteCompoundPkRefManyToPKList");
    }
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList", sq); }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveWhiteCompoundPkRefList(String fn, SubQuery<WhiteCompoundPkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefList", al, op);
    }
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList", sq); }

    public void xsderiveWhiteCompoundPkRefManyToPKList(String fn, SubQuery<WhiteCompoundPkRefManyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_MANY_FIRST_ID, REF_MANY_SECOND_ID", pp, "whiteCompoundPkRefManyToPKList", al, op);
    }
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList", sq); }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_compound_pk_ref where ...)} <br />
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteCompoundPkRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefCB> derivedWhiteCompoundPkRefList() {
        return xcreateQDRFunctionWhiteCompoundPkRefList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefCB> xcreateQDRFunctionWhiteCompoundPkRefList() {
        return new HpQDRFunction<WhiteCompoundPkRefCB>(new HpQDRSetupper<WhiteCompoundPkRefCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefList(String fn, SubQuery<WhiteCompoundPkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", sqpp, "whiteCompoundPkRefList", rd, vl, prpp, op);
    }
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList() { return xgetSQueMap("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) { return xkeepSQue("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList", sq); }
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter() { return xgetSQuePmMap("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter(Object pm) { return xkeepSQuePm("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList", pm); }

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_compound_pk_ref_many where ...)} <br />
     * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteCompoundPkRefManyToPKList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void query(WhiteCompoundPkRefManyCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefManyCB> derivedWhiteCompoundPkRefManyToPKList() {
        return xcreateQDRFunctionWhiteCompoundPkRefManyToPKList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefManyCB> xcreateQDRFunctionWhiteCompoundPkRefManyToPKList() {
        return new HpQDRFunction<WhiteCompoundPkRefManyCB>(new HpQDRSetupper<WhiteCompoundPkRefManyCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefManyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefManyToPKList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefManyToPKList(String fn, SubQuery<WhiteCompoundPkRefManyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList(cb.query()); String prpp = keepTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_MANY_FIRST_ID, REF_MANY_SECOND_ID", sqpp, "whiteCompoundPkRefManyToPKList", rd, vl, prpp, op);
    }
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList() { return xgetSQueMap("twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList"); }
    public String keepTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) { return xkeepSQue("twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList", sq); }
    public Map<String, Object> getTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameter() { return xgetSQuePmMap("twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList"); }
    public String keepTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameter(Object pm) { return xkeepSQuePm("twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList", pm); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
