package com.example.dbflute.oracle.dbflute.cbean.bs;

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
import com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.oracle.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;
import com.example.dbflute.oracle.dbflute.cbean.nss.*;

/**
 * The base condition-bean of VENDOR_SYNONYM_MEMBER.
 * @author oracleman
 */
public class BsVendorSynonymMemberCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorSynonymMemberCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorSynonymMemberCB() {
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
        return "VENDOR_SYNONYM_MEMBER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberId (会員ID): PK, NotNull, NUMBER(16). (NotNull)
     * @return this. (NotNull)
     */
    public VendorSynonymMemberCB acceptPK(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        BsVendorSynonymMemberCB cb = this;
        cb.query().setMemberId_Equal(memberId);
        return (VendorSynonymMemberCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param memberId (会員ID): PK, NotNull, NUMBER(16). (NotNull)
     */
    public void acceptPrimaryKey(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        BsVendorSynonymMemberCB cb = this;
        cb.query().setMemberId_Equal(memberId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return this. (NotNull)
     */
    public VendorSynonymMemberCB acceptUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        BsVendorSynonymMemberCB cb = this;
        cb.query().setMemberAccount_Equal(memberAccount);
        return (VendorSynonymMemberCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
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
    public VendorSynonymMemberCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public VendorSynonymMemberCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected VendorSynonymMemberCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected VendorSynonymMemberCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        VendorSynonymMemberCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected VendorSynonymMemberCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new VendorSynonymMemberCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<VendorSynonymMemberCB> unionQuery) {
        final VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorSynonymMemberCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<VendorSynonymMemberCB> unionQuery) {
        final VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorSynonymMemberCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public ConditionBean lockForUpdateNoWait()
    { if (xhelpIsSqlClauseOracle()) { xhelpGettingSqlClauseOracle().lockForUpdateNoWait(); } return this; }
    public ConditionBean lockForUpdateWait(int waitSec)
    { if (xhelpIsSqlClauseOracle()) { xhelpGettingSqlClauseOracle().lockForUpdateWait(waitSec); } return this; }

    protected boolean xhelpIsSqlClauseOracle() {
        return getSqlClause() instanceof org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle;
    }

    protected org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle xhelpGettingSqlClauseOracle() {
        return (org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle)getSqlClause();
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * <pre>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorSynonymMember vendorSynonymMember = vendorSynonymMemberBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorSynonymMember.<span style="color: #DD4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_MemberStatus() {
        assertSetupSelectPurpose("memberStatus");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberStatusCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberStatus(); } });
    }

    protected SynonymMemberWithdrawalNss _nssSynonymMemberWithdrawalAsOne;
    public SynonymMemberWithdrawalNss getNssSynonymMemberWithdrawalAsOne() {
        if (_nssSynonymMemberWithdrawalAsOne == null) { _nssSynonymMemberWithdrawalAsOne = new SynonymMemberWithdrawalNss(null); }
        return _nssSynonymMemberWithdrawalAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * <pre>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_SynonymMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * VendorSynonymMember vendorSynonymMember = vendorSynonymMemberBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorSynonymMember.<span style="color: #DD4747">getSynonymMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SynonymMemberWithdrawalNss setupSelect_SynonymMemberWithdrawalAsOne() {
        assertSetupSelectPurpose("synonymMemberWithdrawalAsOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().querySynonymMemberWithdrawalAsOne(); } });
        if (_nssSynonymMemberWithdrawalAsOne == null || !_nssSynonymMemberWithdrawalAsOne.hasConditionQuery()) { _nssSynonymMemberWithdrawalAsOne = new SynonymMemberWithdrawalNss(query().querySynonymMemberWithdrawalAsOne()); }
        return _nssSynonymMemberWithdrawalAsOne;
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
            , new HpSpQyCall<VendorSynonymMemberCQ>() {
                public boolean has() { return true; }
                public VendorSynonymMemberCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<VendorSynonymMemberCQ> {
        protected MemberStatusCB.HpSpecification _memberStatus;
        protected SynonymMemberWithdrawalCB.HpSpecification _synonymMemberWithdrawalAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<VendorSynonymMemberCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberName() { return doColumn("MEMBER_NAME"); }
        /**
         * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberAccount() { return doColumn("MEMBER_ACCOUNT"); }
        /**
         * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberStatusCode() { return doColumn("MEMBER_STATUS_CODE"); }
        /**
         * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFormalizedDatetime() { return doColumn("FORMALIZED_DATETIME"); }
        /**
         * (生年月日)BIRTHDATE: {DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBirthdate() { return doColumn("BIRTHDATE"); }
        /**
         * (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterProcess() { return doColumn("REGISTER_PROCESS"); }
        /**
         * (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateProcess() { return doColumn("UPDATE_PROCESS"); }
        /**
         * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberStatusCQ) {
                columnMemberStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "VENDOR_SYNONYM_MEMBER"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberStatusCB.HpSpecification specifyMemberStatus() {
            assertRelation("memberStatus");
            if (_memberStatus == null) {
                _memberStatus = new MemberStatusCB.HpSpecification(_baseCB, new HpSpQyCall<MemberStatusCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberStatus(); }
                    public MemberStatusCQ qy() { return _qyCall.qy().queryMemberStatus(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberStatus.xsetSyncQyCall(new HpSpQyCall<MemberStatusCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberStatus(); }
                        public MemberStatusCQ qy() { return xsyncQyCall().qy().queryMemberStatus(); }
                    });
                }
            }
            return _memberStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SynonymMemberWithdrawalCB.HpSpecification specifySynonymMemberWithdrawalAsOne() {
            assertRelation("synonymMemberWithdrawalAsOne");
            if (_synonymMemberWithdrawalAsOne == null) {
                _synonymMemberWithdrawalAsOne = new SynonymMemberWithdrawalCB.HpSpecification(_baseCB, new HpSpQyCall<SynonymMemberWithdrawalCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQuerySynonymMemberWithdrawalAsOne(); }
                    public SynonymMemberWithdrawalCQ qy() { return _qyCall.qy().querySynonymMemberWithdrawalAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _synonymMemberWithdrawalAsOne.xsetSyncQyCall(new HpSpQyCall<SynonymMemberWithdrawalCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySynonymMemberWithdrawalAsOne(); }
                        public SynonymMemberWithdrawalCQ qy() { return xsyncQyCall().qy().querySynonymMemberWithdrawalAsOne(); }
                    });
                }
            }
            return _synonymMemberWithdrawalAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from SYNONYM_MEMBER_LOGIN where ...) as FOO_MAX} <br />
         * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedSynonymMemberLoginList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;SynonymMemberLoginCB&gt;() {
         *     public void query(SynonymMemberLoginCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, SynonymMemberLogin.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<SynonymMemberLoginCB, VendorSynonymMemberCQ> derivedSynonymMemberLoginList() {
            assertDerived("synonymMemberLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<SynonymMemberLoginCB, VendorSynonymMemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<SynonymMemberLoginCB, VendorSynonymMemberCQ>() {
                public void setup(String fn, SubQuery<SynonymMemberLoginCB> sq, VendorSynonymMemberCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveSynonymMemberLoginList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<VendorSynonymMemberCB, VendorSynonymMemberCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<VendorSynonymMemberCB, VendorSynonymMemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<VendorSynonymMemberCB, VendorSynonymMemberCQ>() {
                public void setup(String fn, SubQuery<VendorSynonymMemberCB> sq, VendorSynonymMemberCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<VendorSynonymMemberCB> columnQuery(final SpecifyQuery<VendorSynonymMemberCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<VendorSynonymMemberCB>() {
            public HpCalculator handle(SpecifyQuery<VendorSynonymMemberCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected VendorSynonymMemberCB xcreateColumnQueryCB() {
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
        cb.xsetupForColumnQuery((VendorSynonymMemberCB)this);
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
    public VendorSynonymMemberCB dreamCruiseCB() {
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
        cb.xsetupForDreamCruise((VendorSynonymMemberCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<VendorSynonymMemberCB> orQuery) {
        xorSQ((VendorSynonymMemberCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;VendorSynonymMemberCB&gt;() {
     *             public void query(VendorSynonymMemberCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<VendorSynonymMemberCB> andQuery) {
        xorSQAP((VendorSynonymMemberCB)this, andQuery);
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
        final VendorSynonymMemberCB cb;
        if (mainCB != null) {
            cb = (VendorSynonymMemberCB)mainCB;
        } else {
            cb = new VendorSynonymMemberCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<VendorSynonymMemberCQ>() {
            public boolean has() { return true; }
            public VendorSynonymMemberCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return VendorSynonymMemberCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return VendorSynonymMemberCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
