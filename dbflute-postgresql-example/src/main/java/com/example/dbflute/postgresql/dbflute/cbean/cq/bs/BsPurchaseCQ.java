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
 * The base condition-query of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseCQ extends AbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from purchase) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PurchaseCIQ xcreateCIQ() {
        PurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PurchaseCIQ xnewCIQ() {
        return new PurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join purchase on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseId;
    public ConditionValue getPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_ExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_ExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_ExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_ExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_NotExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_NotExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_NotExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_NotExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_InScopeRelation_PurchasePaymentList() { return xgetSQueMap("purchaseId_InScopeRelation_PurchasePaymentList"); }
    public String keepPurchaseId_InScopeRelation_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_InScopeRelation_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_NotInScopeRelation_PurchasePaymentList() { return xgetSQueMap("purchaseId_NotInScopeRelation_PurchasePaymentList"); }
    public String keepPurchaseId_NotInScopeRelation_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_NotInScopeRelation_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_QueryDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_QueryDerivedReferrer_PurchasePaymentList", sq); }
    public Map<String, Object> getPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter() { return xgetSQuePmMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(Object pm) { return xkeepSQuePm("purchaseId_QueryDerivedReferrer_PurchasePaymentList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("purchase_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("purchase_id"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return xgetSQueMap("memberId_InScopeRelation_Member"); }
    public String keepMemberId_InScopeRelation_Member(MemberCQ sq) { return xkeepSQue("memberId_InScopeRelation_Member", sq); }

    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return xgetSQueMap("memberId_NotInScopeRelation_Member"); }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_Member", sq); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    public Map<String, ProductCQ> getProductId_InScopeRelation_Product() { return xgetSQueMap("productId_InScopeRelation_Product"); }
    public String keepProductId_InScopeRelation_Product(ProductCQ sq) { return xkeepSQue("productId_InScopeRelation_Product", sq); }

    public Map<String, ProductCQ> getProductId_NotInScopeRelation_Product() { return xgetSQueMap("productId_NotInScopeRelation_Product"); }
    public String keepProductId_NotInScopeRelation_Product(ProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_Product", sq); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ID)product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("product_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ID)product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("product_id"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue getPurchaseDatetime()
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected ConditionValue getCValuePurchaseDatetime() { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入日時)purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("purchase_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入日時)purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("purchase_datetime"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue getPurchaseCount()
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected ConditionValue getCValuePurchaseCount() { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入数量)purchase_count: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("purchase_count"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入数量)purchase_count: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("purchase_count"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue getPurchasePrice()
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected ConditionValue getCValuePurchasePrice() { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入価格)purchase_price: {IX, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("purchase_price"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入価格)purchase_price: {IX, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("purchase_price"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue getPaymentCompleteFlg()
    { if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
      return _paymentCompleteFlg; }
    protected ConditionValue getCValuePaymentCompleteFlg() { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("payment_complete_flg"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("payment_complete_flg"); return this; }

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
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

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
    public BsPurchaseCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

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
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsPurchaseCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

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
    public BsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PurchaseCQ bq = (PurchaseCQ)bqs;
        PurchaseCQ uq = (PurchaseCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)member by my member_id, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    public MemberCQ getConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("purchase", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br />
     * (商品)product by my product_id, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return getConditionQueryProduct();
    }
    public ProductCQ getConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("purchase", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PurchaseCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PurchaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PurchaseCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PurchaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PurchaseCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PurchaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PurchaseCQ> _myselfExistsMap;
    public Map<String, PurchaseCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PurchaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PurchaseCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PurchaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PurchaseCB.class.getName(); }
    protected String xCQ() { return PurchaseCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
