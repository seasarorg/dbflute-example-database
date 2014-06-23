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
 * The base condition-query of member_security.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberSecurityCQ extends AbstractBsMemberSecurityCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberSecurityCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberSecurityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from member_security) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberSecurityCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberSecurityCIQ xcreateCIQ() {
        MemberSecurityCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberSecurityCIQ xnewCIQ() {
        return new MemberSecurityCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join member_security on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberSecurityCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberSecurityCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return xgetSQueMap("memberId_InScopeRelation_Member"); }
    public String keepMemberId_InScopeRelation_Member(MemberCQ sq) { return xkeepSQue("memberId_InScopeRelation_Member", sq); }

    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return xgetSQueMap("memberId_NotInScopeRelation_Member"); }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_Member", sq); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)member_id: {PK, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)member_id: {PK, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _loginPassword;
    public ConditionValue getLoginPassword()
    { if (_loginPassword == null) { _loginPassword = nCV(); }
      return _loginPassword; }
    protected ConditionValue getCValueLoginPassword() { return getLoginPassword(); }

    /** 
     * Add order-by as ascend. <br />
     * (ログインパスワード)login_password: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_LoginPassword_Asc() { regOBA("login_password"); return this; }

    /**
     * Add order-by as descend. <br />
     * (ログインパスワード)login_password: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_LoginPassword_Desc() { regOBD("login_password"); return this; }

    protected ConditionValue _reminderQuestion;
    public ConditionValue getReminderQuestion()
    { if (_reminderQuestion == null) { _reminderQuestion = nCV(); }
      return _reminderQuestion; }
    protected ConditionValue getCValueReminderQuestion() { return getReminderQuestion(); }

    /** 
     * Add order-by as ascend. <br />
     * (リマインダ質問)reminder_question: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_ReminderQuestion_Asc() { regOBA("reminder_question"); return this; }

    /**
     * Add order-by as descend. <br />
     * (リマインダ質問)reminder_question: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_ReminderQuestion_Desc() { regOBD("reminder_question"); return this; }

    protected ConditionValue _reminderAnswer;
    public ConditionValue getReminderAnswer()
    { if (_reminderAnswer == null) { _reminderAnswer = nCV(); }
      return _reminderAnswer; }
    protected ConditionValue getCValueReminderAnswer() { return getReminderAnswer(); }

    /** 
     * Add order-by as ascend. <br />
     * (リマインダ回答)reminder_answer: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_ReminderAnswer_Asc() { regOBA("reminder_answer"); return this; }

    /**
     * Add order-by as descend. <br />
     * (リマインダ回答)reminder_answer: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_ReminderAnswer_Desc() { regOBD("reminder_answer"); return this; }

    protected ConditionValue _reminderUseCount;
    public ConditionValue getReminderUseCount()
    { if (_reminderUseCount == null) { _reminderUseCount = nCV(); }
      return _reminderUseCount; }
    protected ConditionValue getCValueReminderUseCount() { return getReminderUseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (リマインダ利用回数)reminder_use_count: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_ReminderUseCount_Asc() { regOBA("reminder_use_count"); return this; }

    /**
     * Add order-by as descend. <br />
     * (リマインダ利用回数)reminder_use_count: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_ReminderUseCount_Desc() { regOBD("reminder_use_count"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsMemberSecurityCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsMemberSecurityCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberSecurityCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberSecurityCQ bq = (MemberSecurityCQ)bqs;
        MemberSecurityCQ uq = (MemberSecurityCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)member by my member_id, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    public MemberCQ getConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("member_security", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberSecurityCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberSecurityCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberSecurityCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberSecurityCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberSecurityCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberSecurityCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberSecurityCQ> _myselfExistsMap;
    public Map<String, MemberSecurityCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberSecurityCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberSecurityCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberSecurityCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberSecurityCB.class.getName(); }
    protected String xCQ() { return MemberSecurityCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
