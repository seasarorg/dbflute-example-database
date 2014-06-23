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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_POINT_TYPE_MAPPING as TABLE. <br />
 * <pre>
 * [primary-key]
 *     POINT_TYPE_MAPPING_ID
 * 
 * [column]
 *     POINT_TYPE_MAPPING_ID, POINT_TYPE_MAPPING_MEMBER_NAME, POINT_TYPE_MAPPING_PRICE_COUNT, POINT_TYPE_MAPPING_SALE_DATE, POINT_TYPE_MAPPING_WANTED_DATETIME
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
 * Long pointTypeMappingId = entity.getPointTypeMappingId();
 * com.example.dbflute.mysql.mytype.MyMemberName pointTypeMappingMemberName = entity.getPointTypeMappingMemberName();
 * com.example.dbflute.mysql.mytype.MyPriceCount pointTypeMappingPriceCount = entity.getPointTypeMappingPriceCount();
 * com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate = entity.getPointTypeMappingSaleDate();
 * java.util.Date pointTypeMappingWantedDatetime = entity.getPointTypeMappingWantedDatetime();
 * entity.setPointTypeMappingId(pointTypeMappingId);
 * entity.setPointTypeMappingMemberName(pointTypeMappingMemberName);
 * entity.setPointTypeMappingPriceCount(pointTypeMappingPriceCount);
 * entity.setPointTypeMappingSaleDate(pointTypeMappingSaleDate);
 * entity.setPointTypeMappingWantedDatetime(pointTypeMappingWantedDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePointTypeMapping implements Entity, Serializable, Cloneable {

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
    /** POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _pointTypeMappingId;

    /** POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)} */
    protected com.example.dbflute.mysql.mytype.MyMemberName _pointTypeMappingMemberName;

    /** POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)} */
    protected com.example.dbflute.mysql.mytype.MyPriceCount _pointTypeMappingPriceCount;

    /** POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)} */
    protected com.example.dbflute.mysql.mytype.MySaleDate _pointTypeMappingSaleDate;

    /** POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)} */
    protected java.util.Date _pointTypeMappingWantedDatetime;

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
        return "white_point_type_mapping";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePointTypeMapping";
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
        if (getPointTypeMappingId() == null) { return false; }
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
        if (obj == null || !(obj instanceof BsWhitePointTypeMapping)) { return false; }
        BsWhitePointTypeMapping other = (BsWhitePointTypeMapping)obj;
        if (!xSV(getPointTypeMappingId(), other.getPointTypeMappingId())) { return false; }
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
        hs = xCH(hs, getPointTypeMappingId());
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
        sb.append(dm).append(getPointTypeMappingId());
        sb.append(dm).append(getPointTypeMappingMemberName());
        sb.append(dm).append(getPointTypeMappingPriceCount());
        sb.append(dm).append(getPointTypeMappingSaleDate());
        sb.append(dm).append(xfUD(getPointTypeMappingWantedDatetime()));
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
    public WhitePointTypeMapping clone() {
        try {
            return (WhitePointTypeMapping)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'POINT_TYPE_MAPPING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPointTypeMappingId() {
        return _pointTypeMappingId;
    }

    /**
     * [set] POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param pointTypeMappingId The value of the column 'POINT_TYPE_MAPPING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPointTypeMappingId(Long pointTypeMappingId) {
        __modifiedProperties.addPropertyName("pointTypeMappingId");
        _pointTypeMappingId = pointTypeMappingId;
    }

    /**
     * [get] POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)} <br />
     * @return The value of the column 'POINT_TYPE_MAPPING_MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public com.example.dbflute.mysql.mytype.MyMemberName getPointTypeMappingMemberName() {
        return _pointTypeMappingMemberName;
    }

    /**
     * [set] POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)} <br />
     * @param pointTypeMappingMemberName The value of the column 'POINT_TYPE_MAPPING_MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingMemberName(com.example.dbflute.mysql.mytype.MyMemberName pointTypeMappingMemberName) {
        __modifiedProperties.addPropertyName("pointTypeMappingMemberName");
        _pointTypeMappingMemberName = pointTypeMappingMemberName;
    }

    /**
     * [get] POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)} <br />
     * @return The value of the column 'POINT_TYPE_MAPPING_PRICE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public com.example.dbflute.mysql.mytype.MyPriceCount getPointTypeMappingPriceCount() {
        return _pointTypeMappingPriceCount;
    }

    /**
     * [set] POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)} <br />
     * @param pointTypeMappingPriceCount The value of the column 'POINT_TYPE_MAPPING_PRICE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingPriceCount(com.example.dbflute.mysql.mytype.MyPriceCount pointTypeMappingPriceCount) {
        __modifiedProperties.addPropertyName("pointTypeMappingPriceCount");
        _pointTypeMappingPriceCount = pointTypeMappingPriceCount;
    }

    /**
     * [get] POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)} <br />
     * @return The value of the column 'POINT_TYPE_MAPPING_SALE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public com.example.dbflute.mysql.mytype.MySaleDate getPointTypeMappingSaleDate() {
        return _pointTypeMappingSaleDate;
    }

    /**
     * [set] POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)} <br />
     * @param pointTypeMappingSaleDate The value of the column 'POINT_TYPE_MAPPING_SALE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingSaleDate(com.example.dbflute.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        __modifiedProperties.addPropertyName("pointTypeMappingSaleDate");
        _pointTypeMappingSaleDate = pointTypeMappingSaleDate;
    }

    /**
     * [get] POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'POINT_TYPE_MAPPING_WANTED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getPointTypeMappingWantedDatetime() {
        return _pointTypeMappingWantedDatetime;
    }

    /**
     * [set] POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)} <br />
     * @param pointTypeMappingWantedDatetime The value of the column 'POINT_TYPE_MAPPING_WANTED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingWantedDatetime(java.util.Date pointTypeMappingWantedDatetime) {
        __modifiedProperties.addPropertyName("pointTypeMappingWantedDatetime");
        _pointTypeMappingWantedDatetime = pointTypeMappingWantedDatetime;
    }
}
