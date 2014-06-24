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
 * The base condition-query of VENDOR_LARGE_NAME_901234567890.
 * @author oracleman
 */
public class BsVendorLargeName901234567890CQ extends AbstractBsVendorLargeName901234567890CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeName901234567890CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeName901234567890CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_LARGE_NAME_901234567890) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorLargeName901234567890CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorLargeName901234567890CIQ xcreateCIQ() {
        VendorLargeName901234567890CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorLargeName901234567890CIQ xnewCIQ() {
        return new VendorLargeName901234567890CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_LARGE_NAME_901234567890 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorLargeName901234567890CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorLargeName901234567890CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorLargeName901234567Id;
    public ConditionValue getVendorLargeName901234567Id()
    { if (_vendorLargeName901234567Id == null) { _vendorLargeName901234567Id = nCV(); }
      return _vendorLargeName901234567Id; }
    protected ConditionValue getCValueVendorLargeName901234567Id() { return getVendorLargeName901234567Id(); }

    public Map<String, VendorLargeName90123456RefCQ> getVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList() { return xgetSQueMap("vendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq) { return xkeepSQue("vendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList", sq); }

    public Map<String, VendorLargeName90123456RefCQ> getVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList() { return xgetSQueMap("vendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq) { return xkeepSQue("vendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList", sq); }

    public Map<String, VendorLargeName90123456RefCQ> getVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList() { return xgetSQueMap("vendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq) { return xkeepSQue("vendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList", sq); }

    public Map<String, VendorLargeName90123456RefCQ> getVendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList() { return xgetSQueMap("vendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq) { return xkeepSQue("vendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList", sq); }

    public Map<String, VendorLargeName90123456RefCQ> getVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList() { return xgetSQueMap("vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq) { return xkeepSQue("vendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList", sq); }

    public Map<String, VendorLargeName90123456RefCQ> getVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList() { return xgetSQueMap("vendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq) { return xkeepSQue("vendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList", sq); }
    public Map<String, Object> getVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter() { return xgetSQuePmMap("vendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList"); }
    public String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter(Object pm) { return xkeepSQuePm("vendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName901234567890CQ addOrderBy_VendorLargeName901234567Id_Asc() { regOBA("VENDOR_LARGE_NAME_901234567_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName901234567890CQ addOrderBy_VendorLargeName901234567Id_Desc() { regOBD("VENDOR_LARGE_NAME_901234567_ID"); return this; }

    protected ConditionValue _vendorLargeName9012345Name;
    public ConditionValue getVendorLargeName9012345Name()
    { if (_vendorLargeName9012345Name == null) { _vendorLargeName9012345Name = nCV(); }
      return _vendorLargeName9012345Name; }
    protected ConditionValue getCValueVendorLargeName9012345Name() { return getVendorLargeName9012345Name(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName901234567890CQ addOrderBy_VendorLargeName9012345Name_Asc() { regOBA("VENDOR_LARGE_NAME_9012345_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName901234567890CQ addOrderBy_VendorLargeName9012345Name_Desc() { regOBD("VENDOR_LARGE_NAME_9012345_NAME"); return this; }

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
    public BsVendorLargeName901234567890CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorLargeName901234567890CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorLargeName901234567890CQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorLargeName901234567890CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorLargeName901234567890CQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorLargeName901234567890CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorLargeName901234567890CQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorLargeName901234567890CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorLargeName901234567890CQ> _myselfExistsMap;
    public Map<String, VendorLargeName901234567890CQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorLargeName901234567890CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorLargeName901234567890CQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorLargeName901234567890CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorLargeName901234567890CB.class.getName(); }
    protected String xCQ() { return VendorLargeName901234567890CQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
