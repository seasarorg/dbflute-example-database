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
 * The base condition-query of white_suppress_join_sq.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqCQ extends AbstractBsWhiteSuppressJoinSqCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_suppress_join_sq) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqCIQ xcreateCIQ() {
        WhiteSuppressJoinSqCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_suppress_join_sq on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _suppressJoinSqId;
    public ConditionValue getSuppressJoinSqId() {
        if (_suppressJoinSqId == null) { _suppressJoinSqId = nCV(); }
        return _suppressJoinSqId;
    }
    protected ConditionValue getCValueSuppressJoinSqId() { return getSuppressJoinSqId(); }

    protected Map<String, WhiteSuppressJoinSqOneCQ> _suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOneMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne() { return _suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOneMap; }
    public String keepSuppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) {
        if (_suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOneMap == null) { _suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOneMap.size() + 1);
        _suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOneMap.put(ky, sq); return "suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqOneCQ> _suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOneMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne() { return _suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOneMap; }
    public String keepSuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) {
        if (_suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOneMap == null) { _suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOneMap.size() + 1);
        _suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOneMap.put(ky, sq); return "suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqOneCQ> _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOneMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne() { return _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOneMap; }
    public String keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) {
        if (_suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOneMap == null) { _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOneMap.size() + 1);
        _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOneMap.put(ky, sq); return "suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqOneCQ> _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOneMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne() { return _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOneMap; }
    public String keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) {
        if (_suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOneMap == null) { _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOneMap.size() + 1);
        _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOneMap.put(ky, sq); return "suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqId_Asc() { regOBA("SUPPRESS_JOIN_SQ_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqId_Desc() { regOBD("SUPPRESS_JOIN_SQ_ID"); return this; }

    protected ConditionValue _suppressJoinSqName;
    public ConditionValue getSuppressJoinSqName() {
        if (_suppressJoinSqName == null) { _suppressJoinSqName = nCV(); }
        return _suppressJoinSqName;
    }
    protected ConditionValue getCValueSuppressJoinSqName() { return getSuppressJoinSqName(); }

    /** 
     * Add order-by as ascend. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqName_Asc() { regOBA("SUPPRESS_JOIN_SQ_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqName_Desc() { regOBD("SUPPRESS_JOIN_SQ_NAME"); return this; }

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
    public BsWhiteSuppressJoinSqCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSuppressJoinSqCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteSuppressJoinSqCQ> _scalarConditionMap;
    public Map<String, WhiteSuppressJoinSqCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSuppressJoinSqCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSuppressJoinSqCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSuppressJoinSqCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSuppressJoinSqCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqCQ sq) {
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
    protected Map<String, WhiteSuppressJoinSqCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSuppressJoinSqCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSuppressJoinSqCQ> _myselfInScopeMap;
    public Map<String, WhiteSuppressJoinSqCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSuppressJoinSqCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
