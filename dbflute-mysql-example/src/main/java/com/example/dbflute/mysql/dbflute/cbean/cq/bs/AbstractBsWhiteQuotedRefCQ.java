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
 * The abstract condition-query of white_quoted_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteQuotedRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteQuotedRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_quoted_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param where The value of where as equal. (NullAllowed: if null, no condition)
     */
    public void setWhere_Equal(Integer where) {
        doSetWhere_Equal(where);
    }

    protected void doSetWhere_Equal(Integer where) {
        regWhere(CK_EQ, where);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param where The value of where as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWhere_GreaterThan(Integer where) {
        regWhere(CK_GT, where);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param where The value of where as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWhere_LessThan(Integer where) {
        regWhere(CK_LT, where);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param where The value of where as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWhere_GreaterEqual(Integer where) {
        regWhere(CK_GE, where);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param where The value of where as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWhere_LessEqual(Integer where) {
        regWhere(CK_LE, where);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param minNumber The min number of where. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of where. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhere_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueWhere(), "WHERE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param whereList The collection of where as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhere_InScope(Collection<Integer> whereList) {
        doSetWhere_InScope(whereList);
    }

    protected void doSetWhere_InScope(Collection<Integer> whereList) {
        regINS(CK_INS, cTL(whereList), getCValueWhere(), "WHERE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @param whereList The collection of where as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWhere_NotInScope(Collection<Integer> whereList) {
        doSetWhere_NotInScope(whereList);
    }

    protected void doSetWhere_NotInScope(Collection<Integer> whereList) {
        regINS(CK_NINS, cTL(whereList), getCValueWhere(), "WHERE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     */
    public void setWhere_IsNull() { regWhere(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WHERE: {PK, NotNull, INT(10)}
     */
    public void setWhere_IsNotNull() { regWhere(CK_ISNN, DOBJ); }

    protected void regWhere(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWhere(), "WHERE"); }
    protected abstract ConditionValue getCValueWhere();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param order The value of order as equal. (NullAllowed: if null, no condition)
     */
    public void setOrder_Equal(Integer order) {
        doSetOrder_Equal(order);
    }

    protected void doSetOrder_Equal(Integer order) {
        regOrder(CK_EQ, order);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param order The value of order as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setOrder_GreaterThan(Integer order) {
        regOrder(CK_GT, order);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param order The value of order as lessThan. (NullAllowed: if null, no condition)
     */
    public void setOrder_LessThan(Integer order) {
        regOrder(CK_LT, order);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param order The value of order as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setOrder_GreaterEqual(Integer order) {
        regOrder(CK_GE, order);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param order The value of order as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setOrder_LessEqual(Integer order) {
        regOrder(CK_LE, order);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param minNumber The min number of order. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of order. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueOrder(), "ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param orderList The collection of order as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOrder_InScope(Collection<Integer> orderList) {
        doSetOrder_InScope(orderList);
    }

    protected void doSetOrder_InScope(Collection<Integer> orderList) {
        regINS(CK_INS, cTL(orderList), getCValueOrder(), "ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @param orderList The collection of order as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOrder_NotInScope(Collection<Integer> orderList) {
        doSetOrder_NotInScope(orderList);
    }

    protected void doSetOrder_NotInScope(Collection<Integer> orderList) {
        regINS(CK_NINS, cTL(orderList), getCValueOrder(), "ORDER");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ORDER from white_quoted where ...)} <br />
     * white_quoted by my ORDER, named 'whiteQuoted'.
     * @param subQuery The sub-query of WhiteQuoted for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteQuoted(SubQuery<WhiteQuotedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepOrder_InScopeRelation_WhiteQuoted(cb.query());
        registerInScopeRelation(cb.query(), "ORDER", "SELECT", pp, "whiteQuoted");
    }
    public abstract String keepOrder_InScopeRelation_WhiteQuoted(WhiteQuotedCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ORDER from white_quoted where ...)} <br />
     * white_quoted by my ORDER, named 'whiteQuoted'.
     * @param subQuery The sub-query of WhiteQuoted for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteQuoted(SubQuery<WhiteQuotedCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepOrder_NotInScopeRelation_WhiteQuoted(cb.query());
        registerNotInScopeRelation(cb.query(), "ORDER", "SELECT", pp, "whiteQuoted");
    }
    public abstract String keepOrder_NotInScopeRelation_WhiteQuoted(WhiteQuotedCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     */
    public void setOrder_IsNull() { regOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     */
    public void setOrder_IsNotNull() { regOrder(CK_ISNN, DOBJ); }

    protected void regOrder(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueOrder(), "ORDER"); }
    protected abstract ConditionValue getCValueOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteQuotedRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteQuotedRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteQuotedRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteQuotedRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteQuotedRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteQuotedRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteQuotedRefCQ sq);

    protected WhiteQuotedRefCB xcreateScalarConditionCB() {
        WhiteQuotedRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteQuotedRefCB xcreateScalarConditionPartitionByCB() {
        WhiteQuotedRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteQuotedRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "WHERE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteQuotedRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteQuotedRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteQuotedRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WHERE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteQuotedRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteQuotedRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteQuotedRefCQ sq);

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
    protected WhiteQuotedRefCB newMyCB() {
        return new WhiteQuotedRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteQuotedRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
