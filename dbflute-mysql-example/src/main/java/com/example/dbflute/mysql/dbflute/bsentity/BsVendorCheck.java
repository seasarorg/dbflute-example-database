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

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_TEXT, TYPE_OF_TINYTEXT, TYPE_OF_MEDIUMTEXT, TYPE_OF_LONGTEXT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_FLOAT, TYPE_OF_DOUBLE, TYPE_OF_DATE, TYPE_OF_DATETIME, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_YEAR, TYPE_OF_BOOLEAN, TYPE_OF_BLOB, TYPE_OF_TINYBLOB, TYPE_OF_MEDIUMBLOB, TYPE_OF_LONGBLOB, TYPE_OF_BINARY, TYPE_OF_VARBINARY, TYPE_OF_ENUM, TYPE_OF_SET
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfChar = entity.getTypeOfChar();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * String typeOfText = entity.getTypeOfText();
 * String typeOfTinytext = entity.getTypeOfTinytext();
 * String typeOfMediumtext = entity.getTypeOfMediumtext();
 * String typeOfLongtext = entity.getTypeOfLongtext();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * java.math.BigDecimal typeOfDecimalDecimal = entity.getTypeOfDecimalDecimal();
 * Integer typeOfDecimalInteger = entity.getTypeOfDecimalInteger();
 * Long typeOfDecimalBigint = entity.getTypeOfDecimalBigint();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * java.math.BigDecimal typeOfFloat = entity.getTypeOfFloat();
 * java.math.BigDecimal typeOfDouble = entity.getTypeOfDouble();
 * java.util.Date typeOfDate = entity.getTypeOfDate();
 * java.sql.Timestamp typeOfDatetime = entity.getTypeOfDatetime();
 * java.sql.Timestamp typeOfTimestamp = entity.getTypeOfTimestamp();
 * java.sql.Time typeOfTime = entity.getTypeOfTime();
 * java.util.Date typeOfYear = entity.getTypeOfYear();
 * Boolean typeOfBoolean = entity.getTypeOfBoolean();
 * byte[] typeOfBlob = entity.getTypeOfBlob();
 * byte[] typeOfTinyblob = entity.getTypeOfTinyblob();
 * byte[] typeOfMediumblob = entity.getTypeOfMediumblob();
 * byte[] typeOfLongblob = entity.getTypeOfLongblob();
 * byte[] typeOfBinary = entity.getTypeOfBinary();
 * byte[] typeOfVarbinary = entity.getTypeOfVarbinary();
 * String typeOfEnum = entity.getTypeOfEnum();
 * String typeOfSet = entity.getTypeOfSet();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfTinytext(typeOfTinytext);
 * entity.setTypeOfMediumtext(typeOfMediumtext);
 * entity.setTypeOfLongtext(typeOfLongtext);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfDecimalDecimal(typeOfDecimalDecimal);
 * entity.setTypeOfDecimalInteger(typeOfDecimalInteger);
 * entity.setTypeOfDecimalBigint(typeOfDecimalBigint);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfFloat(typeOfFloat);
 * entity.setTypeOfDouble(typeOfDouble);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfDatetime(typeOfDatetime);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfTime(typeOfTime);
 * entity.setTypeOfYear(typeOfYear);
 * entity.setTypeOfBoolean(typeOfBoolean);
 * entity.setTypeOfBlob(typeOfBlob);
 * entity.setTypeOfTinyblob(typeOfTinyblob);
 * entity.setTypeOfMediumblob(typeOfMediumblob);
 * entity.setTypeOfLongblob(typeOfLongblob);
 * entity.setTypeOfBinary(typeOfBinary);
 * entity.setTypeOfVarbinary(typeOfVarbinary);
 * entity.setTypeOfEnum(typeOfEnum);
 * entity.setTypeOfSet(typeOfSet);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheck implements Entity, Serializable, Cloneable {

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
    /** VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_CHAR: {CHAR(3)} */
    protected String _typeOfChar;

    /** TYPE_OF_VARCHAR: {VARCHAR(200)} */
    protected String _typeOfVarchar;

    /** TYPE_OF_TEXT: {TEXT(65535)} */
    protected String _typeOfText;

    /** TYPE_OF_TINYTEXT: {TINYTEXT(255)} */
    protected String _typeOfTinytext;

    /** TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} */
    protected String _typeOfMediumtext;

    /** TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} */
    protected String _typeOfLongtext;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} */
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} */
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfDecimalDecimal;

    /** TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} */
    protected Integer _typeOfDecimalInteger;

    /** TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} */
    protected Long _typeOfDecimalBigint;

    /** TYPE_OF_INTEGER: {INT(10)} */
    protected Integer _typeOfInteger;

    /** TYPE_OF_BIGINT: {BIGINT(19)} */
    protected Long _typeOfBigint;

    /** TYPE_OF_FLOAT: {FLOAT(12)} */
    protected java.math.BigDecimal _typeOfFloat;

    /** TYPE_OF_DOUBLE: {DOUBLE(22)} */
    protected java.math.BigDecimal _typeOfDouble;

    /** TYPE_OF_DATE: {DATE(10)} */
    protected java.util.Date _typeOfDate;

    /** TYPE_OF_DATETIME: {DATETIME(19)} */
    protected java.sql.Timestamp _typeOfDatetime;

    /** TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _typeOfTimestamp;

    /** TYPE_OF_TIME: {TIME(8)} */
    protected java.sql.Time _typeOfTime;

    /** TYPE_OF_YEAR: {YEAR} */
    protected java.util.Date _typeOfYear;

    /** TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} */
    protected Boolean _typeOfBoolean;

    /** TYPE_OF_BLOB: {BLOB(65535)} */
    protected byte[] _typeOfBlob;

    /** TYPE_OF_TINYBLOB: {TINYBLOB(255)} */
    protected byte[] _typeOfTinyblob;

    /** TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} */
    protected byte[] _typeOfMediumblob;

    /** TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} */
    protected byte[] _typeOfLongblob;

    /** TYPE_OF_BINARY: {BINARY(1)} */
    protected byte[] _typeOfBinary;

    /** TYPE_OF_VARBINARY: {VARBINARY(1000)} */
    protected byte[] _typeOfVarbinary;

    /** TYPE_OF_ENUM: {ENUM(6)} */
    protected String _typeOfEnum;

    /** TYPE_OF_SET: {SET(15)} */
    protected String _typeOfSet;

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
        return "vendor_check";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorCheck";
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
        if (getVendorCheckId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of typeOfBoolean as the classification of BooleanFlg. <br />
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br />
     * boolean classification for boolean column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BooleanFlg getTypeOfBooleanAsBooleanFlg() {
        return CDef.BooleanFlg.codeOf(getTypeOfBoolean());
    }

    /**
     * Set the value of typeOfBoolean as the classification of BooleanFlg. <br />
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br />
     * boolean classification for boolean column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg cdef) {
        setTypeOfBoolean(cdef != null ? InternalUtil.toBoolean(cdef.code()) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of typeOfBoolean as True (true). <br />
     * Checked: means yes
     */
    public void setTypeOfBoolean_True() {
        setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg.True);
    }

    /**
     * Set the value of typeOfBoolean as False (false). <br />
     * Unchecked: means no
     */
    public void setTypeOfBoolean_False() {
        setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of typeOfBoolean True? <br />
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBooleanTrue() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.True) : false;
    }

    /**
     * Is the value of typeOfBoolean False? <br />
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBooleanFalse() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'typeOfBoolean' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getTypeOfBooleanAlias() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.alias() : null;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsVendorCheck)) { return false; }
        BsVendorCheck otherEntity = (BsVendorCheck)other;
        if (!xSV(getVendorCheckId(), otherEntity.getVendorCheckId())) { return false; }
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
        result = xCH(result, getVendorCheckId());
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
        String delimiter = ", ";
        sb.append(delimiter).append(getVendorCheckId());
        sb.append(delimiter).append(getTypeOfChar());
        sb.append(delimiter).append(getTypeOfVarchar());
        sb.append(delimiter).append(getTypeOfText());
        sb.append(delimiter).append(getTypeOfTinytext());
        sb.append(delimiter).append(getTypeOfMediumtext());
        sb.append(delimiter).append(getTypeOfLongtext());
        sb.append(delimiter).append(getTypeOfNumericDecimal());
        sb.append(delimiter).append(getTypeOfNumericInteger());
        sb.append(delimiter).append(getTypeOfNumericBigint());
        sb.append(delimiter).append(getTypeOfDecimalDecimal());
        sb.append(delimiter).append(getTypeOfDecimalInteger());
        sb.append(delimiter).append(getTypeOfDecimalBigint());
        sb.append(delimiter).append(getTypeOfInteger());
        sb.append(delimiter).append(getTypeOfBigint());
        sb.append(delimiter).append(getTypeOfFloat());
        sb.append(delimiter).append(getTypeOfDouble());
        sb.append(delimiter).append(xfUD(getTypeOfDate()));
        sb.append(delimiter).append(getTypeOfDatetime());
        sb.append(delimiter).append(getTypeOfTimestamp());
        sb.append(delimiter).append(getTypeOfTime());
        sb.append(delimiter).append(xfUD(getTypeOfYear()));
        sb.append(delimiter).append(getTypeOfBoolean());
        sb.append(delimiter).append(xfBA(getTypeOfBlob()));
        sb.append(delimiter).append(xfBA(getTypeOfTinyblob()));
        sb.append(delimiter).append(xfBA(getTypeOfMediumblob()));
        sb.append(delimiter).append(xfBA(getTypeOfLongblob()));
        sb.append(delimiter).append(xfBA(getTypeOfBinary()));
        sb.append(delimiter).append(xfBA(getTypeOfVarbinary()));
        sb.append(delimiter).append(getTypeOfEnum());
        sb.append(delimiter).append(getTypeOfSet());
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
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return InternalUtil.toString(bytes);
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorCheck clone() {
        try {
            return (VendorCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        this._vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        return _typeOfChar;
    }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        __modifiedProperties.addPropertyName("typeOfChar");
        this._typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(200)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(200)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        __modifiedProperties.addPropertyName("typeOfVarchar");
        this._typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_TEXT: {TEXT(65535)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {TEXT(65535)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.addPropertyName("typeOfText");
        this._typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br />
     * @return The value of the column 'TYPE_OF_TINYTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfTinytext() {
        return _typeOfTinytext;
    }

    /**
     * [set] TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br />
     * @param typeOfTinytext The value of the column 'TYPE_OF_TINYTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTinytext(String typeOfTinytext) {
        __modifiedProperties.addPropertyName("typeOfTinytext");
        this._typeOfTinytext = typeOfTinytext;
    }

    /**
     * [get] TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br />
     * @return The value of the column 'TYPE_OF_MEDIUMTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfMediumtext() {
        return _typeOfMediumtext;
    }

    /**
     * [set] TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br />
     * @param typeOfMediumtext The value of the column 'TYPE_OF_MEDIUMTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMediumtext(String typeOfMediumtext) {
        __modifiedProperties.addPropertyName("typeOfMediumtext");
        this._typeOfMediumtext = typeOfMediumtext;
    }

    /**
     * [get] TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_LONGTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLongtext() {
        return _typeOfLongtext;
    }

    /**
     * [set] TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br />
     * @param typeOfLongtext The value of the column 'TYPE_OF_LONGTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongtext(String typeOfLongtext) {
        __modifiedProperties.addPropertyName("typeOfLongtext");
        this._typeOfLongtext = typeOfLongtext;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        __modifiedProperties.addPropertyName("typeOfNumericDecimal");
        this._typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        __modifiedProperties.addPropertyName("typeOfNumericInteger");
        this._typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        __modifiedProperties.addPropertyName("typeOfNumericBigint");
        this._typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimalDecimal() {
        return _typeOfDecimalDecimal;
    }

    /**
     * [set] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfDecimalDecimal The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalDecimal(java.math.BigDecimal typeOfDecimalDecimal) {
        __modifiedProperties.addPropertyName("typeOfDecimalDecimal");
        this._typeOfDecimalDecimal = typeOfDecimalDecimal;
    }

    /**
     * [get] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfDecimalInteger() {
        return _typeOfDecimalInteger;
    }

    /**
     * [set] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfDecimalInteger The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalInteger(Integer typeOfDecimalInteger) {
        __modifiedProperties.addPropertyName("typeOfDecimalInteger");
        this._typeOfDecimalInteger = typeOfDecimalInteger;
    }

    /**
     * [get] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfDecimalBigint() {
        return _typeOfDecimalBigint;
    }

    /**
     * [set] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfDecimalBigint The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalBigint(Long typeOfDecimalBigint) {
        __modifiedProperties.addPropertyName("typeOfDecimalBigint");
        this._typeOfDecimalBigint = typeOfDecimalBigint;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INT(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INT(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        __modifiedProperties.addPropertyName("typeOfInteger");
        this._typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        __modifiedProperties.addPropertyName("typeOfBigint");
        this._typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_FLOAT: {FLOAT(12)} <br />
     * @return The value of the column 'TYPE_OF_FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        return _typeOfFloat;
    }

    /**
     * [set] TYPE_OF_FLOAT: {FLOAT(12)} <br />
     * @param typeOfFloat The value of the column 'TYPE_OF_FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        __modifiedProperties.addPropertyName("typeOfFloat");
        this._typeOfFloat = typeOfFloat;
    }

    /**
     * [get] TYPE_OF_DOUBLE: {DOUBLE(22)} <br />
     * @return The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDouble() {
        return _typeOfDouble;
    }

    /**
     * [set] TYPE_OF_DOUBLE: {DOUBLE(22)} <br />
     * @param typeOfDouble The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDouble(java.math.BigDecimal typeOfDouble) {
        __modifiedProperties.addPropertyName("typeOfDouble");
        this._typeOfDouble = typeOfDouble;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(10)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(10)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        __modifiedProperties.addPropertyName("typeOfDate");
        this._typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'TYPE_OF_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfDatetime() {
        return _typeOfDatetime;
    }

    /**
     * [set] TYPE_OF_DATETIME: {DATETIME(19)} <br />
     * @param typeOfDatetime The value of the column 'TYPE_OF_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime(java.sql.Timestamp typeOfDatetime) {
        __modifiedProperties.addPropertyName("typeOfDatetime");
        this._typeOfDatetime = typeOfDatetime;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        this._typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_TIME: {TIME(8)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTime() {
        return _typeOfTime;
    }

    /**
     * [set] TYPE_OF_TIME: {TIME(8)} <br />
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.sql.Time typeOfTime) {
        __modifiedProperties.addPropertyName("typeOfTime");
        this._typeOfTime = typeOfTime;
    }

    /**
     * [get] TYPE_OF_YEAR: {YEAR} <br />
     * @return The value of the column 'TYPE_OF_YEAR'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfYear() {
        return _typeOfYear;
    }

    /**
     * [set] TYPE_OF_YEAR: {YEAR} <br />
     * @param typeOfYear The value of the column 'TYPE_OF_YEAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfYear(java.util.Date typeOfYear) {
        __modifiedProperties.addPropertyName("typeOfYear");
        this._typeOfYear = typeOfYear;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBoolean() {
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBoolean(Boolean typeOfBoolean) {
        __modifiedProperties.addPropertyName("typeOfBoolean");
        this._typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(65535)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(65535)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.addPropertyName("typeOfBlob");
        this._typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_TINYBLOB: {TINYBLOB(255)} <br />
     * @return The value of the column 'TYPE_OF_TINYBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfTinyblob() {
        return _typeOfTinyblob;
    }

    /**
     * [set] TYPE_OF_TINYBLOB: {TINYBLOB(255)} <br />
     * @param typeOfTinyblob The value of the column 'TYPE_OF_TINYBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTinyblob(byte[] typeOfTinyblob) {
        __modifiedProperties.addPropertyName("typeOfTinyblob");
        this._typeOfTinyblob = typeOfTinyblob;
    }

    /**
     * [get] TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} <br />
     * @return The value of the column 'TYPE_OF_MEDIUMBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfMediumblob() {
        return _typeOfMediumblob;
    }

    /**
     * [set] TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} <br />
     * @param typeOfMediumblob The value of the column 'TYPE_OF_MEDIUMBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMediumblob(byte[] typeOfMediumblob) {
        __modifiedProperties.addPropertyName("typeOfMediumblob");
        this._typeOfMediumblob = typeOfMediumblob;
    }

    /**
     * [get] TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_LONGBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfLongblob() {
        return _typeOfLongblob;
    }

    /**
     * [set] TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} <br />
     * @param typeOfLongblob The value of the column 'TYPE_OF_LONGBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongblob(byte[] typeOfLongblob) {
        __modifiedProperties.addPropertyName("typeOfLongblob");
        this._typeOfLongblob = typeOfLongblob;
    }

    /**
     * [get] TYPE_OF_BINARY: {BINARY(1)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBinary() {
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {BINARY(1)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinary(byte[] typeOfBinary) {
        __modifiedProperties.addPropertyName("typeOfBinary");
        this._typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_VARBINARY: {VARBINARY(1000)} <br />
     * @return The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfVarbinary() {
        return _typeOfVarbinary;
    }

    /**
     * [set] TYPE_OF_VARBINARY: {VARBINARY(1000)} <br />
     * @param typeOfVarbinary The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarbinary(byte[] typeOfVarbinary) {
        __modifiedProperties.addPropertyName("typeOfVarbinary");
        this._typeOfVarbinary = typeOfVarbinary;
    }

    /**
     * [get] TYPE_OF_ENUM: {ENUM(6)} <br />
     * @return The value of the column 'TYPE_OF_ENUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfEnum() {
        return _typeOfEnum;
    }

    /**
     * [set] TYPE_OF_ENUM: {ENUM(6)} <br />
     * @param typeOfEnum The value of the column 'TYPE_OF_ENUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfEnum(String typeOfEnum) {
        __modifiedProperties.addPropertyName("typeOfEnum");
        this._typeOfEnum = typeOfEnum;
    }

    /**
     * [get] TYPE_OF_SET: {SET(15)} <br />
     * @return The value of the column 'TYPE_OF_SET'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfSet() {
        return _typeOfSet;
    }

    /**
     * [set] TYPE_OF_SET: {SET(15)} <br />
     * @param typeOfSet The value of the column 'TYPE_OF_SET'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSet(String typeOfSet) {
        __modifiedProperties.addPropertyName("typeOfSet");
        this._typeOfSet = typeOfSet;
    }
}
