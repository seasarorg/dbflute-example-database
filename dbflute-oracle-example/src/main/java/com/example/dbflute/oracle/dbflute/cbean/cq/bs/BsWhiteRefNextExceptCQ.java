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
 * The base condition-query of WHITE_REF_NEXT_EXCEPT.
 * @author oracleman
 */
public class BsWhiteRefNextExceptCQ extends AbstractBsWhiteRefNextExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefNextExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteRefNextExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_REF_NEXT_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteRefNextExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteRefNextExceptCIQ xcreateCIQ() {
        WhiteRefNextExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteRefNextExceptCIQ xnewCIQ() {
        return new WhiteRefNextExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_REF_NEXT_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteRefNextExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteRefNextExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refNextExceptId;
    public ConditionValue getRefNextExceptId() {
        if (_refNextExceptId == null) { _refNextExceptId = nCV(); }
        return _refNextExceptId;
    }
    protected ConditionValue getCValueRefNextExceptId() { return getRefNextExceptId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextExceptCQ addOrderBy_RefNextExceptId_Asc() { regOBA("REF_NEXT_EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextExceptCQ addOrderBy_RefNextExceptId_Desc() { regOBD("REF_NEXT_EXCEPT_ID"); return this; }

    protected ConditionValue _nextExceptCode;
    public ConditionValue getNextExceptCode() {
        if (_nextExceptCode == null) { _nextExceptCode = nCV(); }
        return _nextExceptCode;
    }
    protected ConditionValue getCValueNextExceptCode() { return getNextExceptCode(); }

    /** 
     * Add order-by as ascend. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextExceptCQ addOrderBy_NextExceptCode_Asc() { regOBA("NEXT_EXCEPT_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextExceptCQ addOrderBy_NextExceptCode_Desc() { regOBD("NEXT_EXCEPT_CODE"); return this; }

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
    public BsWhiteRefNextExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteRefNextExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteRefNextExceptCQ> _scalarConditionMap;
    public Map<String, WhiteRefNextExceptCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteRefNextExceptCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteRefNextExceptCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteRefNextExceptCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteRefNextExceptCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteRefNextExceptCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteRefNextExceptCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteRefNextExceptCQ subQuery) {
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
    protected Map<String, WhiteRefNextExceptCQ> _myselfExistsMap;
    public Map<String, WhiteRefNextExceptCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteRefNextExceptCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteRefNextExceptCQ> _myselfInScopeMap;
    public Map<String, WhiteRefNextExceptCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteRefNextExceptCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteRefNextExceptCB.class.getName(); }
    protected String xCQ() { return WhiteRefNextExceptCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
