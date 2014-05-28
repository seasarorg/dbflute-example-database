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
 * The base condition-query of vendor_large_data_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorLargeDataRefCQ extends AbstractBsVendorLargeDataRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeDataRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_large_data_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorLargeDataRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorLargeDataRefCIQ xcreateCIQ() {
        VendorLargeDataRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorLargeDataRefCIQ xnewCIQ() {
        return new VendorLargeDataRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_large_data_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorLargeDataRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorLargeDataRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _largeDataRefId;
    public ConditionValue getLargeDataRefId() {
        if (_largeDataRefId == null) { _largeDataRefId = nCV(); }
        return _largeDataRefId;
    }
    protected ConditionValue getCValueLargeDataRefId() { return getLargeDataRefId(); }

    protected Map<String, VendorLargeDataRefCQ> _largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList() { return _largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfListMap; }
    public String keepLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) {
        if (_largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfListMap == null) { _largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfListMap.size() + 1);
        _largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfListMap.put(ky, sq); return "largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList() { return _largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfListMap; }
    public String keepLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) {
        if (_largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfListMap == null) { _largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfListMap.size() + 1);
        _largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfListMap.put(ky, sq); return "largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList() { return _largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfListMap; }
    public String keepLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) {
        if (_largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfListMap == null) { _largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfListMap.size() + 1);
        _largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfListMap.put(ky, sq); return "largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataRefId_InScopeRelation_VendorLargeDataRefSelfListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList() { return _largeDataRefId_InScopeRelation_VendorLargeDataRefSelfListMap; }
    public String keepLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) {
        if (_largeDataRefId_InScopeRelation_VendorLargeDataRefSelfListMap == null) { _largeDataRefId_InScopeRelation_VendorLargeDataRefSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataRefId_InScopeRelation_VendorLargeDataRefSelfListMap.size() + 1);
        _largeDataRefId_InScopeRelation_VendorLargeDataRefSelfListMap.put(ky, sq); return "largeDataRefId_InScopeRelation_VendorLargeDataRefSelfList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList() { return _largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfListMap; }
    public String keepLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) {
        if (_largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfListMap == null) { _largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfListMap.size() + 1);
        _largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfListMap.put(ky, sq); return "largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList() { return _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListMap; }
    public String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) {
        if (_largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListMap == null) { _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListMap.size() + 1);
        _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListMap.put(ky, sq); return "largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList." + ky;
    }
    protected Map<String, Object> _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameterMap;
    public Map<String, Object> getLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter() { return _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameterMap; }
    public String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter(Object vl) {
        if (_largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameterMap == null) { _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameterMap.size() + 1);
        _largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameterMap.put(ky, vl); return "largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataRefId_Asc() { regOBA("LARGE_DATA_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataRefId_Desc() { regOBD("LARGE_DATA_REF_ID"); return this; }

    protected ConditionValue _largeDataId;
    public ConditionValue getLargeDataId() {
        if (_largeDataId == null) { _largeDataId = nCV(); }
        return _largeDataId;
    }
    protected ConditionValue getCValueLargeDataId() { return getLargeDataId(); }

    protected Map<String, VendorLargeDataCQ> _largeDataId_InScopeRelation_VendorLargeDataMap;
    public Map<String, VendorLargeDataCQ> getLargeDataId_InScopeRelation_VendorLargeData() { return _largeDataId_InScopeRelation_VendorLargeDataMap; }
    public String keepLargeDataId_InScopeRelation_VendorLargeData(VendorLargeDataCQ sq) {
        if (_largeDataId_InScopeRelation_VendorLargeDataMap == null) { _largeDataId_InScopeRelation_VendorLargeDataMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_InScopeRelation_VendorLargeDataMap.size() + 1);
        _largeDataId_InScopeRelation_VendorLargeDataMap.put(ky, sq); return "largeDataId_InScopeRelation_VendorLargeData." + ky;
    }

    protected Map<String, VendorLargeDataCQ> _largeDataId_NotInScopeRelation_VendorLargeDataMap;
    public Map<String, VendorLargeDataCQ> getLargeDataId_NotInScopeRelation_VendorLargeData() { return _largeDataId_NotInScopeRelation_VendorLargeDataMap; }
    public String keepLargeDataId_NotInScopeRelation_VendorLargeData(VendorLargeDataCQ sq) {
        if (_largeDataId_NotInScopeRelation_VendorLargeDataMap == null) { _largeDataId_NotInScopeRelation_VendorLargeDataMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_NotInScopeRelation_VendorLargeDataMap.size() + 1);
        _largeDataId_NotInScopeRelation_VendorLargeDataMap.put(ky, sq); return "largeDataId_NotInScopeRelation_VendorLargeData." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataId_Asc() { regOBA("LARGE_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataId_Desc() { regOBD("LARGE_DATA_ID"); return this; }

    protected ConditionValue _dateIndex;
    public ConditionValue getDateIndex() {
        if (_dateIndex == null) { _dateIndex = nCV(); }
        return _dateIndex;
    }
    protected ConditionValue getCValueDateIndex() { return getDateIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_INDEX: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateIndex_Asc() { regOBA("DATE_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_INDEX: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateIndex_Desc() { regOBD("DATE_INDEX"); return this; }

    protected ConditionValue _dateNoIndex;
    public ConditionValue getDateNoIndex() {
        if (_dateNoIndex == null) { _dateNoIndex = nCV(); }
        return _dateNoIndex;
    }
    protected ConditionValue getCValueDateNoIndex() { return getDateNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_NO_INDEX: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateNoIndex_Asc() { regOBA("DATE_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_NO_INDEX: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateNoIndex_Desc() { regOBD("DATE_NO_INDEX"); return this; }

    protected ConditionValue _timestampIndex;
    public ConditionValue getTimestampIndex() {
        if (_timestampIndex == null) { _timestampIndex = nCV(); }
        return _timestampIndex;
    }
    protected ConditionValue getCValueTimestampIndex() { return getTimestampIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampIndex_Asc() { regOBA("TIMESTAMP_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampIndex_Desc() { regOBD("TIMESTAMP_INDEX"); return this; }

    protected ConditionValue _timestampNoIndex;
    public ConditionValue getTimestampNoIndex() {
        if (_timestampNoIndex == null) { _timestampNoIndex = nCV(); }
        return _timestampNoIndex;
    }
    protected ConditionValue getCValueTimestampNoIndex() { return getTimestampNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampNoIndex_Asc() { regOBA("TIMESTAMP_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampNoIndex_Desc() { regOBD("TIMESTAMP_NO_INDEX"); return this; }

    protected ConditionValue _nullableDecimalIndex;
    public ConditionValue getNullableDecimalIndex() {
        if (_nullableDecimalIndex == null) { _nullableDecimalIndex = nCV(); }
        return _nullableDecimalIndex;
    }
    protected ConditionValue getCValueNullableDecimalIndex() { return getNullableDecimalIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalIndex_Asc() { regOBA("NULLABLE_DECIMAL_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalIndex_Desc() { regOBD("NULLABLE_DECIMAL_INDEX"); return this; }

    protected ConditionValue _nullableDecimalNoIndex;
    public ConditionValue getNullableDecimalNoIndex() {
        if (_nullableDecimalNoIndex == null) { _nullableDecimalNoIndex = nCV(); }
        return _nullableDecimalNoIndex;
    }
    protected ConditionValue getCValueNullableDecimalNoIndex() { return getNullableDecimalNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalNoIndex_Asc() { regOBA("NULLABLE_DECIMAL_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalNoIndex_Desc() { regOBD("NULLABLE_DECIMAL_NO_INDEX"); return this; }

    protected ConditionValue _selfParentId;
    public ConditionValue getSelfParentId() {
        if (_selfParentId == null) { _selfParentId = nCV(); }
        return _selfParentId;
    }
    protected ConditionValue getCValueSelfParentId() { return getSelfParentId(); }

    protected Map<String, VendorLargeDataRefCQ> _selfParentId_InScopeRelation_VendorLargeDataRefSelfMap;
    public Map<String, VendorLargeDataRefCQ> getSelfParentId_InScopeRelation_VendorLargeDataRefSelf() { return _selfParentId_InScopeRelation_VendorLargeDataRefSelfMap; }
    public String keepSelfParentId_InScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ sq) {
        if (_selfParentId_InScopeRelation_VendorLargeDataRefSelfMap == null) { _selfParentId_InScopeRelation_VendorLargeDataRefSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfParentId_InScopeRelation_VendorLargeDataRefSelfMap.size() + 1);
        _selfParentId_InScopeRelation_VendorLargeDataRefSelfMap.put(ky, sq); return "selfParentId_InScopeRelation_VendorLargeDataRefSelf." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _selfParentId_NotInScopeRelation_VendorLargeDataRefSelfMap;
    public Map<String, VendorLargeDataRefCQ> getSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf() { return _selfParentId_NotInScopeRelation_VendorLargeDataRefSelfMap; }
    public String keepSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ sq) {
        if (_selfParentId_NotInScopeRelation_VendorLargeDataRefSelfMap == null) { _selfParentId_NotInScopeRelation_VendorLargeDataRefSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfParentId_NotInScopeRelation_VendorLargeDataRefSelfMap.size() + 1);
        _selfParentId_NotInScopeRelation_VendorLargeDataRefSelfMap.put(ky, sq); return "selfParentId_NotInScopeRelation_VendorLargeDataRefSelf." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_SelfParentId_Asc() { regOBA("SELF_PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_SelfParentId_Desc() { regOBD("SELF_PARENT_ID"); return this; }

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
    public BsVendorLargeDataRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorLargeDataRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorLargeDataRefCQ bq = (VendorLargeDataRefCQ)bqs;
        VendorLargeDataRefCQ uq = (VendorLargeDataRefCQ)uqs;
        if (bq.hasConditionQueryVendorLargeData()) {
            uq.queryVendorLargeData().reflectRelationOnUnionQuery(bq.queryVendorLargeData(), uq.queryVendorLargeData());
        }
        if (bq.hasConditionQueryVendorLargeDataRefSelf()) {
            uq.queryVendorLargeDataRefSelf().reflectRelationOnUnionQuery(bq.queryVendorLargeDataRefSelf(), uq.queryVendorLargeDataRefSelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorLargeDataCQ queryVendorLargeData() {
        return getConditionQueryVendorLargeData();
    }
    protected VendorLargeDataCQ _conditionQueryVendorLargeData;
    public VendorLargeDataCQ getConditionQueryVendorLargeData() {
        if (_conditionQueryVendorLargeData == null) {
            _conditionQueryVendorLargeData = xcreateQueryVendorLargeData();
            xsetupOuterJoinVendorLargeData();
        }
        return _conditionQueryVendorLargeData;
    }
    protected VendorLargeDataCQ xcreateQueryVendorLargeData() {
        String nrp = resolveNextRelationPath("vendor_large_data_ref", "vendorLargeData");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorLargeDataCQ cq = new VendorLargeDataCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorLargeData");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorLargeData() {
        VendorLargeDataCQ cq = getConditionQueryVendorLargeData();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LARGE_DATA_ID", "LARGE_DATA_ID");
        registerOuterJoin(cq, joinOnMap, "vendorLargeData");
    }
    public boolean hasConditionQueryVendorLargeData() {
        return _conditionQueryVendorLargeData != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorLargeDataRefCQ queryVendorLargeDataRefSelf() {
        return getConditionQueryVendorLargeDataRefSelf();
    }
    protected VendorLargeDataRefCQ _conditionQueryVendorLargeDataRefSelf;
    public VendorLargeDataRefCQ getConditionQueryVendorLargeDataRefSelf() {
        if (_conditionQueryVendorLargeDataRefSelf == null) {
            _conditionQueryVendorLargeDataRefSelf = xcreateQueryVendorLargeDataRefSelf();
            xsetupOuterJoinVendorLargeDataRefSelf();
        }
        return _conditionQueryVendorLargeDataRefSelf;
    }
    protected VendorLargeDataRefCQ xcreateQueryVendorLargeDataRefSelf() {
        String nrp = resolveNextRelationPath("vendor_large_data_ref", "vendorLargeDataRefSelf");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorLargeDataRefCQ cq = new VendorLargeDataRefCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorLargeDataRefSelf");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorLargeDataRefSelf() {
        VendorLargeDataRefCQ cq = getConditionQueryVendorLargeDataRefSelf();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("SELF_PARENT_ID", "LARGE_DATA_REF_ID");
        registerOuterJoin(cq, joinOnMap, "vendorLargeDataRefSelf");
    }
    public boolean hasConditionQueryVendorLargeDataRefSelf() {
        return _conditionQueryVendorLargeDataRefSelf != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, VendorLargeDataRefCQ> _scalarConditionMap;
    public Map<String, VendorLargeDataRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorLargeDataRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorLargeDataRefCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorLargeDataRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorLargeDataRefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _queryMyselfDerivedMap;
    public Map<String, VendorLargeDataRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorLargeDataRefCQ sq) {
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
    protected Map<String, VendorLargeDataRefCQ> _myselfExistsMap;
    public Map<String, VendorLargeDataRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorLargeDataRefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorLargeDataRefCQ> _myselfInScopeMap;
    public Map<String, VendorLargeDataRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorLargeDataRefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorLargeDataRefCB.class.getName(); }
    protected String xCQ() { return VendorLargeDataRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
