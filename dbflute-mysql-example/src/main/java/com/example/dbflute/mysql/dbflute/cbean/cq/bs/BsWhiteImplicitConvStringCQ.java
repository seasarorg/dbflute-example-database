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
 * The base condition-query of white_implicit_conv_string.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvStringCQ extends AbstractBsWhiteImplicitConvStringCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvStringCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvStringCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_conv_string) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitConvStringCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitConvStringCIQ xcreateCIQ() {
        WhiteImplicitConvStringCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitConvStringCIQ xnewCIQ() {
        return new WhiteImplicitConvStringCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_conv_string on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitConvStringCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitConvStringCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _implicitConvStringId;
    public ConditionValue getImplicitConvStringId()
    { if (_implicitConvStringId == null) { _implicitConvStringId = nCV(); }
      return _implicitConvStringId; }
    protected ConditionValue getCValueImplicitConvStringId() { return getImplicitConvStringId(); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList", sq); }
    public Map<String, Object> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter() { return xgetSQuePmMap("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object pm) { return xkeepSQuePm("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList", pm); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList", sq); }
    public Map<String, Object> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter() { return xgetSQuePmMap("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object pm) { return xkeepSQuePm("implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvStringId_Asc() { regOBA("IMPLICIT_CONV_STRING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvStringId_Desc() { regOBD("IMPLICIT_CONV_STRING_ID"); return this; }

    protected ConditionValue _implicitConvIntegerId;
    public ConditionValue getImplicitConvIntegerId()
    { if (_implicitConvIntegerId == null) { _implicitConvIntegerId = nCV(); }
      return _implicitConvIntegerId; }
    protected ConditionValue getCValueImplicitConvIntegerId() { return getImplicitConvIntegerId(); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger() { return xgetSQueMap("implicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger"); }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger() { return xgetSQueMap("implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger"); }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger", sq); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvIntegerId_Asc() { regOBA("IMPLICIT_CONV_INTEGER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvIntegerId_Desc() { regOBD("IMPLICIT_CONV_INTEGER_ID"); return this; }

    protected ConditionValue _implicitConvNumericId;
    public ConditionValue getImplicitConvNumericId()
    { if (_implicitConvNumericId == null) { _implicitConvNumericId = nCV(); }
      return _implicitConvNumericId; }
    protected ConditionValue getCValueImplicitConvNumericId() { return getImplicitConvNumericId(); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric() { return xgetSQueMap("implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric"); }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric() { return xgetSQueMap("implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric"); }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric", sq); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvNumericId_Asc() { regOBA("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvNumericId_Desc() { regOBD("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    protected ConditionValue _implicitConvName;
    public ConditionValue getImplicitConvName()
    { if (_implicitConvName == null) { _implicitConvName = nCV(); }
      return _implicitConvName; }
    protected ConditionValue getCValueImplicitConvName() { return getImplicitConvName(); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvName_Asc() { regOBA("IMPLICIT_CONV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvName_Desc() { regOBD("IMPLICIT_CONV_NAME"); return this; }

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
    public BsWhiteImplicitConvStringCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteImplicitConvStringCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitConvStringCQ bq = (WhiteImplicitConvStringCQ)bqs;
        WhiteImplicitConvStringCQ uq = (WhiteImplicitConvStringCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitConvInteger()) {
            uq.queryWhiteImplicitConvInteger().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvInteger(), uq.queryWhiteImplicitConvInteger());
        }
        if (bq.hasConditionQueryWhiteImplicitConvNumeric()) {
            uq.queryWhiteImplicitConvNumeric().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvNumeric(), uq.queryWhiteImplicitConvNumeric());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvIntegerCQ queryWhiteImplicitConvInteger() {
        return getConditionQueryWhiteImplicitConvInteger();
    }
    public WhiteImplicitConvIntegerCQ getConditionQueryWhiteImplicitConvInteger() {
        String prop = "whiteImplicitConvInteger";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitConvInteger()); xsetupOuterJoinWhiteImplicitConvInteger(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteImplicitConvIntegerCQ xcreateQueryWhiteImplicitConvInteger() {
        String nrp = xresolveNRP("white_implicit_conv_string", "whiteImplicitConvInteger"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitConvIntegerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitConvInteger", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitConvInteger() { xregOutJo("whiteImplicitConvInteger"); }
    public boolean hasConditionQueryWhiteImplicitConvInteger() { return xhasQueRlMap("whiteImplicitConvInteger"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvNumericCQ queryWhiteImplicitConvNumeric() {
        return getConditionQueryWhiteImplicitConvNumeric();
    }
    public WhiteImplicitConvNumericCQ getConditionQueryWhiteImplicitConvNumeric() {
        String prop = "whiteImplicitConvNumeric";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitConvNumeric()); xsetupOuterJoinWhiteImplicitConvNumeric(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteImplicitConvNumericCQ xcreateQueryWhiteImplicitConvNumeric() {
        String nrp = xresolveNRP("white_implicit_conv_string", "whiteImplicitConvNumeric"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitConvNumericCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitConvNumeric", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitConvNumeric() { xregOutJo("whiteImplicitConvNumeric"); }
    public boolean hasConditionQueryWhiteImplicitConvNumeric() { return xhasQueRlMap("whiteImplicitConvNumeric"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteImplicitConvStringCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteImplicitConvStringCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteImplicitConvStringCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvStringCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteImplicitConvStringCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteImplicitConvStringCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitConvStringCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteImplicitConvStringCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteImplicitConvStringCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteImplicitConvStringCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitConvStringCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitConvStringCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
