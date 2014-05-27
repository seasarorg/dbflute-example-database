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
 * The abstract condition-query of white_binary.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBinaryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBinaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_binary";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as equal. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_Equal(Long binaryId) {
        doSetBinaryId_Equal(binaryId);
    }

    protected void doSetBinaryId_Equal(Long binaryId) {
        regBinaryId(CK_EQ, binaryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_GreaterThan(Long binaryId) {
        regBinaryId(CK_GT, binaryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_LessThan(Long binaryId) {
        regBinaryId(CK_LT, binaryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_GreaterEqual(Long binaryId) {
        regBinaryId(CK_GE, binaryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_LessEqual(Long binaryId) {
        regBinaryId(CK_LE, binaryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of binaryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of binaryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBinaryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBinaryId(), "BINARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryIdList The collection of binaryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBinaryId_InScope(Collection<Long> binaryIdList) {
        doSetBinaryId_InScope(binaryIdList);
    }

    protected void doSetBinaryId_InScope(Collection<Long> binaryIdList) {
        regINS(CK_INS, cTL(binaryIdList), getCValueBinaryId(), "BINARY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryIdList The collection of binaryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBinaryId_NotInScope(Collection<Long> binaryIdList) {
        doSetBinaryId_NotInScope(binaryIdList);
    }

    protected void doSetBinaryId_NotInScope(Collection<Long> binaryIdList) {
        regINS(CK_NINS, cTL(binaryIdList), getCValueBinaryId(), "BINARY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBinaryId_IsNull() { regBinaryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBinaryId_IsNotNull() { regBinaryId(CK_ISNN, DOBJ); }

    protected void regBinaryId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBinaryId(), "BINARY_ID"); }
    protected abstract ConditionValue getCValueBinaryId();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BINARY_DATA: {BINARY(1)}
     */
    public void setBinaryData_IsNull() { regBinaryData(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BINARY_DATA: {BINARY(1)}
     */
    public void setBinaryData_IsNotNull() { regBinaryData(CK_ISNN, DOBJ); }

    protected void regBinaryData(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBinaryData(), "BINARY_DATA"); }
    protected abstract ConditionValue getCValueBinaryData();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BLOB_DATA: {BLOB(65535)}
     */
    public void setBlobData_IsNull() { regBlobData(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BLOB_DATA: {BLOB(65535)}
     */
    public void setBlobData_IsNotNull() { regBlobData(CK_ISNN, DOBJ); }

    protected void regBlobData(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBlobData(), "BLOB_DATA"); }
    protected abstract ConditionValue getCValueBlobData();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteBinaryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteBinaryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteBinaryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteBinaryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteBinaryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteBinaryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBinaryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteBinaryCQ sq);

    protected WhiteBinaryCB xcreateScalarConditionCB() {
        WhiteBinaryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBinaryCB xcreateScalarConditionPartitionByCB() {
        WhiteBinaryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBinaryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "BINARY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBinaryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBinaryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBinaryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BINARY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBinaryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBinaryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBinaryCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteBinaryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteBinaryCQ sq);

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
    protected WhiteBinaryCB newMyCB() {
        return new WhiteBinaryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteBinaryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
