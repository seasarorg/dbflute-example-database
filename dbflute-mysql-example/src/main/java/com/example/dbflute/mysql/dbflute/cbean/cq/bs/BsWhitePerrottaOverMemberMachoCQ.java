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
 * The base condition-query of white_perrotta_over_member_macho.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverMemberMachoCQ extends AbstractBsWhitePerrottaOverMemberMachoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverMemberMachoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverMemberMachoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_perrotta_over_member_macho) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePerrottaOverMemberMachoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePerrottaOverMemberMachoCIQ xcreateCIQ() {
        WhitePerrottaOverMemberMachoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePerrottaOverMemberMachoCIQ xnewCIQ() {
        return new WhitePerrottaOverMemberMachoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_perrotta_over_member_macho on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePerrottaOverMemberMachoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePerrottaOverMemberMachoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _machoCode;
    public ConditionValue getMachoCode()
    { if (_machoCode == null) { _machoCode = nCV(); }
      return _machoCode; }
    protected ConditionValue getCValueMachoCode() { return getMachoCode(); }

    public Map<String, WhitePerrottaOverMemberCQ> getMachoCode_ExistsReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("machoCode_ExistsReferrer_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("machoCode_ExistsReferrer_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> getMachoCode_NotExistsReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("machoCode_NotExistsReferrer_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("machoCode_NotExistsReferrer_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> getMachoCode_InScopeRelation_WhitePerrottaOverMemberList() { return xgetSQueMap("machoCode_InScopeRelation_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_InScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("machoCode_InScopeRelation_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> getMachoCode_NotInScopeRelation_WhitePerrottaOverMemberList() { return xgetSQueMap("machoCode_NotInScopeRelation_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_NotInScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("machoCode_NotInScopeRelation_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> getMachoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("machoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("machoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> getMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("machoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("machoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList", sq); }
    public Map<String, Object> getMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter() { return xgetSQuePmMap("machoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList"); }
    public String keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object pm) { return xkeepSQuePm("machoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberMachoCQ addOrderBy_MachoCode_Asc() { regOBA("MACHO_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberMachoCQ addOrderBy_MachoCode_Desc() { regOBD("MACHO_CODE"); return this; }

    protected ConditionValue _machoName;
    public ConditionValue getMachoName()
    { if (_machoName == null) { _machoName = nCV(); }
      return _machoName; }
    protected ConditionValue getCValueMachoName() { return getMachoName(); }

    /** 
     * Add order-by as ascend. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberMachoCQ addOrderBy_MachoName_Asc() { regOBA("MACHO_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberMachoCQ addOrderBy_MachoName_Desc() { regOBD("MACHO_NAME"); return this; }

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
    public BsWhitePerrottaOverMemberMachoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePerrottaOverMemberMachoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhitePerrottaOverMemberMachoCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePerrottaOverMemberMachoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePerrottaOverMemberMachoCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverMemberMachoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePerrottaOverMemberMachoCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePerrottaOverMemberMachoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePerrottaOverMemberMachoCQ> _myselfExistsMap;
    public Map<String, WhitePerrottaOverMemberMachoCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePerrottaOverMemberMachoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePerrottaOverMemberMachoCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePerrottaOverMemberMachoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePerrottaOverMemberMachoCB.class.getName(); }
    protected String xCQ() { return WhitePerrottaOverMemberMachoCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
