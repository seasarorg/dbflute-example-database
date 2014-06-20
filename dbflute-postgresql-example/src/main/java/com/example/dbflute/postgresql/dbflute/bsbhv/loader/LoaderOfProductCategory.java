package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (商品カテゴリ)product_category as TABLE. <br />
 * <pre>
 * [primary key]
 *     product_category_code
 *
 * [column]
 *     product_category_code, product_category_name, parent_category_code
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     product_category
 *
 * [referrer table]
 *     product, product_category
 *
 * [foreign property]
 *     productCategorySelf
 *
 * [referrer property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ProductCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProductCategory ready(List<ProductCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Product> _referrerProductList;
    public NestedReferrerLoaderGateway<LoaderOfProduct> loadProductList(ConditionBeanSetupper<ProductCB> setupper) {
        myBhv().loadProductList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<Product>() {
            public void handle(List<Product> referrerList) { _referrerProductList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfProduct>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfProduct> handler) {
                handler.handle(new LoaderOfProduct().ready(_referrerProductList, _selector));
            }
        };
    }

    protected List<ProductCategory> _referrerProductCategorySelfList;
    public NestedReferrerLoaderGateway<LoaderOfProductCategory> loadProductCategorySelfList(ConditionBeanSetupper<ProductCategoryCB> setupper) {
        myBhv().loadProductCategorySelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<ProductCategory>() {
            public void handle(List<ProductCategory> referrerList) { _referrerProductCategorySelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfProductCategory>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfProductCategory> handler) {
                handler.handle(new LoaderOfProductCategory().ready(_referrerProductCategorySelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfProductCategory _foreignProductCategorySelfLoader;
    public LoaderOfProductCategory pulloutProductCategorySelf() {
        if (_foreignProductCategorySelfLoader != null) { return _foreignProductCategorySelfLoader; }
        List<ProductCategory> pulledList = myBhv().pulloutProductCategorySelf(_selectedList);
        _foreignProductCategorySelfLoader = new LoaderOfProductCategory().ready(pulledList, _selector);
        return _foreignProductCategorySelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ProductCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
