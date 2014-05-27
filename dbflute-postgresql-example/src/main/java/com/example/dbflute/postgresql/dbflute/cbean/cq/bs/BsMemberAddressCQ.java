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
 * The base condition-query of member_address.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberAddressCQ extends AbstractBsMemberAddressCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberAddressCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberAddressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from member_address) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberAddressCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberAddressCIQ xcreateCIQ() {
        MemberAddressCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberAddressCIQ xnewCIQ() {
        return new MemberAddressCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join member_address on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberAddressCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberAddressCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberAddressId;
    public ConditionValue getMemberAddressId() {
        if (_memberAddressId == null) { _memberAddressId = nCV(); }
        return _memberAddressId;
    }
    protected ConditionValue getCValueMemberAddressId() { return getMemberAddressId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員住所ID)member_address_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberAddressId_Asc() { regOBA("member_address_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員住所ID)member_address_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberAddressId_Desc() { regOBD("member_address_id"); return this; }

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
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _validBeginDate;
    public ConditionValue getValidBeginDate() {
        if (_validBeginDate == null) { _validBeginDate = nCV(); }
        return _validBeginDate;
    }
    protected ConditionValue getCValueValidBeginDate() { return getValidBeginDate(); }

    /** 
     * Add order-by as ascend. <br />
     * (有効開始日)valid_begin_date: {+UQ, NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidBeginDate_Asc() { regOBA("valid_begin_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * (有効開始日)valid_begin_date: {+UQ, NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidBeginDate_Desc() { regOBD("valid_begin_date"); return this; }

    protected ConditionValue _validEndDate;
    public ConditionValue getValidEndDate() {
        if (_validEndDate == null) { _validEndDate = nCV(); }
        return _validEndDate;
    }
    protected ConditionValue getCValueValidEndDate() { return getValidEndDate(); }

    /** 
     * Add order-by as ascend. <br />
     * (有効終了日)valid_end_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidEndDate_Asc() { regOBA("valid_end_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * (有効終了日)valid_end_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidEndDate_Desc() { regOBD("valid_end_date"); return this; }

    protected ConditionValue _address;
    public ConditionValue getAddress() {
        if (_address == null) { _address = nCV(); }
        return _address;
    }
    protected ConditionValue getCValueAddress() { return getAddress(); }

    /** 
     * Add order-by as ascend. <br />
     * (住所)address: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br />
     * (住所)address: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

    protected ConditionValue _regionId;
    public ConditionValue getRegionId() {
        if (_regionId == null) { _regionId = nCV(); }
        return _regionId;
    }
    protected ConditionValue getCValueRegionId() { return getRegionId(); }

    protected Map<String, RegionCQ> _regionId_InScopeRelation_RegionMap;
    public Map<String, RegionCQ> getRegionId_InScopeRelation_Region() { return _regionId_InScopeRelation_RegionMap; }
    public String keepRegionId_InScopeRelation_Region(RegionCQ sq) {
        if (_regionId_InScopeRelation_RegionMap == null) { _regionId_InScopeRelation_RegionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_regionId_InScopeRelation_RegionMap.size() + 1);
        _regionId_InScopeRelation_RegionMap.put(ky, sq); return "regionId_InScopeRelation_Region." + ky;
    }

    protected Map<String, RegionCQ> _regionId_NotInScopeRelation_RegionMap;
    public Map<String, RegionCQ> getRegionId_NotInScopeRelation_Region() { return _regionId_NotInScopeRelation_RegionMap; }
    public String keepRegionId_NotInScopeRelation_Region(RegionCQ sq) {
        if (_regionId_NotInScopeRelation_RegionMap == null) { _regionId_NotInScopeRelation_RegionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_regionId_NotInScopeRelation_RegionMap.size() + 1);
        _regionId_NotInScopeRelation_RegionMap.put(ky, sq); return "regionId_NotInScopeRelation_Region." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (地域ID)region_id: {NotNull, int4(10), FK to region}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegionId_Asc() { regOBA("region_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (地域ID)region_id: {NotNull, int4(10), FK to region}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegionId_Desc() { regOBD("region_id"); return this; }

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
    public BsMemberAddressCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMemberAddressCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

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
    public BsMemberAddressCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

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
    public BsMemberAddressCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMemberAddressCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

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
    public BsMemberAddressCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsMemberAddressCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMemberAddressCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberAddressCQ bq = (MemberAddressCQ)bqs;
        MemberAddressCQ uq = (MemberAddressCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryRegion()) {
            uq.queryRegion().reflectRelationOnUnionQuery(bq.queryRegion(), uq.queryRegion());
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
        String nrp = resolveNextRelationPath("member_address", "member");
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
     * (地域)region by my region_id, named 'region'.
     * @return The instance of condition-query. (NotNull)
     */
    public RegionCQ queryRegion() {
        return getConditionQueryRegion();
    }
    protected RegionCQ _conditionQueryRegion;
    public RegionCQ getConditionQueryRegion() {
        if (_conditionQueryRegion == null) {
            _conditionQueryRegion = xcreateQueryRegion();
            xsetupOuterJoinRegion();
        }
        return _conditionQueryRegion;
    }
    protected RegionCQ xcreateQueryRegion() {
        String nrp = resolveNextRelationPath("member_address", "region");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        RegionCQ cq = new RegionCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("region");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinRegion() {
        RegionCQ cq = getConditionQueryRegion();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("region_id", "region_id");
        registerOuterJoin(cq, joinOnMap, "region");
    }
    public boolean hasConditionQueryRegion() {
        return _conditionQueryRegion != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberAddressCQ> _scalarConditionMap;
    public Map<String, MemberAddressCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberAddressCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberAddressCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberAddressCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberAddressCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MemberAddressCQ> _queryMyselfDerivedMap;
    public Map<String, MemberAddressCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberAddressCQ sq) {
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
    protected Map<String, MemberAddressCQ> _myselfExistsMap;
    public Map<String, MemberAddressCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberAddressCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberAddressCQ> _myselfInScopeMap;
    public Map<String, MemberAddressCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberAddressCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberAddressCB.class.getName(); }
    protected String xCQ() { return MemberAddressCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
