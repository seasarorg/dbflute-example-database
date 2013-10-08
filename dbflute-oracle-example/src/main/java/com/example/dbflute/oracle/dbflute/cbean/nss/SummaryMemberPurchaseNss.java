package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.SummaryMemberPurchaseCQ;

/**
 * The nest select set-upper of SUMMARY_MEMBER_PURCHASE.
 * @author oracleman
 */
public class SummaryMemberPurchaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SummaryMemberPurchaseCQ _query;
    public SummaryMemberPurchaseNss(SummaryMemberPurchaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
