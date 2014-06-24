package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_CHECK_ID
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_NCHAR, TYPE_OF_VARCHAR2, TYPE_OF_VARCHAR2_MAX, TYPE_OF_NVARCHAR2, TYPE_OF_CLOB, TYPE_OF_NCLOB, TYPE_OF_LONG, TYPE_OF_XMLTYPE, TYPE_OF_NUMBER_INTEGER, TYPE_OF_NUMBER_BIGINT, TYPE_OF_NUMBER_DECIMAL, TYPE_OF_NUMBER_INTEGER_MIN, TYPE_OF_NUMBER_INTEGER_MAX, TYPE_OF_NUMBER_BIGINT_MIN, TYPE_OF_NUMBER_BIGINT_MAX, TYPE_OF_NUMBER_SUPERINT_MIN, TYPE_OF_NUMBER_SUPERINT_MAX, TYPE_OF_NUMBER_MAXDECIMAL, TYPE_OF_INTEGER, TYPE_OF_BINARY_FLOAT, TYPE_OF_BINARY_DOUBLE, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_INTERVAL_YEAR_TO_MONTH, TYPE_OF_INTERVAL_DAY_TO_SECOND, TYPE_OF_BLOB, TYPE_OF_RAW, TYPE_OF_BFILE, TYPE_OF_ROWID
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
 * @author oracleman
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
