package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR_LARGE_DATA_REF.
 * @author oracleman
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
     * {select ... from ... left outer join (select * from VENDOR_LARGE_DATA_REF) where FOO = [value] ...}
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
     * {select ... from ... left outer join VENDOR_LARGE_DATA_REF on ... and FOO = [value] ...}
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
    public ConditionValue getLargeDataRefId()
    { if (_largeDataRefId == null) { _largeDataRefId = nCV(); }
      return _largeDataRefId; }
    protected ConditionValue getCValueLargeDataRefId() { return getLargeDataRefId(); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList() { return xgetSQueMap("largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList() { return xgetSQueMap("largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList() { return xgetSQueMap("largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList() { return xgetSQueMap("largeDataRefId_InScopeRelation_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataRefId_InScopeRelation_VendorLargeDataRefSelfList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList() { return xgetSQueMap("largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList() { return xgetSQueMap("largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList", sq); }
    public Map<String, Object> getLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter() { return xgetSQuePmMap("largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList"); }
    public String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter(Object pm) { return xkeepSQuePm("largeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataRefId_Asc() { regOBA("LARGE_DATA_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataRefId_Desc() { regOBD("LARGE_DATA_REF_ID"); return this; }

    protected ConditionValue _largeDataId;
    public ConditionValue getLargeDataId()
    { if (_largeDataId == null) { _largeDataId = nCV(); }
      return _largeDataId; }
    protected ConditionValue getCValueLargeDataId() { return getLargeDataId(); }

    public Map<String, VendorLargeDataCQ> getLargeDataId_InScopeRelation_VendorLargeData() { return xgetSQueMap("largeDataId_InScopeRelation_VendorLargeData"); }
    public String keepLargeDataId_InScopeRelation_VendorLargeData(VendorLargeDataCQ sq) { return xkeepSQue("largeDataId_InScopeRelation_VendorLargeData", sq); }

    public Map<String, VendorLargeDataCQ> getLargeDataId_NotInScopeRelation_VendorLargeData() { return xgetSQueMap("largeDataId_NotInScopeRelation_VendorLargeData"); }
    public String keepLargeDataId_NotInScopeRelation_VendorLargeData(VendorLargeDataCQ sq) { return xkeepSQue("largeDataId_NotInScopeRelation_VendorLargeData", sq); }

    /** 
     * Add order-by as ascend. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataId_Asc() { regOBA("LARGE_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_LargeDataId_Desc() { regOBD("LARGE_DATA_ID"); return this; }

    protected ConditionValue _dateIndex;
    public ConditionValue getDateIndex()
    { if (_dateIndex == null) { _dateIndex = nCV(); }
      return _dateIndex; }
    protected ConditionValue getCValueDateIndex() { return getDateIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateIndex_Asc() { regOBA("DATE_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateIndex_Desc() { regOBD("DATE_INDEX"); return this; }

    protected ConditionValue _dateNoIndex;
    public ConditionValue getDateNoIndex()
    { if (_dateNoIndex == null) { _dateNoIndex = nCV(); }
      return _dateNoIndex; }
    protected ConditionValue getCValueDateNoIndex() { return getDateNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateNoIndex_Asc() { regOBA("DATE_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_DateNoIndex_Desc() { regOBD("DATE_NO_INDEX"); return this; }

    protected ConditionValue _timestampIndex;
    public ConditionValue getTimestampIndex()
    { if (_timestampIndex == null) { _timestampIndex = nCV(); }
      return _timestampIndex; }
    protected ConditionValue getCValueTimestampIndex() { return getTimestampIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampIndex_Asc() { regOBA("TIMESTAMP_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampIndex_Desc() { regOBD("TIMESTAMP_INDEX"); return this; }

    protected ConditionValue _timestampNoIndex;
    public ConditionValue getTimestampNoIndex()
    { if (_timestampNoIndex == null) { _timestampNoIndex = nCV(); }
      return _timestampNoIndex; }
    protected ConditionValue getCValueTimestampNoIndex() { return getTimestampNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampNoIndex_Asc() { regOBA("TIMESTAMP_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_TimestampNoIndex_Desc() { regOBD("TIMESTAMP_NO_INDEX"); return this; }

    protected ConditionValue _nullableDecimalIndex;
    public ConditionValue getNullableDecimalIndex()
    { if (_nullableDecimalIndex == null) { _nullableDecimalIndex = nCV(); }
      return _nullableDecimalIndex; }
    protected ConditionValue getCValueNullableDecimalIndex() { return getNullableDecimalIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalIndex_Asc() { regOBA("NULLABLE_DECIMAL_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalIndex_Desc() { regOBD("NULLABLE_DECIMAL_INDEX"); return this; }

    protected ConditionValue _nullableDecimalNoIndex;
    public ConditionValue getNullableDecimalNoIndex()
    { if (_nullableDecimalNoIndex == null) { _nullableDecimalNoIndex = nCV(); }
      return _nullableDecimalNoIndex; }
    protected ConditionValue getCValueNullableDecimalNoIndex() { return getNullableDecimalNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalNoIndex_Asc() { regOBA("NULLABLE_DECIMAL_NO_INDEX"); return this; }

    /**
     * Add order-by as descend. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_NullableDecimalNoIndex_Desc() { regOBD("NULLABLE_DECIMAL_NO_INDEX"); return this; }

    protected ConditionValue _selfParentId;
    public ConditionValue getSelfParentId()
    { if (_selfParentId == null) { _selfParentId = nCV(); }
      return _selfParentId; }
    protected ConditionValue getCValueSelfParentId() { return getSelfParentId(); }

    public Map<String, VendorLargeDataRefCQ> getSelfParentId_InScopeRelation_VendorLargeDataRefSelf() { return xgetSQueMap("selfParentId_InScopeRelation_VendorLargeDataRefSelf"); }
    public String keepSelfParentId_InScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ sq) { return xkeepSQue("selfParentId_InScopeRelation_VendorLargeDataRefSelf", sq); }

    public Map<String, VendorLargeDataRefCQ> getSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf() { return xgetSQueMap("selfParentId_NotInScopeRelation_VendorLargeDataRefSelf"); }
    public String keepSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ sq) { return xkeepSQue("selfParentId_NotInScopeRelation_VendorLargeDataRefSelf", sq); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataRefCQ addOrderBy_SelfParentId_Asc() { regOBA("SELF_PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
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
    public BsVendorLargeDataRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorLargeDataRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorLargeDataCQ queryVendorLargeData() {
        return getConditionQueryVendorLargeData();
    }
    public VendorLargeDataCQ getConditionQueryVendorLargeData() {
        String prop = "vendorLargeData";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorLargeData()); xsetupOuterJoinVendorLargeData(); }
        return xgetQueRlMap(prop);
    }
    protected VendorLargeDataCQ xcreateQueryVendorLargeData() {
        String nrp = xresolveNRP("VENDOR_LARGE_DATA_REF", "vendorLargeData"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorLargeDataCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorLargeData", nrp);
    }
    protected void xsetupOuterJoinVendorLargeData() { xregOutJo("vendorLargeData"); }
    public boolean hasConditionQueryVendorLargeData() { return xhasQueRlMap("vendorLargeData"); }

    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorLargeDataRefCQ queryVendorLargeDataRefSelf() {
        return getConditionQueryVendorLargeDataRefSelf();
    }
    public VendorLargeDataRefCQ getConditionQueryVendorLargeDataRefSelf() {
        String prop = "vendorLargeDataRefSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorLargeDataRefSelf()); xsetupOuterJoinVendorLargeDataRefSelf(); }
        return xgetQueRlMap(prop);
    }
    protected VendorLargeDataRefCQ xcreateQueryVendorLargeDataRefSelf() {
        String nrp = xresolveNRP("VENDOR_LARGE_DATA_REF", "vendorLargeDataRefSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorLargeDataRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorLargeDataRefSelf", nrp);
    }
    protected void xsetupOuterJoinVendorLargeDataRefSelf() { xregOutJo("vendorLargeDataRefSelf"); }
    public boolean hasConditionQueryVendorLargeDataRefSelf() { return xhasQueRlMap("vendorLargeDataRefSelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorLargeDataRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorLargeDataRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorLargeDataRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorLargeDataRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorLargeDataRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorLargeDataRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorLargeDataRefCQ> _myselfExistsMap;
    public Map<String, VendorLargeDataRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorLargeDataRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorLargeDataRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorLargeDataRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

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
