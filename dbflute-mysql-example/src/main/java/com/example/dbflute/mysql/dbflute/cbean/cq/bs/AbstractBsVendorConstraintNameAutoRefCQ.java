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
 * The abstract condition-query of vendor_constraint_name_auto_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorConstraintNameAutoRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorConstraintNameAutoRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_constraint_name_auto_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_Equal(Long constraintNameAutoRefId) {
        doSetConstraintNameAutoRefId_Equal(constraintNameAutoRefId);
    }

    protected void doSetConstraintNameAutoRefId_Equal(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_EQ, constraintNameAutoRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_GreaterThan(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_GT, constraintNameAutoRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_LessThan(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_LT, constraintNameAutoRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_GreaterEqual(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_GE, constraintNameAutoRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_LessEqual(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_LE, constraintNameAutoRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefIdList The collection of constraintNameAutoRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoRefId_InScope(Collection<Long> constraintNameAutoRefIdList) {
        doSetConstraintNameAutoRefId_InScope(constraintNameAutoRefIdList);
    }

    protected void doSetConstraintNameAutoRefId_InScope(Collection<Long> constraintNameAutoRefIdList) {
        regINS(CK_INS, cTL(constraintNameAutoRefIdList), getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefIdList The collection of constraintNameAutoRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoRefId_NotInScope(Collection<Long> constraintNameAutoRefIdList) {
        doSetConstraintNameAutoRefId_NotInScope(constraintNameAutoRefIdList);
    }

    protected void doSetConstraintNameAutoRefId_NotInScope(Collection<Long> constraintNameAutoRefIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoRefIdList), getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setConstraintNameAutoRefId_IsNull() { regConstraintNameAutoRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setConstraintNameAutoRefId_IsNotNull() { regConstraintNameAutoRefId(CK_ISNN, DOBJ); }

    protected void regConstraintNameAutoRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_Equal(Long constraintNameAutoFooId) {
        doSetConstraintNameAutoFooId_Equal(constraintNameAutoFooId);
    }

    protected void doSetConstraintNameAutoFooId_Equal(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_EQ, constraintNameAutoFooId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_GreaterThan(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GT, constraintNameAutoFooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_LessThan(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LT, constraintNameAutoFooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_GreaterEqual(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GE, constraintNameAutoFooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_LessEqual(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LE, constraintNameAutoFooId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param minNumber The min number of constraintNameAutoFooId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoFooId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoFooId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooId_InScope(Collection<Long> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_InScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_InScope(Collection<Long> constraintNameAutoFooIdList) {
        regINS(CK_INS, cTL(constraintNameAutoFooIdList), getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooId_NotInScope(Collection<Long> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_NotInScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_NotInScope(Collection<Long> constraintNameAutoFooIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoFooIdList), getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_FOO_ID from vendor_constraint_name_auto_foo where ...)} <br />
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param subQuery The sub-query of VendorConstraintNameAutoFoo for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoFoo(SubQuery<VendorConstraintNameAutoFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoFoo");
    }
    public abstract String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_FOO_ID from vendor_constraint_name_auto_foo where ...)} <br />
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param subQuery The sub-query of VendorConstraintNameAutoFoo for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoFoo(SubQuery<VendorConstraintNameAutoFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoFoo");
    }
    public abstract String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq);

    protected void regConstraintNameAutoFooId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoFooId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_Equal(Long constraintNameAutoBarId) {
        doSetConstraintNameAutoBarId_Equal(constraintNameAutoBarId);
    }

    protected void doSetConstraintNameAutoBarId_Equal(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_EQ, constraintNameAutoBarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_GreaterThan(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GT, constraintNameAutoBarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_LessThan(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LT, constraintNameAutoBarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_GreaterEqual(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GE, constraintNameAutoBarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_LessEqual(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LE, constraintNameAutoBarId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param minNumber The min number of constraintNameAutoBarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoBarId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoBarId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarId_InScope(Collection<Long> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_InScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_InScope(Collection<Long> constraintNameAutoBarIdList) {
        regINS(CK_INS, cTL(constraintNameAutoBarIdList), getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarId_NotInScope(Collection<Long> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_NotInScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_NotInScope(Collection<Long> constraintNameAutoBarIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoBarIdList), getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_BAR_ID from vendor_constraint_name_auto_bar where ...)} <br />
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param subQuery The sub-query of VendorConstraintNameAutoBar for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoBar(SubQuery<VendorConstraintNameAutoBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoBar");
    }
    public abstract String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_BAR_ID from vendor_constraint_name_auto_bar where ...)} <br />
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param subQuery The sub-query of VendorConstraintNameAutoBar for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoBar(SubQuery<VendorConstraintNameAutoBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoBar");
    }
    public abstract String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq);

    protected void regConstraintNameAutoBarId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoBarId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
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
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_GreaterThan(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GT, constraintNameAutoQuxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_LessThan(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LT, constraintNameAutoQuxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_GreaterEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GE, constraintNameAutoQuxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_LessEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LE, constraintNameAutoQuxId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param minNumber The min number of constraintNameAutoQuxId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoQuxId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoQuxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
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
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxId_NotInScope(Collection<Long> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_NotInScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_NotInScope(Collection<Long> constraintNameAutoQuxIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoQuxIdList), getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_QUX_ID from vendor_constraint_name_auto_qux where ...)} <br />
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param subQuery The sub-query of VendorConstraintNameAutoQux for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoQux(SubQuery<VendorConstraintNameAutoQuxCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", pp, "vendorConstraintNameAutoQux");
    }
    public abstract String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_QUX_ID from vendor_constraint_name_auto_qux where ...)} <br />
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param subQuery The sub-query of VendorConstraintNameAutoQux for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoQux(SubQuery<VendorConstraintNameAutoQuxCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", pp, "vendorConstraintNameAutoQux");
    }
    public abstract String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq);

    protected void regConstraintNameAutoQuxId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoQuxId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoCorgeId_Equal(Long constraintNameAutoCorgeId) {
        doSetConstraintNameAutoCorgeId_Equal(constraintNameAutoCorgeId);
    }

    protected void doSetConstraintNameAutoCorgeId_Equal(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_EQ, constraintNameAutoCorgeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoCorgeId_GreaterThan(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_GT, constraintNameAutoCorgeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoCorgeId_LessThan(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_LT, constraintNameAutoCorgeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoCorgeId_GreaterEqual(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_GE, constraintNameAutoCorgeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoCorgeId_LessEqual(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_LE, constraintNameAutoCorgeId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoCorgeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoCorgeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoCorgeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeIdList The collection of constraintNameAutoCorgeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoCorgeId_InScope(Collection<Long> constraintNameAutoCorgeIdList) {
        doSetConstraintNameAutoCorgeId_InScope(constraintNameAutoCorgeIdList);
    }

    protected void doSetConstraintNameAutoCorgeId_InScope(Collection<Long> constraintNameAutoCorgeIdList) {
        regINS(CK_INS, cTL(constraintNameAutoCorgeIdList), getCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeIdList The collection of constraintNameAutoCorgeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoCorgeId_NotInScope(Collection<Long> constraintNameAutoCorgeIdList) {
        doSetConstraintNameAutoCorgeId_NotInScope(constraintNameAutoCorgeIdList);
    }

    protected void doSetConstraintNameAutoCorgeId_NotInScope(Collection<Long> constraintNameAutoCorgeIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoCorgeIdList), getCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID");
    }

    protected void regConstraintNameAutoCorgeId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoCorgeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_Equal(String constraintNameAutoUnique) {
        doSetConstraintNameAutoUnique_Equal(fRES(constraintNameAutoUnique));
    }

    protected void doSetConstraintNameAutoUnique_Equal(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_EQ, constraintNameAutoUnique);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_NotEqual(String constraintNameAutoUnique) {
        doSetConstraintNameAutoUnique_NotEqual(fRES(constraintNameAutoUnique));
    }

    protected void doSetConstraintNameAutoUnique_NotEqual(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_NES, constraintNameAutoUnique);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUniqueList The collection of constraintNameAutoUnique as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_InScope(Collection<String> constraintNameAutoUniqueList) {
        doSetConstraintNameAutoUnique_InScope(constraintNameAutoUniqueList);
    }

    public void doSetConstraintNameAutoUnique_InScope(Collection<String> constraintNameAutoUniqueList) {
        regINS(CK_INS, cTL(constraintNameAutoUniqueList), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUniqueList The collection of constraintNameAutoUnique as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_NotInScope(Collection<String> constraintNameAutoUniqueList) {
        doSetConstraintNameAutoUnique_NotInScope(constraintNameAutoUniqueList);
    }

    public void doSetConstraintNameAutoUnique_NotInScope(Collection<String> constraintNameAutoUniqueList) {
        regINS(CK_NINS, cTL(constraintNameAutoUniqueList), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_PrefixSearch(String constraintNameAutoUnique) {
        setConstraintNameAutoUnique_LikeSearch(constraintNameAutoUnique, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setConstraintNameAutoUnique_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_LikeSearch(String constraintNameAutoUnique, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraintNameAutoUnique), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_NotLikeSearch(String constraintNameAutoUnique, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraintNameAutoUnique), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE", likeSearchOption);
    }

    protected void regConstraintNameAutoUnique(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE"); }
    protected abstract ConditionValue getCValueConstraintNameAutoUnique();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), VendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), VendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), VendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), VendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), VendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorConstraintNameAutoRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), VendorConstraintNameAutoRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorConstraintNameAutoRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorConstraintNameAutoRefCQ sq);

    protected VendorConstraintNameAutoRefCB xcreateScalarConditionCB() {
        VendorConstraintNameAutoRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorConstraintNameAutoRefCB xcreateScalarConditionPartitionByCB() {
        VendorConstraintNameAutoRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorConstraintNameAutoRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "CONSTRAINT_NAME_AUTO_REF_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorConstraintNameAutoRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorConstraintNameAutoRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorConstraintNameAutoRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CONSTRAINT_NAME_AUTO_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorConstraintNameAutoRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorConstraintNameAutoRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorConstraintNameAutoRefCQ sq);

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
    protected VendorConstraintNameAutoRefCB newMyCB() {
        return new VendorConstraintNameAutoRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorConstraintNameAutoRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
