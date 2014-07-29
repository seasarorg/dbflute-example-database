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
 * The base condition-query of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationReferrerCQ extends AbstractBsWhiteVariantRelationReferrerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationReferrerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationReferrerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_referrer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationReferrerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationReferrerCIQ xcreateCIQ() {
        WhiteVariantRelationReferrerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationReferrerCIQ xnewCIQ() {
        return new WhiteVariantRelationReferrerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_referrer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationReferrerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationReferrerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _referrerId;
    public ConditionValue getReferrerId()
    { if (_referrerId == null) { _referrerId = nCV(); }
      return _referrerId; }
    protected ConditionValue getCValueReferrerId() { return getReferrerId(); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getReferrerId_ExistsReferrer_WhiteVariantRelationReferrerRefList() { return xgetSQueMap("referrerId_ExistsReferrer_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_ExistsReferrer_WhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("referrerId_ExistsReferrer_WhiteVariantRelationReferrerRefList", sq); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getReferrerId_NotExistsReferrer_WhiteVariantRelationReferrerRefList() { return xgetSQueMap("referrerId_NotExistsReferrer_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_NotExistsReferrer_WhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("referrerId_NotExistsReferrer_WhiteVariantRelationReferrerRefList", sq); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getReferrerId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerRefList() { return xgetSQueMap("referrerId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("referrerId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerRefList", sq); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getReferrerId_InScopeRelation_WhiteVariantRelationReferrerRefList() { return xgetSQueMap("referrerId_InScopeRelation_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_InScopeRelation_WhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("referrerId_InScopeRelation_WhiteVariantRelationReferrerRefList", sq); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getReferrerId_NotInScopeRelation_WhiteVariantRelationReferrerRefList() { return xgetSQueMap("referrerId_NotInScopeRelation_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_NotInScopeRelation_WhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("referrerId_NotInScopeRelation_WhiteVariantRelationReferrerRefList", sq); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getReferrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefList() { return xgetSQueMap("referrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("referrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefList", sq); }
    public Map<String, Object> getReferrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefListParameter() { return xgetSQuePmMap("referrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefList"); }
    public String keepReferrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefListParameter(Object pm) { return xkeepSQuePm("referrerId_QueryDerivedReferrer_WhiteVariantRelationReferrerRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_ReferrerId_Asc() { regOBA("REFERRER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_ReferrerId_Desc() { regOBD("REFERRER_ID"); return this; }

    protected ConditionValue _variantMasterId;
    public ConditionValue getVariantMasterId()
    { if (_variantMasterId == null) { _variantMasterId = nCV(); }
      return _variantMasterId; }
    protected ConditionValue getCValueVariantMasterId() { return getVariantMasterId(); }

    /** 
     * Add order-by as ascend. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_VariantMasterId_Asc() { regOBA("VARIANT_MASTER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_VariantMasterId_Desc() { regOBD("VARIANT_MASTER_ID"); return this; }

    protected ConditionValue _masterTypeCode;
    public ConditionValue getMasterTypeCode()
    { if (_masterTypeCode == null) { _masterTypeCode = nCV(); }
      return _masterTypeCode; }
    protected ConditionValue getCValueMasterTypeCode() { return getMasterTypeCode(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_MasterTypeCode_Asc() { regOBA("MASTER_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerCQ addOrderBy_MasterTypeCode_Desc() { regOBD("MASTER_TYPE_CODE"); return this; }

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
    public BsWhiteVariantRelationReferrerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationReferrerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteVariantRelationReferrerCQ bq = (WhiteVariantRelationReferrerCQ)bqs;
        WhiteVariantRelationReferrerCQ uq = (WhiteVariantRelationReferrerCQ)uqs;
        if (bq.hasConditionQueryWhiteVariantRelationMasterFooAsVariant()) {
            uq.queryWhiteVariantRelationMasterFooAsVariant().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterFooAsVariant(), uq.queryWhiteVariantRelationMasterFooAsVariant());
        }
        if (bq.hasConditionQueryWhiteVariantRelationMasterBarAsVariant()) {
            uq.queryWhiteVariantRelationMasterBarAsVariant().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterBarAsVariant(), uq.queryWhiteVariantRelationMasterBarAsVariant());
        }
        if (bq.hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue()) {
            uq.queryWhiteVariantRelationMasterQuxAsVariantByQue().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterQuxAsVariantByQue(), uq.queryWhiteVariantRelationMasterQuxAsVariantByQue());
        }
        if (bq.hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType()) {
            uq.xsetParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType(bq.getParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType());
            uq.getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType().reflectRelationOnUnionQuery(bq.getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(), uq.getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterFooCQ queryWhiteVariantRelationMasterFooAsVariant() {
        return getConditionQueryWhiteVariantRelationMasterFooAsVariant();
    }
    public WhiteVariantRelationMasterFooCQ getConditionQueryWhiteVariantRelationMasterFooAsVariant() {
        String prop = "whiteVariantRelationMasterFooAsVariant";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationMasterFooAsVariant()); xsetupOuterJoinWhiteVariantRelationMasterFooAsVariant(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationMasterFooCQ xcreateQueryWhiteVariantRelationMasterFooAsVariant() {
        String nrp = xresolveNRP("white_variant_relation_referrer", "whiteVariantRelationMasterFooAsVariant"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationMasterFooCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationMasterFooAsVariant", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterFooAsVariant() { xregOutJo("whiteVariantRelationMasterFooAsVariant"); }
    public boolean hasConditionQueryWhiteVariantRelationMasterFooAsVariant() { return xhasQueRlMap("whiteVariantRelationMasterFooAsVariant"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterBarCQ queryWhiteVariantRelationMasterBarAsVariant() {
        return getConditionQueryWhiteVariantRelationMasterBarAsVariant();
    }
    public WhiteVariantRelationMasterBarCQ getConditionQueryWhiteVariantRelationMasterBarAsVariant() {
        String prop = "whiteVariantRelationMasterBarAsVariant";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationMasterBarAsVariant()); xsetupOuterJoinWhiteVariantRelationMasterBarAsVariant(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationMasterBarCQ xcreateQueryWhiteVariantRelationMasterBarAsVariant() {
        String nrp = xresolveNRP("white_variant_relation_referrer", "whiteVariantRelationMasterBarAsVariant"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationMasterBarCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationMasterBarAsVariant", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterBarAsVariant() { xregOutJo("whiteVariantRelationMasterBarAsVariant"); }
    public boolean hasConditionQueryWhiteVariantRelationMasterBarAsVariant() { return xhasQueRlMap("whiteVariantRelationMasterBarAsVariant"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterQuxCQ queryWhiteVariantRelationMasterQuxAsVariantByQue() {
        return getConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue();
    }
    public WhiteVariantRelationMasterQuxCQ getConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue() {
        String prop = "whiteVariantRelationMasterQuxAsVariantByQue";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationMasterQuxAsVariantByQue()); xsetupOuterJoinWhiteVariantRelationMasterQuxAsVariantByQue(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationMasterQuxCQ xcreateQueryWhiteVariantRelationMasterQuxAsVariantByQue() {
        String nrp = xresolveNRP("white_variant_relation_referrer", "whiteVariantRelationMasterQuxAsVariantByQue"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationMasterQuxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationMasterQuxAsVariantByQue", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterQuxAsVariantByQue() { xregOutJo("whiteVariantRelationMasterQuxAsVariantByQue"); }
    public boolean hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue() { return xhasQueRlMap("whiteVariantRelationMasterQuxAsVariantByQue"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterCorgeCQ queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(com.example.dbflute.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
        Map<String, Object> parameterMap = getParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType();
        parameterMap.put("quxType", quxType);
        xassertFCDP("whiteVariantRelationMasterCorgeAsVariantByQuxType", parameterMap);
        return getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType();
    }
    public WhiteVariantRelationMasterCorgeCQ getConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        String prop = "whiteVariantRelationMasterCorgeAsVariantByQuxType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType()); xsetupOuterJoinWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType;
    public Map<String, Object> getParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType()
    { if (_parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType == null) { _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType = newLinkedHashMapSized(4); }
      return _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType; }
    public void xsetParameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType(Map<String, Object> parameterMap)
    { _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType = parameterMap; } // for UnionQuery
    protected WhiteVariantRelationMasterCorgeCQ xcreateQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        String nrp = xresolveNRP("white_variant_relation_referrer", "whiteVariantRelationMasterCorgeAsVariantByQuxType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationMasterCorgeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationMasterCorgeAsVariantByQuxType", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterCorgeAsVariantByQuxType() { xregOutJo("whiteVariantRelationMasterCorgeAsVariantByQuxType"); }
    public boolean hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType() { return xhasQueRlMap("whiteVariantRelationMasterCorgeAsVariantByQuxType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("whiteVariantRelationMasterCorgeAsVariantByQuxType".equalsIgnoreCase(property)) { return _parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteVariantRelationReferrerCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationReferrerCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationReferrerCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationReferrerCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationReferrerCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationReferrerCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationReferrerCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
