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
 * The base condition-query of purchase_payment.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchasePaymentCQ extends AbstractBsPurchasePaymentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchasePaymentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchasePaymentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from purchase_payment) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PurchasePaymentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PurchasePaymentCIQ xcreateCIQ() {
        PurchasePaymentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PurchasePaymentCIQ xnewCIQ() {
        return new PurchasePaymentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join purchase_payment on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PurchasePaymentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PurchasePaymentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchasePaymentId;
    public ConditionValue getPurchasePaymentId()
    { if (_purchasePaymentId == null) { _purchasePaymentId = nCV(); }
      return _purchasePaymentId; }
    protected ConditionValue getCValuePurchasePaymentId() { return getPurchasePaymentId(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PurchasePaymentId_Asc() { regOBA("purchase_payment_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PurchasePaymentId_Desc() { regOBD("purchase_payment_id"); return this; }

    protected ConditionValue _purchaseId;
    public ConditionValue getPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    public Map<String, PurchaseCQ> getPurchaseId_InScopeRelation_Purchase() { return xgetSQueMap("purchaseId_InScopeRelation_Purchase"); }
    public String keepPurchaseId_InScopeRelation_Purchase(PurchaseCQ sq) { return xkeepSQue("purchaseId_InScopeRelation_Purchase", sq); }

    public Map<String, PurchaseCQ> getPurchaseId_NotInScopeRelation_Purchase() { return xgetSQueMap("purchaseId_NotInScopeRelation_Purchase"); }
    public String keepPurchaseId_NotInScopeRelation_Purchase(PurchaseCQ sq) { return xkeepSQue("purchaseId_NotInScopeRelation_Purchase", sq); }

    /** 
     * Add order-by as ascend. <br />
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PurchaseId_Asc() { regOBA("purchase_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PurchaseId_Desc() { regOBD("purchase_id"); return this; }

    protected ConditionValue _paymentAmount;
    public ConditionValue getPaymentAmount()
    { if (_paymentAmount == null) { _paymentAmount = nCV(); }
      return _paymentAmount; }
    protected ConditionValue getCValuePaymentAmount() { return getPaymentAmount(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PaymentAmount_Asc() { regOBA("payment_amount"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PaymentAmount_Desc() { regOBD("payment_amount"); return this; }

    protected ConditionValue _paymentDatetime;
    public ConditionValue getPaymentDatetime()
    { if (_paymentDatetime == null) { _paymentDatetime = nCV(); }
      return _paymentDatetime; }
    protected ConditionValue getCValuePaymentDatetime() { return getPaymentDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PaymentDatetime_Asc() { regOBA("payment_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PaymentDatetime_Desc() { regOBD("payment_datetime"); return this; }

    protected ConditionValue _paymentMethodCode;
    public ConditionValue getPaymentMethodCode()
    { if (_paymentMethodCode == null) { _paymentMethodCode = nCV(); }
      return _paymentMethodCode; }
    protected ConditionValue getCValuePaymentMethodCode() { return getPaymentMethodCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PaymentMethodCode_Asc() { regOBA("payment_method_code"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_PaymentMethodCode_Desc() { regOBD("payment_method_code"); return this; }

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
    public BsPurchasePaymentCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsPurchasePaymentCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

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
    public BsPurchasePaymentCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsPurchasePaymentCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchasePaymentCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsPurchasePaymentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPurchasePaymentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PurchasePaymentCQ bq = (PurchasePaymentCQ)bqs;
        PurchasePaymentCQ uq = (PurchasePaymentCQ)uqs;
        if (bq.hasConditionQueryPurchase()) {
            uq.queryPurchase().reflectRelationOnUnionQuery(bq.queryPurchase(), uq.queryPurchase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by my purchase_id, named 'purchase'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchase() {
        return getConditionQueryPurchase();
    }
    public PurchaseCQ getConditionQueryPurchase() {
        String prop = "purchase";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchase()); xsetupOuterJoinPurchase(); }
        return xgetQueRlMap(prop);
    }
    protected PurchaseCQ xcreateQueryPurchase() {
        String nrp = xresolveNRP("purchase_payment", "purchase"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchase", nrp);
    }
    protected void xsetupOuterJoinPurchase() { xregOutJo("purchase"); }
    public boolean hasConditionQueryPurchase() { return xhasQueRlMap("purchase"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PurchasePaymentCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PurchasePaymentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PurchasePaymentCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PurchasePaymentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PurchasePaymentCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PurchasePaymentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PurchasePaymentCQ> _myselfExistsMap;
    public Map<String, PurchasePaymentCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PurchasePaymentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PurchasePaymentCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PurchasePaymentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PurchasePaymentCB.class.getName(); }
    protected String xCQ() { return PurchasePaymentCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
