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
 * The base condition-bean of white_self_reference.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReferenceCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceCB() {
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
        return "white_self_reference";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param selfReferenceId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteSelfReferenceCB acceptPK(Long selfReferenceId) {
        assertObjectNotNull("selfReferenceId", selfReferenceId);
        BsWhiteSelfReferenceCB cb = this;
        cb.query().setSelfReferenceId_Equal(selfReferenceId);
        return (WhiteSelfReferenceCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param selfReferenceId : PK, NotNull, DECIMAL(16). (NotNull)
     */
    public void acceptPrimaryKey(Long selfReferenceId) {
        assertObjectNotNull("selfReferenceId", selfReferenceId);
        BsWhiteSelfReferenceCB cb = this;
        cb.query().setSelfReferenceId_Equal(selfReferenceId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_SelfReferenceId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_SelfReferenceId_Desc();
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
    public WhiteSelfReferenceCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteSelfReferenceCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteSelfReferenceCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteSelfReferenceCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteSelfReferenceCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteSelfReferenceCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteSelfReferenceCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteSelfReferenceCB> unionQuery) {
        final WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteSelfReferenceCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteSelfReferenceCB> unionQuery) {
        final WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteSelfReferenceCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteSelfReferenceNss _nssWhiteSelfReferenceSelf;
    public WhiteSelfReferenceNss getNssWhiteSelfReferenceSelf() {
        if (_nssWhiteSelfReferenceSelf == null) { _nssWhiteSelfReferenceSelf = new WhiteSelfReferenceNss(null); }
        return _nssWhiteSelfReferenceSelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteSelfReferenceSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSelfReference.<span style="color: #DD4747">getWhiteSelfReferenceSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceNss setupSelect_WhiteSelfReferenceSelf() {
        assertSetupSelectPurpose("whiteSelfReferenceSelf");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnParentId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSelfReferenceSelf(); } });
        if (_nssWhiteSelfReferenceSelf == null || !_nssWhiteSelfReferenceSelf.hasConditionQuery())
        { _nssWhiteSelfReferenceSelf = new WhiteSelfReferenceNss(query().queryWhiteSelfReferenceSelf()); }
        return _nssWhiteSelfReferenceSelf;
    }

    protected WhiteSelfReferenceRefOneNss _nssWhiteSelfReferenceRefOneByParentId;
    public WhiteSelfReferenceRefOneNss getNssWhiteSelfReferenceRefOneByParentId() {
        if (_nssWhiteSelfReferenceRefOneByParentId == null) { _nssWhiteSelfReferenceRefOneByParentId = new WhiteSelfReferenceRefOneNss(null); }
        return _nssWhiteSelfReferenceRefOneByParentId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteSelfReferenceRefOneByParentId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSelfReference.<span style="color: #DD4747">getWhiteSelfReferenceRefOneByParentId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceRefOneNss setupSelect_WhiteSelfReferenceRefOneByParentId() {
        assertSetupSelectPurpose("whiteSelfReferenceRefOneByParentId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnParentId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSelfReferenceRefOneByParentId(); } });
        if (_nssWhiteSelfReferenceRefOneByParentId == null || !_nssWhiteSelfReferenceRefOneByParentId.hasConditionQuery())
        { _nssWhiteSelfReferenceRefOneByParentId = new WhiteSelfReferenceRefOneNss(query().queryWhiteSelfReferenceRefOneByParentId()); }
        return _nssWhiteSelfReferenceRefOneByParentId;
    }

    protected WhiteSelfReferenceRefOneNss _nssWhiteSelfReferenceRefOneAsOne;
    public WhiteSelfReferenceRefOneNss getNssWhiteSelfReferenceRefOneAsOne() {
        if (_nssWhiteSelfReferenceRefOneAsOne == null) { _nssWhiteSelfReferenceRefOneAsOne = new WhiteSelfReferenceRefOneNss(null); }
        return _nssWhiteSelfReferenceRefOneAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteSelfReferenceRefOneAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSelfReference.<span style="color: #DD4747">getWhiteSelfReferenceRefOneAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceRefOneNss setupSelect_WhiteSelfReferenceRefOneAsOne() {
        assertSetupSelectPurpose("whiteSelfReferenceRefOneAsOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSelfReferenceRefOneAsOne(); } });
        if (_nssWhiteSelfReferenceRefOneAsOne == null || !_nssWhiteSelfReferenceRefOneAsOne.hasConditionQuery()) { _nssWhiteSelfReferenceRefOneAsOne = new WhiteSelfReferenceRefOneNss(query().queryWhiteSelfReferenceRefOneAsOne()); }
        return _nssWhiteSelfReferenceRefOneAsOne;
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
            , new HpSpQyCall<WhiteSelfReferenceCQ>() {
                public boolean has() { return true; }
                public WhiteSelfReferenceCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteSelfReferenceCQ> {
        protected WhiteSelfReferenceCB.HpSpecification _whiteSelfReferenceSelf;
        protected WhiteSelfReferenceRefOneCB.HpSpecification _whiteSelfReferenceRefOneByParentId;
        protected WhiteSelfReferenceRefOneCB.HpSpecification _whiteSelfReferenceRefOneAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteSelfReferenceCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSelfReferenceId() { return doColumn("SELF_REFERENCE_ID"); }
        /**
         * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSelfReferenceName() { return doColumn("SELF_REFERENCE_NAME"); }
        /**
         * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParentId() { return doColumn("PARENT_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnSelfReferenceId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteSelfReferenceSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSelfReferenceCQ) {
                columnParentId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteSelfReferenceRefOneByParentId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSelfReferenceRefOneCQ) {
                columnParentId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_self_reference"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSelfReferenceCB.HpSpecification specifyWhiteSelfReferenceSelf() {
            assertRelation("whiteSelfReferenceSelf");
            if (_whiteSelfReferenceSelf == null) {
                _whiteSelfReferenceSelf = new WhiteSelfReferenceCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSelfReferenceCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSelfReferenceSelf(); }
                    public WhiteSelfReferenceCQ qy() { return _qyCall.qy().queryWhiteSelfReferenceSelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSelfReferenceSelf.xsetSyncQyCall(new HpSpQyCall<WhiteSelfReferenceCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSelfReferenceSelf(); }
                        public WhiteSelfReferenceCQ qy() { return xsyncQyCall().qy().queryWhiteSelfReferenceSelf(); }
                    });
                }
            }
            return _whiteSelfReferenceSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
         * This relation is auto-detected as implicit reverse FK.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSelfReferenceRefOneCB.HpSpecification specifyWhiteSelfReferenceRefOneByParentId() {
            assertRelation("whiteSelfReferenceRefOneByParentId");
            if (_whiteSelfReferenceRefOneByParentId == null) {
                _whiteSelfReferenceRefOneByParentId = new WhiteSelfReferenceRefOneCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSelfReferenceRefOneCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSelfReferenceRefOneByParentId(); }
                    public WhiteSelfReferenceRefOneCQ qy() { return _qyCall.qy().queryWhiteSelfReferenceRefOneByParentId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSelfReferenceRefOneByParentId.xsetSyncQyCall(new HpSpQyCall<WhiteSelfReferenceRefOneCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSelfReferenceRefOneByParentId(); }
                        public WhiteSelfReferenceRefOneCQ qy() { return xsyncQyCall().qy().queryWhiteSelfReferenceRefOneByParentId(); }
                    });
                }
            }
            return _whiteSelfReferenceRefOneByParentId;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSelfReferenceRefOneCB.HpSpecification specifyWhiteSelfReferenceRefOneAsOne() {
            assertRelation("whiteSelfReferenceRefOneAsOne");
            if (_whiteSelfReferenceRefOneAsOne == null) {
                _whiteSelfReferenceRefOneAsOne = new WhiteSelfReferenceRefOneCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSelfReferenceRefOneCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSelfReferenceRefOneAsOne(); }
                    public WhiteSelfReferenceRefOneCQ qy() { return _qyCall.qy().queryWhiteSelfReferenceRefOneAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSelfReferenceRefOneAsOne.xsetSyncQyCall(new HpSpQyCall<WhiteSelfReferenceRefOneCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSelfReferenceRefOneAsOne(); }
                        public WhiteSelfReferenceRefOneCQ qy() { return xsyncQyCall().qy().queryWhiteSelfReferenceRefOneAsOne(); }
                    });
                }
            }
            return _whiteSelfReferenceRefOneAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_self_reference where ...) as FOO_MAX} <br />
         * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedWhiteSelfReferenceSelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
         *     public void query(WhiteSelfReferenceCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteSelfReference.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteSelfReferenceCB, WhiteSelfReferenceCQ> derivedWhiteSelfReferenceSelfList() {
            assertDerived("whiteSelfReferenceSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteSelfReferenceCB, WhiteSelfReferenceCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteSelfReferenceCB, WhiteSelfReferenceCQ>() {
                public void setup(String fn, SubQuery<WhiteSelfReferenceCB> sq, WhiteSelfReferenceCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteSelfReferenceSelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteSelfReferenceCB, WhiteSelfReferenceCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteSelfReferenceCB, WhiteSelfReferenceCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteSelfReferenceCB, WhiteSelfReferenceCQ>() {
                public void setup(String fn, SubQuery<WhiteSelfReferenceCB> sq, WhiteSelfReferenceCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteSelfReferenceCB> columnQuery(final SpecifyQuery<WhiteSelfReferenceCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteSelfReferenceCB>(new HpColQyHandler<WhiteSelfReferenceCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteSelfReferenceCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteSelfReferenceCB xcreateColumnQueryCB() {
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
        cb.xsetupForColumnQuery((WhiteSelfReferenceCB)this);
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
    public WhiteSelfReferenceCB dreamCruiseCB() {
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
        cb.xsetupForDreamCruise((WhiteSelfReferenceCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteSelfReferenceCB> orQuery) {
        xorSQ((WhiteSelfReferenceCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteSelfReferenceCB&gt;() {
     *             public void query(WhiteSelfReferenceCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteSelfReferenceCB> andQuery) {
        xorSQAP((WhiteSelfReferenceCB)this, andQuery);
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
        final WhiteSelfReferenceCB cb;
        if (mainCB != null) {
            cb = (WhiteSelfReferenceCB)mainCB;
        } else {
            cb = new WhiteSelfReferenceCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteSelfReferenceCQ>() {
            public boolean has() { return true; }
            public WhiteSelfReferenceCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteSelfReferenceCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteSelfReferenceCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
