package com.example.dbflute.db2.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.db2.dbflute.cbean.cq.AliasMemberCQ;

/**
 * The nest select set-upper of ALIAS_MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class AliasMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasMemberCQ _query;
    public AliasMemberNss(AliasMemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.doNss(new AliasMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
    }
}
