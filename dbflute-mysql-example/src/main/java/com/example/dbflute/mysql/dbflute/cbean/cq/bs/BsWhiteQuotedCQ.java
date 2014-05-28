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
 * The base condition-query of white_quoted.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteQuotedCQ extends AbstractBsWhiteQuotedCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteQuotedCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteQuotedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_quoted) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteQuotedCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteQuotedCIQ xcreateCIQ() {
        WhiteQuotedCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteQuotedCIQ xnewCIQ() {
        return new WhiteQuotedCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_quoted on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteQuotedCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteQuotedCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _select;
    public ConditionValue getSelect() {
        if (_select == null) { _select = nCV(); }
        return _select;
    }
    protected ConditionValue getCValueSelect() { return getSelect(); }

    protected Map<String, WhiteQuotedRefCQ> _select_ExistsReferrer_WhiteQuotedRefListMap;
    public Map<String, WhiteQuotedRefCQ> getSelect_ExistsReferrer_WhiteQuotedRefList() { return _select_ExistsReferrer_WhiteQuotedRefListMap; }
    public String keepSelect_ExistsReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq) {
        if (_select_ExistsReferrer_WhiteQuotedRefListMap == null) { _select_ExistsReferrer_WhiteQuotedRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_select_ExistsReferrer_WhiteQuotedRefListMap.size() + 1);
        _select_ExistsReferrer_WhiteQuotedRefListMap.put(ky, sq); return "select_ExistsReferrer_WhiteQuotedRefList." + ky;
    }

    protected Map<String, WhiteQuotedRefCQ> _select_NotExistsReferrer_WhiteQuotedRefListMap;
    public Map<String, WhiteQuotedRefCQ> getSelect_NotExistsReferrer_WhiteQuotedRefList() { return _select_NotExistsReferrer_WhiteQuotedRefListMap; }
    public String keepSelect_NotExistsReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq) {
        if (_select_NotExistsReferrer_WhiteQuotedRefListMap == null) { _select_NotExistsReferrer_WhiteQuotedRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_select_NotExistsReferrer_WhiteQuotedRefListMap.size() + 1);
        _select_NotExistsReferrer_WhiteQuotedRefListMap.put(ky, sq); return "select_NotExistsReferrer_WhiteQuotedRefList." + ky;
    }

    protected Map<String, WhiteQuotedRefCQ> _select_SpecifyDerivedReferrer_WhiteQuotedRefListMap;
    public Map<String, WhiteQuotedRefCQ> getSelect_SpecifyDerivedReferrer_WhiteQuotedRefList() { return _select_SpecifyDerivedReferrer_WhiteQuotedRefListMap; }
    public String keepSelect_SpecifyDerivedReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq) {
        if (_select_SpecifyDerivedReferrer_WhiteQuotedRefListMap == null) { _select_SpecifyDerivedReferrer_WhiteQuotedRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_select_SpecifyDerivedReferrer_WhiteQuotedRefListMap.size() + 1);
        _select_SpecifyDerivedReferrer_WhiteQuotedRefListMap.put(ky, sq); return "select_SpecifyDerivedReferrer_WhiteQuotedRefList." + ky;
    }

    protected Map<String, WhiteQuotedRefCQ> _select_InScopeRelation_WhiteQuotedRefListMap;
    public Map<String, WhiteQuotedRefCQ> getSelect_InScopeRelation_WhiteQuotedRefList() { return _select_InScopeRelation_WhiteQuotedRefListMap; }
    public String keepSelect_InScopeRelation_WhiteQuotedRefList(WhiteQuotedRefCQ sq) {
        if (_select_InScopeRelation_WhiteQuotedRefListMap == null) { _select_InScopeRelation_WhiteQuotedRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_select_InScopeRelation_WhiteQuotedRefListMap.size() + 1);
        _select_InScopeRelation_WhiteQuotedRefListMap.put(ky, sq); return "select_InScopeRelation_WhiteQuotedRefList." + ky;
    }

    protected Map<String, WhiteQuotedRefCQ> _select_NotInScopeRelation_WhiteQuotedRefListMap;
    public Map<String, WhiteQuotedRefCQ> getSelect_NotInScopeRelation_WhiteQuotedRefList() { return _select_NotInScopeRelation_WhiteQuotedRefListMap; }
    public String keepSelect_NotInScopeRelation_WhiteQuotedRefList(WhiteQuotedRefCQ sq) {
        if (_select_NotInScopeRelation_WhiteQuotedRefListMap == null) { _select_NotInScopeRelation_WhiteQuotedRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_select_NotInScopeRelation_WhiteQuotedRefListMap.size() + 1);
        _select_NotInScopeRelation_WhiteQuotedRefListMap.put(ky, sq); return "select_NotInScopeRelation_WhiteQuotedRefList." + ky;
    }

    protected Map<String, WhiteQuotedRefCQ> _select_QueryDerivedReferrer_WhiteQuotedRefListMap;
    public Map<String, WhiteQuotedRefCQ> getSelect_QueryDerivedReferrer_WhiteQuotedRefList() { return _select_QueryDerivedReferrer_WhiteQuotedRefListMap; }
    public String keepSelect_QueryDerivedReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq) {
        if (_select_QueryDerivedReferrer_WhiteQuotedRefListMap == null) { _select_QueryDerivedReferrer_WhiteQuotedRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_select_QueryDerivedReferrer_WhiteQuotedRefListMap.size() + 1);
        _select_QueryDerivedReferrer_WhiteQuotedRefListMap.put(ky, sq); return "select_QueryDerivedReferrer_WhiteQuotedRefList." + ky;
    }
    protected Map<String, Object> _select_QueryDerivedReferrer_WhiteQuotedRefListParameterMap;
    public Map<String, Object> getSelect_QueryDerivedReferrer_WhiteQuotedRefListParameter() { return _select_QueryDerivedReferrer_WhiteQuotedRefListParameterMap; }
    public String keepSelect_QueryDerivedReferrer_WhiteQuotedRefListParameter(Object vl) {
        if (_select_QueryDerivedReferrer_WhiteQuotedRefListParameterMap == null) { _select_QueryDerivedReferrer_WhiteQuotedRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_select_QueryDerivedReferrer_WhiteQuotedRefListParameterMap.size() + 1);
        _select_QueryDerivedReferrer_WhiteQuotedRefListParameterMap.put(ky, vl); return "select_QueryDerivedReferrer_WhiteQuotedRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedCQ addOrderBy_Select_Asc() { regOBA("SELECT"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedCQ addOrderBy_Select_Desc() { regOBD("SELECT"); return this; }

    protected ConditionValue _from;
    public ConditionValue getFrom() {
        if (_from == null) { _from = nCV(); }
        return _from;
    }
    protected ConditionValue getCValueFrom() { return getFrom(); }

    /** 
     * Add order-by as ascend. <br />
     * FROM: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedCQ addOrderBy_From_Asc() { regOBA("FROM"); return this; }

    /**
     * Add order-by as descend. <br />
     * FROM: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedCQ addOrderBy_From_Desc() { regOBD("FROM"); return this; }

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
    public BsWhiteQuotedCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteQuotedCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteQuotedCQ> _scalarConditionMap;
    public Map<String, WhiteQuotedCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteQuotedCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteQuotedCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteQuotedCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteQuotedCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteQuotedCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteQuotedCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteQuotedCQ sq) {
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
    protected Map<String, WhiteQuotedCQ> _myselfExistsMap;
    public Map<String, WhiteQuotedCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteQuotedCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteQuotedCQ> _myselfInScopeMap;
    public Map<String, WhiteQuotedCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteQuotedCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteQuotedCB.class.getName(); }
    protected String xCQ() { return WhiteQuotedCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
