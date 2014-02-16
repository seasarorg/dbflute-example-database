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
 * The base condition-query of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkCQ extends AbstractBsWhiteCompoundPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkCIQ xcreateCIQ() {
        WhiteCompoundPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkCIQ xnewCIQ() {
        return new WhiteCompoundPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _pkFirstId;
    public ConditionValue getPkFirstId() {
        if (_pkFirstId == null) { _pkFirstId = nCV(); }
        return _pkFirstId;
    }
    protected ConditionValue getCValuePkFirstId() { return getPkFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Asc() { regOBA("PK_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_FIRST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Desc() { regOBD("PK_FIRST_ID"); return this; }

    protected ConditionValue _pkSecondId;
    public ConditionValue getPkSecondId() {
        if (_pkSecondId == null) { _pkSecondId = nCV(); }
        return _pkSecondId;
    }
    protected ConditionValue getCValuePkSecondId() { return getPkSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Asc() { regOBA("PK_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_SECOND_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Desc() { regOBD("PK_SECOND_ID"); return this; }

    protected ConditionValue _pkName;
    public ConditionValue getPkName() {
        if (_pkName == null) { _pkName = nCV(); }
        return _pkName;
    }
    protected ConditionValue getCValuePkName() { return getPkName(); }

    /** 
     * Add order-by as ascend. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkName_Asc() { regOBA("PK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkName_Desc() { regOBD("PK_NAME"); return this; }

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
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                       Compound PK's Exists Referrer
    //                                                       =============================
    /**
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from white_compound_pk_ref where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefList(SubQuery<WhiteCompoundPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefCB>", subQuery);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefList");
    }
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
