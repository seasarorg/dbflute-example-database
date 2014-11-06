package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (会員住所情報)member_address as TABLE. <br />
 * 会員の住所に関する情報で、同時に有効期間ごとに履歴管理されている。<br />
 * 会員を基点に考えた場合、構造的にはone-to-many だが、業務的な定型条件でone-to-one になる。このような構造を「業務的one-to-one」と呼ぶ。<br />
 * 有効期間は隙間なく埋められるが、ここでは住所情報のない会員も存在し、厳密には(業務的な) "1 : 0...1" である。
 * <pre>
 * [primary-key]
 *     member_address_id
 * 
 * [column]
 *     member_address_id, member_id, valid_begin_date, valid_end_date, address, region_id, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 * 
 * [sequence]
 *     member_address_member_address_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     member, region
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, region
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberAddressId = entity.getMemberAddressId();
 * Integer memberId = entity.getMemberId();
 * java.util.Date validBeginDate = entity.getValidBeginDate();
 * java.util.Date validEndDate = entity.getValidEndDate();
 * String address = entity.getAddress();
 * Integer regionId = entity.getRegionId();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberAddressId(memberAddressId);
 * entity.setMemberId(memberId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * entity.setAddress(address);
 * entity.setRegionId(regionId);
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
public abstract class BsMemberAddress extends AbstractEntity implements EntityDefinedCommonColumn {

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
    /** (会員住所ID)member_address_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _memberAddressId;

    /** (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member} */
    protected Integer _memberId;

    /** (有効開始日)valid_begin_date: {+UQ, NotNull, date(13)} */
    protected java.util.Date _validBeginDate;

    /** (有効終了日)valid_end_date: {NotNull, date(13)} */
    protected java.util.Date _validEndDate;

    /** (住所)address: {NotNull, varchar(200)} */
    protected String _address;

    /** (地域ID)region_id: {NotNull, int4(10), FK to region} */
    protected Integer _regionId;

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
        return "member_address";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberAddress";
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
        if (getMemberAddressId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, NotNull, int4(10), FK to member. (NotNull)
     * @param validBeginDate (有効開始日): +UQ, NotNull, date(13). (NotNull)
     */
    public void uniqueBy(Integer memberId, java.util.Date validBeginDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        setMemberId(memberId);setValidBeginDate(validBeginDate);
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

    /** (地域)region by my region_id, named 'region'. */
    protected Region _region;

    /**
     * [get] (地域)region by my region_id, named 'region'.
     * @return The entity of foreign property 'region'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Region getRegion() {
        return _region;
    }

    /**
     * [set] (地域)region by my region_id, named 'region'.
     * @param region The entity of foreign property 'region'. (NullAllowed)
     */
    public void setRegion(Region region) {
        _region = region;
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
        if (obj instanceof BsMemberAddress) {
            BsMemberAddress other = (BsMemberAddress)obj;
            if (!xSV(_memberAddressId, other._memberAddressId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberAddressId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_region != null)
        { sb.append(li).append(xbRDS(_region, "region")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberAddressId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfUD(_validBeginDate));
        sb.append(dm).append(xfUD(_validEndDate));
        sb.append(dm).append(xfND(_address));
        sb.append(dm).append(xfND(_regionId));
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
        if (_region != null)
        { sb.append(dm).append("region"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberAddress clone() {
        return (MemberAddress)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員住所ID)member_address_id: {PK, ID, NotNull, serial(10)} <br />
     * 会員住所を識別するID。<br />
     * 履歴分も含むテーブルなので、これ自体はFKではない。
     * @return The value of the column 'member_address_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberAddressId() {
        checkSpecifiedProperty("memberAddressId");
        return _memberAddressId;
    }

    /**
     * [set] (会員住所ID)member_address_id: {PK, ID, NotNull, serial(10)} <br />
     * 会員住所を識別するID。<br />
     * 履歴分も含むテーブルなので、これ自体はFKではない。
     * @param memberAddressId The value of the column 'member_address_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAddressId(Integer memberAddressId) {
        registerModifiedProperty("memberAddressId");
        _memberAddressId = memberAddressId;
    }

    /**
     * [get] (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 履歴分を含むため、これだけではユニークにはならない。<br />
     * 有効開始日と合わせて複合ユニーク制約となるが、<br />
     * 厳密には完全な制約にはなっていない。<br />
     * 有効期間の概念はRDBでは表現しきれないのである。
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 履歴分を含むため、これだけではユニークにはならない。<br />
     * 有効開始日と合わせて複合ユニーク制約となるが、<br />
     * 厳密には完全な制約にはなっていない。<br />
     * 有効期間の概念はRDBでは表現しきれないのである。
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (有効開始日)valid_begin_date: {+UQ, NotNull, date(13)} <br />
     * 一つの有効期間の開始を示す日付。<br />
     * 前の有効終了日の次の日の値が格納される。
     * @return The value of the column 'valid_begin_date'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidBeginDate() {
        checkSpecifiedProperty("validBeginDate");
        return _validBeginDate;
    }

    /**
     * [set] (有効開始日)valid_begin_date: {+UQ, NotNull, date(13)} <br />
     * 一つの有効期間の開始を示す日付。<br />
     * 前の有効終了日の次の日の値が格納される。
     * @param validBeginDate The value of the column 'valid_begin_date'. (basically NotNull if update: for the constraint)
     */
    public void setValidBeginDate(java.util.Date validBeginDate) {
        registerModifiedProperty("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] (有効終了日)valid_end_date: {NotNull, date(13)} <br />
     * 有効期間の終了日。<br />
     * 次の有効開始日の一日前の値が格納される。<br />
     * ただし、次の有効期間がない場合は 9999/12/31 となる。
     * @return The value of the column 'valid_end_date'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidEndDate() {
        checkSpecifiedProperty("validEndDate");
        return _validEndDate;
    }

    /**
     * [set] (有効終了日)valid_end_date: {NotNull, date(13)} <br />
     * 有効期間の終了日。<br />
     * 次の有効開始日の一日前の値が格納される。<br />
     * ただし、次の有効期間がない場合は 9999/12/31 となる。
     * @param validEndDate The value of the column 'valid_end_date'. (basically NotNull if update: for the constraint)
     */
    public void setValidEndDate(java.util.Date validEndDate) {
        registerModifiedProperty("validEndDate");
        _validEndDate = validEndDate;
    }

    /**
     * [get] (住所)address: {NotNull, varchar(200)} <br />
     * まるごと住所
     * @return The value of the column 'address'. (basically NotNull if selected: for the constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return _address;
    }

    /**
     * [set] (住所)address: {NotNull, varchar(200)} <br />
     * まるごと住所
     * @param address The value of the column 'address'. (basically NotNull if update: for the constraint)
     */
    public void setAddress(String address) {
        registerModifiedProperty("address");
        _address = address;
    }

    /**
     * [get] (地域ID)region_id: {NotNull, int4(10), FK to region} <br />
     * 地域を参照するID。<br />
     * ここでは特に住所の内容と連動しているわけではない。<br />
     * （業務的one-to-oneの親テーブルの表現したかっ...）
     * @return The value of the column 'region_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRegionId() {
        checkSpecifiedProperty("regionId");
        return _regionId;
    }

    /**
     * [set] (地域ID)region_id: {NotNull, int4(10), FK to region} <br />
     * 地域を参照するID。<br />
     * ここでは特に住所の内容と連動しているわけではない。<br />
     * （業務的one-to-oneの親テーブルの表現したかっ...）
     * @param regionId The value of the column 'region_id'. (basically NotNull if update: for the constraint)
     */
    public void setRegionId(Integer regionId) {
        registerModifiedProperty("regionId");
        _regionId = regionId;
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
