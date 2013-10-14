package com.example.dbflute.db2.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.db2.dbflute.cbean.cq.AliasMemberLoginCQ;

/**
 * The nest select set-upper of ALIAS_MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class AliasMemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasMemberLoginCQ _query;
    public AliasMemberLoginNss(AliasMemberLoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * ALIAS_MEMBER by my MEMBER_ID, named 'aliasMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public AliasMemberNss withAliasMember() {
        _query.doNss(new AliasMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryAliasMember(); }});
        return new AliasMemberNss(_query.queryAliasMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberStatusNss withMemberStatus() {
        _query.doNss(new AliasMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
        return new MemberStatusNss(_query.queryMemberStatus());
    }

}
