package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR-NON COMPILABLE as TABLE. <br />
 * <pre>
 * [primary key]
 *     NON-COMPILABLE ID
 *
 * [column]
 *     NON-COMPILABLE ID, NON COMPILABLE-NAME, PARENT-ID
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
 *     VENDOR-NON COMPILABLE
 *
 * [referrer table]
 *     VENDOR-NON COMPILABLE
 *
 * [foreign property]
 *     vendor_non_compilableSelf
 *
 * [referrer property]
 *     vendor_non_compilableSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendor_non_compilable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Vendor_non_compilable> _selectedList;
    protected BehaviorSelector _selector;
    protected Vendor_non_compilableBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendor_non_compilable ready(List<Vendor_non_compilable> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected Vendor_non_compilableBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(Vendor_non_compilableBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Vendor_non_compilable> _referrerVendor_non_compilableSelfList;
    public NestedReferrerLoaderGateway<LoaderOfVendor_non_compilable> loadVendor_non_compilableSelfList(ConditionBeanSetupper<Vendor_non_compilableCB> setupper) {
        myBhv().loadVendor_non_compilableSelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<Vendor_non_compilable>() {
            public void handle(List<Vendor_non_compilable> referrerList) { _referrerVendor_non_compilableSelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendor_non_compilable>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendor_non_compilable> handler) {
                handler.handle(new LoaderOfVendor_non_compilable().ready(_referrerVendor_non_compilableSelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendor_non_compilable _foreignVendor_non_compilableSelfLoader;
    public LoaderOfVendor_non_compilable pulloutVendor_non_compilableSelf() {
        if (_foreignVendor_non_compilableSelfLoader != null) { return _foreignVendor_non_compilableSelfLoader; }
        List<Vendor_non_compilable> pulledList = myBhv().pulloutVendor_non_compilableSelf(_selectedList);
        _foreignVendor_non_compilableSelfLoader = new LoaderOfVendor_non_compilable().ready(pulledList, _selector);
        return _foreignVendor_non_compilableSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Vendor_non_compilable> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
