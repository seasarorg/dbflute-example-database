package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of SYNONYM_EXCEPT.
 * @author oracleman
 */
public class BsSynonymExceptCQ extends AbstractBsSynonymExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymExceptCIQ xcreateCIQ() {
        SynonymExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymExceptCIQ xnewCIQ() {
        return new SynonymExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _exceptId;
    public ConditionValue getExceptId() {
        if (_exceptId == null) { _exceptId = nCV(); }
        return _exceptId;
    }
    protected ConditionValue getCValueExceptId() { return getExceptId(); }

    protected Map<String, SynonymRefExceptCQ> _exceptId_ExistsReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_ExistsReferrer_SynonymRefExceptList() { return _exceptId_ExistsReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_ExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ subQuery) {
        if (_exceptId_ExistsReferrer_SynonymRefExceptListMap == null) { _exceptId_ExistsReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_exceptId_ExistsReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_ExistsReferrer_SynonymRefExceptListMap.put(key, subQuery); return "exceptId_ExistsReferrer_SynonymRefExceptList." + key;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_NotExistsReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_NotExistsReferrer_SynonymRefExceptList() { return _exceptId_NotExistsReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_NotExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ subQuery) {
        if (_exceptId_NotExistsReferrer_SynonymRefExceptListMap == null) { _exceptId_NotExistsReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_exceptId_NotExistsReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_NotExistsReferrer_SynonymRefExceptListMap.put(key, subQuery); return "exceptId_NotExistsReferrer_SynonymRefExceptList." + key;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_SpecifyDerivedReferrer_SynonymRefExceptList() { return _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_SpecifyDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ subQuery) {
        if (_exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap == null) { _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap.put(key, subQuery); return "exceptId_SpecifyDerivedReferrer_SynonymRefExceptList." + key;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_InScopeRelation_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_InScopeRelation_SynonymRefExceptList() { return _exceptId_InScopeRelation_SynonymRefExceptListMap; }
    public String keepExceptId_InScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ subQuery) {
        if (_exceptId_InScopeRelation_SynonymRefExceptListMap == null) { _exceptId_InScopeRelation_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_exceptId_InScopeRelation_SynonymRefExceptListMap.size() + 1);
        _exceptId_InScopeRelation_SynonymRefExceptListMap.put(key, subQuery); return "exceptId_InScopeRelation_SynonymRefExceptList." + key;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_NotInScopeRelation_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_NotInScopeRelation_SynonymRefExceptList() { return _exceptId_NotInScopeRelation_SynonymRefExceptListMap; }
    public String keepExceptId_NotInScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ subQuery) {
        if (_exceptId_NotInScopeRelation_SynonymRefExceptListMap == null) { _exceptId_NotInScopeRelation_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_exceptId_NotInScopeRelation_SynonymRefExceptListMap.size() + 1);
        _exceptId_NotInScopeRelation_SynonymRefExceptListMap.put(key, subQuery); return "exceptId_NotInScopeRelation_SynonymRefExceptList." + key;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_QueryDerivedReferrer_SynonymRefExceptList() { return _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ subQuery) {
        if (_exceptId_QueryDerivedReferrer_SynonymRefExceptListMap == null) { _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_exceptId_QueryDerivedReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap.put(key, subQuery); return "exceptId_QueryDerivedReferrer_SynonymRefExceptList." + key;
    }
    protected Map<String, Object> _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap;
    public Map<String, Object> getExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter() { return _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap; }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter(Object parameterValue) {
        if (_exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap == null) { _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap.size() + 1);
        _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap.put(key, parameterValue); return "exceptId_QueryDerivedReferrer_SynonymRefExceptListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptId_Asc() { regOBA("EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptId_Desc() { regOBD("EXCEPT_ID"); return this; }

    protected ConditionValue _exceptName;
    public ConditionValue getExceptName() {
        if (_exceptName == null) { _exceptName = nCV(); }
        return _exceptName;
    }
    protected ConditionValue getCValueExceptName() { return getExceptName(); }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptName_Asc() { regOBA("EXCEPT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptName_Desc() { regOBD("EXCEPT_NAME"); return this; }

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
    public BsSynonymExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSynonymExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, SynonymExceptCQ> _scalarConditionMap;
    public Map<String, SynonymExceptCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymExceptCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymExceptCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymExceptCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymExceptCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, SynonymExceptCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymExceptCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymExceptCQ subQuery) {
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
    protected Map<String, SynonymExceptCQ> _myselfExistsMap;
    public Map<String, SynonymExceptCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymExceptCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymExceptCQ> _myselfInScopeMap;
    public Map<String, SynonymExceptCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymExceptCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymExceptCB.class.getName(); }
    protected String xCQ() { return SynonymExceptCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
