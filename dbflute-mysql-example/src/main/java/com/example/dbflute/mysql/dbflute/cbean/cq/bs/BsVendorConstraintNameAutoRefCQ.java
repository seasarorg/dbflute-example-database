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

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of vendor_constraint_name_auto_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorConstraintNameAutoRefCQ extends AbstractBsVendorConstraintNameAutoRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorConstraintNameAutoRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_constraint_name_auto_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorConstraintNameAutoRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorConstraintNameAutoRefCIQ xcreateCIQ() {
        VendorConstraintNameAutoRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorConstraintNameAutoRefCIQ xnewCIQ() {
        return new VendorConstraintNameAutoRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_constraint_name_auto_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorConstraintNameAutoRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorConstraintNameAutoRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _constraintNameAutoRefId;
    public ConditionValue getConstraintNameAutoRefId()
    { if (_constraintNameAutoRefId == null) { _constraintNameAutoRefId = nCV(); }
      return _constraintNameAutoRefId; }
    protected ConditionValue getCValueConstraintNameAutoRefId() { return getConstraintNameAutoRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoRefId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoRefId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_REF_ID"); return this; }

    protected ConditionValue _constraintNameAutoFooId;
    public ConditionValue getConstraintNameAutoFooId()
    { if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
      return _constraintNameAutoFooId; }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    public Map<String, VendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo() { return xgetSQueMap("constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo"); }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq) { return xkeepSQue("constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo", sq); }

    public Map<String, VendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo() { return xgetSQueMap("constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo"); }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq) { return xkeepSQue("constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo", sq); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoFooId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoFooId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    protected ConditionValue _constraintNameAutoBarId;
    public ConditionValue getConstraintNameAutoBarId()
    { if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
      return _constraintNameAutoBarId; }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    public Map<String, VendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar() { return xgetSQueMap("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar"); }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar", sq); }

    public Map<String, VendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar() { return xgetSQueMap("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar"); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar", sq); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoBarId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoBarId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    protected ConditionValue _constraintNameAutoQuxId;
    public ConditionValue getConstraintNameAutoQuxId()
    { if (_constraintNameAutoQuxId == null) { _constraintNameAutoQuxId = nCV(); }
      return _constraintNameAutoQuxId; }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return getConstraintNameAutoQuxId(); }

    public Map<String, VendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux() { return xgetSQueMap("constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux"); }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq) { return xkeepSQue("constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux", sq); }

    public Map<String, VendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux() { return xgetSQueMap("constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux"); }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq) { return xkeepSQue("constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux", sq); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoQuxId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoQuxId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    protected ConditionValue _constraintNameAutoCorgeId;
    public ConditionValue getConstraintNameAutoCorgeId()
    { if (_constraintNameAutoCorgeId == null) { _constraintNameAutoCorgeId = nCV(); }
      return _constraintNameAutoCorgeId; }
    protected ConditionValue getCValueConstraintNameAutoCorgeId() { return getConstraintNameAutoCorgeId(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoCorgeId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_CORGE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoCorgeId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_CORGE_ID"); return this; }

    protected ConditionValue _constraintNameAutoUnique;
    public ConditionValue getConstraintNameAutoUnique()
    { if (_constraintNameAutoUnique == null) { _constraintNameAutoUnique = nCV(); }
      return _constraintNameAutoUnique; }
    protected ConditionValue getCValueConstraintNameAutoUnique() { return getConstraintNameAutoUnique(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoUnique_Asc() { regOBA("CONSTRAINT_NAME_AUTO_UNIQUE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoUnique_Desc() { regOBD("CONSTRAINT_NAME_AUTO_UNIQUE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorConstraintNameAutoRefCQ bq = (VendorConstraintNameAutoRefCQ)bqs;
        VendorConstraintNameAutoRefCQ uq = (VendorConstraintNameAutoRefCQ)uqs;
        if (bq.hasConditionQueryVendorConstraintNameAutoFoo()) {
            uq.queryVendorConstraintNameAutoFoo().reflectRelationOnUnionQuery(bq.queryVendorConstraintNameAutoFoo(), uq.queryVendorConstraintNameAutoFoo());
        }
        if (bq.hasConditionQueryVendorConstraintNameAutoBar()) {
            uq.queryVendorConstraintNameAutoBar().reflectRelationOnUnionQuery(bq.queryVendorConstraintNameAutoBar(), uq.queryVendorConstraintNameAutoBar());
        }
        if (bq.hasConditionQueryVendorConstraintNameAutoQux()) {
            uq.queryVendorConstraintNameAutoQux().reflectRelationOnUnionQuery(bq.queryVendorConstraintNameAutoQux(), uq.queryVendorConstraintNameAutoQux());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorConstraintNameAutoFooCQ queryVendorConstraintNameAutoFoo() {
        return getConditionQueryVendorConstraintNameAutoFoo();
    }
    public VendorConstraintNameAutoFooCQ getConditionQueryVendorConstraintNameAutoFoo() {
        String prop = "vendorConstraintNameAutoFoo";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorConstraintNameAutoFoo()); xsetupOuterJoinVendorConstraintNameAutoFoo(); }
        return xgetQueRlMap(prop);
    }
    protected VendorConstraintNameAutoFooCQ xcreateQueryVendorConstraintNameAutoFoo() {
        String nrp = xresolveNRP("vendor_constraint_name_auto_ref", "vendorConstraintNameAutoFoo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorConstraintNameAutoFooCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorConstraintNameAutoFoo", nrp);
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoFoo() { xregOutJo("vendorConstraintNameAutoFoo"); }
    public boolean hasConditionQueryVendorConstraintNameAutoFoo() { return xhasQueRlMap("vendorConstraintNameAutoFoo"); }

    /**
     * Get the condition-query for relation table. <br />
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorConstraintNameAutoBarCQ queryVendorConstraintNameAutoBar() {
        return getConditionQueryVendorConstraintNameAutoBar();
    }
    public VendorConstraintNameAutoBarCQ getConditionQueryVendorConstraintNameAutoBar() {
        String prop = "vendorConstraintNameAutoBar";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorConstraintNameAutoBar()); xsetupOuterJoinVendorConstraintNameAutoBar(); }
        return xgetQueRlMap(prop);
    }
    protected VendorConstraintNameAutoBarCQ xcreateQueryVendorConstraintNameAutoBar() {
        String nrp = xresolveNRP("vendor_constraint_name_auto_ref", "vendorConstraintNameAutoBar"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorConstraintNameAutoBarCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorConstraintNameAutoBar", nrp);
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoBar() { xregOutJo("vendorConstraintNameAutoBar"); }
    public boolean hasConditionQueryVendorConstraintNameAutoBar() { return xhasQueRlMap("vendorConstraintNameAutoBar"); }

    /**
     * Get the condition-query for relation table. <br />
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorConstraintNameAutoQuxCQ queryVendorConstraintNameAutoQux() {
        return getConditionQueryVendorConstraintNameAutoQux();
    }
    public VendorConstraintNameAutoQuxCQ getConditionQueryVendorConstraintNameAutoQux() {
        String prop = "vendorConstraintNameAutoQux";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorConstraintNameAutoQux()); xsetupOuterJoinVendorConstraintNameAutoQux(); }
        return xgetQueRlMap(prop);
    }
    protected VendorConstraintNameAutoQuxCQ xcreateQueryVendorConstraintNameAutoQux() {
        String nrp = xresolveNRP("vendor_constraint_name_auto_ref", "vendorConstraintNameAutoQux"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorConstraintNameAutoQuxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorConstraintNameAutoQux", nrp);
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoQux() { xregOutJo("vendorConstraintNameAutoQux"); }
    public boolean hasConditionQueryVendorConstraintNameAutoQux() { return xhasQueRlMap("vendorConstraintNameAutoQux"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorConstraintNameAutoRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorConstraintNameAutoRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorConstraintNameAutoRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorConstraintNameAutoRefCQ> _myselfExistsMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorConstraintNameAutoRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorConstraintNameAutoRefCB.class.getName(); }
    protected String xCQ() { return VendorConstraintNameAutoRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
