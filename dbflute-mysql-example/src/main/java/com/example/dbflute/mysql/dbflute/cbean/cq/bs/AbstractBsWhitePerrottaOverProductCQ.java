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
 * The abstract condition-query of white_perrotta_over_product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_perrotta_over_product";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PRODUCT_ID from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhitePerrottaOverMemberList</span>(new SubQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void query(WhitePerrottaOverMemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePerrottaOverMemberList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_ExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepProductId_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select NEXT_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhitePerrottaOverTraceByNextProductIdList</span>(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePerrottaOverTraceByNextProductIdList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverTraceByNextProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList");
    }
    public abstract String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PREVIOUS_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhitePerrottaOverTraceByPreviousProductIdList</span>(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePerrottaOverTraceByPreviousProductIdList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverTraceByPreviousProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList");
    }
    public abstract String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PRODUCT_ID from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhitePerrottaOverMemberList</span>(new SubQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void query(WhitePerrottaOverMemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductId_NotExistsReferrer_WhitePerrottaOverMemberList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select NEXT_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhitePerrottaOverTraceByNextProductIdList</span>(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverTraceByNextProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PREVIOUS_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhitePerrottaOverTraceByPreviousProductIdList</span>(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverTraceByPreviousProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverMemberList for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_WhitePerrottaOverMemberList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepProductId_InScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverTraceByNextProductIdList for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePerrottaOverTraceByNextProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList");
    }
    public abstract String keepProductId_InScopeRelation_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PREVIOUS_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverTraceByPreviousProductIdList for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePerrottaOverTraceByPreviousProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList");
    }
    public abstract String keepProductId_InScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverMemberList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_WhitePerrottaOverMemberList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepProductId_NotInScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverTraceByNextProductIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePerrottaOverTraceByNextProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList");
    }
    public abstract String keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PREVIOUS_PRODUCT_ID from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverTraceByPreviousProductIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePerrottaOverTraceByPreviousProductIdList(SubQuery<WhitePerrottaOverTraceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList");
    }
    public abstract String keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    public void xsderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    public void xsderiveWhitePerrottaOverTraceByNextProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    public void xsderiveWhitePerrottaOverTraceByPreviousProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhitePerrottaOverMemberList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void query(WhitePerrottaOverMemberCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverMemberCB> derivedWhitePerrottaOverMemberList() {
        return xcreateQDRFunctionWhitePerrottaOverMemberList();
    }
    protected HpQDRFunction<WhitePerrottaOverMemberCB> xcreateQDRFunctionWhitePerrottaOverMemberList() {
        return new HpQDRFunction<WhitePerrottaOverMemberCB>(new HpQDRSetupper<WhitePerrottaOverMemberCB>() {
            public void setup(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhitePerrottaOverMemberList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "whitePerrottaOverMemberList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhitePerrottaOverTraceByNextProductIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverTraceCB> derivedWhitePerrottaOverTraceByNextProductIdList() {
        return xcreateQDRFunctionWhitePerrottaOverTraceByNextProductIdList();
    }
    protected HpQDRFunction<WhitePerrottaOverTraceCB> xcreateQDRFunctionWhitePerrottaOverTraceByNextProductIdList() {
        return new HpQDRFunction<WhitePerrottaOverTraceCB>(new HpQDRSetupper<WhitePerrottaOverTraceCB>() {
            public void setup(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhitePerrottaOverTraceByNextProductIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhitePerrottaOverTraceByNextProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", sqpp, "whitePerrottaOverTraceByNextProductIdList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_trace where ...)} <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhitePerrottaOverTraceByPreviousProductIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverTraceCB> derivedWhitePerrottaOverTraceByPreviousProductIdList() {
        return xcreateQDRFunctionWhitePerrottaOverTraceByPreviousProductIdList();
    }
    protected HpQDRFunction<WhitePerrottaOverTraceCB> xcreateQDRFunctionWhitePerrottaOverTraceByPreviousProductIdList() {
        return new HpQDRFunction<WhitePerrottaOverTraceCB>(new HpQDRSetupper<WhitePerrottaOverTraceCB>() {
            public void setup(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhitePerrottaOverTraceByPreviousProductIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhitePerrottaOverTraceByPreviousProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", sqpp, "whitePerrottaOverTraceByPreviousProductIdList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue getCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_Equal(String productName) {
        doSetProductName_Equal(fRES(productName));
    }

    protected void doSetProductName_Equal(String productName) {
        regProductName(CK_EQ, productName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotEqual(String productName) {
        doSetProductName_NotEqual(fRES(productName));
    }

    protected void doSetProductName_NotEqual(String productName) {
        regProductName(CK_NES, productName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productNameList The collection of productName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_InScope(Collection<String> productNameList) {
        doSetProductName_InScope(productNameList);
    }

    public void doSetProductName_InScope(Collection<String> productNameList) {
        regINS(CK_INS, cTL(productNameList), getCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productNameList The collection of productName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotInScope(Collection<String> productNameList) {
        doSetProductName_NotInScope(productNameList);
    }

    public void doSetProductName_NotInScope(Collection<String> productNameList) {
        regINS(CK_NINS, cTL(productNameList), getCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_PrefixSearch(String productName) {
        setProductName_LikeSearch(productName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setProductName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productName The value of productName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    protected void regProductName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductName(), "PRODUCT_NAME"); }
    protected abstract ConditionValue getCValueProductName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_Equal(String productNestedCode) {
        doSetProductNestedCode_Equal(fRES(productNestedCode));
    }

    protected void doSetProductNestedCode_Equal(String productNestedCode) {
        regProductNestedCode(CK_EQ, productNestedCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_NotEqual(String productNestedCode) {
        doSetProductNestedCode_NotEqual(fRES(productNestedCode));
    }

    protected void doSetProductNestedCode_NotEqual(String productNestedCode) {
        regProductNestedCode(CK_NES, productNestedCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCodeList The collection of productNestedCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_InScope(Collection<String> productNestedCodeList) {
        doSetProductNestedCode_InScope(productNestedCodeList);
    }

    public void doSetProductNestedCode_InScope(Collection<String> productNestedCodeList) {
        regINS(CK_INS, cTL(productNestedCodeList), getCValueProductNestedCode(), "PRODUCT_NESTED_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCodeList The collection of productNestedCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_NotInScope(Collection<String> productNestedCodeList) {
        doSetProductNestedCode_NotInScope(productNestedCodeList);
    }

    public void doSetProductNestedCode_NotInScope(Collection<String> productNestedCodeList) {
        regINS(CK_NINS, cTL(productNestedCodeList), getCValueProductNestedCode(), "PRODUCT_NESTED_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_PrefixSearch(String productNestedCode) {
        setProductNestedCode_LikeSearch(productNestedCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br />
     * <pre>e.g. setProductNestedCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNestedCode The value of productNestedCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNestedCode_LikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNestedCode), getCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNestedCode_NotLikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNestedCode), getCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_NESTED_CODE from white_perrotta_over_product_nested where ...)} <br />
     * white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @param subQuery The sub-query of WhitePerrottaOverProductNested for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePerrottaOverProductNested(SubQuery<WhitePerrottaOverProductNestedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_InScopeRelation_WhitePerrottaOverProductNested(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductNested");
    }
    public abstract String keepProductNestedCode_InScopeRelation_WhitePerrottaOverProductNested(WhitePerrottaOverProductNestedCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_NESTED_CODE from white_perrotta_over_product_nested where ...)} <br />
     * white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @param subQuery The sub-query of WhitePerrottaOverProductNested for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePerrottaOverProductNested(SubQuery<WhitePerrottaOverProductNestedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_NotInScopeRelation_WhitePerrottaOverProductNested(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductNested");
    }
    public abstract String keepProductNestedCode_NotInScopeRelation_WhitePerrottaOverProductNested(WhitePerrottaOverProductNestedCQ sq);

    protected void regProductNestedCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductNestedCode(), "PRODUCT_NESTED_CODE"); }
    protected abstract ConditionValue getCValueProductNestedCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhitePerrottaOverProductCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhitePerrottaOverProductCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhitePerrottaOverProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhitePerrottaOverProductCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhitePerrottaOverProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhitePerrottaOverProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverProductCQ sq);

    protected WhitePerrottaOverProductCB xcreateScalarConditionCB() {
        WhitePerrottaOverProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverProductCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverProductCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePerrottaOverProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhitePerrottaOverProductCQ sq);

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
    protected WhitePerrottaOverProductCB newMyCB() {
        return new WhitePerrottaOverProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
