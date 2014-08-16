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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_only_one_to_one_from.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOnlyOneToOneFromCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOnlyOneToOneFromCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_only_one_to_one_from";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as equal. (NullAllowed: if null, no condition)
     */
    public void setFromId_Equal(Long fromId) {
        doSetFromId_Equal(fromId);
    }

    protected void doSetFromId_Equal(Long fromId) {
        regFromId(CK_EQ, fromId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFromId_GreaterThan(Long fromId) {
        regFromId(CK_GT, fromId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFromId_LessThan(Long fromId) {
        regFromId(CK_LT, fromId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFromId_GreaterEqual(Long fromId) {
        regFromId(CK_GE, fromId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFromId_LessEqual(Long fromId) {
        regFromId(CK_LE, fromId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of fromId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fromId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFromId(), "FROM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromIdList The collection of fromId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromId_InScope(Collection<Long> fromIdList) {
        doSetFromId_InScope(fromIdList);
    }

    protected void doSetFromId_InScope(Collection<Long> fromIdList) {
        regINS(CK_INS, cTL(fromIdList), getCValueFromId(), "FROM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromIdList The collection of fromId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromId_NotInScope(Collection<Long> fromIdList) {
        doSetFromId_NotInScope(fromIdList);
    }

    protected void doSetFromId_NotInScope(Collection<Long> fromIdList) {
        regINS(CK_NINS, cTL(fromIdList), getCValueFromId(), "FROM_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select FROM_ID from white_only_one_to_one_to where ...)} <br />
     * white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteOnlyOneToOneToAsOne</span>(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteOnlyOneToOneToAsOne for 'exists'. (NotNull)
     */
    public void existsWhiteOnlyOneToOneToAsOne(SubQuery<WhiteOnlyOneToOneToCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepFromId_ExistsReferrer_WhiteOnlyOneToOneToAsOne(cb.query());
        registerExistsReferrer(cb.query(), "FROM_ID", "FROM_ID", pp, "whiteOnlyOneToOneToAsOne");
    }
    public abstract String keepFromId_ExistsReferrer_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select FROM_ID from white_only_one_to_one_to where ...)} <br />
     * white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteOnlyOneToOneToAsOne</span>(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of FromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne for 'not exists'. (NotNull)
     */
    public void notExistsWhiteOnlyOneToOneToAsOne(SubQuery<WhiteOnlyOneToOneToCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepFromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "FROM_ID", "FROM_ID", pp, "whiteOnlyOneToOneToAsOne");
    }
    public abstract String keepFromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FROM_ID from white_only_one_to_one_to where ...)} <br />
     * white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @param subQuery The sub-query of WhiteOnlyOneToOneToAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteOnlyOneToOneToAsOne(SubQuery<WhiteOnlyOneToOneToCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepFromId_InScopeRelation_WhiteOnlyOneToOneToAsOne(cb.query());
        registerInScopeRelation(cb.query(), "FROM_ID", "FROM_ID", pp, "whiteOnlyOneToOneToAsOne");
    }
    public abstract String keepFromId_InScopeRelation_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FROM_ID from white_only_one_to_one_to where ...)} <br />
     * white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @param subQuery The sub-query of WhiteOnlyOneToOneToAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteOnlyOneToOneToAsOne(SubQuery<WhiteOnlyOneToOneToCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepFromId_NotInScopeRelation_WhiteOnlyOneToOneToAsOne(cb.query());
        registerNotInScopeRelation(cb.query(), "FROM_ID", "FROM_ID", pp, "whiteOnlyOneToOneToAsOne");
    }
    public abstract String keepFromId_NotInScopeRelation_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setFromId_IsNull() { regFromId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setFromId_IsNotNull() { regFromId(CK_ISNN, DOBJ); }

    protected void regFromId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFromId(), "FROM_ID"); }
    protected abstract ConditionValue getCValueFromId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromName_Equal(String fromName) {
        doSetFromName_Equal(fRES(fromName));
    }

    protected void doSetFromName_Equal(String fromName) {
        regFromName(CK_EQ, fromName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromName_NotEqual(String fromName) {
        doSetFromName_NotEqual(fRES(fromName));
    }

    protected void doSetFromName_NotEqual(String fromName) {
        regFromName(CK_NES, fromName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromNameList The collection of fromName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromName_InScope(Collection<String> fromNameList) {
        doSetFromName_InScope(fromNameList);
    }

    public void doSetFromName_InScope(Collection<String> fromNameList) {
        regINS(CK_INS, cTL(fromNameList), getCValueFromName(), "FROM_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromNameList The collection of fromName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromName_NotInScope(Collection<String> fromNameList) {
        doSetFromName_NotInScope(fromNameList);
    }

    public void doSetFromName_NotInScope(Collection<String> fromNameList) {
        regINS(CK_NINS, cTL(fromNameList), getCValueFromName(), "FROM_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromName_PrefixSearch(String fromName) {
        setFromName_LikeSearch(fromName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setFromName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromName The value of fromName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromName_LikeSearch(String fromName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromName), getCValueFromName(), "FROM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromName_NotLikeSearch(String fromName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromName), getCValueFromName(), "FROM_NAME", likeSearchOption);
    }

    protected void regFromName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFromName(), "FROM_NAME"); }
    protected abstract ConditionValue getCValueFromName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void query(WhiteOnlyOneToOneFromCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneFromCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteOnlyOneToOneFromCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void query(WhiteOnlyOneToOneFromCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneFromCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteOnlyOneToOneFromCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void query(WhiteOnlyOneToOneFromCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneFromCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteOnlyOneToOneFromCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void query(WhiteOnlyOneToOneFromCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneFromCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteOnlyOneToOneFromCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void query(WhiteOnlyOneToOneFromCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneFromCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteOnlyOneToOneFromCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void query(WhiteOnlyOneToOneFromCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneFromCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteOnlyOneToOneFromCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneFromCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteOnlyOneToOneFromCQ sq);

    protected WhiteOnlyOneToOneFromCB xcreateScalarConditionCB() {
        WhiteOnlyOneToOneFromCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOnlyOneToOneFromCB xcreateScalarConditionPartitionByCB() {
        WhiteOnlyOneToOneFromCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOnlyOneToOneFromCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "FROM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOnlyOneToOneFromCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOnlyOneToOneFromCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOnlyOneToOneFromCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FROM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOnlyOneToOneFromCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOnlyOneToOneFromCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOnlyOneToOneFromCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteOnlyOneToOneFromCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteOnlyOneToOneFromCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteOnlyOneToOneFromCB newMyCB() {
        return new WhiteOnlyOneToOneFromCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOnlyOneToOneFromCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
