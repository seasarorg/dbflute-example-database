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
 * The base condition-query of white_variant_relation_master_corge.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationMasterCorgeCQ extends AbstractBsWhiteVariantRelationMasterCorgeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterCorgeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationMasterCorgeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_master_corge) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationMasterCorgeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationMasterCorgeCIQ xcreateCIQ() {
        WhiteVariantRelationMasterCorgeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationMasterCorgeCIQ xnewCIQ() {
        return new WhiteVariantRelationMasterCorgeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_master_corge on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationMasterCorgeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationMasterCorgeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _masterCorgeId;
    public ConditionValue getMasterCorgeId()
    { if (_masterCorgeId == null) { _masterCorgeId = nCV(); }
      return _masterCorgeId; }
    protected ConditionValue getCValueMasterCorgeId() { return getMasterCorgeId(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterCorgeCQ addOrderBy_MasterCorgeId_Asc() { regOBA("MASTER_CORGE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterCorgeCQ addOrderBy_MasterCorgeId_Desc() { regOBD("MASTER_CORGE_ID"); return this; }

    protected ConditionValue _masterCorgeName;
    public ConditionValue getMasterCorgeName()
    { if (_masterCorgeName == null) { _masterCorgeName = nCV(); }
      return _masterCorgeName; }
    protected ConditionValue getCValueMasterCorgeName() { return getMasterCorgeName(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterCorgeCQ addOrderBy_MasterCorgeName_Asc() { regOBA("MASTER_CORGE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterCorgeCQ addOrderBy_MasterCorgeName_Desc() { regOBD("MASTER_CORGE_NAME"); return this; }

    protected ConditionValue _corgeTypeCode;
    public ConditionValue getCorgeTypeCode()
    { if (_corgeTypeCode == null) { _corgeTypeCode = nCV(); }
      return _corgeTypeCode; }
    protected ConditionValue getCValueCorgeTypeCode() { return getCorgeTypeCode(); }

    /** 
     * Add order-by as ascend. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterCorgeCQ addOrderBy_CorgeTypeCode_Asc() { regOBA("CORGE_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterCorgeCQ addOrderBy_CorgeTypeCode_Desc() { regOBD("CORGE_TYPE_CODE"); return this; }

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
    public BsWhiteVariantRelationMasterCorgeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationMasterCorgeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteVariantRelationMasterCorgeCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationMasterCorgeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterCorgeCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationMasterCorgeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationMasterCorgeCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationMasterCorgeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationMasterCorgeCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationMasterCorgeCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationMasterCorgeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterCorgeCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationMasterCorgeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationMasterCorgeCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationMasterCorgeCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
