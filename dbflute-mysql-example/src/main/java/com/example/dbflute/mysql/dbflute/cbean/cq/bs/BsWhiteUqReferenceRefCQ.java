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
 * The base condition-query of white_uq_reference_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqReferenceRefCQ extends AbstractBsWhiteUqReferenceRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqReferenceRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqReferenceRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_reference_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqReferenceRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqReferenceRefCIQ xcreateCIQ() {
        WhiteUqReferenceRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqReferenceRefCIQ xnewCIQ() {
        return new WhiteUqReferenceRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_reference_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqReferenceRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqReferenceRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqReferenceRefId;
    public ConditionValue getUqReferenceRefId() {
        if (_uqReferenceRefId == null) { _uqReferenceRefId = nCV(); }
        return _uqReferenceRefId;
    }
    protected ConditionValue getCValueUqReferenceRefId() { return getUqReferenceRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_UqReferenceRefId_Asc() { regOBA("UQ_REFERENCE_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_UqReferenceRefId_Desc() { regOBD("UQ_REFERENCE_REF_ID"); return this; }

    protected ConditionValue _fkToPkId;
    public ConditionValue getFkToPkId() {
        if (_fkToPkId == null) { _fkToPkId = nCV(); }
        return _fkToPkId;
    }
    protected ConditionValue getCValueFkToPkId() { return getFkToPkId(); }

    protected Map<String, WhiteUqReferenceCQ> _fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkIdMap;
    public Map<String, WhiteUqReferenceCQ> getFkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkId() { return _fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkIdMap; }
    public String keepFkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkId(WhiteUqReferenceCQ subQuery) {
        if (_fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkIdMap == null) { _fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkIdMap.size() + 1);
        _fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkIdMap.put(key, subQuery); return "fkToPkId_InScopeRelation_WhiteUqReferenceByFkToPkId." + key;
    }

    protected Map<String, WhiteUqReferenceCQ> _fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkIdMap;
    public Map<String, WhiteUqReferenceCQ> getFkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkId() { return _fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkIdMap; }
    public String keepFkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkId(WhiteUqReferenceCQ subQuery) {
        if (_fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkIdMap == null) { _fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkIdMap.size() + 1);
        _fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkIdMap.put(key, subQuery); return "fkToPkId_NotInScopeRelation_WhiteUqReferenceByFkToPkId." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_reference}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_FkToPkId_Asc() { regOBA("FK_TO_PK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_reference}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_FkToPkId_Desc() { regOBD("FK_TO_PK_ID"); return this; }

    protected ConditionValue _fkToUqCode;
    public ConditionValue getFkToUqCode() {
        if (_fkToUqCode == null) { _fkToUqCode = nCV(); }
        return _fkToUqCode;
    }
    protected ConditionValue getCValueFkToUqCode() { return getFkToUqCode(); }

    protected Map<String, WhiteUqReferenceCQ> _fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCodeMap;
    public Map<String, WhiteUqReferenceCQ> getFkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCode() { return _fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCodeMap; }
    public String keepFkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCode(WhiteUqReferenceCQ subQuery) {
        if (_fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCodeMap == null) { _fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCodeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCodeMap.size() + 1);
        _fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCodeMap.put(key, subQuery); return "fkToUqCode_InScopeRelation_WhiteUqReferenceByFkToUqCode." + key;
    }

    protected Map<String, WhiteUqReferenceCQ> _fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCodeMap;
    public Map<String, WhiteUqReferenceCQ> getFkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCode() { return _fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCodeMap; }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCode(WhiteUqReferenceCQ subQuery) {
        if (_fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCodeMap == null) { _fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCodeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCodeMap.size() + 1);
        _fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCodeMap.put(key, subQuery); return "fkToUqCode_NotInScopeRelation_WhiteUqReferenceByFkToUqCode." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_FkToUqCode_Asc() { regOBA("FK_TO_UQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_FkToUqCode_Desc() { regOBD("FK_TO_UQ_CODE"); return this; }

    protected ConditionValue _compoundUqFirstCode;
    public ConditionValue getCompoundUqFirstCode() {
        if (_compoundUqFirstCode == null) { _compoundUqFirstCode = nCV(); }
        return _compoundUqFirstCode;
    }
    protected ConditionValue getCValueCompoundUqFirstCode() { return getCompoundUqFirstCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

    protected ConditionValue _compoundUqSecondCode;
    public ConditionValue getCompoundUqSecondCode() {
        if (_compoundUqSecondCode == null) { _compoundUqSecondCode = nCV(); }
        return _compoundUqSecondCode;
    }
    protected ConditionValue getCValueCompoundUqSecondCode() { return getCompoundUqSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteUqReferenceRefCQ baseQuery = (WhiteUqReferenceRefCQ)baseQueryAsSuper;
        WhiteUqReferenceRefCQ unionQuery = (WhiteUqReferenceRefCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteUqReferenceByFkToPkId()) {
            unionQuery.queryWhiteUqReferenceByFkToPkId().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqReferenceByFkToPkId(), unionQuery.queryWhiteUqReferenceByFkToPkId());
        }
        if (baseQuery.hasConditionQueryWhiteUqReferenceByFkToUqCode()) {
            unionQuery.queryWhiteUqReferenceByFkToUqCode().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqReferenceByFkToUqCode(), unionQuery.queryWhiteUqReferenceByFkToUqCode());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_reference by my FK_TO_PK_ID, named 'whiteUqReferenceByFkToPkId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqReferenceCQ queryWhiteUqReferenceByFkToPkId() {
        return getConditionQueryWhiteUqReferenceByFkToPkId();
    }
    protected WhiteUqReferenceCQ _conditionQueryWhiteUqReferenceByFkToPkId;
    public WhiteUqReferenceCQ getConditionQueryWhiteUqReferenceByFkToPkId() {
        if (_conditionQueryWhiteUqReferenceByFkToPkId == null) {
            _conditionQueryWhiteUqReferenceByFkToPkId = xcreateQueryWhiteUqReferenceByFkToPkId();
            xsetupOuterJoinWhiteUqReferenceByFkToPkId();
        }
        return _conditionQueryWhiteUqReferenceByFkToPkId;
    }
    protected WhiteUqReferenceCQ xcreateQueryWhiteUqReferenceByFkToPkId() {
        String nrp = resolveNextRelationPath("white_uq_reference_ref", "whiteUqReferenceByFkToPkId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqReferenceCQ cq = new WhiteUqReferenceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqReferenceByFkToPkId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqReferenceByFkToPkId() {
        WhiteUqReferenceCQ cq = getConditionQueryWhiteUqReferenceByFkToPkId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_PK_ID", "UQ_REFERENCE_ID");
        registerOuterJoin(cq, joinOnMap, "whiteUqReferenceByFkToPkId");
    }
    public boolean hasConditionQueryWhiteUqReferenceByFkToPkId() {
        return _conditionQueryWhiteUqReferenceByFkToPkId != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_uq_reference by my FK_TO_UQ_CODE, named 'whiteUqReferenceByFkToUqCode'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqReferenceCQ queryWhiteUqReferenceByFkToUqCode() {
        return getConditionQueryWhiteUqReferenceByFkToUqCode();
    }
    protected WhiteUqReferenceCQ _conditionQueryWhiteUqReferenceByFkToUqCode;
    public WhiteUqReferenceCQ getConditionQueryWhiteUqReferenceByFkToUqCode() {
        if (_conditionQueryWhiteUqReferenceByFkToUqCode == null) {
            _conditionQueryWhiteUqReferenceByFkToUqCode = xcreateQueryWhiteUqReferenceByFkToUqCode();
            xsetupOuterJoinWhiteUqReferenceByFkToUqCode();
        }
        return _conditionQueryWhiteUqReferenceByFkToUqCode;
    }
    protected WhiteUqReferenceCQ xcreateQueryWhiteUqReferenceByFkToUqCode() {
        String nrp = resolveNextRelationPath("white_uq_reference_ref", "whiteUqReferenceByFkToUqCode");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqReferenceCQ cq = new WhiteUqReferenceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqReferenceByFkToUqCode");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqReferenceByFkToUqCode() {
        WhiteUqReferenceCQ cq = getConditionQueryWhiteUqReferenceByFkToUqCode();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_UQ_CODE", "UQ_REFERENCE_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqReferenceByFkToUqCode");
    }
    public boolean hasConditionQueryWhiteUqReferenceByFkToUqCode() {
        return _conditionQueryWhiteUqReferenceByFkToUqCode != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteUqReferenceRefCQ> _scalarConditionMap;
    public Map<String, WhiteUqReferenceRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqReferenceRefCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqReferenceRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqReferenceRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqReferenceRefCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqReferenceRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqReferenceRefCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteUqReferenceRefCQ> _myselfExistsMap;
    public Map<String, WhiteUqReferenceRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqReferenceRefCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqReferenceRefCQ> _myselfInScopeMap;
    public Map<String, WhiteUqReferenceRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqReferenceRefCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                       Compound PK's Exists Referrer
    //                                                       =============================
    /**
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from white_uq_reference_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteUqReferenceRefNestList for 'exists'. (NotNull)
     */
    public void existsWhiteUqReferenceRefNestList(SubQuery<WhiteUqReferenceRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefNestCB>", subQuery);
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepTwoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", subQueryPropertyName, "whiteUqReferenceRefNestList");
    }
    protected Map<String, WhiteUqReferenceRefNestCQ> _twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestListMap;
    public Map<String, WhiteUqReferenceRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestList() { return _twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestList(WhiteUqReferenceRefNestCQ subQuery) {
        if (_twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestListMap.put(key, subQuery); return "twoOrMorePk_ExistsReferrer_WhiteUqReferenceRefNestList." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqReferenceRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqReferenceRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
