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
 * The base condition-query of white_all_in_one_cls_normal_col_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAllInOneClsNormalColRefCQ extends AbstractBsWhiteAllInOneClsNormalColRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAllInOneClsNormalColRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAllInOneClsNormalColRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_all_in_one_cls_normal_col_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteAllInOneClsNormalColRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteAllInOneClsNormalColRefCIQ xcreateCIQ() {
        WhiteAllInOneClsNormalColRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteAllInOneClsNormalColRefCIQ xnewCIQ() {
        return new WhiteAllInOneClsNormalColRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_all_in_one_cls_normal_col_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteAllInOneClsNormalColRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteAllInOneClsNormalColRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _clsRefId;
    public ConditionValue getClsRefId() {
        if (_clsRefId == null) { _clsRefId = nCV(); }
        return _clsRefId;
    }
    protected ConditionValue getCValueClsRefId() { return getClsRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_ClsRefId_Asc() { regOBA("CLS_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CLS_REF_ID: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_ClsRefId_Desc() { regOBD("CLS_REF_ID"); return this; }

    protected ConditionValue _fooCode;
    public ConditionValue getFooCode() {
        if (_fooCode == null) { _fooCode = nCV(); }
        return _fooCode;
    }
    protected ConditionValue getCValueFooCode() { return getFooCode(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_FooCode_Asc() { regOBA("FOO_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_FooCode_Desc() { regOBD("FOO_CODE"); return this; }

    protected ConditionValue _barCode;
    public ConditionValue getBarCode() {
        if (_barCode == null) { _barCode = nCV(); }
        return _barCode;
    }
    protected ConditionValue getCValueBarCode() { return getBarCode(); }

    /** 
     * Add order-by as ascend. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_BarCode_Asc() { regOBA("BAR_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_BarCode_Desc() { regOBD("BAR_CODE"); return this; }

    protected ConditionValue _quxCode;
    public ConditionValue getQuxCode() {
        if (_quxCode == null) { _quxCode = nCV(); }
        return _quxCode;
    }
    protected ConditionValue getCValueQuxCode() { return getQuxCode(); }

    /** 
     * Add order-by as ascend. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_QuxCode_Asc() { regOBA("QUX_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsNormalColRefCQ addOrderBy_QuxCode_Desc() { regOBD("QUX_CODE"); return this; }

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
    public BsWhiteAllInOneClsNormalColRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteAllInOneClsNormalColRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteAllInOneClsNormalColRefCQ bq = (WhiteAllInOneClsNormalColRefCQ)bqs;
        WhiteAllInOneClsNormalColRefCQ uq = (WhiteAllInOneClsNormalColRefCQ)uqs;
        if (bq.hasConditionQueryWhiteAllInOneClsElementAsFoo()) {
            uq.queryWhiteAllInOneClsElementAsFoo().reflectRelationOnUnionQuery(bq.queryWhiteAllInOneClsElementAsFoo(), uq.queryWhiteAllInOneClsElementAsFoo());
        }
        if (bq.hasConditionQueryWhiteAllInOneClsElementAsBar()) {
            uq.queryWhiteAllInOneClsElementAsBar().reflectRelationOnUnionQuery(bq.queryWhiteAllInOneClsElementAsBar(), uq.queryWhiteAllInOneClsElementAsBar());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteAllInOneClsElementCQ queryWhiteAllInOneClsElementAsFoo() {
        return getConditionQueryWhiteAllInOneClsElementAsFoo();
    }
    protected WhiteAllInOneClsElementCQ _conditionQueryWhiteAllInOneClsElementAsFoo;
    public WhiteAllInOneClsElementCQ getConditionQueryWhiteAllInOneClsElementAsFoo() {
        if (_conditionQueryWhiteAllInOneClsElementAsFoo == null) {
            _conditionQueryWhiteAllInOneClsElementAsFoo = xcreateQueryWhiteAllInOneClsElementAsFoo();
            xsetupOuterJoinWhiteAllInOneClsElementAsFoo();
        }
        return _conditionQueryWhiteAllInOneClsElementAsFoo;
    }
    protected WhiteAllInOneClsElementCQ xcreateQueryWhiteAllInOneClsElementAsFoo() {
        String nrp = resolveNextRelationPath("white_all_in_one_cls_normal_col_ref", "whiteAllInOneClsElementAsFoo");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteAllInOneClsElementCQ cq = new WhiteAllInOneClsElementCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteAllInOneClsElementAsFoo");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteAllInOneClsElementAsFoo() {
        WhiteAllInOneClsElementCQ cq = getConditionQueryWhiteAllInOneClsElementAsFoo();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FOO_CODE", "CLS_ELEMENT_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteAllInOneClsElementAsFoo");
    }
    public boolean hasConditionQueryWhiteAllInOneClsElementAsFoo() {
        return _conditionQueryWhiteAllInOneClsElementAsFoo != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteAllInOneClsElementCQ queryWhiteAllInOneClsElementAsBar() {
        return getConditionQueryWhiteAllInOneClsElementAsBar();
    }
    protected WhiteAllInOneClsElementCQ _conditionQueryWhiteAllInOneClsElementAsBar;
    public WhiteAllInOneClsElementCQ getConditionQueryWhiteAllInOneClsElementAsBar() {
        if (_conditionQueryWhiteAllInOneClsElementAsBar == null) {
            _conditionQueryWhiteAllInOneClsElementAsBar = xcreateQueryWhiteAllInOneClsElementAsBar();
            xsetupOuterJoinWhiteAllInOneClsElementAsBar();
        }
        return _conditionQueryWhiteAllInOneClsElementAsBar;
    }
    protected WhiteAllInOneClsElementCQ xcreateQueryWhiteAllInOneClsElementAsBar() {
        String nrp = resolveNextRelationPath("white_all_in_one_cls_normal_col_ref", "whiteAllInOneClsElementAsBar");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteAllInOneClsElementCQ cq = new WhiteAllInOneClsElementCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteAllInOneClsElementAsBar");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteAllInOneClsElementAsBar() {
        WhiteAllInOneClsElementCQ cq = getConditionQueryWhiteAllInOneClsElementAsBar();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("BAR_CODE", "CLS_ELEMENT_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteAllInOneClsElementAsBar");
    }
    public boolean hasConditionQueryWhiteAllInOneClsElementAsBar() {
        return _conditionQueryWhiteAllInOneClsElementAsBar != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteAllInOneClsNormalColRefCQ> _scalarConditionMap;
    public Map<String, WhiteAllInOneClsNormalColRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteAllInOneClsNormalColRefCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteAllInOneClsNormalColRefCB.class.getName(); }
    protected String xCQ() { return WhiteAllInOneClsNormalColRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
