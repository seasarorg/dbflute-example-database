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
    public ConditionValue getTargetId()
    { if (_targetId == null) { _targetId = nCV(); }
      return _targetId; }
    protected ConditionValue getCValueTargetId() { return getTargetId(); }

    public Map<String, WhiteRefTargetCQ> getTargetId_ExistsReferrer_WhiteRefTargetList() { return xgetSQueMap("targetId_ExistsReferrer_WhiteRefTargetList"); }
    public String keepTargetId_ExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) { return xkeepSQue("targetId_ExistsReferrer_WhiteRefTargetList", sq); }

    public Map<String, WhiteRefTargetCQ> getTargetId_NotExistsReferrer_WhiteRefTargetList() { return xgetSQueMap("targetId_NotExistsReferrer_WhiteRefTargetList"); }
    public String keepTargetId_NotExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) { return xkeepSQue("targetId_NotExistsReferrer_WhiteRefTargetList", sq); }

    public Map<String, WhiteRefTargetCQ> getTargetId_SpecifyDerivedReferrer_WhiteRefTargetList() { return xgetSQueMap("targetId_SpecifyDerivedReferrer_WhiteRefTargetList"); }
    public String keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) { return xkeepSQue("targetId_SpecifyDerivedReferrer_WhiteRefTargetList", sq); }

    public Map<String, WhiteRefTargetCQ> getTargetId_InScopeRelation_WhiteRefTargetList() { return xgetSQueMap("targetId_InScopeRelation_WhiteRefTargetList"); }
    public String keepTargetId_InScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ sq) { return xkeepSQue("targetId_InScopeRelation_WhiteRefTargetList", sq); }

    public Map<String, WhiteRefTargetCQ> getTargetId_NotInScopeRelation_WhiteRefTargetList() { return xgetSQueMap("targetId_NotInScopeRelation_WhiteRefTargetList"); }
    public String keepTargetId_NotInScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ sq) { return xkeepSQue("targetId_NotInScopeRelation_WhiteRefTargetList", sq); }

    public Map<String, WhiteRefTargetCQ> getTargetId_QueryDerivedReferrer_WhiteRefTargetList() { return xgetSQueMap("targetId_QueryDerivedReferrer_WhiteRefTargetList"); }
    public String keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq) { return xkeepSQue("targetId_QueryDerivedReferrer_WhiteRefTargetList", sq); }
    public Map<String, Object> getTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter() { return xgetSQuePmMap("targetId_QueryDerivedReferrer_WhiteRefTargetList"); }
    public String keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(Object pm) { return xkeepSQuePm("targetId_QueryDerivedReferrer_WhiteRefTargetList", pm); }

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
    public ConditionValue getTargetName()
    { if (_targetName == null) { _targetName = nCV(); }
      return _targetName; }
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
    public BsWhiteTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteTargetCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteTargetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteTargetCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteTargetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteTargetCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteTargetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteTargetCQ> _myselfExistsMap;
    public Map<String, WhiteTargetCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteTargetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteTargetCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteTargetCQ sq) { return xkeepSQue("myselfInScope", sq); }

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
