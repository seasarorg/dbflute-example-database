package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR_LARGE_DATA.
 * @author oracleman
 */
public class BsVendorLargeDataCQ extends AbstractBsVendorLargeDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_LARGE_DATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorLargeDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorLargeDataCIQ xcreateCIQ() {
        VendorLargeDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorLargeDataCIQ xnewCIQ() {
        return new VendorLargeDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_LARGE_DATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorLargeDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorLargeDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _largeDataId;
    public ConditionValue getLargeDataId() {
        if (_largeDataId == null) { _largeDataId = nCV(); }
        return _largeDataId;
    }
    protected ConditionValue getCValueLargeDataId() { return getLargeDataId(); }

    protected Map<String, VendorLargeDataRefCQ> _largeDataId_ExistsReferrer_VendorLargeDataRefListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataId_ExistsReferrer_VendorLargeDataRefList() { return _largeDataId_ExistsReferrer_VendorLargeDataRefListMap; }
    public String keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) {
        if (_largeDataId_ExistsReferrer_VendorLargeDataRefListMap == null) { _largeDataId_ExistsReferrer_VendorLargeDataRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_ExistsReferrer_VendorLargeDataRefListMap.size() + 1);
        _largeDataId_ExistsReferrer_VendorLargeDataRefListMap.put(ky, sq); return "largeDataId_ExistsReferrer_VendorLargeDataRefList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataId_NotExistsReferrer_VendorLargeDataRefListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataId_NotExistsReferrer_VendorLargeDataRefList() { return _largeDataId_NotExistsReferrer_VendorLargeDataRefListMap; }
    public String keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) {
        if (_largeDataId_NotExistsReferrer_VendorLargeDataRefListMap == null) { _largeDataId_NotExistsReferrer_VendorLargeDataRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_NotExistsReferrer_VendorLargeDataRefListMap.size() + 1);
        _largeDataId_NotExistsReferrer_VendorLargeDataRefListMap.put(ky, sq); return "largeDataId_NotExistsReferrer_VendorLargeDataRefList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList() { return _largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefListMap; }
    public String keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) {
        if (_largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefListMap == null) { _largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefListMap.size() + 1);
        _largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefListMap.put(ky, sq); return "largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataId_InScopeRelation_VendorLargeDataRefListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataId_InScopeRelation_VendorLargeDataRefList() { return _largeDataId_InScopeRelation_VendorLargeDataRefListMap; }
    public String keepLargeDataId_InScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ sq) {
        if (_largeDataId_InScopeRelation_VendorLargeDataRefListMap == null) { _largeDataId_InScopeRelation_VendorLargeDataRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_InScopeRelation_VendorLargeDataRefListMap.size() + 1);
        _largeDataId_InScopeRelation_VendorLargeDataRefListMap.put(ky, sq); return "largeDataId_InScopeRelation_VendorLargeDataRefList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataId_NotInScopeRelation_VendorLargeDataRefListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataId_NotInScopeRelation_VendorLargeDataRefList() { return _largeDataId_NotInScopeRelation_VendorLargeDataRefListMap; }
    public String keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ sq) {
        if (_largeDataId_NotInScopeRelation_VendorLargeDataRefListMap == null) { _largeDataId_NotInScopeRelation_VendorLargeDataRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_NotInScopeRelation_VendorLargeDataRefListMap.size() + 1);
        _largeDataId_NotInScopeRelation_VendorLargeDataRefListMap.put(ky, sq); return "largeDataId_NotInScopeRelation_VendorLargeDataRefList." + ky;
    }

