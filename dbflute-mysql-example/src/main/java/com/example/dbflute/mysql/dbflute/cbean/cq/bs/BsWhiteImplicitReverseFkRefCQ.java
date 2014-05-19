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
 * The base condition-query of white_implicit_reverse_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitReverseFkRefCQ extends AbstractBsWhiteImplicitReverseFkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitReverseFkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitReverseFkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_reverse_fk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitReverseFkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitReverseFkRefCIQ xcreateCIQ() {
        WhiteImplicitReverseFkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitReverseFkRefCIQ xnewCIQ() {
        return new WhiteImplicitReverseFkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_reverse_fk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitReverseFkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitReverseFkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _whiteImplicitReverseFkRefId;
    public ConditionValue getWhiteImplicitReverseFkRefId() {
        if (_whiteImplicitReverseFkRefId == null) { _whiteImplicitReverseFkRefId = nCV(); }
        return _whiteImplicitReverseFkRefId;
    }
    protected ConditionValue getCValueWhiteImplicitReverseFkRefId() { return getWhiteImplicitReverseFkRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_WhiteImplicitReverseFkRefId_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_WhiteImplicitReverseFkRefId_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_REF_ID"); return this; }

    protected ConditionValue _whiteImplicitReverseFkId;
    public ConditionValue getWhiteImplicitReverseFkId() {
        if (_whiteImplicitReverseFkId == null) { _whiteImplicitReverseFkId = nCV(); }
        return _whiteImplicitReverseFkId;
    }
    protected ConditionValue getCValueWhiteImplicitReverseFkId() { return getWhiteImplicitReverseFkId(); }

    protected Map<String, WhiteImplicitReverseFkCQ> _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkMap;
    public Map<String, WhiteImplicitReverseFkCQ> getWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFk() { return _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkMap; }
    public String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFk(WhiteImplicitReverseFkCQ sq) {
        if (_whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkMap == null) { _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkMap.size() + 1);
        _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkMap.put(ky, sq); return "whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFk." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkCQ> _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkMap;
    public Map<String, WhiteImplicitReverseFkCQ> getWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFk() { return _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkMap; }
    public String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFk(WhiteImplicitReverseFkCQ sq) {
        if (_whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkMap == null) { _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkMap.size() + 1);
        _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkMap.put(ky, sq); return "whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFk." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_WhiteImplicitReverseFkId_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ, NotNull, INT(10), FK to white_implicit_reverse_fk}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_WhiteImplicitReverseFkId_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    protected ConditionValue _validBeginDate;
    public ConditionValue getValidBeginDate() {
        if (_validBeginDate == null) { _validBeginDate = nCV(); }
        return _validBeginDate;
    }
    protected ConditionValue getCValueValidBeginDate() { return getValidBeginDate(); }

    /** 
     * Add order-by as ascend. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_ValidBeginDate_Asc() { regOBA("VALID_BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * VALID_BEGIN_DATE: {UQ+, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_ValidBeginDate_Desc() { regOBD("VALID_BEGIN_DATE"); return this; }

    protected ConditionValue _validEndDate;
    public ConditionValue getValidEndDate() {
        if (_validEndDate == null) { _validEndDate = nCV(); }
        return _validEndDate;
    }
    protected ConditionValue getCValueValidEndDate() { return getValidEndDate(); }

    /** 
     * Add order-by as ascend. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_ValidEndDate_Asc() { regOBA("VALID_END_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkRefCQ addOrderBy_ValidEndDate_Desc() { regOBD("VALID_END_DATE"); return this; }

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
    public BsWhiteImplicitReverseFkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteImplicitReverseFkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitReverseFkRefCQ bq = (WhiteImplicitReverseFkRefCQ)bqs;
        WhiteImplicitReverseFkRefCQ uq = (WhiteImplicitReverseFkRefCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitReverseFk()) {
            uq.queryWhiteImplicitReverseFk().reflectRelationOnUnionQuery(bq.queryWhiteImplicitReverseFk(), uq.queryWhiteImplicitReverseFk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_reverse_fk by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFk'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitReverseFkCQ queryWhiteImplicitReverseFk() {
        return getConditionQueryWhiteImplicitReverseFk();
    }
    protected WhiteImplicitReverseFkCQ _conditionQueryWhiteImplicitReverseFk;
    public WhiteImplicitReverseFkCQ getConditionQueryWhiteImplicitReverseFk() {
        if (_conditionQueryWhiteImplicitReverseFk == null) {
            _conditionQueryWhiteImplicitReverseFk = xcreateQueryWhiteImplicitReverseFk();
            xsetupOuterJoinWhiteImplicitReverseFk();
        }
        return _conditionQueryWhiteImplicitReverseFk;
    }
    protected WhiteImplicitReverseFkCQ xcreateQueryWhiteImplicitReverseFk() {
        String nrp = resolveNextRelationPath("white_implicit_reverse_fk_ref", "whiteImplicitReverseFk");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitReverseFkCQ cq = new WhiteImplicitReverseFkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitReverseFk");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitReverseFk() {
        WhiteImplicitReverseFkCQ cq = getConditionQueryWhiteImplicitReverseFk();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitReverseFk");
    }
    public boolean hasConditionQueryWhiteImplicitReverseFk() {
        return _conditionQueryWhiteImplicitReverseFk != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteImplicitReverseFkRefCQ> _scalarConditionMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteImplicitReverseFkRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteImplicitReverseFkRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteImplicitReverseFkRefCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteImplicitReverseFkRefCQ sq) {
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
    protected Map<String, WhiteImplicitReverseFkRefCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteImplicitReverseFkRefCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteImplicitReverseFkRefCQ> _myselfInScopeMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteImplicitReverseFkRefCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitReverseFkRefCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitReverseFkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
