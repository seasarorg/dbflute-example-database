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
 * The entity of vendor_uuid_bar as TABLE. <br />
 * <pre>
 * [primary-key]
 *     bar_id
 * 
 * [column]
 *     bar_id, bar_name
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
 *     vendor_uuid_foo
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorUuidFooList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.util.UUID barId = entity.getBarId();
 * String barName = entity.getBarName();
 * entity.setBarId(barId);
 * entity.setBarName(barName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidBar implements Entity, Serializable, Cloneable {

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
    /** bar_id: {PK, NotNull, uuid(2147483647)} */
    protected java.util.UUID _barId;

    /** bar_name: {NotNull, varchar(2147483647)} */
    protected String _barName;

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
        return "vendor_uuid_bar";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorUuidBar";
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
        if (getBarId() == null) { return false; }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> uniqueDrivenProperties() {
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
    /** vendor_uuid_foo by bar_id, named 'vendorUuidFooList'. */
    protected List<VendorUuidFoo> _vendorUuidFooList;

    /**
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * @return The entity list of referrer property 'vendorUuidFooList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorUuidFoo> getVendorUuidFooList() {
        if (_vendorUuidFooList == null) { _vendorUuidFooList = newReferrerList(); }
        return _vendorUuidFooList;
    }

    /**
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * @param vendorUuidFooList The entity list of referrer property 'vendorUuidFooList'. (NullAllowed)
     */
    public void setVendorUuidFooList(List<VendorUuidFoo> vendorUuidFooList) {
        _vendorUuidFooList = vendorUuidFooList;
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsVendorUuidBar)) { return false; }
        BsVendorUuidBar other = (BsVendorUuidBar)obj;
        if (!xSV(getBarId(), other.getBarId())) { return false; }
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
        hs = xCH(hs, getBarId());
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
        if (_vendorUuidFooList != null) { for (Entity et : _vendorUuidFooList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorUuidFooList")); } } }
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
        sb.append(dm).append(getBarId());
        sb.append(dm).append(getBarName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorUuidFooList != null && !_vendorUuidFooList.isEmpty())
        { sb.append(cm).append("vendorUuidFooList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorUuidBar clone() {
        try {
            return (VendorUuidBar)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bar_id: {PK, NotNull, uuid(2147483647)} <br />
     * @return The value of the column 'bar_id'. (basically NotNull if selected: for the constraint)
     */
    public java.util.UUID getBarId() {
        return _barId;
    }

    /**
     * [set] bar_id: {PK, NotNull, uuid(2147483647)} <br />
     * @param barId The value of the column 'bar_id'. (basically NotNull if update: for the constraint)
     */
    public void setBarId(java.util.UUID barId) {
        __modifiedProperties.addPropertyName("barId");
        this._barId = barId;
    }

    /**
     * [get] bar_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'bar_name'. (basically NotNull if selected: for the constraint)
     */
    public String getBarName() {
        return _barName;
    }

    /**
     * [set] bar_name: {NotNull, varchar(2147483647)} <br />
     * @param barName The value of the column 'bar_name'. (basically NotNull if update: for the constraint)
     */
    public void setBarName(String barName) {
        __modifiedProperties.addPropertyName("barName");
        this._barName = barName;
    }
}
