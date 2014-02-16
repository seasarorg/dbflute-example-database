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
 * The base condition-bean of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseCB() {
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
        return "purchase";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long purchaseId) {
        assertObjectNotNull("purchaseId", purchaseId);
        BsPurchaseCB cb = this;
        cb.query().setPurchaseId_Equal(purchaseId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_PurchaseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_PurchaseId_Desc();
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
    public PurchaseCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public PurchaseCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected PurchaseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected PurchaseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        PurchaseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected PurchaseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new PurchaseCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<PurchaseCB> unionQuery) {
        final PurchaseCB cb = new PurchaseCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final PurchaseCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<PurchaseCB> unionQuery) {
        final PurchaseCB cb = new PurchaseCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final PurchaseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberNss _nssMember;
    public MemberNss getNssMember() {
        if (_nssMember == null) { _nssMember = new MemberNss(null); }
        return _nssMember;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)member by my MEMBER_ID, named 'member'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_Member()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_Member() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMember(); } });
        if (_nssMember == null || !_nssMember.hasConditionQuery())
        { _nssMember = new MemberNss(query().queryMember()); }
        return _nssMember;
    }
    protected ProductNss _nssProduct;
    public ProductNss getNssProduct() {
        if (_nssProduct == null) { _nssProduct = new ProductNss(null); }
        return _nssProduct;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (商品)product by my PRODUCT_ID, named 'product'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_Product()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public ProductNss setupSelect_Product() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnProductId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryProduct(); } });
        if (_nssProduct == null || !_nssProduct.hasConditionQuery())
        { _nssProduct = new ProductNss(query().queryProduct()); }
        return _nssProduct;
    }
    protected SummaryProductNss _nssSummaryProduct;
    public SummaryProductNss getNssSummaryProduct() {
        if (_nssSummaryProduct == null) { _nssSummaryProduct = new SummaryProductNss(null); }
        return _nssSummaryProduct;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_SummaryProduct()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getSummaryProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SummaryProductNss setupSelect_SummaryProduct() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnProductId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().querySummaryProduct(); } });
        if (_nssSummaryProduct == null || !_nssSummaryProduct.hasConditionQuery())
        { _nssSummaryProduct = new SummaryProductNss(query().querySummaryProduct()); }
        return _nssSummaryProduct;
    }
    protected SummaryWithdrawalNss _nssSummaryWithdrawal;
    public SummaryWithdrawalNss getNssSummaryWithdrawal() {
        if (_nssSummaryWithdrawal == null) { _nssSummaryWithdrawal = new SummaryWithdrawalNss(null); }
        return _nssSummaryWithdrawal;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_SummaryWithdrawal()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getSummaryWithdrawal()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SummaryWithdrawalNss setupSelect_SummaryWithdrawal() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().querySummaryWithdrawal(); } });
        if (_nssSummaryWithdrawal == null || !_nssSummaryWithdrawal.hasConditionQuery())
        { _nssSummaryWithdrawal = new SummaryWithdrawalNss(query().querySummaryWithdrawal()); }
        return _nssSummaryWithdrawal;
    }
    protected WhiteNoPkRelationNss _nssWhiteNoPkRelation;
    public WhiteNoPkRelationNss getNssWhiteNoPkRelation() {
        if (_nssWhiteNoPkRelation == null) { _nssWhiteNoPkRelation = new WhiteNoPkRelationNss(null); }
        return _nssWhiteNoPkRelation;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteNoPkRelation()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getWhiteNoPkRelation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteNoPkRelationNss setupSelect_WhiteNoPkRelation() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnProductId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteNoPkRelation(); } });
        if (_nssWhiteNoPkRelation == null || !_nssWhiteNoPkRelation.hasConditionQuery())
        { _nssWhiteNoPkRelation = new WhiteNoPkRelationNss(query().queryWhiteNoPkRelation()); }
        return _nssWhiteNoPkRelation;
    }
    protected PurchaseNss _nssPurchaseSelf;
    public PurchaseNss getNssPurchaseSelf() {
        if (_nssPurchaseSelf == null) { _nssPurchaseSelf = new PurchaseNss(null); }
        return _nssPurchaseSelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_PurchaseSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getPurchaseSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PurchaseNss setupSelect_PurchaseSelf() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryPurchaseSelf(); } });
        if (_nssPurchaseSelf == null || !_nssPurchaseSelf.hasConditionQuery())
        { _nssPurchaseSelf = new PurchaseNss(query().queryPurchaseSelf()); }
        return _nssPurchaseSelf;
    }
    protected MemberAddressNss _nssMemberAddressAsSkipRelation;
    public MemberAddressNss getNssMemberAddressAsSkipRelation() {
        if (_nssMemberAddressAsSkipRelation == null) { _nssMemberAddressAsSkipRelation = new MemberAddressNss(null); }
        return _nssMemberAddressAsSkipRelation;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberAddressAsSkipRelation(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getMemberAddressAsSkipRelation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsSkipRelation(final java.util.Date targetDate) {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberAddressAsSkipRelation(targetDate); } });
        if (_nssMemberAddressAsSkipRelation == null || !_nssMemberAddressAsSkipRelation.hasConditionQuery())
        { _nssMemberAddressAsSkipRelation = new MemberAddressNss(query().queryMemberAddressAsSkipRelation(targetDate)); }
        return _nssMemberAddressAsSkipRelation;
    }

    protected WhitePurchaseReferrerNss _nssWhitePurchaseReferrerAsOne;
    public WhitePurchaseReferrerNss getNssWhitePurchaseReferrerAsOne() {
        if (_nssWhitePurchaseReferrerAsOne == null) { _nssWhitePurchaseReferrerAsOne = new WhitePurchaseReferrerNss(null); }
        return _nssWhitePurchaseReferrerAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_WhitePurchaseReferrerAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getWhitePurchaseReferrerAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePurchaseReferrerNss setupSelect_WhitePurchaseReferrerAsOne() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhitePurchaseReferrerAsOne(); } });
        if (_nssWhitePurchaseReferrerAsOne == null || !_nssWhitePurchaseReferrerAsOne.hasConditionQuery()) { _nssWhitePurchaseReferrerAsOne = new WhitePurchaseReferrerNss(query().queryWhitePurchaseReferrerAsOne()); }
        return _nssWhitePurchaseReferrerAsOne;
    }

    protected PurchaseNss _nssPurchaseSelfAsOne;
    public PurchaseNss getNssPurchaseSelfAsOne() {
        if (_nssPurchaseSelfAsOne == null) { _nssPurchaseSelfAsOne = new PurchaseNss(null); }
        return _nssPurchaseSelfAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.<span style="color: #FD4747">setupSelect_PurchaseSelfAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchase.<span style="color: #FD4747">getPurchaseSelfAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PurchaseNss setupSelect_PurchaseSelfAsOne() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryPurchaseSelfAsOne(); } });
        if (_nssPurchaseSelfAsOne == null || !_nssPurchaseSelfAsOne.hasConditionQuery()) { _nssPurchaseSelfAsOne = new PurchaseNss(query().queryPurchaseSelfAsOne()); }
        return _nssPurchaseSelfAsOne;
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
            , new HpSpQyCall<PurchaseCQ>() {
                public boolean has() { return true; }
                public PurchaseCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<PurchaseCQ> {
        protected MemberCB.HpSpecification _member;
        protected ProductCB.HpSpecification _product;
        protected SummaryProductCB.HpSpecification _summaryProduct;
        protected SummaryWithdrawalCB.HpSpecification _summaryWithdrawal;
        protected WhiteNoPkRelationCB.HpSpecification _whiteNoPkRelation;
        protected PurchaseCB.HpSpecification _purchaseSelf;
        protected MemberAddressCB.HpSpecification _memberAddressAsSkipRelation;
        protected WhitePurchaseReferrerCB.HpSpecification _whitePurchaseReferrerAsOne;
        protected PurchaseCB.HpSpecification _purchaseSelfAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<PurchaseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPurchaseId() { return doColumn("PURCHASE_ID"); }
        /**
         * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPurchaseDatetime() { return doColumn("PURCHASE_DATETIME"); }
        /**
         * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPurchaseCount() { return doColumn("PURCHASE_COUNT"); }
        /**
         * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPurchasePrice() { return doColumn("PURCHASE_PRICE"); }
        /**
         * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPaymentCompleteFlg() { return doColumn("PAYMENT_COMPLETE_FLG"); }
        /**
         * REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnPurchaseId(); // PK
            if (qyCall().qy().hasConditionQueryMember()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof ProductCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQuerySummaryProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof SummaryProductCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQuerySummaryWithdrawal()
                    || qyCall().qy().xgetReferrerQuery() instanceof SummaryWithdrawalCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteNoPkRelation()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteNoPkRelationCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMemberAddressAsSkipRelation()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberAddressCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "purchase"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)member by my MEMBER_ID, named 'member'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMember() {
            assertRelation("member");
            if (_member == null) {
                _member = new MemberCB.HpSpecification(_baseCB, new HpSpQyCall<MemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMember(); }
                    public MemberCQ qy() { return _qyCall.qy().queryMember(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _member.xsetSyncQyCall(new HpSpQyCall<MemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMember(); }
                        public MemberCQ qy() { return xsyncQyCall().qy().queryMember(); }
                    });
                }
            }
            return _member;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (商品)product by my PRODUCT_ID, named 'product'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ProductCB.HpSpecification specifyProduct() {
            assertRelation("product");
            if (_product == null) {
                _product = new ProductCB.HpSpecification(_baseCB, new HpSpQyCall<ProductCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryProduct(); }
                    public ProductCQ qy() { return _qyCall.qy().queryProduct(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _product.xsetSyncQyCall(new HpSpQyCall<ProductCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProduct(); }
                        public ProductCQ qy() { return xsyncQyCall().qy().queryProduct(); }
                    });
                }
            }
            return _product;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SummaryProductCB.HpSpecification specifySummaryProduct() {
            assertRelation("summaryProduct");
            if (_summaryProduct == null) {
                _summaryProduct = new SummaryProductCB.HpSpecification(_baseCB, new HpSpQyCall<SummaryProductCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQuerySummaryProduct(); }
                    public SummaryProductCQ qy() { return _qyCall.qy().querySummaryProduct(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _summaryProduct.xsetSyncQyCall(new HpSpQyCall<SummaryProductCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySummaryProduct(); }
                        public SummaryProductCQ qy() { return xsyncQyCall().qy().querySummaryProduct(); }
                    });
                }
            }
            return _summaryProduct;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SummaryWithdrawalCB.HpSpecification specifySummaryWithdrawal() {
            assertRelation("summaryWithdrawal");
            if (_summaryWithdrawal == null) {
                _summaryWithdrawal = new SummaryWithdrawalCB.HpSpecification(_baseCB, new HpSpQyCall<SummaryWithdrawalCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQuerySummaryWithdrawal(); }
                    public SummaryWithdrawalCQ qy() { return _qyCall.qy().querySummaryWithdrawal(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _summaryWithdrawal.xsetSyncQyCall(new HpSpQyCall<SummaryWithdrawalCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySummaryWithdrawal(); }
                        public SummaryWithdrawalCQ qy() { return xsyncQyCall().qy().querySummaryWithdrawal(); }
                    });
                }
            }
            return _summaryWithdrawal;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteNoPkRelationCB.HpSpecification specifyWhiteNoPkRelation() {
            assertRelation("whiteNoPkRelation");
            if (_whiteNoPkRelation == null) {
                _whiteNoPkRelation = new WhiteNoPkRelationCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteNoPkRelationCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteNoPkRelation(); }
                    public WhiteNoPkRelationCQ qy() { return _qyCall.qy().queryWhiteNoPkRelation(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteNoPkRelation.xsetSyncQyCall(new HpSpQyCall<WhiteNoPkRelationCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteNoPkRelation(); }
                        public WhiteNoPkRelationCQ qy() { return xsyncQyCall().qy().queryWhiteNoPkRelation(); }
                    });
                }
            }
            return _whiteNoPkRelation;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PurchaseCB.HpSpecification specifyPurchaseSelf() {
            assertRelation("purchaseSelf");
            if (_purchaseSelf == null) {
                _purchaseSelf = new PurchaseCB.HpSpecification(_baseCB, new HpSpQyCall<PurchaseCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryPurchaseSelf(); }
                    public PurchaseCQ qy() { return _qyCall.qy().queryPurchaseSelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _purchaseSelf.xsetSyncQyCall(new HpSpQyCall<PurchaseCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPurchaseSelf(); }
                        public PurchaseCQ qy() { return xsyncQyCall().qy().queryPurchaseSelf(); }
                    });
                }
            }
            return _purchaseSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsSkipRelation(final java.util.Date targetDate) {
            assertRelation("memberAddressAsSkipRelation");
            if (_memberAddressAsSkipRelation == null) {
                _memberAddressAsSkipRelation = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsSkipRelation(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().queryMemberAddressAsSkipRelation(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsSkipRelation.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsSkipRelation(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsSkipRelation(targetDate); }
                    });
                }
            }
            return _memberAddressAsSkipRelation;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsSkipRelation() {
            assertRelation("memberAddressAsSkipRelation");
            if (_memberAddressAsSkipRelation == null) {
                _memberAddressAsSkipRelation = new MemberAddressCB.HpSpecification(_baseCB, new HpSpQyCall<MemberAddressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsSkipRelation(); }
                    public MemberAddressCQ qy() { return _qyCall.qy().getConditionQueryMemberAddressAsSkipRelation(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsSkipRelation.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsSkipRelation(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().getConditionQueryMemberAddressAsSkipRelation(); }
                    });
                }
            }
            return _memberAddressAsSkipRelation;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePurchaseReferrerCB.HpSpecification specifyWhitePurchaseReferrerAsOne() {
            assertRelation("whitePurchaseReferrerAsOne");
            if (_whitePurchaseReferrerAsOne == null) {
                _whitePurchaseReferrerAsOne = new WhitePurchaseReferrerCB.HpSpecification(_baseCB, new HpSpQyCall<WhitePurchaseReferrerCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePurchaseReferrerAsOne(); }
                    public WhitePurchaseReferrerCQ qy() { return _qyCall.qy().queryWhitePurchaseReferrerAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whitePurchaseReferrerAsOne.xsetSyncQyCall(new HpSpQyCall<WhitePurchaseReferrerCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePurchaseReferrerAsOne(); }
                        public WhitePurchaseReferrerCQ qy() { return xsyncQyCall().qy().queryWhitePurchaseReferrerAsOne(); }
                    });
                }
            }
            return _whitePurchaseReferrerAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PurchaseCB.HpSpecification specifyPurchaseSelfAsOne() {
            assertRelation("purchaseSelfAsOne");
            if (_purchaseSelfAsOne == null) {
                _purchaseSelfAsOne = new PurchaseCB.HpSpecification(_baseCB, new HpSpQyCall<PurchaseCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryPurchaseSelfAsOne(); }
                    public PurchaseCQ qy() { return _qyCall.qy().queryPurchaseSelfAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _purchaseSelfAsOne.xsetSyncQyCall(new HpSpQyCall<PurchaseCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPurchaseSelfAsOne(); }
                        public PurchaseCQ qy() { return xsyncQyCall().qy().queryPurchaseSelfAsOne(); }
                    });
                }
            }
            return _purchaseSelfAsOne;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<PurchaseCB, PurchaseCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<PurchaseCB, PurchaseCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<PurchaseCB, PurchaseCQ>() {
                public void setup(String fn, SubQuery<PurchaseCB> sq, PurchaseCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<PurchaseCB> columnQuery(final SpecifyQuery<PurchaseCB> leftSpecifyQuery) {
        return new HpColQyOperand<PurchaseCB>(new HpColQyHandler<PurchaseCB>() {
            public HpCalculator handle(SpecifyQuery<PurchaseCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected PurchaseCB xcreateColumnQueryCB() {
        PurchaseCB cb = new PurchaseCB();
        cb.xsetupForColumnQuery((PurchaseCB)this);
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
    public PurchaseCB dreamCruiseCB() {
        PurchaseCB cb = new PurchaseCB();
        cb.xsetupForDreamCruise((PurchaseCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<PurchaseCB> orQuery) {
        xorSQ((PurchaseCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;PurchaseCB&gt;() {
     *             public void query(PurchaseCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<PurchaseCB> andQuery) {
        xorSQAP((PurchaseCB)this, andQuery);
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
        final PurchaseCB cb;
        if (mainCB != null) {
            cb = (PurchaseCB)mainCB;
        } else {
            cb = new PurchaseCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<PurchaseCQ>() {
            public boolean has() { return true; }
            public PurchaseCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return PurchaseCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return PurchaseCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
