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
 * The base condition-query of white_variant_relation_local_pk_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationLocalPkReferrerCQ extends AbstractBsWhiteVariantRelationLocalPkReferrerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationLocalPkReferrerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationLocalPkReferrerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_local_pk_referrer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationLocalPkReferrerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationLocalPkReferrerCIQ xcreateCIQ() {
        WhiteVariantRelationLocalPkReferrerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationLocalPkReferrerCIQ xnewCIQ() {
        return new WhiteVariantRelationLocalPkReferrerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_local_pk_referrer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationLocalPkReferrerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationLocalPkReferrerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _reversefkSuppressedId;
    public ConditionValue getReversefkSuppressedId()
    { if (_reversefkSuppressedId == null) { _reversefkSuppressedId = nCV(); }
      return _reversefkSuppressedId; }
    protected ConditionValue getCValueReversefkSuppressedId() { return getReversefkSuppressedId(); }

    /** 
     * Add order-by as ascend. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationLocalPkReferrerCQ addOrderBy_ReversefkSuppressedId_Asc() { regOBA("REVERSEFK_SUPPRESSED_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationLocalPkReferrerCQ addOrderBy_ReversefkSuppressedId_Desc() { regOBD("REVERSEFK_SUPPRESSED_ID"); return this; }

    protected ConditionValue _masterTypeCode;
    public ConditionValue getMasterTypeCode()
    { if (_masterTypeCode == null) { _masterTypeCode = nCV(); }
      return _masterTypeCode; }
    protected ConditionValue getCValueMasterTypeCode() { return getMasterTypeCode(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationLocalPkReferrerCQ addOrderBy_MasterTypeCode_Asc() { regOBA("MASTER_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationLocalPkReferrerCQ addOrderBy_MasterTypeCode_Desc() { regOBD("MASTER_TYPE_CODE"); return this; }

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
    public BsWhiteVariantRelationLocalPkReferrerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationLocalPkReferrerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteVariantRelationLocalPkReferrerCQ bq = (WhiteVariantRelationLocalPkReferrerCQ)bqs;
        WhiteVariantRelationLocalPkReferrerCQ uq = (WhiteVariantRelationLocalPkReferrerCQ)uqs;
        if (bq.hasConditionQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne()) {
            uq.queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne().reflectRelationOnUnionQuery(bq.queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(), uq.queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteVariantRelationMasterFooCQ queryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        return getConditionQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne();
    }
    public WhiteVariantRelationMasterFooCQ getConditionQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        String prop = "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne()); xsetupOuterJoinWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteVariantRelationMasterFooCQ xcreateQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        String nrp = xresolveNRP("white_variant_relation_local_pk_referrer", "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteVariantRelationMasterFooCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne", nrp);
    }
    protected void xsetupOuterJoinWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() { xregOutJo("whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); }
    public boolean hasConditionQueryWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() { return xhasQueRlMap("whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationLocalPkReferrerCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationLocalPkReferrerCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationLocalPkReferrerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationLocalPkReferrerCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationLocalPkReferrerCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
