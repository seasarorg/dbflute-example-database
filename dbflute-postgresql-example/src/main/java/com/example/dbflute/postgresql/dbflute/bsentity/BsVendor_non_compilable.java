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
 * The entity of VENDOR-NON COMPILABLE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     NON-COMPILABLE ID
 * 
 * [column]
 *     NON-COMPILABLE ID, NON COMPILABLE-NAME, PARENT-ID
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
 *     VENDOR-NON COMPILABLE
 * 
 * [referrer table]
 *     VENDOR-NON COMPILABLE
 * 
 * [foreign property]
 *     vendor_non_compilableSelf
 * 
 * [referrer property]
 *     vendor_non_compilableSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer non_compilable_id = entity.getNon_compilable_id();
 * String non_compilable_name = entity.getNon_compilable_name();
 * Integer parent_id = entity.getParent_id();
 * entity.setNon_compilable_id(non_compilable_id);
 * entity.setNon_compilable_name(non_compilable_name);
 * entity.setParent_id(parent_id);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor_non_compilable implements Entity, Serializable, Cloneable {

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
    /** NON-COMPILABLE ID: {PK, NotNull, int4(10)} */
    protected Integer _non_compilable_id;

    /** NON COMPILABLE-NAME: {varchar(64)} */
    protected String _non_compilable_name;

    /** PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE} */
    protected Integer _parent_id;

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
        return "VENDOR-NON COMPILABLE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendor_non_compilable";
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
        if (getNon_compilable_id() == null) { return false; }
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
    /** VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableSelf'. */
    protected Vendor_non_compilable _vendor_non_compilableSelf;

    /**
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableSelf'.
     * @return The entity of foreign property 'vendor_non_compilableSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Vendor_non_compilable getVendor_non_compilableSelf() {
        return _vendor_non_compilableSelf;
    }

    /**
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableSelf'.
     * @param vendor_non_compilableSelf The entity of foreign property 'vendor_non_compilableSelf'. (NullAllowed)
     */
    public void setVendor_non_compilableSelf(Vendor_non_compilable vendor_non_compilableSelf) {
        _vendor_non_compilableSelf = vendor_non_compilableSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableSelfList'. */
    protected List<Vendor_non_compilable> _vendor_non_compilableSelfList;

    /**
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableSelfList'.
     * @return The entity list of referrer property 'vendor_non_compilableSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Vendor_non_compilable> getVendor_non_compilableSelfList() {
        if (_vendor_non_compilableSelfList == null) { _vendor_non_compilableSelfList = newReferrerList(); }
        return _vendor_non_compilableSelfList;
    }

    /**
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableSelfList'.
     * @param vendor_non_compilableSelfList The entity list of referrer property 'vendor_non_compilableSelfList'. (NullAllowed)
     */
    public void setVendor_non_compilableSelfList(List<Vendor_non_compilable> vendor_non_compilableSelfList) {
        _vendor_non_compilableSelfList = vendor_non_compilableSelfList;
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
        if (obj == null || !(obj instanceof BsVendor_non_compilable)) { return false; }
        BsVendor_non_compilable other = (BsVendor_non_compilable)obj;
        if (!xSV(getNon_compilable_id(), other.getNon_compilable_id())) { return false; }
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
        hs = xCH(hs, getNon_compilable_id());
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
        if (_vendor_non_compilableSelf != null)
        { sb.append(li).append(xbRDS(_vendor_non_compilableSelf, "vendor_non_compilableSelf")); }
        if (_vendor_non_compilableSelfList != null) { for (Entity et : _vendor_non_compilableSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendor_non_compilableSelfList")); } } }
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
        sb.append(dm).append(getNon_compilable_id());
        sb.append(dm).append(getNon_compilable_name());
        sb.append(dm).append(getParent_id());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendor_non_compilableSelf != null) { sb.append(cm).append("vendor_non_compilableSelf"); }
        if (_vendor_non_compilableSelfList != null && !_vendor_non_compilableSelfList.isEmpty())
        { sb.append(cm).append("vendor_non_compilableSelfList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Vendor_non_compilable clone() {
        try {
            return (Vendor_non_compilable)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NON-COMPILABLE ID: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'NON-COMPILABLE ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNon_compilable_id() {
        return _non_compilable_id;
    }

    /**
     * [set] NON-COMPILABLE ID: {PK, NotNull, int4(10)} <br />
     * @param non_compilable_id The value of the column 'NON-COMPILABLE ID'. (basically NotNull if update: for the constraint)
     */
    public void setNon_compilable_id(Integer non_compilable_id) {
        __modifiedProperties.addPropertyName("non_compilable_id");
        this._non_compilable_id = non_compilable_id;
    }

    /**
     * [get] NON COMPILABLE-NAME: {varchar(64)} <br />
     * @return The value of the column 'NON COMPILABLE-NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNon_compilable_name() {
        return _non_compilable_name;
    }

    /**
     * [set] NON COMPILABLE-NAME: {varchar(64)} <br />
     * @param non_compilable_name The value of the column 'NON COMPILABLE-NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNon_compilable_name(String non_compilable_name) {
        __modifiedProperties.addPropertyName("non_compilable_name");
        this._non_compilable_name = non_compilable_name;
    }

    /**
     * [get] PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE} <br />
     * @return The value of the column 'PARENT-ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getParent_id() {
        return _parent_id;
    }

    /**
     * [set] PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE} <br />
     * @param parent_id The value of the column 'PARENT-ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParent_id(Integer parent_id) {
        __modifiedProperties.addPropertyName("parent_id");
        this._parent_id = parent_id;
    }
}
