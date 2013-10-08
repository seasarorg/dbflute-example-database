package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteTargetCQ;

/**
 * The nest select set-upper of WHITE_TARGET.
 * @author oracleman
 */
public class WhiteTargetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteTargetCQ _query;
    public WhiteTargetNss(WhiteTargetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
