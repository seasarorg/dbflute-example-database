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
package com.example.dbflute.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The referrer loader of (購入)PURCHASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     member, product, SUMMARY_PRODUCT, SUMMARY_WITHDRAWAL, WHITE_NO_PK_RELATION, PURCHASE, MEMBER_ADDRESS(AsSkipRelation), white_purchase_referrer(AsOne), purchase(AsOne)
 *
 * [referrer table]
 *     purchase_payment, white_purchase_referrer, purchase
 *
 * [foreign property]
 *     member, product, summaryProduct, summaryWithdrawal, whiteNoPkRelation, purchaseSelf, memberAddressAsSkipRelation, whitePurchaseReferrerAsOne, purchaseSelfAsOne
 *
 * [referrer property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Purchase> _selectedList;
    protected BehaviorSelector _selector;
    protected PurchaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPurchase ready(List<Purchase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PurchaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PurchaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PurchasePayment> _referrerPurchasePaymentList;
    public NestedReferrerLoaderGateway<LoaderOfPurchasePayment> loadPurchasePaymentList(ConditionBeanSetupper<PurchasePaymentCB> setupper) {
        myBhv().loadPurchasePaymentList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<PurchasePayment>() {
            public void handle(List<PurchasePayment> referrerList) { _referrerPurchasePaymentList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfPurchasePayment>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfPurchasePayment> handler) {
                handler.handle(new LoaderOfPurchasePayment().ready(_referrerPurchasePaymentList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        List<Member> pulledList = myBhv().pulloutMember(_selectedList);
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected LoaderOfProduct _foreignProductLoader;
    public LoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader != null) { return _foreignProductLoader; }
        List<Product> pulledList = myBhv().pulloutProduct(_selectedList);
        _foreignProductLoader = new LoaderOfProduct().ready(pulledList, _selector);
        return _foreignProductLoader;
    }

    protected LoaderOfSummaryProduct _foreignSummaryProductLoader;
    public LoaderOfSummaryProduct pulloutSummaryProduct() {
        if (_foreignSummaryProductLoader != null) { return _foreignSummaryProductLoader; }
        List<SummaryProduct> pulledList = myBhv().pulloutSummaryProduct(_selectedList);
        _foreignSummaryProductLoader = new LoaderOfSummaryProduct().ready(pulledList, _selector);
        return _foreignSummaryProductLoader;
    }

    protected LoaderOfSummaryWithdrawal _foreignSummaryWithdrawalLoader;
    public LoaderOfSummaryWithdrawal pulloutSummaryWithdrawal() {
        if (_foreignSummaryWithdrawalLoader != null) { return _foreignSummaryWithdrawalLoader; }
        List<SummaryWithdrawal> pulledList = myBhv().pulloutSummaryWithdrawal(_selectedList);
        _foreignSummaryWithdrawalLoader = new LoaderOfSummaryWithdrawal().ready(pulledList, _selector);
        return _foreignSummaryWithdrawalLoader;
    }

    protected LoaderOfWhiteNoPkRelation _foreignWhiteNoPkRelationLoader;
    public LoaderOfWhiteNoPkRelation pulloutWhiteNoPkRelation() {
        if (_foreignWhiteNoPkRelationLoader != null) { return _foreignWhiteNoPkRelationLoader; }
        List<WhiteNoPkRelation> pulledList = myBhv().pulloutWhiteNoPkRelation(_selectedList);
        _foreignWhiteNoPkRelationLoader = new LoaderOfWhiteNoPkRelation().ready(pulledList, _selector);
        return _foreignWhiteNoPkRelationLoader;
    }

    protected LoaderOfPurchase _foreignPurchaseSelfLoader;
    public LoaderOfPurchase pulloutPurchaseSelf() {
        if (_foreignPurchaseSelfLoader != null) { return _foreignPurchaseSelfLoader; }
        List<Purchase> pulledList = myBhv().pulloutPurchaseSelf(_selectedList);
        _foreignPurchaseSelfLoader = new LoaderOfPurchase().ready(pulledList, _selector);
        return _foreignPurchaseSelfLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsSkipRelationLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsSkipRelation() {
        if (_foreignMemberAddressAsSkipRelationLoader != null) { return _foreignMemberAddressAsSkipRelationLoader; }
        List<MemberAddress> pulledList = myBhv().pulloutMemberAddressAsSkipRelation(_selectedList);
        _foreignMemberAddressAsSkipRelationLoader = new LoaderOfMemberAddress().ready(pulledList, _selector);
        return _foreignMemberAddressAsSkipRelationLoader;
    }

    protected LoaderOfWhitePurchaseReferrer _foreignWhitePurchaseReferrerAsOneLoader;
    public LoaderOfWhitePurchaseReferrer pulloutWhitePurchaseReferrerAsOne() {
        if (_foreignWhitePurchaseReferrerAsOneLoader != null) { return _foreignWhitePurchaseReferrerAsOneLoader; }
        List<WhitePurchaseReferrer> pulledList = myBhv().pulloutWhitePurchaseReferrerAsOne(_selectedList);
        _foreignWhitePurchaseReferrerAsOneLoader = new LoaderOfWhitePurchaseReferrer().ready(pulledList, _selector);
        return _foreignWhitePurchaseReferrerAsOneLoader;
    }

    protected LoaderOfPurchase _foreignPurchaseSelfAsOneLoader;
    public LoaderOfPurchase pulloutPurchaseSelfAsOne() {
        if (_foreignPurchaseSelfAsOneLoader != null) { return _foreignPurchaseSelfAsOneLoader; }
        List<Purchase> pulledList = myBhv().pulloutPurchaseSelfAsOne(_selectedList);
        _foreignPurchaseSelfAsOneLoader = new LoaderOfPurchase().ready(pulledList, _selector);
        return _foreignPurchaseSelfAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Purchase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
