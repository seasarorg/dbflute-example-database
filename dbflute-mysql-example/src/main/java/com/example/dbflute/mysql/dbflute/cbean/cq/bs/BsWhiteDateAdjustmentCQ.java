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
 * The base condition-query of white_date_adjustment.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDateAdjustmentCQ extends AbstractBsWhiteDateAdjustmentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDateAdjustmentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDateAdjustmentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_date_adjustment) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDateAdjustmentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDateAdjustmentCIQ xcreateCIQ() {
        WhiteDateAdjustmentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDateAdjustmentCIQ xnewCIQ() {
        return new WhiteDateAdjustmentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_date_adjustment on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDateAdjustmentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDateAdjustmentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _dateAdjustmentId;
    public ConditionValue getDateAdjustmentId() {
        if (_dateAdjustmentId == null) { _dateAdjustmentId = nCV(); }
        return _dateAdjustmentId;
    }
    protected ConditionValue getCValueDateAdjustmentId() { return getDateAdjustmentId(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_DateAdjustmentId_Asc() { regOBA("DATE_ADJUSTMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_DateAdjustmentId_Desc() { regOBD("DATE_ADJUSTMENT_ID"); return this; }

    protected ConditionValue _adjustedDate;
    public ConditionValue getAdjustedDate() {
        if (_adjustedDate == null) { _adjustedDate = nCV(); }
        return _adjustedDate;
    }
    protected ConditionValue getCValueAdjustedDate() { return getAdjustedDate(); }

    /** 
     * Add order-by as ascend. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDate_Asc() { regOBA("ADJUSTED_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDate_Desc() { regOBD("ADJUSTED_DATE"); return this; }

    protected ConditionValue _adjustedDatetime;
    public ConditionValue getAdjustedDatetime() {
        if (_adjustedDatetime == null) { _adjustedDatetime = nCV(); }
        return _adjustedDatetime;
    }
    protected ConditionValue getCValueAdjustedDatetime() { return getAdjustedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDatetime_Asc() { regOBA("ADJUSTED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDatetime_Desc() { regOBD("ADJUSTED_DATETIME"); return this; }

    protected ConditionValue _adjustedTime;
    public ConditionValue getAdjustedTime() {
        if (_adjustedTime == null) { _adjustedTime = nCV(); }
        return _adjustedTime;
    }
    protected ConditionValue getCValueAdjustedTime() { return getAdjustedTime(); }

    /** 
     * Add order-by as ascend. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedTime_Asc() { regOBA("ADJUSTED_TIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * ADJUSTED_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedTime_Desc() { regOBD("ADJUSTED_TIME"); return this; }

    protected ConditionValue _adjustedInteger;
    public ConditionValue getAdjustedInteger() {
        if (_adjustedInteger == null) { _adjustedInteger = nCV(); }
        return _adjustedInteger;
    }
    protected ConditionValue getCValueAdjustedInteger() { return getAdjustedInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedInteger_Asc() { regOBA("ADJUSTED_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * ADJUSTED_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedInteger_Desc() { regOBD("ADJUSTED_INTEGER"); return this; }

    protected ConditionValue _adjustedNamedStringLong;
    public ConditionValue getAdjustedNamedStringLong() {
        if (_adjustedNamedStringLong == null) { _adjustedNamedStringLong = nCV(); }
        return _adjustedNamedStringLong;
    }
    protected ConditionValue getCValueAdjustedNamedStringLong() { return getAdjustedNamedStringLong(); }

    /** 
     * Add order-by as ascend. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedStringLong_Asc() { regOBA("ADJUSTED_NAMED_STRING_LONG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedStringLong_Desc() { regOBD("ADJUSTED_NAMED_STRING_LONG"); return this; }

    protected ConditionValue _adjustedNamedTypedLong;
    public ConditionValue getAdjustedNamedTypedLong() {
        if (_adjustedNamedTypedLong == null) { _adjustedNamedTypedLong = nCV(); }
        return _adjustedNamedTypedLong;
    }
    protected ConditionValue getCValueAdjustedNamedTypedLong() { return getAdjustedNamedTypedLong(); }

    /** 
     * Add order-by as ascend. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedTypedLong_Asc() { regOBA("ADJUSTED_NAMED_TYPED_LONG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedTypedLong_Desc() { regOBD("ADJUSTED_NAMED_TYPED_LONG"); return this; }

    protected ConditionValue _adjustedPinpointStringLong;
    public ConditionValue getAdjustedPinpointStringLong() {
        if (_adjustedPinpointStringLong == null) { _adjustedPinpointStringLong = nCV(); }
        return _adjustedPinpointStringLong;
    }
    protected ConditionValue getCValueAdjustedPinpointStringLong() { return getAdjustedPinpointStringLong(); }

    /** 
     * Add order-by as ascend. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointStringLong_Asc() { regOBA("ADJUSTED_PINPOINT_STRING_LONG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointStringLong_Desc() { regOBD("ADJUSTED_PINPOINT_STRING_LONG"); return this; }

    protected ConditionValue _adjustedPinpointTypedLong;
    public ConditionValue getAdjustedPinpointTypedLong() {
        if (_adjustedPinpointTypedLong == null) { _adjustedPinpointTypedLong = nCV(); }
        return _adjustedPinpointTypedLong;
    }
    protected ConditionValue getCValueAdjustedPinpointTypedLong() { return getAdjustedPinpointTypedLong(); }

    /** 
     * Add order-by as ascend. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointTypedLong_Asc() { regOBA("ADJUSTED_PINPOINT_TYPED_LONG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointTypedLong_Desc() { regOBD("ADJUSTED_PINPOINT_TYPED_LONG"); return this; }

    protected ConditionValue _adjustedPlainLong;
    public ConditionValue getAdjustedPlainLong() {
        if (_adjustedPlainLong == null) { _adjustedPlainLong = nCV(); }
        return _adjustedPlainLong;
    }
    protected ConditionValue getCValueAdjustedPlainLong() { return getAdjustedPlainLong(); }

    /** 
     * Add order-by as ascend. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPlainLong_Asc() { regOBA("ADJUSTED_PLAIN_LONG"); return this; }

    /**
     * Add order-by as descend. <br />
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPlainLong_Desc() { regOBD("ADJUSTED_PLAIN_LONG"); return this; }

    protected ConditionValue _adjustedString;
    public ConditionValue getAdjustedString() {
        if (_adjustedString == null) { _adjustedString = nCV(); }
        return _adjustedString;
    }
    protected ConditionValue getCValueAdjustedString() { return getAdjustedString(); }

    /** 
     * Add order-by as ascend. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedString_Asc() { regOBA("ADJUSTED_STRING"); return this; }

    /**
     * Add order-by as descend. <br />
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedString_Desc() { regOBD("ADJUSTED_STRING"); return this; }

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
    public BsWhiteDateAdjustmentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteDateAdjustmentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteDateAdjustmentCQ> _scalarConditionMap;
    public Map<String, WhiteDateAdjustmentCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteDateAdjustmentCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteDateAdjustmentCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteDateAdjustmentCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteDateAdjustmentCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteDateAdjustmentCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteDateAdjustmentCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteDateAdjustmentCQ sq) {
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
    protected Map<String, WhiteDateAdjustmentCQ> _myselfExistsMap;
    public Map<String, WhiteDateAdjustmentCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteDateAdjustmentCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteDateAdjustmentCQ> _myselfInScopeMap;
    public Map<String, WhiteDateAdjustmentCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteDateAdjustmentCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDateAdjustmentCB.class.getName(); }
    protected String xCQ() { return WhiteDateAdjustmentCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
