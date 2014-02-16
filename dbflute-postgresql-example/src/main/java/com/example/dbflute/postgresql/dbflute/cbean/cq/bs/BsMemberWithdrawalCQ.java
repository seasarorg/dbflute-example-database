package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of member_withdrawal.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberWithdrawalCQ extends AbstractBsMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberWithdrawalCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from member_withdrawal) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberWithdrawalCIQ xcreateCIQ() {
        MemberWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberWithdrawalCIQ xnewCIQ() {
        return new MemberWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join member_withdrawal on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberCQ> _memberId_InScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return _memberId_InScopeRelation_MemberMap; }
    public String keepMemberId_InScopeRelation_Member(MemberCQ sq) {
        if (_memberId_InScopeRelation_MemberMap == null) { _memberId_InScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberMap.size() + 1);
        _memberId_InScopeRelation_MemberMap.put(ky, sq); return "memberId_InScopeRelation_Member." + ky;
    }

    protected Map<String, MemberCQ> _memberId_NotInScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return _memberId_NotInScopeRelation_MemberMap; }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ sq) {
        if (_memberId_NotInScopeRelation_MemberMap == null) { _memberId_NotInScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberMap.size() + 1);
        _memberId_NotInScopeRelation_MemberMap.put(ky, sq); return "memberId_NotInScopeRelation_Member." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * member_id: {PK, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * member_id: {PK, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue getWithdrawalReasonCode() {
        if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
        return _withdrawalReasonCode;
    }
    protected ConditionValue getCValueWithdrawalReasonCode() { return getWithdrawalReasonCode(); }

    protected Map<String, WithdrawalReasonCQ> _withdrawalReasonCode_InScopeRelation_WithdrawalReasonMap;
    public Map<String, WithdrawalReasonCQ> getWithdrawalReasonCode_InScopeRelation_WithdrawalReason() { return _withdrawalReasonCode_InScopeRelation_WithdrawalReasonMap; }
    public String keepWithdrawalReasonCode_InScopeRelation_WithdrawalReason(WithdrawalReasonCQ sq) {
        if (_withdrawalReasonCode_InScopeRelation_WithdrawalReasonMap == null) { _withdrawalReasonCode_InScopeRelation_WithdrawalReasonMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_InScopeRelation_WithdrawalReasonMap.size() + 1);
        _withdrawalReasonCode_InScopeRelation_WithdrawalReasonMap.put(ky, sq); return "withdrawalReasonCode_InScopeRelation_WithdrawalReason." + ky;
    }

    protected Map<String, WithdrawalReasonCQ> _withdrawalReasonCode_NotInScopeRelation_WithdrawalReasonMap;
    public Map<String, WithdrawalReasonCQ> getWithdrawalReasonCode_NotInScopeRelation_WithdrawalReason() { return _withdrawalReasonCode_NotInScopeRelation_WithdrawalReasonMap; }
    public String keepWithdrawalReasonCode_NotInScopeRelation_WithdrawalReason(WithdrawalReasonCQ sq) {
        if (_withdrawalReasonCode_NotInScopeRelation_WithdrawalReasonMap == null) { _withdrawalReasonCode_NotInScopeRelation_WithdrawalReasonMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_withdrawalReasonCode_NotInScopeRelation_WithdrawalReasonMap.size() + 1);
        _withdrawalReasonCode_NotInScopeRelation_WithdrawalReasonMap.put(ky, sq); return "withdrawalReasonCode_NotInScopeRelation_WithdrawalReason." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("withdrawal_reason_code"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("withdrawal_reason_code"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue getWithdrawalReasonInputText() {
        if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
        return _withdrawalReasonInputText;
    }
    protected ConditionValue getCValueWithdrawalReasonInputText() { return getWithdrawalReasonInputText(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("withdrawal_reason_input_text"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("withdrawal_reason_input_text"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue getWithdrawalDatetime() {
        if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
        return _withdrawalDatetime;
    }
    protected ConditionValue getCValueWithdrawalDatetime() { return getWithdrawalDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("withdrawal_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("withdrawal_datetime"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess() {
        if (_registerProcess == null) { _registerProcess = nCV(); }
        return _registerProcess;
    }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess() {
        if (_updateProcess == null) { _updateProcess = nCV(); }
        return _updateProcess;
    }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberWithdrawalCQ bq = (MemberWithdrawalCQ)bqs;
        MemberWithdrawalCQ uq = (MemberWithdrawalCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryWithdrawalReason()) {
            uq.queryWithdrawalReason().reflectRelationOnUnionQuery(bq.queryWithdrawalReason(), uq.queryWithdrawalReason());
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
    protected MemberCQ _conditionQueryMember;
    public MemberCQ getConditionQueryMember() {
        if (_conditionQueryMember == null) {
            _conditionQueryMember = xcreateQueryMember();
            xsetupOuterJoinMember();
        }
        return _conditionQueryMember;
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = resolveNextRelationPath("member_withdrawal", "member");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberCQ cq = new MemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("member");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMember() {
        MemberCQ cq = getConditionQueryMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("member_id", "member_id");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    public boolean hasConditionQueryMember() {
        return _conditionQueryMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     * @return The instance of condition-query. (NotNull)
     */
    public WithdrawalReasonCQ queryWithdrawalReason() {
        return getConditionQueryWithdrawalReason();
    }
    protected WithdrawalReasonCQ _conditionQueryWithdrawalReason;
    public WithdrawalReasonCQ getConditionQueryWithdrawalReason() {
        if (_conditionQueryWithdrawalReason == null) {
            _conditionQueryWithdrawalReason = xcreateQueryWithdrawalReason();
            xsetupOuterJoinWithdrawalReason();
        }
        return _conditionQueryWithdrawalReason;
    }
    protected WithdrawalReasonCQ xcreateQueryWithdrawalReason() {
        String nrp = resolveNextRelationPath("member_withdrawal", "withdrawalReason");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WithdrawalReasonCQ cq = new WithdrawalReasonCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("withdrawalReason");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWithdrawalReason() {
        WithdrawalReasonCQ cq = getConditionQueryWithdrawalReason();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("withdrawal_reason_code", "withdrawal_reason_code");
        registerOuterJoin(cq, joinOnMap, "withdrawalReason");
    }
    public boolean hasConditionQueryWithdrawalReason() {
        return _conditionQueryWithdrawalReason != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberWithdrawalCQ> _scalarConditionMap;
    public Map<String, MemberWithdrawalCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberWithdrawalCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberWithdrawalCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberWithdrawalCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberWithdrawalCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MemberWithdrawalCQ> _queryMyselfDerivedMap;
    public Map<String, MemberWithdrawalCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberWithdrawalCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberWithdrawalCQ> _myselfExistsMap;
    public Map<String, MemberWithdrawalCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberWithdrawalCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberWithdrawalCQ> _myselfInScopeMap;
    public Map<String, MemberWithdrawalCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberWithdrawalCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberWithdrawalCB.class.getName(); }
    protected String xCQ() { return MemberWithdrawalCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
