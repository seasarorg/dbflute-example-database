package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteUqFkRefCQ;

/**
 * The nest select set-upper of WHITE_UQ_FK_REF.
 * @author oracleman
 */
public class WhiteUqFkRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCQ _query;
    public WhiteUqFkRefNss(WhiteUqFkRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqFkNss withWhiteUqFkByFkToPkId() {
        _query.doNss(new WhiteUqFkRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqFkByFkToPkId(); }});
        return new WhiteUqFkNss(_query.queryWhiteUqFkByFkToPkId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteUqFkNss withWhiteUqFkByFkToUqCode() {
        _query.doNss(new WhiteUqFkRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteUqFkByFkToUqCode(); }});
        return new WhiteUqFkNss(_query.queryWhiteUqFkByFkToUqCode());
    }

}
