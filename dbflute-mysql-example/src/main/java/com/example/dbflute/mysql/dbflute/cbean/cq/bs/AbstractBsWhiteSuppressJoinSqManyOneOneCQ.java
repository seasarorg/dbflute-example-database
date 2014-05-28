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
 * The abstract condition-query of white_suppress_join_sq_many_one_one.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqManyOneOneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqManyOneOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_many_one_one";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as equal. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_Equal(Integer manyOneOneId) {
        doSetManyOneOneId_Equal(manyOneOneId);
    }

    protected void doSetManyOneOneId_Equal(Integer manyOneOneId) {
        regManyOneOneId(CK_EQ, manyOneOneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_GreaterThan(Integer manyOneOneId) {
        regManyOneOneId(CK_GT, manyOneOneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_LessThan(Integer manyOneOneId) {
        regManyOneOneId(CK_LT, manyOneOneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_GreaterEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_GE, manyOneOneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setManyOneOneId_LessEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_LE, manyOneOneId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyOneOneId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of manyOneOneId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyOneOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueManyOneOneId(), "MANY_ONE_ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneIdList The collection of manyOneOneId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneId_InScope(Collection<Integer> manyOneOneIdList) {
        doSetManyOneOneId_InScope(manyOneOneIdList);
    }

    protected void doSetManyOneOneId_InScope(Collection<Integer> manyOneOneIdList) {
        regINS(CK_INS, cTL(manyOneOneIdList), getCValueManyOneOneId(), "MANY_ONE_ONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneIdList The collection of manyOneOneId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneId_NotInScope(Collection<Integer> manyOneOneIdList) {
        doSetManyOneOneId_NotInScope(manyOneOneIdList);
    }

    protected void doSetManyOneOneId_NotInScope(Collection<Integer> manyOneOneIdList) {
        regINS(CK_NINS, cTL(manyOneOneIdList), getCValueManyOneOneId(), "MANY_ONE_ONE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setManyOneOneId_IsNull() { regManyOneOneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setManyOneOneId_IsNotNull() { regManyOneOneId(CK_ISNN, DOBJ); }

    protected void regManyOneOneId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyOneOneId(), "MANY_ONE_ONE_ID"); }
    protected abstract ConditionValue getCValueManyOneOneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneName_Equal(String manyOneOneName) {
        doSetManyOneOneName_Equal(fRES(manyOneOneName));
    }

    protected void doSetManyOneOneName_Equal(String manyOneOneName) {
        regManyOneOneName(CK_EQ, manyOneOneName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneName_NotEqual(String manyOneOneName) {
        doSetManyOneOneName_NotEqual(fRES(manyOneOneName));
    }

    protected void doSetManyOneOneName_NotEqual(String manyOneOneName) {
        regManyOneOneName(CK_NES, manyOneOneName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneNameList The collection of manyOneOneName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneName_InScope(Collection<String> manyOneOneNameList) {
        doSetManyOneOneName_InScope(manyOneOneNameList);
    }

    public void doSetManyOneOneName_InScope(Collection<String> manyOneOneNameList) {
        regINS(CK_INS, cTL(manyOneOneNameList), getCValueManyOneOneName(), "MANY_ONE_ONE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneNameList The collection of manyOneOneName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneName_NotInScope(Collection<String> manyOneOneNameList) {
        doSetManyOneOneName_NotInScope(manyOneOneNameList);
    }

    public void doSetManyOneOneName_NotInScope(Collection<String> manyOneOneNameList) {
        regINS(CK_NINS, cTL(manyOneOneNameList), getCValueManyOneOneName(), "MANY_ONE_ONE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setManyOneOneName_PrefixSearch(String manyOneOneName) {
        setManyOneOneName_LikeSearch(manyOneOneName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setManyOneOneName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manyOneOneName The value of manyOneOneName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManyOneOneName_LikeSearch(String manyOneOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manyOneOneName), getCValueManyOneOneName(), "MANY_ONE_ONE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManyOneOneName_NotLikeSearch(String manyOneOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manyOneOneName), getCValueManyOneOneName(), "MANY_ONE_ONE_NAME", likeSearchOption);
    }

    protected void regManyOneOneName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueManyOneOneName(), "MANY_ONE_ONE_NAME"); }
    protected abstract ConditionValue getCValueManyOneOneName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteSuppressJoinSqManyOneOneCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteSuppressJoinSqManyOneOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteSuppressJoinSqManyOneOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteSuppressJoinSqManyOneOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteSuppressJoinSqManyOneOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteSuppressJoinSqManyOneOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneOneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqManyOneOneCQ sq);

    protected WhiteSuppressJoinSqManyOneOneCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqManyOneOneCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqManyOneOneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MANY_ONE_ONE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyOneOneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqManyOneOneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqManyOneOneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MANY_ONE_ONE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqManyOneOneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqManyOneOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqManyOneOneCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressJoinSqManyOneOneCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSuppressJoinSqManyOneOneCQ sq);

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
    protected WhiteSuppressJoinSqManyOneOneCB newMyCB() {
        return new WhiteSuppressJoinSqManyOneOneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSuppressJoinSqManyOneOneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
