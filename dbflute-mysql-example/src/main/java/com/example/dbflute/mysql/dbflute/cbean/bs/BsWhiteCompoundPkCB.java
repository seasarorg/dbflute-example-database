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
 * The base condition-bean of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
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
        return "white_compound_pk";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param pkFirstId : PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY. (NotNull)
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @return this. (NotNull)
     */
    public WhiteCompoundPkCB acceptPK(Integer pkFirstId, Integer pkSecondId) {
        assertObjectNotNull("pkFirstId", pkFirstId);assertObjectNotNull("pkSecondId", pkSecondId);
        BsWhiteCompoundPkCB cb = this;
        cb.query().setPkFirstId_Equal(pkFirstId);cb.query().setPkSecondId_Equal(pkSecondId);
        return (WhiteCompoundPkCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param pkFirstId : PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY. (NotNull)
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     */
    public void acceptPrimaryKey(Integer pkFirstId, Integer pkSecondId) {
        assertObjectNotNull("pkFirstId", pkFirstId);assertObjectNotNull("pkSecondId", pkSecondId);
        BsWhiteCompoundPkCB cb = this;
        cb.query().setPkFirstId_Equal(pkFirstId);cb.query().setPkSecondId_Equal(pkSecondId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @param referredId : +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY. (NotNull)
     * @return this. (NotNull)
     */
    public WhiteCompoundPkCB acceptUniqueOfPkSecondIdReferredId(Integer pkSecondId, Integer referredId) {
        assertObjectNotNull("pkSecondId", pkSecondId);assertObjectNotNull("referredId", referredId);
        BsWhiteCompoundPkCB cb = this;
        cb.query().setPkSecondId_Equal(pkSecondId);cb.query().setReferredId_Equal(referredId);
        return (WhiteCompoundPkCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @param pkFirstId : PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY. (NotNull)
     * @return this. (NotNull)
     */
    public WhiteCompoundPkCB acceptUniqueOfPkSecondIdPkFirstId(Integer pkSecondId, Integer pkFirstId) {
        assertObjectNotNull("pkSecondId", pkSecondId);assertObjectNotNull("pkFirstId", pkFirstId);
        BsWhiteCompoundPkCB cb = this;
        cb.query().setPkSecondId_Equal(pkSecondId);cb.query().setPkFirstId_Equal(pkFirstId);
        return (WhiteCompoundPkCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_PkFirstId_Asc();
        query().addOrderBy_PkSecondId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_PkFirstId_Desc();
        query().addOrderBy_PkSecondId_Desc();
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
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
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
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
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
    public WhiteCompoundPkCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteCompoundPkCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteCompoundPkCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteCompoundPkCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteCompoundPkCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteCompoundPkCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteCompoundPkCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteCompoundPkCB> unionQuery) {
        final WhiteCompoundPkCB cb = new WhiteCompoundPkCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteCompoundPkCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteCompoundPkCB> unionQuery) {
        final WhiteCompoundPkCB cb = new WhiteCompoundPkCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteCompoundPkCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br />
     * white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteCompoundReferredNormally()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundReferredNormally()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_WhiteCompoundReferredNormally() {
        assertSetupSelectPurpose("whiteCompoundReferredNormally");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnReferredId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundReferredNormally(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteCompoundReferredPrimary()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundReferredPrimary()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_WhiteCompoundReferredPrimary() {
        assertSetupSelectPurpose("whiteCompoundReferredPrimary");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundReferredPrimary(); } });
    }

    protected WhiteCompoundPkRefManyNss _nssWhiteCompoundPkRefManyAsMax;
    public WhiteCompoundPkRefManyNss getNssWhiteCompoundPkRefManyAsMax() {
        if (_nssWhiteCompoundPkRefManyAsMax == null) { _nssWhiteCompoundPkRefManyAsMax = new WhiteCompoundPkRefManyNss(null); }
        return _nssWhiteCompoundPkRefManyAsMax;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteCompoundPkRefManyAsMax()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundPkRefManyAsMax()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteCompoundPkRefManyNss setupSelect_WhiteCompoundPkRefManyAsMax() {
        assertSetupSelectPurpose("whiteCompoundPkRefManyAsMax");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundPkRefManyAsMax(); } });
        if (_nssWhiteCompoundPkRefManyAsMax == null || !_nssWhiteCompoundPkRefManyAsMax.hasConditionQuery())
        { _nssWhiteCompoundPkRefManyAsMax = new WhiteCompoundPkRefManyNss(query().queryWhiteCompoundPkRefManyAsMax()); }
        return _nssWhiteCompoundPkRefManyAsMax;
    }

    protected WhiteCompoundPkRefManyNss _nssWhiteCompoundPkRefManyAsMin;
    public WhiteCompoundPkRefManyNss getNssWhiteCompoundPkRefManyAsMin() {
        if (_nssWhiteCompoundPkRefManyAsMin == null) { _nssWhiteCompoundPkRefManyAsMin = new WhiteCompoundPkRefManyNss(null); }
        return _nssWhiteCompoundPkRefManyAsMin;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteCompoundPkRefManyAsMin()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundPkRefManyAsMin()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteCompoundPkRefManyNss setupSelect_WhiteCompoundPkRefManyAsMin() {
        assertSetupSelectPurpose("whiteCompoundPkRefManyAsMin");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundPkRefManyAsMin(); } });
        if (_nssWhiteCompoundPkRefManyAsMin == null || !_nssWhiteCompoundPkRefManyAsMin.hasConditionQuery())
        { _nssWhiteCompoundPkRefManyAsMin = new WhiteCompoundPkRefManyNss(query().queryWhiteCompoundPkRefManyAsMin()); }
        return _nssWhiteCompoundPkRefManyAsMin;
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
            , new HpSpQyCall<WhiteCompoundPkCQ>() {
                public boolean has() { return true; }
                public WhiteCompoundPkCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteCompoundPkCQ> {
        protected WhiteCompoundReferredNormallyCB.HpSpecification _whiteCompoundReferredNormally;
        protected WhiteCompoundReferredPrimaryCB.HpSpecification _whiteCompoundReferredPrimary;
        protected WhiteCompoundPkRefManyCB.HpSpecification _whiteCompoundPkRefManyAsMax;
        protected WhiteCompoundPkRefManyCB.HpSpecification _whiteCompoundPkRefManyAsMin;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteCompoundPkCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPkFirstId() { return doColumn("PK_FIRST_ID"); }
        /**
         * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPkSecondId() { return doColumn("PK_SECOND_ID"); }
        /**
         * PK_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPkName() { return doColumn("PK_NAME"); }
        /**
         * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnReferredId() { return doColumn("REFERRED_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnPkFirstId(); // PK
            columnPkSecondId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteCompoundReferredNormally()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteCompoundReferredNormallyCQ) {
                columnReferredId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_compound_pk"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundReferredNormallyCB.HpSpecification specifyWhiteCompoundReferredNormally() {
            assertRelation("whiteCompoundReferredNormally");
            if (_whiteCompoundReferredNormally == null) {
                _whiteCompoundReferredNormally = new WhiteCompoundReferredNormallyCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundReferredNormallyCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundReferredNormally(); }
                    public WhiteCompoundReferredNormallyCQ qy() { return _qyCall.qy().queryWhiteCompoundReferredNormally(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundReferredNormally.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundReferredNormallyCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundReferredNormally(); }
                        public WhiteCompoundReferredNormallyCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundReferredNormally(); }
                    });
                }
            }
            return _whiteCompoundReferredNormally;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundReferredPrimaryCB.HpSpecification specifyWhiteCompoundReferredPrimary() {
            assertRelation("whiteCompoundReferredPrimary");
            if (_whiteCompoundReferredPrimary == null) {
                _whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimaryCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundReferredPrimaryCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundReferredPrimary(); }
                    public WhiteCompoundReferredPrimaryCQ qy() { return _qyCall.qy().queryWhiteCompoundReferredPrimary(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundReferredPrimary.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundReferredPrimaryCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundReferredPrimary(); }
                        public WhiteCompoundReferredPrimaryCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundReferredPrimary(); }
                    });
                }
            }
            return _whiteCompoundReferredPrimary;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundPkRefManyCB.HpSpecification specifyWhiteCompoundPkRefManyAsMax() {
            assertRelation("whiteCompoundPkRefManyAsMax");
            if (_whiteCompoundPkRefManyAsMax == null) {
                _whiteCompoundPkRefManyAsMax = new WhiteCompoundPkRefManyCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundPkRefManyCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundPkRefManyAsMax(); }
                    public WhiteCompoundPkRefManyCQ qy() { return _qyCall.qy().queryWhiteCompoundPkRefManyAsMax(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundPkRefManyAsMax.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkRefManyCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundPkRefManyAsMax(); }
                        public WhiteCompoundPkRefManyCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundPkRefManyAsMax(); }
                    });
                }
            }
            return _whiteCompoundPkRefManyAsMax;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundPkRefManyCB.HpSpecification specifyWhiteCompoundPkRefManyAsMin() {
            assertRelation("whiteCompoundPkRefManyAsMin");
            if (_whiteCompoundPkRefManyAsMin == null) {
                _whiteCompoundPkRefManyAsMin = new WhiteCompoundPkRefManyCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundPkRefManyCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundPkRefManyAsMin(); }
                    public WhiteCompoundPkRefManyCQ qy() { return _qyCall.qy().queryWhiteCompoundPkRefManyAsMin(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundPkRefManyAsMin.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkRefManyCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundPkRefManyAsMin(); }
                        public WhiteCompoundPkRefManyCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundPkRefManyAsMin(); }
                    });
                }
            }
            return _whiteCompoundPkRefManyAsMin;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_compound_pk_ref where ...) as FOO_MAX} <br />
         * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedWhiteCompoundPkRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
         *     public void query(WhiteCompoundPkRefCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteCompoundPkRef.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteCompoundPkRefCB, WhiteCompoundPkCQ> derivedWhiteCompoundPkRefList() {
            assertDerived("whiteCompoundPkRefList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteCompoundPkRefCB, WhiteCompoundPkCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteCompoundPkRefCB, WhiteCompoundPkCQ>() {
                public void setup(String fn, SubQuery<WhiteCompoundPkRefCB> sq, WhiteCompoundPkCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteCompoundPkRefList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_compound_pk_ref_many where ...) as FOO_MAX} <br />
         * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedWhiteCompoundPkRefManyToPKList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
         *     public void query(WhiteCompoundPkRefManyCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteCompoundPkRefMany.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteCompoundPkRefManyCB, WhiteCompoundPkCQ> derivedWhiteCompoundPkRefManyToPKList() {
            assertDerived("whiteCompoundPkRefManyToPKList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteCompoundPkRefManyCB, WhiteCompoundPkCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteCompoundPkRefManyCB, WhiteCompoundPkCQ>() {
                public void setup(String fn, SubQuery<WhiteCompoundPkRefManyCB> sq, WhiteCompoundPkCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteCompoundPkRefManyToPKList(fn, sq, al, op); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhiteCompoundPkCB> columnQuery(final SpecifyQuery<WhiteCompoundPkCB> leftSpecifyQuery) {
        return xcreateColQyOperandMySql(new HpColQyHandler<WhiteCompoundPkCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteCompoundPkCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteCompoundPkCB xcreateColumnQueryCB() {
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.xsetupForColumnQuery((WhiteCompoundPkCB)this);
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
    public WhiteCompoundPkCB dreamCruiseCB() {
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.xsetupForDreamCruise((WhiteCompoundPkCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteCompoundPkCB> orQuery) {
        xorSQ((WhiteCompoundPkCB)this, orQuery);
    }

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteCompoundPkCB&gt;() {
     *             public void query(WhiteCompoundPkCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteCompoundPkCB> andQuery) {
        xorSQAP((WhiteCompoundPkCB)this, andQuery);
    }

    /**
     * Check invalid query when query is set. <br />
     * (it throws an exception if set query is invalid) <br />
     * You should call this before registrations of where clause and other queries. <br />
     * Union and SubQuery and other sub condition-bean inherit this. <br />
     * 
     * <p>renamed to checkNullOrEmptyQuery() since 1.1,
     * but not deprecated because it might have many use.</p>
     * 
     * #java8 compatible option
     */
    public void checkInvalidQuery() {
        checkNullOrEmptyQuery();
    }

    /**
     * Accept (no check) an invalid query when a query is set. <br />
     * (no condition if a set query is invalid) <br />
     * You should call this before registrations of where clause and other queries. <br />
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use ignoreNullOrEmptyQuery()
     */
    public void acceptInvalidQuery() {
        getSqlClause().ignoreNullOrEmptyQuery();
    }

    /**
     * Allow to auto-detect joins that can be inner-join. <br />
     * <pre>
     * o You should call this before registrations of where clause.
     * o Union and SubQuery and other sub condition-bean inherit this.
     * o You should confirm your SQL on the log to be tuned by inner-join correctly.
     * </pre>
     * @deprecated use enableInnerJoinAutoDetect()
     */
    public void allowInnerJoinAutoDetect() {
        enableInnerJoinAutoDetect();
    }

    /**
     * Suppress auto-detecting inner-join. <br />
     * You should call this before registrations of where clause.
     * @deprecated use disableInnerJoinAutoDetect()
     */
    public void suppressInnerJoinAutoDetect() {
        disableInnerJoinAutoDetect();
    }

    /**
     * Allow an empty string for query. <br />
     * (you can use an empty string as condition) <br />
     * You should call this before registrations of where clause and other queries. <br />
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use enableEmptyStringQuery()
     */
    public void allowEmptyStringQuery() {
        enableEmptyStringQuery();
    }

    /**
     * Enable checking record count before QueryUpdate (contains QueryDelete). (default is disabled) <br />
     * No query update if zero count. (basically for MySQL's deadlock by next-key lock)
     * @deprecated use enableQueryUpdateCountPreCheck()
     */
    public void enableCheckCountBeforeQueryUpdate() {
        enableQueryUpdateCountPreCheck();
    }

    /**
     * Disable checking record count before QueryUpdate (contains QueryDelete). (back to default) <br />
     * Executes query update even if zero count. (normal specification)
     * @deprecated use disableQueryUpdateCountPreCheck()
     */
    public void disableCheckCountBeforeQueryUpdate() {
        disableQueryUpdateCountPreCheck();
    }

    /**
     * Allow "that's bad timing" check.
     * @deprecated use enableThatsBadTiming()
     */
    public void allowThatsBadTiming() {
        enableThatsBadTiming();
    }

    /**
     * Suppress "that's bad timing" check.
     * @deprecated use disableThatsBadTiming()
     */
    public void suppressThatsBadTiming() {
        disableThatsBadTiming();
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
        final WhiteCompoundPkCB cb;
        if (mainCB != null) {
            cb = (WhiteCompoundPkCB)mainCB;
        } else {
            cb = new WhiteCompoundPkCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkCQ>() {
            public boolean has() { return true; }
            public WhiteCompoundPkCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteCompoundPkCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteCompoundPkCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
