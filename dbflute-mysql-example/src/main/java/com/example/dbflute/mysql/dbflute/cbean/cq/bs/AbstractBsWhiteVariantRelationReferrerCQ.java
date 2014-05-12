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
 * The abstract condition-query of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationReferrerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationReferrerCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_referrer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerId The value of referrerId as equal. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_Equal(Long referrerId) {
        doSetReferrerId_Equal(referrerId);
    }

    protected void doSetReferrerId_Equal(Long referrerId) {
        regReferrerId(CK_EQ, referrerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerId The value of referrerId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_GreaterThan(Long referrerId) {
        regReferrerId(CK_GT, referrerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerId The value of referrerId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_LessThan(Long referrerId) {
        regReferrerId(CK_LT, referrerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerId The value of referrerId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_GreaterEqual(Long referrerId) {
        regReferrerId(CK_GE, referrerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerId The value of referrerId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReferrerId_LessEqual(Long referrerId) {
        regReferrerId(CK_LE, referrerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of referrerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of referrerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReferrerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueReferrerId(), "REFERRER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerIdList The collection of referrerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferrerId_InScope(Collection<Long> referrerIdList) {
        doSetReferrerId_InScope(referrerIdList);
    }

    protected void doSetReferrerId_InScope(Collection<Long> referrerIdList) {
        regINS(CK_INS, cTL(referrerIdList), getCValueReferrerId(), "REFERRER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @param referrerIdList The collection of referrerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferrerId_NotInScope(Collection<Long> referrerIdList) {
        doSetReferrerId_NotInScope(referrerIdList);
    }

    protected void doSetReferrerId_NotInScope(Collection<Long> referrerIdList) {
        regINS(CK_NINS, cTL(referrerIdList), getCValueReferrerId(), "REFERRER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setReferrerId_IsNull() { regReferrerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setReferrerId_IsNotNull() { regReferrerId(CK_ISNN, DOBJ); }

    protected void regReferrerId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReferrerId(), "REFERRER_ID"); }
    protected abstract ConditionValue getCValueReferrerId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterId The value of variantMasterId as equal. (NullAllowed: if null, no condition)
     */
    public void setVariantMasterId_Equal(Long variantMasterId) {
        doSetVariantMasterId_Equal(variantMasterId);
    }

    protected void doSetVariantMasterId_Equal(Long variantMasterId) {
        regVariantMasterId(CK_EQ, variantMasterId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterId The value of variantMasterId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVariantMasterId_GreaterThan(Long variantMasterId) {
        regVariantMasterId(CK_GT, variantMasterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterId The value of variantMasterId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVariantMasterId_LessThan(Long variantMasterId) {
        regVariantMasterId(CK_LT, variantMasterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterId The value of variantMasterId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVariantMasterId_GreaterEqual(Long variantMasterId) {
        regVariantMasterId(CK_GE, variantMasterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterId The value of variantMasterId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVariantMasterId_LessEqual(Long variantMasterId) {
        regVariantMasterId(CK_LE, variantMasterId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param minNumber The min number of variantMasterId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of variantMasterId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVariantMasterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVariantMasterId(), "VARIANT_MASTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterIdList The collection of variantMasterId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVariantMasterId_InScope(Collection<Long> variantMasterIdList) {
        doSetVariantMasterId_InScope(variantMasterIdList);
    }

    protected void doSetVariantMasterId_InScope(Collection<Long> variantMasterIdList) {
        regINS(CK_INS, cTL(variantMasterIdList), getCValueVariantMasterId(), "VARIANT_MASTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @param variantMasterIdList The collection of variantMasterId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVariantMasterId_NotInScope(Collection<Long> variantMasterIdList) {
        doSetVariantMasterId_NotInScope(variantMasterIdList);
    }

    protected void doSetVariantMasterId_NotInScope(Collection<Long> variantMasterIdList) {
        regINS(CK_NINS, cTL(variantMasterIdList), getCValueVariantMasterId(), "VARIANT_MASTER_ID");
    }

    protected void regVariantMasterId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVariantMasterId(), "VARIANT_MASTER_ID"); }
    protected abstract ConditionValue getCValueVariantMasterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @param masterTypeCode The value of masterTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_Equal(String masterTypeCode) {
        doSetMasterTypeCode_Equal(fRES(masterTypeCode));
    }

    /**
     * Equal(=). As VariantRelationMasterType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * master type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMasterTypeCode_Equal_AsVariantRelationMasterType(CDef.VariantRelationMasterType cdef) {
        doSetMasterTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As FooCls (FOO). And OnlyOnceRegistered. <br />
     * FooCls
     */
    public void setMasterTypeCode_Equal_FooCls() {
        setMasterTypeCode_Equal_AsVariantRelationMasterType(CDef.VariantRelationMasterType.FooCls);
    }

    /**
     * Equal(=). As BarCls (BAR). And OnlyOnceRegistered. <br />
     * BarCls
     */
    public void setMasterTypeCode_Equal_BarCls() {
        setMasterTypeCode_Equal_AsVariantRelationMasterType(CDef.VariantRelationMasterType.BarCls);
    }

    /**
     * Equal(=). As QuxCls (QUX). And OnlyOnceRegistered. <br />
     * QuxCls
     */
    public void setMasterTypeCode_Equal_QuxCls() {
        setMasterTypeCode_Equal_AsVariantRelationMasterType(CDef.VariantRelationMasterType.QuxCls);
    }

    /**
     * Equal(=). As CorgeCls (CORGE). And OnlyOnceRegistered. <br />
     * CorgeCls
     */
    public void setMasterTypeCode_Equal_CorgeCls() {
        setMasterTypeCode_Equal_AsVariantRelationMasterType(CDef.VariantRelationMasterType.CorgeCls);
    }

    protected void doSetMasterTypeCode_Equal(String masterTypeCode) {
        regMasterTypeCode(CK_EQ, masterTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @param masterTypeCode The value of masterTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_NotEqual(String masterTypeCode) {
        doSetMasterTypeCode_NotEqual(fRES(masterTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As VariantRelationMasterType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * master type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMasterTypeCode_NotEqual_AsVariantRelationMasterType(CDef.VariantRelationMasterType cdef) {
        doSetMasterTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As FooCls (FOO). And OnlyOnceRegistered. <br />
     * FooCls
     */
    public void setMasterTypeCode_NotEqual_FooCls() {
        setMasterTypeCode_NotEqual_AsVariantRelationMasterType(CDef.VariantRelationMasterType.FooCls);
    }

    /**
     * NotEqual(&lt;&gt;). As BarCls (BAR). And OnlyOnceRegistered. <br />
     * BarCls
     */
    public void setMasterTypeCode_NotEqual_BarCls() {
        setMasterTypeCode_NotEqual_AsVariantRelationMasterType(CDef.VariantRelationMasterType.BarCls);
    }

    /**
     * NotEqual(&lt;&gt;). As QuxCls (QUX). And OnlyOnceRegistered. <br />
     * QuxCls
     */
    public void setMasterTypeCode_NotEqual_QuxCls() {
        setMasterTypeCode_NotEqual_AsVariantRelationMasterType(CDef.VariantRelationMasterType.QuxCls);
    }

    /**
     * NotEqual(&lt;&gt;). As CorgeCls (CORGE). And OnlyOnceRegistered. <br />
     * CorgeCls
     */
    public void setMasterTypeCode_NotEqual_CorgeCls() {
        setMasterTypeCode_NotEqual_AsVariantRelationMasterType(CDef.VariantRelationMasterType.CorgeCls);
    }

    protected void doSetMasterTypeCode_NotEqual(String masterTypeCode) {
        regMasterTypeCode(CK_NES, masterTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @param masterTypeCodeList The collection of masterTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_InScope(Collection<String> masterTypeCodeList) {
        doSetMasterTypeCode_InScope(masterTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As VariantRelationMasterType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * master type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_InScope_AsVariantRelationMasterType(Collection<CDef.VariantRelationMasterType> cdefList) {
        doSetMasterTypeCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As VariantRelationMasterType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * master type of variant relation (biz-many-to-one) <br />
     * Foo or Bar or Qux <br />
     * The group elements:[FooCls, BarCls, QuxCls]
     */
    public void setMasterTypeCode_InScope_FooBarQux() {
        setMasterTypeCode_InScope_AsVariantRelationMasterType(CDef.VariantRelationMasterType.listOfFooBarQux());
    }

    public void doSetMasterTypeCode_InScope(Collection<String> masterTypeCodeList) {
        regINS(CK_INS, cTL(masterTypeCodeList), getCValueMasterTypeCode(), "MASTER_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @param masterTypeCodeList The collection of masterTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_NotInScope(Collection<String> masterTypeCodeList) {
        doSetMasterTypeCode_NotInScope(masterTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VariantRelationMasterType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * master type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterTypeCode_NotInScope_AsVariantRelationMasterType(Collection<CDef.VariantRelationMasterType> cdefList) {
        doSetMasterTypeCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetMasterTypeCode_NotInScope(Collection<String> masterTypeCodeList) {
        regINS(CK_NINS, cTL(masterTypeCodeList), getCValueMasterTypeCode(), "MASTER_TYPE_CODE");
    }

    protected void regMasterTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterTypeCode(), "MASTER_TYPE_CODE"); }
    protected abstract ConditionValue getCValueMasterTypeCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteVariantRelationReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteVariantRelationReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteVariantRelationReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteVariantRelationReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteVariantRelationReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationReferrerCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteVariantRelationReferrerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationReferrerCQ sq);

    protected WhiteVariantRelationReferrerCB xcreateScalarConditionCB() {
        WhiteVariantRelationReferrerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationReferrerCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationReferrerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REFERRER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationReferrerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationReferrerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationReferrerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REFERRER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationReferrerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationReferrerCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationReferrerCQ sq);

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
    protected WhiteVariantRelationReferrerCB newMyCB() {
        return new WhiteVariantRelationReferrerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteVariantRelationReferrerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
