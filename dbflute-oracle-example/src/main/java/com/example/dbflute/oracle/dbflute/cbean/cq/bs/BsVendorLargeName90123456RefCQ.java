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
 * The base condition-query of VENDOR_LARGE_NAME_90123456_REF.
 * @author oracleman
 */
public class BsVendorLargeName90123456RefCQ extends AbstractBsVendorLargeName90123456RefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeName90123456RefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeName90123456RefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_LARGE_NAME_90123456_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorLargeName90123456RefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorLargeName90123456RefCIQ xcreateCIQ() {
        VendorLargeName90123456RefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorLargeName90123456RefCIQ xnewCIQ() {
        return new VendorLargeName90123456RefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_LARGE_NAME_90123456_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorLargeName90123456RefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorLargeName90123456RefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorLargeName90123RefId;
    public ConditionValue getVendorLargeName90123RefId() {
        if (_vendorLargeName90123RefId == null) { _vendorLargeName90123RefId = nCV(); }
        return _vendorLargeName90123RefId;
    }
    protected ConditionValue getCValueVendorLargeName90123RefId() { return getVendorLargeName90123RefId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName90123RefId_Asc() { regOBA("VENDOR_LARGE_NAME_90123_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName90123RefId_Desc() { regOBD("VENDOR_LARGE_NAME_90123_REF_ID"); return this; }

    protected ConditionValue _vendorLargeName901RefName;
    public ConditionValue getVendorLargeName901RefName() {
        if (_vendorLargeName901RefName == null) { _vendorLargeName901RefName = nCV(); }
        return _vendorLargeName901RefName;
    }
    protected ConditionValue getCValueVendorLargeName901RefName() { return getVendorLargeName901RefName(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901RefName_Asc() { regOBA("VENDOR_LARGE_NAME_901_REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901RefName_Desc() { regOBD("VENDOR_LARGE_NAME_901_REF_NAME"); return this; }

    protected ConditionValue _vendorLargeName901234567Id;
    public ConditionValue getVendorLargeName901234567Id() {
        if (_vendorLargeName901234567Id == null) { _vendorLargeName901234567Id = nCV(); }
        return _vendorLargeName901234567Id;
    }
    protected ConditionValue getCValueVendorLargeName901234567Id() { return getVendorLargeName901234567Id(); }

    protected Map<String, VendorLargeName901234567890CQ> _vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890Map;
    public Map<String, VendorLargeName901234567890CQ> getVendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890() { return _vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890Map; }
    public String keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890(VendorLargeName901234567890CQ sq) {
        if (_vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890Map == null) { _vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890Map = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890Map.size() + 1);
        _vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890Map.put(ky, sq); return "vendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890." + ky;
    }

    protected Map<String, VendorLargeName901234567890CQ> _vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890Map;
    public Map<String, VendorLargeName901234567890CQ> getVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890() { return _vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890Map; }
    public String keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890(VendorLargeName901234567890CQ sq) {
        if (_vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890Map == null) { _vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890Map = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890Map.size() + 1);
        _vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890Map.put(ky, sq); return "vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901234567Id_Asc() { regOBA("VENDOR_LARGE_NAME_901234567_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901234567Id_Desc() { regOBD("VENDOR_LARGE_NAME_901234567_ID"); return this; }

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
    public BsVendorLargeName90123456RefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorLargeName90123456RefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorLargeName90123456RefCQ bq = (VendorLargeName90123456RefCQ)bqs;
        VendorLargeName90123456RefCQ uq = (VendorLargeName90123456RefCQ)uqs;
        if (bq.hasConditionQueryVendorLargeName901234567890()) {
            uq.queryVendorLargeName901234567890().reflectRelationOnUnionQuery(bq.queryVendorLargeName901234567890(), uq.queryVendorLargeName901234567890());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorLargeName901234567890CQ queryVendorLargeName901234567890() {
        return getConditionQueryVendorLargeName901234567890();
    }
    protected VendorLargeName901234567890CQ _conditionQueryVendorLargeName901234567890;
    public VendorLargeName901234567890CQ getConditionQueryVendorLargeName901234567890() {
        if (_conditionQueryVendorLargeName901234567890 == null) {
            _conditionQueryVendorLargeName901234567890 = xcreateQueryVendorLargeName901234567890();
            xsetupOuterJoinVendorLargeName901234567890();
        }
        return _conditionQueryVendorLargeName901234567890;
    }
    protected VendorLargeName901234567890CQ xcreateQueryVendorLargeName901234567890() {
        String nrp = resolveNextRelationPath("VENDOR_LARGE_NAME_90123456_REF", "vendorLargeName901234567890");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorLargeName901234567890CQ cq = new VendorLargeName901234567890CQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorLargeName901234567890");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorLargeName901234567890() {
        VendorLargeName901234567890CQ cq = getConditionQueryVendorLargeName901234567890();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID");
        registerOuterJoin(cq, joinOnMap, "vendorLargeName901234567890");
    }
    public boolean hasConditionQueryVendorLargeName901234567890() {
        return _conditionQueryVendorLargeName901234567890 != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, VendorLargeName90123456RefCQ> _scalarConditionMap;
    public Map<String, VendorLargeName90123456RefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorLargeName90123456RefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorLargeName90123456RefCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorLargeName90123456RefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorLargeName90123456RefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorLargeName90123456RefCQ> _queryMyselfDerivedMap;
    public Map<String, VendorLargeName90123456RefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorLargeName90123456RefCQ sq) {
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
    protected Map<String, VendorLargeName90123456RefCQ> _myselfExistsMap;
    public Map<String, VendorLargeName90123456RefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorLargeName90123456RefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorLargeName90123456RefCQ> _myselfInScopeMap;
    public Map<String, VendorLargeName90123456RefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorLargeName90123456RefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorLargeName90123456RefCB.class.getName(); }
    protected String xCQ() { return VendorLargeName90123456RefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
