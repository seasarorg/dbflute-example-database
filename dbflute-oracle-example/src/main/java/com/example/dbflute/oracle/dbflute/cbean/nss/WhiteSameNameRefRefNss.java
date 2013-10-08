package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteSameNameRefRefCQ;

/**
 * The nest select set-upper of WHITE_SAME_NAME_REF_REF.
 * @author oracleman
 */
public class WhiteSameNameRefRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameRefRefCQ _query;
    public WhiteSameNameRefRefNss(WhiteSameNameRefRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
