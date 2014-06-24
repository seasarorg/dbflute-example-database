package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME
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
 *     WHITE_REF_NEXT_TARGET, NEXT_SCHEMA_PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteRefNextTargetList, nextSchemaProductList
 * </pre>
 * @author oracleman
 */
public class LoaderOfNextSchemaProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextSchemaProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected NextSchemaProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextSchemaProductStatus ready(List<NextSchemaProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextSchemaProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextSchemaProductStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteRefNextTarget> _referrerWhiteRefNextTargetList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteRefNextTarget> loadWhiteRefNextTargetList(ConditionBeanSetupper<WhiteRefNextTargetCB> setupper) {
        myBhv().loadWhiteRefNextTargetList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<WhiteRefNextTarget>() {
            public void handle(List<WhiteRefNextTarget> referrerList) { _referrerWhiteRefNextTargetList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteRefNextTarget>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteRefNextTarget> handler) {
                handler.handle(new LoaderOfWhiteRefNextTarget().ready(_referrerWhiteRefNextTargetList, _selector));
            }
        };
    }

    protected List<NextSchemaProduct> _referrerNextSchemaProductList;
    public NestedReferrerLoaderGateway<LoaderOfNextSchemaProduct> loadNextSchemaProductList(ConditionBeanSetupper<NextSchemaProductCB> setupper) {
        myBhv().loadNextSchemaProductList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<NextSchemaProduct>() {
            public void handle(List<NextSchemaProduct> referrerList) { _referrerNextSchemaProductList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfNextSchemaProduct>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfNextSchemaProduct> handler) {
                handler.handle(new LoaderOfNextSchemaProduct().ready(_referrerNextSchemaProductList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextSchemaProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
