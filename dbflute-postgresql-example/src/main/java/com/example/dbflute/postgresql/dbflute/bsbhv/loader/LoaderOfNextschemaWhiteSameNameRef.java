package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of nextschema.white_same_name_ref as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_ref_id
 *
 * [column]
 *     same_name_ref_id, same_name_id, next_ref_date
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
 *     white_same_name
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSameName
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfNextschemaWhiteSameNameRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextschemaWhiteSameNameRef> _selectedList;
    protected BehaviorSelector _selector;
    protected NextschemaWhiteSameNameRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextschemaWhiteSameNameRef ready(List<NextschemaWhiteSameNameRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextschemaWhiteSameNameRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextschemaWhiteSameNameRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfNextschemaWhiteSameName _foreignWhiteSameNameLoader;
    public LoaderOfNextschemaWhiteSameName pulloutWhiteSameName() {
        if (_foreignWhiteSameNameLoader != null) { return _foreignWhiteSameNameLoader; }
        List<NextschemaWhiteSameName> pulledList = myBhv().pulloutWhiteSameName(_selectedList);
        _foreignWhiteSameNameLoader = new LoaderOfNextschemaWhiteSameName().ready(pulledList, _selector);
        return _foreignWhiteSameNameLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextschemaWhiteSameNameRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
