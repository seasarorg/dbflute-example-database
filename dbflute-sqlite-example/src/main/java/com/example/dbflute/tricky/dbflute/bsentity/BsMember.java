package com.example.dbflute.tricky.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.tricky.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.allcommon.CDef;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of MEMBER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, MEMBER_REGISTER_DATETIME, MEMBER_REGISTER_USER, MEMBER_REGISTER_PROCESS, MEMBER_UPDATE_DATETIME, MEMBER_UPDATE_USER, MEMBER_UPDATE_PROCESS, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_ADDRESS(AsValid), MEMBER_SECURITY(AsOne), MEMBER_WITHDRAWAL(AsOne)
 * 
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_LOGIN, MEMBER_SERVICE, PURCHASE, MEMBER_SECURITY, MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberSecurityAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberLoginList, memberServiceList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp memberRegisterDatetime = entity.getMemberRegisterDatetime();
 * String memberRegisterUser = entity.getMemberRegisterUser();
 * String memberRegisterProcess = entity.getMemberRegisterProcess();
 * java.sql.Timestamp memberUpdateDatetime = entity.getMemberUpdateDatetime();
 * String memberUpdateUser = entity.getMemberUpdateUser();
 * String memberUpdateProcess = entity.getMemberUpdateProcess();
 * Integer versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setBirthdate(birthdate);
 * entity.setMemberRegisterDatetime(memberRegisterDatetime);
 * entity.setMemberRegisterUser(memberRegisterUser);
 * entity.setMemberRegisterProcess(memberRegisterProcess);
 * entity.setMemberUpdateDatetime(memberUpdateDatetime);
 * entity.setMemberUpdateUser(memberUpdateUser);
 * entity.setMemberUpdateProcess(memberUpdateProcess);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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
    /** MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS} */
    protected Integer _memberId;

    /** MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberName;

    /** MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} */
    protected String _memberAccount;

    /** MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** FORMALIZED_DATETIME: {DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** BIRTHDATE: {DATE(2000000000, 10)} */
    protected java.util.Date _birthdate;

    /** MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _memberRegisterDatetime;

    /** MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberRegisterUser;

    /** MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberRegisterProcess;

    /** MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _memberUpdateDatetime;

    /** MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberUpdateUser;

    /** MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberUpdateProcess;

    /** VERSION_NO: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _versionNo;

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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount : UQ, NotNull, TEXT(2000000000, 10). (NotNull)
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
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as ProvisionalMember (PRV). <br />
     * Provisional Member
     */
    public void setMemberStatusCode_ProvisionalMember() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Same as setMemberStatusCode_ProvisionalMember. <br />
     * Provisional Member
     */
    public void classifyMemberStatusCodeProvisionalMember() {
        setMemberStatusCode_ProvisionalMember();
    }

    /**
     * Set the value of memberStatusCode as FormalizedMember (FML). <br />
     * Formalized Member
     */
    public void setMemberStatusCode_FormalizedMember() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.FormalizedMember);
    }

    /**
     * Same as setMemberStatusCode_FormalizedMember. <br />
     * Formalized Member
     */
    public void classifyMemberStatusCodeFormalizedMember() {
        setMemberStatusCode_FormalizedMember();
    }

    /**
     * Set the value of memberStatusCode as WithdrawalMember (WDL). <br />
     * Withdrawal Member
     */
    public void setMemberStatusCode_WithdrawalMember() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.WithdrawalMember);
    }

    /**
     * Same as setMemberStatusCode_WithdrawalMember. <br />
     * Withdrawal Member
     */
    public void classifyMemberStatusCodeWithdrawalMember() {
        setMemberStatusCode_WithdrawalMember();
    }

    /**
     * Same as setMemberStatusCodeAsMemberStatus(cdef). <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void classifyMemberStatusCode(CDef.MemberStatus cdef) {
        setMemberStatusCodeAsMemberStatus(cdef);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode ProvisionalMember? <br />
     * Provisional Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisionalMember() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.ProvisionalMember) : false;
    }

    /**
     * Is the value of memberStatusCode FormalizedMember? <br />
     * Formalized Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalizedMember() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.FormalizedMember) : false;
    }

    /**
     * Is the value of memberStatusCode WithdrawalMember? <br />
     * Withdrawal Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawalMember() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.WithdrawalMember) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected MemberStatus _memberStatus;

    /**
     * [get] MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberStatus getMemberStatus() {
        return _memberStatus;
    }

    /**
     * [set] MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(MemberStatus memberStatus) {
        _memberStatus = memberStatus;
    }

    public MemberStatus chaseMemberStatus() {
        return _memberStatus != null ? _memberStatus : new MemberStatus();
    }

    /** MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'. */
    protected MemberAddress _memberAddressAsValid;

    /**
     * [get] MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @return The entity of foreign property 'memberAddressAsValid'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsValid() {
        return _memberAddressAsValid;
    }

    /**
     * [set] MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param memberAddressAsValid The entity of foreign property 'memberAddressAsValid'. (NullAllowed)
     */
    public void setMemberAddressAsValid(MemberAddress memberAddressAsValid) {
        _memberAddressAsValid = memberAddressAsValid;
    }

    public MemberAddress chaseMemberAddressAsValid() {
        return _memberAddressAsValid != null ? _memberAddressAsValid : new MemberAddress();
    }

    /** MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'. */
    protected MemberSecurity _memberSecurityAsOne;

    /**
     * [get] MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberSecurity getMemberSecurityAsOne() {
        return _memberSecurityAsOne;
    }

    /**
     * [set] MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed)
     */
    public void setMemberSecurityAsOne(MemberSecurity memberSecurityAsOne) {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    public MemberSecurity chaseMemberSecurityAsOne() {
        return _memberSecurityAsOne != null ? _memberSecurityAsOne : new MemberSecurity();
    }

    /** MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'. */
    protected MemberWithdrawal _memberWithdrawalAsOne;

    /**
     * [get] MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberWithdrawal getMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne;
    }

    /**
     * [set] MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed)
     */
    public void setMemberWithdrawalAsOne(MemberWithdrawal memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    public MemberWithdrawal chaseMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne != null ? _memberWithdrawalAsOne : new MemberWithdrawal();
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'. */
    protected List<MemberAddress> _memberAddressList;

    /**
     * [get] MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * [set] MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<MemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    /** MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * [get] MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'. */
    protected List<MemberService> _memberServiceList;

    /**
     * [get] MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberService> getMemberServiceList() {
        if (_memberServiceList == null) { _memberServiceList = newReferrerList(); }
        return _memberServiceList;
    }

    /**
     * [set] MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @param memberServiceList The entity list of referrer property 'memberServiceList'. (NullAllowed)
     */
    public void setMemberServiceList(List<MemberService> memberServiceList) {
        _memberServiceList = memberServiceList;
    }

    /** PURCHASE by MEMBER_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] PURCHASE by MEMBER_ID, named 'purchaseList'.
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
        if (_memberSecurityAsOne != null)
        { sb.append(li).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberWithdrawalAsOne != null)
        { sb.append(li).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        if (_memberAddressList != null) { for (MemberAddress et : _memberAddressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")); } } }
        if (_memberLoginList != null) { for (MemberLogin et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        if (_memberServiceList != null) { for (MemberService et : _memberServiceList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberServiceList")); } } }
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
        sb.append(dm).append(xfND(_memberRegisterDatetime));
        sb.append(dm).append(xfND(_memberRegisterUser));
        sb.append(dm).append(xfND(_memberRegisterProcess));
        sb.append(dm).append(xfND(_memberUpdateDatetime));
        sb.append(dm).append(xfND(_memberUpdateUser));
        sb.append(dm).append(xfND(_memberUpdateProcess));
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
        if (_memberSecurityAsOne != null)
        { sb.append(dm).append("memberSecurityAsOne"); }
        if (_memberWithdrawalAsOne != null)
        { sb.append(dm).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(dm).append("memberAddressList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(dm).append("memberLoginList"); }
        if (_memberServiceList != null && !_memberServiceList.isEmpty())
        { sb.append(dm).append("memberServiceList"); }
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
     * [get] MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        checkSpecifiedProperty("memberAccount");
        return _memberAccount;
    }

    /**
     * [set] MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br />
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        registerModifiedProperty("memberAccount");
        _memberAccount = memberAccount;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] FORMALIZED_DATETIME: {DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {DATETIME(2000000000, 10)} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] BIRTHDATE: {DATE(2000000000, 10)} <br />
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(2000000000, 10)} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getMemberRegisterDatetime() {
        checkSpecifiedProperty("memberRegisterDatetime");
        return _memberRegisterDatetime;
    }

    /**
     * [set] MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param memberRegisterDatetime The value of the column 'MEMBER_REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberRegisterDatetime(java.sql.Timestamp memberRegisterDatetime) {
        registerModifiedProperty("memberRegisterDatetime");
        _memberRegisterDatetime = memberRegisterDatetime;
    }

    /**
     * [get] MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberRegisterUser() {
        checkSpecifiedProperty("memberRegisterUser");
        return _memberRegisterUser;
    }

    /**
     * [set] MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param memberRegisterUser The value of the column 'MEMBER_REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setMemberRegisterUser(String memberRegisterUser) {
        registerModifiedProperty("memberRegisterUser");
        _memberRegisterUser = memberRegisterUser;
    }

    /**
     * [get] MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberRegisterProcess() {
        checkSpecifiedProperty("memberRegisterProcess");
        return _memberRegisterProcess;
    }

    /**
     * [set] MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @param memberRegisterProcess The value of the column 'MEMBER_REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setMemberRegisterProcess(String memberRegisterProcess) {
        registerModifiedProperty("memberRegisterProcess");
        _memberRegisterProcess = memberRegisterProcess;
    }

    /**
     * [get] MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getMemberUpdateDatetime() {
        checkSpecifiedProperty("memberUpdateDatetime");
        return _memberUpdateDatetime;
    }

    /**
     * [set] MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param memberUpdateDatetime The value of the column 'MEMBER_UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberUpdateDatetime(java.sql.Timestamp memberUpdateDatetime) {
        registerModifiedProperty("memberUpdateDatetime");
        _memberUpdateDatetime = memberUpdateDatetime;
    }

    /**
     * [get] MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberUpdateUser() {
        checkSpecifiedProperty("memberUpdateUser");
        return _memberUpdateUser;
    }

    /**
     * [set] MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param memberUpdateUser The value of the column 'MEMBER_UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setMemberUpdateUser(String memberUpdateUser) {
        registerModifiedProperty("memberUpdateUser");
        _memberUpdateUser = memberUpdateUser;
    }

    /**
     * [get] MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'MEMBER_UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberUpdateProcess() {
        checkSpecifiedProperty("memberUpdateProcess");
        return _memberUpdateProcess;
    }

    /**
     * [set] MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @param memberUpdateProcess The value of the column 'MEMBER_UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setMemberUpdateProcess(String memberUpdateProcess) {
        registerModifiedProperty("memberUpdateProcess");
        _memberUpdateProcess = memberUpdateProcess;
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
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * {@inheritDoc}
     */
    public java.sql.Timestamp getTableNameRegisterDatetime() {
        return getMemberRegisterDatetime();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameRegisterDatetime(java.sql.Timestamp tableNameRegisterDatetime) {
        setMemberRegisterDatetime(tableNameRegisterDatetime);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameRegisterUser() {
        return getMemberRegisterUser();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameRegisterUser(String tableNameRegisterUser) {
        setMemberRegisterUser(tableNameRegisterUser);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameRegisterProcess() {
        return getMemberRegisterProcess();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameRegisterProcess(String tableNameRegisterProcess) {
        setMemberRegisterProcess(tableNameRegisterProcess);
    }

    /**
     * {@inheritDoc}
     */
    public java.sql.Timestamp getTableNameUpdateDatetime() {
        return getMemberUpdateDatetime();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameUpdateDatetime(java.sql.Timestamp tableNameUpdateDatetime) {
        setMemberUpdateDatetime(tableNameUpdateDatetime);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameUpdateUser() {
        return getMemberUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameUpdateUser(String tableNameUpdateUser) {
        setMemberUpdateUser(tableNameUpdateUser);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameUpdateProcess() {
        return getMemberUpdateProcess();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameUpdateProcess(String tableNameUpdateProcess) {
        setMemberUpdateProcess(tableNameUpdateProcess);
    }
}
