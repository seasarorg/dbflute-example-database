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
 * The base condition-bean of vendor_large_data_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorLargeDataRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeDataRefCB() {
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
        return "vendor_large_data_ref";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long largeDataRefId) {
        assertObjectNotNull("largeDataRefId", largeDataRefId);
        BsVendorLargeDataRefCB cb = this;
        cb.query().setLargeDataRefId_Equal(largeDataRefId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LargeDataRefId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LargeDataRefId_Desc();
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
    public VendorLargeDataRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public VendorLargeDataRefCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected VendorLargeDataRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected VendorLargeDataRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        VendorLargeDataRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected VendorLargeDataRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new VendorLargeDataRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<VendorLargeDataRefCB> unionQuery) {
        final VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final VendorLargeDataRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<VendorLargeDataRefCB> unionQuery) {
        final VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final VendorLargeDataRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected VendorLargeDataNss _nssVendorLargeData;
    public VendorLargeDataNss getNssVendorLargeData() {
        if (_nssVendorLargeData == null) { _nssVendorLargeData = new VendorLargeDataNss(null); }
        return _nssVendorLargeData;
    }
    /**
     * Set up relation columns to select clause. <br />
     * vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorLargeData()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorLargeDataRef.<span style="color: #FD4747">getVendorLargeData()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorLargeDataNss setupSelect_VendorLargeData() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnLargeDataId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorLargeData(); } });
        if (_nssVendorLargeData == null || !_nssVendorLargeData.hasConditionQuery())
        { _nssVendorLargeData = new VendorLargeDataNss(query().queryVendorLargeData()); }
        return _nssVendorLargeData;
    }
    protected VendorLargeDataRefNss _nssVendorLargeDataRefSelf;
    public VendorLargeDataRefNss getNssVendorLargeDataRefSelf() {
        if (_nssVendorLargeDataRefSelf == null) { _nssVendorLargeDataRefSelf = new VendorLargeDataRefNss(null); }
        return _nssVendorLargeDataRefSelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorLargeDataRefSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorLargeDataRef.<span style="color: #FD4747">getVendorLargeDataRefSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorLargeDataRefNss setupSelect_VendorLargeDataRefSelf() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnSelfParentId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorLargeDataRefSelf(); } });
        if (_nssVendorLargeDataRefSelf == null || !_nssVendorLargeDataRefSelf.hasConditionQuery())
        { _nssVendorLargeDataRefSelf = new VendorLargeDataRefNss(query().queryVendorLargeDataRefSelf()); }
        return _nssVendorLargeDataRefSelf;
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
            , new HpSpQyCall<VendorLargeDataRefCQ>() {
                public boolean has() { return true; }
                public VendorLargeDataRefCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<VendorLargeDataRefCQ> {
        protected VendorLargeDataCB.HpSpecification _vendorLargeData;
        protected VendorLargeDataRefCB.HpSpecification _vendorLargeDataRefSelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<VendorLargeDataRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLargeDataRefId() { return doColumn("LARGE_DATA_REF_ID"); }
        /**
         * LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLargeDataId() { return doColumn("LARGE_DATA_ID"); }
        /**
         * DATE_INDEX: {IX, NotNull, DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDateIndex() { return doColumn("DATE_INDEX"); }
        /**
         * DATE_NO_INDEX: {NotNull, DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDateNoIndex() { return doColumn("DATE_NO_INDEX"); }
        /**
         * TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTimestampIndex() { return doColumn("TIMESTAMP_INDEX"); }
        /**
         * TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTimestampNoIndex() { return doColumn("TIMESTAMP_NO_INDEX"); }
        /**
         * NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNullableDecimalIndex() { return doColumn("NULLABLE_DECIMAL_INDEX"); }
        /**
         * NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNullableDecimalNoIndex() { return doColumn("NULLABLE_DECIMAL_NO_INDEX"); }
        /**
         * SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSelfParentId() { return doColumn("SELF_PARENT_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnLargeDataRefId(); // PK
            if (qyCall().qy().hasConditionQueryVendorLargeData()
                    || qyCall().qy().xgetReferrerQuery() instanceof VendorLargeDataCQ) {
                columnLargeDataId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendorLargeDataRefSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof VendorLargeDataRefCQ) {
                columnSelfParentId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "vendor_large_data_ref"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorLargeDataCB.HpSpecification specifyVendorLargeData() {
            assertRelation("vendorLargeData");
            if (_vendorLargeData == null) {
                _vendorLargeData = new VendorLargeDataCB.HpSpecification(_baseCB, new HpSpQyCall<VendorLargeDataCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorLargeData(); }
                    public VendorLargeDataCQ qy() { return _qyCall.qy().queryVendorLargeData(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorLargeData.xsetSyncQyCall(new HpSpQyCall<VendorLargeDataCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorLargeData(); }
                        public VendorLargeDataCQ qy() { return xsyncQyCall().qy().queryVendorLargeData(); }
                    });
                }
            }
            return _vendorLargeData;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorLargeDataRefCB.HpSpecification specifyVendorLargeDataRefSelf() {
            assertRelation("vendorLargeDataRefSelf");
            if (_vendorLargeDataRefSelf == null) {
                _vendorLargeDataRefSelf = new VendorLargeDataRefCB.HpSpecification(_baseCB, new HpSpQyCall<VendorLargeDataRefCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorLargeDataRefSelf(); }
                    public VendorLargeDataRefCQ qy() { return _qyCall.qy().queryVendorLargeDataRefSelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorLargeDataRefSelf.xsetSyncQyCall(new HpSpQyCall<VendorLargeDataRefCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorLargeDataRefSelf(); }
                        public VendorLargeDataRefCQ qy() { return xsyncQyCall().qy().queryVendorLargeDataRefSelf(); }
                    });
                }
            }
            return _vendorLargeDataRefSelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from vendor_large_data_ref where ...) as FOO_MAX} <br />
         * vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedVendorLargeDataRefSelfList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
         *     public void query(VendorLargeDataRefCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, VendorLargeDataRef.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<VendorLargeDataRefCB, VendorLargeDataRefCQ> derivedVendorLargeDataRefSelfList() {
            assertDerived("vendorLargeDataRefSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<VendorLargeDataRefCB, VendorLargeDataRefCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<VendorLargeDataRefCB, VendorLargeDataRefCQ>() {
                public void setup(String fn, SubQuery<VendorLargeDataRefCB> sq, VendorLargeDataRefCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveVendorLargeDataRefSelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<VendorLargeDataRefCB, VendorLargeDataRefCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<VendorLargeDataRefCB, VendorLargeDataRefCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<VendorLargeDataRefCB, VendorLargeDataRefCQ>() {
                public void setup(String fn, SubQuery<VendorLargeDataRefCB> sq, VendorLargeDataRefCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<VendorLargeDataRefCB> columnQuery(final SpecifyQuery<VendorLargeDataRefCB> leftSpecifyQuery) {
        return new HpColQyOperand<VendorLargeDataRefCB>(new HpColQyHandler<VendorLargeDataRefCB>() {
            public HpCalculator handle(SpecifyQuery<VendorLargeDataRefCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected VendorLargeDataRefCB xcreateColumnQueryCB() {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.xsetupForColumnQuery((VendorLargeDataRefCB)this);
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
    public VendorLargeDataRefCB dreamCruiseCB() {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.xsetupForDreamCruise((VendorLargeDataRefCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<VendorLargeDataRefCB> orQuery) {
        xorSQ((VendorLargeDataRefCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;VendorLargeDataRefCB&gt;() {
     *             public void query(VendorLargeDataRefCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<VendorLargeDataRefCB> andQuery) {
        xorSQAP((VendorLargeDataRefCB)this, andQuery);
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
        final VendorLargeDataRefCB cb;
        if (mainCB != null) {
            cb = (VendorLargeDataRefCB)mainCB;
        } else {
            cb = new VendorLargeDataRefCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<VendorLargeDataRefCQ>() {
            public boolean has() { return true; }
            public VendorLargeDataRefCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return VendorLargeDataRefCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return VendorLargeDataRefCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
