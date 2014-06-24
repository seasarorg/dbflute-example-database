package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR_LARGE_NAME_901234567890 as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_901234567_ID
 *
 * [column]
 *     VENDOR_LARGE_NAME_901234567_ID, VENDOR_LARGE_NAME_9012345_NAME
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
 *     VENDOR_LARGE_NAME_90123456_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeName90123456RefList
 * </pre>
 * @author oracleman
 */
public class LoaderOfVendorLargeName901234567890 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeName901234567890> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeName901234567890Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeName901234567890 ready(List<VendorLargeName901234567890> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeName901234567890Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeName901234567890Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeName90123456Ref> _referrerVendorLargeName90123456RefList;
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeName90123456Ref> loadVendorLargeName90123456RefList(ConditionBeanSetupper<VendorLargeName90123456RefCB> setupper) {
        myBhv().loadVendorLargeName90123456RefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorLargeName90123456Ref>() {
            public void handle(List<VendorLargeName90123456Ref> referrerList) { _referrerVendorLargeName90123456RefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorLargeName90123456Ref>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorLargeName90123456Ref> handler) {
                handler.handle(new LoaderOfVendorLargeName90123456Ref().ready(_referrerVendorLargeName90123456RefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeName901234567890> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
