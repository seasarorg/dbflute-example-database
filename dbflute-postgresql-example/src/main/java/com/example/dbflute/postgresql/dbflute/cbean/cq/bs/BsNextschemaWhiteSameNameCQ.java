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
 * The base condition-query of nextschema.white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class BsNextschemaWhiteSameNameCQ extends AbstractBsNextschemaWhiteSameNameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextschemaWhiteSameNameCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextschemaWhiteSameNameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from nextschema.white_same_name) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextschemaWhiteSameNameCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextschemaWhiteSameNameCIQ xcreateCIQ() {
        NextschemaWhiteSameNameCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextschemaWhiteSameNameCIQ xnewCIQ() {
        return new NextschemaWhiteSameNameCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join nextschema.white_same_name on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextschemaWhiteSameNameCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextschemaWhiteSameNameCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sameNameId;
    public ConditionValue getSameNameId()
    { if (_sameNameId == null) { _sameNameId = nCV(); }
      return _sameNameId; }
    protected ConditionValue getCValueSameNameId() { return getSameNameId(); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_ExistsReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_ExistsReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_ExistsReferrer_WhiteSameNameRefList", sq); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_NotExistsReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_NotExistsReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_NotExistsReferrer_WhiteSameNameRefList", sq); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList", sq); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_InScopeRelation_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_InScopeRelation_WhiteSameNameRefList"); }
    public String keepSameNameId_InScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_InScopeRelation_WhiteSameNameRefList", sq); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_NotInScopeRelation_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_NotInScopeRelation_WhiteSameNameRefList"); }
    public String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_NotInScopeRelation_WhiteSameNameRefList", sq); }

    public Map<String, NextschemaWhiteSameNameRefCQ> getSameNameId_QueryDerivedReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList", sq); }
    public Map<String, Object> getSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter() { return xgetSQuePmMap("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object pm) { return xkeepSQuePm("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _sameNameName;
    public ConditionValue getSameNameName()
    { if (_sameNameName == null) { _sameNameName = nCV(); }
      return _sameNameName; }
    protected ConditionValue getCValueSameNameName() { return getSameNameName(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameName_Asc() { regOBA("same_name_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameName_Desc() { regOBD("same_name_name"); return this; }

    protected ConditionValue _sameNameLong;
    public ConditionValue getSameNameLong()
    { if (_sameNameLong == null) { _sameNameLong = nCV(); }
      return _sameNameLong; }
    protected ConditionValue getCValueSameNameLong() { return getSameNameLong(); }

    /** 
     * Add order-by as ascend. <br />
     * same_name_long: {int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameLong_Asc() { regOBA("same_name_long"); return this; }

    /**
     * Add order-by as descend. <br />
     * same_name_long: {int8(19)}
     * @return this. (NotNull)
     */
    public BsNextschemaWhiteSameNameCQ addOrderBy_SameNameLong_Desc() { regOBD("same_name_long"); return this; }

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
    public BsNextschemaWhiteSameNameCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsNextschemaWhiteSameNameCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, NextschemaWhiteSameNameCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, NextschemaWhiteSameNameCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, NextschemaWhiteSameNameCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, NextschemaWhiteSameNameCQ> _myselfExistsMap;
    public Map<String, NextschemaWhiteSameNameCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, NextschemaWhiteSameNameCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(NextschemaWhiteSameNameCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextschemaWhiteSameNameCB.class.getName(); }
    protected String xCQ() { return NextschemaWhiteSameNameCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
