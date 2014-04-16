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
 * The abstract condition-query of white_implicit_conv_string.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitConvStringCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitConvStringCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
        return "white_implicit_conv_string";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_Equal(String implicitConvStringId) {
        doSetImplicitConvStringId_Equal(fRES(implicitConvStringId));
    }

    protected void doSetImplicitConvStringId_Equal(String implicitConvStringId) {
        regImplicitConvStringId(CK_EQ, implicitConvStringId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_NotEqual(String implicitConvStringId) {
        doSetImplicitConvStringId_NotEqual(fRES(implicitConvStringId));
    }

    protected void doSetImplicitConvStringId_NotEqual(String implicitConvStringId) {
        regImplicitConvStringId(CK_NES, implicitConvStringId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringIdList The collection of implicitConvStringId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_InScope(Collection<String> implicitConvStringIdList) {
        doSetImplicitConvStringId_InScope(implicitConvStringIdList);
    }

    public void doSetImplicitConvStringId_InScope(Collection<String> implicitConvStringIdList) {
        regINS(CK_INS, cTL(implicitConvStringIdList), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringIdList The collection of implicitConvStringId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_NotInScope(Collection<String> implicitConvStringIdList) {
        doSetImplicitConvStringId_NotInScope(implicitConvStringIdList);
    }

    public void doSetImplicitConvStringId_NotInScope(Collection<String> implicitConvStringIdList) {
        regINS(CK_NINS, cTL(implicitConvStringIdList), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_PrefixSearch(String implicitConvStringId) {
        setImplicitConvStringId_LikeSearch(implicitConvStringId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br />
     * <pre>e.g. setImplicitConvStringId_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvStringId The value of implicitConvStringId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvStringId_LikeSearch(String implicitConvStringId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvStringId), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvStringId_NotLikeSearch(String implicitConvStringId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvStringId), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteImplicitConvIntegerList</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitConvIntegerList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteImplicitConvNumericList</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitConvNumericList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteImplicitConvIntegerList</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteImplicitConvNumericList</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvIntegerList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvNumericList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvIntegerList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvNumericList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    public void xsderiveWhiteImplicitConvIntegerList(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList", al, op);
    }
    public abstract String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    public void xsderiveWhiteImplicitConvNumericList(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList", al, op);
    }
    public abstract String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteImplicitConvIntegerList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvIntegerCB> derivedWhiteImplicitConvIntegerList() {
        return xcreateQDRFunctionWhiteImplicitConvIntegerList();
    }
    protected HpQDRFunction<WhiteImplicitConvIntegerCB> xcreateQDRFunctionWhiteImplicitConvIntegerList() {
        return new HpQDRFunction<WhiteImplicitConvIntegerCB>(new HpQDRSetupper<WhiteImplicitConvIntegerCB>() {
            public void setup(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteImplicitConvIntegerList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteImplicitConvIntegerList(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(cb.query()); // for saving query-value.
        String prpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", sqpp, "whiteImplicitConvIntegerList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteImplicitConvNumericList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvNumericCB> derivedWhiteImplicitConvNumericList() {
        return xcreateQDRFunctionWhiteImplicitConvNumericList();
    }
    protected HpQDRFunction<WhiteImplicitConvNumericCB> xcreateQDRFunctionWhiteImplicitConvNumericList() {
        return new HpQDRFunction<WhiteImplicitConvNumericCB>(new HpQDRSetupper<WhiteImplicitConvNumericCB>() {
            public void setup(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteImplicitConvNumericList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteImplicitConvNumericList(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        String prpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", sqpp, "whiteImplicitConvNumericList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     */
    public void setImplicitConvStringId_IsNull() { regImplicitConvStringId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     */
    public void setImplicitConvStringId_IsNotNull() { regImplicitConvStringId(CK_ISNN, DOBJ); }

    protected void regImplicitConvStringId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID"); }
    protected abstract ConditionValue getCValueImplicitConvStringId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_Equal(String implicitConvIntegerId) {
        doSetImplicitConvIntegerId_Equal(fRES(implicitConvIntegerId));
    }

    protected void doSetImplicitConvIntegerId_Equal(String implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_EQ, implicitConvIntegerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_NotEqual(String implicitConvIntegerId) {
        doSetImplicitConvIntegerId_NotEqual(fRES(implicitConvIntegerId));
    }

    protected void doSetImplicitConvIntegerId_NotEqual(String implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_NES, implicitConvIntegerId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_InScope(Collection<String> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_InScope(implicitConvIntegerIdList);
    }

    public void doSetImplicitConvIntegerId_InScope(Collection<String> implicitConvIntegerIdList) {
        regINS(CK_INS, cTL(implicitConvIntegerIdList), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_NotInScope(Collection<String> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_NotInScope(implicitConvIntegerIdList);
    }

    public void doSetImplicitConvIntegerId_NotInScope(Collection<String> implicitConvIntegerIdList) {
        regINS(CK_NINS, cTL(implicitConvIntegerIdList), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_PrefixSearch(String implicitConvIntegerId) {
        setImplicitConvIntegerId_LikeSearch(implicitConvIntegerId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * <pre>e.g. setImplicitConvIntegerId_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvIntegerId The value of implicitConvIntegerId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvIntegerId_LikeSearch(String implicitConvIntegerId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvIntegerId), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvIntegerId_NotLikeSearch(String implicitConvIntegerId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvIntegerId), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param subQuery The sub-query of WhiteImplicitConvInteger for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvInteger(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvInteger");
    }
    public abstract String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param subQuery The sub-query of WhiteImplicitConvInteger for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvInteger(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvInteger");
    }
    public abstract String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq);

    protected void regImplicitConvIntegerId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID"); }
    protected abstract ConditionValue getCValueImplicitConvIntegerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_Equal(String implicitConvNumericId) {
        doSetImplicitConvNumericId_Equal(fRES(implicitConvNumericId));
    }

    protected void doSetImplicitConvNumericId_Equal(String implicitConvNumericId) {
        regImplicitConvNumericId(CK_EQ, implicitConvNumericId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_NotEqual(String implicitConvNumericId) {
        doSetImplicitConvNumericId_NotEqual(fRES(implicitConvNumericId));
    }

    protected void doSetImplicitConvNumericId_NotEqual(String implicitConvNumericId) {
        regImplicitConvNumericId(CK_NES, implicitConvNumericId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_InScope(Collection<String> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_InScope(implicitConvNumericIdList);
    }

    public void doSetImplicitConvNumericId_InScope(Collection<String> implicitConvNumericIdList) {
        regINS(CK_INS, cTL(implicitConvNumericIdList), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_NotInScope(Collection<String> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_NotInScope(implicitConvNumericIdList);
    }

    public void doSetImplicitConvNumericId_NotInScope(Collection<String> implicitConvNumericIdList) {
        regINS(CK_NINS, cTL(implicitConvNumericIdList), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_PrefixSearch(String implicitConvNumericId) {
        setImplicitConvNumericId_LikeSearch(implicitConvNumericId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * <pre>e.g. setImplicitConvNumericId_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvNumericId The value of implicitConvNumericId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvNumericId_LikeSearch(String implicitConvNumericId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvNumericId), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvNumericId_NotLikeSearch(String implicitConvNumericId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvNumericId), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @param subQuery The sub-query of WhiteImplicitConvNumeric for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvNumeric(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvNumeric");
    }
    public abstract String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @param subQuery The sub-query of WhiteImplicitConvNumeric for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvNumeric(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvNumeric");
    }
    public abstract String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq);

    protected void regImplicitConvNumericId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID"); }
    protected abstract ConditionValue getCValueImplicitConvNumericId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvName_Equal(String implicitConvName) {
        doSetImplicitConvName_Equal(fRES(implicitConvName));
    }

    protected void doSetImplicitConvName_Equal(String implicitConvName) {
        regImplicitConvName(CK_EQ, implicitConvName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvName_NotEqual(String implicitConvName) {
        doSetImplicitConvName_NotEqual(fRES(implicitConvName));
    }

    protected void doSetImplicitConvName_NotEqual(String implicitConvName) {
        regImplicitConvName(CK_NES, implicitConvName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvNameList The collection of implicitConvName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvName_InScope(Collection<String> implicitConvNameList) {
        doSetImplicitConvName_InScope(implicitConvNameList);
    }

    public void doSetImplicitConvName_InScope(Collection<String> implicitConvNameList) {
        regINS(CK_INS, cTL(implicitConvNameList), getCValueImplicitConvName(), "IMPLICIT_CONV_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvNameList The collection of implicitConvName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvName_NotInScope(Collection<String> implicitConvNameList) {
        doSetImplicitConvName_NotInScope(implicitConvNameList);
    }

    public void doSetImplicitConvName_NotInScope(Collection<String> implicitConvNameList) {
        regINS(CK_NINS, cTL(implicitConvNameList), getCValueImplicitConvName(), "IMPLICIT_CONV_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvName_PrefixSearch(String implicitConvName) {
        setImplicitConvName_LikeSearch(implicitConvName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setImplicitConvName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvName The value of implicitConvName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvName_LikeSearch(String implicitConvName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvName), getCValueImplicitConvName(), "IMPLICIT_CONV_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvName_NotLikeSearch(String implicitConvName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvName), getCValueImplicitConvName(), "IMPLICIT_CONV_NAME", likeSearchOption);
    }

    protected void regImplicitConvName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvName(), "IMPLICIT_CONV_NAME"); }
    protected abstract ConditionValue getCValueImplicitConvName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvStringCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteImplicitConvStringCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvStringCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteImplicitConvStringCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvStringCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteImplicitConvStringCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvStringCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteImplicitConvStringCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvStringCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteImplicitConvStringCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvStringCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteImplicitConvStringCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitConvStringCQ sq);

    protected WhiteImplicitConvStringCB xcreateScalarConditionCB() {
        WhiteImplicitConvStringCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitConvStringCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitConvStringCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitConvStringCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "IMPLICIT_CONV_STRING_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitConvStringCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvStringCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitConvStringCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPLICIT_CONV_STRING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitConvStringCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitConvStringCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteImplicitConvStringCQ sq);

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
    protected WhiteImplicitConvStringCB newMyCB() {
        return new WhiteImplicitConvStringCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteImplicitConvStringCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
