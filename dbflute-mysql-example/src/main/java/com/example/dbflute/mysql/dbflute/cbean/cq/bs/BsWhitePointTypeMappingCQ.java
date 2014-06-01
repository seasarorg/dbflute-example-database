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
 * The base condition-query of white_point_type_mapping.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePointTypeMappingCQ extends AbstractBsWhitePointTypeMappingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePointTypeMappingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePointTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_point_type_mapping) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePointTypeMappingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePointTypeMappingCIQ xcreateCIQ() {
        WhitePointTypeMappingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePointTypeMappingCIQ xnewCIQ() {
        return new WhitePointTypeMappingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_point_type_mapping on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePointTypeMappingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePointTypeMappingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pointTypeMappingId;
    public ConditionValue getPointTypeMappingId() {
        if (_pointTypeMappingId == null) { _pointTypeMappingId = nCV(); }
        return _pointTypeMappingId;
    }
    protected ConditionValue getCValuePointTypeMappingId() { return getPointTypeMappingId(); }

    /** 
     * Add order-by as ascend. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingId_Asc() { regOBA("POINT_TYPE_MAPPING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingId_Desc() { regOBD("POINT_TYPE_MAPPING_ID"); return this; }

    protected ConditionValue _pointTypeMappingMemberName;
    public ConditionValue getPointTypeMappingMemberName() {
        if (_pointTypeMappingMemberName == null) { _pointTypeMappingMemberName = nCV(); }
        return _pointTypeMappingMemberName;
    }
    protected ConditionValue getCValuePointTypeMappingMemberName() { return getPointTypeMappingMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingMemberName_Asc() { regOBA("POINT_TYPE_MAPPING_MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingMemberName_Desc() { regOBD("POINT_TYPE_MAPPING_MEMBER_NAME"); return this; }

    protected ConditionValue _pointTypeMappingPriceCount;
    public ConditionValue getPointTypeMappingPriceCount() {
        if (_pointTypeMappingPriceCount == null) { _pointTypeMappingPriceCount = nCV(); }
        return _pointTypeMappingPriceCount;
    }
    protected ConditionValue getCValuePointTypeMappingPriceCount() { return getPointTypeMappingPriceCount(); }

    /** 
     * Add order-by as ascend. <br />
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingPriceCount_Asc() { regOBA("POINT_TYPE_MAPPING_PRICE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingPriceCount_Desc() { regOBD("POINT_TYPE_MAPPING_PRICE_COUNT"); return this; }

    protected ConditionValue _pointTypeMappingSaleDate;
    public ConditionValue getPointTypeMappingSaleDate() {
        if (_pointTypeMappingSaleDate == null) { _pointTypeMappingSaleDate = nCV(); }
        return _pointTypeMappingSaleDate;
    }
    protected ConditionValue getCValuePointTypeMappingSaleDate() { return getPointTypeMappingSaleDate(); }

    /** 
     * Add order-by as ascend. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingSaleDate_Asc() { regOBA("POINT_TYPE_MAPPING_SALE_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingSaleDate_Desc() { regOBD("POINT_TYPE_MAPPING_SALE_DATE"); return this; }

    protected ConditionValue _pointTypeMappingWantedDatetime;
    public ConditionValue getPointTypeMappingWantedDatetime() {
        if (_pointTypeMappingWantedDatetime == null) { _pointTypeMappingWantedDatetime = nCV(); }
        return _pointTypeMappingWantedDatetime;
    }
    protected ConditionValue getCValuePointTypeMappingWantedDatetime() { return getPointTypeMappingWantedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingWantedDatetime_Asc() { regOBA("POINT_TYPE_MAPPING_WANTED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhitePointTypeMappingCQ addOrderBy_PointTypeMappingWantedDatetime_Desc() { regOBD("POINT_TYPE_MAPPING_WANTED_DATETIME"); return this; }

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
    public BsWhitePointTypeMappingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhitePointTypeMappingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhitePointTypeMappingCQ> _scalarConditionMap;
    public Map<String, WhitePointTypeMappingCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhitePointTypeMappingCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhitePointTypeMappingCQ> _specifyMyselfDerivedMap;
    public Map<String, WhitePointTypeMappingCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhitePointTypeMappingCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhitePointTypeMappingCQ> _queryMyselfDerivedMap;
    public Map<String, WhitePointTypeMappingCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhitePointTypeMappingCQ sq) {
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
    protected Map<String, WhitePointTypeMappingCQ> _myselfExistsMap;
    public Map<String, WhitePointTypeMappingCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhitePointTypeMappingCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhitePointTypeMappingCQ> _myselfInScopeMap;
    public Map<String, WhitePointTypeMappingCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhitePointTypeMappingCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePointTypeMappingCB.class.getName(); }
    protected String xCQ() { return WhitePointTypeMappingCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
