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
 * The abstract condition-query of white_myself_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteMyselfCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteMyselfCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_myself_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as equal. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_Equal(Integer myselfCheckId) {
        doSetMyselfCheckId_Equal(myselfCheckId);
    }

    protected void doSetMyselfCheckId_Equal(Integer myselfCheckId) {
        regMyselfCheckId(CK_EQ, myselfCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_GreaterThan(Integer myselfCheckId) {
        regMyselfCheckId(CK_GT, myselfCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_LessThan(Integer myselfCheckId) {
        regMyselfCheckId(CK_LT, myselfCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_GreaterEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_GE, myselfCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_LessEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_LE, myselfCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of myselfCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myselfCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfCheckId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyselfCheckId(), "MYSELF_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckIdList The collection of myselfCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckId_InScope(Collection<Integer> myselfCheckIdList) {
        doSetMyselfCheckId_InScope(myselfCheckIdList);
    }

    protected void doSetMyselfCheckId_InScope(Collection<Integer> myselfCheckIdList) {
        regINS(CK_INS, cTL(myselfCheckIdList), getCValueMyselfCheckId(), "MYSELF_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckIdList The collection of myselfCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckId_NotInScope(Collection<Integer> myselfCheckIdList) {
        doSetMyselfCheckId_NotInScope(myselfCheckIdList);
    }

    protected void doSetMyselfCheckId_NotInScope(Collection<Integer> myselfCheckIdList) {
        regINS(CK_NINS, cTL(myselfCheckIdList), getCValueMyselfCheckId(), "MYSELF_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     */
    public void setMyselfCheckId_IsNull() { regMyselfCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     */
    public void setMyselfCheckId_IsNotNull() { regMyselfCheckId(CK_ISNN, DOBJ); }

    protected void regMyselfCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMyselfCheckId(), "MYSELF_CHECK_ID"); }
    protected abstract ConditionValue getCValueMyselfCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_Equal(String myselfCheckName) {
        doSetMyselfCheckName_Equal(fRES(myselfCheckName));
    }

    protected void doSetMyselfCheckName_Equal(String myselfCheckName) {
        regMyselfCheckName(CK_EQ, myselfCheckName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_NotEqual(String myselfCheckName) {
        doSetMyselfCheckName_NotEqual(fRES(myselfCheckName));
    }

    protected void doSetMyselfCheckName_NotEqual(String myselfCheckName) {
        regMyselfCheckName(CK_NES, myselfCheckName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckNameList The collection of myselfCheckName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_InScope(Collection<String> myselfCheckNameList) {
        doSetMyselfCheckName_InScope(myselfCheckNameList);
    }

    public void doSetMyselfCheckName_InScope(Collection<String> myselfCheckNameList) {
        regINS(CK_INS, cTL(myselfCheckNameList), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckNameList The collection of myselfCheckName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_NotInScope(Collection<String> myselfCheckNameList) {
        doSetMyselfCheckName_NotInScope(myselfCheckNameList);
    }

    public void doSetMyselfCheckName_NotInScope(Collection<String> myselfCheckNameList) {
        regINS(CK_NINS, cTL(myselfCheckNameList), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_PrefixSearch(String myselfCheckName) {
        setMyselfCheckName_LikeSearch(myselfCheckName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setMyselfCheckName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param myselfCheckName The value of myselfCheckName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMyselfCheckName_LikeSearch(String myselfCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(myselfCheckName), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMyselfCheckName_NotLikeSearch(String myselfCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(myselfCheckName), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME", likeSearchOption);
    }

    protected void regMyselfCheckName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMyselfCheckName(), "MYSELF_CHECK_NAME"); }
    protected abstract ConditionValue getCValueMyselfCheckName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as equal. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_Equal(Integer myselfId) {
        doSetMyselfId_Equal(myselfId);
    }

    protected void doSetMyselfId_Equal(Integer myselfId) {
        regMyselfId(CK_EQ, myselfId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterThan(Integer myselfId) {
        regMyselfId(CK_GT, myselfId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessThan(Integer myselfId) {
        regMyselfId(CK_LT, myselfId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterEqual(Integer myselfId) {
        regMyselfId(CK_GE, myselfId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessEqual(Integer myselfId) {
        regMyselfId(CK_LE, myselfId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param minNumber The min number of myselfId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myselfId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyselfId(), "MYSELF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfIdList The collection of myselfId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfId_InScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_InScope(myselfIdList);
    }

    protected void doSetMyselfId_InScope(Collection<Integer> myselfIdList) {
        regINS(CK_INS, cTL(myselfIdList), getCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfIdList The collection of myselfId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_NotInScope(myselfIdList);
    }

    protected void doSetMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        regINS(CK_NINS, cTL(myselfIdList), getCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MYSELF_ID from white_myself where ...)} <br />
     * white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @param subQuery The sub-query of WhiteMyself for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteMyself(SubQuery<WhiteMyselfCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCB cb = new WhiteMyselfCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_InScopeRelation_WhiteMyself(cb.query());
        registerInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyself");
    }
    public abstract String keepMyselfId_InScopeRelation_WhiteMyself(WhiteMyselfCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MYSELF_ID from white_myself where ...)} <br />
     * white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @param subQuery The sub-query of WhiteMyself for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteMyself(SubQuery<WhiteMyselfCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCB cb = new WhiteMyselfCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_NotInScopeRelation_WhiteMyself(cb.query());
        registerNotInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyself");
    }
    public abstract String keepMyselfId_NotInScopeRelation_WhiteMyself(WhiteMyselfCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     */
    public void setMyselfId_IsNull() { regMyselfId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     */
    public void setMyselfId_IsNotNull() { regMyselfId(CK_ISNN, DOBJ); }

    protected void regMyselfId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMyselfId(), "MYSELF_ID"); }
    protected abstract ConditionValue getCValueMyselfId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteMyselfCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteMyselfCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteMyselfCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteMyselfCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteMyselfCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteMyselfCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteMyselfCheckCQ sq);

    protected WhiteMyselfCheckCB xcreateScalarConditionCB() {
        WhiteMyselfCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteMyselfCheckCB xcreateScalarConditionPartitionByCB() {
        WhiteMyselfCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteMyselfCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MYSELF_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteMyselfCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteMyselfCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteMyselfCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MYSELF_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteMyselfCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteMyselfCheckCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteMyselfCheckCQ sq);

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
    protected WhiteMyselfCheckCB newMyCB() {
        return new WhiteMyselfCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteMyselfCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
