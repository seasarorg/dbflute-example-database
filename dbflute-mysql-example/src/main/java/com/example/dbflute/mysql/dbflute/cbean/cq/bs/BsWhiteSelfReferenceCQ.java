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
 * The base condition-query of white_self_reference.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReferenceCQ extends AbstractBsWhiteSelfReferenceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_self_reference) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSelfReferenceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSelfReferenceCIQ xcreateCIQ() {
        WhiteSelfReferenceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSelfReferenceCIQ xnewCIQ() {
        return new WhiteSelfReferenceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_self_reference on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSelfReferenceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSelfReferenceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList() { return _selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfListMap; }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfListMap == null) { _selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfListMap.size() + 1);
        _selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfListMap.put(ky, sq); return "selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList." + ky;
    }

    protected Map<String, WhiteSelfReferenceRefOneCQ> _selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOneMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getSelfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOne() { return _selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOneMap; }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq) {
        if (_selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOneMap == null) { _selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOneMap.size() + 1);
        _selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOneMap.put(ky, sq); return "selfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOne." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList() { return _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfListMap; }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfListMap == null) { _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfListMap.size() + 1);
        _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfListMap.put(ky, sq); return "selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList." + ky;
    }

    protected Map<String, WhiteSelfReferenceRefOneCQ> _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOneMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOne() { return _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOneMap; }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq) {
        if (_selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOneMap == null) { _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOneMap.size() + 1);
        _selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOneMap.put(ky, sq); return "selfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOne." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList() { return _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfListMap; }
    public String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfListMap == null) { _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfListMap.size() + 1);
        _selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfListMap.put(ky, sq); return "selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_InScopeRelation_WhiteSelfReferenceSelfList() { return _selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfListMap; }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfListMap == null) { _selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfListMap.size() + 1);
        _selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfListMap.put(ky, sq); return "selfReferenceId_InScopeRelation_WhiteSelfReferenceSelfList." + ky;
    }

    protected Map<String, WhiteSelfReferenceRefOneCQ> _selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOneMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getSelfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOne() { return _selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOneMap; }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq) {
        if (_selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOneMap == null) { _selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOneMap.size() + 1);
        _selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOneMap.put(ky, sq); return "selfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOne." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfList() { return _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfListMap; }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfListMap == null) { _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfListMap.size() + 1);
        _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfListMap.put(ky, sq); return "selfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfList." + ky;
    }

    protected Map<String, WhiteSelfReferenceRefOneCQ> _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOneMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> getSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOne() { return _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOneMap; }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq) {
        if (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOneMap == null) { _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOneMap.size() + 1);
        _selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOneMap.put(ky, sq); return "selfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOne." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListMap;
    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList() { return _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListMap; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) {
        if (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListMap == null) { _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListMap.size() + 1);
        _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListMap.put(ky, sq); return "selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList." + ky;
    }
    protected Map<String, Object> _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameterMap;
    public Map<String, Object> getSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter() { return _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameterMap; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(Object vl) {
        if (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameterMap == null) { _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameterMap.size() + 1);
        _selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameterMap.put(ky, vl); return "selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceId_Asc() { regOBA("SELF_REFERENCE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceId_Desc() { regOBD("SELF_REFERENCE_ID"); return this; }

    protected ConditionValue _selfReferenceName;
    public ConditionValue getSelfReferenceName() {
        if (_selfReferenceName == null) { _selfReferenceName = nCV(); }
        return _selfReferenceName;
    }
    protected ConditionValue getCValueSelfReferenceName() { return getSelfReferenceName(); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceName_Asc() { regOBA("SELF_REFERENCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceName_Desc() { regOBD("SELF_REFERENCE_NAME"); return this; }

    protected ConditionValue _parentId;
    public ConditionValue getParentId() {
        if (_parentId == null) { _parentId = nCV(); }
        return _parentId;
    }
    protected ConditionValue getCValueParentId() { return getParentId(); }

    protected Map<String, WhiteSelfReferenceCQ> _parentId_InScopeRelation_WhiteSelfReferenceSelfMap;
    public Map<String, WhiteSelfReferenceCQ> getParentId_InScopeRelation_WhiteSelfReferenceSelf() { return _parentId_InScopeRelation_WhiteSelfReferenceSelfMap; }
    public String keepParentId_InScopeRelation_WhiteSelfReferenceSelf(WhiteSelfReferenceCQ sq) {
        if (_parentId_InScopeRelation_WhiteSelfReferenceSelfMap == null) { _parentId_InScopeRelation_WhiteSelfReferenceSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_parentId_InScopeRelation_WhiteSelfReferenceSelfMap.size() + 1);
        _parentId_InScopeRelation_WhiteSelfReferenceSelfMap.put(ky, sq); return "parentId_InScopeRelation_WhiteSelfReferenceSelf." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _parentId_NotInScopeRelation_WhiteSelfReferenceSelfMap;
    public Map<String, WhiteSelfReferenceCQ> getParentId_NotInScopeRelation_WhiteSelfReferenceSelf() { return _parentId_NotInScopeRelation_WhiteSelfReferenceSelfMap; }
    public String keepParentId_NotInScopeRelation_WhiteSelfReferenceSelf(WhiteSelfReferenceCQ sq) {
        if (_parentId_NotInScopeRelation_WhiteSelfReferenceSelfMap == null) { _parentId_NotInScopeRelation_WhiteSelfReferenceSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_parentId_NotInScopeRelation_WhiteSelfReferenceSelfMap.size() + 1);
        _parentId_NotInScopeRelation_WhiteSelfReferenceSelfMap.put(ky, sq); return "parentId_NotInScopeRelation_WhiteSelfReferenceSelf." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_ParentId_Asc() { regOBA("PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_ParentId_Desc() { regOBD("PARENT_ID"); return this; }

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
    public BsWhiteSelfReferenceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSelfReferenceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSelfReferenceCQ bq = (WhiteSelfReferenceCQ)bqs;
        WhiteSelfReferenceCQ uq = (WhiteSelfReferenceCQ)uqs;
        if (bq.hasConditionQueryWhiteSelfReferenceSelf()) {
            uq.queryWhiteSelfReferenceSelf().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceSelf(), uq.queryWhiteSelfReferenceSelf());
        }
        if (bq.hasConditionQueryWhiteSelfReferenceRefOneByParentId()) {
            uq.queryWhiteSelfReferenceRefOneByParentId().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceRefOneByParentId(), uq.queryWhiteSelfReferenceRefOneByParentId());
        }
        if (bq.hasConditionQueryWhiteSelfReferenceRefOneAsOne()) {
            uq.queryWhiteSelfReferenceRefOneAsOne().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceRefOneAsOne(), uq.queryWhiteSelfReferenceRefOneAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReferenceSelf() {
        return getConditionQueryWhiteSelfReferenceSelf();
    }
    protected WhiteSelfReferenceCQ _conditionQueryWhiteSelfReferenceSelf;
    public WhiteSelfReferenceCQ getConditionQueryWhiteSelfReferenceSelf() {
        if (_conditionQueryWhiteSelfReferenceSelf == null) {
            _conditionQueryWhiteSelfReferenceSelf = xcreateQueryWhiteSelfReferenceSelf();
            xsetupOuterJoinWhiteSelfReferenceSelf();
        }
        return _conditionQueryWhiteSelfReferenceSelf;
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReferenceSelf() {
        String nrp = resolveNextRelationPath("white_self_reference", "whiteSelfReferenceSelf");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSelfReferenceCQ cq = new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSelfReferenceSelf");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSelfReferenceSelf() {
        WhiteSelfReferenceCQ cq = getConditionQueryWhiteSelfReferenceSelf();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PARENT_ID", "SELF_REFERENCE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSelfReferenceSelf");
    }
    public boolean hasConditionQueryWhiteSelfReferenceSelf() {
        return _conditionQueryWhiteSelfReferenceSelf != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceRefOneCQ queryWhiteSelfReferenceRefOneByParentId() {
        return getConditionQueryWhiteSelfReferenceRefOneByParentId();
    }
    protected WhiteSelfReferenceRefOneCQ _conditionQueryWhiteSelfReferenceRefOneByParentId;
    public WhiteSelfReferenceRefOneCQ getConditionQueryWhiteSelfReferenceRefOneByParentId() {
        if (_conditionQueryWhiteSelfReferenceRefOneByParentId == null) {
            _conditionQueryWhiteSelfReferenceRefOneByParentId = xcreateQueryWhiteSelfReferenceRefOneByParentId();
            xsetupOuterJoinWhiteSelfReferenceRefOneByParentId();
        }
        return _conditionQueryWhiteSelfReferenceRefOneByParentId;
    }
    protected WhiteSelfReferenceRefOneCQ xcreateQueryWhiteSelfReferenceRefOneByParentId() {
        String nrp = resolveNextRelationPath("white_self_reference", "whiteSelfReferenceRefOneByParentId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSelfReferenceRefOneCQ cq = new WhiteSelfReferenceRefOneCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSelfReferenceRefOneByParentId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSelfReferenceRefOneByParentId() {
        WhiteSelfReferenceRefOneCQ cq = getConditionQueryWhiteSelfReferenceRefOneByParentId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PARENT_ID", "SELF_REFERENCE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSelfReferenceRefOneByParentId");
    }
    public boolean hasConditionQueryWhiteSelfReferenceRefOneByParentId() {
        return _conditionQueryWhiteSelfReferenceRefOneByParentId != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceRefOneCQ queryWhiteSelfReferenceRefOneAsOne() {
        return getConditionQueryWhiteSelfReferenceRefOneAsOne();
    }
    protected WhiteSelfReferenceRefOneCQ _conditionQueryWhiteSelfReferenceRefOneAsOne;
    public WhiteSelfReferenceRefOneCQ getConditionQueryWhiteSelfReferenceRefOneAsOne() {
        if (_conditionQueryWhiteSelfReferenceRefOneAsOne == null) {
            _conditionQueryWhiteSelfReferenceRefOneAsOne = xcreateQueryWhiteSelfReferenceRefOneAsOne();
            xsetupOuterJoinWhiteSelfReferenceRefOneAsOne();
        }
        return _conditionQueryWhiteSelfReferenceRefOneAsOne;
    }
    protected WhiteSelfReferenceRefOneCQ xcreateQueryWhiteSelfReferenceRefOneAsOne() {
        String nrp = resolveNextRelationPath("white_self_reference", "whiteSelfReferenceRefOneAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSelfReferenceRefOneCQ cq = new WhiteSelfReferenceRefOneCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSelfReferenceRefOneAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSelfReferenceRefOneAsOne() {
        WhiteSelfReferenceRefOneCQ cq = getConditionQueryWhiteSelfReferenceRefOneAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("SELF_REFERENCE_ID", "SELF_REFERENCE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSelfReferenceRefOneAsOne");
    }
    public boolean hasConditionQueryWhiteSelfReferenceRefOneAsOne() {
        return _conditionQueryWhiteSelfReferenceRefOneAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteSelfReferenceCQ> _scalarConditionMap;
    public Map<String, WhiteSelfReferenceCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSelfReferenceCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSelfReferenceCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSelfReferenceCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSelfReferenceCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSelfReferenceCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSelfReferenceCQ sq) {
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
    protected Map<String, WhiteSelfReferenceCQ> _myselfExistsMap;
    public Map<String, WhiteSelfReferenceCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSelfReferenceCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSelfReferenceCQ> _myselfInScopeMap;
    public Map<String, WhiteSelfReferenceCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSelfReferenceCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSelfReferenceCB.class.getName(); }
    protected String xCQ() { return WhiteSelfReferenceCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
