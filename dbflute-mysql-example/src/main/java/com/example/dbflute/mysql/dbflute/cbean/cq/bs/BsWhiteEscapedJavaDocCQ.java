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
 * The base condition-query of white_escaped_java_doc.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteEscapedJavaDocCQ extends AbstractBsWhiteEscapedJavaDocCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteEscapedJavaDocCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteEscapedJavaDocCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_escaped_java_doc) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteEscapedJavaDocCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteEscapedJavaDocCIQ xcreateCIQ() {
        WhiteEscapedJavaDocCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteEscapedJavaDocCIQ xnewCIQ() {
        return new WhiteEscapedJavaDocCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_escaped_java_doc on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteEscapedJavaDocCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteEscapedJavaDocCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _escapedJavaDocCode;
    public ConditionValue getEscapedJavaDocCode()
    { if (_escapedJavaDocCode == null) { _escapedJavaDocCode = nCV(); }
      return _escapedJavaDocCode; }
    protected ConditionValue getCValueEscapedJavaDocCode() { return getEscapedJavaDocCode(); }

    /** 
     * Add order-by as ascend. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @return this. (NotNull)
     */
    public BsWhiteEscapedJavaDocCQ addOrderBy_EscapedJavaDocCode_Asc() { regOBA("ESCAPED_JAVA_DOC_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @return this. (NotNull)
     */
    public BsWhiteEscapedJavaDocCQ addOrderBy_EscapedJavaDocCode_Desc() { regOBD("ESCAPED_JAVA_DOC_CODE"); return this; }

    protected ConditionValue _escapedJavaDocName;
    public ConditionValue getEscapedJavaDocName()
    { if (_escapedJavaDocName == null) { _escapedJavaDocName = nCV(); }
      return _escapedJavaDocName; }
    protected ConditionValue getCValueEscapedJavaDocName() { return getEscapedJavaDocName(); }

    /** 
     * Add order-by as ascend. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteEscapedJavaDocCQ addOrderBy_EscapedJavaDocName_Asc() { regOBA("ESCAPED_JAVA_DOC_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteEscapedJavaDocCQ addOrderBy_EscapedJavaDocName_Desc() { regOBD("ESCAPED_JAVA_DOC_NAME"); return this; }

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
    public BsWhiteEscapedJavaDocCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteEscapedJavaDocCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteEscapedJavaDocCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteEscapedJavaDocCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteEscapedJavaDocCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteEscapedJavaDocCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteEscapedJavaDocCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteEscapedJavaDocCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteEscapedJavaDocCQ> _myselfExistsMap;
    public Map<String, WhiteEscapedJavaDocCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteEscapedJavaDocCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteEscapedJavaDocCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteEscapedJavaDocCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteEscapedJavaDocCB.class.getName(); }
    protected String xCQ() { return WhiteEscapedJavaDocCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
