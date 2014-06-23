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
 * The base condition-query of white_quoted_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteQuotedRefCQ extends AbstractBsWhiteQuotedRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteQuotedRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteQuotedRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_quoted_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteQuotedRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteQuotedRefCIQ xcreateCIQ() {
        WhiteQuotedRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteQuotedRefCIQ xnewCIQ() {
        return new WhiteQuotedRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_quoted_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteQuotedRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteQuotedRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _where;
    public ConditionValue getWhere()
    { if (_where == null) { _where = nCV(); }
      return _where; }
    protected ConditionValue getCValueWhere() { return getWhere(); }

    /** 
     * Add order-by as ascend. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Where_Asc() { regOBA("WHERE"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHERE: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Where_Desc() { regOBD("WHERE"); return this; }

    protected ConditionValue _order;
    public ConditionValue getOrder()
    { if (_order == null) { _order = nCV(); }
      return _order; }
    protected ConditionValue getCValueOrder() { return getOrder(); }

    public Map<String, WhiteQuotedCQ> getOrder_InScopeRelation_WhiteQuoted() { return xgetSQueMap("order_InScopeRelation_WhiteQuoted"); }
    public String keepOrder_InScopeRelation_WhiteQuoted(WhiteQuotedCQ sq) { return xkeepSQue("order_InScopeRelation_WhiteQuoted", sq); }

    public Map<String, WhiteQuotedCQ> getOrder_NotInScopeRelation_WhiteQuoted() { return xgetSQueMap("order_NotInScopeRelation_WhiteQuoted"); }
    public String keepOrder_NotInScopeRelation_WhiteQuoted(WhiteQuotedCQ sq) { return xkeepSQue("order_NotInScopeRelation_WhiteQuoted", sq); }

    /** 
     * Add order-by as ascend. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Order_Asc() { regOBA("ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @return this. (NotNull)
     */
    public BsWhiteQuotedRefCQ addOrderBy_Order_Desc() { regOBD("ORDER"); return this; }

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
    public BsWhiteQuotedRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteQuotedRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteQuotedRefCQ bq = (WhiteQuotedRefCQ)bqs;
        WhiteQuotedRefCQ uq = (WhiteQuotedRefCQ)uqs;
        if (bq.hasConditionQueryWhiteQuoted()) {
            uq.queryWhiteQuoted().reflectRelationOnUnionQuery(bq.queryWhiteQuoted(), uq.queryWhiteQuoted());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_quoted by my ORDER, named 'whiteQuoted'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteQuotedCQ queryWhiteQuoted() {
        return getConditionQueryWhiteQuoted();
    }
    public WhiteQuotedCQ getConditionQueryWhiteQuoted() {
        String prop = "whiteQuoted";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteQuoted()); xsetupOuterJoinWhiteQuoted(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteQuotedCQ xcreateQueryWhiteQuoted() {
        String nrp = xresolveNRP("white_quoted_ref", "whiteQuoted"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteQuotedCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteQuoted", nrp);
    }
    protected void xsetupOuterJoinWhiteQuoted() { xregOutJo("whiteQuoted"); }
    public boolean hasConditionQueryWhiteQuoted() { return xhasQueRlMap("whiteQuoted"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteQuotedRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteQuotedRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteQuotedRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteQuotedRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteQuotedRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteQuotedRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteQuotedRefCQ> _myselfExistsMap;
    public Map<String, WhiteQuotedRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteQuotedRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteQuotedRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteQuotedRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteQuotedRefCB.class.getName(); }
    protected String xCQ() { return WhiteQuotedRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
