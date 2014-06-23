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
 * The base condition-query of white_geared_cipher.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteGearedCipherCQ extends AbstractBsWhiteGearedCipherCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteGearedCipherCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteGearedCipherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_geared_cipher) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteGearedCipherCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteGearedCipherCIQ xcreateCIQ() {
        WhiteGearedCipherCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteGearedCipherCIQ xnewCIQ() {
        return new WhiteGearedCipherCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_geared_cipher on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteGearedCipherCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteGearedCipherCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cipherId;
    public ConditionValue getCipherId()
    { if (_cipherId == null) { _cipherId = nCV(); }
      return _cipherId; }
    protected ConditionValue getCValueCipherId() { return getCipherId(); }

    /** 
     * Add order-by as ascend. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherId_Asc() { regOBA("CIPHER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherId_Desc() { regOBD("CIPHER_ID"); return this; }

    protected ConditionValue _cipherInteger;
    public ConditionValue getCipherInteger()
    { if (_cipherInteger == null) { _cipherInteger = nCV(); }
      return _cipherInteger; }
    protected ConditionValue getCValueCipherInteger() { return getCipherInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherInteger_Asc() { regOBA("CIPHER_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherInteger_Desc() { regOBD("CIPHER_INTEGER"); return this; }

    protected ConditionValue _cipherVarchar;
    public ConditionValue getCipherVarchar()
    { if (_cipherVarchar == null) { _cipherVarchar = nCV(); }
      return _cipherVarchar; }
    protected ConditionValue getCValueCipherVarchar() { return getCipherVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherVarchar_Asc() { regOBA("CIPHER_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherVarchar_Desc() { regOBD("CIPHER_VARCHAR"); return this; }

    protected ConditionValue _cipherDate;
    public ConditionValue getCipherDate()
    { if (_cipherDate == null) { _cipherDate = nCV(); }
      return _cipherDate; }
    protected ConditionValue getCValueCipherDate() { return getCipherDate(); }

    /** 
     * Add order-by as ascend. <br />
     * CIPHER_DATE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherDate_Asc() { regOBA("CIPHER_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CIPHER_DATE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherDate_Desc() { regOBD("CIPHER_DATE"); return this; }

    protected ConditionValue _cipherDatetime;
    public ConditionValue getCipherDatetime()
    { if (_cipherDatetime == null) { _cipherDatetime = nCV(); }
      return _cipherDatetime; }
    protected ConditionValue getCValueCipherDatetime() { return getCipherDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherDatetime_Asc() { regOBA("CIPHER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteGearedCipherCQ addOrderBy_CipherDatetime_Desc() { regOBD("CIPHER_DATETIME"); return this; }

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
    public BsWhiteGearedCipherCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteGearedCipherCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteGearedCipherCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteGearedCipherCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteGearedCipherCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteGearedCipherCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteGearedCipherCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteGearedCipherCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteGearedCipherCQ> _myselfExistsMap;
    public Map<String, WhiteGearedCipherCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteGearedCipherCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteGearedCipherCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteGearedCipherCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteGearedCipherCB.class.getName(); }
    protected String xCQ() { return WhiteGearedCipherCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
