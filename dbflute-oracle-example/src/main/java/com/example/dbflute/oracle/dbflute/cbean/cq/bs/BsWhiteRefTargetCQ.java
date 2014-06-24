package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_REF_TARGET.
 * @author oracleman
 */
public class BsWhiteRefTargetCQ extends AbstractBsWhiteRefTargetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefTargetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteRefTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_REF_TARGET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteRefTargetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteRefTargetCIQ xcreateCIQ() {
        WhiteRefTargetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteRefTargetCIQ xnewCIQ() {
        return new WhiteRefTargetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_REF_TARGET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteRefTargetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteRefTargetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _refTargetId;
    public ConditionValue getRefTargetId()
    { if (_refTargetId == null) { _refTargetId = nCV(); }
      return _refTargetId; }
    protected ConditionValue getCValueRefTargetId() { return getRefTargetId(); }

    /** 
     * Add order-by as ascend. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_RefTargetId_Asc() { regOBA("REF_TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_RefTargetId_Desc() { regOBD("REF_TARGET_ID"); return this; }

    protected ConditionValue _targetId;
    public ConditionValue getTargetId()
    { if (_targetId == null) { _targetId = nCV(); }
      return _targetId; }
    protected ConditionValue getCValueTargetId() { return getTargetId(); }

    public Map<String, WhiteTargetCQ> getTargetId_InScopeRelation_WhiteTarget() { return xgetSQueMap("targetId_InScopeRelation_WhiteTarget"); }
    public String keepTargetId_InScopeRelation_WhiteTarget(WhiteTargetCQ sq) { return xkeepSQue("targetId_InScopeRelation_WhiteTarget", sq); }

    public Map<String, WhiteTargetCQ> getTargetId_NotInScopeRelation_WhiteTarget() { return xgetSQueMap("targetId_NotInScopeRelation_WhiteTarget"); }
    public String keepTargetId_NotInScopeRelation_WhiteTarget(WhiteTargetCQ sq) { return xkeepSQue("targetId_NotInScopeRelation_WhiteTarget", sq); }

    /** 
     * Add order-by as ascend. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_TargetId_Asc() { regOBA("TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @return this. (NotNull)
     */
    public BsWhiteRefTargetCQ addOrderBy_TargetId_Desc() { regOBD("TARGET_ID"); return this; }

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
    public BsWhiteRefTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteRefTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteRefTargetCQ bq = (WhiteRefTargetCQ)bqs;
        WhiteRefTargetCQ uq = (WhiteRefTargetCQ)uqs;
        if (bq.hasConditionQueryWhiteTarget()) {
            uq.queryWhiteTarget().reflectRelationOnUnionQuery(bq.queryWhiteTarget(), uq.queryWhiteTarget());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteTargetCQ queryWhiteTarget() {
        return getConditionQueryWhiteTarget();
    }
    public WhiteTargetCQ getConditionQueryWhiteTarget() {
        String prop = "whiteTarget";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteTarget()); xsetupOuterJoinWhiteTarget(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteTargetCQ xcreateQueryWhiteTarget() {
        String nrp = xresolveNRP("WHITE_REF_TARGET", "whiteTarget"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteTargetCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteTarget", nrp);
    }
    protected void xsetupOuterJoinWhiteTarget() { xregOutJo("whiteTarget"); }
    public boolean hasConditionQueryWhiteTarget() { return xhasQueRlMap("whiteTarget"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteRefTargetCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteRefTargetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteRefTargetCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteRefTargetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteRefTargetCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteRefTargetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteRefTargetCQ> _myselfExistsMap;
    public Map<String, WhiteRefTargetCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteRefTargetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteRefTargetCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteRefTargetCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteRefTargetCB.class.getName(); }
    protected String xCQ() { return WhiteRefTargetCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
