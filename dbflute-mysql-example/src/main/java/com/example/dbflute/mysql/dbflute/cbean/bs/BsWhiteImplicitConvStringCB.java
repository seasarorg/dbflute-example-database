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
 * The base condition-bean of white_implicit_conv_string.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvStringCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvStringCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvStringCB() {
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
        return "white_implicit_conv_string";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(String implicitConvStringId) {
        assertObjectNotNull("implicitConvStringId", implicitConvStringId);
        BsWhiteImplicitConvStringCB cb = this;
        cb.query().setImplicitConvStringId_Equal(implicitConvStringId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ImplicitConvStringId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ImplicitConvStringId_Desc();
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
    public WhiteImplicitConvStringCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteImplicitConvStringCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteImplicitConvStringCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteImplicitConvStringCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteImplicitConvStringCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteImplicitConvStringCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteImplicitConvStringCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteImplicitConvStringCB> unionQuery) {
        final WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteImplicitConvStringCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteImplicitConvStringCB> unionQuery) {
        final WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteImplicitConvStringCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteImplicitConvIntegerNss _nssWhiteImplicitConvInteger;
    public WhiteImplicitConvIntegerNss getNssWhiteImplicitConvInteger() {
        if (_nssWhiteImplicitConvInteger == null) { _nssWhiteImplicitConvInteger = new WhiteImplicitConvIntegerNss(null); }
        return _nssWhiteImplicitConvInteger;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteImplicitConvInteger()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteImplicitConvString whiteImplicitConvString = whiteImplicitConvStringBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteImplicitConvString.<span style="color: #DD4747">getWhiteImplicitConvInteger()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteImplicitConvIntegerNss setupSelect_WhiteImplicitConvInteger() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnImplicitConvIntegerId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteImplicitConvInteger(); } });
        if (_nssWhiteImplicitConvInteger == null || !_nssWhiteImplicitConvInteger.hasConditionQuery())
        { _nssWhiteImplicitConvInteger = new WhiteImplicitConvIntegerNss(query().queryWhiteImplicitConvInteger()); }
        return _nssWhiteImplicitConvInteger;
    }
    protected WhiteImplicitConvNumericNss _nssWhiteImplicitConvNumeric;
    public WhiteImplicitConvNumericNss getNssWhiteImplicitConvNumeric() {
        if (_nssWhiteImplicitConvNumeric == null) { _nssWhiteImplicitConvNumeric = new WhiteImplicitConvNumericNss(null); }
        return _nssWhiteImplicitConvNumeric;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.<span style="color: #DD4747">setupSelect_WhiteImplicitConvNumeric()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteImplicitConvString whiteImplicitConvString = whiteImplicitConvStringBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteImplicitConvString.<span style="color: #DD4747">getWhiteImplicitConvNumeric()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteImplicitConvNumericNss setupSelect_WhiteImplicitConvNumeric() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnImplicitConvNumericId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteImplicitConvNumeric(); } });
        if (_nssWhiteImplicitConvNumeric == null || !_nssWhiteImplicitConvNumeric.hasConditionQuery())
        { _nssWhiteImplicitConvNumeric = new WhiteImplicitConvNumericNss(query().queryWhiteImplicitConvNumeric()); }
        return _nssWhiteImplicitConvNumeric;
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
            , new HpSpQyCall<WhiteImplicitConvStringCQ>() {
                public boolean has() { return true; }
                public WhiteImplicitConvStringCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteImplicitConvStringCQ> {
        protected WhiteImplicitConvIntegerCB.HpSpecification _whiteImplicitConvInteger;
        protected WhiteImplicitConvNumericCB.HpSpecification _whiteImplicitConvNumeric;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteImplicitConvStringCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvStringId() { return doColumn("IMPLICIT_CONV_STRING_ID"); }
        /**
         * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvIntegerId() { return doColumn("IMPLICIT_CONV_INTEGER_ID"); }
        /**
         * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvNumericId() { return doColumn("IMPLICIT_CONV_NUMERIC_ID"); }
        /**
         * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnImplicitConvName() { return doColumn("IMPLICIT_CONV_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnImplicitConvStringId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteImplicitConvInteger()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteImplicitConvIntegerCQ) {
                columnImplicitConvIntegerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteImplicitConvNumeric()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteImplicitConvNumericCQ) {
                columnImplicitConvNumericId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_implicit_conv_string"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitConvIntegerCB.HpSpecification specifyWhiteImplicitConvInteger() {
            assertRelation("whiteImplicitConvInteger");
            if (_whiteImplicitConvInteger == null) {
                _whiteImplicitConvInteger = new WhiteImplicitConvIntegerCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitConvIntegerCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitConvInteger(); }
                    public WhiteImplicitConvIntegerCQ qy() { return _qyCall.qy().queryWhiteImplicitConvInteger(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitConvInteger.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitConvIntegerCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitConvInteger(); }
                        public WhiteImplicitConvIntegerCQ qy() { return xsyncQyCall().qy().queryWhiteImplicitConvInteger(); }
                    });
                }
            }
            return _whiteImplicitConvInteger;
        }
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
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_implicit_conv_integer where ...) as FOO_MAX} <br />
         * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedWhiteImplicitConvIntegerList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
         *     public void query(WhiteImplicitConvIntegerCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteImplicitConvInteger.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitConvIntegerCB, WhiteImplicitConvStringCQ> derivedWhiteImplicitConvIntegerList() {
            assertDerived("whiteImplicitConvIntegerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitConvIntegerCB, WhiteImplicitConvStringCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitConvIntegerCB, WhiteImplicitConvStringCQ>() {
                public void setup(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, WhiteImplicitConvStringCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteImplicitConvIntegerList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_implicit_conv_numeric where ...) as FOO_MAX} <br />
         * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
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
        public HpSDRFunction<WhiteImplicitConvNumericCB, WhiteImplicitConvStringCQ> derivedWhiteImplicitConvNumericList() {
            assertDerived("whiteImplicitConvNumericList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitConvNumericCB, WhiteImplicitConvStringCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitConvNumericCB, WhiteImplicitConvStringCQ>() {
                public void setup(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, WhiteImplicitConvStringCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteImplicitConvNumericList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitConvStringCB, WhiteImplicitConvStringCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitConvStringCB, WhiteImplicitConvStringCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitConvStringCB, WhiteImplicitConvStringCQ>() {
                public void setup(String fn, SubQuery<WhiteImplicitConvStringCB> sq, WhiteImplicitConvStringCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteImplicitConvStringCB> columnQuery(final SpecifyQuery<WhiteImplicitConvStringCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteImplicitConvStringCB>(new HpColQyHandler<WhiteImplicitConvStringCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteImplicitConvStringCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteImplicitConvStringCB xcreateColumnQueryCB() {
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
        cb.xsetupForColumnQuery((WhiteImplicitConvStringCB)this);
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
    public WhiteImplicitConvStringCB dreamCruiseCB() {
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
        cb.xsetupForDreamCruise((WhiteImplicitConvStringCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteImplicitConvStringCB> orQuery) {
        xorSQ((WhiteImplicitConvStringCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *             public void query(WhiteImplicitConvStringCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteImplicitConvStringCB> andQuery) {
        xorSQAP((WhiteImplicitConvStringCB)this, andQuery);
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
        final WhiteImplicitConvStringCB cb;
        if (mainCB != null) {
            cb = (WhiteImplicitConvStringCB)mainCB;
        } else {
            cb = new WhiteImplicitConvStringCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteImplicitConvStringCQ>() {
            public boolean has() { return true; }
            public WhiteImplicitConvStringCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteImplicitConvStringCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteImplicitConvStringCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
