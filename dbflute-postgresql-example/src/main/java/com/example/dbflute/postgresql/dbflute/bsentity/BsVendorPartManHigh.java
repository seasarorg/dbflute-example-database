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
 * The entity of vendor_part_man_high as TABLE. <br />
 * <pre>
 * [primary-key]
 *     part_man_id
 * 
 * [column]
 *     part_man_id, part_man_name, part_man_point, part_man_date
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
 * Integer partManId = entity.getPartManId();
 * String partManName = entity.getPartManName();
 * Integer partManPoint = entity.getPartManPoint();
 * java.util.Date partManDate = entity.getPartManDate();
 * entity.setPartManId(partManId);
 * entity.setPartManName(partManName);
 * entity.setPartManPoint(partManPoint);
 * entity.setPartManDate(partManDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorPartManHigh implements Entity, Serializable, Cloneable {

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
    /** part_man_id: {PK, NotNull, int4(10)} */
    protected Integer _partManId;

    /** part_man_name: {NotNull, varchar(2147483647)} */
    protected String _partManName;

    /** part_man_point: {NotNull, int4(10)} */
    protected Integer _partManPoint;

    /** part_man_date: {date(13)} */
    protected java.util.Date _partManDate;

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
        return "vendor_part_man_high";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorPartManHigh";
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
        if (getPartManId() == null) { return false; }
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
        if (obj == null || !(obj instanceof BsVendorPartManHigh)) { return false; }
        BsVendorPartManHigh other = (BsVendorPartManHigh)obj;
        if (!xSV(getPartManId(), other.getPartManId())) { return false; }
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
        hs = xCH(hs, getPartManId());
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
        sb.append(dm).append(getPartManId());
        sb.append(dm).append(getPartManName());
        sb.append(dm).append(getPartManPoint());
        sb.append(dm).append(xfUD(getPartManDate()));
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
    public VendorPartManHigh clone() {
        try {
            return (VendorPartManHigh)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] part_man_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'part_man_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPartManId() {
        return _partManId;
    }

    /**
     * [set] part_man_id: {PK, NotNull, int4(10)} <br />
     * @param partManId The value of the column 'part_man_id'. (basically NotNull if update: for the constraint)
     */
    public void setPartManId(Integer partManId) {
        __modifiedProperties.addPropertyName("partManId");
        _partManId = partManId;
    }

    /**
     * [get] part_man_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'part_man_name'. (basically NotNull if selected: for the constraint)
     */
    public String getPartManName() {
        return _partManName;
    }

    /**
     * [set] part_man_name: {NotNull, varchar(2147483647)} <br />
     * @param partManName The value of the column 'part_man_name'. (basically NotNull if update: for the constraint)
     */
    public void setPartManName(String partManName) {
        __modifiedProperties.addPropertyName("partManName");
        _partManName = partManName;
    }

    /**
     * [get] part_man_point: {NotNull, int4(10)} <br />
     * @return The value of the column 'part_man_point'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPartManPoint() {
        return _partManPoint;
    }

    /**
     * [set] part_man_point: {NotNull, int4(10)} <br />
     * @param partManPoint The value of the column 'part_man_point'. (basically NotNull if update: for the constraint)
     */
    public void setPartManPoint(Integer partManPoint) {
        __modifiedProperties.addPropertyName("partManPoint");
        _partManPoint = partManPoint;
    }

    /**
     * [get] part_man_date: {date(13)} <br />
     * @return The value of the column 'part_man_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getPartManDate() {
        return _partManDate;
    }

    /**
     * [set] part_man_date: {date(13)} <br />
     * @param partManDate The value of the column 'part_man_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPartManDate(java.util.Date partManDate) {
        __modifiedProperties.addPropertyName("partManDate");
        _partManDate = partManDate;
    }
}
