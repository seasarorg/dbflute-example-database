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
 * The base condition-query of white_implicit_reverse_fk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitReverseFkCQ extends AbstractBsWhiteImplicitReverseFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitReverseFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitReverseFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_reverse_fk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitReverseFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitReverseFkCIQ xcreateCIQ() {
        WhiteImplicitReverseFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitReverseFkCIQ xnewCIQ() {
        return new WhiteImplicitReverseFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_reverse_fk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitReverseFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitReverseFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _whiteImplicitReverseFkId;
    public ConditionValue getWhiteImplicitReverseFkId()
    { if (_whiteImplicitReverseFkId == null) { _whiteImplicitReverseFkId = nCV(); }
      return _whiteImplicitReverseFkId; }
    protected ConditionValue getCValueWhiteImplicitReverseFkId() { return getWhiteImplicitReverseFkId(); }

    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList() { return xgetSQueMap("whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) { return xkeepSQue("whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList", sq); }

    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList() { return xgetSQueMap("whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) { return xkeepSQue("whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList", sq); }

    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList() { return xgetSQueMap("whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) { return xkeepSQue("whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList", sq); }

    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList() { return xgetSQueMap("whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) { return xkeepSQue("whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList", sq); }

    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList() { return xgetSQueMap("whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) { return xkeepSQue("whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList", sq); }

    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList() { return xgetSQueMap("whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) { return xkeepSQue("whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList", sq); }
    public Map<String, Object> getWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter() { return xgetSQuePmMap("whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList"); }
    public String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(Object pm) { return xkeepSQuePm("whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkId_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkId_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    protected ConditionValue _whiteImplicitReverseFkName;
    public ConditionValue getWhiteImplicitReverseFkName()
    { if (_whiteImplicitReverseFkName == null) { _whiteImplicitReverseFkName = nCV(); }
      return _whiteImplicitReverseFkName; }
    protected ConditionValue getCValueWhiteImplicitReverseFkName() { return getWhiteImplicitReverseFkName(); }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkName_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkName_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_NAME"); return this; }

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
    public BsWhiteImplicitReverseFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteImplicitReverseFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitReverseFkCQ bq = (WhiteImplicitReverseFkCQ)bqs;
        WhiteImplicitReverseFkCQ uq = (WhiteImplicitReverseFkCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK()) {
            uq.xsetParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK(bq.getParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK());
            uq.getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK().reflectRelationOnUnionQuery(bq.getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(), uq.getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK());
        }
        if (bq.hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK()) {
            uq.xsetParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(bq.getParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK());
            uq.getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK().reflectRelationOnUnionQuery(bq.getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(), uq.getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitReverseFkRefCQ queryWhiteImplicitReverseFkRefWithImplicitReverseFK(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("whiteImplicitReverseFkRefWithImplicitReverseFK", parameterMap);
        return getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK();
    }
    public WhiteImplicitReverseFkRefCQ getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        String prop = "whiteImplicitReverseFkRefWithImplicitReverseFK";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitReverseFkRefWithImplicitReverseFK()); xsetupOuterJoinWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK;
    public Map<String, Object> getParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK()
    { if (_parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK == null) { _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK = newLinkedHashMapSized(4); }
      return _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK; }
    public void xsetParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK(Map<String, Object> parameterMap)
    { _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK = parameterMap; } // for UnionQuery
    protected WhiteImplicitReverseFkRefCQ xcreateQueryWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        String nrp = xresolveNRP("white_implicit_reverse_fk", "whiteImplicitReverseFkRefWithImplicitReverseFK"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitReverseFkRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitReverseFkRefWithImplicitReverseFK", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitReverseFkRefWithImplicitReverseFK() { xregOutJo("whiteImplicitReverseFkRefWithImplicitReverseFK"); }
    public boolean hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK() { return xhasQueRlMap("whiteImplicitReverseFkRefWithImplicitReverseFK"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitReverseFkSuppressCQ queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK", parameterMap);
        return getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
    }
    public WhiteImplicitReverseFkSuppressCQ getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        String prop = "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK()); xsetupOuterJoinWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    public Map<String, Object> getParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK()
    { if (_parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null) { _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = newLinkedHashMapSized(4); }
      return _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK; }
    public void xsetParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(Map<String, Object> parameterMap)
    { _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = parameterMap; } // for UnionQuery
    protected WhiteImplicitReverseFkSuppressCQ xcreateQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        String nrp = xresolveNRP("white_implicit_reverse_fk", "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitReverseFkSuppressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() { xregOutJo("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK"); }
    public boolean hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() { return xhasQueRlMap("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("whiteImplicitReverseFkRefWithImplicitReverseFK".equalsIgnoreCase(property)) { return _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK; }
        if ("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK".equalsIgnoreCase(property)) { return _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteImplicitReverseFkCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteImplicitReverseFkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteImplicitReverseFkCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteImplicitReverseFkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteImplicitReverseFkCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteImplicitReverseFkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteImplicitReverseFkCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitReverseFkCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteImplicitReverseFkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteImplicitReverseFkCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteImplicitReverseFkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitReverseFkCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitReverseFkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
