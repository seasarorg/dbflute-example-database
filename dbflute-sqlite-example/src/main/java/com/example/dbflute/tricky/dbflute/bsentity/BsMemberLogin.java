package com.example.dbflute.tricky.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.allcommon.CDef;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_LOGIN_ID
 * 
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_LOGIN_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     memberStatus, member
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberLoginId = entity.getMemberLoginId();
 * Integer memberId = entity.getMemberId();
 * java.sql.Timestamp loginDatetime = entity.getLoginDatetime();
 * Integer mobileLoginFlg = entity.getMobileLoginFlg();
 * String loginMemberStatusCode = entity.getLoginMemberStatusCode();
 * entity.setMemberLoginId(memberLoginId);
 * entity.setMemberId(memberId);
 * entity.setLoginDatetime(loginDatetime);
 * entity.setMobileLoginFlg(mobileLoginFlg);
 * entity.setLoginMemberStatusCode(loginMemberStatusCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberLogin implements Entity, Serializable, Cloneable {

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
    /** MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} */
    protected Integer _memberLoginId;

    /** MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} */
    protected Integer _memberId;

    /** LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _loginDatetime;

    /** MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} */
    protected Integer _mobileLoginFlg;

    /** LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _loginMemberStatusCode;

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
        return "MEMBER_LOGIN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberLogin";
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
        if (getMemberLoginId() == null) { return false; }
        return true;
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br />
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getMobileLoginFlgAsFlg() {
        return CDef.Flg.codeOf(getMobileLoginFlg());
    }

    /**
     * Set the value of mobileLoginFlg as the classification of Flg. <br />
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMobileLoginFlgAsFlg(CDef.Flg cdef) {
        setMobileLoginFlg(cdef != null ? FunCustodial.toNumber(cdef.code(), Integer.class) : null);
    }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getLoginMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getLoginMemberStatusCode());
    }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setLoginMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mobileLoginFlg as True (1). <br />
     * Yes: means valid
     */
    public void setMobileLoginFlg_True() {
        setMobileLoginFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Same as setMobileLoginFlg_True. <br />
     * Yes: means valid
     */
    public void classifyMobileLoginFlgTrue() {
        setMobileLoginFlg_True();
    }

    /**
     * Set the value of mobileLoginFlg as False (0). <br />
     * No: means invalid
     */
    public void setMobileLoginFlg_False() {
        setMobileLoginFlgAsFlg(CDef.Flg.False);
    }

    /**
     * Same as setMobileLoginFlg_False. <br />
     * No: means invalid
     */
    public void classifyMobileLoginFlgFalse() {
        setMobileLoginFlg_False();
    }

    /**
     * Same as setMobileLoginFlgAsFlg(cdef). <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void classifyMobileLoginFlg(CDef.Flg cdef) {
        setMobileLoginFlgAsFlg(cdef);
    }

    /**
     * Set the value of loginMemberStatusCode as ProvisionalMember (PRV). <br />
     * Provisional Member
     */
    public void setLoginMemberStatusCode_ProvisionalMember() {
        setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Same as setLoginMemberStatusCode_ProvisionalMember. <br />
     * Provisional Member
     */
    public void classifyLoginMemberStatusCodeProvisionalMember() {
        setLoginMemberStatusCode_ProvisionalMember();
    }

    /**
     * Set the value of loginMemberStatusCode as FormalizedMember (FML). <br />
     * Formalized Member
     */
    public void setLoginMemberStatusCode_FormalizedMember() {
        setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.FormalizedMember);
    }

    /**
     * Same as setLoginMemberStatusCode_FormalizedMember. <br />
     * Formalized Member
     */
    public void classifyLoginMemberStatusCodeFormalizedMember() {
        setLoginMemberStatusCode_FormalizedMember();
    }

    /**
     * Set the value of loginMemberStatusCode as WithdrawalMember (WDL). <br />
     * Withdrawal Member
     */
    public void setLoginMemberStatusCode_WithdrawalMember() {
        setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.WithdrawalMember);
    }

    /**
     * Same as setLoginMemberStatusCode_WithdrawalMember. <br />
     * Withdrawal Member
     */
    public void classifyLoginMemberStatusCodeWithdrawalMember() {
        setLoginMemberStatusCode_WithdrawalMember();
    }

    /**
     * Same as setLoginMemberStatusCodeAsMemberStatus(cdef). <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void classifyLoginMemberStatusCode(CDef.MemberStatus cdef) {
        setLoginMemberStatusCodeAsMemberStatus(cdef);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgTrue() {
        CDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of mobileLoginFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgFalse() {
        CDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    /**
     * Is the value of loginMemberStatusCode ProvisionalMember? <br />
     * Provisional Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeProvisionalMember() {
        CDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.ProvisionalMember) : false;
    }

    /**
     * Is the value of loginMemberStatusCode FormalizedMember? <br />
     * Formalized Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeFormalizedMember() {
        CDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.FormalizedMember) : false;
    }

    /**
     * Is the value of loginMemberStatusCode WithdrawalMember? <br />
     * Withdrawal Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeWithdrawalMember() {
        CDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.WithdrawalMember) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'mobileLoginFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMobileLoginFlgName() {
        CDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mobileLoginFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getMobileLoginFlgAlias() {
        CDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected MemberStatus _memberStatus;

    /**
     * [get] MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberStatus getMemberStatus() {
        return _memberStatus;
    }

    /**
     * [set] MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(MemberStatus memberStatus) {
        _memberStatus = memberStatus;
    }

    public MemberStatus chaseMemberStatus() {
        return _memberStatus != null ? _memberStatus : new MemberStatus();
    }

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
        if (obj == null || !(obj instanceof BsMemberLogin)) { return false; }
        BsMemberLogin other = (BsMemberLogin)obj;
        if (!xSV(getMemberLoginId(), other.getMemberLoginId())) { return false; }
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
        hs = xCH(hs, getMemberLoginId());
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
        if (_memberStatus != null)
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
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
        sb.append(dm).append(getMemberLoginId());
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getLoginDatetime());
        sb.append(dm).append(getMobileLoginFlg());
        sb.append(dm).append(getLoginMemberStatusCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_memberStatus != null) { sb.append(cm).append("memberStatus"); }
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
    public MemberLogin clone() {
        try {
            return (MemberLogin)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberLoginId() {
        return _memberLoginId;
    }

    /**
     * [set] MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br />
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberLoginId(Integer memberLoginId) {
        __modifiedProperties.addPropertyName("memberLoginId");
        _memberLoginId = memberLoginId;
    }

    /**
     * [get] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'LOGIN_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getLoginDatetime() {
        return _loginDatetime;
    }

    /**
     * [set] LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setLoginDatetime(java.sql.Timestamp loginDatetime) {
        __modifiedProperties.addPropertyName("loginDatetime");
        _loginDatetime = loginDatetime;
    }

    /**
     * [get] MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMobileLoginFlg() {
        return _mobileLoginFlg;
    }

    /**
     * [set] MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setMobileLoginFlg(Integer mobileLoginFlg) {
        __modifiedProperties.addPropertyName("mobileLoginFlg");
        _mobileLoginFlg = mobileLoginFlg;
    }

    /**
     * [get] LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginMemberStatusCode() {
        return _loginMemberStatusCode;
    }

    /**
     * [set] LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLoginMemberStatusCode(String loginMemberStatusCode) {
        __modifiedProperties.addPropertyName("loginMemberStatusCode");
        _loginMemberStatusCode = loginMemberStatusCode;
    }
}
