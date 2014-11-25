package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.allcommon.CDef;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * 固定の区分値
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 * 
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, SYNONYM_MEMBER_LOGIN, VENDOR_SYNONYM_MEMBER
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberList, memberLoginList, memberVendorSynonymList, synonymMemberList, synonymMemberLoginList, vendorSynonymMemberList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * String description = entity.getDescription();
 * Long displayOrder = entity.getDisplayOrder();
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsMemberStatus extends AbstractEntity implements DomainEntity {

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
    /** MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} */
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} */
    protected String _memberStatusName;

    /** DESCRIPTION: {NotNull, VARCHAR2(200)} */
    protected String _description;

    /** DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} */
    protected Long _displayOrder;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MEMBER_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberStatus";
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
        if (getMemberStatusCode() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder : UQ, NotNull, NUMBER(16). (NotNull)
     */
    public void uniqueByDisplayOrder(Long displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberStatusName : UQ, NotNull, VARCHAR2(50). (NotNull)
     */
    public void uniqueByMemberStatusName(String memberStatusName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberStatusName");
        setMemberStatusName(memberStatusName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'. */
    protected List<Member> _memberList;

    /**
     * [get] (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The entity list of referrer property 'memberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Member> getMemberList() {
        if (_memberList == null) { _memberList = newReferrerList(); }
        return _memberList;
    }

    /**
     * [set] (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @param memberList The entity list of referrer property 'memberList'. (NullAllowed)
     */
    public void setMemberList(List<Member> memberList) {
        _memberList = memberList;
    }

    /** (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * [get] (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'. */
    protected List<MemberVendorSynonym> _memberVendorSynonymList;

    /**
     * [get] (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'.
     * @return The entity list of referrer property 'memberVendorSynonymList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberVendorSynonym> getMemberVendorSynonymList() {
        if (_memberVendorSynonymList == null) { _memberVendorSynonymList = newReferrerList(); }
        return _memberVendorSynonymList;
    }

    /**
     * [set] (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'.
     * @param memberVendorSynonymList The entity list of referrer property 'memberVendorSynonymList'. (NullAllowed)
     */
    public void setMemberVendorSynonymList(List<MemberVendorSynonym> memberVendorSynonymList) {
        _memberVendorSynonymList = memberVendorSynonymList;
    }

    /** (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'. */
    protected List<SynonymMember> _synonymMemberList;

    /**
     * [get] (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'.
     * @return The entity list of referrer property 'synonymMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymMember> getSynonymMemberList() {
        if (_synonymMemberList == null) { _synonymMemberList = newReferrerList(); }
        return _synonymMemberList;
    }

    /**
     * [set] (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'.
     * @param synonymMemberList The entity list of referrer property 'synonymMemberList'. (NullAllowed)
     */
    public void setSynonymMemberList(List<SynonymMember> synonymMemberList) {
        _synonymMemberList = synonymMemberList;
    }

    /** (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'. */
    protected List<SynonymMemberLogin> _synonymMemberLoginList;

    /**
     * [get] (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'.
     * @return The entity list of referrer property 'synonymMemberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymMemberLogin> getSynonymMemberLoginList() {
        if (_synonymMemberLoginList == null) { _synonymMemberLoginList = newReferrerList(); }
        return _synonymMemberLoginList;
    }

    /**
     * [set] (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'.
     * @param synonymMemberLoginList The entity list of referrer property 'synonymMemberLoginList'. (NullAllowed)
     */
    public void setSynonymMemberLoginList(List<SynonymMemberLogin> synonymMemberLoginList) {
        _synonymMemberLoginList = synonymMemberLoginList;
    }

    /** (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'. */
    protected List<VendorSynonymMember> _vendorSynonymMemberList;

    /**
     * [get] (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'.
     * @return The entity list of referrer property 'vendorSynonymMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorSynonymMember> getVendorSynonymMemberList() {
        if (_vendorSynonymMemberList == null) { _vendorSynonymMemberList = newReferrerList(); }
        return _vendorSynonymMemberList;
    }

    /**
     * [set] (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'.
     * @param vendorSynonymMemberList The entity list of referrer property 'vendorSynonymMemberList'. (NullAllowed)
     */
    public void setVendorSynonymMemberList(List<VendorSynonymMember> vendorSynonymMemberList) {
        _vendorSynonymMemberList = vendorSynonymMemberList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberStatus) {
            BsMemberStatus other = (BsMemberStatus)obj;
            if (!xSV(_memberStatusCode, other._memberStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberList != null) { for (Member et : _memberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberList")); } } }
        if (_memberLoginList != null) { for (MemberLogin et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        if (_memberVendorSynonymList != null) { for (MemberVendorSynonym et : _memberVendorSynonymList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberVendorSynonymList")); } } }
        if (_synonymMemberList != null) { for (SynonymMember et : _synonymMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "synonymMemberList")); } } }
        if (_synonymMemberLoginList != null) { for (SynonymMemberLogin et : _synonymMemberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "synonymMemberLoginList")); } } }
        if (_vendorSynonymMemberList != null) { for (VendorSynonymMember et : _vendorSynonymMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorSynonymMemberList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_memberStatusName));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
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
        if (_memberList != null && !_memberList.isEmpty())
        { sb.append(dm).append("memberList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(dm).append("memberLoginList"); }
        if (_memberVendorSynonymList != null && !_memberVendorSynonymList.isEmpty())
        { sb.append(dm).append("memberVendorSynonymList"); }
        if (_synonymMemberList != null && !_synonymMemberList.isEmpty())
        { sb.append(dm).append("synonymMemberList"); }
        if (_synonymMemberLoginList != null && !_synonymMemberLoginList.isEmpty())
        { sb.append(dm).append("synonymMemberLoginList"); }
        if (_vendorSynonymMemberList != null && !_vendorSynonymMemberList.isEmpty())
        { sb.append(dm).append("vendorSynonymMemberList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberStatus clone() {
        return (MemberStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] DESCRIPTION: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] DESCRIPTION: {NotNull, VARCHAR2(200)} <br />
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Long getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Long displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }
}
