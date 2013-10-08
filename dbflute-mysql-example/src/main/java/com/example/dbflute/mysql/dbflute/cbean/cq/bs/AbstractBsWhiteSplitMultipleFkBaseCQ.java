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
    public AbstractBsWhiteSplitMultipleFkBaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteSplitMultipleFkChildList</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSplitMultipleFkChildList for 'exists'. (NotNull)
     */
    public void existsWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteSplitMultipleFkChildList</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkChildList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BASE_ID from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkChildList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSplitMultipleFkChildList(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkChildList");
    }
    public abstract String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ subQuery);

    public void xsderiveWhiteSplitMultipleFkChildList(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkChildList", aliasName, option);
    }
    public abstract String keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_split_multiple_fk_child where ...)} <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteSplitMultipleFkChildList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkChildCB> derivedWhiteSplitMultipleFkChildList() {
        return xcreateQDRFunctionWhiteSplitMultipleFkChildList();
    }
    protected HpQDRFunction<WhiteSplitMultipleFkChildCB> xcreateQDRFunctionWhiteSplitMultipleFkChildList() {
        return new HpQDRFunction<WhiteSplitMultipleFkChildCB>(new HpQDRSetupper<WhiteSplitMultipleFkChildCB>() {
            public void setup(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteSplitMultipleFkChildList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteSplitMultipleFkChildList(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkChildList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ subQuery);
    public abstract String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(Object parameterValue);

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

    protected void regBaseId(ConditionKey k, Object v) { regQ(k, v, getCValueBaseId(), "BASE_ID"); }
    abstract protected ConditionValue getCValueBaseId();
    
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

    protected void regFirstId(ConditionKey k, Object v) { regQ(k, v, getCValueFirstId(), "FIRST_ID"); }
    abstract protected ConditionValue getCValueFirstId();
    
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
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkNextCB>", subQuery);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "NEXT_ID", "NEXT_ID", subQueryPropertyName, "whiteSplitMultipleFkNext");
    }
    public abstract String keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_ID from white_split_multiple_fk_next where ...)} <br />
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkNext for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSplitMultipleFkNext(SubQuery<WhiteSplitMultipleFkNextCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkNextCB>", subQuery);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "NEXT_ID", "NEXT_ID", subQueryPropertyName, "whiteSplitMultipleFkNext");
    }
    public abstract String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ subQuery);

    protected void regNextId(ConditionKey k, Object v) { regQ(k, v, getCValueNextId(), "NEXT_ID"); }
    abstract protected ConditionValue getCValueNextId();

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
     * <pre>e.g. setSplitName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regSplitName(ConditionKey k, Object v) { regQ(k, v, getCValueSplitName(), "SPLIT_NAME"); }
    abstract protected ConditionValue getCValueSplitName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkBaseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteSplitMultipleFkBaseCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteSplitMultipleFkBaseCB>(new HpSSQSetupper<WhiteSplitMultipleFkBaseCB>() {
            public void setup(String function, SubQuery<WhiteSplitMultipleFkBaseCB> subQuery, HpSSQOption<WhiteSplitMultipleFkBaseCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteSplitMultipleFkBaseCB> subQuery, String operand, HpSSQOption<WhiteSplitMultipleFkBaseCB> option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkBaseCQ subQuery);

    protected WhiteSplitMultipleFkBaseCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteSplitMultipleFkBaseCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteSplitMultipleFkBaseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSplitMultipleFkBaseCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkBaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteSplitMultipleFkBaseCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteSplitMultipleFkBaseCB>(new HpQDRSetupper<WhiteSplitMultipleFkBaseCB>() {
            public void setup(String function, SubQuery<WhiteSplitMultipleFkBaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteSplitMultipleFkBaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteSplitMultipleFkBaseCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteSplitMultipleFkBaseCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteSplitMultipleFkBaseCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteSplitMultipleFkBaseCB.class.getName(); }
    protected String xabCQ() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
