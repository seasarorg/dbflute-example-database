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
 * The abstract condition-query of white_deprecated_cls_element.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDeprecatedClsElementCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDeprecatedClsElementCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_deprecated_cls_element";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType}
     * @param deprecatedClsElementCode The value of deprecatedClsElementCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementCode_Equal(String deprecatedClsElementCode) {
        doSetDeprecatedClsElementCode_Equal(fRES(deprecatedClsElementCode));
    }

    /**
     * Equal(=). As DeprecatedMapCollaborationType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setDeprecatedClsElementCode_Equal_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType cdef) {
        doSetDeprecatedClsElementCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As FooName (FOO). And OnlyOnceRegistered. <br />
     * FooName
     */
    public void setDeprecatedClsElementCode_Equal_FooName() {
        setDeprecatedClsElementCode_Equal_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.FooName);
    }

    /**
     * Equal(=). As BarName (BAR). And OnlyOnceRegistered. <br />
     * BarName: here here (deprecated: test of deprecated)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_Equal_BarName() {
        setDeprecatedClsElementCode_Equal_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.BarName);
    }

    /**
     * Equal(=). As QuxName (QUX). And OnlyOnceRegistered. <br />
     * QuxName: (deprecated: no original comment)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_Equal_QuxName() {
        setDeprecatedClsElementCode_Equal_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.QuxName);
    }

    protected void doSetDeprecatedClsElementCode_Equal(String deprecatedClsElementCode) {
        regDeprecatedClsElementCode(CK_EQ, deprecatedClsElementCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType}
     * @param deprecatedClsElementCode The value of deprecatedClsElementCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementCode_NotEqual(String deprecatedClsElementCode) {
        doSetDeprecatedClsElementCode_NotEqual(fRES(deprecatedClsElementCode));
    }

    /**
     * NotEqual(&lt;&gt;). As DeprecatedMapCollaborationType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setDeprecatedClsElementCode_NotEqual_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType cdef) {
        doSetDeprecatedClsElementCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As FooName (FOO). And OnlyOnceRegistered. <br />
     * FooName
     */
    public void setDeprecatedClsElementCode_NotEqual_FooName() {
        setDeprecatedClsElementCode_NotEqual_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.FooName);
    }

    /**
     * NotEqual(&lt;&gt;). As BarName (BAR). And OnlyOnceRegistered. <br />
     * BarName: here here (deprecated: test of deprecated)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_NotEqual_BarName() {
        setDeprecatedClsElementCode_NotEqual_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.BarName);
    }

    /**
     * NotEqual(&lt;&gt;). As QuxName (QUX). And OnlyOnceRegistered. <br />
     * QuxName: (deprecated: no original comment)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_NotEqual_QuxName() {
        setDeprecatedClsElementCode_NotEqual_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.QuxName);
    }

    protected void doSetDeprecatedClsElementCode_NotEqual(String deprecatedClsElementCode) {
        regDeprecatedClsElementCode(CK_NES, deprecatedClsElementCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType}
     * @param deprecatedClsElementCodeList The collection of deprecatedClsElementCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementCode_InScope(Collection<String> deprecatedClsElementCodeList) {
        doSetDeprecatedClsElementCode_InScope(deprecatedClsElementCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As DeprecatedMapCollaborationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementCode_InScope_AsDeprecatedMapCollaborationType(Collection<CDef.DeprecatedMapCollaborationType> cdefList) {
        doSetDeprecatedClsElementCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As DeprecatedMapCollaborationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * has deprecated element <br />
     * contains deprecated element here
     */
    public void setDeprecatedClsElementCode_InScope_ContainsDeprecated() {
        setDeprecatedClsElementCode_InScope_AsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.listOfContainsDeprecated());
    }

    public void doSetDeprecatedClsElementCode_InScope(Collection<String> deprecatedClsElementCodeList) {
        regINS(CK_INS, cTL(deprecatedClsElementCodeList), getCValueDeprecatedClsElementCode(), "DEPRECATED_CLS_ELEMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType}
     * @param deprecatedClsElementCodeList The collection of deprecatedClsElementCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementCode_NotInScope(Collection<String> deprecatedClsElementCodeList) {
        doSetDeprecatedClsElementCode_NotInScope(deprecatedClsElementCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DeprecatedMapCollaborationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementCode_NotInScope_AsDeprecatedMapCollaborationType(Collection<CDef.DeprecatedMapCollaborationType> cdefList) {
        doSetDeprecatedClsElementCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetDeprecatedClsElementCode_NotInScope(Collection<String> deprecatedClsElementCodeList) {
        regINS(CK_NINS, cTL(deprecatedClsElementCodeList), getCValueDeprecatedClsElementCode(), "DEPRECATED_CLS_ELEMENT_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType}
     */
    public void setDeprecatedClsElementCode_IsNull() { regDeprecatedClsElementCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType}
     */
    public void setDeprecatedClsElementCode_IsNotNull() { regDeprecatedClsElementCode(CK_ISNN, DOBJ); }

    protected void regDeprecatedClsElementCode(ConditionKey k, Object v) { regQ(k, v, getCValueDeprecatedClsElementCode(), "DEPRECATED_CLS_ELEMENT_CODE"); }
    abstract protected ConditionValue getCValueDeprecatedClsElementCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     * @param deprecatedClsElementName The value of deprecatedClsElementName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementName_Equal(String deprecatedClsElementName) {
        doSetDeprecatedClsElementName_Equal(fRES(deprecatedClsElementName));
    }

    protected void doSetDeprecatedClsElementName_Equal(String deprecatedClsElementName) {
        regDeprecatedClsElementName(CK_EQ, deprecatedClsElementName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     * @param deprecatedClsElementName The value of deprecatedClsElementName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementName_NotEqual(String deprecatedClsElementName) {
        doSetDeprecatedClsElementName_NotEqual(fRES(deprecatedClsElementName));
    }

    protected void doSetDeprecatedClsElementName_NotEqual(String deprecatedClsElementName) {
        regDeprecatedClsElementName(CK_NES, deprecatedClsElementName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     * @param deprecatedClsElementNameList The collection of deprecatedClsElementName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementName_InScope(Collection<String> deprecatedClsElementNameList) {
        doSetDeprecatedClsElementName_InScope(deprecatedClsElementNameList);
    }

    public void doSetDeprecatedClsElementName_InScope(Collection<String> deprecatedClsElementNameList) {
        regINS(CK_INS, cTL(deprecatedClsElementNameList), getCValueDeprecatedClsElementName(), "DEPRECATED_CLS_ELEMENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     * @param deprecatedClsElementNameList The collection of deprecatedClsElementName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementName_NotInScope(Collection<String> deprecatedClsElementNameList) {
        doSetDeprecatedClsElementName_NotInScope(deprecatedClsElementNameList);
    }

    public void doSetDeprecatedClsElementName_NotInScope(Collection<String> deprecatedClsElementNameList) {
        regINS(CK_NINS, cTL(deprecatedClsElementNameList), getCValueDeprecatedClsElementName(), "DEPRECATED_CLS_ELEMENT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     * @param deprecatedClsElementName The value of deprecatedClsElementName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeprecatedClsElementName_PrefixSearch(String deprecatedClsElementName) {
        setDeprecatedClsElementName_LikeSearch(deprecatedClsElementName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} <br />
     * <pre>e.g. setDeprecatedClsElementName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deprecatedClsElementName The value of deprecatedClsElementName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeprecatedClsElementName_LikeSearch(String deprecatedClsElementName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deprecatedClsElementName), getCValueDeprecatedClsElementName(), "DEPRECATED_CLS_ELEMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     * @param deprecatedClsElementName The value of deprecatedClsElementName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeprecatedClsElementName_NotLikeSearch(String deprecatedClsElementName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deprecatedClsElementName), getCValueDeprecatedClsElementName(), "DEPRECATED_CLS_ELEMENT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     */
    public void setDeprecatedClsElementName_IsNull() { regDeprecatedClsElementName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     */
    public void setDeprecatedClsElementName_IsNullOrEmpty() { regDeprecatedClsElementName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)}
     */
    public void setDeprecatedClsElementName_IsNotNull() { regDeprecatedClsElementName(CK_ISNN, DOBJ); }

    protected void regDeprecatedClsElementName(ConditionKey k, Object v) { regQ(k, v, getCValueDeprecatedClsElementName(), "DEPRECATED_CLS_ELEMENT_NAME"); }
    abstract protected ConditionValue getCValueDeprecatedClsElementName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void query(WhiteDeprecatedClsElementCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDeprecatedClsElementCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void query(WhiteDeprecatedClsElementCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDeprecatedClsElementCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void query(WhiteDeprecatedClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDeprecatedClsElementCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void query(WhiteDeprecatedClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDeprecatedClsElementCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void query(WhiteDeprecatedClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDeprecatedClsElementCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void query(WhiteDeprecatedClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDeprecatedClsElementCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteDeprecatedClsElementCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteDeprecatedClsElementCB>(new HpSSQSetupper<WhiteDeprecatedClsElementCB>() {
            public void setup(String function, SubQuery<WhiteDeprecatedClsElementCB> subQuery, HpSSQOption<WhiteDeprecatedClsElementCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteDeprecatedClsElementCB> subQuery, String operand, HpSSQOption<WhiteDeprecatedClsElementCB> option) {
        assertObjectNotNull("subQuery<WhiteDeprecatedClsElementCB>", subQuery);
        WhiteDeprecatedClsElementCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteDeprecatedClsElementCQ subQuery);

    protected WhiteDeprecatedClsElementCB xcreateScalarConditionCB() {
        WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteDeprecatedClsElementCB xcreateScalarConditionPartitionByCB() {
        WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteDeprecatedClsElementCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteDeprecatedClsElementCB>", subQuery);
        WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "DEPRECATED_CLS_ELEMENT_CODE", "DEPRECATED_CLS_ELEMENT_CODE", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDeprecatedClsElementCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDeprecatedClsElementCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteDeprecatedClsElementCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteDeprecatedClsElementCB>(new HpQDRSetupper<WhiteDeprecatedClsElementCB>() {
            public void setup(String function, SubQuery<WhiteDeprecatedClsElementCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteDeprecatedClsElementCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteDeprecatedClsElementCB>", subQuery);
        WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "DEPRECATED_CLS_ELEMENT_CODE", "DEPRECATED_CLS_ELEMENT_CODE", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteDeprecatedClsElementCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDeprecatedClsElementCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteDeprecatedClsElementCB>", subQuery);
        WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteDeprecatedClsElementCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteDeprecatedClsElementCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteDeprecatedClsElementCB>", subQuery);
        WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteDeprecatedClsElementCQ subQuery);

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
    protected String xabCB() { return WhiteDeprecatedClsElementCB.class.getName(); }
    protected String xabCQ() { return WhiteDeprecatedClsElementCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
