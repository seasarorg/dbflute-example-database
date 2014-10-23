package com.example.dbflute.sqlserver.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.*;

/**
 * The entity of CommonColumnMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setRegisterProcess(registerProcess);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setUpdateProcess(updateProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCommonColumnMember extends AbstractEntity {

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
    /** MEMBER_ID: {int(10)} */
    protected Integer _memberId;

    /** MEMBER_NAME: {nvarchar(200)} */
    protected String _memberName;

    /** REGISTER_DATETIME: {datetime(23, 3)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_USER: {nvarchar(200)} */
    protected String _registerUser;

    /** REGISTER_PROCESS: {nvarchar(200)} */
    protected String _registerProcess;

    /** UPDATE_DATETIME: {datetime(23, 3)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_USER: {nvarchar(200)} */
    protected String _updateUser;

    /** UPDATE_PROCESS: {nvarchar(200)} */
    protected String _updateProcess;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "CommonColumnMember";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "commonColumnMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.sqlserver.dbflute.bsentity.customize.dbmeta.CommonColumnMemberDbm.getInstance();
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

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCommonColumnMember) {
            BsCommonColumnMember other = (BsCommonColumnMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_registerDatetime, other._registerDatetime)) { return false; }
            if (!xSV(_registerUser, other._registerUser)) { return false; }
            if (!xSV(_registerProcess, other._registerProcess)) { return false; }
            if (!xSV(_updateDatetime, other._updateDatetime)) { return false; }
            if (!xSV(_updateUser, other._updateUser)) { return false; }
            if (!xSV(_updateProcess, other._updateProcess)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _registerDatetime);
        hs = xCH(hs, _registerUser);
        hs = xCH(hs, _registerProcess);
        hs = xCH(hs, _updateDatetime);
        hs = xCH(hs, _updateUser);
        hs = xCH(hs, _updateProcess);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_updateProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public CommonColumnMember clone() {
        return (CommonColumnMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {int(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {int(10)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {nvarchar(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {nvarchar(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] REGISTER_DATETIME: {datetime(23, 3)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {datetime(23, 3)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {nvarchar(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {nvarchar(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] REGISTER_PROCESS: {nvarchar(200)} <br />
     * @return The value of the column 'REGISTER_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] REGISTER_PROCESS: {nvarchar(200)} <br />
     * @param registerProcess The value of the column 'REGISTER_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        __modifiedProperties.addPropertyName("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] UPDATE_DATETIME: {datetime(23, 3)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {datetime(23, 3)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {nvarchar(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {nvarchar(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] UPDATE_PROCESS: {nvarchar(200)} <br />
     * @return The value of the column 'UPDATE_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] UPDATE_PROCESS: {nvarchar(200)} <br />
     * @param updateProcess The value of the column 'UPDATE_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        __modifiedProperties.addPropertyName("updateProcess");
        _updateProcess = updateProcess;
    }
}
