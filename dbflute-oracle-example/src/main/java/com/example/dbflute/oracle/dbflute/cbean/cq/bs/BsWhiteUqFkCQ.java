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
 * The base condition-query of WHITE_UQ_FK.
 * @author oracleman
 */
public class BsWhiteUqFkCQ extends AbstractBsWhiteUqFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_UQ_FK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkCIQ xcreateCIQ() {
        WhiteUqFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkCIQ xnewCIQ() {
        return new WhiteUqFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_UQ_FK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqFkId;
    public ConditionValue getUqFkId() {
        if (_uqFkId == null) { _uqFkId = nCV(); }
        return _uqFkId;
    }
    protected ConditionValue getCValueUqFkId() { return getUqFkId(); }

    protected Map<String, WhiteUqFkRefCQ> _uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList() { return _uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdListMap; }
    public String keepUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdListMap == null) { _uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdListMap.size() + 1);
        _uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdListMap.put(key, subQuery); return "uqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList() { return _uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdListMap; }
    public String keepUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdListMap == null) { _uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdListMap.size() + 1);
        _uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdListMap.put(key, subQuery); return "uqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList() { return _uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap; }
    public String keepUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap == null) { _uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap.size() + 1);
        _uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap.put(key, subQuery); return "uqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList() { return _uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdListMap; }
    public String keepUqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdListMap == null) { _uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdListMap.size() + 1);
        _uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdListMap.put(key, subQuery); return "uqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList() { return _uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdListMap; }
    public String keepUqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdListMap == null) { _uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdListMap.size() + 1);
        _uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdListMap.put(key, subQuery); return "uqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList() { return _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap; }
    public String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap == null) { _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap.size() + 1);
        _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListMap.put(key, subQuery); return "uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList." + key;
    }
    protected Map<String, Object> _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameterMap;
    public Map<String, Object> getUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter() { return _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameterMap; }
    public String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter(Object parameterValue) {
        if (_uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameterMap == null) { _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameterMap.size() + 1);
        _uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameterMap.put(key, parameterValue); return "uqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkId_Asc() { regOBA("UQ_FK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkId_Desc() { regOBD("UQ_FK_ID"); return this; }

    protected ConditionValue _uqFkCode;
    public ConditionValue getUqFkCode() {
        if (_uqFkCode == null) { _uqFkCode = nCV(); }
        return _uqFkCode;
    }
    protected ConditionValue getCValueUqFkCode() { return getUqFkCode(); }

    protected Map<String, WhiteUqFkRefCQ> _uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList() { return _uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap; }
    public String keepUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap == null) { _uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap.size() + 1);
        _uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap.put(key, subQuery); return "uqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList() { return _uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap; }
    public String keepUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap == null) { _uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap.size() + 1);
        _uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeListMap.put(key, subQuery); return "uqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList() { return _uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeListMap; }
    public String keepUqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeListMap == null) { _uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeListMap.size() + 1);
        _uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeListMap.put(key, subQuery); return "uqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList() { return _uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeListMap; }
    public String keepUqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeListMap == null) { _uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeListMap.size() + 1);
        _uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeListMap.put(key, subQuery); return "uqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList() { return _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap; }
    public String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap == null) { _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap.size() + 1);
        _uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap.put(key, subQuery); return "uqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap;
    public Map<String, WhiteUqFkRefCQ> getUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList() { return _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap; }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ subQuery) {
        if (_uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap == null) { _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap.size() + 1);
        _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListMap.put(key, subQuery); return "uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList." + key;
    }
    protected Map<String, Object> _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameterMap;
    public Map<String, Object> getUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter() { return _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameterMap; }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter(Object parameterValue) {
        if (_uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameterMap == null) { _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameterMap.size() + 1);
        _uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameterMap.put(key, parameterValue); return "uqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkCode_Asc() { regOBA("UQ_FK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkCQ addOrderBy_UqFkCode_Desc() { regOBD("UQ_FK_CODE"); return this; }

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
    public BsWhiteUqFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteUqFkCQ> _scalarConditionMap;
    public Map<String, WhiteUqFkCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqFkCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqFkCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqFkCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqFkCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteUqFkCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqFkCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqFkCQ subQuery) {
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
    protected Map<String, WhiteUqFkCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqFkCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqFkCQ> _myselfInScopeMap;
    public Map<String, WhiteUqFkCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqFkCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}