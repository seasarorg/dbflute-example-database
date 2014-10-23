package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of SpResultSetParameterWithCurMemberStatus. <br />
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
 * Long displayOrder = entity.getDisplayOrder();
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSpResultSetParameterWithCurMemberStatus extends AbstractEntity {

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
    /** MEMBER_STATUS_CODE: {CHAR(3)} */
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {VARCHAR2(50)} */
    protected String _memberStatusName;

    /** DESCRIPTION: {VARCHAR2(200)} */
    protected String _description;

    /** DISPLAY_ORDER: {NUMBER(16)} */
    protected Long _displayOrder;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SpResultSetParameterWithCurMemberStatus";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "spResultSetParameterWithCurMemberStatus";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.SpResultSetParameterWithCurMemberStatusDbm.getInstance();
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
        if (obj instanceof BsSpResultSetParameterWithCurMemberStatus) {
            BsSpResultSetParameterWithCurMemberStatus other = (BsSpResultSetParameterWithCurMemberStatus)obj;
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
    protected String myutilDatePattern() {
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SpResultSetParameterWithCurMemberStatus clone() {
        return (SpResultSetParameterWithCurMemberStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
        __modifiedProperties.addPropertyName("memberStatusCode");
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
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] DESCRIPTION: {VARCHAR2(200)} <br />
     * @return The value of the column 'DESCRIPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] DESCRIPTION: {VARCHAR2(200)} <br />
     * @param description The value of the column 'DESCRIPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        __modifiedProperties.addPropertyName("description");
        _description = description;
    }

    /**
     * [get] DISPLAY_ORDER: {NUMBER(16)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NUMBER(16)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDisplayOrder(Long displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }
}
