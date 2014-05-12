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
 * The abstract condition-query of white_all_in_one_cls_element.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsElementCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsElementCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_element";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
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
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
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
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
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
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
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
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCode The value of clsCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_PrefixSearch(String clsCategoryCode) {
        setClsCategoryCode_LikeSearch(clsCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} <br />
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
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCode The value of clsCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsCategoryCode_NotLikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsCategoryCode), getCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLS_CATEGORY_CODE from white_all_in_one_cls_category where ...)} <br />
     * white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'.
     * @param subQuery The sub-query of WhiteAllInOneClsCategory for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteAllInOneClsCategory(SubQuery<WhiteAllInOneClsCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_InScopeRelation_WhiteAllInOneClsCategory(cb.query());
        registerInScopeRelation(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsCategory");
    }
    public abstract String keepClsCategoryCode_InScopeRelation_WhiteAllInOneClsCategory(WhiteAllInOneClsCategoryCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLS_CATEGORY_CODE from white_all_in_one_cls_category where ...)} <br />
     * white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'.
     * @param subQuery The sub-query of WhiteAllInOneClsCategory for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteAllInOneClsCategory(SubQuery<WhiteAllInOneClsCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategory(cb.query());
        registerNotInScopeRelation(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsCategory");
    }
    public abstract String keepClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategory(WhiteAllInOneClsCategoryCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     */
    public void setClsCategoryCode_IsNull() { regClsCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     */
    public void setClsCategoryCode_IsNotNull() { regClsCategoryCode(CK_ISNN, DOBJ); }

    protected void regClsCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClsCategoryCode(), "CLS_CATEGORY_CODE"); }
    protected abstract ConditionValue getCValueClsCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_Equal(String clsElementCode) {
        doSetClsElementCode_Equal(fRES(clsElementCode));
    }

    protected void doSetClsElementCode_Equal(String clsElementCode) {
        regClsElementCode(CK_EQ, clsElementCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_NotEqual(String clsElementCode) {
        doSetClsElementCode_NotEqual(fRES(clsElementCode));
    }

    protected void doSetClsElementCode_NotEqual(String clsElementCode) {
        regClsElementCode(CK_NES, clsElementCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCodeList The collection of clsElementCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_InScope(Collection<String> clsElementCodeList) {
        doSetClsElementCode_InScope(clsElementCodeList);
    }

    public void doSetClsElementCode_InScope(Collection<String> clsElementCodeList) {
        regINS(CK_INS, cTL(clsElementCodeList), getCValueClsElementCode(), "CLS_ELEMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCodeList The collection of clsElementCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_NotInScope(Collection<String> clsElementCodeList) {
        doSetClsElementCode_NotInScope(clsElementCodeList);
    }

    public void doSetClsElementCode_NotInScope(Collection<String> clsElementCodeList) {
        regINS(CK_NINS, cTL(clsElementCodeList), getCValueClsElementCode(), "CLS_ELEMENT_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_PrefixSearch(String clsElementCode) {
        setClsElementCode_LikeSearch(clsElementCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setClsElementCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsElementCode The value of clsElementCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsElementCode_LikeSearch(String clsElementCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsElementCode), getCValueClsElementCode(), "CLS_ELEMENT_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsElementCode_NotLikeSearch(String clsElementCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsElementCode), getCValueClsElementCode(), "CLS_ELEMENT_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsElementCode_IsNull() { regClsElementCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsElementCode_IsNotNull() { regClsElementCode(CK_ISNN, DOBJ); }

    protected void regClsElementCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClsElementCode(), "CLS_ELEMENT_CODE"); }
    protected abstract ConditionValue getCValueClsElementCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_Equal(String clsElementName) {
        doSetClsElementName_Equal(fRES(clsElementName));
    }

    protected void doSetClsElementName_Equal(String clsElementName) {
        regClsElementName(CK_EQ, clsElementName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_NotEqual(String clsElementName) {
        doSetClsElementName_NotEqual(fRES(clsElementName));
    }

    protected void doSetClsElementName_NotEqual(String clsElementName) {
        regClsElementName(CK_NES, clsElementName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementNameList The collection of clsElementName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_InScope(Collection<String> clsElementNameList) {
        doSetClsElementName_InScope(clsElementNameList);
    }

    public void doSetClsElementName_InScope(Collection<String> clsElementNameList) {
        regINS(CK_INS, cTL(clsElementNameList), getCValueClsElementName(), "CLS_ELEMENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementNameList The collection of clsElementName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_NotInScope(Collection<String> clsElementNameList) {
        doSetClsElementName_NotInScope(clsElementNameList);
    }

    public void doSetClsElementName_NotInScope(Collection<String> clsElementNameList) {
        regINS(CK_NINS, cTL(clsElementNameList), getCValueClsElementName(), "CLS_ELEMENT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_PrefixSearch(String clsElementName) {
        setClsElementName_LikeSearch(clsElementName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)} <br />
     * <pre>e.g. setClsElementName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsElementName The value of clsElementName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsElementName_LikeSearch(String clsElementName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsElementName), getCValueClsElementName(), "CLS_ELEMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsElementName_NotLikeSearch(String clsElementName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsElementName), getCValueClsElementName(), "CLS_ELEMENT_NAME", likeSearchOption);
    }

    protected void regClsElementName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClsElementName(), "CLS_ELEMENT_NAME"); }
    protected abstract ConditionValue getCValueClsElementName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_Equal(String attributeExp) {
        doSetAttributeExp_Equal(fRES(attributeExp));
    }

    protected void doSetAttributeExp_Equal(String attributeExp) {
        regAttributeExp(CK_EQ, attributeExp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_NotEqual(String attributeExp) {
        doSetAttributeExp_NotEqual(fRES(attributeExp));
    }

    protected void doSetAttributeExp_NotEqual(String attributeExp) {
        regAttributeExp(CK_NES, attributeExp);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExpList The collection of attributeExp as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_InScope(Collection<String> attributeExpList) {
        doSetAttributeExp_InScope(attributeExpList);
    }

    public void doSetAttributeExp_InScope(Collection<String> attributeExpList) {
        regINS(CK_INS, cTL(attributeExpList), getCValueAttributeExp(), "ATTRIBUTE_EXP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExpList The collection of attributeExp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_NotInScope(Collection<String> attributeExpList) {
        doSetAttributeExp_NotInScope(attributeExpList);
    }

    public void doSetAttributeExp_NotInScope(Collection<String> attributeExpList) {
        regINS(CK_NINS, cTL(attributeExpList), getCValueAttributeExp(), "ATTRIBUTE_EXP");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_PrefixSearch(String attributeExp) {
        setAttributeExp_LikeSearch(attributeExp, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)} <br />
     * <pre>e.g. setAttributeExp_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attributeExp The value of attributeExp as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttributeExp_LikeSearch(String attributeExp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attributeExp), getCValueAttributeExp(), "ATTRIBUTE_EXP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttributeExp_NotLikeSearch(String attributeExp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attributeExp), getCValueAttributeExp(), "ATTRIBUTE_EXP", likeSearchOption);
    }

    protected void regAttributeExp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAttributeExp(), "ATTRIBUTE_EXP"); }
    protected abstract ConditionValue getCValueAttributeExp();

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
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteAllInOneClsElementCB newMyCB() {
        return new WhiteAllInOneClsElementCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteAllInOneClsElementCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
