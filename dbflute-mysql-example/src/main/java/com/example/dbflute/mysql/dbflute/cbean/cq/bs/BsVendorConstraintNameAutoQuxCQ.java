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
 * The base condition-query of vendor_constraint_name_auto_qux.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorConstraintNameAutoQuxCQ extends AbstractBsVendorConstraintNameAutoQuxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoQuxCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorConstraintNameAutoQuxCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_constraint_name_auto_qux) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorConstraintNameAutoQuxCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorConstraintNameAutoQuxCIQ xcreateCIQ() {
        VendorConstraintNameAutoQuxCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorConstraintNameAutoQuxCIQ xnewCIQ() {
        return new VendorConstraintNameAutoQuxCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_constraint_name_auto_qux on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorConstraintNameAutoQuxCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorConstraintNameAutoQuxCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoQuxId;
    public ConditionValue getConstraintNameAutoQuxId() {
        if (_constraintNameAutoQuxId == null) { _constraintNameAutoQuxId = nCV(); }
        return _constraintNameAutoQuxId;
    }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return getConstraintNameAutoQuxId(); }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList." + key;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery) {
        if (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.put(key, subQuery); return "constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList." + key;
    }
    protected Map<String, Object> _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap;
    public Map<String, Object> getConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap; }
    public String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object parameterValue) {
        if (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap == null) { _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.size() + 1);
        _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.put(key, parameterValue); return "constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    protected ConditionValue _constraintNameAutoQuxName;
    public ConditionValue getConstraintNameAutoQuxName() {
        if (_constraintNameAutoQuxName == null) { _constraintNameAutoQuxName = nCV(); }
        return _constraintNameAutoQuxName;
    }
    protected ConditionValue getCValueConstraintNameAutoQuxName() { return getConstraintNameAutoQuxName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_QUX_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_QUX_NAME"); return this; }

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
    public BsVendorConstraintNameAutoQuxCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorConstraintNameAutoQuxCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, VendorConstraintNameAutoQuxCQ> _scalarConditionMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorConstraintNameAutoQuxCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoQuxCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoQuxCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, VendorConstraintNameAutoQuxCQ> _queryMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorConstraintNameAutoQuxCQ subQuery) {
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
    protected Map<String, VendorConstraintNameAutoQuxCQ> _myselfExistsMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorConstraintNameAutoQuxCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoQuxCQ> _myselfInScopeMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorConstraintNameAutoQuxCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorConstraintNameAutoQuxCB.class.getName(); }
    protected String xCQ() { return VendorConstraintNameAutoQuxCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
