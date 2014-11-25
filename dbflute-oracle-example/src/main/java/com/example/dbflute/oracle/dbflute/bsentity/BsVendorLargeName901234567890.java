package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of VENDOR_LARGE_NAME_901234567890 as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_LARGE_NAME_901234567_ID
 * 
 * [column]
 *     VENDOR_LARGE_NAME_901234567_ID, VENDOR_LARGE_NAME_9012345_NAME
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
 *     VENDOR_LARGE_NAME_90123456_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorLargeName90123456RefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorLargeName901234567Id = entity.getVendorLargeName901234567Id();
 * String vendorLargeName9012345Name = entity.getVendorLargeName9012345Name();
 * entity.setVendorLargeName901234567Id(vendorLargeName901234567Id);
 * entity.setVendorLargeName9012345Name(vendorLargeName9012345Name);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName901234567890 extends AbstractEntity implements DomainEntity {

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
    /** VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _vendorLargeName901234567Id;

    /** VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} */
    protected String _vendorLargeName9012345Name;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_LARGE_NAME_901234567890";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeName901234567890";
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
        if (getVendorLargeName901234567Id() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'. */
    protected List<VendorLargeName90123456Ref> _vendorLargeName90123456RefList;

    /**
     * [get] VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * @return The entity list of referrer property 'vendorLargeName90123456RefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeName90123456Ref> getVendorLargeName90123456RefList() {
        if (_vendorLargeName90123456RefList == null) { _vendorLargeName90123456RefList = newReferrerList(); }
        return _vendorLargeName90123456RefList;
    }

    /**
     * [set] VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * @param vendorLargeName90123456RefList The entity list of referrer property 'vendorLargeName90123456RefList'. (NullAllowed)
     */
    public void setVendorLargeName90123456RefList(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        _vendorLargeName90123456RefList = vendorLargeName90123456RefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorLargeName901234567890) {
            BsVendorLargeName901234567890 other = (BsVendorLargeName901234567890)obj;
            if (!xSV(_vendorLargeName901234567Id, other._vendorLargeName901234567Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendorLargeName901234567Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeName90123456RefList != null) { for (VendorLargeName90123456Ref et : _vendorLargeName90123456RefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeName90123456RefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorLargeName901234567Id));
        sb.append(dm).append(xfND(_vendorLargeName9012345Name));
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
        if (_vendorLargeName90123456RefList != null && !_vendorLargeName90123456RefList.isEmpty())
        { sb.append(dm).append("vendorLargeName90123456RefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeName901234567890 clone() {
        return (VendorLargeName901234567890)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorLargeName901234567Id() {
        checkSpecifiedProperty("vendorLargeName901234567Id");
        return _vendorLargeName901234567Id;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param vendorLargeName901234567Id The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName901234567Id(Long vendorLargeName901234567Id) {
        registerModifiedProperty("vendorLargeName901234567Id");
        _vendorLargeName901234567Id = vendorLargeName901234567Id;
    }

    /**
     * [get] VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_9012345_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getVendorLargeName9012345Name() {
        checkSpecifiedProperty("vendorLargeName9012345Name");
        return _vendorLargeName9012345Name;
    }

    /**
     * [set] VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br />
     * @param vendorLargeName9012345Name The value of the column 'VENDOR_LARGE_NAME_9012345_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName9012345Name(String vendorLargeName9012345Name) {
        registerModifiedProperty("vendorLargeName9012345Name");
        _vendorLargeName9012345Name = vendorLargeName9012345Name;
    }
}
