package com.example.dbflute.tricky.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of MEMBER_SECURITY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
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
 * Integer memberId = entity.getMemberId();
 * String loginPassword = entity.getLoginPassword();
 * String reminderQuestion = entity.getReminderQuestion();
 * String reminderAnswer = entity.getReminderAnswer();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Integer versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setLoginPassword(loginPassword);
 * entity.setReminderQuestion(reminderQuestion);
 * entity.setReminderAnswer(reminderAnswer);
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
public abstract class BsMemberSecurity extends AbstractEntity {

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
    /** MEMBER_ID: {PK, NotNull, INTEGER(2000000000, 10), FK to MEMBER} */
    protected Integer _memberId;

    /** LOGIN_PASSWORD: {NotNull, TEXT(2000000000, 10)} */
    protected String _loginPassword;

    /** REMINDER_QUESTION: {NotNull, TEXT(2000000000, 10)} */
    protected String _reminderQuestion;

    /** REMINDER_ANSWER: {NotNull, TEXT(2000000000, 10)} */
    protected String _reminderAnswer;

    /** REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _registerProcess;

    /** REGISTER_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _updateProcess;

    /** UPDATE_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MEMBER_SECURITY";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberSecurity";
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
        if (getMemberId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected Member _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    public Member chaseMember() {
        return _member != null ? _member : new Member();
    }

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
        if (obj instanceof BsMemberSecurity) {
            BsMemberSecurity other = (BsMemberSecurity)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_loginPassword));
        sb.append(dm).append(xfND(_reminderQuestion));
        sb.append(dm).append(xfND(_reminderAnswer));
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
        if (_member != null) { sb.append(dm).append("member"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberSecurity clone() {
        return (MemberSecurity)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] LOGIN_PASSWORD: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'LOGIN_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginPassword() {
        checkSpecifiedProperty("loginPassword");
        return _loginPassword;
    }

    /**
     * [set] LOGIN_PASSWORD: {NotNull, TEXT(2000000000, 10)} <br />
     * @param loginPassword The value of the column 'LOGIN_PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setLoginPassword(String loginPassword) {
        __modifiedProperties.addPropertyName("loginPassword");
        _loginPassword = loginPassword;
    }

    /**
     * [get] REMINDER_QUESTION: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'REMINDER_QUESTION'. (basically NotNull if selected: for the constraint)
     */
    public String getReminderQuestion() {
        checkSpecifiedProperty("reminderQuestion");
        return _reminderQuestion;
    }

    /**
     * [set] REMINDER_QUESTION: {NotNull, TEXT(2000000000, 10)} <br />
     * @param reminderQuestion The value of the column 'REMINDER_QUESTION'. (basically NotNull if update: for the constraint)
     */
    public void setReminderQuestion(String reminderQuestion) {
        __modifiedProperties.addPropertyName("reminderQuestion");
        _reminderQuestion = reminderQuestion;
    }

    /**
     * [get] REMINDER_ANSWER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'REMINDER_ANSWER'. (basically NotNull if selected: for the constraint)
     */
    public String getReminderAnswer() {
        checkSpecifiedProperty("reminderAnswer");
        return _reminderAnswer;
    }

    /**
     * [set] REMINDER_ANSWER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param reminderAnswer The value of the column 'REMINDER_ANSWER'. (basically NotNull if update: for the constraint)
     */
    public void setReminderAnswer(String reminderAnswer) {
        __modifiedProperties.addPropertyName("reminderAnswer");
        _reminderAnswer = reminderAnswer;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @param registerProcess The value of the column 'REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        __modifiedProperties.addPropertyName("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @param updateProcess The value of the column 'UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        __modifiedProperties.addPropertyName("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INTEGER(2000000000, 10)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }
}
