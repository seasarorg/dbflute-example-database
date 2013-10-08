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
 * The abstract condition-query of white_implicit_reverse_fk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitReverseFkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitReverseFkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_reverse_fk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as equal. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_Equal(Integer whiteImplicitReverseFkId) {
        doSetWhiteImplicitReverseFkId_Equal(whiteImplicitReverseFkId);
    }

    protected void doSetWhiteImplicitReverseFkId_Equal(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_EQ, whiteImplicitReverseFkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_GreaterThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GT, whiteImplicitReverseFkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_LessThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LT, whiteImplicitReverseFkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_GreaterEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GE, whiteImplicitReverseFkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWhiteImplicitReverseFkId_LessEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LE, whiteImplicitReverseFkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param minNumber The min number of whiteImplicitReverseFkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of whiteImplicitReverseFkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkId_InScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_InScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_InScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkIdList), getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_NotInScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkIdList), getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteImplicitReverseFkRefList</span>(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitReverseFkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkRefCB>", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteImplicitReverseFkRefList</span>(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkRefCB>", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteImplicitReverseFkRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkRefCB>", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteImplicitReverseFkRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkRefCB>", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ subQuery);

    public void xsderiveWhiteImplicitReverseFkRefList(String function, SubQuery<WhiteImplicitReverseFkRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkRefCB>", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "whiteImplicitReverseFkRefList", aliasName, option);
    }
    public abstract String keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteImplicitReverseFkRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitReverseFkRefCB> derivedWhiteImplicitReverseFkRefList() {
        return xcreateQDRFunctionWhiteImplicitReverseFkRefList();
    }
    protected HpQDRFunction<WhiteImplicitReverseFkRefCB> xcreateQDRFunctionWhiteImplicitReverseFkRefList() {
        return new HpQDRFunction<WhiteImplicitReverseFkRefCB>(new HpQDRSetupper<WhiteImplicitReverseFkRefCB>() {
            public void setup(String function, SubQuery<WhiteImplicitReverseFkRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteImplicitReverseFkRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteImplicitReverseFkRefList(String function, SubQuery<WhiteImplicitReverseFkRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkRefCB>", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "whiteImplicitReverseFkRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ subQuery);
    public abstract String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     */
    public void setWhiteImplicitReverseFkId_IsNull() { regWhiteImplicitReverseFkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     */
    public void setWhiteImplicitReverseFkId_IsNotNull() { regWhiteImplicitReverseFkId(CK_ISNN, DOBJ); }

    protected void regWhiteImplicitReverseFkId(ConditionKey k, Object v) { regQ(k, v, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID"); }
    abstract protected ConditionValue getCValueWhiteImplicitReverseFkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @param whiteImplicitReverseFkName The value of whiteImplicitReverseFkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkName_Equal(String whiteImplicitReverseFkName) {
        doSetWhiteImplicitReverseFkName_Equal(fRES(whiteImplicitReverseFkName));
    }

    protected void doSetWhiteImplicitReverseFkName_Equal(String whiteImplicitReverseFkName) {
        regWhiteImplicitReverseFkName(CK_EQ, whiteImplicitReverseFkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @param whiteImplicitReverseFkName The value of whiteImplicitReverseFkName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkName_NotEqual(String whiteImplicitReverseFkName) {
        doSetWhiteImplicitReverseFkName_NotEqual(fRES(whiteImplicitReverseFkName));
    }

    protected void doSetWhiteImplicitReverseFkName_NotEqual(String whiteImplicitReverseFkName) {
        regWhiteImplicitReverseFkName(CK_NES, whiteImplicitReverseFkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @param whiteImplicitReverseFkNameList The collection of whiteImplicitReverseFkName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkName_InScope(Collection<String> whiteImplicitReverseFkNameList) {
        doSetWhiteImplicitReverseFkName_InScope(whiteImplicitReverseFkNameList);
    }

    public void doSetWhiteImplicitReverseFkName_InScope(Collection<String> whiteImplicitReverseFkNameList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkNameList), getCValueWhiteImplicitReverseFkName(), "WHITE_IMPLICIT_REVERSE_FK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @param whiteImplicitReverseFkNameList The collection of whiteImplicitReverseFkName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkName_NotInScope(Collection<String> whiteImplicitReverseFkNameList) {
        doSetWhiteImplicitReverseFkName_NotInScope(whiteImplicitReverseFkNameList);
    }

    public void doSetWhiteImplicitReverseFkName_NotInScope(Collection<String> whiteImplicitReverseFkNameList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkNameList), getCValueWhiteImplicitReverseFkName(), "WHITE_IMPLICIT_REVERSE_FK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @param whiteImplicitReverseFkName The value of whiteImplicitReverseFkName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhiteImplicitReverseFkName_PrefixSearch(String whiteImplicitReverseFkName) {
        setWhiteImplicitReverseFkName_LikeSearch(whiteImplicitReverseFkName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setWhiteImplicitReverseFkName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param whiteImplicitReverseFkName The value of whiteImplicitReverseFkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWhiteImplicitReverseFkName_LikeSearch(String whiteImplicitReverseFkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(whiteImplicitReverseFkName), getCValueWhiteImplicitReverseFkName(), "WHITE_IMPLICIT_REVERSE_FK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @param whiteImplicitReverseFkName The value of whiteImplicitReverseFkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWhiteImplicitReverseFkName_NotLikeSearch(String whiteImplicitReverseFkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(whiteImplicitReverseFkName), getCValueWhiteImplicitReverseFkName(), "WHITE_IMPLICIT_REVERSE_FK_NAME", likeSearchOption);
    }

    protected void regWhiteImplicitReverseFkName(ConditionKey k, Object v) { regQ(k, v, getCValueWhiteImplicitReverseFkName(), "WHITE_IMPLICIT_REVERSE_FK_NAME"); }
    abstract protected ConditionValue getCValueWhiteImplicitReverseFkName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitReverseFkCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteImplicitReverseFkCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteImplicitReverseFkCB>(new HpSSQSetupper<WhiteImplicitReverseFkCB>() {
            public void setup(String function, SubQuery<WhiteImplicitReverseFkCB> subQuery, HpSSQOption<WhiteImplicitReverseFkCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteImplicitReverseFkCB> subQuery, String operand, HpSSQOption<WhiteImplicitReverseFkCB> option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkCB>", subQuery);
        WhiteImplicitReverseFkCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteImplicitReverseFkCQ subQuery);

    protected WhiteImplicitReverseFkCB xcreateScalarConditionCB() {
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteImplicitReverseFkCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteImplicitReverseFkCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkCB>", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitReverseFkCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitReverseFkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteImplicitReverseFkCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteImplicitReverseFkCB>(new HpQDRSetupper<WhiteImplicitReverseFkCB>() {
            public void setup(String function, SubQuery<WhiteImplicitReverseFkCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteImplicitReverseFkCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkCB>", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitReverseFkCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitReverseFkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkCB>", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteImplicitReverseFkCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitReverseFkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteImplicitReverseFkCB>", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteImplicitReverseFkCQ subQuery);

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
    protected String xabCB() { return WhiteImplicitReverseFkCB.class.getName(); }
    protected String xabCQ() { return WhiteImplicitReverseFkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
