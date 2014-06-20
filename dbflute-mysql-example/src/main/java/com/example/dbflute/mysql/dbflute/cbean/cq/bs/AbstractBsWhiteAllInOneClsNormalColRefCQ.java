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
 * The abstract condition-query of white_all_in_one_cls_normal_col_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsNormalColRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsNormalColRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_normal_col_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefId The value of clsRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setClsRefId_Equal(Integer clsRefId) {
        doSetClsRefId_Equal(clsRefId);
    }

    protected void doSetClsRefId_Equal(Integer clsRefId) {
        regClsRefId(CK_EQ, clsRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefId The value of clsRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setClsRefId_GreaterThan(Integer clsRefId) {
        regClsRefId(CK_GT, clsRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefId The value of clsRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setClsRefId_LessThan(Integer clsRefId) {
        regClsRefId(CK_LT, clsRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefId The value of clsRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setClsRefId_GreaterEqual(Integer clsRefId) {
        regClsRefId(CK_GE, clsRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefId The value of clsRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setClsRefId_LessEqual(Integer clsRefId) {
        regClsRefId(CK_LE, clsRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param minNumber The min number of clsRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of clsRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClsRefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueClsRefId(), "CLS_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefIdList The collection of clsRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsRefId_InScope(Collection<Integer> clsRefIdList) {
        doSetClsRefId_InScope(clsRefIdList);
    }

    protected void doSetClsRefId_InScope(Collection<Integer> clsRefIdList) {
        regINS(CK_INS, cTL(clsRefIdList), getCValueClsRefId(), "CLS_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @param clsRefIdList The collection of clsRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsRefId_NotInScope(Collection<Integer> clsRefIdList) {
        doSetClsRefId_NotInScope(clsRefIdList);
    }

    protected void doSetClsRefId_NotInScope(Collection<Integer> clsRefIdList) {
        regINS(CK_NINS, cTL(clsRefIdList), getCValueClsRefId(), "CLS_REF_ID");
    }

    protected void regClsRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClsRefId(), "CLS_REF_ID"); }
    protected abstract ConditionValue getCValueClsRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_Equal(String fooCode) {
        doSetFooCode_Equal(fRES(fooCode));
    }

    protected void doSetFooCode_Equal(String fooCode) {
        regFooCode(CK_EQ, fooCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_NotEqual(String fooCode) {
        doSetFooCode_NotEqual(fRES(fooCode));
    }

    protected void doSetFooCode_NotEqual(String fooCode) {
        regFooCode(CK_NES, fooCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCodeList The collection of fooCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_InScope(Collection<String> fooCodeList) {
        doSetFooCode_InScope(fooCodeList);
    }

    public void doSetFooCode_InScope(Collection<String> fooCodeList) {
        regINS(CK_INS, cTL(fooCodeList), getCValueFooCode(), "FOO_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCodeList The collection of fooCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_NotInScope(Collection<String> fooCodeList) {
        doSetFooCode_NotInScope(fooCodeList);
    }

    public void doSetFooCode_NotInScope(Collection<String> fooCodeList) {
        regINS(CK_NINS, cTL(fooCodeList), getCValueFooCode(), "FOO_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_PrefixSearch(String fooCode) {
        setFooCode_LikeSearch(fooCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * <pre>e.g. setFooCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fooCode The value of fooCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFooCode_LikeSearch(String fooCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fooCode), getCValueFooCode(), "FOO_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFooCode_NotLikeSearch(String fooCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fooCode), getCValueFooCode(), "FOO_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setFooCode_IsNull() { regFooCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setFooCode_IsNotNull() { regFooCode(CK_ISNN, DOBJ); }

    protected void regFooCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFooCode(), "FOO_CODE"); }
    protected abstract ConditionValue getCValueFooCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_Equal(String barCode) {
        doSetBarCode_Equal(fRES(barCode));
    }

    protected void doSetBarCode_Equal(String barCode) {
        regBarCode(CK_EQ, barCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_NotEqual(String barCode) {
        doSetBarCode_NotEqual(fRES(barCode));
    }

    protected void doSetBarCode_NotEqual(String barCode) {
        regBarCode(CK_NES, barCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCodeList The collection of barCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_InScope(Collection<String> barCodeList) {
        doSetBarCode_InScope(barCodeList);
    }

    public void doSetBarCode_InScope(Collection<String> barCodeList) {
        regINS(CK_INS, cTL(barCodeList), getCValueBarCode(), "BAR_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCodeList The collection of barCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_NotInScope(Collection<String> barCodeList) {
        doSetBarCode_NotInScope(barCodeList);
    }

    public void doSetBarCode_NotInScope(Collection<String> barCodeList) {
        regINS(CK_NINS, cTL(barCodeList), getCValueBarCode(), "BAR_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_PrefixSearch(String barCode) {
        setBarCode_LikeSearch(barCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * <pre>e.g. setBarCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param barCode The value of barCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBarCode_LikeSearch(String barCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(barCode), getCValueBarCode(), "BAR_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBarCode_NotLikeSearch(String barCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(barCode), getCValueBarCode(), "BAR_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setBarCode_IsNull() { regBarCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setBarCode_IsNotNull() { regBarCode(CK_ISNN, DOBJ); }

    protected void regBarCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBarCode(), "BAR_CODE"); }
    protected abstract ConditionValue getCValueBarCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_Equal(String quxCode) {
        doSetQuxCode_Equal(fRES(quxCode));
    }

    protected void doSetQuxCode_Equal(String quxCode) {
        regQuxCode(CK_EQ, quxCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_NotEqual(String quxCode) {
        doSetQuxCode_NotEqual(fRES(quxCode));
    }

    protected void doSetQuxCode_NotEqual(String quxCode) {
        regQuxCode(CK_NES, quxCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCodeList The collection of quxCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_InScope(Collection<String> quxCodeList) {
        doSetQuxCode_InScope(quxCodeList);
    }

    public void doSetQuxCode_InScope(Collection<String> quxCodeList) {
        regINS(CK_INS, cTL(quxCodeList), getCValueQuxCode(), "QUX_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCodeList The collection of quxCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_NotInScope(Collection<String> quxCodeList) {
        doSetQuxCode_NotInScope(quxCodeList);
    }

    public void doSetQuxCode_NotInScope(Collection<String> quxCodeList) {
        regINS(CK_NINS, cTL(quxCodeList), getCValueQuxCode(), "QUX_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_PrefixSearch(String quxCode) {
        setQuxCode_LikeSearch(quxCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setQuxCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param quxCode The value of quxCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQuxCode_LikeSearch(String quxCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(quxCode), getCValueQuxCode(), "QUX_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQuxCode_NotLikeSearch(String quxCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(quxCode), getCValueQuxCode(), "QUX_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setQuxCode_IsNull() { regQuxCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setQuxCode_IsNotNull() { regQuxCode(CK_ISNN, DOBJ); }

    protected void regQuxCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueQuxCode(), "QUX_CODE"); }
    protected abstract ConditionValue getCValueQuxCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void query(WhiteAllInOneClsNormalColRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsNormalColRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteAllInOneClsNormalColRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void query(WhiteAllInOneClsNormalColRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsNormalColRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteAllInOneClsNormalColRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void query(WhiteAllInOneClsNormalColRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsNormalColRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteAllInOneClsNormalColRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void query(WhiteAllInOneClsNormalColRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsNormalColRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteAllInOneClsNormalColRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void query(WhiteAllInOneClsNormalColRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsNormalColRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteAllInOneClsNormalColRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void query(WhiteAllInOneClsNormalColRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsNormalColRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteAllInOneClsNormalColRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsNormalColRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteAllInOneClsNormalColRefCQ sq);

    protected WhiteAllInOneClsNormalColRefCB xcreateScalarConditionCB() {
        WhiteAllInOneClsNormalColRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteAllInOneClsNormalColRefCB xcreateScalarConditionPartitionByCB() {
        WhiteAllInOneClsNormalColRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteAllInOneClsNormalColRefCB newMyCB() {
        return new WhiteAllInOneClsNormalColRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteAllInOneClsNormalColRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
