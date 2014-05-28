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
 * The base condition-query of white_variant_relation_master_bar.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationMasterBarCQ extends AbstractBsWhiteVariantRelationMasterBarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterBarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationMasterBarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_master_bar) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationMasterBarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationMasterBarCIQ xcreateCIQ() {
        WhiteVariantRelationMasterBarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationMasterBarCIQ xnewCIQ() {
        return new WhiteVariantRelationMasterBarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_master_bar on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationMasterBarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationMasterBarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _masterBarId;
    public ConditionValue getMasterBarId() {
        if (_masterBarId == null) { _masterBarId = nCV(); }
        return _masterBarId;
    }
    protected ConditionValue getCValueMasterBarId() { return getMasterBarId(); }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) {
        if (_masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(ky, sq); return "masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList." + ky;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) {
        if (_masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(ky, sq); return "masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList." + ky;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) {
        if (_masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(ky, sq); return "masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList." + ky;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return _masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) {
        if (_masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.put(ky, sq); return "masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList." + ky;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return _masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) {
        if (_masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.put(ky, sq); return "masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList." + ky;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) {
        if (_masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(ky, sq); return "masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList." + ky;
    }
    protected Map<String, Object> _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap;
    public Map<String, Object> getMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter() { return _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap; }
    public String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object vl) {
        if (_masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap == null) { _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap.size() + 1);
        _masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap.put(ky, vl); return "masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarId_Asc() { regOBA("MASTER_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarId_Desc() { regOBD("MASTER_BAR_ID"); return this; }

    protected ConditionValue _masterBarName;
    public ConditionValue getMasterBarName() {
        if (_masterBarName == null) { _masterBarName = nCV(); }
        return _masterBarName;
    }
    protected ConditionValue getCValueMasterBarName() { return getMasterBarName(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarName_Asc() { regOBA("MASTER_BAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarName_Desc() { regOBD("MASTER_BAR_NAME"); return this; }

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
    public BsWhiteVariantRelationMasterBarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteVariantRelationMasterBarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteVariantRelationMasterBarCQ> _scalarConditionMap;
    public Map<String, WhiteVariantRelationMasterBarCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteVariantRelationMasterBarCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteVariantRelationMasterBarCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteVariantRelationMasterBarCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationMasterBarCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteVariantRelationMasterBarCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteVariantRelationMasterBarCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteVariantRelationMasterBarCQ sq) {
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
    protected Map<String, WhiteVariantRelationMasterBarCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationMasterBarCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteVariantRelationMasterBarCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteVariantRelationMasterBarCQ> _myselfInScopeMap;
    public Map<String, WhiteVariantRelationMasterBarCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteVariantRelationMasterBarCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationMasterBarCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationMasterBarCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
