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
 * The base condition-query of white_compound_pk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefNestCQ extends AbstractBsWhiteCompoundPkRefNestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefNestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefNestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk_ref_nest) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkRefNestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkRefNestCIQ xcreateCIQ() {
        WhiteCompoundPkRefNestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkRefNestCIQ xnewCIQ() {
        return new WhiteCompoundPkRefNestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk_ref_nest on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkRefNestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkRefNestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _compoundPkRefNestId;
    public ConditionValue getCompoundPkRefNestId()
    { if (_compoundPkRefNestId == null) { _compoundPkRefNestId = nCV(); }
      return _compoundPkRefNestId; }
    protected ConditionValue getCValueCompoundPkRefNestId() { return getCompoundPkRefNestId(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_CompoundPkRefNestId_Asc() { regOBA("COMPOUND_PK_REF_NEST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_CompoundPkRefNestId_Desc() { regOBD("COMPOUND_PK_REF_NEST_ID"); return this; }

    protected ConditionValue _fooMultipleId;
    public ConditionValue getFooMultipleId()
    { if (_fooMultipleId == null) { _fooMultipleId = nCV(); }
      return _fooMultipleId; }
    protected ConditionValue getCValueFooMultipleId() { return getFooMultipleId(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_FooMultipleId_Asc() { regOBA("FOO_MULTIPLE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_FooMultipleId_Desc() { regOBD("FOO_MULTIPLE_ID"); return this; }

    protected ConditionValue _barMultipleId;
    public ConditionValue getBarMultipleId()
    { if (_barMultipleId == null) { _barMultipleId = nCV(); }
      return _barMultipleId; }
    protected ConditionValue getCValueBarMultipleId() { return getBarMultipleId(); }

    /** 
     * Add order-by as ascend. <br />
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_BarMultipleId_Asc() { regOBA("BAR_MULTIPLE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_BarMultipleId_Desc() { regOBD("BAR_MULTIPLE_ID"); return this; }

    protected ConditionValue _quxMultipleId;
    public ConditionValue getQuxMultipleId()
    { if (_quxMultipleId == null) { _quxMultipleId = nCV(); }
      return _quxMultipleId; }
    protected ConditionValue getCValueQuxMultipleId() { return getQuxMultipleId(); }

    /** 
     * Add order-by as ascend. <br />
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_QuxMultipleId_Asc() { regOBA("QUX_MULTIPLE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_QuxMultipleId_Desc() { regOBD("QUX_MULTIPLE_ID"); return this; }

    protected ConditionValue _nestName;
    public ConditionValue getNestName()
    { if (_nestName == null) { _nestName = nCV(); }
      return _nestName; }
    protected ConditionValue getCValueNestName() { return getNestName(); }

    /** 
     * Add order-by as ascend. <br />
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_NestName_Asc() { regOBA("NEST_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefNestCQ addOrderBy_NestName_Desc() { regOBD("NEST_NAME"); return this; }

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
    public BsWhiteCompoundPkRefNestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteCompoundPkRefNestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteCompoundPkRefNestCQ bq = (WhiteCompoundPkRefNestCQ)bqs;
        WhiteCompoundPkRefNestCQ uq = (WhiteCompoundPkRefNestCQ)uqs;
        if (bq.hasConditionQueryWhiteCompoundPkRefByQuxMultipleId()) {
            uq.queryWhiteCompoundPkRefByQuxMultipleId().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPkRefByQuxMultipleId(), uq.queryWhiteCompoundPkRefByQuxMultipleId());
        }
        if (bq.hasConditionQueryWhiteCompoundPkRefByFooMultipleId()) {
            uq.queryWhiteCompoundPkRefByFooMultipleId().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPkRefByFooMultipleId(), uq.queryWhiteCompoundPkRefByFooMultipleId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkRefCQ queryWhiteCompoundPkRefByQuxMultipleId() {
        return getConditionQueryWhiteCompoundPkRefByQuxMultipleId();
    }
    public WhiteCompoundPkRefCQ getConditionQueryWhiteCompoundPkRefByQuxMultipleId() {
        String prop = "whiteCompoundPkRefByQuxMultipleId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundPkRefByQuxMultipleId()); xsetupOuterJoinWhiteCompoundPkRefByQuxMultipleId(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundPkRefCQ xcreateQueryWhiteCompoundPkRefByQuxMultipleId() {
        String nrp = xresolveNRP("white_compound_pk_ref_nest", "whiteCompoundPkRefByQuxMultipleId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundPkRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundPkRefByQuxMultipleId", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundPkRefByQuxMultipleId() { xregOutJo("whiteCompoundPkRefByQuxMultipleId"); }
    public boolean hasConditionQueryWhiteCompoundPkRefByQuxMultipleId() { return xhasQueRlMap("whiteCompoundPkRefByQuxMultipleId"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkRefCQ queryWhiteCompoundPkRefByFooMultipleId() {
        return getConditionQueryWhiteCompoundPkRefByFooMultipleId();
    }
    public WhiteCompoundPkRefCQ getConditionQueryWhiteCompoundPkRefByFooMultipleId() {
        String prop = "whiteCompoundPkRefByFooMultipleId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundPkRefByFooMultipleId()); xsetupOuterJoinWhiteCompoundPkRefByFooMultipleId(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundPkRefCQ xcreateQueryWhiteCompoundPkRefByFooMultipleId() {
        String nrp = xresolveNRP("white_compound_pk_ref_nest", "whiteCompoundPkRefByFooMultipleId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundPkRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundPkRefByFooMultipleId", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundPkRefByFooMultipleId() { xregOutJo("whiteCompoundPkRefByFooMultipleId"); }
    public boolean hasConditionQueryWhiteCompoundPkRefByFooMultipleId() { return xhasQueRlMap("whiteCompoundPkRefByFooMultipleId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteCompoundPkRefNestCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundPkRefNestCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteCompoundPkRefNestCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteCompoundPkRefNestCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteCompoundPkRefNestCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteCompoundPkRefNestCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteCompoundPkRefNestCQ> _myselfExistsMap;
    public Map<String, WhiteCompoundPkRefNestCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteCompoundPkRefNestCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteCompoundPkRefNestCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteCompoundPkRefNestCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkRefNestCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkRefNestCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
