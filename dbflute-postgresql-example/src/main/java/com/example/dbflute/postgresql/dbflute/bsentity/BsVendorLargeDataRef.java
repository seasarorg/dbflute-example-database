package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
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
public abstract class BsVendorLargeDataRef extends AbstractEntity {

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
     * [get] vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @return The entity of foreign property 'vendorLargeData'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeData getVendorLargeData() {
        return _vendorLargeData;
    }

    /**
     * [set] vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(VendorLargeData vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'. */
    protected VendorLargeDataRef _vendorLargeDataRefSelf;

    /**
     * [get] vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeDataRef getVendorLargeDataRefSelf() {
        return _vendorLargeDataRefSelf;
    }

    /**
     * [set] vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
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
     * [get] vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * [set] vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @param vendorLargeDataRefSelfList The entity list of referrer property 'vendorLargeDataRefSelfList'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefSelfList) {
        _vendorLargeDataRefSelfList = vendorLargeDataRefSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorLargeDataRef) {
            BsVendorLargeDataRef other = (BsVendorLargeDataRef)obj;
            if (!xSV(_largeDataRefId, other._largeDataRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _largeDataRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null)
        { sb.append(li).append(xbRDS(_vendorLargeData, "vendorLargeData")); }
        if (_vendorLargeDataRefSelf != null)
        { sb.append(li).append(xbRDS(_vendorLargeDataRefSelf, "vendorLargeDataRefSelf")); }
        if (_vendorLargeDataRefSelfList != null) { for (VendorLargeDataRef et : _vendorLargeDataRefSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefSelfList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_largeDataRefId));
        sb.append(dm).append(xfND(_largeDataId));
        sb.append(dm).append(xfUD(_dateIndex));
        sb.append(dm).append(xfUD(_dateNoIndex));
        sb.append(dm).append(xfND(_timestampIndex));
        sb.append(dm).append(xfND(_timestampNoIndex));
        sb.append(dm).append(xfND(_nullableDecimalIndex));
        sb.append(dm).append(xfND(_nullableDecimalNoIndex));
        sb.append(dm).append(xfND(_selfParentId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null) { sb.append(dm).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null) { sb.append(dm).append("vendorLargeDataRefSelf"); }
        if (_vendorLargeDataRefSelfList != null && !_vendorLargeDataRefSelfList.isEmpty())
        { sb.append(dm).append("vendorLargeDataRefSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeDataRef clone() {
        return (VendorLargeDataRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] large_data_ref_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'large_data_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] large_data_ref_id: {PK, NotNull, int8(19)} <br />
     * @param largeDataRefId The value of the column 'large_data_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        __modifiedProperties.addPropertyName("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] large_data_id: {NotNull, int8(19), FK to vendor_large_data} <br />
     * @return The value of the column 'large_data_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] large_data_id: {NotNull, int8(19), FK to vendor_large_data} <br />
     * @param largeDataId The value of the column 'large_data_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] date_index: {IX, NotNull, date(13)} <br />
     * @return The value of the column 'date_index'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] date_index: {IX, NotNull, date(13)} <br />
     * @param dateIndex The value of the column 'date_index'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.util.Date dateIndex) {
        __modifiedProperties.addPropertyName("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] date_no_index: {NotNull, date(13)} <br />
     * @return The value of the column 'date_no_index'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] date_no_index: {NotNull, date(13)} <br />
     * @param dateNoIndex The value of the column 'date_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.util.Date dateNoIndex) {
        __modifiedProperties.addPropertyName("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] timestamp_index: {IX, NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_index'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] timestamp_index: {IX, NotNull, timestamp(26, 3)} <br />
     * @param timestampIndex The value of the column 'timestamp_index'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.sql.Timestamp timestampIndex) {
        __modifiedProperties.addPropertyName("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] timestamp_no_index: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_no_index'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] timestamp_no_index: {NotNull, timestamp(26, 3)} <br />
     * @param timestampNoIndex The value of the column 'timestamp_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.sql.Timestamp timestampNoIndex) {
        __modifiedProperties.addPropertyName("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] nullable_decimal_index: {IX, numeric(12, 3)} <br />
     * @return The value of the column 'nullable_decimal_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] nullable_decimal_index: {IX, numeric(12, 3)} <br />
     * @param nullableDecimalIndex The value of the column 'nullable_decimal_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        __modifiedProperties.addPropertyName("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] nullable_decimal_no_index: {numeric(12, 3)} <br />
     * @return The value of the column 'nullable_decimal_no_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] nullable_decimal_no_index: {numeric(12, 3)} <br />
     * @param nullableDecimalNoIndex The value of the column 'nullable_decimal_no_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        __modifiedProperties.addPropertyName("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] self_parent_id: {int8(19), FK to vendor_large_data_ref} <br />
     * @return The value of the column 'self_parent_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] self_parent_id: {int8(19), FK to vendor_large_data_ref} <br />
     * @param selfParentId The value of the column 'self_parent_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        __modifiedProperties.addPropertyName("selfParentId");
        _selfParentId = selfParentId;
    }
}
