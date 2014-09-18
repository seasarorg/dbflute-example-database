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
 * The abstract condition-query of white_variant_relation_local_pk_referrer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationLocalPkReferrerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationLocalPkReferrerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_local_pk_referrer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedId The value of reversefkSuppressedId as equal. (NullAllowed: if null, no condition)
     */
    public void setReversefkSuppressedId_Equal(Long reversefkSuppressedId) {
        doSetReversefkSuppressedId_Equal(reversefkSuppressedId);
    }

    protected void doSetReversefkSuppressedId_Equal(Long reversefkSuppressedId) {
        regReversefkSuppressedId(CK_EQ, reversefkSuppressedId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedId The value of reversefkSuppressedId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReversefkSuppressedId_GreaterThan(Long reversefkSuppressedId) {
        regReversefkSuppressedId(CK_GT, reversefkSuppressedId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedId The value of reversefkSuppressedId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReversefkSuppressedId_LessThan(Long reversefkSuppressedId) {
        regReversefkSuppressedId(CK_LT, reversefkSuppressedId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedId The value of reversefkSuppressedId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReversefkSuppressedId_GreaterEqual(Long reversefkSuppressedId) {
        regReversefkSuppressedId(CK_GE, reversefkSuppressedId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedId The value of reversefkSuppressedId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReversefkSuppressedId_LessEqual(Long reversefkSuppressedId) {
        regReversefkSuppressedId(CK_LE, reversefkSuppressedId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param minNumber The min number of reversefkSuppressedId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reversefkSuppressedId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReversefkSuppressedId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueReversefkSuppressedId(), "REVERSEFK_SUPPRESSED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedIdList The collection of reversefkSuppressedId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReversefkSuppressedId_InScope(Collection<Long> reversefkSuppressedIdList) {
        doSetReversefkSuppressedId_InScope(reversefkSuppressedIdList);
    }

    protected void doSetReversefkSuppressedId_InScope(Collection<Long> reversefkSuppressedIdList) {
        regINS(CK_INS, cTL(reversefkSuppressedIdList), getCValueReversefkSuppressedId(), "REVERSEFK_SUPPRESSED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param reversefkSuppressedIdList The collection of reversefkSuppressedId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReversefkSuppressedId_NotInScope(Collection<Long> reversefkSuppressedIdList) {
        doSetReversefkSuppressedId_NotInScope(reversefkSuppressedIdList);
    }

    protected void doSetReversefkSuppressedId_NotInScope(Collection<Long> reversefkSuppressedIdList) {
        regINS(CK_NINS, cTL(reversefkSuppressedIdList), getCValueReversefkSuppressedId(), "REVERSEFK_SUPPRESSED_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     */
    public void setReversefkSuppressedId_IsNull() { regReversefkSuppressedId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     */
    public void setReversefkSuppressedId_IsNotNull() { regReversefkSuppressedId(CK_ISNN, DOBJ); }

    protected void regReversefkSuppressedId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReversefkSuppressedId(), "REVERSEFK_SUPPRESSED_ID"); }
    protected abstract ConditionValue getCValueReversefkSuppressedId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @param masterTypeCode The value of masterTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_Equal(String masterTypeCode) {
        doSetMasterTypeCode_Equal(fRES(masterTypeCode));
    }

    protected void doSetMasterTypeCode_Equal(String masterTypeCode) {
        regMasterTypeCode(CK_EQ, masterTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @param masterTypeCode The value of masterTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_NotEqual(String masterTypeCode) {
        doSetMasterTypeCode_NotEqual(fRES(masterTypeCode));
    }

    protected void doSetMasterTypeCode_NotEqual(String masterTypeCode) {
        regMasterTypeCode(CK_NES, masterTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @param masterTypeCodeList The collection of masterTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_InScope(Collection<String> masterTypeCodeList) {
        doSetMasterTypeCode_InScope(masterTypeCodeList);
    }

    public void doSetMasterTypeCode_InScope(Collection<String> masterTypeCodeList) {
        regINS(CK_INS, cTL(masterTypeCodeList), getCValueMasterTypeCode(), "MASTER_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @param masterTypeCodeList The collection of masterTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_NotInScope(Collection<String> masterTypeCodeList) {
        doSetMasterTypeCode_NotInScope(masterTypeCodeList);
    }

    public void doSetMasterTypeCode_NotInScope(Collection<String> masterTypeCodeList) {
        regINS(CK_NINS, cTL(masterTypeCodeList), getCValueMasterTypeCode(), "MASTER_TYPE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @param masterTypeCode The value of masterTypeCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_PrefixSearch(String masterTypeCode) {
        setMasterTypeCode_LikeSearch(masterTypeCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setMasterTypeCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterTypeCode The value of masterTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterTypeCode_LikeSearch(String masterTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterTypeCode), getCValueMasterTypeCode(), "MASTER_TYPE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @param masterTypeCode The value of masterTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterTypeCode_NotLikeSearch(String masterTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterTypeCode), getCValueMasterTypeCode(), "MASTER_TYPE_CODE", likeSearchOption);
    }

    protected void regMasterTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterTypeCode(), "MASTER_TYPE_CODE"); }
    protected abstract ConditionValue getCValueMasterTypeCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationLocalPkReferrerCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteVariantRelationLocalPkReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationLocalPkReferrerCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteVariantRelationLocalPkReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationLocalPkReferrerCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteVariantRelationLocalPkReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationLocalPkReferrerCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteVariantRelationLocalPkReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationLocalPkReferrerCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteVariantRelationLocalPkReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationLocalPkReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationLocalPkReferrerCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteVariantRelationLocalPkReferrerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationLocalPkReferrerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationLocalPkReferrerCQ sq);

    protected WhiteVariantRelationLocalPkReferrerCB xcreateScalarConditionCB() {
        WhiteVariantRelationLocalPkReferrerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationLocalPkReferrerCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationLocalPkReferrerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationLocalPkReferrerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REVERSEFK_SUPPRESSED_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationLocalPkReferrerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationLocalPkReferrerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationLocalPkReferrerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REVERSEFK_SUPPRESSED_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationLocalPkReferrerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationLocalPkReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationLocalPkReferrerCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationLocalPkReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationLocalPkReferrerCQ sq);

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
    protected WhiteVariantRelationLocalPkReferrerCB newMyCB() {
        return new WhiteVariantRelationLocalPkReferrerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationLocalPkReferrerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
