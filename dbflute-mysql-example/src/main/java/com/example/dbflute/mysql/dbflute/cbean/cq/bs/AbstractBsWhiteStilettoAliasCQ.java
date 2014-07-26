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
 * The abstract condition-query of white_stiletto_alias.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteStilettoAliasCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteStilettoAliasCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_stiletto_alias";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasId The value of stilettoAliasId as equal. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_Equal(Integer stilettoAliasId) {
        doSetStilettoAliasId_Equal(stilettoAliasId);
    }

    protected void doSetStilettoAliasId_Equal(Integer stilettoAliasId) {
        regStilettoAliasId(CK_EQ, stilettoAliasId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasId The value of stilettoAliasId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_GreaterThan(Integer stilettoAliasId) {
        regStilettoAliasId(CK_GT, stilettoAliasId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasId The value of stilettoAliasId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_LessThan(Integer stilettoAliasId) {
        regStilettoAliasId(CK_LT, stilettoAliasId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasId The value of stilettoAliasId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_GreaterEqual(Integer stilettoAliasId) {
        regStilettoAliasId(CK_GE, stilettoAliasId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasId The value of stilettoAliasId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_LessEqual(Integer stilettoAliasId) {
        regStilettoAliasId(CK_LE, stilettoAliasId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of stilettoAliasId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stilettoAliasId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStilettoAliasId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStilettoAliasId(), "STILETTO_ALIAS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasIdList The collection of stilettoAliasId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStilettoAliasId_InScope(Collection<Integer> stilettoAliasIdList) {
        doSetStilettoAliasId_InScope(stilettoAliasIdList);
    }

    protected void doSetStilettoAliasId_InScope(Collection<Integer> stilettoAliasIdList) {
        regINS(CK_INS, cTL(stilettoAliasIdList), getCValueStilettoAliasId(), "STILETTO_ALIAS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @param stilettoAliasIdList The collection of stilettoAliasId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStilettoAliasId_NotInScope(Collection<Integer> stilettoAliasIdList) {
        doSetStilettoAliasId_NotInScope(stilettoAliasIdList);
    }

    protected void doSetStilettoAliasId_NotInScope(Collection<Integer> stilettoAliasIdList) {
        regINS(CK_NINS, cTL(stilettoAliasIdList), getCValueStilettoAliasId(), "STILETTO_ALIAS_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select STILETTO_ALIAS_ID from white_stiletto_alias_ref where ...)} <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteStilettoAliasRefList</span>(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteStilettoAliasRefList for 'exists'. (NotNull)
     */
    public void existsWhiteStilettoAliasRefList(SubQuery<WhiteStilettoAliasRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_ExistsReferrer_WhiteStilettoAliasRefList(cb.query());
        registerExistsReferrer(cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAliasRefList");
    }
    public abstract String keepStilettoAliasId_ExistsReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select STILETTO_ALIAS_ID from white_stiletto_alias_ref where ...)} <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteStilettoAliasRefList</span>(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteStilettoAliasRefList(SubQuery<WhiteStilettoAliasRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAliasRefList");
    }
    public abstract String keepStilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STILETTO_ALIAS_ID from white_stiletto_alias_ref where ...)} <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefAsOne'.
     * @param subQuery The sub-query of WhiteStilettoAliasRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteStilettoAliasRefList(SubQuery<WhiteStilettoAliasRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_InScopeRelation_WhiteStilettoAliasRefList(cb.query());
        registerInScopeRelation(cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAliasRefList");
    }
    public abstract String keepStilettoAliasId_InScopeRelation_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STILETTO_ALIAS_ID from white_stiletto_alias_ref where ...)} <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefAsOne'.
     * @param subQuery The sub-query of WhiteStilettoAliasRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteStilettoAliasRefList(SubQuery<WhiteStilettoAliasRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAliasRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAliasRefList");
    }
    public abstract String keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq);

    public void xsderiveWhiteStilettoAliasRefList(String fn, SubQuery<WhiteStilettoAliasRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_SpecifyDerivedReferrer_WhiteStilettoAliasRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAliasRefList", al, op);
    }
    public abstract String keepStilettoAliasId_SpecifyDerivedReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_stiletto_alias_ref where ...)} <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteStilettoAliasRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteStilettoAliasRefCB> derivedWhiteStilettoAliasRefList() {
        return xcreateQDRFunctionWhiteStilettoAliasRefList();
    }
    protected HpQDRFunction<WhiteStilettoAliasRefCB> xcreateQDRFunctionWhiteStilettoAliasRefList() {
        return new HpQDRFunction<WhiteStilettoAliasRefCB>(new HpQDRSetupper<WhiteStilettoAliasRefCB>() {
            public void setup(String fn, SubQuery<WhiteStilettoAliasRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteStilettoAliasRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteStilettoAliasRefList(String fn, SubQuery<WhiteStilettoAliasRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList(cb.query()); String prpp = keepStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", sqpp, "whiteStilettoAliasRefList", rd, vl, prpp, op);
    }
    public abstract String keepStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq);
    public abstract String keepStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     */
    public void setStilettoAliasId_IsNull() { regStilettoAliasId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     */
    public void setStilettoAliasId_IsNotNull() { regStilettoAliasId(CK_ISNN, DOBJ); }

    protected void regStilettoAliasId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStilettoAliasId(), "STILETTO_ALIAS_ID"); }
    protected abstract ConditionValue getCValueStilettoAliasId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO: {VARCHAR(200)}
     * @param foo The value of foo as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo_Equal(String foo) {
        doSetFoo_Equal(fRES(foo));
    }

    protected void doSetFoo_Equal(String foo) {
        regFoo(CK_EQ, foo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO: {VARCHAR(200)}
     * @param foo The value of foo as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo_NotEqual(String foo) {
        doSetFoo_NotEqual(fRES(foo));
    }

    protected void doSetFoo_NotEqual(String foo) {
        regFoo(CK_NES, foo);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO: {VARCHAR(200)}
     * @param fooList The collection of foo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo_InScope(Collection<String> fooList) {
        doSetFoo_InScope(fooList);
    }

    public void doSetFoo_InScope(Collection<String> fooList) {
        regINS(CK_INS, cTL(fooList), getCValueFoo(), "FOO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO: {VARCHAR(200)}
     * @param fooList The collection of foo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo_NotInScope(Collection<String> fooList) {
        doSetFoo_NotInScope(fooList);
    }

    public void doSetFoo_NotInScope(Collection<String> fooList) {
        regINS(CK_NINS, cTL(fooList), getCValueFoo(), "FOO");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO: {VARCHAR(200)}
     * @param foo The value of foo as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo_PrefixSearch(String foo) {
        setFoo_LikeSearch(foo, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo The value of foo as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo_LikeSearch(String foo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo), getCValueFoo(), "FOO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO: {VARCHAR(200)}
     * @param foo The value of foo as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo_NotLikeSearch(String foo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo), getCValueFoo(), "FOO", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO: {VARCHAR(200)}
     */
    public void setFoo_IsNull() { regFoo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO: {VARCHAR(200)}
     */
    public void setFoo_IsNullOrEmpty() { regFoo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO: {VARCHAR(200)}
     */
    public void setFoo_IsNotNull() { regFoo(CK_ISNN, DOBJ); }

    protected void regFoo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo(), "FOO"); }
    protected abstract ConditionValue getCValueFoo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     * @param foo0 The value of foo0 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_Equal(String foo0) {
        doSetFoo0_Equal(fRES(foo0));
    }

    protected void doSetFoo0_Equal(String foo0) {
        regFoo0(CK_EQ, foo0);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     * @param foo0 The value of foo0 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_NotEqual(String foo0) {
        doSetFoo0_NotEqual(fRES(foo0));
    }

    protected void doSetFoo0_NotEqual(String foo0) {
        regFoo0(CK_NES, foo0);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     * @param foo0List The collection of foo0 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_InScope(Collection<String> foo0List) {
        doSetFoo0_InScope(foo0List);
    }

    public void doSetFoo0_InScope(Collection<String> foo0List) {
        regINS(CK_INS, cTL(foo0List), getCValueFoo0(), "FOO_0");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     * @param foo0List The collection of foo0 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_NotInScope(Collection<String> foo0List) {
        doSetFoo0_NotInScope(foo0List);
    }

    public void doSetFoo0_NotInScope(Collection<String> foo0List) {
        regINS(CK_NINS, cTL(foo0List), getCValueFoo0(), "FOO_0");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     * @param foo0 The value of foo0 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_PrefixSearch(String foo0) {
        setFoo0_LikeSearch(foo0, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_0: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo0_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo0 The value of foo0 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo0_LikeSearch(String foo0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo0), getCValueFoo0(), "FOO_0", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     * @param foo0 The value of foo0 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo0_NotLikeSearch(String foo0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo0), getCValueFoo0(), "FOO_0", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     */
    public void setFoo0_IsNull() { regFoo0(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     */
    public void setFoo0_IsNullOrEmpty() { regFoo0(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO_0: {VARCHAR(200)}
     */
    public void setFoo0_IsNotNull() { regFoo0(CK_ISNN, DOBJ); }

    protected void regFoo0(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo0(), "FOO_0"); }
    protected abstract ConditionValue getCValueFoo0();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     * @param foo1 The value of foo1 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo1_Equal(String foo1) {
        doSetFoo1_Equal(fRES(foo1));
    }

    protected void doSetFoo1_Equal(String foo1) {
        regFoo1(CK_EQ, foo1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     * @param foo1 The value of foo1 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo1_NotEqual(String foo1) {
        doSetFoo1_NotEqual(fRES(foo1));
    }

    protected void doSetFoo1_NotEqual(String foo1) {
        regFoo1(CK_NES, foo1);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     * @param foo1List The collection of foo1 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo1_InScope(Collection<String> foo1List) {
        doSetFoo1_InScope(foo1List);
    }

    public void doSetFoo1_InScope(Collection<String> foo1List) {
        regINS(CK_INS, cTL(foo1List), getCValueFoo1(), "FOO_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     * @param foo1List The collection of foo1 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo1_NotInScope(Collection<String> foo1List) {
        doSetFoo1_NotInScope(foo1List);
    }

    public void doSetFoo1_NotInScope(Collection<String> foo1List) {
        regINS(CK_NINS, cTL(foo1List), getCValueFoo1(), "FOO_1");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     * @param foo1 The value of foo1 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo1_PrefixSearch(String foo1) {
        setFoo1_LikeSearch(foo1, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_1: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo1_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo1 The value of foo1 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo1_LikeSearch(String foo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo1), getCValueFoo1(), "FOO_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     * @param foo1 The value of foo1 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo1_NotLikeSearch(String foo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo1), getCValueFoo1(), "FOO_1", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     */
    public void setFoo1_IsNull() { regFoo1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     */
    public void setFoo1_IsNullOrEmpty() { regFoo1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO_1: {VARCHAR(200)}
     */
    public void setFoo1_IsNotNull() { regFoo1(CK_ISNN, DOBJ); }

    protected void regFoo1(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo1(), "FOO_1"); }
    protected abstract ConditionValue getCValueFoo1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO2: {VARCHAR(200)}
     * @param foo2 The value of foo2 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo2_Equal(String foo2) {
        doSetFoo2_Equal(fRES(foo2));
    }

    protected void doSetFoo2_Equal(String foo2) {
        regFoo2(CK_EQ, foo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO2: {VARCHAR(200)}
     * @param foo2 The value of foo2 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo2_NotEqual(String foo2) {
        doSetFoo2_NotEqual(fRES(foo2));
    }

    protected void doSetFoo2_NotEqual(String foo2) {
        regFoo2(CK_NES, foo2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO2: {VARCHAR(200)}
     * @param foo2List The collection of foo2 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo2_InScope(Collection<String> foo2List) {
        doSetFoo2_InScope(foo2List);
    }

    public void doSetFoo2_InScope(Collection<String> foo2List) {
        regINS(CK_INS, cTL(foo2List), getCValueFoo2(), "FOO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO2: {VARCHAR(200)}
     * @param foo2List The collection of foo2 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo2_NotInScope(Collection<String> foo2List) {
        doSetFoo2_NotInScope(foo2List);
    }

    public void doSetFoo2_NotInScope(Collection<String> foo2List) {
        regINS(CK_NINS, cTL(foo2List), getCValueFoo2(), "FOO2");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO2: {VARCHAR(200)}
     * @param foo2 The value of foo2 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo2_PrefixSearch(String foo2) {
        setFoo2_LikeSearch(foo2, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO2: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo2_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo2 The value of foo2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo2_LikeSearch(String foo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo2), getCValueFoo2(), "FOO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO2: {VARCHAR(200)}
     * @param foo2 The value of foo2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo2_NotLikeSearch(String foo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo2), getCValueFoo2(), "FOO2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO2: {VARCHAR(200)}
     */
    public void setFoo2_IsNull() { regFoo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO2: {VARCHAR(200)}
     */
    public void setFoo2_IsNullOrEmpty() { regFoo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO2: {VARCHAR(200)}
     */
    public void setFoo2_IsNotNull() { regFoo2(CK_ISNN, DOBJ); }

    protected void regFoo2(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo2(), "FOO2"); }
    protected abstract ConditionValue getCValueFoo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     * @param foo3 The value of foo3 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_Equal(String foo3) {
        doSetFoo3_Equal(fRES(foo3));
    }

    protected void doSetFoo3_Equal(String foo3) {
        regFoo3(CK_EQ, foo3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     * @param foo3 The value of foo3 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_NotEqual(String foo3) {
        doSetFoo3_NotEqual(fRES(foo3));
    }

    protected void doSetFoo3_NotEqual(String foo3) {
        regFoo3(CK_NES, foo3);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     * @param foo3List The collection of foo3 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_InScope(Collection<String> foo3List) {
        doSetFoo3_InScope(foo3List);
    }

    public void doSetFoo3_InScope(Collection<String> foo3List) {
        regINS(CK_INS, cTL(foo3List), getCValueFoo3(), "FOO_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     * @param foo3List The collection of foo3 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_NotInScope(Collection<String> foo3List) {
        doSetFoo3_NotInScope(foo3List);
    }

    public void doSetFoo3_NotInScope(Collection<String> foo3List) {
        regINS(CK_NINS, cTL(foo3List), getCValueFoo3(), "FOO_3");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     * @param foo3 The value of foo3 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_PrefixSearch(String foo3) {
        setFoo3_LikeSearch(foo3, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_3: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo3_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo3 The value of foo3 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo3_LikeSearch(String foo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo3), getCValueFoo3(), "FOO_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     * @param foo3 The value of foo3 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo3_NotLikeSearch(String foo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo3), getCValueFoo3(), "FOO_3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     */
    public void setFoo3_IsNull() { regFoo3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     */
    public void setFoo3_IsNullOrEmpty() { regFoo3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO_3: {VARCHAR(200)}
     */
    public void setFoo3_IsNotNull() { regFoo3(CK_ISNN, DOBJ); }

    protected void regFoo3(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo3(), "FOO_3"); }
    protected abstract ConditionValue getCValueFoo3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO4: {VARCHAR(200)}
     * @param foo4 The value of foo4 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_Equal(String foo4) {
        doSetFoo4_Equal(fRES(foo4));
    }

    protected void doSetFoo4_Equal(String foo4) {
        regFoo4(CK_EQ, foo4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO4: {VARCHAR(200)}
     * @param foo4 The value of foo4 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_NotEqual(String foo4) {
        doSetFoo4_NotEqual(fRES(foo4));
    }

    protected void doSetFoo4_NotEqual(String foo4) {
        regFoo4(CK_NES, foo4);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO4: {VARCHAR(200)}
     * @param foo4List The collection of foo4 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_InScope(Collection<String> foo4List) {
        doSetFoo4_InScope(foo4List);
    }

    public void doSetFoo4_InScope(Collection<String> foo4List) {
        regINS(CK_INS, cTL(foo4List), getCValueFoo4(), "FOO4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO4: {VARCHAR(200)}
     * @param foo4List The collection of foo4 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_NotInScope(Collection<String> foo4List) {
        doSetFoo4_NotInScope(foo4List);
    }

    public void doSetFoo4_NotInScope(Collection<String> foo4List) {
        regINS(CK_NINS, cTL(foo4List), getCValueFoo4(), "FOO4");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO4: {VARCHAR(200)}
     * @param foo4 The value of foo4 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_PrefixSearch(String foo4) {
        setFoo4_LikeSearch(foo4, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO4: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo4_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo4 The value of foo4 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo4_LikeSearch(String foo4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo4), getCValueFoo4(), "FOO4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO4: {VARCHAR(200)}
     * @param foo4 The value of foo4 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo4_NotLikeSearch(String foo4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo4), getCValueFoo4(), "FOO4", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO4: {VARCHAR(200)}
     */
    public void setFoo4_IsNull() { regFoo4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO4: {VARCHAR(200)}
     */
    public void setFoo4_IsNullOrEmpty() { regFoo4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO4: {VARCHAR(200)}
     */
    public void setFoo4_IsNotNull() { regFoo4(CK_ISNN, DOBJ); }

    protected void regFoo4(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo4(), "FOO4"); }
    protected abstract ConditionValue getCValueFoo4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BAR: {VARCHAR(200)}
     * @param bar The value of bar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar_Equal(String bar) {
        doSetBar_Equal(fRES(bar));
    }

    protected void doSetBar_Equal(String bar) {
        regBar(CK_EQ, bar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BAR: {VARCHAR(200)}
     * @param bar The value of bar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar_NotEqual(String bar) {
        doSetBar_NotEqual(fRES(bar));
    }

    protected void doSetBar_NotEqual(String bar) {
        regBar(CK_NES, bar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BAR: {VARCHAR(200)}
     * @param barList The collection of bar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar_InScope(Collection<String> barList) {
        doSetBar_InScope(barList);
    }

    public void doSetBar_InScope(Collection<String> barList) {
        regINS(CK_INS, cTL(barList), getCValueBar(), "BAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BAR: {VARCHAR(200)}
     * @param barList The collection of bar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar_NotInScope(Collection<String> barList) {
        doSetBar_NotInScope(barList);
    }

    public void doSetBar_NotInScope(Collection<String> barList) {
        regINS(CK_NINS, cTL(barList), getCValueBar(), "BAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR: {VARCHAR(200)}
     * @param bar The value of bar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar_PrefixSearch(String bar) {
        setBar_LikeSearch(bar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR: {VARCHAR(200)} <br />
     * <pre>e.g. setBar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bar The value of bar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBar_LikeSearch(String bar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bar), getCValueBar(), "BAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR: {VARCHAR(200)}
     * @param bar The value of bar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBar_NotLikeSearch(String bar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bar), getCValueBar(), "BAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BAR: {VARCHAR(200)}
     */
    public void setBar_IsNull() { regBar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * BAR: {VARCHAR(200)}
     */
    public void setBar_IsNullOrEmpty() { regBar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BAR: {VARCHAR(200)}
     */
    public void setBar_IsNotNull() { regBar(CK_ISNN, DOBJ); }

    protected void regBar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBar(), "BAR"); }
    protected abstract ConditionValue getCValueBar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX: {VARCHAR(200)}
     * @param qux The value of qux as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux_Equal(String qux) {
        doSetQux_Equal(fRES(qux));
    }

    protected void doSetQux_Equal(String qux) {
        regQux(CK_EQ, qux);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX: {VARCHAR(200)}
     * @param qux The value of qux as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux_NotEqual(String qux) {
        doSetQux_NotEqual(fRES(qux));
    }

    protected void doSetQux_NotEqual(String qux) {
        regQux(CK_NES, qux);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX: {VARCHAR(200)}
     * @param quxList The collection of qux as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux_InScope(Collection<String> quxList) {
        doSetQux_InScope(quxList);
    }

    public void doSetQux_InScope(Collection<String> quxList) {
        regINS(CK_INS, cTL(quxList), getCValueQux(), "QUX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX: {VARCHAR(200)}
     * @param quxList The collection of qux as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux_NotInScope(Collection<String> quxList) {
        doSetQux_NotInScope(quxList);
    }

    public void doSetQux_NotInScope(Collection<String> quxList) {
        regINS(CK_NINS, cTL(quxList), getCValueQux(), "QUX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX: {VARCHAR(200)}
     * @param qux The value of qux as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux_PrefixSearch(String qux) {
        setQux_LikeSearch(qux, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX: {VARCHAR(200)} <br />
     * <pre>e.g. setQux_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qux The value of qux as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQux_LikeSearch(String qux, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qux), getCValueQux(), "QUX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX: {VARCHAR(200)}
     * @param qux The value of qux as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQux_NotLikeSearch(String qux, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qux), getCValueQux(), "QUX", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * QUX: {VARCHAR(200)}
     */
    public void setQux_IsNull() { regQux(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * QUX: {VARCHAR(200)}
     */
    public void setQux_IsNullOrEmpty() { regQux(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * QUX: {VARCHAR(200)}
     */
    public void setQux_IsNotNull() { regQux(CK_ISNN, DOBJ); }

    protected void regQux(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueQux(), "QUX"); }
    protected abstract ConditionValue getCValueQux();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void query(WhiteStilettoAliasCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteStilettoAliasCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void query(WhiteStilettoAliasCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteStilettoAliasCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void query(WhiteStilettoAliasCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteStilettoAliasCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void query(WhiteStilettoAliasCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteStilettoAliasCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void query(WhiteStilettoAliasCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteStilettoAliasCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void query(WhiteStilettoAliasCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteStilettoAliasCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteStilettoAliasCQ sq);

    protected WhiteStilettoAliasCB xcreateScalarConditionCB() {
        WhiteStilettoAliasCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteStilettoAliasCB xcreateScalarConditionPartitionByCB() {
        WhiteStilettoAliasCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteStilettoAliasCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "STILETTO_ALIAS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteStilettoAliasCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteStilettoAliasCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteStilettoAliasCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STILETTO_ALIAS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteStilettoAliasCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteStilettoAliasCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteStilettoAliasCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteStilettoAliasCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteStilettoAliasCQ sq);

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
    protected WhiteStilettoAliasCB newMyCB() {
        return new WhiteStilettoAliasCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteStilettoAliasCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
