package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.CDef;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of OptionMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, STATUS_DISPLAY_ORDER, DUMMY_FLG, DUMMY_NOFLG
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
 * Long memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * Long statusDisplayOrder = entity.getStatusDisplayOrder();
 * java.math.BigDecimal dummyFlg = entity.getDummyFlg();
 * java.math.BigDecimal dummyNoflg = entity.getDummyNoflg();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setStatusDisplayOrder(statusDisplayOrder);
 * entity.setDummyFlg(dummyFlg);
 * entity.setDummyNoflg(dummyNoflg);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsOptionMember extends AbstractEntity {

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
    /** MEMBER_ID: {NUMBER(16)} */
    protected Long _memberId;

    /** MEMBER_NAME: {VARCHAR2(200)} */
    protected String _memberName;

    /** BIRTHDATE: {DATE(7)} */
    protected java.util.Date _birthdate;

    /** FORMALIZED_DATETIME: {TIMESTAMP(11, 3)} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** MEMBER_STATUS_CODE: {CHAR(3)} */
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {VARCHAR2(50)} */
    protected String _memberStatusName;

    /** STATUS_DISPLAY_ORDER: {NUMBER(16)} */
    protected Long _statusDisplayOrder;

    /** DUMMY_FLG: {NUMBER(22), classification=Flg} */
    protected java.math.BigDecimal _dummyFlg;

    /** DUMMY_NOFLG: {NUMBER(22)} */
    protected java.math.BigDecimal _dummyNoflg;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "OptionMember";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "optionMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.OptionMemberDbm.getInstance();
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
     * Get the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {NUMBER(22), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDummyFlgAsFlg() {
        return CDef.Flg.codeOf(getDummyFlg());
    }

    /**
     * Set the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {NUMBER(22), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDummyFlgAsFlg(CDef.Flg cdef) {
        setDummyFlg(cdef != null ? toNumber(cdef.code(), java.math.BigDecimal.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of dummyFlg as True (1). <br />
     * Yes: means valid
     */
    public void setDummyFlg_True() {
        setDummyFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of dummyFlg as False (0). <br />
     * No: means invalid
     */
    public void setDummyFlg_False() {
        setDummyFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of dummyFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgTrue() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of dummyFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgFalse() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'dummyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDummyFlgName() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'dummyFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDummyFlgAlias() {
        CDef.Flg cdef = getDummyFlgAsFlg();
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
        if (obj instanceof BsOptionMember) {
            BsOptionMember other = (BsOptionMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_birthdate, other._birthdate)) { return false; }
            if (!xSV(_formalizedDatetime, other._formalizedDatetime)) { return false; }
            if (!xSV(_memberStatusCode, other._memberStatusCode)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
            if (!xSV(_statusDisplayOrder, other._statusDisplayOrder)) { return false; }
            if (!xSV(_dummyFlg, other._dummyFlg)) { return false; }
            if (!xSV(_dummyNoflg, other._dummyNoflg)) { return false; }
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
        hs = xCH(hs, _birthdate);
        hs = xCH(hs, _formalizedDatetime);
        hs = xCH(hs, _memberStatusCode);
        hs = xCH(hs, _memberStatusName);
        hs = xCH(hs, _statusDisplayOrder);
        hs = xCH(hs, _dummyFlg);
        hs = xCH(hs, _dummyNoflg);
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
        sb.append(dm).append(xfUD(_birthdate));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_memberStatusName));
        sb.append(dm).append(xfND(_statusDisplayOrder));
        sb.append(dm).append(xfND(_dummyFlg));
        sb.append(dm).append(xfND(_dummyNoflg));
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
        return "";
    }

    @Override
    public OptionMember clone() {
        return (OptionMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {NUMBER(16)} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NUMBER(16)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR2(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {VARCHAR2(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] BIRTHDATE: {DATE(7)} <br />
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(7)} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] FORMALIZED_DATETIME: {TIMESTAMP(11, 3)} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {TIMESTAMP(11, 3)} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR2(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {VARCHAR2(50)} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] STATUS_DISPLAY_ORDER: {NUMBER(16)} <br />
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStatusDisplayOrder() {
        checkSpecifiedProperty("statusDisplayOrder");
        return _statusDisplayOrder;
    }

    /**
     * [set] STATUS_DISPLAY_ORDER: {NUMBER(16)} <br />
     * @param statusDisplayOrder The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusDisplayOrder(Long statusDisplayOrder) {
        registerModifiedProperty("statusDisplayOrder");
        _statusDisplayOrder = statusDisplayOrder;
    }

    /**
     * [get] DUMMY_FLG: {NUMBER(22), classification=Flg} <br />
     * @return The value of the column 'DUMMY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDummyFlg() {
        checkSpecifiedProperty("dummyFlg");
        return _dummyFlg;
    }

    /**
     * [set] DUMMY_FLG: {NUMBER(22), classification=Flg} <br />
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDummyFlg(java.math.BigDecimal dummyFlg) {
        checkClassificationCode("DUMMY_FLG", CDef.DefMeta.Flg, dummyFlg);
        registerModifiedProperty("dummyFlg");
        _dummyFlg = dummyFlg;
    }

    /**
     * [get] DUMMY_NOFLG: {NUMBER(22)} <br />
     * @return The value of the column 'DUMMY_NOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDummyNoflg() {
        checkSpecifiedProperty("dummyNoflg");
        return _dummyNoflg;
    }

    /**
     * [set] DUMMY_NOFLG: {NUMBER(22)} <br />
     * @param dummyNoflg The value of the column 'DUMMY_NOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDummyNoflg(java.math.BigDecimal dummyNoflg) {
        registerModifiedProperty("dummyNoflg");
        _dummyNoflg = dummyNoflg;
    }
}
