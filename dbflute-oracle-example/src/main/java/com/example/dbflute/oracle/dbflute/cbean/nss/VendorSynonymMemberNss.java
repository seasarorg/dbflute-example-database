package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.VendorSynonymMemberCQ;

/**
 * The nest select set-upper of VENDOR_SYNONYM_MEMBER.
 * @author oracleman
 */
public class VendorSynonymMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorSynonymMemberCQ _query;
    public VendorSynonymMemberNss(VendorSynonymMemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.doNss(new VendorSynonymMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SynonymMemberWithdrawalNss withSynonymMemberWithdrawalAsOne() {
        _query.doNss(new VendorSynonymMemberCQ.NssCall() { public ConditionQuery qf() { return _query.querySynonymMemberWithdrawalAsOne(); }});
        return new SynonymMemberWithdrawalNss(_query.querySynonymMemberWithdrawalAsOne());
    }
}
