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
    public ConditionValue getConstraintNameAutoRefId() {
        if (_constraintNameAutoRefId == null) { _constraintNameAutoRefId = nCV(); }
        return _constraintNameAutoRefId;
    }
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
    public ConditionValue getConstraintNameAutoFooId() {
        if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
        return _constraintNameAutoFooId;
    }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    protected Map<String, VendorConstraintNameAutoFooCQ> _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo() { return _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap; }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq) {
        if (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap == null) { _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap.size() + 1);
        _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap.put(ky, sq); return "constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo." + ky;
    }

    protected Map<String, VendorConstraintNameAutoFooCQ> _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap;
    public Map<String, VendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo() { return _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap; }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq) {
        if (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap == null) { _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap.size() + 1);
        _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap.put(ky, sq); return "constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo." + ky;
    }

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
    public ConditionValue getConstraintNameAutoBarId() {
        if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
        return _constraintNameAutoBarId;
    }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    protected Map<String, VendorConstraintNameAutoBarCQ> _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar() { return _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap; }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq) {
        if (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap == null) { _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap.size() + 1);
        _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap.put(ky, sq); return "constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar." + ky;
    }

    protected Map<String, VendorConstraintNameAutoBarCQ> _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar() { return _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap; }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq) {
        if (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap == null) { _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap.size() + 1);
        _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap.put(ky, sq); return "constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar." + ky;
    }

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
    public ConditionValue getConstraintNameAutoQuxId() {
        if (_constraintNameAutoQuxId == null) { _constraintNameAutoQuxId = nCV(); }
        return _constraintNameAutoQuxId;
    }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return getConstraintNameAutoQuxId(); }

    protected Map<String, VendorConstraintNameAutoQuxCQ> _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux() { return _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap; }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq) {
        if (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap == null) { _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap.size() + 1);
        _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap.put(ky, sq); return "constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux." + ky;
    }

    protected Map<String, VendorConstraintNameAutoQuxCQ> _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap;
    public Map<String, VendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux() { return _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap; }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq) {
        if (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap == null) { _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap.size() + 1);
        _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap.put(ky, sq); return "constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux." + ky;
    }

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
    public ConditionValue getConstraintNameAutoCorgeId() {
        if (_constraintNameAutoCorgeId == null) { _constraintNameAutoCorgeId = nCV(); }
        return _constraintNameAutoCorgeId;
    }
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
    public ConditionValue getConstraintNameAutoUnique() {
        if (_constraintNameAutoUnique == null) { _constraintNameAutoUnique = nCV(); }
        return _constraintNameAutoUnique;
    }
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
    public BsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected VendorConstraintNameAutoFooCQ _conditionQueryVendorConstraintNameAutoFoo;
    public VendorConstraintNameAutoFooCQ getConditionQueryVendorConstraintNameAutoFoo() {
        if (_conditionQueryVendorConstraintNameAutoFoo == null) {
            _conditionQueryVendorConstraintNameAutoFoo = xcreateQueryVendorConstraintNameAutoFoo();
            xsetupOuterJoinVendorConstraintNameAutoFoo();
        }
        return _conditionQueryVendorConstraintNameAutoFoo;
    }
    protected VendorConstraintNameAutoFooCQ xcreateQueryVendorConstraintNameAutoFoo() {
        String nrp = resolveNextRelationPath("vendor_constraint_name_auto_ref", "vendorConstraintNameAutoFoo");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorConstraintNameAutoFooCQ cq = new VendorConstraintNameAutoFooCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorConstraintNameAutoFoo");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoFoo() {
        VendorConstraintNameAutoFooCQ cq = getConditionQueryVendorConstraintNameAutoFoo();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID");
        registerOuterJoin(cq, joinOnMap, "vendorConstraintNameAutoFoo");
    }
    public boolean hasConditionQueryVendorConstraintNameAutoFoo() {
        return _conditionQueryVendorConstraintNameAutoFoo != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorConstraintNameAutoBarCQ queryVendorConstraintNameAutoBar() {
        return getConditionQueryVendorConstraintNameAutoBar();
    }
    protected VendorConstraintNameAutoBarCQ _conditionQueryVendorConstraintNameAutoBar;
    public VendorConstraintNameAutoBarCQ getConditionQueryVendorConstraintNameAutoBar() {
        if (_conditionQueryVendorConstraintNameAutoBar == null) {
            _conditionQueryVendorConstraintNameAutoBar = xcreateQueryVendorConstraintNameAutoBar();
            xsetupOuterJoinVendorConstraintNameAutoBar();
        }
        return _conditionQueryVendorConstraintNameAutoBar;
    }
    protected VendorConstraintNameAutoBarCQ xcreateQueryVendorConstraintNameAutoBar() {
        String nrp = resolveNextRelationPath("vendor_constraint_name_auto_ref", "vendorConstraintNameAutoBar");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorConstraintNameAutoBarCQ cq = new VendorConstraintNameAutoBarCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorConstraintNameAutoBar");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoBar() {
        VendorConstraintNameAutoBarCQ cq = getConditionQueryVendorConstraintNameAutoBar();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID");
        registerOuterJoin(cq, joinOnMap, "vendorConstraintNameAutoBar");
    }
    public boolean hasConditionQueryVendorConstraintNameAutoBar() {
        return _conditionQueryVendorConstraintNameAutoBar != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorConstraintNameAutoQuxCQ queryVendorConstraintNameAutoQux() {
        return getConditionQueryVendorConstraintNameAutoQux();
    }
    protected VendorConstraintNameAutoQuxCQ _conditionQueryVendorConstraintNameAutoQux;
    public VendorConstraintNameAutoQuxCQ getConditionQueryVendorConstraintNameAutoQux() {
        if (_conditionQueryVendorConstraintNameAutoQux == null) {
            _conditionQueryVendorConstraintNameAutoQux = xcreateQueryVendorConstraintNameAutoQux();
            xsetupOuterJoinVendorConstraintNameAutoQux();
        }
        return _conditionQueryVendorConstraintNameAutoQux;
    }
    protected VendorConstraintNameAutoQuxCQ xcreateQueryVendorConstraintNameAutoQux() {
        String nrp = resolveNextRelationPath("vendor_constraint_name_auto_ref", "vendorConstraintNameAutoQux");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorConstraintNameAutoQuxCQ cq = new VendorConstraintNameAutoQuxCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorConstraintNameAutoQux");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoQux() {
        VendorConstraintNameAutoQuxCQ cq = getConditionQueryVendorConstraintNameAutoQux();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID");
        registerOuterJoin(cq, joinOnMap, "vendorConstraintNameAutoQux");
    }
    public boolean hasConditionQueryVendorConstraintNameAutoQux() {
        return _conditionQueryVendorConstraintNameAutoQux != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, VendorConstraintNameAutoRefCQ> _scalarConditionMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorConstraintNameAutoRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoRefCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoRefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorConstraintNameAutoRefCQ> _queryMyselfDerivedMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorConstraintNameAutoRefCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorConstraintNameAutoRefCQ> _myselfExistsMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorConstraintNameAutoRefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorConstraintNameAutoRefCQ> _myselfInScopeMap;
    public Map<String, VendorConstraintNameAutoRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorConstraintNameAutoRefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

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
