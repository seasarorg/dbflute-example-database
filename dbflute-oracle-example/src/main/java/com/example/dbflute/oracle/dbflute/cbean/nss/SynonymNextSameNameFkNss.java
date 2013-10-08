package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymNextSameNameFkCQ;

/**
 * The nest select set-upper of SYNONYM_NEXT_SAME_NAME_FK.
 * @author oracleman
 */
public class SynonymNextSameNameFkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextSameNameFkCQ _query;
    public SynonymNextSameNameFkNss(SynonymNextSameNameFkCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
