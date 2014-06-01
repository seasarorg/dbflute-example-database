package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymProductCQ;

/**
 * The nest select set-upper of SYNONYM_PRODUCT.
 * @author oracleman
 */
public class SynonymProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymProductCQ _query;
    public SynonymProductNss(SynonymProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * SYNONYM_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'synonymProductStatus'.
     */
    public void withSynonymProductStatus() {
        _query.doNss(new SynonymProductCQ.NssCall() { public ConditionQuery qf() { return _query.querySynonymProductStatus(); }});
    }
}
