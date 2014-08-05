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
 * The abstract condition-query of white_stiletto_alias_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteStilettoAliasRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteStilettoAliasRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_stiletto_alias_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefId_Equal(Integer refId) {
        doSetRefId_Equal(refId);
    }

    protected void doSetRefId_Equal(Integer refId) {
        regRefId(CK_EQ, refId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefId_GreaterThan(Integer refId) {
        regRefId(CK_GT, refId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefId_LessThan(Integer refId) {
        regRefId(CK_LT, refId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefId_GreaterEqual(Integer refId) {
        regRefId(CK_GE, refId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefId_LessEqual(Integer refId) {
        regRefId(CK_LE, refId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of refId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefId(), "REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refIdList The collection of refId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefId_InScope(Collection<Integer> refIdList) {
        doSetRefId_InScope(refIdList);
    }

    protected void doSetRefId_InScope(Collection<Integer> refIdList) {
        regINS(CK_INS, cTL(refIdList), getCValueRefId(), "REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refIdList The collection of refId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefId_NotInScope(Collection<Integer> refIdList) {
        doSetRefId_NotInScope(refIdList);
    }

    protected void doSetRefId_NotInScope(Collection<Integer> refIdList) {
        regINS(CK_NINS, cTL(refIdList), getCValueRefId(), "REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     */
    public void setRefId_IsNull() { regRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     */
    public void setRefId_IsNotNull() { regRefId(CK_ISNN, DOBJ); }

    protected void regRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefId(), "REF_ID"); }
    protected abstract ConditionValue getCValueRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO0: {VARCHAR(200)}
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
     * FOO0: {VARCHAR(200)}
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
     * FOO0: {VARCHAR(200)}
     * @param foo0List The collection of foo0 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_InScope(Collection<String> foo0List) {
        doSetFoo0_InScope(foo0List);
    }

    public void doSetFoo0_InScope(Collection<String> foo0List) {
        regINS(CK_INS, cTL(foo0List), getCValueFoo0(), "FOO0");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO0: {VARCHAR(200)}
     * @param foo0List The collection of foo0 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_NotInScope(Collection<String> foo0List) {
        doSetFoo0_NotInScope(foo0List);
    }

    public void doSetFoo0_NotInScope(Collection<String> foo0List) {
        regINS(CK_NINS, cTL(foo0List), getCValueFoo0(), "FOO0");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO0: {VARCHAR(200)}
     * @param foo0 The value of foo0 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo0_PrefixSearch(String foo0) {
        setFoo0_LikeSearch(foo0, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO0: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo0_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo0 The value of foo0 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo0_LikeSearch(String foo0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo0), getCValueFoo0(), "FOO0", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO0: {VARCHAR(200)}
     * @param foo0 The value of foo0 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo0_NotLikeSearch(String foo0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo0), getCValueFoo0(), "FOO0", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO0: {VARCHAR(200)}
     */
    public void setFoo0_IsNull() { regFoo0(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO0: {VARCHAR(200)}
     */
    public void setFoo0_IsNullOrEmpty() { regFoo0(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO0: {VARCHAR(200)}
     */
    public void setFoo0_IsNotNull() { regFoo0(CK_ISNN, DOBJ); }

    protected void regFoo0(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo0(), "FOO0"); }
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
     * FOO3: {VARCHAR(200)}
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
     * FOO3: {VARCHAR(200)}
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
     * FOO3: {VARCHAR(200)}
     * @param foo3List The collection of foo3 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_InScope(Collection<String> foo3List) {
        doSetFoo3_InScope(foo3List);
    }

    public void doSetFoo3_InScope(Collection<String> foo3List) {
        regINS(CK_INS, cTL(foo3List), getCValueFoo3(), "FOO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO3: {VARCHAR(200)}
     * @param foo3List The collection of foo3 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_NotInScope(Collection<String> foo3List) {
        doSetFoo3_NotInScope(foo3List);
    }

    public void doSetFoo3_NotInScope(Collection<String> foo3List) {
        regINS(CK_NINS, cTL(foo3List), getCValueFoo3(), "FOO3");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO3: {VARCHAR(200)}
     * @param foo3 The value of foo3 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo3_PrefixSearch(String foo3) {
        setFoo3_LikeSearch(foo3, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO3: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo3_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo3 The value of foo3 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo3_LikeSearch(String foo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo3), getCValueFoo3(), "FOO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO3: {VARCHAR(200)}
     * @param foo3 The value of foo3 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo3_NotLikeSearch(String foo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo3), getCValueFoo3(), "FOO3", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO3: {VARCHAR(200)}
     */
    public void setFoo3_IsNull() { regFoo3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO3: {VARCHAR(200)}
     */
    public void setFoo3_IsNullOrEmpty() { regFoo3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO3: {VARCHAR(200)}
     */
    public void setFoo3_IsNotNull() { regFoo3(CK_ISNN, DOBJ); }

    protected void regFoo3(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo3(), "FOO3"); }
    protected abstract ConditionValue getCValueFoo3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_4: {VARCHAR(200)}
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
     * FOO_4: {VARCHAR(200)}
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
     * FOO_4: {VARCHAR(200)}
     * @param foo4List The collection of foo4 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_InScope(Collection<String> foo4List) {
        doSetFoo4_InScope(foo4List);
    }

    public void doSetFoo4_InScope(Collection<String> foo4List) {
        regINS(CK_INS, cTL(foo4List), getCValueFoo4(), "FOO_4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_4: {VARCHAR(200)}
     * @param foo4List The collection of foo4 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_NotInScope(Collection<String> foo4List) {
        doSetFoo4_NotInScope(foo4List);
    }

    public void doSetFoo4_NotInScope(Collection<String> foo4List) {
        regINS(CK_NINS, cTL(foo4List), getCValueFoo4(), "FOO_4");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_4: {VARCHAR(200)}
     * @param foo4 The value of foo4 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFoo4_PrefixSearch(String foo4) {
        setFoo4_LikeSearch(foo4, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_4: {VARCHAR(200)} <br />
     * <pre>e.g. setFoo4_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foo4 The value of foo4 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoo4_LikeSearch(String foo4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foo4), getCValueFoo4(), "FOO_4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_4: {VARCHAR(200)}
     * @param foo4 The value of foo4 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoo4_NotLikeSearch(String foo4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foo4), getCValueFoo4(), "FOO_4", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO_4: {VARCHAR(200)}
     */
    public void setFoo4_IsNull() { regFoo4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FOO_4: {VARCHAR(200)}
     */
    public void setFoo4_IsNullOrEmpty() { regFoo4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO_4: {VARCHAR(200)}
     */
    public void setFoo4_IsNotNull() { regFoo4(CK_ISNN, DOBJ); }

    protected void regFoo4(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFoo4(), "FOO_4"); }
    protected abstract ConditionValue getCValueFoo4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     * @param bar0 The value of bar0 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar0_Equal(String bar0) {
        doSetBar0_Equal(fRES(bar0));
    }

    protected void doSetBar0_Equal(String bar0) {
        regBar0(CK_EQ, bar0);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     * @param bar0 The value of bar0 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar0_NotEqual(String bar0) {
        doSetBar0_NotEqual(fRES(bar0));
    }

    protected void doSetBar0_NotEqual(String bar0) {
        regBar0(CK_NES, bar0);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     * @param bar0List The collection of bar0 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar0_InScope(Collection<String> bar0List) {
        doSetBar0_InScope(bar0List);
    }

    public void doSetBar0_InScope(Collection<String> bar0List) {
        regINS(CK_INS, cTL(bar0List), getCValueBar0(), "BAR_0");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     * @param bar0List The collection of bar0 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar0_NotInScope(Collection<String> bar0List) {
        doSetBar0_NotInScope(bar0List);
    }

    public void doSetBar0_NotInScope(Collection<String> bar0List) {
        regINS(CK_NINS, cTL(bar0List), getCValueBar0(), "BAR_0");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     * @param bar0 The value of bar0 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBar0_PrefixSearch(String bar0) {
        setBar0_LikeSearch(bar0, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR_0: {VARCHAR(200)} <br />
     * <pre>e.g. setBar0_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bar0 The value of bar0 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBar0_LikeSearch(String bar0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bar0), getCValueBar0(), "BAR_0", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     * @param bar0 The value of bar0 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBar0_NotLikeSearch(String bar0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bar0), getCValueBar0(), "BAR_0", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     */
    public void setBar0_IsNull() { regBar0(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     */
    public void setBar0_IsNullOrEmpty() { regBar0(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BAR_0: {VARCHAR(200)}
     */
    public void setBar0_IsNotNull() { regBar0(CK_ISNN, DOBJ); }

    protected void regBar0(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBar0(), "BAR_0"); }
    protected abstract ConditionValue getCValueBar0();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     * @param qux0 The value of qux0 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux0_Equal(String qux0) {
        doSetQux0_Equal(fRES(qux0));
    }

    protected void doSetQux0_Equal(String qux0) {
        regQux0(CK_EQ, qux0);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     * @param qux0 The value of qux0 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux0_NotEqual(String qux0) {
        doSetQux0_NotEqual(fRES(qux0));
    }

    protected void doSetQux0_NotEqual(String qux0) {
        regQux0(CK_NES, qux0);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     * @param qux0List The collection of qux0 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux0_InScope(Collection<String> qux0List) {
        doSetQux0_InScope(qux0List);
    }

    public void doSetQux0_InScope(Collection<String> qux0List) {
        regINS(CK_INS, cTL(qux0List), getCValueQux0(), "QUX_0");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     * @param qux0List The collection of qux0 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux0_NotInScope(Collection<String> qux0List) {
        doSetQux0_NotInScope(qux0List);
    }

    public void doSetQux0_NotInScope(Collection<String> qux0List) {
        regINS(CK_NINS, cTL(qux0List), getCValueQux0(), "QUX_0");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     * @param qux0 The value of qux0 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setQux0_PrefixSearch(String qux0) {
        setQux0_LikeSearch(qux0, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX_0: {VARCHAR(200)} <br />
     * <pre>e.g. setQux0_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qux0 The value of qux0 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQux0_LikeSearch(String qux0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qux0), getCValueQux0(), "QUX_0", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     * @param qux0 The value of qux0 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQux0_NotLikeSearch(String qux0, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qux0), getCValueQux0(), "QUX_0", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     */
    public void setQux0_IsNull() { regQux0(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     */
    public void setQux0_IsNullOrEmpty() { regQux0(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * QUX_0: {VARCHAR(200)}
     */
    public void setQux0_IsNotNull() { regQux0(CK_ISNN, DOBJ); }

    protected void regQux0(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueQux0(), "QUX_0"); }
    protected abstract ConditionValue getCValueQux0();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * c21: {VARCHAR(200)}
     * @param c21 The value of c21 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setC21_Equal(String c21) {
        doSetC21_Equal(fRES(c21));
    }

    protected void doSetC21_Equal(String c21) {
        regC21(CK_EQ, c21);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * c21: {VARCHAR(200)}
     * @param c21 The value of c21 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setC21_NotEqual(String c21) {
        doSetC21_NotEqual(fRES(c21));
    }

    protected void doSetC21_NotEqual(String c21) {
        regC21(CK_NES, c21);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * c21: {VARCHAR(200)}
     * @param c21List The collection of c21 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setC21_InScope(Collection<String> c21List) {
        doSetC21_InScope(c21List);
    }

    public void doSetC21_InScope(Collection<String> c21List) {
        regINS(CK_INS, cTL(c21List), getCValueC21(), "c21");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * c21: {VARCHAR(200)}
     * @param c21List The collection of c21 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setC21_NotInScope(Collection<String> c21List) {
        doSetC21_NotInScope(c21List);
    }

    public void doSetC21_NotInScope(Collection<String> c21List) {
        regINS(CK_NINS, cTL(c21List), getCValueC21(), "c21");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c21: {VARCHAR(200)}
     * @param c21 The value of c21 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setC21_PrefixSearch(String c21) {
        setC21_LikeSearch(c21, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c21: {VARCHAR(200)} <br />
     * <pre>e.g. setC21_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param c21 The value of c21 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setC21_LikeSearch(String c21, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(c21), getCValueC21(), "c21", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c21: {VARCHAR(200)}
     * @param c21 The value of c21 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setC21_NotLikeSearch(String c21, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(c21), getCValueC21(), "c21", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * c21: {VARCHAR(200)}
     */
    public void setC21_IsNull() { regC21(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * c21: {VARCHAR(200)}
     */
    public void setC21_IsNullOrEmpty() { regC21(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * c21: {VARCHAR(200)}
     */
    public void setC21_IsNotNull() { regC21(CK_ISNN, DOBJ); }

    protected void regC21(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueC21(), "c21"); }
    protected abstract ConditionValue getCValueC21();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * c22: {VARCHAR(200)}
     * @param c22 The value of c22 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setC22_Equal(String c22) {
        doSetC22_Equal(fRES(c22));
    }

    protected void doSetC22_Equal(String c22) {
        regC22(CK_EQ, c22);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * c22: {VARCHAR(200)}
     * @param c22 The value of c22 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setC22_NotEqual(String c22) {
        doSetC22_NotEqual(fRES(c22));
    }

    protected void doSetC22_NotEqual(String c22) {
        regC22(CK_NES, c22);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * c22: {VARCHAR(200)}
     * @param c22List The collection of c22 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setC22_InScope(Collection<String> c22List) {
        doSetC22_InScope(c22List);
    }

    public void doSetC22_InScope(Collection<String> c22List) {
        regINS(CK_INS, cTL(c22List), getCValueC22(), "c22");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * c22: {VARCHAR(200)}
     * @param c22List The collection of c22 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setC22_NotInScope(Collection<String> c22List) {
        doSetC22_NotInScope(c22List);
    }

    public void doSetC22_NotInScope(Collection<String> c22List) {
        regINS(CK_NINS, cTL(c22List), getCValueC22(), "c22");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c22: {VARCHAR(200)}
     * @param c22 The value of c22 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setC22_PrefixSearch(String c22) {
        setC22_LikeSearch(c22, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c22: {VARCHAR(200)} <br />
     * <pre>e.g. setC22_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param c22 The value of c22 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setC22_LikeSearch(String c22, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(c22), getCValueC22(), "c22", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c22: {VARCHAR(200)}
     * @param c22 The value of c22 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setC22_NotLikeSearch(String c22, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(c22), getCValueC22(), "c22", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * c22: {VARCHAR(200)}
     */
    public void setC22_IsNull() { regC22(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * c22: {VARCHAR(200)}
     */
    public void setC22_IsNullOrEmpty() { regC22(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * c22: {VARCHAR(200)}
     */
    public void setC22_IsNotNull() { regC22(CK_ISNN, DOBJ); }

    protected void regC22(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueC22(), "c22"); }
    protected abstract ConditionValue getCValueC22();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * c23: {VARCHAR(200)}
     * @param c23 The value of c23 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setC23_Equal(String c23) {
        doSetC23_Equal(fRES(c23));
    }

    protected void doSetC23_Equal(String c23) {
        regC23(CK_EQ, c23);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * c23: {VARCHAR(200)}
     * @param c23 The value of c23 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setC23_NotEqual(String c23) {
        doSetC23_NotEqual(fRES(c23));
    }

    protected void doSetC23_NotEqual(String c23) {
        regC23(CK_NES, c23);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * c23: {VARCHAR(200)}
     * @param c23List The collection of c23 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setC23_InScope(Collection<String> c23List) {
        doSetC23_InScope(c23List);
    }

    public void doSetC23_InScope(Collection<String> c23List) {
        regINS(CK_INS, cTL(c23List), getCValueC23(), "c23");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * c23: {VARCHAR(200)}
     * @param c23List The collection of c23 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setC23_NotInScope(Collection<String> c23List) {
        doSetC23_NotInScope(c23List);
    }

    public void doSetC23_NotInScope(Collection<String> c23List) {
        regINS(CK_NINS, cTL(c23List), getCValueC23(), "c23");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c23: {VARCHAR(200)}
     * @param c23 The value of c23 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setC23_PrefixSearch(String c23) {
        setC23_LikeSearch(c23, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c23: {VARCHAR(200)} <br />
     * <pre>e.g. setC23_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param c23 The value of c23 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setC23_LikeSearch(String c23, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(c23), getCValueC23(), "c23", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * c23: {VARCHAR(200)}
     * @param c23 The value of c23 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setC23_NotLikeSearch(String c23, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(c23), getCValueC23(), "c23", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * c23: {VARCHAR(200)}
     */
    public void setC23_IsNull() { regC23(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * c23: {VARCHAR(200)}
     */
    public void setC23_IsNullOrEmpty() { regC23(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * c23: {VARCHAR(200)}
     */
    public void setC23_IsNotNull() { regC23(CK_ISNN, DOBJ); }

    protected void regC23(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueC23(), "c23"); }
    protected abstract ConditionValue getCValueC23();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
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
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @param stilettoAliasId The value of stilettoAliasId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_GreaterThan(Integer stilettoAliasId) {
        regStilettoAliasId(CK_GT, stilettoAliasId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @param stilettoAliasId The value of stilettoAliasId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_LessThan(Integer stilettoAliasId) {
        regStilettoAliasId(CK_LT, stilettoAliasId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @param stilettoAliasId The value of stilettoAliasId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_GreaterEqual(Integer stilettoAliasId) {
        regStilettoAliasId(CK_GE, stilettoAliasId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @param stilettoAliasId The value of stilettoAliasId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setStilettoAliasId_LessEqual(Integer stilettoAliasId) {
        regStilettoAliasId(CK_LE, stilettoAliasId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @param minNumber The min number of stilettoAliasId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stilettoAliasId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStilettoAliasId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStilettoAliasId(), "STILETTO_ALIAS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
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
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @param stilettoAliasIdList The collection of stilettoAliasId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStilettoAliasId_NotInScope(Collection<Integer> stilettoAliasIdList) {
        doSetStilettoAliasId_NotInScope(stilettoAliasIdList);
    }

    protected void doSetStilettoAliasId_NotInScope(Collection<Integer> stilettoAliasIdList) {
        regINS(CK_NINS, cTL(stilettoAliasIdList), getCValueStilettoAliasId(), "STILETTO_ALIAS_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STILETTO_ALIAS_ID from white_stiletto_alias where ...)} <br />
     * white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @param subQuery The sub-query of WhiteStilettoAlias for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteStilettoAlias(SubQuery<WhiteStilettoAliasCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_InScopeRelation_WhiteStilettoAlias(cb.query());
        registerInScopeRelation(cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAlias");
    }
    public abstract String keepStilettoAliasId_InScopeRelation_WhiteStilettoAlias(WhiteStilettoAliasCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STILETTO_ALIAS_ID from white_stiletto_alias where ...)} <br />
     * white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @param subQuery The sub-query of WhiteStilettoAlias for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteStilettoAlias(SubQuery<WhiteStilettoAliasCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAlias(cb.query());
        registerNotInScopeRelation(cb.query(), "STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", pp, "whiteStilettoAlias");
    }
    public abstract String keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAlias(WhiteStilettoAliasCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     */
    public void setStilettoAliasId_IsNull() { regStilettoAliasId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     */
    public void setStilettoAliasId_IsNotNull() { regStilettoAliasId(CK_ISNN, DOBJ); }

    protected void regStilettoAliasId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStilettoAliasId(), "STILETTO_ALIAS_ID"); }
    protected abstract ConditionValue getCValueStilettoAliasId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteStilettoAliasRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteStilettoAliasRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteStilettoAliasRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteStilettoAliasRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteStilettoAliasRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void query(WhiteStilettoAliasRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteStilettoAliasRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteStilettoAliasRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteStilettoAliasRefCQ sq);

    protected WhiteStilettoAliasRefCB xcreateScalarConditionCB() {
        WhiteStilettoAliasRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteStilettoAliasRefCB xcreateScalarConditionPartitionByCB() {
        WhiteStilettoAliasRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteStilettoAliasRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteStilettoAliasRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteStilettoAliasRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteStilettoAliasRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteStilettoAliasRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteStilettoAliasRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteStilettoAliasRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteStilettoAliasRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteStilettoAliasRefCQ sq);

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
    protected WhiteStilettoAliasRefCB newMyCB() {
        return new WhiteStilettoAliasRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteStilettoAliasRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
