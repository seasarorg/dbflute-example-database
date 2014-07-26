package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_inherit_neko as TABLE. <br />
 * <pre>
 * [primary-key]
 *     neko_id
 * 
 * [column]
 *     inu_id, inu_name, inu_date, neko_id, neko_name, neko_date
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
 * Integer inuId = entity.getInuId();
 * String inuName = entity.getInuName();
 * java.util.Date inuDate = entity.getInuDate();
 * Integer nekoId = entity.getNekoId();
 * String nekoName = entity.getNekoName();
 * java.util.Date nekoDate = entity.getNekoDate();
 * entity.setInuId(inuId);
 * entity.setInuName(inuName);
 * entity.setInuDate(inuDate);
 * entity.setNekoId(nekoId);
 * entity.setNekoName(nekoName);
 * entity.setNekoDate(nekoDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorInheritNeko implements Entity, Serializable, Cloneable {

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
    /** inu_id: {NotNull, int4(10)} */
    protected Integer _inuId;

    /** inu_name: {NotNull, varchar(2147483647)} */
    protected String _inuName;

    /** inu_date: {date(13)} */
    protected java.util.Date _inuDate;

    /** neko_id: {PK, NotNull, int4(10)} */
    protected Integer _nekoId;

    /** neko_name: {NotNull, varchar(2147483647)} */
    protected String _nekoName;

    /** neko_date: {date(13)} */
    protected java.util.Date _nekoDate;

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
        return "vendor_inherit_neko";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorInheritNeko";
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
        if (getNekoId() == null) { return false; }
        return true;
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
        if (obj == null || !(obj instanceof BsVendorInheritNeko)) { return false; }
        BsVendorInheritNeko other = (BsVendorInheritNeko)obj;
        if (!xSV(getNekoId(), other.getNekoId())) { return false; }
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
        hs = xCH(hs, getNekoId());
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
        sb.append(dm).append(getInuId());
        sb.append(dm).append(getInuName());
        sb.append(dm).append(xfUD(getInuDate()));
        sb.append(dm).append(getNekoId());
        sb.append(dm).append(getNekoName());
        sb.append(dm).append(xfUD(getNekoDate()));
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
    public VendorInheritNeko clone() {
        try {
            return (VendorInheritNeko)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] inu_id: {NotNull, int4(10)} <br />
     * @return The value of the column 'inu_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getInuId() {
        return _inuId;
    }

    /**
     * [set] inu_id: {NotNull, int4(10)} <br />
     * @param inuId The value of the column 'inu_id'. (basically NotNull if update: for the constraint)
     */
    public void setInuId(Integer inuId) {
        __modifiedProperties.addPropertyName("inuId");
        _inuId = inuId;
    }

    /**
     * [get] inu_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'inu_name'. (basically NotNull if selected: for the constraint)
     */
    public String getInuName() {
        return _inuName;
    }

    /**
     * [set] inu_name: {NotNull, varchar(2147483647)} <br />
     * @param inuName The value of the column 'inu_name'. (basically NotNull if update: for the constraint)
     */
    public void setInuName(String inuName) {
        __modifiedProperties.addPropertyName("inuName");
        _inuName = inuName;
    }

    /**
     * [get] inu_date: {date(13)} <br />
     * @return The value of the column 'inu_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getInuDate() {
        return _inuDate;
    }

    /**
     * [set] inu_date: {date(13)} <br />
     * @param inuDate The value of the column 'inu_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInuDate(java.util.Date inuDate) {
        __modifiedProperties.addPropertyName("inuDate");
        _inuDate = inuDate;
    }

    /**
     * [get] neko_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'neko_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNekoId() {
        return _nekoId;
    }

    /**
     * [set] neko_id: {PK, NotNull, int4(10)} <br />
     * @param nekoId The value of the column 'neko_id'. (basically NotNull if update: for the constraint)
     */
    public void setNekoId(Integer nekoId) {
        __modifiedProperties.addPropertyName("nekoId");
        _nekoId = nekoId;
    }

    /**
     * [get] neko_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'neko_name'. (basically NotNull if selected: for the constraint)
     */
    public String getNekoName() {
        return _nekoName;
    }

    /**
     * [set] neko_name: {NotNull, varchar(2147483647)} <br />
     * @param nekoName The value of the column 'neko_name'. (basically NotNull if update: for the constraint)
     */
    public void setNekoName(String nekoName) {
        __modifiedProperties.addPropertyName("nekoName");
        _nekoName = nekoName;
    }

    /**
     * [get] neko_date: {date(13)} <br />
     * @return The value of the column 'neko_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getNekoDate() {
        return _nekoDate;
    }

    /**
     * [set] neko_date: {date(13)} <br />
     * @param nekoDate The value of the column 'neko_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNekoDate(java.util.Date nekoDate) {
        __modifiedProperties.addPropertyName("nekoDate");
        _nekoDate = nekoDate;
    }
}
