package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The referrer loader of ALIAS_REF_EXCEPT as ALIAS. <br />
 * <pre>
 * [primary key]
 *     REF_EXCEPT_ID
 *
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
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
 *     ALIAS_EXCEPT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     aliasExcept
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasRefExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasRefExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasRefExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasRefExcept ready(List<AliasRefExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasRefExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasRefExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAliasExcept _foreignAliasExceptLoader;
    public LoaderOfAliasExcept pulloutAliasExcept() {
        if (_foreignAliasExceptLoader != null) { return _foreignAliasExceptLoader; }
        List<AliasExcept> pulledList = myBhv().pulloutAliasExcept(_selectedList);
        _foreignAliasExceptLoader = new LoaderOfAliasExcept().ready(pulledList, _selector);
        return _foreignAliasExceptLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AliasRefExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
