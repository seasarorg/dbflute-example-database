package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_DIFF_WORLD as TABLE. <br />
 * <pre>
 * [primary key]
 *     DIFF_WORLD_ID
 *
 * [column]
 *     DIFF_WORLD_ID, DIFF_WORLD_NAME
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteDiffWorld {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDiffWorld> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDiffWorldBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDiffWorld ready(List<WhiteDiffWorld> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDiffWorldBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDiffWorldBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDiffWorld> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
