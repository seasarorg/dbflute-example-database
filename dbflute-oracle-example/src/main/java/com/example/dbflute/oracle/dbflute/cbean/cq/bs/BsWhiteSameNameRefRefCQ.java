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
 * The base condition-query of WHITE_SAME_NAME_REF_REF.
 * @author oracleman
 */
public class BsWhiteSameNameRefRefCQ extends AbstractBsWhiteSameNameRefRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameRefRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSameNameRefRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_SAME_NAME_REF_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSameNameRefRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSameNameRefRefCIQ xcreateCIQ() {
        WhiteSameNameRefRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSameNameRefRefCIQ xnewCIQ() {
        return new WhiteSameNameRefRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_SAME_NAME_REF_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSameNameRefRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSameNameRefRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refRefId;
    public ConditionValue getRefRefId() {
        if (_refRefId == null) { _refRefId = nCV(); }
        return _refRefId;
    }
    protected ConditionValue getCValueRefRefId() { return getRefRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefRefCQ addOrderBy_RefRefId_Asc() { regOBA("REF_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefRefCQ addOrderBy_RefRefId_Desc() { regOBD("REF_REF_ID"); return this; }

    protected ConditionValue _refRefName;
    public ConditionValue getRefRefName() {
        if (_refRefName == null) { _refRefName = nCV(); }
        return _refRefName;
    }
    protected ConditionValue getCValueRefRefName() { return getRefRefName(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefRefCQ addOrderBy_RefRefName_Asc() { regOBA("REF_REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefRefCQ addOrderBy_RefRefName_Desc() { regOBD("REF_REF_NAME"); return this; }

    protected ConditionValue _refRefDate;
    public ConditionValue getRefRefDate() {
        if (_refRefDate == null) { _refRefDate = nCV(); }
        return _refRefDate;
    }
    protected ConditionValue getCValueRefRefDate() { return getRefRefDate(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefRefCQ addOrderBy_RefRefDate_Asc() { regOBA("REF_REF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefRefCQ addOrderBy_RefRefDate_Desc() { regOBD("REF_REF_DATE"); return this; }

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
    public BsWhiteSameNameRefRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSameNameRefRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteSameNameRefRefCQ> _scalarConditionMap;
    public Map<String, WhiteSameNameRefRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSameNameRefRefCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSameNameRefRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSameNameRefRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSameNameRefRefCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteSameNameRefRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSameNameRefRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSameNameRefRefCQ subQuery) {
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
    protected Map<String, WhiteSameNameRefRefCQ> _myselfExistsMap;
    public Map<String, WhiteSameNameRefRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSameNameRefRefCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSameNameRefRefCQ> _myselfInScopeMap;
    public Map<String, WhiteSameNameRefRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSameNameRefRefCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSameNameRefRefCB.class.getName(); }
    protected String xCQ() { return WhiteSameNameRefRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
