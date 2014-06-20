package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (商品)product as TABLE. <br />
 * <pre>
 * [primary key]
 *     product_id
 *
 * [column]
 *     product_id, product_name, product_handle_code, product_category_code, product_status_code, regular_price, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 *
 * [sequence]
 *     product_product_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     product_category, product_status
 *
 * [referrer table]
 *     purchase
 *
 * [foreign property]
 *     productCategory, productStatus
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Product> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProduct ready(List<Product> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Purchase> _referrerPurchaseList;
    public NestedReferrerLoaderGateway<LoaderOfPurchase> loadPurchaseList(ConditionBeanSetupper<PurchaseCB> setupper) {
        myBhv().loadPurchaseList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<Purchase>() {
            public void handle(List<Purchase> referrerList) { _referrerPurchaseList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfPurchase>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfPurchase> handler) {
                handler.handle(new LoaderOfPurchase().ready(_referrerPurchaseList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfProductCategory _foreignProductCategoryLoader;
    public LoaderOfProductCategory pulloutProductCategory() {
        if (_foreignProductCategoryLoader != null) { return _foreignProductCategoryLoader; }
        List<ProductCategory> pulledList = myBhv().pulloutProductCategory(_selectedList);
        _foreignProductCategoryLoader = new LoaderOfProductCategory().ready(pulledList, _selector);
        return _foreignProductCategoryLoader;
    }

    protected LoaderOfProductStatus _foreignProductStatusLoader;
    public LoaderOfProductStatus pulloutProductStatus() {
        if (_foreignProductStatusLoader != null) { return _foreignProductStatusLoader; }
        List<ProductStatus> pulledList = myBhv().pulloutProductStatus(_selectedList);
        _foreignProductStatusLoader = new LoaderOfProductStatus().ready(pulledList, _selector);
        return _foreignProductStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Product> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
