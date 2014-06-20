package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of (購入支払)purchase_payment as TABLE. <br />
 * <pre>
 * [primary key]
 *     purchase_payment_id
 *
 * [column]
 *     purchase_payment_id, purchase_id, payment_amount, payment_datetime, payment_method_code, register_datetime, register_user, update_datetime, update_user
 *
 * [sequence]
 *     purchase_payment_purchase_payment_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     purchase
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPurchasePayment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PurchasePayment> _selectedList;
    protected BehaviorSelector _selector;
    protected PurchasePaymentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPurchasePayment ready(List<PurchasePayment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PurchasePaymentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PurchasePaymentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPurchase _foreignPurchaseLoader;
    public LoaderOfPurchase pulloutPurchase() {
        if (_foreignPurchaseLoader != null) { return _foreignPurchaseLoader; }
        List<Purchase> pulledList = myBhv().pulloutPurchase(_selectedList);
        _foreignPurchaseLoader = new LoaderOfPurchase().ready(pulledList, _selector);
        return _foreignPurchaseLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PurchasePayment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
