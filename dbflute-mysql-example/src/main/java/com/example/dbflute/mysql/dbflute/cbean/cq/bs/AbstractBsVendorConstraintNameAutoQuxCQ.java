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
 * The abstract condition-query of vendor_constraint_name_auto_qux.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorConstraintNameAutoQuxCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorConstraintNameAutoQuxCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_constraint_name_auto_qux";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_Equal(Long constraintNameAutoQuxId) {
        doSetConstraintNameAutoQuxId_Equal(constraintNameAutoQuxId);
    }

    protected void doSetConstraintNameAutoQuxId_Equal(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_EQ, constraintNameAutoQuxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_GreaterThan(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GT, constraintNameAutoQuxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_LessThan(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LT, constraintNameAutoQuxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_GreaterEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GE, constraintNameAutoQuxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_LessEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LE, constraintNameAutoQuxId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoQuxId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoQuxId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoQuxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxId_InScope(Collection<Long> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_InScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_InScope(Collection<Long> constraintNameAutoQuxIdList) {
        regINS(CK_INS, cTL(constraintNameAutoQuxIdList), getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxId_NotInScope(Collection<Long> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_NotInScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_NotInScope(Collection<Long> constraintNameAutoQuxIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoQuxIdList), getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select CONSTRAINT_NAME_AUTO_QUX_ID from vendor_constraint_name_auto_ref where ...)} <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsVendorConstraintNameAutoRefList</span>(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'exists'. (NotNull)
     */
    public void existsVendorConstraintNameAutoRefList(SubQuery<VendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoRefCB>", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select CONSTRAINT_NAME_AUTO_QUX_ID from vendor_constraint_name_auto_ref where ...)} <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorConstraintNameAutoRefList</span>(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorConstraintNameAutoRefList(SubQuery<VendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoRefCB>", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_QUX_ID from vendor_constraint_name_auto_ref where ...)} <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoRefList(SubQuery<VendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoRefCB>", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_QUX_ID from vendor_constraint_name_auto_ref where ...)} <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoRefList(SubQuery<VendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoRefCB>", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery);

    public void xsderiveVendorConstraintNameAutoRefList(String function, SubQuery<VendorConstraintNameAutoRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoRefCB>", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "vendorConstraintNameAutoRefList", aliasName, option);
    }
    public abstract String keepConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from vendor_constraint_name_auto_ref where ...)} <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedVendorConstraintNameAutoRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorConstraintNameAutoRefCB> derivedVendorConstraintNameAutoRefList() {
        return xcreateQDRFunctionVendorConstraintNameAutoRefList();
    }
    protected HpQDRFunction<VendorConstraintNameAutoRefCB> xcreateQDRFunctionVendorConstraintNameAutoRefList() {
        return new HpQDRFunction<VendorConstraintNameAutoRefCB>(new HpQDRSetupper<VendorConstraintNameAutoRefCB>() {
            public void setup(String function, SubQuery<VendorConstraintNameAutoRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveVendorConstraintNameAutoRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveVendorConstraintNameAutoRefList(String function, SubQuery<VendorConstraintNameAutoRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoRefCB>", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "vendorConstraintNameAutoRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ subQuery);
    public abstract String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setConstraintNameAutoQuxId_IsNull() { regConstraintNameAutoQuxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setConstraintNameAutoQuxId_IsNotNull() { regConstraintNameAutoQuxId(CK_ISNN, DOBJ); }

    protected void regConstraintNameAutoQuxId(ConditionKey k, Object v) { regQ(k, v, getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID"); }
    abstract protected ConditionValue getCValueConstraintNameAutoQuxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoQuxName The value of constraintNameAutoQuxName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxName_Equal(String constraintNameAutoQuxName) {
        doSetConstraintNameAutoQuxName_Equal(fRES(constraintNameAutoQuxName));
    }

    protected void doSetConstraintNameAutoQuxName_Equal(String constraintNameAutoQuxName) {
        regConstraintNameAutoQuxName(CK_EQ, constraintNameAutoQuxName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoQuxName The value of constraintNameAutoQuxName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxName_NotEqual(String constraintNameAutoQuxName) {
        doSetConstraintNameAutoQuxName_NotEqual(fRES(constraintNameAutoQuxName));
    }

    protected void doSetConstraintNameAutoQuxName_NotEqual(String constraintNameAutoQuxName) {
        regConstraintNameAutoQuxName(CK_NES, constraintNameAutoQuxName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoQuxNameList The collection of constraintNameAutoQuxName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxName_InScope(Collection<String> constraintNameAutoQuxNameList) {
        doSetConstraintNameAutoQuxName_InScope(constraintNameAutoQuxNameList);
    }

    public void doSetConstraintNameAutoQuxName_InScope(Collection<String> constraintNameAutoQuxNameList) {
        regINS(CK_INS, cTL(constraintNameAutoQuxNameList), getCValueConstraintNameAutoQuxName(), "CONSTRAINT_NAME_AUTO_QUX_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoQuxNameList The collection of constraintNameAutoQuxName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxName_NotInScope(Collection<String> constraintNameAutoQuxNameList) {
        doSetConstraintNameAutoQuxName_NotInScope(constraintNameAutoQuxNameList);
    }

    public void doSetConstraintNameAutoQuxName_NotInScope(Collection<String> constraintNameAutoQuxNameList) {
        regINS(CK_NINS, cTL(constraintNameAutoQuxNameList), getCValueConstraintNameAutoQuxName(), "CONSTRAINT_NAME_AUTO_QUX_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoQuxName The value of constraintNameAutoQuxName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxName_PrefixSearch(String constraintNameAutoQuxName) {
        setConstraintNameAutoQuxName_LikeSearch(constraintNameAutoQuxName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setConstraintNameAutoQuxName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param constraintNameAutoQuxName The value of constraintNameAutoQuxName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraintNameAutoQuxName_LikeSearch(String constraintNameAutoQuxName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraintNameAutoQuxName), getCValueConstraintNameAutoQuxName(), "CONSTRAINT_NAME_AUTO_QUX_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoQuxName The value of constraintNameAutoQuxName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraintNameAutoQuxName_NotLikeSearch(String constraintNameAutoQuxName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraintNameAutoQuxName), getCValueConstraintNameAutoQuxName(), "CONSTRAINT_NAME_AUTO_QUX_NAME", likeSearchOption);
    }

    protected void regConstraintNameAutoQuxName(ConditionKey k, Object v) { regQ(k, v, getCValueConstraintNameAutoQuxName(), "CONSTRAINT_NAME_AUTO_QUX_NAME"); }
    abstract protected ConditionValue getCValueConstraintNameAutoQuxName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoQuxCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoQuxCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoQuxCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoQuxCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoQuxCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void query(VendorConstraintNameAutoQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoQuxCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorConstraintNameAutoQuxCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorConstraintNameAutoQuxCB>(new HpSSQSetupper<VendorConstraintNameAutoQuxCB>() {
            public void setup(String function, SubQuery<VendorConstraintNameAutoQuxCB> subQuery, HpSSQOption<VendorConstraintNameAutoQuxCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorConstraintNameAutoQuxCB> subQuery, String operand, HpSSQOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoQuxCB>", subQuery);
        VendorConstraintNameAutoQuxCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorConstraintNameAutoQuxCQ subQuery);

    protected VendorConstraintNameAutoQuxCB xcreateScalarConditionCB() {
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorConstraintNameAutoQuxCB xcreateScalarConditionPartitionByCB() {
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorConstraintNameAutoQuxCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoQuxCB>", subQuery);
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorConstraintNameAutoQuxCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorConstraintNameAutoQuxCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorConstraintNameAutoQuxCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorConstraintNameAutoQuxCB>(new HpQDRSetupper<VendorConstraintNameAutoQuxCB>() {
            public void setup(String function, SubQuery<VendorConstraintNameAutoQuxCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorConstraintNameAutoQuxCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoQuxCB>", subQuery);
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorConstraintNameAutoQuxCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorConstraintNameAutoQuxCB> subQuery) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoQuxCB>", subQuery);
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorConstraintNameAutoQuxCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorConstraintNameAutoQuxCB> subQuery) {
        assertObjectNotNull("subQuery<VendorConstraintNameAutoQuxCB>", subQuery);
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorConstraintNameAutoQuxCQ subQuery);

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
    protected String xabCB() { return VendorConstraintNameAutoQuxCB.class.getName(); }
    protected String xabCQ() { return VendorConstraintNameAutoQuxCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
