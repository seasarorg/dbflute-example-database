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
 * The entity of WHITE_DATE_ADJUSTMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DATE_ADJUSTMENT_ID
 * 
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATETIME, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_NAMED_STRING_LONG, ADJUSTED_NAMED_TYPED_LONG, ADJUSTED_PINPOINT_STRING_LONG, ADJUSTED_PINPOINT_TYPED_LONG, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING
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
 * Long dateAdjustmentId = entity.getDateAdjustmentId();
 * java.util.Date adjustedDate = entity.getAdjustedDate();
 * java.sql.Timestamp adjustedDatetime = entity.getAdjustedDatetime();
 * java.sql.Time adjustedTime = entity.getAdjustedTime();
 * Integer adjustedInteger = entity.getAdjustedInteger();
 * Long adjustedNamedStringLong = entity.getAdjustedNamedStringLong();
 * Long adjustedNamedTypedLong = entity.getAdjustedNamedTypedLong();
 * Long adjustedPinpointStringLong = entity.getAdjustedPinpointStringLong();
 * Long adjustedPinpointTypedLong = entity.getAdjustedPinpointTypedLong();
 * Long adjustedPlainLong = entity.getAdjustedPlainLong();
 * String adjustedString = entity.getAdjustedString();
 * entity.setDateAdjustmentId(dateAdjustmentId);
 * entity.setAdjustedDate(adjustedDate);
 * entity.setAdjustedDatetime(adjustedDatetime);
 * entity.setAdjustedTime(adjustedTime);
 * entity.setAdjustedInteger(adjustedInteger);
 * entity.setAdjustedNamedStringLong(adjustedNamedStringLong);
 * entity.setAdjustedNamedTypedLong(adjustedNamedTypedLong);
 * entity.setAdjustedPinpointStringLong(adjustedPinpointStringLong);
 * entity.setAdjustedPinpointTypedLong(adjustedPinpointTypedLong);
 * entity.setAdjustedPlainLong(adjustedPlainLong);
 * entity.setAdjustedString(adjustedString);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDateAdjustment extends AbstractEntity {

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
    /** DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _dateAdjustmentId;

    /** (adjusted)ADJUSTED_DATE: {DATE(10)} */
    protected java.util.Date _adjustedDate;

    /** ADJUSTED_DATETIME: {DATETIME(19)} */
    protected java.sql.Timestamp _adjustedDatetime;

    /** ADJUSTED_TIME: {TIME(8)} */
    protected java.sql.Time _adjustedTime;

    /** ADJUSTED_INTEGER: {INT(10)} */
    protected Integer _adjustedInteger;

    /** (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)} */
    protected Long _adjustedNamedStringLong;

    /** (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)} */
    protected Long _adjustedNamedTypedLong;

    /** (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)} */
    protected Long _adjustedPinpointStringLong;

    /** (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)} */
    protected Long _adjustedPinpointTypedLong;

    /** ADJUSTED_PLAIN_LONG: {BIGINT(19)} */
    protected Long _adjustedPlainLong;

    /** ADJUSTED_STRING: {VARCHAR(32)} */
    protected String _adjustedString;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_date_adjustment";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteDateAdjustment";
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
        if (getDateAdjustmentId() == null) { return false; }
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
        if (obj instanceof BsWhiteDateAdjustment) {
            BsWhiteDateAdjustment other = (BsWhiteDateAdjustment)obj;
            if (!xSV(_dateAdjustmentId, other._dateAdjustmentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _dateAdjustmentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dateAdjustmentId));
        sb.append(dm).append(xfUD(_adjustedDate));
        sb.append(dm).append(xfND(_adjustedDatetime));
        sb.append(dm).append(xfND(_adjustedTime));
        sb.append(dm).append(xfND(_adjustedInteger));
        sb.append(dm).append(xfND(_adjustedNamedStringLong));
        sb.append(dm).append(xfND(_adjustedNamedTypedLong));
        sb.append(dm).append(xfND(_adjustedPinpointStringLong));
        sb.append(dm).append(xfND(_adjustedPinpointTypedLong));
        sb.append(dm).append(xfND(_adjustedPlainLong));
        sb.append(dm).append(xfND(_adjustedString));
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
    public WhiteDateAdjustment clone() {
        return (WhiteDateAdjustment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'DATE_ADJUSTMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDateAdjustmentId() {
        checkSpecifiedProperty("dateAdjustmentId");
        return _dateAdjustmentId;
    }

    /**
     * [set] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param dateAdjustmentId The value of the column 'DATE_ADJUSTMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDateAdjustmentId(Long dateAdjustmentId) {
        __modifiedProperties.addPropertyName("dateAdjustmentId");
        _dateAdjustmentId = dateAdjustmentId;
    }

    /**
     * [get] (adjusted)ADJUSTED_DATE: {DATE(10)} <br />
     * @return The value of the column 'ADJUSTED_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getAdjustedDate() {
        checkSpecifiedProperty("adjustedDate");
        return _adjustedDate;
    }

    /**
     * [set] (adjusted)ADJUSTED_DATE: {DATE(10)} <br />
     * @param adjustedDate The value of the column 'ADJUSTED_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedDate(java.util.Date adjustedDate) {
        __modifiedProperties.addPropertyName("adjustedDate");
        _adjustedDate = adjustedDate;
    }

    /**
     * [get] ADJUSTED_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'ADJUSTED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAdjustedDatetime() {
        checkSpecifiedProperty("adjustedDatetime");
        return _adjustedDatetime;
    }

    /**
     * [set] ADJUSTED_DATETIME: {DATETIME(19)} <br />
     * @param adjustedDatetime The value of the column 'ADJUSTED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedDatetime(java.sql.Timestamp adjustedDatetime) {
        __modifiedProperties.addPropertyName("adjustedDatetime");
        _adjustedDatetime = adjustedDatetime;
    }

    /**
     * [get] ADJUSTED_TIME: {TIME(8)} <br />
     * @return The value of the column 'ADJUSTED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getAdjustedTime() {
        checkSpecifiedProperty("adjustedTime");
        return _adjustedTime;
    }

    /**
     * [set] ADJUSTED_TIME: {TIME(8)} <br />
     * @param adjustedTime The value of the column 'ADJUSTED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedTime(java.sql.Time adjustedTime) {
        __modifiedProperties.addPropertyName("adjustedTime");
        _adjustedTime = adjustedTime;
    }

    /**
     * [get] ADJUSTED_INTEGER: {INT(10)} <br />
     * @return The value of the column 'ADJUSTED_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAdjustedInteger() {
        checkSpecifiedProperty("adjustedInteger");
        return _adjustedInteger;
    }

    /**
     * [set] ADJUSTED_INTEGER: {INT(10)} <br />
     * @param adjustedInteger The value of the column 'ADJUSTED_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedInteger(Integer adjustedInteger) {
        __modifiedProperties.addPropertyName("adjustedInteger");
        _adjustedInteger = adjustedInteger;
    }

    /**
     * [get] (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)} <br />
     * @return The value of the column 'ADJUSTED_NAMED_STRING_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedNamedStringLong() {
        checkSpecifiedProperty("adjustedNamedStringLong");
        return _adjustedNamedStringLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)} <br />
     * @param adjustedNamedStringLong The value of the column 'ADJUSTED_NAMED_STRING_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedNamedStringLong(Long adjustedNamedStringLong) {
        __modifiedProperties.addPropertyName("adjustedNamedStringLong");
        _adjustedNamedStringLong = adjustedNamedStringLong;
    }

    /**
     * [get] (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)} <br />
     * @return The value of the column 'ADJUSTED_NAMED_TYPED_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedNamedTypedLong() {
        checkSpecifiedProperty("adjustedNamedTypedLong");
        return _adjustedNamedTypedLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)} <br />
     * @param adjustedNamedTypedLong The value of the column 'ADJUSTED_NAMED_TYPED_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedNamedTypedLong(Long adjustedNamedTypedLong) {
        __modifiedProperties.addPropertyName("adjustedNamedTypedLong");
        _adjustedNamedTypedLong = adjustedNamedTypedLong;
    }

    /**
     * [get] (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)} <br />
     * @return The value of the column 'ADJUSTED_PINPOINT_STRING_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPinpointStringLong() {
        checkSpecifiedProperty("adjustedPinpointStringLong");
        return _adjustedPinpointStringLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)} <br />
     * @param adjustedPinpointStringLong The value of the column 'ADJUSTED_PINPOINT_STRING_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPinpointStringLong(Long adjustedPinpointStringLong) {
        __modifiedProperties.addPropertyName("adjustedPinpointStringLong");
        _adjustedPinpointStringLong = adjustedPinpointStringLong;
    }

    /**
     * [get] (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)} <br />
     * @return The value of the column 'ADJUSTED_PINPOINT_TYPED_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPinpointTypedLong() {
        checkSpecifiedProperty("adjustedPinpointTypedLong");
        return _adjustedPinpointTypedLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)} <br />
     * @param adjustedPinpointTypedLong The value of the column 'ADJUSTED_PINPOINT_TYPED_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPinpointTypedLong(Long adjustedPinpointTypedLong) {
        __modifiedProperties.addPropertyName("adjustedPinpointTypedLong");
        _adjustedPinpointTypedLong = adjustedPinpointTypedLong;
    }

    /**
     * [get] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br />
     * @return The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPlainLong() {
        checkSpecifiedProperty("adjustedPlainLong");
        return _adjustedPlainLong;
    }

    /**
     * [set] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br />
     * @param adjustedPlainLong The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPlainLong(Long adjustedPlainLong) {
        __modifiedProperties.addPropertyName("adjustedPlainLong");
        _adjustedPlainLong = adjustedPlainLong;
    }

    /**
     * [get] ADJUSTED_STRING: {VARCHAR(32)} <br />
     * @return The value of the column 'ADJUSTED_STRING'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdjustedString() {
        checkSpecifiedProperty("adjustedString");
        return _adjustedString;
    }

    /**
     * [set] ADJUSTED_STRING: {VARCHAR(32)} <br />
     * @param adjustedString The value of the column 'ADJUSTED_STRING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedString(String adjustedString) {
        __modifiedProperties.addPropertyName("adjustedString");
        _adjustedString = adjustedString;
    }
}
