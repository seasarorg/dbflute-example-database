package com.example.dbflute.tricky.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.tricky.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.tricky.dbflute.cbean.*;
import com.example.dbflute.tricky.dbflute.cbean.cq.*;

/**
 * The base condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
public class BsRegionCQ extends AbstractBsRegionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RegionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRegionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from REGION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RegionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RegionCIQ xcreateCIQ() {
        RegionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RegionCIQ xnewCIQ() {
        return new RegionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join REGION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RegionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RegionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _regionId;
    public ConditionValue getRegionId() {
        if (_regionId == null) { _regionId = nCV(); }
        return _regionId;
    }
    protected ConditionValue getCValueRegionId() { return getRegionId(); }

    protected Map<String, MemberAddressCQ> _regionId_ExistsReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getRegionId_ExistsReferrer_MemberAddressList() { return _regionId_ExistsReferrer_MemberAddressListMap; }
    public String keepRegionId_ExistsReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_regionId_ExistsReferrer_MemberAddressListMap == null) { _regionId_ExistsReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_regionId_ExistsReferrer_MemberAddressListMap.size() + 1);
        _regionId_ExistsReferrer_MemberAddressListMap.put(key, subQuery); return "regionId_ExistsReferrer_MemberAddressList." + key;
    }

    protected Map<String, MemberAddressCQ> _regionId_NotExistsReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getRegionId_NotExistsReferrer_MemberAddressList() { return _regionId_NotExistsReferrer_MemberAddressListMap; }
    public String keepRegionId_NotExistsReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_regionId_NotExistsReferrer_MemberAddressListMap == null) { _regionId_NotExistsReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_regionId_NotExistsReferrer_MemberAddressListMap.size() + 1);
        _regionId_NotExistsReferrer_MemberAddressListMap.put(key, subQuery); return "regionId_NotExistsReferrer_MemberAddressList." + key;
    }

    protected Map<String, MemberAddressCQ> _regionId_SpecifyDerivedReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getRegionId_SpecifyDerivedReferrer_MemberAddressList() { return _regionId_SpecifyDerivedReferrer_MemberAddressListMap; }
    public String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_regionId_SpecifyDerivedReferrer_MemberAddressListMap == null) { _regionId_SpecifyDerivedReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_regionId_SpecifyDerivedReferrer_MemberAddressListMap.size() + 1);
        _regionId_SpecifyDerivedReferrer_MemberAddressListMap.put(key, subQuery); return "regionId_SpecifyDerivedReferrer_MemberAddressList." + key;
    }

    protected Map<String, MemberAddressCQ> _regionId_InScopeRelation_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getRegionId_InScopeRelation_MemberAddressList() { return _regionId_InScopeRelation_MemberAddressListMap; }
    public String keepRegionId_InScopeRelation_MemberAddressList(MemberAddressCQ subQuery) {
        if (_regionId_InScopeRelation_MemberAddressListMap == null) { _regionId_InScopeRelation_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_regionId_InScopeRelation_MemberAddressListMap.size() + 1);
        _regionId_InScopeRelation_MemberAddressListMap.put(key, subQuery); return "regionId_InScopeRelation_MemberAddressList." + key;
    }

    protected Map<String, MemberAddressCQ> _regionId_NotInScopeRelation_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getRegionId_NotInScopeRelation_MemberAddressList() { return _regionId_NotInScopeRelation_MemberAddressListMap; }
    public String keepRegionId_NotInScopeRelation_MemberAddressList(MemberAddressCQ subQuery) {
        if (_regionId_NotInScopeRelation_MemberAddressListMap == null) { _regionId_NotInScopeRelation_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_regionId_NotInScopeRelation_MemberAddressListMap.size() + 1);
        _regionId_NotInScopeRelation_MemberAddressListMap.put(key, subQuery); return "regionId_NotInScopeRelation_MemberAddressList." + key;
    }

    protected Map<String, MemberAddressCQ> _regionId_QueryDerivedReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getRegionId_QueryDerivedReferrer_MemberAddressList() { return _regionId_QueryDerivedReferrer_MemberAddressListMap; }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_regionId_QueryDerivedReferrer_MemberAddressListMap == null) { _regionId_QueryDerivedReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_regionId_QueryDerivedReferrer_MemberAddressListMap.size() + 1);
        _regionId_QueryDerivedReferrer_MemberAddressListMap.put(key, subQuery); return "regionId_QueryDerivedReferrer_MemberAddressList." + key;
    }
    protected Map<String, Object> _regionId_QueryDerivedReferrer_MemberAddressListParameterMap;
    public Map<String, Object> getRegionId_QueryDerivedReferrer_MemberAddressListParameter() { return _regionId_QueryDerivedReferrer_MemberAddressListParameterMap; }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object parameterValue) {
        if (_regionId_QueryDerivedReferrer_MemberAddressListParameterMap == null) { _regionId_QueryDerivedReferrer_MemberAddressListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_regionId_QueryDerivedReferrer_MemberAddressListParameterMap.size() + 1);
        _regionId_QueryDerivedReferrer_MemberAddressListParameterMap.put(key, parameterValue); return "regionId_QueryDerivedReferrer_MemberAddressListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * REGION_ID: {PK, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionId_Asc() { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGION_ID: {PK, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionId_Desc() { regOBD("REGION_ID"); return this; }

    protected ConditionValue _regionName;
    public ConditionValue getRegionName() {
        if (_regionName == null) { _regionName = nCV(); }
        return _regionName;
    }
    protected ConditionValue getCValueRegionName() { return getRegionName(); }

    /** 
     * Add order-by as ascend. <br />
     * REGION_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionName_Asc() { regOBA("REGION_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGION_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionName_Desc() { regOBD("REGION_NAME"); return this; }

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
    public BsRegionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsRegionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, RegionCQ> _scalarConditionMap;
    public Map<String, RegionCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(RegionCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, RegionCQ> _specifyMyselfDerivedMap;
    public Map<String, RegionCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(RegionCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, RegionCQ> _queryMyselfDerivedMap;
    public Map<String, RegionCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(RegionCQ subQuery) {
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
    protected Map<String, RegionCQ> _myselfExistsMap;
    public Map<String, RegionCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(RegionCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, RegionCQ> _myselfInScopeMap;
    public Map<String, RegionCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(RegionCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RegionCB.class.getName(); }
    protected String xCQ() { return RegionCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
