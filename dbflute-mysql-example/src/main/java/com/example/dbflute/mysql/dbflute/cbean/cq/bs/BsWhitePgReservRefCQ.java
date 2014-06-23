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
 * The base condition-query of white_pg_reserv_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePgReservRefCQ extends AbstractBsWhitePgReservRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePgReservRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePgReservRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_pg_reserv_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePgReservRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePgReservRefCIQ xcreateCIQ() {
        WhitePgReservRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePgReservRefCIQ xnewCIQ() {
        return new WhitePgReservRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_pg_reserv_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePgReservRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePgReservRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsWhitePgReservRefCQ addOrderBy_RefId_Asc() { regOBA("REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_RefId_Desc() { regOBD("REF_ID"); return this; }

    protected ConditionValue _classSynonym;
    public ConditionValue getClassSynonym()
    { if (_classSynonym == null) { _classSynonym = nCV(); }
      return _classSynonym; }
    protected ConditionValue getCValueClassSynonym() { return getClassSynonym(); }

    public Map<String, WhitePgReservCQ> getClassSynonym_InScopeRelation_WhitePgReserv() { return xgetSQueMap("classSynonym_InScopeRelation_WhitePgReserv"); }
    public String keepClassSynonym_InScopeRelation_WhitePgReserv(WhitePgReservCQ sq) { return xkeepSQue("classSynonym_InScopeRelation_WhitePgReserv", sq); }

    public Map<String, WhitePgReservCQ> getClassSynonym_NotInScopeRelation_WhitePgReserv() { return xgetSQueMap("classSynonym_NotInScopeRelation_WhitePgReserv"); }
    public String keepClassSynonym_NotInScopeRelation_WhitePgReserv(WhitePgReservCQ sq) { return xkeepSQue("classSynonym_NotInScopeRelation_WhitePgReserv", sq); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_ClassSynonym_Asc() { regOBA("CLASS"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @return this. (NotNull)
     */
    public BsWhitePgReservRefCQ addOrderBy_ClassSynonym_Desc() { regOBD("CLASS"); return this; }

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
    public BsWhitePgReservRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePgReservRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhitePgReservRefCQ bq = (WhitePgReservRefCQ)bqs;
        WhitePgReservRefCQ uq = (WhitePgReservRefCQ)uqs;
        if (bq.hasConditionQueryWhitePgReserv()) {
            uq.queryWhitePgReserv().reflectRelationOnUnionQuery(bq.queryWhitePgReserv(), uq.queryWhitePgReserv());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePgReservCQ queryWhitePgReserv() {
        return getConditionQueryWhitePgReserv();
    }
    public WhitePgReservCQ getConditionQueryWhitePgReserv() {
        String prop = "whitePgReserv";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePgReserv()); xsetupOuterJoinWhitePgReserv(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePgReservCQ xcreateQueryWhitePgReserv() {
        String nrp = xresolveNRP("white_pg_reserv_ref", "whitePgReserv"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePgReservCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePgReserv", nrp);
    }
    protected void xsetupOuterJoinWhitePgReserv() { xregOutJo("whitePgReserv"); }
    public boolean hasConditionQueryWhitePgReserv() { return xhasQueRlMap("whitePgReserv"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhitePgReservRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePgReservRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePgReservRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePgReservRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePgReservRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePgReservRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePgReservRefCQ> _myselfExistsMap;
    public Map<String, WhitePgReservRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePgReservRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePgReservRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePgReservRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePgReservRefCB.class.getName(); }
    protected String xCQ() { return WhitePgReservRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
