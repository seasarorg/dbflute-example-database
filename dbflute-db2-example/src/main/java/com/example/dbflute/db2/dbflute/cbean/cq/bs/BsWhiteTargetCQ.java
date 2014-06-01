package com.example.dbflute.db2.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.db2.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_TARGET.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteTargetCQ extends AbstractBsWhiteTargetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteTargetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_TARGET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteTargetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteTargetCIQ xcreateCIQ() {
        WhiteTargetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteTargetCIQ xnewCIQ() {
        return new WhiteTargetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_TARGET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteTargetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteTargetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _targetId;
    public ConditionValue getTargetId() {
        if (_targetId == null) { _targetId = nCV(); }
        return _targetId;
    }
    protected ConditionValue getCValueTargetId() { return getTargetId(); }

    protected Map<String, WhiteRefTargetCQ> _targetId_ExistsReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_ExistsReferrer_WhiteRefTargetList() { return _targetId_ExistsReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_ExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) {
        if (_targetId_ExistsReferrer_WhiteRefTargetListMap == null) { _targetId_ExistsReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_targetId_ExistsReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_ExistsReferrer_WhiteRefTargetListMap.put(ky, sq); return "targetId_ExistsReferrer_WhiteRefTargetList." + ky;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_NotExistsReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_NotExistsReferrer_WhiteRefTargetList() { return _targetId_NotExistsReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_NotExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) {
        if (_targetId_NotExistsReferrer_WhiteRefTargetListMap == null) { _targetId_NotExistsReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_targetId_NotExistsReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_NotExistsReferrer_WhiteRefTargetListMap.put(ky, sq); return "targetId_NotExistsReferrer_WhiteRefTargetList." + ky;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_SpecifyDerivedReferrer_WhiteRefTargetList() { return _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) {
        if (_targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap == null) { _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap.put(ky, sq); return "targetId_SpecifyDerivedReferrer_WhiteRefTargetList." + ky;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_InScopeRelation_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_InScopeRelation_WhiteRefTargetList() { return _targetId_InScopeRelation_WhiteRefTargetListMap; }
    public String keepTargetId_InScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ sq) {
        if (_targetId_InScopeRelation_WhiteRefTargetListMap == null) { _targetId_InScopeRelation_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_targetId_InScopeRelation_WhiteRefTargetListMap.size() + 1);
        _targetId_InScopeRelation_WhiteRefTargetListMap.put(ky, sq); return "targetId_InScopeRelation_WhiteRefTargetList." + ky;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_NotInScopeRelation_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_NotInScopeRelation_WhiteRefTargetList() { return _targetId_NotInScopeRelation_WhiteRefTargetListMap; }
    public String keepTargetId_NotInScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ sq) {
        if (_targetId_NotInScopeRelation_WhiteRefTargetListMap == null) { _targetId_NotInScopeRelation_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_targetId_NotInScopeRelation_WhiteRefTargetListMap.size() + 1);
        _targetId_NotInScopeRelation_WhiteRefTargetListMap.put(ky, sq); return "targetId_NotInScopeRelation_WhiteRefTargetList." + ky;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_QueryDerivedReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_QueryDerivedReferrer_WhiteRefTargetList() { return _targetId_QueryDerivedReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) {
        if (_targetId_QueryDerivedReferrer_WhiteRefTargetListMap == null) { _targetId_QueryDerivedReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_targetId_QueryDerivedReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_QueryDerivedReferrer_WhiteRefTargetListMap.put(ky, sq); return "targetId_QueryDerivedReferrer_WhiteRefTargetList." + ky;
    }
    protected Map<String, Object> _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap;
    public Map<String, Object> getTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter() { return _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap; }
    public String keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(Object vl) {
        if (_targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap == null) { _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap.size() + 1);
        _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap.put(ky, vl); return "targetId_QueryDerivedReferrer_WhiteRefTargetListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetId_Asc() { regOBA("TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetId_Desc() { regOBD("TARGET_ID"); return this; }

    protected ConditionValue _targetName;
    public ConditionValue getTargetName() {
        if (_targetName == null) { _targetName = nCV(); }
        return _targetName;
    }
    protected ConditionValue getCValueTargetName() { return getTargetName(); }

    /** 
     * Add order-by as ascend. <br />
     * TARGET_NAME: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetName_Asc() { regOBA("TARGET_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TARGET_NAME: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetName_Desc() { regOBD("TARGET_NAME"); return this; }

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
    public BsWhiteTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteTargetCQ> _scalarConditionMap;
    public Map<String, WhiteTargetCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteTargetCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteTargetCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteTargetCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteTargetCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteTargetCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteTargetCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteTargetCQ sq) {
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
    protected Map<String, WhiteTargetCQ> _myselfExistsMap;
    public Map<String, WhiteTargetCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteTargetCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteTargetCQ> _myselfInScopeMap;
    public Map<String, WhiteTargetCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteTargetCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteTargetCB.class.getName(); }
    protected String xCQ() { return WhiteTargetCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
