package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (会員サービス)member_service as TABLE. <br />
 * 会員のサービス情報（ポイントサービスなど）。<br />
 * ExampleDBとして、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。
 * <pre>
 * [primary-key]
 *     member_service_id
 * 
 * [column]
 *     member_service_id, member_id, service_point_count, service_rank_code, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 * 
 * [sequence]
 *     member_service_member_service_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     member, service_rank
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, serviceRank
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberServiceId = entity.getMemberServiceId();
 * Integer memberId = entity.getMemberId();
 * Integer servicePointCount = entity.getServicePointCount();
 * String serviceRankCode = entity.getServiceRankCode();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberServiceId(memberServiceId);
 * entity.setMemberId(memberId);
 * entity.setServicePointCount(servicePointCount);
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterProcess(registerProcess);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateProcess(updateProcess);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberService extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _memberServiceId;

    /** (会員ID)member_id: {UQ, NotNull, int4(10), FK to member} */
    protected Integer _memberId;

    /** (サービスポイント数)service_point_count: {IX, NotNull, int4(10)} */
    protected Integer _servicePointCount;

    /** (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank} */
    protected String _serviceRankCode;

    /** register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _registerDatetime;

    /** register_process: {NotNull, varchar(200)} */
    protected String _registerProcess;

    /** register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _updateDatetime;

    /** update_process: {NotNull, varchar(200)} */
    protected String _updateProcess;

    /** update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    /** version_no: {NotNull, int8(19)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "member_service";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberService";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getMemberServiceId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ, NotNull, int4(10), FK to member. (NotNull)
     */
    public void uniqueBy(Integer memberId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        setMemberId(memberId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)member by my member_id, named 'member'. */
    protected Member _member;

    /**
     * [get] (会員)member by my member_id, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] (会員)member by my member_id, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    /** (サービスランク)service_rank by my service_rank_code, named 'serviceRank'. */
    protected ServiceRank _serviceRank;

    /**
     * [get] (サービスランク)service_rank by my service_rank_code, named 'serviceRank'.
     * @return The entity of foreign property 'serviceRank'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ServiceRank getServiceRank() {
        return _serviceRank;
    }

    /**
     * [set] (サービスランク)service_rank by my service_rank_code, named 'serviceRank'.
     * @param serviceRank The entity of foreign property 'serviceRank'. (NullAllowed)
     */
    public void setServiceRank(ServiceRank serviceRank) {
        _serviceRank = serviceRank;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberService) {
            BsMemberService other = (BsMemberService)obj;
            if (!xSV(_memberServiceId, other._memberServiceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberServiceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_serviceRank != null)
        { sb.append(li).append(xbRDS(_serviceRank, "serviceRank")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberServiceId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_servicePointCount));
        sb.append(dm).append(xfND(_serviceRankCode));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateProcess));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(dm).append("member"); }
        if (_serviceRank != null)
        { sb.append(dm).append("serviceRank"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberService clone() {
        return (MemberService)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)} <br />
     * 独立した主キーとなるが、実質的に会員IDとは one-to-one である。
     * @return The value of the column 'member_service_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberServiceId() {
        checkSpecifiedProperty("memberServiceId");
        return _memberServiceId;
    }

    /**
     * [set] (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)} <br />
     * 独立した主キーとなるが、実質的に会員IDとは one-to-one である。
     * @param memberServiceId The value of the column 'member_service_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberServiceId(Integer memberServiceId) {
        registerModifiedProperty("memberServiceId");
        _memberServiceId = memberServiceId;
    }

    /**
     * [get] (会員ID)member_id: {UQ, NotNull, int4(10), FK to member} <br />
     * 会員を参照するID。ユニークなので、会員とは one-to-one の関係に。
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {UQ, NotNull, int4(10), FK to member} <br />
     * 会員を参照するID。ユニークなので、会員とは one-to-one の関係に。
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (サービスポイント数)service_point_count: {IX, NotNull, int4(10)} <br />
     * 会員が現在利用できるサービスポイントの数。<br />
     * 基本的に、購入時には増えてポイントを使ったら減る。
     * @return The value of the column 'service_point_count'. (basically NotNull if selected: for the constraint)
     */
    public Integer getServicePointCount() {
        checkSpecifiedProperty("servicePointCount");
        return _servicePointCount;
    }

    /**
     * [set] (サービスポイント数)service_point_count: {IX, NotNull, int4(10)} <br />
     * 会員が現在利用できるサービスポイントの数。<br />
     * 基本的に、購入時には増えてポイントを使ったら減る。
     * @param servicePointCount The value of the column 'service_point_count'. (basically NotNull if update: for the constraint)
     */
    public void setServicePointCount(Integer servicePointCount) {
        registerModifiedProperty("servicePointCount");
        _servicePointCount = servicePointCount;
    }

    /**
     * [get] (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank} <br />
     * サービスランクを参照するコード。<br />
     * どんなランクがあるのかドキドキですね。
     * @return The value of the column 'service_rank_code'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankCode() {
        checkSpecifiedProperty("serviceRankCode");
        return _serviceRankCode;
    }

    /**
     * [set] (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank} <br />
     * サービスランクを参照するコード。<br />
     * どんなランクがあるのかドキドキですね。
     * @param serviceRankCode The value of the column 'service_rank_code'. (basically NotNull if update: for the constraint)
     */
    public void setServiceRankCode(String serviceRankCode) {
        registerModifiedProperty("serviceRankCode");
        _serviceRankCode = serviceRankCode;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3)} <br />
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_process: {NotNull, varchar(200)} <br />
     * @return The value of the column 'register_process'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {NotNull, varchar(200)} <br />
     * @param registerProcess The value of the column 'register_process'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] register_user: {NotNull, varchar(200)} <br />
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(200)} <br />
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(26, 3)} <br />
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_process: {NotNull, varchar(200)} <br />
     * @return The value of the column 'update_process'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {NotNull, varchar(200)} <br />
     * @param updateProcess The value of the column 'update_process'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] update_user: {NotNull, varchar(200)} <br />
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(200)} <br />
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] version_no: {NotNull, int8(19)} <br />
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int8(19)} <br />
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
