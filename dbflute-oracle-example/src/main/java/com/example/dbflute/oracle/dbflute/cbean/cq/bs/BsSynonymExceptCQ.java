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
    public BsSynonymExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
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
    public String keepExceptId_ExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) {
        if (_exceptId_ExistsReferrer_SynonymRefExceptListMap == null) { _exceptId_ExistsReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_ExistsReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_ExistsReferrer_SynonymRefExceptListMap.put(ky, sq); return "exceptId_ExistsReferrer_SynonymRefExceptList." + ky;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_NotExistsReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_NotExistsReferrer_SynonymRefExceptList() { return _exceptId_NotExistsReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_NotExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) {
        if (_exceptId_NotExistsReferrer_SynonymRefExceptListMap == null) { _exceptId_NotExistsReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_NotExistsReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_NotExistsReferrer_SynonymRefExceptListMap.put(ky, sq); return "exceptId_NotExistsReferrer_SynonymRefExceptList." + ky;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_SpecifyDerivedReferrer_SynonymRefExceptList() { return _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_SpecifyDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) {
        if (_exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap == null) { _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_SpecifyDerivedReferrer_SynonymRefExceptListMap.put(ky, sq); return "exceptId_SpecifyDerivedReferrer_SynonymRefExceptList." + ky;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_InScopeRelation_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_InScopeRelation_SynonymRefExceptList() { return _exceptId_InScopeRelation_SynonymRefExceptListMap; }
    public String keepExceptId_InScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq) {
        if (_exceptId_InScopeRelation_SynonymRefExceptListMap == null) { _exceptId_InScopeRelation_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_InScopeRelation_SynonymRefExceptListMap.size() + 1);
        _exceptId_InScopeRelation_SynonymRefExceptListMap.put(ky, sq); return "exceptId_InScopeRelation_SynonymRefExceptList." + ky;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_NotInScopeRelation_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_NotInScopeRelation_SynonymRefExceptList() { return _exceptId_NotInScopeRelation_SynonymRefExceptListMap; }
    public String keepExceptId_NotInScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq) {
        if (_exceptId_NotInScopeRelation_SynonymRefExceptListMap == null) { _exceptId_NotInScopeRelation_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_NotInScopeRelation_SynonymRefExceptListMap.size() + 1);
        _exceptId_NotInScopeRelation_SynonymRefExceptListMap.put(ky, sq); return "exceptId_NotInScopeRelation_SynonymRefExceptList." + ky;
    }

    protected Map<String, SynonymRefExceptCQ> _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap;
    public Map<String, SynonymRefExceptCQ> getExceptId_QueryDerivedReferrer_SynonymRefExceptList() { return _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap; }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) {
        if (_exceptId_QueryDerivedReferrer_SynonymRefExceptListMap == null) { _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_QueryDerivedReferrer_SynonymRefExceptListMap.size() + 1);
        _exceptId_QueryDerivedReferrer_SynonymRefExceptListMap.put(ky, sq); return "exceptId_QueryDerivedReferrer_SynonymRefExceptList." + ky;
    }
    protected Map<String, Object> _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap;
    public Map<String, Object> getExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter() { return _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap; }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter(Object vl) {
        if (_exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap == null) { _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap.size() + 1);
        _exceptId_QueryDerivedReferrer_SynonymRefExceptListParameterMap.put(ky, vl); return "exceptId_QueryDerivedReferrer_SynonymRefExceptListParameter." + ky;
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, SynonymExceptCQ> _scalarConditionMap;
    public Map<String, SynonymExceptCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymExceptCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymExceptCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymExceptCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymExceptCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, SynonymExceptCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymExceptCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymExceptCQ sq) {
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
    protected Map<String, SynonymExceptCQ> _myselfExistsMap;
    public Map<String, SynonymExceptCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymExceptCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymExceptCQ> _myselfInScopeMap;
    public Map<String, SynonymExceptCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymExceptCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymExceptCB.class.getName(); }
    protected String xCQ() { return SynonymExceptCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
