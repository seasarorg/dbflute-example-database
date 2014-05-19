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
 * The base condition-query of white_myself.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteMyselfCQ extends AbstractBsWhiteMyselfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteMyselfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteMyselfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_myself) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteMyselfCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteMyselfCIQ xcreateCIQ() {
        WhiteMyselfCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteMyselfCIQ xnewCIQ() {
        return new WhiteMyselfCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_myself on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteMyselfCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteMyselfCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _myselfId;
    public ConditionValue getMyselfId() {
        if (_myselfId == null) { _myselfId = nCV(); }
        return _myselfId;
    }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    protected Map<String, WhiteMyselfCheckCQ> _myselfId_ExistsReferrer_WhiteMyselfCheckListMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfId_ExistsReferrer_WhiteMyselfCheckList() { return _myselfId_ExistsReferrer_WhiteMyselfCheckListMap; }
    public String keepMyselfId_ExistsReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) {
        if (_myselfId_ExistsReferrer_WhiteMyselfCheckListMap == null) { _myselfId_ExistsReferrer_WhiteMyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_ExistsReferrer_WhiteMyselfCheckListMap.size() + 1);
        _myselfId_ExistsReferrer_WhiteMyselfCheckListMap.put(ky, sq); return "myselfId_ExistsReferrer_WhiteMyselfCheckList." + ky;
    }

    protected Map<String, WhiteMyselfCheckCQ> _myselfId_NotExistsReferrer_WhiteMyselfCheckListMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfId_NotExistsReferrer_WhiteMyselfCheckList() { return _myselfId_NotExistsReferrer_WhiteMyselfCheckListMap; }
    public String keepMyselfId_NotExistsReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) {
        if (_myselfId_NotExistsReferrer_WhiteMyselfCheckListMap == null) { _myselfId_NotExistsReferrer_WhiteMyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_NotExistsReferrer_WhiteMyselfCheckListMap.size() + 1);
        _myselfId_NotExistsReferrer_WhiteMyselfCheckListMap.put(ky, sq); return "myselfId_NotExistsReferrer_WhiteMyselfCheckList." + ky;
    }

    protected Map<String, WhiteMyselfCheckCQ> _myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckListMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList() { return _myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckListMap; }
    public String keepMyselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) {
        if (_myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckListMap == null) { _myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckListMap.size() + 1);
        _myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckListMap.put(ky, sq); return "myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList." + ky;
    }

    protected Map<String, WhiteMyselfCheckCQ> _myselfId_InScopeRelation_WhiteMyselfCheckListMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfId_InScopeRelation_WhiteMyselfCheckList() { return _myselfId_InScopeRelation_WhiteMyselfCheckListMap; }
    public String keepMyselfId_InScopeRelation_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) {
        if (_myselfId_InScopeRelation_WhiteMyselfCheckListMap == null) { _myselfId_InScopeRelation_WhiteMyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_InScopeRelation_WhiteMyselfCheckListMap.size() + 1);
        _myselfId_InScopeRelation_WhiteMyselfCheckListMap.put(ky, sq); return "myselfId_InScopeRelation_WhiteMyselfCheckList." + ky;
    }

    protected Map<String, WhiteMyselfCheckCQ> _myselfId_NotInScopeRelation_WhiteMyselfCheckListMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfId_NotInScopeRelation_WhiteMyselfCheckList() { return _myselfId_NotInScopeRelation_WhiteMyselfCheckListMap; }
    public String keepMyselfId_NotInScopeRelation_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) {
        if (_myselfId_NotInScopeRelation_WhiteMyselfCheckListMap == null) { _myselfId_NotInScopeRelation_WhiteMyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_NotInScopeRelation_WhiteMyselfCheckListMap.size() + 1);
        _myselfId_NotInScopeRelation_WhiteMyselfCheckListMap.put(ky, sq); return "myselfId_NotInScopeRelation_WhiteMyselfCheckList." + ky;
    }

    protected Map<String, WhiteMyselfCheckCQ> _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfId_QueryDerivedReferrer_WhiteMyselfCheckList() { return _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListMap; }
    public String keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) {
        if (_myselfId_QueryDerivedReferrer_WhiteMyselfCheckListMap == null) { _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_QueryDerivedReferrer_WhiteMyselfCheckListMap.size() + 1);
        _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListMap.put(ky, sq); return "myselfId_QueryDerivedReferrer_WhiteMyselfCheckList." + ky;
    }
    protected Map<String, Object> _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameterMap;
    public Map<String, Object> getMyselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter() { return _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameterMap; }
    public String keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter(Object vl) {
        if (_myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameterMap == null) { _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameterMap.size() + 1);
        _myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameterMap.put(ky, vl); return "myselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfId_Asc() { regOBA("MYSELF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfId_Desc() { regOBD("MYSELF_ID"); return this; }

    protected ConditionValue _myselfName;
    public ConditionValue getMyselfName() {
        if (_myselfName == null) { _myselfName = nCV(); }
        return _myselfName;
    }
    protected ConditionValue getCValueMyselfName() { return getMyselfName(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfName_Asc() { regOBA("MYSELF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfName_Desc() { regOBD("MYSELF_NAME"); return this; }

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
    public BsWhiteMyselfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteMyselfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteMyselfCQ> _scalarConditionMap;
    public Map<String, WhiteMyselfCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteMyselfCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteMyselfCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteMyselfCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteMyselfCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteMyselfCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteMyselfCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteMyselfCQ sq) {
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
    protected Map<String, WhiteMyselfCQ> _myselfExistsMap;
    public Map<String, WhiteMyselfCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteMyselfCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteMyselfCQ> _myselfInScopeMap;
    public Map<String, WhiteMyselfCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteMyselfCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteMyselfCB.class.getName(); }
    protected String xCQ() { return WhiteMyselfCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
