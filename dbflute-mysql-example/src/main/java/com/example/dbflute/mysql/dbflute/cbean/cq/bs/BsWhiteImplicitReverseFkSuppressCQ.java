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
 * The base condition-query of white_implicit_reverse_fk_suppress.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitReverseFkSuppressCQ extends AbstractBsWhiteImplicitReverseFkSuppressCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitReverseFkSuppressCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitReverseFkSuppressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_reverse_fk_suppress) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitReverseFkSuppressCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitReverseFkSuppressCIQ xcreateCIQ() {
        WhiteImplicitReverseFkSuppressCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitReverseFkSuppressCIQ xnewCIQ() {
        return new WhiteImplicitReverseFkSuppressCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_reverse_fk_suppress on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitReverseFkSuppressCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitReverseFkSuppressCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _whiteImplicitReverseFkSuppressId;
    public ConditionValue getWhiteImplicitReverseFkSuppressId()
    { if (_whiteImplicitReverseFkSuppressId == null) { _whiteImplicitReverseFkSuppressId = nCV(); }
      return _whiteImplicitReverseFkSuppressId; }
    protected ConditionValue getCValueWhiteImplicitReverseFkSuppressId() { return getWhiteImplicitReverseFkSuppressId(); }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_WhiteImplicitReverseFkSuppressId_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_WhiteImplicitReverseFkSuppressId_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID"); return this; }

    protected ConditionValue _whiteImplicitReverseFkId;
    public ConditionValue getWhiteImplicitReverseFkId()
    { if (_whiteImplicitReverseFkId == null) { _whiteImplicitReverseFkId = nCV(); }
      return _whiteImplicitReverseFkId; }
    protected ConditionValue getCValueWhiteImplicitReverseFkId() { return getWhiteImplicitReverseFkId(); }

    /** 
     * Add order-by as ascend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_WhiteImplicitReverseFkId_Asc() { regOBA("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_WhiteImplicitReverseFkId_Desc() { regOBD("WHITE_IMPLICIT_REVERSE_FK_ID"); return this; }

    protected ConditionValue _validBeginDate;
    public ConditionValue getValidBeginDate()
    { if (_validBeginDate == null) { _validBeginDate = nCV(); }
      return _validBeginDate; }
    protected ConditionValue getCValueValidBeginDate() { return getValidBeginDate(); }

    /** 
     * Add order-by as ascend. <br />
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_ValidBeginDate_Asc() { regOBA("VALID_BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_ValidBeginDate_Desc() { regOBD("VALID_BEGIN_DATE"); return this; }

    protected ConditionValue _validEndDate;
    public ConditionValue getValidEndDate()
    { if (_validEndDate == null) { _validEndDate = nCV(); }
      return _validEndDate; }
    protected ConditionValue getCValueValidEndDate() { return getValidEndDate(); }

    /** 
     * Add order-by as ascend. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_ValidEndDate_Asc() { regOBA("VALID_END_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitReverseFkSuppressCQ addOrderBy_ValidEndDate_Desc() { regOBD("VALID_END_DATE"); return this; }

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
    public BsWhiteImplicitReverseFkSuppressCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteImplicitReverseFkSuppressCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteImplicitReverseFkSuppressCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteImplicitReverseFkSuppressCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteImplicitReverseFkSuppressCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteImplicitReverseFkSuppressCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteImplicitReverseFkSuppressCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteImplicitReverseFkSuppressCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteImplicitReverseFkSuppressCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitReverseFkSuppressCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteImplicitReverseFkSuppressCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteImplicitReverseFkSuppressCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteImplicitReverseFkSuppressCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitReverseFkSuppressCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitReverseFkSuppressCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
