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
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteImplicitReverseFkRefList</span>(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitReverseFkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteImplicitReverseFkRefList</span>(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void query(WhiteImplicitReverseFkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteImplicitReverseFkRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WHITE_IMPLICIT_REVERSE_FK_ID from white_implicit_reverse_fk_ref where ...)} <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of WhiteImplicitReverseFkRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitReverseFkRefList(SubQuery<WhiteImplicitReverseFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFkRefList");
    }
    public abstract String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq);

    public void xsderiveWhiteImplicitReverseFkRefList(String fn, SubQuery<WhiteImplicitReverseFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", pp, "whiteImplicitReverseFkRefList", al, op);
    }
    public abstract String keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq);

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
            public void setup(String fn, SubQuery<WhiteImplicitReverseFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteImplicitReverseFkRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteImplicitReverseFkRefList(String fn, SubQuery<WhiteImplicitReverseFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(cb.query()); // for saving query-value.
        String prpp = keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", sqpp, "whiteImplicitReverseFkRefList", rd, vl, prpp, op);
    }
    public abstract String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq);
    public abstract String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(Object vl);

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

    protected void regWhiteImplicitReverseFkId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID"); }
    protected abstract ConditionValue getCValueWhiteImplicitReverseFkId();

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

    protected void regWhiteImplicitReverseFkName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWhiteImplicitReverseFkName(), "WHITE_IMPLICIT_REVERSE_FK_NAME"); }
    protected abstract ConditionValue getCValueWhiteImplicitReverseFkName();

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
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteImplicitReverseFkCB.class);
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
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteImplicitReverseFkCB.class);
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
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteImplicitReverseFkCB.class);
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
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteImplicitReverseFkCB.class);
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
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteImplicitReverseFkCB.class);
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
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteImplicitReverseFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitReverseFkCQ sq);

    protected WhiteImplicitReverseFkCB xcreateScalarConditionCB() {
        WhiteImplicitReverseFkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitReverseFkCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitReverseFkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitReverseFkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "WHITE_IMPLICIT_REVERSE_FK_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitReverseFkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitReverseFkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitReverseFkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WHITE_IMPLICIT_REVERSE_FK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitReverseFkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitReverseFkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitReverseFkCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitReverseFkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteImplicitReverseFkCQ sq);

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
    protected WhiteImplicitReverseFkCB newMyCB() {
        return new WhiteImplicitReverseFkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteImplicitReverseFkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
