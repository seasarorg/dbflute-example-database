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
 * The base condition-query of white_split_multiple_fk_next.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSplitMultipleFkNextCQ extends AbstractBsWhiteSplitMultipleFkNextCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkNextCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSplitMultipleFkNextCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_split_multiple_fk_next) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSplitMultipleFkNextCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSplitMultipleFkNextCIQ xcreateCIQ() {
        WhiteSplitMultipleFkNextCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSplitMultipleFkNextCIQ xnewCIQ() {
        return new WhiteSplitMultipleFkNextCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_split_multiple_fk_next on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSplitMultipleFkNextCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSplitMultipleFkNextCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _nextId;
    public ConditionValue getNextId()
    { if (_nextId == null) { _nextId = nCV(); }
      return _nextId; }
    protected ConditionValue getCValueNextId() { return getNextId(); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList() { return xgetSQueMap("nextId_ExistsReferrer_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("nextId_ExistsReferrer_WhiteSplitMultipleFkBaseList", sq); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList() { return xgetSQueMap("nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList", sq); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList() { return xgetSQueMap("nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList", sq); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_InScopeRelation_WhiteSplitMultipleFkBaseList() { return xgetSQueMap("nextId_InScopeRelation_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_InScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("nextId_InScopeRelation_WhiteSplitMultipleFkBaseList", sq); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList() { return xgetSQueMap("nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList", sq); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList() { return xgetSQueMap("nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList", sq); }
    public Map<String, Object> getNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter() { return xgetSQuePmMap("nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList"); }
    public String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(Object pm) { return xkeepSQuePm("nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_NextId_Asc() { regOBA("NEXT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_NextId_Desc() { regOBD("NEXT_ID"); return this; }

    protected ConditionValue _secondCode;
    public ConditionValue getSecondCode()
    { if (_secondCode == null) { _secondCode = nCV(); }
      return _secondCode; }
    protected ConditionValue getCValueSecondCode() { return getSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_SecondCode_Asc() { regOBA("SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_SecondCode_Desc() { regOBD("SECOND_CODE"); return this; }

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
    public BsWhiteSplitMultipleFkNextCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSplitMultipleFkNextCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteSplitMultipleFkNextCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSplitMultipleFkNextCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSplitMultipleFkNextCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSplitMultipleFkNextCQ> _myselfExistsMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSplitMultipleFkNextCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSplitMultipleFkNextCB.class.getName(); }
    protected String xCQ() { return WhiteSplitMultipleFkNextCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
