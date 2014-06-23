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
    public ConditionValue getBaseId()
    { if (_baseId == null) { _baseId = nCV(); }
      return _baseId; }
    protected ConditionValue getCValueBaseId() { return getBaseId(); }

    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList() { return xgetSQueMap("baseId_ExistsReferrer_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) { return xkeepSQue("baseId_ExistsReferrer_WhiteSplitMultipleFkChildList", sq); }

    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList() { return xgetSQueMap("baseId_NotExistsReferrer_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) { return xkeepSQue("baseId_NotExistsReferrer_WhiteSplitMultipleFkChildList", sq); }

    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList() { return xgetSQueMap("baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) { return xkeepSQue("baseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList", sq); }

    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_InScopeRelation_WhiteSplitMultipleFkChildList() { return xgetSQueMap("baseId_InScopeRelation_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) { return xkeepSQue("baseId_InScopeRelation_WhiteSplitMultipleFkChildList", sq); }

    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList() { return xgetSQueMap("baseId_NotInScopeRelation_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) { return xkeepSQue("baseId_NotInScopeRelation_WhiteSplitMultipleFkChildList", sq); }

    public Map<String, WhiteSplitMultipleFkChildCQ> getBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList() { return xgetSQueMap("baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq) { return xkeepSQue("baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList", sq); }
    public Map<String, Object> getBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter() { return xgetSQuePmMap("baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList"); }
    public String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(Object pm) { return xkeepSQuePm("baseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList", pm); }

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
    public ConditionValue getFirstId()
    { if (_firstId == null) { _firstId = nCV(); }
      return _firstId; }
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
    public ConditionValue getNextId()
    { if (_nextId == null) { _nextId = nCV(); }
      return _nextId; }
    protected ConditionValue getCValueNextId() { return getNextId(); }

    public Map<String, WhiteSplitMultipleFkNextCQ> getNextId_InScopeRelation_WhiteSplitMultipleFkNext() { return xgetSQueMap("nextId_InScopeRelation_WhiteSplitMultipleFkNext"); }
    public String keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("nextId_InScopeRelation_WhiteSplitMultipleFkNext", sq); }

    public Map<String, WhiteSplitMultipleFkNextCQ> getNextId_NotInScopeRelation_WhiteSplitMultipleFkNext() { return xgetSQueMap("nextId_NotInScopeRelation_WhiteSplitMultipleFkNext"); }
    public String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq) { return xkeepSQue("nextId_NotInScopeRelation_WhiteSplitMultipleFkNext", sq); }

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
    public ConditionValue getSplitName()
    { if (_splitName == null) { _splitName = nCV(); }
      return _splitName; }
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
    public BsWhiteSplitMultipleFkBaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSplitMultipleFkBaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public WhiteSplitMultipleFkNextCQ getConditionQueryWhiteSplitMultipleFkNext() {
        String prop = "whiteSplitMultipleFkNext";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSplitMultipleFkNext()); xsetupOuterJoinWhiteSplitMultipleFkNext(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSplitMultipleFkNextCQ xcreateQueryWhiteSplitMultipleFkNext() {
        String nrp = xresolveNRP("white_split_multiple_fk_base", "whiteSplitMultipleFkNext"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSplitMultipleFkNextCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSplitMultipleFkNext", nrp);
    }
    protected void xsetupOuterJoinWhiteSplitMultipleFkNext() { xregOutJo("whiteSplitMultipleFkNext"); }
    public boolean hasConditionQueryWhiteSplitMultipleFkNext() { return xhasQueRlMap("whiteSplitMultipleFkNext"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSplitMultipleFkRefCQ queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        return getConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest();
    }
    public WhiteSplitMultipleFkRefCQ getConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        String prop = "whiteSplitMultipleFkRefAsSplitMultipleFkTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()); xsetupOuterJoinWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSplitMultipleFkRefCQ xcreateQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        String nrp = xresolveNRP("white_split_multiple_fk_base", "whiteSplitMultipleFkRefAsSplitMultipleFkTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSplitMultipleFkRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSplitMultipleFkRefAsSplitMultipleFkTest", nrp);
    }
    protected void xsetupOuterJoinWhiteSplitMultipleFkRefAsSplitMultipleFkTest() { xregOutJo("whiteSplitMultipleFkRefAsSplitMultipleFkTest"); }
    public boolean hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest() { return xhasQueRlMap("whiteSplitMultipleFkRefAsSplitMultipleFkTest"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteSplitMultipleFkBaseCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSplitMultipleFkBaseCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSplitMultipleFkBaseCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSplitMultipleFkBaseCQ> _myselfExistsMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSplitMultipleFkBaseCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSplitMultipleFkBaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSplitMultipleFkBaseCB.class.getName(); }
    protected String xCQ() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
