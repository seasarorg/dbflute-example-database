package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymMemberWithdrawalCQ;

/**
 * The nest select set-upper of SYNONYM_MEMBER_WITHDRAWAL.
 * @author oracleman
 */
public class SynonymMemberWithdrawalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberWithdrawalCQ _query;
    public SynonymMemberWithdrawalNss(SynonymMemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberVendorSynonymNss withMemberVendorSynonym() {
        _query.doNss(new SynonymMemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberVendorSynonym(); }});
        return new MemberVendorSynonymNss(_query.queryMemberVendorSynonym());
    }
    /**
     * With nested relation columns to select clause. <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WithdrawalReasonNss withWithdrawalReason() {
        _query.doNss(new SynonymMemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryWithdrawalReason(); }});
        return new WithdrawalReasonNss(_query.queryWithdrawalReason());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SynonymMemberNss withSynonymMember() {
        _query.doNss(new SynonymMemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.querySynonymMember(); }});
        return new SynonymMemberNss(_query.querySynonymMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorSynonymMemberNss withVendorSynonymMember() {
        _query.doNss(new SynonymMemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorSynonymMember(); }});
        return new VendorSynonymMemberNss(_query.queryVendorSynonymMember());
    }

}
