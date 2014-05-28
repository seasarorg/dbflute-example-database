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
 * The base condition-query of white_pg_reserv_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePgReservRefCQ extends AbstractBsWhitePgReservRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePgReservRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePgReservRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_pg_reserv_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePgReservRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePgReservRefCIQ xcreateCIQ() {
        WhitePgReservRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePgReservRefCIQ xnewCIQ() {
        return new WhitePgReservRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_pg_reserv_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePgReservRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePgReservRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refId;
    public ConditionValue getRefId() {
        if (_refId == null) { _refId = nCV(); }
        return _refId;
    }
    protected ConditionValue getCValueRefId() { return getRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_RefId_Asc() { regOBA("REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_RefId_Desc() { regOBD("REF_ID"); return this; }

    protected ConditionValue _classSynonym;
    public ConditionValue getClassSynonym() {
        if (_classSynonym == null) { _classSynonym = nCV(); }
        return _classSynonym;
    }
    protected ConditionValue getCValueClassSynonym() { return getClassSynonym(); }

    protected Map<String, WhitePgReservCQ> _classSynonym_InScopeRelation_WhitePgReservMap;
    public Map<String, WhitePgReservCQ> getClassSynonym_InScopeRelation_WhitePgReserv() { return _classSynonym_InScopeRelation_WhitePgReservMap; }
    public String keepClassSynonym_InScopeRelation_WhitePgReserv(WhitePgReservCQ sq) {
        if (_classSynonym_InScopeRelation_WhitePgReservMap == null) { _classSynonym_InScopeRelation_WhitePgReservMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_InScopeRelation_WhitePgReservMap.size() + 1);
        _classSynonym_InScopeRelation_WhitePgReservMap.put(ky, sq); return "classSynonym_InScopeRelation_WhitePgReserv." + ky;
    }

    protected Map<String, WhitePgReservCQ> _classSynonym_NotInScopeRelation_WhitePgReservMap;
    public Map<String, WhitePgReservCQ> getClassSynonym_NotInScopeRelation_WhitePgReserv() { return _classSynonym_NotInScopeRelation_WhitePgReservMap; }
    public String keepClassSynonym_NotInScopeRelation_WhitePgReserv(WhitePgReservCQ sq) {
        if (_classSynonym_NotInScopeRelation_WhitePgReservMap == null) { _classSynonym_NotInScopeRelation_WhitePgReservMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_NotInScopeRelation_WhitePgReservMap.size() + 1);
        _classSynonym_NotInScopeRelation_WhitePgReservMap.put(ky, sq); return "classSynonym_NotInScopeRelation_WhitePgReserv." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_ClassSynonym_Asc() { regOBA("CLASS"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_ClassSynonym_Desc() { regOBD("CLASS"); return this; }

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
    public BsWhitePgReservRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhitePgReservRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhitePgReservRefCQ bq = (WhitePgReservRefCQ)bqs;
        WhitePgReservRefCQ uq = (WhitePgReservRefCQ)uqs;
        if (bq.hasConditionQueryWhitePgReserv()) {
            uq.queryWhitePgReserv().reflectRelationOnUnionQuery(bq.queryWhitePgReserv(), uq.queryWhitePgReserv());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePgReservCQ queryWhitePgReserv() {
        return getConditionQueryWhitePgReserv();
    }
    protected WhitePgReservCQ _conditionQueryWhitePgReserv;
    public WhitePgReservCQ getConditionQueryWhitePgReserv() {
        if (_conditionQueryWhitePgReserv == null) {
            _conditionQueryWhitePgReserv = xcreateQueryWhitePgReserv();
            xsetupOuterJoinWhitePgReserv();
        }
        return _conditionQueryWhitePgReserv;
    }
    protected WhitePgReservCQ xcreateQueryWhitePgReserv() {
        String nrp = resolveNextRelationPath("white_pg_reserv_ref", "whitePgReserv");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhitePgReservCQ cq = new WhitePgReservCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whitePgReserv");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhitePgReserv() {
        WhitePgReservCQ cq = getConditionQueryWhitePgReserv();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CLASS", "CLASS");
        registerOuterJoin(cq, joinOnMap, "whitePgReserv");
    }
    public boolean hasConditionQueryWhitePgReserv() {
        return _conditionQueryWhitePgReserv != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhitePgReservRefCQ> _scalarConditionMap;
    public Map<String, WhitePgReservRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhitePgReservRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhitePgReservRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhitePgReservRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhitePgReservRefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhitePgReservRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhitePgReservRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhitePgReservRefCQ sq) {
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
    protected Map<String, WhitePgReservRefCQ> _myselfExistsMap;
    public Map<String, WhitePgReservRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhitePgReservRefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhitePgReservRefCQ> _myselfInScopeMap;
    public Map<String, WhitePgReservRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhitePgReservRefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePgReservRefCB.class.getName(); }
    protected String xCQ() { return WhitePgReservRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
