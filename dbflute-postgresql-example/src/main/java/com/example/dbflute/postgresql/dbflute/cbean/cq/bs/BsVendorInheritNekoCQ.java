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
 * The base condition-query of vendor_inherit_neko.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorInheritNekoCQ extends AbstractBsVendorInheritNekoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorInheritNekoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorInheritNekoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_inherit_neko) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorInheritNekoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorInheritNekoCIQ xcreateCIQ() {
        VendorInheritNekoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorInheritNekoCIQ xnewCIQ() {
        return new VendorInheritNekoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_inherit_neko on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorInheritNekoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorInheritNekoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * inu_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_InuId_Asc() { regOBA("inu_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * inu_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_InuId_Desc() { regOBD("inu_id"); return this; }

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
    public BsVendorInheritNekoCQ addOrderBy_InuName_Asc() { regOBA("inu_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_InuName_Desc() { regOBD("inu_name"); return this; }

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
    public BsVendorInheritNekoCQ addOrderBy_InuDate_Asc() { regOBA("inu_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * inu_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_InuDate_Desc() { regOBD("inu_date"); return this; }

    protected ConditionValue _nekoId;
    public ConditionValue getNekoId()
    { if (_nekoId == null) { _nekoId = nCV(); }
      return _nekoId; }
    protected ConditionValue getCValueNekoId() { return getNekoId(); }

    /** 
     * Add order-by as ascend. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_NekoId_Asc() { regOBA("neko_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_NekoId_Desc() { regOBD("neko_id"); return this; }

    protected ConditionValue _nekoName;
    public ConditionValue getNekoName()
    { if (_nekoName == null) { _nekoName = nCV(); }
      return _nekoName; }
    protected ConditionValue getCValueNekoName() { return getNekoName(); }

    /** 
     * Add order-by as ascend. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_NekoName_Asc() { regOBA("neko_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_NekoName_Desc() { regOBD("neko_name"); return this; }

    protected ConditionValue _nekoDate;
    public ConditionValue getNekoDate()
    { if (_nekoDate == null) { _nekoDate = nCV(); }
      return _nekoDate; }
    protected ConditionValue getCValueNekoDate() { return getNekoDate(); }

    /** 
     * Add order-by as ascend. <br />
     * neko_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_NekoDate_Asc() { regOBA("neko_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * neko_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorInheritNekoCQ addOrderBy_NekoDate_Desc() { regOBD("neko_date"); return this; }

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
    public BsVendorInheritNekoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorInheritNekoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorInheritNekoCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorInheritNekoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorInheritNekoCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorInheritNekoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorInheritNekoCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorInheritNekoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorInheritNekoCQ> _myselfExistsMap;
    public Map<String, VendorInheritNekoCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorInheritNekoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorInheritNekoCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorInheritNekoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorInheritNekoCB.class.getName(); }
    protected String xCQ() { return VendorInheritNekoCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
