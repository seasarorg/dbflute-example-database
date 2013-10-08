package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.VendorCheckCQ;

/**
 * The nest select set-upper of VENDOR_CHECK.
 * @author oracleman
 */
public class VendorCheckNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCQ _query;
    public VendorCheckNss(VendorCheckCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
