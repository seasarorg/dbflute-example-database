package com.example.dbflute.sqlserver.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.sqlserver.dbflute.exbhv.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_SYMMETRIC as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_SYMMETRIC_ID
 *
 * [column]
 *     VENDOR_SYMMETRIC_ID, PLAIN_TEXT, ENCRYPTED_DATA
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorSymmetric {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorSymmetric> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorSymmetricBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorSymmetric ready(List<VendorSymmetric> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorSymmetricBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorSymmetricBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorSymmetric> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
