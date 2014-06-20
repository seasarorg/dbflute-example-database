package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of white_compound_pk_ref as TABLE. <br />
 * <pre>
 * [primary key]
 *     multiple_first_id, multiple_second_id
 *
 * [column]
 *     multiple_first_id, multiple_second_id, ref_first_id, ref_second_id
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
 *     white_compound_pk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkRef ready(List<WhiteCompoundPkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundPk _foreignWhiteCompoundPkLoader;
    public LoaderOfWhiteCompoundPk pulloutWhiteCompoundPk() {
        if (_foreignWhiteCompoundPkLoader != null) { return _foreignWhiteCompoundPkLoader; }
        List<WhiteCompoundPk> pulledList = myBhv().pulloutWhiteCompoundPk(_selectedList);
        _foreignWhiteCompoundPkLoader = new LoaderOfWhiteCompoundPk().ready(pulledList, _selector);
        return _foreignWhiteCompoundPkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
