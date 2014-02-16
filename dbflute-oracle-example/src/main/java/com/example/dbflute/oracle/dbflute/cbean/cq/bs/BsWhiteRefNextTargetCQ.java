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
 * The base condition-query of WHITE_REF_NEXT_TARGET.
 * @author oracleman
 */
public class BsWhiteRefNextTargetCQ extends AbstractBsWhiteRefNextTargetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefNextTargetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteRefNextTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_REF_NEXT_TARGET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteRefNextTargetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteRefNextTargetCIQ xcreateCIQ() {
        WhiteRefNextTargetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteRefNextTargetCIQ xnewCIQ() {
        return new WhiteRefNextTargetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_REF_NEXT_TARGET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteRefNextTargetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteRefNextTargetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _refNextTargetId;
    public ConditionValue getRefNextTargetId() {
        if (_refNextTargetId == null) { _refNextTargetId = nCV(); }
        return _refNextTargetId;
    }
    protected ConditionValue getCValueRefNextTargetId() { return getRefNextTargetId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextTargetCQ addOrderBy_RefNextTargetId_Asc() { regOBA("REF_NEXT_TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextTargetCQ addOrderBy_RefNextTargetId_Desc() { regOBD("REF_NEXT_TARGET_ID"); return this; }

    protected ConditionValue _nextTargetCode;
    public ConditionValue getNextTargetCode() {
        if (_nextTargetCode == null) { _nextTargetCode = nCV(); }
        return _nextTargetCode;
    }
    protected ConditionValue getCValueNextTargetCode() { return getNextTargetCode(); }

    protected Map<String, NextSchemaProductStatusCQ> _nextTargetCode_InScopeRelation_NextSchemaProductStatusMap;
    public Map<String, NextSchemaProductStatusCQ> getNextTargetCode_InScopeRelation_NextSchemaProductStatus() { return _nextTargetCode_InScopeRelation_NextSchemaProductStatusMap; }
    public String keepNextTargetCode_InScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq) {
        if (_nextTargetCode_InScopeRelation_NextSchemaProductStatusMap == null) { _nextTargetCode_InScopeRelation_NextSchemaProductStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_nextTargetCode_InScopeRelation_NextSchemaProductStatusMap.size() + 1);
        _nextTargetCode_InScopeRelation_NextSchemaProductStatusMap.put(ky, sq); return "nextTargetCode_InScopeRelation_NextSchemaProductStatus." + ky;
    }

    protected Map<String, NextSchemaProductStatusCQ> _nextTargetCode_NotInScopeRelation_NextSchemaProductStatusMap;
    public Map<String, NextSchemaProductStatusCQ> getNextTargetCode_NotInScopeRelation_NextSchemaProductStatus() { return _nextTargetCode_NotInScopeRelation_NextSchemaProductStatusMap; }
    public String keepNextTargetCode_NotInScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq) {
        if (_nextTargetCode_NotInScopeRelation_NextSchemaProductStatusMap == null) { _nextTargetCode_NotInScopeRelation_NextSchemaProductStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_nextTargetCode_NotInScopeRelation_NextSchemaProductStatusMap.size() + 1);
        _nextTargetCode_NotInScopeRelation_NextSchemaProductStatusMap.put(ky, sq); return "nextTargetCode_NotInScopeRelation_NextSchemaProductStatus." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextTargetCQ addOrderBy_NextTargetCode_Asc() { regOBA("NEXT_TARGET_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public BsWhiteRefNextTargetCQ addOrderBy_NextTargetCode_Desc() { regOBD("NEXT_TARGET_CODE"); return this; }

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
    public BsWhiteRefNextTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteRefNextTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteRefNextTargetCQ bq = (WhiteRefNextTargetCQ)bqs;
        WhiteRefNextTargetCQ uq = (WhiteRefNextTargetCQ)uqs;
        if (bq.hasConditionQueryNextSchemaProductStatus()) {
            uq.queryNextSchemaProductStatus().reflectRelationOnUnionQuery(bq.queryNextSchemaProductStatus(), uq.queryNextSchemaProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public NextSchemaProductStatusCQ queryNextSchemaProductStatus() {
        return getConditionQueryNextSchemaProductStatus();
    }
    protected NextSchemaProductStatusCQ _conditionQueryNextSchemaProductStatus;
    public NextSchemaProductStatusCQ getConditionQueryNextSchemaProductStatus() {
        if (_conditionQueryNextSchemaProductStatus == null) {
            _conditionQueryNextSchemaProductStatus = xcreateQueryNextSchemaProductStatus();
            xsetupOuterJoinNextSchemaProductStatus();
        }
        return _conditionQueryNextSchemaProductStatus;
    }
    protected NextSchemaProductStatusCQ xcreateQueryNextSchemaProductStatus() {
        String nrp = resolveNextRelationPath("WHITE_REF_NEXT_TARGET", "nextSchemaProductStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        NextSchemaProductStatusCQ cq = new NextSchemaProductStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("nextSchemaProductStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinNextSchemaProductStatus() {
        NextSchemaProductStatusCQ cq = getConditionQueryNextSchemaProductStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("NEXT_TARGET_CODE", "PRODUCT_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "nextSchemaProductStatus");
    }
    public boolean hasConditionQueryNextSchemaProductStatus() {
        return _conditionQueryNextSchemaProductStatus != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteRefNextTargetCQ> _scalarConditionMap;
    public Map<String, WhiteRefNextTargetCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteRefNextTargetCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteRefNextTargetCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteRefNextTargetCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteRefNextTargetCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteRefNextTargetCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteRefNextTargetCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteRefNextTargetCQ sq) {
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
    protected Map<String, WhiteRefNextTargetCQ> _myselfExistsMap;
    public Map<String, WhiteRefNextTargetCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteRefNextTargetCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteRefNextTargetCQ> _myselfInScopeMap;
    public Map<String, WhiteRefNextTargetCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteRefNextTargetCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteRefNextTargetCB.class.getName(); }
    protected String xCQ() { return WhiteRefNextTargetCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
