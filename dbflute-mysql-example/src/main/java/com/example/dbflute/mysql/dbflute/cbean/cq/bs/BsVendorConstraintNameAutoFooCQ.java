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
 * The base condition-query of vendor_constraint_name_auto_foo.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorConstraintNameAutoFooCQ extends AbstractBsVendorConstraintNameAutoFooCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoFooCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorConstraintNameAutoFooCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_constraint_name_auto_foo) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorConstraintNameAutoFooCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorConstraintNameAutoFooCIQ xcreateCIQ() {
        VendorConstraintNameAutoFooCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorConstraintNameAutoFooCIQ xnewCIQ() {
        return new VendorConstraintNameAutoFooCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_constraint_name_auto_foo on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorConstraintNameAutoFooCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorConstraintNameAutoFooCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoFooId;
    public ConditionValue getConstraintNameAutoFooId() {
        if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
        return _constraintNameAutoFooId;
    }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }
    protected Map<String, Object> _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap;
    public Map<String, Object> getConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap; }
    public String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl) {
        if (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap == null) { _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.size() + 1);
        _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.put(ky, vl); return "constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    protected ConditionValue _constraintNameAutoFooName;
    public ConditionValue getConstraintNameAutoFooName() {
        if (_constraintNameAutoFooName == null) { _constraintNameAutoFooName = nCV(); }
        return _constraintNameAutoFooName;
    }
    protected ConditionValue getCValueConstraintNameAutoFooName() { return getConstraintNameAutoFooName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_FOO_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_FOO_NAME"); return this; }

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
    public BsVendorConstraintNameAutoFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorConstraintNameAutoFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, VendorConstraintNameAutoFooCQ> _scalarConditionMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorConstraintNameAutoFooCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoFooCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoFooCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorConstraintNameAutoFooCQ> _queryMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorConstraintNameAutoFooCQ sq) {
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
    protected Map<String, VendorConstraintNameAutoFooCQ> _myselfExistsMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorConstraintNameAutoFooCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoFooCQ> _myselfInScopeMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorConstraintNameAutoFooCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorConstraintNameAutoFooCB.class.getName(); }
    protected String xCQ() { return VendorConstraintNameAutoFooCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
