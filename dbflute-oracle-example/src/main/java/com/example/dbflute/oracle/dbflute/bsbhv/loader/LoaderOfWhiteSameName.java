package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_SAME_NAME as TABLE. <br />
 * <pre>
 * [primary key]
 *     SAME_NAME_ID
 *
 * [column]
 *     SAME_NAME_ID, SAME_NAME_NAME
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
public class LoaderOfWhiteSameName {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSameName> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSameNameBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSameName ready(List<WhiteSameName> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSameNameBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSameNameBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSameName> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
