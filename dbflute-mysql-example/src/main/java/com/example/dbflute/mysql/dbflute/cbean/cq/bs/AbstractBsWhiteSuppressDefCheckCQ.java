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
 * The abstract condition-query of white_suppress_def_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressDefCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressDefCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_def_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as equal. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_Equal(Long defCheckId) {
        doSetDefCheckId_Equal(defCheckId);
    }

    protected void doSetDefCheckId_Equal(Long defCheckId) {
        regDefCheckId(CK_EQ, defCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_GreaterThan(Long defCheckId) {
        regDefCheckId(CK_GT, defCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_LessThan(Long defCheckId) {
        regDefCheckId(CK_LT, defCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_GreaterEqual(Long defCheckId) {
        regDefCheckId(CK_GE, defCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_LessEqual(Long defCheckId) {
        regDefCheckId(CK_LE, defCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of defCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of defCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDefCheckId(), "DEF_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckIdList The collection of defCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckId_InScope(Collection<Long> defCheckIdList) {
        doSetDefCheckId_InScope(defCheckIdList);
    }

    protected void doSetDefCheckId_InScope(Collection<Long> defCheckIdList) {
        regINS(CK_INS, cTL(defCheckIdList), getCValueDefCheckId(), "DEF_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckIdList The collection of defCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckId_NotInScope(Collection<Long> defCheckIdList) {
        doSetDefCheckId_NotInScope(defCheckIdList);
    }

    protected void doSetDefCheckId_NotInScope(Collection<Long> defCheckIdList) {
        regINS(CK_NINS, cTL(defCheckIdList), getCValueDefCheckId(), "DEF_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDefCheckId_IsNull() { regDefCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDefCheckId_IsNotNull() { regDefCheckId(CK_ISNN, DOBJ); }

    protected void regDefCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDefCheckId(), "DEF_CHECK_ID"); }
    protected abstract ConditionValue getCValueDefCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_Equal(String defCheckName) {
        doSetDefCheckName_Equal(fRES(defCheckName));
    }

    protected void doSetDefCheckName_Equal(String defCheckName) {
        regDefCheckName(CK_EQ, defCheckName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_NotEqual(String defCheckName) {
        doSetDefCheckName_NotEqual(fRES(defCheckName));
    }

    protected void doSetDefCheckName_NotEqual(String defCheckName) {
        regDefCheckName(CK_NES, defCheckName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckNameList The collection of defCheckName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_InScope(Collection<String> defCheckNameList) {
        doSetDefCheckName_InScope(defCheckNameList);
    }

    public void doSetDefCheckName_InScope(Collection<String> defCheckNameList) {
        regINS(CK_INS, cTL(defCheckNameList), getCValueDefCheckName(), "DEF_CHECK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckNameList The collection of defCheckName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_NotInScope(Collection<String> defCheckNameList) {
        doSetDefCheckName_NotInScope(defCheckNameList);
    }

    public void doSetDefCheckName_NotInScope(Collection<String> defCheckNameList) {
        regINS(CK_NINS, cTL(defCheckNameList), getCValueDefCheckName(), "DEF_CHECK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_PrefixSearch(String defCheckName) {
        setDefCheckName_LikeSearch(defCheckName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setDefCheckName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defCheckName The value of defCheckName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefCheckName_LikeSearch(String defCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defCheckName), getCValueDefCheckName(), "DEF_CHECK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefCheckName_NotLikeSearch(String defCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defCheckName), getCValueDefCheckName(), "DEF_CHECK_NAME", likeSearchOption);
    }

    protected void regDefCheckName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDefCheckName(), "DEF_CHECK_NAME"); }
    protected abstract ConditionValue getCValueDefCheckName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSuppressDefCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSuppressDefCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSuppressDefCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSuppressDefCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSuppressDefCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSuppressDefCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressDefCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressDefCheckCQ sq);

    protected WhiteSuppressDefCheckCB xcreateScalarConditionCB() {
        WhiteSuppressDefCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressDefCheckCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressDefCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressDefCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "DEF_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressDefCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressDefCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressDefCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEF_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressDefCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressDefCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressDefCheckCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressDefCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSuppressDefCheckCQ sq);

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
    protected WhiteSuppressDefCheckCB newMyCB() {
        return new WhiteSuppressDefCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSuppressDefCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
