package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymNextLinkTableCQ;

/**
 * The nest select set-upper of SYNONYM_NEXT_LINK_TABLE.
 * @author oracleman
 */
public class SynonymNextLinkTableNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextLinkTableCQ _query;
    public SynonymNextLinkTableNss(SynonymNextLinkTableCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
