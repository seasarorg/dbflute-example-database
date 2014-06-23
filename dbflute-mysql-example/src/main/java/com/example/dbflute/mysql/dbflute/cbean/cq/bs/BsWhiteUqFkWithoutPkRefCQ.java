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
 * The base condition-query of white_uq_fk_without_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkWithoutPkRefCQ extends AbstractBsWhiteUqFkWithoutPkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkWithoutPkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkWithoutPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_fk_without_pk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkWithoutPkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkWithoutPkRefCIQ xcreateCIQ() {
        WhiteUqFkWithoutPkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkWithoutPkRefCIQ xnewCIQ() {
        return new WhiteUqFkWithoutPkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_fk_without_pk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkWithoutPkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkWithoutPkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * UQ_FK_REF_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_UqFkRefId_Asc() { regOBA("UQ_FK_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_UqFkRefId_Desc() { regOBD("UQ_FK_REF_ID"); return this; }

    protected ConditionValue _fkToUqCode;
    public ConditionValue getFkToUqCode()
    { if (_fkToUqCode == null) { _fkToUqCode = nCV(); }
      return _fkToUqCode; }
    protected ConditionValue getCValueFkToUqCode() { return getFkToUqCode(); }

    public Map<String, WhiteUqFkWithoutPkCQ> getFkToUqCode_InScopeRelation_WhiteUqFkWithoutPk() { return xgetSQueMap("fkToUqCode_InScopeRelation_WhiteUqFkWithoutPk"); }
    public String keepFkToUqCode_InScopeRelation_WhiteUqFkWithoutPk(WhiteUqFkWithoutPkCQ sq) { return xkeepSQue("fkToUqCode_InScopeRelation_WhiteUqFkWithoutPk", sq); }

    public Map<String, WhiteUqFkWithoutPkCQ> getFkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk() { return xgetSQueMap("fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk"); }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk(WhiteUqFkWithoutPkCQ sq) { return xkeepSQue("fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk", sq); }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk_without_pk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_FkToUqCode_Asc() { regOBA("FK_TO_UQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk_without_pk}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_FkToUqCode_Desc() { regOBD("FK_TO_UQ_CODE"); return this; }

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
    public BsWhiteUqFkWithoutPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqFkWithoutPkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteUqFkWithoutPkRefCQ bq = (WhiteUqFkWithoutPkRefCQ)bqs;
        WhiteUqFkWithoutPkRefCQ uq = (WhiteUqFkWithoutPkRefCQ)uqs;
        if (bq.hasConditionQueryWhiteUqFkWithoutPk()) {
            uq.queryWhiteUqFkWithoutPk().reflectRelationOnUnionQuery(bq.queryWhiteUqFkWithoutPk(), uq.queryWhiteUqFkWithoutPk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_fk_without_pk by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkWithoutPkCQ queryWhiteUqFkWithoutPk() {
        return getConditionQueryWhiteUqFkWithoutPk();
    }
    public WhiteUqFkWithoutPkCQ getConditionQueryWhiteUqFkWithoutPk() {
        String prop = "whiteUqFkWithoutPk";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteUqFkWithoutPk()); xsetupOuterJoinWhiteUqFkWithoutPk(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteUqFkWithoutPkCQ xcreateQueryWhiteUqFkWithoutPk() {
        String nrp = xresolveNRP("white_uq_fk_without_pk_ref", "whiteUqFkWithoutPk"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteUqFkWithoutPkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteUqFkWithoutPk", nrp);
    }
    protected void xsetupOuterJoinWhiteUqFkWithoutPk() { xregOutJo("whiteUqFkWithoutPk"); }
    public boolean hasConditionQueryWhiteUqFkWithoutPk() { return xhasQueRlMap("whiteUqFkWithoutPk"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteUqFkWithoutPkRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkWithoutPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkWithoutPkRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
