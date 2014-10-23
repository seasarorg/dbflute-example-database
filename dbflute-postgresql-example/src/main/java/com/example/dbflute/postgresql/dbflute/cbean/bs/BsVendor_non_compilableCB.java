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
 * The base condition-bean of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendor_non_compilableCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Vendor_non_compilableCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendor_non_compilableCB() {
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
        return "VENDOR-NON COMPILABLE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return this. (NotNull)
     */
    public Vendor_non_compilableCB acceptPK(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        BsVendor_non_compilableCB cb = this;
        cb.query().setNon_compilable_id_Equal(non_compilable_id);
        return (Vendor_non_compilableCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     */
    public void acceptPrimaryKey(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        BsVendor_non_compilableCB cb = this;
        cb.query().setNon_compilable_id_Equal(non_compilable_id);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_Non_compilable_id_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_Non_compilable_id_Desc();
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
    public Vendor_non_compilableCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public Vendor_non_compilableCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected Vendor_non_compilableCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected Vendor_non_compilableCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        Vendor_non_compilableCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected Vendor_non_compilableCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new Vendor_non_compilableCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<Vendor_non_compilableCB> unionQuery) {
        final Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final Vendor_non_compilableCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<Vendor_non_compilableCB> unionQuery) {
        final Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final Vendor_non_compilableCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
    protected Vendor_non_compilableNss _nssVendor_non_compilableByNextParentidSelf;
    public Vendor_non_compilableNss getNssVendor_non_compilableByNextParentidSelf() {
        if (_nssVendor_non_compilableByNextParentidSelf == null) { _nssVendor_non_compilableByNextParentidSelf = new Vendor_non_compilableNss(null); }
        return _nssVendor_non_compilableByNextParentidSelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.<span style="color: #DD4747">setupSelect_Vendor_non_compilableByNextParentidSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Vendor_non_compilable vendor_non_compilable = vendor_non_compilableBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendor_non_compilable.<span style="color: #DD4747">getVendor_non_compilableByNextParentidSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public Vendor_non_compilableNss setupSelect_Vendor_non_compilableByNextParentidSelf() {
        assertSetupSelectPurpose("vendor_non_compilableByNextParentidSelf");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnNextParentid();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendor_non_compilableByNextParentidSelf(); } });
        if (_nssVendor_non_compilableByNextParentidSelf == null || !_nssVendor_non_compilableByNextParentidSelf.hasConditionQuery())
        { _nssVendor_non_compilableByNextParentidSelf = new Vendor_non_compilableNss(query().queryVendor_non_compilableByNextParentidSelf()); }
        return _nssVendor_non_compilableByNextParentidSelf;
    }

    protected Vendor_non_compilableNss _nssVendor_non_compilableByParent_idSelf;
    public Vendor_non_compilableNss getNssVendor_non_compilableByParent_idSelf() {
        if (_nssVendor_non_compilableByParent_idSelf == null) { _nssVendor_non_compilableByParent_idSelf = new Vendor_non_compilableNss(null); }
        return _nssVendor_non_compilableByParent_idSelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.<span style="color: #DD4747">setupSelect_Vendor_non_compilableByParent_idSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Vendor_non_compilable vendor_non_compilable = vendor_non_compilableBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendor_non_compilable.<span style="color: #DD4747">getVendor_non_compilableByParent_idSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public Vendor_non_compilableNss setupSelect_Vendor_non_compilableByParent_idSelf() {
        assertSetupSelectPurpose("vendor_non_compilableByParent_idSelf");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnParent_id();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendor_non_compilableByParent_idSelf(); } });
        if (_nssVendor_non_compilableByParent_idSelf == null || !_nssVendor_non_compilableByParent_idSelf.hasConditionQuery())
        { _nssVendor_non_compilableByParent_idSelf = new Vendor_non_compilableNss(query().queryVendor_non_compilableByParent_idSelf()); }
        return _nssVendor_non_compilableByParent_idSelf;
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
            , new HpSpQyCall<Vendor_non_compilableCQ>() {
                public boolean has() { return true; }
                public Vendor_non_compilableCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<Vendor_non_compilableCQ> {
        protected Vendor_non_compilableCB.HpSpecification _vendor_non_compilableByNextParentidSelf;
        protected Vendor_non_compilableCB.HpSpecification _vendor_non_compilableByParent_idSelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<Vendor_non_compilableCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNon_compilable_id() { return doColumn("NON-COMPILABLE ID"); }
        /**
         * NON COMPILABLE-NAME: {varchar(64)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNon_compilable_name() { return doColumn("NON COMPILABLE-NAME"); }
        /**
         * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParent_id() { return doColumn("PARENT-ID"); }
        /**
         * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNextParentid() { return doColumn("Next_ParentID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnNon_compilable_id(); // PK
            if (qyCall().qy().hasConditionQueryVendor_non_compilableByNextParentidSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof Vendor_non_compilableCQ) {
                columnNextParentid(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendor_non_compilableByParent_idSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof Vendor_non_compilableCQ) {
                columnParent_id(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "VENDOR-NON COMPILABLE"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public Vendor_non_compilableCB.HpSpecification specifyVendor_non_compilableByNextParentidSelf() {
            assertRelation("vendor_non_compilableByNextParentidSelf");
            if (_vendor_non_compilableByNextParentidSelf == null) {
                _vendor_non_compilableByNextParentidSelf = new Vendor_non_compilableCB.HpSpecification(_baseCB, new HpSpQyCall<Vendor_non_compilableCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendor_non_compilableByNextParentidSelf(); }
                    public Vendor_non_compilableCQ qy() { return _qyCall.qy().queryVendor_non_compilableByNextParentidSelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendor_non_compilableByNextParentidSelf.xsetSyncQyCall(new HpSpQyCall<Vendor_non_compilableCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendor_non_compilableByNextParentidSelf(); }
                        public Vendor_non_compilableCQ qy() { return xsyncQyCall().qy().queryVendor_non_compilableByNextParentidSelf(); }
                    });
                }
            }
            return _vendor_non_compilableByNextParentidSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public Vendor_non_compilableCB.HpSpecification specifyVendor_non_compilableByParent_idSelf() {
            assertRelation("vendor_non_compilableByParent_idSelf");
            if (_vendor_non_compilableByParent_idSelf == null) {
                _vendor_non_compilableByParent_idSelf = new Vendor_non_compilableCB.HpSpecification(_baseCB, new HpSpQyCall<Vendor_non_compilableCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendor_non_compilableByParent_idSelf(); }
                    public Vendor_non_compilableCQ qy() { return _qyCall.qy().queryVendor_non_compilableByParent_idSelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendor_non_compilableByParent_idSelf.xsetSyncQyCall(new HpSpQyCall<Vendor_non_compilableCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendor_non_compilableByParent_idSelf(); }
                        public Vendor_non_compilableCQ qy() { return xsyncQyCall().qy().queryVendor_non_compilableByParent_idSelf(); }
                    });
                }
            }
            return _vendor_non_compilableByParent_idSelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from VENDOR-NON COMPILABLE where ...) as FOO_MAX} <br />
         * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedVendor_non_compilableByNextParentidSelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
         *     public void query(Vendor_non_compilableCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, Vendor_non_compilable.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ> derivedVendor_non_compilableByNextParentidSelfList() {
            assertDerived("vendor_non_compilableByNextParentidSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<Vendor_non_compilableCB, Vendor_non_compilableCQ>() {
                public void setup(String fn, SubQuery<Vendor_non_compilableCB> sq, Vendor_non_compilableCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveVendor_non_compilableByNextParentidSelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from VENDOR-NON COMPILABLE where ...) as FOO_MAX} <br />
         * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedVendor_non_compilableByParent_idSelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
         *     public void query(Vendor_non_compilableCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, Vendor_non_compilable.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ> derivedVendor_non_compilableByParent_idSelfList() {
            assertDerived("vendor_non_compilableByParent_idSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<Vendor_non_compilableCB, Vendor_non_compilableCQ>() {
                public void setup(String fn, SubQuery<Vendor_non_compilableCB> sq, Vendor_non_compilableCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveVendor_non_compilableByParent_idSelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<Vendor_non_compilableCB, Vendor_non_compilableCQ>() {
                public void setup(String fn, SubQuery<Vendor_non_compilableCB> sq, Vendor_non_compilableCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<Vendor_non_compilableCB> columnQuery(final SpecifyQuery<Vendor_non_compilableCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<Vendor_non_compilableCB>() {
            public HpCalculator handle(SpecifyQuery<Vendor_non_compilableCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected Vendor_non_compilableCB xcreateColumnQueryCB() {
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
        cb.xsetupForColumnQuery((Vendor_non_compilableCB)this);
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
    public Vendor_non_compilableCB dreamCruiseCB() {
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
        cb.xsetupForDreamCruise((Vendor_non_compilableCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<Vendor_non_compilableCB> orQuery) {
        xorSQ((Vendor_non_compilableCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;Vendor_non_compilableCB&gt;() {
     *             public void query(Vendor_non_compilableCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<Vendor_non_compilableCB> andQuery) {
        xorSQAP((Vendor_non_compilableCB)this, andQuery);
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
        final Vendor_non_compilableCB cb;
        if (mainCB != null) {
            cb = (Vendor_non_compilableCB)mainCB;
        } else {
            cb = new Vendor_non_compilableCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<Vendor_non_compilableCQ>() {
            public boolean has() { return true; }
            public Vendor_non_compilableCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return Vendor_non_compilableCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return Vendor_non_compilableCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
