package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymProductStatusCQ;

/**
 * The nest select set-upper of SYNONYM_PRODUCT_STATUS.
 * @author oracleman
 */
public class SynonymProductStatusNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymProductStatusCQ _query;
    public SynonymProductStatusNss(SynonymProductStatusCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
