package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.allcommon.CDef;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of (会員ログイン)SYNONYM_MEMBER_LOGIN as SYNONYM. <br />
 * ログインの度にInsertされる
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
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     memberStatus, memberVendorSynonym, synonymMember, vendorSynonymMember
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberLoginId = entity.getMemberLoginId();
 * Long memberId = entity.getMemberId();
 * java.util.Date loginDatetime = entity.getLoginDatetime();
 * Integer mobileLoginFlg = entity.getMobileLoginFlg();
 * String loginMemberStatusCode = entity.getLoginMemberStatusCode();
 * entity.setMemberLoginId(memberLoginId);
 * entity.setMemberId(memberId);
 * entity.setLoginDatetime(loginDatetime);
 * entity.setMobileLoginFlg(mobileLoginFlg);
 * entity.setLoginMemberStatusCode(loginMemberStatusCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymMemberLogin extends AbstractEntity {

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
    /** MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _memberLoginId;

    /** MEMBER_ID: {UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM} */
    protected Long _memberId;

    /** LOGIN_DATETIME: {+UQ, IX, NotNull, DATE(7)} */
    protected java.util.Date _loginDatetime;

    /** MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg} */
    protected Integer _mobileLoginFlg;

    /** LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _loginMemberStatusCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SYNONYM_MEMBER_LOGIN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymMemberLogin";
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
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId : UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM. (NotNull)
     * @param loginDatetime : +UQ, IX, NotNull, DATE(7). (NotNull)
     */
    public void uniqueBy(Long memberId, java.util.Date loginDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("loginDatetime");
        setMemberId(memberId);setLoginDatetime(loginDatetime);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br />
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getMobileLoginFlgAsFlg() {
        return CDef.Flg.codeOf(getMobileLoginFlg());
    }

    /**
     * Set the value of mobileLoginFlg as the classification of Flg. <br />
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMobileLoginFlgAsFlg(CDef.Flg cdef) {
        setMobileLoginFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getLoginMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getLoginMemberStatusCode());
    }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
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
     * Set the value of mobileLoginFlg as False (0). <br />
     * No: means invalid
     */
    public void setMobileLoginFlg_False() {
        setMobileLoginFlgAsFlg(CDef.Flg.False);
    }

    /**
     * Set the value of loginMemberStatusCode as Formalized (FML). <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_Formalized() {
        setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of loginMemberStatusCode as Withdrawal (WDL). <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_Withdrawal() {
        setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of loginMemberStatusCode as Provisional (PRV). <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_Provisional() {
        setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
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
     * Is the value of loginMemberStatusCode Formalized? <br />
     * FORMALIZED: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of loginMemberStatusCode Withdrawal? <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of loginMemberStatusCode Provisional? <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
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
    /** (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected MemberStatus _memberStatus;

    /**
     * [get] (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberStatus getMemberStatus() {
        return _memberStatus;
    }

    /**
     * [set] (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(MemberStatus memberStatus) {
        _memberStatus = memberStatus;
    }

    /** (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'. */
    protected MemberVendorSynonym _memberVendorSynonym;

    /**
     * [get] (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The entity of foreign property 'memberVendorSynonym'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberVendorSynonym getMemberVendorSynonym() {
        return _memberVendorSynonym;
    }

    /**
     * [set] (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @param memberVendorSynonym The entity of foreign property 'memberVendorSynonym'. (NullAllowed)
     */
    public void setMemberVendorSynonym(MemberVendorSynonym memberVendorSynonym) {
        _memberVendorSynonym = memberVendorSynonym;
    }

    /** (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'. */
    protected SynonymMember _synonymMember;

    /**
     * [get] (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The entity of foreign property 'synonymMember'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public SynonymMember getSynonymMember() {
        return _synonymMember;
    }

    /**
     * [set] (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @param synonymMember The entity of foreign property 'synonymMember'. (NullAllowed)
     */
    public void setSynonymMember(SynonymMember synonymMember) {
        _synonymMember = synonymMember;
    }

    /** (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'. */
    protected VendorSynonymMember _vendorSynonymMember;

    /**
     * [get] (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The entity of foreign property 'vendorSynonymMember'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorSynonymMember getVendorSynonymMember() {
        return _vendorSynonymMember;
    }

    /**
     * [set] (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @param vendorSynonymMember The entity of foreign property 'vendorSynonymMember'. (NullAllowed)
     */
    public void setVendorSynonymMember(VendorSynonymMember vendorSynonymMember) {
        _vendorSynonymMember = vendorSynonymMember;
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
        if (obj instanceof BsSynonymMemberLogin) {
            BsSynonymMemberLogin other = (BsSynonymMemberLogin)obj;
            if (!xSV(_memberLoginId, other._memberLoginId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberLoginId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null)
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberVendorSynonym != null)
        { sb.append(li).append(xbRDS(_memberVendorSynonym, "memberVendorSynonym")); }
        if (_synonymMember != null)
        { sb.append(li).append(xbRDS(_synonymMember, "synonymMember")); }
        if (_vendorSynonymMember != null)
        { sb.append(li).append(xbRDS(_vendorSynonymMember, "vendorSynonymMember")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberLoginId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfUD(_loginDatetime));
        sb.append(dm).append(xfND(_mobileLoginFlg));
        sb.append(dm).append(xfND(_loginMemberStatusCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String myutilDatePattern() {
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null)
        { sb.append(dm).append("memberStatus"); }
        if (_memberVendorSynonym != null)
        { sb.append(dm).append("memberVendorSynonym"); }
        if (_synonymMember != null)
        { sb.append(dm).append("synonymMember"); }
        if (_vendorSynonymMember != null)
        { sb.append(dm).append("vendorSynonymMember"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SynonymMemberLogin clone() {
        return (SynonymMemberLogin)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberLoginId() {
        checkSpecifiedProperty("memberLoginId");
        return _memberLoginId;
    }

    /**
     * [set] MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberLoginId(Long memberLoginId) {
        registerModifiedProperty("memberLoginId");
        _memberLoginId = memberLoginId;
    }

    /**
     * [get] MEMBER_ID: {UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] LOGIN_DATETIME: {+UQ, IX, NotNull, DATE(7)} <br />
     * @return The value of the column 'LOGIN_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getLoginDatetime() {
        checkSpecifiedProperty("loginDatetime");
        return _loginDatetime;
    }

    /**
     * [set] LOGIN_DATETIME: {+UQ, IX, NotNull, DATE(7)} <br />
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setLoginDatetime(java.util.Date loginDatetime) {
        registerModifiedProperty("loginDatetime");
        _loginDatetime = loginDatetime;
    }

    /**
     * [get] MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg} <br />
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMobileLoginFlg() {
        checkSpecifiedProperty("mobileLoginFlg");
        return _mobileLoginFlg;
    }

    /**
     * [set] MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg} <br />
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setMobileLoginFlg(Integer mobileLoginFlg) {
        checkClassificationCode("MOBILE_LOGIN_FLG", CDef.DefMeta.Flg, mobileLoginFlg);
        registerModifiedProperty("mobileLoginFlg");
        _mobileLoginFlg = mobileLoginFlg;
    }

    /**
     * [get] LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginMemberStatusCode() {
        checkSpecifiedProperty("loginMemberStatusCode");
        return _loginMemberStatusCode;
    }

    /**
     * [set] LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLoginMemberStatusCode(String loginMemberStatusCode) {
        registerModifiedProperty("loginMemberStatusCode");
        _loginMemberStatusCode = loginMemberStatusCode;
    }
}
