package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of white_compound_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     pk_first_id, pk_second_id
 *
 * [column]
 *     pk_first_id, pk_second_id, pk_name
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
 *     white_compound_pk_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteCompoundPkRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPk ready(List<WhiteCompoundPk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPkRef> _referrerWhiteCompoundPkRefList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRef> loadWhiteCompoundPkRefList(ConditionBeanSetupper<WhiteCompoundPkRefCB> setupper) {
        myBhv().loadWhiteCompoundPkRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteCompoundPkRef>() {
            public void handle(List<WhiteCompoundPkRef> referrerList) { _referrerWhiteCompoundPkRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRef> handler) {
                handler.handle(new LoaderOfWhiteCompoundPkRef().ready(_referrerWhiteCompoundPkRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
