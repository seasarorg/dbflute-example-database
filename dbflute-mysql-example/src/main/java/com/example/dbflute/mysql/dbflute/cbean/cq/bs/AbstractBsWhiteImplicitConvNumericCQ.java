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
 * The abstract condition-query of white_implicit_conv_numeric.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitConvNumericCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitConvNumericCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_conv_numeric";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericId The value of implicitConvNumericId as equal. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_Equal(java.math.BigDecimal implicitConvNumericId) {
        doSetImplicitConvNumericId_Equal(implicitConvNumericId);
    }

    protected void doSetImplicitConvNumericId_Equal(java.math.BigDecimal implicitConvNumericId) {
        regImplicitConvNumericId(CK_EQ, implicitConvNumericId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericId The value of implicitConvNumericId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_GreaterThan(java.math.BigDecimal implicitConvNumericId) {
        regImplicitConvNumericId(CK_GT, implicitConvNumericId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericId The value of implicitConvNumericId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_LessThan(java.math.BigDecimal implicitConvNumericId) {
        regImplicitConvNumericId(CK_LT, implicitConvNumericId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericId The value of implicitConvNumericId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_GreaterEqual(java.math.BigDecimal implicitConvNumericId) {
        regImplicitConvNumericId(CK_GE, implicitConvNumericId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericId The value of implicitConvNumericId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_LessEqual(java.math.BigDecimal implicitConvNumericId) {
        regImplicitConvNumericId(CK_LE, implicitConvNumericId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param minNumber The min number of implicitConvNumericId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of implicitConvNumericId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImplicitConvNumericId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_InScope(Collection<java.math.BigDecimal> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_InScope(implicitConvNumericIdList);
    }

    protected void doSetImplicitConvNumericId_InScope(Collection<java.math.BigDecimal> implicitConvNumericIdList) {
        regINS(CK_INS, cTL(implicitConvNumericIdList), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_NotInScope(Collection<java.math.BigDecimal> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_NotInScope(implicitConvNumericIdList);
    }

    protected void doSetImplicitConvNumericId_NotInScope(Collection<java.math.BigDecimal> implicitConvNumericIdList) {
        regINS(CK_NINS, cTL(implicitConvNumericIdList), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteImplicitConvIntegerList</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitConvIntegerList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList(cb.query());
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteImplicitConvStringList</span>(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteImplicitConvStringList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList(cb.query());
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteImplicitConvIntegerList</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteImplicitConvStringList</span>(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvIntegerList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList(cb.query());
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvStringList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList(cb.query());
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvIntegerList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvIntegerList(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList(cb.query());
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_NUMERIC_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvStringList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList(cb.query());
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    public void xsderiveWhiteImplicitConvIntegerList(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvIntegerList", al, op);
    }
    public abstract String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    public void xsderiveWhiteImplicitConvStringList(String fn, SubQuery<WhiteImplicitConvStringCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", pp, "whiteImplicitConvStringList", al, op);
    }
    public abstract String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteImplicitConvIntegerList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
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
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(cb.query()); String prpp = keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", sqpp, "whiteImplicitConvIntegerList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);
    public abstract String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteImplicitConvStringList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvStringCB> derivedWhiteImplicitConvStringList() {
        return xcreateQDRFunctionWhiteImplicitConvStringList();
    }
    protected HpQDRFunction<WhiteImplicitConvStringCB> xcreateQDRFunctionWhiteImplicitConvStringList() {
        return new HpQDRFunction<WhiteImplicitConvStringCB>(new HpQDRSetupper<WhiteImplicitConvStringCB>() {
            public void setup(String fn, SubQuery<WhiteImplicitConvStringCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteImplicitConvStringList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteImplicitConvStringList(String fn, SubQuery<WhiteImplicitConvStringCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList(cb.query()); String prpp = keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", sqpp, "whiteImplicitConvStringList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);
    public abstract String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     */
    public void setImplicitConvNumericId_IsNull() { regImplicitConvNumericId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     */
    public void setImplicitConvNumericId_IsNotNull() { regImplicitConvNumericId(CK_ISNN, DOBJ); }

    protected void regImplicitConvNumericId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID"); }
    protected abstract ConditionValue getCValueImplicitConvNumericId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as equal. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_Equal(java.math.BigDecimal implicitConvIntegerId) {
        doSetImplicitConvIntegerId_Equal(implicitConvIntegerId);
    }

    protected void doSetImplicitConvIntegerId_Equal(java.math.BigDecimal implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_EQ, implicitConvIntegerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_GreaterThan(java.math.BigDecimal implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_GT, implicitConvIntegerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_LessThan(java.math.BigDecimal implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_LT, implicitConvIntegerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_GreaterEqual(java.math.BigDecimal implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_GE, implicitConvIntegerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_LessEqual(java.math.BigDecimal implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_LE, implicitConvIntegerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param minNumber The min number of implicitConvIntegerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of implicitConvIntegerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImplicitConvIntegerId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_InScope(Collection<java.math.BigDecimal> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_InScope(implicitConvIntegerIdList);
    }

    protected void doSetImplicitConvIntegerId_InScope(Collection<java.math.BigDecimal> implicitConvIntegerIdList) {
        regINS(CK_INS, cTL(implicitConvIntegerIdList), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_NotInScope(Collection<java.math.BigDecimal> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_NotInScope(implicitConvIntegerIdList);
    }

    protected void doSetImplicitConvIntegerId_NotInScope(Collection<java.math.BigDecimal> implicitConvIntegerIdList) {
        regINS(CK_NINS, cTL(implicitConvIntegerIdList), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_integer where ...)} <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param subQuery The sub-query of WhiteImplicitConvInteger for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvInteger(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(cb.query());
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
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(cb.query());
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvInteger");
    }
    public abstract String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq);

    protected void regImplicitConvIntegerId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID"); }
    protected abstract ConditionValue getCValueImplicitConvIntegerId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as equal. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_Equal(java.math.BigDecimal implicitConvStringId) {
        doSetImplicitConvStringId_Equal(implicitConvStringId);
    }

    protected void doSetImplicitConvStringId_Equal(java.math.BigDecimal implicitConvStringId) {
        regImplicitConvStringId(CK_EQ, implicitConvStringId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_GreaterThan(java.math.BigDecimal implicitConvStringId) {
        regImplicitConvStringId(CK_GT, implicitConvStringId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_LessThan(java.math.BigDecimal implicitConvStringId) {
        regImplicitConvStringId(CK_LT, implicitConvStringId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_GreaterEqual(java.math.BigDecimal implicitConvStringId) {
        regImplicitConvStringId(CK_GE, implicitConvStringId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_LessEqual(java.math.BigDecimal implicitConvStringId) {
        regImplicitConvStringId(CK_LE, implicitConvStringId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param minNumber The min number of implicitConvStringId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of implicitConvStringId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImplicitConvStringId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringIdList The collection of implicitConvStringId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_InScope(Collection<java.math.BigDecimal> implicitConvStringIdList) {
        doSetImplicitConvStringId_InScope(implicitConvStringIdList);
    }

    protected void doSetImplicitConvStringId_InScope(Collection<java.math.BigDecimal> implicitConvStringIdList) {
        regINS(CK_INS, cTL(implicitConvStringIdList), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringIdList The collection of implicitConvStringId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_NotInScope(Collection<java.math.BigDecimal> implicitConvStringIdList) {
        doSetImplicitConvStringId_NotInScope(implicitConvStringIdList);
    }

    protected void doSetImplicitConvStringId_NotInScope(Collection<java.math.BigDecimal> implicitConvStringIdList) {
        regINS(CK_NINS, cTL(implicitConvStringIdList), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @param subQuery The sub-query of WhiteImplicitConvString for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvString(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(cb.query());
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvString");
    }
    public abstract String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @param subQuery The sub-query of WhiteImplicitConvString for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvString(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(cb.query());
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvString");
    }
    public abstract String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq);

    protected void regImplicitConvStringId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID"); }
    protected abstract ConditionValue getCValueImplicitConvStringId();

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
     * <pre>e.g. setImplicitConvName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvNumericCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteImplicitConvNumericCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvNumericCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteImplicitConvNumericCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvNumericCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteImplicitConvNumericCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvNumericCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteImplicitConvNumericCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvNumericCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteImplicitConvNumericCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvNumericCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteImplicitConvNumericCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitConvNumericCQ sq);

    protected WhiteImplicitConvNumericCB xcreateScalarConditionCB() {
        WhiteImplicitConvNumericCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitConvNumericCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitConvNumericCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "IMPLICIT_CONV_NUMERIC_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitConvNumericCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvNumericCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitConvNumericCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPLICIT_CONV_NUMERIC_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitConvNumericCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitConvNumericCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteImplicitConvNumericCQ sq);

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
    protected WhiteImplicitConvNumericCB newMyCB() {
        return new WhiteImplicitConvNumericCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteImplicitConvNumericCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
