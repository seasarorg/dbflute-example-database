package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_part_man as TABLE. <br />
 * <pre>
 * [primary key]
 *     part_man_id
 *
 * [column]
 *     part_man_id, part_man_name, part_man_point, part_man_date
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
public class LoaderOfVendorPartMan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorPartMan> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorPartManBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorPartMan ready(List<VendorPartMan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorPartManBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorPartManBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorPartMan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
