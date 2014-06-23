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
 * The base condition-query of white_myself.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteMyselfCQ extends AbstractBsWhiteMyselfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteMyselfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteMyselfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_myself) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteMyselfCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteMyselfCIQ xcreateCIQ() {
        WhiteMyselfCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteMyselfCIQ xnewCIQ() {
        return new WhiteMyselfCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_myself on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteMyselfCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteMyselfCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _myselfId;
    public ConditionValue getMyselfId()
    { if (_myselfId == null) { _myselfId = nCV(); }
      return _myselfId; }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    public Map<String, WhiteMyselfCheckCQ> getMyselfId_ExistsReferrer_WhiteMyselfCheckList() { return xgetSQueMap("myselfId_ExistsReferrer_WhiteMyselfCheckList"); }
    public String keepMyselfId_ExistsReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) { return xkeepSQue("myselfId_ExistsReferrer_WhiteMyselfCheckList", sq); }

    public Map<String, WhiteMyselfCheckCQ> getMyselfId_NotExistsReferrer_WhiteMyselfCheckList() { return xgetSQueMap("myselfId_NotExistsReferrer_WhiteMyselfCheckList"); }
    public String keepMyselfId_NotExistsReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) { return xkeepSQue("myselfId_NotExistsReferrer_WhiteMyselfCheckList", sq); }

    public Map<String, WhiteMyselfCheckCQ> getMyselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList() { return xgetSQueMap("myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList"); }
    public String keepMyselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) { return xkeepSQue("myselfId_SpecifyDerivedReferrer_WhiteMyselfCheckList", sq); }

    public Map<String, WhiteMyselfCheckCQ> getMyselfId_InScopeRelation_WhiteMyselfCheckList() { return xgetSQueMap("myselfId_InScopeRelation_WhiteMyselfCheckList"); }
    public String keepMyselfId_InScopeRelation_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) { return xkeepSQue("myselfId_InScopeRelation_WhiteMyselfCheckList", sq); }

    public Map<String, WhiteMyselfCheckCQ> getMyselfId_NotInScopeRelation_WhiteMyselfCheckList() { return xgetSQueMap("myselfId_NotInScopeRelation_WhiteMyselfCheckList"); }
    public String keepMyselfId_NotInScopeRelation_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) { return xkeepSQue("myselfId_NotInScopeRelation_WhiteMyselfCheckList", sq); }

    public Map<String, WhiteMyselfCheckCQ> getMyselfId_QueryDerivedReferrer_WhiteMyselfCheckList() { return xgetSQueMap("myselfId_QueryDerivedReferrer_WhiteMyselfCheckList"); }
    public String keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckList(WhiteMyselfCheckCQ sq) { return xkeepSQue("myselfId_QueryDerivedReferrer_WhiteMyselfCheckList", sq); }
    public Map<String, Object> getMyselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter() { return xgetSQuePmMap("myselfId_QueryDerivedReferrer_WhiteMyselfCheckList"); }
    public String keepMyselfId_QueryDerivedReferrer_WhiteMyselfCheckListParameter(Object pm) { return xkeepSQuePm("myselfId_QueryDerivedReferrer_WhiteMyselfCheckList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfId_Asc() { regOBA("MYSELF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfId_Desc() { regOBD("MYSELF_ID"); return this; }

    protected ConditionValue _myselfName;
    public ConditionValue getMyselfName()
    { if (_myselfName == null) { _myselfName = nCV(); }
      return _myselfName; }
    protected ConditionValue getCValueMyselfName() { return getMyselfName(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfName_Asc() { regOBA("MYSELF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public BsWhiteMyselfCQ addOrderBy_MyselfName_Desc() { regOBD("MYSELF_NAME"); return this; }

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
    public BsWhiteMyselfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteMyselfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteMyselfCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteMyselfCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteMyselfCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteMyselfCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteMyselfCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteMyselfCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteMyselfCQ> _myselfExistsMap;
    public Map<String, WhiteMyselfCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteMyselfCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteMyselfCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteMyselfCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteMyselfCB.class.getName(); }
    protected String xCQ() { return WhiteMyselfCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
