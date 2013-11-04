package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteUqFkCQ;

/**
 * The nest select set-upper of WHITE_UQ_FK.
 * @author oracleman
 */
public class WhiteUqFkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkCQ _query;
    public WhiteUqFkNss(WhiteUqFkCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
