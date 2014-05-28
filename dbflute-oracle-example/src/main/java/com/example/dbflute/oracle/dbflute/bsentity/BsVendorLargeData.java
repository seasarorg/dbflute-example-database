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
 * The entity of VENDOR_LARGE_DATA as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LARGE_DATA_ID
 * 
 * [column]
 *     LARGE_DATA_ID, STRING_INDEX, STRING_NO_INDEX, STRING_UNIQUE_INDEX, INTFLG_INDEX, NUMERIC_INTEGER_INDEX, NUMERIC_INTEGER_NO_INDEX
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
 *     VENDOR_LARGE_DATA_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorLargeDataRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long largeDataId = entity.getLargeDataId();
 * String stringIndex = entity.getStringIndex();
 * String stringNoIndex = entity.getStringNoIndex();
 * String stringUniqueIndex = entity.getStringUniqueIndex();
 * Integer intflgIndex = entity.getIntflgIndex();
 * Integer numericIntegerIndex = entity.getNumericIntegerIndex();
 * Integer numericIntegerNoIndex = entity.getNumericIntegerNoIndex();
 * entity.setLargeDataId(largeDataId);
 * entity.setStringIndex(stringIndex);
 * entity.setStringNoIndex(stringNoIndex);
 * entity.setStringUniqueIndex(stringUniqueIndex);
 * entity.setIntflgIndex(intflgIndex);
 * entity.setNumericIntegerIndex(numericIntegerIndex);
 * entity.setNumericIntegerNoIndex(numericIntegerNoIndex);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeData implements Entity, Serializable, Cloneable {

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
    /** LARGE_DATA_ID: {PK, NotNull, NUMBER(12)} */
    protected Long _largeDataId;

    /** STRING_INDEX: {IX, NotNull, VARCHAR2(200)} */
    protected String _stringIndex;

    /** STRING_NO_INDEX: {NotNull, VARCHAR2(200)} */
    protected String _stringNoIndex;

    /** STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} */
    protected String _stringUniqueIndex;

    /** INTFLG_INDEX: {NotNull, NUMBER(8)} */
    protected Integer _intflgIndex;

    /** NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)} */
    protected Integer _numericIntegerIndex;

    /** NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)} */
    protected Integer _numericIntegerNoIndex;

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
        return "VENDOR_LARGE_DATA";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeData";
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
        if (getLargeDataId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param stringUniqueIndex : UQ, NotNull, VARCHAR2(200). (NotNull)
     */
    public void uniqueBy(String stringUniqueIndex) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("stringUniqueIndex");
        setStringUniqueIndex(stringUniqueIndex);
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
    /** VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefList;

    /**
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @return The entity list of referrer property 'vendorLargeDataRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefList() {
        if (_vendorLargeDataRefList == null) { _vendorLargeDataRefList = newReferrerList(); }
        return _vendorLargeDataRefList;
    }

    /**
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @param vendorLargeDataRefList The entity list of referrer property 'vendorLargeDataRefList'. (NullAllowed)
     */
    public void setVendorLargeDataRefList(List<VendorLargeDataRef> vendorLargeDataRefList) {
        _vendorLargeDataRefList = vendorLargeDataRefList;
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
        if (obj == null || !(obj instanceof BsVendorLargeData)) { return false; }
        BsVendorLargeData other = (BsVendorLargeData)obj;
        if (!xSV(getLargeDataId(), other.getLargeDataId())) { return false; }
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
        hs = xCH(hs, getLargeDataId());
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
        if (_vendorLargeDataRefList != null) { for (Entity et : _vendorLargeDataRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefList")); } } }
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
        sb.append(dm).append(getLargeDataId());
        sb.append(dm).append(getStringIndex());
        sb.append(dm).append(getStringNoIndex());
        sb.append(dm).append(getStringUniqueIndex());
        sb.append(dm).append(getIntflgIndex());
        sb.append(dm).append(getNumericIntegerIndex());
        sb.append(dm).append(getNumericIntegerNoIndex());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorLargeDataRefList != null && !_vendorLargeDataRefList.isEmpty())
        { sb.append(cm).append("vendorLargeDataRefList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorLargeData clone() {
        try {
            return (VendorLargeData)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_DATA_ID: {PK, NotNull, NUMBER(12)} <br />
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {PK, NotNull, NUMBER(12)} <br />
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        this._largeDataId = largeDataId;
    }

    /**
     * [get] STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'STRING_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringIndex() {
        return _stringIndex;
    }

    /**
     * [set] STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br />
     * @param stringIndex The value of the column 'STRING_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringIndex(String stringIndex) {
        __modifiedProperties.addPropertyName("stringIndex");
        this._stringIndex = stringIndex;
    }

    /**
     * [get] STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'STRING_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringNoIndex() {
        return _stringNoIndex;
    }

    /**
     * [set] STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br />
     * @param stringNoIndex The value of the column 'STRING_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringNoIndex(String stringNoIndex) {
        __modifiedProperties.addPropertyName("stringNoIndex");
        this._stringNoIndex = stringNoIndex;
    }

    /**
     * [get] STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'STRING_UNIQUE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringUniqueIndex() {
        return _stringUniqueIndex;
    }

    /**
     * [set] STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br />
     * @param stringUniqueIndex The value of the column 'STRING_UNIQUE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringUniqueIndex(String stringUniqueIndex) {
        __modifiedProperties.addPropertyName("stringUniqueIndex");
        this._stringUniqueIndex = stringUniqueIndex;
    }

    /**
     * [get] INTFLG_INDEX: {NotNull, NUMBER(8)} <br />
     * @return The value of the column 'INTFLG_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntflgIndex() {
        return _intflgIndex;
    }

    /**
     * [set] INTFLG_INDEX: {NotNull, NUMBER(8)} <br />
     * @param intflgIndex The value of the column 'INTFLG_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setIntflgIndex(Integer intflgIndex) {
        __modifiedProperties.addPropertyName("intflgIndex");
        this._intflgIndex = intflgIndex;
    }

    /**
     * [get] NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)} <br />
     * @return The value of the column 'NUMERIC_INTEGER_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerIndex() {
        return _numericIntegerIndex;
    }

    /**
     * [set] NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)} <br />
     * @param numericIntegerIndex The value of the column 'NUMERIC_INTEGER_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerIndex(Integer numericIntegerIndex) {
        __modifiedProperties.addPropertyName("numericIntegerIndex");
        this._numericIntegerIndex = numericIntegerIndex;
    }

    /**
     * [get] NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)} <br />
     * @return The value of the column 'NUMERIC_INTEGER_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerNoIndex() {
        return _numericIntegerNoIndex;
    }

    /**
     * [set] NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)} <br />
     * @param numericIntegerNoIndex The value of the column 'NUMERIC_INTEGER_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerNoIndex(Integer numericIntegerNoIndex) {
        __modifiedProperties.addPropertyName("numericIntegerNoIndex");
        this._numericIntegerNoIndex = numericIntegerNoIndex;
    }
}
