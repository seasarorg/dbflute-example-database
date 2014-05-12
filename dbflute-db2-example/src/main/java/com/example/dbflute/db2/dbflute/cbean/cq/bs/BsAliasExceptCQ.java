package com.example.dbflute.db2.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.db2.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The base condition-query of ALIAS_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public class BsAliasExceptCQ extends AbstractBsAliasExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAliasExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from ALIAS_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AliasExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AliasExceptCIQ xcreateCIQ() {
        AliasExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AliasExceptCIQ xnewCIQ() {
        return new AliasExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join ALIAS_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AliasExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AliasExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, AliasRefExceptCQ> _exceptId_ExistsReferrer_AliasRefExceptListMap;
    public Map<String, AliasRefExceptCQ> getExceptId_ExistsReferrer_AliasRefExceptList() { return _exceptId_ExistsReferrer_AliasRefExceptListMap; }
    public String keepExceptId_ExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq) {
        if (_exceptId_ExistsReferrer_AliasRefExceptListMap == null) { _exceptId_ExistsReferrer_AliasRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_ExistsReferrer_AliasRefExceptListMap.size() + 1);
        _exceptId_ExistsReferrer_AliasRefExceptListMap.put(ky, sq); return "exceptId_ExistsReferrer_AliasRefExceptList." + ky;
    }

    protected Map<String, AliasRefExceptCQ> _exceptId_NotExistsReferrer_AliasRefExceptListMap;
    public Map<String, AliasRefExceptCQ> getExceptId_NotExistsReferrer_AliasRefExceptList() { return _exceptId_NotExistsReferrer_AliasRefExceptListMap; }
    public String keepExceptId_NotExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq) {
        if (_exceptId_NotExistsReferrer_AliasRefExceptListMap == null) { _exceptId_NotExistsReferrer_AliasRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_NotExistsReferrer_AliasRefExceptListMap.size() + 1);
        _exceptId_NotExistsReferrer_AliasRefExceptListMap.put(ky, sq); return "exceptId_NotExistsReferrer_AliasRefExceptList." + ky;
    }

    protected Map<String, AliasRefExceptCQ> _exceptId_SpecifyDerivedReferrer_AliasRefExceptListMap;
    public Map<String, AliasRefExceptCQ> getExceptId_SpecifyDerivedReferrer_AliasRefExceptList() { return _exceptId_SpecifyDerivedReferrer_AliasRefExceptListMap; }
    public String keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq) {
        if (_exceptId_SpecifyDerivedReferrer_AliasRefExceptListMap == null) { _exceptId_SpecifyDerivedReferrer_AliasRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_SpecifyDerivedReferrer_AliasRefExceptListMap.size() + 1);
        _exceptId_SpecifyDerivedReferrer_AliasRefExceptListMap.put(ky, sq); return "exceptId_SpecifyDerivedReferrer_AliasRefExceptList." + ky;
    }

    protected Map<String, AliasRefExceptCQ> _exceptId_InScopeRelation_AliasRefExceptListMap;
    public Map<String, AliasRefExceptCQ> getExceptId_InScopeRelation_AliasRefExceptList() { return _exceptId_InScopeRelation_AliasRefExceptListMap; }
    public String keepExceptId_InScopeRelation_AliasRefExceptList(AliasRefExceptCQ sq) {
        if (_exceptId_InScopeRelation_AliasRefExceptListMap == null) { _exceptId_InScopeRelation_AliasRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_InScopeRelation_AliasRefExceptListMap.size() + 1);
        _exceptId_InScopeRelation_AliasRefExceptListMap.put(ky, sq); return "exceptId_InScopeRelation_AliasRefExceptList." + ky;
    }

    protected Map<String, AliasRefExceptCQ> _exceptId_NotInScopeRelation_AliasRefExceptListMap;
    public Map<String, AliasRefExceptCQ> getExceptId_NotInScopeRelation_AliasRefExceptList() { return _exceptId_NotInScopeRelation_AliasRefExceptListMap; }
    public String keepExceptId_NotInScopeRelation_AliasRefExceptList(AliasRefExceptCQ sq) {
        if (_exceptId_NotInScopeRelation_AliasRefExceptListMap == null) { _exceptId_NotInScopeRelation_AliasRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_NotInScopeRelation_AliasRefExceptListMap.size() + 1);
        _exceptId_NotInScopeRelation_AliasRefExceptListMap.put(ky, sq); return "exceptId_NotInScopeRelation_AliasRefExceptList." + ky;
    }

    protected Map<String, AliasRefExceptCQ> _exceptId_QueryDerivedReferrer_AliasRefExceptListMap;
    public Map<String, AliasRefExceptCQ> getExceptId_QueryDerivedReferrer_AliasRefExceptList() { return _exceptId_QueryDerivedReferrer_AliasRefExceptListMap; }
    public String keepExceptId_QueryDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq) {
        if (_exceptId_QueryDerivedReferrer_AliasRefExceptListMap == null) { _exceptId_QueryDerivedReferrer_AliasRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_QueryDerivedReferrer_AliasRefExceptListMap.size() + 1);
        _exceptId_QueryDerivedReferrer_AliasRefExceptListMap.put(ky, sq); return "exceptId_QueryDerivedReferrer_AliasRefExceptList." + ky;
    }
    protected Map<String, Object> _exceptId_QueryDerivedReferrer_AliasRefExceptListParameterMap;
    public Map<String, Object> getExceptId_QueryDerivedReferrer_AliasRefExceptListParameter() { return _exceptId_QueryDerivedReferrer_AliasRefExceptListParameterMap; }
    public String keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(Object vl) {
        if (_exceptId_QueryDerivedReferrer_AliasRefExceptListParameterMap == null) { _exceptId_QueryDerivedReferrer_AliasRefExceptListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_exceptId_QueryDerivedReferrer_AliasRefExceptListParameterMap.size() + 1);
        _exceptId_QueryDerivedReferrer_AliasRefExceptListParameterMap.put(ky, vl); return "exceptId_QueryDerivedReferrer_AliasRefExceptListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptId_Asc() { regOBA("EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptId_Desc() { regOBD("EXCEPT_ID"); return this; }

    protected ConditionValue _exceptName;
    public ConditionValue getExceptName() {
        if (_exceptName == null) { _exceptName = nCV(); }
        return _exceptName;
    }
    protected ConditionValue getCValueExceptName() { return getExceptName(); }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptName_Asc() { regOBA("EXCEPT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAliasExceptCQ addOrderBy_ExceptName_Desc() { regOBD("EXCEPT_NAME"); return this; }

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
    public BsAliasExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsAliasExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, AliasExceptCQ> _scalarConditionMap;
    public Map<String, AliasExceptCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(AliasExceptCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, AliasExceptCQ> _specifyMyselfDerivedMap;
    public Map<String, AliasExceptCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(AliasExceptCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, AliasExceptCQ> _queryMyselfDerivedMap;
    public Map<String, AliasExceptCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(AliasExceptCQ sq) {
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
    protected Map<String, AliasExceptCQ> _myselfExistsMap;
    public Map<String, AliasExceptCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(AliasExceptCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, AliasExceptCQ> _myselfInScopeMap;
    public Map<String, AliasExceptCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(AliasExceptCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AliasExceptCB.class.getName(); }
    protected String xCQ() { return AliasExceptCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
