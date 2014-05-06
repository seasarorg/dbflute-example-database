package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of next_schema_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsNextSchemaProductCQ extends AbstractBsNextSchemaProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextSchemaProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextSchemaProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from next_schema_product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextSchemaProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextSchemaProductCIQ xcreateCIQ() {
        NextSchemaProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextSchemaProductCIQ xnewCIQ() {
        return new NextSchemaProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join next_schema_product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextSchemaProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextSchemaProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _productId;
    public ConditionValue getProductId() {
        if (_productId == null) { _productId = nCV(); }
        return _productId;
    }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    protected Map<String, WhiteSameNameCQ> _productId_ExistsReferrer_WhiteSameNameListMap;
    public Map<String, WhiteSameNameCQ> getProductId_ExistsReferrer_WhiteSameNameList() { return _productId_ExistsReferrer_WhiteSameNameListMap; }
    public String keepProductId_ExistsReferrer_WhiteSameNameList(WhiteSameNameCQ sq) {
        if (_productId_ExistsReferrer_WhiteSameNameListMap == null) { _productId_ExistsReferrer_WhiteSameNameListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_ExistsReferrer_WhiteSameNameListMap.size() + 1);
        _productId_ExistsReferrer_WhiteSameNameListMap.put(ky, sq); return "productId_ExistsReferrer_WhiteSameNameList." + ky;
    }

    protected Map<String, WhiteSameNameCQ> _productId_NotExistsReferrer_WhiteSameNameListMap;
    public Map<String, WhiteSameNameCQ> getProductId_NotExistsReferrer_WhiteSameNameList() { return _productId_NotExistsReferrer_WhiteSameNameListMap; }
    public String keepProductId_NotExistsReferrer_WhiteSameNameList(WhiteSameNameCQ sq) {
        if (_productId_NotExistsReferrer_WhiteSameNameListMap == null) { _productId_NotExistsReferrer_WhiteSameNameListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_NotExistsReferrer_WhiteSameNameListMap.size() + 1);
        _productId_NotExistsReferrer_WhiteSameNameListMap.put(ky, sq); return "productId_NotExistsReferrer_WhiteSameNameList." + ky;
    }

    protected Map<String, WhiteSameNameCQ> _productId_SpecifyDerivedReferrer_WhiteSameNameListMap;
    public Map<String, WhiteSameNameCQ> getProductId_SpecifyDerivedReferrer_WhiteSameNameList() { return _productId_SpecifyDerivedReferrer_WhiteSameNameListMap; }
    public String keepProductId_SpecifyDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ sq) {
        if (_productId_SpecifyDerivedReferrer_WhiteSameNameListMap == null) { _productId_SpecifyDerivedReferrer_WhiteSameNameListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_SpecifyDerivedReferrer_WhiteSameNameListMap.size() + 1);
        _productId_SpecifyDerivedReferrer_WhiteSameNameListMap.put(ky, sq); return "productId_SpecifyDerivedReferrer_WhiteSameNameList." + ky;
    }

    protected Map<String, WhiteSameNameCQ> _productId_InScopeRelation_WhiteSameNameListMap;
    public Map<String, WhiteSameNameCQ> getProductId_InScopeRelation_WhiteSameNameList() { return _productId_InScopeRelation_WhiteSameNameListMap; }
    public String keepProductId_InScopeRelation_WhiteSameNameList(WhiteSameNameCQ sq) {
        if (_productId_InScopeRelation_WhiteSameNameListMap == null) { _productId_InScopeRelation_WhiteSameNameListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_InScopeRelation_WhiteSameNameListMap.size() + 1);
        _productId_InScopeRelation_WhiteSameNameListMap.put(ky, sq); return "productId_InScopeRelation_WhiteSameNameList." + ky;
    }

    protected Map<String, WhiteSameNameCQ> _productId_NotInScopeRelation_WhiteSameNameListMap;
    public Map<String, WhiteSameNameCQ> getProductId_NotInScopeRelation_WhiteSameNameList() { return _productId_NotInScopeRelation_WhiteSameNameListMap; }
    public String keepProductId_NotInScopeRelation_WhiteSameNameList(WhiteSameNameCQ sq) {
        if (_productId_NotInScopeRelation_WhiteSameNameListMap == null) { _productId_NotInScopeRelation_WhiteSameNameListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_NotInScopeRelation_WhiteSameNameListMap.size() + 1);
        _productId_NotInScopeRelation_WhiteSameNameListMap.put(ky, sq); return "productId_NotInScopeRelation_WhiteSameNameList." + ky;
    }

    protected Map<String, WhiteSameNameCQ> _productId_QueryDerivedReferrer_WhiteSameNameListMap;
    public Map<String, WhiteSameNameCQ> getProductId_QueryDerivedReferrer_WhiteSameNameList() { return _productId_QueryDerivedReferrer_WhiteSameNameListMap; }
    public String keepProductId_QueryDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ sq) {
        if (_productId_QueryDerivedReferrer_WhiteSameNameListMap == null) { _productId_QueryDerivedReferrer_WhiteSameNameListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_productId_QueryDerivedReferrer_WhiteSameNameListMap.size() + 1);
        _productId_QueryDerivedReferrer_WhiteSameNameListMap.put(ky, sq); return "productId_QueryDerivedReferrer_WhiteSameNameList." + ky;
    }
    protected Map<String, Object> _productId_QueryDerivedReferrer_WhiteSameNameListParameterMap;
    public Map<String, Object> getProductId_QueryDerivedReferrer_WhiteSameNameListParameter() { return _productId_QueryDerivedReferrer_WhiteSameNameListParameterMap; }
    public String keepProductId_QueryDerivedReferrer_WhiteSameNameListParameter(Object vl) {
        if (_productId_QueryDerivedReferrer_WhiteSameNameListParameterMap == null) { _productId_QueryDerivedReferrer_WhiteSameNameListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_productId_QueryDerivedReferrer_WhiteSameNameListParameterMap.size() + 1);
        _productId_QueryDerivedReferrer_WhiteSameNameListParameterMap.put(ky, vl); return "productId_QueryDerivedReferrer_WhiteSameNameListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductId_Asc() { regOBA("product_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductId_Desc() { regOBD("product_id"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName() {
        if (_productName == null) { _productName = nCV(); }
        return _productName;
    }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * product_name: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductName_Asc() { regOBA("product_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_name: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductName_Desc() { regOBD("product_name"); return this; }

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
    public BsNextSchemaProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsNextSchemaProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, NextSchemaProductCQ> _scalarConditionMap;
    public Map<String, NextSchemaProductCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(NextSchemaProductCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, NextSchemaProductCQ> _specifyMyselfDerivedMap;
    public Map<String, NextSchemaProductCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(NextSchemaProductCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, NextSchemaProductCQ> _queryMyselfDerivedMap;
    public Map<String, NextSchemaProductCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(NextSchemaProductCQ sq) {
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
    protected Map<String, NextSchemaProductCQ> _myselfExistsMap;
    public Map<String, NextSchemaProductCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(NextSchemaProductCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, NextSchemaProductCQ> _myselfInScopeMap;
    public Map<String, NextSchemaProductCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(NextSchemaProductCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextSchemaProductCB.class.getName(); }
    protected String xCQ() { return NextSchemaProductCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
