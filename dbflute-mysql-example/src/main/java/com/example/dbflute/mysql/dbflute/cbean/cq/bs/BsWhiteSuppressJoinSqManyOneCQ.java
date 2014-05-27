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
 * The base condition-query of white_suppress_join_sq_many_one.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqManyOneCQ extends AbstractBsWhiteSuppressJoinSqManyOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqManyOneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqManyOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_suppress_join_sq_many_one) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqManyOneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqManyOneCIQ xcreateCIQ() {
        WhiteSuppressJoinSqManyOneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqManyOneCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqManyOneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_suppress_join_sq_many_one on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqManyOneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqManyOneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _manyOneId;
    public ConditionValue getManyOneId() {
        if (_manyOneId == null) { _manyOneId = nCV(); }
        return _manyOneId;
    }
    protected ConditionValue getCValueManyOneId() { return getManyOneId(); }

    protected Map<String, WhiteSuppressJoinSqManyCQ> _manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyListMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList() { return _manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyListMap; }
    public String keepManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) {
        if (_manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyListMap == null) { _manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyListMap.size() + 1);
        _manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyListMap.put(ky, sq); return "manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqManyCQ> _manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyListMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList() { return _manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyListMap; }
    public String keepManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) {
        if (_manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyListMap == null) { _manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyListMap.size() + 1);
        _manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyListMap.put(ky, sq); return "manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqManyCQ> _manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyListMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList() { return _manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyListMap; }
    public String keepManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) {
        if (_manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyListMap == null) { _manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyListMap.size() + 1);
        _manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyListMap.put(ky, sq); return "manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqManyCQ> _manyOneId_InScopeRelation_WhiteSuppressJoinSqManyListMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getManyOneId_InScopeRelation_WhiteSuppressJoinSqManyList() { return _manyOneId_InScopeRelation_WhiteSuppressJoinSqManyListMap; }
    public String keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) {
        if (_manyOneId_InScopeRelation_WhiteSuppressJoinSqManyListMap == null) { _manyOneId_InScopeRelation_WhiteSuppressJoinSqManyListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_manyOneId_InScopeRelation_WhiteSuppressJoinSqManyListMap.size() + 1);
        _manyOneId_InScopeRelation_WhiteSuppressJoinSqManyListMap.put(ky, sq); return "manyOneId_InScopeRelation_WhiteSuppressJoinSqManyList." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqManyCQ> _manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyListMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList() { return _manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyListMap; }
    public String keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) {
        if (_manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyListMap == null) { _manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyListMap.size() + 1);
        _manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyListMap.put(ky, sq); return "manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqManyCQ> _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList() { return _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListMap; }
    public String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) {
        if (_manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListMap == null) { _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListMap.size() + 1);
        _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListMap.put(ky, sq); return "manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList." + ky;
    }
    protected Map<String, Object> _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameterMap;
    public Map<String, Object> getManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter() { return _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameterMap; }
    public String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter(Object vl) {
        if (_manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameterMap == null) { _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameterMap.size() + 1);
        _manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameterMap.put(ky, vl); return "manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneId_Asc() { regOBA("MANY_ONE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneId_Desc() { regOBD("MANY_ONE_ID"); return this; }

    protected ConditionValue _manyOneName;
    public ConditionValue getManyOneName() {
        if (_manyOneName == null) { _manyOneName = nCV(); }
        return _manyOneName;
    }
    protected ConditionValue getCValueManyOneName() { return getManyOneName(); }

    /** 
     * Add order-by as ascend. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneName_Asc() { regOBA("MANY_ONE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneName_Desc() { regOBD("MANY_ONE_NAME"); return this; }

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
    public BsWhiteSuppressJoinSqManyOneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSuppressJoinSqManyOneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteSuppressJoinSqManyOneCQ> _scalarConditionMap;
    public Map<String, WhiteSuppressJoinSqManyOneCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSuppressJoinSqManyOneCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSuppressJoinSqManyOneCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSuppressJoinSqManyOneCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqManyOneCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSuppressJoinSqManyOneCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq) {
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
    protected Map<String, WhiteSuppressJoinSqManyOneCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqManyOneCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSuppressJoinSqManyOneCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSuppressJoinSqManyOneCQ> _myselfInScopeMap;
    public Map<String, WhiteSuppressJoinSqManyOneCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSuppressJoinSqManyOneCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqManyOneCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqManyOneCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
