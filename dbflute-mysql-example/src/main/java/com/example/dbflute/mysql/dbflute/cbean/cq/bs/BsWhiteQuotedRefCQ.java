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
 * The base condition-query of white_quoted_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteQuotedRefCQ extends AbstractBsWhiteQuotedRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteQuotedRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteQuotedRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_quoted_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteQuotedRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteQuotedRefCIQ xcreateCIQ() {
        WhiteQuotedRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteQuotedRefCIQ xnewCIQ() {
        return new WhiteQuotedRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_quoted_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteQuotedRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteQuotedRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _where;
    public ConditionValue getWhere() {
        if (_where == null) { _where = nCV(); }
        return _where;
    }
    protected ConditionValue getCValueWhere() { return getWhere(); }

    /** 
     * Add order-by as ascend. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Where_Asc() { regOBA("WHERE"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Where_Desc() { regOBD("WHERE"); return this; }

    protected ConditionValue _order;
    public ConditionValue getOrder() {
        if (_order == null) { _order = nCV(); }
        return _order;
    }
    protected ConditionValue getCValueOrder() { return getOrder(); }

    protected Map<String, WhiteQuotedCQ> _order_InScopeRelation_WhiteQuotedMap;
    public Map<String, WhiteQuotedCQ> getOrder_InScopeRelation_WhiteQuoted() { return _order_InScopeRelation_WhiteQuotedMap; }
    public String keepOrder_InScopeRelation_WhiteQuoted(WhiteQuotedCQ sq) {
        if (_order_InScopeRelation_WhiteQuotedMap == null) { _order_InScopeRelation_WhiteQuotedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_order_InScopeRelation_WhiteQuotedMap.size() + 1);
        _order_InScopeRelation_WhiteQuotedMap.put(ky, sq); return "order_InScopeRelation_WhiteQuoted." + ky;
    }

    protected Map<String, WhiteQuotedCQ> _order_NotInScopeRelation_WhiteQuotedMap;
    public Map<String, WhiteQuotedCQ> getOrder_NotInScopeRelation_WhiteQuoted() { return _order_NotInScopeRelation_WhiteQuotedMap; }
    public String keepOrder_NotInScopeRelation_WhiteQuoted(WhiteQuotedCQ sq) {
        if (_order_NotInScopeRelation_WhiteQuotedMap == null) { _order_NotInScopeRelation_WhiteQuotedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_order_NotInScopeRelation_WhiteQuotedMap.size() + 1);
        _order_NotInScopeRelation_WhiteQuotedMap.put(ky, sq); return "order_NotInScopeRelation_WhiteQuoted." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Order_Asc() { regOBA("ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Order_Desc() { regOBD("ORDER"); return this; }

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
    public BsWhiteQuotedRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteQuotedRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteQuotedRefCQ bq = (WhiteQuotedRefCQ)bqs;
        WhiteQuotedRefCQ uq = (WhiteQuotedRefCQ)uqs;
        if (bq.hasConditionQueryWhiteQuoted()) {
            uq.queryWhiteQuoted().reflectRelationOnUnionQuery(bq.queryWhiteQuoted(), uq.queryWhiteQuoted());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_quoted by my ORDER, named 'whiteQuoted'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteQuotedCQ queryWhiteQuoted() {
        return getConditionQueryWhiteQuoted();
    }
    protected WhiteQuotedCQ _conditionQueryWhiteQuoted;
    public WhiteQuotedCQ getConditionQueryWhiteQuoted() {
        if (_conditionQueryWhiteQuoted == null) {
            _conditionQueryWhiteQuoted = xcreateQueryWhiteQuoted();
            xsetupOuterJoinWhiteQuoted();
        }
        return _conditionQueryWhiteQuoted;
    }
    protected WhiteQuotedCQ xcreateQueryWhiteQuoted() {
        String nrp = resolveNextRelationPath("white_quoted_ref", "whiteQuoted");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteQuotedCQ cq = new WhiteQuotedCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteQuoted");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteQuoted() {
        WhiteQuotedCQ cq = getConditionQueryWhiteQuoted();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("ORDER", "SELECT");
        registerOuterJoin(cq, joinOnMap, "whiteQuoted");
    }
    public boolean hasConditionQueryWhiteQuoted() {
        return _conditionQueryWhiteQuoted != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteQuotedRefCQ> _scalarConditionMap;
    public Map<String, WhiteQuotedRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteQuotedRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteQuotedRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteQuotedRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteQuotedRefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteQuotedRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteQuotedRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteQuotedRefCQ sq) {
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
    protected Map<String, WhiteQuotedRefCQ> _myselfExistsMap;
    public Map<String, WhiteQuotedRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteQuotedRefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteQuotedRefCQ> _myselfInScopeMap;
    public Map<String, WhiteQuotedRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteQuotedRefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteQuotedRefCB.class.getName(); }
    protected String xCQ() { return WhiteQuotedRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
