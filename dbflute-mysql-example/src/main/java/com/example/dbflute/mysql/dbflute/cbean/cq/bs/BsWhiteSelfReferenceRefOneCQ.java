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
 * The base condition-query of white_self_reference_ref_one.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReferenceRefOneCQ extends AbstractBsWhiteSelfReferenceRefOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceRefOneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceRefOneCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_self_reference_ref_one) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSelfReferenceRefOneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSelfReferenceRefOneCIQ xcreateCIQ() {
        WhiteSelfReferenceRefOneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSelfReferenceRefOneCIQ xnewCIQ() {
        return new WhiteSelfReferenceRefOneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_self_reference_ref_one on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSelfReferenceRefOneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSelfReferenceRefOneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _selfReferenceId;
    public ConditionValue getSelfReferenceId() {
        if (_selfReferenceId == null) { _selfReferenceId = nCV(); }
        return _selfReferenceId;
    }
    protected ConditionValue getCValueSelfReferenceId() { return getSelfReferenceId(); }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdList() { return _selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdListMap; }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdListMap == null) { _selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdListMap.size() + 1);
        _selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdListMap.put(ky, sq); return "selfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdList." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList() { return _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdListMap; }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdListMap == null) { _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdListMap.size() + 1);
        _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdListMap.put(ky, sq); return "selfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdList() { return _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdListMap; }
    public String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdListMap == null) { _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdListMap.size() + 1);
        _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdListMap.put(ky, sq); return "selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdList." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_InScopeRelation_WhiteSelfReferenceMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_InScopeRelation_WhiteSelfReference() { return _selfReferenceId_InScopeRelation_WhiteSelfReferenceMap; }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReference(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_InScopeRelation_WhiteSelfReferenceMap == null) { _selfReferenceId_InScopeRelation_WhiteSelfReferenceMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_InScopeRelation_WhiteSelfReferenceMap.size() + 1);
        _selfReferenceId_InScopeRelation_WhiteSelfReferenceMap.put(ky, sq); return "selfReferenceId_InScopeRelation_WhiteSelfReference." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList() { return _selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdListMap; }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdListMap == null) { _selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdListMap.size() + 1);
        _selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdListMap.put(ky, sq); return "selfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_NotInScopeRelation_WhiteSelfReference() { return _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceMap; }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReference(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceMap == null) { _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceMap.size() + 1);
        _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceMap.put(ky, sq); return "selfReferenceId_NotInScopeRelation_WhiteSelfReference." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList() { return _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdListMap; }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdListMap == null) { _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdListMap.size() + 1);
        _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdListMap.put(ky, sq); return "selfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdList() { return _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListMap; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListMap == null) { _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListMap.size() + 1);
        _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListMap.put(ky, sq); return "selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdList." + ky;
    }
    protected Map<String, Object> _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameterMap;
    public Map<String, Object> getSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameter() { return _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameterMap; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameter(Object vl) {
        if (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameterMap == null) { _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameterMap.size() + 1);
        _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameterMap.put(ky, vl); return "selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceId_Asc() { regOBA("SELF_REFERENCE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceId_Desc() { regOBD("SELF_REFERENCE_ID"); return this; }

    protected ConditionValue _selfReferenceRefOneName;
    public ConditionValue getSelfReferenceRefOneName() {
        if (_selfReferenceRefOneName == null) { _selfReferenceRefOneName = nCV(); }
        return _selfReferenceRefOneName;
    }
    protected ConditionValue getCValueSelfReferenceRefOneName() { return getSelfReferenceRefOneName(); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceRefOneName_Asc() { regOBA("SELF_REFERENCE_REF_ONE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceRefOneName_Desc() { regOBD("SELF_REFERENCE_REF_ONE_NAME"); return this; }

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
    public BsWhiteSelfReferenceRefOneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSelfReferenceRefOneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSelfReferenceRefOneCQ bq = (WhiteSelfReferenceRefOneCQ)bqs;
        WhiteSelfReferenceRefOneCQ uq = (WhiteSelfReferenceRefOneCQ)uqs;
        if (bq.hasConditionQueryWhiteSelfReference()) {
            uq.queryWhiteSelfReference().reflectRelationOnUnionQuery(bq.queryWhiteSelfReference(), uq.queryWhiteSelfReference());
        }
        if (bq.hasConditionQueryWhiteSelfReferenceAsDirectParent()) {
            uq.queryWhiteSelfReferenceAsDirectParent().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceAsDirectParent(), uq.queryWhiteSelfReferenceAsDirectParent());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReference() {
        return getConditionQueryWhiteSelfReference();
    }
    protected WhiteSelfReferenceCQ _conditionQueryWhiteSelfReference;
    public WhiteSelfReferenceCQ getConditionQueryWhiteSelfReference() {
        if (_conditionQueryWhiteSelfReference == null) {
            _conditionQueryWhiteSelfReference = xcreateQueryWhiteSelfReference();
            xsetupOuterJoinWhiteSelfReference();
        }
        return _conditionQueryWhiteSelfReference;
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReference() {
        String nrp = resolveNextRelationPath("white_self_reference_ref_one", "whiteSelfReference");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSelfReferenceCQ cq = new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSelfReference");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSelfReference() {
        WhiteSelfReferenceCQ cq = getConditionQueryWhiteSelfReference();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("SELF_REFERENCE_ID", "SELF_REFERENCE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSelfReference");
    }
    public boolean hasConditionQueryWhiteSelfReference() {
        return _conditionQueryWhiteSelfReference != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReferenceAsDirectParent() {
        return getConditionQueryWhiteSelfReferenceAsDirectParent();
    }
    protected WhiteSelfReferenceCQ _conditionQueryWhiteSelfReferenceAsDirectParent;
    public WhiteSelfReferenceCQ getConditionQueryWhiteSelfReferenceAsDirectParent() {
        if (_conditionQueryWhiteSelfReferenceAsDirectParent == null) {
            _conditionQueryWhiteSelfReferenceAsDirectParent = xcreateQueryWhiteSelfReferenceAsDirectParent();
            xsetupOuterJoinWhiteSelfReferenceAsDirectParent();
        }
        return _conditionQueryWhiteSelfReferenceAsDirectParent;
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReferenceAsDirectParent() {
        String nrp = resolveNextRelationPath("white_self_reference_ref_one", "whiteSelfReferenceAsDirectParent");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSelfReferenceCQ cq = new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSelfReferenceAsDirectParent");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSelfReferenceAsDirectParent() {
        WhiteSelfReferenceCQ cq = getConditionQueryWhiteSelfReferenceAsDirectParent();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("SELF_REFERENCE_ID", "PARENT_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSelfReferenceAsDirectParent");
    }
    public boolean hasConditionQueryWhiteSelfReferenceAsDirectParent() {
        return _conditionQueryWhiteSelfReferenceAsDirectParent != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteSelfReferenceRefOneCQ> _scalarConditionMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSelfReferenceRefOneCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSelfReferenceRefOneCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceRefOneCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSelfReferenceRefOneCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSelfReferenceRefOneCQ sq) {
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
    protected Map<String, WhiteSelfReferenceRefOneCQ> _myselfExistsMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSelfReferenceRefOneCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSelfReferenceRefOneCQ> _myselfInScopeMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSelfReferenceRefOneCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSelfReferenceRefOneCB.class.getName(); }
    protected String xCQ() { return WhiteSelfReferenceRefOneCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
