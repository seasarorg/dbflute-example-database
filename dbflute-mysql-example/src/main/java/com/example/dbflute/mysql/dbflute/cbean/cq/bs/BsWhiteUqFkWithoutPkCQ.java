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
 * The base condition-query of white_uq_fk_without_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkWithoutPkCQ extends AbstractBsWhiteUqFkWithoutPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkWithoutPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkWithoutPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk_without_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkWithoutPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkWithoutPkCIQ xcreateCIQ() {
        WhiteUqFkWithoutPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkWithoutPkCIQ xnewCIQ() {
        return new WhiteUqFkWithoutPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk_without_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkWithoutPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkWithoutPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqFkCode;
    public ConditionValue getUqFkCode() {
        if (_uqFkCode == null) { _uqFkCode = nCV(); }
        return _uqFkCode;
    }
    protected ConditionValue getCValueUqFkCode() { return getUqFkCode(); }

    protected Map<String, WhiteUqFkWithoutPkRefCQ> _uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefListMap;
    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList() { return _uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefListMap; }
    public String keepUqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) {
        if (_uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefListMap == null) { _uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefListMap.size() + 1);
        _uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefListMap.put(ky, sq); return "uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList." + ky;
    }

    protected Map<String, WhiteUqFkWithoutPkRefCQ> _uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefListMap;
    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList() { return _uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefListMap; }
    public String keepUqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) {
        if (_uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefListMap == null) { _uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefListMap.size() + 1);
        _uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefListMap.put(ky, sq); return "uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList." + ky;
    }

    protected Map<String, WhiteUqFkWithoutPkRefCQ> _uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefListMap;
    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList() { return _uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefListMap; }
    public String keepUqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) {
        if (_uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefListMap == null) { _uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefListMap.size() + 1);
        _uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefListMap.put(ky, sq); return "uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList." + ky;
    }

    protected Map<String, WhiteUqFkWithoutPkRefCQ> _uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefListMap;
    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList() { return _uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefListMap; }
    public String keepUqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) {
        if (_uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefListMap == null) { _uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefListMap.size() + 1);
        _uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefListMap.put(ky, sq); return "uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList." + ky;
    }

    protected Map<String, WhiteUqFkWithoutPkRefCQ> _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefListMap;
    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList() { return _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefListMap; }
    public String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) {
        if (_uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefListMap == null) { _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefListMap.size() + 1);
        _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefListMap.put(ky, sq); return "uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList." + ky;
    }

    protected Map<String, WhiteUqFkWithoutPkRefCQ> _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListMap;
    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList() { return _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListMap; }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) {
        if (_uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListMap == null) { _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListMap.size() + 1);
        _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListMap.put(ky, sq); return "uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList." + ky;
    }
    protected Map<String, Object> _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameterMap;
    public Map<String, Object> getUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter() { return _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameterMap; }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter(Object vl) {
        if (_uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameterMap == null) { _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameterMap.size() + 1);
        _uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameterMap.put(ky, vl); return "uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkCode_Asc() { regOBA("UQ_FK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkCode_Desc() { regOBD("UQ_FK_CODE"); return this; }

    protected ConditionValue _uqFkName;
    public ConditionValue getUqFkName() {
        if (_uqFkName == null) { _uqFkName = nCV(); }
        return _uqFkName;
    }
    protected ConditionValue getCValueUqFkName() { return getUqFkName(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkName_Asc() { regOBA("UQ_FK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkName_Desc() { regOBD("UQ_FK_NAME"); return this; }

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
    public BsWhiteUqFkWithoutPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqFkWithoutPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected Map<String, WhiteUqFkWithoutPkCQ> _scalarConditionMap;
    public Map<String, WhiteUqFkWithoutPkCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqFkWithoutPkCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkWithoutPkCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkWithoutPkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
