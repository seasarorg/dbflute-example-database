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
 * The base condition-bean of white_implicit_conv_integer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvIntegerCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvIntegerCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvIntegerCB() {
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
        return "white_implicit_conv_integer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param implicitConvIntegerId : PK, NotNull, INT(10). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteImplicitConvIntegerCB acceptPK(Integer implicitConvIntegerId) {
        assertObjectNotNull("implicitConvIntegerId", implicitConvIntegerId);
        BsWhiteImplicitConvIntegerCB cb = this;
        cb.query().setImplicitConvIntegerId_Equal(implicitConvIntegerId);
        return (WhiteImplicitConvIntegerCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param implicitConvIntegerId : PK, NotNull, INT(10). (NotNull)
     */
    public void acceptPrimaryKey(Integer implicitConvIntegerId) {
        assertObjectNotNull("implicitConvIntegerId", implicitConvIntegerId);
        BsWhiteImplicitConvIntegerCB cb = this;
        cb.query().setImplicitConvIntegerId_Equal(implicitConvIntegerId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ImplicitConvIntegerId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ImplicitConvIntegerId_Desc();
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
    public WhiteImplicitConvIntegerCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteImplicitConvIntegerCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteImplicitConvIntegerCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteImplicitConvIntegerCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteImplicitConvIntegerCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteImplicitConvIntegerCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteImplicitConvIntegerCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteImplicitConvIntegerCB> unionQuery) {
        final WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteImplicitConvIntegerCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteImplicitConvIntegerCB> unionQuery) {
        final WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteImplicitConvIntegerCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteImplicitConvNumericNss _nssWhiteImplicitConvNumeric;
    public WhiteImplicitConvNumericNss getNssWhiteImplicitConvNumeric() {
        if (_nssWhiteImplicitConvNumeric == null) { _nssWhiteImplicitConvNumeric = new WhiteImplicitConvNumericNss(null); }
        return _nssWhiteImplicitConvNumeric;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteImplicitConvNumeric()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteImplicitConvInteger whiteImplicitConvInteger = whiteImplicitConvIntegerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteImplicitConvInteger.<span style="color: #DD4747">getWhiteImplicitConvNumeric()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteImplicitConvNumericNss setupSelect_WhiteImplicitConvNumeric() {
        assertSetupSelectPurpose("whiteImplicitConvNumeric");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnImplicitConvNumericId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteImplicitConvNumeric(); } });
        if (_nssWhiteImplicitConvNumeric == null || !_nssWhiteImplicitConvNumeric.hasConditionQuery())
        { _nssWhiteImplicitConvNumeric = new WhiteImplicitConvNumericNss(query().queryWhiteImplicitConvNumeric()); }
        return _nssWhiteImplicitConvNumeric;
    }

    protected WhiteImplicitConvStringNss _nssWhiteImplicitConvString;
    public WhiteImplicitConvStringNss getNssWhiteImplicitConvString() {
        if (_nssWhiteImplicitConvString == null) { _nssWhiteImplicitConvString = new WhiteImplicitConvStringNss(null); }
        return _nssWhiteImplicitConvString;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteImplicitConvString()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteImplicitConvInteger whiteImplicitConvInteger = whiteImplicitConvIntegerBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteImplicitConvInteger.<span style="color: #DD4747">getWhiteImplicitConvString()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteImplicitConvStringNss setupSelect_WhiteImplicitConvString() {
        assertSetupSelectPurpose("whiteImplicitConvString");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnImplicitConvStringId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteImplicitConvString(); } });
        if (_nssWhiteImplicitConvString == null || !_nssWhiteImplicitConvString.hasConditionQuery())
        { _nssWhiteImplicitConvString = new WhiteImplicitConvStringNss(query().queryWhiteImplicitConvString()); }
        return _nssWhiteImplicitConvString;
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
            , new HpSpQyCall<WhiteImplicitConvIntegerCQ>() {
                public boolean has() { return true; }
                public WhiteImplicitConvIntegerCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteImplicitConvIntegerCQ> {
        protected WhiteImplicitConvNumericCB.HpSpecification _whiteImplicitConvNumeric;
        protected WhiteImplicitConvStringCB.HpSpecification _whiteImplicitConvString;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteImplicitConvIntegerCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvIntegerId() { return doColumn("IMPLICIT_CONV_INTEGER_ID"); }
        /**
         * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvNumericId() { return doColumn("IMPLICIT_CONV_NUMERIC_ID"); }
        /**
         * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvStringId() { return doColumn("IMPLICIT_CONV_STRING_ID"); }
        /**
         * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvName() { return doColumn("IMPLICIT_CONV_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnImplicitConvIntegerId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteImplicitConvNumeric()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteImplicitConvNumericCQ) {
                columnImplicitConvNumericId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteImplicitConvString()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteImplicitConvStringCQ) {
                columnImplicitConvStringId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_implicit_conv_integer"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitConvNumericCB.HpSpecification specifyWhiteImplicitConvNumeric() {
            assertRelation("whiteImplicitConvNumeric");
            if (_whiteImplicitConvNumeric == null) {
                _whiteImplicitConvNumeric = new WhiteImplicitConvNumericCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitConvNumericCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitConvNumeric(); }
                    public WhiteImplicitConvNumericCQ qy() { return _qyCall.qy().queryWhiteImplicitConvNumeric(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitConvNumeric.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitConvNumericCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitConvNumeric(); }
                        public WhiteImplicitConvNumericCQ qy() { return xsyncQyCall().qy().queryWhiteImplicitConvNumeric(); }
                    });
                }
            }
            return _whiteImplicitConvNumeric;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitConvStringCB.HpSpecification specifyWhiteImplicitConvString() {
            assertRelation("whiteImplicitConvString");
            if (_whiteImplicitConvString == null) {
                _whiteImplicitConvString = new WhiteImplicitConvStringCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitConvStringCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitConvString(); }
                    public WhiteImplicitConvStringCQ qy() { return _qyCall.qy().queryWhiteImplicitConvString(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitConvString.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitConvStringCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitConvString(); }
                        public WhiteImplicitConvStringCQ qy() { return xsyncQyCall().qy().queryWhiteImplicitConvString(); }
                    });
                }
            }
            return _whiteImplicitConvString;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_implicit_conv_numeric where ...) as FOO_MAX} <br />
         * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedWhiteImplicitConvNumericList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
         *     public void query(WhiteImplicitConvNumericCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteImplicitConvNumeric.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitConvNumericCB, WhiteImplicitConvIntegerCQ> derivedWhiteImplicitConvNumericList() {
            assertDerived("whiteImplicitConvNumericList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitConvNumericCB, WhiteImplicitConvIntegerCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitConvNumericCB, WhiteImplicitConvIntegerCQ>() {
                public void setup(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, WhiteImplicitConvIntegerCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteImplicitConvNumericList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_implicit_conv_string where ...) as FOO_MAX} <br />
         * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedWhiteImplicitConvStringList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
         *     public void query(WhiteImplicitConvStringCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteImplicitConvString.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitConvStringCB, WhiteImplicitConvIntegerCQ> derivedWhiteImplicitConvStringList() {
            assertDerived("whiteImplicitConvStringList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitConvStringCB, WhiteImplicitConvIntegerCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitConvStringCB, WhiteImplicitConvIntegerCQ>() {
                public void setup(String fn, SubQuery<WhiteImplicitConvStringCB> sq, WhiteImplicitConvIntegerCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteImplicitConvStringList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitConvIntegerCB, WhiteImplicitConvIntegerCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitConvIntegerCB, WhiteImplicitConvIntegerCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitConvIntegerCB, WhiteImplicitConvIntegerCQ>() {
                public void setup(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, WhiteImplicitConvIntegerCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteImplicitConvIntegerCB> columnQuery(final SpecifyQuery<WhiteImplicitConvIntegerCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteImplicitConvIntegerCB>(new HpColQyHandler<WhiteImplicitConvIntegerCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteImplicitConvIntegerCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteImplicitConvIntegerCB xcreateColumnQueryCB() {
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
        cb.xsetupForColumnQuery((WhiteImplicitConvIntegerCB)this);
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
    public WhiteImplicitConvIntegerCB dreamCruiseCB() {
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
        cb.xsetupForDreamCruise((WhiteImplicitConvIntegerCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteImplicitConvIntegerCB> orQuery) {
        xorSQ((WhiteImplicitConvIntegerCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *             public void query(WhiteImplicitConvIntegerCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteImplicitConvIntegerCB> andQuery) {
        xorSQAP((WhiteImplicitConvIntegerCB)this, andQuery);
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
        final WhiteImplicitConvIntegerCB cb;
        if (mainCB != null) {
            cb = (WhiteImplicitConvIntegerCB)mainCB;
        } else {
            cb = new WhiteImplicitConvIntegerCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteImplicitConvIntegerCQ>() {
            public boolean has() { return true; }
            public WhiteImplicitConvIntegerCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteImplicitConvIntegerCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteImplicitConvIntegerCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
