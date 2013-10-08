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
package com.example.dbflute.mysql.dbflute.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.mysql.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;
import com.example.dbflute.mysql.dbflute.cbean.nss.*;

/**
 * The base condition-bean of member.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isCheckCountBeforeQueryUpdate()) {
            enableCheckCountBeforeQueryUpdate();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "member";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        BsMemberCB cb = this;
        cb.query().setMemberId_Equal(memberId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (co-related sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (co-related sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MemberCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MemberCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MemberCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MemberCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MemberCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MemberCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MemberCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MemberCB> unionQuery) {
        final MemberCB cb = new MemberCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final MemberCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MemberCB> unionQuery) {
        final MemberCB cb = new MemberCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final MemberCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberStatusNss _nssMemberStatus;
    public MemberStatusNss getNssMemberStatus() {
        if (_nssMemberStatus == null) { _nssMemberStatus = new MemberStatusNss(null); }
        return _nssMemberStatus;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberStatusNss setupSelect_MemberStatus() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberStatusCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberStatus(); } });
        if (_nssMemberStatus == null || !_nssMemberStatus.hasConditionQuery())
        { _nssMemberStatus = new MemberStatusNss(query().queryMemberStatus()); }
        return _nssMemberStatus;
    }
    protected MemberAddressNss _nssMemberAddressAsValid;
    public MemberAddressNss getNssMemberAddressAsValid() {
        if (_nssMemberAddressAsValid == null) { _nssMemberAddressAsValid = new MemberAddressNss(null); }
        return _nssMemberAddressAsValid;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsValid(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberAddressAsValid()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsValid(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsValid(targetDate); } });
        if (_nssMemberAddressAsValid == null || !_nssMemberAddressAsValid.hasConditionQuery())
        { _nssMemberAddressAsValid = new MemberAddressNss(query().queryMemberAddressAsValid(targetDate)); }
        return _nssMemberAddressAsValid;
    }
    protected MemberAddressNss _nssMemberAddressAsValidBefore;
    public MemberAddressNss getNssMemberAddressAsValidBefore() {
        if (_nssMemberAddressAsValidBefore == null) { _nssMemberAddressAsValidBefore = new MemberAddressNss(null); }
        return _nssMemberAddressAsValidBefore;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsValidBefore(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberAddressAsValidBefore()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsValidBefore(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsValidBefore(targetDate); } });
        if (_nssMemberAddressAsValidBefore == null || !_nssMemberAddressAsValidBefore.hasConditionQuery())
        { _nssMemberAddressAsValidBefore = new MemberAddressNss(query().queryMemberAddressAsValidBefore(targetDate)); }
        return _nssMemberAddressAsValidBefore;
    }
    protected MemberLoginNss _nssMemberLoginAsLoginStatus;
    public MemberLoginNss getNssMemberLoginAsLoginStatus() {
        if (_nssMemberLoginAsLoginStatus == null) { _nssMemberLoginAsLoginStatus = new MemberLoginNss(null); }
        return _nssMemberLoginAsLoginStatus;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsLoginStatus(statusCode)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsLoginStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLoginStatus(final com.example.dbflute.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsLoginStatus(statusCode); } });
        if (_nssMemberLoginAsLoginStatus == null || !_nssMemberLoginAsLoginStatus.hasConditionQuery())
        { _nssMemberLoginAsLoginStatus = new MemberLoginNss(query().queryMemberLoginAsLoginStatus(statusCode)); }
        return _nssMemberLoginAsLoginStatus;
    }
    protected MemberAddressNss _nssMemberAddressAsIfComment;
    public MemberAddressNss getNssMemberAddressAsIfComment() {
        if (_nssMemberAddressAsIfComment == null) { _nssMemberAddressAsIfComment = new MemberAddressNss(null); }
        return _nssMemberAddressAsIfComment;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsIfComment(targetDate, region)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberAddressAsIfComment()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
     * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsIfComment(final java.util.Date targetDate, final com.example.dbflute.mysql.dbflute.allcommon.CDef.Region region) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsIfComment(targetDate, region); } });
        if (_nssMemberAddressAsIfComment == null || !_nssMemberAddressAsIfComment.hasConditionQuery())
        { _nssMemberAddressAsIfComment = new MemberAddressNss(query().queryMemberAddressAsIfComment(targetDate, region)); }
        return _nssMemberAddressAsIfComment;
    }
    protected MemberAddressNss _nssMemberAddressAsOnlyOneDate;
    public MemberAddressNss getNssMemberAddressAsOnlyOneDate() {
        if (_nssMemberAddressAsOnlyOneDate == null) { _nssMemberAddressAsOnlyOneDate = new MemberAddressNss(null); }
        return _nssMemberAddressAsOnlyOneDate;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsOnlyOneDate(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberAddressAsOnlyOneDate()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsOnlyOneDate(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsOnlyOneDate(targetDate); } });
        if (_nssMemberAddressAsOnlyOneDate == null || !_nssMemberAddressAsOnlyOneDate.hasConditionQuery())
        { _nssMemberAddressAsOnlyOneDate = new MemberAddressNss(query().queryMemberAddressAsOnlyOneDate(targetDate)); }
        return _nssMemberAddressAsOnlyOneDate;
    }
    protected MemberLoginNss _nssMemberLoginAsLocalForeignOverTest;
    public MemberLoginNss getNssMemberLoginAsLocalForeignOverTest() {
        if (_nssMemberLoginAsLocalForeignOverTest == null) { _nssMemberLoginAsLocalForeignOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsLocalForeignOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsLocalForeignOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsLocalForeignOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLocalForeignOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsLocalForeignOverTest(); } });
        if (_nssMemberLoginAsLocalForeignOverTest == null || !_nssMemberLoginAsLocalForeignOverTest.hasConditionQuery())
        { _nssMemberLoginAsLocalForeignOverTest = new MemberLoginNss(query().queryMemberLoginAsLocalForeignOverTest()); }
        return _nssMemberLoginAsLocalForeignOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignEachOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignEachOverTest() {
        if (_nssMemberLoginAsForeignForeignEachOverTest == null) { _nssMemberLoginAsForeignForeignEachOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignEachOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignEachOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignEachOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignEachOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignEachOverTest(); } });
        if (_nssMemberLoginAsForeignForeignEachOverTest == null || !_nssMemberLoginAsForeignForeignEachOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignEachOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignEachOverTest()); }
        return _nssMemberLoginAsForeignForeignEachOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedBasicOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedBasicOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedBasicOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedBasicOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignOptimizedBasicOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignOptimizedBasicOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedBasicOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignOptimizedBasicOverTest(); } });
        if (_nssMemberLoginAsForeignForeignOptimizedBasicOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedBasicOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedBasicOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedBasicOverTest()); }
        return _nssMemberLoginAsForeignForeignOptimizedBasicOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedMarkOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedMarkOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedMarkOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedMarkOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignOptimizedMarkOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignOptimizedMarkOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedMarkOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignOptimizedMarkOverTest(); } });
        if (_nssMemberLoginAsForeignForeignOptimizedMarkOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedMarkOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedMarkOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedMarkOverTest()); }
        return _nssMemberLoginAsForeignForeignOptimizedMarkOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedPartOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedPartOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedPartOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignOptimizedPartOverTest(memberName)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignOptimizedPartOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedPartOverTest(final String memberName) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignOptimizedPartOverTest(memberName); } });
        if (_nssMemberLoginAsForeignForeignOptimizedPartOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedPartOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedPartOverTest(memberName)); }
        return _nssMemberLoginAsForeignForeignOptimizedPartOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedWholeOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedWholeOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedWholeOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignOptimizedWholeOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignOptimizedWholeOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedWholeOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(); } });
        if (_nssMemberLoginAsForeignForeignOptimizedWholeOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedWholeOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedWholeOverTest()); }
        return _nssMemberLoginAsForeignForeignOptimizedWholeOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignParameterOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignParameterOverTest() {
        if (_nssMemberLoginAsForeignForeignParameterOverTest == null) { _nssMemberLoginAsForeignForeignParameterOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignParameterOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignParameterOverTest(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignParameterOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignParameterOverTest(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignParameterOverTest(targetDate); } });
        if (_nssMemberLoginAsForeignForeignParameterOverTest == null || !_nssMemberLoginAsForeignForeignParameterOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignParameterOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignParameterOverTest(targetDate)); }
        return _nssMemberLoginAsForeignForeignParameterOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsForeignForeignVariousOverTest;
    public MemberLoginNss getNssMemberLoginAsForeignForeignVariousOverTest() {
        if (_nssMemberLoginAsForeignForeignVariousOverTest == null) { _nssMemberLoginAsForeignForeignVariousOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignVariousOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsForeignForeignVariousOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsForeignForeignVariousOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignVariousOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsForeignForeignVariousOverTest(); } });
        if (_nssMemberLoginAsForeignForeignVariousOverTest == null || !_nssMemberLoginAsForeignForeignVariousOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignVariousOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignVariousOverTest()); }
        return _nssMemberLoginAsForeignForeignVariousOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsReferrerOverTest;
    public MemberLoginNss getNssMemberLoginAsReferrerOverTest() {
        if (_nssMemberLoginAsReferrerOverTest == null) { _nssMemberLoginAsReferrerOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsReferrerOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsReferrerOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsReferrerOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsReferrerOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsReferrerOverTest(); } });
        if (_nssMemberLoginAsReferrerOverTest == null || !_nssMemberLoginAsReferrerOverTest.hasConditionQuery())
        { _nssMemberLoginAsReferrerOverTest = new MemberLoginNss(query().queryMemberLoginAsReferrerOverTest()); }
        return _nssMemberLoginAsReferrerOverTest;
    }
    protected MemberLoginNss _nssMemberLoginAsReferrerForeignOverTest;
    public MemberLoginNss getNssMemberLoginAsReferrerForeignOverTest() {
        if (_nssMemberLoginAsReferrerForeignOverTest == null) { _nssMemberLoginAsReferrerForeignOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsReferrerForeignOverTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsReferrerForeignOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsReferrerForeignOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsReferrerForeignOverTest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsReferrerForeignOverTest(); } });
        if (_nssMemberLoginAsReferrerForeignOverTest == null || !_nssMemberLoginAsReferrerForeignOverTest.hasConditionQuery())
        { _nssMemberLoginAsReferrerForeignOverTest = new MemberLoginNss(query().queryMemberLoginAsReferrerForeignOverTest()); }
        return _nssMemberLoginAsReferrerForeignOverTest;
    }
    protected MemberAddressNss _nssMemberAddressAsFormattedBasic;
    public MemberAddressNss getNssMemberAddressAsFormattedBasic() {
        if (_nssMemberAddressAsFormattedBasic == null) { _nssMemberAddressAsFormattedBasic = new MemberAddressNss(null); }
        return _nssMemberAddressAsFormattedBasic;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsFormattedBasic(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberAddressAsFormattedBasic()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsFormattedBasic(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsFormattedBasic(targetDate); } });
        if (_nssMemberAddressAsFormattedBasic == null || !_nssMemberAddressAsFormattedBasic.hasConditionQuery())
        { _nssMemberAddressAsFormattedBasic = new MemberAddressNss(query().queryMemberAddressAsFormattedBasic(targetDate)); }
        return _nssMemberAddressAsFormattedBasic;
    }
    protected MemberAddressNss _nssMemberAddressAsFormattedLong;
    public MemberAddressNss getNssMemberAddressAsFormattedLong() {
        if (_nssMemberAddressAsFormattedLong == null) { _nssMemberAddressAsFormattedLong = new MemberAddressNss(null); }
        return _nssMemberAddressAsFormattedLong;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsFormattedLong(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberAddressAsFormattedLong()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsFormattedLong(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsFormattedLong(targetDate); } });
        if (_nssMemberAddressAsFormattedLong == null || !_nssMemberAddressAsFormattedLong.hasConditionQuery())
        { _nssMemberAddressAsFormattedLong = new MemberAddressNss(query().queryMemberAddressAsFormattedLong(targetDate)); }
        return _nssMemberAddressAsFormattedLong;
    }
    protected MemberLoginNss _nssMemberLoginAsFormattedMany;
    public MemberLoginNss getNssMemberLoginAsFormattedMany() {
        if (_nssMemberLoginAsFormattedMany == null) { _nssMemberLoginAsFormattedMany = new MemberLoginNss(null); }
        return _nssMemberLoginAsFormattedMany;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsFormattedMany()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsFormattedMany()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsFormattedMany() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsFormattedMany(); } });
        if (_nssMemberLoginAsFormattedMany == null || !_nssMemberLoginAsFormattedMany.hasConditionQuery())
        { _nssMemberLoginAsFormattedMany = new MemberLoginNss(query().queryMemberLoginAsFormattedMany()); }
        return _nssMemberLoginAsFormattedMany;
    }
    protected MemberLoginNss _nssMemberLoginAsLatest;
    public MemberLoginNss getNssMemberLoginAsLatest() {
        if (_nssMemberLoginAsLatest == null) { _nssMemberLoginAsLatest = new MemberLoginNss(null); }
        return _nssMemberLoginAsLatest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLatest() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsLatest(); } });
        if (_nssMemberLoginAsLatest == null || !_nssMemberLoginAsLatest.hasConditionQuery())
        { _nssMemberLoginAsLatest = new MemberLoginNss(query().queryMemberLoginAsLatest()); }
        return _nssMemberLoginAsLatest;
    }

    protected MemberSecurityNss _nssMemberSecurityAsOne;
    public MemberSecurityNss getNssMemberSecurityAsOne() {
        if (_nssMemberSecurityAsOne == null) { _nssMemberSecurityAsOne = new MemberSecurityNss(null); }
        return _nssMemberSecurityAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberSecurityNss setupSelect_MemberSecurityAsOne() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberSecurityAsOne(); } });
        if (_nssMemberSecurityAsOne == null || !_nssMemberSecurityAsOne.hasConditionQuery()) { _nssMemberSecurityAsOne = new MemberSecurityNss(query().queryMemberSecurityAsOne()); }
        return _nssMemberSecurityAsOne;
    }

    protected MemberServiceNss _nssMemberServiceAsOne;
    public MemberServiceNss getNssMemberServiceAsOne() {
        if (_nssMemberServiceAsOne == null) { _nssMemberServiceAsOne = new MemberServiceNss(null); }
        return _nssMemberServiceAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberServiceAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberServiceAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberServiceNss setupSelect_MemberServiceAsOne() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberServiceAsOne(); } });
        if (_nssMemberServiceAsOne == null || !_nssMemberServiceAsOne.hasConditionQuery()) { _nssMemberServiceAsOne = new MemberServiceNss(query().queryMemberServiceAsOne()); }
        return _nssMemberServiceAsOne;
    }

    protected MemberWithdrawalNss _nssMemberWithdrawalAsOne;
    public MemberWithdrawalNss getNssMemberWithdrawalAsOne() {
        if (_nssMemberWithdrawalAsOne == null) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(null); }
        return _nssMemberWithdrawalAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #FD4747">getMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberWithdrawalNss setupSelect_MemberWithdrawalAsOne() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberWithdrawalAsOne(); } });
        if (_nssMemberWithdrawalAsOne == null || !_nssMemberWithdrawalAsOne.hasConditionQuery()) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(query().queryMemberWithdrawalAsOne()); }
        return _nssMemberWithdrawalAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<MemberCQ>() {
                public boolean has() { return true; }
                public MemberCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MemberCQ> {
        protected MemberStatusCB.HpSpecification _memberStatus;
        protected MemberAddressCB.HpSpecification _memberAddressAsValid;
        protected MemberAddressCB.HpSpecification _memberAddressAsValidBefore;
        protected MemberLoginCB.HpSpecification _memberLoginAsLoginStatus;
        protected MemberAddressCB.HpSpecification _memberAddressAsIfComment;
        protected MemberAddressCB.HpSpecification _memberAddressAsOnlyOneDate;
        protected MemberLoginCB.HpSpecification _memberLoginAsLocalForeignOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignEachOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedBasicOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedMarkOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedPartOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedWholeOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignParameterOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignVariousOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsReferrerOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsReferrerForeignOverTest;
        protected MemberAddressCB.HpSpecification _memberAddressAsFormattedBasic;
        protected MemberAddressCB.HpSpecification _memberAddressAsFormattedLong;
        protected MemberLoginCB.HpSpecification _memberLoginAsFormattedMany;
        protected MemberLoginCB.HpSpecification _memberLoginAsLatest;
        protected MemberSecurityCB.HpSpecification _memberSecurityAsOne;
        protected MemberServiceCB.HpSpecification _memberServiceAsOne;
        protected MemberWithdrawalCB.HpSpecification _memberWithdrawalAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MemberCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberName() { return doColumn("MEMBER_NAME"); }
        /**
         * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberAccount() { return doColumn("MEMBER_ACCOUNT"); }
        /**
         * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberStatusCode() { return doColumn("MEMBER_STATUS_CODE"); }
        /**
         * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFormalizedDatetime() { return doColumn("FORMALIZED_DATETIME"); }
        /**
         * (生年月日)BIRTHDATE: {DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBirthdate() { return doColumn("BIRTHDATE"); }
        /**
         * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberStatusCQ) {
                columnMemberStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "member"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberStatusCB.HpSpecification specifyMemberStatus() {
            assertRelation("memberStatus");
            if (_memberStatus == null) {
                _memberStatus = new MemberStatusCB.HpSpecification(_baseCB, new HpSpQyCall<MemberStatusCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberStatus(); }
                    public MemberStatusCQ qy() { return _qyCall.qy().queryMemberStatus(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberStatus.xsetSyncQyCall(new HpSpQyCall<MemberStatusCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberStatus(); }
                        public MemberStatusCQ qy() { return xsyncQyCall().qy().queryMemberStatus(); }
                    });
                }
            }
            return _memberStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValid(final java.util.Date targetDate) {
            assertRelation("memberAddressAsValid");
            if (_memberAddressAsValid == null) {
                _memberAddressAsValid = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValid(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsValid(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValid.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValid(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsValid(targetDate); }
                    });
                }
            }
            return _memberAddressAsValid;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValid() {
            assertRelation("memberAddressAsValid");
            if (_memberAddressAsValid == null) {
                _memberAddressAsValid = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValid(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsValid(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValid.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValid(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsValid(); }
                    });
                }
            }
            return _memberAddressAsValid;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValidBefore(final java.util.Date targetDate) {
            assertRelation("memberAddressAsValidBefore");
            if (_memberAddressAsValidBefore == null) {
                _memberAddressAsValidBefore = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValidBefore(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsValidBefore(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValidBefore.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValidBefore(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsValidBefore(targetDate); }
                    });
                }
            }
            return _memberAddressAsValidBefore;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValidBefore() {
            assertRelation("memberAddressAsValidBefore");
            if (_memberAddressAsValidBefore == null) {
                _memberAddressAsValidBefore = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValidBefore(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsValidBefore(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValidBefore.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValidBefore(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsValidBefore(); }
                    });
                }
            }
            return _memberAddressAsValidBefore;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
         * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLoginStatus(final com.example.dbflute.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
            assertRelation("memberLoginAsLoginStatus");
            if (_memberLoginAsLoginStatus == null) {
                _memberLoginAsLoginStatus = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLoginStatus(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsLoginStatus(statusCode); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLoginStatus.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLoginStatus(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsLoginStatus(statusCode); }
                    });
                }
            }
            return _memberLoginAsLoginStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLoginStatus() {
            assertRelation("memberLoginAsLoginStatus");
            if (_memberLoginAsLoginStatus == null) {
                _memberLoginAsLoginStatus = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLoginStatus(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().getConditionQueryMemberLoginAsLoginStatus(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLoginStatus.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLoginStatus(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberLoginAsLoginStatus(); }
                    });
                }
            }
            return _memberLoginAsLoginStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
         * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsIfComment(final java.util.Date targetDate, final com.example.dbflute.mysql.dbflute.allcommon.CDef.Region region) {
            assertRelation("memberAddressAsIfComment");
            if (_memberAddressAsIfComment == null) {
                _memberAddressAsIfComment = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsIfComment(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsIfComment(targetDate, region); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsIfComment.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsIfComment(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsIfComment(targetDate, region); }
                    });
                }
            }
            return _memberAddressAsIfComment;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsIfComment() {
            assertRelation("memberAddressAsIfComment");
            if (_memberAddressAsIfComment == null) {
                _memberAddressAsIfComment = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsIfComment(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsIfComment(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsIfComment.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsIfComment(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsIfComment(); }
                    });
                }
            }
            return _memberAddressAsIfComment;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsOnlyOneDate(final java.util.Date targetDate) {
            assertRelation("memberAddressAsOnlyOneDate");
            if (_memberAddressAsOnlyOneDate == null) {
                _memberAddressAsOnlyOneDate = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsOnlyOneDate(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsOnlyOneDate(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsOnlyOneDate.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsOnlyOneDate(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsOnlyOneDate(targetDate); }
                    });
                }
            }
            return _memberAddressAsOnlyOneDate;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsOnlyOneDate() {
            assertRelation("memberAddressAsOnlyOneDate");
            if (_memberAddressAsOnlyOneDate == null) {
                _memberAddressAsOnlyOneDate = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsOnlyOneDate(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsOnlyOneDate(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsOnlyOneDate.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsOnlyOneDate(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsOnlyOneDate(); }
                    });
                }
            }
            return _memberAddressAsOnlyOneDate;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLocalForeignOverTest() {
            assertRelation("memberLoginAsLocalForeignOverTest");
            if (_memberLoginAsLocalForeignOverTest == null) {
                _memberLoginAsLocalForeignOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLocalForeignOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsLocalForeignOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLocalForeignOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLocalForeignOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsLocalForeignOverTest(); }
                    });
                }
            }
            return _memberLoginAsLocalForeignOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignEachOverTest() {
            assertRelation("memberLoginAsForeignForeignEachOverTest");
            if (_memberLoginAsForeignForeignEachOverTest == null) {
                _memberLoginAsForeignForeignEachOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignEachOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignEachOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignEachOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignEachOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignEachOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignEachOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedBasicOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedBasicOverTest");
            if (_memberLoginAsForeignForeignOptimizedBasicOverTest == null) {
                _memberLoginAsForeignForeignOptimizedBasicOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedBasicOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedBasicOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedBasicOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedBasicOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedMarkOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedMarkOverTest");
            if (_memberLoginAsForeignForeignOptimizedMarkOverTest == null) {
                _memberLoginAsForeignForeignOptimizedMarkOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedMarkOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedMarkOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedMarkOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedMarkOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
         * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedPartOverTest(final String memberName) {
            assertRelation("memberLoginAsForeignForeignOptimizedPartOverTest");
            if (_memberLoginAsForeignForeignOptimizedPartOverTest == null) {
                _memberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedPartOverTest(memberName); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedPartOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedPartOverTest(memberName); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedPartOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedPartOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedPartOverTest");
            if (_memberLoginAsForeignForeignOptimizedPartOverTest == null) {
                _memberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedPartOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedPartOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedWholeOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedWholeOverTest");
            if (_memberLoginAsForeignForeignOptimizedWholeOverTest == null) {
                _memberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedWholeOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedWholeOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignParameterOverTest(final java.util.Date targetDate) {
            assertRelation("memberLoginAsForeignForeignParameterOverTest");
            if (_memberLoginAsForeignForeignParameterOverTest == null) {
                _memberLoginAsForeignForeignParameterOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignParameterOverTest(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignParameterOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignParameterOverTest(targetDate); }
                    });
                }
            }
            return _memberLoginAsForeignForeignParameterOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignParameterOverTest() {
            assertRelation("memberLoginAsForeignForeignParameterOverTest");
            if (_memberLoginAsForeignForeignParameterOverTest == null) {
                _memberLoginAsForeignForeignParameterOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().getConditionQueryMemberLoginAsForeignForeignParameterOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignParameterOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberLoginAsForeignForeignParameterOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignParameterOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignVariousOverTest() {
            assertRelation("memberLoginAsForeignForeignVariousOverTest");
            if (_memberLoginAsForeignForeignVariousOverTest == null) {
                _memberLoginAsForeignForeignVariousOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignVariousOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsForeignForeignVariousOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignVariousOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignVariousOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignVariousOverTest(); }
                    });
                }
            }
            return _memberLoginAsForeignForeignVariousOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsReferrerOverTest() {
            assertRelation("memberLoginAsReferrerOverTest");
            if (_memberLoginAsReferrerOverTest == null) {
                _memberLoginAsReferrerOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsReferrerOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsReferrerOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsReferrerOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsReferrerOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsReferrerOverTest(); }
                    });
                }
            }
            return _memberLoginAsReferrerOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsReferrerForeignOverTest() {
            assertRelation("memberLoginAsReferrerForeignOverTest");
            if (_memberLoginAsReferrerForeignOverTest == null) {
                _memberLoginAsReferrerForeignOverTest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsReferrerForeignOverTest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsReferrerForeignOverTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsReferrerForeignOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsReferrerForeignOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsReferrerForeignOverTest(); }
                    });
                }
            }
            return _memberLoginAsReferrerForeignOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedBasic(final java.util.Date targetDate) {
            assertRelation("memberAddressAsFormattedBasic");
            if (_memberAddressAsFormattedBasic == null) {
                _memberAddressAsFormattedBasic = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedBasic(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsFormattedBasic(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedBasic.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedBasic(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsFormattedBasic(targetDate); }
                    });
                }
            }
            return _memberAddressAsFormattedBasic;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedBasic() {
            assertRelation("memberAddressAsFormattedBasic");
            if (_memberAddressAsFormattedBasic == null) {
                _memberAddressAsFormattedBasic = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedBasic(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsFormattedBasic(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedBasic.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedBasic(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsFormattedBasic(); }
                    });
                }
            }
            return _memberAddressAsFormattedBasic;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedLong(final java.util.Date targetDate) {
            assertRelation("memberAddressAsFormattedLong");
            if (_memberAddressAsFormattedLong == null) {
                _memberAddressAsFormattedLong = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedLong(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsFormattedLong(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedLong.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedLong(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsFormattedLong(targetDate); }
                    });
                }
            }
            return _memberAddressAsFormattedLong;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedLong() {
            assertRelation("memberAddressAsFormattedLong");
            if (_memberAddressAsFormattedLong == null) {
                _memberAddressAsFormattedLong = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedLong(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsFormattedLong(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedLong.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedLong(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsFormattedLong(); }
                    });
                }
            }
            return _memberAddressAsFormattedLong;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsFormattedMany() {
            assertRelation("memberLoginAsFormattedMany");
            if (_memberLoginAsFormattedMany == null) {
                _memberLoginAsFormattedMany = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsFormattedMany(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsFormattedMany(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsFormattedMany.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsFormattedMany(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsFormattedMany(); }
                    });
                }
            }
            return _memberLoginAsFormattedMany;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLatest() {
            assertRelation("memberLoginAsLatest");
            if (_memberLoginAsLatest == null) {
                _memberLoginAsLatest = new MemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLatest(); }
                    public MemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsLatest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLatest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLatest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsLatest(); }
                    });
                }
            }
            return _memberLoginAsLatest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberSecurityCB.HpSpecification specifyMemberSecurityAsOne() {
            assertRelation("memberSecurityAsOne");
            if (_memberSecurityAsOne == null) {
                _memberSecurityAsOne = new MemberSecurityCB.HpSpecification(_baseCB, new HpSpQyCall<MemberSecurityCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberSecurityAsOne(); }
                    public MemberSecurityCQ qy() { return _qyCall.qy().queryMemberSecurityAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberSecurityAsOne.xsetSyncQyCall(new HpSpQyCall<MemberSecurityCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberSecurityAsOne(); }
                        public MemberSecurityCQ qy() { return xsyncQyCall().qy().queryMemberSecurityAsOne(); }
                    });
                }
            }
            return _memberSecurityAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberServiceCB.HpSpecification specifyMemberServiceAsOne() {
            assertRelation("memberServiceAsOne");
            if (_memberServiceAsOne == null) {
                _memberServiceAsOne = new MemberServiceCB.HpSpecification(_baseCB, new HpSpQyCall<MemberServiceCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberServiceAsOne(); }
                    public MemberServiceCQ qy() { return _qyCall.qy().queryMemberServiceAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberServiceAsOne.xsetSyncQyCall(new HpSpQyCall<MemberServiceCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberServiceAsOne(); }
                        public MemberServiceCQ qy() { return xsyncQyCall().qy().queryMemberServiceAsOne(); }
                    });
                }
            }
            return _memberServiceAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberWithdrawalCB.HpSpecification specifyMemberWithdrawalAsOne() {
            assertRelation("memberWithdrawalAsOne");
            if (_memberWithdrawalAsOne == null) {
                _memberWithdrawalAsOne = new MemberWithdrawalCB.HpSpecification(_baseCB, new HpSpQyCall<MemberWithdrawalCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberWithdrawalAsOne(); }
                    public MemberWithdrawalCQ qy() { return _qyCall.qy().queryMemberWithdrawalAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberWithdrawalAsOne.xsetSyncQyCall(new HpSpQyCall<MemberWithdrawalCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberWithdrawalAsOne(); }
                        public MemberWithdrawalCQ qy() { return xsyncQyCall().qy().queryMemberWithdrawalAsOne(); }
                    });
                }
            }
            return _memberWithdrawalAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from member_address where ...) as FOO_MAX} <br />
         * (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedMemberAddressList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
         *     public void query(MemberAddressCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MemberAddress.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MemberAddressCB, MemberCQ> derivedMemberAddressList() {
            assertDerived("memberAddressList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MemberAddressCB, MemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MemberAddressCB, MemberCQ>() {
                public void setup(String function, SubQuery<MemberAddressCB> subQuery, MemberCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveMemberAddressList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from member_login where ...) as FOO_MAX} <br />
         * (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedMemberLoginList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberLoginCB&gt;() {
         *     public void query(MemberLoginCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MemberLogin.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MemberLoginCB, MemberCQ> derivedMemberLoginList() {
            assertDerived("memberLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MemberLoginCB, MemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MemberLoginCB, MemberCQ>() {
                public void setup(String function, SubQuery<MemberLoginCB> subQuery, MemberCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveMemberLoginList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from purchase where ...) as FOO_MAX} <br />
         * (購入)purchase by MEMBER_ID, named 'purchaseList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedPurchaseList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, Purchase.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<PurchaseCB, MemberCQ> derivedPurchaseList() {
            assertDerived("purchaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<PurchaseCB, MemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<PurchaseCB, MemberCQ>() {
                public void setup(String function, SubQuery<PurchaseCB> subQuery, MemberCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderivePurchaseList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MemberCB, MemberCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MemberCB, MemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MemberCB, MemberCQ>() {
                public void setup(String function, SubQuery<MemberCB> subQuery, MemberCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsmyselfDerive(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MemberCB> columnQuery(final SpecifyQuery<MemberCB> leftSpecifyQuery) {
        return new HpColQyOperand<MemberCB>(new HpColQyHandler<MemberCB>() {
            public HpCalculator handle(SpecifyQuery<MemberCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MemberCB xcreateColumnQueryCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForColumnQuery((MemberCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MemberCB dreamCruiseCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForDreamCruise((MemberCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                        OrScopeQuery
    //                                                                        ============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MemberCB> orQuery) {
        xorSQ((MemberCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MemberCB&gt;() {
     *             public void query(MemberCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MemberCB> andQuery) {
        xorSQAP((MemberCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MemberCB cb;
        if (mainCB != null) {
            cb = (MemberCB)mainCB;
        } else {
            cb = new MemberCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MemberCQ>() {
            public boolean has() { return true; }
            public MemberCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MemberCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MemberCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
