package com.example.dbflute.db2.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_CHECK_ID
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_CHAR_FOR_BIT_DATA, TYPE_OF_VARCHAR, TYPE_OF_VARCHAR_FOR_BIT_DATA, TYPE_OF_CLOB, TYPE_OF_DBCLOB, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_SMALLINT, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_FLOAT, TYPE_OF_DOUBLE, TYPE_OF_REAL, TYPE_OF_DATE, TYPE_OF_TIME, TYPE_OF_TIMESTAMP, TYPE_OF_BLOB, TYPE_OF_GRAPHIC, TYPE_OF_VARGRAPHIC, TYPE_OF_LONG_VARGRAPHIC
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
