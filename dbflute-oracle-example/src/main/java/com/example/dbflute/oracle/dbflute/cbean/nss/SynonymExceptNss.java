package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymExceptCQ;

/**
 * The nest select set-upper of SYNONYM_EXCEPT.
 * @author oracleman
 */
public class SynonymExceptNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymExceptCQ _query;
    public SynonymExceptNss(SynonymExceptCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
