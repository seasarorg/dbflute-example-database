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
 * The base condition-query of nextschema.white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsNextschemaWhiteSameNameRefCQ extends AbstractBsNextschemaWhiteSameNameRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextschemaWhiteSameNameRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextschemaWhiteSameNameRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from nextschema.white_same_name_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextschemaWhiteSameNameRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextschemaWhiteSameNameRefCIQ xcreateCIQ() {
        NextschemaWhiteSameNameRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextschemaWhiteSameNameRefCIQ xnewCIQ() {
        return new NextschemaWhiteSameNameRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join nextschema.white_same_name_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextschemaWhiteSameNameRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextschemaWhiteSameNameRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameRefId_Asc() { regOBA("same_name_ref_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameRefId_Desc() { regOBD("same_name_ref_id"); return this; }

    protected ConditionValue _sameNameId;
    public ConditionValue getSameNameId()
    { if (_sameNameId == null) { _sameNameId = nCV(); }
      return _sameNameId; }
    protected ConditionValue getCValueSameNameId() { return getSameNameId(); }

    public Map<String, NextschemaWhiteSameNameCQ> getSameNameId_InScopeRelation_WhiteSameName() { return xgetSQueMap("sameNameId_InScopeRelation_WhiteSameName"); }
    public String keepSameNameId_InScopeRelation_WhiteSameName(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("sameNameId_InScopeRelation_WhiteSameName", sq); }

    public Map<String, NextschemaWhiteSameNameCQ> getSameNameId_NotInScopeRelation_WhiteSameName() { return xgetSQueMap("sameNameId_NotInScopeRelation_WhiteSameName"); }
    public String keepSameNameId_NotInScopeRelation_WhiteSameName(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("sameNameId_NotInScopeRelation_WhiteSameName", sq); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _nextRefDate;
    public ConditionValue getNextRefDate()
    { if (_nextRefDate == null) { _nextRefDate = nCV(); }
      return _nextRefDate; }
    protected ConditionValue getCValueNextRefDate() { return getNextRefDate(); }

    /** 
     * Add order-by as ascend. <br />
     * next_ref_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_NextRefDate_Asc() { regOBA("next_ref_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * next_ref_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameRefCQ addOrderBy_NextRefDate_Desc() { regOBD("next_ref_date"); return this; }

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
    public BsNextschemaWhiteSameNameRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsNextschemaWhiteSameNameRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        NextschemaWhiteSameNameRefCQ bq = (NextschemaWhiteSameNameRefCQ)bqs;
        NextschemaWhiteSameNameRefCQ uq = (NextschemaWhiteSameNameRefCQ)uqs;
        if (bq.hasConditionQueryWhiteSameName()) {
            uq.queryWhiteSameName().reflectRelationOnUnionQuery(bq.queryWhiteSameName(), uq.queryWhiteSameName());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The instance of condition-query. (NotNull)
     */
    public NextschemaWhiteSameNameCQ queryWhiteSameName() {
        return getConditionQueryWhiteSameName();
    }
    public NextschemaWhiteSameNameCQ getConditionQueryWhiteSameName() {
        String prop = "whiteSameName";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSameName()); xsetupOuterJoinWhiteSameName(); }
        return xgetQueRlMap(prop);
    }
    protected NextschemaWhiteSameNameCQ xcreateQueryWhiteSameName() {
        String nrp = xresolveNRP("nextschema.white_same_name_ref", "whiteSameName"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new NextschemaWhiteSameNameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSameName", nrp);
    }
    protected void xsetupOuterJoinWhiteSameName() { xregOutJo("whiteSameName"); }
    public boolean hasConditionQueryWhiteSameName() { return xhasQueRlMap("whiteSameName"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, NextschemaWhiteSameNameRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, NextschemaWhiteSameNameRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, NextschemaWhiteSameNameRefCQ> _myselfExistsMap;
    public Map<String, NextschemaWhiteSameNameRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, NextschemaWhiteSameNameRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextschemaWhiteSameNameRefCB.class.getName(); }
    protected String xCQ() { return NextschemaWhiteSameNameRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
