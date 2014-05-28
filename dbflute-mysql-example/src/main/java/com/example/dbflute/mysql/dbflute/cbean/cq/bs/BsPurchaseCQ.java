/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

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
    public ConditionValue getPurchaseId() {
        if (_purchaseId == null) { _purchaseId = nCV(); }
        return _purchaseId;
    }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    protected Map<String, WhitePurchaseReferrerCQ> _purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOneMap;
    public Map<String, WhitePurchaseReferrerCQ> getPurchaseId_ExistsReferrer_WhitePurchaseReferrerAsOne() { return _purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOneMap; }
    public String keepPurchaseId_ExistsReferrer_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq) {
        if (_purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOneMap == null) { _purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOneMap.size() + 1);
        _purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOneMap.put(ky, sq); return "purchaseId_ExistsReferrer_WhitePurchaseReferrerAsOne." + ky;
    }

    protected Map<String, PurchaseCQ> _purchaseId_ExistsReferrer_PurchaseSelfAsOneMap;
    public Map<String, PurchaseCQ> getPurchaseId_ExistsReferrer_PurchaseSelfAsOne() { return _purchaseId_ExistsReferrer_PurchaseSelfAsOneMap; }
    public String keepPurchaseId_ExistsReferrer_PurchaseSelfAsOne(PurchaseCQ sq) {
        if (_purchaseId_ExistsReferrer_PurchaseSelfAsOneMap == null) { _purchaseId_ExistsReferrer_PurchaseSelfAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_ExistsReferrer_PurchaseSelfAsOneMap.size() + 1);
        _purchaseId_ExistsReferrer_PurchaseSelfAsOneMap.put(ky, sq); return "purchaseId_ExistsReferrer_PurchaseSelfAsOne." + ky;
    }

    protected Map<String, WhitePurchaseReferrerCQ> _purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOneMap;
    public Map<String, WhitePurchaseReferrerCQ> getPurchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOne() { return _purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOneMap; }
    public String keepPurchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq) {
        if (_purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOneMap == null) { _purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOneMap.size() + 1);
        _purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOneMap.put(ky, sq); return "purchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOne." + ky;
    }

    protected Map<String, PurchaseCQ> _purchaseId_NotExistsReferrer_PurchaseSelfAsOneMap;
    public Map<String, PurchaseCQ> getPurchaseId_NotExistsReferrer_PurchaseSelfAsOne() { return _purchaseId_NotExistsReferrer_PurchaseSelfAsOneMap; }
    public String keepPurchaseId_NotExistsReferrer_PurchaseSelfAsOne(PurchaseCQ sq) {
        if (_purchaseId_NotExistsReferrer_PurchaseSelfAsOneMap == null) { _purchaseId_NotExistsReferrer_PurchaseSelfAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_NotExistsReferrer_PurchaseSelfAsOneMap.size() + 1);
        _purchaseId_NotExistsReferrer_PurchaseSelfAsOneMap.put(ky, sq); return "purchaseId_NotExistsReferrer_PurchaseSelfAsOne." + ky;
    }

    protected Map<String, PurchaseCQ> _purchaseId_InScopeRelation_PurchaseSelfMap;
    public Map<String, PurchaseCQ> getPurchaseId_InScopeRelation_PurchaseSelf() { return _purchaseId_InScopeRelation_PurchaseSelfMap; }
    public String keepPurchaseId_InScopeRelation_PurchaseSelf(PurchaseCQ sq) {
        if (_purchaseId_InScopeRelation_PurchaseSelfMap == null) { _purchaseId_InScopeRelation_PurchaseSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_InScopeRelation_PurchaseSelfMap.size() + 1);
        _purchaseId_InScopeRelation_PurchaseSelfMap.put(ky, sq); return "purchaseId_InScopeRelation_PurchaseSelf." + ky;
    }

    protected Map<String, WhitePurchaseReferrerCQ> _purchaseId_InScopeRelation_WhitePurchaseReferrerAsOneMap;
    public Map<String, WhitePurchaseReferrerCQ> getPurchaseId_InScopeRelation_WhitePurchaseReferrerAsOne() { return _purchaseId_InScopeRelation_WhitePurchaseReferrerAsOneMap; }
    public String keepPurchaseId_InScopeRelation_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq) {
        if (_purchaseId_InScopeRelation_WhitePurchaseReferrerAsOneMap == null) { _purchaseId_InScopeRelation_WhitePurchaseReferrerAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_InScopeRelation_WhitePurchaseReferrerAsOneMap.size() + 1);
        _purchaseId_InScopeRelation_WhitePurchaseReferrerAsOneMap.put(ky, sq); return "purchaseId_InScopeRelation_WhitePurchaseReferrerAsOne." + ky;
    }

    protected Map<String, PurchaseCQ> _purchaseId_InScopeRelation_PurchaseSelfAsOneMap;
    public Map<String, PurchaseCQ> getPurchaseId_InScopeRelation_PurchaseSelfAsOne() { return _purchaseId_InScopeRelation_PurchaseSelfAsOneMap; }
    public String keepPurchaseId_InScopeRelation_PurchaseSelfAsOne(PurchaseCQ sq) {
        if (_purchaseId_InScopeRelation_PurchaseSelfAsOneMap == null) { _purchaseId_InScopeRelation_PurchaseSelfAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_InScopeRelation_PurchaseSelfAsOneMap.size() + 1);
        _purchaseId_InScopeRelation_PurchaseSelfAsOneMap.put(ky, sq); return "purchaseId_InScopeRelation_PurchaseSelfAsOne." + ky;
    }

    protected Map<String, PurchaseCQ> _purchaseId_NotInScopeRelation_PurchaseSelfMap;
    public Map<String, PurchaseCQ> getPurchaseId_NotInScopeRelation_PurchaseSelf() { return _purchaseId_NotInScopeRelation_PurchaseSelfMap; }
    public String keepPurchaseId_NotInScopeRelation_PurchaseSelf(PurchaseCQ sq) {
        if (_purchaseId_NotInScopeRelation_PurchaseSelfMap == null) { _purchaseId_NotInScopeRelation_PurchaseSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_NotInScopeRelation_PurchaseSelfMap.size() + 1);
        _purchaseId_NotInScopeRelation_PurchaseSelfMap.put(ky, sq); return "purchaseId_NotInScopeRelation_PurchaseSelf." + ky;
    }

    protected Map<String, WhitePurchaseReferrerCQ> _purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOneMap;
    public Map<String, WhitePurchaseReferrerCQ> getPurchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOne() { return _purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOneMap; }
    public String keepPurchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq) {
        if (_purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOneMap == null) { _purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOneMap.size() + 1);
        _purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOneMap.put(ky, sq); return "purchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOne." + ky;
    }

    protected Map<String, PurchaseCQ> _purchaseId_NotInScopeRelation_PurchaseSelfAsOneMap;
    public Map<String, PurchaseCQ> getPurchaseId_NotInScopeRelation_PurchaseSelfAsOne() { return _purchaseId_NotInScopeRelation_PurchaseSelfAsOneMap; }
    public String keepPurchaseId_NotInScopeRelation_PurchaseSelfAsOne(PurchaseCQ sq) {
        if (_purchaseId_NotInScopeRelation_PurchaseSelfAsOneMap == null) { _purchaseId_NotInScopeRelation_PurchaseSelfAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_purchaseId_NotInScopeRelation_PurchaseSelfAsOneMap.size() + 1);
        _purchaseId_NotInScopeRelation_PurchaseSelfAsOneMap.put(ky, sq); return "purchaseId_NotInScopeRelation_PurchaseSelfAsOne." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberCQ> _memberId_InScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return _memberId_InScopeRelation_MemberMap; }
    public String keepMemberId_InScopeRelation_Member(MemberCQ sq) {
        if (_memberId_InScopeRelation_MemberMap == null) { _memberId_InScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberMap.size() + 1);
        _memberId_InScopeRelation_MemberMap.put(ky, sq); return "memberId_InScopeRelation_Member." + ky;
    }

    protected Map<String, MemberCQ> _memberId_NotInScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return _memberId_NotInScopeRelation_MemberMap; }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ sq) {
        if (_memberId_NotInScopeRelation_MemberMap == null) { _memberId_NotInScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberMap.size() + 1);
        _memberId_NotInScopeRelation_MemberMap.put(ky, sq); return "memberId_NotInScopeRelation_Member." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue getProductId() {
        if (_productId == null) { _productId = nCV(); }
        return _productId;
    }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    protected Map<String, ProductCQ> _productId_InScopeRelation_ProductMap;
    public Map<String, ProductCQ> getProductId_InScopeRelation_Product() { return _productId_InScopeRelation_ProductMap; }
    public String keepProductId_InScopeRelation_Product(ProductCQ sq) {
        if (_productId_InScopeRelation_ProductMap == null) { _productId_InScopeRelation_ProductMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_InScopeRelation_ProductMap.size() + 1);
        _productId_InScopeRelation_ProductMap.put(ky, sq); return "productId_InScopeRelation_Product." + ky;
    }

    protected Map<String, ProductCQ> _productId_NotInScopeRelation_ProductMap;
    public Map<String, ProductCQ> getProductId_NotInScopeRelation_Product() { return _productId_NotInScopeRelation_ProductMap; }
    public String keepProductId_NotInScopeRelation_Product(ProductCQ sq) {
        if (_productId_NotInScopeRelation_ProductMap == null) { _productId_NotInScopeRelation_ProductMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_NotInScopeRelation_ProductMap.size() + 1);
        _productId_NotInScopeRelation_ProductMap.put(ky, sq); return "productId_NotInScopeRelation_Product." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue getPurchaseDatetime() {
        if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
        return _purchaseDatetime;
    }
    protected ConditionValue getCValuePurchaseDatetime() { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("PURCHASE_DATETIME"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue getPurchaseCount() {
        if (_purchaseCount == null) { _purchaseCount = nCV(); }
        return _purchaseCount;
    }
    protected ConditionValue getCValuePurchaseCount() { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("PURCHASE_COUNT"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue getPurchasePrice() {
        if (_purchasePrice == null) { _purchasePrice = nCV(); }
        return _purchasePrice;
    }
    protected ConditionValue getCValuePurchasePrice() { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("PURCHASE_PRICE"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue getPaymentCompleteFlg() {
        if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
        return _paymentCompleteFlg;
    }
    protected ConditionValue getCValuePaymentCompleteFlg() { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("PAYMENT_COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("PAYMENT_COMPLETE_FLG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
        if (bq.hasConditionQuerySummaryProduct()) {
            uq.querySummaryProduct().reflectRelationOnUnionQuery(bq.querySummaryProduct(), uq.querySummaryProduct());
        }
        if (bq.hasConditionQuerySummaryWithdrawal()) {
            uq.querySummaryWithdrawal().reflectRelationOnUnionQuery(bq.querySummaryWithdrawal(), uq.querySummaryWithdrawal());
        }
        if (bq.hasConditionQueryWhiteNoPkRelation()) {
            uq.queryWhiteNoPkRelation().reflectRelationOnUnionQuery(bq.queryWhiteNoPkRelation(), uq.queryWhiteNoPkRelation());
        }
        if (bq.hasConditionQueryPurchaseSelf()) {
            uq.queryPurchaseSelf().reflectRelationOnUnionQuery(bq.queryPurchaseSelf(), uq.queryPurchaseSelf());
        }
        if (bq.hasConditionQueryMemberAddressAsSkipRelation()) {
            uq.xsetParameterMapMemberAddressAsSkipRelation(bq.getParameterMapMemberAddressAsSkipRelation());
            uq.getConditionQueryMemberAddressAsSkipRelation().reflectRelationOnUnionQuery(bq.getConditionQueryMemberAddressAsSkipRelation(), uq.getConditionQueryMemberAddressAsSkipRelation());
        }
        if (bq.hasConditionQueryWhitePurchaseReferrerAsOne()) {
            uq.queryWhitePurchaseReferrerAsOne().reflectRelationOnUnionQuery(bq.queryWhitePurchaseReferrerAsOne(), uq.queryWhitePurchaseReferrerAsOne());
        }
        if (bq.hasConditionQueryPurchaseSelfAsOne()) {
            uq.queryPurchaseSelfAsOne().reflectRelationOnUnionQuery(bq.queryPurchaseSelfAsOne(), uq.queryPurchaseSelfAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)member by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    protected MemberCQ _conditionQueryMember;
    public MemberCQ getConditionQueryMember() {
        if (_conditionQueryMember == null) {
            _conditionQueryMember = xcreateQueryMember();
            xsetupOuterJoinMember();
        }
        return _conditionQueryMember;
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = resolveNextRelationPath("purchase", "member");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberCQ cq = new MemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("member");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMember() {
        MemberCQ cq = getConditionQueryMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    public boolean hasConditionQueryMember() {
        return _conditionQueryMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (商品)product by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return getConditionQueryProduct();
    }
    protected ProductCQ _conditionQueryProduct;
    public ProductCQ getConditionQueryProduct() {
        if (_conditionQueryProduct == null) {
            _conditionQueryProduct = xcreateQueryProduct();
            xsetupOuterJoinProduct();
        }
        return _conditionQueryProduct;
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = resolveNextRelationPath("purchase", "product");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        ProductCQ cq = new ProductCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("product");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinProduct() {
        ProductCQ cq = getConditionQueryProduct();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PRODUCT_ID", "PRODUCT_ID");
        registerOuterJoin(cq, joinOnMap, "product");
    }
    public boolean hasConditionQueryProduct() {
        return _conditionQueryProduct != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public SummaryProductCQ querySummaryProduct() {
        return getConditionQuerySummaryProduct();
    }
    protected SummaryProductCQ _conditionQuerySummaryProduct;
    public SummaryProductCQ getConditionQuerySummaryProduct() {
        if (_conditionQuerySummaryProduct == null) {
            _conditionQuerySummaryProduct = xcreateQuerySummaryProduct();
            xsetupOuterJoinSummaryProduct();
        }
        return _conditionQuerySummaryProduct;
    }
    protected SummaryProductCQ xcreateQuerySummaryProduct() {
        String nrp = resolveNextRelationPath("purchase", "summaryProduct");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SummaryProductCQ cq = new SummaryProductCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("summaryProduct");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSummaryProduct() {
        SummaryProductCQ cq = getConditionQuerySummaryProduct();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PRODUCT_ID", "PRODUCT_ID");
        registerOuterJoin(cq, joinOnMap, "summaryProduct");
    }
    public boolean hasConditionQuerySummaryProduct() {
        return _conditionQuerySummaryProduct != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
     * @return The instance of condition-query. (NotNull)
     */
    public SummaryWithdrawalCQ querySummaryWithdrawal() {
        return getConditionQuerySummaryWithdrawal();
    }
    protected SummaryWithdrawalCQ _conditionQuerySummaryWithdrawal;
    public SummaryWithdrawalCQ getConditionQuerySummaryWithdrawal() {
        if (_conditionQuerySummaryWithdrawal == null) {
            _conditionQuerySummaryWithdrawal = xcreateQuerySummaryWithdrawal();
            xsetupOuterJoinSummaryWithdrawal();
        }
        return _conditionQuerySummaryWithdrawal;
    }
    protected SummaryWithdrawalCQ xcreateQuerySummaryWithdrawal() {
        String nrp = resolveNextRelationPath("purchase", "summaryWithdrawal");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SummaryWithdrawalCQ cq = new SummaryWithdrawalCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("summaryWithdrawal");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSummaryWithdrawal() {
        SummaryWithdrawalCQ cq = getConditionQuerySummaryWithdrawal();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "summaryWithdrawal");
    }
    public boolean hasConditionQuerySummaryWithdrawal() {
        return _conditionQuerySummaryWithdrawal != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteNoPkRelationCQ queryWhiteNoPkRelation() {
        return getConditionQueryWhiteNoPkRelation();
    }
    protected WhiteNoPkRelationCQ _conditionQueryWhiteNoPkRelation;
    public WhiteNoPkRelationCQ getConditionQueryWhiteNoPkRelation() {
        if (_conditionQueryWhiteNoPkRelation == null) {
            _conditionQueryWhiteNoPkRelation = xcreateQueryWhiteNoPkRelation();
            xsetupOuterJoinWhiteNoPkRelation();
        }
        return _conditionQueryWhiteNoPkRelation;
    }
    protected WhiteNoPkRelationCQ xcreateQueryWhiteNoPkRelation() {
        String nrp = resolveNextRelationPath("purchase", "whiteNoPkRelation");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteNoPkRelationCQ cq = new WhiteNoPkRelationCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteNoPkRelation");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteNoPkRelation() {
        WhiteNoPkRelationCQ cq = getConditionQueryWhiteNoPkRelation();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PRODUCT_ID", "PRODUCT_ID");
        registerOuterJoin(cq, joinOnMap, "whiteNoPkRelation");
    }
    public boolean hasConditionQueryWhiteNoPkRelation() {
        return _conditionQueryWhiteNoPkRelation != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchaseSelf() {
        return getConditionQueryPurchaseSelf();
    }
    protected PurchaseCQ _conditionQueryPurchaseSelf;
    public PurchaseCQ getConditionQueryPurchaseSelf() {
        if (_conditionQueryPurchaseSelf == null) {
            _conditionQueryPurchaseSelf = xcreateQueryPurchaseSelf();
            xsetupOuterJoinPurchaseSelf();
        }
        return _conditionQueryPurchaseSelf;
    }
    protected PurchaseCQ xcreateQueryPurchaseSelf() {
        String nrp = resolveNextRelationPath("purchase", "purchaseSelf");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        PurchaseCQ cq = new PurchaseCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("purchaseSelf");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinPurchaseSelf() {
        PurchaseCQ cq = getConditionQueryPurchaseSelf();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PURCHASE_ID", "PURCHASE_ID");
        registerOuterJoin(cq, joinOnMap, "purchaseSelf");
    }
    public boolean hasConditionQueryPurchaseSelf() {
        return _conditionQueryPurchaseSelf != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsSkipRelation(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsSkipRelation();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberAddressAsSkipRelation", parameterMap);
        return getConditionQueryMemberAddressAsSkipRelation();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsSkipRelation;
    public MemberAddressCQ getConditionQueryMemberAddressAsSkipRelation() {
        if (_conditionQueryMemberAddressAsSkipRelation == null) {
            _conditionQueryMemberAddressAsSkipRelation = xcreateQueryMemberAddressAsSkipRelation();
            xsetupOuterJoinMemberAddressAsSkipRelation();
        }
        return _conditionQueryMemberAddressAsSkipRelation;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsSkipRelation;
    public Map<String, Object> getParameterMapMemberAddressAsSkipRelation() {
        if (_parameterMapMemberAddressAsSkipRelation == null) {
            _parameterMapMemberAddressAsSkipRelation = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsSkipRelation;
    }
    public void xsetParameterMapMemberAddressAsSkipRelation(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsSkipRelation = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsSkipRelation() {
        String nrp = resolveNextRelationPath("purchase", "memberAddressAsSkipRelation");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsSkipRelation");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsSkipRelation() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsSkipRelation();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsSkipRelation");
    }
    public boolean hasConditionQueryMemberAddressAsSkipRelation() {
        return _conditionQueryMemberAddressAsSkipRelation != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePurchaseReferrerCQ queryWhitePurchaseReferrerAsOne() {
        return getConditionQueryWhitePurchaseReferrerAsOne();
    }
    protected WhitePurchaseReferrerCQ _conditionQueryWhitePurchaseReferrerAsOne;
    public WhitePurchaseReferrerCQ getConditionQueryWhitePurchaseReferrerAsOne() {
        if (_conditionQueryWhitePurchaseReferrerAsOne == null) {
            _conditionQueryWhitePurchaseReferrerAsOne = xcreateQueryWhitePurchaseReferrerAsOne();
            xsetupOuterJoinWhitePurchaseReferrerAsOne();
        }
        return _conditionQueryWhitePurchaseReferrerAsOne;
    }
    protected WhitePurchaseReferrerCQ xcreateQueryWhitePurchaseReferrerAsOne() {
        String nrp = resolveNextRelationPath("purchase", "whitePurchaseReferrerAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhitePurchaseReferrerCQ cq = new WhitePurchaseReferrerCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whitePurchaseReferrerAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhitePurchaseReferrerAsOne() {
        WhitePurchaseReferrerCQ cq = getConditionQueryWhitePurchaseReferrerAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PURCHASE_ID", "PURCHASE_REFERRER_ID");
        registerOuterJoin(cq, joinOnMap, "whitePurchaseReferrerAsOne");
    }
    public boolean hasConditionQueryWhitePurchaseReferrerAsOne() {
        return _conditionQueryWhitePurchaseReferrerAsOne != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchaseSelfAsOne() {
        return getConditionQueryPurchaseSelfAsOne();
    }
    protected PurchaseCQ _conditionQueryPurchaseSelfAsOne;
    public PurchaseCQ getConditionQueryPurchaseSelfAsOne() {
        if (_conditionQueryPurchaseSelfAsOne == null) {
            _conditionQueryPurchaseSelfAsOne = xcreateQueryPurchaseSelfAsOne();
            xsetupOuterJoinPurchaseSelfAsOne();
        }
        return _conditionQueryPurchaseSelfAsOne;
    }
    protected PurchaseCQ xcreateQueryPurchaseSelfAsOne() {
        String nrp = resolveNextRelationPath("purchase", "purchaseSelfAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        PurchaseCQ cq = new PurchaseCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("purchaseSelfAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinPurchaseSelfAsOne() {
        PurchaseCQ cq = getConditionQueryPurchaseSelfAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PURCHASE_ID", "PURCHASE_ID");
        registerOuterJoin(cq, joinOnMap, "purchaseSelfAsOne");
    }
    public boolean hasConditionQueryPurchaseSelfAsOne() {
        return _conditionQueryPurchaseSelfAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("memberAddressAsSkipRelation".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsSkipRelation;
        }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, PurchaseCQ> _scalarConditionMap;
    public Map<String, PurchaseCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(PurchaseCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, PurchaseCQ> _specifyMyselfDerivedMap;
    public Map<String, PurchaseCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(PurchaseCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, PurchaseCQ> _queryMyselfDerivedMap;
    public Map<String, PurchaseCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(PurchaseCQ sq) {
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
    protected Map<String, PurchaseCQ> _myselfExistsMap;
    public Map<String, PurchaseCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(PurchaseCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, PurchaseCQ> _myselfInScopeMap;
    public Map<String, PurchaseCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(PurchaseCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

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
