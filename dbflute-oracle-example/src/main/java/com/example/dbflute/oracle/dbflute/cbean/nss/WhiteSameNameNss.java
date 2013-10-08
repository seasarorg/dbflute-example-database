package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteSameNameCQ;

/**
 * The nest select set-upper of WHITE_SAME_NAME.
 * @author oracleman
 */
public class WhiteSameNameNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameCQ _query;
    public WhiteSameNameNss(WhiteSameNameCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
