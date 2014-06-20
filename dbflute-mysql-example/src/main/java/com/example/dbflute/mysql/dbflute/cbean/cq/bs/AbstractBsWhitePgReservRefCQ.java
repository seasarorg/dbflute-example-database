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
 * The abstract condition-query of white_pg_reserv_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePgReservRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePgReservRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_pg_reserv_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefId_Equal(Integer refId) {
        doSetRefId_Equal(refId);
    }

    protected void doSetRefId_Equal(Integer refId) {
        regRefId(CK_EQ, refId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefId_GreaterThan(Integer refId) {
        regRefId(CK_GT, refId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefId_LessThan(Integer refId) {
        regRefId(CK_LT, refId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefId_GreaterEqual(Integer refId) {
        regRefId(CK_GE, refId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refId The value of refId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefId_LessEqual(Integer refId) {
        regRefId(CK_LE, refId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of refId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefId(), "REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refIdList The collection of refId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefId_InScope(Collection<Integer> refIdList) {
        doSetRefId_InScope(refIdList);
    }

    protected void doSetRefId_InScope(Collection<Integer> refIdList) {
        regINS(CK_INS, cTL(refIdList), getCValueRefId(), "REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @param refIdList The collection of refId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefId_NotInScope(Collection<Integer> refIdList) {
        doSetRefId_NotInScope(refIdList);
    }

    protected void doSetRefId_NotInScope(Collection<Integer> refIdList) {
        regINS(CK_NINS, cTL(refIdList), getCValueRefId(), "REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     */
    public void setRefId_IsNull() { regRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     */
    public void setRefId_IsNotNull() { regRefId(CK_ISNN, DOBJ); }

    protected void regRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefId(), "REF_ID"); }
    protected abstract ConditionValue getCValueRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonym The value of classSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_Equal(Integer classSynonym) {
        doSetClassSynonym_Equal(classSynonym);
    }

    protected void doSetClassSynonym_Equal(Integer classSynonym) {
        regClassSynonym(CK_EQ, classSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonym The value of classSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_GreaterThan(Integer classSynonym) {
        regClassSynonym(CK_GT, classSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonym The value of classSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_LessThan(Integer classSynonym) {
        regClassSynonym(CK_LT, classSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonym The value of classSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_GreaterEqual(Integer classSynonym) {
        regClassSynonym(CK_GE, classSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonym The value of classSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_LessEqual(Integer classSynonym) {
        regClassSynonym(CK_LE, classSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param minNumber The min number of classSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of classSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueClassSynonym(), "CLASS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonymList The collection of classSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClassSynonym_InScope(Collection<Integer> classSynonymList) {
        doSetClassSynonym_InScope(classSynonymList);
    }

    protected void doSetClassSynonym_InScope(Collection<Integer> classSynonymList) {
        regINS(CK_INS, cTL(classSynonymList), getCValueClassSynonym(), "CLASS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @param classSynonymList The collection of classSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClassSynonym_NotInScope(Collection<Integer> classSynonymList) {
        doSetClassSynonym_NotInScope(classSynonymList);
    }

    protected void doSetClassSynonym_NotInScope(Collection<Integer> classSynonymList) {
        regINS(CK_NINS, cTL(classSynonymList), getCValueClassSynonym(), "CLASS");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLASS from white_pg_reserv where ...)} <br />
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @param subQuery The sub-query of WhitePgReserv for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePgReserv(SubQuery<WhitePgReservCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClassSynonym_InScopeRelation_WhitePgReserv(cb.query());
        registerInScopeRelation(cb.query(), "CLASS", "CLASS", pp, "whitePgReserv");
    }
    public abstract String keepClassSynonym_InScopeRelation_WhitePgReserv(WhitePgReservCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLASS from white_pg_reserv where ...)} <br />
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @param subQuery The sub-query of WhitePgReserv for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePgReserv(SubQuery<WhitePgReservCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepClassSynonym_NotInScopeRelation_WhitePgReserv(cb.query());
        registerNotInScopeRelation(cb.query(), "CLASS", "CLASS", pp, "whitePgReserv");
    }
    public abstract String keepClassSynonym_NotInScopeRelation_WhitePgReserv(WhitePgReservCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     */
    public void setClassSynonym_IsNull() { regClassSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     */
    public void setClassSynonym_IsNotNull() { regClassSynonym(CK_ISNN, DOBJ); }

    protected void regClassSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueClassSynonym(), "CLASS"); }
    protected abstract ConditionValue getCValueClassSynonym();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhitePgReservRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhitePgReservRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhitePgReservRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhitePgReservRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhitePgReservRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhitePgReservRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhitePgReservRefCQ sq);

    protected WhitePgReservRefCB xcreateScalarConditionCB() {
        WhitePgReservRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePgReservRefCB xcreateScalarConditionPartitionByCB() {
        WhitePgReservRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePgReservRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePgReservRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePgReservRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePgReservRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePgReservRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePgReservRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePgReservRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePgReservRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhitePgReservRefCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    protected WhitePgReservRefCB newMyCB() {
        return new WhitePgReservRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhitePgReservRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
