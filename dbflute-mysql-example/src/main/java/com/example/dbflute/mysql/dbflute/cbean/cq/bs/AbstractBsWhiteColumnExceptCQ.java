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
 * The abstract condition-query of white_column_except.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteColumnExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteColumnExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_column_except";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnId The value of exceptColumnId as equal. (NullAllowed: if null, no condition)
     */
    public void setExceptColumnId_Equal(Long exceptColumnId) {
        doSetExceptColumnId_Equal(exceptColumnId);
    }

    protected void doSetExceptColumnId_Equal(Long exceptColumnId) {
        regExceptColumnId(CK_EQ, exceptColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnId The value of exceptColumnId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setExceptColumnId_GreaterThan(Long exceptColumnId) {
        regExceptColumnId(CK_GT, exceptColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnId The value of exceptColumnId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setExceptColumnId_LessThan(Long exceptColumnId) {
        regExceptColumnId(CK_LT, exceptColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnId The value of exceptColumnId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptColumnId_GreaterEqual(Long exceptColumnId) {
        regExceptColumnId(CK_GE, exceptColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnId The value of exceptColumnId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptColumnId_LessEqual(Long exceptColumnId) {
        regExceptColumnId(CK_LE, exceptColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of exceptColumnId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptColumnId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExceptColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExceptColumnId(), "EXCEPT_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnIdList The collection of exceptColumnId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptColumnId_InScope(Collection<Long> exceptColumnIdList) {
        doSetExceptColumnId_InScope(exceptColumnIdList);
    }

    protected void doSetExceptColumnId_InScope(Collection<Long> exceptColumnIdList) {
        regINS(CK_INS, cTL(exceptColumnIdList), getCValueExceptColumnId(), "EXCEPT_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptColumnIdList The collection of exceptColumnId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptColumnId_NotInScope(Collection<Long> exceptColumnIdList) {
        doSetExceptColumnId_NotInScope(exceptColumnIdList);
    }

    protected void doSetExceptColumnId_NotInScope(Collection<Long> exceptColumnIdList) {
        regINS(CK_NINS, cTL(exceptColumnIdList), getCValueExceptColumnId(), "EXCEPT_COLUMN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setExceptColumnId_IsNull() { regExceptColumnId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setExceptColumnId_IsNotNull() { regExceptColumnId(CK_ISNN, DOBJ); }

    protected void regExceptColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueExceptColumnId(), "EXCEPT_COLUMN_ID"); }
    protected abstract ConditionValue getCValueExceptColumnId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTest The value of columnExceptTest as equal. (NullAllowed: if null, no condition)
     */
    public void setColumnExceptTest_Equal(Integer columnExceptTest) {
        doSetColumnExceptTest_Equal(columnExceptTest);
    }

    protected void doSetColumnExceptTest_Equal(Integer columnExceptTest) {
        regColumnExceptTest(CK_EQ, columnExceptTest);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTest The value of columnExceptTest as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setColumnExceptTest_GreaterThan(Integer columnExceptTest) {
        regColumnExceptTest(CK_GT, columnExceptTest);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTest The value of columnExceptTest as lessThan. (NullAllowed: if null, no condition)
     */
    public void setColumnExceptTest_LessThan(Integer columnExceptTest) {
        regColumnExceptTest(CK_LT, columnExceptTest);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTest The value of columnExceptTest as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setColumnExceptTest_GreaterEqual(Integer columnExceptTest) {
        regColumnExceptTest(CK_GE, columnExceptTest);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTest The value of columnExceptTest as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setColumnExceptTest_LessEqual(Integer columnExceptTest) {
        regColumnExceptTest(CK_LE, columnExceptTest);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param minNumber The min number of columnExceptTest. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of columnExceptTest. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColumnExceptTest_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueColumnExceptTest(), "COLUMN_EXCEPT_TEST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTestList The collection of columnExceptTest as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setColumnExceptTest_InScope(Collection<Integer> columnExceptTestList) {
        doSetColumnExceptTest_InScope(columnExceptTestList);
    }

    protected void doSetColumnExceptTest_InScope(Collection<Integer> columnExceptTestList) {
        regINS(CK_INS, cTL(columnExceptTestList), getCValueColumnExceptTest(), "COLUMN_EXCEPT_TEST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     * @param columnExceptTestList The collection of columnExceptTest as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setColumnExceptTest_NotInScope(Collection<Integer> columnExceptTestList) {
        doSetColumnExceptTest_NotInScope(columnExceptTestList);
    }

    protected void doSetColumnExceptTest_NotInScope(Collection<Integer> columnExceptTestList) {
        regINS(CK_NINS, cTL(columnExceptTestList), getCValueColumnExceptTest(), "COLUMN_EXCEPT_TEST");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     */
    public void setColumnExceptTest_IsNull() { regColumnExceptTest(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * COLUMN_EXCEPT_TEST: {INT(10)}
     */
    public void setColumnExceptTest_IsNotNull() { regColumnExceptTest(CK_ISNN, DOBJ); }

    protected void regColumnExceptTest(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueColumnExceptTest(), "COLUMN_EXCEPT_TEST"); }
    protected abstract ConditionValue getCValueColumnExceptTest();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void query(WhiteColumnExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteColumnExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void query(WhiteColumnExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteColumnExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void query(WhiteColumnExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteColumnExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void query(WhiteColumnExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteColumnExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void query(WhiteColumnExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteColumnExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void query(WhiteColumnExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteColumnExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteColumnExceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteColumnExceptCQ sq);

    protected WhiteColumnExceptCB xcreateScalarConditionCB() {
        WhiteColumnExceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteColumnExceptCB xcreateScalarConditionPartitionByCB() {
        WhiteColumnExceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteColumnExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteColumnExceptCB cb = new WhiteColumnExceptCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "EXCEPT_COLUMN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteColumnExceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteColumnExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteColumnExceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteColumnExceptCB cb = new WhiteColumnExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EXCEPT_COLUMN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteColumnExceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteColumnExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteColumnExceptCB cb = new WhiteColumnExceptCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteColumnExceptCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteColumnExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteColumnExceptCB cb = new WhiteColumnExceptCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteColumnExceptCQ sq);

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
    protected WhiteColumnExceptCB newMyCB() {
        return new WhiteColumnExceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteColumnExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
