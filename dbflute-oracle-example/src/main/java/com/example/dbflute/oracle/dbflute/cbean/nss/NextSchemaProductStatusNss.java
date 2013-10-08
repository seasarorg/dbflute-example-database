package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.NextSchemaProductStatusCQ;

/**
 * The nest select set-upper of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public class NextSchemaProductStatusNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextSchemaProductStatusCQ _query;
    public NextSchemaProductStatusNss(NextSchemaProductStatusCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
