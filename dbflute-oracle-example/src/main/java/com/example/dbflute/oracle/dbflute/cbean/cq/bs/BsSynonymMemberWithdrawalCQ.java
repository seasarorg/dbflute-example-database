package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of SYNONYM_MEMBER_WITHDRAWAL.
 * @author oracleman
 */
public class BsSynonymMemberWithdrawalCQ extends AbstractBsSynonymMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberWithdrawalCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_MEMBER_WITHDRAWAL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymMemberWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymMemberWithdrawalCIQ xcreateCIQ() {
        SynonymMemberWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymMemberWithdrawalCIQ xnewCIQ() {
        return new SynonymMemberWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_MEMBER_WITHDRAWAL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymMemberWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymMemberWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, MemberVendorSynonymCQ> _memberId_InScopeRelation_MemberVendorSynonymMap;
    public Map<String, MemberVendorSynonymCQ> getMemberId_InScopeRelation_MemberVendorSynonym() { return _memberId_InScopeRelation_MemberVendorSynonymMap; }
    public String keepMemberId_InScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ sq) {
        if (_memberId_InScopeRelation_MemberVendorSynonymMap == null) { _memberId_InScopeRelation_MemberVendorSynonymMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberVendorSynonymMap.size() + 1);
        _memberId_InScopeRelation_MemberVendorSynonymMap.put(ky, sq); return "memberId_InScopeRelation_MemberVendorSynonym." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberId_NotInScopeRelation_MemberVendorSynonymMap;
    public Map<String, MemberVendorSynonymCQ> getMemberId_NotInScopeRelation_MemberVendorSynonym() { return _memberId_NotInScopeRelation_MemberVendorSynonymMap; }
    public String keepMemberId_NotInScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ sq) {
        if (_memberId_NotInScopeRelation_MemberVendorSynonymMap == null) { _memberId_NotInScopeRelation_MemberVendorSynonymMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberVendorSynonymMap.size() + 1);
        _memberId_NotInScopeRelation_MemberVendorSynonymMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberVendorSynonym." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

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
     * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue getWithdrawalReasonInputText() {
        if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
        return _withdrawalReasonInputText;
    }
    protected ConditionValue getCValueWithdrawalReasonInputText() { return getWithdrawalReasonInputText(); }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue getWithdrawalDatetime() {
        if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
        return _withdrawalDatetime;
    }
    protected ConditionValue getCValueWithdrawalDatetime() { return getWithdrawalDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("WITHDRAWAL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("WITHDRAWAL_DATETIME"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess() {
        if (_registerProcess == null) { _registerProcess = nCV(); }
        return _registerProcess;
    }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess() {
        if (_updateProcess == null) { _updateProcess = nCV(); }
        return _updateProcess;
    }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsSynonymMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSynonymMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SynonymMemberWithdrawalCQ bq = (SynonymMemberWithdrawalCQ)bqs;
        SynonymMemberWithdrawalCQ uq = (SynonymMemberWithdrawalCQ)uqs;
        if (bq.hasConditionQueryMemberVendorSynonym()) {
            uq.queryMemberVendorSynonym().reflectRelationOnUnionQuery(bq.queryMemberVendorSynonym(), uq.queryMemberVendorSynonym());
        }
        if (bq.hasConditionQueryWithdrawalReason()) {
            uq.queryWithdrawalReason().reflectRelationOnUnionQuery(bq.queryWithdrawalReason(), uq.queryWithdrawalReason());
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
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberVendorSynonymCQ queryMemberVendorSynonym() {
        return getConditionQueryMemberVendorSynonym();
    }
    protected MemberVendorSynonymCQ _conditionQueryMemberVendorSynonym;
    public MemberVendorSynonymCQ getConditionQueryMemberVendorSynonym() {
        if (_conditionQueryMemberVendorSynonym == null) {
            _conditionQueryMemberVendorSynonym = xcreateQueryMemberVendorSynonym();
            xsetupOuterJoinMemberVendorSynonym();
        }
        return _conditionQueryMemberVendorSynonym;
    }
    protected MemberVendorSynonymCQ xcreateQueryMemberVendorSynonym() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_WITHDRAWAL", "memberVendorSynonym");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberVendorSynonymCQ cq = new MemberVendorSynonymCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberVendorSynonym");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberVendorSynonym() {
        MemberVendorSynonymCQ cq = getConditionQueryMemberVendorSynonym();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberVendorSynonym");
    }
    public boolean hasConditionQueryMemberVendorSynonym() {
        return _conditionQueryMemberVendorSynonym != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
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
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_WITHDRAWAL", "withdrawalReason");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WithdrawalReasonCQ cq = new WithdrawalReasonCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("withdrawalReason");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWithdrawalReason() {
        WithdrawalReasonCQ cq = getConditionQueryWithdrawalReason();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE");
        registerOuterJoin(cq, joinOnMap, "withdrawalReason");
    }
    public boolean hasConditionQueryWithdrawalReason() {
        return _conditionQueryWithdrawalReason != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymMemberCQ querySynonymMember() {
        return getConditionQuerySynonymMember();
    }
    protected SynonymMemberCQ _conditionQuerySynonymMember;
    public SynonymMemberCQ getConditionQuerySynonymMember() {
        if (_conditionQuerySynonymMember == null) {
            _conditionQuerySynonymMember = xcreateQuerySynonymMember();
            xsetupOuterJoinSynonymMember();
        }
        return _conditionQuerySynonymMember;
    }
    protected SynonymMemberCQ xcreateQuerySynonymMember() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_WITHDRAWAL", "synonymMember");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SynonymMemberCQ cq = new SynonymMemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("synonymMember");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSynonymMember() {
        SynonymMemberCQ cq = getConditionQuerySynonymMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "synonymMember");
    }
    public boolean hasConditionQuerySynonymMember() {
        return _conditionQuerySynonymMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorSynonymMemberCQ queryVendorSynonymMember() {
        return getConditionQueryVendorSynonymMember();
    }
    protected VendorSynonymMemberCQ _conditionQueryVendorSynonymMember;
    public VendorSynonymMemberCQ getConditionQueryVendorSynonymMember() {
        if (_conditionQueryVendorSynonymMember == null) {
            _conditionQueryVendorSynonymMember = xcreateQueryVendorSynonymMember();
            xsetupOuterJoinVendorSynonymMember();
        }
        return _conditionQueryVendorSynonymMember;
    }
    protected VendorSynonymMemberCQ xcreateQueryVendorSynonymMember() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_WITHDRAWAL", "vendorSynonymMember");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorSynonymMemberCQ cq = new VendorSynonymMemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorSynonymMember");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorSynonymMember() {
        VendorSynonymMemberCQ cq = getConditionQueryVendorSynonymMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "vendorSynonymMember");
    }
    public boolean hasConditionQueryVendorSynonymMember() {
        return _conditionQueryVendorSynonymMember != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, SynonymMemberWithdrawalCQ> _scalarConditionMap;
    public Map<String, SynonymMemberWithdrawalCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymMemberWithdrawalCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymMemberWithdrawalCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymMemberWithdrawalCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymMemberWithdrawalCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, SynonymMemberWithdrawalCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymMemberWithdrawalCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymMemberWithdrawalCQ sq) {
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
    protected Map<String, SynonymMemberWithdrawalCQ> _myselfExistsMap;
    public Map<String, SynonymMemberWithdrawalCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymMemberWithdrawalCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymMemberWithdrawalCQ> _myselfInScopeMap;
    public Map<String, SynonymMemberWithdrawalCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymMemberWithdrawalCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymMemberWithdrawalCB.class.getName(); }
    protected String xCQ() { return SynonymMemberWithdrawalCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
