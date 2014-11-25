package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of VENDOR_LARGE_NAME_90123456_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_LARGE_NAME_90123_REF_ID
 * 
 * [column]
 *     VENDOR_LARGE_NAME_90123_REF_ID, VENDOR_LARGE_NAME_901_REF_NAME, VENDOR_LARGE_NAME_901234567_ID
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
 *     VENDOR_LARGE_NAME_901234567890
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorLargeName901234567890
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorLargeName90123RefId = entity.getVendorLargeName90123RefId();
 * String vendorLargeName901RefName = entity.getVendorLargeName901RefName();
 * Long vendorLargeName901234567Id = entity.getVendorLargeName901234567Id();
 * entity.setVendorLargeName90123RefId(vendorLargeName90123RefId);
 * entity.setVendorLargeName901RefName(vendorLargeName901RefName);
 * entity.setVendorLargeName901234567Id(vendorLargeName901234567Id);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName90123456Ref extends AbstractEntity implements DomainEntity {

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
    /** VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _vendorLargeName90123RefId;

    /** VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} */
    protected String _vendorLargeName901RefName;

    /** VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890} */
    protected Long _vendorLargeName901234567Id;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_LARGE_NAME_90123456_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeName90123456Ref";
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
        if (getVendorLargeName90123RefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'. */
    protected VendorLargeName901234567890 _vendorLargeName901234567890;

    /**
     * [get] VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @return The entity of foreign property 'vendorLargeName901234567890'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeName901234567890 getVendorLargeName901234567890() {
        return _vendorLargeName901234567890;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @param vendorLargeName901234567890 The entity of foreign property 'vendorLargeName901234567890'. (NullAllowed)
     */
    public void setVendorLargeName901234567890(VendorLargeName901234567890 vendorLargeName901234567890) {
        _vendorLargeName901234567890 = vendorLargeName901234567890;
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
        if (obj instanceof BsVendorLargeName90123456Ref) {
            BsVendorLargeName90123456Ref other = (BsVendorLargeName90123456Ref)obj;
            if (!xSV(_vendorLargeName90123RefId, other._vendorLargeName90123RefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendorLargeName90123RefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeName901234567890 != null)
        { sb.append(li).append(xbRDS(_vendorLargeName901234567890, "vendorLargeName901234567890")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorLargeName90123RefId));
        sb.append(dm).append(xfND(_vendorLargeName901RefName));
        sb.append(dm).append(xfND(_vendorLargeName901234567Id));
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
        if (_vendorLargeName901234567890 != null)
        { sb.append(dm).append("vendorLargeName901234567890"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeName90123456Ref clone() {
        return (VendorLargeName90123456Ref)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_90123_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorLargeName90123RefId() {
        checkSpecifiedProperty("vendorLargeName90123RefId");
        return _vendorLargeName90123RefId;
    }

    /**
     * [set] VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param vendorLargeName90123RefId The value of the column 'VENDOR_LARGE_NAME_90123_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName90123RefId(Long vendorLargeName90123RefId) {
        registerModifiedProperty("vendorLargeName90123RefId");
        _vendorLargeName90123RefId = vendorLargeName90123RefId;
    }

    /**
     * [get] VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_901_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getVendorLargeName901RefName() {
        checkSpecifiedProperty("vendorLargeName901RefName");
        return _vendorLargeName901RefName;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} <br />
     * @param vendorLargeName901RefName The value of the column 'VENDOR_LARGE_NAME_901_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName901RefName(String vendorLargeName901RefName) {
        registerModifiedProperty("vendorLargeName901RefName");
        _vendorLargeName901RefName = vendorLargeName901RefName;
    }

    /**
     * [get] VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorLargeName901234567Id() {
        checkSpecifiedProperty("vendorLargeName901234567Id");
        return _vendorLargeName901234567Id;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890} <br />
     * @param vendorLargeName901234567Id The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorLargeName901234567Id(Long vendorLargeName901234567Id) {
        registerModifiedProperty("vendorLargeName901234567Id");
        _vendorLargeName901234567Id = vendorLargeName901234567Id;
    }
}
