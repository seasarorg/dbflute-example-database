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
 * The abstract condition-query of white_myself.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteMyselfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteMyselfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_myself";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
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
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @param myselfId The value of myselfId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterThan(Integer myselfId) {
        regMyselfId(CK_GT, myselfId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @param myselfId The value of myselfId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessThan(Integer myselfId) {
        regMyselfId(CK_LT, myselfId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @param myselfId The value of myselfId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterEqual(Integer myselfId) {
        regMyselfId(CK_GE, myselfId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @param myselfId The value of myselfId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessEqual(Integer myselfId) {
        regMyselfId(CK_LE, myselfId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of myselfId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myselfId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyselfId(), "MYSELF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
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
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @param myselfIdList The collection of myselfId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_NotInScope(myselfIdList);
    }

    protected void doSetMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        regINS(CK_NINS, cTL(myselfIdList), getCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MYSELF_ID from white_myself_check where ...)} <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteMyselfCheckList</span>(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteMyselfCheckList for 'exists'. (NotNull)
     */
    public void existsWhiteMyselfCheckList(SubQuery<WhiteMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_ExistsReferrer_WhiteMyselfCheckList(cb.query());
        registerExistsReferrer(cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyselfCheckList");
    }
    public abstract String keepMyselfId_ExistsReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MYSELF_ID from white_myself_check where ...)} <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteMyselfCheckList</span>(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MyselfId_NotExistsReferrer_WhiteMyselfCheckList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteMyselfCheckList(SubQuery<WhiteMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_NotExistsReferrer_WhiteMyselfCheckList(cb.query());
        registerNotExistsReferrer(cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyselfCheckList");
    }
    public abstract String keepMyselfId_NotExistsReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MYSELF_ID from white_myself_check where ...)} <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckAsOne'.
     * @param subQuery The sub-query of WhiteMyselfCheckList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteMyselfCheckList(SubQuery<WhiteMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_InScopeRelation_WhiteMyselfCheckList(cb.query());
        registerInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyselfCheckList");
    }
    public abstract String keepMyselfId_InScopeRelation_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MYSELF_ID from white_myself_check where ...)} <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckAsOne'.
     * @param subQuery The sub-query of WhiteMyselfCheckList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteMyselfCheckList(SubQuery<WhiteMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_NotInScopeRelation_WhiteMyselfCheckList(cb.query());
        registerNotInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyselfCheckList");
    }
    public abstract String keepMyselfId_NotInScopeRelation_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq);

    public void xsderiveWhiteMyselfCheckList(String fn, SubQuery<WhiteMyselfCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepMyselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MYSELF_ID", "MYSELF_ID", pp, "whiteMyselfCheckList", al, op);
    }
    public abstract String keepMyselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_myself_check where ...)} <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteMyselfCheckList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteMyselfCheckCB> derivedWhiteMyselfCheckList() {
        return xcreateQDRFunctionWhiteMyselfCheckList();
    }
    protected HpQDRFunction<WhiteMyselfCheckCB> xcreateQDRFunctionWhiteMyselfCheckList() {
        return new HpQDRFunction<WhiteMyselfCheckCB>(new HpQDRSetupper<WhiteMyselfCheckCB>() {
            public void setup(String fn, SubQuery<WhiteMyselfCheckCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteMyselfCheckList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteMyselfCheckList(String fn, SubQuery<WhiteMyselfCheckCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckList(cb.query()); String prpp = keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MYSELF_ID", "MYSELF_ID", sqpp, "whiteMyselfCheckList", rd, vl, prpp, op);
    }
    public abstract String keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq);
    public abstract String keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     */
    public void setMyselfId_IsNull() { regMyselfId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     */
    public void setMyselfId_IsNotNull() { regMyselfId(CK_ISNN, DOBJ); }

    protected void regMyselfId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMyselfId(), "MYSELF_ID"); }
    protected abstract ConditionValue getCValueMyselfId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_Equal(String myselfName) {
        doSetMyselfName_Equal(fRES(myselfName));
    }

    protected void doSetMyselfName_Equal(String myselfName) {
        regMyselfName(CK_EQ, myselfName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_NotEqual(String myselfName) {
        doSetMyselfName_NotEqual(fRES(myselfName));
    }

    protected void doSetMyselfName_NotEqual(String myselfName) {
        regMyselfName(CK_NES, myselfName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfNameList The collection of myselfName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_InScope(Collection<String> myselfNameList) {
        doSetMyselfName_InScope(myselfNameList);
    }

    public void doSetMyselfName_InScope(Collection<String> myselfNameList) {
        regINS(CK_INS, cTL(myselfNameList), getCValueMyselfName(), "MYSELF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfNameList The collection of myselfName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_NotInScope(Collection<String> myselfNameList) {
        doSetMyselfName_NotInScope(myselfNameList);
    }

    public void doSetMyselfName_NotInScope(Collection<String> myselfNameList) {
        regINS(CK_NINS, cTL(myselfNameList), getCValueMyselfName(), "MYSELF_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_PrefixSearch(String myselfName) {
        setMyselfName_LikeSearch(myselfName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setMyselfName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param myselfName The value of myselfName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMyselfName_LikeSearch(String myselfName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(myselfName), getCValueMyselfName(), "MYSELF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMyselfName_NotLikeSearch(String myselfName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(myselfName), getCValueMyselfName(), "MYSELF_NAME", likeSearchOption);
    }

    protected void regMyselfName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMyselfName(), "MYSELF_NAME"); }
    protected abstract ConditionValue getCValueMyselfName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteMyselfCB&gt;() {
     *     public void query(WhiteMyselfCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteMyselfCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteMyselfCB&gt;() {
     *     public void query(WhiteMyselfCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteMyselfCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteMyselfCB&gt;() {
     *     public void query(WhiteMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteMyselfCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteMyselfCB&gt;() {
     *     public void query(WhiteMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteMyselfCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteMyselfCB&gt;() {
     *     public void query(WhiteMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteMyselfCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteMyselfCB&gt;() {
     *     public void query(WhiteMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteMyselfCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteMyselfCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteMyselfCQ sq);

    protected WhiteMyselfCB xcreateScalarConditionCB() {
        WhiteMyselfCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteMyselfCB xcreateScalarConditionPartitionByCB() {
        WhiteMyselfCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteMyselfCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCB cb = new WhiteMyselfCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MYSELF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteMyselfCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteMyselfCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteMyselfCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCB cb = new WhiteMyselfCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MYSELF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteMyselfCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteMyselfCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCB cb = new WhiteMyselfCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteMyselfCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteMyselfCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteMyselfCB cb = new WhiteMyselfCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteMyselfCQ sq);

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
    protected WhiteMyselfCB newMyCB() {
        return new WhiteMyselfCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteMyselfCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
