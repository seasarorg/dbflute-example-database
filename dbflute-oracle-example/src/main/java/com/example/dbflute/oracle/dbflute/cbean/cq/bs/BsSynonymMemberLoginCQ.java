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
 * The base condition-query of SYNONYM_MEMBER_LOGIN.
 * @author oracleman
 */
public class BsSynonymMemberLoginCQ extends AbstractBsSynonymMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberLoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_MEMBER_LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymMemberLoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymMemberLoginCIQ xcreateCIQ() {
        SynonymMemberLoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymMemberLoginCIQ xnewCIQ() {
        return new SynonymMemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_MEMBER_LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymMemberLoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymMemberLoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberLoginId;
    public ConditionValue getMemberLoginId()
    { if (_memberLoginId == null) { _memberLoginId = nCV(); }
      return _memberLoginId; }
    protected ConditionValue getCValueMemberLoginId() { return getMemberLoginId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberLoginId_Asc() { regOBA("MEMBER_LOGIN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberLoginId_Desc() { regOBD("MEMBER_LOGIN_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, MemberVendorSynonymCQ> getMemberId_InScopeRelation_MemberVendorSynonym() { return xgetSQueMap("memberId_InScopeRelation_MemberVendorSynonym"); }
    public String keepMemberId_InScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ sq) { return xkeepSQue("memberId_InScopeRelation_MemberVendorSynonym", sq); }

    public Map<String, MemberVendorSynonymCQ> getMemberId_NotInScopeRelation_MemberVendorSynonym() { return xgetSQueMap("memberId_NotInScopeRelation_MemberVendorSynonym"); }
    public String keepMemberId_NotInScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_MemberVendorSynonym", sq); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _loginDatetime;
    public ConditionValue getLoginDatetime()
    { if (_loginDatetime == null) { _loginDatetime = nCV(); }
      return _loginDatetime; }
    protected ConditionValue getCValueLoginDatetime() { return getLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_DATETIME: {+UQ, IX, NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginDatetime_Asc() { regOBA("LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_DATETIME: {+UQ, IX, NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginDatetime_Desc() { regOBD("LOGIN_DATETIME"); return this; }

    protected ConditionValue _mobileLoginFlg;
    public ConditionValue getMobileLoginFlg()
    { if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
      return _mobileLoginFlg; }
    protected ConditionValue getCValueMobileLoginFlg() { return getMobileLoginFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MobileLoginFlg_Asc() { regOBA("MOBILE_LOGIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MobileLoginFlg_Desc() { regOBD("MOBILE_LOGIN_FLG"); return this; }

    protected ConditionValue _loginMemberStatusCode;
    public ConditionValue getLoginMemberStatusCode()
    { if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
      return _loginMemberStatusCode; }
    protected ConditionValue getCValueLoginMemberStatusCode() { return getLoginMemberStatusCode(); }

    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_InScopeRelation_MemberStatus() { return xgetSQueMap("loginMemberStatusCode_InScopeRelation_MemberStatus"); }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq) { return xkeepSQue("loginMemberStatusCode_InScopeRelation_MemberStatus", sq); }

    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_NotInScopeRelation_MemberStatus() { return xgetSQueMap("loginMemberStatusCode_NotInScopeRelation_MemberStatus"); }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq) { return xkeepSQue("loginMemberStatusCode_NotInScopeRelation_MemberStatus", sq); }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginMemberStatusCode_Asc() { regOBA("LOGIN_MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginMemberStatusCode_Desc() { regOBD("LOGIN_MEMBER_STATUS_CODE"); return this; }

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
    public BsSynonymMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSynonymMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SynonymMemberLoginCQ bq = (SynonymMemberLoginCQ)bqs;
        SynonymMemberLoginCQ uq = (SynonymMemberLoginCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberVendorSynonym()) {
            uq.queryMemberVendorSynonym().reflectRelationOnUnionQuery(bq.queryMemberVendorSynonym(), uq.queryMemberVendorSynonym());
        }
        if (bq.hasConditionQuerySynonymMember()) {
            uq.querySynonymMember().reflectRelationOnUnionQuery(bq.querySynonymMember(), uq.querySynonymMember());
        }
        if (bq.hasConditionQueryVendorSynonymMember()) {
            uq.queryVendorSynonymMember().reflectRelationOnUnionQuery(bq.queryVendorSynonymMember(), uq.queryVendorSynonymMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    public MemberStatusCQ getConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_LOGIN", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberVendorSynonymCQ queryMemberVendorSynonym() {
        return getConditionQueryMemberVendorSynonym();
    }
    public MemberVendorSynonymCQ getConditionQueryMemberVendorSynonym() {
        String prop = "memberVendorSynonym";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberVendorSynonym()); xsetupOuterJoinMemberVendorSynonym(); }
        return xgetQueRlMap(prop);
    }
    protected MemberVendorSynonymCQ xcreateQueryMemberVendorSynonym() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_LOGIN", "memberVendorSynonym"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberVendorSynonymCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberVendorSynonym", nrp);
    }
    protected void xsetupOuterJoinMemberVendorSynonym() { xregOutJo("memberVendorSynonym"); }
    public boolean hasConditionQueryMemberVendorSynonym() { return xhasQueRlMap("memberVendorSynonym"); }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymMemberCQ querySynonymMember() {
        return getConditionQuerySynonymMember();
    }
    public SynonymMemberCQ getConditionQuerySynonymMember() {
        String prop = "synonymMember";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySynonymMember()); xsetupOuterJoinSynonymMember(); }
        return xgetQueRlMap(prop);
    }
    protected SynonymMemberCQ xcreateQuerySynonymMember() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_LOGIN", "synonymMember"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SynonymMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "synonymMember", nrp);
    }
    protected void xsetupOuterJoinSynonymMember() { xregOutJo("synonymMember"); }
    public boolean hasConditionQuerySynonymMember() { return xhasQueRlMap("synonymMember"); }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorSynonymMemberCQ queryVendorSynonymMember() {
        return getConditionQueryVendorSynonymMember();
    }
    public VendorSynonymMemberCQ getConditionQueryVendorSynonymMember() {
        String prop = "vendorSynonymMember";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorSynonymMember()); xsetupOuterJoinVendorSynonymMember(); }
        return xgetQueRlMap(prop);
    }
    protected VendorSynonymMemberCQ xcreateQueryVendorSynonymMember() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_LOGIN", "vendorSynonymMember"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorSynonymMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorSynonymMember", nrp);
    }
    protected void xsetupOuterJoinVendorSynonymMember() { xregOutJo("vendorSynonymMember"); }
    public boolean hasConditionQueryVendorSynonymMember() { return xhasQueRlMap("vendorSynonymMember"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SynonymMemberLoginCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SynonymMemberLoginCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SynonymMemberLoginCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SynonymMemberLoginCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SynonymMemberLoginCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SynonymMemberLoginCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SynonymMemberLoginCQ> _myselfExistsMap;
    public Map<String, SynonymMemberLoginCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SynonymMemberLoginCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SynonymMemberLoginCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SynonymMemberLoginCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymMemberLoginCB.class.getName(); }
    protected String xCQ() { return SynonymMemberLoginCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
