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
 * The base condition-query of white_include_query.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteIncludeQueryCQ extends AbstractBsWhiteIncludeQueryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteIncludeQueryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteIncludeQueryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_include_query) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteIncludeQueryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteIncludeQueryCIQ xcreateCIQ() {
        WhiteIncludeQueryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteIncludeQueryCIQ xnewCIQ() {
        return new WhiteIncludeQueryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_include_query on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteIncludeQueryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteIncludeQueryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _includeQueryId;
    public ConditionValue getIncludeQueryId() {
        if (_includeQueryId == null) { _includeQueryId = nCV(); }
        return _includeQueryId;
    }
    protected ConditionValue getCValueIncludeQueryId() { return getIncludeQueryId(); }

    /** 
     * Add order-by as ascend. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryId_Asc() { regOBA("INCLUDE_QUERY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryId_Desc() { regOBD("INCLUDE_QUERY_ID"); return this; }

    protected ConditionValue _includeQueryInteger;
    public ConditionValue getIncludeQueryInteger() {
        if (_includeQueryInteger == null) { _includeQueryInteger = nCV(); }
        return _includeQueryInteger;
    }
    protected ConditionValue getCValueIncludeQueryInteger() { return getIncludeQueryInteger(); }

    protected ConditionValue _includeQueryVarchar;
    public ConditionValue getIncludeQueryVarchar() {
        if (_includeQueryVarchar == null) { _includeQueryVarchar = nCV(); }
        return _includeQueryVarchar;
    }
    protected ConditionValue getCValueIncludeQueryVarchar() { return getIncludeQueryVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryVarchar_Asc() { regOBA("INCLUDE_QUERY_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryVarchar_Desc() { regOBD("INCLUDE_QUERY_VARCHAR"); return this; }

    protected ConditionValue _includeQueryDate;
    public ConditionValue getIncludeQueryDate() {
        if (_includeQueryDate == null) { _includeQueryDate = nCV(); }
        return _includeQueryDate;
    }
    protected ConditionValue getCValueIncludeQueryDate() { return getIncludeQueryDate(); }

    /** 
     * Add order-by as ascend. <br />
     * INCLUDE_QUERY_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryDate_Asc() { regOBA("INCLUDE_QUERY_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INCLUDE_QUERY_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryDate_Desc() { regOBD("INCLUDE_QUERY_DATE"); return this; }

    protected ConditionValue _includeQueryDatetime;
    public ConditionValue getIncludeQueryDatetime() {
        if (_includeQueryDatetime == null) { _includeQueryDatetime = nCV(); }
        return _includeQueryDatetime;
    }
    protected ConditionValue getCValueIncludeQueryDatetime() { return getIncludeQueryDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryDatetime_Asc() { regOBA("INCLUDE_QUERY_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteIncludeQueryCQ addOrderBy_IncludeQueryDatetime_Desc() { regOBD("INCLUDE_QUERY_DATETIME"); return this; }

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
    public BsWhiteIncludeQueryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteIncludeQueryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteIncludeQueryCQ> _scalarConditionMap;
    public Map<String, WhiteIncludeQueryCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteIncludeQueryCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteIncludeQueryCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteIncludeQueryCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteIncludeQueryCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteIncludeQueryCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteIncludeQueryCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteIncludeQueryCQ sq) {
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
    protected Map<String, WhiteIncludeQueryCQ> _myselfExistsMap;
    public Map<String, WhiteIncludeQueryCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteIncludeQueryCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteIncludeQueryCQ> _myselfInScopeMap;
    public Map<String, WhiteIncludeQueryCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteIncludeQueryCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteIncludeQueryCB.class.getName(); }
    protected String xCQ() { return WhiteIncludeQueryCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
