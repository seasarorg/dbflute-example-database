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
 * The base condition-query of white_myself_check.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteMyselfCheckCQ extends AbstractBsWhiteMyselfCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteMyselfCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteMyselfCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_myself_check) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteMyselfCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteMyselfCheckCIQ xcreateCIQ() {
        WhiteMyselfCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteMyselfCheckCIQ xnewCIQ() {
        return new WhiteMyselfCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_myself_check on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteMyselfCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteMyselfCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _myselfCheckId;
    public ConditionValue getMyselfCheckId() {
        if (_myselfCheckId == null) { _myselfCheckId = nCV(); }
        return _myselfCheckId;
    }
    protected ConditionValue getCValueMyselfCheckId() { return getMyselfCheckId(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCheckCQ addOrderBy_MyselfCheckId_Asc() { regOBA("MYSELF_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCheckCQ addOrderBy_MyselfCheckId_Desc() { regOBD("MYSELF_CHECK_ID"); return this; }

    protected ConditionValue _myselfCheckName;
    public ConditionValue getMyselfCheckName() {
        if (_myselfCheckName == null) { _myselfCheckName = nCV(); }
        return _myselfCheckName;
    }
    protected ConditionValue getCValueMyselfCheckName() { return getMyselfCheckName(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCheckCQ addOrderBy_MyselfCheckName_Asc() { regOBA("MYSELF_CHECK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCheckCQ addOrderBy_MyselfCheckName_Desc() { regOBD("MYSELF_CHECK_NAME"); return this; }

    protected ConditionValue _myselfId;
    public ConditionValue getMyselfId() {
        if (_myselfId == null) { _myselfId = nCV(); }
        return _myselfId;
    }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    protected Map<String, WhiteMyselfCQ> _myselfId_InScopeRelation_WhiteMyselfMap;
    public Map<String, WhiteMyselfCQ> getMyselfId_InScopeRelation_WhiteMyself() { return _myselfId_InScopeRelation_WhiteMyselfMap; }
    public String keepMyselfId_InScopeRelation_WhiteMyself(WhiteMyselfCQ sq) {
        if (_myselfId_InScopeRelation_WhiteMyselfMap == null) { _myselfId_InScopeRelation_WhiteMyselfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_InScopeRelation_WhiteMyselfMap.size() + 1);
        _myselfId_InScopeRelation_WhiteMyselfMap.put(ky, sq); return "myselfId_InScopeRelation_WhiteMyself." + ky;
    }

    protected Map<String, WhiteMyselfCQ> _myselfId_NotInScopeRelation_WhiteMyselfMap;
    public Map<String, WhiteMyselfCQ> getMyselfId_NotInScopeRelation_WhiteMyself() { return _myselfId_NotInScopeRelation_WhiteMyselfMap; }
    public String keepMyselfId_NotInScopeRelation_WhiteMyself(WhiteMyselfCQ sq) {
        if (_myselfId_NotInScopeRelation_WhiteMyselfMap == null) { _myselfId_NotInScopeRelation_WhiteMyselfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_NotInScopeRelation_WhiteMyselfMap.size() + 1);
        _myselfId_NotInScopeRelation_WhiteMyselfMap.put(ky, sq); return "myselfId_NotInScopeRelation_WhiteMyself." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCheckCQ addOrderBy_MyselfId_Asc() { regOBA("MYSELF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCheckCQ addOrderBy_MyselfId_Desc() { regOBD("MYSELF_ID"); return this; }

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
    public BsWhiteMyselfCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteMyselfCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteMyselfCheckCQ bq = (WhiteMyselfCheckCQ)bqs;
        WhiteMyselfCheckCQ uq = (WhiteMyselfCheckCQ)uqs;
        if (bq.hasConditionQueryWhiteMyself()) {
            uq.queryWhiteMyself().reflectRelationOnUnionQuery(bq.queryWhiteMyself(), uq.queryWhiteMyself());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteMyselfCQ queryWhiteMyself() {
        return getConditionQueryWhiteMyself();
    }
    protected WhiteMyselfCQ _conditionQueryWhiteMyself;
    public WhiteMyselfCQ getConditionQueryWhiteMyself() {
        if (_conditionQueryWhiteMyself == null) {
            _conditionQueryWhiteMyself = xcreateQueryWhiteMyself();
            xsetupOuterJoinWhiteMyself();
        }
        return _conditionQueryWhiteMyself;
    }
    protected WhiteMyselfCQ xcreateQueryWhiteMyself() {
        String nrp = resolveNextRelationPath("white_myself_check", "whiteMyself");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteMyselfCQ cq = new WhiteMyselfCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteMyself");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteMyself() {
        WhiteMyselfCQ cq = getConditionQueryWhiteMyself();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MYSELF_ID", "MYSELF_ID");
        registerOuterJoin(cq, joinOnMap, "whiteMyself");
    }
    public boolean hasConditionQueryWhiteMyself() {
        return _conditionQueryWhiteMyself != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteMyselfCheckCQ> _scalarConditionMap;
    public Map<String, WhiteMyselfCheckCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteMyselfCheckCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteMyselfCheckCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteMyselfCheckCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteMyselfCheckCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteMyselfCheckCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteMyselfCheckCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteMyselfCheckCQ sq) {
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
    protected Map<String, WhiteMyselfCheckCQ> _myselfExistsMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteMyselfCheckCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteMyselfCheckCQ> _myselfInScopeMap;
    public Map<String, WhiteMyselfCheckCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteMyselfCheckCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteMyselfCheckCB.class.getName(); }
    protected String xCQ() { return WhiteMyselfCheckCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
