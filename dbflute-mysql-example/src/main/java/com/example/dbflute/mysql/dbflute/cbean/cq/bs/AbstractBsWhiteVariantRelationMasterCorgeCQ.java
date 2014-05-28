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
 * The abstract condition-query of white_variant_relation_master_corge.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterCorgeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterCorgeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_corge";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as equal. (NullAllowed: if null, no condition)
     */
    public void setMasterCorgeId_Equal(Long masterCorgeId) {
        doSetMasterCorgeId_Equal(masterCorgeId);
    }

    protected void doSetMasterCorgeId_Equal(Long masterCorgeId) {
        regMasterCorgeId(CK_EQ, masterCorgeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMasterCorgeId_GreaterThan(Long masterCorgeId) {
        regMasterCorgeId(CK_GT, masterCorgeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMasterCorgeId_LessThan(Long masterCorgeId) {
        regMasterCorgeId(CK_LT, masterCorgeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterCorgeId_GreaterEqual(Long masterCorgeId) {
        regMasterCorgeId(CK_GE, masterCorgeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMasterCorgeId_LessEqual(Long masterCorgeId) {
        regMasterCorgeId(CK_LE, masterCorgeId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterCorgeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of masterCorgeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterCorgeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMasterCorgeId(), "MASTER_CORGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeIdList The collection of masterCorgeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeId_InScope(Collection<Long> masterCorgeIdList) {
        doSetMasterCorgeId_InScope(masterCorgeIdList);
    }

    protected void doSetMasterCorgeId_InScope(Collection<Long> masterCorgeIdList) {
        regINS(CK_INS, cTL(masterCorgeIdList), getCValueMasterCorgeId(), "MASTER_CORGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeIdList The collection of masterCorgeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeId_NotInScope(Collection<Long> masterCorgeIdList) {
        doSetMasterCorgeId_NotInScope(masterCorgeIdList);
    }

    protected void doSetMasterCorgeId_NotInScope(Collection<Long> masterCorgeIdList) {
        regINS(CK_NINS, cTL(masterCorgeIdList), getCValueMasterCorgeId(), "MASTER_CORGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterCorgeId_IsNull() { regMasterCorgeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterCorgeId_IsNotNull() { regMasterCorgeId(CK_ISNN, DOBJ); }

    protected void regMasterCorgeId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterCorgeId(), "MASTER_CORGE_ID"); }
    protected abstract ConditionValue getCValueMasterCorgeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeName_Equal(String masterCorgeName) {
        doSetMasterCorgeName_Equal(fRES(masterCorgeName));
    }

    protected void doSetMasterCorgeName_Equal(String masterCorgeName) {
        regMasterCorgeName(CK_EQ, masterCorgeName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeName_NotEqual(String masterCorgeName) {
        doSetMasterCorgeName_NotEqual(fRES(masterCorgeName));
    }

    protected void doSetMasterCorgeName_NotEqual(String masterCorgeName) {
        regMasterCorgeName(CK_NES, masterCorgeName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeNameList The collection of masterCorgeName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeName_InScope(Collection<String> masterCorgeNameList) {
        doSetMasterCorgeName_InScope(masterCorgeNameList);
    }

    public void doSetMasterCorgeName_InScope(Collection<String> masterCorgeNameList) {
        regINS(CK_INS, cTL(masterCorgeNameList), getCValueMasterCorgeName(), "MASTER_CORGE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeNameList The collection of masterCorgeName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeName_NotInScope(Collection<String> masterCorgeNameList) {
        doSetMasterCorgeName_NotInScope(masterCorgeNameList);
    }

    public void doSetMasterCorgeName_NotInScope(Collection<String> masterCorgeNameList) {
        regINS(CK_NINS, cTL(masterCorgeNameList), getCValueMasterCorgeName(), "MASTER_CORGE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterCorgeName_PrefixSearch(String masterCorgeName) {
        setMasterCorgeName_LikeSearch(masterCorgeName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMasterCorgeName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterCorgeName The value of masterCorgeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterCorgeName_LikeSearch(String masterCorgeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterCorgeName), getCValueMasterCorgeName(), "MASTER_CORGE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterCorgeName_NotLikeSearch(String masterCorgeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterCorgeName), getCValueMasterCorgeName(), "MASTER_CORGE_NAME", likeSearchOption);
    }

    protected void regMasterCorgeName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMasterCorgeName(), "MASTER_CORGE_NAME"); }
    protected abstract ConditionValue getCValueMasterCorgeName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCode The value of corgeTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setCorgeTypeCode_Equal(String corgeTypeCode) {
        doSetCorgeTypeCode_Equal(fRES(corgeTypeCode));
    }

    /**
     * Equal(=). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetCorgeTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Qua (Qua). And OnlyOnceRegistered. <br />
     * Qua
     */
    public void setCorgeTypeCode_Equal_Qua() {
        setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Equal(=). As Que (Que). And OnlyOnceRegistered. <br />
     * Que
     */
    public void setCorgeTypeCode_Equal_Que() {
        setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Equal(=). As Quo (Quo). And OnlyOnceRegistered. <br />
     * Quo
     */
    public void setCorgeTypeCode_Equal_Quo() {
        setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetCorgeTypeCode_Equal(String corgeTypeCode) {
        regCorgeTypeCode(CK_EQ, corgeTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCode The value of corgeTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setCorgeTypeCode_NotEqual(String corgeTypeCode) {
        doSetCorgeTypeCode_NotEqual(fRES(corgeTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetCorgeTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Qua (Qua). And OnlyOnceRegistered. <br />
     * Qua
     */
    public void setCorgeTypeCode_NotEqual_Qua() {
        setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * NotEqual(&lt;&gt;). As Que (Que). And OnlyOnceRegistered. <br />
     * Que
     */
    public void setCorgeTypeCode_NotEqual_Que() {
        setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * NotEqual(&lt;&gt;). As Quo (Quo). And OnlyOnceRegistered. <br />
     * Quo
     */
    public void setCorgeTypeCode_NotEqual_Quo() {
        setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetCorgeTypeCode_NotEqual(String corgeTypeCode) {
        regCorgeTypeCode(CK_NES, corgeTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCodeList The collection of corgeTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCorgeTypeCode_InScope(Collection<String> corgeTypeCodeList) {
        doSetCorgeTypeCode_InScope(corgeTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCorgeTypeCode_InScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetCorgeTypeCode_InScope(cTStrL(cdefList));
    }

    public void doSetCorgeTypeCode_InScope(Collection<String> corgeTypeCodeList) {
        regINS(CK_INS, cTL(corgeTypeCodeList), getCValueCorgeTypeCode(), "CORGE_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCodeList The collection of corgeTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCorgeTypeCode_NotInScope(Collection<String> corgeTypeCodeList) {
        doSetCorgeTypeCode_NotInScope(corgeTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCorgeTypeCode_NotInScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetCorgeTypeCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetCorgeTypeCode_NotInScope(Collection<String> corgeTypeCodeList) {
        regINS(CK_NINS, cTL(corgeTypeCodeList), getCValueCorgeTypeCode(), "CORGE_TYPE_CODE");
    }

    protected void regCorgeTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCorgeTypeCode(), "CORGE_TYPE_CODE"); }
    protected abstract ConditionValue getCValueCorgeTypeCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterCorgeCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteVariantRelationMasterCorgeCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterCorgeCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteVariantRelationMasterCorgeCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterCorgeCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteVariantRelationMasterCorgeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterCorgeCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteVariantRelationMasterCorgeCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterCorgeCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteVariantRelationMasterCorgeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteVariantRelationMasterCorgeCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteVariantRelationMasterCorgeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterCorgeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterCorgeCQ sq);

    protected WhiteVariantRelationMasterCorgeCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterCorgeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationMasterCorgeCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterCorgeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterCorgeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MASTER_CORGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterCorgeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterCorgeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationMasterCorgeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MASTER_CORGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterCorgeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterCorgeCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterCorgeCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteVariantRelationMasterCorgeCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteVariantRelationMasterCorgeCQ sq);

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
    protected WhiteVariantRelationMasterCorgeCB newMyCB() {
        return new WhiteVariantRelationMasterCorgeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteVariantRelationMasterCorgeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
