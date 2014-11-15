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
package com.example.dbflute.mysql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

/**
 * The entity of LargeManualPaging. <br />
 * <pre>
 * [primary-key]
 *     
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
public abstract class BsLargeManualPaging extends AbstractEntity {

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
    /** LARGE_DATA_REF_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_REF_ID} */
    protected Long _largeDataRefId;

    /** LARGE_DATA_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_ID} */
    protected Long _largeDataId;

    /** DATE_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_INDEX} */
    protected java.util.Date _dateIndex;

    /** DATE_NO_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_NO_INDEX} */
    protected java.util.Date _dateNoIndex;

    /** TIMESTAMP_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_INDEX} */
    protected java.sql.Timestamp _timestampIndex;

    /** TIMESTAMP_NO_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_NO_INDEX} */
    protected java.sql.Timestamp _timestampNoIndex;

    /** NULLABLE_DECIMAL_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_INDEX} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_NO_INDEX} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** SELF_PARENT_ID: {BIGINT(20), refers to vendor_large_data_ref.SELF_PARENT_ID} */
    protected Long _selfParentId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "LargeManualPaging";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "largeManualPaging";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta.LargeManualPagingDbm.getInstance();
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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLargeManualPaging) {
            BsLargeManualPaging other = (BsLargeManualPaging)obj;
            if (!xSV(_largeDataRefId, other._largeDataRefId)) { return false; }
            if (!xSV(_largeDataId, other._largeDataId)) { return false; }
            if (!xSV(_dateIndex, other._dateIndex)) { return false; }
            if (!xSV(_dateNoIndex, other._dateNoIndex)) { return false; }
            if (!xSV(_timestampIndex, other._timestampIndex)) { return false; }
            if (!xSV(_timestampNoIndex, other._timestampNoIndex)) { return false; }
            if (!xSV(_nullableDecimalIndex, other._nullableDecimalIndex)) { return false; }
            if (!xSV(_nullableDecimalNoIndex, other._nullableDecimalNoIndex)) { return false; }
            if (!xSV(_selfParentId, other._selfParentId)) { return false; }
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
        hs = xCH(hs, _largeDataId);
        hs = xCH(hs, _dateIndex);
        hs = xCH(hs, _dateNoIndex);
        hs = xCH(hs, _timestampIndex);
        hs = xCH(hs, _timestampNoIndex);
        hs = xCH(hs, _nullableDecimalIndex);
        hs = xCH(hs, _nullableDecimalNoIndex);
        hs = xCH(hs, _selfParentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
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
        return "";
    }

    @Override
    public LargeManualPaging clone() {
        return (LargeManualPaging)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_DATA_REF_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_REF_ID} <br />
     * @return The value of the column 'LARGE_DATA_REF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] LARGE_DATA_REF_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_REF_ID} <br />
     * @param largeDataRefId The value of the column 'LARGE_DATA_REF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        registerModifiedProperty("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] LARGE_DATA_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_ID} <br />
     * @return The value of the column 'LARGE_DATA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_ID} <br />
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] DATE_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_INDEX} <br />
     * @return The value of the column 'DATE_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] DATE_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_INDEX} <br />
     * @param dateIndex The value of the column 'DATE_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateIndex(java.util.Date dateIndex) {
        registerModifiedProperty("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] DATE_NO_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_NO_INDEX} <br />
     * @return The value of the column 'DATE_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] DATE_NO_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_NO_INDEX} <br />
     * @param dateNoIndex The value of the column 'DATE_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateNoIndex(java.util.Date dateNoIndex) {
        registerModifiedProperty("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] TIMESTAMP_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_INDEX} <br />
     * @return The value of the column 'TIMESTAMP_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] TIMESTAMP_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_INDEX} <br />
     * @param timestampIndex The value of the column 'TIMESTAMP_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampIndex(java.sql.Timestamp timestampIndex) {
        registerModifiedProperty("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] TIMESTAMP_NO_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_NO_INDEX} <br />
     * @return The value of the column 'TIMESTAMP_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] TIMESTAMP_NO_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_NO_INDEX} <br />
     * @param timestampNoIndex The value of the column 'TIMESTAMP_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampNoIndex(java.sql.Timestamp timestampNoIndex) {
        registerModifiedProperty("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_INDEX} <br />
     * @return The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_INDEX} <br />
     * @param nullableDecimalIndex The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        registerModifiedProperty("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_NO_INDEX} <br />
     * @return The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_NO_INDEX} <br />
     * @param nullableDecimalNoIndex The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        registerModifiedProperty("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] SELF_PARENT_ID: {BIGINT(20), refers to vendor_large_data_ref.SELF_PARENT_ID} <br />
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] SELF_PARENT_ID: {BIGINT(20), refers to vendor_large_data_ref.SELF_PARENT_ID} <br />
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }
}
