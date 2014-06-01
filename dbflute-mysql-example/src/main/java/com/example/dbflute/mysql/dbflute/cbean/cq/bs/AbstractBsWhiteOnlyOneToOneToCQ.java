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
 * The abstract condition-query of white_only_one_to_one_to.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOnlyOneToOneToCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOnlyOneToOneToCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_only_one_to_one_to";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as equal. (NullAllowed: if null, no condition)
     */
    public void setToId_Equal(Long toId) {
        doSetToId_Equal(toId);
    }

    protected void doSetToId_Equal(Long toId) {
        regToId(CK_EQ, toId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setToId_GreaterThan(Long toId) {
        regToId(CK_GT, toId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setToId_LessThan(Long toId) {
        regToId(CK_LT, toId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setToId_GreaterEqual(Long toId) {
        regToId(CK_GE, toId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setToId_LessEqual(Long toId) {
        regToId(CK_LE, toId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of toId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of toId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setToId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueToId(), "TO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toIdList The collection of toId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setToId_InScope(Collection<Long> toIdList) {
        doSetToId_InScope(toIdList);
    }

    protected void doSetToId_InScope(Collection<Long> toIdList) {
        regINS(CK_INS, cTL(toIdList), getCValueToId(), "TO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toIdList The collection of toId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setToId_NotInScope(Collection<Long> toIdList) {
        doSetToId_NotInScope(toIdList);
    }

    protected void doSetToId_NotInScope(Collection<Long> toIdList) {
        regINS(CK_NINS, cTL(toIdList), getCValueToId(), "TO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setToId_IsNull() { regToId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setToId_IsNotNull() { regToId(CK_ISNN, DOBJ); }

    protected void regToId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueToId(), "TO_ID"); }
    protected abstract ConditionValue getCValueToId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setToName_Equal(String toName) {
        doSetToName_Equal(fRES(toName));
    }

    protected void doSetToName_Equal(String toName) {
        regToName(CK_EQ, toName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setToName_NotEqual(String toName) {
        doSetToName_NotEqual(fRES(toName));
    }

    protected void doSetToName_NotEqual(String toName) {
        regToName(CK_NES, toName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toNameList The collection of toName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setToName_InScope(Collection<String> toNameList) {
        doSetToName_InScope(toNameList);
    }

    public void doSetToName_InScope(Collection<String> toNameList) {
        regINS(CK_INS, cTL(toNameList), getCValueToName(), "TO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toNameList The collection of toName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setToName_NotInScope(Collection<String> toNameList) {
        doSetToName_NotInScope(toNameList);
    }

    public void doSetToName_NotInScope(Collection<String> toNameList) {
        regINS(CK_NINS, cTL(toNameList), getCValueToName(), "TO_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setToName_PrefixSearch(String toName) {
        setToName_LikeSearch(toName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setToName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param toName The value of toName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToName_LikeSearch(String toName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(toName), getCValueToName(), "TO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setToName_NotLikeSearch(String toName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(toName), getCValueToName(), "TO_NAME", likeSearchOption);
    }

    protected void regToName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueToName(), "TO_NAME"); }
    protected abstract ConditionValue getCValueToName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as equal. (NullAllowed: if null, no condition)
     */
    public void setFromId_Equal(Long fromId) {
        doSetFromId_Equal(fromId);
    }

    protected void doSetFromId_Equal(Long fromId) {
        regFromId(CK_EQ, fromId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFromId_GreaterThan(Long fromId) {
        regFromId(CK_GT, fromId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFromId_LessThan(Long fromId) {
        regFromId(CK_LT, fromId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFromId_GreaterEqual(Long fromId) {
        regFromId(CK_GE, fromId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFromId_LessEqual(Long fromId) {
        regFromId(CK_LE, fromId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param minNumber The min number of fromId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fromId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFromId(), "FROM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromIdList The collection of fromId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromId_InScope(Collection<Long> fromIdList) {
        doSetFromId_InScope(fromIdList);
    }

    protected void doSetFromId_InScope(Collection<Long> fromIdList) {
        regINS(CK_INS, cTL(fromIdList), getCValueFromId(), "FROM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromIdList The collection of fromId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFromId_NotInScope(Collection<Long> fromIdList) {
        doSetFromId_NotInScope(fromIdList);
    }

    protected void doSetFromId_NotInScope(Collection<Long> fromIdList) {
        regINS(CK_NINS, cTL(fromIdList), getCValueFromId(), "FROM_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FROM_ID from white_only_one_to_one_from where ...)} <br />
     * white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @param subQuery The sub-query of WhiteOnlyOneToOneFrom for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteOnlyOneToOneFrom(SubQuery<WhiteOnlyOneToOneFromCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepFromId_InScopeRelation_WhiteOnlyOneToOneFrom(cb.query());
        registerInScopeRelation(cb.query(), "FROM_ID", "FROM_ID", pp, "whiteOnlyOneToOneFrom");
    }
    public abstract String keepFromId_InScopeRelation_WhiteOnlyOneToOneFrom(WhiteOnlyOneToOneFromCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FROM_ID from white_only_one_to_one_from where ...)} <br />
     * white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @param subQuery The sub-query of WhiteOnlyOneToOneFrom for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteOnlyOneToOneFrom(SubQuery<WhiteOnlyOneToOneFromCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepFromId_NotInScopeRelation_WhiteOnlyOneToOneFrom(cb.query());
        registerNotInScopeRelation(cb.query(), "FROM_ID", "FROM_ID", pp, "whiteOnlyOneToOneFrom");
    }
    public abstract String keepFromId_NotInScopeRelation_WhiteOnlyOneToOneFrom(WhiteOnlyOneToOneFromCQ sq);

    protected void regFromId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFromId(), "FROM_ID"); }
    protected abstract ConditionValue getCValueFromId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneToCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteOnlyOneToOneToCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneToCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteOnlyOneToOneToCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneToCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteOnlyOneToOneToCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneToCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteOnlyOneToOneToCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneToCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteOnlyOneToOneToCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteOnlyOneToOneToCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteOnlyOneToOneToCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneToCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteOnlyOneToOneToCQ sq);

    protected WhiteOnlyOneToOneToCB xcreateScalarConditionCB() {
        WhiteOnlyOneToOneToCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOnlyOneToOneToCB xcreateScalarConditionPartitionByCB() {
        WhiteOnlyOneToOneToCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOnlyOneToOneToCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "TO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOnlyOneToOneToCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOnlyOneToOneToCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOnlyOneToOneToCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOnlyOneToOneToCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOnlyOneToOneToCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOnlyOneToOneToCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteOnlyOneToOneToCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteOnlyOneToOneToCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteOnlyOneToOneToCB newMyCB() {
        return new WhiteOnlyOneToOneToCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteOnlyOneToOneToCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
