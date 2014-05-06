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
 * The base condition-query of white_all_in_one_cls_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAllInOneClsCompoundPkRefCQ extends AbstractBsWhiteAllInOneClsCompoundPkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAllInOneClsCompoundPkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAllInOneClsCompoundPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_all_in_one_cls_compound_pk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteAllInOneClsCompoundPkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteAllInOneClsCompoundPkRefCIQ xcreateCIQ() {
        WhiteAllInOneClsCompoundPkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteAllInOneClsCompoundPkRefCIQ xnewCIQ() {
        return new WhiteAllInOneClsCompoundPkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_all_in_one_cls_compound_pk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteAllInOneClsCompoundPkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteAllInOneClsCompoundPkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _fooCode;
    public ConditionValue getFooCode() {
        if (_fooCode == null) { _fooCode = nCV(); }
        return _fooCode;
    }
    protected ConditionValue getCValueFooCode() { return getFooCode(); }

    /** 
     * Add order-by as ascend. <br />
     * FOO_CODE: {PK, UQ, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCompoundPkRefCQ addOrderBy_FooCode_Asc() { regOBA("FOO_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FOO_CODE: {PK, UQ, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCompoundPkRefCQ addOrderBy_FooCode_Desc() { regOBD("FOO_CODE"); return this; }

    protected ConditionValue _barCode;
    public ConditionValue getBarCode() {
        if (_barCode == null) { _barCode = nCV(); }
        return _barCode;
    }
    protected ConditionValue getCValueBarCode() { return getBarCode(); }

    /** 
     * Add order-by as ascend. <br />
     * BAR_CODE: {PK, UQ+, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCompoundPkRefCQ addOrderBy_BarCode_Asc() { regOBA("BAR_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BAR_CODE: {PK, UQ+, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCompoundPkRefCQ addOrderBy_BarCode_Desc() { regOBD("BAR_CODE"); return this; }

    protected ConditionValue _quxCode;
    public ConditionValue getQuxCode() {
        if (_quxCode == null) { _quxCode = nCV(); }
        return _quxCode;
    }
    protected ConditionValue getCValueQuxCode() { return getQuxCode(); }

    /** 
     * Add order-by as ascend. <br />
     * QUX_CODE: {PK, UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCompoundPkRefCQ addOrderBy_QuxCode_Asc() { regOBA("QUX_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * QUX_CODE: {PK, UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCompoundPkRefCQ addOrderBy_QuxCode_Desc() { regOBD("QUX_CODE"); return this; }

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
    public BsWhiteAllInOneClsCompoundPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteAllInOneClsCompoundPkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteAllInOneClsCompoundPkRefCQ bq = (WhiteAllInOneClsCompoundPkRefCQ)bqs;
        WhiteAllInOneClsCompoundPkRefCQ uq = (WhiteAllInOneClsCompoundPkRefCQ)uqs;
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
        String nrp = resolveNextRelationPath("white_all_in_one_cls_compound_pk_ref", "whiteAllInOneClsElementAsFoo");
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
        String nrp = resolveNextRelationPath("white_all_in_one_cls_compound_pk_ref", "whiteAllInOneClsElementAsBar");
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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteAllInOneClsCompoundPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteAllInOneClsCompoundPkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
