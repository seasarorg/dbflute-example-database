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
 * The base condition-query of white_uq_reference.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqReferenceCQ extends AbstractBsWhiteUqReferenceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqReferenceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqReferenceCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_reference) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqReferenceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqReferenceCIQ xcreateCIQ() {
        WhiteUqReferenceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqReferenceCIQ xnewCIQ() {
        return new WhiteUqReferenceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_reference on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqReferenceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqReferenceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqReferenceId;
    public ConditionValue getUqReferenceId() {
        if (_uqReferenceId == null) { _uqReferenceId = nCV(); }
        return _uqReferenceId;
    }
    protected ConditionValue getCValueUqReferenceId() { return getUqReferenceId(); }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdList() { return _uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap; }
    public String keepUqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap == null) { _uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap.size() + 1);
        _uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap.put(key, subQuery); return "uqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList() { return _uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap; }
    public String keepUqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap == null) { _uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap.size() + 1);
        _uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdListMap.put(key, subQuery); return "uqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList() { return _uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap; }
    public String keepUqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap == null) { _uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap.size() + 1);
        _uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap.put(key, subQuery); return "uqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList() { return _uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap; }
    public String keepUqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap == null) { _uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap.size() + 1);
        _uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap.put(key, subQuery); return "uqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList() { return _uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap; }
    public String keepUqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap == null) { _uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap.size() + 1);
        _uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdListMap.put(key, subQuery); return "uqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList() { return _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap; }
    public String keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap == null) { _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap.size() + 1);
        _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListMap.put(key, subQuery); return "uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList." + key;
    }
    protected Map<String, Object> _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameterMap;
    public Map<String, Object> getUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameter() { return _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameterMap; }
    public String keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameter(Object parameterValue) {
        if (_uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameterMap == null) { _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameterMap.size() + 1);
        _uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameterMap.put(key, parameterValue); return "uqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceCQ addOrderBy_UqReferenceId_Asc() { regOBA("UQ_REFERENCE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceCQ addOrderBy_UqReferenceId_Desc() { regOBD("UQ_REFERENCE_ID"); return this; }

    protected ConditionValue _uqReferenceCode;
    public ConditionValue getUqReferenceCode() {
        if (_uqReferenceCode == null) { _uqReferenceCode = nCV(); }
        return _uqReferenceCode;
    }
    protected ConditionValue getCValueUqReferenceCode() { return getUqReferenceCode(); }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList() { return _uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap; }
    public String keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap == null) { _uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.size() + 1);
        _uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.put(key, subQuery); return "uqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList() { return _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap; }
    public String keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap == null) { _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.size() + 1);
        _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.put(key, subQuery); return "uqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList() { return _uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap; }
    public String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap == null) { _uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap.size() + 1);
        _uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap.put(key, subQuery); return "uqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList() { return _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap; }
    public String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap == null) { _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap.size() + 1);
        _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeListMap.put(key, subQuery); return "uqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList() { return _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap; }
    public String keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap == null) { _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.size() + 1);
        _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.put(key, subQuery); return "uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqReferenceRefCQ> _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap;
    public Map<String, WhiteUqReferenceRefCQ> getUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList() { return _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap; }
    public String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ subQuery) {
        if (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap == null) { _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.size() + 1);
        _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListMap.put(key, subQuery); return "uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList." + key;
    }
    protected Map<String, Object> _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameterMap;
    public Map<String, Object> getUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameter() { return _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameterMap; }
    public String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameter(Object parameterValue) {
        if (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameterMap == null) { _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameterMap.size() + 1);
        _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameterMap.put(key, parameterValue); return "uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceCQ addOrderBy_UqReferenceCode_Asc() { regOBA("UQ_REFERENCE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceCQ addOrderBy_UqReferenceCode_Desc() { regOBD("UQ_REFERENCE_CODE"); return this; }

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
    public BsWhiteUqReferenceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqReferenceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
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
    protected Map<String, WhiteUqReferenceCQ> _scalarConditionMap;
    public Map<String, WhiteUqReferenceCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqReferenceCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqReferenceCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqReferenceCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqReferenceCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteUqReferenceCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqReferenceCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqReferenceCQ subQuery) {
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
    protected Map<String, WhiteUqReferenceCQ> _myselfExistsMap;
    public Map<String, WhiteUqReferenceCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqReferenceCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqReferenceCQ> _myselfInScopeMap;
    public Map<String, WhiteUqReferenceCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqReferenceCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqReferenceCB.class.getName(); }
    protected String xCQ() { return WhiteUqReferenceCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
