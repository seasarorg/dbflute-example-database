package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NESTED_BAZ_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BAZ_ID, BAZ_NAME, BAZ_DATE, BAZ_LIST
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
 * Integer bazId = entity.getBazId();
 * String bazName = entity.getBazName();
 * java.util.Date bazDate = entity.getBazDate();
 * List<List<BarBean>> bazList = entity.getBazList();
 * entity.setBazId(bazId);
 * entity.setBazName(bazName);
 * entity.setBazDate(bazDate);
 * entity.setBazList(bazList);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNestedBazBean implements Entity, Serializable, Cloneable {

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
    /** BAZ_ID: {NUMBER(8)} */
    protected Integer _bazId;

    /** BAZ_NAME: {VARCHAR2(20)} */
    protected String _bazName;

    /** BAZ_DATE: {DATE} */
    protected java.util.Date _bazDate;

    /** BAZ_LIST: {BAZ_TABLE} */
    protected List<List<BarBean>> _bazList;

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
        return "NESTED_BAZ_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nestedBazBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NestedBazBeanDbm.getInstance();
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
        if (obj == null || !(obj instanceof BsNestedBazBean)) { return false; }
        BsNestedBazBean other = (BsNestedBazBean)obj;
        if (!xSV(getBazId(), other.getBazId())) { return false; }
        if (!xSV(getBazName(), other.getBazName())) { return false; }
        if (!xSV(getBazDate(), other.getBazDate())) { return false; }
        if (!xSV(getBazList(), other.getBazList())) { return false; }
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
        hs = xCH(hs, getBazId());
        hs = xCH(hs, getBazName());
        hs = xCH(hs, getBazDate());
        hs = xCH(hs, getBazList());
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
        sb.append(dm).append(getBazId());
        sb.append(dm).append(getBazName());
        sb.append(dm).append(xfUD(getBazDate()));
        sb.append(dm).append(getBazList());
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
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public NestedBazBean clone() {
        try {
            return (NestedBazBean)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BAZ_ID: {NUMBER(8)} <br />
     * @return The value of the column 'BAZ_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBazId() {
        return _bazId;
    }

    /**
     * [set] BAZ_ID: {NUMBER(8)} <br />
     * @param bazId The value of the column 'BAZ_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazId(Integer bazId) {
        __modifiedProperties.addPropertyName("bazId");
        this._bazId = bazId;
    }

    /**
     * [get] BAZ_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'BAZ_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBazName() {
        return _bazName;
    }

    /**
     * [set] BAZ_NAME: {VARCHAR2(20)} <br />
     * @param bazName The value of the column 'BAZ_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazName(String bazName) {
        __modifiedProperties.addPropertyName("bazName");
        this._bazName = bazName;
    }

    /**
     * [get] BAZ_DATE: {DATE} <br />
     * @return The value of the column 'BAZ_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBazDate() {
        return _bazDate;
    }

    /**
     * [set] BAZ_DATE: {DATE} <br />
     * @param bazDate The value of the column 'BAZ_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazDate(java.util.Date bazDate) {
        __modifiedProperties.addPropertyName("bazDate");
        this._bazDate = bazDate;
    }

    /**
     * [get] BAZ_LIST: {BAZ_TABLE} <br />
     * @return The value of the column 'BAZ_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<List<BarBean>> getBazList() {
        return _bazList;
    }

    /**
     * [set] BAZ_LIST: {BAZ_TABLE} <br />
     * @param bazList The value of the column 'BAZ_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazList(List<List<BarBean>> bazList) {
        __modifiedProperties.addPropertyName("bazList");
        this._bazList = bazList;
    }
}
