package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.MemberStatusCQ;

/**
 * The nest select set-upper of MEMBER_STATUS.
 * @author oracleman
 */
public class MemberStatusNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberStatusCQ _query;
    public MemberStatusNss(MemberStatusCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
