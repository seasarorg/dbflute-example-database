package com.example.dbflute.msaccess.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.msaccess.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.msaccess.dbflute.exentity.*;

/**
 * The entity of MEMBER_ADDRESS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberAddressId = entity.getMemberAddressId();
 * Integer memberId = entity.getMemberId();
 * java.sql.Timestamp validBeginDate = entity.getValidBeginDate();
 * java.sql.Timestamp validEndDate = entity.getValidEndDate();
 * String address = entity.getAddress();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Integer versionNo = entity.getVersionNo();
 * entity.setMemberAddressId(memberAddressId);
 * entity.setMemberId(memberId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * entity.setAddress(address);
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
public abstract class BsMemberAddress implements Entity, Serializable, Cloneable {

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
    /** MEMBER_ADDRESS_ID: {UQ, NotNull, COUNTER(10)} */
    protected Integer _memberAddressId;

    /** MEMBER_ID: {IX, INTEGER(10), FK to MEMBER} */
    protected Integer _memberId;

    /** VALID_BEGIN_DATE: {DATETIME(19)} */
    protected java.sql.Timestamp _validBeginDate;

    /** VALID_END_DATE: {DATETIME(19)} */
    protected java.sql.Timestamp _validEndDate;

    /** ADDRESS: {VARCHAR(200)} */
    protected String _address;

    /** REGISTER_DATETIME: {DATETIME(19)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_PROCESS: {VARCHAR(200)} */
    protected String _registerProcess;

    /** REGISTER_USER: {VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {DATETIME(19)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_PROCESS: {VARCHAR(200)} */
    protected String _updateProcess;

    /** UPDATE_USER: {VARCHAR(200)} */
    protected String _updateUser;

    /** VERSION_NO: {INTEGER(10)} */
    protected Integer _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MEMBER_ADDRESS";
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
        return false;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAddressId : UQ, NotNull, COUNTER(10). (NotNull)
     */
    public void uniqueBy(Integer memberAddressId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAddressId");
        setMemberAddressId(memberAddressId);
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected Member _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsMemberAddress)) { return false; }
        BsMemberAddress other = (BsMemberAddress)obj;
        if (!xSV(getMemberAddressId(), other.getMemberAddressId())) { return false; }
        if (!xSV(getMemberId(), other.getMemberId())) { return false; }
        if (!xSV(getValidBeginDate(), other.getValidBeginDate())) { return false; }
        if (!xSV(getValidEndDate(), other.getValidEndDate())) { return false; }
        if (!xSV(getAddress(), other.getAddress())) { return false; }
        if (!xSV(getRegisterDatetime(), other.getRegisterDatetime())) { return false; }
        if (!xSV(getRegisterProcess(), other.getRegisterProcess())) { return false; }
        if (!xSV(getRegisterUser(), other.getRegisterUser())) { return false; }
        if (!xSV(getUpdateDatetime(), other.getUpdateDatetime())) { return false; }
        if (!xSV(getUpdateProcess(), other.getUpdateProcess())) { return false; }
        if (!xSV(getUpdateUser(), other.getUpdateUser())) { return false; }
        if (!xSV(getVersionNo(), other.getVersionNo())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberAddressId());
        hs = xCH(hs, getMemberId());
        hs = xCH(hs, getValidBeginDate());
        hs = xCH(hs, getValidEndDate());
        hs = xCH(hs, getAddress());
        hs = xCH(hs, getRegisterDatetime());
        hs = xCH(hs, getRegisterProcess());
        hs = xCH(hs, getRegisterUser());
        hs = xCH(hs, getUpdateDatetime());
        hs = xCH(hs, getUpdateProcess());
        hs = xCH(hs, getUpdateUser());
        hs = xCH(hs, getVersionNo());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String li = "\n  ";
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getMemberAddressId());
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getValidBeginDate());
        sb.append(dm).append(getValidEndDate());
        sb.append(dm).append(getAddress());
        sb.append(dm).append(getRegisterDatetime());
        sb.append(dm).append(getRegisterProcess());
        sb.append(dm).append(getRegisterUser());
        sb.append(dm).append(getUpdateDatetime());
        sb.append(dm).append(getUpdateProcess());
        sb.append(dm).append(getUpdateUser());
        sb.append(dm).append(getVersionNo());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_member != null) { sb.append(cm).append("member"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public MemberAddress clone() {
        try {
            return (MemberAddress)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ADDRESS_ID: {UQ, NotNull, COUNTER(10)} <br />
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberAddressId() {
        return _memberAddressId;
    }

    /**
     * [set] MEMBER_ADDRESS_ID: {UQ, NotNull, COUNTER(10)} <br />
     * @param memberAddressId The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAddressId(Integer memberAddressId) {
        __modifiedProperties.addPropertyName("memberAddressId");
        _memberAddressId = memberAddressId;
    }

    /**
     * [get] MEMBER_ID: {IX, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {IX, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] VALID_BEGIN_DATE: {DATETIME(19)} <br />
     * @return The value of the column 'VALID_BEGIN_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getValidBeginDate() {
        return _validBeginDate;
    }

    /**
     * [set] VALID_BEGIN_DATE: {DATETIME(19)} <br />
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidBeginDate(java.sql.Timestamp validBeginDate) {
        __modifiedProperties.addPropertyName("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] VALID_END_DATE: {DATETIME(19)} <br />
     * @return The value of the column 'VALID_END_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getValidEndDate() {
        return _validEndDate;
    }

    /**
     * [set] VALID_END_DATE: {DATETIME(19)} <br />
     * @param validEndDate The value of the column 'VALID_END_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidEndDate(java.sql.Timestamp validEndDate) {
        __modifiedProperties.addPropertyName("validEndDate");
        _validEndDate = validEndDate;
    }

    /**
     * [get] ADDRESS: {VARCHAR(200)} <br />
     * @return The value of the column 'ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress() {
        return _address;
    }

    /**
     * [set] ADDRESS: {VARCHAR(200)} <br />
     * @param address The value of the column 'ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress(String address) {
        __modifiedProperties.addPropertyName("address");
        _address = address;
    }

    /**
     * [get] REGISTER_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {DATETIME(19)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_PROCESS: {VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterProcess() {
        return _registerProcess;
    }

    /**
     * [set] REGISTER_PROCESS: {VARCHAR(200)} <br />
     * @param registerProcess The value of the column 'REGISTER_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        __modifiedProperties.addPropertyName("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] REGISTER_USER: {VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {DATETIME(19)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_PROCESS: {VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateProcess() {
        return _updateProcess;
    }

    /**
     * [set] UPDATE_PROCESS: {VARCHAR(200)} <br />
     * @param updateProcess The value of the column 'UPDATE_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        __modifiedProperties.addPropertyName("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] UPDATE_USER: {VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {INTEGER(10)} <br />
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {INTEGER(10)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Integer versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }
}
