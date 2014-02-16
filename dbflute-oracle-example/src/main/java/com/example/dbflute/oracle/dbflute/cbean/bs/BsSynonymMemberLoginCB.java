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
 * The base condition-bean of SYNONYM_MEMBER_LOGIN.
 * @author oracleman
 */
public class BsSynonymMemberLoginCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberLoginCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberLoginCB() {
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
        return "SYNONYM_MEMBER_LOGIN";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long memberLoginId) {
        assertObjectNotNull("memberLoginId", memberLoginId);
        BsSynonymMemberLoginCB cb = this;
        cb.query().setMemberLoginId_Equal(memberLoginId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberLoginId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberLoginId_Desc();
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
     * <span style="color: #3F7E5E">// ExistsReferrer: (co-related sub-query)</span>
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
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (co-related sub-query)</span>
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
    public SynonymMemberLoginCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public SynonymMemberLoginCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected SynonymMemberLoginCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected SynonymMemberLoginCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        SynonymMemberLoginCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected SynonymMemberLoginCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new SynonymMemberLoginCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<SynonymMemberLoginCB> unionQuery) {
        final SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final SynonymMemberLoginCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<SynonymMemberLoginCB> unionQuery) {
        final SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final SynonymMemberLoginCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
    protected MemberVendorSynonymNss _nssMemberVendorSynonym;
    public MemberVendorSynonymNss getNssMemberVendorSynonym() {
        if (_nssMemberVendorSynonym == null) { _nssMemberVendorSynonym = new MemberVendorSynonymNss(null); }
        return _nssMemberVendorSynonym;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberVendorSynonym()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberLogin synonymMemberLogin = synonymMemberLoginBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberLogin.<span style="color: #FD4747">getMemberVendorSynonym()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberVendorSynonymNss setupSelect_MemberVendorSynonym() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberVendorSynonym(); } });
        if (_nssMemberVendorSynonym == null || !_nssMemberVendorSynonym.hasConditionQuery())
        { _nssMemberVendorSynonym = new MemberVendorSynonymNss(query().queryMemberVendorSynonym()); }
        return _nssMemberVendorSynonym;
    }
    protected MemberStatusNss _nssMemberStatus;
    public MemberStatusNss getNssMemberStatus() {
        if (_nssMemberStatus == null) { _nssMemberStatus = new MemberStatusNss(null); }
        return _nssMemberStatus;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberLogin synonymMemberLogin = synonymMemberLoginBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberLogin.<span style="color: #FD4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberStatusNss setupSelect_MemberStatus() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnLoginMemberStatusCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberStatus(); } });
        if (_nssMemberStatus == null || !_nssMemberStatus.hasConditionQuery())
        { _nssMemberStatus = new MemberStatusNss(query().queryMemberStatus()); }
        return _nssMemberStatus;
    }
    protected SynonymMemberNss _nssSynonymMember;
    public SynonymMemberNss getNssSynonymMember() {
        if (_nssSynonymMember == null) { _nssSynonymMember = new SynonymMemberNss(null); }
        return _nssSynonymMember;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.<span style="color: #FD4747">setupSelect_SynonymMember()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberLogin synonymMemberLogin = synonymMemberLoginBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberLogin.<span style="color: #FD4747">getSynonymMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SynonymMemberNss setupSelect_SynonymMember() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().querySynonymMember(); } });
        if (_nssSynonymMember == null || !_nssSynonymMember.hasConditionQuery())
        { _nssSynonymMember = new SynonymMemberNss(query().querySynonymMember()); }
        return _nssSynonymMember;
    }
    protected VendorSynonymMemberNss _nssVendorSynonymMember;
    public VendorSynonymMemberNss getNssVendorSynonymMember() {
        if (_nssVendorSynonymMember == null) { _nssVendorSynonymMember = new VendorSynonymMemberNss(null); }
        return _nssVendorSynonymMember;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorSynonymMember()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberLogin synonymMemberLogin = synonymMemberLoginBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberLogin.<span style="color: #FD4747">getVendorSynonymMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorSynonymMemberNss setupSelect_VendorSynonymMember() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorSynonymMember(); } });
        if (_nssVendorSynonymMember == null || !_nssVendorSynonymMember.hasConditionQuery())
        { _nssVendorSynonymMember = new VendorSynonymMemberNss(query().queryVendorSynonymMember()); }
        return _nssVendorSynonymMember;
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
            , new HpSpQyCall<SynonymMemberLoginCQ>() {
                public boolean has() { return true; }
                public SynonymMemberLoginCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<SynonymMemberLoginCQ> {
        protected MemberVendorSynonymCB.HpSpecification _memberVendorSynonym;
        protected MemberStatusCB.HpSpecification _memberStatus;
        protected SynonymMemberCB.HpSpecification _synonymMember;
        protected VendorSynonymMemberCB.HpSpecification _vendorSynonymMember;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<SynonymMemberLoginCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberLoginId() { return doColumn("MEMBER_LOGIN_ID"); }
        /**
         * MEMBER_ID: {UQ, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * LOGIN_DATETIME: {UQ+, IX, NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLoginDatetime() { return doColumn("LOGIN_DATETIME"); }
        /**
         * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMobileLoginFlg() { return doColumn("MOBILE_LOGIN_FLG"); }
        /**
         * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLoginMemberStatusCode() { return doColumn("LOGIN_MEMBER_STATUS_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberLoginId(); // PK
            if (qyCall().qy().hasConditionQueryMemberVendorSynonym()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberVendorSynonymCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberStatusCQ) {
                columnLoginMemberStatusCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQuerySynonymMember()
                    || qyCall().qy().xgetReferrerQuery() instanceof SynonymMemberCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendorSynonymMember()
                    || qyCall().qy().xgetReferrerQuery() instanceof VendorSynonymMemberCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "SYNONYM_MEMBER_LOGIN"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberVendorSynonymCB.HpSpecification specifyMemberVendorSynonym() {
            assertRelation("memberVendorSynonym");
            if (_memberVendorSynonym == null) {
                _memberVendorSynonym = new MemberVendorSynonymCB.HpSpecification(_baseCB, new HpSpQyCall<MemberVendorSynonymCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberVendorSynonym(); }
                    public MemberVendorSynonymCQ qy() { return _qyCall.qy().queryMemberVendorSynonym(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberVendorSynonym.xsetSyncQyCall(new HpSpQyCall<MemberVendorSynonymCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberVendorSynonym(); }
                        public MemberVendorSynonymCQ qy() { return xsyncQyCall().qy().queryMemberVendorSynonym(); }
                    });
                }
            }
            return _memberVendorSynonym;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
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
         * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SynonymMemberCB.HpSpecification specifySynonymMember() {
            assertRelation("synonymMember");
            if (_synonymMember == null) {
                _synonymMember = new SynonymMemberCB.HpSpecification(_baseCB, new HpSpQyCall<SynonymMemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQuerySynonymMember(); }
                    public SynonymMemberCQ qy() { return _qyCall.qy().querySynonymMember(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _synonymMember.xsetSyncQyCall(new HpSpQyCall<SynonymMemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySynonymMember(); }
                        public SynonymMemberCQ qy() { return xsyncQyCall().qy().querySynonymMember(); }
                    });
                }
            }
            return _synonymMember;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorSynonymMemberCB.HpSpecification specifyVendorSynonymMember() {
            assertRelation("vendorSynonymMember");
            if (_vendorSynonymMember == null) {
                _vendorSynonymMember = new VendorSynonymMemberCB.HpSpecification(_baseCB, new HpSpQyCall<VendorSynonymMemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorSynonymMember(); }
                    public VendorSynonymMemberCQ qy() { return _qyCall.qy().queryVendorSynonymMember(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorSynonymMember.xsetSyncQyCall(new HpSpQyCall<VendorSynonymMemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorSynonymMember(); }
                        public VendorSynonymMemberCQ qy() { return xsyncQyCall().qy().queryVendorSynonymMember(); }
                    });
                }
            }
            return _vendorSynonymMember;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<SynonymMemberLoginCB, SynonymMemberLoginCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<SynonymMemberLoginCB, SynonymMemberLoginCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<SynonymMemberLoginCB, SynonymMemberLoginCQ>() {
                public void setup(String fn, SubQuery<SynonymMemberLoginCB> sq, SynonymMemberLoginCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<SynonymMemberLoginCB> columnQuery(final SpecifyQuery<SynonymMemberLoginCB> leftSpecifyQuery) {
        return new HpColQyOperand<SynonymMemberLoginCB>(new HpColQyHandler<SynonymMemberLoginCB>() {
            public HpCalculator handle(SpecifyQuery<SynonymMemberLoginCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected SynonymMemberLoginCB xcreateColumnQueryCB() {
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
        cb.xsetupForColumnQuery((SynonymMemberLoginCB)this);
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
    public SynonymMemberLoginCB dreamCruiseCB() {
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
        cb.xsetupForDreamCruise((SynonymMemberLoginCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<SynonymMemberLoginCB> orQuery) {
        xorSQ((SynonymMemberLoginCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;SynonymMemberLoginCB&gt;() {
     *             public void query(SynonymMemberLoginCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<SynonymMemberLoginCB> andQuery) {
        xorSQAP((SynonymMemberLoginCB)this, andQuery);
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
        final SynonymMemberLoginCB cb;
        if (mainCB != null) {
            cb = (SynonymMemberLoginCB)mainCB;
        } else {
            cb = new SynonymMemberLoginCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<SynonymMemberLoginCQ>() {
            public boolean has() { return true; }
            public SynonymMemberLoginCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return SynonymMemberLoginCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return SynonymMemberLoginCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
