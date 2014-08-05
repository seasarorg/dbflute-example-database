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
 * The abstract condition-query of white_quoted.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteQuotedCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteQuotedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_quoted";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as equal. (NullAllowed: if null, no condition)
     */
    public void setSelect_Equal(Integer select) {
        doSetSelect_Equal(select);
    }

    protected void doSetSelect_Equal(Integer select) {
        regSelect(CK_EQ, select);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSelect_GreaterThan(Integer select) {
        regSelect(CK_GT, select);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSelect_LessThan(Integer select) {
        regSelect(CK_LT, select);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSelect_GreaterEqual(Integer select) {
        regSelect(CK_GE, select);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSelect_LessEqual(Integer select) {
        regSelect(CK_LE, select);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param minNumber The min number of select. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of select. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSelect_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSelect(), "SELECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param selectList The collection of select as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelect_InScope(Collection<Integer> selectList) {
        doSetSelect_InScope(selectList);
    }

    protected void doSetSelect_InScope(Collection<Integer> selectList) {
        regINS(CK_INS, cTL(selectList), getCValueSelect(), "SELECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param selectList The collection of select as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelect_NotInScope(Collection<Integer> selectList) {
        doSetSelect_NotInScope(selectList);
    }

    protected void doSetSelect_NotInScope(Collection<Integer> selectList) {
        regINS(CK_NINS, cTL(selectList), getCValueSelect(), "SELECT");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteQuotedRefList</span>(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteQuotedRefList for 'exists'. (NotNull)
     */
    public void existsWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelect_ExistsReferrer_WhiteQuotedRefList(cb.query());
        registerExistsReferrer(cb.query(), "SELECT", "ORDER", pp, "whiteQuotedRefList");
    }
    public abstract String keepSelect_ExistsReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteQuotedRefList</span>(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Select_NotExistsReferrer_WhiteQuotedRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelect_NotExistsReferrer_WhiteQuotedRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "SELECT", "ORDER", pp, "whiteQuotedRefList");
    }
    public abstract String keepSelect_NotExistsReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * @param subQuery The sub-query of WhiteQuotedRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelect_InScopeRelation_WhiteQuotedRefList(cb.query());
        registerInScopeRelation(cb.query(), "SELECT", "ORDER", pp, "whiteQuotedRefList");
    }
    public abstract String keepSelect_InScopeRelation_WhiteQuotedRefList(WhiteQuotedRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * @param subQuery The sub-query of WhiteQuotedRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSelect_NotInScopeRelation_WhiteQuotedRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "SELECT", "ORDER", pp, "whiteQuotedRefList");
    }
    public abstract String keepSelect_NotInScopeRelation_WhiteQuotedRefList(WhiteQuotedRefCQ sq);

    public void xsderiveWhiteQuotedRefList(String fn, SubQuery<WhiteQuotedRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSelect_SpecifyDerivedReferrer_WhiteQuotedRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SELECT", "ORDER", pp, "whiteQuotedRefList", al, op);
    }
    public abstract String keepSelect_SpecifyDerivedReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteQuotedRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteQuotedRefCB> derivedWhiteQuotedRefList() {
        return xcreateQDRFunctionWhiteQuotedRefList();
    }
    protected HpQDRFunction<WhiteQuotedRefCB> xcreateQDRFunctionWhiteQuotedRefList() {
        return new HpQDRFunction<WhiteQuotedRefCB>(new HpQDRSetupper<WhiteQuotedRefCB>() {
            public void setup(String fn, SubQuery<WhiteQuotedRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteQuotedRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteQuotedRefList(String fn, SubQuery<WhiteQuotedRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepSelect_QueryDerivedReferrer_WhiteQuotedRefList(cb.query()); String prpp = keepSelect_QueryDerivedReferrer_WhiteQuotedRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SELECT", "ORDER", sqpp, "whiteQuotedRefList", rd, vl, prpp, op);
    }
    public abstract String keepSelect_QueryDerivedReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ sq);
    public abstract String keepSelect_QueryDerivedReferrer_WhiteQuotedRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     */
    public void setSelect_IsNull() { regSelect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     */
    public void setSelect_IsNotNull() { regSelect(CK_ISNN, DOBJ); }

    protected void regSelect(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSelect(), "SELECT"); }
    protected abstract ConditionValue getCValueSelect();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_Equal(String from) {
        doSetFrom_Equal(fRES(from));
    }

    protected void doSetFrom_Equal(String from) {
        regFrom(CK_EQ, from);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_NotEqual(String from) {
        doSetFrom_NotEqual(fRES(from));
    }

    protected void doSetFrom_NotEqual(String from) {
        regFrom(CK_NES, from);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param fromList The collection of from as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_InScope(Collection<String> fromList) {
        doSetFrom_InScope(fromList);
    }

    public void doSetFrom_InScope(Collection<String> fromList) {
        regINS(CK_INS, cTL(fromList), getCValueFrom(), "FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param fromList The collection of from as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_NotInScope(Collection<String> fromList) {
        doSetFrom_NotInScope(fromList);
    }

    public void doSetFrom_NotInScope(Collection<String> fromList) {
        regINS(CK_NINS, cTL(fromList), getCValueFrom(), "FROM");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_PrefixSearch(String from) {
        setFrom_LikeSearch(from, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)} <br />
     * <pre>e.g. setFrom_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param from The value of from as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFrom_LikeSearch(String from, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(from), getCValueFrom(), "FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFrom_NotLikeSearch(String from, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(from), getCValueFrom(), "FROM", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     */
    public void setFrom_IsNull() { regFrom(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     */
    public void setFrom_IsNullOrEmpty() { regFrom(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     */
    public void setFrom_IsNotNull() { regFrom(CK_ISNN, DOBJ); }

    protected void regFrom(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFrom(), "FROM"); }
    protected abstract ConditionValue getCValueFrom();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteQuotedCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteQuotedCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteQuotedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteQuotedCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteQuotedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteQuotedCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteQuotedCQ sq);

    protected WhiteQuotedCB xcreateScalarConditionCB() {
        WhiteQuotedCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteQuotedCB xcreateScalarConditionPartitionByCB() {
        WhiteQuotedCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteQuotedCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "SELECT";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteQuotedCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteQuotedCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteQuotedCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SELECT";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteQuotedCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteQuotedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteQuotedCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteQuotedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteQuotedCQ sq);

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
    protected WhiteQuotedCB newMyCB() {
        return new WhiteQuotedCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteQuotedCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
