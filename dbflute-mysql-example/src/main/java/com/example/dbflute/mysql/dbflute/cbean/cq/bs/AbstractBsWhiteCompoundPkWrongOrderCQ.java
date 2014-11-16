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
 * The abstract condition-query of white_compound_pk_wrong_order.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkWrongOrderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkWrongOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_wrong_order";
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondId The value of secondId as equal. (NullAllowed: if null, no condition)
     */
    public void setSecondId_Equal(Integer secondId) {
        doSetSecondId_Equal(secondId);
    }

    protected void doSetSecondId_Equal(Integer secondId) {
        regSecondId(CK_EQ, secondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondId The value of secondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSecondId_GreaterThan(Integer secondId) {
        regSecondId(CK_GT, secondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondId The value of secondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSecondId_LessThan(Integer secondId) {
        regSecondId(CK_LT, secondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondId The value of secondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSecondId_GreaterEqual(Integer secondId) {
        regSecondId(CK_GE, secondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondId The value of secondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSecondId_LessEqual(Integer secondId) {
        regSecondId(CK_LE, secondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of secondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of secondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSecondId(), "SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondIdList The collection of secondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondId_InScope(Collection<Integer> secondIdList) {
        doSetSecondId_InScope(secondIdList);
    }

    protected void doSetSecondId_InScope(Collection<Integer> secondIdList) {
        regINS(CK_INS, cTL(secondIdList), getCValueSecondId(), "SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @param secondIdList The collection of secondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondId_NotInScope(Collection<Integer> secondIdList) {
        doSetSecondId_NotInScope(secondIdList);
    }

    protected void doSetSecondId_NotInScope(Collection<Integer> secondIdList) {
        regINS(CK_NINS, cTL(secondIdList), getCValueSecondId(), "SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setSecondId_IsNull() { regSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setSecondId_IsNotNull() { regSecondId(CK_ISNN, DOBJ); }

    protected void regSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecondId(), "SECOND_ID"); }
    protected abstract ConditionValue getCValueSecondId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdId The value of thirdId as equal. (NullAllowed: if null, no condition)
     */
    public void setThirdId_Equal(Integer thirdId) {
        doSetThirdId_Equal(thirdId);
    }

    protected void doSetThirdId_Equal(Integer thirdId) {
        regThirdId(CK_EQ, thirdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdId The value of thirdId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setThirdId_GreaterThan(Integer thirdId) {
        regThirdId(CK_GT, thirdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdId The value of thirdId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setThirdId_LessThan(Integer thirdId) {
        regThirdId(CK_LT, thirdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdId The value of thirdId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setThirdId_GreaterEqual(Integer thirdId) {
        regThirdId(CK_GE, thirdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdId The value of thirdId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setThirdId_LessEqual(Integer thirdId) {
        regThirdId(CK_LE, thirdId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of thirdId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of thirdId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setThirdId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueThirdId(), "THIRD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdIdList The collection of thirdId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setThirdId_InScope(Collection<Integer> thirdIdList) {
        doSetThirdId_InScope(thirdIdList);
    }

    protected void doSetThirdId_InScope(Collection<Integer> thirdIdList) {
        regINS(CK_INS, cTL(thirdIdList), getCValueThirdId(), "THIRD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @param thirdIdList The collection of thirdId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setThirdId_NotInScope(Collection<Integer> thirdIdList) {
        doSetThirdId_NotInScope(thirdIdList);
    }

    protected void doSetThirdId_NotInScope(Collection<Integer> thirdIdList) {
        regINS(CK_NINS, cTL(thirdIdList), getCValueThirdId(), "THIRD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     */
    public void setThirdId_IsNull() { regThirdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * THIRD_ID: {PK, NotNull, INT(10)}
     */
    public void setThirdId_IsNotNull() { regThirdId(CK_ISNN, DOBJ); }

    protected void regThirdId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueThirdId(), "THIRD_ID"); }
    protected abstract ConditionValue getCValueThirdId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @param wrongName The value of wrongName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_Equal(String wrongName) {
        doSetWrongName_Equal(fRES(wrongName));
    }

    protected void doSetWrongName_Equal(String wrongName) {
        regWrongName(CK_EQ, wrongName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @param wrongName The value of wrongName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_NotEqual(String wrongName) {
        doSetWrongName_NotEqual(fRES(wrongName));
    }

    protected void doSetWrongName_NotEqual(String wrongName) {
        regWrongName(CK_NES, wrongName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @param wrongNameList The collection of wrongName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_InScope(Collection<String> wrongNameList) {
        doSetWrongName_InScope(wrongNameList);
    }

    public void doSetWrongName_InScope(Collection<String> wrongNameList) {
        regINS(CK_INS, cTL(wrongNameList), getCValueWrongName(), "WRONG_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @param wrongNameList The collection of wrongName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_NotInScope(Collection<String> wrongNameList) {
        doSetWrongName_NotInScope(wrongNameList);
    }

    public void doSetWrongName_NotInScope(Collection<String> wrongNameList) {
        regINS(CK_NINS, cTL(wrongNameList), getCValueWrongName(), "WRONG_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @param wrongName The value of wrongName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_PrefixSearch(String wrongName) {
        setWrongName_LikeSearch(wrongName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setWrongName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrongName The value of wrongName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrongName_LikeSearch(String wrongName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrongName), getCValueWrongName(), "WRONG_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @param wrongName The value of wrongName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrongName_NotLikeSearch(String wrongName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrongName), getCValueWrongName(), "WRONG_NAME", likeSearchOption);
    }

    protected void regWrongName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWrongName(), "WRONG_NAME"); }
    protected abstract ConditionValue getCValueWrongName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteCompoundPkWrongOrderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkWrongOrderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkWrongOrderCQ sq);

    protected WhiteCompoundPkWrongOrderCB xcreateScalarConditionCB() {
        WhiteCompoundPkWrongOrderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkWrongOrderCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkWrongOrderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteCompoundPkWrongOrderCB newMyCB() {
        return new WhiteCompoundPkWrongOrderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkWrongOrderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
