package com.example.dbflute.msaccess.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.msaccess.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.msaccess.dbflute.cbean.*;
import com.example.dbflute.msaccess.dbflute.cbean.cq.*;

/**
 * The base condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberLoginCQ extends AbstractBsMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberLoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberLoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberLoginCIQ xcreateCIQ() {
        MemberLoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberLoginCIQ xnewCIQ() {
        return new MemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberLoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberLoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberLoginId;
    public ConditionValue getMemberLoginId() {
        if (_memberLoginId == null) { _memberLoginId = nCV(); }
        return _memberLoginId;
    }
    protected ConditionValue getCValueMemberLoginId() { return getMemberLoginId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberLoginId_Asc() { regOBA("MEMBER_LOGIN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberLoginId_Desc() { regOBD("MEMBER_LOGIN_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberCQ> _memberId_InScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return _memberId_InScopeRelation_MemberMap; }
    public String keepMemberId_InScopeRelation_Member(MemberCQ subQuery) {
        if (_memberId_InScopeRelation_MemberMap == null) { _memberId_InScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberMap.size() + 1);
        _memberId_InScopeRelation_MemberMap.put(key, subQuery); return "memberId_InScopeRelation_Member." + key;
    }

    protected Map<String, MemberCQ> _memberId_NotInScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return _memberId_NotInScopeRelation_MemberMap; }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberMap == null) { _memberId_NotInScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberMap.size() + 1);
        _memberId_NotInScopeRelation_MemberMap.put(key, subQuery); return "memberId_NotInScopeRelation_Member." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _loginDatetime;
    public ConditionValue getLoginDatetime() {
        if (_loginDatetime == null) { _loginDatetime = nCV(); }
        return _loginDatetime;
    }
    protected ConditionValue getCValueLoginDatetime() { return getLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginDatetime_Asc() { regOBA("LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginDatetime_Desc() { regOBD("LOGIN_DATETIME"); return this; }

    protected ConditionValue _loginMobileFlg;
    public ConditionValue getLoginMobileFlg() {
        if (_loginMobileFlg == null) { _loginMobileFlg = nCV(); }
        return _loginMobileFlg;
    }
    protected ConditionValue getCValueLoginMobileFlg() { return getLoginMobileFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMobileFlg_Asc() { regOBA("LOGIN_MOBILE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMobileFlg_Desc() { regOBD("LOGIN_MOBILE_FLG"); return this; }

    protected ConditionValue _loginMemberStatusCode;
    public ConditionValue getLoginMemberStatusCode() {
        if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
        return _loginMemberStatusCode;
    }
    protected ConditionValue getCValueLoginMemberStatusCode() { return getLoginMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_InScopeRelation_MemberStatus() { return _loginMemberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_loginMemberStatusCode_InScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_loginMemberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_InScopeRelation_MemberStatusMap.put(key, subQuery); return "loginMemberStatusCode_InScopeRelation_MemberStatus." + key;
    }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_NotInScopeRelation_MemberStatus() { return _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.put(key, subQuery); return "loginMemberStatusCode_NotInScopeRelation_MemberStatus." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMemberStatusCode_Asc() { regOBA("LOGIN_MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMemberStatusCode_Desc() { regOBD("LOGIN_MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess() {
        if (_registerProcess == null) { _registerProcess = nCV(); }
        return _registerProcess;
    }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess() {
        if (_updateProcess == null) { _updateProcess = nCV(); }
        return _updateProcess;
    }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        MemberLoginCQ baseQuery = (MemberLoginCQ)baseQueryAsSuper;
        MemberLoginCQ unionQuery = (MemberLoginCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMemberStatus()) {
            unionQuery.queryMemberStatus().reflectRelationOnUnionQuery(baseQuery.queryMemberStatus(), unionQuery.queryMemberStatus());
        }
        if (baseQuery.hasConditionQueryMember()) {
            unionQuery.queryMember().reflectRelationOnUnionQuery(baseQuery.queryMember(), unionQuery.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
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
        String nrp = resolveNextRelationPath("MEMBER_LOGIN", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberStatusCQ cq = new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER by my MEMBER_ID, named 'member'.
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
        String nrp = resolveNextRelationPath("MEMBER_LOGIN", "member");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberCQ cq = new MemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("member");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMember() {
        MemberCQ cq = getConditionQueryMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    public boolean hasConditionQueryMember() {
        return _conditionQueryMember != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberLoginCQ> _scalarConditionMap;
    public Map<String, MemberLoginCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberLoginCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberLoginCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberLoginCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberLoginCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MemberLoginCQ> _queryMyselfDerivedMap;
    public Map<String, MemberLoginCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberLoginCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberLoginCQ> _myselfExistsMap;
    public Map<String, MemberLoginCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberLoginCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberLoginCQ> _myselfInScopeMap;
    public Map<String, MemberLoginCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberLoginCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberLoginCB.class.getName(); }
    protected String xCQ() { return MemberLoginCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
