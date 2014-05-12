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
 * The base condition-query of ALIAS_REF_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public class BsAliasRefExceptCQ extends AbstractBsAliasRefExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasRefExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAliasRefExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from ALIAS_REF_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AliasRefExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AliasRefExceptCIQ xcreateCIQ() {
        AliasRefExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AliasRefExceptCIQ xnewCIQ() {
        return new AliasRefExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join ALIAS_REF_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AliasRefExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AliasRefExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsAliasRefExceptCQ addOrderBy_RefExceptId_Asc() { regOBA("REF_EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsAliasRefExceptCQ addOrderBy_RefExceptId_Desc() { regOBD("REF_EXCEPT_ID"); return this; }

    protected ConditionValue _exceptId;
    public ConditionValue getExceptId() {
        if (_exceptId == null) { _exceptId = nCV(); }
        return _exceptId;
    }
    protected ConditionValue getCValueExceptId() { return getExceptId(); }

    protected Map<String, AliasExceptCQ> _exceptId_InScopeRelation_AliasExceptMap;
    public Map<String, AliasExceptCQ> getExceptId_InScopeRelation_AliasExcept() { return _exceptId_InScopeRelation_AliasExceptMap; }
    public String keepExceptId_InScopeRelation_AliasExcept(AliasExceptCQ sq) {
        if (_exceptId_InScopeRelation_AliasExceptMap == null) { _exceptId_InScopeRelation_AliasExceptMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_InScopeRelation_AliasExceptMap.size() + 1);
        _exceptId_InScopeRelation_AliasExceptMap.put(ky, sq); return "exceptId_InScopeRelation_AliasExcept." + ky;
    }

    protected Map<String, AliasExceptCQ> _exceptId_NotInScopeRelation_AliasExceptMap;
    public Map<String, AliasExceptCQ> getExceptId_NotInScopeRelation_AliasExcept() { return _exceptId_NotInScopeRelation_AliasExceptMap; }
    public String keepExceptId_NotInScopeRelation_AliasExcept(AliasExceptCQ sq) {
        if (_exceptId_NotInScopeRelation_AliasExceptMap == null) { _exceptId_NotInScopeRelation_AliasExceptMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_exceptId_NotInScopeRelation_AliasExceptMap.size() + 1);
        _exceptId_NotInScopeRelation_AliasExceptMap.put(ky, sq); return "exceptId_NotInScopeRelation_AliasExcept." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @return this. (NotNull)
     */
    public BsAliasRefExceptCQ addOrderBy_ExceptId_Asc() { regOBA("EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @return this. (NotNull)
     */
    public BsAliasRefExceptCQ addOrderBy_ExceptId_Desc() { regOBD("EXCEPT_ID"); return this; }

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
    public BsAliasRefExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsAliasRefExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AliasRefExceptCQ bq = (AliasRefExceptCQ)bqs;
        AliasRefExceptCQ uq = (AliasRefExceptCQ)uqs;
        if (bq.hasConditionQueryAliasExcept()) {
            uq.queryAliasExcept().reflectRelationOnUnionQuery(bq.queryAliasExcept(), uq.queryAliasExcept());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'.
     * @return The instance of condition-query. (NotNull)
     */
    public AliasExceptCQ queryAliasExcept() {
        return getConditionQueryAliasExcept();
    }
    protected AliasExceptCQ _conditionQueryAliasExcept;
    public AliasExceptCQ getConditionQueryAliasExcept() {
        if (_conditionQueryAliasExcept == null) {
            _conditionQueryAliasExcept = xcreateQueryAliasExcept();
            xsetupOuterJoinAliasExcept();
        }
        return _conditionQueryAliasExcept;
    }
    protected AliasExceptCQ xcreateQueryAliasExcept() {
        String nrp = resolveNextRelationPath("ALIAS_REF_EXCEPT", "aliasExcept");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        AliasExceptCQ cq = new AliasExceptCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("aliasExcept");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinAliasExcept() {
        AliasExceptCQ cq = getConditionQueryAliasExcept();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("EXCEPT_ID", "EXCEPT_ID");
        registerOuterJoin(cq, joinOnMap, "aliasExcept");
    }
    public boolean hasConditionQueryAliasExcept() {
        return _conditionQueryAliasExcept != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, AliasRefExceptCQ> _scalarConditionMap;
    public Map<String, AliasRefExceptCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(AliasRefExceptCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, AliasRefExceptCQ> _specifyMyselfDerivedMap;
    public Map<String, AliasRefExceptCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(AliasRefExceptCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, AliasRefExceptCQ> _queryMyselfDerivedMap;
    public Map<String, AliasRefExceptCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(AliasRefExceptCQ sq) {
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
    protected Map<String, AliasRefExceptCQ> _myselfExistsMap;
    public Map<String, AliasRefExceptCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(AliasRefExceptCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, AliasRefExceptCQ> _myselfInScopeMap;
    public Map<String, AliasRefExceptCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(AliasRefExceptCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AliasRefExceptCB.class.getName(); }
    protected String xCQ() { return AliasRefExceptCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
