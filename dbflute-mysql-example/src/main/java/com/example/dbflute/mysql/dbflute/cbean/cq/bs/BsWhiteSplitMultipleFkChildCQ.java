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
 * The base condition-query of white_split_multiple_fk_child.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSplitMultipleFkChildCQ extends AbstractBsWhiteSplitMultipleFkChildCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkChildCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSplitMultipleFkChildCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_split_multiple_fk_child) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSplitMultipleFkChildCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSplitMultipleFkChildCIQ xcreateCIQ() {
        WhiteSplitMultipleFkChildCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSplitMultipleFkChildCIQ xnewCIQ() {
        return new WhiteSplitMultipleFkChildCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_split_multiple_fk_child on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSplitMultipleFkChildCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSplitMultipleFkChildCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _childId;
    public ConditionValue getChildId() {
        if (_childId == null) { _childId = nCV(); }
        return _childId;
    }
    protected ConditionValue getCValueChildId() { return getChildId(); }

    /** 
     * Add order-by as ascend. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkChildCQ addOrderBy_ChildId_Asc() { regOBA("CHILD_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkChildCQ addOrderBy_ChildId_Desc() { regOBD("CHILD_ID"); return this; }

    protected ConditionValue _baseId;
    public ConditionValue getBaseId() {
        if (_baseId == null) { _baseId = nCV(); }
        return _baseId;
    }
    protected ConditionValue getCValueBaseId() { return getBaseId(); }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _baseId_InScopeRelation_WhiteSplitMultipleFkBaseMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getBaseId_InScopeRelation_WhiteSplitMultipleFkBase() { return _baseId_InScopeRelation_WhiteSplitMultipleFkBaseMap; }
    public String keepBaseId_InScopeRelation_WhiteSplitMultipleFkBase(WhiteSplitMultipleFkBaseCQ sq) {
        if (_baseId_InScopeRelation_WhiteSplitMultipleFkBaseMap == null) { _baseId_InScopeRelation_WhiteSplitMultipleFkBaseMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_InScopeRelation_WhiteSplitMultipleFkBaseMap.size() + 1);
        _baseId_InScopeRelation_WhiteSplitMultipleFkBaseMap.put(ky, sq); return "baseId_InScopeRelation_WhiteSplitMultipleFkBase." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _baseId_NotInScopeRelation_WhiteSplitMultipleFkBaseMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getBaseId_NotInScopeRelation_WhiteSplitMultipleFkBase() { return _baseId_NotInScopeRelation_WhiteSplitMultipleFkBaseMap; }
    public String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkBase(WhiteSplitMultipleFkBaseCQ sq) {
        if (_baseId_NotInScopeRelation_WhiteSplitMultipleFkBaseMap == null) { _baseId_NotInScopeRelation_WhiteSplitMultipleFkBaseMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_NotInScopeRelation_WhiteSplitMultipleFkBaseMap.size() + 1);
        _baseId_NotInScopeRelation_WhiteSplitMultipleFkBaseMap.put(ky, sq); return "baseId_NotInScopeRelation_WhiteSplitMultipleFkBase." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkChildCQ addOrderBy_BaseId_Asc() { regOBA("BASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkChildCQ addOrderBy_BaseId_Desc() { regOBD("BASE_ID"); return this; }

    protected ConditionValue _childName;
    public ConditionValue getChildName() {
        if (_childName == null) { _childName = nCV(); }
        return _childName;
    }
    protected ConditionValue getCValueChildName() { return getChildName(); }

    /** 
     * Add order-by as ascend. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkChildCQ addOrderBy_ChildName_Asc() { regOBA("CHILD_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkChildCQ addOrderBy_ChildName_Desc() { regOBD("CHILD_NAME"); return this; }

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
    public BsWhiteSplitMultipleFkChildCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSplitMultipleFkChildCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSplitMultipleFkChildCQ bq = (WhiteSplitMultipleFkChildCQ)bqs;
        WhiteSplitMultipleFkChildCQ uq = (WhiteSplitMultipleFkChildCQ)uqs;
        if (bq.hasConditionQueryWhiteSplitMultipleFkBase()) {
            uq.queryWhiteSplitMultipleFkBase().reflectRelationOnUnionQuery(bq.queryWhiteSplitMultipleFkBase(), uq.queryWhiteSplitMultipleFkBase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSplitMultipleFkBaseCQ queryWhiteSplitMultipleFkBase() {
        return getConditionQueryWhiteSplitMultipleFkBase();
    }
    protected WhiteSplitMultipleFkBaseCQ _conditionQueryWhiteSplitMultipleFkBase;
    public WhiteSplitMultipleFkBaseCQ getConditionQueryWhiteSplitMultipleFkBase() {
        if (_conditionQueryWhiteSplitMultipleFkBase == null) {
            _conditionQueryWhiteSplitMultipleFkBase = xcreateQueryWhiteSplitMultipleFkBase();
            xsetupOuterJoinWhiteSplitMultipleFkBase();
        }
        return _conditionQueryWhiteSplitMultipleFkBase;
    }
    protected WhiteSplitMultipleFkBaseCQ xcreateQueryWhiteSplitMultipleFkBase() {
        String nrp = resolveNextRelationPath("white_split_multiple_fk_child", "whiteSplitMultipleFkBase");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSplitMultipleFkBaseCQ cq = new WhiteSplitMultipleFkBaseCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSplitMultipleFkBase");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSplitMultipleFkBase() {
        WhiteSplitMultipleFkBaseCQ cq = getConditionQueryWhiteSplitMultipleFkBase();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("BASE_ID", "BASE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSplitMultipleFkBase");
    }
    public boolean hasConditionQueryWhiteSplitMultipleFkBase() {
        return _conditionQueryWhiteSplitMultipleFkBase != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteSplitMultipleFkChildCQ> _scalarConditionMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSplitMultipleFkChildCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSplitMultipleFkChildCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkChildCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkChildCQ sq) {
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
    protected Map<String, WhiteSplitMultipleFkChildCQ> _myselfExistsMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSplitMultipleFkChildCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSplitMultipleFkChildCQ> _myselfInScopeMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSplitMultipleFkChildCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSplitMultipleFkChildCB.class.getName(); }
    protected String xCQ() { return WhiteSplitMultipleFkChildCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
