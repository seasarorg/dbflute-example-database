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
 * The base condition-bean of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefCB() {
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
        return "white_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer multipleFirstId, Integer multipleSecondId) {
        assertObjectNotNull("multipleFirstId", multipleFirstId);assertObjectNotNull("multipleSecondId", multipleSecondId);
        BsWhiteCompoundPkRefCB cb = this;
        cb.query().setMultipleFirstId_Equal(multipleFirstId);cb.query().setMultipleSecondId_Equal(multipleSecondId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MultipleFirstId_Asc();
        query().addOrderBy_MultipleSecondId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MultipleFirstId_Desc();
        query().addOrderBy_MultipleSecondId_Desc();
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
    public WhiteCompoundPkRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteCompoundPkRefCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteCompoundPkRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteCompoundPkRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteCompoundPkRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteCompoundPkRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteCompoundPkRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteCompoundPkRefCB> unionQuery) {
        final WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteCompoundPkRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteCompoundPkRefCB> unionQuery) {
        final WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteCompoundPkRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
    protected WhiteCompoundPkNss _nssWhiteCompoundPk;
    public WhiteCompoundPkNss getNssWhiteCompoundPk() {
        if (_nssWhiteCompoundPk == null) { _nssWhiteCompoundPk = new WhiteCompoundPkNss(null); }
        return _nssWhiteCompoundPk;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteCompoundPk()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRef whiteCompoundPkRef = whiteCompoundPkRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPkRef.<span style="color: #FD4747">getWhiteCompoundPk()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteCompoundPkNss setupSelect_WhiteCompoundPk() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnRefFirstId();
            specify().columnRefSecondId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundPk(); } });
        if (_nssWhiteCompoundPk == null || !_nssWhiteCompoundPk.hasConditionQuery())
        { _nssWhiteCompoundPk = new WhiteCompoundPkNss(query().queryWhiteCompoundPk()); }
        return _nssWhiteCompoundPk;
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
            , new HpSpQyCall<WhiteCompoundPkRefCQ>() {
                public boolean has() { return true; }
                public WhiteCompoundPkRefCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteCompoundPkRefCQ> {
        protected WhiteCompoundPkCB.HpSpecification _whiteCompoundPk;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteCompoundPkRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * multiple_first_id: {PK, NotNull, int4(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMultipleFirstId() { return doColumn("multiple_first_id"); }
        /**
         * multiple_second_id: {PK, NotNull, int4(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMultipleSecondId() { return doColumn("multiple_second_id"); }
        /**
         * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRefFirstId() { return doColumn("ref_first_id"); }
        /**
         * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRefSecondId() { return doColumn("ref_second_id"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMultipleFirstId(); // PK
            columnMultipleSecondId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteCompoundPk()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteCompoundPkCQ) {
                columnRefFirstId(); // FK or one-to-one referrer
                columnRefSecondId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_compound_pk_ref"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundPkCB.HpSpecification specifyWhiteCompoundPk() {
            assertRelation("whiteCompoundPk");
            if (_whiteCompoundPk == null) {
                _whiteCompoundPk = new WhiteCompoundPkCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundPkCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundPk(); }
                    public WhiteCompoundPkCQ qy() { return _qyCall.qy().queryWhiteCompoundPk(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundPk.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundPk(); }
                        public WhiteCompoundPkCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundPk(); }
                    });
                }
            }
            return _whiteCompoundPk;
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteCompoundPkRefCB> columnQuery(final SpecifyQuery<WhiteCompoundPkRefCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteCompoundPkRefCB>(new HpColQyHandler<WhiteCompoundPkRefCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteCompoundPkRefCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteCompoundPkRefCB xcreateColumnQueryCB() {
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
        cb.xsetupForColumnQuery((WhiteCompoundPkRefCB)this);
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
    public WhiteCompoundPkRefCB dreamCruiseCB() {
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
        cb.xsetupForDreamCruise((WhiteCompoundPkRefCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteCompoundPkRefCB> orQuery) {
        xorSQ((WhiteCompoundPkRefCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *             public void query(WhiteCompoundPkRefCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteCompoundPkRefCB> andQuery) {
        xorSQAP((WhiteCompoundPkRefCB)this, andQuery);
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
        final WhiteCompoundPkRefCB cb;
        if (mainCB != null) {
            cb = (WhiteCompoundPkRefCB)mainCB;
        } else {
            cb = new WhiteCompoundPkRefCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkRefCQ>() {
            public boolean has() { return true; }
            public WhiteCompoundPkRefCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteCompoundPkRefCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
