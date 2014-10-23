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
 * The base condition-bean of white_variant_relation_local_pk_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationLocalPkReferrerCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationLocalPkReferrerCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationLocalPkReferrerCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
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
        return "white_variant_relation_local_pk_referrer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param reversefkSuppressedId : PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO. (NotNull)
     * @return this. (NotNull)
     */
    public WhiteVariantRelationLocalPkReferrerCB acceptPK(Long reversefkSuppressedId) {
        assertObjectNotNull("reversefkSuppressedId", reversefkSuppressedId);
        BsWhiteVariantRelationLocalPkReferrerCB cb = this;
        cb.query().setReversefkSuppressedId_Equal(reversefkSuppressedId);
        return (WhiteVariantRelationLocalPkReferrerCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param reversefkSuppressedId : PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO. (NotNull)
     */
    public void acceptPrimaryKey(Long reversefkSuppressedId) {
        assertObjectNotNull("reversefkSuppressedId", reversefkSuppressedId);
        BsWhiteVariantRelationLocalPkReferrerCB cb = this;
        cb.query().setReversefkSuppressedId_Equal(reversefkSuppressedId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReversefkSuppressedId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReversefkSuppressedId_Desc();
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
    public WhiteVariantRelationLocalPkReferrerCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteVariantRelationLocalPkReferrerCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteVariantRelationLocalPkReferrerCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteVariantRelationLocalPkReferrerCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteVariantRelationLocalPkReferrerCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteVariantRelationLocalPkReferrerCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteVariantRelationLocalPkReferrerCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteVariantRelationLocalPkReferrerCB> unionQuery) {
        final WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteVariantRelationLocalPkReferrerCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteVariantRelationLocalPkReferrerCB> unionQuery) {
        final WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteVariantRelationLocalPkReferrerCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteVariantRelationMasterFooNss _nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
    public WhiteVariantRelationMasterFooNss getNssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        if (_nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne == null) { _nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne = new WhiteVariantRelationMasterFooNss(null); }
        return _nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = whiteVariantRelationLocalPkReferrerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteVariantRelationLocalPkReferrer.<span style="color: #DD4747">getWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterFooNss setupSelect_WhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        assertSetupSelectPurpose("whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); } });
        if (_nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne == null || !_nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne.hasConditionQuery())
        { _nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne = new WhiteVariantRelationMasterFooNss(query().queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne()); }
        return _nssWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
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
            , new HpSpQyCall<WhiteVariantRelationLocalPkReferrerCQ>() {
                public boolean has() { return true; }
                public WhiteVariantRelationLocalPkReferrerCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteVariantRelationLocalPkReferrerCQ> {
        protected WhiteVariantRelationMasterFooCB.HpSpecification _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteVariantRelationLocalPkReferrerCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnReversefkSuppressedId() { return doColumn("REVERSEFK_SUPPRESSED_ID"); }
        /**
         * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMasterTypeCode() { return doColumn("MASTER_TYPE_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnReversefkSuppressedId(); // PK
        }
        @Override
        protected String getTableDbName() { return "white_variant_relation_local_pk_referrer"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterFooCB.HpSpecification specifyWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
            assertRelation("whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne");
            if (_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne == null) {
                _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne = new WhiteVariantRelationMasterFooCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterFooCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); }
                    public WhiteVariantRelationMasterFooCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterFooCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); }
                        public WhiteVariantRelationMasterFooCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); }
                    });
                }
            }
            return _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteVariantRelationLocalPkReferrerCB, WhiteVariantRelationLocalPkReferrerCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteVariantRelationLocalPkReferrerCB, WhiteVariantRelationLocalPkReferrerCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteVariantRelationLocalPkReferrerCB, WhiteVariantRelationLocalPkReferrerCQ>() {
                public void setup(String fn, SubQuery<WhiteVariantRelationLocalPkReferrerCB> sq, WhiteVariantRelationLocalPkReferrerCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhiteVariantRelationLocalPkReferrerCB> columnQuery(final SpecifyQuery<WhiteVariantRelationLocalPkReferrerCB> leftSpecifyQuery) {
        return xcreateColQyOperandMySql(new HpColQyHandler<WhiteVariantRelationLocalPkReferrerCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteVariantRelationLocalPkReferrerCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteVariantRelationLocalPkReferrerCB xcreateColumnQueryCB() {
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB();
        cb.xsetupForColumnQuery((WhiteVariantRelationLocalPkReferrerCB)this);
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
    public WhiteVariantRelationLocalPkReferrerCB dreamCruiseCB() {
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB();
        cb.xsetupForDreamCruise((WhiteVariantRelationLocalPkReferrerCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteVariantRelationLocalPkReferrerCB> orQuery) {
        xorSQ((WhiteVariantRelationLocalPkReferrerCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *             public void query(WhiteVariantRelationLocalPkReferrerCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteVariantRelationLocalPkReferrerCB> andQuery) {
        xorSQAP((WhiteVariantRelationLocalPkReferrerCB)this, andQuery);
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
        final WhiteVariantRelationLocalPkReferrerCB cb;
        if (mainCB != null) {
            cb = (WhiteVariantRelationLocalPkReferrerCB)mainCB;
        } else {
            cb = new WhiteVariantRelationLocalPkReferrerCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationLocalPkReferrerCQ>() {
            public boolean has() { return true; }
            public WhiteVariantRelationLocalPkReferrerCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteVariantRelationLocalPkReferrerCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteVariantRelationLocalPkReferrerCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
