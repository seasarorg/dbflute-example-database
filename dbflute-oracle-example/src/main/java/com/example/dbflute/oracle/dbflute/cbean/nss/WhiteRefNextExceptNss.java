package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteRefNextExceptCQ;

/**
 * The nest select set-upper of WHITE_REF_NEXT_EXCEPT.
 * @author oracleman
 */
public class WhiteRefNextExceptNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefNextExceptCQ _query;
    public WhiteRefNextExceptNss(WhiteRefNextExceptCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
