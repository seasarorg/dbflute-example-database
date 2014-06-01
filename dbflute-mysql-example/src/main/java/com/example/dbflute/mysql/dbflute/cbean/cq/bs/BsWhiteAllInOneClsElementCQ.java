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
 * The base condition-query of white_all_in_one_cls_element.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAllInOneClsElementCQ extends AbstractBsWhiteAllInOneClsElementCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAllInOneClsElementCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAllInOneClsElementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_all_in_one_cls_element) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteAllInOneClsElementCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteAllInOneClsElementCIQ xcreateCIQ() {
        WhiteAllInOneClsElementCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteAllInOneClsElementCIQ xnewCIQ() {
        return new WhiteAllInOneClsElementCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_all_in_one_cls_element on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteAllInOneClsElementCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteAllInOneClsElementCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clsCategoryCode;
    public ConditionValue getClsCategoryCode() {
        if (_clsCategoryCode == null) { _clsCategoryCode = nCV(); }
        return _clsCategoryCode;
    }
    protected ConditionValue getCValueClsCategoryCode() { return getClsCategoryCode(); }

    protected Map<String, WhiteAllInOneClsCategoryCQ> _clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategoryMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getClsCategoryCode_InScopeRelation_WhiteAllInOneClsCategory() { return _clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategoryMap; }
    public String keepClsCategoryCode_InScopeRelation_WhiteAllInOneClsCategory(WhiteAllInOneClsCategoryCQ sq) {
        if (_clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategoryMap == null) { _clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategoryMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategoryMap.size() + 1);
        _clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategoryMap.put(ky, sq); return "clsCategoryCode_InScopeRelation_WhiteAllInOneClsCategory." + ky;
    }

    protected Map<String, WhiteAllInOneClsCategoryCQ> _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategoryMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> getClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategory() { return _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategoryMap; }
    public String keepClsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategory(WhiteAllInOneClsCategoryCQ sq) {
        if (_clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategoryMap == null) { _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategoryMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategoryMap.size() + 1);
        _clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategoryMap.put(ky, sq); return "clsCategoryCode_NotInScopeRelation_WhiteAllInOneClsCategory." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_ClsCategoryCode_Asc() { regOBA("CLS_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_ClsCategoryCode_Desc() { regOBD("CLS_CATEGORY_CODE"); return this; }

    protected ConditionValue _clsElementCode;
    public ConditionValue getClsElementCode() {
        if (_clsElementCode == null) { _clsElementCode = nCV(); }
        return _clsElementCode;
    }
    protected ConditionValue getCValueClsElementCode() { return getClsElementCode(); }

    /** 
     * Add order-by as ascend. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_ClsElementCode_Asc() { regOBA("CLS_ELEMENT_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_ClsElementCode_Desc() { regOBD("CLS_ELEMENT_CODE"); return this; }

    protected ConditionValue _clsElementName;
    public ConditionValue getClsElementName() {
        if (_clsElementName == null) { _clsElementName = nCV(); }
        return _clsElementName;
    }
    protected ConditionValue getCValueClsElementName() { return getClsElementName(); }

    /** 
     * Add order-by as ascend. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_ClsElementName_Asc() { regOBA("CLS_ELEMENT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_ClsElementName_Desc() { regOBD("CLS_ELEMENT_NAME"); return this; }

    protected ConditionValue _attributeExp;
    public ConditionValue getAttributeExp() {
        if (_attributeExp == null) { _attributeExp = nCV(); }
        return _attributeExp;
    }
    protected ConditionValue getCValueAttributeExp() { return getAttributeExp(); }

    /** 
     * Add order-by as ascend. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_AttributeExp_Asc() { regOBA("ATTRIBUTE_EXP"); return this; }

    /**
     * Add order-by as descend. <br />
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsElementCQ addOrderBy_AttributeExp_Desc() { regOBD("ATTRIBUTE_EXP"); return this; }

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
    public BsWhiteAllInOneClsElementCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteAllInOneClsElementCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteAllInOneClsElementCQ bq = (WhiteAllInOneClsElementCQ)bqs;
        WhiteAllInOneClsElementCQ uq = (WhiteAllInOneClsElementCQ)uqs;
        if (bq.hasConditionQueryWhiteAllInOneClsCategory()) {
            uq.queryWhiteAllInOneClsCategory().reflectRelationOnUnionQuery(bq.queryWhiteAllInOneClsCategory(), uq.queryWhiteAllInOneClsCategory());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteAllInOneClsCategoryCQ queryWhiteAllInOneClsCategory() {
        return getConditionQueryWhiteAllInOneClsCategory();
    }
    protected WhiteAllInOneClsCategoryCQ _conditionQueryWhiteAllInOneClsCategory;
    public WhiteAllInOneClsCategoryCQ getConditionQueryWhiteAllInOneClsCategory() {
        if (_conditionQueryWhiteAllInOneClsCategory == null) {
            _conditionQueryWhiteAllInOneClsCategory = xcreateQueryWhiteAllInOneClsCategory();
            xsetupOuterJoinWhiteAllInOneClsCategory();
        }
        return _conditionQueryWhiteAllInOneClsCategory;
    }
    protected WhiteAllInOneClsCategoryCQ xcreateQueryWhiteAllInOneClsCategory() {
        String nrp = resolveNextRelationPath("white_all_in_one_cls_element", "whiteAllInOneClsCategory");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteAllInOneClsCategoryCQ cq = new WhiteAllInOneClsCategoryCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteAllInOneClsCategory");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteAllInOneClsCategory() {
        WhiteAllInOneClsCategoryCQ cq = getConditionQueryWhiteAllInOneClsCategory();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteAllInOneClsCategory");
    }
    public boolean hasConditionQueryWhiteAllInOneClsCategory() {
        return _conditionQueryWhiteAllInOneClsCategory != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteAllInOneClsElementCQ> _scalarConditionMap;
    public Map<String, WhiteAllInOneClsElementCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteAllInOneClsElementCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteAllInOneClsElementCB.class.getName(); }
    protected String xCQ() { return WhiteAllInOneClsElementCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
