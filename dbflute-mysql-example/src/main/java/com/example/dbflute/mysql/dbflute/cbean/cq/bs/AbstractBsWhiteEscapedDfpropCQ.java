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
 * The abstract condition-query of white_escaped_dfprop.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteEscapedDfpropCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteEscapedDfpropCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_escaped_dfprop";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     * @param escapedDfpropCode The value of escapedDfpropCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropCode_Equal(String escapedDfpropCode) {
        doSetEscapedDfpropCode_Equal(fRES(escapedDfpropCode));
    }

    /**
     * Equal(=). As EscapedDfpropCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * delimiter; & endBrace} & path\foo\bar
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setEscapedDfpropCode_Equal_AsEscapedDfpropCls(CDef.EscapedDfpropCls cdef) {
        doSetEscapedDfpropCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As First (;@\\). And OnlyOnceRegistered. <br />
     * First: delimiter & rear escape char
     */
    public void setEscapedDfpropCode_Equal_First() {
        setEscapedDfpropCode_Equal_AsEscapedDfpropCls(CDef.EscapedDfpropCls.First);
    }

    /**
     * Equal(=). As Second (\\};). And OnlyOnceRegistered. <br />
     * Second: escape char & endBrace & delimiter
     */
    public void setEscapedDfpropCode_Equal_Second() {
        setEscapedDfpropCode_Equal_AsEscapedDfpropCls(CDef.EscapedDfpropCls.Second);
    }

    /**
     * Equal(=). As Third ({=}). And OnlyOnceRegistered. <br />
     * Third: startBrace & equal & endBrace
     */
    public void setEscapedDfpropCode_Equal_Third() {
        setEscapedDfpropCode_Equal_AsEscapedDfpropCls(CDef.EscapedDfpropCls.Third);
    }

    protected void doSetEscapedDfpropCode_Equal(String escapedDfpropCode) {
        regEscapedDfpropCode(CK_EQ, escapedDfpropCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     * @param escapedDfpropCode The value of escapedDfpropCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropCode_NotEqual(String escapedDfpropCode) {
        doSetEscapedDfpropCode_NotEqual(fRES(escapedDfpropCode));
    }

    /**
     * NotEqual(&lt;&gt;). As EscapedDfpropCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * delimiter; & endBrace} & path\foo\bar
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setEscapedDfpropCode_NotEqual_AsEscapedDfpropCls(CDef.EscapedDfpropCls cdef) {
        doSetEscapedDfpropCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As First (;@\\). And OnlyOnceRegistered. <br />
     * First: delimiter & rear escape char
     */
    public void setEscapedDfpropCode_NotEqual_First() {
        setEscapedDfpropCode_NotEqual_AsEscapedDfpropCls(CDef.EscapedDfpropCls.First);
    }

    /**
     * NotEqual(&lt;&gt;). As Second (\\};). And OnlyOnceRegistered. <br />
     * Second: escape char & endBrace & delimiter
     */
    public void setEscapedDfpropCode_NotEqual_Second() {
        setEscapedDfpropCode_NotEqual_AsEscapedDfpropCls(CDef.EscapedDfpropCls.Second);
    }

    /**
     * NotEqual(&lt;&gt;). As Third ({=}). And OnlyOnceRegistered. <br />
     * Third: startBrace & equal & endBrace
     */
    public void setEscapedDfpropCode_NotEqual_Third() {
        setEscapedDfpropCode_NotEqual_AsEscapedDfpropCls(CDef.EscapedDfpropCls.Third);
    }

    protected void doSetEscapedDfpropCode_NotEqual(String escapedDfpropCode) {
        regEscapedDfpropCode(CK_NES, escapedDfpropCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     * @param escapedDfpropCodeList The collection of escapedDfpropCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropCode_InScope(Collection<String> escapedDfpropCodeList) {
        doSetEscapedDfpropCode_InScope(escapedDfpropCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As EscapedDfpropCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * delimiter; & endBrace} & path\foo\bar
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropCode_InScope_AsEscapedDfpropCls(Collection<CDef.EscapedDfpropCls> cdefList) {
        doSetEscapedDfpropCode_InScope(cTStrL(cdefList));
    }

    public void doSetEscapedDfpropCode_InScope(Collection<String> escapedDfpropCodeList) {
        regINS(CK_INS, cTL(escapedDfpropCodeList), getCValueEscapedDfpropCode(), "ESCAPED_DFPROP_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     * @param escapedDfpropCodeList The collection of escapedDfpropCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropCode_NotInScope(Collection<String> escapedDfpropCodeList) {
        doSetEscapedDfpropCode_NotInScope(escapedDfpropCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EscapedDfpropCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * delimiter; & endBrace} & path\foo\bar
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropCode_NotInScope_AsEscapedDfpropCls(Collection<CDef.EscapedDfpropCls> cdefList) {
        doSetEscapedDfpropCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetEscapedDfpropCode_NotInScope(Collection<String> escapedDfpropCodeList) {
        regINS(CK_NINS, cTL(escapedDfpropCodeList), getCValueEscapedDfpropCode(), "ESCAPED_DFPROP_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     */
    public void setEscapedDfpropCode_IsNull() { regEscapedDfpropCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     */
    public void setEscapedDfpropCode_IsNotNull() { regEscapedDfpropCode(CK_ISNN, DOBJ); }

    protected void regEscapedDfpropCode(ConditionKey k, Object v) { regQ(k, v, getCValueEscapedDfpropCode(), "ESCAPED_DFPROP_CODE"); }
    abstract protected ConditionValue getCValueEscapedDfpropCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @param escapedDfpropName The value of escapedDfpropName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropName_Equal(String escapedDfpropName) {
        doSetEscapedDfpropName_Equal(fRES(escapedDfpropName));
    }

    protected void doSetEscapedDfpropName_Equal(String escapedDfpropName) {
        regEscapedDfpropName(CK_EQ, escapedDfpropName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @param escapedDfpropName The value of escapedDfpropName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropName_NotEqual(String escapedDfpropName) {
        doSetEscapedDfpropName_NotEqual(fRES(escapedDfpropName));
    }

    protected void doSetEscapedDfpropName_NotEqual(String escapedDfpropName) {
        regEscapedDfpropName(CK_NES, escapedDfpropName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @param escapedDfpropNameList The collection of escapedDfpropName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropName_InScope(Collection<String> escapedDfpropNameList) {
        doSetEscapedDfpropName_InScope(escapedDfpropNameList);
    }

    public void doSetEscapedDfpropName_InScope(Collection<String> escapedDfpropNameList) {
        regINS(CK_INS, cTL(escapedDfpropNameList), getCValueEscapedDfpropName(), "ESCAPED_DFPROP_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @param escapedDfpropNameList The collection of escapedDfpropName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropName_NotInScope(Collection<String> escapedDfpropNameList) {
        doSetEscapedDfpropName_NotInScope(escapedDfpropNameList);
    }

    public void doSetEscapedDfpropName_NotInScope(Collection<String> escapedDfpropNameList) {
        regINS(CK_NINS, cTL(escapedDfpropNameList), getCValueEscapedDfpropName(), "ESCAPED_DFPROP_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @param escapedDfpropName The value of escapedDfpropName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedDfpropName_PrefixSearch(String escapedDfpropName) {
        setEscapedDfpropName_LikeSearch(escapedDfpropName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)} <br />
     * <pre>e.g. setEscapedDfpropName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param escapedDfpropName The value of escapedDfpropName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEscapedDfpropName_LikeSearch(String escapedDfpropName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(escapedDfpropName), getCValueEscapedDfpropName(), "ESCAPED_DFPROP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @param escapedDfpropName The value of escapedDfpropName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEscapedDfpropName_NotLikeSearch(String escapedDfpropName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(escapedDfpropName), getCValueEscapedDfpropName(), "ESCAPED_DFPROP_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     */
    public void setEscapedDfpropName_IsNull() { regEscapedDfpropName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     */
    public void setEscapedDfpropName_IsNullOrEmpty() { regEscapedDfpropName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     */
    public void setEscapedDfpropName_IsNotNull() { regEscapedDfpropName(CK_ISNN, DOBJ); }

    protected void regEscapedDfpropName(ConditionKey k, Object v) { regQ(k, v, getCValueEscapedDfpropName(), "ESCAPED_DFPROP_NAME"); }
    abstract protected ConditionValue getCValueEscapedDfpropName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void query(WhiteEscapedDfpropCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedDfpropCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void query(WhiteEscapedDfpropCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedDfpropCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void query(WhiteEscapedDfpropCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedDfpropCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void query(WhiteEscapedDfpropCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedDfpropCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void query(WhiteEscapedDfpropCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedDfpropCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void query(WhiteEscapedDfpropCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedDfpropCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteEscapedDfpropCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteEscapedDfpropCB>(new HpSSQSetupper<WhiteEscapedDfpropCB>() {
            public void setup(String function, SubQuery<WhiteEscapedDfpropCB> subQuery, HpSSQOption<WhiteEscapedDfpropCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteEscapedDfpropCB> subQuery, String operand, HpSSQOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("subQuery<WhiteEscapedDfpropCB>", subQuery);
        WhiteEscapedDfpropCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteEscapedDfpropCQ subQuery);

    protected WhiteEscapedDfpropCB xcreateScalarConditionCB() {
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteEscapedDfpropCB xcreateScalarConditionPartitionByCB() {
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteEscapedDfpropCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteEscapedDfpropCB>", subQuery);
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "ESCAPED_DFPROP_CODE", "ESCAPED_DFPROP_CODE", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteEscapedDfpropCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteEscapedDfpropCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteEscapedDfpropCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteEscapedDfpropCB>(new HpQDRSetupper<WhiteEscapedDfpropCB>() {
            public void setup(String function, SubQuery<WhiteEscapedDfpropCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteEscapedDfpropCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteEscapedDfpropCB>", subQuery);
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "ESCAPED_DFPROP_CODE", "ESCAPED_DFPROP_CODE", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteEscapedDfpropCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteEscapedDfpropCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteEscapedDfpropCB>", subQuery);
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteEscapedDfpropCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteEscapedDfpropCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteEscapedDfpropCB>", subQuery);
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteEscapedDfpropCQ subQuery);

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
    protected String xabCB() { return WhiteEscapedDfpropCB.class.getName(); }
    protected String xabCQ() { return WhiteEscapedDfpropCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
