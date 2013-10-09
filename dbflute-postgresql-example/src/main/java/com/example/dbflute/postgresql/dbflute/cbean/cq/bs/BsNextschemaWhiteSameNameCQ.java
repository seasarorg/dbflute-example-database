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
 * The base condition-query of nextschema.white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class BsNextschemaWhiteSameNameCQ extends AbstractBsNextschemaWhiteSameNameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextschemaWhiteSameNameCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextschemaWhiteSameNameCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from nextschema.white_same_name) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextschemaWhiteSameNameCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextschemaWhiteSameNameCIQ xcreateCIQ() {
        NextschemaWhiteSameNameCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextschemaWhiteSameNameCIQ xnewCIQ() {
        return new NextschemaWhiteSameNameCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join nextschema.white_same_name on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextschemaWhiteSameNameCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextschemaWhiteSameNameCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, NextschemaWhiteSameNameRefCQ> _sameNameId_ExistsReferrer_WhiteSameNameRefListMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_ExistsReferrer_WhiteSameNameRefList() { return _sameNameId_ExistsReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_sameNameId_ExistsReferrer_WhiteSameNameRefListMap == null) { _sameNameId_ExistsReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_ExistsReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_ExistsReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_ExistsReferrer_WhiteSameNameRefList." + key;
    }

    protected Map<String, NextschemaWhiteSameNameRefCQ> _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_NotExistsReferrer_WhiteSameNameRefList() { return _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_sameNameId_NotExistsReferrer_WhiteSameNameRefListMap == null) { _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_NotExistsReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_NotExistsReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_NotExistsReferrer_WhiteSameNameRefList." + key;
    }

    protected Map<String, NextschemaWhiteSameNameRefCQ> _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList() { return _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap == null) { _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList." + key;
    }

    protected Map<String, NextschemaWhiteSameNameRefCQ> _sameNameId_InScopeRelation_WhiteSameNameRefListMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_InScopeRelation_WhiteSameNameRefList() { return _sameNameId_InScopeRelation_WhiteSameNameRefListMap; }
    public String keepSameNameId_InScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_sameNameId_InScopeRelation_WhiteSameNameRefListMap == null) { _sameNameId_InScopeRelation_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_InScopeRelation_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_InScopeRelation_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_InScopeRelation_WhiteSameNameRefList." + key;
    }

    protected Map<String, NextschemaWhiteSameNameRefCQ> _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_NotInScopeRelation_WhiteSameNameRefList() { return _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap; }
    public String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_sameNameId_NotInScopeRelation_WhiteSameNameRefListMap == null) { _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_NotInScopeRelation_WhiteSameNameRefListMap.size() + 1);
        _sameNameId_NotInScopeRelation_WhiteSameNameRefListMap.put(key, subQuery); return "sameNameId_NotInScopeRelation_WhiteSameNameRefList." + key;
    }

    protected Map<String, NextschemaWhiteSameNameRefCQ> _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_QueryDerivedReferrer_WhiteSameNameRefList() { return _sameNameId_QueryDerivedReferrer_WhiteSameNameRefListMap; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ subQuery) {
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
     * same_name_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _sameNameName;
    public ConditionValue getSameNameName() {
        if (_sameNameName == null) { _sameNameName = nCV(); }
        return _sameNameName;
    }
    protected ConditionValue getCValueSameNameName() { return getSameNameName(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameName_Asc() { regOBA("same_name_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameName_Desc() { regOBD("same_name_name"); return this; }

    protected ConditionValue _sameNameLong;
    public ConditionValue getSameNameLong() {
        if (_sameNameLong == null) { _sameNameLong = nCV(); }
        return _sameNameLong;
    }
    protected ConditionValue getCValueSameNameLong() { return getSameNameLong(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_long: {int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameLong_Asc() { regOBA("same_name_long"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_long: {int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameLong_Desc() { regOBD("same_name_long"); return this; }

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
    public BsNextschemaWhiteSameNameCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsNextschemaWhiteSameNameCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
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
    protected Map<String, NextschemaWhiteSameNameCQ> _scalarConditionMap;
    public Map<String, NextschemaWhiteSameNameCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(NextschemaWhiteSameNameCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, NextschemaWhiteSameNameCQ> _specifyMyselfDerivedMap;
    public Map<String, NextschemaWhiteSameNameCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(NextschemaWhiteSameNameCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, NextschemaWhiteSameNameCQ> _queryMyselfDerivedMap;
    public Map<String, NextschemaWhiteSameNameCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(NextschemaWhiteSameNameCQ subQuery) {
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
    protected Map<String, NextschemaWhiteSameNameCQ> _myselfExistsMap;
    public Map<String, NextschemaWhiteSameNameCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(NextschemaWhiteSameNameCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, NextschemaWhiteSameNameCQ> _myselfInScopeMap;
    public Map<String, NextschemaWhiteSameNameCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(NextschemaWhiteSameNameCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextschemaWhiteSameNameCB.class.getName(); }
    protected String xCQ() { return NextschemaWhiteSameNameCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
