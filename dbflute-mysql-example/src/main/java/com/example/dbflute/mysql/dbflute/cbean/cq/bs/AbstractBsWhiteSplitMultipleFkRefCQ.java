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
 * The abstract condition-query of white_split_multiple_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_split_multiple_fk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as equal. (NullAllowed: if null, no condition)
     */
    public void setFirstId_Equal(Integer firstId) {
        doSetFirstId_Equal(firstId);
    }

    protected void doSetFirstId_Equal(Integer firstId) {
        regFirstId(CK_EQ, firstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFirstId_GreaterThan(Integer firstId) {
        regFirstId(CK_GT, firstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFirstId_LessThan(Integer firstId) {
        regFirstId(CK_LT, firstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_GreaterEqual(Integer firstId) {
        regFirstId(CK_GE, firstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_LessEqual(Integer firstId) {
        regFirstId(CK_LE, firstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of firstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of firstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFirstId(), "FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstIdList The collection of firstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstId_InScope(Collection<Integer> firstIdList) {
        doSetFirstId_InScope(firstIdList);
    }

    protected void doSetFirstId_InScope(Collection<Integer> firstIdList) {
        regINS(CK_INS, cTL(firstIdList), getCValueFirstId(), "FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstIdList The collection of firstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstId_NotInScope(Collection<Integer> firstIdList) {
        doSetFirstId_NotInScope(firstIdList);
    }

    protected void doSetFirstId_NotInScope(Collection<Integer> firstIdList) {
        regINS(CK_NINS, cTL(firstIdList), getCValueFirstId(), "FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setFirstId_IsNull() { regFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setFirstId_IsNotNull() { regFirstId(CK_ISNN, DOBJ); }

    protected void regFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFirstId(), "FIRST_ID"); }
    protected abstract ConditionValue getCValueFirstId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_Equal(String secondCode) {
        doSetSecondCode_Equal(fRES(secondCode));
    }

    protected void doSetSecondCode_Equal(String secondCode) {
        regSecondCode(CK_EQ, secondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_NotEqual(String secondCode) {
        doSetSecondCode_NotEqual(fRES(secondCode));
    }

    protected void doSetSecondCode_NotEqual(String secondCode) {
        regSecondCode(CK_NES, secondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_InScope(Collection<String> secondCodeList) {
        doSetSecondCode_InScope(secondCodeList);
    }

    public void doSetSecondCode_InScope(Collection<String> secondCodeList) {
        regINS(CK_INS, cTL(secondCodeList), getCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_NotInScope(Collection<String> secondCodeList) {
        doSetSecondCode_NotInScope(secondCodeList);
    }

    public void doSetSecondCode_NotInScope(Collection<String> secondCodeList) {
        regINS(CK_NINS, cTL(secondCodeList), getCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondCode_PrefixSearch(String secondCode) {
        setSecondCode_LikeSearch(secondCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setSecondCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secondCode The value of secondCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecondCode_LikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secondCode), getCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecondCode_NotLikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secondCode), getCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecondCode_IsNull() { regSecondCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecondCode_IsNotNull() { regSecondCode(CK_ISNN, DOBJ); }

    protected void regSecondCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecondCode(), "SECOND_CODE"); }
    protected abstract ConditionValue getCValueSecondCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefName_Equal(String refName) {
        doSetRefName_Equal(fRES(refName));
    }

    protected void doSetRefName_Equal(String refName) {
        regRefName(CK_EQ, refName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefName_NotEqual(String refName) {
        doSetRefName_NotEqual(fRES(refName));
    }

    protected void doSetRefName_NotEqual(String refName) {
        regRefName(CK_NES, refName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refNameList The collection of refName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefName_InScope(Collection<String> refNameList) {
        doSetRefName_InScope(refNameList);
    }

    public void doSetRefName_InScope(Collection<String> refNameList) {
        regINS(CK_INS, cTL(refNameList), getCValueRefName(), "REF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refNameList The collection of refName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefName_NotInScope(Collection<String> refNameList) {
        doSetRefName_NotInScope(refNameList);
    }

    public void doSetRefName_NotInScope(Collection<String> refNameList) {
        regINS(CK_NINS, cTL(refNameList), getCValueRefName(), "REF_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefName_PrefixSearch(String refName) {
        setRefName_LikeSearch(refName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setRefName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refName The value of refName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefName_LikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refName), getCValueRefName(), "REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefName_NotLikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refName), getCValueRefName(), "REF_NAME", likeSearchOption);
    }

    protected void regRefName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefName(), "REF_NAME"); }
    protected abstract ConditionValue getCValueRefName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSplitMultipleFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSplitMultipleFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSplitMultipleFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSplitMultipleFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSplitMultipleFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSplitMultipleFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkRefCQ sq);

    protected WhiteSplitMultipleFkRefCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSplitMultipleFkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteSplitMultipleFkRefCB newMyCB() {
        return new WhiteSplitMultipleFkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSplitMultipleFkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
