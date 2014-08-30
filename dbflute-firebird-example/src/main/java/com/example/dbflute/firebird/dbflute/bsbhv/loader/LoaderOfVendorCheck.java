package com.example.dbflute.firebird.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;

import com.example.dbflute.firebird.dbflute.exbhv.*;
import com.example.dbflute.firebird.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_CHECK_ID
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_TEXT, TYPE_OF_INTEGER, TYPE_OF_REAL
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
public class LoaderOfVendorCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorCheck> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorCheckBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorCheck ready(List<VendorCheck> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorCheckBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorCheckBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorCheck> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
