package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.ProductStatusCQ;

/**
 * The nest select set-upper of PRODUCT_STATUS.
 * @author oracleman
 */
public class ProductStatusNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductStatusCQ _query;
    public ProductStatusNss(ProductStatusCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
