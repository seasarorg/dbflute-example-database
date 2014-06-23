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
 * The base condition-query of white_uq_fk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkRefNestCQ extends AbstractBsWhiteUqFkRefNestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefNestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefNestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk_ref_nest) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkRefNestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkRefNestCIQ xcreateCIQ() {
        WhiteUqFkRefNestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkRefNestCIQ xnewCIQ() {
        return new WhiteUqFkRefNestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk_ref_nest on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkRefNestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkRefNestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _uqFkRefNestId;
    public ConditionValue getUqFkRefNestId()
    { if (_uqFkRefNestId == null) { _uqFkRefNestId = nCV(); }
      return _uqFkRefNestId; }
    protected ConditionValue getCValueUqFkRefNestId() { return getUqFkRefNestId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_UqFkRefNestId_Asc() { regOBA("UQ_FK_REF_NEST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_UqFkRefNestId_Desc() { regOBD("UQ_FK_REF_NEST_ID"); return this; }

    protected ConditionValue _compoundUqFirstCode;
    public ConditionValue getCompoundUqFirstCode()
    { if (_compoundUqFirstCode == null) { _compoundUqFirstCode = nCV(); }
      return _compoundUqFirstCode; }
    protected ConditionValue getCValueCompoundUqFirstCode() { return getCompoundUqFirstCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

    protected ConditionValue _compoundUqSecondCode;
    public ConditionValue getCompoundUqSecondCode()
    { if (_compoundUqSecondCode == null) { _compoundUqSecondCode = nCV(); }
      return _compoundUqSecondCode; }
    protected ConditionValue getCValueCompoundUqSecondCode() { return getCompoundUqSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefNestCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
    public BsWhiteUqFkRefNestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqFkRefNestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteUqFkRefNestCQ bq = (WhiteUqFkRefNestCQ)bqs;
        WhiteUqFkRefNestCQ uq = (WhiteUqFkRefNestCQ)uqs;
        if (bq.hasConditionQueryWhiteUqFkRef()) {
            uq.queryWhiteUqFkRef().reflectRelationOnUnionQuery(bq.queryWhiteUqFkRef(), uq.queryWhiteUqFkRef());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkRefCQ queryWhiteUqFkRef() {
        return getConditionQueryWhiteUqFkRef();
    }
    public WhiteUqFkRefCQ getConditionQueryWhiteUqFkRef() {
        String prop = "whiteUqFkRef";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteUqFkRef()); xsetupOuterJoinWhiteUqFkRef(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteUqFkRefCQ xcreateQueryWhiteUqFkRef() {
        String nrp = xresolveNRP("white_uq_fk_ref_nest", "whiteUqFkRef"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteUqFkRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteUqFkRef", nrp);
    }
    protected void xsetupOuterJoinWhiteUqFkRef() { xregOutJo("whiteUqFkRef"); }
    public boolean hasConditionQueryWhiteUqFkRef() { return xhasQueRlMap("whiteUqFkRef"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteUqFkRefNestCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqFkRefNestCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteUqFkRefNestCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteUqFkRefNestCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteUqFkRefNestCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteUqFkRefNestCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteUqFkRefNestCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkRefNestCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteUqFkRefNestCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteUqFkRefNestCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteUqFkRefNestCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkRefNestCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkRefNestCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
