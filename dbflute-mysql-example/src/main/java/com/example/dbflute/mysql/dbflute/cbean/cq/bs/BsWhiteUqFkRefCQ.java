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
 * The base condition-query of white_uq_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkRefCQ extends AbstractBsWhiteUqFkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkRefCIQ xcreateCIQ() {
        WhiteUqFkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkRefCIQ xnewCIQ() {
        return new WhiteUqFkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqFkRefId;
    public ConditionValue getUqFkRefId() {
        if (_uqFkRefId == null) { _uqFkRefId = nCV(); }
        return _uqFkRefId;
    }
    protected ConditionValue getCValueUqFkRefId() { return getUqFkRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_UqFkRefId_Asc() { regOBA("UQ_FK_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_UqFkRefId_Desc() { regOBD("UQ_FK_REF_ID"); return this; }

    protected ConditionValue _fkToPkId;
    public ConditionValue getFkToPkId() {
        if (_fkToPkId == null) { _fkToPkId = nCV(); }
        return _fkToPkId;
    }
    protected ConditionValue getCValueFkToPkId() { return getFkToPkId(); }

    protected Map<String, WhiteUqFkCQ> _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap;
    public Map<String, WhiteUqFkCQ> getFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId() { return _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap; }
    public String keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ sq) {
        if (_fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap == null) { _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap.size() + 1);
        _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap.put(ky, sq); return "fkToPkId_InScopeRelation_WhiteUqFkByFkToPkId." + ky;
    }

    protected Map<String, WhiteUqFkCQ> _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap;
    public Map<String, WhiteUqFkCQ> getFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId() { return _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap; }
    public String keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ sq) {
        if (_fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap == null) { _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap.size() + 1);
        _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap.put(ky, sq); return "fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToPkId_Asc() { regOBA("FK_TO_PK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToPkId_Desc() { regOBD("FK_TO_PK_ID"); return this; }

    protected ConditionValue _fkToUqCode;
    public ConditionValue getFkToUqCode() {
        if (_fkToUqCode == null) { _fkToUqCode = nCV(); }
        return _fkToUqCode;
    }
    protected ConditionValue getCValueFkToUqCode() { return getFkToUqCode(); }

    protected Map<String, WhiteUqFkCQ> _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap;
    public Map<String, WhiteUqFkCQ> getFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode() { return _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap; }
    public String keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ sq) {
        if (_fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap == null) { _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap.size() + 1);
        _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap.put(ky, sq); return "fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode." + ky;
    }

    protected Map<String, WhiteUqFkCQ> _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap;
    public Map<String, WhiteUqFkCQ> getFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode() { return _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap; }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ sq) {
        if (_fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap == null) { _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap.size() + 1);
        _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap.put(ky, sq); return "fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToUqCode_Asc() { regOBA("FK_TO_UQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToUqCode_Desc() { regOBD("FK_TO_UQ_CODE"); return this; }

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
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

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
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
    public BsWhiteUqFkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqFkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteUqFkRefCQ bq = (WhiteUqFkRefCQ)bqs;
        WhiteUqFkRefCQ uq = (WhiteUqFkRefCQ)uqs;
        if (bq.hasConditionQueryWhiteUqFkByFkToPkId()) {
            uq.queryWhiteUqFkByFkToPkId().reflectRelationOnUnionQuery(bq.queryWhiteUqFkByFkToPkId(), uq.queryWhiteUqFkByFkToPkId());
        }
        if (bq.hasConditionQueryWhiteUqFkByFkToUqCode()) {
            uq.queryWhiteUqFkByFkToUqCode().reflectRelationOnUnionQuery(bq.queryWhiteUqFkByFkToUqCode(), uq.queryWhiteUqFkByFkToUqCode());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkCQ queryWhiteUqFkByFkToPkId() {
        return getConditionQueryWhiteUqFkByFkToPkId();
    }
    protected WhiteUqFkCQ _conditionQueryWhiteUqFkByFkToPkId;
    public WhiteUqFkCQ getConditionQueryWhiteUqFkByFkToPkId() {
        if (_conditionQueryWhiteUqFkByFkToPkId == null) {
            _conditionQueryWhiteUqFkByFkToPkId = xcreateQueryWhiteUqFkByFkToPkId();
            xsetupOuterJoinWhiteUqFkByFkToPkId();
        }
        return _conditionQueryWhiteUqFkByFkToPkId;
    }
    protected WhiteUqFkCQ xcreateQueryWhiteUqFkByFkToPkId() {
        String nrp = resolveNextRelationPath("white_uq_fk_ref", "whiteUqFkByFkToPkId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqFkCQ cq = new WhiteUqFkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqFkByFkToPkId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqFkByFkToPkId() {
        WhiteUqFkCQ cq = getConditionQueryWhiteUqFkByFkToPkId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_PK_ID", "UQ_FK_ID");
        registerOuterJoin(cq, joinOnMap, "whiteUqFkByFkToPkId");
    }
    public boolean hasConditionQueryWhiteUqFkByFkToPkId() {
        return _conditionQueryWhiteUqFkByFkToPkId != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkCQ queryWhiteUqFkByFkToUqCode() {
        return getConditionQueryWhiteUqFkByFkToUqCode();
    }
    protected WhiteUqFkCQ _conditionQueryWhiteUqFkByFkToUqCode;
    public WhiteUqFkCQ getConditionQueryWhiteUqFkByFkToUqCode() {
        if (_conditionQueryWhiteUqFkByFkToUqCode == null) {
            _conditionQueryWhiteUqFkByFkToUqCode = xcreateQueryWhiteUqFkByFkToUqCode();
            xsetupOuterJoinWhiteUqFkByFkToUqCode();
        }
        return _conditionQueryWhiteUqFkByFkToUqCode;
    }
    protected WhiteUqFkCQ xcreateQueryWhiteUqFkByFkToUqCode() {
        String nrp = resolveNextRelationPath("white_uq_fk_ref", "whiteUqFkByFkToUqCode");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqFkCQ cq = new WhiteUqFkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqFkByFkToUqCode");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqFkByFkToUqCode() {
        WhiteUqFkCQ cq = getConditionQueryWhiteUqFkByFkToUqCode();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_UQ_CODE", "UQ_FK_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqFkByFkToUqCode");
    }
    public boolean hasConditionQueryWhiteUqFkByFkToUqCode() {
        return _conditionQueryWhiteUqFkByFkToUqCode != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteUqFkRefCQ> _scalarConditionMap;
    public Map<String, WhiteUqFkRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqFkRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqFkRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqFkRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqFkRefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteUqFkRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqFkRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqFkRefCQ sq) {
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
    protected Map<String, WhiteUqFkRefCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqFkRefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqFkRefCQ> _myselfInScopeMap;
    public Map<String, WhiteUqFkRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqFkRefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select ... from white_uq_fk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteUqFkRefNestList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefNestList(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefNestCB>", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", pp, "whiteUqFkRefNestList");
    }
    protected Map<String, WhiteUqFkRefNestCQ> _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap;
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList() { return _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList." + ky;
    }

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select ... from white_uq_fk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteUqFkRefNestList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkRefNestList(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefNestCB>", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", pp, "whiteUqFkRefNestList");
    }
    protected Map<String, WhiteUqFkRefNestCQ> _twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestListMap;
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList() { return _twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestListMap; }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) {
        if (_twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestListMap == null) { _twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestListMap.size() + 1);
        _twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestListMap.put(ky, sq); return "twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList." + ky;
    }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveWhiteUqFkRefNestList(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", pp, "whiteUqFkRefNestList", al, op);
    }
    protected Map<String, WhiteUqFkRefNestCQ> _twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestListMap;
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList() { return _twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestListMap; }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) {
        if (_twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestListMap == null) { _twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestListMap.size() + 1);
        _twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestListMap.put(ky, sq); return "twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList." + ky;
    }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_uq_fk_ref_nest where ...)} <br />
     * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteUqFkRefNestList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefNestCB> derivedWhiteUqFkRefNestList() {
        return xcreateQDRFunctionWhiteUqFkRefNestList();
    }
    protected HpQDRFunction<WhiteUqFkRefNestCB> xcreateQDRFunctionWhiteUqFkRefNestList() {
        return new HpQDRFunction<WhiteUqFkRefNestCB>(new HpQDRSetupper<WhiteUqFkRefNestCB>() {
            public void setup(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteUqFkRefNestList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteUqFkRefNestList(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList(cb.query()); // for saving query-value.
        String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", sqpp, "whiteUqFkRefNestList", rd, vl, prpp, op);
    }
    protected Map<String, WhiteUqFkRefNestCQ> _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListMap;
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList() { return _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListMap.put(ky, sq); return "twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList." + ky;
    }
    protected Map<String, Object> _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameterMap;
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter() { return _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameterMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter(Object vl) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameterMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameterMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameterMap.put(ky, vl); return "twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
