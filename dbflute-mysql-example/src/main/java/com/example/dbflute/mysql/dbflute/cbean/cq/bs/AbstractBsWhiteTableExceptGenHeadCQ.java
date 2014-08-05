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
 * The abstract condition-query of white_table_except_gen_head.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteTableExceptGenHeadCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTableExceptGenHeadCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_table_except_gen_head";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as equal. (NullAllowed: if null, no condition)
     */
    public void setGenHeadId_Equal(Long genHeadId) {
        doSetGenHeadId_Equal(genHeadId);
    }

    protected void doSetGenHeadId_Equal(Long genHeadId) {
        regGenHeadId(CK_EQ, genHeadId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setGenHeadId_GreaterThan(Long genHeadId) {
        regGenHeadId(CK_GT, genHeadId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setGenHeadId_LessThan(Long genHeadId) {
        regGenHeadId(CK_LT, genHeadId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setGenHeadId_GreaterEqual(Long genHeadId) {
        regGenHeadId(CK_GE, genHeadId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setGenHeadId_LessEqual(Long genHeadId) {
        regGenHeadId(CK_LE, genHeadId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of genHeadId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of genHeadId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGenHeadId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueGenHeadId(), "GEN_HEAD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadIdList The collection of genHeadId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadId_InScope(Collection<Long> genHeadIdList) {
        doSetGenHeadId_InScope(genHeadIdList);
    }

    protected void doSetGenHeadId_InScope(Collection<Long> genHeadIdList) {
        regINS(CK_INS, cTL(genHeadIdList), getCValueGenHeadId(), "GEN_HEAD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadIdList The collection of genHeadId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadId_NotInScope(Collection<Long> genHeadIdList) {
        doSetGenHeadId_NotInScope(genHeadIdList);
    }

    protected void doSetGenHeadId_NotInScope(Collection<Long> genHeadIdList) {
        regINS(CK_NINS, cTL(genHeadIdList), getCValueGenHeadId(), "GEN_HEAD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenHeadId_IsNull() { regGenHeadId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenHeadId_IsNotNull() { regGenHeadId(CK_ISNN, DOBJ); }

    protected void regGenHeadId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenHeadId(), "GEN_HEAD_ID"); }
    protected abstract ConditionValue getCValueGenHeadId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadName_Equal(String genHeadName) {
        doSetGenHeadName_Equal(fRES(genHeadName));
    }

    protected void doSetGenHeadName_Equal(String genHeadName) {
        regGenHeadName(CK_EQ, genHeadName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadName_NotEqual(String genHeadName) {
        doSetGenHeadName_NotEqual(fRES(genHeadName));
    }

    protected void doSetGenHeadName_NotEqual(String genHeadName) {
        regGenHeadName(CK_NES, genHeadName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadNameList The collection of genHeadName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadName_InScope(Collection<String> genHeadNameList) {
        doSetGenHeadName_InScope(genHeadNameList);
    }

    public void doSetGenHeadName_InScope(Collection<String> genHeadNameList) {
        regINS(CK_INS, cTL(genHeadNameList), getCValueGenHeadName(), "GEN_HEAD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadNameList The collection of genHeadName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadName_NotInScope(Collection<String> genHeadNameList) {
        doSetGenHeadName_NotInScope(genHeadNameList);
    }

    public void doSetGenHeadName_NotInScope(Collection<String> genHeadNameList) {
        regINS(CK_NINS, cTL(genHeadNameList), getCValueGenHeadName(), "GEN_HEAD_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenHeadName_PrefixSearch(String genHeadName) {
        setGenHeadName_LikeSearch(genHeadName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setGenHeadName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genHeadName The value of genHeadName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenHeadName_LikeSearch(String genHeadName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genHeadName), getCValueGenHeadName(), "GEN_HEAD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenHeadName_NotLikeSearch(String genHeadName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genHeadName), getCValueGenHeadName(), "GEN_HEAD_NAME", likeSearchOption);
    }

    protected void regGenHeadName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenHeadName(), "GEN_HEAD_NAME"); }
    protected abstract ConditionValue getCValueGenHeadName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as equal. (NullAllowed: if null, no condition)
     */
    public void setNometaId_Equal(Long nometaId) {
        doSetNometaId_Equal(nometaId);
    }

    protected void doSetNometaId_Equal(Long nometaId) {
        regNometaId(CK_EQ, nometaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNometaId_GreaterThan(Long nometaId) {
        regNometaId(CK_GT, nometaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNometaId_LessThan(Long nometaId) {
        regNometaId(CK_LT, nometaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNometaId_GreaterEqual(Long nometaId) {
        regNometaId(CK_GE, nometaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNometaId_LessEqual(Long nometaId) {
        regNometaId(CK_LE, nometaId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param minNumber The min number of nometaId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nometaId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNometaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNometaId(), "NOMETA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaIdList The collection of nometaId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNometaId_InScope(Collection<Long> nometaIdList) {
        doSetNometaId_InScope(nometaIdList);
    }

    protected void doSetNometaId_InScope(Collection<Long> nometaIdList) {
        regINS(CK_INS, cTL(nometaIdList), getCValueNometaId(), "NOMETA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaIdList The collection of nometaId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNometaId_NotInScope(Collection<Long> nometaIdList) {
        doSetNometaId_NotInScope(nometaIdList);
    }

    protected void doSetNometaId_NotInScope(Collection<Long> nometaIdList) {
        regINS(CK_NINS, cTL(nometaIdList), getCValueNometaId(), "NOMETA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     */
    public void setNometaId_IsNull() { regNometaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NOMETA_ID: {IX, DECIMAL(16)}
     */
    public void setNometaId_IsNotNull() { regNometaId(CK_ISNN, DOBJ); }

    protected void regNometaId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNometaId(), "NOMETA_ID"); }
    protected abstract ConditionValue getCValueNometaId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTableExceptGenHeadCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteTableExceptGenHeadCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTableExceptGenHeadCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteTableExceptGenHeadCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTableExceptGenHeadCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteTableExceptGenHeadCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTableExceptGenHeadCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteTableExceptGenHeadCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTableExceptGenHeadCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteTableExceptGenHeadCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTableExceptGenHeadCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteTableExceptGenHeadCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenHeadCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteTableExceptGenHeadCQ sq);

    protected WhiteTableExceptGenHeadCB xcreateScalarConditionCB() {
        WhiteTableExceptGenHeadCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTableExceptGenHeadCB xcreateScalarConditionPartitionByCB() {
        WhiteTableExceptGenHeadCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTableExceptGenHeadCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "GEN_HEAD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTableExceptGenHeadCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTableExceptGenHeadCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTableExceptGenHeadCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GEN_HEAD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTableExceptGenHeadCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTableExceptGenHeadCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTableExceptGenHeadCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteTableExceptGenHeadCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteTableExceptGenHeadCQ sq);

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
    protected WhiteTableExceptGenHeadCB newMyCB() {
        return new WhiteTableExceptGenHeadCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteTableExceptGenHeadCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
