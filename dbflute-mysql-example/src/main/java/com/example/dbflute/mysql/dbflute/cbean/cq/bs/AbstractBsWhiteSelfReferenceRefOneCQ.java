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
 * The abstract condition-query of white_self_reference_ref_one.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSelfReferenceRefOneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSelfReferenceRefOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_self_reference_ref_one";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceId The value of selfReferenceId as equal. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_Equal(Long selfReferenceId) {
        doSetSelfReferenceId_Equal(selfReferenceId);
    }

    protected void doSetSelfReferenceId_Equal(Long selfReferenceId) {
        regSelfReferenceId(CK_EQ, selfReferenceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceId The value of selfReferenceId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_GreaterThan(Long selfReferenceId) {
        regSelfReferenceId(CK_GT, selfReferenceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceId The value of selfReferenceId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_LessThan(Long selfReferenceId) {
        regSelfReferenceId(CK_LT, selfReferenceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceId The value of selfReferenceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_GreaterEqual(Long selfReferenceId) {
        regSelfReferenceId(CK_GE, selfReferenceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceId The value of selfReferenceId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_LessEqual(Long selfReferenceId) {
        regSelfReferenceId(CK_LE, selfReferenceId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param minNumber The min number of selfReferenceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of selfReferenceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSelfReferenceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSelfReferenceId(), "SELF_REFERENCE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceIdList The collection of selfReferenceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceId_InScope(Collection<Long> selfReferenceIdList) {
        doSetSelfReferenceId_InScope(selfReferenceIdList);
    }

    protected void doSetSelfReferenceId_InScope(Collection<Long> selfReferenceIdList) {
        regINS(CK_INS, cTL(selfReferenceIdList), getCValueSelfReferenceId(), "SELF_REFERENCE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @param selfReferenceIdList The collection of selfReferenceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceId_NotInScope(Collection<Long> selfReferenceIdList) {
        doSetSelfReferenceId_NotInScope(selfReferenceIdList);
    }

    protected void doSetSelfReferenceId_NotInScope(Collection<Long> selfReferenceIdList) {
        regINS(CK_NINS, cTL(selfReferenceIdList), getCValueSelfReferenceId(), "SELF_REFERENCE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PARENT_ID from white_self_reference where ...)} <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSelfReferenceByParentIdList</span>(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSelfReferenceByParentIdList for 'exists'. (NotNull)
     */
    public void existsWhiteSelfReferenceByParentIdList(SubQuery<WhiteSelfReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdList(cb.query());
        registerExistsReferrer(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceByParentIdList");
    }
    public abstract String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PARENT_ID from white_self_reference where ...)} <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSelfReferenceByParentIdList</span>(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SelfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSelfReferenceByParentIdList(SubQuery<WhiteSelfReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceByParentIdList");
    }
    public abstract String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SELF_REFERENCE_ID from white_self_reference where ...)} <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @param subQuery The sub-query of WhiteSelfReference for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSelfReference(SubQuery<WhiteSelfReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_InScopeRelation_WhiteSelfReference(cb.query());
        registerInScopeRelation(cb.query(), "SELF_REFERENCE_ID", "SELF_REFERENCE_ID", pp, "whiteSelfReference");
    }
    public abstract String keepSelfReferenceId_InScopeRelation_WhiteSelfReference(WhiteSelfReferenceCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_ID from white_self_reference where ...)} <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteSelfReferenceByParentIdList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSelfReferenceByParentIdList(SubQuery<WhiteSelfReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList(cb.query());
        registerInScopeRelation(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceByParentIdList");
    }
    public abstract String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SELF_REFERENCE_ID from white_self_reference where ...)} <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @param subQuery The sub-query of WhiteSelfReference for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSelfReference(SubQuery<WhiteSelfReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_NotInScopeRelation_WhiteSelfReference(cb.query());
        registerNotInScopeRelation(cb.query(), "SELF_REFERENCE_ID", "SELF_REFERENCE_ID", pp, "whiteSelfReference");
    }
    public abstract String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReference(WhiteSelfReferenceCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_ID from white_self_reference where ...)} <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteSelfReferenceByParentIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSelfReferenceByParentIdList(SubQuery<WhiteSelfReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceByParentIdList");
    }
    public abstract String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq);

    public void xsderiveWhiteSelfReferenceByParentIdList(String fn, SubQuery<WhiteSelfReferenceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceByParentIdList", al, op);
    }
    public abstract String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_self_reference where ...)} <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteSelfReferenceByParentIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSelfReferenceCB> derivedWhiteSelfReferenceByParentIdList() {
        return xcreateQDRFunctionWhiteSelfReferenceByParentIdList();
    }
    protected HpQDRFunction<WhiteSelfReferenceCB> xcreateQDRFunctionWhiteSelfReferenceByParentIdList() {
        return new HpQDRFunction<WhiteSelfReferenceCB>(new HpQDRSetupper<WhiteSelfReferenceCB>() {
            public void setup(String fn, SubQuery<WhiteSelfReferenceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteSelfReferenceByParentIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteSelfReferenceByParentIdList(String fn, SubQuery<WhiteSelfReferenceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdList(cb.query()); String prpp = keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", sqpp, "whiteSelfReferenceByParentIdList", rd, vl, prpp, op);
    }
    public abstract String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq);
    public abstract String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     */
    public void setSelfReferenceId_IsNull() { regSelfReferenceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     */
    public void setSelfReferenceId_IsNotNull() { regSelfReferenceId(CK_ISNN, DOBJ); }

    protected void regSelfReferenceId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSelfReferenceId(), "SELF_REFERENCE_ID"); }
    protected abstract ConditionValue getCValueSelfReferenceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceRefOneName The value of selfReferenceRefOneName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceRefOneName_Equal(String selfReferenceRefOneName) {
        doSetSelfReferenceRefOneName_Equal(fRES(selfReferenceRefOneName));
    }

    protected void doSetSelfReferenceRefOneName_Equal(String selfReferenceRefOneName) {
        regSelfReferenceRefOneName(CK_EQ, selfReferenceRefOneName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceRefOneName The value of selfReferenceRefOneName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceRefOneName_NotEqual(String selfReferenceRefOneName) {
        doSetSelfReferenceRefOneName_NotEqual(fRES(selfReferenceRefOneName));
    }

    protected void doSetSelfReferenceRefOneName_NotEqual(String selfReferenceRefOneName) {
        regSelfReferenceRefOneName(CK_NES, selfReferenceRefOneName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceRefOneNameList The collection of selfReferenceRefOneName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceRefOneName_InScope(Collection<String> selfReferenceRefOneNameList) {
        doSetSelfReferenceRefOneName_InScope(selfReferenceRefOneNameList);
    }

    public void doSetSelfReferenceRefOneName_InScope(Collection<String> selfReferenceRefOneNameList) {
        regINS(CK_INS, cTL(selfReferenceRefOneNameList), getCValueSelfReferenceRefOneName(), "SELF_REFERENCE_REF_ONE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceRefOneNameList The collection of selfReferenceRefOneName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceRefOneName_NotInScope(Collection<String> selfReferenceRefOneNameList) {
        doSetSelfReferenceRefOneName_NotInScope(selfReferenceRefOneNameList);
    }

    public void doSetSelfReferenceRefOneName_NotInScope(Collection<String> selfReferenceRefOneNameList) {
        regINS(CK_NINS, cTL(selfReferenceRefOneNameList), getCValueSelfReferenceRefOneName(), "SELF_REFERENCE_REF_ONE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceRefOneName The value of selfReferenceRefOneName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceRefOneName_PrefixSearch(String selfReferenceRefOneName) {
        setSelfReferenceRefOneName_LikeSearch(selfReferenceRefOneName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setSelfReferenceRefOneName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selfReferenceRefOneName The value of selfReferenceRefOneName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSelfReferenceRefOneName_LikeSearch(String selfReferenceRefOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selfReferenceRefOneName), getCValueSelfReferenceRefOneName(), "SELF_REFERENCE_REF_ONE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceRefOneName The value of selfReferenceRefOneName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSelfReferenceRefOneName_NotLikeSearch(String selfReferenceRefOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selfReferenceRefOneName), getCValueSelfReferenceRefOneName(), "SELF_REFERENCE_REF_ONE_NAME", likeSearchOption);
    }

    protected void regSelfReferenceRefOneName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSelfReferenceRefOneName(), "SELF_REFERENCE_REF_ONE_NAME"); }
    protected abstract ConditionValue getCValueSelfReferenceRefOneName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void query(WhiteSelfReferenceRefOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceRefOneCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteSelfReferenceRefOneCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void query(WhiteSelfReferenceRefOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceRefOneCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteSelfReferenceRefOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void query(WhiteSelfReferenceRefOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceRefOneCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteSelfReferenceRefOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void query(WhiteSelfReferenceRefOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceRefOneCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteSelfReferenceRefOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void query(WhiteSelfReferenceRefOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceRefOneCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteSelfReferenceRefOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void query(WhiteSelfReferenceRefOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceRefOneCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteSelfReferenceRefOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceRefOneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSelfReferenceRefOneCQ sq);

    protected WhiteSelfReferenceRefOneCB xcreateScalarConditionCB() {
        WhiteSelfReferenceRefOneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSelfReferenceRefOneCB xcreateScalarConditionPartitionByCB() {
        WhiteSelfReferenceRefOneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSelfReferenceRefOneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "SELF_REFERENCE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSelfReferenceRefOneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSelfReferenceRefOneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSelfReferenceRefOneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SELF_REFERENCE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSelfReferenceRefOneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSelfReferenceRefOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSelfReferenceRefOneCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSelfReferenceRefOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSelfReferenceRefOneCQ sq);

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
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteSelfReferenceRefOneCB newMyCB() {
        return new WhiteSelfReferenceRefOneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSelfReferenceRefOneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
