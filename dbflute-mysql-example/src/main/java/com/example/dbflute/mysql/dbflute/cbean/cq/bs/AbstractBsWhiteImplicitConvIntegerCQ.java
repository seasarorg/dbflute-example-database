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
 * The abstract condition-query of white_implicit_conv_integer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitConvIntegerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitConvIntegerCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_conv_integer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as equal. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_Equal(Integer implicitConvIntegerId) {
        doSetImplicitConvIntegerId_Equal(implicitConvIntegerId);
    }

    protected void doSetImplicitConvIntegerId_Equal(Integer implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_EQ, implicitConvIntegerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_GreaterThan(Integer implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_GT, implicitConvIntegerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_LessThan(Integer implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_LT, implicitConvIntegerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_GreaterEqual(Integer implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_GE, implicitConvIntegerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvIntegerId_LessEqual(Integer implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_LE, implicitConvIntegerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of implicitConvIntegerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of implicitConvIntegerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImplicitConvIntegerId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_InScope(Collection<Integer> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_InScope(implicitConvIntegerIdList);
    }

    protected void doSetImplicitConvIntegerId_InScope(Collection<Integer> implicitConvIntegerIdList) {
        regINS(CK_INS, cTL(implicitConvIntegerIdList), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvIntegerId_NotInScope(Collection<Integer> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_NotInScope(implicitConvIntegerIdList);
    }

    protected void doSetImplicitConvIntegerId_NotInScope(Collection<Integer> implicitConvIntegerIdList) {
        regINS(CK_NINS, cTL(implicitConvIntegerIdList), getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteImplicitConvNumericList</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
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
        String pp = keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringAsOne'.
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
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteImplicitConvNumericList</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteImplicitConvStringList</span>(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvNumericList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvStringList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvNumericList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvNumericList(SubQuery<WhiteImplicitConvNumericCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPLICIT_CONV_INTEGER_ID from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringAsOne'.
     * @param subQuery The sub-query of WhiteImplicitConvStringList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteImplicitConvStringList(SubQuery<WhiteImplicitConvStringCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvStringList");
    }
    public abstract String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    public void xsderiveWhiteImplicitConvNumericList(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvNumericList", al, op);
    }
    public abstract String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    public void xsderiveWhiteImplicitConvStringList(String fn, SubQuery<WhiteImplicitConvStringCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", pp, "whiteImplicitConvStringList", al, op);
    }
    public abstract String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_numeric where ...)} <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteImplicitConvNumericList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void query(WhiteImplicitConvNumericCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
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
        String sqpp = keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList(cb.query()); // for saving query-value.
        String prpp = keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", sqpp, "whiteImplicitConvNumericList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);
    public abstract String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_string where ...)} <br />
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringAsOne'.
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
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList(cb.query()); // for saving query-value.
        String prpp = keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", sqpp, "whiteImplicitConvStringList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq);
    public abstract String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     */
    public void setImplicitConvIntegerId_IsNull() { regImplicitConvIntegerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     */
    public void setImplicitConvIntegerId_IsNotNull() { regImplicitConvIntegerId(CK_ISNN, DOBJ); }

    protected void regImplicitConvIntegerId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID"); }
    protected abstract ConditionValue getCValueImplicitConvIntegerId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as equal. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_Equal(Integer implicitConvNumericId) {
        doSetImplicitConvNumericId_Equal(implicitConvNumericId);
    }

    protected void doSetImplicitConvNumericId_Equal(Integer implicitConvNumericId) {
        regImplicitConvNumericId(CK_EQ, implicitConvNumericId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_GreaterThan(Integer implicitConvNumericId) {
        regImplicitConvNumericId(CK_GT, implicitConvNumericId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_LessThan(Integer implicitConvNumericId) {
        regImplicitConvNumericId(CK_LT, implicitConvNumericId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_GreaterEqual(Integer implicitConvNumericId) {
        regImplicitConvNumericId(CK_GE, implicitConvNumericId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvNumericId_LessEqual(Integer implicitConvNumericId) {
        regImplicitConvNumericId(CK_LE, implicitConvNumericId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param minNumber The min number of implicitConvNumericId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of implicitConvNumericId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImplicitConvNumericId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_InScope(Collection<Integer> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_InScope(implicitConvNumericIdList);
    }

    protected void doSetImplicitConvNumericId_InScope(Collection<Integer> implicitConvNumericIdList) {
        regINS(CK_INS, cTL(implicitConvNumericIdList), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvNumericId_NotInScope(Collection<Integer> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_NotInScope(implicitConvNumericIdList);
    }

    protected void doSetImplicitConvNumericId_NotInScope(Collection<Integer> implicitConvNumericIdList) {
        regINS(CK_NINS, cTL(implicitConvNumericIdList), getCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as equal. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_Equal(Integer implicitConvStringId) {
        doSetImplicitConvStringId_Equal(implicitConvStringId);
    }

    protected void doSetImplicitConvStringId_Equal(Integer implicitConvStringId) {
        regImplicitConvStringId(CK_EQ, implicitConvStringId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_GreaterThan(Integer implicitConvStringId) {
        regImplicitConvStringId(CK_GT, implicitConvStringId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_LessThan(Integer implicitConvStringId) {
        regImplicitConvStringId(CK_LT, implicitConvStringId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_GreaterEqual(Integer implicitConvStringId) {
        regImplicitConvStringId(CK_GE, implicitConvStringId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringId The value of implicitConvStringId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setImplicitConvStringId_LessEqual(Integer implicitConvStringId) {
        regImplicitConvStringId(CK_LE, implicitConvStringId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param minNumber The min number of implicitConvStringId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of implicitConvStringId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImplicitConvStringId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringIdList The collection of implicitConvStringId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_InScope(Collection<Integer> implicitConvStringIdList) {
        doSetImplicitConvStringId_InScope(implicitConvStringIdList);
    }

    protected void doSetImplicitConvStringId_InScope(Collection<Integer> implicitConvStringIdList) {
        regINS(CK_INS, cTL(implicitConvStringIdList), getCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @param implicitConvStringIdList The collection of implicitConvStringId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setImplicitConvStringId_NotInScope(Collection<Integer> implicitConvStringIdList) {
        doSetImplicitConvStringId_NotInScope(implicitConvStringIdList);
    }

    protected void doSetImplicitConvStringId_NotInScope(Collection<Integer> implicitConvStringIdList) {
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
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(cb.query()); // for saving query-value.
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
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(cb.query()); // for saving query-value.
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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvIntegerCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteImplicitConvIntegerCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvIntegerCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteImplicitConvIntegerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvIntegerCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteImplicitConvIntegerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvIntegerCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteImplicitConvIntegerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvIntegerCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteImplicitConvIntegerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void query(WhiteImplicitConvIntegerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteImplicitConvIntegerCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteImplicitConvIntegerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitConvIntegerCQ sq);

    protected WhiteImplicitConvIntegerCB xcreateScalarConditionCB() {
        WhiteImplicitConvIntegerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitConvIntegerCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitConvIntegerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "IMPLICIT_CONV_INTEGER_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitConvIntegerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvIntegerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitConvIntegerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPLICIT_CONV_INTEGER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitConvIntegerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitConvIntegerCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteImplicitConvIntegerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteImplicitConvIntegerCQ sq);

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
    protected WhiteImplicitConvIntegerCB newMyCB() {
        return new WhiteImplicitConvIntegerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteImplicitConvIntegerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
