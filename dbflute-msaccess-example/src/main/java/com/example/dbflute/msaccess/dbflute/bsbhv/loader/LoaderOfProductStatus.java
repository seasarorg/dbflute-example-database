package com.example.dbflute.msaccess.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.msaccess.dbflute.exbhv.*;
import com.example.dbflute.msaccess.dbflute.exentity.*;
import com.example.dbflute.msaccess.dbflute.cbean.*;

/**
 * The referrer loader of PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_STATUS_CODE
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProductStatus ready(List<ProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductStatusBhv.class); return _myBhv; } }

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

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
