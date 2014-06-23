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
 * The base condition-query of white_implicit_conv_numeric.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvNumericCQ extends AbstractBsWhiteImplicitConvNumericCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvNumericCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvNumericCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_conv_numeric) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitConvNumericCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitConvNumericCIQ xcreateCIQ() {
        WhiteImplicitConvNumericCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitConvNumericCIQ xnewCIQ() {
        return new WhiteImplicitConvNumericCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_conv_numeric on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitConvNumericCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitConvNumericCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _implicitConvNumericId;
    public ConditionValue getImplicitConvNumericId()
    { if (_implicitConvNumericId == null) { _implicitConvNumericId = nCV(); }
      return _implicitConvNumericId; }
    protected ConditionValue getCValueImplicitConvNumericId() { return getImplicitConvNumericId(); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList() { return xgetSQueMap("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList", sq); }
    public Map<String, Object> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter() { return xgetSQuePmMap("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList"); }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object pm) { return xkeepSQuePm("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList", pm); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList", sq); }
    public Map<String, Object> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter() { return xgetSQuePmMap("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object pm) { return xkeepSQuePm("implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvNumericId_Asc() { regOBA("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvNumericId_Desc() { regOBD("IMPLICIT_CONV_NUMERIC_ID"); return this; }

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
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvIntegerId_Asc() { regOBA("IMPLICIT_CONV_INTEGER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvIntegerId_Desc() { regOBD("IMPLICIT_CONV_INTEGER_ID"); return this; }

    protected ConditionValue _implicitConvStringId;
    public ConditionValue getImplicitConvStringId()
    { if (_implicitConvStringId == null) { _implicitConvStringId = nCV(); }
      return _implicitConvStringId; }
    protected ConditionValue getCValueImplicitConvStringId() { return getImplicitConvStringId(); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvString() { return xgetSQueMap("implicitConvStringId_InScopeRelation_WhiteImplicitConvString"); }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvStringId_InScopeRelation_WhiteImplicitConvString", sq); }

    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString() { return xgetSQueMap("implicitConvStringId_NotInScopeRelation_WhiteImplicitConvString"); }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvStringId_NotInScopeRelation_WhiteImplicitConvString", sq); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvStringId_Asc() { regOBA("IMPLICIT_CONV_STRING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvStringId_Desc() { regOBD("IMPLICIT_CONV_STRING_ID"); return this; }

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
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvName_Asc() { regOBA("IMPLICIT_CONV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvName_Desc() { regOBD("IMPLICIT_CONV_NAME"); return this; }

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
    public BsWhiteImplicitConvNumericCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteImplicitConvNumericCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitConvNumericCQ bq = (WhiteImplicitConvNumericCQ)bqs;
        WhiteImplicitConvNumericCQ uq = (WhiteImplicitConvNumericCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitConvInteger()) {
            uq.queryWhiteImplicitConvInteger().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvInteger(), uq.queryWhiteImplicitConvInteger());
        }
        if (bq.hasConditionQueryWhiteImplicitConvString()) {
            uq.queryWhiteImplicitConvString().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvString(), uq.queryWhiteImplicitConvString());
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
        String nrp = xresolveNRP("white_implicit_conv_numeric", "whiteImplicitConvInteger"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitConvIntegerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitConvInteger", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitConvInteger() { xregOutJo("whiteImplicitConvInteger"); }
    public boolean hasConditionQueryWhiteImplicitConvInteger() { return xhasQueRlMap("whiteImplicitConvInteger"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvStringCQ queryWhiteImplicitConvString() {
        return getConditionQueryWhiteImplicitConvString();
    }
    public WhiteImplicitConvStringCQ getConditionQueryWhiteImplicitConvString() {
        String prop = "whiteImplicitConvString";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitConvString()); xsetupOuterJoinWhiteImplicitConvString(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteImplicitConvStringCQ xcreateQueryWhiteImplicitConvString() {
        String nrp = xresolveNRP("white_implicit_conv_numeric", "whiteImplicitConvString"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitConvStringCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitConvString", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitConvString() { xregOutJo("whiteImplicitConvString"); }
    public boolean hasConditionQueryWhiteImplicitConvString() { return xhasQueRlMap("whiteImplicitConvString"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteImplicitConvNumericCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteImplicitConvNumericCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteImplicitConvNumericCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitConvNumericCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteImplicitConvNumericCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitConvNumericCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitConvNumericCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
