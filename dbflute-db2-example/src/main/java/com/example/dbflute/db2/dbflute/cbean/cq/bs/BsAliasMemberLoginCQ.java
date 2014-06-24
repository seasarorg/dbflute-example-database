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
 * The base condition-query of ALIAS_MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsAliasMemberLoginCQ extends AbstractBsAliasMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasMemberLoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAliasMemberLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from ALIAS_MEMBER_LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AliasMemberLoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AliasMemberLoginCIQ xcreateCIQ() {
        AliasMemberLoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AliasMemberLoginCIQ xnewCIQ() {
        return new AliasMemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join ALIAS_MEMBER_LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AliasMemberLoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AliasMemberLoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_MemberLoginId_Asc() { regOBA("MEMBER_LOGIN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_MemberLoginId_Desc() { regOBD("MEMBER_LOGIN_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, AliasMemberCQ> getMemberId_InScopeRelation_AliasMember() { return xgetSQueMap("memberId_InScopeRelation_AliasMember"); }
    public String keepMemberId_InScopeRelation_AliasMember(AliasMemberCQ sq) { return xkeepSQue("memberId_InScopeRelation_AliasMember", sq); }

    public Map<String, AliasMemberCQ> getMemberId_NotInScopeRelation_AliasMember() { return xgetSQueMap("memberId_NotInScopeRelation_AliasMember"); }
    public String keepMemberId_NotInScopeRelation_AliasMember(AliasMemberCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_AliasMember", sq); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INTEGER(10), FK to ALIAS_MEMBER}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INTEGER(10), FK to ALIAS_MEMBER}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _loginDatetime;
    public ConditionValue getLoginDatetime()
    { if (_loginDatetime == null) { _loginDatetime = nCV(); }
      return _loginDatetime; }
    protected ConditionValue getCValueLoginDatetime() { return getLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_LoginDatetime_Asc() { regOBA("LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_LoginDatetime_Desc() { regOBD("LOGIN_DATETIME"); return this; }

    protected ConditionValue _mobileLoginFlg;
    public ConditionValue getMobileLoginFlg()
    { if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
      return _mobileLoginFlg; }
    protected ConditionValue getCValueMobileLoginFlg() { return getMobileLoginFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_MobileLoginFlg_Asc() { regOBA("MOBILE_LOGIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_MobileLoginFlg_Desc() { regOBD("MOBILE_LOGIN_FLG"); return this; }

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
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_LoginMemberStatusCode_Asc() { regOBA("LOGIN_MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsAliasMemberLoginCQ addOrderBy_LoginMemberStatusCode_Desc() { regOBD("LOGIN_MEMBER_STATUS_CODE"); return this; }

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
    public BsAliasMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAliasMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AliasMemberLoginCQ bq = (AliasMemberLoginCQ)bqs;
        AliasMemberLoginCQ uq = (AliasMemberLoginCQ)uqs;
        if (bq.hasConditionQueryAliasMember()) {
            uq.queryAliasMember().reflectRelationOnUnionQuery(bq.queryAliasMember(), uq.queryAliasMember());
        }
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * ALIAS_MEMBER by my MEMBER_ID, named 'aliasMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public AliasMemberCQ queryAliasMember() {
        return getConditionQueryAliasMember();
    }
    public AliasMemberCQ getConditionQueryAliasMember() {
        String prop = "aliasMember";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAliasMember()); xsetupOuterJoinAliasMember(); }
        return xgetQueRlMap(prop);
    }
    protected AliasMemberCQ xcreateQueryAliasMember() {
        String nrp = xresolveNRP("ALIAS_MEMBER_LOGIN", "aliasMember"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AliasMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "aliasMember", nrp);
    }
    protected void xsetupOuterJoinAliasMember() { xregOutJo("aliasMember"); }
    public boolean hasConditionQueryAliasMember() { return xhasQueRlMap("aliasMember"); }

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
        String nrp = xresolveNRP("ALIAS_MEMBER_LOGIN", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AliasMemberLoginCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AliasMemberLoginCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AliasMemberLoginCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AliasMemberLoginCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AliasMemberLoginCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AliasMemberLoginCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AliasMemberLoginCQ> _myselfExistsMap;
    public Map<String, AliasMemberLoginCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AliasMemberLoginCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AliasMemberLoginCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AliasMemberLoginCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AliasMemberLoginCB.class.getName(); }
    protected String xCQ() { return AliasMemberLoginCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
