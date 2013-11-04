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
 * The base condition-query of white_uq_reference_without_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqReferenceWithoutPkRefCQ extends AbstractBsWhiteUqReferenceWithoutPkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqReferenceWithoutPkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqReferenceWithoutPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_reference_without_pk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqReferenceWithoutPkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqReferenceWithoutPkRefCIQ xcreateCIQ() {
        WhiteUqReferenceWithoutPkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqReferenceWithoutPkRefCIQ xnewCIQ() {
        return new WhiteUqReferenceWithoutPkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_reference_without_pk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqReferenceWithoutPkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqReferenceWithoutPkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkRefCQ addOrderBy_UqReferenceRefId_Asc() { regOBA("UQ_REFERENCE_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkRefCQ addOrderBy_UqReferenceRefId_Desc() { regOBD("UQ_REFERENCE_REF_ID"); return this; }

    protected ConditionValue _uqReferenceCode;
    public ConditionValue getUqReferenceCode() {
        if (_uqReferenceCode == null) { _uqReferenceCode = nCV(); }
        return _uqReferenceCode;
    }
    protected ConditionValue getCValueUqReferenceCode() { return getUqReferenceCode(); }

    protected Map<String, WhiteUqReferenceWithoutPkCQ> _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkMap;
    public Map<String, WhiteUqReferenceWithoutPkCQ> getUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPk() { return _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkMap; }
    public String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPk(WhiteUqReferenceWithoutPkCQ subQuery) {
        if (_uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkMap == null) { _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkMap.size() + 1);
        _uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkMap.put(key, subQuery); return "uqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPk." + key;
    }

    protected Map<String, WhiteUqReferenceWithoutPkCQ> _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkMap;
    public Map<String, WhiteUqReferenceWithoutPkCQ> getUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPk() { return _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkMap; }
    public String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPk(WhiteUqReferenceWithoutPkCQ subQuery) {
        if (_uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkMap == null) { _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkMap.size() + 1);
        _uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkMap.put(key, subQuery); return "uqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPk." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkRefCQ addOrderBy_UqReferenceCode_Asc() { regOBA("UQ_REFERENCE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceWithoutPkRefCQ addOrderBy_UqReferenceCode_Desc() { regOBD("UQ_REFERENCE_CODE"); return this; }

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
    public BsWhiteUqReferenceWithoutPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqReferenceWithoutPkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteUqReferenceWithoutPkRefCQ baseQuery = (WhiteUqReferenceWithoutPkRefCQ)baseQueryAsSuper;
        WhiteUqReferenceWithoutPkRefCQ unionQuery = (WhiteUqReferenceWithoutPkRefCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteUqReferenceWithoutPk()) {
            unionQuery.queryWhiteUqReferenceWithoutPk().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqReferenceWithoutPk(), unionQuery.queryWhiteUqReferenceWithoutPk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_reference_without_pk by my UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPk'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqReferenceWithoutPkCQ queryWhiteUqReferenceWithoutPk() {
        return getConditionQueryWhiteUqReferenceWithoutPk();
    }
    protected WhiteUqReferenceWithoutPkCQ _conditionQueryWhiteUqReferenceWithoutPk;
    public WhiteUqReferenceWithoutPkCQ getConditionQueryWhiteUqReferenceWithoutPk() {
        if (_conditionQueryWhiteUqReferenceWithoutPk == null) {
            _conditionQueryWhiteUqReferenceWithoutPk = xcreateQueryWhiteUqReferenceWithoutPk();
            xsetupOuterJoinWhiteUqReferenceWithoutPk();
        }
        return _conditionQueryWhiteUqReferenceWithoutPk;
    }
    protected WhiteUqReferenceWithoutPkCQ xcreateQueryWhiteUqReferenceWithoutPk() {
        String nrp = resolveNextRelationPath("white_uq_reference_without_pk_ref", "whiteUqReferenceWithoutPk");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqReferenceWithoutPkCQ cq = new WhiteUqReferenceWithoutPkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqReferenceWithoutPk");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqReferenceWithoutPk() {
        WhiteUqReferenceWithoutPkCQ cq = getConditionQueryWhiteUqReferenceWithoutPk();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqReferenceWithoutPk");
    }
    public boolean hasConditionQueryWhiteUqReferenceWithoutPk() {
        return _conditionQueryWhiteUqReferenceWithoutPk != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqReferenceWithoutPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqReferenceWithoutPkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
