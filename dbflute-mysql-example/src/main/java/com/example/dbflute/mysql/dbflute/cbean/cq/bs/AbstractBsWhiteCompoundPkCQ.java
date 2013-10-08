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
 * The abstract condition-query of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstId The value of pkFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_Equal(Integer pkFirstId) {
        doSetPkFirstId_Equal(pkFirstId);
    }

    protected void doSetPkFirstId_Equal(Integer pkFirstId) {
        regPkFirstId(CK_EQ, pkFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstId The value of pkFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_GreaterThan(Integer pkFirstId) {
        regPkFirstId(CK_GT, pkFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstId The value of pkFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_LessThan(Integer pkFirstId) {
        regPkFirstId(CK_LT, pkFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstId The value of pkFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_GreaterEqual(Integer pkFirstId) {
        regPkFirstId(CK_GE, pkFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstId The value of pkFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_LessEqual(Integer pkFirstId) {
        regPkFirstId(CK_LE, pkFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of pkFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of pkFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePkFirstId(), "PK_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstIdList The collection of pkFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkFirstId_InScope(Collection<Integer> pkFirstIdList) {
        doSetPkFirstId_InScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_InScope(Collection<Integer> pkFirstIdList) {
        regINS(CK_INS, cTL(pkFirstIdList), getCValuePkFirstId(), "PK_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @param pkFirstIdList The collection of pkFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkFirstId_NotInScope(Collection<Integer> pkFirstIdList) {
        doSetPkFirstId_NotInScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_NotInScope(Collection<Integer> pkFirstIdList) {
        regINS(CK_NINS, cTL(pkFirstIdList), getCValuePkFirstId(), "PK_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setPkFirstId_IsNull() { regPkFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setPkFirstId_IsNotNull() { regPkFirstId(CK_ISNN, DOBJ); }

    protected void regPkFirstId(ConditionKey k, Object v) { regQ(k, v, getCValuePkFirstId(), "PK_FIRST_ID"); }
    abstract protected ConditionValue getCValuePkFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondId The value of pkSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_Equal(Integer pkSecondId) {
        doSetPkSecondId_Equal(pkSecondId);
    }

    protected void doSetPkSecondId_Equal(Integer pkSecondId) {
        regPkSecondId(CK_EQ, pkSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondId The value of pkSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_GreaterThan(Integer pkSecondId) {
        regPkSecondId(CK_GT, pkSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondId The value of pkSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_LessThan(Integer pkSecondId) {
        regPkSecondId(CK_LT, pkSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondId The value of pkSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_GreaterEqual(Integer pkSecondId) {
        regPkSecondId(CK_GE, pkSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondId The value of pkSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_LessEqual(Integer pkSecondId) {
        regPkSecondId(CK_LE, pkSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of pkSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of pkSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePkSecondId(), "PK_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondIdList The collection of pkSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkSecondId_InScope(Collection<Integer> pkSecondIdList) {
        doSetPkSecondId_InScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_InScope(Collection<Integer> pkSecondIdList) {
        regINS(CK_INS, cTL(pkSecondIdList), getCValuePkSecondId(), "PK_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @param pkSecondIdList The collection of pkSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkSecondId_NotInScope(Collection<Integer> pkSecondIdList) {
        doSetPkSecondId_NotInScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_NotInScope(Collection<Integer> pkSecondIdList) {
        regINS(CK_NINS, cTL(pkSecondIdList), getCValuePkSecondId(), "PK_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setPkSecondId_IsNull() { regPkSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setPkSecondId_IsNotNull() { regPkSecondId(CK_ISNN, DOBJ); }

    protected void regPkSecondId(ConditionKey k, Object v) { regQ(k, v, getCValuePkSecondId(), "PK_SECOND_ID"); }
    abstract protected ConditionValue getCValuePkSecondId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_Equal(String pkName) {
        doSetPkName_Equal(fRES(pkName));
    }

    protected void doSetPkName_Equal(String pkName) {
        regPkName(CK_EQ, pkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_NotEqual(String pkName) {
        doSetPkName_NotEqual(fRES(pkName));
    }

    protected void doSetPkName_NotEqual(String pkName) {
        regPkName(CK_NES, pkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkNameList The collection of pkName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_InScope(Collection<String> pkNameList) {
        doSetPkName_InScope(pkNameList);
    }

    public void doSetPkName_InScope(Collection<String> pkNameList) {
        regINS(CK_INS, cTL(pkNameList), getCValuePkName(), "PK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkNameList The collection of pkName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_NotInScope(Collection<String> pkNameList) {
        doSetPkName_NotInScope(pkNameList);
    }

    public void doSetPkName_NotInScope(Collection<String> pkNameList) {
        regINS(CK_NINS, cTL(pkNameList), getCValuePkName(), "PK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_PrefixSearch(String pkName) {
        setPkName_LikeSearch(pkName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setPkName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pkName The value of pkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPkName_LikeSearch(String pkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pkName), getCValuePkName(), "PK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPkName_NotLikeSearch(String pkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pkName), getCValuePkName(), "PK_NAME", likeSearchOption);
    }

    protected void regPkName(ConditionKey k, Object v) { regQ(k, v, getCValuePkName(), "PK_NAME"); }
    abstract protected ConditionValue getCValuePkName();

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
    protected String xabCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
