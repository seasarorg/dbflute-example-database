package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of vendor_date_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorDatePkCQ extends AbstractBsVendorDatePkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorDatePkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorDatePkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_date_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorDatePkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorDatePkCIQ xcreateCIQ() {
        VendorDatePkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorDatePkCIQ xnewCIQ() {
        return new VendorDatePkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_date_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorDatePkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorDatePkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _fooDate;
    public ConditionValue getFooDate() {
        if (_fooDate == null) { _fooDate = nCV(); }
        return _fooDate;
    }
    protected ConditionValue getCValueFooDate() { return getFooDate(); }

    /** 
     * Add order-by as ascend. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsVendorDatePkCQ addOrderBy_FooDate_Asc() { regOBA("foo_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsVendorDatePkCQ addOrderBy_FooDate_Desc() { regOBD("foo_date"); return this; }

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
    public BsVendorDatePkCQ addOrderBy_FooName_Asc() { regOBA("foo_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorDatePkCQ addOrderBy_FooName_Desc() { regOBD("foo_name"); return this; }

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
    public BsVendorDatePkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorDatePkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected Map<String, VendorDatePkCQ> _scalarConditionMap;
    public Map<String, VendorDatePkCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorDatePkCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorDatePkCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorDatePkCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorDatePkCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorDatePkCQ> _queryMyselfDerivedMap;
    public Map<String, VendorDatePkCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorDatePkCQ sq) {
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
    protected Map<String, VendorDatePkCQ> _myselfExistsMap;
    public Map<String, VendorDatePkCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorDatePkCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorDatePkCQ> _myselfInScopeMap;
    public Map<String, VendorDatePkCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorDatePkCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorDatePkCB.class.getName(); }
    protected String xCQ() { return VendorDatePkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
