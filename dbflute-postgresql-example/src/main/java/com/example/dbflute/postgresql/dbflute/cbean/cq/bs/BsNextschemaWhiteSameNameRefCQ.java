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
 * The base condition-query of nextschema.white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsNextschemaWhiteSameNameRefCQ extends AbstractBsNextschemaWhiteSameNameRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextschemaWhiteSameNameRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextschemaWhiteSameNameRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from nextschema.white_same_name_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextschemaWhiteSameNameRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextschemaWhiteSameNameRefCIQ xcreateCIQ() {
        NextschemaWhiteSameNameRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextschemaWhiteSameNameRefCIQ xnewCIQ() {
        return new NextschemaWhiteSameNameRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join nextschema.white_same_name_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextschemaWhiteSameNameRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextschemaWhiteSameNameRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _sameNameRefId;
    public ConditionValue getSameNameRefId() {
        if (_sameNameRefId == null) { _sameNameRefId = nCV(); }
        return _sameNameRefId;
    }
    protected ConditionValue getCValueSameNameRefId() { return getSameNameRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameRefId_Asc() { regOBA("same_name_ref_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameRefId_Desc() { regOBD("same_name_ref_id"); return this; }

    protected ConditionValue _sameNameId;
    public ConditionValue getSameNameId() {
        if (_sameNameId == null) { _sameNameId = nCV(); }
        return _sameNameId;
    }
    protected ConditionValue getCValueSameNameId() { return getSameNameId(); }

    protected Map<String, NextschemaWhiteSameNameCQ> _sameNameId_InScopeRelation_WhiteSameNameMap;
    public Map<String, NextschemaWhiteSameNameCQ> getSameNameId_InScopeRelation_WhiteSameName() { return _sameNameId_InScopeRelation_WhiteSameNameMap; }
    public String keepSameNameId_InScopeRelation_WhiteSameName(NextschemaWhiteSameNameCQ subQuery) {
        if (_sameNameId_InScopeRelation_WhiteSameNameMap == null) { _sameNameId_InScopeRelation_WhiteSameNameMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_InScopeRelation_WhiteSameNameMap.size() + 1);
        _sameNameId_InScopeRelation_WhiteSameNameMap.put(key, subQuery); return "sameNameId_InScopeRelation_WhiteSameName." + key;
    }

    protected Map<String, NextschemaWhiteSameNameCQ> _sameNameId_NotInScopeRelation_WhiteSameNameMap;
    public Map<String, NextschemaWhiteSameNameCQ> getSameNameId_NotInScopeRelation_WhiteSameName() { return _sameNameId_NotInScopeRelation_WhiteSameNameMap; }
    public String keepSameNameId_NotInScopeRelation_WhiteSameName(NextschemaWhiteSameNameCQ subQuery) {
        if (_sameNameId_NotInScopeRelation_WhiteSameNameMap == null) { _sameNameId_NotInScopeRelation_WhiteSameNameMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_sameNameId_NotInScopeRelation_WhiteSameNameMap.size() + 1);
        _sameNameId_NotInScopeRelation_WhiteSameNameMap.put(key, subQuery); return "sameNameId_NotInScopeRelation_WhiteSameName." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _nextRefDate;
    public ConditionValue getNextRefDate() {
        if (_nextRefDate == null) { _nextRefDate = nCV(); }
        return _nextRefDate;
    }
    protected ConditionValue getCValueNextRefDate() { return getNextRefDate(); }

    /** 
     * Add order-by as ascend. <br />
     * next_ref_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_NextRefDate_Asc() { regOBA("next_ref_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * next_ref_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_NextRefDate_Desc() { regOBD("next_ref_date"); return this; }

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
    public BsNextschemaWhiteSameNameRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsNextschemaWhiteSameNameRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        NextschemaWhiteSameNameRefCQ baseQuery = (NextschemaWhiteSameNameRefCQ)baseQueryAsSuper;
        NextschemaWhiteSameNameRefCQ unionQuery = (NextschemaWhiteSameNameRefCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteSameName()) {
            unionQuery.queryWhiteSameName().reflectRelationOnUnionQuery(baseQuery.queryWhiteSameName(), unionQuery.queryWhiteSameName());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The instance of condition-query. (NotNull)
     */
    public NextschemaWhiteSameNameCQ queryWhiteSameName() {
        return getConditionQueryWhiteSameName();
    }
    protected NextschemaWhiteSameNameCQ _conditionQueryWhiteSameName;
    public NextschemaWhiteSameNameCQ getConditionQueryWhiteSameName() {
        if (_conditionQueryWhiteSameName == null) {
            _conditionQueryWhiteSameName = xcreateQueryWhiteSameName();
            xsetupOuterJoinWhiteSameName();
        }
        return _conditionQueryWhiteSameName;
    }
    protected NextschemaWhiteSameNameCQ xcreateQueryWhiteSameName() {
        String nrp = resolveNextRelationPath("nextschema.white_same_name_ref", "whiteSameName");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        NextschemaWhiteSameNameCQ cq = new NextschemaWhiteSameNameCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteSameName");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteSameName() {
        NextschemaWhiteSameNameCQ cq = getConditionQueryWhiteSameName();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("same_name_id", "same_name_id");
        registerOuterJoin(cq, joinOnMap, "whiteSameName");
    }
    public boolean hasConditionQueryWhiteSameName() {
        return _conditionQueryWhiteSameName != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, NextschemaWhiteSameNameRefCQ> _scalarConditionMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, NextschemaWhiteSameNameRefCQ> _specifyMyselfDerivedMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, NextschemaWhiteSameNameRefCQ> _queryMyselfDerivedMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(NextschemaWhiteSameNameRefCQ subQuery) {
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
    protected Map<String, NextschemaWhiteSameNameRefCQ> _myselfExistsMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, NextschemaWhiteSameNameRefCQ> _myselfInScopeMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(NextschemaWhiteSameNameRefCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextschemaWhiteSameNameRefCB.class.getName(); }
    protected String xCQ() { return NextschemaWhiteSameNameRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
