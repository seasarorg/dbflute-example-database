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
 * The abstract condition-query of white_uq_fk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqFkRefNestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkRefNestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_fk_ref_nest";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestId The value of uqFkRefNestId as equal. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefNestId_Equal(Long uqFkRefNestId) {
        doSetUqFkRefNestId_Equal(uqFkRefNestId);
    }

    protected void doSetUqFkRefNestId_Equal(Long uqFkRefNestId) {
        regUqFkRefNestId(CK_EQ, uqFkRefNestId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestId The value of uqFkRefNestId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefNestId_GreaterThan(Long uqFkRefNestId) {
        regUqFkRefNestId(CK_GT, uqFkRefNestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestId The value of uqFkRefNestId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefNestId_LessThan(Long uqFkRefNestId) {
        regUqFkRefNestId(CK_LT, uqFkRefNestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestId The value of uqFkRefNestId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefNestId_GreaterEqual(Long uqFkRefNestId) {
        regUqFkRefNestId(CK_GE, uqFkRefNestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestId The value of uqFkRefNestId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefNestId_LessEqual(Long uqFkRefNestId) {
        regUqFkRefNestId(CK_LE, uqFkRefNestId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqFkRefNestId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqFkRefNestId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqFkRefNestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqFkRefNestId(), "UQ_FK_REF_NEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestIdList The collection of uqFkRefNestId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkRefNestId_InScope(Collection<Long> uqFkRefNestIdList) {
        doSetUqFkRefNestId_InScope(uqFkRefNestIdList);
    }

    protected void doSetUqFkRefNestId_InScope(Collection<Long> uqFkRefNestIdList) {
        regINS(CK_INS, cTL(uqFkRefNestIdList), getCValueUqFkRefNestId(), "UQ_FK_REF_NEST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefNestIdList The collection of uqFkRefNestId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkRefNestId_NotInScope(Collection<Long> uqFkRefNestIdList) {
        doSetUqFkRefNestId_NotInScope(uqFkRefNestIdList);
    }

    protected void doSetUqFkRefNestId_NotInScope(Collection<Long> uqFkRefNestIdList) {
        regINS(CK_NINS, cTL(uqFkRefNestIdList), getCValueUqFkRefNestId(), "UQ_FK_REF_NEST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqFkRefNestId_IsNull() { regUqFkRefNestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqFkRefNestId_IsNotNull() { regUqFkRefNestId(CK_ISNN, DOBJ); }

    protected void regUqFkRefNestId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUqFkRefNestId(), "UQ_FK_REF_NEST_ID"); }
    protected abstract ConditionValue getCValueUqFkRefNestId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_Equal(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_EQ, compoundUqFirstCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_NotEqual(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_NES, compoundUqFirstCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_InScope(compoundUqFirstCodeList);
    }

    public void doSetCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_INS, cTL(compoundUqFirstCodeList), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_NotInScope(compoundUqFirstCodeList);
    }

    public void doSetCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_NINS, cTL(compoundUqFirstCodeList), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_PrefixSearch(String compoundUqFirstCode) {
        setCompoundUqFirstCode_LikeSearch(compoundUqFirstCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} <br />
     * <pre>e.g. setCompoundUqFirstCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqFirstCode The value of compoundUqFirstCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_LikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqFirstCode), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_NotLikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqFirstCode), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    protected void regCompoundUqFirstCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE"); }
    protected abstract ConditionValue getCValueCompoundUqFirstCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_Equal(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_EQ, compoundUqSecondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_NotEqual(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_NES, compoundUqSecondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_InScope(compoundUqSecondCodeList);
    }

    public void doSetCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_INS, cTL(compoundUqSecondCodeList), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_NotInScope(compoundUqSecondCodeList);
    }

    public void doSetCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_NINS, cTL(compoundUqSecondCodeList), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_PrefixSearch(String compoundUqSecondCode) {
        setCompoundUqSecondCode_LikeSearch(compoundUqSecondCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} <br />
     * <pre>e.g. setCompoundUqSecondCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqSecondCode The value of compoundUqSecondCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_LikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqSecondCode), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_NotLikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqSecondCode), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    protected void regCompoundUqSecondCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE"); }
    protected abstract ConditionValue getCValueCompoundUqSecondCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefNestCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteUqFkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefNestCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteUqFkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefNestCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteUqFkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefNestCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteUqFkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefNestCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteUqFkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefNestCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteUqFkRefNestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteUqFkRefNestCQ sq);

    protected WhiteUqFkRefNestCB xcreateScalarConditionCB() {
        WhiteUqFkRefNestCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteUqFkRefNestCB xcreateScalarConditionPartitionByCB() {
        WhiteUqFkRefNestCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "UQ_FK_REF_NEST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqFkRefNestCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefNestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteUqFkRefNestCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "UQ_FK_REF_NEST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqFkRefNestCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteUqFkRefNestCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteUqFkRefNestCQ sq);

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
    protected WhiteUqFkRefNestCB newMyCB() {
        return new WhiteUqFkRefNestCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteUqFkRefNestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
