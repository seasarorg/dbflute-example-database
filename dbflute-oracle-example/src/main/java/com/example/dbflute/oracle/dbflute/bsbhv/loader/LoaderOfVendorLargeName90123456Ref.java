package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_LARGE_NAME_90123456_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_90123_REF_ID
 *
 * [column]
 *     VENDOR_LARGE_NAME_90123_REF_ID, VENDOR_LARGE_NAME_901_REF_NAME, VENDOR_LARGE_NAME_901234567_ID
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
 *     VENDOR_LARGE_NAME_901234567890
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorLargeName901234567890
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfVendorLargeName90123456Ref {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeName90123456Ref> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeName90123456RefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeName90123456Ref ready(List<VendorLargeName90123456Ref> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeName90123456RefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeName90123456RefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorLargeName901234567890 _foreignVendorLargeName901234567890Loader;
    public LoaderOfVendorLargeName901234567890 pulloutVendorLargeName901234567890() {
        if (_foreignVendorLargeName901234567890Loader != null) { return _foreignVendorLargeName901234567890Loader; }
        List<VendorLargeName901234567890> pulledList = myBhv().pulloutVendorLargeName901234567890(_selectedList);
        _foreignVendorLargeName901234567890Loader = new LoaderOfVendorLargeName901234567890().ready(pulledList, _selector);
        return _foreignVendorLargeName901234567890Loader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeName90123456Ref> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
