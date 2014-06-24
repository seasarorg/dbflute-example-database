package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The referrer loader of ALIAS_EXCEPT as ALIAS. <br />
 * <pre>
 * [primary key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     ALIAS_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     aliasRefExceptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAliasExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AliasExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected AliasExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAliasExcept ready(List<AliasExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AliasExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AliasExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<AliasRefExcept> _referrerAliasRefExceptList;
    public NestedReferrerLoaderGateway<LoaderOfAliasRefExcept> loadAliasRefExceptList(ConditionBeanSetupper<AliasRefExceptCB> setupper) {
        myBhv().loadAliasRefExceptList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<AliasRefExcept>() {
            public void handle(List<AliasRefExcept> referrerList) { _referrerAliasRefExceptList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfAliasRefExcept>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfAliasRefExcept> handler) {
                handler.handle(new LoaderOfAliasRefExcept().ready(_referrerAliasRefExceptList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AliasExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
