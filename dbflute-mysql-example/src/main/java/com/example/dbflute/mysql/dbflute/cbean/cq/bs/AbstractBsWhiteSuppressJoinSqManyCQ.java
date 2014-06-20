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
 * The abstract condition-query of white_suppress_join_sq_many.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqManyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqManyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_many";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as equal. (NullAllowed: if null, no condition)
     */
    public void setManyId_Equal(Integer manyId) {
        doSetManyId_Equal(manyId);
    }

    protected void doSetManyId_Equal(Integer manyId) {
        regManyId(CK_EQ, manyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setManyId_GreaterThan(Integer manyId) {
        regManyId(CK_GT, manyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setManyId_LessThan(Integer manyId) {
        regManyId(CK_LT, manyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setManyId_GreaterEqual(Integer manyId) {
        regManyId(CK_GE, manyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setManyId_LessEqual(Integer manyId) {
        regManyId(CK_LE, manyId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of manyId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueManyId(), "MANY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyIdList The collection of manyId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyId_InScope(Collection<Integer> manyIdList) {
        doSetManyId_InScope(manyIdList);
    }

    protected void doSetManyId_InScope(Collection<Integer> manyIdList) {
        regINS(CK_INS, cTL(manyIdList), getCValueManyId(), "MANY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyIdList The collection of manyId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyId_NotInScope(Collection<Integer> manyIdList) {
        doSetManyId_NotInScope(manyIdList);
    }

    protected void doSetManyId_NotInScope(Collection<Integer> manyIdList) {
        regINS(CK_NINS, cTL(manyIdList), getCValueManyId(), "MANY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     */
    public void setManyId_IsNull() { regManyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     */
    public void setManyId_IsNotNull() { regManyId(CK_ISNN, DOBJ); }

    protected void regManyId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyId(), "MANY_ID"); }
    protected abstract ConditionValue getCValueManyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyName_Equal(String manyName) {
        doSetManyName_Equal(fRES(manyName));
    }

    protected void doSetManyName_Equal(String manyName) {
        regManyName(CK_EQ, manyName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyName_NotEqual(String manyName) {
        doSetManyName_NotEqual(fRES(manyName));
    }

    protected void doSetManyName_NotEqual(String manyName) {
        regManyName(CK_NES, manyName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyNameList The collection of manyName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyName_InScope(Collection<String> manyNameList) {
        doSetManyName_InScope(manyNameList);
    }

    public void doSetManyName_InScope(Collection<String> manyNameList) {
        regINS(CK_INS, cTL(manyNameList), getCValueManyName(), "MANY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyNameList The collection of manyName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyName_NotInScope(Collection<String> manyNameList) {
        doSetManyName_NotInScope(manyNameList);
    }

    public void doSetManyName_NotInScope(Collection<String> manyNameList) {
        regINS(CK_NINS, cTL(manyNameList), getCValueManyName(), "MANY_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyName_PrefixSearch(String manyName) {
        setManyName_LikeSearch(manyName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setManyName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manyName The value of manyName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManyName_LikeSearch(String manyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manyName), getCValueManyName(), "MANY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManyName_NotLikeSearch(String manyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manyName), getCValueManyName(), "MANY_NAME", likeSearchOption);
    }

    protected void regManyName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyName(), "MANY_NAME"); }
    protected abstract ConditionValue getCValueManyName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
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
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_GreaterThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GT, suppressJoinSqId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_LessThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LT, suppressJoinSqId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_GreaterEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GE, suppressJoinSqId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_LessEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LE, suppressJoinSqId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param minNumber The min number of suppressJoinSqId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of suppressJoinSqId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSuppressJoinSqId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
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
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_NotInScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_NINS, cTL(suppressJoinSqIdList), getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SUPPRESS_JOIN_SQ_ID from white_suppress_join_sq where ...)} <br />
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @param subQuery The sub-query of WhiteSuppressJoinSq for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSuppressJoinSq(SubQuery<WhiteSuppressJoinSqCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq(cb.query());
        registerInScopeRelation(cb.query(), "SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", pp, "whiteSuppressJoinSq");
    }
    public abstract String keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq(WhiteSuppressJoinSqCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SUPPRESS_JOIN_SQ_ID from white_suppress_join_sq where ...)} <br />
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @param subQuery The sub-query of WhiteSuppressJoinSq for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSuppressJoinSq(SubQuery<WhiteSuppressJoinSqCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq(cb.query());
        registerNotInScopeRelation(cb.query(), "SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", pp, "whiteSuppressJoinSq");
    }
    public abstract String keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq(WhiteSuppressJoinSqCQ sq);

    protected void regSuppressJoinSqId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID"); }
    protected abstract ConditionValue getCValueSuppressJoinSqId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as equal. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_Equal(Integer manyOneId) {
        doSetManyOneId_Equal(manyOneId);
    }

    protected void doSetManyOneId_Equal(Integer manyOneId) {
        regManyOneId(CK_EQ, manyOneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_GreaterThan(Integer manyOneId) {
        regManyOneId(CK_GT, manyOneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_LessThan(Integer manyOneId) {
        regManyOneId(CK_LT, manyOneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_GreaterEqual(Integer manyOneId) {
        regManyOneId(CK_GE, manyOneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_LessEqual(Integer manyOneId) {
        regManyOneId(CK_LE, manyOneId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param minNumber The min number of manyOneId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of manyOneId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueManyOneId(), "MANY_ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneIdList The collection of manyOneId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneId_InScope(Collection<Integer> manyOneIdList) {
        doSetManyOneId_InScope(manyOneIdList);
    }

    protected void doSetManyOneId_InScope(Collection<Integer> manyOneIdList) {
        regINS(CK_INS, cTL(manyOneIdList), getCValueManyOneId(), "MANY_ONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneIdList The collection of manyOneId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneId_NotInScope(Collection<Integer> manyOneIdList) {
        doSetManyOneId_NotInScope(manyOneIdList);
    }

    protected void doSetManyOneId_NotInScope(Collection<Integer> manyOneIdList) {
        regINS(CK_NINS, cTL(manyOneIdList), getCValueManyOneId(), "MANY_ONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MANY_ONE_ID from white_suppress_join_sq_many_one where ...)} <br />
     * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyOne for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSuppressJoinSqManyOne(SubQuery<WhiteSuppressJoinSqManyOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyOne(cb.query());
        registerInScopeRelation(cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyOne");
    }
    public abstract String keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MANY_ONE_ID from white_suppress_join_sq_many_one where ...)} <br />
     * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSuppressJoinSqManyOne(SubQuery<WhiteSuppressJoinSqManyOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOne(cb.query());
        registerNotInScopeRelation(cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyOne");
    }
    public abstract String keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOneCQ sq);

    protected void regManyOneId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyOneId(), "MANY_ONE_ID"); }
    protected abstract ConditionValue getCValueManyOneId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSuppressJoinSqManyCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSuppressJoinSqManyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSuppressJoinSqManyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSuppressJoinSqManyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSuppressJoinSqManyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSuppressJoinSqManyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqManyCQ sq);

    protected WhiteSuppressJoinSqManyCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqManyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqManyCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqManyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqManyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MANY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqManyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqManyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MANY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqManyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqManyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqManyCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressJoinSqManyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSuppressJoinSqManyCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteSuppressJoinSqManyCB newMyCB() {
        return new WhiteSuppressJoinSqManyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSuppressJoinSqManyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
