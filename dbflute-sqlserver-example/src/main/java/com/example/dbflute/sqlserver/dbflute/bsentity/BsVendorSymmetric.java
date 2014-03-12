package com.example.dbflute.sqlserver.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
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
 * byte[] encryptedData = entity.getEncryptedData();
 * entity.setVendorSymmetricId(vendorSymmetricId);
 * entity.setPlainText(plainText);
 * entity.setEncryptedData(encryptedData);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorSymmetric implements Entity, Serializable, Cloneable {

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

    /** ENCRYPTED_DATA: {image(2147483647)} */
    protected byte[] _encryptedData;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

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
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsVendorSymmetric)) { return false; }
        BsVendorSymmetric otherEntity = (BsVendorSymmetric)other;
        if (!xSV(getVendorSymmetricId(), otherEntity.getVendorSymmetricId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getVendorSymmetricId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getVendorSymmetricId());
        sb.append(delimiter).append(getPlainText());
        sb.append(delimiter).append(xfBA(getEncryptedData()));
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return InternalUtil.toString(bytes);
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorSymmetric clone() {
        try {
            return (VendorSymmetric)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)} <br />
     * @return The value of the column 'VENDOR_SYMMETRIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorSymmetricId() {
        return _vendorSymmetricId;
    }

    /**
     * [set] VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)} <br />
     * @param vendorSymmetricId The value of the column 'VENDOR_SYMMETRIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorSymmetricId(Long vendorSymmetricId) {
        __modifiedProperties.addPropertyName("vendorSymmetricId");
        this._vendorSymmetricId = vendorSymmetricId;
    }

    /**
     * [get] PLAIN_TEXT: {nvarchar(100)} <br />
     * @return The value of the column 'PLAIN_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlainText() {
        return _plainText;
    }

    /**
     * [set] PLAIN_TEXT: {nvarchar(100)} <br />
     * @param plainText The value of the column 'PLAIN_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlainText(String plainText) {
        __modifiedProperties.addPropertyName("plainText");
        this._plainText = plainText;
    }

    /**
     * [get] ENCRYPTED_DATA: {image(2147483647)} <br />
     * @return The value of the column 'ENCRYPTED_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getEncryptedData() {
        return _encryptedData;
    }

    /**
     * [set] ENCRYPTED_DATA: {image(2147483647)} <br />
     * @param encryptedData The value of the column 'ENCRYPTED_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEncryptedData(byte[] encryptedData) {
        __modifiedProperties.addPropertyName("encryptedData");
        this._encryptedData = encryptedData;
    }
}
