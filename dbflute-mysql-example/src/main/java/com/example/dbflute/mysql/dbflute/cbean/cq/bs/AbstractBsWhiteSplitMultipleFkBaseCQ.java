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
 * The abstract condition-query of white_split_multiple_fk_base.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkBaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_split_multiple_fk_base";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseId The value of baseId as equal. (NullAllowed: if null, no condition)
     */
    public void setBaseId_Equal(Long baseId) {
        doSetBaseId_Equal(baseId);
    }

    protected void doSetBaseId_Equal(Long baseId) {
        regBaseId(CK_EQ, baseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseId The value of baseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBaseId_GreaterThan(Long baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseId The value of baseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBaseId_LessThan(Long baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseId The value of baseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBaseId_GreaterEqual(Long baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseId The value of baseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBaseId_LessEqual(Long baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of baseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of baseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseIdList The collection of baseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBaseId_InScope(Collection<Long> baseIdList) {
        doSetBaseId_InScope(baseIdList);
    }

    protected void doSetBaseId_InScope(Collection<Long> baseIdList) {
        regINS(CK_INS, cTL(baseIdList), getCValueBaseId(), "BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @param baseIdList The collection of baseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBaseId_NotInScope(Collection<Long> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Long> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), getCValueBaseId(), "BASE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSplitMultipleFkChildList</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSplitMultipleFkChildList for 'exists'. (NotNull)
     */
    public void existsWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(cb.query());
        registerExistsReferrer(cb.query(), "BASE_ID", "BASE_ID", pp, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSplitMultipleFkChildList</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(cb.query());
        registerNotExistsReferrer(cb.query(), "BASE_ID", "BASE_ID", pp, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkChildList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(cb.query());
        registerInScopeRelation(cb.query(), "BASE_ID", "BASE_ID", pp, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkChildList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(cb.query());
        registerNotInScopeRelation(cb.query(), "BASE_ID", "BASE_ID", pp, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq);

    public void xsderiveWhiteSplitMultipleFkChildList(String fn, SubQuery<WhiteSplitMultipleFkChildCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BASE_ID", "BASE_ID", pp, "whiteSplitMultipleFkChildList", al, op);
    }
    public abstract String keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteSplitMultipleFkChildList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkChildCB> derivedWhiteSplitMultipleFkChildList() {
        return xcreateQDRFunctionWhiteSplitMultipleFkChildList();
    }
    protected HpQDRFunction<WhiteSplitMultipleFkChildCB> xcreateQDRFunctionWhiteSplitMultipleFkChildList() {
        return new HpQDRFunction<WhiteSplitMultipleFkChildCB>(new HpQDRSetupper<WhiteSplitMultipleFkChildCB>() {
            public void setup(String fn, SubQuery<WhiteSplitMultipleFkChildCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteSplitMultipleFkChildList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteSplitMultipleFkChildList(String fn, SubQuery<WhiteSplitMultipleFkChildCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(cb.query()); String prpp = keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BASE_ID", "BASE_ID", sqpp, "whiteSplitMultipleFkChildList", rd, vl, prpp, op);
    }
    public abstract String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq);
    public abstract String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setBaseId_IsNull() { regBaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setBaseId_IsNotNull() { regBaseId(CK_ISNN, DOBJ); }

    protected void regBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBaseId(), "BASE_ID"); }
    protected abstract ConditionValue getCValueBaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstId The value of firstId as equal. (NullAllowed: if null, no condition)
     */
    public void setFirstId_Equal(Integer firstId) {
        doSetFirstId_Equal(firstId);
    }

    protected void doSetFirstId_Equal(Integer firstId) {
        regFirstId(CK_EQ, firstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstId The value of firstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFirstId_GreaterThan(Integer firstId) {
        regFirstId(CK_GT, firstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstId The value of firstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFirstId_LessThan(Integer firstId) {
        regFirstId(CK_LT, firstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstId The value of firstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_GreaterEqual(Integer firstId) {
        regFirstId(CK_GE, firstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstId The value of firstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_LessEqual(Integer firstId) {
        regFirstId(CK_LE, firstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param minNumber The min number of firstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of firstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFirstId(), "FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstIdList The collection of firstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstId_InScope(Collection<Integer> firstIdList) {
        doSetFirstId_InScope(firstIdList);
    }

    protected void doSetFirstId_InScope(Collection<Integer> firstIdList) {
        regINS(CK_INS, cTL(firstIdList), getCValueFirstId(), "FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @param firstIdList The collection of firstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstId_NotInScope(Collection<Integer> firstIdList) {
        doSetFirstId_NotInScope(firstIdList);
    }

    protected void doSetFirstId_NotInScope(Collection<Integer> firstIdList) {
        regINS(CK_NINS, cTL(firstIdList), getCValueFirstId(), "FIRST_ID");
    }

    protected void regFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFirstId(), "FIRST_ID"); }
    protected abstract ConditionValue getCValueFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
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
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @param nextId The value of nextId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextId_GreaterThan(Long nextId) {
        regNextId(CK_GT, nextId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @param nextId The value of nextId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextId_LessThan(Long nextId) {
        regNextId(CK_LT, nextId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @param nextId The value of nextId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextId_GreaterEqual(Long nextId) {
        regNextId(CK_GE, nextId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @param nextId The value of nextId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextId_LessEqual(Long nextId) {
        regNextId(CK_LE, nextId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @param minNumber The min number of nextId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNextId(), "NEXT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
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
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @param nextIdList The collection of nextId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextId_NotInScope(Collection<Long> nextIdList) {
        doSetNextId_NotInScope(nextIdList);
    }

    protected void doSetNextId_NotInScope(Collection<Long> nextIdList) {
        regINS(CK_NINS, cTL(nextIdList), getCValueNextId(), "NEXT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_ID from white_split_multiple_fk_next where ...)} <br />
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkNext for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSplitMultipleFkNext(SubQuery<WhiteSplitMultipleFkNextCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(cb.query());
        registerInScopeRelation(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkNext");
    }
    public abstract String keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_ID from white_split_multiple_fk_next where ...)} <br />
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkNext for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSplitMultipleFkNext(SubQuery<WhiteSplitMultipleFkNextCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(cb.query());
        registerNotInScopeRelation(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkNext");
    }
    public abstract String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq);

    protected void regNextId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNextId(), "NEXT_ID"); }
    protected abstract ConditionValue getCValueNextId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @param splitName The value of splitName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSplitName_Equal(String splitName) {
        doSetSplitName_Equal(fRES(splitName));
    }

    protected void doSetSplitName_Equal(String splitName) {
        regSplitName(CK_EQ, splitName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @param splitName The value of splitName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSplitName_NotEqual(String splitName) {
        doSetSplitName_NotEqual(fRES(splitName));
    }

    protected void doSetSplitName_NotEqual(String splitName) {
        regSplitName(CK_NES, splitName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @param splitNameList The collection of splitName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSplitName_InScope(Collection<String> splitNameList) {
        doSetSplitName_InScope(splitNameList);
    }

    public void doSetSplitName_InScope(Collection<String> splitNameList) {
        regINS(CK_INS, cTL(splitNameList), getCValueSplitName(), "SPLIT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @param splitNameList The collection of splitName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSplitName_NotInScope(Collection<String> splitNameList) {
        doSetSplitName_NotInScope(splitNameList);
    }

    public void doSetSplitName_NotInScope(Collection<String> splitNameList) {
        regINS(CK_NINS, cTL(splitNameList), getCValueSplitName(), "SPLIT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @param splitName The value of splitName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSplitName_PrefixSearch(String splitName) {
        setSplitName_LikeSearch(splitName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setSplitName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param splitName The value of splitName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSplitName_LikeSearch(String splitName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(splitName), getCValueSplitName(), "SPLIT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @param splitName The value of splitName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSplitName_NotLikeSearch(String splitName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(splitName), getCValueSplitName(), "SPLIT_NAME", likeSearchOption);
    }

    protected void regSplitName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSplitName(), "SPLIT_NAME"); }
    protected abstract ConditionValue getCValueSplitName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSplitMultipleFkBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSplitMultipleFkBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSplitMultipleFkBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSplitMultipleFkBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSplitMultipleFkBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSplitMultipleFkBaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkBaseCQ sq);

    protected WhiteSplitMultipleFkBaseCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkBaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSplitMultipleFkBaseCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkBaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "BASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkBaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSplitMultipleFkBaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSplitMultipleFkBaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSplitMultipleFkBaseCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSplitMultipleFkBaseCQ sq);

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
    protected WhiteSplitMultipleFkBaseCB newMyCB() {
        return new WhiteSplitMultipleFkBaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
