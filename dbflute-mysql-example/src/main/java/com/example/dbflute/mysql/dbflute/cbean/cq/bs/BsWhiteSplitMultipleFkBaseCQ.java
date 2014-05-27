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
 * The base condition-query of white_split_multiple_fk_base.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSplitMultipleFkBaseCQ extends AbstractBsWhiteSplitMultipleFkBaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkBaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSplitMultipleFkBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_split_multiple_fk_base) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSplitMultipleFkBaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSplitMultipleFkBaseCIQ xcreateCIQ() {
        WhiteSplitMultipleFkBaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSplitMultipleFkBaseCIQ xnewCIQ() {
        return new WhiteSplitMultipleFkBaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_split_multiple_fk_base on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSplitMultipleFkBaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSplitMultipleFkBaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _baseId;
    public ConditionValue getBaseId() {
        if (_baseId == null) { _baseId = nCV(); }
        return _baseId;
    }
    protected ConditionValue getCValueBaseId() { return getBaseId(); }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _baseId_ExistsReferrer_WhiteSplitMultipleFkChildListMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList() { return _baseId_ExistsReferrer_WhiteSplitMultipleFkChildListMap; }
    public String keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) {
        if (_baseId_ExistsReferrer_WhiteSplitMultipleFkChildListMap == null) { _baseId_ExistsReferrer_WhiteSplitMultipleFkChildListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_ExistsReferrer_WhiteSplitMultipleFkChildListMap.size() + 1);
        _baseId_ExistsReferrer_WhiteSplitMultipleFkChildListMap.put(ky, sq); return "baseId_ExistsReferrer_WhiteSplitMultipleFkChildList." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _baseId_NotExistsReferrer_WhiteSplitMultipleFkChildListMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList() { return _baseId_NotExistsReferrer_WhiteSplitMultipleFkChildListMap; }
    public String keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) {
        if (_baseId_NotExistsReferrer_WhiteSplitMultipleFkChildListMap == null) { _baseId_NotExistsReferrer_WhiteSplitMultipleFkChildListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_NotExistsReferrer_WhiteSplitMultipleFkChildListMap.size() + 1);
        _baseId_NotExistsReferrer_WhiteSplitMultipleFkChildListMap.put(ky, sq); return "baseId_NotExistsReferrer_WhiteSplitMultipleFkChildList." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildListMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList() { return _baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildListMap; }
    public String keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) {
        if (_baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildListMap == null) { _baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildListMap.size() + 1);
        _baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildListMap.put(ky, sq); return "baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _baseId_InScopeRelation_WhiteSplitMultipleFkChildListMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_InScopeRelation_WhiteSplitMultipleFkChildList() { return _baseId_InScopeRelation_WhiteSplitMultipleFkChildListMap; }
    public String keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) {
        if (_baseId_InScopeRelation_WhiteSplitMultipleFkChildListMap == null) { _baseId_InScopeRelation_WhiteSplitMultipleFkChildListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_InScopeRelation_WhiteSplitMultipleFkChildListMap.size() + 1);
        _baseId_InScopeRelation_WhiteSplitMultipleFkChildListMap.put(ky, sq); return "baseId_InScopeRelation_WhiteSplitMultipleFkChildList." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _baseId_NotInScopeRelation_WhiteSplitMultipleFkChildListMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList() { return _baseId_NotInScopeRelation_WhiteSplitMultipleFkChildListMap; }
    public String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) {
        if (_baseId_NotInScopeRelation_WhiteSplitMultipleFkChildListMap == null) { _baseId_NotInScopeRelation_WhiteSplitMultipleFkChildListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_NotInScopeRelation_WhiteSplitMultipleFkChildListMap.size() + 1);
        _baseId_NotInScopeRelation_WhiteSplitMultipleFkChildListMap.put(ky, sq); return "baseId_NotInScopeRelation_WhiteSplitMultipleFkChildList." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkChildCQ> _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListMap;
    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList() { return _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListMap; }
    public String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) {
        if (_baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListMap == null) { _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListMap.size() + 1);
        _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListMap.put(ky, sq); return "baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList." + ky;
    }
    protected Map<String, Object> _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameterMap;
    public Map<String, Object> getBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter() { return _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameterMap; }
    public String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(Object vl) {
        if (_baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameterMap == null) { _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameterMap.size() + 1);
        _baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameterMap.put(ky, vl); return "baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_BaseId_Asc() { regOBA("BASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_BaseId_Desc() { regOBD("BASE_ID"); return this; }

    protected ConditionValue _firstId;
    public ConditionValue getFirstId() {
        if (_firstId == null) { _firstId = nCV(); }
        return _firstId;
    }
    protected ConditionValue getCValueFirstId() { return getFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_FirstId_Asc() { regOBA("FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_FirstId_Desc() { regOBD("FIRST_ID"); return this; }

    protected ConditionValue _nextId;
    public ConditionValue getNextId() {
        if (_nextId == null) { _nextId = nCV(); }
        return _nextId;
    }
    protected ConditionValue getCValueNextId() { return getNextId(); }

    protected Map<String, WhiteSplitMultipleFkNextCQ> _nextId_InScopeRelation_WhiteSplitMultipleFkNextMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getNextId_InScopeRelation_WhiteSplitMultipleFkNext() { return _nextId_InScopeRelation_WhiteSplitMultipleFkNextMap; }
    public String keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq) {
        if (_nextId_InScopeRelation_WhiteSplitMultipleFkNextMap == null) { _nextId_InScopeRelation_WhiteSplitMultipleFkNextMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_nextId_InScopeRelation_WhiteSplitMultipleFkNextMap.size() + 1);
        _nextId_InScopeRelation_WhiteSplitMultipleFkNextMap.put(ky, sq); return "nextId_InScopeRelation_WhiteSplitMultipleFkNext." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkNextCQ> _nextId_NotInScopeRelation_WhiteSplitMultipleFkNextMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getNextId_NotInScopeRelation_WhiteSplitMultipleFkNext() { return _nextId_NotInScopeRelation_WhiteSplitMultipleFkNextMap; }
    public String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq) {
        if (_nextId_NotInScopeRelation_WhiteSplitMultipleFkNextMap == null) { _nextId_NotInScopeRelation_WhiteSplitMultipleFkNextMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_nextId_NotInScopeRelation_WhiteSplitMultipleFkNextMap.size() + 1);
        _nextId_NotInScopeRelation_WhiteSplitMultipleFkNextMap.put(ky, sq); return "nextId_NotInScopeRelation_WhiteSplitMultipleFkNext." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_NextId_Asc() { regOBA("NEXT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_NextId_Desc() { regOBD("NEXT_ID"); return this; }

    protected ConditionValue _splitName;
    public ConditionValue getSplitName() {
        if (_splitName == null) { _splitName = nCV(); }
        return _splitName;
    }
    protected ConditionValue getCValueSplitName() { return getSplitName(); }

    /** 
     * Add order-by as ascend. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_SplitName_Asc() { regOBA("SPLIT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkBaseCQ addOrderBy_SplitName_Desc() { regOBD("SPLIT_NAME"); return this; }

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
    public BsWhiteSplitMultipleFkBaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSplitMultipleFkBaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSplitMultipleFkBaseCQ bq = (WhiteSplitMultipleFkBaseCQ)bqs;
        WhiteSplitMultipleFkBaseCQ uq = (WhiteSplitMultipleFkBaseCQ)uqs;
        if (bq.hasConditionQueryWhiteSplitMultipleFkNext()) {
            uq.queryWhiteSplitMultipleFkNext().reflectRelationOnUnionQuery(bq.queryWhiteSplitMultipleFkNext(), uq.queryWhiteSplitMultipleFkNext());
        }
        if (bq.hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()) {
            uq.queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest().reflectRelationOnUnionQuery(bq.queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest(), uq.queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSplitMultipleFkNextCQ queryWhiteSplitMultipleFkNext() {
        return getConditionQueryWhiteSplitMultipleFkNext();
    }
    protected WhiteSplitMultipleFkNextCQ _conditionQueryWhiteSplitMultipleFkNext;
    public WhiteSplitMultipleFkNextCQ getConditionQueryWhiteSplitMultipleFkNext() {
        if (_conditionQueryWhiteSplitMultipleFkNext == null) {
            _conditionQueryWhiteSplitMultipleFkNext = xcreateQueryWhiteSplitMultipleFkNext();
            xsetupOuterJoinWhiteSplitMultipleFkNext();
        }
        return _conditionQueryWhiteSplitMultipleFkNext;
    }
    protected WhiteSplitMultipleFkNextCQ xcreateQueryWhiteSplitMultipleFkNext() {
        String nrp = resolveNextRelationPath("white_split_multiple_fk_base", "whiteSplitMultipleFkNext");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSplitMultipleFkNextCQ cq = new WhiteSplitMultipleFkNextCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSplitMultipleFkNext");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSplitMultipleFkNext() {
        WhiteSplitMultipleFkNextCQ cq = getConditionQueryWhiteSplitMultipleFkNext();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("NEXT_ID", "NEXT_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSplitMultipleFkNext");
    }
    public boolean hasConditionQueryWhiteSplitMultipleFkNext() {
        return _conditionQueryWhiteSplitMultipleFkNext != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSplitMultipleFkRefCQ queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        return getConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
    }
    protected WhiteSplitMultipleFkRefCQ _conditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest;
    public WhiteSplitMultipleFkRefCQ getConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        if (_conditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest == null) {
            _conditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest = xcreateQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
            xsetupOuterJoinWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
        }
        return _conditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest;
    }
    protected WhiteSplitMultipleFkRefCQ xcreateQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        String nrp = resolveNextRelationPath("white_split_multiple_fk_base", "whiteSplitMultipleFkRefAsSplitMultipleFkTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteSplitMultipleFkRefCQ cq = new WhiteSplitMultipleFkRefCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSplitMultipleFkRefAsSplitMultipleFkTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        WhiteSplitMultipleFkRefCQ cq = getConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FIRST_ID", "FIRST_ID");
        registerOuterJoin(cq, joinOnMap, "whiteSplitMultipleFkRefAsSplitMultipleFkTest");
    }
    public boolean hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        return _conditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteSplitMultipleFkBaseCQ> _scalarConditionMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSplitMultipleFkBaseCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSplitMultipleFkBaseCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkBaseCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkBaseCQ sq) {
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
    protected Map<String, WhiteSplitMultipleFkBaseCQ> _myselfExistsMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSplitMultipleFkBaseCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSplitMultipleFkBaseCQ> _myselfInScopeMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSplitMultipleFkBaseCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSplitMultipleFkBaseCB.class.getName(); }
    protected String xCQ() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
