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
 * The base condition-bean of white_perrotta_over_trace.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverTraceCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverTraceCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverTraceCB() {
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
        return "white_perrotta_over_trace";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param traceId : PK, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public WhitePerrottaOverTraceCB acceptPK(Long traceId) {
        assertObjectNotNull("traceId", traceId);
        BsWhitePerrottaOverTraceCB cb = this;
        cb.query().setTraceId_Equal(traceId);
        return (WhitePerrottaOverTraceCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param traceId : PK, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long traceId) {
        assertObjectNotNull("traceId", traceId);
        BsWhitePerrottaOverTraceCB cb = this;
        cb.query().setTraceId_Equal(traceId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param previousProductId : UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @param nextProductId : +UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @return this. (NotNull)
     */
    public WhitePerrottaOverTraceCB acceptUniqueOf(Long previousProductId, Long nextProductId) {
        assertObjectNotNull("previousProductId", previousProductId);assertObjectNotNull("nextProductId", nextProductId);
        BsWhitePerrottaOverTraceCB cb = this;
        cb.query().setPreviousProductId_Equal(previousProductId);cb.query().setNextProductId_Equal(nextProductId);
        return (WhitePerrottaOverTraceCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TraceId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TraceId_Desc();
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
    public WhitePerrottaOverTraceCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhitePerrottaOverTraceCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhitePerrottaOverTraceCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhitePerrottaOverTraceCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhitePerrottaOverTraceCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhitePerrottaOverTraceCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhitePerrottaOverTraceCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhitePerrottaOverTraceCB> unionQuery) {
        final WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhitePerrottaOverTraceCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhitePerrottaOverTraceCB> unionQuery) {
        final WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhitePerrottaOverTraceCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhitePerrottaOverProductNss _nssWhitePerrottaOverProductByNextProductId;
    public WhitePerrottaOverProductNss getNssWhitePerrottaOverProductByNextProductId() {
        if (_nssWhitePerrottaOverProductByNextProductId == null) { _nssWhitePerrottaOverProductByNextProductId = new WhitePerrottaOverProductNss(null); }
        return _nssWhitePerrottaOverProductByNextProductId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_perrotta_over_product by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * <pre>
     * WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
     * cb.<span style="color: #DD4747">setupSelect_WhitePerrottaOverProductByNextProductId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhitePerrottaOverTrace whitePerrottaOverTrace = whitePerrottaOverTraceBhv.selectEntityWithDeletedCheck(cb);
     * ... = whitePerrottaOverTrace.<span style="color: #DD4747">getWhitePerrottaOverProductByNextProductId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePerrottaOverProductNss setupSelect_WhitePerrottaOverProductByNextProductId() {
        assertSetupSelectPurpose("whitePerrottaOverProductByNextProductId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnNextProductId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhitePerrottaOverProductByNextProductId(); } });
        if (_nssWhitePerrottaOverProductByNextProductId == null || !_nssWhitePerrottaOverProductByNextProductId.hasConditionQuery())
        { _nssWhitePerrottaOverProductByNextProductId = new WhitePerrottaOverProductNss(query().queryWhitePerrottaOverProductByNextProductId()); }
        return _nssWhitePerrottaOverProductByNextProductId;
    }

    protected WhitePerrottaOverProductNss _nssWhitePerrottaOverProductByPreviousProductId;
    public WhitePerrottaOverProductNss getNssWhitePerrottaOverProductByPreviousProductId() {
        if (_nssWhitePerrottaOverProductByPreviousProductId == null) { _nssWhitePerrottaOverProductByPreviousProductId = new WhitePerrottaOverProductNss(null); }
        return _nssWhitePerrottaOverProductByPreviousProductId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_perrotta_over_product by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * <pre>
     * WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
     * cb.<span style="color: #DD4747">setupSelect_WhitePerrottaOverProductByPreviousProductId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhitePerrottaOverTrace whitePerrottaOverTrace = whitePerrottaOverTraceBhv.selectEntityWithDeletedCheck(cb);
     * ... = whitePerrottaOverTrace.<span style="color: #DD4747">getWhitePerrottaOverProductByPreviousProductId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePerrottaOverProductNss setupSelect_WhitePerrottaOverProductByPreviousProductId() {
        assertSetupSelectPurpose("whitePerrottaOverProductByPreviousProductId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnPreviousProductId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhitePerrottaOverProductByPreviousProductId(); } });
        if (_nssWhitePerrottaOverProductByPreviousProductId == null || !_nssWhitePerrottaOverProductByPreviousProductId.hasConditionQuery())
        { _nssWhitePerrottaOverProductByPreviousProductId = new WhitePerrottaOverProductNss(query().queryWhitePerrottaOverProductByPreviousProductId()); }
        return _nssWhitePerrottaOverProductByPreviousProductId;
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
            , new HpSpQyCall<WhitePerrottaOverTraceCQ>() {
                public boolean has() { return true; }
                public WhitePerrottaOverTraceCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhitePerrottaOverTraceCQ> {
        protected WhitePerrottaOverProductCB.HpSpecification _whitePerrottaOverProductByNextProductId;
        protected WhitePerrottaOverProductCB.HpSpecification _whitePerrottaOverProductByPreviousProductId;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhitePerrottaOverTraceCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * TRACE_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTraceId() { return doColumn("TRACE_ID"); }
        /**
         * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPreviousProductId() { return doColumn("PREVIOUS_PRODUCT_ID"); }
        /**
         * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNextProductId() { return doColumn("NEXT_PRODUCT_ID"); }
        /**
         * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTraceTypeCode() { return doColumn("TRACE_TYPE_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnTraceId(); // PK
            if (qyCall().qy().hasConditionQueryWhitePerrottaOverProductByNextProductId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhitePerrottaOverProductCQ) {
                columnNextProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhitePerrottaOverProductByPreviousProductId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhitePerrottaOverProductCQ) {
                columnPreviousProductId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_perrotta_over_trace"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_perrotta_over_product by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePerrottaOverProductCB.HpSpecification specifyWhitePerrottaOverProductByNextProductId() {
            assertRelation("whitePerrottaOverProductByNextProductId");
            if (_whitePerrottaOverProductByNextProductId == null) {
                _whitePerrottaOverProductByNextProductId = new WhitePerrottaOverProductCB.HpSpecification(_baseCB, new HpSpQyCall<WhitePerrottaOverProductCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePerrottaOverProductByNextProductId(); }
                    public WhitePerrottaOverProductCQ qy() { return _qyCall.qy().queryWhitePerrottaOverProductByNextProductId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whitePerrottaOverProductByNextProductId.xsetSyncQyCall(new HpSpQyCall<WhitePerrottaOverProductCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePerrottaOverProductByNextProductId(); }
                        public WhitePerrottaOverProductCQ qy() { return xsyncQyCall().qy().queryWhitePerrottaOverProductByNextProductId(); }
                    });
                }
            }
            return _whitePerrottaOverProductByNextProductId;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_perrotta_over_product by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePerrottaOverProductCB.HpSpecification specifyWhitePerrottaOverProductByPreviousProductId() {
            assertRelation("whitePerrottaOverProductByPreviousProductId");
            if (_whitePerrottaOverProductByPreviousProductId == null) {
                _whitePerrottaOverProductByPreviousProductId = new WhitePerrottaOverProductCB.HpSpecification(_baseCB, new HpSpQyCall<WhitePerrottaOverProductCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePerrottaOverProductByPreviousProductId(); }
                    public WhitePerrottaOverProductCQ qy() { return _qyCall.qy().queryWhitePerrottaOverProductByPreviousProductId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whitePerrottaOverProductByPreviousProductId.xsetSyncQyCall(new HpSpQyCall<WhitePerrottaOverProductCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePerrottaOverProductByPreviousProductId(); }
                        public WhitePerrottaOverProductCQ qy() { return xsyncQyCall().qy().queryWhitePerrottaOverProductByPreviousProductId(); }
                    });
                }
            }
            return _whitePerrottaOverProductByPreviousProductId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhitePerrottaOverTraceCB, WhitePerrottaOverTraceCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhitePerrottaOverTraceCB, WhitePerrottaOverTraceCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhitePerrottaOverTraceCB, WhitePerrottaOverTraceCQ>() {
                public void setup(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, WhitePerrottaOverTraceCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhitePerrottaOverTraceCB> columnQuery(final SpecifyQuery<WhitePerrottaOverTraceCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhitePerrottaOverTraceCB>(new HpColQyHandler<WhitePerrottaOverTraceCB>() {
            public HpCalculator handle(SpecifyQuery<WhitePerrottaOverTraceCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhitePerrottaOverTraceCB xcreateColumnQueryCB() {
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
        cb.xsetupForColumnQuery((WhitePerrottaOverTraceCB)this);
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
    public WhitePerrottaOverTraceCB dreamCruiseCB() {
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
        cb.xsetupForDreamCruise((WhitePerrottaOverTraceCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhitePerrottaOverTraceCB> orQuery) {
        xorSQ((WhitePerrottaOverTraceCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *             public void query(WhitePerrottaOverTraceCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhitePerrottaOverTraceCB> andQuery) {
        xorSQAP((WhitePerrottaOverTraceCB)this, andQuery);
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
        final WhitePerrottaOverTraceCB cb;
        if (mainCB != null) {
            cb = (WhitePerrottaOverTraceCB)mainCB;
        } else {
            cb = new WhitePerrottaOverTraceCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhitePerrottaOverTraceCQ>() {
            public boolean has() { return true; }
            public WhitePerrottaOverTraceCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhitePerrottaOverTraceCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhitePerrottaOverTraceCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
