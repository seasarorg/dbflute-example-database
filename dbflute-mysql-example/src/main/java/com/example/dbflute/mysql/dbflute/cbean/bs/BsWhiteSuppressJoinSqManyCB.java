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
 * The base condition-bean of white_suppress_join_sq_many.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqManyCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqManyCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqManyCB() {
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
        return "white_suppress_join_sq_many";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param suppressJoinSqId : PK, NotNull, INT(10), FK to white_suppress_join_sq. (NotNull)
     */
    public void acceptPrimaryKey(Integer suppressJoinSqId) {
        assertObjectNotNull("suppressJoinSqId", suppressJoinSqId);
        BsWhiteSuppressJoinSqManyCB cb = this;
        cb.query().setSuppressJoinSqId_Equal(suppressJoinSqId);;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_SuppressJoinSqId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_SuppressJoinSqId_Desc();
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
    public WhiteSuppressJoinSqManyCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteSuppressJoinSqManyCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteSuppressJoinSqManyCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteSuppressJoinSqManyCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteSuppressJoinSqManyCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteSuppressJoinSqManyCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteSuppressJoinSqManyCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteSuppressJoinSqManyCB> unionQuery) {
        final WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteSuppressJoinSqManyCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteSuppressJoinSqManyCB> unionQuery) {
        final WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteSuppressJoinSqManyCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteSuppressJoinSqManyOneNss _nssWhiteSuppressJoinSqManyOne;
    public WhiteSuppressJoinSqManyOneNss getNssWhiteSuppressJoinSqManyOne() {
        if (_nssWhiteSuppressJoinSqManyOne == null) { _nssWhiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOneNss(null); }
        return _nssWhiteSuppressJoinSqManyOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * <pre>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteSuppressJoinSqManyOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = whiteSuppressJoinSqManyBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSuppressJoinSqMany.<span style="color: #DD4747">getWhiteSuppressJoinSqManyOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSuppressJoinSqManyOneNss setupSelect_WhiteSuppressJoinSqManyOne() {
        assertSetupSelectPurpose("whiteSuppressJoinSqManyOne");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnManyOneId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSuppressJoinSqManyOne(); } });
        if (_nssWhiteSuppressJoinSqManyOne == null || !_nssWhiteSuppressJoinSqManyOne.hasConditionQuery())
        { _nssWhiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOneNss(query().queryWhiteSuppressJoinSqManyOne()); }
        return _nssWhiteSuppressJoinSqManyOne;
    }
    protected WhiteSuppressJoinSqNss _nssWhiteSuppressJoinSq;
    public WhiteSuppressJoinSqNss getNssWhiteSuppressJoinSq() {
        if (_nssWhiteSuppressJoinSq == null) { _nssWhiteSuppressJoinSq = new WhiteSuppressJoinSqNss(null); }
        return _nssWhiteSuppressJoinSq;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * <pre>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteSuppressJoinSq()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = whiteSuppressJoinSqManyBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteSuppressJoinSqMany.<span style="color: #DD4747">getWhiteSuppressJoinSq()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteSuppressJoinSqNss setupSelect_WhiteSuppressJoinSq() {
        assertSetupSelectPurpose("whiteSuppressJoinSq");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteSuppressJoinSq(); } });
        if (_nssWhiteSuppressJoinSq == null || !_nssWhiteSuppressJoinSq.hasConditionQuery())
        { _nssWhiteSuppressJoinSq = new WhiteSuppressJoinSqNss(query().queryWhiteSuppressJoinSq()); }
        return _nssWhiteSuppressJoinSq;
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
            , new HpSpQyCall<WhiteSuppressJoinSqManyCQ>() {
                public boolean has() { return true; }
                public WhiteSuppressJoinSqManyCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteSuppressJoinSqManyCQ> {
        protected WhiteSuppressJoinSqManyOneCB.HpSpecification _whiteSuppressJoinSqManyOne;
        protected WhiteSuppressJoinSqCB.HpSpecification _whiteSuppressJoinSq;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteSuppressJoinSqManyCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MANY_ID: {NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnManyId() { return doColumn("MANY_ID"); }
        /**
         * MANY_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnManyName() { return doColumn("MANY_NAME"); }
        /**
         * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10), FK to white_suppress_join_sq}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSuppressJoinSqId() { return doColumn("SUPPRESS_JOIN_SQ_ID"); }
        /**
         * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnManyOneId() { return doColumn("MANY_ONE_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnSuppressJoinSqId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteSuppressJoinSqManyOne()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSuppressJoinSqManyOneCQ) {
                columnManyOneId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_suppress_join_sq_many"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSuppressJoinSqManyOneCB.HpSpecification specifyWhiteSuppressJoinSqManyOne() {
            assertRelation("whiteSuppressJoinSqManyOne");
            if (_whiteSuppressJoinSqManyOne == null) {
                _whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOneCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSuppressJoinSqManyOneCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSuppressJoinSqManyOne(); }
                    public WhiteSuppressJoinSqManyOneCQ qy() { return _qyCall.qy().queryWhiteSuppressJoinSqManyOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSuppressJoinSqManyOne.xsetSyncQyCall(new HpSpQyCall<WhiteSuppressJoinSqManyOneCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSuppressJoinSqManyOne(); }
                        public WhiteSuppressJoinSqManyOneCQ qy() { return xsyncQyCall().qy().queryWhiteSuppressJoinSqManyOne(); }
                    });
                }
            }
            return _whiteSuppressJoinSqManyOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSuppressJoinSqCB.HpSpecification specifyWhiteSuppressJoinSq() {
            assertRelation("whiteSuppressJoinSq");
            if (_whiteSuppressJoinSq == null) {
                _whiteSuppressJoinSq = new WhiteSuppressJoinSqCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteSuppressJoinSqCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSuppressJoinSq(); }
                    public WhiteSuppressJoinSqCQ qy() { return _qyCall.qy().queryWhiteSuppressJoinSq(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSuppressJoinSq.xsetSyncQyCall(new HpSpQyCall<WhiteSuppressJoinSqCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSuppressJoinSq(); }
                        public WhiteSuppressJoinSqCQ qy() { return xsyncQyCall().qy().queryWhiteSuppressJoinSq(); }
                    });
                }
            }
            return _whiteSuppressJoinSq;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqManyCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqManyCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqManyCQ>() {
                public void setup(String fn, SubQuery<WhiteSuppressJoinSqManyCB> sq, WhiteSuppressJoinSqManyCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteSuppressJoinSqManyCB> columnQuery(final SpecifyQuery<WhiteSuppressJoinSqManyCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteSuppressJoinSqManyCB>(new HpColQyHandler<WhiteSuppressJoinSqManyCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteSuppressJoinSqManyCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteSuppressJoinSqManyCB xcreateColumnQueryCB() {
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
        cb.xsetupForColumnQuery((WhiteSuppressJoinSqManyCB)this);
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
    public WhiteSuppressJoinSqManyCB dreamCruiseCB() {
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
        cb.xsetupForDreamCruise((WhiteSuppressJoinSqManyCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteSuppressJoinSqManyCB> orQuery) {
        xorSQ((WhiteSuppressJoinSqManyCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *             public void query(WhiteSuppressJoinSqManyCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteSuppressJoinSqManyCB> andQuery) {
        xorSQAP((WhiteSuppressJoinSqManyCB)this, andQuery);
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
        final WhiteSuppressJoinSqManyCB cb;
        if (mainCB != null) {
            cb = (WhiteSuppressJoinSqManyCB)mainCB;
        } else {
            cb = new WhiteSuppressJoinSqManyCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteSuppressJoinSqManyCQ>() {
            public boolean has() { return true; }
            public WhiteSuppressJoinSqManyCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteSuppressJoinSqManyCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteSuppressJoinSqManyCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
