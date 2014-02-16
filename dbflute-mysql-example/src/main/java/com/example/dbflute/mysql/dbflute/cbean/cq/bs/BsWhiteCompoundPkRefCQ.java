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
    public BsWhiteCompoundPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
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
    public BsWhiteCompoundPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    //                                                       Compound PK's Exists Referrer
    //                                                       =============================
    /**
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from white_compound_pk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefNestByQuxMultipleIdList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefNestByQuxMultipleIdList(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefNestCB>", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByQuxMultipleIdList(cb.query()); // for saving query-value.
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
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from white_compound_pk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefNestByFooMultipleIdList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefNestByFooMultipleIdList(SubQuery<WhiteCompoundPkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefNestCB>", subQuery);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID", "FOO_MULTIPLE_ID, BAR_MULTIPLE_ID", pp, "whiteCompoundPkRefNestByFooMultipleIdList");
    }
    protected Map<String, WhiteCompoundPkRefNestCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRefNestCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefNestByFooMultipleIdList." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
