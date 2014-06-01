package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendor_non_compilableCQ extends AbstractBsVendor_non_compilableCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Vendor_non_compilableCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendor_non_compilableCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR-NON COMPILABLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public Vendor_non_compilableCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected Vendor_non_compilableCIQ xcreateCIQ() {
        Vendor_non_compilableCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected Vendor_non_compilableCIQ xnewCIQ() {
        return new Vendor_non_compilableCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR-NON COMPILABLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public Vendor_non_compilableCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        Vendor_non_compilableCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _non_compilable_id;
    public ConditionValue getNon_compilable_id() {
        if (_non_compilable_id == null) { _non_compilable_id = nCV(); }
        return _non_compilable_id;
    }
    protected ConditionValue getCValueNon_compilable_id() { return getNon_compilable_id(); }

    protected Map<String, Vendor_non_compilableCQ> _non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfListMap;
    public Map<String, Vendor_non_compilableCQ> getNon_compilable_id_ExistsReferrer_Vendor_non_compilableSelfList() { return _non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfListMap; }
    public String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableSelfList(Vendor_non_compilableCQ sq) {
        if (_non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfListMap == null) { _non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfListMap.size() + 1);
        _non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfListMap.put(ky, sq); return "non_compilable_id_ExistsReferrer_Vendor_non_compilableSelfList." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfListMap;
    public Map<String, Vendor_non_compilableCQ> getNon_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfList() { return _non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfListMap; }
    public String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfList(Vendor_non_compilableCQ sq) {
        if (_non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfListMap == null) { _non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfListMap.size() + 1);
        _non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfListMap.put(ky, sq); return "non_compilable_id_NotExistsReferrer_Vendor_non_compilableSelfList." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfListMap;
    public Map<String, Vendor_non_compilableCQ> getNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfList() { return _non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfListMap; }
    public String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfList(Vendor_non_compilableCQ sq) {
        if (_non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfListMap == null) { _non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfListMap.size() + 1);
        _non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfListMap.put(ky, sq); return "non_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableSelfList." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _non_compilable_id_InScopeRelation_Vendor_non_compilableSelfListMap;
    public Map<String, Vendor_non_compilableCQ> getNon_compilable_id_InScopeRelation_Vendor_non_compilableSelfList() { return _non_compilable_id_InScopeRelation_Vendor_non_compilableSelfListMap; }
    public String keepNon_compilable_id_InScopeRelation_Vendor_non_compilableSelfList(Vendor_non_compilableCQ sq) {
        if (_non_compilable_id_InScopeRelation_Vendor_non_compilableSelfListMap == null) { _non_compilable_id_InScopeRelation_Vendor_non_compilableSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_non_compilable_id_InScopeRelation_Vendor_non_compilableSelfListMap.size() + 1);
        _non_compilable_id_InScopeRelation_Vendor_non_compilableSelfListMap.put(ky, sq); return "non_compilable_id_InScopeRelation_Vendor_non_compilableSelfList." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfListMap;
    public Map<String, Vendor_non_compilableCQ> getNon_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfList() { return _non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfListMap; }
    public String keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfList(Vendor_non_compilableCQ sq) {
        if (_non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfListMap == null) { _non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfListMap.size() + 1);
        _non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfListMap.put(ky, sq); return "non_compilable_id_NotInScopeRelation_Vendor_non_compilableSelfList." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListMap;
    public Map<String, Vendor_non_compilableCQ> getNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfList() { return _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListMap; }
    public String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfList(Vendor_non_compilableCQ sq) {
        if (_non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListMap == null) { _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListMap.size() + 1);
        _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListMap.put(ky, sq); return "non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfList." + ky;
    }
    protected Map<String, Object> _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameterMap;
    public Map<String, Object> getNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameter() { return _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameterMap; }
    public String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameter(Object vl) {
        if (_non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameterMap == null) { _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameterMap.size() + 1);
        _non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameterMap.put(ky, vl); return "non_compilable_id_QueryDerivedReferrer_Vendor_non_compilableSelfListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendor_non_compilableCQ addOrderBy_Non_compilable_id_Asc() { regOBA("NON-COMPILABLE ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendor_non_compilableCQ addOrderBy_Non_compilable_id_Desc() { regOBD("NON-COMPILABLE ID"); return this; }

    protected ConditionValue _non_compilable_name;
    public ConditionValue getNon_compilable_name() {
        if (_non_compilable_name == null) { _non_compilable_name = nCV(); }
        return _non_compilable_name;
    }
    protected ConditionValue getCValueNon_compilable_name() { return getNon_compilable_name(); }

    /** 
     * Add order-by as ascend. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @return this. (NotNull)
     */
    public BsVendor_non_compilableCQ addOrderBy_Non_compilable_name_Asc() { regOBA("NON COMPILABLE-NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @return this. (NotNull)
     */
    public BsVendor_non_compilableCQ addOrderBy_Non_compilable_name_Desc() { regOBD("NON COMPILABLE-NAME"); return this; }

    protected ConditionValue _parent_id;
    public ConditionValue getParent_id() {
        if (_parent_id == null) { _parent_id = nCV(); }
        return _parent_id;
    }
    protected ConditionValue getCValueParent_id() { return getParent_id(); }

    protected Map<String, Vendor_non_compilableCQ> _parent_id_InScopeRelation_Vendor_non_compilableSelfMap;
    public Map<String, Vendor_non_compilableCQ> getParent_id_InScopeRelation_Vendor_non_compilableSelf() { return _parent_id_InScopeRelation_Vendor_non_compilableSelfMap; }
    public String keepParent_id_InScopeRelation_Vendor_non_compilableSelf(Vendor_non_compilableCQ sq) {
        if (_parent_id_InScopeRelation_Vendor_non_compilableSelfMap == null) { _parent_id_InScopeRelation_Vendor_non_compilableSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_parent_id_InScopeRelation_Vendor_non_compilableSelfMap.size() + 1);
        _parent_id_InScopeRelation_Vendor_non_compilableSelfMap.put(ky, sq); return "parent_id_InScopeRelation_Vendor_non_compilableSelf." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _parent_id_NotInScopeRelation_Vendor_non_compilableSelfMap;
    public Map<String, Vendor_non_compilableCQ> getParent_id_NotInScopeRelation_Vendor_non_compilableSelf() { return _parent_id_NotInScopeRelation_Vendor_non_compilableSelfMap; }
    public String keepParent_id_NotInScopeRelation_Vendor_non_compilableSelf(Vendor_non_compilableCQ sq) {
        if (_parent_id_NotInScopeRelation_Vendor_non_compilableSelfMap == null) { _parent_id_NotInScopeRelation_Vendor_non_compilableSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_parent_id_NotInScopeRelation_Vendor_non_compilableSelfMap.size() + 1);
        _parent_id_NotInScopeRelation_Vendor_non_compilableSelfMap.put(ky, sq); return "parent_id_NotInScopeRelation_Vendor_non_compilableSelf." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @return this. (NotNull)
     */
    public BsVendor_non_compilableCQ addOrderBy_Parent_id_Asc() { regOBA("PARENT-ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @return this. (NotNull)
     */
    public BsVendor_non_compilableCQ addOrderBy_Parent_id_Desc() { regOBD("PARENT-ID"); return this; }

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
    public BsVendor_non_compilableCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendor_non_compilableCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        Vendor_non_compilableCQ bq = (Vendor_non_compilableCQ)bqs;
        Vendor_non_compilableCQ uq = (Vendor_non_compilableCQ)uqs;
        if (bq.hasConditionQueryVendor_non_compilableSelf()) {
            uq.queryVendor_non_compilableSelf().reflectRelationOnUnionQuery(bq.queryVendor_non_compilableSelf(), uq.queryVendor_non_compilableSelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public Vendor_non_compilableCQ queryVendor_non_compilableSelf() {
        return getConditionQueryVendor_non_compilableSelf();
    }
    protected Vendor_non_compilableCQ _conditionQueryVendor_non_compilableSelf;
    public Vendor_non_compilableCQ getConditionQueryVendor_non_compilableSelf() {
        if (_conditionQueryVendor_non_compilableSelf == null) {
            _conditionQueryVendor_non_compilableSelf = xcreateQueryVendor_non_compilableSelf();
            xsetupOuterJoinVendor_non_compilableSelf();
        }
        return _conditionQueryVendor_non_compilableSelf;
    }
    protected Vendor_non_compilableCQ xcreateQueryVendor_non_compilableSelf() {
        String nrp = resolveNextRelationPath("VENDOR-NON COMPILABLE", "vendor_non_compilableSelf");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        Vendor_non_compilableCQ cq = new Vendor_non_compilableCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendor_non_compilableSelf");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendor_non_compilableSelf() {
        Vendor_non_compilableCQ cq = getConditionQueryVendor_non_compilableSelf();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PARENT-ID", "NON-COMPILABLE ID");
        registerOuterJoin(cq, joinOnMap, "vendor_non_compilableSelf");
    }
    public boolean hasConditionQueryVendor_non_compilableSelf() {
        return _conditionQueryVendor_non_compilableSelf != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, Vendor_non_compilableCQ> _scalarConditionMap;
    public Map<String, Vendor_non_compilableCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(Vendor_non_compilableCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, Vendor_non_compilableCQ> _specifyMyselfDerivedMap;
    public Map<String, Vendor_non_compilableCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(Vendor_non_compilableCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, Vendor_non_compilableCQ> _queryMyselfDerivedMap;
    public Map<String, Vendor_non_compilableCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(Vendor_non_compilableCQ sq) {
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
    protected Map<String, Vendor_non_compilableCQ> _myselfExistsMap;
    public Map<String, Vendor_non_compilableCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(Vendor_non_compilableCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, Vendor_non_compilableCQ> _myselfInScopeMap;
    public Map<String, Vendor_non_compilableCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(Vendor_non_compilableCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return Vendor_non_compilableCB.class.getName(); }
    protected String xCQ() { return Vendor_non_compilableCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
