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
 * The base condition-query of product_status.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductStatusCQ extends AbstractBsProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from product_status) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductStatusCIQ xcreateCIQ() {
        ProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductStatusCIQ xnewCIQ() {
        return new ProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join product_status on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode() {
        if (_productStatusCode == null) { _productStatusCode = nCV(); }
        return _productStatusCode;
    }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    protected Map<String, ProductCQ> _productStatusCode_ExistsReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_ExistsReferrer_ProductList() { return _productStatusCode_ExistsReferrer_ProductListMap; }
    public String keepProductStatusCode_ExistsReferrer_ProductList(ProductCQ sq) {
        if (_productStatusCode_ExistsReferrer_ProductListMap == null) { _productStatusCode_ExistsReferrer_ProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_ExistsReferrer_ProductListMap.size() + 1);
        _productStatusCode_ExistsReferrer_ProductListMap.put(ky, sq); return "productStatusCode_ExistsReferrer_ProductList." + ky;
    }

    protected Map<String, ProductCQ> _productStatusCode_NotExistsReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_NotExistsReferrer_ProductList() { return _productStatusCode_NotExistsReferrer_ProductListMap; }
    public String keepProductStatusCode_NotExistsReferrer_ProductList(ProductCQ sq) {
        if (_productStatusCode_NotExistsReferrer_ProductListMap == null) { _productStatusCode_NotExistsReferrer_ProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_NotExistsReferrer_ProductListMap.size() + 1);
        _productStatusCode_NotExistsReferrer_ProductListMap.put(ky, sq); return "productStatusCode_NotExistsReferrer_ProductList." + ky;
    }

    protected Map<String, ProductCQ> _productStatusCode_InScopeRelation_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_InScopeRelation_ProductList() { return _productStatusCode_InScopeRelation_ProductListMap; }
    public String keepProductStatusCode_InScopeRelation_ProductList(ProductCQ sq) {
        if (_productStatusCode_InScopeRelation_ProductListMap == null) { _productStatusCode_InScopeRelation_ProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_InScopeRelation_ProductListMap.size() + 1);
        _productStatusCode_InScopeRelation_ProductListMap.put(ky, sq); return "productStatusCode_InScopeRelation_ProductList." + ky;
    }

    protected Map<String, ProductCQ> _productStatusCode_NotInScopeRelation_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_NotInScopeRelation_ProductList() { return _productStatusCode_NotInScopeRelation_ProductListMap; }
    public String keepProductStatusCode_NotInScopeRelation_ProductList(ProductCQ sq) {
        if (_productStatusCode_NotInScopeRelation_ProductListMap == null) { _productStatusCode_NotInScopeRelation_ProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_ProductListMap.size() + 1);
        _productStatusCode_NotInScopeRelation_ProductListMap.put(ky, sq); return "productStatusCode_NotInScopeRelation_ProductList." + ky;
    }

    protected Map<String, ProductCQ> _productStatusCode_SpecifyDerivedReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_SpecifyDerivedReferrer_ProductList() { return _productStatusCode_SpecifyDerivedReferrer_ProductListMap; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq) {
        if (_productStatusCode_SpecifyDerivedReferrer_ProductListMap == null) { _productStatusCode_SpecifyDerivedReferrer_ProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_SpecifyDerivedReferrer_ProductListMap.size() + 1);
        _productStatusCode_SpecifyDerivedReferrer_ProductListMap.put(ky, sq); return "productStatusCode_SpecifyDerivedReferrer_ProductList." + ky;
    }

    protected Map<String, ProductCQ> _productStatusCode_QueryDerivedReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_QueryDerivedReferrer_ProductList() { return _productStatusCode_QueryDerivedReferrer_ProductListMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductList(ProductCQ sq) {
        if (_productStatusCode_QueryDerivedReferrer_ProductListMap == null) { _productStatusCode_QueryDerivedReferrer_ProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_QueryDerivedReferrer_ProductListMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_ProductListMap.put(ky, sq); return "productStatusCode_QueryDerivedReferrer_ProductList." + ky;
    }
    protected Map<String, Object> _productStatusCode_QueryDerivedReferrer_ProductListParameterMap;
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_ProductListParameter() { return _productStatusCode_QueryDerivedReferrer_ProductListParameterMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object vl) {
        if (_productStatusCode_QueryDerivedReferrer_ProductListParameterMap == null) { _productStatusCode_QueryDerivedReferrer_ProductListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_productStatusCode_QueryDerivedReferrer_ProductListParameterMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_ProductListParameterMap.put(ky, vl); return "productStatusCode_QueryDerivedReferrer_ProductListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (商品ステータスコード)product_status_code: {PK, NotNull, bpchar(3)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("product_status_code"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ステータスコード)product_status_code: {PK, NotNull, bpchar(3)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("product_status_code"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue getProductStatusName() {
        if (_productStatusName == null) { _productStatusName = nCV(); }
        return _productStatusName;
    }
    protected ConditionValue getCValueProductStatusName() { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * product_status_name: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("product_status_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_status_name: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("product_status_name"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * display_order: {UQ, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("display_order"); return this; }

    /**
     * Add order-by as descend. <br />
     * display_order: {UQ, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("display_order"); return this; }

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
    public BsProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, ProductStatusCQ> _scalarConditionMap;
    public Map<String, ProductStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(ProductStatusCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, ProductStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, ProductStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(ProductStatusCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, ProductStatusCQ> _queryMyselfDerivedMap;
    public Map<String, ProductStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(ProductStatusCQ sq) {
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
    protected Map<String, ProductStatusCQ> _myselfExistsMap;
    public Map<String, ProductStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(ProductStatusCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, ProductStatusCQ> _myselfInScopeMap;
    public Map<String, ProductStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(ProductStatusCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductStatusCB.class.getName(); }
    protected String xCQ() { return ProductStatusCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
