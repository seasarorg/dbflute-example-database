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
public abstract class BsWhitePointTypeMapping extends AbstractEntity {

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
        if (obj instanceof BsWhitePointTypeMapping) {
            BsWhitePointTypeMapping other = (BsWhitePointTypeMapping)obj;
            if (!xSV(_pointTypeMappingId, other._pointTypeMappingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _pointTypeMappingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pointTypeMappingId));
        sb.append(dm).append(xfND(_pointTypeMappingMemberName));
        sb.append(dm).append(xfND(_pointTypeMappingPriceCount));
        sb.append(dm).append(xfND(_pointTypeMappingSaleDate));
        sb.append(dm).append(xfUD(_pointTypeMappingWantedDatetime));
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
    public WhitePointTypeMapping clone() {
        return (WhitePointTypeMapping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'POINT_TYPE_MAPPING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPointTypeMappingId() {
        checkSpecifiedProperty("pointTypeMappingId");
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
        checkSpecifiedProperty("pointTypeMappingMemberName");
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
        checkSpecifiedProperty("pointTypeMappingPriceCount");
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
        checkSpecifiedProperty("pointTypeMappingSaleDate");
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
        checkSpecifiedProperty("pointTypeMappingWantedDatetime");
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
