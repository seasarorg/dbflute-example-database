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
 * The base condition-query of white_variant_relation_master_qux.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationMasterQuxCQ extends AbstractBsWhiteVariantRelationMasterQuxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationMasterQuxCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationMasterQuxCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_variant_relation_master_qux) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteVariantRelationMasterQuxCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteVariantRelationMasterQuxCIQ xcreateCIQ() {
        WhiteVariantRelationMasterQuxCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteVariantRelationMasterQuxCIQ xnewCIQ() {
        return new WhiteVariantRelationMasterQuxCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_variant_relation_master_qux on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteVariantRelationMasterQuxCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteVariantRelationMasterQuxCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _masterQuxId;
    public ConditionValue getMasterQuxId()
    { if (_masterQuxId == null) { _masterQuxId = nCV(); }
      return _masterQuxId; }
    protected ConditionValue getCValueMasterQuxId() { return getMasterQuxId(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterQuxCQ addOrderBy_MasterQuxId_Asc() { regOBA("MASTER_QUX_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterQuxCQ addOrderBy_MasterQuxId_Desc() { regOBD("MASTER_QUX_ID"); return this; }

    protected ConditionValue _masterQuxName;
    public ConditionValue getMasterQuxName()
    { if (_masterQuxName == null) { _masterQuxName = nCV(); }
      return _masterQuxName; }
    protected ConditionValue getCValueMasterQuxName() { return getMasterQuxName(); }

    /** 
     * Add order-by as ascend. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterQuxCQ addOrderBy_MasterQuxName_Asc() { regOBA("MASTER_QUX_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterQuxCQ addOrderBy_MasterQuxName_Desc() { regOBD("MASTER_QUX_NAME"); return this; }

    protected ConditionValue _quxTypeCode;
    public ConditionValue getQuxTypeCode()
    { if (_quxTypeCode == null) { _quxTypeCode = nCV(); }
      return _quxTypeCode; }
    protected ConditionValue getCValueQuxTypeCode() { return getQuxTypeCode(); }

    /** 
     * Add order-by as ascend. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterQuxCQ addOrderBy_QuxTypeCode_Asc() { regOBA("QUX_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @return this. (NotNull)
     */
    public BsWhiteVariantRelationMasterQuxCQ addOrderBy_QuxTypeCode_Desc() { regOBD("QUX_TYPE_CODE"); return this; }

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
    public BsWhiteVariantRelationMasterQuxCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteVariantRelationMasterQuxCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteVariantRelationMasterQuxCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteVariantRelationMasterQuxCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterQuxCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteVariantRelationMasterQuxCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteVariantRelationMasterQuxCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteVariantRelationMasterQuxCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteVariantRelationMasterQuxCQ> _myselfExistsMap;
    public Map<String, WhiteVariantRelationMasterQuxCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteVariantRelationMasterQuxCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteVariantRelationMasterQuxCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteVariantRelationMasterQuxCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteVariantRelationMasterQuxCB.class.getName(); }
    protected String xCQ() { return WhiteVariantRelationMasterQuxCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
