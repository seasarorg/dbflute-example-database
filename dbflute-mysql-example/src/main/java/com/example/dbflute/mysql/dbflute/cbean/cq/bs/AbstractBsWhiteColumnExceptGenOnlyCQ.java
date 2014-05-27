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
 * The abstract condition-query of white_column_except_gen_only.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteColumnExceptGenOnlyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteColumnExceptGenOnlyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_column_except_gen_only";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as equal. (NullAllowed: if null, no condition)
     */
    public void setGenOnlyId_Equal(Long genOnlyId) {
        doSetGenOnlyId_Equal(genOnlyId);
    }

    protected void doSetGenOnlyId_Equal(Long genOnlyId) {
        regGenOnlyId(CK_EQ, genOnlyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setGenOnlyId_GreaterThan(Long genOnlyId) {
        regGenOnlyId(CK_GT, genOnlyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setGenOnlyId_LessThan(Long genOnlyId) {
        regGenOnlyId(CK_LT, genOnlyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setGenOnlyId_GreaterEqual(Long genOnlyId) {
        regGenOnlyId(CK_GE, genOnlyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setGenOnlyId_LessEqual(Long genOnlyId) {
        regGenOnlyId(CK_LE, genOnlyId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of genOnlyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of genOnlyId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGenOnlyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueGenOnlyId(), "GEN_ONLY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyIdList The collection of genOnlyId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyId_InScope(Collection<Long> genOnlyIdList) {
        doSetGenOnlyId_InScope(genOnlyIdList);
    }

    protected void doSetGenOnlyId_InScope(Collection<Long> genOnlyIdList) {
        regINS(CK_INS, cTL(genOnlyIdList), getCValueGenOnlyId(), "GEN_ONLY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param genOnlyIdList The collection of genOnlyId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyId_NotInScope(Collection<Long> genOnlyIdList) {
        doSetGenOnlyId_NotInScope(genOnlyIdList);
    }

    protected void doSetGenOnlyId_NotInScope(Collection<Long> genOnlyIdList) {
        regINS(CK_NINS, cTL(genOnlyIdList), getCValueGenOnlyId(), "GEN_ONLY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenOnlyId_IsNull() { regGenOnlyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenOnlyId_IsNotNull() { regGenOnlyId(CK_ISNN, DOBJ); }

    protected void regGenOnlyId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenOnlyId(), "GEN_ONLY_ID"); }
    protected abstract ConditionValue getCValueGenOnlyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param genOnlyName The value of genOnlyName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyName_Equal(String genOnlyName) {
        doSetGenOnlyName_Equal(fRES(genOnlyName));
    }

    protected void doSetGenOnlyName_Equal(String genOnlyName) {
        regGenOnlyName(CK_EQ, genOnlyName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param genOnlyName The value of genOnlyName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyName_NotEqual(String genOnlyName) {
        doSetGenOnlyName_NotEqual(fRES(genOnlyName));
    }

    protected void doSetGenOnlyName_NotEqual(String genOnlyName) {
        regGenOnlyName(CK_NES, genOnlyName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param genOnlyNameList The collection of genOnlyName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyName_InScope(Collection<String> genOnlyNameList) {
        doSetGenOnlyName_InScope(genOnlyNameList);
    }

    public void doSetGenOnlyName_InScope(Collection<String> genOnlyNameList) {
        regINS(CK_INS, cTL(genOnlyNameList), getCValueGenOnlyName(), "GEN_ONLY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param genOnlyNameList The collection of genOnlyName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyName_NotInScope(Collection<String> genOnlyNameList) {
        doSetGenOnlyName_NotInScope(genOnlyNameList);
    }

    public void doSetGenOnlyName_NotInScope(Collection<String> genOnlyNameList) {
        regINS(CK_NINS, cTL(genOnlyNameList), getCValueGenOnlyName(), "GEN_ONLY_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param genOnlyName The value of genOnlyName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyName_PrefixSearch(String genOnlyName) {
        setGenOnlyName_LikeSearch(genOnlyName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setGenOnlyName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genOnlyName The value of genOnlyName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenOnlyName_LikeSearch(String genOnlyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genOnlyName), getCValueGenOnlyName(), "GEN_ONLY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GEN_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param genOnlyName The value of genOnlyName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenOnlyName_NotLikeSearch(String genOnlyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genOnlyName), getCValueGenOnlyName(), "GEN_ONLY_NAME", likeSearchOption);
    }

    protected void regGenOnlyName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenOnlyName(), "GEN_ONLY_NAME"); }
    protected abstract ConditionValue getCValueGenOnlyName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void query(WhiteColumnExceptGenOnlyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptGenOnlyCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteColumnExceptGenOnlyCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void query(WhiteColumnExceptGenOnlyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptGenOnlyCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteColumnExceptGenOnlyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void query(WhiteColumnExceptGenOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptGenOnlyCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteColumnExceptGenOnlyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void query(WhiteColumnExceptGenOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptGenOnlyCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteColumnExceptGenOnlyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void query(WhiteColumnExceptGenOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptGenOnlyCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteColumnExceptGenOnlyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void query(WhiteColumnExceptGenOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteColumnExceptGenOnlyCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteColumnExceptGenOnlyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteColumnExceptGenOnlyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteColumnExceptGenOnlyCQ sq);

    protected WhiteColumnExceptGenOnlyCB xcreateScalarConditionCB() {
        WhiteColumnExceptGenOnlyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteColumnExceptGenOnlyCB xcreateScalarConditionPartitionByCB() {
        WhiteColumnExceptGenOnlyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteColumnExceptGenOnlyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "GEN_ONLY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteColumnExceptGenOnlyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteColumnExceptGenOnlyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteColumnExceptGenOnlyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GEN_ONLY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteColumnExceptGenOnlyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteColumnExceptGenOnlyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteColumnExceptGenOnlyCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteColumnExceptGenOnlyCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteColumnExceptGenOnlyCQ sq);

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
    protected WhiteColumnExceptGenOnlyCB newMyCB() {
        return new WhiteColumnExceptGenOnlyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteColumnExceptGenOnlyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
