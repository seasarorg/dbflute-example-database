package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of (商品)SYNONYM_PRODUCT as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     SYNONYM_PRODUCT_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     synonymProductStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymProduct ready(List<SynonymProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfSynonymProductStatus _foreignSynonymProductStatusLoader;
    public LoaderOfSynonymProductStatus pulloutSynonymProductStatus() {
        if (_foreignSynonymProductStatusLoader != null) { return _foreignSynonymProductStatusLoader; }
        List<SynonymProductStatus> pulledList = myBhv().pulloutSynonymProductStatus(_selectedList);
        _foreignSynonymProductStatusLoader = new LoaderOfSynonymProductStatus().ready(pulledList, _selector);
        return _foreignSynonymProductStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
