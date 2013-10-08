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
 * The base condition-query of vendor_constraint_name_auto_bar.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorConstraintNameAutoBarCQ extends AbstractBsVendorConstraintNameAutoBarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoBarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorConstraintNameAutoBarCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_constraint_name_auto_bar) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorConstraintNameAutoBarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorConstraintNameAutoBarCIQ xcreateCIQ() {
        VendorConstraintNameAutoBarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorConstraintNameAutoBarCIQ xnewCIQ() {
        return new VendorConstraintNameAutoBarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_constraint_name_auto_bar on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorConstraintNameAutoBarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorConstraintNameAutoBarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoBarId;
    public ConditionValue getConstraintNameAutoBarId() {
        if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
        return _constraintNameAutoBarId;
    }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList." + key;
    }
    protected Map<String, Object> _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap;
    public Map<String, Object> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap; }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object parameterValue) {
        if (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap == null) { _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.size() + 1);
        _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.put(key, parameterValue); return "constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    protected ConditionValue _constraintNameAutoBarName;
    public ConditionValue getConstraintNameAutoBarName() {
        if (_constraintNameAutoBarName == null) { _constraintNameAutoBarName = nCV(); }
        return _constraintNameAutoBarName;
    }
    protected ConditionValue getCValueConstraintNameAutoBarName() { return getConstraintNameAutoBarName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_NAME"); return this; }

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
    public BsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, VendorConstraintNameAutoBarCQ> _scalarConditionMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorConstraintNameAutoBarCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoBarCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoBarCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, VendorConstraintNameAutoBarCQ> _queryMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorConstraintNameAutoBarCQ subQuery) {
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
    protected Map<String, VendorConstraintNameAutoBarCQ> _myselfExistsMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorConstraintNameAutoBarCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoBarCQ> _myselfInScopeMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorConstraintNameAutoBarCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorConstraintNameAutoBarCB.class.getName(); }
    protected String xCQ() { return VendorConstraintNameAutoBarCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
