package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymNextSecretAuthCQ;

/**
 * The nest select set-upper of SYNONYM_NEXT_SECRET_AUTH.
 * @author oracleman
 */
public class SynonymNextSecretAuthNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextSecretAuthCQ _query;
    public SynonymNextSecretAuthNss(SynonymNextSecretAuthCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
