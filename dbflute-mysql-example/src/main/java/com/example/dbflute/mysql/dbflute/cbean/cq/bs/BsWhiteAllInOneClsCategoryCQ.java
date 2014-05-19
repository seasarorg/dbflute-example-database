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
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_all_in_one_cls_category.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAllInOneClsCategoryCQ extends AbstractBsWhiteAllInOneClsCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAllInOneClsCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAllInOneClsCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_all_in_one_cls_category) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteAllInOneClsCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteAllInOneClsCategoryCIQ xcreateCIQ() {
        WhiteAllInOneClsCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteAllInOneClsCategoryCIQ xnewCIQ() {
        return new WhiteAllInOneClsCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_all_in_one_cls_category on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteAllInOneClsCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteAllInOneClsCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _clsCategoryCode;
    public ConditionValue getClsCategoryCode() {
        if (_clsCategoryCode == null) { _clsCategoryCode = nCV(); }
        return _clsCategoryCode;
    }
    protected ConditionValue getCValueClsCategoryCode() { return getClsCategoryCode(); }

    protected Map<String, WhiteAllInOneClsElementCQ> _clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementListMap;
    public Map<String, WhiteAllInOneClsElementCQ> getClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList() { return _clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementListMap; }
    public String keepClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) {
        if (_clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementListMap == null) { _clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementListMap.size() + 1);
        _clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementListMap.put(ky, sq); return "clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList." + ky;
    }

    protected Map<String, WhiteAllInOneClsElementCQ> _clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementListMap;
    public Map<String, WhiteAllInOneClsElementCQ> getClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList() { return _clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementListMap; }
    public String keepClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) {
        if (_clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementListMap == null) { _clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementListMap.size() + 1);
        _clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementListMap.put(ky, sq); return "clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList." + ky;
    }

    protected Map<String, WhiteAllInOneClsElementCQ> _clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementListMap;
    public Map<String, WhiteAllInOneClsElementCQ> getClsCategoryCode_InScopeRelation_WhiteAllInOneClsElementList() { return _clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementListMap; }
    public String keepClsCategoryCode_InScopeRelation_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) {
        if (_clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementListMap == null) { _clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementListMap.size() + 1);
        _clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementListMap.put(ky, sq); return "clsCategoryCode_InScopeRelation_WhiteAllInOneClsElementList." + ky;
    }

    protected Map<String, WhiteAllInOneClsElementCQ> _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementListMap;
    public Map<String, WhiteAllInOneClsElementCQ> getClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementList() { return _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementListMap; }
    public String keepClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) {
        if (_clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementListMap == null) { _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementListMap.size() + 1);
        _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementListMap.put(ky, sq); return "clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsElementList." + ky;
    }

    protected Map<String, WhiteAllInOneClsElementCQ> _clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementListMap;
    public Map<String, WhiteAllInOneClsElementCQ> getClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList() { return _clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementListMap; }
    public String keepClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) {
        if (_clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementListMap == null) { _clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementListMap.size() + 1);
        _clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementListMap.put(ky, sq); return "clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList." + ky;
    }

    protected Map<String, WhiteAllInOneClsElementCQ> _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListMap;
    public Map<String, WhiteAllInOneClsElementCQ> getClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList() { return _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListMap; }
    public String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) {
        if (_clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListMap == null) { _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListMap.size() + 1);
        _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListMap.put(ky, sq); return "clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList." + ky;
    }
    protected Map<String, Object> _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameterMap;
    public Map<String, Object> getClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter() { return _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameterMap; }
    public String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter(Object vl) {
        if (_clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameterMap == null) { _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameterMap.size() + 1);
        _clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameterMap.put(ky, vl); return "clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryCode_Asc() { regOBA("CLS_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryCode_Desc() { regOBD("CLS_CATEGORY_CODE"); return this; }

    protected ConditionValue _clsCategoryName;
    public ConditionValue getClsCategoryName() {
        if (_clsCategoryName == null) { _clsCategoryName = nCV(); }
        return _clsCategoryName;
    }
    protected ConditionValue getCValueClsCategoryName() { return getClsCategoryName(); }

    /** 
     * Add order-by as ascend. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryName_Asc() { regOBA("CLS_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryName_Desc() { regOBD("CLS_CATEGORY_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = nCV(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    /** 
     * Add order-by as ascend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

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
    public BsWhiteAllInOneClsCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteAllInOneClsCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, WhiteAllInOneClsCategoryCQ> _scalarConditionMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteAllInOneClsCategoryCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteAllInOneClsCategoryCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteAllInOneClsCategoryCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteAllInOneClsCategoryCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteAllInOneClsCategoryCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteAllInOneClsCategoryCQ> _myselfExistsMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteAllInOneClsCategoryCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteAllInOneClsCategoryCQ> _myselfInScopeMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteAllInOneClsCategoryCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteAllInOneClsCategoryCB.class.getName(); }
    protected String xCQ() { return WhiteAllInOneClsCategoryCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
