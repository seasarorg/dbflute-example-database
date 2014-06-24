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
 * The base condition-query of SYNONYM_NEXT_LINK_SECRET.
 * @author oracleman
 */
public class BsSynonymNextLinkSecretCQ extends AbstractBsSynonymNextLinkSecretCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextLinkSecretCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymNextLinkSecretCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_NEXT_LINK_SECRET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymNextLinkSecretCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymNextLinkSecretCIQ xcreateCIQ() {
        SynonymNextLinkSecretCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymNextLinkSecretCIQ xnewCIQ() {
        return new SynonymNextLinkSecretCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_NEXT_LINK_SECRET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymNextLinkSecretCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymNextLinkSecretCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _secretCode;
    public ConditionValue getSecretCode()
    { if (_secretCode == null) { _secretCode = nCV(); }
      return _secretCode; }
    protected ConditionValue getCValueSecretCode() { return getSecretCode(); }

    /** 
     * Add order-by as ascend. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSecretCQ addOrderBy_SecretCode_Asc() { regOBA("SECRET_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSecretCQ addOrderBy_SecretCode_Desc() { regOBD("SECRET_CODE"); return this; }

    protected ConditionValue _secretName;
    public ConditionValue getSecretName()
    { if (_secretName == null) { _secretName = nCV(); }
      return _secretName; }
    protected ConditionValue getCValueSecretName() { return getSecretName(); }

    /** 
     * Add order-by as ascend. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSecretCQ addOrderBy_SecretName_Asc() { regOBA("SECRET_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSecretCQ addOrderBy_SecretName_Desc() { regOBD("SECRET_NAME"); return this; }

    protected ConditionValue _secretAuthCode;
    public ConditionValue getSecretAuthCode()
    { if (_secretAuthCode == null) { _secretAuthCode = nCV(); }
      return _secretAuthCode; }
    protected ConditionValue getCValueSecretAuthCode() { return getSecretAuthCode(); }

    /** 
     * Add order-by as ascend. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSecretCQ addOrderBy_SecretAuthCode_Asc() { regOBA("SECRET_AUTH_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSecretCQ addOrderBy_SecretAuthCode_Desc() { regOBD("SECRET_AUTH_CODE"); return this; }

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
    public BsSynonymNextLinkSecretCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSynonymNextLinkSecretCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, SynonymNextLinkSecretCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SynonymNextLinkSecretCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SynonymNextLinkSecretCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SynonymNextLinkSecretCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SynonymNextLinkSecretCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SynonymNextLinkSecretCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SynonymNextLinkSecretCQ> _myselfExistsMap;
    public Map<String, SynonymNextLinkSecretCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SynonymNextLinkSecretCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SynonymNextLinkSecretCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SynonymNextLinkSecretCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymNextLinkSecretCB.class.getName(); }
    protected String xCQ() { return SynonymNextLinkSecretCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
