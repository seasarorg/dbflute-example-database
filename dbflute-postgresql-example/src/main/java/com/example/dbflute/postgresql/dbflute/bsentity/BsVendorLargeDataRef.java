package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_large_data_ref as TABLE. <br />
 * <pre>
 * [primary-key]
 *     large_data_ref_id
 * 
 * [column]
 *     large_data_ref_id, large_data_id, date_index, date_no_index, timestamp_index, timestamp_no_index, nullable_decimal_index, nullable_decimal_no_index, self_parent_id
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
 *     vendor_large_data, vendor_large_data_ref
 * 
 * [referrer table]
 *     vendor_large_data_ref
 * 
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 * 
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long largeDataRefId = entity.getLargeDataRefId();
 * Long largeDataId = entity.getLargeDataId();
 * java.util.Date dateIndex = entity.getDateIndex();
 * java.util.Date dateNoIndex = entity.getDateNoIndex();
 * java.sql.Timestamp timestampIndex = entity.getTimestampIndex();
 * java.sql.Timestamp timestampNoIndex = entity.getTimestampNoIndex();
 * java.math.BigDecimal nullableDecimalIndex = entity.getNullableDecimalIndex();
 * java.math.BigDecimal nullableDecimalNoIndex = entity.getNullableDecimalNoIndex();
 * Long selfParentId = entity.getSelfParentId();
 * entity.setLargeDataRefId(largeDataRefId);
 * entity.setLargeDataId(largeDataId);
 * entity.setDateIndex(dateIndex);
 * entity.setDateNoIndex(dateNoIndex);
 * entity.setTimestampIndex(timestampIndex);
 * entity.setTimestampNoIndex(timestampNoIndex);
 * entity.setNullableDecimalIndex(nullableDecimalIndex);
 * entity.setNullableDecimalNoIndex(nullableDecimalNoIndex);
 * entity.setSelfParentId(selfParentId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeDataRef implements Entity, Serializable, Cloneable {

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
    /** large_data_ref_id: {PK, NotNull, int8(19)} */
    protected Long _largeDataRefId;

    /** large_data_id: {NotNull, int8(19), FK to vendor_large_data} */
    protected Long _largeDataId;

    /** date_index: {IX, NotNull, date(13)} */
    protected java.util.Date _dateIndex;

    /** date_no_index: {NotNull, date(13)} */
    protected java.util.Date _dateNoIndex;

    /** timestamp_index: {IX, NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampIndex;

    /** timestamp_no_index: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampNoIndex;

    /** nullable_decimal_index: {IX, numeric(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** nullable_decimal_no_index: {numeric(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** self_parent_id: {int8(19), FK to vendor_large_data_ref} */
    protected Long _selfParentId;

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
        return "vendor_large_data_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeDataRef";
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
        if (getLargeDataRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_large_data by my large_data_id, named 'vendorLargeData'. */
    protected VendorLargeData _vendorLargeData;

    /**
     * vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @return The entity of foreign property 'vendorLargeData'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeData getVendorLargeData() {
        return _vendorLargeData;
    }

    /**
     * vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(VendorLargeData vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'. */
    protected VendorLargeDataRef _vendorLargeDataRefSelf;

    /**
     * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeDataRef getVendorLargeDataRefSelf() {
        return _vendorLargeDataRefSelf;
    }

    /**
     * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @param vendorLargeDataRefSelf The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelf(VendorLargeDataRef vendorLargeDataRefSelf) {
        _vendorLargeDataRefSelf = vendorLargeDataRefSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefSelfList;

    /**
     * vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @param vendorLargeDataRefSelfList The entity list of referrer property 'vendorLargeDataRefSelfList'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefSelfList) {
        _vendorLargeDataRefSelfList = vendorLargeDataRefSelfList;
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
        if (other == null || !(other instanceof BsVendorLargeDataRef)) { return false; }
        BsVendorLargeDataRef otherEntity = (BsVendorLargeDataRef)other;
        if (!xSV(getLargeDataRefId(), otherEntity.getLargeDataRefId())) { return false; }
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
        result = xCH(result, getLargeDataRefId());
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
        if (_vendorLargeData != null)
        { sb.append(l).append(xbRDS(_vendorLargeData, "vendorLargeData")); }
        if (_vendorLargeDataRefSelf != null)
        { sb.append(l).append(xbRDS(_vendorLargeDataRefSelf, "vendorLargeDataRefSelf")); }
        if (_vendorLargeDataRefSelfList != null) { for (Entity e : _vendorLargeDataRefSelfList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "vendorLargeDataRefSelfList")); } } }
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
        sb.append(delimiter).append(getLargeDataRefId());
        sb.append(delimiter).append(getLargeDataId());
        sb.append(delimiter).append(xfUD(getDateIndex()));
        sb.append(delimiter).append(xfUD(getDateNoIndex()));
        sb.append(delimiter).append(getTimestampIndex());
        sb.append(delimiter).append(getTimestampNoIndex());
        sb.append(delimiter).append(getNullableDecimalIndex());
        sb.append(delimiter).append(getNullableDecimalNoIndex());
        sb.append(delimiter).append(getSelfParentId());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return InternalUtil.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_vendorLargeData != null) { sb.append(c).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null) { sb.append(c).append("vendorLargeDataRefSelf"); }
        if (_vendorLargeDataRefSelfList != null && !_vendorLargeDataRefSelfList.isEmpty())
        { sb.append(c).append("vendorLargeDataRefSelfList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorLargeDataRef clone() {
        try {
            return (VendorLargeDataRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] large_data_ref_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'large_data_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        return _largeDataRefId;
    }

    /**
     * [set] large_data_ref_id: {PK, NotNull, int8(19)} <br />
     * @param largeDataRefId The value of the column 'large_data_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        __modifiedProperties.addPropertyName("largeDataRefId");
        this._largeDataRefId = largeDataRefId;
    }

    /**
     * [get] large_data_id: {NotNull, int8(19), FK to vendor_large_data} <br />
     * @return The value of the column 'large_data_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        return _largeDataId;
    }

    /**
     * [set] large_data_id: {NotNull, int8(19), FK to vendor_large_data} <br />
     * @param largeDataId The value of the column 'large_data_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        this._largeDataId = largeDataId;
    }

    /**
     * [get] date_index: {IX, NotNull, date(13)} <br />
     * @return The value of the column 'date_index'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateIndex() {
        return _dateIndex;
    }

    /**
     * [set] date_index: {IX, NotNull, date(13)} <br />
     * @param dateIndex The value of the column 'date_index'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.util.Date dateIndex) {
        __modifiedProperties.addPropertyName("dateIndex");
        this._dateIndex = dateIndex;
    }

    /**
     * [get] date_no_index: {NotNull, date(13)} <br />
     * @return The value of the column 'date_no_index'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateNoIndex() {
        return _dateNoIndex;
    }

    /**
     * [set] date_no_index: {NotNull, date(13)} <br />
     * @param dateNoIndex The value of the column 'date_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.util.Date dateNoIndex) {
        __modifiedProperties.addPropertyName("dateNoIndex");
        this._dateNoIndex = dateNoIndex;
    }

    /**
     * [get] timestamp_index: {IX, NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_index'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampIndex() {
        return _timestampIndex;
    }

    /**
     * [set] timestamp_index: {IX, NotNull, timestamp(26, 3)} <br />
     * @param timestampIndex The value of the column 'timestamp_index'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.sql.Timestamp timestampIndex) {
        __modifiedProperties.addPropertyName("timestampIndex");
        this._timestampIndex = timestampIndex;
    }

    /**
     * [get] timestamp_no_index: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_no_index'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampNoIndex() {
        return _timestampNoIndex;
    }

    /**
     * [set] timestamp_no_index: {NotNull, timestamp(26, 3)} <br />
     * @param timestampNoIndex The value of the column 'timestamp_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.sql.Timestamp timestampNoIndex) {
        __modifiedProperties.addPropertyName("timestampNoIndex");
        this._timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] nullable_decimal_index: {IX, numeric(12, 3)} <br />
     * @return The value of the column 'nullable_decimal_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        return _nullableDecimalIndex;
    }

    /**
     * [set] nullable_decimal_index: {IX, numeric(12, 3)} <br />
     * @param nullableDecimalIndex The value of the column 'nullable_decimal_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        __modifiedProperties.addPropertyName("nullableDecimalIndex");
        this._nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] nullable_decimal_no_index: {numeric(12, 3)} <br />
     * @return The value of the column 'nullable_decimal_no_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] nullable_decimal_no_index: {numeric(12, 3)} <br />
     * @param nullableDecimalNoIndex The value of the column 'nullable_decimal_no_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        __modifiedProperties.addPropertyName("nullableDecimalNoIndex");
        this._nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] self_parent_id: {int8(19), FK to vendor_large_data_ref} <br />
     * @return The value of the column 'self_parent_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        return _selfParentId;
    }

    /**
     * [set] self_parent_id: {int8(19), FK to vendor_large_data_ref} <br />
     * @param selfParentId The value of the column 'self_parent_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        __modifiedProperties.addPropertyName("selfParentId");
        this._selfParentId = selfParentId;
    }
}
