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
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
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
public abstract class BsVendorCheck extends AbstractEntity implements DomainEntity {

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
        setTypeOfBoolean(cdef != null ? toBoolean(cdef.code()) : null);
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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorCheck) {
            BsVendorCheck other = (BsVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendorCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorCheckId));
        sb.append(dm).append(xfND(_typeOfChar));
        sb.append(dm).append(xfND(_typeOfVarchar));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfTinytext));
        sb.append(dm).append(xfND(_typeOfMediumtext));
        sb.append(dm).append(xfND(_typeOfLongtext));
        sb.append(dm).append(xfND(_typeOfNumericDecimal));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
        sb.append(dm).append(xfND(_typeOfNumericBigint));
        sb.append(dm).append(xfND(_typeOfDecimalDecimal));
        sb.append(dm).append(xfND(_typeOfDecimalInteger));
        sb.append(dm).append(xfND(_typeOfDecimalBigint));
        sb.append(dm).append(xfND(_typeOfInteger));
        sb.append(dm).append(xfND(_typeOfBigint));
        sb.append(dm).append(xfND(_typeOfFloat));
        sb.append(dm).append(xfND(_typeOfDouble));
        sb.append(dm).append(xfUD(_typeOfDate));
        sb.append(dm).append(xfND(_typeOfDatetime));
        sb.append(dm).append(xfND(_typeOfTimestamp));
        sb.append(dm).append(xfND(_typeOfTime));
        sb.append(dm).append(xfUD(_typeOfYear));
        sb.append(dm).append(xfND(_typeOfBoolean));
        sb.append(dm).append(xfBA(_typeOfBlob));
        sb.append(dm).append(xfBA(_typeOfTinyblob));
        sb.append(dm).append(xfBA(_typeOfMediumblob));
        sb.append(dm).append(xfBA(_typeOfLongblob));
        sb.append(dm).append(xfBA(_typeOfBinary));
        sb.append(dm).append(xfBA(_typeOfVarbinary));
        sb.append(dm).append(xfND(_typeOfEnum));
        sb.append(dm).append(xfND(_typeOfSet));
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
    public VendorCheck clone() {
        return (VendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        checkSpecifiedProperty("typeOfChar");
        return _typeOfChar;
    }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        registerModifiedProperty("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(200)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(200)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_TEXT: {TEXT(65535)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {TEXT(65535)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br />
     * @return The value of the column 'TYPE_OF_TINYTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfTinytext() {
        checkSpecifiedProperty("typeOfTinytext");
        return _typeOfTinytext;
    }

    /**
     * [set] TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br />
     * @param typeOfTinytext The value of the column 'TYPE_OF_TINYTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTinytext(String typeOfTinytext) {
        registerModifiedProperty("typeOfTinytext");
        _typeOfTinytext = typeOfTinytext;
    }

    /**
     * [get] TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br />
     * @return The value of the column 'TYPE_OF_MEDIUMTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfMediumtext() {
        checkSpecifiedProperty("typeOfMediumtext");
        return _typeOfMediumtext;
    }

    /**
     * [set] TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br />
     * @param typeOfMediumtext The value of the column 'TYPE_OF_MEDIUMTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMediumtext(String typeOfMediumtext) {
        registerModifiedProperty("typeOfMediumtext");
        _typeOfMediumtext = typeOfMediumtext;
    }

    /**
     * [get] TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_LONGTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLongtext() {
        checkSpecifiedProperty("typeOfLongtext");
        return _typeOfLongtext;
    }

    /**
     * [set] TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br />
     * @param typeOfLongtext The value of the column 'TYPE_OF_LONGTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongtext(String typeOfLongtext) {
        registerModifiedProperty("typeOfLongtext");
        _typeOfLongtext = typeOfLongtext;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimalDecimal() {
        checkSpecifiedProperty("typeOfDecimalDecimal");
        return _typeOfDecimalDecimal;
    }

    /**
     * [set] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfDecimalDecimal The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalDecimal(java.math.BigDecimal typeOfDecimalDecimal) {
        registerModifiedProperty("typeOfDecimalDecimal");
        _typeOfDecimalDecimal = typeOfDecimalDecimal;
    }

    /**
     * [get] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfDecimalInteger() {
        checkSpecifiedProperty("typeOfDecimalInteger");
        return _typeOfDecimalInteger;
    }

    /**
     * [set] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfDecimalInteger The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalInteger(Integer typeOfDecimalInteger) {
        registerModifiedProperty("typeOfDecimalInteger");
        _typeOfDecimalInteger = typeOfDecimalInteger;
    }

    /**
     * [get] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfDecimalBigint() {
        checkSpecifiedProperty("typeOfDecimalBigint");
        return _typeOfDecimalBigint;
    }

    /**
     * [set] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfDecimalBigint The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalBigint(Long typeOfDecimalBigint) {
        registerModifiedProperty("typeOfDecimalBigint");
        _typeOfDecimalBigint = typeOfDecimalBigint;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INT(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        checkSpecifiedProperty("typeOfInteger");
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INT(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        registerModifiedProperty("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        checkSpecifiedProperty("typeOfBigint");
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        registerModifiedProperty("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_FLOAT: {FLOAT(12)} <br />
     * @return The value of the column 'TYPE_OF_FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        checkSpecifiedProperty("typeOfFloat");
        return _typeOfFloat;
    }

    /**
     * [set] TYPE_OF_FLOAT: {FLOAT(12)} <br />
     * @param typeOfFloat The value of the column 'TYPE_OF_FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        registerModifiedProperty("typeOfFloat");
        _typeOfFloat = typeOfFloat;
    }

    /**
     * [get] TYPE_OF_DOUBLE: {DOUBLE(22)} <br />
     * @return The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDouble() {
        checkSpecifiedProperty("typeOfDouble");
        return _typeOfDouble;
    }

    /**
     * [set] TYPE_OF_DOUBLE: {DOUBLE(22)} <br />
     * @param typeOfDouble The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDouble(java.math.BigDecimal typeOfDouble) {
        registerModifiedProperty("typeOfDouble");
        _typeOfDouble = typeOfDouble;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(10)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        checkSpecifiedProperty("typeOfDate");
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(10)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        registerModifiedProperty("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'TYPE_OF_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfDatetime() {
        checkSpecifiedProperty("typeOfDatetime");
        return _typeOfDatetime;
    }

    /**
     * [set] TYPE_OF_DATETIME: {DATETIME(19)} <br />
     * @param typeOfDatetime The value of the column 'TYPE_OF_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime(java.sql.Timestamp typeOfDatetime) {
        registerModifiedProperty("typeOfDatetime");
        _typeOfDatetime = typeOfDatetime;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        checkSpecifiedProperty("typeOfTimestamp");
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        registerModifiedProperty("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_TIME: {TIME(8)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTime() {
        checkSpecifiedProperty("typeOfTime");
        return _typeOfTime;
    }

    /**
     * [set] TYPE_OF_TIME: {TIME(8)} <br />
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.sql.Time typeOfTime) {
        registerModifiedProperty("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] TYPE_OF_YEAR: {YEAR} <br />
     * @return The value of the column 'TYPE_OF_YEAR'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfYear() {
        checkSpecifiedProperty("typeOfYear");
        return _typeOfYear;
    }

    /**
     * [set] TYPE_OF_YEAR: {YEAR} <br />
     * @param typeOfYear The value of the column 'TYPE_OF_YEAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfYear(java.util.Date typeOfYear) {
        registerModifiedProperty("typeOfYear");
        _typeOfYear = typeOfYear;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBoolean() {
        checkSpecifiedProperty("typeOfBoolean");
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setTypeOfBoolean(Boolean typeOfBoolean) {
        registerModifiedProperty("typeOfBoolean");
        _typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(65535)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        checkSpecifiedProperty("typeOfBlob");
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(65535)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        registerModifiedProperty("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_TINYBLOB: {TINYBLOB(255)} <br />
     * @return The value of the column 'TYPE_OF_TINYBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfTinyblob() {
        checkSpecifiedProperty("typeOfTinyblob");
        return _typeOfTinyblob;
    }

    /**
     * [set] TYPE_OF_TINYBLOB: {TINYBLOB(255)} <br />
     * @param typeOfTinyblob The value of the column 'TYPE_OF_TINYBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTinyblob(byte[] typeOfTinyblob) {
        registerModifiedProperty("typeOfTinyblob");
        _typeOfTinyblob = typeOfTinyblob;
    }

    /**
     * [get] TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} <br />
     * @return The value of the column 'TYPE_OF_MEDIUMBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfMediumblob() {
        checkSpecifiedProperty("typeOfMediumblob");
        return _typeOfMediumblob;
    }

    /**
     * [set] TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} <br />
     * @param typeOfMediumblob The value of the column 'TYPE_OF_MEDIUMBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMediumblob(byte[] typeOfMediumblob) {
        registerModifiedProperty("typeOfMediumblob");
        _typeOfMediumblob = typeOfMediumblob;
    }

    /**
     * [get] TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_LONGBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfLongblob() {
        checkSpecifiedProperty("typeOfLongblob");
        return _typeOfLongblob;
    }

    /**
     * [set] TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} <br />
     * @param typeOfLongblob The value of the column 'TYPE_OF_LONGBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongblob(byte[] typeOfLongblob) {
        registerModifiedProperty("typeOfLongblob");
        _typeOfLongblob = typeOfLongblob;
    }

    /**
     * [get] TYPE_OF_BINARY: {BINARY(1)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBinary() {
        checkSpecifiedProperty("typeOfBinary");
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {BINARY(1)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinary(byte[] typeOfBinary) {
        registerModifiedProperty("typeOfBinary");
        _typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_VARBINARY: {VARBINARY(1000)} <br />
     * @return The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfVarbinary() {
        checkSpecifiedProperty("typeOfVarbinary");
        return _typeOfVarbinary;
    }

    /**
     * [set] TYPE_OF_VARBINARY: {VARBINARY(1000)} <br />
     * @param typeOfVarbinary The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarbinary(byte[] typeOfVarbinary) {
        registerModifiedProperty("typeOfVarbinary");
        _typeOfVarbinary = typeOfVarbinary;
    }

    /**
     * [get] TYPE_OF_ENUM: {ENUM(6)} <br />
     * @return The value of the column 'TYPE_OF_ENUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfEnum() {
        checkSpecifiedProperty("typeOfEnum");
        return _typeOfEnum;
    }

    /**
     * [set] TYPE_OF_ENUM: {ENUM(6)} <br />
     * @param typeOfEnum The value of the column 'TYPE_OF_ENUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfEnum(String typeOfEnum) {
        registerModifiedProperty("typeOfEnum");
        _typeOfEnum = typeOfEnum;
    }

    /**
     * [get] TYPE_OF_SET: {SET(15)} <br />
     * @return The value of the column 'TYPE_OF_SET'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfSet() {
        checkSpecifiedProperty("typeOfSet");
        return _typeOfSet;
    }

    /**
     * [set] TYPE_OF_SET: {SET(15)} <br />
     * @param typeOfSet The value of the column 'TYPE_OF_SET'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSet(String typeOfSet) {
        registerModifiedProperty("typeOfSet");
        _typeOfSet = typeOfSet;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingTypeOfBoolean(Boolean typeOfBoolean) {
        setTypeOfBoolean(typeOfBoolean);
    }
}
