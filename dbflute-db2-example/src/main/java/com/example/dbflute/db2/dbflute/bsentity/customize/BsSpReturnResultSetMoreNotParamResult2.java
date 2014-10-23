package com.example.dbflute.db2.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.db2.dbflute.allcommon.CDef;
import com.example.dbflute.db2.dbflute.exentity.customize.*;

/**
 * The entity of SpReturnResultSetMoreNotParamResult2. <br />
 * <pre>
 * [primary-key]
 *     
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
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSpReturnResultSetMoreNotParamResult2 extends AbstractEntity {

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
    /** (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER_STATUS.MEMBER_STATUS_CODE, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    protected String _memberStatusName;

    /** (説明)DESCRIPTION: {VARCHAR(200), refers to MEMBER_STATUS.DESCRIPTION} */
    protected String _description;

    /** (表示順)DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SpReturnResultSetMoreNotParamResult2";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "spReturnResultSetMoreNotParamResult2";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.db2.dbflute.bsentity.customize.dbmeta.SpReturnResultSetMoreNotParamResult2Dbm.getInstance();
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
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER_STATUS.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER_STATUS.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSpReturnResultSetMoreNotParamResult2) {
            BsSpReturnResultSetMoreNotParamResult2 other = (BsSpReturnResultSetMoreNotParamResult2)obj;
            if (!xSV(_memberStatusCode, other._memberStatusCode)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
            if (!xSV(_description, other._description)) { return false; }
            if (!xSV(_displayOrder, other._displayOrder)) { return false; }
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
        hs = xCH(hs, _memberStatusName);
        hs = xCH(hs, _description);
        hs = xCH(hs, _displayOrder);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
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
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SpReturnResultSetMoreNotParamResult2 clone() {
        return (SpReturnResultSetMoreNotParamResult2)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER_STATUS.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * 会員ステータスを識別するコード。
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER_STATUS.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * 会員ステータスを識別するコード。
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * 表示用の名称。
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * 表示用の名称。
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] (説明)DESCRIPTION: {VARCHAR(200), refers to MEMBER_STATUS.DESCRIPTION} <br />
     * 会員ステータスそれぞれの説明。<br />
     * 区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。
     * @return The value of the column 'DESCRIPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] (説明)DESCRIPTION: {VARCHAR(200), refers to MEMBER_STATUS.DESCRIPTION} <br />
     * 会員ステータスそれぞれの説明。<br />
     * 区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。
     * @param description The value of the column 'DESCRIPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        __modifiedProperties.addPropertyName("description");
        _description = description;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * UI上のステータスの表示順を示すNO。<br />
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * UI上のステータスの表示順を示すNO。<br />
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }
}
