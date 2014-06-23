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
 * The base condition-query of vendor_date_fk.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorDateFkCQ extends AbstractBsVendorDateFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorDateFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorDateFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_date_fk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorDateFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorDateFkCIQ xcreateCIQ() {
        VendorDateFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorDateFkCIQ xnewCIQ() {
        return new VendorDateFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_date_fk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorDateFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorDateFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _barId;
    public ConditionValue getBarId()
    { if (_barId == null) { _barId = nCV(); }
      return _barId; }
    protected ConditionValue getCValueBarId() { return getBarId(); }

    /** 
     * Add order-by as ascend. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarId_Asc() { regOBA("bar_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarId_Desc() { regOBD("bar_id"); return this; }

    protected ConditionValue _barDate;
    public ConditionValue getBarDate()
    { if (_barDate == null) { _barDate = nCV(); }
      return _barDate; }
    protected ConditionValue getCValueBarDate() { return getBarDate(); }

    /** 
     * Add order-by as ascend. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarDate_Asc() { regOBA("bar_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarDate_Desc() { regOBD("bar_date"); return this; }

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
    public BsVendorDateFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorDateFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorDateFkCQ bq = (VendorDateFkCQ)bqs;
        VendorDateFkCQ uq = (VendorDateFkCQ)uqs;
        if (bq.hasConditionQueryVendorDatePk()) {
            uq.queryVendorDatePk().reflectRelationOnUnionQuery(bq.queryVendorDatePk(), uq.queryVendorDatePk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorDatePkCQ queryVendorDatePk() {
        return getConditionQueryVendorDatePk();
    }
    public VendorDatePkCQ getConditionQueryVendorDatePk() {
        String prop = "vendorDatePk";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorDatePk()); xsetupOuterJoinVendorDatePk(); }
        return xgetQueRlMap(prop);
    }
    protected VendorDatePkCQ xcreateQueryVendorDatePk() {
        String nrp = xresolveNRP("vendor_date_fk", "vendorDatePk"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorDatePkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorDatePk", nrp);
    }
    protected void xsetupOuterJoinVendorDatePk() { xregOutJo("vendorDatePk"); }
    public boolean hasConditionQueryVendorDatePk() { return xhasQueRlMap("vendorDatePk"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorDateFkCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorDateFkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorDateFkCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorDateFkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorDateFkCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorDateFkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorDateFkCQ> _myselfExistsMap;
    public Map<String, VendorDateFkCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorDateFkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorDateFkCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorDateFkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorDateFkCB.class.getName(); }
    protected String xCQ() { return VendorDateFkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
