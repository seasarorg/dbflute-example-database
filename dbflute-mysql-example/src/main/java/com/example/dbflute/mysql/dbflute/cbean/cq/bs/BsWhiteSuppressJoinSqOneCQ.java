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
 * The base condition-query of white_suppress_join_sq_one.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqOneCQ extends AbstractBsWhiteSuppressJoinSqOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqOneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_suppress_join_sq_one) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqOneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqOneCIQ xcreateCIQ() {
        WhiteSuppressJoinSqOneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqOneCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqOneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_suppress_join_sq_one on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqOneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqOneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _oneId;
    public ConditionValue getOneId()
    { if (_oneId == null) { _oneId = nCV(); }
      return _oneId; }
    protected ConditionValue getCValueOneId() { return getOneId(); }

    /** 
     * Add order-by as ascend. <br />
     * ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneId_Asc() { regOBA("ONE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneId_Desc() { regOBD("ONE_ID"); return this; }

    protected ConditionValue _oneName;
    public ConditionValue getOneName()
    { if (_oneName == null) { _oneName = nCV(); }
      return _oneName; }
    protected ConditionValue getCValueOneName() { return getOneName(); }

    /** 
     * Add order-by as ascend. <br />
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneName_Asc() { regOBA("ONE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneName_Desc() { regOBD("ONE_NAME"); return this; }

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
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_SuppressJoinSqId_Asc() { regOBA("SUPPRESS_JOIN_SQ_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_SuppressJoinSqId_Desc() { regOBD("SUPPRESS_JOIN_SQ_ID"); return this; }

    protected ConditionValue _oneAddiId;
    public ConditionValue getOneAddiId()
    { if (_oneAddiId == null) { _oneAddiId = nCV(); }
      return _oneAddiId; }
    protected ConditionValue getCValueOneAddiId() { return getOneAddiId(); }

    public Map<String, WhiteSuppressJoinSqOneAddiCQ> getOneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi() { return xgetSQueMap("oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi"); }
    public String keepOneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi(WhiteSuppressJoinSqOneAddiCQ sq) { return xkeepSQue("oneAddiId_InScopeRelation_WhiteSuppressJoinSqOneAddi", sq); }

    public Map<String, WhiteSuppressJoinSqOneAddiCQ> getOneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi() { return xgetSQueMap("oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi"); }
    public String keepOneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi(WhiteSuppressJoinSqOneAddiCQ sq) { return xkeepSQue("oneAddiId_NotInScopeRelation_WhiteSuppressJoinSqOneAddi", sq); }

    /** 
     * Add order-by as ascend. <br />
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneAddiId_Asc() { regOBA("ONE_ADDI_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqOneCQ addOrderBy_OneAddiId_Desc() { regOBD("ONE_ADDI_ID"); return this; }

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
    public BsWhiteSuppressJoinSqOneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSuppressJoinSqOneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteSuppressJoinSqOneCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqOneCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSuppressJoinSqOneCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSuppressJoinSqOneCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqOneCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqOneCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSuppressJoinSqOneCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqOneCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqOneCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
