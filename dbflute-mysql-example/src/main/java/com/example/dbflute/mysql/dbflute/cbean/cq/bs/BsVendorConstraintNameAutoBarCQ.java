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
 * The base condition-query of vendor_constraint_name_auto_bar.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorConstraintNameAutoBarCQ extends AbstractBsVendorConstraintNameAutoBarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoBarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorConstraintNameAutoBarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_constraint_name_auto_bar) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorConstraintNameAutoBarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorConstraintNameAutoBarCIQ xcreateCIQ() {
        VendorConstraintNameAutoBarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorConstraintNameAutoBarCIQ xnewCIQ() {
        return new VendorConstraintNameAutoBarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_constraint_name_auto_bar on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorConstraintNameAutoBarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorConstraintNameAutoBarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _constraintNameAutoBarId;
    public ConditionValue getConstraintNameAutoBarId()
    { if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
      return _constraintNameAutoBarId; }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList", sq); }

    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList", sq); }

    public Map<String, VendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList", sq); }
    public Map<String, Object> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return xgetSQuePmMap("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object pm) { return xkeepSQuePm("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    protected ConditionValue _constraintNameAutoBarName;
    public ConditionValue getConstraintNameAutoBarName()
    { if (_constraintNameAutoBarName == null) { _constraintNameAutoBarName = nCV(); }
      return _constraintNameAutoBarName; }
    protected ConditionValue getCValueConstraintNameAutoBarName() { return getConstraintNameAutoBarName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_NAME"); return this; }

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
    public BsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorConstraintNameAutoBarCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorConstraintNameAutoBarCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorConstraintNameAutoBarCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorConstraintNameAutoBarCQ> _myselfExistsMap;
    public Map<String, VendorConstraintNameAutoBarCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorConstraintNameAutoBarCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorConstraintNameAutoBarCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorConstraintNameAutoBarCB.class.getName(); }
    protected String xCQ() { return VendorConstraintNameAutoBarCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
