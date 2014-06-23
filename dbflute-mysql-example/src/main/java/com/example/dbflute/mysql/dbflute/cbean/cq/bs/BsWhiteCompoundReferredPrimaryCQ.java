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
 * The base condition-query of white_compound_referred_primary.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundReferredPrimaryCQ extends AbstractBsWhiteCompoundReferredPrimaryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundReferredPrimaryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundReferredPrimaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_referred_primary) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundReferredPrimaryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundReferredPrimaryCIQ xcreateCIQ() {
        WhiteCompoundReferredPrimaryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundReferredPrimaryCIQ xnewCIQ() {
        return new WhiteCompoundReferredPrimaryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_referred_primary on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundReferredPrimaryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundReferredPrimaryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _referredId;
    public ConditionValue getReferredId()
    { if (_referredId == null) { _referredId = nCV(); }
      return _referredId; }
    protected ConditionValue getCValueReferredId() { return getReferredId(); }

    public Map<String, WhiteCompoundPkCQ> getReferredId_ExistsReferrer_WhiteCompoundPkList() { return xgetSQueMap("referredId_ExistsReferrer_WhiteCompoundPkList"); }
    public String keepReferredId_ExistsReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) { return xkeepSQue("referredId_ExistsReferrer_WhiteCompoundPkList", sq); }

    public Map<String, WhiteCompoundPkCQ> getReferredId_NotExistsReferrer_WhiteCompoundPkList() { return xgetSQueMap("referredId_NotExistsReferrer_WhiteCompoundPkList"); }
    public String keepReferredId_NotExistsReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) { return xkeepSQue("referredId_NotExistsReferrer_WhiteCompoundPkList", sq); }

    public Map<String, WhiteCompoundPkCQ> getReferredId_SpecifyDerivedReferrer_WhiteCompoundPkList() { return xgetSQueMap("referredId_SpecifyDerivedReferrer_WhiteCompoundPkList"); }
    public String keepReferredId_SpecifyDerivedReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) { return xkeepSQue("referredId_SpecifyDerivedReferrer_WhiteCompoundPkList", sq); }

    public Map<String, WhiteCompoundPkCQ> getReferredId_InScopeRelation_WhiteCompoundPkList() { return xgetSQueMap("referredId_InScopeRelation_WhiteCompoundPkList"); }
    public String keepReferredId_InScopeRelation_WhiteCompoundPkList(WhiteCompoundPkCQ sq) { return xkeepSQue("referredId_InScopeRelation_WhiteCompoundPkList", sq); }

    public Map<String, WhiteCompoundPkCQ> getReferredId_NotInScopeRelation_WhiteCompoundPkList() { return xgetSQueMap("referredId_NotInScopeRelation_WhiteCompoundPkList"); }
    public String keepReferredId_NotInScopeRelation_WhiteCompoundPkList(WhiteCompoundPkCQ sq) { return xkeepSQue("referredId_NotInScopeRelation_WhiteCompoundPkList", sq); }

    public Map<String, WhiteCompoundPkCQ> getReferredId_QueryDerivedReferrer_WhiteCompoundPkList() { return xgetSQueMap("referredId_QueryDerivedReferrer_WhiteCompoundPkList"); }
    public String keepReferredId_QueryDerivedReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq) { return xkeepSQue("referredId_QueryDerivedReferrer_WhiteCompoundPkList", sq); }
    public Map<String, Object> getReferredId_QueryDerivedReferrer_WhiteCompoundPkListParameter() { return xgetSQuePmMap("referredId_QueryDerivedReferrer_WhiteCompoundPkList"); }
    public String keepReferredId_QueryDerivedReferrer_WhiteCompoundPkListParameter(Object pm) { return xkeepSQuePm("referredId_QueryDerivedReferrer_WhiteCompoundPkList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredPrimaryCQ addOrderBy_ReferredId_Asc() { regOBA("REFERRED_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredPrimaryCQ addOrderBy_ReferredId_Desc() { regOBD("REFERRED_ID"); return this; }

    protected ConditionValue _referredName;
    public ConditionValue getReferredName()
    { if (_referredName == null) { _referredName = nCV(); }
      return _referredName; }
    protected ConditionValue getCValueReferredName() { return getReferredName(); }

    /** 
     * Add order-by as ascend. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredPrimaryCQ addOrderBy_ReferredName_Asc() { regOBA("REFERRED_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundReferredPrimaryCQ addOrderBy_ReferredName_Desc() { regOBD("REFERRED_NAME"); return this; }

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
    public BsWhiteCompoundReferredPrimaryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteCompoundReferredPrimaryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteCompoundReferredPrimaryCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteCompoundReferredPrimaryCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteCompoundReferredPrimaryCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteCompoundReferredPrimaryCQ> _myselfExistsMap;
    public Map<String, WhiteCompoundReferredPrimaryCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteCompoundReferredPrimaryCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteCompoundReferredPrimaryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundReferredPrimaryCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundReferredPrimaryCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
