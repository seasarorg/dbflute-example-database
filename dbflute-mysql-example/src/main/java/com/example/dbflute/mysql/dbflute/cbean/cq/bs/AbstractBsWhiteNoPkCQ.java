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
 * The abstract condition-query of white_no_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteNoPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteNoPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_no_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as equal. (NullAllowed: if null, no condition)
     */
    public void setNoPkId_Equal(Long noPkId) {
        doSetNoPkId_Equal(noPkId);
    }

    protected void doSetNoPkId_Equal(Long noPkId) {
        regNoPkId(CK_EQ, noPkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNoPkId_GreaterThan(Long noPkId) {
        regNoPkId(CK_GT, noPkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNoPkId_LessThan(Long noPkId) {
        regNoPkId(CK_LT, noPkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNoPkId_GreaterEqual(Long noPkId) {
        regNoPkId(CK_GE, noPkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNoPkId_LessEqual(Long noPkId) {
        regNoPkId(CK_LE, noPkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of noPkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of noPkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoPkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNoPkId(), "NO_PK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkIdList The collection of noPkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkId_InScope(Collection<Long> noPkIdList) {
        doSetNoPkId_InScope(noPkIdList);
    }

    protected void doSetNoPkId_InScope(Collection<Long> noPkIdList) {
        regINS(CK_INS, cTL(noPkIdList), getCValueNoPkId(), "NO_PK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkIdList The collection of noPkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkId_NotInScope(Collection<Long> noPkIdList) {
        doSetNoPkId_NotInScope(noPkIdList);
    }

    protected void doSetNoPkId_NotInScope(Collection<Long> noPkIdList) {
        regINS(CK_NINS, cTL(noPkIdList), getCValueNoPkId(), "NO_PK_ID");
    }

    protected void regNoPkId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNoPkId(), "NO_PK_ID"); }
    protected abstract ConditionValue getCValueNoPkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkName_Equal(String noPkName) {
        doSetNoPkName_Equal(fRES(noPkName));
    }

    protected void doSetNoPkName_Equal(String noPkName) {
        regNoPkName(CK_EQ, noPkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkName_NotEqual(String noPkName) {
        doSetNoPkName_NotEqual(fRES(noPkName));
    }

    protected void doSetNoPkName_NotEqual(String noPkName) {
        regNoPkName(CK_NES, noPkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkNameList The collection of noPkName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkName_InScope(Collection<String> noPkNameList) {
        doSetNoPkName_InScope(noPkNameList);
    }

    public void doSetNoPkName_InScope(Collection<String> noPkNameList) {
        regINS(CK_INS, cTL(noPkNameList), getCValueNoPkName(), "NO_PK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkNameList The collection of noPkName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkName_NotInScope(Collection<String> noPkNameList) {
        doSetNoPkName_NotInScope(noPkNameList);
    }

    public void doSetNoPkName_NotInScope(Collection<String> noPkNameList) {
        regINS(CK_NINS, cTL(noPkNameList), getCValueNoPkName(), "NO_PK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkName_PrefixSearch(String noPkName) {
        setNoPkName_LikeSearch(noPkName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)} <br />
     * <pre>e.g. setNoPkName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noPkName The value of noPkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoPkName_LikeSearch(String noPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noPkName), getCValueNoPkName(), "NO_PK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoPkName_NotLikeSearch(String noPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noPkName), getCValueNoPkName(), "NO_PK_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     */
    public void setNoPkName_IsNull() { regNoPkName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     */
    public void setNoPkName_IsNullOrEmpty() { regNoPkName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     */
    public void setNoPkName_IsNotNull() { regNoPkName(CK_ISNN, DOBJ); }

    protected void regNoPkName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNoPkName(), "NO_PK_NAME"); }
    protected abstract ConditionValue getCValueNoPkName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setNoPkInteger_Equal(Integer noPkInteger) {
        doSetNoPkInteger_Equal(noPkInteger);
    }

    protected void doSetNoPkInteger_Equal(Integer noPkInteger) {
        regNoPkInteger(CK_EQ, noPkInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNoPkInteger_GreaterThan(Integer noPkInteger) {
        regNoPkInteger(CK_GT, noPkInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNoPkInteger_LessThan(Integer noPkInteger) {
        regNoPkInteger(CK_LT, noPkInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNoPkInteger_GreaterEqual(Integer noPkInteger) {
        regNoPkInteger(CK_GE, noPkInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNoPkInteger_LessEqual(Integer noPkInteger) {
        regNoPkInteger(CK_LE, noPkInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param minNumber The min number of noPkInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of noPkInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoPkInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNoPkInteger(), "NO_PK_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkIntegerList The collection of noPkInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkInteger_InScope(Collection<Integer> noPkIntegerList) {
        doSetNoPkInteger_InScope(noPkIntegerList);
    }

    protected void doSetNoPkInteger_InScope(Collection<Integer> noPkIntegerList) {
        regINS(CK_INS, cTL(noPkIntegerList), getCValueNoPkInteger(), "NO_PK_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkIntegerList The collection of noPkInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoPkInteger_NotInScope(Collection<Integer> noPkIntegerList) {
        doSetNoPkInteger_NotInScope(noPkIntegerList);
    }

    protected void doSetNoPkInteger_NotInScope(Collection<Integer> noPkIntegerList) {
        regINS(CK_NINS, cTL(noPkIntegerList), getCValueNoPkInteger(), "NO_PK_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     */
    public void setNoPkInteger_IsNull() { regNoPkInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NO_PK_INTEGER: {INT(10)}
     */
    public void setNoPkInteger_IsNotNull() { regNoPkInteger(CK_ISNN, DOBJ); }

    protected void regNoPkInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNoPkInteger(), "NO_PK_INTEGER"); }
    protected abstract ConditionValue getCValueNoPkInteger();

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
    protected WhiteNoPkCB newMyCB() {
        return new WhiteNoPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteNoPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
