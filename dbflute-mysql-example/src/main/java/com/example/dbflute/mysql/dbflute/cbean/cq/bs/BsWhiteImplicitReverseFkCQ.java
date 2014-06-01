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
 * The base condition-query of white_implicit_reverse_fk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitReverseFkCQ extends AbstractBsWhiteImplicitReverseFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitReverseFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitReverseFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_reverse_fk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitReverseFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitReverseFkCIQ xcreateCIQ() {
        WhiteImplicitReverseFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitReverseFkCIQ xnewCIQ() {
        return new WhiteImplicitReverseFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_reverse_fk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitReverseFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitReverseFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _whiteImplicitReverseFkId;
    public ConditionValue getWhiteImplicitReverseFkId() {
        if (_whiteImplicitReverseFkId == null) { _whiteImplicitReverseFkId = nCV(); }
        return _whiteImplicitReverseFkId;
    }
    protected ConditionValue getCValueWhiteImplicitReverseFkId() { return getWhiteImplicitReverseFkId(); }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefListMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList() { return _whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefListMap; }
    public String keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) {
        if (_whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefListMap == null) { _whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefListMap.size() + 1);
        _whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefListMap.put(ky, sq); return "whiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefListMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList() { return _whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefListMap; }
    public String keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) {
        if (_whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefListMap == null) { _whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefListMap.size() + 1);
        _whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefListMap.put(ky, sq); return "whiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefListMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList() { return _whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefListMap; }
    public String keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) {
        if (_whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefListMap == null) { _whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefListMap.size() + 1);
        _whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefListMap.put(ky, sq); return "whiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefListMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList() { return _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefListMap; }
    public String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) {
        if (_whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefListMap == null) { _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefListMap.size() + 1);
        _whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefListMap.put(ky, sq); return "whiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefListMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList() { return _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefListMap; }
    public String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) {
        if (_whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefListMap == null) { _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefListMap.size() + 1);
        _whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefListMap.put(ky, sq); return "whiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkRefCQ> _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListMap;
    public Map<String, WhiteImplicitReverseFkRefCQ> getWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList() { return _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListMap; }
    public String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq) {
        if (_whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListMap == null) { _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListMap.size() + 1);
        _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListMap.put(ky, sq); return "whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList." + ky;
    }
    protected Map<String, Object> _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameterMap;
    public Map<String, Object> getWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter() { return _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameterMap; }
    public String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(Object vl) {
        if (_whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameterMap == null) { _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameterMap.size() + 1);
        _whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameterMap.put(ky, vl); return "whiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkId_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkId_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    protected ConditionValue _whiteImplicitReverseFkName;
    public ConditionValue getWhiteImplicitReverseFkName() {
        if (_whiteImplicitReverseFkName == null) { _whiteImplicitReverseFkName = nCV(); }
        return _whiteImplicitReverseFkName;
    }
    protected ConditionValue getCValueWhiteImplicitReverseFkName() { return getWhiteImplicitReverseFkName(); }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkName_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkCQ addOrderBy_WhiteImplicitReverseFkName_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_NAME"); return this; }

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
    public BsWhiteImplicitReverseFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteImplicitReverseFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitReverseFkCQ bq = (WhiteImplicitReverseFkCQ)bqs;
        WhiteImplicitReverseFkCQ uq = (WhiteImplicitReverseFkCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK()) {
            uq.xsetParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK(bq.getParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK());
            uq.getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK().reflectRelationOnUnionQuery(bq.getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(), uq.getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK());
        }
        if (bq.hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK()) {
            uq.xsetParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(bq.getParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK());
            uq.getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK().reflectRelationOnUnionQuery(bq.getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(), uq.getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitReverseFkRefCQ queryWhiteImplicitReverseFkRefWithImplicitReverseFK(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("whiteImplicitReverseFkRefWithImplicitReverseFK", parameterMap);
        return getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK();
    }
    protected WhiteImplicitReverseFkRefCQ _conditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK;
    public WhiteImplicitReverseFkRefCQ getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        if (_conditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK == null) {
            _conditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK = xcreateQueryWhiteImplicitReverseFkRefWithImplicitReverseFK();
            xsetupOuterJoinWhiteImplicitReverseFkRefWithImplicitReverseFK();
        }
        return _conditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK;
    }
    protected Map<String, Object> _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK;
    public Map<String, Object> getParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        if (_parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK == null) {
            _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK = newLinkedHashMapSized(4);
        }
        return _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK;
    }
    public void xsetParameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK(Map<String, Object> parameterMap) {
        _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK = parameterMap; // for UnionQuery
    }
    protected WhiteImplicitReverseFkRefCQ xcreateQueryWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        String nrp = resolveNextRelationPath("white_implicit_reverse_fk", "whiteImplicitReverseFkRefWithImplicitReverseFK");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitReverseFkRefCQ cq = new WhiteImplicitReverseFkRefCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitReverseFkRefWithImplicitReverseFK");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        WhiteImplicitReverseFkRefCQ cq = getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitReverseFkRefWithImplicitReverseFK");
    }
    public boolean hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        return _conditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitReverseFkSuppressCQ queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK", parameterMap);
        return getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
    }
    protected WhiteImplicitReverseFkSuppressCQ _conditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    public WhiteImplicitReverseFkSuppressCQ getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        if (_conditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null) {
            _conditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = xcreateQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
            xsetupOuterJoinWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
        }
        return _conditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }
    protected Map<String, Object> _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    public Map<String, Object> getParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        if (_parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null) {
            _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = newLinkedHashMapSized(4);
        }
        return _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }
    public void xsetParameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(Map<String, Object> parameterMap) {
        _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = parameterMap; // for UnionQuery
    }
    protected WhiteImplicitReverseFkSuppressCQ xcreateQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        String nrp = resolveNextRelationPath("white_implicit_reverse_fk", "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitReverseFkSuppressCQ cq = new WhiteImplicitReverseFkSuppressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        WhiteImplicitReverseFkSuppressCQ cq = getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK");
    }
    public boolean hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        return _conditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("whiteImplicitReverseFkRefWithImplicitReverseFK".equalsIgnoreCase(property)) {
            return _parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK;
        }
        if ("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK".equalsIgnoreCase(property)) {
            return _parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
        }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteImplicitReverseFkCQ> _scalarConditionMap;
    public Map<String, WhiteImplicitReverseFkCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteImplicitReverseFkCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteImplicitReverseFkCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteImplicitReverseFkCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteImplicitReverseFkCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteImplicitReverseFkCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteImplicitReverseFkCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteImplicitReverseFkCQ sq) {
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
    protected Map<String, WhiteImplicitReverseFkCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitReverseFkCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteImplicitReverseFkCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteImplicitReverseFkCQ> _myselfInScopeMap;
    public Map<String, WhiteImplicitReverseFkCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteImplicitReverseFkCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitReverseFkCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitReverseFkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
