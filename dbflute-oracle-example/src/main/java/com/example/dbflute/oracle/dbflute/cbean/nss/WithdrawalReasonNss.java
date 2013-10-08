package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.WithdrawalReasonCQ;

/**
 * The nest select set-upper of WITHDRAWAL_REASON.
 * @author oracleman
 */
public class WithdrawalReasonNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WithdrawalReasonCQ _query;
    public WithdrawalReasonNss(WithdrawalReasonCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
