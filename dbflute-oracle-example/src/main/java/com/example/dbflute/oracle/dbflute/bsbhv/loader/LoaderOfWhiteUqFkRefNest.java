package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_UQ_FK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_NEST_ID
 *
 * [column]
 *     UQ_FK_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     WHITE_UQ_FK_REF
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteUqFkRef
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteUqFkRefNest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkRefNest> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkRefNestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkRefNest ready(List<WhiteUqFkRefNest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkRefNestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkRefNestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFkRef _foreignWhiteUqFkRefLoader;
    public LoaderOfWhiteUqFkRef pulloutWhiteUqFkRef() {
        if (_foreignWhiteUqFkRefLoader != null) { return _foreignWhiteUqFkRefLoader; }
        List<WhiteUqFkRef> pulledList = myBhv().pulloutWhiteUqFkRef(_selectedList);
        _foreignWhiteUqFkRefLoader = new LoaderOfWhiteUqFkRef().ready(pulledList, _selector);
        return _foreignWhiteUqFkRefLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkRefNest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
