package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteUqFkRefNestCQ;

/**
 * The nest select set-upper of WHITE_UQ_FK_REF_NEST.
 * @author oracleman
 */
public class WhiteUqFkRefNestNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefNestCQ _query;
    public WhiteUqFkRefNestNss(WhiteUqFkRefNestCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqFkRefNss withWhiteUqFkRef() {
        _query.doNss(new WhiteUqFkRefNestCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqFkRef(); }});
        return new WhiteUqFkRefNss(_query.queryWhiteUqFkRef());
    }
}
