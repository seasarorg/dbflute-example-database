package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of nextschema.white_same_name as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_long
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
 *     nextschema.white_same_name_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSameNameRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfNextschemaWhiteSameName {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextschemaWhiteSameName> _selectedList;
    protected BehaviorSelector _selector;
    protected NextschemaWhiteSameNameBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextschemaWhiteSameName ready(List<NextschemaWhiteSameName> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextschemaWhiteSameNameBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextschemaWhiteSameNameBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<NextschemaWhiteSameNameRef> _referrerWhiteSameNameRefList;
    public NestedReferrerLoaderGateway<LoaderOfNextschemaWhiteSameNameRef> loadWhiteSameNameRefList(ConditionBeanSetupper<NextschemaWhiteSameNameRefCB> setupper) {
        myBhv().loadWhiteSameNameRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<NextschemaWhiteSameNameRef>() {
            public void handle(List<NextschemaWhiteSameNameRef> referrerList) { _referrerWhiteSameNameRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfNextschemaWhiteSameNameRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfNextschemaWhiteSameNameRef> handler) {
                handler.handle(new LoaderOfNextschemaWhiteSameNameRef().ready(_referrerWhiteSameNameRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextschemaWhiteSameName> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
