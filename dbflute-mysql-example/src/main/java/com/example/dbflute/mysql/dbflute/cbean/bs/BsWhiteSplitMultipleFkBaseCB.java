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
 * The base condition-bean of white_split_multiple_fk_base.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSplitMultipleFkBaseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkBaseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSplitMultipleFkBaseCB() {
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
        return "white_split_multiple_fk_base";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long baseId) {
        assertObjectNotNull("baseId", baseId);
        BsWhiteSplitMultipleFkBaseCB cb = this;
        cb.query().setBaseId_Equal(baseId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BaseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BaseId_Desc();
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
    public WhiteSplitMultipleFkBaseCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteSplitMultipleFkBaseCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteSplitMultipleFkBaseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteSplitMultipleFkBaseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteSplitMultipleFkBaseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteSplitMultipleFkBaseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteSplitMultipleFkBaseCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteSplitMultipleFkBaseCB> unionQuery) {
        final WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteSplitMultipleFkBaseCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteSplitMultipleFkBaseCB> unionQuery) {
        final WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteSplitMultipleFkBaseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteSplitMultipleFkNextNss _nssWhiteSplitMultipleFkNext;
    public WhiteSplitMultipleFkNextNss getNssWhiteSplitMultipleFkNext() {
        if (_nssWhiteSplitMultipleFkNext == null) { _nssWhiteSplitMultipleFkNext = new WhiteSplitMultipleFkNextNss(null); }
        return _nssWhiteSplitMultipleFkNext;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteSplitMultipleFkNext()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = whiteSplitMultipleFkBaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSplitMultipleFkBase.<span style="color: #FD4747">getWhiteSplitMultipleFkNext()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSplitMultipleFkNextNss setupSelect_WhiteSplitMultipleFkNext() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnNextId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSplitMultipleFkNext(); } });
        if (_nssWhiteSplitMultipleFkNext == null || !_nssWhiteSplitMultipleFkNext.hasConditionQuery())
        { _nssWhiteSplitMultipleFkNext = new WhiteSplitMultipleFkNextNss(query().queryWhiteSplitMultipleFkNext()); }
        return _nssWhiteSplitMultipleFkNext;
    }
    protected WhiteSplitMultipleFkRefNss _nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest;
    public WhiteSplitMultipleFkRefNss getNssWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        if (_nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest == null) { _nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest = new WhiteSplitMultipleFkRefNss(null); }
        return _nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteSplitMultipleFkRefAsSplitMultipleFkTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = whiteSplitMultipleFkBaseBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSplitMultipleFkBase.<span style="color: #FD4747">getWhiteSplitMultipleFkRefAsSplitMultipleFkTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSplitMultipleFkRefNss setupSelect_WhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnFirstId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); } });
        if (_nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest == null || !_nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest.hasConditionQuery())
        { _nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest = new WhiteSplitMultipleFkRefNss(query().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()); }
        return _nssWhiteSplitMultipleFkRefAsSplitMultipleFkTest;
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
            , new HpSpQyCall<WhiteSplitMultipleFkBaseCQ>() {
                public boolean has() { return true; }
                public WhiteSplitMultipleFkBaseCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteSplitMultipleFkBaseCQ> {
        protected WhiteSplitMultipleFkNextCB.HpSpecification _whiteSplitMultipleFkNext;
        protected WhiteSplitMultipleFkRefCB.HpSpecification _whiteSplitMultipleFkRefAsSplitMultipleFkTest;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteSplitMultipleFkBaseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * BASE_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBaseId() { return doColumn("BASE_ID"); }
        /**
         * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFirstId() { return doColumn("FIRST_ID"); }
        /**
         * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNextId() { return doColumn("NEXT_ID"); }
        /**
         * SPLIT_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSplitName() { return doColumn("SPLIT_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnBaseId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteSplitMultipleFkNext()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSplitMultipleFkNextCQ) {
                columnNextId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSplitMultipleFkRefCQ) {
                columnFirstId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_split_multiple_fk_base"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSplitMultipleFkNextCB.HpSpecification specifyWhiteSplitMultipleFkNext() {
            assertRelation("whiteSplitMultipleFkNext");
            if (_whiteSplitMultipleFkNext == null) {
                _whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNextCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSplitMultipleFkNextCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSplitMultipleFkNext(); }
                    public WhiteSplitMultipleFkNextCQ qy() { return _qyCall.qy().queryWhiteSplitMultipleFkNext(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSplitMultipleFkNext.xsetSyncQyCall(new HpSpQyCall<WhiteSplitMultipleFkNextCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSplitMultipleFkNext(); }
                        public WhiteSplitMultipleFkNextCQ qy() { return xsyncQyCall().qy().queryWhiteSplitMultipleFkNext(); }
                    });
                }
            }
            return _whiteSplitMultipleFkNext;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSplitMultipleFkRefCB.HpSpecification specifyWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
            assertRelation("whiteSplitMultipleFkRefAsSplitMultipleFkTest");
            if (_whiteSplitMultipleFkRefAsSplitMultipleFkTest == null) {
                _whiteSplitMultipleFkRefAsSplitMultipleFkTest = new WhiteSplitMultipleFkRefCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSplitMultipleFkRefCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }
                    public WhiteSplitMultipleFkRefCQ qy() { return _qyCall.qy().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSplitMultipleFkRefAsSplitMultipleFkTest.xsetSyncQyCall(new HpSpQyCall<WhiteSplitMultipleFkRefCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }
                        public WhiteSplitMultipleFkRefCQ qy() { return xsyncQyCall().qy().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }
                    });
                }
            }
            return _whiteSplitMultipleFkRefAsSplitMultipleFkTest;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_split_multiple_fk_child where ...) as FOO_MAX} <br />
         * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedWhiteSplitMultipleFkChildList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
         *     public void query(WhiteSplitMultipleFkChildCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteSplitMultipleFkChild.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkBaseCQ> derivedWhiteSplitMultipleFkChildList() {
            assertDerived("whiteSplitMultipleFkChildList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkBaseCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkBaseCQ>() {
                public void setup(String fn, SubQuery<WhiteSplitMultipleFkChildCB> sq, WhiteSplitMultipleFkBaseCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteSplitMultipleFkChildList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBaseCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBaseCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBaseCQ>() {
                public void setup(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, WhiteSplitMultipleFkBaseCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteSplitMultipleFkBaseCB> columnQuery(final SpecifyQuery<WhiteSplitMultipleFkBaseCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteSplitMultipleFkBaseCB>(new HpColQyHandler<WhiteSplitMultipleFkBaseCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteSplitMultipleFkBaseCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteSplitMultipleFkBaseCB xcreateColumnQueryCB() {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForColumnQuery((WhiteSplitMultipleFkBaseCB)this);
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
    public WhiteSplitMultipleFkBaseCB dreamCruiseCB() {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForDreamCruise((WhiteSplitMultipleFkBaseCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteSplitMultipleFkBaseCB> orQuery) {
        xorSQ((WhiteSplitMultipleFkBaseCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *             public void query(WhiteSplitMultipleFkBaseCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteSplitMultipleFkBaseCB> andQuery) {
        xorSQAP((WhiteSplitMultipleFkBaseCB)this, andQuery);
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
        final WhiteSplitMultipleFkBaseCB cb;
        if (mainCB != null) {
            cb = (WhiteSplitMultipleFkBaseCB)mainCB;
        } else {
            cb = new WhiteSplitMultipleFkBaseCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteSplitMultipleFkBaseCQ>() {
            public boolean has() { return true; }
            public WhiteSplitMultipleFkBaseCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteSplitMultipleFkBaseCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
