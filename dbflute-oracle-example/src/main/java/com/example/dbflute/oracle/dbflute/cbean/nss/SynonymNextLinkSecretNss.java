package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymNextLinkSecretCQ;

/**
 * The nest select set-upper of SYNONYM_NEXT_LINK_SECRET.
 * @author oracleman
 */
public class SynonymNextLinkSecretNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextLinkSecretCQ _query;
    public SynonymNextLinkSecretNss(SynonymNextLinkSecretCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
