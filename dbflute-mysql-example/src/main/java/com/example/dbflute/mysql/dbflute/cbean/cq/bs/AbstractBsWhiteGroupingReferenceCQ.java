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
 * The abstract condition-query of white_grouping_reference.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteGroupingReferenceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteGroupingReferenceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_grouping_reference";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceId The value of groupingReferenceId as equal. (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceId_Equal(Long groupingReferenceId) {
        doSetGroupingReferenceId_Equal(groupingReferenceId);
    }

    protected void doSetGroupingReferenceId_Equal(Long groupingReferenceId) {
        regGroupingReferenceId(CK_EQ, groupingReferenceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceId The value of groupingReferenceId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceId_GreaterThan(Long groupingReferenceId) {
        regGroupingReferenceId(CK_GT, groupingReferenceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceId The value of groupingReferenceId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceId_LessThan(Long groupingReferenceId) {
        regGroupingReferenceId(CK_LT, groupingReferenceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceId The value of groupingReferenceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceId_GreaterEqual(Long groupingReferenceId) {
        regGroupingReferenceId(CK_GE, groupingReferenceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceId The value of groupingReferenceId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceId_LessEqual(Long groupingReferenceId) {
        regGroupingReferenceId(CK_LE, groupingReferenceId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of groupingReferenceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of groupingReferenceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGroupingReferenceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueGroupingReferenceId(), "GROUPING_REFERENCE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceIdList The collection of groupingReferenceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGroupingReferenceId_InScope(Collection<Long> groupingReferenceIdList) {
        doSetGroupingReferenceId_InScope(groupingReferenceIdList);
    }

    protected void doSetGroupingReferenceId_InScope(Collection<Long> groupingReferenceIdList) {
        regINS(CK_INS, cTL(groupingReferenceIdList), getCValueGroupingReferenceId(), "GROUPING_REFERENCE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param groupingReferenceIdList The collection of groupingReferenceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGroupingReferenceId_NotInScope(Collection<Long> groupingReferenceIdList) {
        doSetGroupingReferenceId_NotInScope(groupingReferenceIdList);
    }

    protected void doSetGroupingReferenceId_NotInScope(Collection<Long> groupingReferenceIdList) {
        regINS(CK_NINS, cTL(groupingReferenceIdList), getCValueGroupingReferenceId(), "GROUPING_REFERENCE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setGroupingReferenceId_IsNull() { regGroupingReferenceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setGroupingReferenceId_IsNotNull() { regGroupingReferenceId(CK_ISNN, DOBJ); }

    protected void regGroupingReferenceId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGroupingReferenceId(), "GROUPING_REFERENCE_ID"); }
    protected abstract ConditionValue getCValueGroupingReferenceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference}
     * @param groupingReferenceCode The value of groupingReferenceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setGroupingReferenceCode_Equal(String groupingReferenceCode) {
        doSetGroupingReferenceCode_Equal(fRES(groupingReferenceCode));
    }

    /**
     * Equal(=). As GroupingReference. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceCode_Equal_AsGroupingReference(CDef.GroupingReference cdef) {
        doSetGroupingReferenceCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As LAND_NAME (LND). And OnlyOnceRegistered. <br />
     * LAND_NAME
     */
    public void setGroupingReferenceCode_Equal_LAND_NAME() {
        setGroupingReferenceCode_Equal_AsGroupingReference(CDef.GroupingReference.LAND_NAME);
    }

    /**
     * Equal(=). As SEA_NAME (SEA). And OnlyOnceRegistered. <br />
     * SEA_NAME
     */
    public void setGroupingReferenceCode_Equal_SEA_NAME() {
        setGroupingReferenceCode_Equal_AsGroupingReference(CDef.GroupingReference.SEA_NAME);
    }

    /**
     * Equal(=). As IKSPIARY_NAME (IKS). And OnlyOnceRegistered. <br />
     * IKSPIARY_NAME
     */
    public void setGroupingReferenceCode_Equal_IKSPIARY_NAME() {
        setGroupingReferenceCode_Equal_AsGroupingReference(CDef.GroupingReference.IKSPIARY_NAME);
    }

    /**
     * Equal(=). As AMPHI_NAME (AMP). And OnlyOnceRegistered. <br />
     * AMPHI_NAME
     */
    public void setGroupingReferenceCode_Equal_AMPHI_NAME() {
        setGroupingReferenceCode_Equal_AsGroupingReference(CDef.GroupingReference.AMPHI_NAME);
    }

    protected void doSetGroupingReferenceCode_Equal(String groupingReferenceCode) {
        regGroupingReferenceCode(CK_EQ, groupingReferenceCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference}
     * @param groupingReferenceCode The value of groupingReferenceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setGroupingReferenceCode_NotEqual(String groupingReferenceCode) {
        doSetGroupingReferenceCode_NotEqual(fRES(groupingReferenceCode));
    }

    /**
     * NotEqual(&lt;&gt;). As GroupingReference. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setGroupingReferenceCode_NotEqual_AsGroupingReference(CDef.GroupingReference cdef) {
        doSetGroupingReferenceCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As LAND_NAME (LND). And OnlyOnceRegistered. <br />
     * LAND_NAME
     */
    public void setGroupingReferenceCode_NotEqual_LAND_NAME() {
        setGroupingReferenceCode_NotEqual_AsGroupingReference(CDef.GroupingReference.LAND_NAME);
    }

    /**
     * NotEqual(&lt;&gt;). As SEA_NAME (SEA). And OnlyOnceRegistered. <br />
     * SEA_NAME
     */
    public void setGroupingReferenceCode_NotEqual_SEA_NAME() {
        setGroupingReferenceCode_NotEqual_AsGroupingReference(CDef.GroupingReference.SEA_NAME);
    }

    /**
     * NotEqual(&lt;&gt;). As IKSPIARY_NAME (IKS). And OnlyOnceRegistered. <br />
     * IKSPIARY_NAME
     */
    public void setGroupingReferenceCode_NotEqual_IKSPIARY_NAME() {
        setGroupingReferenceCode_NotEqual_AsGroupingReference(CDef.GroupingReference.IKSPIARY_NAME);
    }

    /**
     * NotEqual(&lt;&gt;). As AMPHI_NAME (AMP). And OnlyOnceRegistered. <br />
     * AMPHI_NAME
     */
    public void setGroupingReferenceCode_NotEqual_AMPHI_NAME() {
        setGroupingReferenceCode_NotEqual_AsGroupingReference(CDef.GroupingReference.AMPHI_NAME);
    }

    protected void doSetGroupingReferenceCode_NotEqual(String groupingReferenceCode) {
        regGroupingReferenceCode(CK_NES, groupingReferenceCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference}
     * @param groupingReferenceCodeList The collection of groupingReferenceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGroupingReferenceCode_InScope(Collection<String> groupingReferenceCodeList) {
        doSetGroupingReferenceCode_InScope(groupingReferenceCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setGroupingReferenceCode_InScope_AsGroupingReference(Collection<CDef.GroupingReference> cdefList) {
        doSetGroupingReferenceCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * the test of reference variable in grouping map <br />
     * サービスが利用できる会員 <br />
     * The group elements:[LAND_NAME, SEA_NAME]
     */
    public void setGroupingReferenceCode_InScope_ServiceAvailable() {
        setGroupingReferenceCode_InScope_AsGroupingReference(CDef.GroupingReference.listOfServiceAvailable());
    }

    /**
     * InScope {in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * the test of reference variable in grouping map <br />
     * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
     */
    public void setGroupingReferenceCode_InScope_ServicePlus() {
        setGroupingReferenceCode_InScope_AsGroupingReference(CDef.GroupingReference.listOfServicePlus());
    }

    /**
     * InScope {in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * the test of reference variable in grouping map <br />
     * The group elements:[AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME]
     */
    public void setGroupingReferenceCode_InScope_NestedPlus() {
        setGroupingReferenceCode_InScope_AsGroupingReference(CDef.GroupingReference.listOfNestedPlus());
    }

    /**
     * InScope {in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * the test of reference variable in grouping map <br />
     * The group elements:[IKSPIARY_NAME]
     */
    public void setGroupingReferenceCode_InScope_OneDef() {
        setGroupingReferenceCode_InScope_AsGroupingReference(CDef.GroupingReference.listOfOneDef());
    }

    /**
     * InScope {in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * the test of reference variable in grouping map <br />
     * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
     */
    public void setGroupingReferenceCode_InScope_DupRef() {
        setGroupingReferenceCode_InScope_AsGroupingReference(CDef.GroupingReference.listOfDupRef());
    }

    public void doSetGroupingReferenceCode_InScope(Collection<String> groupingReferenceCodeList) {
        regINS(CK_INS, cTL(groupingReferenceCodeList), getCValueGroupingReferenceCode(), "GROUPING_REFERENCE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference}
     * @param groupingReferenceCodeList The collection of groupingReferenceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGroupingReferenceCode_NotInScope(Collection<String> groupingReferenceCodeList) {
        doSetGroupingReferenceCode_NotInScope(groupingReferenceCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As GroupingReference. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setGroupingReferenceCode_NotInScope_AsGroupingReference(Collection<CDef.GroupingReference> cdefList) {
        doSetGroupingReferenceCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetGroupingReferenceCode_NotInScope(Collection<String> groupingReferenceCodeList) {
        regINS(CK_NINS, cTL(groupingReferenceCodeList), getCValueGroupingReferenceCode(), "GROUPING_REFERENCE_CODE");
    }

    protected void regGroupingReferenceCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGroupingReferenceCode(), "GROUPING_REFERENCE_CODE"); }
    protected abstract ConditionValue getCValueGroupingReferenceCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteGroupingReferenceCB&gt;() {
     *     public void query(WhiteGroupingReferenceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGroupingReferenceCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteGroupingReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteGroupingReferenceCB&gt;() {
     *     public void query(WhiteGroupingReferenceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGroupingReferenceCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteGroupingReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteGroupingReferenceCB&gt;() {
     *     public void query(WhiteGroupingReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGroupingReferenceCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteGroupingReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteGroupingReferenceCB&gt;() {
     *     public void query(WhiteGroupingReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGroupingReferenceCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteGroupingReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteGroupingReferenceCB&gt;() {
     *     public void query(WhiteGroupingReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGroupingReferenceCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteGroupingReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteGroupingReferenceCB&gt;() {
     *     public void query(WhiteGroupingReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGroupingReferenceCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteGroupingReferenceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGroupingReferenceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteGroupingReferenceCQ sq);

    protected WhiteGroupingReferenceCB xcreateScalarConditionCB() {
        WhiteGroupingReferenceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteGroupingReferenceCB xcreateScalarConditionPartitionByCB() {
        WhiteGroupingReferenceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteGroupingReferenceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGroupingReferenceCB cb = new WhiteGroupingReferenceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "GROUPING_REFERENCE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteGroupingReferenceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteGroupingReferenceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteGroupingReferenceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGroupingReferenceCB cb = new WhiteGroupingReferenceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GROUPING_REFERENCE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteGroupingReferenceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteGroupingReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteGroupingReferenceCB cb = new WhiteGroupingReferenceCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteGroupingReferenceCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteGroupingReferenceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteGroupingReferenceCB cb = new WhiteGroupingReferenceCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteGroupingReferenceCQ sq);

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
    protected WhiteGroupingReferenceCB newMyCB() {
        return new WhiteGroupingReferenceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteGroupingReferenceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
