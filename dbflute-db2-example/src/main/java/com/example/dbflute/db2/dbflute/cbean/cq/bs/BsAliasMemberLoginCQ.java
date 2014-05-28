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
    public ConditionValue getMemberLoginId() {
        if (_memberLoginId == null) { _memberLoginId = nCV(); }
        return _memberLoginId;
    }
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
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, AliasMemberCQ> _memberId_InScopeRelation_AliasMemberMap;
    public Map<String, AliasMemberCQ> getMemberId_InScopeRelation_AliasMember() { return _memberId_InScopeRelation_AliasMemberMap; }
    public String keepMemberId_InScopeRelation_AliasMember(AliasMemberCQ sq) {
        if (_memberId_InScopeRelation_AliasMemberMap == null) { _memberId_InScopeRelation_AliasMemberMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_AliasMemberMap.size() + 1);
        _memberId_InScopeRelation_AliasMemberMap.put(ky, sq); return "memberId_InScopeRelation_AliasMember." + ky;
    }

    protected Map<String, AliasMemberCQ> _memberId_NotInScopeRelation_AliasMemberMap;
    public Map<String, AliasMemberCQ> getMemberId_NotInScopeRelation_AliasMember() { return _memberId_NotInScopeRelation_AliasMemberMap; }
    public String keepMemberId_NotInScopeRelation_AliasMember(AliasMemberCQ sq) {
        if (_memberId_NotInScopeRelation_AliasMemberMap == null) { _memberId_NotInScopeRelation_AliasMemberMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_AliasMemberMap.size() + 1);
        _memberId_NotInScopeRelation_AliasMemberMap.put(ky, sq); return "memberId_NotInScopeRelation_AliasMember." + ky;
    }

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
    public ConditionValue getLoginDatetime() {
        if (_loginDatetime == null) { _loginDatetime = nCV(); }
        return _loginDatetime;
    }
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
    public ConditionValue getMobileLoginFlg() {
        if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
        return _mobileLoginFlg;
    }
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
    public ConditionValue getLoginMemberStatusCode() {
        if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
        return _loginMemberStatusCode;
    }
    protected ConditionValue getCValueLoginMemberStatusCode() { return getLoginMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_InScopeRelation_MemberStatus() { return _loginMemberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq) {
        if (_loginMemberStatusCode_InScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_loginMemberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_InScopeRelation_MemberStatusMap.put(ky, sq); return "loginMemberStatusCode_InScopeRelation_MemberStatus." + ky;
    }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_NotInScopeRelation_MemberStatus() { return _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq) {
        if (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.put(ky, sq); return "loginMemberStatusCode_NotInScopeRelation_MemberStatus." + ky;
    }

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
    public BsAliasMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsAliasMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected AliasMemberCQ _conditionQueryAliasMember;
    public AliasMemberCQ getConditionQueryAliasMember() {
        if (_conditionQueryAliasMember == null) {
            _conditionQueryAliasMember = xcreateQueryAliasMember();
            xsetupOuterJoinAliasMember();
        }
        return _conditionQueryAliasMember;
    }
    protected AliasMemberCQ xcreateQueryAliasMember() {
        String nrp = resolveNextRelationPath("ALIAS_MEMBER_LOGIN", "aliasMember");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        AliasMemberCQ cq = new AliasMemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("aliasMember");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinAliasMember() {
        AliasMemberCQ cq = getConditionQueryAliasMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "aliasMember");
    }
    public boolean hasConditionQueryAliasMember() {
        return _conditionQueryAliasMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
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
        String nrp = resolveNextRelationPath("ALIAS_MEMBER_LOGIN", "memberStatus");
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

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, AliasMemberLoginCQ> _scalarConditionMap;
    public Map<String, AliasMemberLoginCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(AliasMemberLoginCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, AliasMemberLoginCQ> _specifyMyselfDerivedMap;
    public Map<String, AliasMemberLoginCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(AliasMemberLoginCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, AliasMemberLoginCQ> _queryMyselfDerivedMap;
    public Map<String, AliasMemberLoginCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(AliasMemberLoginCQ sq) {
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
    protected Map<String, AliasMemberLoginCQ> _myselfExistsMap;
    public Map<String, AliasMemberLoginCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(AliasMemberLoginCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, AliasMemberLoginCQ> _myselfInScopeMap;
    public Map<String, AliasMemberLoginCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(AliasMemberLoginCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

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
