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
 * The base condition-query of SYNONYM_REF_EXCEPT.
 * @author oracleman
 */
public class BsSynonymRefExceptCQ extends AbstractBsSynonymRefExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymRefExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymRefExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_REF_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymRefExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymRefExceptCIQ xcreateCIQ() {
        SynonymRefExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymRefExceptCIQ xnewCIQ() {
        return new SynonymRefExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_REF_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymRefExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymRefExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refExceptId;
    public ConditionValue getRefExceptId() {
        if (_refExceptId == null) { _refExceptId = nCV(); }
        return _refExceptId;
    }
    protected ConditionValue getCValueRefExceptId() { return getRefExceptId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymRefExceptCQ addOrderBy_RefExceptId_Asc() { regOBA("REF_EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymRefExceptCQ addOrderBy_RefExceptId_Desc() { regOBD("REF_EXCEPT_ID"); return this; }

    protected ConditionValue _exceptId;
    public ConditionValue getExceptId() {
        if (_exceptId == null) { _exceptId = nCV(); }
        return _exceptId;
    }
    protected ConditionValue getCValueExceptId() { return getExceptId(); }

    protected Map<String, SynonymExceptCQ> _exceptId_InScopeRelation_SynonymExceptMap;
    public Map<String, SynonymExceptCQ> getExceptId_InScopeRelation_SynonymExcept() { return _exceptId_InScopeRelation_SynonymExceptMap; }
    public String keepExceptId_InScopeRelation_SynonymExcept(SynonymExceptCQ sq) {
        if (_exceptId_InScopeRelation_SynonymExceptMap == null) { _exceptId_InScopeRelation_SynonymExceptMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_InScopeRelation_SynonymExceptMap.size() + 1);
        _exceptId_InScopeRelation_SynonymExceptMap.put(ky, sq); return "exceptId_InScopeRelation_SynonymExcept." + ky;
    }

    protected Map<String, SynonymExceptCQ> _exceptId_NotInScopeRelation_SynonymExceptMap;
    public Map<String, SynonymExceptCQ> getExceptId_NotInScopeRelation_SynonymExcept() { return _exceptId_NotInScopeRelation_SynonymExceptMap; }
    public String keepExceptId_NotInScopeRelation_SynonymExcept(SynonymExceptCQ sq) {
        if (_exceptId_NotInScopeRelation_SynonymExceptMap == null) { _exceptId_NotInScopeRelation_SynonymExceptMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_NotInScopeRelation_SynonymExceptMap.size() + 1);
        _exceptId_NotInScopeRelation_SynonymExceptMap.put(ky, sq); return "exceptId_NotInScopeRelation_SynonymExcept." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @return this. (NotNull)
     */
    public BsSynonymRefExceptCQ addOrderBy_ExceptId_Asc() { regOBA("EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @return this. (NotNull)
     */
    public BsSynonymRefExceptCQ addOrderBy_ExceptId_Desc() { regOBD("EXCEPT_ID"); return this; }

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
    public BsSynonymRefExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSynonymRefExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SynonymRefExceptCQ bq = (SynonymRefExceptCQ)bqs;
        SynonymRefExceptCQ uq = (SynonymRefExceptCQ)uqs;
        if (bq.hasConditionQuerySynonymExcept()) {
            uq.querySynonymExcept().reflectRelationOnUnionQuery(bq.querySynonymExcept(), uq.querySynonymExcept());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymExceptCQ querySynonymExcept() {
        return getConditionQuerySynonymExcept();
    }
    protected SynonymExceptCQ _conditionQuerySynonymExcept;
    public SynonymExceptCQ getConditionQuerySynonymExcept() {
        if (_conditionQuerySynonymExcept == null) {
            _conditionQuerySynonymExcept = xcreateQuerySynonymExcept();
            xsetupOuterJoinSynonymExcept();
        }
        return _conditionQuerySynonymExcept;
    }
    protected SynonymExceptCQ xcreateQuerySynonymExcept() {
        String nrp = resolveNextRelationPath("SYNONYM_REF_EXCEPT", "synonymExcept");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SynonymExceptCQ cq = new SynonymExceptCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("synonymExcept");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSynonymExcept() {
        SynonymExceptCQ cq = getConditionQuerySynonymExcept();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("EXCEPT_ID", "EXCEPT_ID");
        registerOuterJoin(cq, joinOnMap, "synonymExcept");
    }
    public boolean hasConditionQuerySynonymExcept() {
        return _conditionQuerySynonymExcept != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, SynonymRefExceptCQ> _scalarConditionMap;
    public Map<String, SynonymRefExceptCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymRefExceptCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymRefExceptCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymRefExceptCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymRefExceptCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, SynonymRefExceptCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymRefExceptCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymRefExceptCQ sq) {
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
    protected Map<String, SynonymRefExceptCQ> _myselfExistsMap;
    public Map<String, SynonymRefExceptCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymRefExceptCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymRefExceptCQ> _myselfInScopeMap;
    public Map<String, SynonymRefExceptCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymRefExceptCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymRefExceptCB.class.getName(); }
    protected String xCQ() { return SynonymRefExceptCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
