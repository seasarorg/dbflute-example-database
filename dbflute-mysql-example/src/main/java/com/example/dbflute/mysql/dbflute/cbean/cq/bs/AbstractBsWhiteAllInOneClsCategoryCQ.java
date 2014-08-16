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
 * The abstract condition-query of white_all_in_one_cls_category.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_category";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_Equal(String clsCategoryCode) {
        doSetClsCategoryCode_Equal(fRES(clsCategoryCode));
    }

    protected void doSetClsCategoryCode_Equal(String clsCategoryCode) {
        regClsCategoryCode(CK_EQ, clsCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_NotEqual(String clsCategoryCode) {
        doSetClsCategoryCode_NotEqual(fRES(clsCategoryCode));
    }

    protected void doSetClsCategoryCode_NotEqual(String clsCategoryCode) {
        regClsCategoryCode(CK_NES, clsCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCodeList The collection of clsCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_InScope(Collection<String> clsCategoryCodeList) {
        doSetClsCategoryCode_InScope(clsCategoryCodeList);
    }

    public void doSetClsCategoryCode_InScope(Collection<String> clsCategoryCodeList) {
        regINS(CK_INS, cTL(clsCategoryCodeList), getCValueClsCategoryCode(), "CLS_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCodeList The collection of clsCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_NotInScope(Collection<String> clsCategoryCodeList) {
        doSetClsCategoryCode_NotInScope(clsCategoryCodeList);
    }

    public void doSetClsCategoryCode_NotInScope(Collection<String> clsCategoryCodeList) {
        regINS(CK_NINS, cTL(clsCategoryCodeList), getCValueClsCategoryCode(), "CLS_CATEGORY_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_PrefixSearch(String clsCategoryCode) {
        setClsCategoryCode_LikeSearch(clsCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setClsCategoryCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsCategoryCode The value of clsCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsCategoryCode_LikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsCategoryCode), getCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsCategoryCode_NotLikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsCategoryCode), getCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select CLS_CATEGORY_CODE from white_all_in_one_cls_element where ...)} <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteAllInOneClsElementList</span>(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteAllInOneClsElementList for 'exists'. (NotNull)
     */
    public void existsWhiteAllInOneClsElementList(SubQuery<WhiteAllInOneClsElementCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList(cb.query());
        registerExistsReferrer(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList");
    }
    public abstract String keepClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select CLS_CATEGORY_CODE from white_all_in_one_cls_element where ...)} <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteAllInOneClsElementList</span>(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteAllInOneClsElementList(SubQuery<WhiteAllInOneClsElementCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList");
    }
    public abstract String keepClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLS_CATEGORY_CODE from white_all_in_one_cls_element where ...)} <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * @param subQuery The sub-query of WhiteAllInOneClsElementList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteAllInOneClsElementList(SubQuery<WhiteAllInOneClsElementCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_InScopeRelation_WhiteAllInOneClsElementList(cb.query());
        registerInScopeRelation(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList");
    }
    public abstract String keepClsCategoryCode_InScopeRelation_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLS_CATEGORY_CODE from white_all_in_one_cls_element where ...)} <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * @param subQuery The sub-query of WhiteAllInOneClsElementList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteAllInOneClsElementList(SubQuery<WhiteAllInOneClsElementCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementList(cb.query());
        registerNotInScopeRelation(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList");
    }
    public abstract String keepClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    public void xsderiveWhiteAllInOneClsElementList(String fn, SubQuery<WhiteAllInOneClsElementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList", al, op);
    }
    public abstract String keepClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_all_in_one_cls_element where ...)} <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteAllInOneClsElementList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteAllInOneClsElementCB> derivedWhiteAllInOneClsElementList() {
        return xcreateQDRFunctionWhiteAllInOneClsElementList();
    }
    protected HpQDRFunction<WhiteAllInOneClsElementCB> xcreateQDRFunctionWhiteAllInOneClsElementList() {
        return new HpQDRFunction<WhiteAllInOneClsElementCB>(new HpQDRSetupper<WhiteAllInOneClsElementCB>() {
            public void setup(String fn, SubQuery<WhiteAllInOneClsElementCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteAllInOneClsElementList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteAllInOneClsElementList(String fn, SubQuery<WhiteAllInOneClsElementCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList(cb.query()); String prpp = keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", sqpp, "whiteAllInOneClsElementList", rd, vl, prpp, op);
    }
    public abstract String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);
    public abstract String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsCategoryCode_IsNull() { regClsCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsCategoryCode_IsNotNull() { regClsCategoryCode(CK_ISNN, DOBJ); }

    protected void regClsCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClsCategoryCode(), "CLS_CATEGORY_CODE"); }
    protected abstract ConditionValue getCValueClsCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryName_Equal(String clsCategoryName) {
        doSetClsCategoryName_Equal(fRES(clsCategoryName));
    }

    protected void doSetClsCategoryName_Equal(String clsCategoryName) {
        regClsCategoryName(CK_EQ, clsCategoryName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryName_NotEqual(String clsCategoryName) {
        doSetClsCategoryName_NotEqual(fRES(clsCategoryName));
    }

    protected void doSetClsCategoryName_NotEqual(String clsCategoryName) {
        regClsCategoryName(CK_NES, clsCategoryName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryNameList The collection of clsCategoryName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryName_InScope(Collection<String> clsCategoryNameList) {
        doSetClsCategoryName_InScope(clsCategoryNameList);
    }

    public void doSetClsCategoryName_InScope(Collection<String> clsCategoryNameList) {
        regINS(CK_INS, cTL(clsCategoryNameList), getCValueClsCategoryName(), "CLS_CATEGORY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryNameList The collection of clsCategoryName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryName_NotInScope(Collection<String> clsCategoryNameList) {
        doSetClsCategoryName_NotInScope(clsCategoryNameList);
    }

    public void doSetClsCategoryName_NotInScope(Collection<String> clsCategoryNameList) {
        regINS(CK_NINS, cTL(clsCategoryNameList), getCValueClsCategoryName(), "CLS_CATEGORY_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryName_PrefixSearch(String clsCategoryName) {
        setClsCategoryName_LikeSearch(clsCategoryName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)} <br />
     * <pre>e.g. setClsCategoryName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsCategoryName The value of clsCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsCategoryName_LikeSearch(String clsCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsCategoryName), getCValueClsCategoryName(), "CLS_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsCategoryName_NotLikeSearch(String clsCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsCategoryName), getCValueClsCategoryName(), "CLS_CATEGORY_NAME", likeSearchOption);
    }

    protected void regClsCategoryName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClsCategoryName(), "CLS_CATEGORY_NAME"); }
    protected abstract ConditionValue getCValueClsCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @param description The value of description as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @param descriptionList The collection of description as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    public void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), getCValueDescription(), "DESCRIPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @param descriptionList The collection of description as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    public void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), getCValueDescription(), "DESCRIPTION");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @param description The value of description as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_PrefixSearch(String description) {
        setDescription_LikeSearch(description, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue getCValueDescription();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCategoryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteAllInOneClsCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCategoryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteAllInOneClsCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCategoryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteAllInOneClsCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCategoryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteAllInOneClsCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCategoryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteAllInOneClsCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCategoryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteAllInOneClsCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCategoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteAllInOneClsCategoryCQ sq);

    protected WhiteAllInOneClsCategoryCB xcreateScalarConditionCB() {
        WhiteAllInOneClsCategoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteAllInOneClsCategoryCB xcreateScalarConditionPartitionByCB() {
        WhiteAllInOneClsCategoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteAllInOneClsCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "CLS_CATEGORY_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteAllInOneClsCategoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteAllInOneClsCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteAllInOneClsCategoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLS_CATEGORY_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteAllInOneClsCategoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteAllInOneClsCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteAllInOneClsCategoryCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteAllInOneClsCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteAllInOneClsCategoryCQ sq);

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
    protected WhiteAllInOneClsCategoryCB newMyCB() {
        return new WhiteAllInOneClsCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteAllInOneClsCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
