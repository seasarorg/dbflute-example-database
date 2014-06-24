package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_UQ_FK_WITHOUT_PK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_UQ_CODE
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
 *     WHITE_UQ_FK_WITHOUT_PK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteUqFkWithoutPk
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteUqFkWithoutPkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkWithoutPkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkWithoutPkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkWithoutPkRef ready(List<WhiteUqFkWithoutPkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkWithoutPkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkWithoutPkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFkWithoutPk _foreignWhiteUqFkWithoutPkLoader;
    public LoaderOfWhiteUqFkWithoutPk pulloutWhiteUqFkWithoutPk() {
        if (_foreignWhiteUqFkWithoutPkLoader != null) { return _foreignWhiteUqFkWithoutPkLoader; }
        List<WhiteUqFkWithoutPk> pulledList = myBhv().pulloutWhiteUqFkWithoutPk(_selectedList);
        _foreignWhiteUqFkWithoutPkLoader = new LoaderOfWhiteUqFkWithoutPk().ready(pulledList, _selector);
        return _foreignWhiteUqFkWithoutPkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkWithoutPkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
