package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymRefExceptCQ;

/**
 * The nest select set-upper of SYNONYM_REF_EXCEPT.
 * @author oracleman
 */
public class SynonymRefExceptNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymRefExceptCQ _query;
    public SynonymRefExceptNss(SynonymRefExceptCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SynonymExceptNss withSynonymExcept() {
        _query.doNss(new SynonymRefExceptCQ.NssCall() { public ConditionQuery qf() { return _query.querySynonymExcept(); }});
        return new SynonymExceptNss(_query.querySynonymExcept());
    }

}
