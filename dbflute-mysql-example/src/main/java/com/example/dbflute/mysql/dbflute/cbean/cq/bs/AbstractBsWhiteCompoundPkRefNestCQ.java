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
 * The abstract condition-query of white_compound_pk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefNestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefNestCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref_nest";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as equal. (NullAllowed: if null, no condition)
     */
    public void setCompoundPkRefNestId_Equal(Integer compoundPkRefNestId) {
        doSetCompoundPkRefNestId_Equal(compoundPkRefNestId);
    }

    protected void doSetCompoundPkRefNestId_Equal(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_EQ, compoundPkRefNestId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCompoundPkRefNestId_GreaterThan(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_GT, compoundPkRefNestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCompoundPkRefNestId_LessThan(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_LT, compoundPkRefNestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCompoundPkRefNestId_GreaterEqual(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_GE, compoundPkRefNestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCompoundPkRefNestId_LessEqual(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_LE, compoundPkRefNestId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of compoundPkRefNestId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of compoundPkRefNestId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCompoundPkRefNestId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestIdList The collection of compoundPkRefNestId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundPkRefNestId_InScope(Collection<Integer> compoundPkRefNestIdList) {
        doSetCompoundPkRefNestId_InScope(compoundPkRefNestIdList);
    }

    protected void doSetCompoundPkRefNestId_InScope(Collection<Integer> compoundPkRefNestIdList) {
        regINS(CK_INS, cTL(compoundPkRefNestIdList), getCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestIdList The collection of compoundPkRefNestId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundPkRefNestId_NotInScope(Collection<Integer> compoundPkRefNestIdList) {
        doSetCompoundPkRefNestId_NotInScope(compoundPkRefNestIdList);
    }

    protected void doSetCompoundPkRefNestId_NotInScope(Collection<Integer> compoundPkRefNestIdList) {
        regINS(CK_NINS, cTL(compoundPkRefNestIdList), getCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     */
    public void setCompoundPkRefNestId_IsNull() { regCompoundPkRefNestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     */
    public void setCompoundPkRefNestId_IsNotNull() { regCompoundPkRefNestId(CK_ISNN, DOBJ); }

    protected void regCompoundPkRefNestId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID"); }
    protected abstract ConditionValue getCValueCompoundPkRefNestId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as equal. (NullAllowed: if null, no condition)
     */
    public void setFooMultipleId_Equal(Integer fooMultipleId) {
        doSetFooMultipleId_Equal(fooMultipleId);
    }

    protected void doSetFooMultipleId_Equal(Integer fooMultipleId) {
        regFooMultipleId(CK_EQ, fooMultipleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFooMultipleId_GreaterThan(Integer fooMultipleId) {
        regFooMultipleId(CK_GT, fooMultipleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFooMultipleId_LessThan(Integer fooMultipleId) {
        regFooMultipleId(CK_LT, fooMultipleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFooMultipleId_GreaterEqual(Integer fooMultipleId) {
        regFooMultipleId(CK_GE, fooMultipleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFooMultipleId_LessEqual(Integer fooMultipleId) {
        regFooMultipleId(CK_LE, fooMultipleId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of fooMultipleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fooMultipleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFooMultipleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFooMultipleId(), "FOO_MULTIPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleIdList The collection of fooMultipleId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooMultipleId_InScope(Collection<Integer> fooMultipleIdList) {
        doSetFooMultipleId_InScope(fooMultipleIdList);
    }

    protected void doSetFooMultipleId_InScope(Collection<Integer> fooMultipleIdList) {
        regINS(CK_INS, cTL(fooMultipleIdList), getCValueFooMultipleId(), "FOO_MULTIPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleIdList The collection of fooMultipleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooMultipleId_NotInScope(Collection<Integer> fooMultipleIdList) {
        doSetFooMultipleId_NotInScope(fooMultipleIdList);
    }

    protected void doSetFooMultipleId_NotInScope(Collection<Integer> fooMultipleIdList) {
        regINS(CK_NINS, cTL(fooMultipleIdList), getCValueFooMultipleId(), "FOO_MULTIPLE_ID");
    }

    protected void regFooMultipleId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFooMultipleId(), "FOO_MULTIPLE_ID"); }
    protected abstract ConditionValue getCValueFooMultipleId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as equal. (NullAllowed: if null, no condition)
     */
    public void setBarMultipleId_Equal(Integer barMultipleId) {
        doSetBarMultipleId_Equal(barMultipleId);
    }

    protected void doSetBarMultipleId_Equal(Integer barMultipleId) {
        regBarMultipleId(CK_EQ, barMultipleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBarMultipleId_GreaterThan(Integer barMultipleId) {
        regBarMultipleId(CK_GT, barMultipleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBarMultipleId_LessThan(Integer barMultipleId) {
        regBarMultipleId(CK_LT, barMultipleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBarMultipleId_GreaterEqual(Integer barMultipleId) {
        regBarMultipleId(CK_GE, barMultipleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBarMultipleId_LessEqual(Integer barMultipleId) {
        regBarMultipleId(CK_LE, barMultipleId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of barMultipleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of barMultipleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBarMultipleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBarMultipleId(), "BAR_MULTIPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleIdList The collection of barMultipleId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarMultipleId_InScope(Collection<Integer> barMultipleIdList) {
        doSetBarMultipleId_InScope(barMultipleIdList);
    }

    protected void doSetBarMultipleId_InScope(Collection<Integer> barMultipleIdList) {
        regINS(CK_INS, cTL(barMultipleIdList), getCValueBarMultipleId(), "BAR_MULTIPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleIdList The collection of barMultipleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarMultipleId_NotInScope(Collection<Integer> barMultipleIdList) {
        doSetBarMultipleId_NotInScope(barMultipleIdList);
    }

    protected void doSetBarMultipleId_NotInScope(Collection<Integer> barMultipleIdList) {
        regINS(CK_NINS, cTL(barMultipleIdList), getCValueBarMultipleId(), "BAR_MULTIPLE_ID");
    }

    protected void regBarMultipleId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBarMultipleId(), "BAR_MULTIPLE_ID"); }
    protected abstract ConditionValue getCValueBarMultipleId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as equal. (NullAllowed: if null, no condition)
     */
    public void setQuxMultipleId_Equal(Integer quxMultipleId) {
        doSetQuxMultipleId_Equal(quxMultipleId);
    }

    protected void doSetQuxMultipleId_Equal(Integer quxMultipleId) {
        regQuxMultipleId(CK_EQ, quxMultipleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setQuxMultipleId_GreaterThan(Integer quxMultipleId) {
        regQuxMultipleId(CK_GT, quxMultipleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setQuxMultipleId_LessThan(Integer quxMultipleId) {
        regQuxMultipleId(CK_LT, quxMultipleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setQuxMultipleId_GreaterEqual(Integer quxMultipleId) {
        regQuxMultipleId(CK_GE, quxMultipleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setQuxMultipleId_LessEqual(Integer quxMultipleId) {
        regQuxMultipleId(CK_LE, quxMultipleId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of quxMultipleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of quxMultipleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQuxMultipleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueQuxMultipleId(), "QUX_MULTIPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleIdList The collection of quxMultipleId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxMultipleId_InScope(Collection<Integer> quxMultipleIdList) {
        doSetQuxMultipleId_InScope(quxMultipleIdList);
    }

    protected void doSetQuxMultipleId_InScope(Collection<Integer> quxMultipleIdList) {
        regINS(CK_INS, cTL(quxMultipleIdList), getCValueQuxMultipleId(), "QUX_MULTIPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleIdList The collection of quxMultipleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxMultipleId_NotInScope(Collection<Integer> quxMultipleIdList) {
        doSetQuxMultipleId_NotInScope(quxMultipleIdList);
    }

    protected void doSetQuxMultipleId_NotInScope(Collection<Integer> quxMultipleIdList) {
        regINS(CK_NINS, cTL(quxMultipleIdList), getCValueQuxMultipleId(), "QUX_MULTIPLE_ID");
    }

    protected void regQuxMultipleId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueQuxMultipleId(), "QUX_MULTIPLE_ID"); }
    protected abstract ConditionValue getCValueQuxMultipleId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefNestCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteCompoundPkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefNestCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteCompoundPkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefNestCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteCompoundPkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefNestCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteCompoundPkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefNestCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteCompoundPkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefNestCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteCompoundPkRefNestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefNestCQ sq);

    protected WhiteCompoundPkRefNestCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefNestCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefNestCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefNestCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "COMPOUND_PK_REF_NEST_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteCompoundPkRefNestCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefNestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteCompoundPkRefNestCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COMPOUND_PK_REF_NEST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteCompoundPkRefNestCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteCompoundPkRefNestCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteCompoundPkRefNestCQ sq);

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
    protected WhiteCompoundPkRefNestCB newMyCB() {
        return new WhiteCompoundPkRefNestCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteCompoundPkRefNestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
