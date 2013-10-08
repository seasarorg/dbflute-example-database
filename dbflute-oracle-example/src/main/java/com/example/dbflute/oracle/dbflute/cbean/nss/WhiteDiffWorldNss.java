package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteDiffWorldCQ;

/**
 * The nest select set-upper of WHITE_DIFF_WORLD.
 * @author oracleman
 */
public class WhiteDiffWorldNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDiffWorldCQ _query;
    public WhiteDiffWorldNss(WhiteDiffWorldCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
