package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of vendor_inherit_inu.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorInheritInuCQ extends AbstractBsVendorInheritInuCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorInheritInuCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorInheritInuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_inherit_inu) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorInheritInuCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorInheritInuCIQ xcreateCIQ() {
        VendorInheritInuCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorInheritInuCIQ xnewCIQ() {
        return new VendorInheritInuCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_inherit_inu on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorInheritInuCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorInheritInuCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inuId;
    public ConditionValue getInuId()
    { if (_inuId == null) { _inuId = nCV(); }
      return _inuId; }
    protected ConditionValue getCValueInuId() { return getInuId(); }

    /** 
     * Add order-by as ascend. <br />
     * inu_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorInheritInuCQ addOrderBy_InuId_Asc() { regOBA("inu_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * inu_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorInheritInuCQ addOrderBy_InuId_Desc() { regOBD("inu_id"); return this; }

    protected ConditionValue _inuName;
    public ConditionValue getInuName()
    { if (_inuName == null) { _inuName = nCV(); }
      return _inuName; }
    protected ConditionValue getCValueInuName() { return getInuName(); }

    /** 
     * Add order-by as ascend. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorInheritInuCQ addOrderBy_InuName_Asc() { regOBA("inu_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorInheritInuCQ addOrderBy_InuName_Desc() { regOBD("inu_name"); return this; }

    protected ConditionValue _inuDate;
    public ConditionValue getInuDate()
    { if (_inuDate == null) { _inuDate = nCV(); }
      return _inuDate; }
    protected ConditionValue getCValueInuDate() { return getInuDate(); }

    /** 
     * Add order-by as ascend. <br />
     * inu_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorInheritInuCQ addOrderBy_InuDate_Asc() { regOBA("inu_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * inu_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorInheritInuCQ addOrderBy_InuDate_Desc() { regOBD("inu_date"); return this; }

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
    public BsVendorInheritInuCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorInheritInuCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorInheritInuCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorInheritInuCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorInheritInuCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorInheritInuCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorInheritInuCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorInheritInuCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorInheritInuCQ> _myselfExistsMap;
    public Map<String, VendorInheritInuCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorInheritInuCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorInheritInuCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorInheritInuCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorInheritInuCB.class.getName(); }
    protected String xCQ() { return VendorInheritInuCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