    protected Map<String, VendorLargeDataRefCQ> _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListMap;
    public Map<String, VendorLargeDataRefCQ> getLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList() { return _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListMap; }
    public String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) {
        if (_largeDataId_QueryDerivedReferrer_VendorLargeDataRefListMap == null) { _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_largeDataId_QueryDerivedReferrer_VendorLargeDataRefListMap.size() + 1);
        _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListMap.put(ky, sq); return "largeDataId_QueryDerivedReferrer_VendorLargeDataRefList." + ky;
    }
    protected Map<String, Object> _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameterMap;
    public Map<String, Object> getLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter() { return _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameterMap; }
    public String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(Object vl) {
        if (_largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameterMap == null) { _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameterMap.size() + 1);
        _largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameterMap.put(ky, vl); return "largeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_LargeDataId_Asc() { regOBA("LARGE_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_LargeDataId_Desc() { regOBD("LARGE_DATA_ID"); return this; }

    protected ConditionValue _stringIndex;
    public ConditionValue getStringIndex() {
        if (_stringIndex == null) { _stringIndex = nCV(); }
        return _stringIndex;
    }
    protected ConditionValue getCValueStringIndex() { return getStringIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringIndex_Asc() { regOBA("STRING_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringIndex_Desc() { regOBD("STRING_INDEX"); return this; }

    protected ConditionValue _stringNoIndex;
    public ConditionValue getStringNoIndex() {
        if (_stringNoIndex == null) { _stringNoIndex = nCV(); }
        return _stringNoIndex;
    }
    protected ConditionValue getCValueStringNoIndex() { return getStringNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringNoIndex_Asc() { regOBA("STRING_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringNoIndex_Desc() { regOBD("STRING_NO_INDEX"); return this; }

    protected ConditionValue _stringUniqueIndex;
    public ConditionValue getStringUniqueIndex() {
        if (_stringUniqueIndex == null) { _stringUniqueIndex = nCV(); }
        return _stringUniqueIndex;
    }
    protected ConditionValue getCValueStringUniqueIndex() { return getStringUniqueIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringUniqueIndex_Asc() { regOBA("STRING_UNIQUE_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringUniqueIndex_Desc() { regOBD("STRING_UNIQUE_INDEX"); return this; }

    protected ConditionValue _intflgIndex;
    public ConditionValue getIntflgIndex() {
        if (_intflgIndex == null) { _intflgIndex = nCV(); }
        return _intflgIndex;
    }
    protected ConditionValue getCValueIntflgIndex() { return getIntflgIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_IntflgIndex_Asc() { regOBA("INTFLG_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_IntflgIndex_Desc() { regOBD("INTFLG_INDEX"); return this; }

    protected ConditionValue _numericIntegerIndex;
    public ConditionValue getNumericIntegerIndex() {
        if (_numericIntegerIndex == null) { _numericIntegerIndex = nCV(); }
        return _numericIntegerIndex;
    }
    protected ConditionValue getCValueNumericIntegerIndex() { return getNumericIntegerIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerIndex_Asc() { regOBA("NUMERIC_INTEGER_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerIndex_Desc() { regOBD("NUMERIC_INTEGER_INDEX"); return this; }

    protected ConditionValue _numericIntegerNoIndex;
    public ConditionValue getNumericIntegerNoIndex() {
        if (_numericIntegerNoIndex == null) { _numericIntegerNoIndex = nCV(); }
        return _numericIntegerNoIndex;
    }
    protected ConditionValue getCValueNumericIntegerNoIndex() { return getNumericIntegerNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerNoIndex_Asc() { regOBA("NUMERIC_INTEGER_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerNoIndex_Desc() { regOBD("NUMERIC_INTEGER_NO_INDEX"); return this; }

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
    public BsVendorLargeDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorLargeDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, VendorLargeDataCQ> _scalarConditionMap;
    public Map<String, VendorLargeDataCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorLargeDataCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorLargeDataCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorLargeDataCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorLargeDataCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorLargeDataCQ> _queryMyselfDerivedMap;
    public Map<String, VendorLargeDataCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorLargeDataCQ sq) {
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
    protected Map<String, VendorLargeDataCQ> _myselfExistsMap;
    public Map<String, VendorLargeDataCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorLargeDataCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorLargeDataCQ> _myselfInScopeMap;
    public Map<String, VendorLargeDataCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorLargeDataCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorLargeDataCB.class.getName(); }
    protected String xCQ() { return VendorLargeDataCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
