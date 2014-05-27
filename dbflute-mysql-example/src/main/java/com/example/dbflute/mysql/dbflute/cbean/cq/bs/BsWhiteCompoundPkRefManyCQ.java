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
 * The base condition-query of white_compound_pk_ref_many.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefManyCQ extends AbstractBsWhiteCompoundPkRefManyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefManyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefManyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk_ref_many) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkRefManyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkRefManyCIQ xcreateCIQ() {
        WhiteCompoundPkRefManyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkRefManyCIQ xnewCIQ() {
        return new WhiteCompoundPkRefManyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk_ref_many on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkRefManyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkRefManyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _multipleFirstId;
    public ConditionValue getMultipleFirstId() {
        if (_multipleFirstId == null) { _multipleFirstId = nCV(); }
        return _multipleFirstId;
    }
    protected ConditionValue getCValueMultipleFirstId() { return getMultipleFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_MultipleFirstId_Asc() { regOBA("MULTIPLE_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_MultipleFirstId_Desc() { regOBD("MULTIPLE_FIRST_ID"); return this; }

    protected ConditionValue _multipleSecondId;
    public ConditionValue getMultipleSecondId() {
        if (_multipleSecondId == null) { _multipleSecondId = nCV(); }
        return _multipleSecondId;
    }
    protected ConditionValue getCValueMultipleSecondId() { return getMultipleSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_MultipleSecondId_Asc() { regOBA("MULTIPLE_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_MultipleSecondId_Desc() { regOBD("MULTIPLE_SECOND_ID"); return this; }

    protected ConditionValue _refManyFirstId;
    public ConditionValue getRefManyFirstId() {
        if (_refManyFirstId == null) { _refManyFirstId = nCV(); }
        return _refManyFirstId;
    }
    protected ConditionValue getCValueRefManyFirstId() { return getRefManyFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyFirstId_Asc() { regOBA("REF_MANY_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyFirstId_Desc() { regOBD("REF_MANY_FIRST_ID"); return this; }

    protected ConditionValue _refManySecondId;
    public ConditionValue getRefManySecondId() {
        if (_refManySecondId == null) { _refManySecondId = nCV(); }
        return _refManySecondId;
    }
    protected ConditionValue getCValueRefManySecondId() { return getRefManySecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManySecondId_Asc() { regOBA("REF_MANY_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManySecondId_Desc() { regOBD("REF_MANY_SECOND_ID"); return this; }

    protected ConditionValue _refManyCode;
    public ConditionValue getRefManyCode() {
        if (_refManyCode == null) { _refManyCode = nCV(); }
        return _refManyCode;
    }
    protected ConditionValue getCValueRefManyCode() { return getRefManyCode(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyCode_Asc() { regOBA("REF_MANY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyCode_Desc() { regOBD("REF_MANY_CODE"); return this; }

    protected ConditionValue _refManyName;
    public ConditionValue getRefManyName() {
        if (_refManyName == null) { _refManyName = nCV(); }
        return _refManyName;
    }
    protected ConditionValue getCValueRefManyName() { return getRefManyName(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyName_Asc() { regOBA("REF_MANY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyName_Desc() { regOBD("REF_MANY_NAME"); return this; }

    protected ConditionValue _refManyDatetime;
    public ConditionValue getRefManyDatetime() {
        if (_refManyDatetime == null) { _refManyDatetime = nCV(); }
        return _refManyDatetime;
    }
    protected ConditionValue getCValueRefManyDatetime() { return getRefManyDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyDatetime_Asc() { regOBA("REF_MANY_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefManyCQ addOrderBy_RefManyDatetime_Desc() { regOBD("REF_MANY_DATETIME"); return this; }

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
    public BsWhiteCompoundPkRefManyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteCompoundPkRefManyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteCompoundPkRefManyCQ bq = (WhiteCompoundPkRefManyCQ)bqs;
        WhiteCompoundPkRefManyCQ uq = (WhiteCompoundPkRefManyCQ)uqs;
        if (bq.hasConditionQueryWhiteCompoundPkToPK()) {
            uq.queryWhiteCompoundPkToPK().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPkToPK(), uq.queryWhiteCompoundPkToPK());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkCQ queryWhiteCompoundPkToPK() {
        return getConditionQueryWhiteCompoundPkToPK();
    }
    protected WhiteCompoundPkCQ _conditionQueryWhiteCompoundPkToPK;
    public WhiteCompoundPkCQ getConditionQueryWhiteCompoundPkToPK() {
        if (_conditionQueryWhiteCompoundPkToPK == null) {
            _conditionQueryWhiteCompoundPkToPK = xcreateQueryWhiteCompoundPkToPK();
            xsetupOuterJoinWhiteCompoundPkToPK();
        }
        return _conditionQueryWhiteCompoundPkToPK;
    }
    protected WhiteCompoundPkCQ xcreateQueryWhiteCompoundPkToPK() {
        String nrp = resolveNextRelationPath("white_compound_pk_ref_many", "whiteCompoundPkToPK");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteCompoundPkCQ cq = new WhiteCompoundPkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteCompoundPkToPK");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteCompoundPkToPK() {
        WhiteCompoundPkCQ cq = getConditionQueryWhiteCompoundPkToPK();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("REF_MANY_FIRST_ID", "PK_FIRST_ID");
        joinOnMap.put("REF_MANY_SECOND_ID", "PK_SECOND_ID");
        registerOuterJoin(cq, joinOnMap, "whiteCompoundPkToPK");
    }
    public boolean hasConditionQueryWhiteCompoundPkToPK() {
        return _conditionQueryWhiteCompoundPkToPK != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkRefManyCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkRefManyCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
