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
 * The abstract condition-query of white_suppress_join_sq_many_one.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqManyOneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqManyOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_many_one";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
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
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneId The value of manyOneId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_GreaterThan(Integer manyOneId) {
        regManyOneId(CK_GT, manyOneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneId The value of manyOneId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_LessThan(Integer manyOneId) {
        regManyOneId(CK_LT, manyOneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneId The value of manyOneId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_GreaterEqual(Integer manyOneId) {
        regManyOneId(CK_GE, manyOneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneId The value of manyOneId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneId_LessEqual(Integer manyOneId) {
        regManyOneId(CK_LE, manyOneId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyOneId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of manyOneId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueManyOneId(), "MANY_ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
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
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneIdList The collection of manyOneId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneId_NotInScope(Collection<Integer> manyOneIdList) {
        doSetManyOneId_NotInScope(manyOneIdList);
    }

    protected void doSetManyOneId_NotInScope(Collection<Integer> manyOneIdList) {
        regINS(CK_NINS, cTL(manyOneIdList), getCValueManyOneId(), "MANY_ONE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MANY_ONE_ID from white_suppress_join_sq_many where ...)} <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSuppressJoinSqManyList</span>(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyList for 'exists'. (NotNull)
     */
    public void existsWhiteSuppressJoinSqManyList(SubQuery<WhiteSuppressJoinSqManyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList(cb.query());
        registerExistsReferrer(cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyList");
    }
    public abstract String keepManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MANY_ONE_ID from white_suppress_join_sq_many where ...)} <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSuppressJoinSqManyList</span>(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSuppressJoinSqManyList(SubQuery<WhiteSuppressJoinSqManyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList(cb.query());
        registerNotExistsReferrer(cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyList");
    }
    public abstract String keepManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MANY_ONE_ID from white_suppress_join_sq_many where ...)} <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyAsOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSuppressJoinSqManyList(SubQuery<WhiteSuppressJoinSqManyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyList(cb.query());
        registerInScopeRelation(cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyList");
    }
    public abstract String keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MANY_ONE_ID from white_suppress_join_sq_many where ...)} <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyAsOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSuppressJoinSqManyList(SubQuery<WhiteSuppressJoinSqManyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList(cb.query());
        registerNotInScopeRelation(cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyList");
    }
    public abstract String keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq);

    public void xsderiveWhiteSuppressJoinSqManyList(String fn, SubQuery<WhiteSuppressJoinSqManyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", pp, "whiteSuppressJoinSqManyList", al, op);
    }
    public abstract String keepManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_suppress_join_sq_many where ...)} <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteSuppressJoinSqManyList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqManyCB> derivedWhiteSuppressJoinSqManyList() {
        return xcreateQDRFunctionWhiteSuppressJoinSqManyList();
    }
    protected HpQDRFunction<WhiteSuppressJoinSqManyCB> xcreateQDRFunctionWhiteSuppressJoinSqManyList() {
        return new HpQDRFunction<WhiteSuppressJoinSqManyCB>(new HpQDRSetupper<WhiteSuppressJoinSqManyCB>() {
            public void setup(String fn, SubQuery<WhiteSuppressJoinSqManyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteSuppressJoinSqManyList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteSuppressJoinSqManyList(String fn, SubQuery<WhiteSuppressJoinSqManyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList(cb.query()); String prpp = keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MANY_ONE_ID", "MANY_ONE_ID", sqpp, "whiteSuppressJoinSqManyList", rd, vl, prpp, op);
    }
    public abstract String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq);
    public abstract String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setManyOneId_IsNull() { regManyOneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setManyOneId_IsNotNull() { regManyOneId(CK_ISNN, DOBJ); }

    protected void regManyOneId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyOneId(), "MANY_ONE_ID"); }
    protected abstract ConditionValue getCValueManyOneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneName The value of manyOneName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneName_Equal(String manyOneName) {
        doSetManyOneName_Equal(fRES(manyOneName));
    }

    protected void doSetManyOneName_Equal(String manyOneName) {
        regManyOneName(CK_EQ, manyOneName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneName The value of manyOneName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneName_NotEqual(String manyOneName) {
        doSetManyOneName_NotEqual(fRES(manyOneName));
    }

    protected void doSetManyOneName_NotEqual(String manyOneName) {
        regManyOneName(CK_NES, manyOneName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneNameList The collection of manyOneName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneName_InScope(Collection<String> manyOneNameList) {
        doSetManyOneName_InScope(manyOneNameList);
    }

    public void doSetManyOneName_InScope(Collection<String> manyOneNameList) {
        regINS(CK_INS, cTL(manyOneNameList), getCValueManyOneName(), "MANY_ONE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneNameList The collection of manyOneName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneName_NotInScope(Collection<String> manyOneNameList) {
        doSetManyOneName_NotInScope(manyOneNameList);
    }

    public void doSetManyOneName_NotInScope(Collection<String> manyOneNameList) {
        regINS(CK_NINS, cTL(manyOneNameList), getCValueManyOneName(), "MANY_ONE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneName The value of manyOneName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneName_PrefixSearch(String manyOneName) {
        setManyOneName_LikeSearch(manyOneName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setManyOneName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manyOneName The value of manyOneName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManyOneName_LikeSearch(String manyOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manyOneName), getCValueManyOneName(), "MANY_ONE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneName The value of manyOneName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManyOneName_NotLikeSearch(String manyOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manyOneName), getCValueManyOneName(), "MANY_ONE_NAME", likeSearchOption);
    }

    protected void regManyOneName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyOneName(), "MANY_ONE_NAME"); }
    protected abstract ConditionValue getCValueManyOneName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneId The value of manyOneOneId as equal. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_Equal(Integer manyOneOneId) {
        doSetManyOneOneId_Equal(manyOneOneId);
    }

    protected void doSetManyOneOneId_Equal(Integer manyOneOneId) {
        regManyOneOneId(CK_EQ, manyOneOneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneId The value of manyOneOneId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_GreaterThan(Integer manyOneOneId) {
        regManyOneOneId(CK_GT, manyOneOneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneId The value of manyOneOneId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_LessThan(Integer manyOneOneId) {
        regManyOneOneId(CK_LT, manyOneOneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneId The value of manyOneOneId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_GreaterEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_GE, manyOneOneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneId The value of manyOneOneId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_LessEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_LE, manyOneOneId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param minNumber The min number of manyOneOneId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of manyOneOneId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyOneOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueManyOneOneId(), "MANY_ONE_ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneIdList The collection of manyOneOneId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneId_InScope(Collection<Integer> manyOneOneIdList) {
        doSetManyOneOneId_InScope(manyOneOneIdList);
    }

    protected void doSetManyOneOneId_InScope(Collection<Integer> manyOneOneIdList) {
        regINS(CK_INS, cTL(manyOneOneIdList), getCValueManyOneOneId(), "MANY_ONE_ONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @param manyOneOneIdList The collection of manyOneOneId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneId_NotInScope(Collection<Integer> manyOneOneIdList) {
        doSetManyOneOneId_NotInScope(manyOneOneIdList);
    }

    protected void doSetManyOneOneId_NotInScope(Collection<Integer> manyOneOneIdList) {
        regINS(CK_NINS, cTL(manyOneOneIdList), getCValueManyOneOneId(), "MANY_ONE_ONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MANY_ONE_ONE_ID from white_suppress_join_sq_many_one_one where ...)} <br />
     * white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyOneOne for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSuppressJoinSqManyOneOne(SubQuery<WhiteSuppressJoinSqManyOneOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneOneId_InScopeRelation_WhiteSuppressJoinSqManyOneOne(cb.query());
        registerInScopeRelation(cb.query(), "MANY_ONE_ONE_ID", "MANY_ONE_ONE_ID", pp, "whiteSuppressJoinSqManyOneOne");
    }
    public abstract String keepManyOneOneId_InScopeRelation_WhiteSuppressJoinSqManyOneOne(WhiteSuppressJoinSqManyOneOneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MANY_ONE_ONE_ID from white_suppress_join_sq_many_one_one where ...)} <br />
     * white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @param subQuery The sub-query of WhiteSuppressJoinSqManyOneOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSuppressJoinSqManyOneOne(SubQuery<WhiteSuppressJoinSqManyOneOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepManyOneOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOneOne(cb.query());
        registerNotInScopeRelation(cb.query(), "MANY_ONE_ONE_ID", "MANY_ONE_ONE_ID", pp, "whiteSuppressJoinSqManyOneOne");
    }
    public abstract String keepManyOneOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOneOne(WhiteSuppressJoinSqManyOneOneCQ sq);

    protected void regManyOneOneId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyOneOneId(), "MANY_ONE_ONE_ID"); }
    protected abstract ConditionValue getCValueManyOneOneId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteSuppressJoinSqManyOneCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteSuppressJoinSqManyOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteSuppressJoinSqManyOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteSuppressJoinSqManyOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteSuppressJoinSqManyOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteSuppressJoinSqManyOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqManyOneCQ sq);

    protected WhiteSuppressJoinSqManyOneCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqManyOneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqManyOneCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqManyOneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqManyOneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MANY_ONE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqManyOneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqManyOneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MANY_ONE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqManyOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqManyOneCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressJoinSqManyOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSuppressJoinSqManyOneCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteSuppressJoinSqManyOneCB newMyCB() {
        return new WhiteSuppressJoinSqManyOneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSuppressJoinSqManyOneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
