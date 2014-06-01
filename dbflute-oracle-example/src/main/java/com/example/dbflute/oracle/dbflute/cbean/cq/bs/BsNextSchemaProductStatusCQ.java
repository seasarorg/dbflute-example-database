package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public class BsNextSchemaProductStatusCQ extends AbstractBsNextSchemaProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextSchemaProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextSchemaProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from NEXT_SCHEMA_PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextSchemaProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextSchemaProductStatusCIQ xcreateCIQ() {
        NextSchemaProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextSchemaProductStatusCIQ xnewCIQ() {
        return new NextSchemaProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join NEXT_SCHEMA_PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextSchemaProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextSchemaProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode() {
        if (_productStatusCode == null) { _productStatusCode = nCV(); }
        return _productStatusCode;
    }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    protected Map<String, WhiteRefNextTargetCQ> _productStatusCode_ExistsReferrer_WhiteRefNextTargetListMap;
    public Map<String, WhiteRefNextTargetCQ> getProductStatusCode_ExistsReferrer_WhiteRefNextTargetList() { return _productStatusCode_ExistsReferrer_WhiteRefNextTargetListMap; }
    public String keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) {
        if (_productStatusCode_ExistsReferrer_WhiteRefNextTargetListMap == null) { _productStatusCode_ExistsReferrer_WhiteRefNextTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_ExistsReferrer_WhiteRefNextTargetListMap.size() + 1);
        _productStatusCode_ExistsReferrer_WhiteRefNextTargetListMap.put(ky, sq); return "productStatusCode_ExistsReferrer_WhiteRefNextTargetList." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _productStatusCode_ExistsReferrer_NextSchemaProductListMap;
    public Map<String, NextSchemaProductCQ> getProductStatusCode_ExistsReferrer_NextSchemaProductList() { return _productStatusCode_ExistsReferrer_NextSchemaProductListMap; }
    public String keepProductStatusCode_ExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq) {
        if (_productStatusCode_ExistsReferrer_NextSchemaProductListMap == null) { _productStatusCode_ExistsReferrer_NextSchemaProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_ExistsReferrer_NextSchemaProductListMap.size() + 1);
        _productStatusCode_ExistsReferrer_NextSchemaProductListMap.put(ky, sq); return "productStatusCode_ExistsReferrer_NextSchemaProductList." + ky;
    }

    protected Map<String, WhiteRefNextTargetCQ> _productStatusCode_NotExistsReferrer_WhiteRefNextTargetListMap;
    public Map<String, WhiteRefNextTargetCQ> getProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList() { return _productStatusCode_NotExistsReferrer_WhiteRefNextTargetListMap; }
    public String keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) {
        if (_productStatusCode_NotExistsReferrer_WhiteRefNextTargetListMap == null) { _productStatusCode_NotExistsReferrer_WhiteRefNextTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_NotExistsReferrer_WhiteRefNextTargetListMap.size() + 1);
        _productStatusCode_NotExistsReferrer_WhiteRefNextTargetListMap.put(ky, sq); return "productStatusCode_NotExistsReferrer_WhiteRefNextTargetList." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _productStatusCode_NotExistsReferrer_NextSchemaProductListMap;
    public Map<String, NextSchemaProductCQ> getProductStatusCode_NotExistsReferrer_NextSchemaProductList() { return _productStatusCode_NotExistsReferrer_NextSchemaProductListMap; }
    public String keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq) {
        if (_productStatusCode_NotExistsReferrer_NextSchemaProductListMap == null) { _productStatusCode_NotExistsReferrer_NextSchemaProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_NotExistsReferrer_NextSchemaProductListMap.size() + 1);
        _productStatusCode_NotExistsReferrer_NextSchemaProductListMap.put(ky, sq); return "productStatusCode_NotExistsReferrer_NextSchemaProductList." + ky;
    }

    protected Map<String, WhiteRefNextTargetCQ> _productStatusCode_InScopeRelation_WhiteRefNextTargetListMap;
    public Map<String, WhiteRefNextTargetCQ> getProductStatusCode_InScopeRelation_WhiteRefNextTargetList() { return _productStatusCode_InScopeRelation_WhiteRefNextTargetListMap; }
    public String keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) {
        if (_productStatusCode_InScopeRelation_WhiteRefNextTargetListMap == null) { _productStatusCode_InScopeRelation_WhiteRefNextTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_InScopeRelation_WhiteRefNextTargetListMap.size() + 1);
        _productStatusCode_InScopeRelation_WhiteRefNextTargetListMap.put(ky, sq); return "productStatusCode_InScopeRelation_WhiteRefNextTargetList." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _productStatusCode_InScopeRelation_NextSchemaProductListMap;
    public Map<String, NextSchemaProductCQ> getProductStatusCode_InScopeRelation_NextSchemaProductList() { return _productStatusCode_InScopeRelation_NextSchemaProductListMap; }
    public String keepProductStatusCode_InScopeRelation_NextSchemaProductList(NextSchemaProductCQ sq) {
        if (_productStatusCode_InScopeRelation_NextSchemaProductListMap == null) { _productStatusCode_InScopeRelation_NextSchemaProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_InScopeRelation_NextSchemaProductListMap.size() + 1);
        _productStatusCode_InScopeRelation_NextSchemaProductListMap.put(ky, sq); return "productStatusCode_InScopeRelation_NextSchemaProductList." + ky;
    }

    protected Map<String, WhiteRefNextTargetCQ> _productStatusCode_NotInScopeRelation_WhiteRefNextTargetListMap;
    public Map<String, WhiteRefNextTargetCQ> getProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList() { return _productStatusCode_NotInScopeRelation_WhiteRefNextTargetListMap; }
    public String keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) {
        if (_productStatusCode_NotInScopeRelation_WhiteRefNextTargetListMap == null) { _productStatusCode_NotInScopeRelation_WhiteRefNextTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_WhiteRefNextTargetListMap.size() + 1);
        _productStatusCode_NotInScopeRelation_WhiteRefNextTargetListMap.put(ky, sq); return "productStatusCode_NotInScopeRelation_WhiteRefNextTargetList." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _productStatusCode_NotInScopeRelation_NextSchemaProductListMap;
    public Map<String, NextSchemaProductCQ> getProductStatusCode_NotInScopeRelation_NextSchemaProductList() { return _productStatusCode_NotInScopeRelation_NextSchemaProductListMap; }
    public String keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(NextSchemaProductCQ sq) {
        if (_productStatusCode_NotInScopeRelation_NextSchemaProductListMap == null) { _productStatusCode_NotInScopeRelation_NextSchemaProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_NextSchemaProductListMap.size() + 1);
        _productStatusCode_NotInScopeRelation_NextSchemaProductListMap.put(ky, sq); return "productStatusCode_NotInScopeRelation_NextSchemaProductList." + ky;
    }

    protected Map<String, WhiteRefNextTargetCQ> _productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetListMap;
    public Map<String, WhiteRefNextTargetCQ> getProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList() { return _productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetListMap; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) {
        if (_productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetListMap == null) { _productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetListMap.size() + 1);
        _productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetListMap.put(ky, sq); return "productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _productStatusCode_SpecifyDerivedReferrer_NextSchemaProductListMap;
    public Map<String, NextSchemaProductCQ> getProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList() { return _productStatusCode_SpecifyDerivedReferrer_NextSchemaProductListMap; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq) {
        if (_productStatusCode_SpecifyDerivedReferrer_NextSchemaProductListMap == null) { _productStatusCode_SpecifyDerivedReferrer_NextSchemaProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_SpecifyDerivedReferrer_NextSchemaProductListMap.size() + 1);
        _productStatusCode_SpecifyDerivedReferrer_NextSchemaProductListMap.put(ky, sq); return "productStatusCode_SpecifyDerivedReferrer_NextSchemaProductList." + ky;
    }

    protected Map<String, WhiteRefNextTargetCQ> _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListMap;
    public Map<String, WhiteRefNextTargetCQ> getProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList() { return _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) {
        if (_productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListMap == null) { _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListMap.put(ky, sq); return "productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList." + ky;
    }
    protected Map<String, Object> _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameterMap;
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter() { return _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameterMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(Object vl) {
        if (_productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameterMap == null) { _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameterMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameterMap.put(ky, vl); return "productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _productStatusCode_QueryDerivedReferrer_NextSchemaProductListMap;
    public Map<String, NextSchemaProductCQ> getProductStatusCode_QueryDerivedReferrer_NextSchemaProductList() { return _productStatusCode_QueryDerivedReferrer_NextSchemaProductListMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq) {
        if (_productStatusCode_QueryDerivedReferrer_NextSchemaProductListMap == null) { _productStatusCode_QueryDerivedReferrer_NextSchemaProductListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productStatusCode_QueryDerivedReferrer_NextSchemaProductListMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_NextSchemaProductListMap.put(ky, sq); return "productStatusCode_QueryDerivedReferrer_NextSchemaProductList." + ky;
    }
    protected Map<String, Object> _productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameterMap;
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter() { return _productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameterMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(Object vl) {
        if (_productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameterMap == null) { _productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameterMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameterMap.put(ky, vl); return "productStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue getProductStatusName() {
        if (_productStatusName == null) { _productStatusName = nCV(); }
        return _productStatusName;
    }
    protected ConditionValue getCValueProductStatusName() { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

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
    public BsNextSchemaProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsNextSchemaProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, NextSchemaProductStatusCQ> _scalarConditionMap;
    public Map<String, NextSchemaProductStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(NextSchemaProductStatusCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, NextSchemaProductStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, NextSchemaProductStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(NextSchemaProductStatusCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, NextSchemaProductStatusCQ> _queryMyselfDerivedMap;
    public Map<String, NextSchemaProductStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(NextSchemaProductStatusCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, NextSchemaProductStatusCQ> _myselfExistsMap;
    public Map<String, NextSchemaProductStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(NextSchemaProductStatusCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, NextSchemaProductStatusCQ> _myselfInScopeMap;
    public Map<String, NextSchemaProductStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(NextSchemaProductStatusCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextSchemaProductStatusCB.class.getName(); }
    protected String xCQ() { return NextSchemaProductStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
