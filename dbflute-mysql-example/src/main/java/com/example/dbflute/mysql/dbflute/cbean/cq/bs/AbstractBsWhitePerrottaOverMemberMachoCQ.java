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
 * The abstract condition-query of white_perrotta_over_member_macho.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverMemberMachoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverMemberMachoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_perrotta_over_member_macho";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoCode_Equal(String machoCode) {
        doSetMachoCode_Equal(fRES(machoCode));
    }

    protected void doSetMachoCode_Equal(String machoCode) {
        regMachoCode(CK_EQ, machoCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoCode_NotEqual(String machoCode) {
        doSetMachoCode_NotEqual(fRES(machoCode));
    }

    protected void doSetMachoCode_NotEqual(String machoCode) {
        regMachoCode(CK_NES, machoCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCodeList The collection of machoCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoCode_InScope(Collection<String> machoCodeList) {
        doSetMachoCode_InScope(machoCodeList);
    }

    public void doSetMachoCode_InScope(Collection<String> machoCodeList) {
        regINS(CK_INS, cTL(machoCodeList), getCValueMachoCode(), "MACHO_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCodeList The collection of machoCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoCode_NotInScope(Collection<String> machoCodeList) {
        doSetMachoCode_NotInScope(machoCodeList);
    }

    public void doSetMachoCode_NotInScope(Collection<String> machoCodeList) {
        regINS(CK_NINS, cTL(machoCodeList), getCValueMachoCode(), "MACHO_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoCode_PrefixSearch(String machoCode) {
        setMachoCode_LikeSearch(machoCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setMachoCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machoCode The value of machoCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachoCode_LikeSearch(String machoCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machoCode), getCValueMachoCode(), "MACHO_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachoCode_NotLikeSearch(String machoCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machoCode), getCValueMachoCode(), "MACHO_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MACHO_CODE from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhitePerrottaOverMemberList</span>(new SubQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void query(WhitePerrottaOverMemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePerrottaOverMemberList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMachoCode_ExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerExistsReferrer(cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepMachoCode_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MACHO_CODE from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhitePerrottaOverMemberList</span>(new SubQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void query(WhitePerrottaOverMemberCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MachoCode_NotExistsReferrer_WhitePerrottaOverMemberList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMachoCode_NotExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepMachoCode_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MACHO_CODE from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverMemberList for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMachoCode_InScopeRelation_WhitePerrottaOverMemberList(cb.query());
        registerInScopeRelation(cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepMachoCode_InScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MACHO_CODE from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * @param subQuery The sub-query of WhitePerrottaOverMemberList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePerrottaOverMemberList(SubQuery<WhitePerrottaOverMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMachoCode_NotInScopeRelation_WhitePerrottaOverMemberList(cb.query());
        registerNotInScopeRelation(cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepMachoCode_NotInScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    public void xsderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepMachoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList", al, op);
    }
    public abstract String keepMachoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_member where ...)} <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhitePerrottaOverMemberList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void query(WhitePerrottaOverMemberCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverMemberCB> derivedWhitePerrottaOverMemberList() {
        return xcreateQDRFunctionWhitePerrottaOverMemberList();
    }
    protected HpQDRFunction<WhitePerrottaOverMemberCB> xcreateQDRFunctionWhitePerrottaOverMemberList() {
        return new HpQDRFunction<WhitePerrottaOverMemberCB>(new HpQDRSetupper<WhitePerrottaOverMemberCB>() {
            public void setup(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhitePerrottaOverMemberList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList(cb.query()); String prpp = keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MACHO_CODE", "MACHO_CODE", sqpp, "whitePerrottaOverMemberList", rd, vl, prpp, op);
    }
    public abstract String keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);
    public abstract String keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setMachoCode_IsNull() { regMachoCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setMachoCode_IsNotNull() { regMachoCode(CK_ISNN, DOBJ); }

    protected void regMachoCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMachoCode(), "MACHO_CODE"); }
    protected abstract ConditionValue getCValueMachoCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoName_Equal(String machoName) {
        doSetMachoName_Equal(fRES(machoName));
    }

    protected void doSetMachoName_Equal(String machoName) {
        regMachoName(CK_EQ, machoName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoName_NotEqual(String machoName) {
        doSetMachoName_NotEqual(fRES(machoName));
    }

    protected void doSetMachoName_NotEqual(String machoName) {
        regMachoName(CK_NES, machoName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoNameList The collection of machoName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoName_InScope(Collection<String> machoNameList) {
        doSetMachoName_InScope(machoNameList);
    }

    public void doSetMachoName_InScope(Collection<String> machoNameList) {
        regINS(CK_INS, cTL(machoNameList), getCValueMachoName(), "MACHO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoNameList The collection of machoName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoName_NotInScope(Collection<String> machoNameList) {
        doSetMachoName_NotInScope(machoNameList);
    }

    public void doSetMachoName_NotInScope(Collection<String> machoNameList) {
        regINS(CK_NINS, cTL(machoNameList), getCValueMachoName(), "MACHO_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMachoName_PrefixSearch(String machoName) {
        setMachoName_LikeSearch(machoName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMachoName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machoName The value of machoName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachoName_LikeSearch(String machoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machoName), getCValueMachoName(), "MACHO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachoName_NotLikeSearch(String machoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machoName), getCValueMachoName(), "MACHO_NAME", likeSearchOption);
    }

    protected void regMachoName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMachoName(), "MACHO_NAME"); }
    protected abstract ConditionValue getCValueMachoName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverMemberMachoCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhitePerrottaOverMemberMachoCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverMemberMachoCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhitePerrottaOverMemberMachoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverMemberMachoCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhitePerrottaOverMemberMachoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverMemberMachoCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhitePerrottaOverMemberMachoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverMemberMachoCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhitePerrottaOverMemberMachoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverMemberMachoCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhitePerrottaOverMemberMachoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberMachoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverMemberMachoCQ sq);

    protected WhitePerrottaOverMemberMachoCB xcreateScalarConditionCB() {
        WhitePerrottaOverMemberMachoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverMemberMachoCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverMemberMachoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverMemberMachoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MACHO_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverMemberMachoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverMemberMachoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverMemberMachoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MACHO_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverMemberMachoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverMemberMachoCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverMemberMachoCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePerrottaOverMemberMachoCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhitePerrottaOverMemberMachoCQ sq);

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
    protected WhitePerrottaOverMemberMachoCB newMyCB() {
        return new WhitePerrottaOverMemberMachoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverMemberMachoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
