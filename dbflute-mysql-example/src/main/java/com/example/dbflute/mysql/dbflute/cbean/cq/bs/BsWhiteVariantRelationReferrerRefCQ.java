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
 * The base condition-query of white_variant_relation_referrer_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationReferrerRefCQ extends AbstractBsWhiteVariantRelationReferrerRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationReferrerRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationReferrerRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_referrer_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationReferrerRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationReferrerRefCIQ xcreateCIQ() {
        WhiteVariantRelationReferrerRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationReferrerRefCIQ xnewCIQ() {
        return new WhiteVariantRelationReferrerRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_referrer_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationReferrerRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationReferrerRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _refId;
    public ConditionValue getRefId()
    { if (_refId == null) { _refId = nCV(); }
      return _refId; }
    protected ConditionValue getCValueRefId() { return getRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerRefCQ addOrderBy_RefId_Asc() { regOBA("REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerRefCQ addOrderBy_RefId_Desc() { regOBD("REF_ID"); return this; }

    protected ConditionValue _referrerId;
    public ConditionValue getReferrerId()
    { if (_referrerId == null) { _referrerId = nCV(); }
      return _referrerId; }
    protected ConditionValue getCValueReferrerId() { return getReferrerId(); }

    public Map<String, WhiteVariantRelationReferrerCQ> getReferrerId_InScopeRelation_WhiteVariantRelationReferrer() { return xgetSQueMap("referrerId_InScopeRelation_WhiteVariantRelationReferrer"); }
    public String keepReferrerId_InScopeRelation_WhiteVariantRelationReferrer(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("referrerId_InScopeRelation_WhiteVariantRelationReferrer", sq); }

    public Map<String, WhiteVariantRelationReferrerCQ> getReferrerId_NotInScopeRelation_WhiteVariantRelationReferrer() { return xgetSQueMap("referrerId_NotInScopeRelation_WhiteVariantRelationReferrer"); }
    public String keepReferrerId_NotInScopeRelation_WhiteVariantRelationReferrer(WhiteVariantRelationReferrerCQ sq) { return xkeepSQue("referrerId_NotInScopeRelation_WhiteVariantRelationReferrer", sq); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerRefCQ addOrderBy_ReferrerId_Asc() { regOBA("REFERRER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationReferrerRefCQ addOrderBy_ReferrerId_Desc() { regOBD("REFERRER_ID"); return this; }

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
    public BsWhiteVariantRelationReferrerRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationReferrerRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteVariantRelationReferrerRefCQ bq = (WhiteVariantRelationReferrerRefCQ)bqs;
        WhiteVariantRelationReferrerRefCQ uq = (WhiteVariantRelationReferrerRefCQ)uqs;
        if (bq.hasConditionQueryWhiteVariantRelationReferrer()) {
            uq.queryWhiteVariantRelationReferrer().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationReferrer(), uq.queryWhiteVariantRelationReferrer());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationReferrerCQ queryWhiteVariantRelationReferrer() {
        return getConditionQueryWhiteVariantRelationReferrer();
    }
    public WhiteVariantRelationReferrerCQ getConditionQueryWhiteVariantRelationReferrer() {
        String prop = "whiteVariantRelationReferrer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationReferrer()); xsetupOuterJoinWhiteVariantRelationReferrer(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationReferrerCQ xcreateQueryWhiteVariantRelationReferrer() {
        String nrp = xresolveNRP("white_variant_relation_referrer_ref", "whiteVariantRelationReferrer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationReferrerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationReferrer", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationReferrer() { xregOutJo("whiteVariantRelationReferrer"); }
    public boolean hasConditionQueryWhiteVariantRelationReferrer() { return xhasQueRlMap("whiteVariantRelationReferrer"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteVariantRelationReferrerRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationReferrerRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationReferrerRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationReferrerRefCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationReferrerRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationReferrerRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationReferrerRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationReferrerRefCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationReferrerRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
