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
 * The abstract condition-query of white_all_in_one_cls_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsCompoundPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsCompoundPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

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
     * <pre>e.g. setFooCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regFooCode(ConditionKey k, Object v) { regQ(k, v, getCValueFooCode(), "FOO_CODE"); }
    abstract protected ConditionValue getCValueFooCode();

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
     * <pre>e.g. setBarCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regBarCode(ConditionKey k, Object v) { regQ(k, v, getCValueBarCode(), "BAR_CODE"); }
    abstract protected ConditionValue getCValueBarCode();

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
     * <pre>e.g. setQuxCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regQuxCode(ConditionKey k, Object v) { regQ(k, v, getCValueQuxCode(), "QUX_CODE"); }
    abstract protected ConditionValue getCValueQuxCode();

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
    protected String xabCB() { return WhiteAllInOneClsCompoundPkRefCB.class.getName(); }
    protected String xabCQ() { return WhiteAllInOneClsCompoundPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
