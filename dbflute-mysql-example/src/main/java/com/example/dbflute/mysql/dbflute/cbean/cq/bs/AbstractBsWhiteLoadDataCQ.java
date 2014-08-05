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
 * The abstract condition-query of white_load_data.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteLoadDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteLoadDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_load_data";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as equal. (NullAllowed: if null, no condition)
     */
    public void setLoadDataId_Equal(Long loadDataId) {
        doSetLoadDataId_Equal(loadDataId);
    }

    protected void doSetLoadDataId_Equal(Long loadDataId) {
        regLoadDataId(CK_EQ, loadDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLoadDataId_GreaterThan(Long loadDataId) {
        regLoadDataId(CK_GT, loadDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLoadDataId_LessThan(Long loadDataId) {
        regLoadDataId(CK_LT, loadDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLoadDataId_GreaterEqual(Long loadDataId) {
        regLoadDataId(CK_GE, loadDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLoadDataId_LessEqual(Long loadDataId) {
        regLoadDataId(CK_LE, loadDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of loadDataId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of loadDataId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLoadDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLoadDataId(), "LOAD_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataIdList The collection of loadDataId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataId_InScope(Collection<Long> loadDataIdList) {
        doSetLoadDataId_InScope(loadDataIdList);
    }

    protected void doSetLoadDataId_InScope(Collection<Long> loadDataIdList) {
        regINS(CK_INS, cTL(loadDataIdList), getCValueLoadDataId(), "LOAD_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataIdList The collection of loadDataId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataId_NotInScope(Collection<Long> loadDataIdList) {
        doSetLoadDataId_NotInScope(loadDataIdList);
    }

    protected void doSetLoadDataId_NotInScope(Collection<Long> loadDataIdList) {
        regINS(CK_NINS, cTL(loadDataIdList), getCValueLoadDataId(), "LOAD_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLoadDataId_IsNull() { regLoadDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLoadDataId_IsNotNull() { regLoadDataId(CK_ISNN, DOBJ); }

    protected void regLoadDataId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoadDataId(), "LOAD_DATA_ID"); }
    protected abstract ConditionValue getCValueLoadDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataName_Equal(String loadDataName) {
        doSetLoadDataName_Equal(fRES(loadDataName));
    }

    protected void doSetLoadDataName_Equal(String loadDataName) {
        regLoadDataName(CK_EQ, loadDataName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataName_NotEqual(String loadDataName) {
        doSetLoadDataName_NotEqual(fRES(loadDataName));
    }

    protected void doSetLoadDataName_NotEqual(String loadDataName) {
        regLoadDataName(CK_NES, loadDataName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataNameList The collection of loadDataName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataName_InScope(Collection<String> loadDataNameList) {
        doSetLoadDataName_InScope(loadDataNameList);
    }

    public void doSetLoadDataName_InScope(Collection<String> loadDataNameList) {
        regINS(CK_INS, cTL(loadDataNameList), getCValueLoadDataName(), "LOAD_DATA_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataNameList The collection of loadDataName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataName_NotInScope(Collection<String> loadDataNameList) {
        doSetLoadDataName_NotInScope(loadDataNameList);
    }

    public void doSetLoadDataName_NotInScope(Collection<String> loadDataNameList) {
        regINS(CK_NINS, cTL(loadDataNameList), getCValueLoadDataName(), "LOAD_DATA_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoadDataName_PrefixSearch(String loadDataName) {
        setLoadDataName_LikeSearch(loadDataName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setLoadDataName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loadDataName The value of loadDataName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoadDataName_LikeSearch(String loadDataName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loadDataName), getCValueLoadDataName(), "LOAD_DATA_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoadDataName_NotLikeSearch(String loadDataName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loadDataName), getCValueLoadDataName(), "LOAD_DATA_NAME", likeSearchOption);
    }

    protected void regLoadDataName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoadDataName(), "LOAD_DATA_NAME"); }
    protected abstract ConditionValue getCValueLoadDataName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLoadDataCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteLoadDataCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLoadDataCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteLoadDataCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLoadDataCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteLoadDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLoadDataCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteLoadDataCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLoadDataCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteLoadDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLoadDataCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteLoadDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteLoadDataCQ sq);

    protected WhiteLoadDataCB xcreateScalarConditionCB() {
        WhiteLoadDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteLoadDataCB xcreateScalarConditionPartitionByCB() {
        WhiteLoadDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteLoadDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "LOAD_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteLoadDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteLoadDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteLoadDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOAD_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteLoadDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteLoadDataCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteLoadDataCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteLoadDataCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteLoadDataCQ sq);

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
    protected WhiteLoadDataCB newMyCB() {
        return new WhiteLoadDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteLoadDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
