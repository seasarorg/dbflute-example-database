package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of SYNONYM_PRODUCT_STATUS as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     SYNONYM_PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     synonymProductList
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymProductStatus ready(List<SynonymProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymProductStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SynonymProduct> _referrerSynonymProductList;
    public NestedReferrerLoaderGateway<LoaderOfSynonymProduct> loadSynonymProductList(ConditionBeanSetupper<SynonymProductCB> setupper) {
        myBhv().loadSynonymProductList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<SynonymProduct>() {
            public void handle(List<SynonymProduct> referrerList) { _referrerSynonymProductList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfSynonymProduct>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfSynonymProduct> handler) {
                handler.handle(new LoaderOfSynonymProduct().ready(_referrerSynonymProductList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
