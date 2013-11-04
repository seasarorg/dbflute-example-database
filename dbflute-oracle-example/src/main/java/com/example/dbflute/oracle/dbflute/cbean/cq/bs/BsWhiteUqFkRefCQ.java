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
 * The base condition-query of WHITE_UQ_FK_REF.
 * @author oracleman
 */
public class BsWhiteUqFkRefCQ extends AbstractBsWhiteUqFkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_UQ_FK_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkRefCIQ xcreateCIQ() {
        WhiteUqFkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkRefCIQ xnewCIQ() {
        return new WhiteUqFkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_UQ_FK_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqFkRefId;
    public ConditionValue getUqFkRefId() {
        if (_uqFkRefId == null) { _uqFkRefId = nCV(); }
        return _uqFkRefId;
    }
    protected ConditionValue getCValueUqFkRefId() { return getUqFkRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_UqFkRefId_Asc() { regOBA("UQ_FK_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_UqFkRefId_Desc() { regOBD("UQ_FK_REF_ID"); return this; }

    protected ConditionValue _fkToPkId;
    public ConditionValue getFkToPkId() {
        if (_fkToPkId == null) { _fkToPkId = nCV(); }
        return _fkToPkId;
    }
    protected ConditionValue getCValueFkToPkId() { return getFkToPkId(); }

    protected Map<String, WhiteUqFkCQ> _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap;
    public Map<String, WhiteUqFkCQ> getFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId() { return _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap; }
    public String keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ subQuery) {
        if (_fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap == null) { _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap.size() + 1);
        _fkToPkId_InScopeRelation_WhiteUqFkByFkToPkIdMap.put(key, subQuery); return "fkToPkId_InScopeRelation_WhiteUqFkByFkToPkId." + key;
    }

    protected Map<String, WhiteUqFkCQ> _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap;
    public Map<String, WhiteUqFkCQ> getFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId() { return _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap; }
    public String keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ subQuery) {
        if (_fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap == null) { _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap.size() + 1);
        _fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkIdMap.put(key, subQuery); return "fkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToPkId_Asc() { regOBA("FK_TO_PK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToPkId_Desc() { regOBD("FK_TO_PK_ID"); return this; }

    protected ConditionValue _fkToUqCode;
    public ConditionValue getFkToUqCode() {
        if (_fkToUqCode == null) { _fkToUqCode = nCV(); }
        return _fkToUqCode;
    }
    protected ConditionValue getCValueFkToUqCode() { return getFkToUqCode(); }

    protected Map<String, WhiteUqFkCQ> _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap;
    public Map<String, WhiteUqFkCQ> getFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode() { return _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap; }
    public String keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ subQuery) {
        if (_fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap == null) { _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap.size() + 1);
        _fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCodeMap.put(key, subQuery); return "fkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode." + key;
    }

    protected Map<String, WhiteUqFkCQ> _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap;
    public Map<String, WhiteUqFkCQ> getFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode() { return _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap; }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ subQuery) {
        if (_fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap == null) { _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap.size() + 1);
        _fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCodeMap.put(key, subQuery); return "fkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToUqCode_Asc() { regOBA("FK_TO_UQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_FkToUqCode_Desc() { regOBD("FK_TO_UQ_CODE"); return this; }

    protected ConditionValue _compoundUqFirstCode;
    public ConditionValue getCompoundUqFirstCode() {
        if (_compoundUqFirstCode == null) { _compoundUqFirstCode = nCV(); }
        return _compoundUqFirstCode;
    }
    protected ConditionValue getCValueCompoundUqFirstCode() { return getCompoundUqFirstCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

    protected ConditionValue _compoundUqSecondCode;
    public ConditionValue getCompoundUqSecondCode() {
        if (_compoundUqSecondCode == null) { _compoundUqSecondCode = nCV(); }
        return _compoundUqSecondCode;
    }
    protected ConditionValue getCValueCompoundUqSecondCode() { return getCompoundUqSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkRefCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
    public BsWhiteUqFkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqFkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteUqFkRefCQ baseQuery = (WhiteUqFkRefCQ)baseQueryAsSuper;
        WhiteUqFkRefCQ unionQuery = (WhiteUqFkRefCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteUqFkByFkToPkId()) {
            unionQuery.queryWhiteUqFkByFkToPkId().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqFkByFkToPkId(), unionQuery.queryWhiteUqFkByFkToPkId());
        }
        if (baseQuery.hasConditionQueryWhiteUqFkByFkToUqCode()) {
            unionQuery.queryWhiteUqFkByFkToUqCode().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqFkByFkToUqCode(), unionQuery.queryWhiteUqFkByFkToUqCode());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkCQ queryWhiteUqFkByFkToPkId() {
        return getConditionQueryWhiteUqFkByFkToPkId();
    }
    protected WhiteUqFkCQ _conditionQueryWhiteUqFkByFkToPkId;
    public WhiteUqFkCQ getConditionQueryWhiteUqFkByFkToPkId() {
        if (_conditionQueryWhiteUqFkByFkToPkId == null) {
            _conditionQueryWhiteUqFkByFkToPkId = xcreateQueryWhiteUqFkByFkToPkId();
            xsetupOuterJoinWhiteUqFkByFkToPkId();
        }
        return _conditionQueryWhiteUqFkByFkToPkId;
    }
    protected WhiteUqFkCQ xcreateQueryWhiteUqFkByFkToPkId() {
        String nrp = resolveNextRelationPath("WHITE_UQ_FK_REF", "whiteUqFkByFkToPkId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqFkCQ cq = new WhiteUqFkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqFkByFkToPkId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqFkByFkToPkId() {
        WhiteUqFkCQ cq = getConditionQueryWhiteUqFkByFkToPkId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_PK_ID", "UQ_FK_ID");
        registerOuterJoin(cq, joinOnMap, "whiteUqFkByFkToPkId");
    }
    public boolean hasConditionQueryWhiteUqFkByFkToPkId() {
        return _conditionQueryWhiteUqFkByFkToPkId != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkCQ queryWhiteUqFkByFkToUqCode() {
        return getConditionQueryWhiteUqFkByFkToUqCode();
    }
    protected WhiteUqFkCQ _conditionQueryWhiteUqFkByFkToUqCode;
    public WhiteUqFkCQ getConditionQueryWhiteUqFkByFkToUqCode() {
        if (_conditionQueryWhiteUqFkByFkToUqCode == null) {
            _conditionQueryWhiteUqFkByFkToUqCode = xcreateQueryWhiteUqFkByFkToUqCode();
            xsetupOuterJoinWhiteUqFkByFkToUqCode();
        }
        return _conditionQueryWhiteUqFkByFkToUqCode;
    }
    protected WhiteUqFkCQ xcreateQueryWhiteUqFkByFkToUqCode() {
        String nrp = resolveNextRelationPath("WHITE_UQ_FK_REF", "whiteUqFkByFkToUqCode");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqFkCQ cq = new WhiteUqFkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqFkByFkToUqCode");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqFkByFkToUqCode() {
        WhiteUqFkCQ cq = getConditionQueryWhiteUqFkByFkToUqCode();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_UQ_CODE", "UQ_FK_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqFkByFkToUqCode");
    }
    public boolean hasConditionQueryWhiteUqFkByFkToUqCode() {
        return _conditionQueryWhiteUqFkByFkToUqCode != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteUqFkRefCQ> _scalarConditionMap;
    public Map<String, WhiteUqFkRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqFkRefCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqFkRefCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqFkRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqFkRefCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteUqFkRefCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqFkRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqFkRefCQ subQuery) {
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
    protected Map<String, WhiteUqFkRefCQ> _myselfExistsMap;
    public Map<String, WhiteUqFkRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqFkRefCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqFkRefCQ> _myselfInScopeMap;
    public Map<String, WhiteUqFkRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqFkRefCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                       Compound PK's Exists Referrer
    //                                                       =============================
    /**
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from WHITE_UQ_FK_REF_NEST where ...)}
     * @param subQuery The sub-query of WhiteUqFkRefNestList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefNestList(SubQuery<WhiteUqFkRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefNestCB>", subQuery);
        WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "COMPOUND_UQ_SECOND_CODE, COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE", subQueryPropertyName, "whiteUqFkRefNestList");
    }
    protected Map<String, WhiteUqFkRefNestCQ> _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap;
    public Map<String, WhiteUqFkRefNestCQ> getTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList() { return _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList(WhiteUqFkRefNestCQ subQuery) {
        if (_twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestListMap.put(key, subQuery); return "twoOrMorePk_ExistsReferrer_WhiteUqFkRefNestList." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
