package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.Vendor$DollarCQ;

/**
 * The nest select set-upper of VENDOR_$_DOLLAR.
 * @author oracleman
 */
public class Vendor$DollarNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Vendor$DollarCQ _query;
    public Vendor$DollarNss(Vendor$DollarCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
