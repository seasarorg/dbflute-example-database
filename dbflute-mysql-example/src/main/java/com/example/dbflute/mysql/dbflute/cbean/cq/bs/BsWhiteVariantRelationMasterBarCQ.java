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
 * The base condition-query of white_variant_relation_master_bar.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationMasterBarCQ extends AbstractBsWhiteVariantRelationMasterBarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterBarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationMasterBarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_master_bar) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationMasterBarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationMasterBarCIQ xcreateCIQ() {
        WhiteVariantRelationMasterBarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationMasterBarCIQ xnewCIQ() {
        return new WhiteVariantRelationMasterBarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_master_bar on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationMasterBarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationMasterBarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _masterBarId;
    public ConditionValue getMasterBarId()
    { if (_masterBarId == null) { _masterBarId = nCV(); }
      return _masterBarId; }
    protected ConditionValue getCValueMasterBarId() { return getMasterBarId(); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterBarId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterBarId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }
    public Map<String, Object> getMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter() { return xgetSQuePmMap("masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object pm) { return xkeepSQuePm("masterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarId_Asc() { regOBA("MASTER_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarId_Desc() { regOBD("MASTER_BAR_ID"); return this; }

    protected ConditionValue _masterBarName;
    public ConditionValue getMasterBarName()
    { if (_masterBarName == null) { _masterBarName = nCV(); }
      return _masterBarName; }
    protected ConditionValue getCValueMasterBarName() { return getMasterBarName(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarName_Asc() { regOBA("MASTER_BAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterBarCQ addOrderBy_MasterBarName_Desc() { regOBD("MASTER_BAR_NAME"); return this; }

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
    public BsWhiteVariantRelationMasterBarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationMasterBarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteVariantRelationMasterBarCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationMasterBarCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterBarCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationMasterBarCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationMasterBarCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationMasterBarCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationMasterBarCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationMasterBarCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationMasterBarCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterBarCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationMasterBarCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationMasterBarCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationMasterBarCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
