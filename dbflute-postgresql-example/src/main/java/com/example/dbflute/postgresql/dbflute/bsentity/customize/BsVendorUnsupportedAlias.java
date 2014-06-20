package com.example.dbflute.postgresql.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorUnsupportedAlias. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     vendor_check_id, HYPHEN-EXISTS, SPACE EXISTS, DOLLAR$EXISTS
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * String hyphen_exists = entity.getHyphen_exists();
 * Integer space_exists = entity.getSpace_exists();
 * java.util.Date dollar$exists = entity.getDollar$exists();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setHyphen_exists(hyphen_exists);
 * entity.setSpace_exists(space_exists);
 * entity.setDollar$exists(dollar$exists);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUnsupportedAlias implements Entity, Serializable, Cloneable {

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
    /** vendor_check_id: {numeric(16)} */
    protected Long _vendorCheckId;

    /** HYPHEN-EXISTS: {varchar(2147483647)} */
    protected String _hyphen_exists;

    /** SPACE EXISTS: {int4(10)} */
    protected Integer _space_exists;

    /** DOLLAR$EXISTS: {date(13)} */
    protected java.util.Date _dollar$exists;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

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
        return "VendorUnsupportedAlias";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorUnsupportedAlias";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta.VendorUnsupportedAliasDbm.getInstance();
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

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsVendorUnsupportedAlias)) { return false; }
        BsVendorUnsupportedAlias other = (BsVendorUnsupportedAlias)obj;
        if (!xSV(getVendorCheckId(), other.getVendorCheckId())) { return false; }
        if (!xSV(getHyphen_exists(), other.getHyphen_exists())) { return false; }
        if (!xSV(getSpace_exists(), other.getSpace_exists())) { return false; }
        if (!xSV(getDollar$exists(), other.getDollar$exists())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getVendorCheckId());
        hs = xCH(hs, getHyphen_exists());
        hs = xCH(hs, getSpace_exists());
        hs = xCH(hs, getDollar$exists());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
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
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
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
        String dm = ", ";
        sb.append(dm).append(getVendorCheckId());
        sb.append(dm).append(getHyphen_exists());
        sb.append(dm).append(getSpace_exists());
        sb.append(dm).append(xfUD(getDollar$exists()));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorUnsupportedAlias clone() {
        try {
            return (VendorUnsupportedAlias)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] vendor_check_id: {numeric(16)} <br />
     * @return The value of the column 'vendor_check_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] vendor_check_id: {numeric(16)} <br />
     * @param vendorCheckId The value of the column 'vendor_check_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] HYPHEN-EXISTS: {varchar(2147483647)} <br />
     * @return The value of the column 'HYPHEN-EXISTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getHyphen_exists() {
        return _hyphen_exists;
    }

    /**
     * [set] HYPHEN-EXISTS: {varchar(2147483647)} <br />
     * @param hyphen_exists The value of the column 'HYPHEN-EXISTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHyphen_exists(String hyphen_exists) {
        __modifiedProperties.addPropertyName("hyphen_exists");
        _hyphen_exists = hyphen_exists;
    }

    /**
     * [get] SPACE EXISTS: {int4(10)} <br />
     * @return The value of the column 'SPACE EXISTS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSpace_exists() {
        return _space_exists;
    }

    /**
     * [set] SPACE EXISTS: {int4(10)} <br />
     * @param space_exists The value of the column 'SPACE EXISTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpace_exists(Integer space_exists) {
        __modifiedProperties.addPropertyName("space_exists");
        _space_exists = space_exists;
    }

    /**
     * [get] DOLLAR$EXISTS: {date(13)} <br />
     * @return The value of the column 'DOLLAR$EXISTS'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getDollar$exists() {
        return _dollar$exists;
    }

    /**
     * [set] DOLLAR$EXISTS: {date(13)} <br />
     * @param dollar$exists The value of the column 'DOLLAR$EXISTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDollar$exists(java.util.Date dollar$exists) {
        __modifiedProperties.addPropertyName("dollar$exists");
        _dollar$exists = dollar$exists;
    }
}
