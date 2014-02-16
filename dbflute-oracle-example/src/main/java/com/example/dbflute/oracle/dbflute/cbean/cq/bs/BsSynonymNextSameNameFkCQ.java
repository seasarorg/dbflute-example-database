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
 * The base condition-query of SYNONYM_NEXT_SAME_NAME_FK.
 * @author oracleman
 */
public class BsSynonymNextSameNameFkCQ extends AbstractBsSynonymNextSameNameFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextSameNameFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymNextSameNameFkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_NEXT_SAME_NAME_FK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymNextSameNameFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymNextSameNameFkCIQ xcreateCIQ() {
        SynonymNextSameNameFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymNextSameNameFkCIQ xnewCIQ() {
        return new SynonymNextSameNameFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_NEXT_SAME_NAME_FK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymNextSameNameFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymNextSameNameFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refId;
    public ConditionValue getRefId() {
        if (_refId == null) { _refId = nCV(); }
        return _refId;
    }
    protected ConditionValue getCValueRefId() { return getRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSameNameFkCQ addOrderBy_RefId_Asc() { regOBA("REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSameNameFkCQ addOrderBy_RefId_Desc() { regOBD("REF_ID"); return this; }

    protected ConditionValue _refName;
    public ConditionValue getRefName() {
        if (_refName == null) { _refName = nCV(); }
        return _refName;
    }
    protected ConditionValue getCValueRefName() { return getRefName(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_NAME: {NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSameNameFkCQ addOrderBy_RefName_Asc() { regOBA("REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_NAME: {NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSameNameFkCQ addOrderBy_RefName_Desc() { regOBD("REF_NAME"); return this; }

    protected ConditionValue _sameNameId;
    public ConditionValue getSameNameId() {
        if (_sameNameId == null) { _sameNameId = nCV(); }
        return _sameNameId;
    }
    protected ConditionValue getCValueSameNameId() { return getSameNameId(); }

    /** 
     * Add order-by as ascend. <br />
     * SAME_NAME_ID: {NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSameNameFkCQ addOrderBy_SameNameId_Asc() { regOBA("SAME_NAME_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SAME_NAME_ID: {NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSameNameFkCQ addOrderBy_SameNameId_Desc() { regOBD("SAME_NAME_ID"); return this; }

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
    public BsSynonymNextSameNameFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSynonymNextSameNameFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, SynonymNextSameNameFkCQ> _scalarConditionMap;
    public Map<String, SynonymNextSameNameFkCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymNextSameNameFkCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymNextSameNameFkCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymNextSameNameFkCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymNextSameNameFkCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, SynonymNextSameNameFkCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymNextSameNameFkCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymNextSameNameFkCQ sq) {
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
    protected Map<String, SynonymNextSameNameFkCQ> _myselfExistsMap;
    public Map<String, SynonymNextSameNameFkCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymNextSameNameFkCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymNextSameNameFkCQ> _myselfInScopeMap;
    public Map<String, SynonymNextSameNameFkCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymNextSameNameFkCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymNextSameNameFkCB.class.getName(); }
    protected String xCQ() { return SynonymNextSameNameFkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
