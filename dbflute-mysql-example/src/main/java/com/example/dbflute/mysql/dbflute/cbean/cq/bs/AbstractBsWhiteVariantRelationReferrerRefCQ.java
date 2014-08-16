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
 * The abstract condition-query of white_variant_relation_referrer_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationReferrerRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationReferrerRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_referrer_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refId The value of refId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefId_Equal(Long refId) {
        doSetRefId_Equal(refId);
    }

    protected void doSetRefId_Equal(Long refId) {
        regRefId(CK_EQ, refId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refId The value of refId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefId_GreaterThan(Long refId) {
        regRefId(CK_GT, refId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refId The value of refId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefId_LessThan(Long refId) {
        regRefId(CK_LT, refId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refId The value of refId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefId_GreaterEqual(Long refId) {
        regRefId(CK_GE, refId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refId The value of refId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefId_LessEqual(Long refId) {
        regRefId(CK_LE, refId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of refId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefId(), "REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refIdList The collection of refId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefId_InScope(Collection<Long> refIdList) {
        doSetRefId_InScope(refIdList);
    }

    protected void doSetRefId_InScope(Collection<Long> refIdList) {
        regINS(CK_INS, cTL(refIdList), getCValueRefId(), "REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @param refIdList The collection of refId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefId_NotInScope(Collection<Long> refIdList) {
        doSetRefId_NotInScope(refIdList);
    }

    protected void doSetRefId_NotInScope(Collection<Long> refIdList) {
        regINS(CK_NINS, cTL(refIdList), getCValueRefId(), "REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setRefId_IsNull() { regRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setRefId_IsNotNull() { regRefId(CK_ISNN, DOBJ); }

    protected void regRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefId(), "REF_ID"); }
    protected abstract ConditionValue getCValueRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerId The value of referrerId as equal. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_Equal(Long referrerId) {
        doSetReferrerId_Equal(referrerId);
    }

    protected void doSetReferrerId_Equal(Long referrerId) {
        regReferrerId(CK_EQ, referrerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerId The value of referrerId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_GreaterThan(Long referrerId) {
        regReferrerId(CK_GT, referrerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerId The value of referrerId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_LessThan(Long referrerId) {
        regReferrerId(CK_LT, referrerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerId The value of referrerId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_GreaterEqual(Long referrerId) {
        regReferrerId(CK_GE, referrerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerId The value of referrerId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_LessEqual(Long referrerId) {
        regReferrerId(CK_LE, referrerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param minNumber The min number of referrerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of referrerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReferrerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueReferrerId(), "REFERRER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerIdList The collection of referrerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferrerId_InScope(Collection<Long> referrerIdList) {
        doSetReferrerId_InScope(referrerIdList);
    }

    protected void doSetReferrerId_InScope(Collection<Long> referrerIdList) {
        regINS(CK_INS, cTL(referrerIdList), getCValueReferrerId(), "REFERRER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @param referrerIdList The collection of referrerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferrerId_NotInScope(Collection<Long> referrerIdList) {
        doSetReferrerId_NotInScope(referrerIdList);
    }

    protected void doSetReferrerId_NotInScope(Collection<Long> referrerIdList) {
        regINS(CK_NINS, cTL(referrerIdList), getCValueReferrerId(), "REFERRER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REFERRER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'.
     * @param subQuery The sub-query of WhiteVariantRelationReferrer for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteVariantRelationReferrer(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepReferrerId_InScopeRelation_WhiteVariantRelationReferrer(cb.query());
        registerInScopeRelation(cb.query(), "REFERRER_ID", "REFERRER_ID", pp, "whiteVariantRelationReferrer");
    }
    public abstract String keepReferrerId_InScopeRelation_WhiteVariantRelationReferrer(WhiteVariantRelationReferrerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REFERRER_ID from white_variant_relation_referrer where ...)} <br />
     * white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'.
     * @param subQuery The sub-query of WhiteVariantRelationReferrer for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteVariantRelationReferrer(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepReferrerId_NotInScopeRelation_WhiteVariantRelationReferrer(cb.query());
        registerNotInScopeRelation(cb.query(), "REFERRER_ID", "REFERRER_ID", pp, "whiteVariantRelationReferrer");
    }
    public abstract String keepReferrerId_NotInScopeRelation_WhiteVariantRelationReferrer(WhiteVariantRelationReferrerCQ sq);

    protected void regReferrerId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReferrerId(), "REFERRER_ID"); }
    protected abstract ConditionValue getCValueReferrerId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteVariantRelationReferrerRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteVariantRelationReferrerRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteVariantRelationReferrerRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteVariantRelationReferrerRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteVariantRelationReferrerRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteVariantRelationReferrerRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationReferrerRefCQ sq);

    protected WhiteVariantRelationReferrerRefCB xcreateScalarConditionCB() {
        WhiteVariantRelationReferrerRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationReferrerRefCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationReferrerRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationReferrerRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationReferrerRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationReferrerRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationReferrerRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationReferrerRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationReferrerRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationReferrerRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationReferrerRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationReferrerRefCQ sq);

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
    protected WhiteVariantRelationReferrerRefCB newMyCB() {
        return new WhiteVariantRelationReferrerRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationReferrerRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
