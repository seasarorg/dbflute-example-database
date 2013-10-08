package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.allcommon.CDef;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of (会員)MEMBER as TABLE. <br />
 * 会員登録時にInsertされる。<br />
 * 物理削除されることはない
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 * 
 * [sequence]
 *     SEQ_MEMBER
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_ADDRESS(AsValid), MEMBER_LOGIN(AsLatest), MEMBER_SECURITY(AsOne), MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 * 
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberLoginAsLatest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.util.Date registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.util.Date updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setBirthdate(birthdate);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setRegisterProcess(registerProcess);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setUpdateProcess(updateProcess);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsMember implements EntityDefinedCommonColumn, Serializable, Cloneable {

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
    /** (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER_ADDRESS} */
    protected Long _memberId;

    /** (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)} */
    protected String _memberName;

    /** (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)} */
    protected String _memberAccount;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** (生年月日)BIRTHDATE: {DATE(7)} */
    protected java.util.Date _birthdate;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)} */
    protected java.util.Date _registerDatetime;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)} */
    protected String _registerUser;

    /** (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)} */
    protected String _registerProcess;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)} */
    protected java.util.Date _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)} */
    protected String _updateUser;

    /** (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)} */
    protected String _updateProcess;

    /** (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MEMBER";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "member";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized (FML). <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * FORMALIZED: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected MemberStatus _memberStatus;

    /**
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberStatus getMemberStatus() {
        return _memberStatus;
    }

    /**
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(MemberStatus memberStatus) {
        _memberStatus = memberStatus;
    }

    /** MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'. */
    protected MemberAddress _memberAddressAsValid;

    /**
     * MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @return The entity of foreign property 'memberAddressAsValid'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsValid() {
        return _memberAddressAsValid;
    }

    /**
     * MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param memberAddressAsValid The entity of foreign property 'memberAddressAsValid'. (NullAllowed)
     */
    public void setMemberAddressAsValid(MemberAddress memberAddressAsValid) {
        _memberAddressAsValid = memberAddressAsValid;
    }

    /** (会員ログイン)MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'. */
    protected MemberLogin _memberLoginAsLatest;

    /**
     * (会員ログイン)MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The entity of foreign property 'memberLoginAsLatest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsLatest() {
        return _memberLoginAsLatest;
    }

    /**
     * (会員ログイン)MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @param memberLoginAsLatest The entity of foreign property 'memberLoginAsLatest'. (NullAllowed)
     */
    public void setMemberLoginAsLatest(MemberLogin memberLoginAsLatest) {
        _memberLoginAsLatest = memberLoginAsLatest;
    }

    /** MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'. */
    protected MemberSecurity _memberSecurityAsOne;

    /**
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberSecurity getMemberSecurityAsOne() {
        return _memberSecurityAsOne;
    }

    /**
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed)
     */
    public void setMemberSecurityAsOne(MemberSecurity memberSecurityAsOne) {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    /** MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'. */
    protected MemberService _memberServiceAsOne;

    /**
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberService getMemberServiceAsOne() {
        return _memberServiceAsOne;
    }

    /**
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @param memberServiceAsOne The entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed)
     */
    public void setMemberServiceAsOne(MemberService memberServiceAsOne) {
        _memberServiceAsOne = memberServiceAsOne;
    }

    /** MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'. */
    protected MemberWithdrawal _memberWithdrawalAsOne;

    /**
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberWithdrawal getMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne;
    }

    /**
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed)
     */
    public void setMemberWithdrawalAsOne(MemberWithdrawal memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'. */
    protected List<MemberAddress> _memberAddressList;

    /**
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<MemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    /** (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** (購入)PURCHASE by MEMBER_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
    }

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
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMember)) { return false; }
        BsMember otherEntity = (BsMember)other;
        if (!xSV(getMemberId(), otherEntity.getMemberId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getMemberId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_memberStatus != null)
        { sb.append(l).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberAddressAsValid != null)
        { sb.append(l).append(xbRDS(_memberAddressAsValid, "memberAddressAsValid")); }
        if (_memberLoginAsLatest != null)
        { sb.append(l).append(xbRDS(_memberLoginAsLatest, "memberLoginAsLatest")); }
        if (_memberSecurityAsOne != null)
        { sb.append(l).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberServiceAsOne != null)
        { sb.append(l).append(xbRDS(_memberServiceAsOne, "memberServiceAsOne")); }
        if (_memberWithdrawalAsOne != null)
        { sb.append(l).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        if (_memberAddressList != null) { for (Entity e : _memberAddressList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "memberAddressList")); } } }
        if (_memberLoginList != null) { for (Entity e : _memberLoginList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "memberLoginList")); } } }
        if (_purchaseList != null) { for (Entity e : _purchaseList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "purchaseList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getMemberId());
        sb.append(delimiter).append(getMemberName());
        sb.append(delimiter).append(getMemberAccount());
        sb.append(delimiter).append(getMemberStatusCode());
        sb.append(delimiter).append(getFormalizedDatetime());
        sb.append(delimiter).append(xfUD(getBirthdate()));
        sb.append(delimiter).append(xfUD(getRegisterDatetime()));
        sb.append(delimiter).append(getRegisterUser());
        sb.append(delimiter).append(getRegisterProcess());
        sb.append(delimiter).append(xfUD(getUpdateDatetime()));
        sb.append(delimiter).append(getUpdateUser());
        sb.append(delimiter).append(getUpdateProcess());
        sb.append(delimiter).append(getVersionNo());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return InternalUtil.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_memberStatus != null) { sb.append(c).append("memberStatus"); }
        if (_memberAddressAsValid != null) { sb.append(c).append("memberAddressAsValid"); }
        if (_memberLoginAsLatest != null) { sb.append(c).append("memberLoginAsLatest"); }
        if (_memberSecurityAsOne != null) { sb.append(c).append("memberSecurityAsOne"); }
        if (_memberServiceAsOne != null) { sb.append(c).append("memberServiceAsOne"); }
        if (_memberWithdrawalAsOne != null) { sb.append(c).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(c).append("memberAddressList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(c).append("memberLoginList"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(c).append("purchaseList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Member clone() {
        try {
            return (Member)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER_ADDRESS} <br />
     * 連番
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER_ADDRESS} <br />
     * 連番
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        __modifiedProperties.addPropertyName("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)} <br />
     * 会員検索の条件となる。
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)} <br />
     * 会員検索の条件となる。
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)} <br />
     * ログインに利用。<br />
     * 完全にユニークである
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        return _memberAccount;
    }

    /**
     * [set] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)} <br />
     * ログインに利用。<br />
     * 完全にユニークである
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        __modifiedProperties.addPropertyName("memberAccount");
        this._memberAccount = memberAccount;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)} <br />
     * 正式会員になったら値が格納される
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)} <br />
     * 正式会員になったら値が格納される
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        this._formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(7)} <br />
     * わからない場合はnull
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(7)} <br />
     * わからない場合はnull
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        __modifiedProperties.addPropertyName("birthdate");
        this._birthdate = birthdate;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.util.Date registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        return _registerProcess;
    }

    /**
     * [set] (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)} <br />
     * @param registerProcess The value of the column 'REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        __modifiedProperties.addPropertyName("registerProcess");
        this._registerProcess = registerProcess;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.util.Date updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        return _updateProcess;
    }

    /**
     * [set] (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)} <br />
     * @param updateProcess The value of the column 'UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        __modifiedProperties.addPropertyName("updateProcess");
        this._updateProcess = updateProcess;
    }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)} <br />
     * 排他制御に利用される
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)} <br />
     * 排他制御に利用される
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        this._versionNo = versionNo;
    }
}
