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
 * The base condition-query of ALIAS_MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class BsAliasMemberCQ extends AbstractBsAliasMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AliasMemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAliasMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from ALIAS_MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AliasMemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AliasMemberCIQ xcreateCIQ() {
        AliasMemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AliasMemberCIQ xnewCIQ() {
        return new AliasMemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join ALIAS_MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AliasMemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AliasMemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, AliasMemberLoginCQ> getMemberId_ExistsReferrer_AliasMemberLoginList() { return xgetSQueMap("memberId_ExistsReferrer_AliasMemberLoginList"); }
    public String keepMemberId_ExistsReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq) { return xkeepSQue("memberId_ExistsReferrer_AliasMemberLoginList", sq); }

    public Map<String, AliasMemberLoginCQ> getMemberId_NotExistsReferrer_AliasMemberLoginList() { return xgetSQueMap("memberId_NotExistsReferrer_AliasMemberLoginList"); }
    public String keepMemberId_NotExistsReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_AliasMemberLoginList", sq); }

    public Map<String, AliasMemberLoginCQ> getMemberId_SpecifyDerivedReferrer_AliasMemberLoginList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_AliasMemberLoginList"); }
    public String keepMemberId_SpecifyDerivedReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_AliasMemberLoginList", sq); }

    public Map<String, AliasMemberLoginCQ> getMemberId_InScopeRelation_AliasMemberLoginList() { return xgetSQueMap("memberId_InScopeRelation_AliasMemberLoginList"); }
    public String keepMemberId_InScopeRelation_AliasMemberLoginList(AliasMemberLoginCQ sq) { return xkeepSQue("memberId_InScopeRelation_AliasMemberLoginList", sq); }

    public Map<String, AliasMemberLoginCQ> getMemberId_NotInScopeRelation_AliasMemberLoginList() { return xgetSQueMap("memberId_NotInScopeRelation_AliasMemberLoginList"); }
    public String keepMemberId_NotInScopeRelation_AliasMemberLoginList(AliasMemberLoginCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_AliasMemberLoginList", sq); }

    public Map<String, AliasMemberLoginCQ> getMemberId_QueryDerivedReferrer_AliasMemberLoginList() { return xgetSQueMap("memberId_QueryDerivedReferrer_AliasMemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_AliasMemberLoginList", sq); }
    public Map<String, Object> getMemberId_QueryDerivedReferrer_AliasMemberLoginListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_AliasMemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_AliasMemberLoginListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_AliasMemberLoginList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue getMemberAccount()
    { if (_memberAccount == null) { _memberAccount = nCV(); }
      return _memberAccount; }
    protected ConditionValue getCValueMemberAccount() { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    public Map<String, MemberStatusCQ> getMemberStatusCode_InScopeRelation_MemberStatus() { return xgetSQueMap("memberStatusCode_InScopeRelation_MemberStatus"); }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq) { return xkeepSQue("memberStatusCode_InScopeRelation_MemberStatus", sq); }

    public Map<String, MemberStatusCQ> getMemberStatusCode_NotInScopeRelation_MemberStatus() { return xgetSQueMap("memberStatusCode_NotInScopeRelation_MemberStatus"); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq) { return xkeepSQue("memberStatusCode_NotInScopeRelation_MemberStatus", sq); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue getFormalizedDatetime()
    { if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
      return _formalizedDatetime; }
    protected ConditionValue getCValueFormalizedDatetime() { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue getBirthdate()
    { if (_birthdate == null) { _birthdate = nCV(); }
      return _birthdate; }
    protected ConditionValue getCValueBirthdate() { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAliasMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsAliasMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAliasMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AliasMemberCQ bq = (AliasMemberCQ)bqs;
        AliasMemberCQ uq = (AliasMemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
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
        String nrp = xresolveNRP("ALIAS_MEMBER", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, AliasMemberCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AliasMemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AliasMemberCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AliasMemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AliasMemberCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AliasMemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AliasMemberCQ> _myselfExistsMap;
    public Map<String, AliasMemberCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AliasMemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AliasMemberCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AliasMemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AliasMemberCB.class.getName(); }
    protected String xCQ() { return AliasMemberCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
