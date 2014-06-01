package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.WhiteRefTargetCQ;

/**
 * The nest select set-upper of WHITE_REF_TARGET.
 * @author oracleman
 */
public class WhiteRefTargetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefTargetCQ _query;
    public WhiteRefTargetNss(WhiteRefTargetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     */
    public void withWhiteTarget() {
        _query.doNss(new WhiteRefTargetCQ.NssCall() { public ConditionQuery qf() { return _query.queryWhiteTarget(); }});
    }
}
