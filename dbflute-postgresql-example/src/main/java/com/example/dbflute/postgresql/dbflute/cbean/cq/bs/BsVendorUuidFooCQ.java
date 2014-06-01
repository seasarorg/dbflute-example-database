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
    public ConditionValue getFooId() {
        if (_fooId == null) { _fooId = nCV(); }
        return _fooId;
    }
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
    public ConditionValue getFooName() {
        if (_fooName == null) { _fooName = nCV(); }
        return _fooName;
    }
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
    public ConditionValue getBarId() {
        if (_barId == null) { _barId = nCV(); }
        return _barId;
    }
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
    public BsVendorUuidFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorUuidFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected VendorUuidBarCQ _conditionQueryVendorUuidBar;
    public VendorUuidBarCQ getConditionQueryVendorUuidBar() {
        if (_conditionQueryVendorUuidBar == null) {
            _conditionQueryVendorUuidBar = xcreateQueryVendorUuidBar();
            xsetupOuterJoinVendorUuidBar();
        }
        return _conditionQueryVendorUuidBar;
    }
    protected VendorUuidBarCQ xcreateQueryVendorUuidBar() {
        String nrp = resolveNextRelationPath("vendor_uuid_foo", "vendorUuidBar");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorUuidBarCQ cq = new VendorUuidBarCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorUuidBar");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorUuidBar() {
        VendorUuidBarCQ cq = getConditionQueryVendorUuidBar();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("bar_id", "bar_id");
        registerOuterJoin(cq, joinOnMap, "vendorUuidBar");
    }
    public boolean hasConditionQueryVendorUuidBar() {
        return _conditionQueryVendorUuidBar != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, VendorUuidFooCQ> _scalarConditionMap;
    public Map<String, VendorUuidFooCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorUuidFooCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorUuidFooCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorUuidFooCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorUuidFooCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorUuidFooCQ> _queryMyselfDerivedMap;
    public Map<String, VendorUuidFooCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorUuidFooCQ sq) {
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
    protected Map<String, VendorUuidFooCQ> _myselfExistsMap;
    public Map<String, VendorUuidFooCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorUuidFooCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorUuidFooCQ> _myselfInScopeMap;
    public Map<String, VendorUuidFooCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorUuidFooCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

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
