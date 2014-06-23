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
 * The base condition-query of white_suppress_join_sq.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqCQ extends AbstractBsWhiteSuppressJoinSqCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_suppress_join_sq) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqCIQ xcreateCIQ() {
        WhiteSuppressJoinSqCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_suppress_join_sq on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _suppressJoinSqId;
    public ConditionValue getSuppressJoinSqId()
    { if (_suppressJoinSqId == null) { _suppressJoinSqId = nCV(); }
      return _suppressJoinSqId; }
    protected ConditionValue getCValueSuppressJoinSqId() { return getSuppressJoinSqId(); }

    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne() { return xgetSQueMap("suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne"); }
    public String keepSuppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("suppressJoinSqId_ExistsReferrer_WhiteSuppressJoinSqOneAsOne", sq); }

    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne() { return xgetSQueMap("suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne"); }
    public String keepSuppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("suppressJoinSqId_NotExistsReferrer_WhiteSuppressJoinSqOneAsOne", sq); }

    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne() { return xgetSQueMap("suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne"); }
    public String keepSuppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("suppressJoinSqId_InScopeRelation_WhiteSuppressJoinSqOneAsOne", sq); }

    public Map<String, WhiteSuppressJoinSqOneCQ> getSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne() { return xgetSQueMap("suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne"); }
    public String keepSuppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("suppressJoinSqId_NotInScopeRelation_WhiteSuppressJoinSqOneAsOne", sq); }

    /** 
     * Add order-by as ascend. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqId_Asc() { regOBA("SUPPRESS_JOIN_SQ_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqId_Desc() { regOBD("SUPPRESS_JOIN_SQ_ID"); return this; }

    protected ConditionValue _suppressJoinSqName;
    public ConditionValue getSuppressJoinSqName()
    { if (_suppressJoinSqName == null) { _suppressJoinSqName = nCV(); }
      return _suppressJoinSqName; }
    protected ConditionValue getCValueSuppressJoinSqName() { return getSuppressJoinSqName(); }

    /** 
     * Add order-by as ascend. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqName_Asc() { regOBA("SUPPRESS_JOIN_SQ_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqCQ addOrderBy_SuppressJoinSqName_Desc() { regOBD("SUPPRESS_JOIN_SQ_NAME"); return this; }

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
    public BsWhiteSuppressJoinSqCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSuppressJoinSqCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteSuppressJoinSqCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSuppressJoinSqCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSuppressJoinSqCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSuppressJoinSqCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
