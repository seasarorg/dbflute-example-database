package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (購入)purchase as TABLE. <br />
 * <pre>
 * [primary key]
 *     purchase_id
 *
 * [column]
 *     purchase_id, member_id, product_id, purchase_datetime, purchase_count, purchase_price, payment_complete_flg, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 *
 * [sequence]
 *     SEQ_PURCHASE
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, product
 *
 * [referrer table]
 *     purchase_payment
 *
 * [foreign property]
 *     member, product
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Purchase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
