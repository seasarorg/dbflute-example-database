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
 * The abstract condition-query of white_perrotta_over_product_nested.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverProductNestedCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverProductNestedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_perrotta_over_product_nested";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
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
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
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
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
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
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
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
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCode The value of productNestedCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_PrefixSearch(String productNestedCode) {
        setProductNestedCode_LikeSearch(productNestedCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br />
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
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCode The value of productNestedCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNestedCode_NotLikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNestedCode), getCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PRODUCT_NESTED_CODE from white_perrotta_over_product where ...)} <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhitePerrottaOverProductList</span>(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePerrottaOverProductList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverProductList(SubQuery<WhitePerrottaOverProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_ExistsReferrer_WhitePerrottaOverProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList");
    }
    public abstract String keepProductNestedCode_ExistsReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PRODUCT_NESTED_CODE from white_perrotta_over_product where ...)} <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhitePerrottaOverProductList</span>(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverProductList(SubQuery<WhitePerrottaOverProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList");
    }
    public abstract String keepProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_NESTED_CODE from white_perrotta_over_product where ...)} <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverProductList for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePerrottaOverProductList(SubQuery<WhitePerrottaOverProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_InScopeRelation_WhitePerrottaOverProductList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList");
    }
    public abstract String keepProductNestedCode_InScopeRelation_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_NESTED_CODE from white_perrotta_over_product where ...)} <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePerrottaOverProductList(SubQuery<WhitePerrottaOverProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_NotInScopeRelation_WhitePerrottaOverProductList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList");
    }
    public abstract String keepProductNestedCode_NotInScopeRelation_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    public void xsderiveWhitePerrottaOverProductList(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepProductNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList", al, op);
    }
    public abstract String keepProductNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_product where ...)} <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhitePerrottaOverProductList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverProductCB> derivedWhitePerrottaOverProductList() {
        return xcreateQDRFunctionWhitePerrottaOverProductList();
    }
    protected HpQDRFunction<WhitePerrottaOverProductCB> xcreateQDRFunctionWhitePerrottaOverProductList() {
        return new HpQDRFunction<WhitePerrottaOverProductCB>(new HpQDRSetupper<WhitePerrottaOverProductCB>() {
            public void setup(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhitePerrottaOverProductList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhitePerrottaOverProductList(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList(cb.query()); String prpp = keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", sqpp, "whitePerrottaOverProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);
    public abstract String keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductNestedCode_IsNull() { regProductNestedCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductNestedCode_IsNotNull() { regProductNestedCode(CK_ISNN, DOBJ); }

    protected void regProductNestedCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductNestedCode(), "PRODUCT_NESTED_CODE"); }
    protected abstract ConditionValue getCValueProductNestedCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @param productNestedName The value of productNestedName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedName_Equal(String productNestedName) {
        doSetProductNestedName_Equal(fRES(productNestedName));
    }

    protected void doSetProductNestedName_Equal(String productNestedName) {
        regProductNestedName(CK_EQ, productNestedName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @param productNestedName The value of productNestedName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedName_NotEqual(String productNestedName) {
        doSetProductNestedName_NotEqual(fRES(productNestedName));
    }

    protected void doSetProductNestedName_NotEqual(String productNestedName) {
        regProductNestedName(CK_NES, productNestedName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @param productNestedNameList The collection of productNestedName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedName_InScope(Collection<String> productNestedNameList) {
        doSetProductNestedName_InScope(productNestedNameList);
    }

    public void doSetProductNestedName_InScope(Collection<String> productNestedNameList) {
        regINS(CK_INS, cTL(productNestedNameList), getCValueProductNestedName(), "PRODUCT_NESTED_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @param productNestedNameList The collection of productNestedName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedName_NotInScope(Collection<String> productNestedNameList) {
        doSetProductNestedName_NotInScope(productNestedNameList);
    }

    public void doSetProductNestedName_NotInScope(Collection<String> productNestedNameList) {
        regINS(CK_NINS, cTL(productNestedNameList), getCValueProductNestedName(), "PRODUCT_NESTED_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @param productNestedName The value of productNestedName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedName_PrefixSearch(String productNestedName) {
        setProductNestedName_LikeSearch(productNestedName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setProductNestedName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNestedName The value of productNestedName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNestedName_LikeSearch(String productNestedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNestedName), getCValueProductNestedName(), "PRODUCT_NESTED_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @param productNestedName The value of productNestedName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNestedName_NotLikeSearch(String productNestedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNestedName), getCValueProductNestedName(), "PRODUCT_NESTED_NAME", likeSearchOption);
    }

    protected void regProductNestedName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductNestedName(), "PRODUCT_NESTED_NAME"); }
    protected abstract ConditionValue getCValueProductNestedName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductNestedCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhitePerrottaOverProductNestedCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductNestedCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhitePerrottaOverProductNestedCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductNestedCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhitePerrottaOverProductNestedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductNestedCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhitePerrottaOverProductNestedCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductNestedCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhitePerrottaOverProductNestedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverProductNestedCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhitePerrottaOverProductNestedCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductNestedCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverProductNestedCQ sq);

    protected WhitePerrottaOverProductNestedCB xcreateScalarConditionCB() {
        WhitePerrottaOverProductNestedCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverProductNestedCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverProductNestedCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverProductNestedCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PRODUCT_NESTED_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverProductNestedCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverProductNestedCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverProductNestedCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_NESTED_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverProductNestedCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverProductNestedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverProductNestedCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePerrottaOverProductNestedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhitePerrottaOverProductNestedCQ sq);

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
    protected WhitePerrottaOverProductNestedCB newMyCB() {
        return new WhitePerrottaOverProductNestedCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverProductNestedCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
