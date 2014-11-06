/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of VENDOR_LARGE_DATA_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LARGE_DATA_REF_ID
 * 
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
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
    /** LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _largeDataRefId;

    /** LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} */
    protected Long _largeDataId;

    /** DATE_INDEX: {IX, NotNull, DATE(10)} */
    protected java.util.Date _dateIndex;

    /** DATE_NO_INDEX: {NotNull, DATE(10)} */
    protected java.util.Date _dateNoIndex;

    /** TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _timestampIndex;

    /** TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _timestampNoIndex;

    /** NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} */
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
    /** vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'. */
    protected VendorLargeData _vendorLargeData;

    /**
     * [get] vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The entity of foreign property 'vendorLargeData'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeData getVendorLargeData() {
        return _vendorLargeData;
    }

    /**
     * [set] vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(VendorLargeData vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'. */
    protected VendorLargeDataRef _vendorLargeDataRefSelf;

    /**
     * [get] vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeDataRef getVendorLargeDataRefSelf() {
        return _vendorLargeDataRefSelf;
    }

    /**
     * [set] vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @param vendorLargeDataRefSelf The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelf(VendorLargeDataRef vendorLargeDataRefSelf) {
        _vendorLargeDataRefSelf = vendorLargeDataRefSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefSelfList;

    /**
     * [get] vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * [set] vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
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
        if (_vendorLargeData != null)
        { sb.append(dm).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null)
        { sb.append(dm).append("vendorLargeDataRefSelf"); }
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
     * [get] LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param largeDataRefId The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        registerModifiedProperty("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} <br />
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} <br />
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] DATE_INDEX: {IX, NotNull, DATE(10)} <br />
     * @return The value of the column 'DATE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] DATE_INDEX: {IX, NotNull, DATE(10)} <br />
     * @param dateIndex The value of the column 'DATE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.util.Date dateIndex) {
        registerModifiedProperty("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] DATE_NO_INDEX: {NotNull, DATE(10)} <br />
     * @return The value of the column 'DATE_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] DATE_NO_INDEX: {NotNull, DATE(10)} <br />
     * @param dateNoIndex The value of the column 'DATE_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.util.Date dateNoIndex) {
        registerModifiedProperty("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} <br />
     * @return The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} <br />
     * @param timestampIndex The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.sql.Timestamp timestampIndex) {
        registerModifiedProperty("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} <br />
     * @param timestampNoIndex The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.sql.Timestamp timestampNoIndex) {
        registerModifiedProperty("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} <br />
     * @return The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} <br />
     * @param nullableDecimalIndex The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        registerModifiedProperty("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} <br />
     * @return The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} <br />
     * @param nullableDecimalNoIndex The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        registerModifiedProperty("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} <br />
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} <br />
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }
}
