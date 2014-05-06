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
 * The base condition-query of white_compound_referred_normally.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundReferredNormallyCQ extends AbstractBsWhiteCompoundReferredNormallyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundReferredNormallyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundReferredNormallyCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_referred_normally) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundReferredNormallyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundReferredNormallyCIQ xcreateCIQ() {
        WhiteCompoundReferredNormallyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundReferredNormallyCIQ xnewCIQ() {
        return new WhiteCompoundReferredNormallyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_referred_normally on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundReferredNormallyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundReferredNormallyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _referredId;
    public ConditionValue getReferredId() {
        if (_referredId == null) { _referredId = nCV(); }
        return _referredId;
    }
    protected ConditionValue getCValueReferredId() { return getReferredId(); }

    protected Map<String, WhiteCompoundPkCQ> _referredId_ExistsReferrer_WhiteCompoundPkListMap;
    public Map<String, WhiteCompoundPkCQ> getReferredId_ExistsReferrer_WhiteCompoundPkList() { return _referredId_ExistsReferrer_WhiteCompoundPkListMap; }
    public String keepReferredId_ExistsReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) {
        if (_referredId_ExistsReferrer_WhiteCompoundPkListMap == null) { _referredId_ExistsReferrer_WhiteCompoundPkListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_ExistsReferrer_WhiteCompoundPkListMap.size() + 1);
        _referredId_ExistsReferrer_WhiteCompoundPkListMap.put(ky, sq); return "referredId_ExistsReferrer_WhiteCompoundPkList." + ky;
    }

    protected Map<String, WhiteCompoundPkCQ> _referredId_NotExistsReferrer_WhiteCompoundPkListMap;
    public Map<String, WhiteCompoundPkCQ> getReferredId_NotExistsReferrer_WhiteCompoundPkList() { return _referredId_NotExistsReferrer_WhiteCompoundPkListMap; }
    public String keepReferredId_NotExistsReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) {
        if (_referredId_NotExistsReferrer_WhiteCompoundPkListMap == null) { _referredId_NotExistsReferrer_WhiteCompoundPkListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_NotExistsReferrer_WhiteCompoundPkListMap.size() + 1);
        _referredId_NotExistsReferrer_WhiteCompoundPkListMap.put(ky, sq); return "referredId_NotExistsReferrer_WhiteCompoundPkList." + ky;
    }

    protected Map<String, WhiteCompoundPkCQ> _referredId_SpecifyDerivedReferrer_WhiteCompoundPkListMap;
    public Map<String, WhiteCompoundPkCQ> getReferredId_SpecifyDerivedReferrer_WhiteCompoundPkList() { return _referredId_SpecifyDerivedReferrer_WhiteCompoundPkListMap; }
    public String keepReferredId_SpecifyDerivedReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) {
        if (_referredId_SpecifyDerivedReferrer_WhiteCompoundPkListMap == null) { _referredId_SpecifyDerivedReferrer_WhiteCompoundPkListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_SpecifyDerivedReferrer_WhiteCompoundPkListMap.size() + 1);
        _referredId_SpecifyDerivedReferrer_WhiteCompoundPkListMap.put(ky, sq); return "referredId_SpecifyDerivedReferrer_WhiteCompoundPkList." + ky;
    }

    protected Map<String, WhiteCompoundPkCQ> _referredId_InScopeRelation_WhiteCompoundPkListMap;
    public Map<String, WhiteCompoundPkCQ> getReferredId_InScopeRelation_WhiteCompoundPkList() { return _referredId_InScopeRelation_WhiteCompoundPkListMap; }
    public String keepReferredId_InScopeRelation_WhiteCompoundPkList(WhiteCompoundPkCQ sq) {
        if (_referredId_InScopeRelation_WhiteCompoundPkListMap == null) { _referredId_InScopeRelation_WhiteCompoundPkListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_InScopeRelation_WhiteCompoundPkListMap.size() + 1);
        _referredId_InScopeRelation_WhiteCompoundPkListMap.put(ky, sq); return "referredId_InScopeRelation_WhiteCompoundPkList." + ky;
    }

    protected Map<String, WhiteCompoundPkCQ> _referredId_NotInScopeRelation_WhiteCompoundPkListMap;
    public Map<String, WhiteCompoundPkCQ> getReferredId_NotInScopeRelation_WhiteCompoundPkList() { return _referredId_NotInScopeRelation_WhiteCompoundPkListMap; }
    public String keepReferredId_NotInScopeRelation_WhiteCompoundPkList(WhiteCompoundPkCQ sq) {
        if (_referredId_NotInScopeRelation_WhiteCompoundPkListMap == null) { _referredId_NotInScopeRelation_WhiteCompoundPkListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_NotInScopeRelation_WhiteCompoundPkListMap.size() + 1);
        _referredId_NotInScopeRelation_WhiteCompoundPkListMap.put(ky, sq); return "referredId_NotInScopeRelation_WhiteCompoundPkList." + ky;
    }

    protected Map<String, WhiteCompoundPkCQ> _referredId_QueryDerivedReferrer_WhiteCompoundPkListMap;
    public Map<String, WhiteCompoundPkCQ> getReferredId_QueryDerivedReferrer_WhiteCompoundPkList() { return _referredId_QueryDerivedReferrer_WhiteCompoundPkListMap; }
    public String keepReferredId_QueryDerivedReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) {
        if (_referredId_QueryDerivedReferrer_WhiteCompoundPkListMap == null) { _referredId_QueryDerivedReferrer_WhiteCompoundPkListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_referredId_QueryDerivedReferrer_WhiteCompoundPkListMap.size() + 1);
        _referredId_QueryDerivedReferrer_WhiteCompoundPkListMap.put(ky, sq); return "referredId_QueryDerivedReferrer_WhiteCompoundPkList." + ky;
    }
    protected Map<String, Object> _referredId_QueryDerivedReferrer_WhiteCompoundPkListParameterMap;
    public Map<String, Object> getReferredId_QueryDerivedReferrer_WhiteCompoundPkListParameter() { return _referredId_QueryDerivedReferrer_WhiteCompoundPkListParameterMap; }
    public String keepReferredId_QueryDerivedReferrer_WhiteCompoundPkListParameter(Object vl) {
        if (_referredId_QueryDerivedReferrer_WhiteCompoundPkListParameterMap == null) { _referredId_QueryDerivedReferrer_WhiteCompoundPkListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_referredId_QueryDerivedReferrer_WhiteCompoundPkListParameterMap.size() + 1);
        _referredId_QueryDerivedReferrer_WhiteCompoundPkListParameterMap.put(ky, vl); return "referredId_QueryDerivedReferrer_WhiteCompoundPkListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredNormallyCQ addOrderBy_ReferredId_Asc() { regOBA("REFERRED_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredNormallyCQ addOrderBy_ReferredId_Desc() { regOBD("REFERRED_ID"); return this; }

    protected ConditionValue _referredName;
    public ConditionValue getReferredName() {
        if (_referredName == null) { _referredName = nCV(); }
        return _referredName;
    }
    protected ConditionValue getCValueReferredName() { return getReferredName(); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredNormallyCQ addOrderBy_ReferredName_Asc() { regOBA("REFERRED_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredNormallyCQ addOrderBy_ReferredName_Desc() { regOBD("REFERRED_NAME"); return this; }

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
    public BsWhiteCompoundReferredNormallyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteCompoundReferredNormallyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, WhiteCompoundReferredNormallyCQ> _scalarConditionMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteCompoundReferredNormallyCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteCompoundReferredNormallyCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteCompoundReferredNormallyCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteCompoundReferredNormallyCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteCompoundReferredNormallyCQ sq) {
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
    protected Map<String, WhiteCompoundReferredNormallyCQ> _myselfExistsMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteCompoundReferredNormallyCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteCompoundReferredNormallyCQ> _myselfInScopeMap;
    public Map<String, WhiteCompoundReferredNormallyCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteCompoundReferredNormallyCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundReferredNormallyCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundReferredNormallyCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
