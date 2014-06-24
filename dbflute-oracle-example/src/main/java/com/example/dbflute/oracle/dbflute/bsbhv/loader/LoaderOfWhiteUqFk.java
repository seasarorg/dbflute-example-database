package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     WHITE_UQ_FK_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteUqFk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFk ready(List<WhiteUqFk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToPkIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        myBhv().loadWhiteUqFkRefByFkToPkIdList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteUqFkRef>() {
            public void handle(List<WhiteUqFkRef> referrerList) { _referrerWhiteUqFkRefByFkToPkIdList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteUqFkRef> handler) {
                handler.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToPkIdList, _selector));
            }
        };
    }

    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToUqCodeList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        myBhv().loadWhiteUqFkRefByFkToUqCodeList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteUqFkRef>() {
            public void handle(List<WhiteUqFkRef> referrerList) { _referrerWhiteUqFkRefByFkToUqCodeList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteUqFkRef> handler) {
                handler.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToUqCodeList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
