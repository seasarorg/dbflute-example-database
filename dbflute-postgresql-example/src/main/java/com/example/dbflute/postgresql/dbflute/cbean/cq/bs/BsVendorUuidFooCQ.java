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
 * The base condition-query of vendor_uuid_foo.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorUuidFooCQ extends AbstractBsVendorUuidFooCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorUuidFooCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorUuidFooCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_uuid_foo) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorUuidFooCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorUuidFooCIQ xcreateCIQ() {
        VendorUuidFooCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorUuidFooCIQ xnewCIQ() {
        return new VendorUuidFooCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_uuid_foo on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorUuidFooCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorUuidFooCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fooId;
    public ConditionValue getFooId()
    { if (_fooId == null) { _fooId = nCV(); }
      return _fooId; }
    protected ConditionValue getCValueFooId() { return getFooId(); }

    /** 
     * Add order-by as ascend. <br />
     * foo_id: {PK, NotNull, uuid(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorUuidFooCQ addOrderBy_FooId_Asc() { regOBA("foo_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * foo_id: {PK, NotNull, uuid(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorUuidFooCQ addOrderBy_FooId_Desc() { regOBD("foo_id"); return this; }

    protected ConditionValue _fooName;
    public ConditionValue getFooName()
    { if (_fooName == null) { _fooName = nCV(); }
      return _fooName; }
    protected ConditionValue getCValueFooName() { return getFooName(); }

    /** 
     * Add order-by as ascend. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorUuidFooCQ addOrderBy_FooName_Asc() { regOBA("foo_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorUuidFooCQ addOrderBy_FooName_Desc() { regOBD("foo_name"); return this; }

    protected ConditionValue _barId;
    public ConditionValue getBarId()
    { if (_barId == null) { _barId = nCV(); }
      return _barId; }
    protected ConditionValue getCValueBarId() { return getBarId(); }

    /** 
     * Add order-by as ascend. <br />
     * bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar}
     * @return this. (NotNull)
     */
    public BsVendorUuidFooCQ addOrderBy_BarId_Asc() { regOBA("bar_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar}
     * @return this. (NotNull)
     */
    public BsVendorUuidFooCQ addOrderBy_BarId_Desc() { regOBD("bar_id"); return this; }

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
    public BsVendorUuidFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorUuidFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorUuidFooCQ bq = (VendorUuidFooCQ)bqs;
        VendorUuidFooCQ uq = (VendorUuidFooCQ)uqs;
        if (bq.hasConditionQueryVendorUuidBar()) {
            uq.queryVendorUuidBar().reflectRelationOnUnionQuery(bq.queryVendorUuidBar(), uq.queryVendorUuidBar());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * vendor_uuid_bar by my bar_id, named 'vendorUuidBar'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorUuidBarCQ queryVendorUuidBar() {
        return getConditionQueryVendorUuidBar();
    }
    public VendorUuidBarCQ getConditionQueryVendorUuidBar() {
        String prop = "vendorUuidBar";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorUuidBar()); xsetupOuterJoinVendorUuidBar(); }
        return xgetQueRlMap(prop);
    }
    protected VendorUuidBarCQ xcreateQueryVendorUuidBar() {
        String nrp = xresolveNRP("vendor_uuid_foo", "vendorUuidBar"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorUuidBarCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorUuidBar", nrp);
    }
    protected void xsetupOuterJoinVendorUuidBar() { xregOutJo("vendorUuidBar"); }
    public boolean hasConditionQueryVendorUuidBar() { return xhasQueRlMap("vendorUuidBar"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorUuidFooCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorUuidFooCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorUuidFooCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorUuidFooCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorUuidFooCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorUuidFooCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorUuidFooCQ> _myselfExistsMap;
    public Map<String, VendorUuidFooCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorUuidFooCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorUuidFooCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorUuidFooCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorUuidFooCB.class.getName(); }
    protected String xCQ() { return VendorUuidFooCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
