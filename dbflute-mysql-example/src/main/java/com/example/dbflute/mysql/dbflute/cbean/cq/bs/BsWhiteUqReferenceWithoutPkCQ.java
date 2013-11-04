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
 * The base condition-query of white_uq_reference_without_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqReferenceWithoutPkCQ extends AbstractBsWhiteUqReferenceWithoutPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqReferenceWithoutPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqReferenceWithoutPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_reference_without_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqReferenceWithoutPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqReferenceWithoutPkCIQ xcreateCIQ() {
        WhiteUqReferenceWithoutPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqReferenceWithoutPkCIQ xnewCIQ() {
        return new WhiteUqReferenceWithoutPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_reference_without_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqReferenceWithoutPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqReferenceWithoutPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqReferenceCode;
    public ConditionValue getUqReferenceCode() {
        if (_uqReferenceCode == null) { _uqReferenceCode = nCV(); }
        return _uqReferenceCode;
    }
    protected ConditionValue getCValueUqReferenceCode() { return getUqReferenceCode(); }

    protected Map<String, WhiteUqReferenceWithoutPkRefCQ> _uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefListMap;
    public Map<String, WhiteUqReferenceWithoutPkRefCQ> getUqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefList() { return _uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefListMap; }
    public String keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery) {
        if (_uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefListMap == null) { _uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefListMap.size() + 1);
        _uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefListMap.put(key, subQuery); return "uqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefList." + key;
    }

    protected Map<String, WhiteUqReferenceWithoutPkRefCQ> _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefListMap;
    public Map<String, WhiteUqReferenceWithoutPkRefCQ> getUqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefList() { return _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefListMap; }
    public String keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery) {
        if (_uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefListMap == null) { _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefListMap.size() + 1);
        _uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefListMap.put(key, subQuery); return "uqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefList." + key;
    }

    protected Map<String, WhiteUqReferenceWithoutPkRefCQ> _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefListMap;
    public Map<String, WhiteUqReferenceWithoutPkRefCQ> getUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefList() { return _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefListMap; }
    public String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery) {
        if (_uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefListMap == null) { _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefListMap.size() + 1);
        _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefListMap.put(key, subQuery); return "uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefList." + key;
    }

    protected Map<String, WhiteUqReferenceWithoutPkRefCQ> _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefListMap;
    public Map<String, WhiteUqReferenceWithoutPkRefCQ> getUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefList() { return _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefListMap; }
    public String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery) {
        if (_uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefListMap == null) { _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefListMap.size() + 1);
        _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefListMap.put(key, subQuery); return "uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefList." + key;
    }

    protected Map<String, WhiteUqReferenceWithoutPkRefCQ> _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap;
    public Map<String, WhiteUqReferenceWithoutPkRefCQ> getUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefList() { return _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap; }
    public String keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery) {
        if (_uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap == null) { _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap.size() + 1);
        _uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap.put(key, subQuery); return "uqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefList." + key;
    }

    protected Map<String, WhiteUqReferenceWithoutPkRefCQ> _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap;
    public Map<String, WhiteUqReferenceWithoutPkRefCQ> getUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefList() { return _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap; }
    public String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery) {
        if (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap == null) { _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap.size() + 1);
        _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListMap.put(key, subQuery); return "uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefList." + key;
    }
    protected Map<String, Object> _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameterMap;
    public Map<String, Object> getUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameter() { return _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameterMap; }
    public String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameter(Object parameterValue) {
        if (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameterMap == null) { _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameterMap.size() + 1);
        _uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameterMap.put(key, parameterValue); return "uqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkCQ addOrderBy_UqReferenceCode_Asc() { regOBA("UQ_REFERENCE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkCQ addOrderBy_UqReferenceCode_Desc() { regOBD("UQ_REFERENCE_CODE"); return this; }

    protected ConditionValue _uqReferenceName;
    public ConditionValue getUqReferenceName() {
        if (_uqReferenceName == null) { _uqReferenceName = nCV(); }
        return _uqReferenceName;
    }
    protected ConditionValue getCValueUqReferenceName() { return getUqReferenceName(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkCQ addOrderBy_UqReferenceName_Asc() { regOBA("UQ_REFERENCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkCQ addOrderBy_UqReferenceName_Desc() { regOBD("UQ_REFERENCE_NAME"); return this; }

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
    public BsWhiteUqReferenceWithoutPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqReferenceWithoutPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqReferenceWithoutPkCB.class.getName(); }
    protected String xCQ() { return WhiteUqReferenceWithoutPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
