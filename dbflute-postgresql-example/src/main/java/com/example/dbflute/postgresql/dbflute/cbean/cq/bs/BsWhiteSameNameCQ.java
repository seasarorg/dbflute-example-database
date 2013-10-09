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
 * The base condition-query of white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSameNameCQ extends AbstractBsWhiteSameNameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSameNameCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_same_name) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSameNameCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSameNameCIQ xcreateCIQ() {
        WhiteSameNameCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSameNameCIQ xnewCIQ() {
        return new WhiteSameNameCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_same_name on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSameNameCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSameNameCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _sameNameId;
    public ConditionValue getSameNameId() {
        if (_sameNameId == null) { _sameNameId = nCV(); }
        return _sameNameId;
    }
    protected ConditionValue getCValueSameNameId() { return getSameNameId(); }

    protected Map<String, WhiteSameNameRefCQ> _sameNameId_ExistsReferrer_WhiteSameNameRefListMap;
    public Map<String, WhiteSameNameRefCQ> getSameNameId_ExistsReferrer_WhiteSameNameRefList() { return _sameNameId_ExistsReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery) {
        if (_sameNameId_ExistsReferrer_WhiteSameNameRefListMap == null) { _sameNameId_ExistsReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_ExistsReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_ExistsReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_ExistsReferrer_WhiteSameNameRefList." + key;
    }

    protected Map<String, WhiteSameNameRefCQ> _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap;
    public Map<String, WhiteSameNameRefCQ> getSameNameId_NotExistsReferrer_WhiteSameNameRefList() { return _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery) {
        if (_sameNameId_NotExistsReferrer_WhiteSameNameRefListMap == null) { _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_NotExistsReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_NotExistsReferrer_WhiteSameNameRefList." + key;
    }

    protected Map<String, WhiteSameNameRefCQ> _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap;
    public Map<String, WhiteSameNameRefCQ> getSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList() { return _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery) {
        if (_sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap == null) { _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList." + key;
    }

    protected Map<String, WhiteSameNameRefCQ> _sameNameId_InScopeRelation_WhiteSameNameRefListMap;
    public Map<String, WhiteSameNameRefCQ> getSameNameId_InScopeRelation_WhiteSameNameRefList() { return _sameNameId_InScopeRelation_WhiteSameNameRefListMap; }
    public String keepSameNameId_InScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery) {
        if (_sameNameId_InScopeRelation_WhiteSameNameRefListMap == null) { _sameNameId_InScopeRelation_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_InScopeRelation_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_InScopeRelation_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_InScopeRelation_WhiteSameNameRefList." + key;
    }

    protected Map<String, WhiteSameNameRefCQ> _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap;
    public Map<String, WhiteSameNameRefCQ> getSameNameId_NotInScopeRelation_WhiteSameNameRefList() { return _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap; }
    public String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery) {
        if (_sameNameId_NotInScopeRelation_WhiteSameNameRefListMap == null) { _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_NotInScopeRelation_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_NotInScopeRelation_WhiteSameNameRefList." + key;
    }

    protected Map<String, WhiteSameNameRefCQ> _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap;
    public Map<String, WhiteSameNameRefCQ> getSameNameId_QueryDerivedReferrer_WhiteSameNameRefList() { return _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery) {
        if (_sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap == null) { _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_QueryDerivedReferrer_WhiteSameNameRefList." + key;
    }
    protected Map<String, Object> _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameterMap;
    public Map<String, Object> getSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter() { return _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameterMap; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object parameterValue) {
        if (_sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameterMap == null) { _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameterMap.size() + 1);
        _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameterMap.put(key, parameterValue); return "sameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _sameNameName;
    public ConditionValue getSameNameName() {
        if (_sameNameName == null) { _sameNameName = nCV(); }
        return _sameNameName;
    }
    protected ConditionValue getCValueSameNameName() { return getSameNameName(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameName_Asc() { regOBA("same_name_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameName_Desc() { regOBD("same_name_name"); return this; }

    protected ConditionValue _sameNameInteger;
    public ConditionValue getSameNameInteger() {
        if (_sameNameInteger == null) { _sameNameInteger = nCV(); }
        return _sameNameInteger;
    }
    protected ConditionValue getCValueSameNameInteger() { return getSameNameInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameInteger_Asc() { regOBA("same_name_integer"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameInteger_Desc() { regOBD("same_name_integer"); return this; }

    protected ConditionValue _nextSchemaProductId;
    public ConditionValue getNextSchemaProductId() {
        if (_nextSchemaProductId == null) { _nextSchemaProductId = nCV(); }
        return _nextSchemaProductId;
    }
    protected ConditionValue getCValueNextSchemaProductId() { return getNextSchemaProductId(); }

    protected Map<String, NextSchemaProductCQ> _nextSchemaProductId_InScopeRelation_NextSchemaProductMap;
    public Map<String, NextSchemaProductCQ> getNextSchemaProductId_InScopeRelation_NextSchemaProduct() { return _nextSchemaProductId_InScopeRelation_NextSchemaProductMap; }
    public String keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(NextSchemaProductCQ subQuery) {
        if (_nextSchemaProductId_InScopeRelation_NextSchemaProductMap == null) { _nextSchemaProductId_InScopeRelation_NextSchemaProductMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextSchemaProductId_InScopeRelation_NextSchemaProductMap.size() + 1);
        _nextSchemaProductId_InScopeRelation_NextSchemaProductMap.put(key, subQuery); return "nextSchemaProductId_InScopeRelation_NextSchemaProduct." + key;
    }

    protected Map<String, NextSchemaProductCQ> _nextSchemaProductId_NotInScopeRelation_NextSchemaProductMap;
    public Map<String, NextSchemaProductCQ> getNextSchemaProductId_NotInScopeRelation_NextSchemaProduct() { return _nextSchemaProductId_NotInScopeRelation_NextSchemaProductMap; }
    public String keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(NextSchemaProductCQ subQuery) {
        if (_nextSchemaProductId_NotInScopeRelation_NextSchemaProductMap == null) { _nextSchemaProductId_NotInScopeRelation_NextSchemaProductMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextSchemaProductId_NotInScopeRelation_NextSchemaProductMap.size() + 1);
        _nextSchemaProductId_NotInScopeRelation_NextSchemaProductMap.put(key, subQuery); return "nextSchemaProductId_NotInScopeRelation_NextSchemaProduct." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_NextSchemaProductId_Asc() { regOBA("next_schema_product_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_NextSchemaProductId_Desc() { regOBD("next_schema_product_id"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteSameNameCQ baseQuery = (WhiteSameNameCQ)baseQueryAsSuper;
        WhiteSameNameCQ unionQuery = (WhiteSameNameCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryNextSchemaProduct()) {
            unionQuery.queryNextSchemaProduct().reflectRelationOnUnionQuery(baseQuery.queryNextSchemaProduct(), unionQuery.queryNextSchemaProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public NextSchemaProductCQ queryNextSchemaProduct() {
        return getConditionQueryNextSchemaProduct();
    }
    protected NextSchemaProductCQ _conditionQueryNextSchemaProduct;
    public NextSchemaProductCQ getConditionQueryNextSchemaProduct() {
        if (_conditionQueryNextSchemaProduct == null) {
            _conditionQueryNextSchemaProduct = xcreateQueryNextSchemaProduct();
            xsetupOuterJoinNextSchemaProduct();
        }
        return _conditionQueryNextSchemaProduct;
    }
    protected NextSchemaProductCQ xcreateQueryNextSchemaProduct() {
        String nrp = resolveNextRelationPath("white_same_name", "nextSchemaProduct");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        NextSchemaProductCQ cq = new NextSchemaProductCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("nextSchemaProduct");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinNextSchemaProduct() {
        NextSchemaProductCQ cq = getConditionQueryNextSchemaProduct();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("next_schema_product_id", "PRODUCT_ID");
        registerOuterJoin(cq, joinOnMap, "nextSchemaProduct");
    }
    public boolean hasConditionQueryNextSchemaProduct() {
        return _conditionQueryNextSchemaProduct != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteSameNameCQ> _scalarConditionMap;
    public Map<String, WhiteSameNameCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSameNameCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSameNameCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSameNameCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSameNameCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteSameNameCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSameNameCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSameNameCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSameNameCQ> _myselfExistsMap;
    public Map<String, WhiteSameNameCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSameNameCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSameNameCQ> _myselfInScopeMap;
    public Map<String, WhiteSameNameCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSameNameCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSameNameCB.class.getName(); }
    protected String xCQ() { return WhiteSameNameCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
