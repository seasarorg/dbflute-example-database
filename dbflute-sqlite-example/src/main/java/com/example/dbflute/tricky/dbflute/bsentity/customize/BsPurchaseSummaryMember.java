package com.example.dbflute.tricky.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.tricky.dbflute.exentity.customize.*;

/**
 * The entity of PurchaseSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, PURCHASE_SUMMARY
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
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * Long purchaseSummary = entity.getPurchaseSummary();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setPurchaseSummary(purchaseSummary);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchaseSummaryMember extends AbstractEntity {

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
    /** MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID} */
    protected Integer _memberId;

    /** MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME} */
    protected String _memberName;

    /** BIRTHDATE: {null(2147483647), refers to MEMBER.BIRTHDATE} */
    protected java.util.Date _birthdate;

    /** FORMALIZED_DATETIME: {null(2147483647), refers to MEMBER.FORMALIZED_DATETIME} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** PURCHASE_SUMMARY: {null(2147483647)} */
    protected Long _purchaseSummary;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PurchaseSummaryMember";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "purchaseSummaryMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.tricky.dbflute.bsentity.customize.dbmeta.PurchaseSummaryMemberDbm.getInstance();
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
        if (obj instanceof BsPurchaseSummaryMember) {
            BsPurchaseSummaryMember other = (BsPurchaseSummaryMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_birthdate, other._birthdate)) { return false; }
            if (!xSV(_formalizedDatetime, other._formalizedDatetime)) { return false; }
            if (!xSV(_purchaseSummary, other._purchaseSummary)) { return false; }
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
        hs = xCH(hs, _purchaseSummary);
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
        sb.append(dm).append(xfND(_purchaseSummary));
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
    public PurchaseSummaryMember clone() {
        return (PurchaseSummaryMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] BIRTHDATE: {null(2147483647), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {null(2147483647), refers to MEMBER.BIRTHDATE} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        __modifiedProperties.addPropertyName("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] FORMALIZED_DATETIME: {null(2147483647), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {null(2147483647), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] PURCHASE_SUMMARY: {null(2147483647)} <br />
     * @return The value of the column 'PURCHASE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPurchaseSummary() {
        checkSpecifiedProperty("purchaseSummary");
        return _purchaseSummary;
    }

    /**
     * [set] PURCHASE_SUMMARY: {null(2147483647)} <br />
     * @param purchaseSummary The value of the column 'PURCHASE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseSummary(Long purchaseSummary) {
        __modifiedProperties.addPropertyName("purchaseSummary");
        _purchaseSummary = purchaseSummary;
    }
}
