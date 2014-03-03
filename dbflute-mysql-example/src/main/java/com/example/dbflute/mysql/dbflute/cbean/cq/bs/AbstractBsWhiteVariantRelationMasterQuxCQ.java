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
 * The abstract condition-query of white_variant_relation_master_qux.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterQuxCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterQuxCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_qux";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as equal. (NullAllowed: if null, no condition)
     */
    public void setMasterQuxId_Equal(Long masterQuxId) {
        doSetMasterQuxId_Equal(masterQuxId);
    }

    protected void doSetMasterQuxId_Equal(Long masterQuxId) {
        regMasterQuxId(CK_EQ, masterQuxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMasterQuxId_GreaterThan(Long masterQuxId) {
        regMasterQuxId(CK_GT, masterQuxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMasterQuxId_LessThan(Long masterQuxId) {
        regMasterQuxId(CK_LT, masterQuxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterQuxId_GreaterEqual(Long masterQuxId) {
        regMasterQuxId(CK_GE, masterQuxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterQuxId_LessEqual(Long masterQuxId) {
        regMasterQuxId(CK_LE, masterQuxId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterQuxId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of masterQuxId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterQuxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMasterQuxId(), "MASTER_QUX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxIdList The collection of masterQuxId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxId_InScope(Collection<Long> masterQuxIdList) {
        doSetMasterQuxId_InScope(masterQuxIdList);
    }

    protected void doSetMasterQuxId_InScope(Collection<Long> masterQuxIdList) {
        regINS(CK_INS, cTL(masterQuxIdList), getCValueMasterQuxId(), "MASTER_QUX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxIdList The collection of masterQuxId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxId_NotInScope(Collection<Long> masterQuxIdList) {
        doSetMasterQuxId_NotInScope(masterQuxIdList);
    }

    protected void doSetMasterQuxId_NotInScope(Collection<Long> masterQuxIdList) {
        regINS(CK_NINS, cTL(masterQuxIdList), getCValueMasterQuxId(), "MASTER_QUX_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterQuxId_IsNull() { regMasterQuxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterQuxId_IsNotNull() { regMasterQuxId(CK_ISNN, DOBJ); }

    protected void regMasterQuxId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterQuxId(), "MASTER_QUX_ID"); }
    protected abstract ConditionValue getCValueMasterQuxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxName_Equal(String masterQuxName) {
        doSetMasterQuxName_Equal(fRES(masterQuxName));
    }

    protected void doSetMasterQuxName_Equal(String masterQuxName) {
        regMasterQuxName(CK_EQ, masterQuxName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxName_NotEqual(String masterQuxName) {
        doSetMasterQuxName_NotEqual(fRES(masterQuxName));
    }

    protected void doSetMasterQuxName_NotEqual(String masterQuxName) {
        regMasterQuxName(CK_NES, masterQuxName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxNameList The collection of masterQuxName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxName_InScope(Collection<String> masterQuxNameList) {
        doSetMasterQuxName_InScope(masterQuxNameList);
    }

    public void doSetMasterQuxName_InScope(Collection<String> masterQuxNameList) {
        regINS(CK_INS, cTL(masterQuxNameList), getCValueMasterQuxName(), "MASTER_QUX_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxNameList The collection of masterQuxName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxName_NotInScope(Collection<String> masterQuxNameList) {
        doSetMasterQuxName_NotInScope(masterQuxNameList);
    }

    public void doSetMasterQuxName_NotInScope(Collection<String> masterQuxNameList) {
        regINS(CK_NINS, cTL(masterQuxNameList), getCValueMasterQuxName(), "MASTER_QUX_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterQuxName_PrefixSearch(String masterQuxName) {
        setMasterQuxName_LikeSearch(masterQuxName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMasterQuxName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterQuxName The value of masterQuxName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterQuxName_LikeSearch(String masterQuxName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterQuxName), getCValueMasterQuxName(), "MASTER_QUX_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterQuxName_NotLikeSearch(String masterQuxName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterQuxName), getCValueMasterQuxName(), "MASTER_QUX_NAME", likeSearchOption);
    }

    protected void regMasterQuxName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterQuxName(), "MASTER_QUX_NAME"); }
    protected abstract ConditionValue getCValueMasterQuxName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCode The value of quxTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxTypeCode_Equal(String quxTypeCode) {
        doSetQuxTypeCode_Equal(fRES(quxTypeCode));
    }

    /**
     * Equal(=). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetQuxTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Qua (Qua). And OnlyOnceRegistered. <br />
     * Qua
     */
    public void setQuxTypeCode_Equal_Qua() {
        setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Equal(=). As Que (Que). And OnlyOnceRegistered. <br />
     * Que
     */
    public void setQuxTypeCode_Equal_Que() {
        setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Equal(=). As Quo (Quo). And OnlyOnceRegistered. <br />
     * Quo
     */
    public void setQuxTypeCode_Equal_Quo() {
        setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetQuxTypeCode_Equal(String quxTypeCode) {
        regQuxTypeCode(CK_EQ, quxTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCode The value of quxTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxTypeCode_NotEqual(String quxTypeCode) {
        doSetQuxTypeCode_NotEqual(fRES(quxTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetQuxTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Qua (Qua). And OnlyOnceRegistered. <br />
     * Qua
     */
    public void setQuxTypeCode_NotEqual_Qua() {
        setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * NotEqual(&lt;&gt;). As Que (Que). And OnlyOnceRegistered. <br />
     * Que
     */
    public void setQuxTypeCode_NotEqual_Que() {
        setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * NotEqual(&lt;&gt;). As Quo (Quo). And OnlyOnceRegistered. <br />
     * Quo
     */
    public void setQuxTypeCode_NotEqual_Quo() {
        setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetQuxTypeCode_NotEqual(String quxTypeCode) {
        regQuxTypeCode(CK_NES, quxTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCodeList The collection of quxTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxTypeCode_InScope(Collection<String> quxTypeCodeList) {
        doSetQuxTypeCode_InScope(quxTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxTypeCode_InScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetQuxTypeCode_InScope(cTStrL(cdefList));
    }

    public void doSetQuxTypeCode_InScope(Collection<String> quxTypeCodeList) {
        regINS(CK_INS, cTL(quxTypeCodeList), getCValueQuxTypeCode(), "QUX_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCodeList The collection of quxTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxTypeCode_NotInScope(Collection<String> quxTypeCodeList) {
        doSetQuxTypeCode_NotInScope(quxTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxTypeCode_NotInScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetQuxTypeCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetQuxTypeCode_NotInScope(Collection<String> quxTypeCodeList) {
        regINS(CK_NINS, cTL(quxTypeCodeList), getCValueQuxTypeCode(), "QUX_TYPE_CODE");
    }

    protected void regQuxTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueQuxTypeCode(), "QUX_TYPE_CODE"); }
    protected abstract ConditionValue getCValueQuxTypeCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterQuxCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteVariantRelationMasterQuxCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterQuxCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteVariantRelationMasterQuxCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterQuxCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteVariantRelationMasterQuxCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterQuxCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteVariantRelationMasterQuxCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterQuxCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteVariantRelationMasterQuxCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterQuxCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteVariantRelationMasterQuxCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterQuxCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterQuxCQ sq);

    protected WhiteVariantRelationMasterQuxCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterQuxCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationMasterQuxCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterQuxCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterQuxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "MASTER_QUX_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterQuxCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterQuxCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationMasterQuxCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MASTER_QUX_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterQuxCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterQuxCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterQuxCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationMasterQuxCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationMasterQuxCQ sq);

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
    protected WhiteVariantRelationMasterQuxCB newMyCB() {
        return new WhiteVariantRelationMasterQuxCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteVariantRelationMasterQuxCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
