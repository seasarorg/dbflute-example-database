package com.example.dbflute.postgresql.dbflute.cbean.bs;

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
import com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.postgresql.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;
import com.example.dbflute.postgresql.dbflute.cbean.nss.*;

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
        return "vendor_large_data_ref";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param largeDataRefId : PK, NotNull, int8(19). (NotNull)
     * @return this. (NotNull)
     */
    public VendorLargeDataRefCB acceptPK(Long largeDataRefId) {
        assertObjectNotNull("largeDataRefId", largeDataRefId);
        BsVendorLargeDataRefCB cb = this;
        cb.query().setLargeDataRefId_Equal(largeDataRefId);
        return (VendorLargeDataRefCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param largeDataRefId : PK, NotNull, int8(19). (NotNull)
     */
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<VendorLargeDataRefCB> unionQuery) {
        final VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorLargeDataRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<VendorLargeDataRefCB> unionQuery) {
        final VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorLargeDataRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public ConditionBean lockForUpdateNoWait()
    { if (xhelpIsSqlClausePostgreSql()) { xhelpGettingSqlClausePostgreSql().lockForUpdateNoWait(); } return this; }

    protected boolean xhelpIsSqlClausePostgreSql() {
        return getSqlClause() instanceof org.seasar.dbflute.cbean.sqlclause.SqlClausePostgreSql;
    }

    protected org.seasar.dbflute.cbean.sqlclause.SqlClausePostgreSql xhelpGettingSqlClausePostgreSql() {
        return (org.seasar.dbflute.cbean.sqlclause.SqlClausePostgreSql)getSqlClause();
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
     * vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.<span style="color: #DD4747">setupSelect_VendorLargeData()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorLargeDataRef.<span style="color: #DD4747">getVendorLargeData()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorLargeDataNss setupSelect_VendorLargeData() {
        assertSetupSelectPurpose("vendorLargeData");
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
     * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.<span style="color: #DD4747">setupSelect_VendorLargeDataRefSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorLargeDataRef.<span style="color: #DD4747">getVendorLargeDataRefSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorLargeDataRefNss setupSelect_VendorLargeDataRefSelf() {
        assertSetupSelectPurpose("vendorLargeDataRefSelf");
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
         * large_data_ref_id: {PK, NotNull, int8(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLargeDataRefId() { return doColumn("large_data_ref_id"); }
        /**
         * large_data_id: {NotNull, int8(19), FK to vendor_large_data}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLargeDataId() { return doColumn("large_data_id"); }
        /**
         * date_index: {IX, NotNull, date(13)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDateIndex() { return doColumn("date_index"); }
        /**
         * date_no_index: {NotNull, date(13)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDateNoIndex() { return doColumn("date_no_index"); }
        /**
         * timestamp_index: {IX, NotNull, timestamp(26, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTimestampIndex() { return doColumn("timestamp_index"); }
        /**
         * timestamp_no_index: {NotNull, timestamp(26, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTimestampNoIndex() { return doColumn("timestamp_no_index"); }
        /**
         * nullable_decimal_index: {IX, numeric(12, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNullableDecimalIndex() { return doColumn("nullable_decimal_index"); }
        /**
         * nullable_decimal_no_index: {numeric(12, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNullableDecimalNoIndex() { return doColumn("nullable_decimal_no_index"); }
        /**
         * self_parent_id: {int8(19), FK to vendor_large_data_ref}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSelfParentId() { return doColumn("self_parent_id"); }
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
         * vendor_large_data by my large_data_id, named 'vendorLargeData'.
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
         * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
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
         * vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedVendorLargeDataRefSelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
         *     public void query(VendorLargeDataRefCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, VendorLargeDataRef.<span style="color: #DD4747">ALIAS_foo...</span>);
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
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<VendorLargeDataRefCB> columnQuery(final SpecifyQuery<VendorLargeDataRefCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<VendorLargeDataRefCB>() {
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
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorLargeDataRefCB&gt;() {
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

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;VendorLargeDataRefCB&gt;() {
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
