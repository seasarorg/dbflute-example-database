package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_REF_NEXT_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_NEXT_TARGET_ID
 *
 * [column]
 *     REF_NEXT_TARGET_ID, NEXT_TARGET_CODE
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
public class LoaderOfWhiteRefNextTarget {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteRefNextTarget> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteRefNextTargetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteRefNextTarget ready(List<WhiteRefNextTarget> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteRefNextTargetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteRefNextTargetBhv.class); return _myBhv; } }

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
    public List<WhiteRefNextTarget> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
