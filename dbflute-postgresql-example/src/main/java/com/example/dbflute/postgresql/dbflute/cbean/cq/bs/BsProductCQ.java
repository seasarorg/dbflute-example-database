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
 * The base condition-query of product.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCQ extends AbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductCIQ xcreateCIQ() {
        ProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductCIQ xnewCIQ() {
        return new ProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    public Map<String, PurchaseCQ> getProductId_ExistsReferrer_PurchaseList() { return xgetSQueMap("productId_ExistsReferrer_PurchaseList"); }
    public String keepProductId_ExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, PurchaseCQ> getProductId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("productId_NotExistsReferrer_PurchaseList"); }
    public String keepProductId_NotExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, PurchaseCQ> getProductId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepProductId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, PurchaseCQ> getProductId_InScopeRelation_PurchaseList() { return xgetSQueMap("productId_InScopeRelation_PurchaseList"); }
    public String keepProductId_InScopeRelation_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_InScopeRelation_PurchaseList", sq); }

    public Map<String, PurchaseCQ> getProductId_NotInScopeRelation_PurchaseList() { return xgetSQueMap("productId_NotInScopeRelation_PurchaseList"); }
    public String keepProductId_NotInScopeRelation_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_NotInScopeRelation_PurchaseList", sq); }

    public Map<String, PurchaseCQ> getProductId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> getProductId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_PurchaseList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductId_Asc() { regOBA("product_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductId_Desc() { regOBD("product_id"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductName_Asc() { regOBA("product_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductName_Desc() { regOBD("product_name"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue getProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue getCValueProductHandleCode() { return getProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductHandleCode_Asc() { regOBA("product_handle_code"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductHandleCode_Desc() { regOBD("product_handle_code"); return this; }

    protected ConditionValue _productCategoryCode;
    public ConditionValue getProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue getCValueProductCategoryCode() { return getProductCategoryCode(); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_InScopeRelation_ProductCategory() { return xgetSQueMap("productCategoryCode_InScopeRelation_ProductCategory"); }
    public String keepProductCategoryCode_InScopeRelation_ProductCategory(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_InScopeRelation_ProductCategory", sq); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_NotInScopeRelation_ProductCategory() { return xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductCategory"); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductCategory(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotInScopeRelation_ProductCategory", sq); }

    /** 
     * Add order-by as ascend. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("product_category_code"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("product_category_code"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    public Map<String, ProductStatusCQ> getProductStatusCode_InScopeRelation_ProductStatus() { return xgetSQueMap("productStatusCode_InScopeRelation_ProductStatus"); }
    public String keepProductStatusCode_InScopeRelation_ProductStatus(ProductStatusCQ sq) { return xkeepSQue("productStatusCode_InScopeRelation_ProductStatus", sq); }

    public Map<String, ProductStatusCQ> getProductStatusCode_NotInScopeRelation_ProductStatus() { return xgetSQueMap("productStatusCode_NotInScopeRelation_ProductStatus"); }
    public String keepProductStatusCode_NotInScopeRelation_ProductStatus(ProductStatusCQ sq) { return xkeepSQue("productStatusCode_NotInScopeRelation_ProductStatus", sq); }

    /** 
     * Add order-by as ascend. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("product_status_code"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("product_status_code"); return this; }

    protected ConditionValue _regularPrice;
    public ConditionValue getRegularPrice()
    { if (_regularPrice == null) { _regularPrice = nCV(); }
      return _regularPrice; }
    protected ConditionValue getCValueRegularPrice() { return getRegularPrice(); }

    /** 
     * Add order-by as ascend. <br />
     * regular_price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegularPrice_Asc() { regOBA("regular_price"); return this; }

    /**
     * Add order-by as descend. <br />
     * regular_price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegularPrice_Desc() { regOBD("regular_price"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ProductCQ bq = (ProductCQ)bqs;
        ProductCQ uq = (ProductCQ)uqs;
        if (bq.hasConditionQueryProductCategory()) {
            uq.queryProductCategory().reflectRelationOnUnionQuery(bq.queryProductCategory(), uq.queryProductCategory());
        }
        if (bq.hasConditionQueryProductStatus()) {
            uq.queryProductStatus().reflectRelationOnUnionQuery(bq.queryProductStatus(), uq.queryProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (商品カテゴリ)product_category by my product_category_code, named 'productCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCategoryCQ queryProductCategory() {
        return getConditionQueryProductCategory();
    }
    public ProductCategoryCQ getConditionQueryProductCategory() {
        String prop = "productCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategory()); xsetupOuterJoinProductCategory(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCategoryCQ xcreateQueryProductCategory() {
        String nrp = xresolveNRP("product", "productCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategory", nrp);
    }
    protected void xsetupOuterJoinProductCategory() { xregOutJo("productCategory"); }
    public boolean hasConditionQueryProductCategory() { return xhasQueRlMap("productCategory"); }

    /**
     * Get the condition-query for relation table. <br />
     * (商品ステータス)product_status by my product_status_code, named 'productStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductStatusCQ queryProductStatus() {
        return getConditionQueryProductStatus();
    }
    public ProductStatusCQ getConditionQueryProductStatus() {
        String prop = "productStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductStatus()); xsetupOuterJoinProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected ProductStatusCQ xcreateQueryProductStatus() {
        String nrp = xresolveNRP("product", "productStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productStatus", nrp);
    }
    protected void xsetupOuterJoinProductStatus() { xregOutJo("productStatus"); }
    public boolean hasConditionQueryProductStatus() { return xhasQueRlMap("productStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ProductCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ProductCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ProductCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ProductCQ> _myselfExistsMap;
    public Map<String, ProductCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ProductCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductCB.class.getName(); }
    protected String xCQ() { return ProductCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
