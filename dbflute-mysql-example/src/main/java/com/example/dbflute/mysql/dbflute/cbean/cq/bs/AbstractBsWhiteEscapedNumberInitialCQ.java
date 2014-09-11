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
 * The abstract condition-query of white_escaped_number_initial.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteEscapedNumberInitialCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteEscapedNumberInitialCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_escaped_number_initial";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     * @param numberInitialCode The value of numberInitialCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setNumberInitialCode_Equal(String numberInitialCode) {
        doSetNumberInitialCode_Equal(fRES(numberInitialCode));
    }

    /**
     * Equal(=). As EscapedNumberInitialCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setNumberInitialCode_Equal_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls cdef) {
        doSetNumberInitialCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As N1Foo (1FO). And OnlyOnceRegistered. <br />
     * 1Foo
     */
    public void setNumberInitialCode_Equal_N1Foo() {
        setNumberInitialCode_Equal_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N1Foo);
    }

    /**
     * Equal(=). As N3Bar (3BA). And OnlyOnceRegistered. <br />
     * 3Bar
     */
    public void setNumberInitialCode_Equal_N3Bar() {
        setNumberInitialCode_Equal_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N3Bar);
    }

    /**
     * Equal(=). As N7Qux (7QU). And OnlyOnceRegistered. <br />
     * 7Qux
     */
    public void setNumberInitialCode_Equal_N7Qux() {
        setNumberInitialCode_Equal_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N7Qux);
    }

    /**
     * Equal(=). As Corge9 (CO9). And OnlyOnceRegistered. <br />
     * Corge9
     */
    public void setNumberInitialCode_Equal_Corge9() {
        setNumberInitialCode_Equal_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.Corge9);
    }

    protected void doSetNumberInitialCode_Equal(String numberInitialCode) {
        regNumberInitialCode(CK_EQ, numberInitialCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     * @param numberInitialCode The value of numberInitialCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setNumberInitialCode_NotEqual(String numberInitialCode) {
        doSetNumberInitialCode_NotEqual(fRES(numberInitialCode));
    }

    /**
     * NotEqual(&lt;&gt;). As EscapedNumberInitialCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setNumberInitialCode_NotEqual_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls cdef) {
        doSetNumberInitialCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As N1Foo (1FO). And OnlyOnceRegistered. <br />
     * 1Foo
     */
    public void setNumberInitialCode_NotEqual_N1Foo() {
        setNumberInitialCode_NotEqual_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N1Foo);
    }

    /**
     * NotEqual(&lt;&gt;). As N3Bar (3BA). And OnlyOnceRegistered. <br />
     * 3Bar
     */
    public void setNumberInitialCode_NotEqual_N3Bar() {
        setNumberInitialCode_NotEqual_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N3Bar);
    }

    /**
     * NotEqual(&lt;&gt;). As N7Qux (7QU). And OnlyOnceRegistered. <br />
     * 7Qux
     */
    public void setNumberInitialCode_NotEqual_N7Qux() {
        setNumberInitialCode_NotEqual_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N7Qux);
    }

    /**
     * NotEqual(&lt;&gt;). As Corge9 (CO9). And OnlyOnceRegistered. <br />
     * Corge9
     */
    public void setNumberInitialCode_NotEqual_Corge9() {
        setNumberInitialCode_NotEqual_AsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.Corge9);
    }

    protected void doSetNumberInitialCode_NotEqual(String numberInitialCode) {
        regNumberInitialCode(CK_NES, numberInitialCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     * @param numberInitialCodeList The collection of numberInitialCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialCode_InScope(Collection<String> numberInitialCodeList) {
        doSetNumberInitialCode_InScope(numberInitialCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As EscapedNumberInitialCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialCode_InScope_AsEscapedNumberInitialCls(Collection<CDef.EscapedNumberInitialCls> cdefList) {
        doSetNumberInitialCode_InScope(cTStrL(cdefList));
    }

    public void doSetNumberInitialCode_InScope(Collection<String> numberInitialCodeList) {
        regINS(CK_INS, cTL(numberInitialCodeList), getCValueNumberInitialCode(), "NUMBER_INITIAL_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     * @param numberInitialCodeList The collection of numberInitialCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialCode_NotInScope(Collection<String> numberInitialCodeList) {
        doSetNumberInitialCode_NotInScope(numberInitialCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EscapedNumberInitialCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialCode_NotInScope_AsEscapedNumberInitialCls(Collection<CDef.EscapedNumberInitialCls> cdefList) {
        doSetNumberInitialCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetNumberInitialCode_NotInScope(Collection<String> numberInitialCodeList) {
        regINS(CK_NINS, cTL(numberInitialCodeList), getCValueNumberInitialCode(), "NUMBER_INITIAL_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     */
    public void setNumberInitialCode_IsNull() { regNumberInitialCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     */
    public void setNumberInitialCode_IsNotNull() { regNumberInitialCode(CK_ISNN, DOBJ); }

    protected void regNumberInitialCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNumberInitialCode(), "NUMBER_INITIAL_CODE"); }
    protected abstract ConditionValue getCValueNumberInitialCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @param numberInitialName The value of numberInitialName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialName_Equal(String numberInitialName) {
        doSetNumberInitialName_Equal(fRES(numberInitialName));
    }

    protected void doSetNumberInitialName_Equal(String numberInitialName) {
        regNumberInitialName(CK_EQ, numberInitialName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @param numberInitialName The value of numberInitialName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialName_NotEqual(String numberInitialName) {
        doSetNumberInitialName_NotEqual(fRES(numberInitialName));
    }

    protected void doSetNumberInitialName_NotEqual(String numberInitialName) {
        regNumberInitialName(CK_NES, numberInitialName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @param numberInitialNameList The collection of numberInitialName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialName_InScope(Collection<String> numberInitialNameList) {
        doSetNumberInitialName_InScope(numberInitialNameList);
    }

    public void doSetNumberInitialName_InScope(Collection<String> numberInitialNameList) {
        regINS(CK_INS, cTL(numberInitialNameList), getCValueNumberInitialName(), "NUMBER_INITIAL_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @param numberInitialNameList The collection of numberInitialName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialName_NotInScope(Collection<String> numberInitialNameList) {
        doSetNumberInitialName_NotInScope(numberInitialNameList);
    }

    public void doSetNumberInitialName_NotInScope(Collection<String> numberInitialNameList) {
        regINS(CK_NINS, cTL(numberInitialNameList), getCValueNumberInitialName(), "NUMBER_INITIAL_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @param numberInitialName The value of numberInitialName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberInitialName_PrefixSearch(String numberInitialName) {
        setNumberInitialName_LikeSearch(numberInitialName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)} <br />
     * <pre>e.g. setNumberInitialName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberInitialName The value of numberInitialName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberInitialName_LikeSearch(String numberInitialName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberInitialName), getCValueNumberInitialName(), "NUMBER_INITIAL_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @param numberInitialName The value of numberInitialName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberInitialName_NotLikeSearch(String numberInitialName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberInitialName), getCValueNumberInitialName(), "NUMBER_INITIAL_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     */
    public void setNumberInitialName_IsNull() { regNumberInitialName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     */
    public void setNumberInitialName_IsNullOrEmpty() { regNumberInitialName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     */
    public void setNumberInitialName_IsNotNull() { regNumberInitialName(CK_ISNN, DOBJ); }

    protected void regNumberInitialName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNumberInitialName(), "NUMBER_INITIAL_NAME"); }
    protected abstract ConditionValue getCValueNumberInitialName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteEscapedNumberInitialCB&gt;() {
     *     public void query(WhiteEscapedNumberInitialCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedNumberInitialCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteEscapedNumberInitialCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteEscapedNumberInitialCB&gt;() {
     *     public void query(WhiteEscapedNumberInitialCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedNumberInitialCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteEscapedNumberInitialCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteEscapedNumberInitialCB&gt;() {
     *     public void query(WhiteEscapedNumberInitialCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedNumberInitialCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteEscapedNumberInitialCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteEscapedNumberInitialCB&gt;() {
     *     public void query(WhiteEscapedNumberInitialCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedNumberInitialCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteEscapedNumberInitialCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteEscapedNumberInitialCB&gt;() {
     *     public void query(WhiteEscapedNumberInitialCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedNumberInitialCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteEscapedNumberInitialCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteEscapedNumberInitialCB&gt;() {
     *     public void query(WhiteEscapedNumberInitialCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedNumberInitialCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteEscapedNumberInitialCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedNumberInitialCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteEscapedNumberInitialCQ sq);

    protected WhiteEscapedNumberInitialCB xcreateScalarConditionCB() {
        WhiteEscapedNumberInitialCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteEscapedNumberInitialCB xcreateScalarConditionPartitionByCB() {
        WhiteEscapedNumberInitialCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteEscapedNumberInitialCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedNumberInitialCB cb = new WhiteEscapedNumberInitialCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "NUMBER_INITIAL_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteEscapedNumberInitialCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteEscapedNumberInitialCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteEscapedNumberInitialCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedNumberInitialCB cb = new WhiteEscapedNumberInitialCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NUMBER_INITIAL_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteEscapedNumberInitialCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteEscapedNumberInitialCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteEscapedNumberInitialCB cb = new WhiteEscapedNumberInitialCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteEscapedNumberInitialCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteEscapedNumberInitialCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteEscapedNumberInitialCB cb = new WhiteEscapedNumberInitialCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteEscapedNumberInitialCQ sq);

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
    protected WhiteEscapedNumberInitialCB newMyCB() {
        return new WhiteEscapedNumberInitialCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteEscapedNumberInitialCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
