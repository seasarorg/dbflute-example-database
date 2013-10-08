package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.VendorLargeDataCQ;

/**
 * The nest select set-upper of VENDOR_LARGE_DATA.
 * @author oracleman
 */
public class VendorLargeDataNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataCQ _query;
    public VendorLargeDataNss(VendorLargeDataCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
