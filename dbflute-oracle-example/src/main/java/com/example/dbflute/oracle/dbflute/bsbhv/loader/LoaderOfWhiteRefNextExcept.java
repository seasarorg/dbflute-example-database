package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_REF_NEXT_EXCEPT as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_NEXT_EXCEPT_ID
 *
 * [column]
 *     REF_NEXT_EXCEPT_ID, NEXT_EXCEPT_CODE
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
public class LoaderOfWhiteRefNextExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteRefNextExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteRefNextExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteRefNextExcept ready(List<WhiteRefNextExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteRefNextExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteRefNextExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteRefNextExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
