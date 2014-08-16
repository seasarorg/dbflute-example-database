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
    public AbstractBsWhiteNoPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteNoPkCB&gt;() {
     *     public void query(WhiteNoPkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteNoPkCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteNoPkCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteNoPkCB&gt;() {
     *     public void query(WhiteNoPkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteNoPkCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteNoPkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteNoPkCB&gt;() {
     *     public void query(WhiteNoPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteNoPkCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteNoPkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteNoPkCB&gt;() {
     *     public void query(WhiteNoPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteNoPkCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteNoPkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteNoPkCB&gt;() {
     *     public void query(WhiteNoPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteNoPkCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteNoPkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteNoPkCB&gt;() {
     *     public void query(WhiteNoPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteNoPkCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteNoPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNoPkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteNoPkCQ sq);

    protected WhiteNoPkCB xcreateScalarConditionCB() {
        WhiteNoPkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteNoPkCB xcreateScalarConditionPartitionByCB() {
        WhiteNoPkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteNoPkCB newMyCB() {
        return new WhiteNoPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteNoPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
