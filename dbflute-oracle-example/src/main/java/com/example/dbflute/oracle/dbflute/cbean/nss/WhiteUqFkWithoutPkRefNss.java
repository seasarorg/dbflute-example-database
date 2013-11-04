package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteUqFkWithoutPkRefCQ;

/**
 * The nest select set-upper of WHITE_UQ_FK_WITHOUT_PK_REF.
 * @author oracleman
 */
public class WhiteUqFkWithoutPkRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkWithoutPkRefCQ _query;
    public WhiteUqFkWithoutPkRefNss(WhiteUqFkWithoutPkRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqFkWithoutPkNss withWhiteUqFkWithoutPk() {
        _query.doNss(new WhiteUqFkWithoutPkRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqFkWithoutPk(); }});
        return new WhiteUqFkWithoutPkNss(_query.queryWhiteUqFkWithoutPk());
    }

}
