package com.example.dbflute.sqlserver.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.sqlserver.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The entity of VENDOR_SYMMETRIC as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_SYMMETRIC_ID
 * 
 * [column]
 *     VENDOR_SYMMETRIC_ID, PLAIN_TEXT, ENCRYPTED_DATA
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
 * Long vendorSymmetricId = entity.getVendorSymmetricId();
 * String plainText = entity.getPlainText();
 * String encryptedData = entity.getEncryptedData();
 * entity.setVendorSymmetricId(vendorSymmetricId);
 * entity.setPlainText(plainText);
 * entity.setEncryptedData(encryptedData);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorSymmetric extends AbstractEntity implements DomainEntity {

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
    /** VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)} */
    protected Long _vendorSymmetricId;

    /** PLAIN_TEXT: {nvarchar(100)} */
    protected String _plainText;

    /** ENCRYPTED_DATA: {varbinary(2147483647)} */
    protected String _encryptedData;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_SYMMETRIC";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorSymmetric";
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
        if (getVendorSymmetricId() == null) { return false; }
        return true;
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
        if (obj instanceof BsVendorSymmetric) {
            BsVendorSymmetric other = (BsVendorSymmetric)obj;
            if (!xSV(_vendorSymmetricId, other._vendorSymmetricId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendorSymmetricId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorSymmetricId));
        sb.append(dm).append(xfND(_plainText));
        sb.append(dm).append(xfND(_encryptedData));
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
    public VendorSymmetric clone() {
        return (VendorSymmetric)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)} <br />
     * @return The value of the column 'VENDOR_SYMMETRIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorSymmetricId() {
        checkSpecifiedProperty("vendorSymmetricId");
        return _vendorSymmetricId;
    }

    /**
     * [set] VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)} <br />
     * @param vendorSymmetricId The value of the column 'VENDOR_SYMMETRIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorSymmetricId(Long vendorSymmetricId) {
        registerModifiedProperty("vendorSymmetricId");
        _vendorSymmetricId = vendorSymmetricId;
    }

    /**
     * [get] PLAIN_TEXT: {nvarchar(100)} <br />
     * @return The value of the column 'PLAIN_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlainText() {
        checkSpecifiedProperty("plainText");
        return _plainText;
    }

    /**
     * [set] PLAIN_TEXT: {nvarchar(100)} <br />
     * @param plainText The value of the column 'PLAIN_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlainText(String plainText) {
        registerModifiedProperty("plainText");
        _plainText = plainText;
    }

    /**
     * [get] ENCRYPTED_DATA: {varbinary(2147483647)} <br />
     * @return The value of the column 'ENCRYPTED_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public String getEncryptedData() {
        checkSpecifiedProperty("encryptedData");
        return _encryptedData;
    }

    /**
     * [set] ENCRYPTED_DATA: {varbinary(2147483647)} <br />
     * @param encryptedData The value of the column 'ENCRYPTED_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEncryptedData(String encryptedData) {
        registerModifiedProperty("encryptedData");
        _encryptedData = encryptedData;
    }
}
