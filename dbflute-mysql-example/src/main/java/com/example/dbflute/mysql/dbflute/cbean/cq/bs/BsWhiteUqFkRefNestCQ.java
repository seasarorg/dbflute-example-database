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
 * The base condition-query of white_uq_fk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkRefNestCQ extends AbstractBsWhiteUqFkRefNestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefNestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefNestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk_ref_nest) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkRefNestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkRefNestCIQ xcreateCIQ() {
        WhiteUqFkRefNestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkRefNestCIQ xnewCIQ() {
        return new WhiteUqFkRefNestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk_ref_nest on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkRefNestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkRefNestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqFkRefNestId;
    public ConditionValue getUqFkRefNestId() {
        if (_uqFkRefNestId == null) { _uqFkRefNestId = nCV(); }
        return _uqFkRefNestId;
    }
    protected ConditionValue getCValueUqFkRefNestId() { return getUqFkRefNestId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_UqFkRefNestId_Asc() { regOBA("UQ_FK_REF_NEST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_UqFkRefNestId_Desc() { regOBD("UQ_FK_REF_NEST_ID"); return this; }

    protected ConditionValue _compoundUqFirstCode;
    public ConditionValue getCompoundUqFirstCode() {
        if (_compoundUqFirstCode == null) { _compoundUqFirstCode = nCV(); }
        return _compoundUqFirstCode;
    }
    protected ConditionValue getCValueCompoundUqFirstCode() { return getCompoundUqFirstCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

    protected ConditionValue _compoundUqSecondCode;
    public ConditionValue getCompoundUqSecondCode() {
        if (_compoundUqSecondCode == null) { _compoundUqSecondCode = nCV(); }
        return _compoundUqSecondCode;
    }
    protected ConditionValue getCValueCompoundUqSecondCode() { return getCompoundUqSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
    public BsWhiteUqFkRefNestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqFkRefNestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteUqFkRefNestCQ bq = (WhiteUqFkRefNestCQ)bqs;
        WhiteUqFkRefNestCQ uq = (WhiteUqFkRefNestCQ)uqs;
        if (bq.hasConditionQueryWhiteUqFkRef()) {
            uq.queryWhiteUqFkRef().reflectRelationOnUnionQuery(bq.queryWhiteUqFkRef(), uq.queryWhiteUqFkRef());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkRefCQ queryWhiteUqFkRef() {
        return getConditionQueryWhiteUqFkRef();
    }
    protected WhiteUqFkRefCQ _conditionQueryWhiteUqFkRef;
    public WhiteUqFkRefCQ getConditionQueryWhiteUqFkRef() {
        if (_conditionQueryWhiteUqFkRef == null) {
            _conditionQueryWhiteUqFkRef = xcreateQueryWhiteUqFkRef();
            xsetupOuterJoinWhiteUqFkRef();
        }
        return _conditionQueryWhiteUqFkRef;
    }
    protected WhiteUqFkRefCQ xcreateQueryWhiteUqFkRef() {
        String nrp = resolveNextRelationPath("white_uq_fk_ref_nest", "whiteUqFkRef");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqFkRefCQ cq = new WhiteUqFkRefCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqFkRef");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqFkRef() {
        WhiteUqFkRefCQ cq = getConditionQueryWhiteUqFkRef();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE");
        joinOnMap.put("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqFkRef");
    }
    public boolean hasConditionQueryWhiteUqFkRef() {
        return _conditionQueryWhiteUqFkRef != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteUqFkRefNestCQ> _scalarConditionMap;
    public Map<String, WhiteUqFkRefNestCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqFkRefNestCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqFkRefNestCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqFkRefNestCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqFkRefNestCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteUqFkRefNestCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqFkRefNestCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqFkRefNestCQ sq) {
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
    protected Map<String, WhiteUqFkRefNestCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkRefNestCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqFkRefNestCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqFkRefNestCQ> _myselfInScopeMap;
    public Map<String, WhiteUqFkRefNestCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqFkRefNestCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkRefNestCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkRefNestCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
