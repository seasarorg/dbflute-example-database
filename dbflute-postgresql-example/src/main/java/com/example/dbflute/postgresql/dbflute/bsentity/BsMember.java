package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.allcommon.CDef;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (会員)member as TABLE. <br />
 * 会員登録時にデータが登録される。基本的に物理削除はなく、退会したらステータスが退会会員になる。ライフサイクルやカテゴリの違う会員それぞれの詳細情報は、別途 one-to-one のテーブルに。
 * <pre>
 * [primary-key]
 *     member_id
 * 
 * [column]
 *     member_id, member_name, member_account, member_status_code, formalized_datetime, birthdate, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 * 
 * [sequence]
 *     member_member_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     member_status, MEMBER_ADDRESS(AsValid), MEMBER_LOGIN(AsLatest), member_security(AsOne), member_service(AsOne), member_withdrawal(AsOne)
 * 
 * [referrer table]
 *     member_address, member_login, purchase, member_security, member_service, member_withdrawal
 * 
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberLoginAsLatest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
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
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember extends AbstractEntity implements EntityDefinedCommonColumn {

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
    /** (会員ID)member_id: {PK, ID, NotNull, serial(10), FK to MEMBER_ADDRESS} */
    protected Integer _memberId;

    /** (会員名称)member_name: {IX, NotNull, varchar(200)} */
    protected String _memberName;

    /** (会員アカウント)member_account: {UQ, NotNull, varchar(50)} */
    protected String _memberAccount;

    /** (会員ステータスコード)member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (正式会員日時)formalized_datetime: {IX, timestamp(26, 3)} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** (生年月日)birthdate: {date(13)} */
    protected java.util.Date _birthdate;

    /** (登録日時)register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _registerDatetime;

    /** (登録ユーザ)register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** register_process: {NotNull, varchar(200)} */
    protected String _registerProcess;

    /** (更新日時)update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _updateDatetime;

    /** (更新ユーザ)update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    /** update_process: {NotNull, varchar(200)} */
    protected String _updateProcess;

    /** (バージョンNO)version_no: {NotNull, int8(19)} */
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
        return "member";
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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount (会員アカウント): UQ, NotNull, varchar(50). (NotNull)
     */
    public void uniqueBy(String memberAccount) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAccount");
        setMemberAccount(memberAccount);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
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
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)member_status by my member_status_code, named 'memberStatus'. */
    protected MemberStatus _memberStatus;

    /**
     * [get] (会員ステータス)member_status by my member_status_code, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberStatus getMemberStatus() {
        return _memberStatus;
    }

    /**
     * [set] (会員ステータス)member_status by my member_status_code, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(MemberStatus memberStatus) {
        _memberStatus = memberStatus;
    }

    /** (会員住所情報)member_address by my member_id, named 'memberAddressAsValid'. */
    protected MemberAddress _memberAddressAsValid;

    /**
     * [get] (会員住所情報)member_address by my member_id, named 'memberAddressAsValid'.
     * @return The entity of foreign property 'memberAddressAsValid'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsValid() {
        return _memberAddressAsValid;
    }

    /**
     * [set] (会員住所情報)member_address by my member_id, named 'memberAddressAsValid'.
     * @param memberAddressAsValid The entity of foreign property 'memberAddressAsValid'. (NullAllowed)
     */
    public void setMemberAddressAsValid(MemberAddress memberAddressAsValid) {
        _memberAddressAsValid = memberAddressAsValid;
    }

    /** (会員ログイン)member_login by my member_id, named 'memberLoginAsLatest'. */
    protected MemberLogin _memberLoginAsLatest;

    /**
     * [get] (会員ログイン)member_login by my member_id, named 'memberLoginAsLatest'.
     * @return The entity of foreign property 'memberLoginAsLatest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsLatest() {
        return _memberLoginAsLatest;
    }

    /**
     * [set] (会員ログイン)member_login by my member_id, named 'memberLoginAsLatest'.
     * @param memberLoginAsLatest The entity of foreign property 'memberLoginAsLatest'. (NullAllowed)
     */
    public void setMemberLoginAsLatest(MemberLogin memberLoginAsLatest) {
        _memberLoginAsLatest = memberLoginAsLatest;
    }

    /** (会員セキュリティ情報)member_security by member_id, named 'memberSecurityAsOne'. */
    protected MemberSecurity _memberSecurityAsOne;

    /**
     * [get] (会員セキュリティ情報)member_security by member_id, named 'memberSecurityAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberSecurity getMemberSecurityAsOne() {
        return _memberSecurityAsOne;
    }

    /**
     * [set] (会員セキュリティ情報)member_security by member_id, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed)
     */
    public void setMemberSecurityAsOne(MemberSecurity memberSecurityAsOne) {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    /** (会員サービス)member_service by member_id, named 'memberServiceAsOne'. */
    protected MemberService _memberServiceAsOne;

    /**
     * [get] (会員サービス)member_service by member_id, named 'memberServiceAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberService getMemberServiceAsOne() {
        return _memberServiceAsOne;
    }

    /**
     * [set] (会員サービス)member_service by member_id, named 'memberServiceAsOne'.
     * @param memberServiceAsOne The entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed)
     */
    public void setMemberServiceAsOne(MemberService memberServiceAsOne) {
        _memberServiceAsOne = memberServiceAsOne;
    }

    /** (会員退会情報)member_withdrawal by member_id, named 'memberWithdrawalAsOne'. */
    protected MemberWithdrawal _memberWithdrawalAsOne;

    /**
     * [get] (会員退会情報)member_withdrawal by member_id, named 'memberWithdrawalAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberWithdrawal getMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne;
    }

    /**
     * [set] (会員退会情報)member_withdrawal by member_id, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed)
     */
    public void setMemberWithdrawalAsOne(MemberWithdrawal memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員住所情報)member_address by member_id, named 'memberAddressList'. */
    protected List<MemberAddress> _memberAddressList;

    /**
     * [get] (会員住所情報)member_address by member_id, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * [set] (会員住所情報)member_address by member_id, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<MemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    /** (会員ログイン)member_login by member_id, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * [get] (会員ログイン)member_login by member_id, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] (会員ログイン)member_login by member_id, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** (購入)purchase by member_id, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] (購入)purchase by member_id, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)purchase by member_id, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
    }

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
        if (obj instanceof BsMember) {
            BsMember other = (BsMember)obj;
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
        if (_memberStatus != null)
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberAddressAsValid != null)
        { sb.append(li).append(xbRDS(_memberAddressAsValid, "memberAddressAsValid")); }
        if (_memberLoginAsLatest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsLatest, "memberLoginAsLatest")); }
        if (_memberSecurityAsOne != null)
        { sb.append(li).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberServiceAsOne != null)
        { sb.append(li).append(xbRDS(_memberServiceAsOne, "memberServiceAsOne")); }
        if (_memberWithdrawalAsOne != null)
        { sb.append(li).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        if (_memberAddressList != null) { for (MemberAddress et : _memberAddressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")); } } }
        if (_memberLoginList != null) { for (MemberLogin et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        if (_purchaseList != null) { for (Purchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_memberAccount));
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfUD(_birthdate));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_updateProcess));
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
        if (_memberStatus != null)
        { sb.append(dm).append("memberStatus"); }
        if (_memberAddressAsValid != null)
        { sb.append(dm).append("memberAddressAsValid"); }
        if (_memberLoginAsLatest != null)
        { sb.append(dm).append("memberLoginAsLatest"); }
        if (_memberSecurityAsOne != null)
        { sb.append(dm).append("memberSecurityAsOne"); }
        if (_memberServiceAsOne != null)
        { sb.append(dm).append("memberServiceAsOne"); }
        if (_memberWithdrawalAsOne != null)
        { sb.append(dm).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(dm).append("memberAddressList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(dm).append("memberLoginList"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Member clone() {
        return (Member)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)member_id: {PK, ID, NotNull, serial(10), FK to MEMBER_ADDRESS} <br />
     * 会員を識別するID。連番として自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {PK, ID, NotNull, serial(10), FK to MEMBER_ADDRESS} <br />
     * 会員を識別するID。連番として自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)member_name: {IX, NotNull, varchar(200)} <br />
     * 会員のフルネームの名称。<br />
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @return The value of the column 'member_name'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] (会員名称)member_name: {IX, NotNull, varchar(200)} <br />
     * 会員のフルネームの名称。<br />
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @param memberName The value of the column 'member_name'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (会員アカウント)member_account: {UQ, NotNull, varchar(50)} <br />
     * 会員がログイン時に利用するアカウントNO。<br />
     * 昨今、メールアドレスをログインIDとすることが多いので、あまり見かけなくないかも。
     * @return The value of the column 'member_account'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        checkSpecifiedProperty("memberAccount");
        return _memberAccount;
    }

    /**
     * [set] (会員アカウント)member_account: {UQ, NotNull, varchar(50)} <br />
     * 会員がログイン時に利用するアカウントNO。<br />
     * 昨今、メールアドレスをログインIDとすることが多いので、あまり見かけなくないかも。
     * @param memberAccount The value of the column 'member_account'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        registerModifiedProperty("memberAccount");
        _memberAccount = memberAccount;
    }

    /**
     * [get] (会員ステータスコード)member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * 会員ステータスを参照するコード。<br />
     * ステータスが変わるたびに、このカラムが更新される。
     * @return The value of the column 'member_status_code'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * 会員ステータスを参照するコード。<br />
     * ステータスが変わるたびに、このカラムが更新される。
     * @param memberStatusCode The value of the column 'member_status_code'. (basically NotNull if update: for the constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (正式会員日時)formalized_datetime: {IX, timestamp(26, 3)} <br />
     * 会員が正式に確定した日時。<br />
     * 一度確定したら更新されない。
     * @return The value of the column 'formalized_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)formalized_datetime: {IX, timestamp(26, 3)} <br />
     * 会員が正式に確定した日時。<br />
     * 一度確定したら更新されない。
     * @param formalizedDatetime The value of the column 'formalized_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (生年月日)birthdate: {date(13)} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of the column 'birthdate'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] (生年月日)birthdate: {date(13)} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @param birthdate The value of the column 'birthdate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] (登録日時)register_datetime: {NotNull, timestamp(26, 3)} <br />
     * レコードが登録された日時。<br />
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。<br />
     * どのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)register_datetime: {NotNull, timestamp(26, 3)} <br />
     * レコードが登録された日時。<br />
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。<br />
     * どのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)register_user: {NotNull, varchar(200)} <br />
     * レコードを登録したユーザ。<br />
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)register_user: {NotNull, varchar(200)} <br />
     * レコードを登録したユーザ。<br />
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
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
     * [get] (更新日時)update_datetime: {NotNull, timestamp(26, 3)} <br />
     * レコードが（最後に）更新された日時。<br />
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)update_datetime: {NotNull, timestamp(26, 3)} <br />
     * レコードが（最後に）更新された日時。<br />
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)update_user: {NotNull, varchar(200)} <br />
     * レコードを更新したユーザ。<br />
     * システムは誰が何をしたのかちゃんと覚えている。
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)update_user: {NotNull, varchar(200)} <br />
     * レコードを更新したユーザ。<br />
     * システムは誰が何をしたのかちゃんと覚えている。
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
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
     * [get] (バージョンNO)version_no: {NotNull, int8(19)} <br />
     * レコードのバージョンを示すNO。<br />
     * 更新回数と等しく、主に排他制御のために利用される。
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョンNO)version_no: {NotNull, int8(19)} <br />
     * レコードのバージョンを示すNO。<br />
     * 更新回数と等しく、主に排他制御のために利用される。
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'member_status_code'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMemberStatusCode(String memberStatusCode) {
        setMemberStatusCode(memberStatusCode);
    }
}
