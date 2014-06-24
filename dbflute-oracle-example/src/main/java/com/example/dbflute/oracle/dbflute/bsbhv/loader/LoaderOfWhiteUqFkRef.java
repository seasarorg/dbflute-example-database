package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_UQ_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_ID
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     WHITE_UQ_FK
 *
 * [referrer table]
 *     WHITE_UQ_FK_REF_NEST
 *
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 *
 * [referrer property]
 *     whiteUqFkRefNestList
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteUqFkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkRef ready(List<WhiteUqFkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRefNest> _referrerWhiteUqFkRefNestList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRefNest> loadWhiteUqFkRefNestList(ConditionBeanSetupper<WhiteUqFkRefNestCB> setupper) {
        myBhv().loadWhiteUqFkRefNestList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteUqFkRefNest>() {
            public void handle(List<WhiteUqFkRefNest> referrerList) { _referrerWhiteUqFkRefNestList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRefNest>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteUqFkRefNest> handler) {
                handler.handle(new LoaderOfWhiteUqFkRefNest().ready(_referrerWhiteUqFkRefNestList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFk _foreignWhiteUqFkByFkToPkIdLoader;
    public LoaderOfWhiteUqFk pulloutWhiteUqFkByFkToPkId() {
        if (_foreignWhiteUqFkByFkToPkIdLoader != null) { return _foreignWhiteUqFkByFkToPkIdLoader; }
        List<WhiteUqFk> pulledList = myBhv().pulloutWhiteUqFkByFkToPkId(_selectedList);
        _foreignWhiteUqFkByFkToPkIdLoader = new LoaderOfWhiteUqFk().ready(pulledList, _selector);
        return _foreignWhiteUqFkByFkToPkIdLoader;
    }

    protected LoaderOfWhiteUqFk _foreignWhiteUqFkByFkToUqCodeLoader;
    public LoaderOfWhiteUqFk pulloutWhiteUqFkByFkToUqCode() {
        if (_foreignWhiteUqFkByFkToUqCodeLoader != null) { return _foreignWhiteUqFkByFkToUqCodeLoader; }
        List<WhiteUqFk> pulledList = myBhv().pulloutWhiteUqFkByFkToUqCode(_selectedList);
        _foreignWhiteUqFkByFkToUqCodeLoader = new LoaderOfWhiteUqFk().ready(pulledList, _selector);
        return _foreignWhiteUqFkByFkToUqCodeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
