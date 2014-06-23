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
 * The base condition-query of white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSameNameRefCQ extends AbstractBsWhiteSameNameRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSameNameRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_same_name_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSameNameRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSameNameRefCIQ xcreateCIQ() {
        WhiteSameNameRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSameNameRefCIQ xnewCIQ() {
        return new WhiteSameNameRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_same_name_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSameNameRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSameNameRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sameNameRefId;
    public ConditionValue getSameNameRefId()
    { if (_sameNameRefId == null) { _sameNameRefId = nCV(); }
      return _sameNameRefId; }
    protected ConditionValue getCValueSameNameRefId() { return getSameNameRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefCQ addOrderBy_SameNameRefId_Asc() { regOBA("same_name_ref_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefCQ addOrderBy_SameNameRefId_Desc() { regOBD("same_name_ref_id"); return this; }

    protected ConditionValue _sameNameId;
    public ConditionValue getSameNameId()
    { if (_sameNameId == null) { _sameNameId = nCV(); }
      return _sameNameId; }
    protected ConditionValue getCValueSameNameId() { return getSameNameId(); }

    public Map<String, WhiteSameNameCQ> getSameNameId_InScopeRelation_WhiteSameName() { return xgetSQueMap("sameNameId_InScopeRelation_WhiteSameName"); }
    public String keepSameNameId_InScopeRelation_WhiteSameName(WhiteSameNameCQ sq) { return xkeepSQue("sameNameId_InScopeRelation_WhiteSameName", sq); }

    public Map<String, WhiteSameNameCQ> getSameNameId_NotInScopeRelation_WhiteSameName() { return xgetSQueMap("sameNameId_NotInScopeRelation_WhiteSameName"); }
    public String keepSameNameId_NotInScopeRelation_WhiteSameName(WhiteSameNameCQ sq) { return xkeepSQue("sameNameId_NotInScopeRelation_WhiteSameName", sq); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _nextSameNameId;
    public ConditionValue getNextSameNameId()
    { if (_nextSameNameId == null) { _nextSameNameId = nCV(); }
      return _nextSameNameId; }
    protected ConditionValue getCValueNextSameNameId() { return getNextSameNameId(); }

    /** 
     * Add order-by as ascend. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefCQ addOrderBy_NextSameNameId_Asc() { regOBA("next_same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameRefCQ addOrderBy_NextSameNameId_Desc() { regOBD("next_same_name_id"); return this; }

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
    public BsWhiteSameNameRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSameNameRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSameNameRefCQ bq = (WhiteSameNameRefCQ)bqs;
        WhiteSameNameRefCQ uq = (WhiteSameNameRefCQ)uqs;
        if (bq.hasConditionQueryWhiteSameName()) {
            uq.queryWhiteSameName().reflectRelationOnUnionQuery(bq.queryWhiteSameName(), uq.queryWhiteSameName());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSameNameCQ queryWhiteSameName() {
        return getConditionQueryWhiteSameName();
    }
    public WhiteSameNameCQ getConditionQueryWhiteSameName() {
        String prop = "whiteSameName";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSameName()); xsetupOuterJoinWhiteSameName(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSameNameCQ xcreateQueryWhiteSameName() {
        String nrp = xresolveNRP("white_same_name_ref", "whiteSameName"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSameNameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSameName", nrp);
    }
    protected void xsetupOuterJoinWhiteSameName() { xregOutJo("whiteSameName"); }
    public boolean hasConditionQueryWhiteSameName() { return xhasQueRlMap("whiteSameName"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteSameNameRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSameNameRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSameNameRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSameNameRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSameNameRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSameNameRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSameNameRefCQ> _myselfExistsMap;
    public Map<String, WhiteSameNameRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSameNameRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSameNameRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSameNameRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSameNameRefCB.class.getName(); }
    protected String xCQ() { return WhiteSameNameRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
