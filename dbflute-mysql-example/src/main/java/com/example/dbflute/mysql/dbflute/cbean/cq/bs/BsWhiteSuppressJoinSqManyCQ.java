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
 * The base condition-query of white_suppress_join_sq_many.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqManyCQ extends AbstractBsWhiteSuppressJoinSqManyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqManyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqManyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_suppress_join_sq_many) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqManyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqManyCIQ xcreateCIQ() {
        WhiteSuppressJoinSqManyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqManyCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqManyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_suppress_join_sq_many on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqManyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqManyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _manyId;
    public ConditionValue getManyId()
    { if (_manyId == null) { _manyId = nCV(); }
      return _manyId; }
    protected ConditionValue getCValueManyId() { return getManyId(); }

    /** 
     * Add order-by as ascend. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_ManyId_Asc() { regOBA("MANY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MANY_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_ManyId_Desc() { regOBD("MANY_ID"); return this; }

    protected ConditionValue _manyName;
    public ConditionValue getManyName()
    { if (_manyName == null) { _manyName = nCV(); }
      return _manyName; }
    protected ConditionValue getCValueManyName() { return getManyName(); }

    /** 
     * Add order-by as ascend. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_ManyName_Asc() { regOBA("MANY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_ManyName_Desc() { regOBD("MANY_NAME"); return this; }

    protected ConditionValue _suppressJoinSqId;
    public ConditionValue getSuppressJoinSqId()
    { if (_suppressJoinSqId == null) { _suppressJoinSqId = nCV(); }
      return _suppressJoinSqId; }
    protected ConditionValue getCValueSuppressJoinSqId() { return getSuppressJoinSqId(); }

    public Map<String, WhiteSuppressJoinSqCQ> getSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq() { return xgetSQueMap("suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq"); }
    public String keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSq", sq); }

    public Map<String, WhiteSuppressJoinSqCQ> getSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq() { return xgetSQueMap("suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq"); }
    public String keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSq", sq); }

    /** 
     * Add order-by as ascend. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_SuppressJoinSqId_Asc() { regOBA("SUPPRESS_JOIN_SQ_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_SuppressJoinSqId_Desc() { regOBD("SUPPRESS_JOIN_SQ_ID"); return this; }

    protected ConditionValue _manyOneId;
    public ConditionValue getManyOneId()
    { if (_manyOneId == null) { _manyOneId = nCV(); }
      return _manyOneId; }
    protected ConditionValue getCValueManyOneId() { return getManyOneId(); }

    public Map<String, WhiteSuppressJoinSqManyOneCQ> getManyOneId_InScopeRelation_WhiteSuppressJoinSqManyOne() { return xgetSQueMap("manyOneId_InScopeRelation_WhiteSuppressJoinSqManyOne"); }
    public String keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("manyOneId_InScopeRelation_WhiteSuppressJoinSqManyOne", sq); }

    public Map<String, WhiteSuppressJoinSqManyOneCQ> getManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOne() { return xgetSQueMap("manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOne"); }
    public String keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("manyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyOne", sq); }

    /** 
     * Add order-by as ascend. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_ManyOneId_Asc() { regOBA("MANY_ONE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyCQ addOrderBy_ManyOneId_Desc() { regOBD("MANY_ONE_ID"); return this; }

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
    public BsWhiteSuppressJoinSqManyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSuppressJoinSqManyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteSuppressJoinSqManyCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqManyCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSuppressJoinSqManyCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSuppressJoinSqManyCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqManyCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqManyCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqManyCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqManyCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
