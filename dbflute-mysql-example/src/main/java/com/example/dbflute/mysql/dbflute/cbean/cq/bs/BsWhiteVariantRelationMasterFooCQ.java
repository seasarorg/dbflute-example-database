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
 * The base condition-query of white_variant_relation_master_foo.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationMasterFooCQ extends AbstractBsWhiteVariantRelationMasterFooCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterFooCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationMasterFooCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_master_foo) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationMasterFooCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationMasterFooCIQ xcreateCIQ() {
        WhiteVariantRelationMasterFooCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationMasterFooCIQ xnewCIQ() {
        return new WhiteVariantRelationMasterFooCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_master_foo on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationMasterFooCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationMasterFooCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _masterFooId;
    public ConditionValue getMasterFooId()
    { if (_masterFooId == null) { _masterFooId = nCV(); }
      return _masterFooId; }
    protected ConditionValue getCValueMasterFooId() { return getMasterFooId(); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getMasterFooId_ExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne() { return xgetSQueMap("masterFooId_ExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne"); }
    public String keepMasterFooId_ExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("masterFooId_ExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getMasterFooId_NotExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne() { return xgetSQueMap("masterFooId_NotExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne"); }
    public String keepMasterFooId_NotExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("masterFooId_NotExistsReferrer_WhiteVariantRelationLocalPkReferrerAsOne", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterFooId_InScopeRelation_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getMasterFooId_InScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne() { return xgetSQueMap("masterFooId_InScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne"); }
    public String keepMasterFooId_InScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("masterFooId_InScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterFooId_NotInScopeRelation_WhiteVariantRelationReferrerAsVariantList", sq); }

    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getMasterFooId_NotInScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne() { return xgetSQueMap("masterFooId_NotInScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne"); }
    public String keepMasterFooId_NotInScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("masterFooId_NotInScopeRelation_WhiteVariantRelationLocalPkReferrerAsOne", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList() { return xgetSQueMap("masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList", sq); }
    public Map<String, Object> getMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter() { return xgetSQuePmMap("masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList"); }
    public String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object pm) { return xkeepSQuePm("masterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooId_Asc() { regOBA("MASTER_FOO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooId_Desc() { regOBD("MASTER_FOO_ID"); return this; }

    protected ConditionValue _masterFooName;
    public ConditionValue getMasterFooName()
    { if (_masterFooName == null) { _masterFooName = nCV(); }
      return _masterFooName; }
    protected ConditionValue getCValueMasterFooName() { return getMasterFooName(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooName_Asc() { regOBA("MASTER_FOO_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterFooCQ addOrderBy_MasterFooName_Desc() { regOBD("MASTER_FOO_NAME"); return this; }

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
    public BsWhiteVariantRelationMasterFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationMasterFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteVariantRelationMasterFooCQ bq = (WhiteVariantRelationMasterFooCQ)bqs;
        WhiteVariantRelationMasterFooCQ uq = (WhiteVariantRelationMasterFooCQ)uqs;
        if (bq.hasConditionQueryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne()) {
            uq.queryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(), uq.queryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne());
        }
        if (bq.hasConditionQueryWhiteVariantRelationLocalPkReferrerAsOne()) {
            uq.queryWhiteVariantRelationLocalPkReferrerAsOne().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationLocalPkReferrerAsOne(), uq.queryWhiteVariantRelationLocalPkReferrerAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_referrer by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationReferrerCQ queryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        return getConditionQueryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne();
    }
    public WhiteVariantRelationReferrerCQ getConditionQueryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        String prop = "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne()); xsetupOuterJoinWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationReferrerCQ xcreateQueryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        String nrp = xresolveNRP("white_variant_relation_master_foo", "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationReferrerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() { xregOutJo("whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); }
    public boolean hasConditionQueryWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() { return xhasQueRlMap("whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationLocalPkReferrerCQ queryWhiteVariantRelationLocalPkReferrerAsOne() { return getConditionQueryWhiteVariantRelationLocalPkReferrerAsOne(); }
    public WhiteVariantRelationLocalPkReferrerCQ getConditionQueryWhiteVariantRelationLocalPkReferrerAsOne() {
        String prop = "whiteVariantRelationLocalPkReferrerAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationLocalPkReferrerAsOne()); xsetupOuterJoinWhiteVariantRelationLocalPkReferrerAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationLocalPkReferrerCQ xcreateQueryWhiteVariantRelationLocalPkReferrerAsOne() {
        String nrp = xresolveNRP("white_variant_relation_master_foo", "whiteVariantRelationLocalPkReferrerAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationLocalPkReferrerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationLocalPkReferrerAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationLocalPkReferrerAsOne() { xregOutJo("whiteVariantRelationLocalPkReferrerAsOne"); }
    public boolean hasConditionQueryWhiteVariantRelationLocalPkReferrerAsOne() { return xhasQueRlMap("whiteVariantRelationLocalPkReferrerAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteVariantRelationMasterFooCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationMasterFooCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterFooCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationMasterFooCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationMasterFooCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationMasterFooCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationMasterFooCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationMasterFooCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationMasterFooCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterFooCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationMasterFooCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationMasterFooCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationMasterFooCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
