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
 * The abstract condition-query of white_split_multiple_fk_next.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkNextCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkNextCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
        return "white_split_multiple_fk_next";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as equal. (NullAllowed: if null, no condition)
     */
    public void setNextId_Equal(Long nextId) {
        doSetNextId_Equal(nextId);
    }

    protected void doSetNextId_Equal(Long nextId) {
        regNextId(CK_EQ, nextId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextId_GreaterThan(Long nextId) {
        regNextId(CK_GT, nextId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextId_LessThan(Long nextId) {
        regNextId(CK_LT, nextId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextId_GreaterEqual(Long nextId) {
        regNextId(CK_GE, nextId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextId_LessEqual(Long nextId) {
        regNextId(CK_LE, nextId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of nextId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNextId(), "NEXT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextIdList The collection of nextId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextId_InScope(Collection<Long> nextIdList) {
        doSetNextId_InScope(nextIdList);
    }

    protected void doSetNextId_InScope(Collection<Long> nextIdList) {
        regINS(CK_INS, cTL(nextIdList), getCValueNextId(), "NEXT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextIdList The collection of nextId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextId_NotInScope(Collection<Long> nextIdList) {
        doSetNextId_NotInScope(nextIdList);
    }

    protected void doSetNextId_NotInScope(Collection<Long> nextIdList) {
        regINS(CK_NINS, cTL(nextIdList), getCValueNextId(), "NEXT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select NEXT_ID from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSplitMultipleFkBaseList</span>(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSplitMultipleFkBaseList for 'exists'. (NotNull)
     */
    public void existsWhiteSplitMultipleFkBaseList(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(cb.query());
        registerExistsReferrer(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList");
    }
    public abstract String keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select NEXT_ID from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSplitMultipleFkBaseList</span>(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSplitMultipleFkBaseList(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList");
    }
    public abstract String keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_ID from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkBaseList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSplitMultipleFkBaseList(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextId_InScopeRelation_WhiteSplitMultipleFkBaseList(cb.query());
        registerInScopeRelation(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList");
    }
    public abstract String keepNextId_InScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_ID from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkBaseList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSplitMultipleFkBaseList(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList(cb.query());
        registerNotInScopeRelation(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList");
    }
    public abstract String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    public void xsderiveWhiteSplitMultipleFkBaseList(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList", al, op);
    }
    public abstract String keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteSplitMultipleFkBaseList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkBaseCB> derivedWhiteSplitMultipleFkBaseList() {
        return xcreateQDRFunctionWhiteSplitMultipleFkBaseList();
    }
    protected HpQDRFunction<WhiteSplitMultipleFkBaseCB> xcreateQDRFunctionWhiteSplitMultipleFkBaseList() {
        return new HpQDRFunction<WhiteSplitMultipleFkBaseCB>(new HpQDRSetupper<WhiteSplitMultipleFkBaseCB>() {
            public void setup(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteSplitMultipleFkBaseList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteSplitMultipleFkBaseList(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(cb.query()); String prpp = keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NEXT_ID", "NEXT_ID", sqpp, "whiteSplitMultipleFkBaseList", rd, vl, prpp, op);
    }
    public abstract String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);
    public abstract String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setNextId_IsNull() { regNextId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setNextId_IsNotNull() { regNextId(CK_ISNN, DOBJ); }

    protected void regNextId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNextId(), "NEXT_ID"); }
    protected abstract ConditionValue getCValueNextId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_Equal(String secondCode) {
        doSetSecondCode_Equal(fRES(secondCode));
    }

    protected void doSetSecondCode_Equal(String secondCode) {
        regSecondCode(CK_EQ, secondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_NotEqual(String secondCode) {
        doSetSecondCode_NotEqual(fRES(secondCode));
    }

    protected void doSetSecondCode_NotEqual(String secondCode) {
        regSecondCode(CK_NES, secondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_InScope(Collection<String> secondCodeList) {
        doSetSecondCode_InScope(secondCodeList);
    }

    public void doSetSecondCode_InScope(Collection<String> secondCodeList) {
        regINS(CK_INS, cTL(secondCodeList), getCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_NotInScope(Collection<String> secondCodeList) {
        doSetSecondCode_NotInScope(secondCodeList);
    }

    public void doSetSecondCode_NotInScope(Collection<String> secondCodeList) {
        regINS(CK_NINS, cTL(secondCodeList), getCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_PrefixSearch(String secondCode) {
        setSecondCode_LikeSearch(secondCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setSecondCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secondCode The value of secondCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecondCode_LikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secondCode), getCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecondCode_NotLikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secondCode), getCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    protected void regSecondCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecondCode(), "SECOND_CODE"); }
    protected abstract ConditionValue getCValueSecondCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkNextCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteSplitMultipleFkNextCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkNextCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteSplitMultipleFkNextCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkNextCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteSplitMultipleFkNextCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkNextCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteSplitMultipleFkNextCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkNextCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteSplitMultipleFkNextCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkNextCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteSplitMultipleFkNextCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkNextCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkNextCQ sq);

    protected WhiteSplitMultipleFkNextCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkNextCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSplitMultipleFkNextCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkNextCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSplitMultipleFkNextCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "NEXT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSplitMultipleFkNextCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkNextCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSplitMultipleFkNextCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NEXT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSplitMultipleFkNextCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSplitMultipleFkNextCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSplitMultipleFkNextCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSplitMultipleFkNextCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSplitMultipleFkNextCQ sq);

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
    protected WhiteSplitMultipleFkNextCB newMyCB() {
        return new WhiteSplitMultipleFkNextCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSplitMultipleFkNextCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
