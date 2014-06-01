package com.example.dbflute.postgresql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.postgresql.dbflute.cbean.cq.NextschemaWhiteSameNameRefCQ;

/**
 * The nest select set-upper of nextschema.white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public class NextschemaWhiteSameNameRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextschemaWhiteSameNameRefCQ _query;
    public NextschemaWhiteSameNameRefNss(NextschemaWhiteSameNameRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public NextschemaWhiteSameNameNss withWhiteSameName() {
        _query.doNss(new NextschemaWhiteSameNameRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteSameName(); }});
        return new NextschemaWhiteSameNameNss(_query.queryWhiteSameName());
    }
}
