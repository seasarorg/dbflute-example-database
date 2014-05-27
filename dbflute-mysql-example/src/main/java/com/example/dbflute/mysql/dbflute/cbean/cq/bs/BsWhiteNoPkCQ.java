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
 * The base condition-query of white_no_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteNoPkCQ extends AbstractBsWhiteNoPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteNoPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteNoPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_no_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteNoPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteNoPkCIQ xcreateCIQ() {
        WhiteNoPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteNoPkCIQ xnewCIQ() {
        return new WhiteNoPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_no_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteNoPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteNoPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _noPkId;
    public ConditionValue getNoPkId() {
        if (_noPkId == null) { _noPkId = nCV(); }
        return _noPkId;
    }
    protected ConditionValue getCValueNoPkId() { return getNoPkId(); }

    /** 
     * Add order-by as ascend. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteNoPkCQ addOrderBy_NoPkId_Asc() { regOBA("NO_PK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteNoPkCQ addOrderBy_NoPkId_Desc() { regOBD("NO_PK_ID"); return this; }

    protected ConditionValue _noPkName;
    public ConditionValue getNoPkName() {
        if (_noPkName == null) { _noPkName = nCV(); }
        return _noPkName;
    }
    protected ConditionValue getCValueNoPkName() { return getNoPkName(); }

    /** 
     * Add order-by as ascend. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteNoPkCQ addOrderBy_NoPkName_Asc() { regOBA("NO_PK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * NO_PK_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteNoPkCQ addOrderBy_NoPkName_Desc() { regOBD("NO_PK_NAME"); return this; }

    protected ConditionValue _noPkInteger;
    public ConditionValue getNoPkInteger() {
        if (_noPkInteger == null) { _noPkInteger = nCV(); }
        return _noPkInteger;
    }
    protected ConditionValue getCValueNoPkInteger() { return getNoPkInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNoPkCQ addOrderBy_NoPkInteger_Asc() { regOBA("NO_PK_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * NO_PK_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNoPkCQ addOrderBy_NoPkInteger_Desc() { regOBD("NO_PK_INTEGER"); return this; }

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
    public BsWhiteNoPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteNoPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteNoPkCB.class.getName(); }
    protected String xCQ() { return WhiteNoPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
