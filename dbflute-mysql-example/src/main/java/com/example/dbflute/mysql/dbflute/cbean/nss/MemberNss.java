/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.mysql.dbflute.cbean.cq.MemberCQ;

/**
 * The nest select set-upper of member.
 * @author DBFlute(AutoGenerator)
 */
public class MemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCQ _query;
    public MemberNss(MemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberStatusNss withMemberStatus() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
        MemberStatusNss moreNss = new MemberStatusNss(_query.queryMemberStatus());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsValid(final java.util.Date targetDate) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsValid(targetDate); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsValid(targetDate));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsValidBefore(final java.util.Date targetDate) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsValidBefore(targetDate); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsValidBefore(targetDate));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLoginStatus(final com.example.dbflute.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsLoginStatus(statusCode); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsLoginStatus(statusCode));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
     * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsIfComment(final java.util.Date targetDate, final com.example.dbflute.mysql.dbflute.allcommon.CDef.Region region) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsIfComment(targetDate, region); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsIfComment(targetDate, region));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsOnlyOneDate(final java.util.Date targetDate) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsOnlyOneDate(targetDate); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsOnlyOneDate(targetDate));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLocalForeignOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsLocalForeignOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsLocalForeignOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignEachOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignEachOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignEachOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignOptimizedBasicOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedBasicOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignOptimizedMarkOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedMarkOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedPartOverTest(final String memberName) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignOptimizedPartOverTest(memberName); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedPartOverTest(memberName));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignOptimizedWholeOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedWholeOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignParameterOverTest(final java.util.Date targetDate) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignParameterOverTest(targetDate); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignParameterOverTest(targetDate));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignVariousOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsForeignForeignVariousOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsForeignForeignVariousOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsReferrerOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsReferrerOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsReferrerOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsReferrerForeignOverTest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsReferrerForeignOverTest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsReferrerForeignOverTest());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsFormattedBasic(final java.util.Date targetDate) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsFormattedBasic(targetDate); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsFormattedBasic(targetDate));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsFormattedLong(final java.util.Date targetDate) {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberAddressAsFormattedLong(targetDate); }});
        MemberAddressNss moreNss = new MemberAddressNss(_query.queryMemberAddressAsFormattedLong(targetDate));
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsFormattedMany() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsFormattedMany(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsFormattedMany());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLatest() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsLatest(); }});
        MemberLoginNss moreNss = new MemberLoginNss(_query.queryMemberLoginAsLatest());
        return moreNss;
    }

    /**
     * With nested relation columns to select clause. <br />
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberSecurityNss withMemberSecurityAsOne() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberSecurityAsOne(); }});
        MemberSecurityNss moreNss = new MemberSecurityNss(_query.queryMemberSecurityAsOne());
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberServiceNss withMemberServiceAsOne() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberServiceAsOne(); }});
        MemberServiceNss moreNss = new MemberServiceNss(_query.queryMemberServiceAsOne());
        moreNss.withServiceRank();
        return moreNss;
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberWithdrawalNss withMemberWithdrawalAsOne() {
        _query.doNss(new MemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberWithdrawalAsOne(); }});
        MemberWithdrawalNss moreNss = new MemberWithdrawalNss(_query.queryMemberWithdrawalAsOne());
        return moreNss;
    }
}
