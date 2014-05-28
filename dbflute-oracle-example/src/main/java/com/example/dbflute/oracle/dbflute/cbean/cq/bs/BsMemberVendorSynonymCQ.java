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
 * The base condition-query of MEMBER_VENDOR_SYNONYM.
 * @author oracleman
 */
public class BsMemberVendorSynonymCQ extends AbstractBsMemberVendorSynonymCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberVendorSynonymCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberVendorSynonymCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_VENDOR_SYNONYM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberVendorSynonymCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberVendorSynonymCIQ xcreateCIQ() {
        MemberVendorSynonymCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberVendorSynonymCIQ xnewCIQ() {
        return new MemberVendorSynonymCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_VENDOR_SYNONYM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberVendorSynonymCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberVendorSynonymCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, SynonymMemberLoginCQ> _memberId_ExistsReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberId_ExistsReferrer_SynonymMemberLoginList() { return _memberId_ExistsReferrer_SynonymMemberLoginListMap; }
    public String keepMemberId_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberId_ExistsReferrer_SynonymMemberLoginListMap == null) { _memberId_ExistsReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberId_ExistsReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberId_ExistsReferrer_SynonymMemberLoginList." + ky;
    }

    protected Map<String, SynonymMemberWithdrawalCQ> _memberId_ExistsReferrer_SynonymMemberWithdrawalAsOneMap;
    public Map<String, SynonymMemberWithdrawalCQ> getMemberId_ExistsReferrer_SynonymMemberWithdrawalAsOne() { return _memberId_ExistsReferrer_SynonymMemberWithdrawalAsOneMap; }
    public String keepMemberId_ExistsReferrer_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq) {
        if (_memberId_ExistsReferrer_SynonymMemberWithdrawalAsOneMap == null) { _memberId_ExistsReferrer_SynonymMemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_SynonymMemberWithdrawalAsOneMap.size() + 1);
        _memberId_ExistsReferrer_SynonymMemberWithdrawalAsOneMap.put(ky, sq); return "memberId_ExistsReferrer_SynonymMemberWithdrawalAsOne." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberId_NotExistsReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberId_NotExistsReferrer_SynonymMemberLoginList() { return _memberId_NotExistsReferrer_SynonymMemberLoginListMap; }
    public String keepMemberId_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberId_NotExistsReferrer_SynonymMemberLoginListMap == null) { _memberId_NotExistsReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberId_NotExistsReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberId_NotExistsReferrer_SynonymMemberLoginList." + ky;
    }

    protected Map<String, SynonymMemberWithdrawalCQ> _memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOneMap;
    public Map<String, SynonymMemberWithdrawalCQ> getMemberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne() { return _memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOneMap; }
    public String keepMemberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq) {
        if (_memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOneMap == null) { _memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOneMap.put(ky, sq); return "memberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberId_SpecifyDerivedReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList() { return _memberId_SpecifyDerivedReferrer_SynonymMemberLoginListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_SynonymMemberLoginListMap == null) { _memberId_SpecifyDerivedReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_SynonymMemberLoginList." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberId_InScopeRelation_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberId_InScopeRelation_SynonymMemberLoginList() { return _memberId_InScopeRelation_SynonymMemberLoginListMap; }
    public String keepMemberId_InScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberId_InScopeRelation_SynonymMemberLoginListMap == null) { _memberId_InScopeRelation_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_SynonymMemberLoginListMap.size() + 1);
        _memberId_InScopeRelation_SynonymMemberLoginListMap.put(ky, sq); return "memberId_InScopeRelation_SynonymMemberLoginList." + ky;
    }

    protected Map<String, SynonymMemberWithdrawalCQ> _memberId_InScopeRelation_SynonymMemberWithdrawalAsOneMap;
    public Map<String, SynonymMemberWithdrawalCQ> getMemberId_InScopeRelation_SynonymMemberWithdrawalAsOne() { return _memberId_InScopeRelation_SynonymMemberWithdrawalAsOneMap; }
    public String keepMemberId_InScopeRelation_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq) {
        if (_memberId_InScopeRelation_SynonymMemberWithdrawalAsOneMap == null) { _memberId_InScopeRelation_SynonymMemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_SynonymMemberWithdrawalAsOneMap.size() + 1);
        _memberId_InScopeRelation_SynonymMemberWithdrawalAsOneMap.put(ky, sq); return "memberId_InScopeRelation_SynonymMemberWithdrawalAsOne." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberId_NotInScopeRelation_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberId_NotInScopeRelation_SynonymMemberLoginList() { return _memberId_NotInScopeRelation_SynonymMemberLoginListMap; }
    public String keepMemberId_NotInScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberId_NotInScopeRelation_SynonymMemberLoginListMap == null) { _memberId_NotInScopeRelation_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_SynonymMemberLoginListMap.size() + 1);
        _memberId_NotInScopeRelation_SynonymMemberLoginListMap.put(ky, sq); return "memberId_NotInScopeRelation_SynonymMemberLoginList." + ky;
    }

    protected Map<String, SynonymMemberWithdrawalCQ> _memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOneMap;
    public Map<String, SynonymMemberWithdrawalCQ> getMemberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne() { return _memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOneMap; }
    public String keepMemberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq) {
        if (_memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOneMap == null) { _memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOneMap.put(ky, sq); return "memberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberId_QueryDerivedReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberId_QueryDerivedReferrer_SynonymMemberLoginList() { return _memberId_QueryDerivedReferrer_SynonymMemberLoginListMap; }
    public String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberId_QueryDerivedReferrer_SynonymMemberLoginListMap == null) { _memberId_QueryDerivedReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberId_QueryDerivedReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_SynonymMemberLoginList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_SynonymMemberLoginListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter() { return _memberId_QueryDerivedReferrer_SynonymMemberLoginListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_SynonymMemberLoginListParameterMap == null) { _memberId_QueryDerivedReferrer_SynonymMemberLoginListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_SynonymMemberLoginListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_SynonymMemberLoginListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_SynonymMemberLoginListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName() {
        if (_memberName == null) { _memberName = nCV(); }
        return _memberName;
    }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue getMemberAccount() {
        if (_memberAccount == null) { _memberAccount = nCV(); }
        return _memberAccount;
    }
    protected ConditionValue getCValueMemberAccount() { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _memberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getMemberStatusCode_InScopeRelation_MemberStatus() { return _memberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberStatusMap == null) { _memberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberStatusMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberStatus." + ky;
    }

    protected Map<String, MemberStatusCQ> _memberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getMemberStatusCode_NotInScopeRelation_MemberStatus() { return _memberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _memberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberStatusMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberStatus." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue getFormalizedDatetime() {
        if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
        return _formalizedDatetime;
    }
    protected ConditionValue getCValueFormalizedDatetime() { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue getBirthdate() {
        if (_birthdate == null) { _birthdate = nCV(); }
        return _birthdate;
    }
    protected ConditionValue getCValueBirthdate() { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess() {
        if (_registerProcess == null) { _registerProcess = nCV(); }
        return _registerProcess;
    }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess() {
        if (_updateProcess == null) { _updateProcess = nCV(); }
        return _updateProcess;
    }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsMemberVendorSynonymCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMemberVendorSynonymCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberVendorSynonymCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberVendorSynonymCQ bq = (MemberVendorSynonymCQ)bqs;
        MemberVendorSynonymCQ uq = (MemberVendorSynonymCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQuerySynonymMemberWithdrawalAsOne()) {
            uq.querySynonymMemberWithdrawalAsOne().reflectRelationOnUnionQuery(bq.querySynonymMemberWithdrawalAsOne(), uq.querySynonymMemberWithdrawalAsOne());
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
    protected MemberStatusCQ _conditionQueryMemberStatus;
    public MemberStatusCQ getConditionQueryMemberStatus() {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = resolveNextRelationPath("MEMBER_VENDOR_SYNONYM", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberStatusCQ cq = new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymMemberWithdrawalCQ querySynonymMemberWithdrawalAsOne() {
        return getConditionQuerySynonymMemberWithdrawalAsOne();
    }
    protected SynonymMemberWithdrawalCQ _conditionQuerySynonymMemberWithdrawalAsOne;
    public SynonymMemberWithdrawalCQ getConditionQuerySynonymMemberWithdrawalAsOne() {
        if (_conditionQuerySynonymMemberWithdrawalAsOne == null) {
            _conditionQuerySynonymMemberWithdrawalAsOne = xcreateQuerySynonymMemberWithdrawalAsOne();
            xsetupOuterJoinSynonymMemberWithdrawalAsOne();
        }
        return _conditionQuerySynonymMemberWithdrawalAsOne;
    }
    protected SynonymMemberWithdrawalCQ xcreateQuerySynonymMemberWithdrawalAsOne() {
        String nrp = resolveNextRelationPath("MEMBER_VENDOR_SYNONYM", "synonymMemberWithdrawalAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SynonymMemberWithdrawalCQ cq = new SynonymMemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("synonymMemberWithdrawalAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSynonymMemberWithdrawalAsOne() {
        SynonymMemberWithdrawalCQ cq = getConditionQuerySynonymMemberWithdrawalAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "synonymMemberWithdrawalAsOne");
    }
    public boolean hasConditionQuerySynonymMemberWithdrawalAsOne() {
        return _conditionQuerySynonymMemberWithdrawalAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberVendorSynonymCQ> _scalarConditionMap;
    public Map<String, MemberVendorSynonymCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberVendorSynonymCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberVendorSynonymCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberVendorSynonymCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberVendorSynonymCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _queryMyselfDerivedMap;
    public Map<String, MemberVendorSynonymCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberVendorSynonymCQ sq) {
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
    protected Map<String, MemberVendorSynonymCQ> _myselfExistsMap;
    public Map<String, MemberVendorSynonymCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberVendorSynonymCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberVendorSynonymCQ> _myselfInScopeMap;
    public Map<String, MemberVendorSynonymCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberVendorSynonymCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberVendorSynonymCB.class.getName(); }
    protected String xCQ() { return MemberVendorSynonymCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
