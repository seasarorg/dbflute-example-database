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
    public BsAliasRefExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
    public ConditionValue getRefExceptId()
    { if (_refExceptId == null) { _refExceptId = nCV(); }
      return _refExceptId; }
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
    public ConditionValue getExceptId()
    { if (_exceptId == null) { _exceptId = nCV(); }
      return _exceptId; }
    protected ConditionValue getCValueExceptId() { return getExceptId(); }

    public Map<String, AliasExceptCQ> getExceptId_InScopeRelation_AliasExcept() { return xgetSQueMap("exceptId_InScopeRelation_AliasExcept"); }
    public String keepExceptId_InScopeRelation_AliasExcept(AliasExceptCQ sq) { return xkeepSQue("exceptId_InScopeRelation_AliasExcept", sq); }

    public Map<String, AliasExceptCQ> getExceptId_NotInScopeRelation_AliasExcept() { return xgetSQueMap("exceptId_NotInScopeRelation_AliasExcept"); }
    public String keepExceptId_NotInScopeRelation_AliasExcept(AliasExceptCQ sq) { return xkeepSQue("exceptId_NotInScopeRelation_AliasExcept", sq); }

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
    public BsAliasRefExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAliasRefExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    public AliasExceptCQ getConditionQueryAliasExcept() {
        String prop = "aliasExcept";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAliasExcept()); xsetupOuterJoinAliasExcept(); }
        return xgetQueRlMap(prop);
    }
    protected AliasExceptCQ xcreateQueryAliasExcept() {
        String nrp = xresolveNRP("ALIAS_REF_EXCEPT", "aliasExcept"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AliasExceptCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "aliasExcept", nrp);
    }
    protected void xsetupOuterJoinAliasExcept() { xregOutJo("aliasExcept"); }
    public boolean hasConditionQueryAliasExcept() { return xhasQueRlMap("aliasExcept"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AliasRefExceptCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AliasRefExceptCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AliasRefExceptCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AliasRefExceptCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AliasRefExceptCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AliasRefExceptCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AliasRefExceptCQ> _myselfExistsMap;
    public Map<String, AliasRefExceptCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AliasRefExceptCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AliasRefExceptCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AliasRefExceptCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AliasRefExceptCB.class.getName(); }
    protected String xCQ() { return AliasRefExceptCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
