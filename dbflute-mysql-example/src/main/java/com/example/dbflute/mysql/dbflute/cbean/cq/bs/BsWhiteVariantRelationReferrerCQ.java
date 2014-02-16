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
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationReferrerCQ extends AbstractBsWhiteVariantRelationReferrerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationReferrerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationReferrerCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_referrer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationReferrerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationReferrerCIQ xcreateCIQ() {
        WhiteVariantRelationReferrerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationReferrerCIQ xnewCIQ() {
        return new WhiteVariantRelationReferrerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_referrer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationReferrerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationReferrerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _referrerId;
    public ConditionValue getReferrerId() {
        if (_referrerId == null) { _referrerId = nCV(); }
        return _referrerId;
    }
    protected ConditionValue getCValueReferrerId() { return getReferrerId(); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_ReferrerId_Asc() { regOBA("REFERRER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_ReferrerId_Desc() { regOBD("REFERRER_ID"); return this; }

    protected ConditionValue _variantMasterId;
    public ConditionValue getVariantMasterId() {
        if (_variantMasterId == null) { _variantMasterId = nCV(); }
        return _variantMasterId;
    }
    protected ConditionValue getCValueVariantMasterId() { return getVariantMasterId(); }

    /** 
     * Add order-by as ascend. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_VariantMasterId_Asc() { regOBA("VARIANT_MASTER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_VariantMasterId_Desc() { regOBD("VARIANT_MASTER_ID"); return this; }

    protected ConditionValue _masterTypeCode;
    public ConditionValue getMasterTypeCode() {
        if (_masterTypeCode == null) { _masterTypeCode = nCV(); }
        return _masterTypeCode;
    }
    protected ConditionValue getCValueMasterTypeCode() { return getMasterTypeCode(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_MasterTypeCode_Asc() { regOBA("MASTER_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_MasterTypeCode_Desc() { regOBD("MASTER_TYPE_CODE"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteVariantRelationReferrerCQ bq = (WhiteVariantRelationReferrerCQ)bqs;
        WhiteVariantRelationReferrerCQ uq = (WhiteVariantRelationReferrerCQ)uqs;
        if (bq.hasConditionQueryWhiteVariantRelationMasterFooAsVariant()) {
            uq.queryWhiteVariantRelationMasterFooAsVariant().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterFooAsVariant(), uq.queryWhiteVariantRelationMasterFooAsVariant());
        }
        if (bq.hasConditionQueryWhiteVariantRelationMasterBarAsVariant()) {
            uq.queryWhiteVariantRelationMasterBarAsVariant().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterBarAsVariant(), uq.queryWhiteVariantRelationMasterBarAsVariant());
        }
        if (bq.hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue()) {
            uq.queryWhiteVariantRelationMasterQuxAsVariantByQue().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterQuxAsVariantByQue(), uq.queryWhiteVariantRelationMasterQuxAsVariantByQue());
        }
        if (bq.hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType()) {
            uq.xsetParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType(bq.getParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType());
            uq.getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType().reflectRelationOnUnionQuery(bq.getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(), uq.getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterFooCQ queryWhiteVariantRelationMasterFooAsVariant() {
        return getConditionQueryWhiteVariantRelationMasterFooAsVariant();
    }
    protected WhiteVariantRelationMasterFooCQ _conditionQueryWhiteVariantRelationMasterFooAsVariant;
    public WhiteVariantRelationMasterFooCQ getConditionQueryWhiteVariantRelationMasterFooAsVariant() {
        if (_conditionQueryWhiteVariantRelationMasterFooAsVariant == null) {
            _conditionQueryWhiteVariantRelationMasterFooAsVariant = xcreateQueryWhiteVariantRelationMasterFooAsVariant();
            xsetupOuterJoinWhiteVariantRelationMasterFooAsVariant();
        }
        return _conditionQueryWhiteVariantRelationMasterFooAsVariant;
    }
    protected WhiteVariantRelationMasterFooCQ xcreateQueryWhiteVariantRelationMasterFooAsVariant() {
        String nrp = resolveNextRelationPath("white_variant_relation_referrer", "whiteVariantRelationMasterFooAsVariant");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteVariantRelationMasterFooCQ cq = new WhiteVariantRelationMasterFooCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteVariantRelationMasterFooAsVariant");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterFooAsVariant() {
        WhiteVariantRelationMasterFooCQ cq = getConditionQueryWhiteVariantRelationMasterFooAsVariant();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("VARIANT_MASTER_ID", "MASTER_FOO_ID");
        registerOuterJoin(cq, joinOnMap, "whiteVariantRelationMasterFooAsVariant");
    }
    public boolean hasConditionQueryWhiteVariantRelationMasterFooAsVariant() {
        return _conditionQueryWhiteVariantRelationMasterFooAsVariant != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterBarCQ queryWhiteVariantRelationMasterBarAsVariant() {
        return getConditionQueryWhiteVariantRelationMasterBarAsVariant();
    }
    protected WhiteVariantRelationMasterBarCQ _conditionQueryWhiteVariantRelationMasterBarAsVariant;
    public WhiteVariantRelationMasterBarCQ getConditionQueryWhiteVariantRelationMasterBarAsVariant() {
        if (_conditionQueryWhiteVariantRelationMasterBarAsVariant == null) {
            _conditionQueryWhiteVariantRelationMasterBarAsVariant = xcreateQueryWhiteVariantRelationMasterBarAsVariant();
            xsetupOuterJoinWhiteVariantRelationMasterBarAsVariant();
        }
        return _conditionQueryWhiteVariantRelationMasterBarAsVariant;
    }
    protected WhiteVariantRelationMasterBarCQ xcreateQueryWhiteVariantRelationMasterBarAsVariant() {
        String nrp = resolveNextRelationPath("white_variant_relation_referrer", "whiteVariantRelationMasterBarAsVariant");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteVariantRelationMasterBarCQ cq = new WhiteVariantRelationMasterBarCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteVariantRelationMasterBarAsVariant");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterBarAsVariant() {
        WhiteVariantRelationMasterBarCQ cq = getConditionQueryWhiteVariantRelationMasterBarAsVariant();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("VARIANT_MASTER_ID", "MASTER_BAR_ID");
        registerOuterJoin(cq, joinOnMap, "whiteVariantRelationMasterBarAsVariant");
    }
    public boolean hasConditionQueryWhiteVariantRelationMasterBarAsVariant() {
        return _conditionQueryWhiteVariantRelationMasterBarAsVariant != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterQuxCQ queryWhiteVariantRelationMasterQuxAsVariantByQue() {
        return getConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue();
    }
    protected WhiteVariantRelationMasterQuxCQ _conditionQueryWhiteVariantRelationMasterQuxAsVariantByQue;
    public WhiteVariantRelationMasterQuxCQ getConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue() {
        if (_conditionQueryWhiteVariantRelationMasterQuxAsVariantByQue == null) {
            _conditionQueryWhiteVariantRelationMasterQuxAsVariantByQue = xcreateQueryWhiteVariantRelationMasterQuxAsVariantByQue();
            xsetupOuterJoinWhiteVariantRelationMasterQuxAsVariantByQue();
        }
        return _conditionQueryWhiteVariantRelationMasterQuxAsVariantByQue;
    }
    protected WhiteVariantRelationMasterQuxCQ xcreateQueryWhiteVariantRelationMasterQuxAsVariantByQue() {
        String nrp = resolveNextRelationPath("white_variant_relation_referrer", "whiteVariantRelationMasterQuxAsVariantByQue");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteVariantRelationMasterQuxCQ cq = new WhiteVariantRelationMasterQuxCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteVariantRelationMasterQuxAsVariantByQue");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterQuxAsVariantByQue() {
        WhiteVariantRelationMasterQuxCQ cq = getConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("VARIANT_MASTER_ID", "MASTER_QUX_ID");
        registerOuterJoin(cq, joinOnMap, "whiteVariantRelationMasterQuxAsVariantByQue");
    }
    public boolean hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue() {
        return _conditionQueryWhiteVariantRelationMasterQuxAsVariantByQue != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterCorgeCQ queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(com.example.dbflute.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
        Map<String, Object> parameterMap = getParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType();
        parameterMap.put("quxType", quxType);
        assertFixedConditionDynamicParameter("whiteVariantRelationMasterCorgeAsVariantByQuxType", parameterMap);
        return getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType();
    }
    protected WhiteVariantRelationMasterCorgeCQ _conditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    public WhiteVariantRelationMasterCorgeCQ getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        if (_conditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType == null) {
            _conditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType = xcreateQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType();
            xsetupOuterJoinWhiteVariantRelationMasterCorgeAsVariantByQuxType();
        }
        return _conditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    }
    protected Map<String, Object> _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    public Map<String, Object> getParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        if (_parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType == null) {
            _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType = newLinkedHashMapSized(4);
        }
        return _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    }
    public void xsetParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType(Map<String, Object> parameterMap) {
        _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType = parameterMap; // for UnionQuery
    }
    protected WhiteVariantRelationMasterCorgeCQ xcreateQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        String nrp = resolveNextRelationPath("white_variant_relation_referrer", "whiteVariantRelationMasterCorgeAsVariantByQuxType");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteVariantRelationMasterCorgeCQ cq = new WhiteVariantRelationMasterCorgeCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteVariantRelationMasterCorgeAsVariantByQuxType");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        WhiteVariantRelationMasterCorgeCQ cq = getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("VARIANT_MASTER_ID", "MASTER_CORGE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteVariantRelationMasterCorgeAsVariantByQuxType");
    }
    public boolean hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        return _conditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("whiteVariantRelationMasterCorgeAsVariantByQuxType".equalsIgnoreCase(property)) {
            return _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType;
        }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteVariantRelationReferrerCQ> _scalarConditionMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteVariantRelationReferrerCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteVariantRelationReferrerCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationReferrerCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteVariantRelationReferrerCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationReferrerCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteVariantRelationReferrerCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteVariantRelationReferrerCQ> _myselfInScopeMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteVariantRelationReferrerCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationReferrerCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationReferrerCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
