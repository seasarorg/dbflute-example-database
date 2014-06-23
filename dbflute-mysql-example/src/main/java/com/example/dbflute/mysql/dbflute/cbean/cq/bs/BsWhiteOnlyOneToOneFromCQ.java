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
 * The base condition-query of white_only_one_to_one_from.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnlyOneToOneFromCQ extends AbstractBsWhiteOnlyOneToOneFromCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteOnlyOneToOneFromCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnlyOneToOneFromCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_only_one_to_one_from) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteOnlyOneToOneFromCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteOnlyOneToOneFromCIQ xcreateCIQ() {
        WhiteOnlyOneToOneFromCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteOnlyOneToOneFromCIQ xnewCIQ() {
        return new WhiteOnlyOneToOneFromCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_only_one_to_one_from on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteOnlyOneToOneFromCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteOnlyOneToOneFromCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fromId;
    public ConditionValue getFromId()
    { if (_fromId == null) { _fromId = nCV(); }
      return _fromId; }
    protected ConditionValue getCValueFromId() { return getFromId(); }

    public Map<String, WhiteOnlyOneToOneToCQ> getFromId_ExistsReferrer_WhiteOnlyOneToOneToAsOne() { return xgetSQueMap("fromId_ExistsReferrer_WhiteOnlyOneToOneToAsOne"); }
    public String keepFromId_ExistsReferrer_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq) { return xkeepSQue("fromId_ExistsReferrer_WhiteOnlyOneToOneToAsOne", sq); }

    public Map<String, WhiteOnlyOneToOneToCQ> getFromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne() { return xgetSQueMap("fromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne"); }
    public String keepFromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq) { return xkeepSQue("fromId_NotExistsReferrer_WhiteOnlyOneToOneToAsOne", sq); }

    public Map<String, WhiteOnlyOneToOneToCQ> getFromId_InScopeRelation_WhiteOnlyOneToOneToAsOne() { return xgetSQueMap("fromId_InScopeRelation_WhiteOnlyOneToOneToAsOne"); }
    public String keepFromId_InScopeRelation_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq) { return xkeepSQue("fromId_InScopeRelation_WhiteOnlyOneToOneToAsOne", sq); }

    public Map<String, WhiteOnlyOneToOneToCQ> getFromId_NotInScopeRelation_WhiteOnlyOneToOneToAsOne() { return xgetSQueMap("fromId_NotInScopeRelation_WhiteOnlyOneToOneToAsOne"); }
    public String keepFromId_NotInScopeRelation_WhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneToCQ sq) { return xkeepSQue("fromId_NotInScopeRelation_WhiteOnlyOneToOneToAsOne", sq); }

    /** 
     * Add order-by as ascend. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneFromCQ addOrderBy_FromId_Asc() { regOBA("FROM_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneFromCQ addOrderBy_FromId_Desc() { regOBD("FROM_ID"); return this; }

    protected ConditionValue _fromName;
    public ConditionValue getFromName()
    { if (_fromName == null) { _fromName = nCV(); }
      return _fromName; }
    protected ConditionValue getCValueFromName() { return getFromName(); }

    /** 
     * Add order-by as ascend. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneFromCQ addOrderBy_FromName_Asc() { regOBA("FROM_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteOnlyOneToOneFromCQ addOrderBy_FromName_Desc() { regOBD("FROM_NAME"); return this; }

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
    public BsWhiteOnlyOneToOneFromCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteOnlyOneToOneFromCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteOnlyOneToOneFromCQ bq = (WhiteOnlyOneToOneFromCQ)bqs;
        WhiteOnlyOneToOneFromCQ uq = (WhiteOnlyOneToOneFromCQ)uqs;
        if (bq.hasConditionQueryWhiteOnlyOneToOneToAsOne()) {
            uq.queryWhiteOnlyOneToOneToAsOne().reflectRelationOnUnionQuery(bq.queryWhiteOnlyOneToOneToAsOne(), uq.queryWhiteOnlyOneToOneToAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteOnlyOneToOneToCQ queryWhiteOnlyOneToOneToAsOne() { return getConditionQueryWhiteOnlyOneToOneToAsOne(); }
    public WhiteOnlyOneToOneToCQ getConditionQueryWhiteOnlyOneToOneToAsOne() {
        String prop = "whiteOnlyOneToOneToAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteOnlyOneToOneToAsOne()); xsetupOuterJoinWhiteOnlyOneToOneToAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteOnlyOneToOneToCQ xcreateQueryWhiteOnlyOneToOneToAsOne() {
        String nrp = xresolveNRP("white_only_one_to_one_from", "whiteOnlyOneToOneToAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteOnlyOneToOneToCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteOnlyOneToOneToAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteOnlyOneToOneToAsOne() { xregOutJo("whiteOnlyOneToOneToAsOne"); }
    public boolean hasConditionQueryWhiteOnlyOneToOneToAsOne() { return xhasQueRlMap("whiteOnlyOneToOneToAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteOnlyOneToOneFromCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteOnlyOneToOneFromCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteOnlyOneToOneFromCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteOnlyOneToOneFromCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteOnlyOneToOneFromCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteOnlyOneToOneFromCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteOnlyOneToOneFromCQ> _myselfExistsMap;
    public Map<String, WhiteOnlyOneToOneFromCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteOnlyOneToOneFromCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteOnlyOneToOneFromCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteOnlyOneToOneFromCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteOnlyOneToOneFromCB.class.getName(); }
    protected String xCQ() { return WhiteOnlyOneToOneFromCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
