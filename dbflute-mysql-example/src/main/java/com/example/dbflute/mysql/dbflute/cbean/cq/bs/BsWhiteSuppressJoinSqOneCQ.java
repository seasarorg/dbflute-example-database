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
 * The base condition-query of white_suppress_join_sq_one.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqOneCQ extends AbstractBsWhiteSuppressJoinSqOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqOneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_suppress_join_sq_one) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqOneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqOneCIQ xcreateCIQ() {
        WhiteSuppressJoinSqOneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqOneCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqOneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_suppress_join_sq_one on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqOneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqOneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _oneId;
    public ConditionValue getOneId() {
        if (_oneId == null) { _oneId = nCV(); }
        return _oneId;
    }
    protected ConditionValue getCValueOneId() { return getOneId(); }

    /** 
     * Add order-by as ascend. <br />
     * ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneId_Asc() { regOBA("ONE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneId_Desc() { regOBD("ONE_ID"); return this; }

    protected ConditionValue _oneName;
    public ConditionValue getOneName() {
        if (_oneName == null) { _oneName = nCV(); }
        return _oneName;
    }
    protected ConditionValue getCValueOneName() { return getOneName(); }

    /** 
     * Add order-by as ascend. <br />
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneName_Asc() { regOBA("ONE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneName_Desc() { regOBD("ONE_NAME"); return this; }

    protected ConditionValue _suppressJoinSqId;
    public ConditionValue getSuppressJoinSqId() {
        if (_suppressJoinSqId == null) { _suppressJoinSqId = nCV(); }
        return _suppressJoinSqId;
    }
    protected ConditionValue getCValueSuppressJoinSqId() { return getSuppressJoinSqId(); }

    protected Map<String, WhiteSuppressJoinSqCQ> _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqMap;
    public Map<String, WhiteSuppressJoinSqCQ> getSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq() { return _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqMap; }
    public String keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq(WhiteSuppressJoinSqCQ sq) {
        if (_suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqMap == null) { _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqMap.size() + 1);
        _suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqMap.put(ky, sq); return "suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqCQ> _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqMap;
    public Map<String, WhiteSuppressJoinSqCQ> getSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq() { return _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqMap; }
    public String keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq(WhiteSuppressJoinSqCQ sq) {
        if (_suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqMap == null) { _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqMap.size() + 1);
        _suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqMap.put(ky, sq); return "suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_SuppressJoinSqId_Asc() { regOBA("SUPPRESS_JOIN_SQ_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_SuppressJoinSqId_Desc() { regOBD("SUPPRESS_JOIN_SQ_ID"); return this; }

    protected ConditionValue _oneAddiId;
    public ConditionValue getOneAddiId() {
        if (_oneAddiId == null) { _oneAddiId = nCV(); }
        return _oneAddiId;
    }
    protected ConditionValue getCValueOneAddiId() { return getOneAddiId(); }

    protected Map<String, WhiteSuppressJoinSqOneAddiCQ> _oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddiMap;
    public Map<String, WhiteSuppressJoinSqOneAddiCQ> getOneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi() { return _oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddiMap; }
    public String keepOneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi(WhiteSuppressJoinSqOneAddiCQ sq) {
        if (_oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddiMap == null) { _oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddiMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddiMap.size() + 1);
        _oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddiMap.put(ky, sq); return "oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqOneAddiCQ> _oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddiMap;
    public Map<String, WhiteSuppressJoinSqOneAddiCQ> getOneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi() { return _oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddiMap; }
    public String keepOneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi(WhiteSuppressJoinSqOneAddiCQ sq) {
        if (_oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddiMap == null) { _oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddiMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddiMap.size() + 1);
        _oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddiMap.put(ky, sq); return "oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneAddiId_Asc() { regOBA("ONE_ADDI_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneAddiId_Desc() { regOBD("ONE_ADDI_ID"); return this; }

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
    public BsWhiteSuppressJoinSqOneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSuppressJoinSqOneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteSuppressJoinSqOneCQ> _scalarConditionMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSuppressJoinSqOneCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSuppressJoinSqOneCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqOneCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSuppressJoinSqOneCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqOneCQ sq) {
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
    protected Map<String, WhiteSuppressJoinSqOneCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSuppressJoinSqOneCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSuppressJoinSqOneCQ> _myselfInScopeMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSuppressJoinSqOneCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqOneCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqOneCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
