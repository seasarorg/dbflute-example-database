package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_REF_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_TARGET_ID
 *
 * [column]
 *     REF_TARGET_ID, TARGET_ID
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
 *     WHITE_TARGET
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteTarget
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteRefTarget {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteRefTarget> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteRefTargetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteRefTarget ready(List<WhiteRefTarget> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteRefTargetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteRefTargetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteTarget _foreignWhiteTargetLoader;
    public LoaderOfWhiteTarget pulloutWhiteTarget() {
        if (_foreignWhiteTargetLoader != null) { return _foreignWhiteTargetLoader; }
        List<WhiteTarget> pulledList = myBhv().pulloutWhiteTarget(_selectedList);
        _foreignWhiteTargetLoader = new LoaderOfWhiteTarget().ready(pulledList, _selector);
        return _foreignWhiteTargetLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteRefTarget> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
