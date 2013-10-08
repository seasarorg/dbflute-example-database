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
 * The base condition-query of white_variant_relation_master_foo.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationMasterFooCQ extends AbstractBsWhiteVariantRelationMasterFooCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterFooCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationMasterFooCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_master_foo) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationMasterFooCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationMasterFooCIQ xcreateCIQ() {
        WhiteVariantRelationMasterFooCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationMasterFooCIQ xnewCIQ() {
        return new WhiteVariantRelationMasterFooCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_master_foo on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationMasterFooCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationMasterFooCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _masterFooId;
    public ConditionValue getMasterFooId() {
        if (_masterFooId == null) { _masterFooId = nCV(); }
        return _masterFooId;
    }
    protected ConditionValue getCValueMasterFooId() { return getMasterFooId(); }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery) {
        if (_masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(key, subQuery); return "masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList." + key;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery) {
        if (_masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(key, subQuery); return "masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList." + key;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery) {
        if (_masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(key, subQuery); return "masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList." + key;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return _masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery) {
        if (_masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.put(key, subQuery); return "masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList." + key;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return _masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery) {
        if (_masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantListMap.put(key, subQuery); return "masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList." + key;
    }

    protected Map<String, WhiteVariantRelationReferrerCQ> _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap; }
    public String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ subQuery) {
        if (_masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap == null) { _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.size() + 1);
        _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListMap.put(key, subQuery); return "masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList." + key;
    }
    protected Map<String, Object> _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap;
    public Map<String, Object> getMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter() { return _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap; }
    public String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object parameterValue) {
        if (_masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap == null) { _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap.size() + 1);
        _masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameterMap.put(key, parameterValue); return "masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooId_Asc() { regOBA("MASTER_FOO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooId_Desc() { regOBD("MASTER_FOO_ID"); return this; }

    protected ConditionValue _masterFooName;
    public ConditionValue getMasterFooName() {
        if (_masterFooName == null) { _masterFooName = nCV(); }
        return _masterFooName;
    }
    protected ConditionValue getCValueMasterFooName() { return getMasterFooName(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooName_Asc() { regOBA("MASTER_FOO_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooName_Desc() { regOBD("MASTER_FOO_NAME"); return this; }

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
    public BsWhiteVariantRelationMasterFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteVariantRelationMasterFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
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
    protected Map<String, WhiteVariantRelationMasterFooCQ> _scalarConditionMap;
    public Map<String, WhiteVariantRelationMasterFooCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteVariantRelationMasterFooCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteVariantRelationMasterFooCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteVariantRelationMasterFooCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationMasterFooCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteVariantRelationMasterFooCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteVariantRelationMasterFooCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteVariantRelationMasterFooCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationMasterFooCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationMasterFooCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteVariantRelationMasterFooCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteVariantRelationMasterFooCQ> _myselfInScopeMap;
    public Map<String, WhiteVariantRelationMasterFooCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteVariantRelationMasterFooCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationMasterFooCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationMasterFooCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
