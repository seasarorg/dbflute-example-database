package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_DEFAULT_VALUE as TABLE. <br />
 * <pre>
 * [primary key]
 *     DEFAULT_VALUE_ID
 *
 * [column]
 *     DEFAULT_VALUE_ID, DEFAULT_TIMESTAMP
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
public class LoaderOfVendorDefaultValue {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorDefaultValue> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorDefaultValueBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorDefaultValue ready(List<VendorDefaultValue> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorDefaultValueBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorDefaultValueBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorDefaultValue> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
