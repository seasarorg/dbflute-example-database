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
 * The base condition-query of WHITE_UQ_FK_WITHOUT_PK_REF.
 * @author oracleman
 */
public class BsWhiteUqFkWithoutPkRefCQ extends AbstractBsWhiteUqFkWithoutPkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkWithoutPkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkWithoutPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_UQ_FK_WITHOUT_PK_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkWithoutPkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkWithoutPkRefCIQ xcreateCIQ() {
        WhiteUqFkWithoutPkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkWithoutPkRefCIQ xnewCIQ() {
        return new WhiteUqFkWithoutPkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_UQ_FK_WITHOUT_PK_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkWithoutPkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkWithoutPkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_UqFkRefId_Asc() { regOBA("UQ_FK_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_UqFkRefId_Desc() { regOBD("UQ_FK_REF_ID"); return this; }

    protected ConditionValue _fkToUqCode;
    public ConditionValue getFkToUqCode() {
        if (_fkToUqCode == null) { _fkToUqCode = nCV(); }
        return _fkToUqCode;
    }
    protected ConditionValue getCValueFkToUqCode() { return getFkToUqCode(); }

    protected Map<String, WhiteUqFkWithoutPkCQ> _fkToUqCode_InScopeRelation_WhiteUqFkWithoutPkMap;
    public Map<String, WhiteUqFkWithoutPkCQ> getFkToUqCode_InScopeRelation_WhiteUqFkWithoutPk() { return _fkToUqCode_InScopeRelation_WhiteUqFkWithoutPkMap; }
    public String keepFkToUqCode_InScopeRelation_WhiteUqFkWithoutPk(WhiteUqFkWithoutPkCQ subQuery) {
        if (_fkToUqCode_InScopeRelation_WhiteUqFkWithoutPkMap == null) { _fkToUqCode_InScopeRelation_WhiteUqFkWithoutPkMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToUqCode_InScopeRelation_WhiteUqFkWithoutPkMap.size() + 1);
        _fkToUqCode_InScopeRelation_WhiteUqFkWithoutPkMap.put(key, subQuery); return "fkToUqCode_InScopeRelation_WhiteUqFkWithoutPk." + key;
    }

    protected Map<String, WhiteUqFkWithoutPkCQ> _fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPkMap;
    public Map<String, WhiteUqFkWithoutPkCQ> getFkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk() { return _fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPkMap; }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk(WhiteUqFkWithoutPkCQ subQuery) {
        if (_fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPkMap == null) { _fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPkMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPkMap.size() + 1);
        _fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPkMap.put(key, subQuery); return "fkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_FkToUqCode_Asc() { regOBA("FK_TO_UQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkRefCQ addOrderBy_FkToUqCode_Desc() { regOBD("FK_TO_UQ_CODE"); return this; }

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
    public BsWhiteUqFkWithoutPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqFkWithoutPkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteUqFkWithoutPkRefCQ baseQuery = (WhiteUqFkWithoutPkRefCQ)baseQueryAsSuper;
        WhiteUqFkWithoutPkRefCQ unionQuery = (WhiteUqFkWithoutPkRefCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteUqFkWithoutPk()) {
            unionQuery.queryWhiteUqFkWithoutPk().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqFkWithoutPk(), unionQuery.queryWhiteUqFkWithoutPk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqFkWithoutPkCQ queryWhiteUqFkWithoutPk() {
        return getConditionQueryWhiteUqFkWithoutPk();
    }
    protected WhiteUqFkWithoutPkCQ _conditionQueryWhiteUqFkWithoutPk;
    public WhiteUqFkWithoutPkCQ getConditionQueryWhiteUqFkWithoutPk() {
        if (_conditionQueryWhiteUqFkWithoutPk == null) {
            _conditionQueryWhiteUqFkWithoutPk = xcreateQueryWhiteUqFkWithoutPk();
            xsetupOuterJoinWhiteUqFkWithoutPk();
        }
        return _conditionQueryWhiteUqFkWithoutPk;
    }
    protected WhiteUqFkWithoutPkCQ xcreateQueryWhiteUqFkWithoutPk() {
        String nrp = resolveNextRelationPath("WHITE_UQ_FK_WITHOUT_PK_REF", "whiteUqFkWithoutPk");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqFkWithoutPkCQ cq = new WhiteUqFkWithoutPkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqFkWithoutPk");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqFkWithoutPk() {
        WhiteUqFkWithoutPkCQ cq = getConditionQueryWhiteUqFkWithoutPk();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("FK_TO_UQ_CODE", "UQ_FK_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqFkWithoutPk");
    }
    public boolean hasConditionQueryWhiteUqFkWithoutPk() {
        return _conditionQueryWhiteUqFkWithoutPk != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkWithoutPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkWithoutPkRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
