package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     PRODUCT_CATEGORY
 *
 * [referrer table]
 *     PRODUCT_CATEGORY
 *
 * [foreign property]
 *     productCategorySelf
 *
 * [referrer property]
 *     productCategorySelfList
 * </pre>
 * @author oracleman
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
