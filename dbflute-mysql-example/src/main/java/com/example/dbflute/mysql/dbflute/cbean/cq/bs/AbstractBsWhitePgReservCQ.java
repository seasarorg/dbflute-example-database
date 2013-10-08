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
 * The abstract condition-query of white_pg_reserv.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePgReservCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePgReservCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_pg_reserv";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_Equal(Integer classSynonym) {
        doSetClassSynonym_Equal(classSynonym);
    }

    protected void doSetClassSynonym_Equal(Integer classSynonym) {
        regClassSynonym(CK_EQ, classSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_GreaterThan(Integer classSynonym) {
        regClassSynonym(CK_GT, classSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_LessThan(Integer classSynonym) {
        regClassSynonym(CK_LT, classSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_GreaterEqual(Integer classSynonym) {
        regClassSynonym(CK_GE, classSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setClassSynonym_LessEqual(Integer classSynonym) {
        regClassSynonym(CK_LE, classSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param minNumber The min number of classSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of classSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueClassSynonym(), "CLASS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonymList The collection of classSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClassSynonym_InScope(Collection<Integer> classSynonymList) {
        doSetClassSynonym_InScope(classSynonymList);
    }

    protected void doSetClassSynonym_InScope(Collection<Integer> classSynonymList) {
        regINS(CK_INS, cTL(classSynonymList), getCValueClassSynonym(), "CLASS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonymList The collection of classSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClassSynonym_NotInScope(Collection<Integer> classSynonymList) {
        doSetClassSynonym_NotInScope(classSynonymList);
    }

    protected void doSetClassSynonym_NotInScope(Collection<Integer> classSynonymList) {
        regINS(CK_NINS, cTL(classSynonymList), getCValueClassSynonym(), "CLASS");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select CLASS from white_pg_reserv_ref where ...)} <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhitePgReservRefList</span>(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePgReservRefList for 'exists'. (NotNull)
     */
    public void existsWhitePgReservRefList(SubQuery<WhitePgReservRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePgReservRefCB>", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepClassSynonym_ExistsReferrer_WhitePgReservRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "CLASS", "CLASS", subQueryPropertyName, "whitePgReservRefList");
    }
    public abstract String keepClassSynonym_ExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select CLASS from white_pg_reserv_ref where ...)} <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhitePgReservRefList</span>(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ClassSynonym_NotExistsReferrer_WhitePgReservRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePgReservRefList(SubQuery<WhitePgReservRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePgReservRefCB>", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "CLASS", "CLASS", subQueryPropertyName, "whitePgReservRefList");
    }
    public abstract String keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLASS from white_pg_reserv_ref where ...)} <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * @param subQuery The sub-query of WhitePgReservRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePgReservRefList(SubQuery<WhitePgReservRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePgReservRefCB>", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepClassSynonym_InScopeRelation_WhitePgReservRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CLASS", "CLASS", subQueryPropertyName, "whitePgReservRefList");
    }
    public abstract String keepClassSynonym_InScopeRelation_WhitePgReservRefList(WhitePgReservRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLASS from white_pg_reserv_ref where ...)} <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * @param subQuery The sub-query of WhitePgReservRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePgReservRefList(SubQuery<WhitePgReservRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePgReservRefCB>", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepClassSynonym_NotInScopeRelation_WhitePgReservRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CLASS", "CLASS", subQueryPropertyName, "whitePgReservRefList");
    }
    public abstract String keepClassSynonym_NotInScopeRelation_WhitePgReservRefList(WhitePgReservRefCQ subQuery);

    public void xsderiveWhitePgReservRefList(String function, SubQuery<WhitePgReservRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhitePgReservRefCB>", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "CLASS", "CLASS", subQueryPropertyName, "whitePgReservRefList", aliasName, option);
    }
    public abstract String keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_pg_reserv_ref where ...)} <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhitePgReservRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void query(WhitePgReservRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePgReservRefCB> derivedWhitePgReservRefList() {
        return xcreateQDRFunctionWhitePgReservRefList();
    }
    protected HpQDRFunction<WhitePgReservRefCB> xcreateQDRFunctionWhitePgReservRefList() {
        return new HpQDRFunction<WhitePgReservRefCB>(new HpQDRSetupper<WhitePgReservRefCB>() {
            public void setup(String function, SubQuery<WhitePgReservRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhitePgReservRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhitePgReservRefList(String function, SubQuery<WhitePgReservRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhitePgReservRefCB>", subQuery);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "CLASS", "CLASS", subQueryPropertyName, "whitePgReservRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ subQuery);
    public abstract String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     */
    public void setClassSynonym_IsNull() { regClassSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     */
    public void setClassSynonym_IsNotNull() { regClassSynonym(CK_ISNN, DOBJ); }

    protected void regClassSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueClassSynonym(), "CLASS"); }
    abstract protected ConditionValue getCValueClassSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setCaseSynonym_Equal(Integer caseSynonym) {
        doSetCaseSynonym_Equal(caseSynonym);
    }

    protected void doSetCaseSynonym_Equal(Integer caseSynonym) {
        regCaseSynonym(CK_EQ, caseSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCaseSynonym_GreaterThan(Integer caseSynonym) {
        regCaseSynonym(CK_GT, caseSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCaseSynonym_LessThan(Integer caseSynonym) {
        regCaseSynonym(CK_LT, caseSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCaseSynonym_GreaterEqual(Integer caseSynonym) {
        regCaseSynonym(CK_GE, caseSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCaseSynonym_LessEqual(Integer caseSynonym) {
        regCaseSynonym(CK_LE, caseSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param minNumber The min number of caseSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueCaseSynonym(), "CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonymList The collection of caseSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseSynonym_InScope(Collection<Integer> caseSynonymList) {
        doSetCaseSynonym_InScope(caseSynonymList);
    }

    protected void doSetCaseSynonym_InScope(Collection<Integer> caseSynonymList) {
        regINS(CK_INS, cTL(caseSynonymList), getCValueCaseSynonym(), "CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonymList The collection of caseSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseSynonym_NotInScope(Collection<Integer> caseSynonymList) {
        doSetCaseSynonym_NotInScope(caseSynonymList);
    }

    protected void doSetCaseSynonym_NotInScope(Collection<Integer> caseSynonymList) {
        regINS(CK_NINS, cTL(caseSynonymList), getCValueCaseSynonym(), "CASE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     */
    public void setCaseSynonym_IsNull() { regCaseSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     */
    public void setCaseSynonym_IsNotNull() { regCaseSynonym(CK_ISNN, DOBJ); }

    protected void regCaseSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueCaseSynonym(), "CASE"); }
    abstract protected ConditionValue getCValueCaseSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setPackageSynonym_Equal(Integer packageSynonym) {
        doSetPackageSynonym_Equal(packageSynonym);
    }

    protected void doSetPackageSynonym_Equal(Integer packageSynonym) {
        regPackageSynonym(CK_EQ, packageSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPackageSynonym_GreaterThan(Integer packageSynonym) {
        regPackageSynonym(CK_GT, packageSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPackageSynonym_LessThan(Integer packageSynonym) {
        regPackageSynonym(CK_LT, packageSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPackageSynonym_GreaterEqual(Integer packageSynonym) {
        regPackageSynonym(CK_GE, packageSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPackageSynonym_LessEqual(Integer packageSynonym) {
        regPackageSynonym(CK_LE, packageSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param minNumber The min number of packageSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of packageSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackageSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePackageSynonym(), "PACKAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonymList The collection of packageSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPackageSynonym_InScope(Collection<Integer> packageSynonymList) {
        doSetPackageSynonym_InScope(packageSynonymList);
    }

    protected void doSetPackageSynonym_InScope(Collection<Integer> packageSynonymList) {
        regINS(CK_INS, cTL(packageSynonymList), getCValuePackageSynonym(), "PACKAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonymList The collection of packageSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPackageSynonym_NotInScope(Collection<Integer> packageSynonymList) {
        doSetPackageSynonym_NotInScope(packageSynonymList);
    }

    protected void doSetPackageSynonym_NotInScope(Collection<Integer> packageSynonymList) {
        regINS(CK_NINS, cTL(packageSynonymList), getCValuePackageSynonym(), "PACKAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     */
    public void setPackageSynonym_IsNull() { regPackageSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     */
    public void setPackageSynonym_IsNotNull() { regPackageSynonym(CK_ISNN, DOBJ); }

    protected void regPackageSynonym(ConditionKey k, Object v) { regQ(k, v, getCValuePackageSynonym(), "PACKAGE"); }
    abstract protected ConditionValue getCValuePackageSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setDefaultSynonym_Equal(Integer defaultSynonym) {
        doSetDefaultSynonym_Equal(defaultSynonym);
    }

    protected void doSetDefaultSynonym_Equal(Integer defaultSynonym) {
        regDefaultSynonym(CK_EQ, defaultSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDefaultSynonym_GreaterThan(Integer defaultSynonym) {
        regDefaultSynonym(CK_GT, defaultSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDefaultSynonym_LessThan(Integer defaultSynonym) {
        regDefaultSynonym(CK_LT, defaultSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultSynonym_GreaterEqual(Integer defaultSynonym) {
        regDefaultSynonym(CK_GE, defaultSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultSynonym_LessEqual(Integer defaultSynonym) {
        regDefaultSynonym(CK_LE, defaultSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param minNumber The min number of defaultSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of defaultSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefaultSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDefaultSynonym(), "DEFAULT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonymList The collection of defaultSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefaultSynonym_InScope(Collection<Integer> defaultSynonymList) {
        doSetDefaultSynonym_InScope(defaultSynonymList);
    }

    protected void doSetDefaultSynonym_InScope(Collection<Integer> defaultSynonymList) {
        regINS(CK_INS, cTL(defaultSynonymList), getCValueDefaultSynonym(), "DEFAULT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonymList The collection of defaultSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefaultSynonym_NotInScope(Collection<Integer> defaultSynonymList) {
        doSetDefaultSynonym_NotInScope(defaultSynonymList);
    }

    protected void doSetDefaultSynonym_NotInScope(Collection<Integer> defaultSynonymList) {
        regINS(CK_NINS, cTL(defaultSynonymList), getCValueDefaultSynonym(), "DEFAULT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     */
    public void setDefaultSynonym_IsNull() { regDefaultSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     */
    public void setDefaultSynonym_IsNotNull() { regDefaultSynonym(CK_ISNN, DOBJ); }

    protected void regDefaultSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueDefaultSynonym(), "DEFAULT"); }
    abstract protected ConditionValue getCValueDefaultSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setNewSynonym_Equal(Integer newSynonym) {
        doSetNewSynonym_Equal(newSynonym);
    }

    protected void doSetNewSynonym_Equal(Integer newSynonym) {
        regNewSynonym(CK_EQ, newSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNewSynonym_GreaterThan(Integer newSynonym) {
        regNewSynonym(CK_GT, newSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNewSynonym_LessThan(Integer newSynonym) {
        regNewSynonym(CK_LT, newSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNewSynonym_GreaterEqual(Integer newSynonym) {
        regNewSynonym(CK_GE, newSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNewSynonym_LessEqual(Integer newSynonym) {
        regNewSynonym(CK_LE, newSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param minNumber The min number of newSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of newSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNewSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNewSynonym(), "NEW", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonymList The collection of newSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewSynonym_InScope(Collection<Integer> newSynonymList) {
        doSetNewSynonym_InScope(newSynonymList);
    }

    protected void doSetNewSynonym_InScope(Collection<Integer> newSynonymList) {
        regINS(CK_INS, cTL(newSynonymList), getCValueNewSynonym(), "NEW");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonymList The collection of newSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewSynonym_NotInScope(Collection<Integer> newSynonymList) {
        doSetNewSynonym_NotInScope(newSynonymList);
    }

    protected void doSetNewSynonym_NotInScope(Collection<Integer> newSynonymList) {
        regINS(CK_NINS, cTL(newSynonymList), getCValueNewSynonym(), "NEW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     */
    public void setNewSynonym_IsNull() { regNewSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     */
    public void setNewSynonym_IsNotNull() { regNewSynonym(CK_ISNN, DOBJ); }

    protected void regNewSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueNewSynonym(), "NEW"); }
    abstract protected ConditionValue getCValueNewSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setNativeSynonym_Equal(Integer nativeSynonym) {
        doSetNativeSynonym_Equal(nativeSynonym);
    }

    protected void doSetNativeSynonym_Equal(Integer nativeSynonym) {
        regNativeSynonym(CK_EQ, nativeSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNativeSynonym_GreaterThan(Integer nativeSynonym) {
        regNativeSynonym(CK_GT, nativeSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNativeSynonym_LessThan(Integer nativeSynonym) {
        regNativeSynonym(CK_LT, nativeSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNativeSynonym_GreaterEqual(Integer nativeSynonym) {
        regNativeSynonym(CK_GE, nativeSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNativeSynonym_LessEqual(Integer nativeSynonym) {
        regNativeSynonym(CK_LE, nativeSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param minNumber The min number of nativeSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nativeSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNativeSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNativeSynonym(), "NATIVE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonymList The collection of nativeSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNativeSynonym_InScope(Collection<Integer> nativeSynonymList) {
        doSetNativeSynonym_InScope(nativeSynonymList);
    }

    protected void doSetNativeSynonym_InScope(Collection<Integer> nativeSynonymList) {
        regINS(CK_INS, cTL(nativeSynonymList), getCValueNativeSynonym(), "NATIVE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonymList The collection of nativeSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNativeSynonym_NotInScope(Collection<Integer> nativeSynonymList) {
        doSetNativeSynonym_NotInScope(nativeSynonymList);
    }

    protected void doSetNativeSynonym_NotInScope(Collection<Integer> nativeSynonymList) {
        regINS(CK_NINS, cTL(nativeSynonymList), getCValueNativeSynonym(), "NATIVE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     */
    public void setNativeSynonym_IsNull() { regNativeSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     */
    public void setNativeSynonym_IsNotNull() { regNativeSynonym(CK_ISNN, DOBJ); }

    protected void regNativeSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueNativeSynonym(), "NATIVE"); }
    abstract protected ConditionValue getCValueNativeSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setVoidSynonym_Equal(Integer voidSynonym) {
        doSetVoidSynonym_Equal(voidSynonym);
    }

    protected void doSetVoidSynonym_Equal(Integer voidSynonym) {
        regVoidSynonym(CK_EQ, voidSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVoidSynonym_GreaterThan(Integer voidSynonym) {
        regVoidSynonym(CK_GT, voidSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVoidSynonym_LessThan(Integer voidSynonym) {
        regVoidSynonym(CK_LT, voidSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVoidSynonym_GreaterEqual(Integer voidSynonym) {
        regVoidSynonym(CK_GE, voidSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVoidSynonym_LessEqual(Integer voidSynonym) {
        regVoidSynonym(CK_LE, voidSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param minNumber The min number of voidSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of voidSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVoidSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVoidSynonym(), "VOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonymList The collection of voidSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVoidSynonym_InScope(Collection<Integer> voidSynonymList) {
        doSetVoidSynonym_InScope(voidSynonymList);
    }

    protected void doSetVoidSynonym_InScope(Collection<Integer> voidSynonymList) {
        regINS(CK_INS, cTL(voidSynonymList), getCValueVoidSynonym(), "VOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonymList The collection of voidSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVoidSynonym_NotInScope(Collection<Integer> voidSynonymList) {
        doSetVoidSynonym_NotInScope(voidSynonymList);
    }

    protected void doSetVoidSynonym_NotInScope(Collection<Integer> voidSynonymList) {
        regINS(CK_NINS, cTL(voidSynonymList), getCValueVoidSynonym(), "VOID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     */
    public void setVoidSynonym_IsNull() { regVoidSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     */
    public void setVoidSynonym_IsNotNull() { regVoidSynonym(CK_ISNN, DOBJ); }

    protected void regVoidSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueVoidSynonym(), "VOID"); }
    abstract protected ConditionValue getCValueVoidSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setPublicSynonym_Equal(Integer publicSynonym) {
        doSetPublicSynonym_Equal(publicSynonym);
    }

    protected void doSetPublicSynonym_Equal(Integer publicSynonym) {
        regPublicSynonym(CK_EQ, publicSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPublicSynonym_GreaterThan(Integer publicSynonym) {
        regPublicSynonym(CK_GT, publicSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPublicSynonym_LessThan(Integer publicSynonym) {
        regPublicSynonym(CK_LT, publicSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPublicSynonym_GreaterEqual(Integer publicSynonym) {
        regPublicSynonym(CK_GE, publicSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPublicSynonym_LessEqual(Integer publicSynonym) {
        regPublicSynonym(CK_LE, publicSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param minNumber The min number of publicSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of publicSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPublicSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePublicSynonym(), "PUBLIC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonymList The collection of publicSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublicSynonym_InScope(Collection<Integer> publicSynonymList) {
        doSetPublicSynonym_InScope(publicSynonymList);
    }

    protected void doSetPublicSynonym_InScope(Collection<Integer> publicSynonymList) {
        regINS(CK_INS, cTL(publicSynonymList), getCValuePublicSynonym(), "PUBLIC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonymList The collection of publicSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublicSynonym_NotInScope(Collection<Integer> publicSynonymList) {
        doSetPublicSynonym_NotInScope(publicSynonymList);
    }

    protected void doSetPublicSynonym_NotInScope(Collection<Integer> publicSynonymList) {
        regINS(CK_NINS, cTL(publicSynonymList), getCValuePublicSynonym(), "PUBLIC");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     */
    public void setPublicSynonym_IsNull() { regPublicSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     */
    public void setPublicSynonym_IsNotNull() { regPublicSynonym(CK_ISNN, DOBJ); }

    protected void regPublicSynonym(ConditionKey k, Object v) { regQ(k, v, getCValuePublicSynonym(), "PUBLIC"); }
    abstract protected ConditionValue getCValuePublicSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setProtectedSynonym_Equal(Integer protectedSynonym) {
        doSetProtectedSynonym_Equal(protectedSynonym);
    }

    protected void doSetProtectedSynonym_Equal(Integer protectedSynonym) {
        regProtectedSynonym(CK_EQ, protectedSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProtectedSynonym_GreaterThan(Integer protectedSynonym) {
        regProtectedSynonym(CK_GT, protectedSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProtectedSynonym_LessThan(Integer protectedSynonym) {
        regProtectedSynonym(CK_LT, protectedSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProtectedSynonym_GreaterEqual(Integer protectedSynonym) {
        regProtectedSynonym(CK_GE, protectedSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProtectedSynonym_LessEqual(Integer protectedSynonym) {
        regProtectedSynonym(CK_LE, protectedSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param minNumber The min number of protectedSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of protectedSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProtectedSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProtectedSynonym(), "PROTECTED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonymList The collection of protectedSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProtectedSynonym_InScope(Collection<Integer> protectedSynonymList) {
        doSetProtectedSynonym_InScope(protectedSynonymList);
    }

    protected void doSetProtectedSynonym_InScope(Collection<Integer> protectedSynonymList) {
        regINS(CK_INS, cTL(protectedSynonymList), getCValueProtectedSynonym(), "PROTECTED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonymList The collection of protectedSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProtectedSynonym_NotInScope(Collection<Integer> protectedSynonymList) {
        doSetProtectedSynonym_NotInScope(protectedSynonymList);
    }

    protected void doSetProtectedSynonym_NotInScope(Collection<Integer> protectedSynonymList) {
        regINS(CK_NINS, cTL(protectedSynonymList), getCValueProtectedSynonym(), "PROTECTED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     */
    public void setProtectedSynonym_IsNull() { regProtectedSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     */
    public void setProtectedSynonym_IsNotNull() { regProtectedSynonym(CK_ISNN, DOBJ); }

    protected void regProtectedSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueProtectedSynonym(), "PROTECTED"); }
    abstract protected ConditionValue getCValueProtectedSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setPrivateSynonym_Equal(Integer privateSynonym) {
        doSetPrivateSynonym_Equal(privateSynonym);
    }

    protected void doSetPrivateSynonym_Equal(Integer privateSynonym) {
        regPrivateSynonym(CK_EQ, privateSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPrivateSynonym_GreaterThan(Integer privateSynonym) {
        regPrivateSynonym(CK_GT, privateSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPrivateSynonym_LessThan(Integer privateSynonym) {
        regPrivateSynonym(CK_LT, privateSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPrivateSynonym_GreaterEqual(Integer privateSynonym) {
        regPrivateSynonym(CK_GE, privateSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPrivateSynonym_LessEqual(Integer privateSynonym) {
        regPrivateSynonym(CK_LE, privateSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param minNumber The min number of privateSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of privateSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrivateSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePrivateSynonym(), "PRIVATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonymList The collection of privateSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrivateSynonym_InScope(Collection<Integer> privateSynonymList) {
        doSetPrivateSynonym_InScope(privateSynonymList);
    }

    protected void doSetPrivateSynonym_InScope(Collection<Integer> privateSynonymList) {
        regINS(CK_INS, cTL(privateSynonymList), getCValuePrivateSynonym(), "PRIVATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonymList The collection of privateSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrivateSynonym_NotInScope(Collection<Integer> privateSynonymList) {
        doSetPrivateSynonym_NotInScope(privateSynonymList);
    }

    protected void doSetPrivateSynonym_NotInScope(Collection<Integer> privateSynonymList) {
        regINS(CK_NINS, cTL(privateSynonymList), getCValuePrivateSynonym(), "PRIVATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     */
    public void setPrivateSynonym_IsNull() { regPrivateSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     */
    public void setPrivateSynonym_IsNotNull() { regPrivateSynonym(CK_ISNN, DOBJ); }

    protected void regPrivateSynonym(ConditionKey k, Object v) { regQ(k, v, getCValuePrivateSynonym(), "PRIVATE"); }
    abstract protected ConditionValue getCValuePrivateSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setInterfaceSynonym_Equal(Integer interfaceSynonym) {
        doSetInterfaceSynonym_Equal(interfaceSynonym);
    }

    protected void doSetInterfaceSynonym_Equal(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_EQ, interfaceSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setInterfaceSynonym_GreaterThan(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_GT, interfaceSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setInterfaceSynonym_LessThan(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_LT, interfaceSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setInterfaceSynonym_GreaterEqual(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_GE, interfaceSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setInterfaceSynonym_LessEqual(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_LE, interfaceSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param minNumber The min number of interfaceSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of interfaceSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInterfaceSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInterfaceSynonym(), "INTERFACE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonymList The collection of interfaceSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInterfaceSynonym_InScope(Collection<Integer> interfaceSynonymList) {
        doSetInterfaceSynonym_InScope(interfaceSynonymList);
    }

    protected void doSetInterfaceSynonym_InScope(Collection<Integer> interfaceSynonymList) {
        regINS(CK_INS, cTL(interfaceSynonymList), getCValueInterfaceSynonym(), "INTERFACE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonymList The collection of interfaceSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInterfaceSynonym_NotInScope(Collection<Integer> interfaceSynonymList) {
        doSetInterfaceSynonym_NotInScope(interfaceSynonymList);
    }

    protected void doSetInterfaceSynonym_NotInScope(Collection<Integer> interfaceSynonymList) {
        regINS(CK_NINS, cTL(interfaceSynonymList), getCValueInterfaceSynonym(), "INTERFACE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     */
    public void setInterfaceSynonym_IsNull() { regInterfaceSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     */
    public void setInterfaceSynonym_IsNotNull() { regInterfaceSynonym(CK_ISNN, DOBJ); }

    protected void regInterfaceSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueInterfaceSynonym(), "INTERFACE"); }
    abstract protected ConditionValue getCValueInterfaceSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setAbstractSynonym_Equal(Integer abstractSynonym) {
        doSetAbstractSynonym_Equal(abstractSynonym);
    }

    protected void doSetAbstractSynonym_Equal(Integer abstractSynonym) {
        regAbstractSynonym(CK_EQ, abstractSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAbstractSynonym_GreaterThan(Integer abstractSynonym) {
        regAbstractSynonym(CK_GT, abstractSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAbstractSynonym_LessThan(Integer abstractSynonym) {
        regAbstractSynonym(CK_LT, abstractSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAbstractSynonym_GreaterEqual(Integer abstractSynonym) {
        regAbstractSynonym(CK_GE, abstractSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAbstractSynonym_LessEqual(Integer abstractSynonym) {
        regAbstractSynonym(CK_LE, abstractSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param minNumber The min number of abstractSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of abstractSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAbstractSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAbstractSynonym(), "ABSTRACT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonymList The collection of abstractSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAbstractSynonym_InScope(Collection<Integer> abstractSynonymList) {
        doSetAbstractSynonym_InScope(abstractSynonymList);
    }

    protected void doSetAbstractSynonym_InScope(Collection<Integer> abstractSynonymList) {
        regINS(CK_INS, cTL(abstractSynonymList), getCValueAbstractSynonym(), "ABSTRACT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonymList The collection of abstractSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAbstractSynonym_NotInScope(Collection<Integer> abstractSynonymList) {
        doSetAbstractSynonym_NotInScope(abstractSynonymList);
    }

    protected void doSetAbstractSynonym_NotInScope(Collection<Integer> abstractSynonymList) {
        regINS(CK_NINS, cTL(abstractSynonymList), getCValueAbstractSynonym(), "ABSTRACT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     */
    public void setAbstractSynonym_IsNull() { regAbstractSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     */
    public void setAbstractSynonym_IsNotNull() { regAbstractSynonym(CK_ISNN, DOBJ); }

    protected void regAbstractSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueAbstractSynonym(), "ABSTRACT"); }
    abstract protected ConditionValue getCValueAbstractSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setFinalSynonym_Equal(Integer finalSynonym) {
        doSetFinalSynonym_Equal(finalSynonym);
    }

    protected void doSetFinalSynonym_Equal(Integer finalSynonym) {
        regFinalSynonym(CK_EQ, finalSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFinalSynonym_GreaterThan(Integer finalSynonym) {
        regFinalSynonym(CK_GT, finalSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFinalSynonym_LessThan(Integer finalSynonym) {
        regFinalSynonym(CK_LT, finalSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFinalSynonym_GreaterEqual(Integer finalSynonym) {
        regFinalSynonym(CK_GE, finalSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFinalSynonym_LessEqual(Integer finalSynonym) {
        regFinalSynonym(CK_LE, finalSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param minNumber The min number of finalSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of finalSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFinalSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFinalSynonym(), "FINAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonymList The collection of finalSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFinalSynonym_InScope(Collection<Integer> finalSynonymList) {
        doSetFinalSynonym_InScope(finalSynonymList);
    }

    protected void doSetFinalSynonym_InScope(Collection<Integer> finalSynonymList) {
        regINS(CK_INS, cTL(finalSynonymList), getCValueFinalSynonym(), "FINAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonymList The collection of finalSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFinalSynonym_NotInScope(Collection<Integer> finalSynonymList) {
        doSetFinalSynonym_NotInScope(finalSynonymList);
    }

    protected void doSetFinalSynonym_NotInScope(Collection<Integer> finalSynonymList) {
        regINS(CK_NINS, cTL(finalSynonymList), getCValueFinalSynonym(), "FINAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     */
    public void setFinalSynonym_IsNull() { regFinalSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     */
    public void setFinalSynonym_IsNotNull() { regFinalSynonym(CK_ISNN, DOBJ); }

    protected void regFinalSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueFinalSynonym(), "FINAL"); }
    abstract protected ConditionValue getCValueFinalSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setFinallySynonym_Equal(Integer finallySynonym) {
        doSetFinallySynonym_Equal(finallySynonym);
    }

    protected void doSetFinallySynonym_Equal(Integer finallySynonym) {
        regFinallySynonym(CK_EQ, finallySynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFinallySynonym_GreaterThan(Integer finallySynonym) {
        regFinallySynonym(CK_GT, finallySynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFinallySynonym_LessThan(Integer finallySynonym) {
        regFinallySynonym(CK_LT, finallySynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFinallySynonym_GreaterEqual(Integer finallySynonym) {
        regFinallySynonym(CK_GE, finallySynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFinallySynonym_LessEqual(Integer finallySynonym) {
        regFinallySynonym(CK_LE, finallySynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param minNumber The min number of finallySynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of finallySynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFinallySynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFinallySynonym(), "FINALLY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonymList The collection of finallySynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFinallySynonym_InScope(Collection<Integer> finallySynonymList) {
        doSetFinallySynonym_InScope(finallySynonymList);
    }

    protected void doSetFinallySynonym_InScope(Collection<Integer> finallySynonymList) {
        regINS(CK_INS, cTL(finallySynonymList), getCValueFinallySynonym(), "FINALLY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonymList The collection of finallySynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFinallySynonym_NotInScope(Collection<Integer> finallySynonymList) {
        doSetFinallySynonym_NotInScope(finallySynonymList);
    }

    protected void doSetFinallySynonym_NotInScope(Collection<Integer> finallySynonymList) {
        regINS(CK_NINS, cTL(finallySynonymList), getCValueFinallySynonym(), "FINALLY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     */
    public void setFinallySynonym_IsNull() { regFinallySynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     */
    public void setFinallySynonym_IsNotNull() { regFinallySynonym(CK_ISNN, DOBJ); }

    protected void regFinallySynonym(ConditionKey k, Object v) { regQ(k, v, getCValueFinallySynonym(), "FINALLY"); }
    abstract protected ConditionValue getCValueFinallySynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setReturnSynonym_Equal(Integer returnSynonym) {
        doSetReturnSynonym_Equal(returnSynonym);
    }

    protected void doSetReturnSynonym_Equal(Integer returnSynonym) {
        regReturnSynonym(CK_EQ, returnSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReturnSynonym_GreaterThan(Integer returnSynonym) {
        regReturnSynonym(CK_GT, returnSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReturnSynonym_LessThan(Integer returnSynonym) {
        regReturnSynonym(CK_LT, returnSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReturnSynonym_GreaterEqual(Integer returnSynonym) {
        regReturnSynonym(CK_GE, returnSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReturnSynonym_LessEqual(Integer returnSynonym) {
        regReturnSynonym(CK_LE, returnSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param minNumber The min number of returnSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of returnSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReturnSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueReturnSynonym(), "RETURN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonymList The collection of returnSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReturnSynonym_InScope(Collection<Integer> returnSynonymList) {
        doSetReturnSynonym_InScope(returnSynonymList);
    }

    protected void doSetReturnSynonym_InScope(Collection<Integer> returnSynonymList) {
        regINS(CK_INS, cTL(returnSynonymList), getCValueReturnSynonym(), "RETURN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonymList The collection of returnSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReturnSynonym_NotInScope(Collection<Integer> returnSynonymList) {
        doSetReturnSynonym_NotInScope(returnSynonymList);
    }

    protected void doSetReturnSynonym_NotInScope(Collection<Integer> returnSynonymList) {
        regINS(CK_NINS, cTL(returnSynonymList), getCValueReturnSynonym(), "RETURN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     */
    public void setReturnSynonym_IsNull() { regReturnSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     */
    public void setReturnSynonym_IsNotNull() { regReturnSynonym(CK_ISNN, DOBJ); }

    protected void regReturnSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueReturnSynonym(), "RETURN"); }
    abstract protected ConditionValue getCValueReturnSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setDoubleSynonym_Equal(Integer doubleSynonym) {
        doSetDoubleSynonym_Equal(doubleSynonym);
    }

    protected void doSetDoubleSynonym_Equal(Integer doubleSynonym) {
        regDoubleSynonym(CK_EQ, doubleSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDoubleSynonym_GreaterThan(Integer doubleSynonym) {
        regDoubleSynonym(CK_GT, doubleSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDoubleSynonym_LessThan(Integer doubleSynonym) {
        regDoubleSynonym(CK_LT, doubleSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDoubleSynonym_GreaterEqual(Integer doubleSynonym) {
        regDoubleSynonym(CK_GE, doubleSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDoubleSynonym_LessEqual(Integer doubleSynonym) {
        regDoubleSynonym(CK_LE, doubleSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param minNumber The min number of doubleSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of doubleSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDoubleSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDoubleSynonym(), "DOUBLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonymList The collection of doubleSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoubleSynonym_InScope(Collection<Integer> doubleSynonymList) {
        doSetDoubleSynonym_InScope(doubleSynonymList);
    }

    protected void doSetDoubleSynonym_InScope(Collection<Integer> doubleSynonymList) {
        regINS(CK_INS, cTL(doubleSynonymList), getCValueDoubleSynonym(), "DOUBLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonymList The collection of doubleSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoubleSynonym_NotInScope(Collection<Integer> doubleSynonymList) {
        doSetDoubleSynonym_NotInScope(doubleSynonymList);
    }

    protected void doSetDoubleSynonym_NotInScope(Collection<Integer> doubleSynonymList) {
        regINS(CK_NINS, cTL(doubleSynonymList), getCValueDoubleSynonym(), "DOUBLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     */
    public void setDoubleSynonym_IsNull() { regDoubleSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     */
    public void setDoubleSynonym_IsNotNull() { regDoubleSynonym(CK_ISNN, DOBJ); }

    protected void regDoubleSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueDoubleSynonym(), "DOUBLE"); }
    abstract protected ConditionValue getCValueDoubleSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setFloatSynonym_Equal(Integer floatSynonym) {
        doSetFloatSynonym_Equal(floatSynonym);
    }

    protected void doSetFloatSynonym_Equal(Integer floatSynonym) {
        regFloatSynonym(CK_EQ, floatSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFloatSynonym_GreaterThan(Integer floatSynonym) {
        regFloatSynonym(CK_GT, floatSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFloatSynonym_LessThan(Integer floatSynonym) {
        regFloatSynonym(CK_LT, floatSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFloatSynonym_GreaterEqual(Integer floatSynonym) {
        regFloatSynonym(CK_GE, floatSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFloatSynonym_LessEqual(Integer floatSynonym) {
        regFloatSynonym(CK_LE, floatSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param minNumber The min number of floatSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of floatSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFloatSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFloatSynonym(), "FLOAT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonymList The collection of floatSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFloatSynonym_InScope(Collection<Integer> floatSynonymList) {
        doSetFloatSynonym_InScope(floatSynonymList);
    }

    protected void doSetFloatSynonym_InScope(Collection<Integer> floatSynonymList) {
        regINS(CK_INS, cTL(floatSynonymList), getCValueFloatSynonym(), "FLOAT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonymList The collection of floatSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFloatSynonym_NotInScope(Collection<Integer> floatSynonymList) {
        doSetFloatSynonym_NotInScope(floatSynonymList);
    }

    protected void doSetFloatSynonym_NotInScope(Collection<Integer> floatSynonymList) {
        regINS(CK_NINS, cTL(floatSynonymList), getCValueFloatSynonym(), "FLOAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     */
    public void setFloatSynonym_IsNull() { regFloatSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     */
    public void setFloatSynonym_IsNotNull() { regFloatSynonym(CK_ISNN, DOBJ); }

    protected void regFloatSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueFloatSynonym(), "FLOAT"); }
    abstract protected ConditionValue getCValueFloatSynonym();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as equal. (NullAllowed: if null, no condition)
     */
    public void setShortSynonym_Equal(Integer shortSynonym) {
        doSetShortSynonym_Equal(shortSynonym);
    }

    protected void doSetShortSynonym_Equal(Integer shortSynonym) {
        regShortSynonym(CK_EQ, shortSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setShortSynonym_GreaterThan(Integer shortSynonym) {
        regShortSynonym(CK_GT, shortSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as lessThan. (NullAllowed: if null, no condition)
     */
    public void setShortSynonym_LessThan(Integer shortSynonym) {
        regShortSynonym(CK_LT, shortSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setShortSynonym_GreaterEqual(Integer shortSynonym) {
        regShortSynonym(CK_GE, shortSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setShortSynonym_LessEqual(Integer shortSynonym) {
        regShortSynonym(CK_LE, shortSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param minNumber The min number of shortSynonym. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of shortSynonym. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShortSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueShortSynonym(), "SHORT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonymList The collection of shortSynonym as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShortSynonym_InScope(Collection<Integer> shortSynonymList) {
        doSetShortSynonym_InScope(shortSynonymList);
    }

    protected void doSetShortSynonym_InScope(Collection<Integer> shortSynonymList) {
        regINS(CK_INS, cTL(shortSynonymList), getCValueShortSynonym(), "SHORT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonymList The collection of shortSynonym as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShortSynonym_NotInScope(Collection<Integer> shortSynonymList) {
        doSetShortSynonym_NotInScope(shortSynonymList);
    }

    protected void doSetShortSynonym_NotInScope(Collection<Integer> shortSynonymList) {
        regINS(CK_NINS, cTL(shortSynonymList), getCValueShortSynonym(), "SHORT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     */
    public void setShortSynonym_IsNull() { regShortSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     */
    public void setShortSynonym_IsNotNull() { regShortSynonym(CK_ISNN, DOBJ); }

    protected void regShortSynonym(ConditionKey k, Object v) { regQ(k, v, getCValueShortSynonym(), "SHORT"); }
    abstract protected ConditionValue getCValueShortSynonym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE: {CHAR(3)}
     * @param type The value of type as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setType_Equal(String type) {
        doSetType_Equal(fRES(type));
    }

    protected void doSetType_Equal(String type) {
        regType(CK_EQ, type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE: {CHAR(3)}
     * @param type The value of type as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setType_NotEqual(String type) {
        doSetType_NotEqual(fRES(type));
    }

    protected void doSetType_NotEqual(String type) {
        regType(CK_NES, type);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE: {CHAR(3)}
     * @param typeList The collection of type as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setType_InScope(Collection<String> typeList) {
        doSetType_InScope(typeList);
    }

    public void doSetType_InScope(Collection<String> typeList) {
        regINS(CK_INS, cTL(typeList), getCValueType(), "TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE: {CHAR(3)}
     * @param typeList The collection of type as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setType_NotInScope(Collection<String> typeList) {
        doSetType_NotInScope(typeList);
    }

    public void doSetType_NotInScope(Collection<String> typeList) {
        regINS(CK_NINS, cTL(typeList), getCValueType(), "TYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE: {CHAR(3)}
     * @param type The value of type as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setType_PrefixSearch(String type) {
        setType_LikeSearch(type, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE: {CHAR(3)} <br />
     * <pre>e.g. setType_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param type The value of type as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), getCValueType(), "TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE: {CHAR(3)}
     * @param type The value of type as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), getCValueType(), "TYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE: {CHAR(3)}
     */
    public void setType_IsNull() { regType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE: {CHAR(3)}
     */
    public void setType_IsNullOrEmpty() { regType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE: {CHAR(3)}
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DOBJ); }

    protected void regType(ConditionKey k, Object v) { regQ(k, v, getCValueType(), "TYPE"); }
    abstract protected ConditionValue getCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReservName_Equal(String reservName) {
        doSetReservName_Equal(fRES(reservName));
    }

    protected void doSetReservName_Equal(String reservName) {
        regReservName(CK_EQ, reservName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReservName_NotEqual(String reservName) {
        doSetReservName_NotEqual(fRES(reservName));
    }

    protected void doSetReservName_NotEqual(String reservName) {
        regReservName(CK_NES, reservName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservNameList The collection of reservName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReservName_InScope(Collection<String> reservNameList) {
        doSetReservName_InScope(reservNameList);
    }

    public void doSetReservName_InScope(Collection<String> reservNameList) {
        regINS(CK_INS, cTL(reservNameList), getCValueReservName(), "RESERV_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservNameList The collection of reservName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReservName_NotInScope(Collection<String> reservNameList) {
        doSetReservName_NotInScope(reservNameList);
    }

    public void doSetReservName_NotInScope(Collection<String> reservNameList) {
        regINS(CK_NINS, cTL(reservNameList), getCValueReservName(), "RESERV_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setReservName_PrefixSearch(String reservName) {
        setReservName_LikeSearch(reservName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)} <br />
     * <pre>e.g. setReservName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reservName The value of reservName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReservName_LikeSearch(String reservName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reservName), getCValueReservName(), "RESERV_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReservName_NotLikeSearch(String reservName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reservName), getCValueReservName(), "RESERV_NAME", likeSearchOption);
    }

    protected void regReservName(ConditionKey k, Object v) { regQ(k, v, getCValueReservName(), "RESERV_NAME"); }
    abstract protected ConditionValue getCValueReservName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePgReservCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhitePgReservCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhitePgReservCB>(new HpSSQSetupper<WhitePgReservCB>() {
            public void setup(String function, SubQuery<WhitePgReservCB> subQuery, HpSSQOption<WhitePgReservCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhitePgReservCB> subQuery, String operand, HpSSQOption<WhitePgReservCB> option) {
        assertObjectNotNull("subQuery<WhitePgReservCB>", subQuery);
        WhitePgReservCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhitePgReservCQ subQuery);

    protected WhitePgReservCB xcreateScalarConditionCB() {
        WhitePgReservCB cb = new WhitePgReservCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhitePgReservCB xcreateScalarConditionPartitionByCB() {
        WhitePgReservCB cb = new WhitePgReservCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhitePgReservCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhitePgReservCB>", subQuery);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "CLASS", "CLASS", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePgReservCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePgReservCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhitePgReservCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhitePgReservCB>(new HpQDRSetupper<WhitePgReservCB>() {
            public void setup(String function, SubQuery<WhitePgReservCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhitePgReservCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhitePgReservCB>", subQuery);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "CLASS", "CLASS", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhitePgReservCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePgReservCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePgReservCB>", subQuery);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhitePgReservCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePgReservCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePgReservCB>", subQuery);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhitePgReservCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhitePgReservCB.class.getName(); }
    protected String xabCQ() { return WhitePgReservCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
