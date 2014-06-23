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
 * The base condition-query of white_uq_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkRefCQ extends AbstractBsWhiteUqFkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkRefCIQ xcreateCIQ() {
        WhiteUqFkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkRefCIQ xnewCIQ() {
        return new WhiteUqFkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _uqFkRefId;
    public ConditionValue getUqFkRefId()
    { if (_uqFkRefId == null) { _uqFkRefId = nCV(); }
      return _uqFkRefId; }
    protected ConditionValue getCValueUqFkRefId() { return getUqFkRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_UqFkRefId_Asc() { regOBA("UQ_FK_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_UqFkRefId_Desc() { regOBD("UQ_FK_REF_ID"); return this; }

    protected ConditionValue _fkToPkId;
    public ConditionValue getFkToPkId()
    { if (_fkToPkId == null) { _fkToPkId = nCV(); }
      return _fkToPkId; }
    protected ConditionValue getCValueFkToPkId() { return getFkToPkId(); }

    public Map<String, WhiteUqFkCQ> getFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId() { return xgetSQueMap("fkToPkId_InScopeRelation_WhiteUqFkByFkToPkId"); }
    public String keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ sq) { return xkeepSQue("fkToPkId_InScopeRelation_WhiteUqFkByFkToPkId", sq); }

    public Map<String, WhiteUqFkCQ> getFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId() { return xgetSQueMap("fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId"); }
    public String keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ sq) { return xkeepSQue("fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId", sq); }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToPkId_Asc() { regOBA("FK_TO_PK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToPkId_Desc() { regOBD("FK_TO_PK_ID"); return this; }

    protected ConditionValue _fkToUqCode;
    public ConditionValue getFkToUqCode()
    { if (_fkToUqCode == null) { _fkToUqCode = nCV(); }
      return _fkToUqCode; }
    protected ConditionValue getCValueFkToUqCode() { return getFkToUqCode(); }

    public Map<String, WhiteUqFkCQ> getFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode() { return xgetSQueMap("fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode"); }
    public String keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ sq) { return xkeepSQue("fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode", sq); }

    public Map<String, WhiteUqFkCQ> getFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode() { return xgetSQueMap("fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode"); }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ sq) { return xkeepSQue("fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode", sq); }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToUqCode_Asc() { regOBA("FK_TO_UQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToUqCode_Desc() { regOBD("FK_TO_UQ_CODE"); return this; }

    protected ConditionValue _compoundUqFirstCode;
    public ConditionValue getCompoundUqFirstCode()
    { if (_compoundUqFirstCode == null) { _compoundUqFirstCode = nCV(); }
      return _compoundUqFirstCode; }
    protected ConditionValue getCValueCompoundUqFirstCode() { return getCompoundUqFirstCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

    protected ConditionValue _compoundUqSecondCode;
    public ConditionValue getCompoundUqSecondCode()
    { if (_compoundUqSecondCode == null) { _compoundUqSecondCode = nCV(); }
      return _compoundUqSecondCode; }
    protected ConditionValue getCValueCompoundUqSecondCode() { return getCompoundUqSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
    public BsWhiteUqFkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqFkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteUqFkRefCQ bq = (WhiteUqFkRefCQ)bqs;
        WhiteUqFkRefCQ uq = (WhiteUqFkRefCQ)uqs;
        if (bq.hasConditionQueryWhiteUqFkByFkToPkId()) {
            uq.queryWhiteUqFkByFkToPkId().reflectRelationOnUnionQuery(bq.queryWhiteUqFkByFkToPkId(), uq.queryWhiteUqFkByFkToPkId());
        }
        if (bq.hasConditionQueryWhiteUqFkByFkToUqCode()) {
            uq.queryWhiteUqFkByFkToUqCode().reflectRelationOnUnionQuery(bq.queryWhiteUqFkByFkToUqCode(), uq.queryWhiteUqFkByFkToUqCode());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkCQ queryWhiteUqFkByFkToPkId() {
        return getConditionQueryWhiteUqFkByFkToPkId();
    }
    public WhiteUqFkCQ getConditionQueryWhiteUqFkByFkToPkId() {
        String prop = "whiteUqFkByFkToPkId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteUqFkByFkToPkId()); xsetupOuterJoinWhiteUqFkByFkToPkId(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteUqFkCQ xcreateQueryWhiteUqFkByFkToPkId() {
        String nrp = xresolveNRP("white_uq_fk_ref", "whiteUqFkByFkToPkId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteUqFkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteUqFkByFkToPkId", nrp);
    }
    protected void xsetupOuterJoinWhiteUqFkByFkToPkId() { xregOutJo("whiteUqFkByFkToPkId"); }
    public boolean hasConditionQueryWhiteUqFkByFkToPkId() { return xhasQueRlMap("whiteUqFkByFkToPkId"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkCQ queryWhiteUqFkByFkToUqCode() {
        return getConditionQueryWhiteUqFkByFkToUqCode();
    }
    public WhiteUqFkCQ getConditionQueryWhiteUqFkByFkToUqCode() {
        String prop = "whiteUqFkByFkToUqCode";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteUqFkByFkToUqCode()); xsetupOuterJoinWhiteUqFkByFkToUqCode(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteUqFkCQ xcreateQueryWhiteUqFkByFkToUqCode() {
        String nrp = xresolveNRP("white_uq_fk_ref", "whiteUqFkByFkToUqCode"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteUqFkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteUqFkByFkToUqCode", nrp);
    }
    protected void xsetupOuterJoinWhiteUqFkByFkToUqCode() { xregOutJo("whiteUqFkByFkToUqCode"); }
    public boolean hasConditionQueryWhiteUqFkByFkToUqCode() { return xhasQueRlMap("whiteUqFkByFkToUqCode"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteUqFkRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqFkRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteUqFkRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteUqFkRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteUqFkRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteUqFkRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteUqFkRefCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteUqFkRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteUqFkRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteUqFkRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br />
     * {exists (select ... from white_uq_fk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteUqFkRefNestList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefNestList(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefNestCB>", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList(cb.query());
        registerExistsReferrer(cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", pp, "whiteUqFkRefNestList");
    }
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList"); }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br />
     * {not exists (select ... from white_uq_fk_ref_nest where ...)}
     * @param subQuery The sub-query of WhiteUqFkRefNestList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkRefNestList(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefNestCB>", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList(cb.query());
        registerNotExistsReferrer(cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", pp, "whiteUqFkRefNestList");
    }
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_WhiteUqFkRefNestList", sq); }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveWhiteUqFkRefNestList(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", pp, "whiteUqFkRefNestList", al, op);
    }
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_WhiteUqFkRefNestList", sq); }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_uq_fk_ref_nest where ...)} <br />
     * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteUqFkRefNestList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void query(WhiteUqFkRefNestCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefNestCB> derivedWhiteUqFkRefNestList() {
        return xcreateQDRFunctionWhiteUqFkRefNestList();
    }
    protected HpQDRFunction<WhiteUqFkRefNestCB> xcreateQDRFunctionWhiteUqFkRefNestList() {
        return new HpQDRFunction<WhiteUqFkRefNestCB>(new HpQDRSetupper<WhiteUqFkRefNestCB>() {
            public void setup(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteUqFkRefNestList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteUqFkRefNestList(String fn, SubQuery<WhiteUqFkRefNestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", sqpp, "whiteUqFkRefNestList", rd, vl, prpp, op);
    }
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList() { return xgetSQueMap("twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ sq) { return xkeepSQue("twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList", sq); }
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter() { return xgetSQuePmMap("twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestListParameter(Object pm) { return xkeepSQuePm("twoOrMorePk_QueryDerivedReferrer_WhiteUqFkRefNestList", pm); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
