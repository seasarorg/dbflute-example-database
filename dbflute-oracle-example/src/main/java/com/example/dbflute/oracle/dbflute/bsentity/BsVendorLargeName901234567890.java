package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
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
public abstract class BsVendorLargeName901234567890 implements Entity, Serializable, Cloneable {

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
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * @return The entity list of referrer property 'vendorLargeName90123456RefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeName90123456Ref> getVendorLargeName90123456RefList() {
        if (_vendorLargeName90123456RefList == null) { _vendorLargeName90123456RefList = newReferrerList(); }
        return _vendorLargeName90123456RefList;
    }

    /**
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * @param vendorLargeName90123456RefList The entity list of referrer property 'vendorLargeName90123456RefList'. (NullAllowed)
     */
    public void setVendorLargeName90123456RefList(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        _vendorLargeName90123456RefList = vendorLargeName90123456RefList;
    }

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
        if (other == null || !(other instanceof BsVendorLargeName901234567890)) { return false; }
        BsVendorLargeName901234567890 otherEntity = (BsVendorLargeName901234567890)other;
        if (!xSV(getVendorLargeName901234567Id(), otherEntity.getVendorLargeName901234567Id())) { return false; }
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
        result = xCH(result, getVendorLargeName901234567Id());
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
        String l = "\n  ";
        if (_vendorLargeName90123456RefList != null) { for (Entity e : _vendorLargeName90123456RefList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "vendorLargeName90123456RefList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        sb.append(delimiter).append(getVendorLargeName901234567Id());
        sb.append(delimiter).append(getVendorLargeName9012345Name());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_vendorLargeName90123456RefList != null && !_vendorLargeName90123456RefList.isEmpty())
        { sb.append(c).append("vendorLargeName90123456RefList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorLargeName901234567890 clone() {
        try {
            return (VendorLargeName901234567890)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorLargeName901234567Id() {
        return _vendorLargeName901234567Id;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param vendorLargeName901234567Id The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName901234567Id(Long vendorLargeName901234567Id) {
        __modifiedProperties.addPropertyName("vendorLargeName901234567Id");
        this._vendorLargeName901234567Id = vendorLargeName901234567Id;
    }

    /**
     * [get] VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_9012345_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getVendorLargeName9012345Name() {
        return _vendorLargeName9012345Name;
    }

    /**
     * [set] VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br />
     * @param vendorLargeName9012345Name The value of the column 'VENDOR_LARGE_NAME_9012345_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName9012345Name(String vendorLargeName9012345Name) {
        __modifiedProperties.addPropertyName("vendorLargeName9012345Name");
        this._vendorLargeName9012345Name = vendorLargeName9012345Name;
    }
}
