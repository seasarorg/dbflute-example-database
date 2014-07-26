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
 * The base condition-query of white_stiletto_alias_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteStilettoAliasRefCQ extends AbstractBsWhiteStilettoAliasRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteStilettoAliasRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteStilettoAliasRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_stiletto_alias_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteStilettoAliasRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteStilettoAliasRefCIQ xcreateCIQ() {
        WhiteStilettoAliasRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteStilettoAliasRefCIQ xnewCIQ() {
        return new WhiteStilettoAliasRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_stiletto_alias_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteStilettoAliasRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteStilettoAliasRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * REF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_RefId_Asc() { regOBA("REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_RefId_Desc() { regOBD("REF_ID"); return this; }

    protected ConditionValue _foo0;
    public ConditionValue getFoo0()
    { if (_foo0 == null) { _foo0 = nCV(); }
      return _foo0; }
    protected ConditionValue getCValueFoo0() { return getFoo0(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo0_Asc() { regOBA("FOO0"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo0_Desc() { regOBD("FOO0"); return this; }

    protected ConditionValue _foo1;
    public ConditionValue getFoo1()
    { if (_foo1 == null) { _foo1 = nCV(); }
      return _foo1; }
    protected ConditionValue getCValueFoo1() { return getFoo1(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO_1: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo1_Asc() { regOBA("FOO_1"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO_1: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo1_Desc() { regOBD("FOO_1"); return this; }

    protected ConditionValue _foo2;
    public ConditionValue getFoo2()
    { if (_foo2 == null) { _foo2 = nCV(); }
      return _foo2; }
    protected ConditionValue getCValueFoo2() { return getFoo2(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO2: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo2_Asc() { regOBA("FOO2"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO2: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo2_Desc() { regOBD("FOO2"); return this; }

    protected ConditionValue _foo3;
    public ConditionValue getFoo3()
    { if (_foo3 == null) { _foo3 = nCV(); }
      return _foo3; }
    protected ConditionValue getCValueFoo3() { return getFoo3(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO3: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo3_Asc() { regOBA("FOO3"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO3: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo3_Desc() { regOBD("FOO3"); return this; }

    protected ConditionValue _foo4;
    public ConditionValue getFoo4()
    { if (_foo4 == null) { _foo4 = nCV(); }
      return _foo4; }
    protected ConditionValue getCValueFoo4() { return getFoo4(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO_4: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo4_Asc() { regOBA("FOO_4"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO_4: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Foo4_Desc() { regOBD("FOO_4"); return this; }

    protected ConditionValue _bar0;
    public ConditionValue getBar0()
    { if (_bar0 == null) { _bar0 = nCV(); }
      return _bar0; }
    protected ConditionValue getCValueBar0() { return getBar0(); }

    /** 
     * Add order-by as ascend. <br />
     * BAR_0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Bar0_Asc() { regOBA("BAR_0"); return this; }

    /**
     * Add order-by as descend. <br />
     * BAR_0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Bar0_Desc() { regOBD("BAR_0"); return this; }

    protected ConditionValue _qux0;
    public ConditionValue getQux0()
    { if (_qux0 == null) { _qux0 = nCV(); }
      return _qux0; }
    protected ConditionValue getCValueQux0() { return getQux0(); }

    /** 
     * Add order-by as ascend. <br />
     * QUX_0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Qux0_Asc() { regOBA("QUX_0"); return this; }

    /**
     * Add order-by as descend. <br />
     * QUX_0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_Qux0_Desc() { regOBD("QUX_0"); return this; }

    protected ConditionValue _c21;
    public ConditionValue getC21()
    { if (_c21 == null) { _c21 = nCV(); }
      return _c21; }
    protected ConditionValue getCValueC21() { return getC21(); }

    /** 
     * Add order-by as ascend. <br />
     * c21: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_C21_Asc() { regOBA("c21"); return this; }

    /**
     * Add order-by as descend. <br />
     * c21: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_C21_Desc() { regOBD("c21"); return this; }

    protected ConditionValue _c22;
    public ConditionValue getC22()
    { if (_c22 == null) { _c22 = nCV(); }
      return _c22; }
    protected ConditionValue getCValueC22() { return getC22(); }

    /** 
     * Add order-by as ascend. <br />
     * c22: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_C22_Asc() { regOBA("c22"); return this; }

    /**
     * Add order-by as descend. <br />
     * c22: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_C22_Desc() { regOBD("c22"); return this; }

    protected ConditionValue _c23;
    public ConditionValue getC23()
    { if (_c23 == null) { _c23 = nCV(); }
      return _c23; }
    protected ConditionValue getCValueC23() { return getC23(); }

    /** 
     * Add order-by as ascend. <br />
     * c23: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_C23_Asc() { regOBA("c23"); return this; }

    /**
     * Add order-by as descend. <br />
     * c23: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_C23_Desc() { regOBD("c23"); return this; }

    protected ConditionValue _stilettoAliasId;
    public ConditionValue getStilettoAliasId()
    { if (_stilettoAliasId == null) { _stilettoAliasId = nCV(); }
      return _stilettoAliasId; }
    protected ConditionValue getCValueStilettoAliasId() { return getStilettoAliasId(); }

    public Map<String, WhiteStilettoAliasCQ> getStilettoAliasId_InScopeRelation_WhiteStilettoAlias() { return xgetSQueMap("stilettoAliasId_InScopeRelation_WhiteStilettoAlias"); }
    public String keepStilettoAliasId_InScopeRelation_WhiteStilettoAlias(WhiteStilettoAliasCQ sq) { return xkeepSQue("stilettoAliasId_InScopeRelation_WhiteStilettoAlias", sq); }

    public Map<String, WhiteStilettoAliasCQ> getStilettoAliasId_NotInScopeRelation_WhiteStilettoAlias() { return xgetSQueMap("stilettoAliasId_NotInScopeRelation_WhiteStilettoAlias"); }
    public String keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAlias(WhiteStilettoAliasCQ sq) { return xkeepSQue("stilettoAliasId_NotInScopeRelation_WhiteStilettoAlias", sq); }

    /** 
     * Add order-by as ascend. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_StilettoAliasId_Asc() { regOBA("STILETTO_ALIAS_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasRefCQ addOrderBy_StilettoAliasId_Desc() { regOBD("STILETTO_ALIAS_ID"); return this; }

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
    public BsWhiteStilettoAliasRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteStilettoAliasRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteStilettoAliasRefCQ bq = (WhiteStilettoAliasRefCQ)bqs;
        WhiteStilettoAliasRefCQ uq = (WhiteStilettoAliasRefCQ)uqs;
        if (bq.hasConditionQueryWhiteStilettoAlias()) {
            uq.queryWhiteStilettoAlias().reflectRelationOnUnionQuery(bq.queryWhiteStilettoAlias(), uq.queryWhiteStilettoAlias());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteStilettoAliasCQ queryWhiteStilettoAlias() {
        return getConditionQueryWhiteStilettoAlias();
    }
    public WhiteStilettoAliasCQ getConditionQueryWhiteStilettoAlias() {
        String prop = "whiteStilettoAlias";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteStilettoAlias()); xsetupOuterJoinWhiteStilettoAlias(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteStilettoAliasCQ xcreateQueryWhiteStilettoAlias() {
        String nrp = xresolveNRP("white_stiletto_alias_ref", "whiteStilettoAlias"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteStilettoAliasCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteStilettoAlias", nrp);
    }
    protected void xsetupOuterJoinWhiteStilettoAlias() { xregOutJo("whiteStilettoAlias"); }
    public boolean hasConditionQueryWhiteStilettoAlias() { return xhasQueRlMap("whiteStilettoAlias"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteStilettoAliasRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteStilettoAliasRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteStilettoAliasRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteStilettoAliasRefCQ> _myselfExistsMap;
    public Map<String, WhiteStilettoAliasRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteStilettoAliasRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteStilettoAliasRefCB.class.getName(); }
    protected String xCQ() { return WhiteStilettoAliasRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
