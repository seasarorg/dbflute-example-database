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
 * The base condition-query of SYNONYM_EXCEPT.
 * @author oracleman
 */
public class BsSynonymExceptCQ extends AbstractBsSynonymExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymExceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_EXCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymExceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymExceptCIQ xcreateCIQ() {
        SynonymExceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymExceptCIQ xnewCIQ() {
        return new SynonymExceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_EXCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymExceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymExceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _exceptId;
    public ConditionValue getExceptId()
    { if (_exceptId == null) { _exceptId = nCV(); }
      return _exceptId; }
    protected ConditionValue getCValueExceptId() { return getExceptId(); }

    public Map<String, SynonymRefExceptCQ> getExceptId_ExistsReferrer_SynonymRefExceptList() { return xgetSQueMap("exceptId_ExistsReferrer_SynonymRefExceptList"); }
    public String keepExceptId_ExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) { return xkeepSQue("exceptId_ExistsReferrer_SynonymRefExceptList", sq); }

    public Map<String, SynonymRefExceptCQ> getExceptId_NotExistsReferrer_SynonymRefExceptList() { return xgetSQueMap("exceptId_NotExistsReferrer_SynonymRefExceptList"); }
    public String keepExceptId_NotExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) { return xkeepSQue("exceptId_NotExistsReferrer_SynonymRefExceptList", sq); }

    public Map<String, SynonymRefExceptCQ> getExceptId_SpecifyDerivedReferrer_SynonymRefExceptList() { return xgetSQueMap("exceptId_SpecifyDerivedReferrer_SynonymRefExceptList"); }
    public String keepExceptId_SpecifyDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) { return xkeepSQue("exceptId_SpecifyDerivedReferrer_SynonymRefExceptList", sq); }

    public Map<String, SynonymRefExceptCQ> getExceptId_InScopeRelation_SynonymRefExceptList() { return xgetSQueMap("exceptId_InScopeRelation_SynonymRefExceptList"); }
    public String keepExceptId_InScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq) { return xkeepSQue("exceptId_InScopeRelation_SynonymRefExceptList", sq); }

    public Map<String, SynonymRefExceptCQ> getExceptId_NotInScopeRelation_SynonymRefExceptList() { return xgetSQueMap("exceptId_NotInScopeRelation_SynonymRefExceptList"); }
    public String keepExceptId_NotInScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq) { return xkeepSQue("exceptId_NotInScopeRelation_SynonymRefExceptList", sq); }

    public Map<String, SynonymRefExceptCQ> getExceptId_QueryDerivedReferrer_SynonymRefExceptList() { return xgetSQueMap("exceptId_QueryDerivedReferrer_SynonymRefExceptList"); }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq) { return xkeepSQue("exceptId_QueryDerivedReferrer_SynonymRefExceptList", sq); }
    public Map<String, Object> getExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter() { return xgetSQuePmMap("exceptId_QueryDerivedReferrer_SynonymRefExceptList"); }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter(Object pm) { return xkeepSQuePm("exceptId_QueryDerivedReferrer_SynonymRefExceptList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptId_Asc() { regOBA("EXCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptId_Desc() { regOBD("EXCEPT_ID"); return this; }

    protected ConditionValue _exceptName;
    public ConditionValue getExceptName()
    { if (_exceptName == null) { _exceptName = nCV(); }
      return _exceptName; }
    protected ConditionValue getCValueExceptName() { return getExceptName(); }

    /** 
     * Add order-by as ascend. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptName_Asc() { regOBA("EXCEPT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @return this. (NotNull)
     */
    public BsSynonymExceptCQ addOrderBy_ExceptName_Desc() { regOBD("EXCEPT_NAME"); return this; }

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
    public BsSynonymExceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSynonymExceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, SynonymExceptCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SynonymExceptCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SynonymExceptCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SynonymExceptCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SynonymExceptCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SynonymExceptCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SynonymExceptCQ> _myselfExistsMap;
    public Map<String, SynonymExceptCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SynonymExceptCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SynonymExceptCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SynonymExceptCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymExceptCB.class.getName(); }
    protected String xCQ() { return SynonymExceptCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
