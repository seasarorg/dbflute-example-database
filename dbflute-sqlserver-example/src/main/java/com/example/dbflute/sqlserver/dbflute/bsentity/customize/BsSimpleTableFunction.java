package com.example.dbflute.sqlserver.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.sqlserver.dbflute.allcommon.CDef;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.*;

/**
 * The entity of SimpleTableFunction. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_CODE
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
 * String memberStatusCode = entity.getMemberStatusCode();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberStatusCode(memberStatusCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSimpleTableFunction extends AbstractEntity {

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

    /** MEMBER_NAME: {varchar(200)} */
    protected String _memberName;

    /** MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} */
    protected String _memberStatusCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SimpleTableFunction";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "simpleTableFunction";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.sqlserver.dbflute.bsentity.customize.dbmeta.SimpleTableFunctionDbm.getInstance();
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br />
     * 会員の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br />
     * 会員の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * 仮会員: 仮会員を示す
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * Set the value of memberStatusCode as Formalized (FML). <br />
     * 正式会員: 正式会員を示す
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * 退会会員: 退会会員を示す
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Provisional? <br />
     * 仮会員: 仮会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
    }

    /**
     * Is the value of memberStatusCode Formalized? <br />
     * 正式会員: 正式会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * 退会会員: 退会会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'memberStatusCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMemberStatusCodeName() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'memberStatusCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getMemberStatusCodeAlias() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.alias() : null;
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
        if (obj instanceof BsSimpleTableFunction) {
            BsSimpleTableFunction other = (BsSimpleTableFunction)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
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
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _memberStatusCode);
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
        sb.append(dm).append(xfND(_memberStatusCode));
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
    public SimpleTableFunction clone() {
        return (SimpleTableFunction)super.clone();
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
     * [get] MEMBER_NAME: {varchar(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {varchar(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {char(3), classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }
}
