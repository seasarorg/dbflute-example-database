package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymNextLinkSynonymCQ;

/**
 * The nest select set-upper of SYNONYM_NEXT_LINK_SYNONYM.
 * @author oracleman
 */
public class SynonymNextLinkSynonymNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextLinkSynonymCQ _query;
    public SynonymNextLinkSynonymNss(SynonymNextLinkSynonymCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
