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
 * The base condition-query of white_additional.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAdditionalCQ extends AbstractBsWhiteAdditionalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAdditionalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAdditionalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_additional) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteAdditionalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteAdditionalCIQ xcreateCIQ() {
        WhiteAdditionalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteAdditionalCIQ xnewCIQ() {
        return new WhiteAdditionalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_additional on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteAdditionalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteAdditionalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fooId;
    public ConditionValue getFooId()
    { if (_fooId == null) { _fooId = nCV(); }
      return _fooId; }
    protected ConditionValue getCValueFooId() { return getFooId(); }

    /** 
     * Add order-by as ascend. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_FooId_Asc() { regOBA("foo_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_FooId_Desc() { regOBD("foo_id"); return this; }

    protected ConditionValue _fooName;
    public ConditionValue getFooName()
    { if (_fooName == null) { _fooName = nCV(); }
      return _fooName; }
    protected ConditionValue getCValueFooName() { return getFooName(); }

    /** 
     * Add order-by as ascend. <br />
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_FooName_Asc() { regOBA("foo_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_FooName_Desc() { regOBD("foo_name"); return this; }

    protected ConditionValue _fooDate;
    public ConditionValue getFooDate()
    { if (_fooDate == null) { _fooDate = nCV(); }
      return _fooDate; }
    protected ConditionValue getCValueFooDate() { return getFooDate(); }

    /** 
     * Add order-by as ascend. <br />
     * foo_date: {UnknownType}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_FooDate_Asc() { regOBA("foo_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * foo_date: {UnknownType}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_FooDate_Desc() { regOBD("foo_date"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsWhiteAdditionalCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsWhiteAdditionalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteAdditionalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteAdditionalCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteAdditionalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteAdditionalCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteAdditionalCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteAdditionalCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteAdditionalCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteAdditionalCQ> _myselfExistsMap;
    public Map<String, WhiteAdditionalCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteAdditionalCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteAdditionalCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteAdditionalCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteAdditionalCB.class.getName(); }
    protected String xCQ() { return WhiteAdditionalCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
