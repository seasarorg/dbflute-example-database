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
 * The base condition-query of white_only_one_to_one_to.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnlyOneToOneToCQ extends AbstractBsWhiteOnlyOneToOneToCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteOnlyOneToOneToCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnlyOneToOneToCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_only_one_to_one_to) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteOnlyOneToOneToCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteOnlyOneToOneToCIQ xcreateCIQ() {
        WhiteOnlyOneToOneToCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteOnlyOneToOneToCIQ xnewCIQ() {
        return new WhiteOnlyOneToOneToCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_only_one_to_one_to on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteOnlyOneToOneToCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteOnlyOneToOneToCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _toId;
    public ConditionValue getToId() {
        if (_toId == null) { _toId = nCV(); }
        return _toId;
    }
    protected ConditionValue getCValueToId() { return getToId(); }

    /** 
     * Add order-by as ascend. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneToCQ addOrderBy_ToId_Asc() { regOBA("TO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneToCQ addOrderBy_ToId_Desc() { regOBD("TO_ID"); return this; }

    protected ConditionValue _toName;
    public ConditionValue getToName() {
        if (_toName == null) { _toName = nCV(); }
        return _toName;
    }
    protected ConditionValue getCValueToName() { return getToName(); }

    /** 
     * Add order-by as ascend. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneToCQ addOrderBy_ToName_Asc() { regOBA("TO_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneToCQ addOrderBy_ToName_Desc() { regOBD("TO_NAME"); return this; }

    protected ConditionValue _fromId;
    public ConditionValue getFromId() {
        if (_fromId == null) { _fromId = nCV(); }
        return _fromId;
    }
    protected ConditionValue getCValueFromId() { return getFromId(); }

    protected Map<String, WhiteOnlyOneToOneFromCQ> _fromId_InScopeRelation_WhiteOnlyOneToOneFromMap;
    public Map<String, WhiteOnlyOneToOneFromCQ> getFromId_InScopeRelation_WhiteOnlyOneToOneFrom() { return _fromId_InScopeRelation_WhiteOnlyOneToOneFromMap; }
    public String keepFromId_InScopeRelation_WhiteOnlyOneToOneFrom(WhiteOnlyOneToOneFromCQ sq) {
        if (_fromId_InScopeRelation_WhiteOnlyOneToOneFromMap == null) { _fromId_InScopeRelation_WhiteOnlyOneToOneFromMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_fromId_InScopeRelation_WhiteOnlyOneToOneFromMap.size() + 1);
        _fromId_InScopeRelation_WhiteOnlyOneToOneFromMap.put(ky, sq); return "fromId_InScopeRelation_WhiteOnlyOneToOneFrom." + ky;
    }

    protected Map<String, WhiteOnlyOneToOneFromCQ> _fromId_NotInScopeRelation_WhiteOnlyOneToOneFromMap;
    public Map<String, WhiteOnlyOneToOneFromCQ> getFromId_NotInScopeRelation_WhiteOnlyOneToOneFrom() { return _fromId_NotInScopeRelation_WhiteOnlyOneToOneFromMap; }
    public String keepFromId_NotInScopeRelation_WhiteOnlyOneToOneFrom(WhiteOnlyOneToOneFromCQ sq) {
        if (_fromId_NotInScopeRelation_WhiteOnlyOneToOneFromMap == null) { _fromId_NotInScopeRelation_WhiteOnlyOneToOneFromMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_fromId_NotInScopeRelation_WhiteOnlyOneToOneFromMap.size() + 1);
        _fromId_NotInScopeRelation_WhiteOnlyOneToOneFromMap.put(ky, sq); return "fromId_NotInScopeRelation_WhiteOnlyOneToOneFrom." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneToCQ addOrderBy_FromId_Asc() { regOBA("FROM_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneToCQ addOrderBy_FromId_Desc() { regOBD("FROM_ID"); return this; }

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
    public BsWhiteOnlyOneToOneToCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteOnlyOneToOneToCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteOnlyOneToOneToCQ bq = (WhiteOnlyOneToOneToCQ)bqs;
        WhiteOnlyOneToOneToCQ uq = (WhiteOnlyOneToOneToCQ)uqs;
        if (bq.hasConditionQueryWhiteOnlyOneToOneFrom()) {
            uq.queryWhiteOnlyOneToOneFrom().reflectRelationOnUnionQuery(bq.queryWhiteOnlyOneToOneFrom(), uq.queryWhiteOnlyOneToOneFrom());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteOnlyOneToOneFromCQ queryWhiteOnlyOneToOneFrom() {
        return getConditionQueryWhiteOnlyOneToOneFrom();
    }
    protected WhiteOnlyOneToOneFromCQ _conditionQueryWhiteOnlyOneToOneFrom;
    public WhiteOnlyOneToOneFromCQ getConditionQueryWhiteOnlyOneToOneFrom() {
        if (_conditionQueryWhiteOnlyOneToOneFrom == null) {
            _conditionQueryWhiteOnlyOneToOneFrom = xcreateQueryWhiteOnlyOneToOneFrom();
            xsetupOuterJoinWhiteOnlyOneToOneFrom();
        }
        return _conditionQueryWhiteOnlyOneToOneFrom;
    }
    protected WhiteOnlyOneToOneFromCQ xcreateQueryWhiteOnlyOneToOneFrom() {
        String nrp = resolveNextRelationPath("white_only_one_to_one_to", "whiteOnlyOneToOneFrom");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteOnlyOneToOneFromCQ cq = new WhiteOnlyOneToOneFromCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteOnlyOneToOneFrom");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteOnlyOneToOneFrom() {
        WhiteOnlyOneToOneFromCQ cq = getConditionQueryWhiteOnlyOneToOneFrom();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FROM_ID", "FROM_ID");
        registerOuterJoin(cq, joinOnMap, "whiteOnlyOneToOneFrom");
    }
    public boolean hasConditionQueryWhiteOnlyOneToOneFrom() {
        return _conditionQueryWhiteOnlyOneToOneFrom != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteOnlyOneToOneToCQ> _scalarConditionMap;
    public Map<String, WhiteOnlyOneToOneToCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteOnlyOneToOneToCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteOnlyOneToOneToCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteOnlyOneToOneToCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteOnlyOneToOneToCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteOnlyOneToOneToCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteOnlyOneToOneToCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteOnlyOneToOneToCQ sq) {
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
    protected Map<String, WhiteOnlyOneToOneToCQ> _myselfExistsMap;
    public Map<String, WhiteOnlyOneToOneToCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteOnlyOneToOneToCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteOnlyOneToOneToCQ> _myselfInScopeMap;
    public Map<String, WhiteOnlyOneToOneToCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteOnlyOneToOneToCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteOnlyOneToOneToCB.class.getName(); }
    protected String xCQ() { return WhiteOnlyOneToOneToCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
