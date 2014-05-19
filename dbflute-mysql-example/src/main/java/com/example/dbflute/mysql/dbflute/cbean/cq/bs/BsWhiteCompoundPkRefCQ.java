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
 * The base condition-query of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefCQ extends AbstractBsWhiteCompoundPkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkRefCIQ xcreateCIQ() {
        WhiteCompoundPkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkRefCIQ xnewCIQ() {
        return new WhiteCompoundPkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _multipleFirstId;
    public ConditionValue getMultipleFirstId() {
        if (_multipleFirstId == null) { _multipleFirstId = nCV(); }
        return _multipleFirstId;
    }
    protected ConditionValue getCValueMultipleFirstId() { return getMultipleFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleFirstId_Asc() { regOBA("MULTIPLE_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleFirstId_Desc() { regOBD("MULTIPLE_FIRST_ID"); return this; }

    protected ConditionValue _multipleSecondId;
    public ConditionValue getMultipleSecondId() {
        if (_multipleSecondId == null) { _multipleSecondId = nCV(); }
        return _multipleSecondId;
    }
    protected ConditionValue getCValueMultipleSecondId() { return getMultipleSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleSecondId_Asc() { regOBA("MULTIPLE_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleSecondId_Desc() { regOBD("MULTIPLE_SECOND_ID"); return this; }

    protected ConditionValue _refFirstId;
    public ConditionValue getRefFirstId() {
        if (_refFirstId == null) { _refFirstId = nCV(); }
        return _refFirstId;
    }
    protected ConditionValue getCValueRefFirstId() { return getRefFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefFirstId_Asc() { regOBA("REF_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefFirstId_Desc() { regOBD("REF_FIRST_ID"); return this; }

    protected ConditionValue _refSecondId;
    public ConditionValue getRefSecondId() {
        if (_refSecondId == null) { _refSecondId = nCV(); }
        return _refSecondId;
    }
    protected ConditionValue getCValueRefSecondId() { return getRefSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefSecondId_Asc() { regOBA("REF_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefSecondId_Desc() { regOBD("REF_SECOND_ID"); return this; }

    protected ConditionValue _refName;
    public ConditionValue getRefName() {
        if (_refName == null) { _refName = nCV(); }
        return _refName;
    }
    protected ConditionValue getCValueRefName() { return getRefName(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefName_Asc() { regOBA("REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefName_Desc() { regOBD("REF_NAME"); return this; }

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
    public BsWhiteCompoundPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteCompoundPkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteCompoundPkRefCQ bq = (WhiteCompoundPkRefCQ)bqs;
        WhiteCompoundPkRefCQ uq = (WhiteCompoundPkRefCQ)uqs;
        if (bq.hasConditionQueryWhiteCompoundPk()) {
            uq.queryWhiteCompoundPk().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPk(), uq.queryWhiteCompoundPk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkCQ queryWhiteCompoundPk() {
        return getConditionQueryWhiteCompoundPk();
    }
    protected WhiteCompoundPkCQ _conditionQueryWhiteCompoundPk;
    public WhiteCompoundPkCQ getConditionQueryWhiteCompoundPk() {
        if (_conditionQueryWhiteCompoundPk == null) {
            _conditionQueryWhiteCompoundPk = xcreateQueryWhiteCompoundPk();
            xsetupOuterJoinWhiteCompoundPk();
        }
        return _conditionQueryWhiteCompoundPk;
    }
    protected WhiteCompoundPkCQ xcreateQueryWhiteCompoundPk() {
        String nrp = resolveNextRelationPath("white_compound_pk_ref", "whiteCompoundPk");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteCompoundPkCQ cq = new WhiteCompoundPkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteCompoundPk");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteCompoundPk() {
        WhiteCompoundPkCQ cq = getConditionQueryWhiteCompoundPk();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("REF_FIRST_ID", "PK_FIRST_ID");
        joinOnMap.put("REF_SECOND_ID", "PK_SECOND_ID");
        registerOuterJoin(cq, joinOnMap, "whiteCompoundPk");
    }
    public boolean hasConditionQueryWhiteCompoundPk() {
        return _conditionQueryWhiteCompoundPk != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select ... from white_compound_pk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefNestByQuxMultipleIdList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefNestByQuxMultipleIdList(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefNestCB>", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(cb.query());
        registerExistsReferrer(cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "BAR_MULTIPLE_ID, QUX_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByQuxMultipleIdList");
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList." + ky;
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select ... from white_compound_pk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefNestByFooMultipleIdList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefNestByFooMultipleIdList(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefNestCB>", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(cb.query());
        registerExistsReferrer(cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "FOO_MULTIPLE_ID, BAR_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByFooMultipleIdList");
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList." + ky;
    }

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select ... from white_compound_pk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefNestByQuxMultipleIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefNestByQuxMultipleIdList(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefNestCB>", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "BAR_MULTIPLE_ID, QUX_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByQuxMultipleIdList");
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList() { return _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap; }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap == null) { _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.size() + 1);
        _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.put(ky, sq); return "twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList." + ky;
    }

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select ... from white_compound_pk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefNestByFooMultipleIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefNestByFooMultipleIdList(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefNestCB>", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "FOO_MULTIPLE_ID, BAR_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByFooMultipleIdList");
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList() { return _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap; }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap == null) { _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.size() + 1);
        _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.put(ky, sq); return "twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList." + ky;
    }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveWhiteCompoundPkRefNestByQuxMultipleIdList(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "BAR_MULTIPLE_ID, QUX_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByQuxMultipleIdList", al, op);
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList() { return _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap; }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap == null) { _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.size() + 1);
        _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.put(ky, sq); return "twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList." + ky;
    }

    public void xsderiveWhiteCompoundPkRefNestByFooMultipleIdList(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "FOO_MULTIPLE_ID, BAR_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByFooMultipleIdList", al, op);
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList() { return _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap; }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap == null) { _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.size() + 1);
        _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.put(ky, sq); return "twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList." + ky;
    }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_compound_pk_ref_nest where ...)} <br />
     * white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteCompoundPkRefNestByQuxMultipleIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefNestCB> derivedWhiteCompoundPkRefNestByQuxMultipleIdList() {
        return xcreateQDRFunctionWhiteCompoundPkRefNestByQuxMultipleIdList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefNestCB> xcreateQDRFunctionWhiteCompoundPkRefNestByQuxMultipleIdList() {
        return new HpQDRFunction<WhiteCompoundPkRefNestCB>(new HpQDRSetupper<WhiteCompoundPkRefNestCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefNestByQuxMultipleIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefNestByQuxMultipleIdList(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "BAR_MULTIPLE_ID, QUX_MULTIPLE_ID", sqpp, "whiteCompoundPkRefNestByQuxMultipleIdList", rd, vl, prpp, op);
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListMap.put(ky, sq); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList." + ky;
    }
    protected Map<String, Object> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameterMap;
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameter() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameterMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameter(Object vl) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameterMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameterMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameterMap.put(ky, vl); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByQuxMultipleIdListParameter." + ky;
    }

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_compound_pk_ref_nest where ...)} <br />
     * white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteCompoundPkRefNestByFooMultipleIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefNestCB> derivedWhiteCompoundPkRefNestByFooMultipleIdList() {
        return xcreateQDRFunctionWhiteCompoundPkRefNestByFooMultipleIdList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefNestCB> xcreateQDRFunctionWhiteCompoundPkRefNestByFooMultipleIdList() {
        return new HpQDRFunction<WhiteCompoundPkRefNestCB>(new HpQDRSetupper<WhiteCompoundPkRefNestCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefNestByFooMultipleIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefNestByFooMultipleIdList(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "FOO_MULTIPLE_ID, BAR_MULTIPLE_ID", sqpp, "whiteCompoundPkRefNestByFooMultipleIdList", rd, vl, prpp, op);
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.put(ky, sq); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdList." + ky;
    }
    protected Map<String, Object> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameterMap;
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameter() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameterMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameter(Object vl) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameterMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameterMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameterMap.put(ky, vl); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefNestByFooMultipleIdListParameter." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
