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
    public BsWhiteCompoundPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
    public ConditionValue getPkFirstId() {
        if (_pkFirstId == null) { _pkFirstId = nCV(); }
        return _pkFirstId;
    }
    protected ConditionValue getCValuePkFirstId() { return getPkFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * PK_FIRST_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Asc() { regOBA("PK_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_FIRST_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Desc() { regOBD("PK_FIRST_ID"); return this; }

    protected ConditionValue _pkSecondId;
    public ConditionValue getPkSecondId() {
        if (_pkSecondId == null) { _pkSecondId = nCV(); }
        return _pkSecondId;
    }
    protected ConditionValue getCValuePkSecondId() { return getPkSecondId(); }

    protected Map<String, WhiteCompoundReferredPrimaryCQ> _pkSecondId_InScopeRelation_WhiteCompoundReferredPrimaryMap;
    public Map<String, WhiteCompoundReferredPrimaryCQ> getPkSecondId_InScopeRelation_WhiteCompoundReferredPrimary() { return _pkSecondId_InScopeRelation_WhiteCompoundReferredPrimaryMap; }
    public String keepPkSecondId_InScopeRelation_WhiteCompoundReferredPrimary(WhiteCompoundReferredPrimaryCQ sq) {
        if (_pkSecondId_InScopeRelation_WhiteCompoundReferredPrimaryMap == null) { _pkSecondId_InScopeRelation_WhiteCompoundReferredPrimaryMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_pkSecondId_InScopeRelation_WhiteCompoundReferredPrimaryMap.size() + 1);
        _pkSecondId_InScopeRelation_WhiteCompoundReferredPrimaryMap.put(ky, sq); return "pkSecondId_InScopeRelation_WhiteCompoundReferredPrimary." + ky;
    }

    protected Map<String, WhiteCompoundReferredPrimaryCQ> _pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimaryMap;
    public Map<String, WhiteCompoundReferredPrimaryCQ> getPkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary() { return _pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimaryMap; }
    public String keepPkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary(WhiteCompoundReferredPrimaryCQ sq) {
        if (_pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimaryMap == null) { _pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimaryMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimaryMap.size() + 1);
        _pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimaryMap.put(ky, sq); return "pkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * PK_SECOND_ID: {PK, UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Asc() { regOBA("PK_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_SECOND_ID: {PK, UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Desc() { regOBD("PK_SECOND_ID"); return this; }

    protected ConditionValue _pkName;
    public ConditionValue getPkName() {
        if (_pkName == null) { _pkName = nCV(); }
        return _pkName;
    }
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
    public ConditionValue getReferredId() {
        if (_referredId == null) { _referredId = nCV(); }
        return _referredId;
    }
    protected ConditionValue getCValueReferredId() { return getReferredId(); }

    protected Map<String, WhiteCompoundReferredNormallyCQ> _referredId_InScopeRelation_WhiteCompoundReferredNormallyMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getReferredId_InScopeRelation_WhiteCompoundReferredNormally() { return _referredId_InScopeRelation_WhiteCompoundReferredNormallyMap; }
    public String keepReferredId_InScopeRelation_WhiteCompoundReferredNormally(WhiteCompoundReferredNormallyCQ sq) {
        if (_referredId_InScopeRelation_WhiteCompoundReferredNormallyMap == null) { _referredId_InScopeRelation_WhiteCompoundReferredNormallyMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_InScopeRelation_WhiteCompoundReferredNormallyMap.size() + 1);
        _referredId_InScopeRelation_WhiteCompoundReferredNormallyMap.put(ky, sq); return "referredId_InScopeRelation_WhiteCompoundReferredNormally." + ky;
    }

    protected Map<String, WhiteCompoundReferredNormallyCQ> _referredId_NotInScopeRelation_WhiteCompoundReferredNormallyMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getReferredId_NotInScopeRelation_WhiteCompoundReferredNormally() { return _referredId_NotInScopeRelation_WhiteCompoundReferredNormallyMap; }
    public String keepReferredId_NotInScopeRelation_WhiteCompoundReferredNormally(WhiteCompoundReferredNormallyCQ sq) {
        if (_referredId_NotInScopeRelation_WhiteCompoundReferredNormallyMap == null) { _referredId_NotInScopeRelation_WhiteCompoundReferredNormallyMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_NotInScopeRelation_WhiteCompoundReferredNormallyMap.size() + 1);
        _referredId_NotInScopeRelation_WhiteCompoundReferredNormallyMap.put(ky, sq); return "referredId_NotInScopeRelation_WhiteCompoundReferredNormally." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * REFERRED_ID: {UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_ReferredId_Asc() { regOBA("REFERRED_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRED_ID: {UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
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
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected WhiteCompoundReferredNormallyCQ _conditionQueryWhiteCompoundReferredNormally;
    public WhiteCompoundReferredNormallyCQ getConditionQueryWhiteCompoundReferredNormally() {
        if (_conditionQueryWhiteCompoundReferredNormally == null) {
            _conditionQueryWhiteCompoundReferredNormally = xcreateQueryWhiteCompoundReferredNormally();
            xsetupOuterJoinWhiteCompoundReferredNormally();
        }
        return _conditionQueryWhiteCompoundReferredNormally;
    }
    protected WhiteCompoundReferredNormallyCQ xcreateQueryWhiteCompoundReferredNormally() {
        String nrp = resolveNextRelationPath("white_compound_pk", "whiteCompoundReferredNormally");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteCompoundReferredNormallyCQ cq = new WhiteCompoundReferredNormallyCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteCompoundReferredNormally");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteCompoundReferredNormally() {
        WhiteCompoundReferredNormallyCQ cq = getConditionQueryWhiteCompoundReferredNormally();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("REFERRED_ID", "REFERRED_ID");
        registerOuterJoin(cq, joinOnMap, "whiteCompoundReferredNormally");
    }
    public boolean hasConditionQueryWhiteCompoundReferredNormally() {
        return _conditionQueryWhiteCompoundReferredNormally != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundReferredPrimaryCQ queryWhiteCompoundReferredPrimary() {
        return getConditionQueryWhiteCompoundReferredPrimary();
    }
    protected WhiteCompoundReferredPrimaryCQ _conditionQueryWhiteCompoundReferredPrimary;
    public WhiteCompoundReferredPrimaryCQ getConditionQueryWhiteCompoundReferredPrimary() {
        if (_conditionQueryWhiteCompoundReferredPrimary == null) {
            _conditionQueryWhiteCompoundReferredPrimary = xcreateQueryWhiteCompoundReferredPrimary();
            xsetupOuterJoinWhiteCompoundReferredPrimary();
        }
        return _conditionQueryWhiteCompoundReferredPrimary;
    }
    protected WhiteCompoundReferredPrimaryCQ xcreateQueryWhiteCompoundReferredPrimary() {
        String nrp = resolveNextRelationPath("white_compound_pk", "whiteCompoundReferredPrimary");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteCompoundReferredPrimaryCQ cq = new WhiteCompoundReferredPrimaryCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteCompoundReferredPrimary");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteCompoundReferredPrimary() {
        WhiteCompoundReferredPrimaryCQ cq = getConditionQueryWhiteCompoundReferredPrimary();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PK_SECOND_ID", "REFERRED_ID");
        registerOuterJoin(cq, joinOnMap, "whiteCompoundReferredPrimary");
    }
    public boolean hasConditionQueryWhiteCompoundReferredPrimary() {
        return _conditionQueryWhiteCompoundReferredPrimary != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkRefManyCQ queryWhiteCompoundPkRefManyAsMax() {
        return getConditionQueryWhiteCompoundPkRefManyAsMax();
    }
    protected WhiteCompoundPkRefManyCQ _conditionQueryWhiteCompoundPkRefManyAsMax;
    public WhiteCompoundPkRefManyCQ getConditionQueryWhiteCompoundPkRefManyAsMax() {
        if (_conditionQueryWhiteCompoundPkRefManyAsMax == null) {
            _conditionQueryWhiteCompoundPkRefManyAsMax = xcreateQueryWhiteCompoundPkRefManyAsMax();
            xsetupOuterJoinWhiteCompoundPkRefManyAsMax();
        }
        return _conditionQueryWhiteCompoundPkRefManyAsMax;
    }
    protected WhiteCompoundPkRefManyCQ xcreateQueryWhiteCompoundPkRefManyAsMax() {
        String nrp = resolveNextRelationPath("white_compound_pk", "whiteCompoundPkRefManyAsMax");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteCompoundPkRefManyCQ cq = new WhiteCompoundPkRefManyCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteCompoundPkRefManyAsMax");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteCompoundPkRefManyAsMax() {
        WhiteCompoundPkRefManyCQ cq = getConditionQueryWhiteCompoundPkRefManyAsMax();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PK_FIRST_ID", "REF_MANY_FIRST_ID");
        joinOnMap.put("PK_SECOND_ID", "REF_MANY_SECOND_ID");
        registerOuterJoin(cq, joinOnMap, "whiteCompoundPkRefManyAsMax");
    }
    public boolean hasConditionQueryWhiteCompoundPkRefManyAsMax() {
        return _conditionQueryWhiteCompoundPkRefManyAsMax != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkRefManyCQ queryWhiteCompoundPkRefManyAsMin() {
        return getConditionQueryWhiteCompoundPkRefManyAsMin();
    }
    protected WhiteCompoundPkRefManyCQ _conditionQueryWhiteCompoundPkRefManyAsMin;
    public WhiteCompoundPkRefManyCQ getConditionQueryWhiteCompoundPkRefManyAsMin() {
        if (_conditionQueryWhiteCompoundPkRefManyAsMin == null) {
            _conditionQueryWhiteCompoundPkRefManyAsMin = xcreateQueryWhiteCompoundPkRefManyAsMin();
            xsetupOuterJoinWhiteCompoundPkRefManyAsMin();
        }
        return _conditionQueryWhiteCompoundPkRefManyAsMin;
    }
    protected WhiteCompoundPkRefManyCQ xcreateQueryWhiteCompoundPkRefManyAsMin() {
        String nrp = resolveNextRelationPath("white_compound_pk", "whiteCompoundPkRefManyAsMin");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteCompoundPkRefManyCQ cq = new WhiteCompoundPkRefManyCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteCompoundPkRefManyAsMin");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteCompoundPkRefManyAsMin() {
        WhiteCompoundPkRefManyCQ cq = getConditionQueryWhiteCompoundPkRefManyAsMin();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PK_FIRST_ID", "REF_MANY_FIRST_ID");
        joinOnMap.put("PK_SECOND_ID", "REF_MANY_SECOND_ID");
        registerOuterJoin(cq, joinOnMap, "whiteCompoundPkRefManyAsMin");
    }
    public boolean hasConditionQueryWhiteCompoundPkRefManyAsMin() {
        return _conditionQueryWhiteCompoundPkRefManyAsMin != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
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
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList." + ky;
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
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
    protected Map<String, WhiteCompoundPkRefManyCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKListMap;
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefManyToPKList." + ky;
    }

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
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
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList." + ky;
    }

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
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
    protected Map<String, WhiteCompoundPkRefManyCQ> _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKListMap;
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList() { return _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKListMap; }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) {
        if (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKListMap == null) { _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKListMap.size() + 1);
        _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKListMap.put(ky, sq); return "twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefManyToPKList." + ky;
    }

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
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList." + ky;
    }

    public void xsderiveWhiteCompoundPkRefManyToPKList(String fn, SubQuery<WhiteCompoundPkRefManyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_MANY_FIRST_ID, REF_MANY_SECOND_ID", pp, "whiteCompoundPkRefManyToPKList", al, op);
    }
    protected Map<String, WhiteCompoundPkRefManyCQ> _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKListMap;
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList() { return _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKListMap; }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) {
        if (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKListMap == null) { _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKListMap.size() + 1);
        _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKListMap.put(ky, sq); return "twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefManyToPKList." + ky;
    }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer. <br />
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
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList." + ky;
    }
    protected Map<String, Object> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap;
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter(Object vl) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap.put(ky, vl); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter." + ky;
    }

    /**
     * Prepare for (Query)DerivedReferrer. <br />
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
    protected Map<String, WhiteCompoundPkRefManyCQ> _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListMap;
    public Map<String, WhiteCompoundPkRefManyCQ> getTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList() { return _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListMap; }
    public String keepTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList(WhiteCompoundPkRefManyCQ sq) {
        if (_twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListMap == null) { _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListMap.size() + 1);
        _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListMap.put(ky, sq); return "twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKList." + ky;
    }
    protected Map<String, Object> _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameterMap;
    public Map<String, Object> getTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameter() { return _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameterMap; }
    public String keepTwoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameter(Object vl) {
        if (_twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameterMap == null) { _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameterMap.size() + 1);
        _twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameterMap.put(ky, vl); return "twoOrMorePkToPK_QueryDerivedReferrer_WhiteCompoundPkRefManyToPKListParameter." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
