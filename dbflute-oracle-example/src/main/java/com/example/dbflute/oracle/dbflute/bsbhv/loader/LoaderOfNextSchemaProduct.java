package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of (隣のスキーマ)NEXT_SCHEMA_PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     NEXTEXAMPLEDB.SEQ_NEXT_SCHEMA_PRODUCT
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     NEXT_SCHEMA_PRODUCT_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     nextSchemaProductStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfNextSchemaProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextSchemaProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected NextSchemaProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextSchemaProduct ready(List<NextSchemaProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextSchemaProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextSchemaProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfNextSchemaProductStatus _foreignNextSchemaProductStatusLoader;
    public LoaderOfNextSchemaProductStatus pulloutNextSchemaProductStatus() {
        if (_foreignNextSchemaProductStatusLoader != null) { return _foreignNextSchemaProductStatusLoader; }
        List<NextSchemaProductStatus> pulledList = myBhv().pulloutNextSchemaProductStatus(_selectedList);
        _foreignNextSchemaProductStatusLoader = new LoaderOfNextSchemaProductStatus().ready(pulledList, _selector);
        return _foreignNextSchemaProductStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextSchemaProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
