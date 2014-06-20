package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_uuid_foo as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_id
 *
 * [column]
 *     foo_id, foo_name, bar_id
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
 *     vendor_uuid_bar
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorUuidBar
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorUuidFoo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorUuidFoo> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorUuidFooBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorUuidFoo ready(List<VendorUuidFoo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorUuidFooBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorUuidFooBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorUuidBar _foreignVendorUuidBarLoader;
    public LoaderOfVendorUuidBar pulloutVendorUuidBar() {
        if (_foreignVendorUuidBarLoader != null) { return _foreignVendorUuidBarLoader; }
        List<VendorUuidBar> pulledList = myBhv().pulloutVendorUuidBar(_selectedList);
        _foreignVendorUuidBarLoader = new LoaderOfVendorUuidBar().ready(pulledList, _selector);
        return _foreignVendorUuidBarLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorUuidFoo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
