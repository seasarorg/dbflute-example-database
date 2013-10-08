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
 * The base condition-bean of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationReferrerCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationReferrerCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationReferrerCB() {
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
        return "white_variant_relation_referrer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long referrerId) {
        assertObjectNotNull("referrerId", referrerId);
        BsWhiteVariantRelationReferrerCB cb = this;
        cb.query().setReferrerId_Equal(referrerId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReferrerId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReferrerId_Desc();
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
    public WhiteVariantRelationReferrerCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteVariantRelationReferrerCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteVariantRelationReferrerCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteVariantRelationReferrerCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteVariantRelationReferrerCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteVariantRelationReferrerCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteVariantRelationReferrerCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteVariantRelationReferrerCB> unionQuery) {
        final WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteVariantRelationReferrerCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteVariantRelationReferrerCB> unionQuery) {
        final WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteVariantRelationReferrerCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteVariantRelationMasterFooNss _nssWhiteVariantRelationMasterFooAsVariant;
    public WhiteVariantRelationMasterFooNss getNssWhiteVariantRelationMasterFooAsVariant() {
        if (_nssWhiteVariantRelationMasterFooAsVariant == null) { _nssWhiteVariantRelationMasterFooAsVariant = new WhiteVariantRelationMasterFooNss(null); }
        return _nssWhiteVariantRelationMasterFooAsVariant;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteVariantRelationMasterFooAsVariant()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteVariantRelationReferrer.<span style="color: #FD4747">getWhiteVariantRelationMasterFooAsVariant()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterFooNss setupSelect_WhiteVariantRelationMasterFooAsVariant() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterFooAsVariant(); } });
        if (_nssWhiteVariantRelationMasterFooAsVariant == null || !_nssWhiteVariantRelationMasterFooAsVariant.hasConditionQuery())
        { _nssWhiteVariantRelationMasterFooAsVariant = new WhiteVariantRelationMasterFooNss(query().queryWhiteVariantRelationMasterFooAsVariant()); }
        return _nssWhiteVariantRelationMasterFooAsVariant;
    }
    protected WhiteVariantRelationMasterBarNss _nssWhiteVariantRelationMasterBarAsVariant;
    public WhiteVariantRelationMasterBarNss getNssWhiteVariantRelationMasterBarAsVariant() {
        if (_nssWhiteVariantRelationMasterBarAsVariant == null) { _nssWhiteVariantRelationMasterBarAsVariant = new WhiteVariantRelationMasterBarNss(null); }
        return _nssWhiteVariantRelationMasterBarAsVariant;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteVariantRelationMasterBarAsVariant()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteVariantRelationReferrer.<span style="color: #FD4747">getWhiteVariantRelationMasterBarAsVariant()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterBarNss setupSelect_WhiteVariantRelationMasterBarAsVariant() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterBarAsVariant(); } });
        if (_nssWhiteVariantRelationMasterBarAsVariant == null || !_nssWhiteVariantRelationMasterBarAsVariant.hasConditionQuery())
        { _nssWhiteVariantRelationMasterBarAsVariant = new WhiteVariantRelationMasterBarNss(query().queryWhiteVariantRelationMasterBarAsVariant()); }
        return _nssWhiteVariantRelationMasterBarAsVariant;
    }
    protected WhiteVariantRelationMasterQuxNss _nssWhiteVariantRelationMasterQuxAsVariantByQue;
    public WhiteVariantRelationMasterQuxNss getNssWhiteVariantRelationMasterQuxAsVariantByQue() {
        if (_nssWhiteVariantRelationMasterQuxAsVariantByQue == null) { _nssWhiteVariantRelationMasterQuxAsVariantByQue = new WhiteVariantRelationMasterQuxNss(null); }
        return _nssWhiteVariantRelationMasterQuxAsVariantByQue;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteVariantRelationMasterQuxAsVariantByQue()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteVariantRelationReferrer.<span style="color: #FD4747">getWhiteVariantRelationMasterQuxAsVariantByQue()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterQuxNss setupSelect_WhiteVariantRelationMasterQuxAsVariantByQue() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterQuxAsVariantByQue(); } });
        if (_nssWhiteVariantRelationMasterQuxAsVariantByQue == null || !_nssWhiteVariantRelationMasterQuxAsVariantByQue.hasConditionQuery())
        { _nssWhiteVariantRelationMasterQuxAsVariantByQue = new WhiteVariantRelationMasterQuxNss(query().queryWhiteVariantRelationMasterQuxAsVariantByQue()); }
        return _nssWhiteVariantRelationMasterQuxAsVariantByQue;
    }
    protected WhiteVariantRelationMasterCorgeNss _nssWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    public WhiteVariantRelationMasterCorgeNss getNssWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        if (_nssWhiteVariantRelationMasterCorgeAsVariantByQuxType == null) { _nssWhiteVariantRelationMasterCorgeAsVariantByQuxType = new WhiteVariantRelationMasterCorgeNss(null); }
        return _nssWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteVariantRelationReferrer.<span style="color: #FD4747">getWhiteVariantRelationMasterCorgeAsVariantByQuxType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterCorgeNss setupSelect_WhiteVariantRelationMasterCorgeAsVariantByQuxType(final com.example.dbflute.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); } });
        if (_nssWhiteVariantRelationMasterCorgeAsVariantByQuxType == null || !_nssWhiteVariantRelationMasterCorgeAsVariantByQuxType.hasConditionQuery())
        { _nssWhiteVariantRelationMasterCorgeAsVariantByQuxType = new WhiteVariantRelationMasterCorgeNss(query().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType)); }
        return _nssWhiteVariantRelationMasterCorgeAsVariantByQuxType;
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
            , new HpSpQyCall<WhiteVariantRelationReferrerCQ>() {
                public boolean has() { return true; }
                public WhiteVariantRelationReferrerCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteVariantRelationReferrerCQ> {
        protected WhiteVariantRelationMasterFooCB.HpSpecification _whiteVariantRelationMasterFooAsVariant;
        protected WhiteVariantRelationMasterBarCB.HpSpecification _whiteVariantRelationMasterBarAsVariant;
        protected WhiteVariantRelationMasterQuxCB.HpSpecification _whiteVariantRelationMasterQuxAsVariantByQue;
        protected WhiteVariantRelationMasterCorgeCB.HpSpecification _whiteVariantRelationMasterCorgeAsVariantByQuxType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteVariantRelationReferrerCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * REFERRER_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnReferrerId() { return doColumn("REFERRER_ID"); }
        /**
         * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVariantMasterId() { return doColumn("VARIANT_MASTER_ID"); }
        /**
         * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMasterTypeCode() { return doColumn("MASTER_TYPE_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnReferrerId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterFooAsVariant()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterFooCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterBarAsVariant()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterBarCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterQuxCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterCorgeCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_variant_relation_referrer"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterFooCB.HpSpecification specifyWhiteVariantRelationMasterFooAsVariant() {
            assertRelation("whiteVariantRelationMasterFooAsVariant");
            if (_whiteVariantRelationMasterFooAsVariant == null) {
                _whiteVariantRelationMasterFooAsVariant = new WhiteVariantRelationMasterFooCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterFooCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterFooAsVariant(); }
                    public WhiteVariantRelationMasterFooCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterFooAsVariant(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterFooAsVariant.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterFooCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterFooAsVariant(); }
                        public WhiteVariantRelationMasterFooCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterFooAsVariant(); }
                    });
                }
            }
            return _whiteVariantRelationMasterFooAsVariant;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterBarCB.HpSpecification specifyWhiteVariantRelationMasterBarAsVariant() {
            assertRelation("whiteVariantRelationMasterBarAsVariant");
            if (_whiteVariantRelationMasterBarAsVariant == null) {
                _whiteVariantRelationMasterBarAsVariant = new WhiteVariantRelationMasterBarCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterBarCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterBarAsVariant(); }
                    public WhiteVariantRelationMasterBarCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterBarAsVariant(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterBarAsVariant.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterBarCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterBarAsVariant(); }
                        public WhiteVariantRelationMasterBarCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterBarAsVariant(); }
                    });
                }
            }
            return _whiteVariantRelationMasterBarAsVariant;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterQuxCB.HpSpecification specifyWhiteVariantRelationMasterQuxAsVariantByQue() {
            assertRelation("whiteVariantRelationMasterQuxAsVariantByQue");
            if (_whiteVariantRelationMasterQuxAsVariantByQue == null) {
                _whiteVariantRelationMasterQuxAsVariantByQue = new WhiteVariantRelationMasterQuxCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterQuxCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue(); }
                    public WhiteVariantRelationMasterQuxCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterQuxAsVariantByQue(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterQuxAsVariantByQue.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterQuxCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue(); }
                        public WhiteVariantRelationMasterQuxCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterQuxAsVariantByQue(); }
                    });
                }
            }
            return _whiteVariantRelationMasterQuxAsVariantByQue;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
         * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterCorgeCB.HpSpecification specifyWhiteVariantRelationMasterCorgeAsVariantByQuxType(final com.example.dbflute.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
            assertRelation("whiteVariantRelationMasterCorgeAsVariantByQuxType");
            if (_whiteVariantRelationMasterCorgeAsVariantByQuxType == null) {
                _whiteVariantRelationMasterCorgeAsVariantByQuxType = new WhiteVariantRelationMasterCorgeCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                    public WhiteVariantRelationMasterCorgeCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterCorgeAsVariantByQuxType.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                        public WhiteVariantRelationMasterCorgeCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); }
                    });
                }
            }
            return _whiteVariantRelationMasterCorgeAsVariantByQuxType;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterCorgeCB.HpSpecification specifyWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
            assertRelation("whiteVariantRelationMasterCorgeAsVariantByQuxType");
            if (_whiteVariantRelationMasterCorgeAsVariantByQuxType == null) {
                _whiteVariantRelationMasterCorgeAsVariantByQuxType = new WhiteVariantRelationMasterCorgeCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                    public WhiteVariantRelationMasterCorgeCQ qy() { return _qyCall.qy().getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterCorgeAsVariantByQuxType.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                        public WhiteVariantRelationMasterCorgeCQ qy() { return xsyncQyCall().qy().getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                    });
                }
            }
            return _whiteVariantRelationMasterCorgeAsVariantByQuxType;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrerCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrerCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrerCQ>() {
                public void setup(String function, SubQuery<WhiteVariantRelationReferrerCB> subQuery, WhiteVariantRelationReferrerCQ cq, String aliasName, DerivedReferrerOption option) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteVariantRelationReferrerCB> columnQuery(final SpecifyQuery<WhiteVariantRelationReferrerCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteVariantRelationReferrerCB>(new HpColQyHandler<WhiteVariantRelationReferrerCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteVariantRelationReferrerCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteVariantRelationReferrerCB xcreateColumnQueryCB() {
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.xsetupForColumnQuery((WhiteVariantRelationReferrerCB)this);
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
    public WhiteVariantRelationReferrerCB dreamCruiseCB() {
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.xsetupForDreamCruise((WhiteVariantRelationReferrerCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteVariantRelationReferrerCB> orQuery) {
        xorSQ((WhiteVariantRelationReferrerCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *             public void query(WhiteVariantRelationReferrerCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteVariantRelationReferrerCB> andQuery) {
        xorSQAP((WhiteVariantRelationReferrerCB)this, andQuery);
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
        final WhiteVariantRelationReferrerCB cb;
        if (mainCB != null) {
            cb = (WhiteVariantRelationReferrerCB)mainCB;
        } else {
            cb = new WhiteVariantRelationReferrerCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationReferrerCQ>() {
            public boolean has() { return true; }
            public WhiteVariantRelationReferrerCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteVariantRelationReferrerCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteVariantRelationReferrerCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
