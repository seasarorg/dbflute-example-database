package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     TARGET_ID
 *
 * [column]
 *     TARGET_ID, TARGET_NAME
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
 *     WHITE_REF_TARGET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteRefTargetList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteTarget {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteTarget> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteTargetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteTarget ready(List<WhiteTarget> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteTargetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteTargetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteRefTarget> _referrerWhiteRefTargetList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteRefTarget> loadWhiteRefTargetList(ConditionBeanSetupper<WhiteRefTargetCB> setupper) {
        myBhv().loadWhiteRefTargetList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteRefTarget>() {
            public void handle(List<WhiteRefTarget> referrerList) { _referrerWhiteRefTargetList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteRefTarget>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteRefTarget> handler) {
                handler.handle(new LoaderOfWhiteRefTarget().ready(_referrerWhiteRefTargetList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteTarget> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
