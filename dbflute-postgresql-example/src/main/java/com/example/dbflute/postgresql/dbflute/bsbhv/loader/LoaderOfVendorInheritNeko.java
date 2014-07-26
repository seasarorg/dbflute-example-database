package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_inherit_neko as TABLE. <br />
 * <pre>
 * [primary key]
 *     neko_id
 *
 * [column]
 *     inu_id, inu_name, inu_date, neko_id, neko_name, neko_date
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
public class LoaderOfVendorInheritNeko {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorInheritNeko> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorInheritNekoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorInheritNeko ready(List<VendorInheritNeko> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorInheritNekoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorInheritNekoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorInheritNeko> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
