package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_uuid_foo as TABLE. <br />
 * <pre>
 * [primary-key]
 *     foo_id
 * 
 * [column]
 *     foo_id, foo_name, bar_id
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
 *     vendor_uuid_bar
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorUuidBar
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.util.UUID fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.util.UUID barId = entity.getBarId();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setBarId(barId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidFoo implements Entity, Serializable, Cloneable {

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
    /** foo_id: {PK, NotNull, uuid(2147483647)} */
    protected java.util.UUID _fooId;

    /** foo_name: {NotNull, varchar(2147483647)} */
    protected String _fooName;

    /** bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar} */
    protected java.util.UUID _barId;

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
        return "vendor_uuid_foo";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorUuidFoo";
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
        if (getFooId() == null) { return false; }
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
    /** vendor_uuid_bar by my bar_id, named 'vendorUuidBar'. */
    protected VendorUuidBar _vendorUuidBar;

    /**
     * [get] vendor_uuid_bar by my bar_id, named 'vendorUuidBar'.
     * @return The entity of foreign property 'vendorUuidBar'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorUuidBar getVendorUuidBar() {
        return _vendorUuidBar;
    }

    /**
     * [set] vendor_uuid_bar by my bar_id, named 'vendorUuidBar'.
     * @param vendorUuidBar The entity of foreign property 'vendorUuidBar'. (NullAllowed)
     */
    public void setVendorUuidBar(VendorUuidBar vendorUuidBar) {
        _vendorUuidBar = vendorUuidBar;
    }

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
        if (obj == null || !(obj instanceof BsVendorUuidFoo)) { return false; }
        BsVendorUuidFoo other = (BsVendorUuidFoo)obj;
        if (!xSV(getFooId(), other.getFooId())) { return false; }
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
        hs = xCH(hs, getFooId());
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
        String li = "\n  ";
        if (_vendorUuidBar != null)
        { sb.append(li).append(xbRDS(_vendorUuidBar, "vendorUuidBar")); }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        sb.append(dm).append(getFooId());
        sb.append(dm).append(getFooName());
        sb.append(dm).append(getBarId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorUuidBar != null) { sb.append(cm).append("vendorUuidBar"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorUuidFoo clone() {
        try {
            return (VendorUuidFoo)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] foo_id: {PK, NotNull, uuid(2147483647)} <br />
     * @return The value of the column 'foo_id'. (basically NotNull if selected: for the constraint)
     */
    public java.util.UUID getFooId() {
        return _fooId;
    }

    /**
     * [set] foo_id: {PK, NotNull, uuid(2147483647)} <br />
     * @param fooId The value of the column 'foo_id'. (basically NotNull if update: for the constraint)
     */
    public void setFooId(java.util.UUID fooId) {
        __modifiedProperties.addPropertyName("fooId");
        _fooId = fooId;
    }

    /**
     * [get] foo_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'foo_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFooName() {
        return _fooName;
    }

    /**
     * [set] foo_name: {NotNull, varchar(2147483647)} <br />
     * @param fooName The value of the column 'foo_name'. (basically NotNull if update: for the constraint)
     */
    public void setFooName(String fooName) {
        __modifiedProperties.addPropertyName("fooName");
        _fooName = fooName;
    }

    /**
     * [get] bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar} <br />
     * @return The value of the column 'bar_id'. (basically NotNull if selected: for the constraint)
     */
    public java.util.UUID getBarId() {
        return _barId;
    }

    /**
     * [set] bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar} <br />
     * @param barId The value of the column 'bar_id'. (basically NotNull if update: for the constraint)
     */
    public void setBarId(java.util.UUID barId) {
        __modifiedProperties.addPropertyName("barId");
        _barId = barId;
    }
}
