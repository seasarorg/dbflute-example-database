package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_$_dollar as TABLE. <br />
 * <pre>
 * [primary key]
 *     vendor_$_dollar_id
 *
 * [column]
 *     vendor_$_dollar_id, vendor_$_dollar_name
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
public class LoaderOfVendor$Dollar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Vendor$Dollar> _selectedList;
    protected BehaviorSelector _selector;
    protected Vendor$DollarBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendor$Dollar ready(List<Vendor$Dollar> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected Vendor$DollarBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(Vendor$DollarBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Vendor$Dollar> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
