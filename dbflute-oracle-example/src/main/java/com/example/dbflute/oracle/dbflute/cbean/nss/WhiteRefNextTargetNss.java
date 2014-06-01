package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteRefNextTargetCQ;

/**
 * The nest select set-upper of WHITE_REF_NEXT_TARGET.
 * @author oracleman
 */
public class WhiteRefNextTargetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefNextTargetCQ _query;
    public WhiteRefNextTargetNss(WhiteRefNextTargetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     */
    public void withNextSchemaProductStatus() {
        _query.doNss(new WhiteRefNextTargetCQ.NssCall() { public ConditionQuery qf() { return _query.queryNextSchemaProductStatus(); }});
    }
}
