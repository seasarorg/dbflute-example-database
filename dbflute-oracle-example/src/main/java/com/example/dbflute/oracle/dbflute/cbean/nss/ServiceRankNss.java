package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.ServiceRankCQ;

/**
 * The nest select set-upper of SERVICE_RANK.
 * @author oracleman
 */
public class ServiceRankNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ServiceRankCQ _query;
    public ServiceRankNss(ServiceRankCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
