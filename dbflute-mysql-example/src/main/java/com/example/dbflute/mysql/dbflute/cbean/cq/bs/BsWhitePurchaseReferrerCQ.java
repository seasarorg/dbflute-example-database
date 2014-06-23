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
 * The base condition-query of white_purchase_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePurchaseReferrerCQ extends AbstractBsWhitePurchaseReferrerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePurchaseReferrerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePurchaseReferrerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_purchase_referrer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePurchaseReferrerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePurchaseReferrerCIQ xcreateCIQ() {
        WhitePurchaseReferrerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePurchaseReferrerCIQ xnewCIQ() {
        return new WhitePurchaseReferrerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_purchase_referrer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePurchaseReferrerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePurchaseReferrerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseReferrerId;
    public ConditionValue getPurchaseReferrerId()
    { if (_purchaseReferrerId == null) { _purchaseReferrerId = nCV(); }
      return _purchaseReferrerId; }
    protected ConditionValue getCValuePurchaseReferrerId() { return getPurchaseReferrerId(); }

    public Map<String, PurchaseCQ> getPurchaseReferrerId_InScopeRelation_Purchase() { return xgetSQueMap("purchaseReferrerId_InScopeRelation_Purchase"); }
    public String keepPurchaseReferrerId_InScopeRelation_Purchase(PurchaseCQ sq) { return xkeepSQue("purchaseReferrerId_InScopeRelation_Purchase", sq); }

    public Map<String, PurchaseCQ> getPurchaseReferrerId_NotInScopeRelation_Purchase() { return xgetSQueMap("purchaseReferrerId_NotInScopeRelation_Purchase"); }
    public String keepPurchaseReferrerId_NotInScopeRelation_Purchase(PurchaseCQ sq) { return xkeepSQue("purchaseReferrerId_NotInScopeRelation_Purchase", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerId_Asc() { regOBA("PURCHASE_REFERRER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerId_Desc() { regOBD("PURCHASE_REFERRER_ID"); return this; }

    protected ConditionValue _purchaseReferrerName;
    public ConditionValue getPurchaseReferrerName()
    { if (_purchaseReferrerName == null) { _purchaseReferrerName = nCV(); }
      return _purchaseReferrerName; }
    protected ConditionValue getCValuePurchaseReferrerName() { return getPurchaseReferrerName(); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerName_Asc() { regOBA("PURCHASE_REFERRER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerName_Desc() { regOBD("PURCHASE_REFERRER_NAME"); return this; }

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
    public BsWhitePurchaseReferrerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePurchaseReferrerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhitePurchaseReferrerCQ bq = (WhitePurchaseReferrerCQ)bqs;
        WhitePurchaseReferrerCQ uq = (WhitePurchaseReferrerCQ)uqs;
        if (bq.hasConditionQueryPurchase()) {
            uq.queryPurchase().reflectRelationOnUnionQuery(bq.queryPurchase(), uq.queryPurchase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchase() {
        return getConditionQueryPurchase();
    }
    public PurchaseCQ getConditionQueryPurchase() {
        String prop = "purchase";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchase()); xsetupOuterJoinPurchase(); }
        return xgetQueRlMap(prop);
    }
    protected PurchaseCQ xcreateQueryPurchase() {
        String nrp = xresolveNRP("white_purchase_referrer", "purchase"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchase", nrp);
    }
    protected void xsetupOuterJoinPurchase() { xregOutJo("purchase"); }
    public boolean hasConditionQueryPurchase() { return xhasQueRlMap("purchase"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhitePurchaseReferrerCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePurchaseReferrerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePurchaseReferrerCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePurchaseReferrerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePurchaseReferrerCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePurchaseReferrerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePurchaseReferrerCQ> _myselfExistsMap;
    public Map<String, WhitePurchaseReferrerCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePurchaseReferrerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePurchaseReferrerCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePurchaseReferrerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePurchaseReferrerCB.class.getName(); }
    protected String xCQ() { return WhitePurchaseReferrerCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
