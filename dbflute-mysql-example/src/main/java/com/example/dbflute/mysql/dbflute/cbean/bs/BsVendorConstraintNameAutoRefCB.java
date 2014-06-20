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

/**
 * The base condition-bean of vendor_constraint_name_auto_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorConstraintNameAutoRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorConstraintNameAutoRefCB() {
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
        return "vendor_constraint_name_auto_ref";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param constraintNameAutoRefId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return this. (NotNull)
     */
    public VendorConstraintNameAutoRefCB acceptPK(Long constraintNameAutoRefId) {
        assertObjectNotNull("constraintNameAutoRefId", constraintNameAutoRefId);
        BsVendorConstraintNameAutoRefCB cb = this;
        cb.query().setConstraintNameAutoRefId_Equal(constraintNameAutoRefId);
        return (VendorConstraintNameAutoRefCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param constraintNameAutoRefId : PK, NotNull, DECIMAL(16). (NotNull)
     */
    public void acceptPrimaryKey(Long constraintNameAutoRefId) {
        assertObjectNotNull("constraintNameAutoRefId", constraintNameAutoRefId);
        BsVendorConstraintNameAutoRefCB cb = this;
        cb.query().setConstraintNameAutoRefId_Equal(constraintNameAutoRefId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param constraintNameAutoUnique : UQ, NotNull, VARCHAR(50). (NotNull)
     * @return this. (NotNull)
     */
    public VendorConstraintNameAutoRefCB acceptUniqueOf(String constraintNameAutoUnique) {
        assertObjectNotNull("constraintNameAutoUnique", constraintNameAutoUnique);
        BsVendorConstraintNameAutoRefCB cb = this;
        cb.query().setConstraintNameAutoUnique_Equal(constraintNameAutoUnique);
        return (VendorConstraintNameAutoRefCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ConstraintNameAutoRefId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ConstraintNameAutoRefId_Desc();
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
    public VendorConstraintNameAutoRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public VendorConstraintNameAutoRefCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected VendorConstraintNameAutoRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected VendorConstraintNameAutoRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        VendorConstraintNameAutoRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected VendorConstraintNameAutoRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new VendorConstraintNameAutoRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<VendorConstraintNameAutoRefCB> unionQuery) {
        final VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorConstraintNameAutoRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<VendorConstraintNameAutoRefCB> unionQuery) {
        final VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorConstraintNameAutoRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br />
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.<span style="color: #DD4747">setupSelect_VendorConstraintNameAutoFoo()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorConstraintNameAutoRef.<span style="color: #DD4747">getVendorConstraintNameAutoFoo()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_VendorConstraintNameAutoFoo() {
        assertSetupSelectPurpose("vendorConstraintNameAutoFoo");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnConstraintNameAutoFooId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorConstraintNameAutoFoo(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.<span style="color: #DD4747">setupSelect_VendorConstraintNameAutoBar()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorConstraintNameAutoRef.<span style="color: #DD4747">getVendorConstraintNameAutoBar()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_VendorConstraintNameAutoBar() {
        assertSetupSelectPurpose("vendorConstraintNameAutoBar");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnConstraintNameAutoBarId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorConstraintNameAutoBar(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.<span style="color: #DD4747">setupSelect_VendorConstraintNameAutoQux()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorConstraintNameAutoRef.<span style="color: #DD4747">getVendorConstraintNameAutoQux()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_VendorConstraintNameAutoQux() {
        assertSetupSelectPurpose("vendorConstraintNameAutoQux");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnConstraintNameAutoQuxId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorConstraintNameAutoQux(); } });
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
            , new HpSpQyCall<VendorConstraintNameAutoRefCQ>() {
                public boolean has() { return true; }
                public VendorConstraintNameAutoRefCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<VendorConstraintNameAutoRefCQ> {
        protected VendorConstraintNameAutoFooCB.HpSpecification _vendorConstraintNameAutoFoo;
        protected VendorConstraintNameAutoBarCB.HpSpecification _vendorConstraintNameAutoBar;
        protected VendorConstraintNameAutoQuxCB.HpSpecification _vendorConstraintNameAutoQux;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<VendorConstraintNameAutoRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoRefId() { return doColumn("CONSTRAINT_NAME_AUTO_REF_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoFooId() { return doColumn("CONSTRAINT_NAME_AUTO_FOO_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoBarId() { return doColumn("CONSTRAINT_NAME_AUTO_BAR_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoQuxId() { return doColumn("CONSTRAINT_NAME_AUTO_QUX_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoCorgeId() { return doColumn("CONSTRAINT_NAME_AUTO_CORGE_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoUnique() { return doColumn("CONSTRAINT_NAME_AUTO_UNIQUE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnConstraintNameAutoRefId(); // PK
            if (qyCall().qy().hasConditionQueryVendorConstraintNameAutoFoo()
                    || qyCall().qy().xgetReferrerQuery() instanceof VendorConstraintNameAutoFooCQ) {
                columnConstraintNameAutoFooId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendorConstraintNameAutoBar()
                    || qyCall().qy().xgetReferrerQuery() instanceof VendorConstraintNameAutoBarCQ) {
                columnConstraintNameAutoBarId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendorConstraintNameAutoQux()
                    || qyCall().qy().xgetReferrerQuery() instanceof VendorConstraintNameAutoQuxCQ) {
                columnConstraintNameAutoQuxId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "vendor_constraint_name_auto_ref"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorConstraintNameAutoFooCB.HpSpecification specifyVendorConstraintNameAutoFoo() {
            assertRelation("vendorConstraintNameAutoFoo");
            if (_vendorConstraintNameAutoFoo == null) {
                _vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFooCB.HpSpecification(_baseCB, new HpSpQyCall<VendorConstraintNameAutoFooCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorConstraintNameAutoFoo(); }
                    public VendorConstraintNameAutoFooCQ qy() { return _qyCall.qy().queryVendorConstraintNameAutoFoo(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorConstraintNameAutoFoo.xsetSyncQyCall(new HpSpQyCall<VendorConstraintNameAutoFooCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorConstraintNameAutoFoo(); }
                        public VendorConstraintNameAutoFooCQ qy() { return xsyncQyCall().qy().queryVendorConstraintNameAutoFoo(); }
                    });
                }
            }
            return _vendorConstraintNameAutoFoo;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorConstraintNameAutoBarCB.HpSpecification specifyVendorConstraintNameAutoBar() {
            assertRelation("vendorConstraintNameAutoBar");
            if (_vendorConstraintNameAutoBar == null) {
                _vendorConstraintNameAutoBar = new VendorConstraintNameAutoBarCB.HpSpecification(_baseCB, new HpSpQyCall<VendorConstraintNameAutoBarCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorConstraintNameAutoBar(); }
                    public VendorConstraintNameAutoBarCQ qy() { return _qyCall.qy().queryVendorConstraintNameAutoBar(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorConstraintNameAutoBar.xsetSyncQyCall(new HpSpQyCall<VendorConstraintNameAutoBarCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorConstraintNameAutoBar(); }
                        public VendorConstraintNameAutoBarCQ qy() { return xsyncQyCall().qy().queryVendorConstraintNameAutoBar(); }
                    });
                }
            }
            return _vendorConstraintNameAutoBar;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorConstraintNameAutoQuxCB.HpSpecification specifyVendorConstraintNameAutoQux() {
            assertRelation("vendorConstraintNameAutoQux");
            if (_vendorConstraintNameAutoQux == null) {
                _vendorConstraintNameAutoQux = new VendorConstraintNameAutoQuxCB.HpSpecification(_baseCB, new HpSpQyCall<VendorConstraintNameAutoQuxCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorConstraintNameAutoQux(); }
                    public VendorConstraintNameAutoQuxCQ qy() { return _qyCall.qy().queryVendorConstraintNameAutoQux(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorConstraintNameAutoQux.xsetSyncQyCall(new HpSpQyCall<VendorConstraintNameAutoQuxCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorConstraintNameAutoQux(); }
                        public VendorConstraintNameAutoQuxCQ qy() { return xsyncQyCall().qy().queryVendorConstraintNameAutoQux(); }
                    });
                }
            }
            return _vendorConstraintNameAutoQux;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRefCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRefCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRefCQ>() {
                public void setup(String fn, SubQuery<VendorConstraintNameAutoRefCB> sq, VendorConstraintNameAutoRefCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<VendorConstraintNameAutoRefCB> columnQuery(final SpecifyQuery<VendorConstraintNameAutoRefCB> leftSpecifyQuery) {
        return new HpColQyOperand<VendorConstraintNameAutoRefCB>(new HpColQyHandler<VendorConstraintNameAutoRefCB>() {
            public HpCalculator handle(SpecifyQuery<VendorConstraintNameAutoRefCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected VendorConstraintNameAutoRefCB xcreateColumnQueryCB() {
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
        cb.xsetupForColumnQuery((VendorConstraintNameAutoRefCB)this);
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
    public VendorConstraintNameAutoRefCB dreamCruiseCB() {
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
        cb.xsetupForDreamCruise((VendorConstraintNameAutoRefCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<VendorConstraintNameAutoRefCB> orQuery) {
        xorSQ((VendorConstraintNameAutoRefCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *             public void query(VendorConstraintNameAutoRefCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<VendorConstraintNameAutoRefCB> andQuery) {
        xorSQAP((VendorConstraintNameAutoRefCB)this, andQuery);
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
        final VendorConstraintNameAutoRefCB cb;
        if (mainCB != null) {
            cb = (VendorConstraintNameAutoRefCB)mainCB;
        } else {
            cb = new VendorConstraintNameAutoRefCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<VendorConstraintNameAutoRefCQ>() {
            public boolean has() { return true; }
            public VendorConstraintNameAutoRefCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return VendorConstraintNameAutoRefCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return VendorConstraintNameAutoRefCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
