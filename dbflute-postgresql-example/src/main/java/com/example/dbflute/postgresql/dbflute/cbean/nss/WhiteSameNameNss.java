package com.example.dbflute.postgresql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.postgresql.dbflute.cbean.cq.WhiteSameNameCQ;

/**
 * The nest select set-upper of white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameCQ _query;
    public WhiteSameNameNss(WhiteSameNameCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public NextSchemaProductNss withNextSchemaProduct() {
        _query.doNss(new WhiteSameNameCQ.NssCall() { public ConditionQuery qf() { return _query.queryNextSchemaProduct(); }});
        return new NextSchemaProductNss(_query.queryNextSchemaProduct());
    }
}
