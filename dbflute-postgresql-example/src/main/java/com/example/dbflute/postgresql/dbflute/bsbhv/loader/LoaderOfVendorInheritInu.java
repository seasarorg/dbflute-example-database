package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_inherit_inu as TABLE. <br />
 * <pre>
 * [primary key]
 *     inu_id
 *
 * [column]
 *     inu_id, inu_name, inu_date
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
public class LoaderOfVendorInheritInu {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorInheritInu> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorInheritInuBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorInheritInu ready(List<VendorInheritInu> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorInheritInuBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorInheritInuBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorInheritInu> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
