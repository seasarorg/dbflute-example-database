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
 * The abstract condition-query of white_suppress_join_sq.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqId The value of suppressJoinSqId as equal. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_Equal(Integer suppressJoinSqId) {
        doSetSuppressJoinSqId_Equal(suppressJoinSqId);
    }

    protected void doSetSuppressJoinSqId_Equal(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_EQ, suppressJoinSqId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_GreaterThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GT, suppressJoinSqId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_LessThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LT, suppressJoinSqId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_GreaterEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GE, suppressJoinSqId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_LessEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LE, suppressJoinSqId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of suppressJoinSqId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of suppressJoinSqId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSuppressJoinSqId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqId_InScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_InScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_InScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_INS, cTL(suppressJoinSqIdList), getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_NotInScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_NINS, cTL(suppressJoinSqIdList), getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select SUPPRESS_JOIN_SQ_ID from white_suppress_join_sq_one where ...)} <br />
     * white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSuppressJoinSqOneAsOne</span>(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSuppressJoinSqOneAsOne for 'exists'. (NotNull)
     */
    public void existsWhiteSuppressJoinSqOneAsOne(SubQuery<WhiteSuppressJoinSqOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSuppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne(cb.query());
        registerExistsReferrer(cb.query(), "SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", pp, "whiteSuppressJoinSqOneAsOne");
    }
    public abstract String keepSuppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select SUPPRESS_JOIN_SQ_ID from white_suppress_join_sq_one where ...)} <br />
     * white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSuppressJoinSqOneAsOne</span>(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSuppressJoinSqOneAsOne(SubQuery<WhiteSuppressJoinSqOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", pp, "whiteSuppressJoinSqOneAsOne");
    }
    public abstract String keepSuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SUPPRESS_JOIN_SQ_ID from white_suppress_join_sq_one where ...)} <br />
     * white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqOneAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSuppressJoinSqOneAsOne(SubQuery<WhiteSuppressJoinSqOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne(cb.query());
        registerInScopeRelation(cb.query(), "SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", pp, "whiteSuppressJoinSqOneAsOne");
    }
    public abstract String keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SUPPRESS_JOIN_SQ_ID from white_suppress_join_sq_one where ...)} <br />
     * white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqOneAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSuppressJoinSqOneAsOne(SubQuery<WhiteSuppressJoinSqOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne(cb.query());
        registerNotInScopeRelation(cb.query(), "SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", pp, "whiteSuppressJoinSqOneAsOne");
    }
    public abstract String keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     */
    public void setSuppressJoinSqId_IsNull() { regSuppressJoinSqId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     */
    public void setSuppressJoinSqId_IsNotNull() { regSuppressJoinSqId(CK_ISNN, DOBJ); }

    protected void regSuppressJoinSqId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID"); }
    protected abstract ConditionValue getCValueSuppressJoinSqId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @param suppressJoinSqName The value of suppressJoinSqName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqName_Equal(String suppressJoinSqName) {
        doSetSuppressJoinSqName_Equal(fRES(suppressJoinSqName));
    }

    protected void doSetSuppressJoinSqName_Equal(String suppressJoinSqName) {
        regSuppressJoinSqName(CK_EQ, suppressJoinSqName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @param suppressJoinSqName The value of suppressJoinSqName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqName_NotEqual(String suppressJoinSqName) {
        doSetSuppressJoinSqName_NotEqual(fRES(suppressJoinSqName));
    }

    protected void doSetSuppressJoinSqName_NotEqual(String suppressJoinSqName) {
        regSuppressJoinSqName(CK_NES, suppressJoinSqName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @param suppressJoinSqNameList The collection of suppressJoinSqName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqName_InScope(Collection<String> suppressJoinSqNameList) {
        doSetSuppressJoinSqName_InScope(suppressJoinSqNameList);
    }

    public void doSetSuppressJoinSqName_InScope(Collection<String> suppressJoinSqNameList) {
        regINS(CK_INS, cTL(suppressJoinSqNameList), getCValueSuppressJoinSqName(), "SUPPRESS_JOIN_SQ_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @param suppressJoinSqNameList The collection of suppressJoinSqName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqName_NotInScope(Collection<String> suppressJoinSqNameList) {
        doSetSuppressJoinSqName_NotInScope(suppressJoinSqNameList);
    }

    public void doSetSuppressJoinSqName_NotInScope(Collection<String> suppressJoinSqNameList) {
        regINS(CK_NINS, cTL(suppressJoinSqNameList), getCValueSuppressJoinSqName(), "SUPPRESS_JOIN_SQ_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @param suppressJoinSqName The value of suppressJoinSqName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqName_PrefixSearch(String suppressJoinSqName) {
        setSuppressJoinSqName_LikeSearch(suppressJoinSqName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setSuppressJoinSqName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppressJoinSqName The value of suppressJoinSqName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppressJoinSqName_LikeSearch(String suppressJoinSqName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppressJoinSqName), getCValueSuppressJoinSqName(), "SUPPRESS_JOIN_SQ_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @param suppressJoinSqName The value of suppressJoinSqName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppressJoinSqName_NotLikeSearch(String suppressJoinSqName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppressJoinSqName), getCValueSuppressJoinSqName(), "SUPPRESS_JOIN_SQ_NAME", likeSearchOption);
    }

    protected void regSuppressJoinSqName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSuppressJoinSqName(), "SUPPRESS_JOIN_SQ_NAME"); }
    protected abstract ConditionValue getCValueSuppressJoinSqName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void query(WhiteSuppressJoinSqCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSuppressJoinSqCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void query(WhiteSuppressJoinSqCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSuppressJoinSqCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void query(WhiteSuppressJoinSqCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSuppressJoinSqCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void query(WhiteSuppressJoinSqCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSuppressJoinSqCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void query(WhiteSuppressJoinSqCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSuppressJoinSqCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void query(WhiteSuppressJoinSqCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSuppressJoinSqCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqCQ sq);

    protected WhiteSuppressJoinSqCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "SUPPRESS_JOIN_SQ_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SUPPRESS_JOIN_SQ_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressJoinSqCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSuppressJoinSqCQ sq);

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
    protected WhiteSuppressJoinSqCB newMyCB() {
        return new WhiteSuppressJoinSqCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSuppressJoinSqCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
