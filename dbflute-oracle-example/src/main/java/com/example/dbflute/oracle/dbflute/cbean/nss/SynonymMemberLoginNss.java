package com.example.dbflute.oracle.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.oracle.dbflute.cbean.cq.SynonymMemberLoginCQ;

/**
 * The nest select set-upper of SYNONYM_MEMBER_LOGIN.
 * @author oracleman
 */
public class SynonymMemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberLoginCQ _query;
    public SynonymMemberLoginNss(SynonymMemberLoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.doNss(new SynonymMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberVendorSynonymNss withMemberVendorSynonym() {
        _query.doNss(new SynonymMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberVendorSynonym(); }});
        return new MemberVendorSynonymNss(_query.queryMemberVendorSynonym());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SynonymMemberNss withSynonymMember() {
        _query.doNss(new SynonymMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.querySynonymMember(); }});
        return new SynonymMemberNss(_query.querySynonymMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorSynonymMemberNss withVendorSynonymMember() {
        _query.doNss(new SynonymMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorSynonymMember(); }});
        return new VendorSynonymMemberNss(_query.queryVendorSynonymMember());
    }
}
