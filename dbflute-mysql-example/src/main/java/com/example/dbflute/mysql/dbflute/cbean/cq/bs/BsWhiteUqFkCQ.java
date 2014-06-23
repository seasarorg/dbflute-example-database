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
 * The base condition-query of white_uq_fk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkCQ extends AbstractBsWhiteUqFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkCIQ xcreateCIQ() {
        WhiteUqFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkCIQ xnewCIQ() {
        return new WhiteUqFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _uqFkId;
    public ConditionValue getUqFkId()
    { if (_uqFkId == null) { _uqFkId = nCV(); }
      return _uqFkId; }
    protected ConditionValue getCValueUqFkId() { return getUqFkId(); }

    public Map<String, WhiteUqFkRefCQ> getUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList() { return xgetSQueMap("uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList() { return xgetSQueMap("uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList() { return xgetSQueMap("uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList() { return xgetSQueMap("uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList() { return xgetSQueMap("uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList() { return xgetSQueMap("uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList", sq); }
    public Map<String, Object> getUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter() { return xgetSQuePmMap("uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList"); }
    public String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter(Object pm) { return xkeepSQuePm("uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkId_Asc() { regOBA("UQ_FK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkId_Desc() { regOBD("UQ_FK_ID"); return this; }

    protected ConditionValue _uqFkCode;
    public ConditionValue getUqFkCode()
    { if (_uqFkCode == null) { _uqFkCode = nCV(); }
      return _uqFkCode; }
    protected ConditionValue getCValueUqFkCode() { return getUqFkCode(); }

    public Map<String, WhiteUqFkRefCQ> getUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList() { return xgetSQueMap("uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList() { return xgetSQueMap("uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList() { return xgetSQueMap("uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList() { return xgetSQueMap("uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList() { return xgetSQueMap("uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList", sq); }

    public Map<String, WhiteUqFkRefCQ> getUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList() { return xgetSQueMap("uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq) { return xkeepSQue("uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList", sq); }
    public Map<String, Object> getUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter() { return xgetSQuePmMap("uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList"); }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter(Object pm) { return xkeepSQuePm("uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkCode_Asc() { regOBA("UQ_FK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkCode_Desc() { regOBD("UQ_FK_CODE"); return this; }

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
    public BsWhiteUqFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteUqFkCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqFkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteUqFkCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteUqFkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteUqFkCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteUqFkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteUqFkCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteUqFkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteUqFkCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteUqFkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
