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
 * The base condition-query of WHITE_REF_TARGET.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteRefTargetCQ extends AbstractBsWhiteRefTargetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefTargetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteRefTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_REF_TARGET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteRefTargetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteRefTargetCIQ xcreateCIQ() {
        WhiteRefTargetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteRefTargetCIQ xnewCIQ() {
        return new WhiteRefTargetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_REF_TARGET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteRefTargetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteRefTargetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refTargetId;
    public ConditionValue getRefTargetId() {
        if (_refTargetId == null) { _refTargetId = nCV(); }
        return _refTargetId;
    }
    protected ConditionValue getCValueRefTargetId() { return getRefTargetId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_RefTargetId_Asc() { regOBA("REF_TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_RefTargetId_Desc() { regOBD("REF_TARGET_ID"); return this; }

    protected ConditionValue _targetId;
    public ConditionValue getTargetId() {
        if (_targetId == null) { _targetId = nCV(); }
        return _targetId;
    }
    protected ConditionValue getCValueTargetId() { return getTargetId(); }

    protected Map<String, WhiteTargetCQ> _targetId_InScopeRelation_WhiteTargetMap;
    public Map<String, WhiteTargetCQ> getTargetId_InScopeRelation_WhiteTarget() { return _targetId_InScopeRelation_WhiteTargetMap; }
    public String keepTargetId_InScopeRelation_WhiteTarget(WhiteTargetCQ subQuery) {
        if (_targetId_InScopeRelation_WhiteTargetMap == null) { _targetId_InScopeRelation_WhiteTargetMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_InScopeRelation_WhiteTargetMap.size() + 1);
        _targetId_InScopeRelation_WhiteTargetMap.put(key, subQuery); return "targetId_InScopeRelation_WhiteTarget." + key;
    }

    protected Map<String, WhiteTargetCQ> _targetId_NotInScopeRelation_WhiteTargetMap;
    public Map<String, WhiteTargetCQ> getTargetId_NotInScopeRelation_WhiteTarget() { return _targetId_NotInScopeRelation_WhiteTargetMap; }
    public String keepTargetId_NotInScopeRelation_WhiteTarget(WhiteTargetCQ subQuery) {
        if (_targetId_NotInScopeRelation_WhiteTargetMap == null) { _targetId_NotInScopeRelation_WhiteTargetMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_NotInScopeRelation_WhiteTargetMap.size() + 1);
        _targetId_NotInScopeRelation_WhiteTargetMap.put(key, subQuery); return "targetId_NotInScopeRelation_WhiteTarget." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_TargetId_Asc() { regOBA("TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_TargetId_Desc() { regOBD("TARGET_ID"); return this; }

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
    public BsWhiteRefTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteRefTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteRefTargetCQ baseQuery = (WhiteRefTargetCQ)baseQueryAsSuper;
        WhiteRefTargetCQ unionQuery = (WhiteRefTargetCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteTarget()) {
            unionQuery.queryWhiteTarget().reflectRelationOnUnionQuery(baseQuery.queryWhiteTarget(), unionQuery.queryWhiteTarget());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteTargetCQ queryWhiteTarget() {
        return getConditionQueryWhiteTarget();
    }
    protected WhiteTargetCQ _conditionQueryWhiteTarget;
    public WhiteTargetCQ getConditionQueryWhiteTarget() {
        if (_conditionQueryWhiteTarget == null) {
            _conditionQueryWhiteTarget = xcreateQueryWhiteTarget();
            xsetupOuterJoinWhiteTarget();
        }
        return _conditionQueryWhiteTarget;
    }
    protected WhiteTargetCQ xcreateQueryWhiteTarget() {
        String nrp = resolveNextRelationPath("WHITE_REF_TARGET", "whiteTarget");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteTargetCQ cq = new WhiteTargetCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteTarget");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteTarget() {
        WhiteTargetCQ cq = getConditionQueryWhiteTarget();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("TARGET_ID", "TARGET_ID");
        registerOuterJoin(cq, joinOnMap, "whiteTarget");
    }
    public boolean hasConditionQueryWhiteTarget() {
        return _conditionQueryWhiteTarget != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteRefTargetCQ> _scalarConditionMap;
    public Map<String, WhiteRefTargetCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteRefTargetCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteRefTargetCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteRefTargetCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteRefTargetCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteRefTargetCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteRefTargetCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteRefTargetCQ subQuery) {
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
    protected Map<String, WhiteRefTargetCQ> _myselfExistsMap;
    public Map<String, WhiteRefTargetCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteRefTargetCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteRefTargetCQ> _myselfInScopeMap;
    public Map<String, WhiteRefTargetCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteRefTargetCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteRefTargetCB.class.getName(); }
    protected String xCQ() { return WhiteRefTargetCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
