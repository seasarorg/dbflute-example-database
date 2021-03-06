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
    public BsWhiteRefNextTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_REF_NEXT_TARGET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
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
    public ConditionValue getRefNextTargetId()
    { if (_refNextTargetId == null) { _refNextTargetId = nCV(); }
      return _refNextTargetId; }
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
    public ConditionValue getNextTargetCode()
    { if (_nextTargetCode == null) { _nextTargetCode = nCV(); }
      return _nextTargetCode; }
    protected ConditionValue getCValueNextTargetCode() { return getNextTargetCode(); }

    public Map<String, NextSchemaProductStatusCQ> getNextTargetCode_InScopeRelation_NextSchemaProductStatus() { return xgetSQueMap("nextTargetCode_InScopeRelation_NextSchemaProductStatus"); }
    public String keepNextTargetCode_InScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq) { return xkeepSQue("nextTargetCode_InScopeRelation_NextSchemaProductStatus", sq); }

    public Map<String, NextSchemaProductStatusCQ> getNextTargetCode_NotInScopeRelation_NextSchemaProductStatus() { return xgetSQueMap("nextTargetCode_NotInScopeRelation_NextSchemaProductStatus"); }
    public String keepNextTargetCode_NotInScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq) { return xkeepSQue("nextTargetCode_NotInScopeRelation_NextSchemaProductStatus", sq); }

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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteRefNextTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteRefNextTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    public NextSchemaProductStatusCQ getConditionQueryNextSchemaProductStatus() {
        String prop = "nextSchemaProductStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryNextSchemaProductStatus()); xsetupOuterJoinNextSchemaProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected NextSchemaProductStatusCQ xcreateQueryNextSchemaProductStatus() {
        String nrp = xresolveNRP("WHITE_REF_NEXT_TARGET", "nextSchemaProductStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new NextSchemaProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "nextSchemaProductStatus", nrp);
    }
    protected void xsetupOuterJoinNextSchemaProductStatus() { xregOutJo("nextSchemaProductStatus"); }
    public boolean hasConditionQueryNextSchemaProductStatus() { return xhasQueRlMap("nextSchemaProductStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteRefNextTargetCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteRefNextTargetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteRefNextTargetCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteRefNextTargetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteRefNextTargetCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteRefNextTargetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteRefNextTargetCQ> _myselfExistsMap;
    public Map<String, WhiteRefNextTargetCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteRefNextTargetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteRefNextTargetCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteRefNextTargetCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteRefNextTargetCB.class.getName(); }
    protected String xCQ() { return WhiteRefNextTargetCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
