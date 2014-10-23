package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.MappingValueType;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of SimpleVendorCheck. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_NCHAR, TYPE_OF_VARCHAR2, TYPE_OF_VARCHAR2_MAX, TYPE_OF_NVARCHAR2, TYPE_OF_CLOB, TYPE_OF_NCLOB, TYPE_OF_LONG, TYPE_OF_INTEGER, TYPE_OF_NUMBER_INTEGER, TYPE_OF_NUMBER_BIGINT, TYPE_OF_NUMBER_DECIMAL, TYPE_OF_NUMBER_INTEGER_MIN, TYPE_OF_NUMBER_INTEGER_MAX, TYPE_OF_NUMBER_BIGINT_MIN, TYPE_OF_NUMBER_BIGINT_MAX, TYPE_OF_NUMBER_SUPERINT_MIN, TYPE_OF_NUMBER_SUPERINT_MAX, TYPE_OF_NUMBER_MAXDECIMAL, TYPE_OF_BINARY_FLOAT, TYPE_OF_BINARY_DOUBLE, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_INTERVAL_YEAR_TO_MONTH, TYPE_OF_INTERVAL_DAY_TO_SECOND, TYPE_OF_BLOB, TYPE_OF_RAW, TYPE_OF_BFILE, TYPE_OF_ROWID
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
 * String typeOfNchar = entity.getTypeOfNchar();
 * String typeOfVarchar2 = entity.getTypeOfVarchar2();
 * String typeOfVarchar2Max = entity.getTypeOfVarchar2Max();
 * String typeOfNvarchar2 = entity.getTypeOfNvarchar2();
 * String typeOfClob = entity.getTypeOfClob();
 * String typeOfNclob = entity.getTypeOfNclob();
 * String typeOfLong = entity.getTypeOfLong();
 * java.math.BigDecimal typeOfInteger = entity.getTypeOfInteger();
 * Integer typeOfNumberInteger = entity.getTypeOfNumberInteger();
 * Long typeOfNumberBigint = entity.getTypeOfNumberBigint();
 * java.math.BigDecimal typeOfNumberDecimal = entity.getTypeOfNumberDecimal();
 * Integer typeOfNumberIntegerMin = entity.getTypeOfNumberIntegerMin();
 * Integer typeOfNumberIntegerMax = entity.getTypeOfNumberIntegerMax();
 * Long typeOfNumberBigintMin = entity.getTypeOfNumberBigintMin();
 * Long typeOfNumberBigintMax = entity.getTypeOfNumberBigintMax();
 * java.math.BigDecimal typeOfNumberSuperintMin = entity.getTypeOfNumberSuperintMin();
 * java.math.BigDecimal typeOfNumberSuperintMax = entity.getTypeOfNumberSuperintMax();
 * java.math.BigDecimal typeOfNumberMaxdecimal = entity.getTypeOfNumberMaxdecimal();
 * String typeOfBinaryFloat = entity.getTypeOfBinaryFloat();
 * String typeOfBinaryDouble = entity.getTypeOfBinaryDouble();
 * java.util.Date typeOfDate = entity.getTypeOfDate();
 * java.sql.Timestamp typeOfTimestamp = entity.getTypeOfTimestamp();
 * String typeOfIntervalYearToMonth = entity.getTypeOfIntervalYearToMonth();
 * String typeOfIntervalDayToSecond = entity.getTypeOfIntervalDayToSecond();
 * byte[] typeOfBlob = entity.getTypeOfBlob();
 * byte[] typeOfRaw = entity.getTypeOfRaw();
 * String typeOfBfile = entity.getTypeOfBfile();
 * String typeOfRowid = entity.getTypeOfRowid();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfNchar(typeOfNchar);
 * entity.setTypeOfVarchar2(typeOfVarchar2);
 * entity.setTypeOfVarchar2Max(typeOfVarchar2Max);
 * entity.setTypeOfNvarchar2(typeOfNvarchar2);
 * entity.setTypeOfClob(typeOfClob);
 * entity.setTypeOfNclob(typeOfNclob);
 * entity.setTypeOfLong(typeOfLong);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfNumberInteger(typeOfNumberInteger);
 * entity.setTypeOfNumberBigint(typeOfNumberBigint);
 * entity.setTypeOfNumberDecimal(typeOfNumberDecimal);
 * entity.setTypeOfNumberIntegerMin(typeOfNumberIntegerMin);
 * entity.setTypeOfNumberIntegerMax(typeOfNumberIntegerMax);
 * entity.setTypeOfNumberBigintMin(typeOfNumberBigintMin);
 * entity.setTypeOfNumberBigintMax(typeOfNumberBigintMax);
 * entity.setTypeOfNumberSuperintMin(typeOfNumberSuperintMin);
 * entity.setTypeOfNumberSuperintMax(typeOfNumberSuperintMax);
 * entity.setTypeOfNumberMaxdecimal(typeOfNumberMaxdecimal);
 * entity.setTypeOfBinaryFloat(typeOfBinaryFloat);
 * entity.setTypeOfBinaryDouble(typeOfBinaryDouble);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfIntervalYearToMonth(typeOfIntervalYearToMonth);
 * entity.setTypeOfIntervalDayToSecond(typeOfIntervalDayToSecond);
 * entity.setTypeOfBlob(typeOfBlob);
 * entity.setTypeOfRaw(typeOfRaw);
 * entity.setTypeOfBfile(typeOfBfile);
 * entity.setTypeOfRowid(typeOfRowid);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSimpleVendorCheck extends AbstractEntity {

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
    /** VENDOR_CHECK_ID: {NUMBER(16)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_CHAR: {CHAR(3)} */
    protected String _typeOfChar;

    /** TYPE_OF_NCHAR: {CHAR(3)} */
    protected String _typeOfNchar;

    /** TYPE_OF_VARCHAR2: {VARCHAR2(32)} */
    protected String _typeOfVarchar2;

    /** TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} */
    protected String _typeOfVarchar2Max;

    /** TYPE_OF_NVARCHAR2: {VARCHAR2(32)} */
    protected String _typeOfNvarchar2;

    /** TYPE_OF_CLOB: {CLOB(4000)} */
    protected String _typeOfClob;

    /** TYPE_OF_NCLOB: {CLOB(4000)} */
    protected String _typeOfNclob;

    /** TYPE_OF_LONG: {LONG(2147483647)} */
    protected String _typeOfLong;

    /** TYPE_OF_INTEGER: {NUMBER(38)} */
    protected java.math.BigDecimal _typeOfInteger;

    /** TYPE_OF_NUMBER_INTEGER: {NUMBER(5)} */
    protected Integer _typeOfNumberInteger;

    /** TYPE_OF_NUMBER_BIGINT: {NUMBER(12)} */
    protected Long _typeOfNumberBigint;

    /** TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _typeOfNumberDecimal;

    /** TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)} */
    protected Integer _typeOfNumberIntegerMin;

    /** TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)} */
    protected Integer _typeOfNumberIntegerMax;

    /** TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)} */
    protected Long _typeOfNumberBigintMin;

    /** TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)} */
    protected Long _typeOfNumberBigintMax;

    /** TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)} */
    protected java.math.BigDecimal _typeOfNumberSuperintMin;

    /** TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)} */
    protected java.math.BigDecimal _typeOfNumberSuperintMax;

    /** TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)} */
    protected java.math.BigDecimal _typeOfNumberMaxdecimal;

    /** TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} */
    protected String _typeOfBinaryFloat;

    /** TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} */
    protected String _typeOfBinaryDouble;

    /** TYPE_OF_DATE: {DATE(7)} */
    protected java.util.Date _typeOfDate;

    /** TYPE_OF_TIMESTAMP: {TIMESTAMP(11, 6)} */
    protected java.sql.Timestamp _typeOfTimestamp;

    /** TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVALYM(2)} */
    protected String _typeOfIntervalYearToMonth;

    /** TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVALDS(2, 6)} */
    protected String _typeOfIntervalDayToSecond;

    /** TYPE_OF_BLOB: {BLOB(4000)} */
    protected byte[] _typeOfBlob;

    /** TYPE_OF_RAW: {RAW(512)} */
    protected byte[] _typeOfRaw;

    /** TYPE_OF_BFILE: {BFILE(530)} */
    protected String _typeOfBfile;

    /** TYPE_OF_ROWID: {ROWID(1)} */
    protected String _typeOfRowid;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SimpleVendorCheck";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "simpleVendorCheck";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm.getInstance();
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
        if (obj instanceof BsSimpleVendorCheck) {
            BsSimpleVendorCheck other = (BsSimpleVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_typeOfChar, other._typeOfChar)) { return false; }
            if (!xSV(_typeOfNchar, other._typeOfNchar)) { return false; }
            if (!xSV(_typeOfVarchar2, other._typeOfVarchar2)) { return false; }
            if (!xSV(_typeOfVarchar2Max, other._typeOfVarchar2Max)) { return false; }
            if (!xSV(_typeOfNvarchar2, other._typeOfNvarchar2)) { return false; }
            if (!xSV(_typeOfClob, other._typeOfClob)) { return false; }
            if (!xSV(_typeOfNclob, other._typeOfNclob)) { return false; }
            if (!xSV(_typeOfLong, other._typeOfLong)) { return false; }
            if (!xSV(_typeOfInteger, other._typeOfInteger)) { return false; }
            if (!xSV(_typeOfNumberInteger, other._typeOfNumberInteger)) { return false; }
            if (!xSV(_typeOfNumberBigint, other._typeOfNumberBigint)) { return false; }
            if (!xSV(_typeOfNumberDecimal, other._typeOfNumberDecimal)) { return false; }
            if (!xSV(_typeOfNumberIntegerMin, other._typeOfNumberIntegerMin)) { return false; }
            if (!xSV(_typeOfNumberIntegerMax, other._typeOfNumberIntegerMax)) { return false; }
            if (!xSV(_typeOfNumberBigintMin, other._typeOfNumberBigintMin)) { return false; }
            if (!xSV(_typeOfNumberBigintMax, other._typeOfNumberBigintMax)) { return false; }
            if (!xSV(_typeOfNumberSuperintMin, other._typeOfNumberSuperintMin)) { return false; }
            if (!xSV(_typeOfNumberSuperintMax, other._typeOfNumberSuperintMax)) { return false; }
            if (!xSV(_typeOfNumberMaxdecimal, other._typeOfNumberMaxdecimal)) { return false; }
            if (!xSV(_typeOfBinaryFloat, other._typeOfBinaryFloat)) { return false; }
            if (!xSV(_typeOfBinaryDouble, other._typeOfBinaryDouble)) { return false; }
            if (!xSV(_typeOfDate, other._typeOfDate)) { return false; }
            if (!xSV(_typeOfTimestamp, other._typeOfTimestamp)) { return false; }
            if (!xSV(_typeOfIntervalYearToMonth, other._typeOfIntervalYearToMonth)) { return false; }
            if (!xSV(_typeOfIntervalDayToSecond, other._typeOfIntervalDayToSecond)) { return false; }
            if (!xSV(_typeOfBlob, other._typeOfBlob)) { return false; }
            if (!xSV(_typeOfRaw, other._typeOfRaw)) { return false; }
            if (!xSV(_typeOfBfile, other._typeOfBfile)) { return false; }
            if (!xSV(_typeOfRowid, other._typeOfRowid)) { return false; }
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
        hs = xCH(hs, _typeOfChar);
        hs = xCH(hs, _typeOfNchar);
        hs = xCH(hs, _typeOfVarchar2);
        hs = xCH(hs, _typeOfVarchar2Max);
        hs = xCH(hs, _typeOfNvarchar2);
        hs = xCH(hs, _typeOfClob);
        hs = xCH(hs, _typeOfNclob);
        hs = xCH(hs, _typeOfLong);
        hs = xCH(hs, _typeOfInteger);
        hs = xCH(hs, _typeOfNumberInteger);
        hs = xCH(hs, _typeOfNumberBigint);
        hs = xCH(hs, _typeOfNumberDecimal);
        hs = xCH(hs, _typeOfNumberIntegerMin);
        hs = xCH(hs, _typeOfNumberIntegerMax);
        hs = xCH(hs, _typeOfNumberBigintMin);
        hs = xCH(hs, _typeOfNumberBigintMax);
        hs = xCH(hs, _typeOfNumberSuperintMin);
        hs = xCH(hs, _typeOfNumberSuperintMax);
        hs = xCH(hs, _typeOfNumberMaxdecimal);
        hs = xCH(hs, _typeOfBinaryFloat);
        hs = xCH(hs, _typeOfBinaryDouble);
        hs = xCH(hs, _typeOfDate);
        hs = xCH(hs, _typeOfTimestamp);
        hs = xCH(hs, _typeOfIntervalYearToMonth);
        hs = xCH(hs, _typeOfIntervalDayToSecond);
        hs = xCH(hs, _typeOfBlob);
        hs = xCH(hs, _typeOfRaw);
        hs = xCH(hs, _typeOfBfile);
        hs = xCH(hs, _typeOfRowid);
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
        sb.append(dm).append(xfND(_typeOfNchar));
        sb.append(dm).append(xfND(_typeOfVarchar2));
        sb.append(dm).append(xfND(_typeOfVarchar2Max));
        sb.append(dm).append(xfND(_typeOfNvarchar2));
        sb.append(dm).append(xfND(_typeOfClob));
        sb.append(dm).append(xfND(_typeOfNclob));
        sb.append(dm).append(xfND(_typeOfLong));
        sb.append(dm).append(xfND(_typeOfInteger));
        sb.append(dm).append(xfND(_typeOfNumberInteger));
        sb.append(dm).append(xfND(_typeOfNumberBigint));
        sb.append(dm).append(xfND(_typeOfNumberDecimal));
        sb.append(dm).append(xfND(_typeOfNumberIntegerMin));
        sb.append(dm).append(xfND(_typeOfNumberIntegerMax));
        sb.append(dm).append(xfND(_typeOfNumberBigintMin));
        sb.append(dm).append(xfND(_typeOfNumberBigintMax));
        sb.append(dm).append(xfND(_typeOfNumberSuperintMin));
        sb.append(dm).append(xfND(_typeOfNumberSuperintMax));
        sb.append(dm).append(xfND(_typeOfNumberMaxdecimal));
        sb.append(dm).append(xfND(_typeOfBinaryFloat));
        sb.append(dm).append(xfND(_typeOfBinaryDouble));
        sb.append(dm).append(xfUD(_typeOfDate));
        sb.append(dm).append(xfND(_typeOfTimestamp));
        sb.append(dm).append(xfND(_typeOfIntervalYearToMonth));
        sb.append(dm).append(xfND(_typeOfIntervalDayToSecond));
        sb.append(dm).append(xfBA(_typeOfBlob));
        sb.append(dm).append(xfBA(_typeOfRaw));
        sb.append(dm).append(xfND(_typeOfBfile));
        sb.append(dm).append(xfND(_typeOfRowid));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String myutilDatePattern() {
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SimpleVendorCheck clone() {
        return (SimpleVendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {NUMBER(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {NUMBER(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
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
        __modifiedProperties.addPropertyName("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_NCHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_NCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNchar() {
        checkSpecifiedProperty("typeOfNchar");
        return _typeOfNchar;
    }

    /**
     * [set] TYPE_OF_NCHAR: {CHAR(3)} <br />
     * @param typeOfNchar The value of the column 'TYPE_OF_NCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNchar(String typeOfNchar) {
        __modifiedProperties.addPropertyName("typeOfNchar");
        _typeOfNchar = typeOfNchar;
    }

    /**
     * [get] TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar2() {
        checkSpecifiedProperty("typeOfVarchar2");
        return _typeOfVarchar2;
    }

    /**
     * [set] TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br />
     * @param typeOfVarchar2 The value of the column 'TYPE_OF_VARCHAR2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar2(String typeOfVarchar2) {
        __modifiedProperties.addPropertyName("typeOfVarchar2");
        _typeOfVarchar2 = typeOfVarchar2;
    }

    /**
     * [get] TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR2_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar2Max() {
        checkSpecifiedProperty("typeOfVarchar2Max");
        return _typeOfVarchar2Max;
    }

    /**
     * [set] TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br />
     * @param typeOfVarchar2Max The value of the column 'TYPE_OF_VARCHAR2_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar2Max(String typeOfVarchar2Max) {
        __modifiedProperties.addPropertyName("typeOfVarchar2Max");
        _typeOfVarchar2Max = typeOfVarchar2Max;
    }

    /**
     * [get] TYPE_OF_NVARCHAR2: {VARCHAR2(32)} <br />
     * @return The value of the column 'TYPE_OF_NVARCHAR2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNvarchar2() {
        checkSpecifiedProperty("typeOfNvarchar2");
        return _typeOfNvarchar2;
    }

    /**
     * [set] TYPE_OF_NVARCHAR2: {VARCHAR2(32)} <br />
     * @param typeOfNvarchar2 The value of the column 'TYPE_OF_NVARCHAR2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNvarchar2(String typeOfNvarchar2) {
        __modifiedProperties.addPropertyName("typeOfNvarchar2");
        _typeOfNvarchar2 = typeOfNvarchar2;
    }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(4000)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getTypeOfClob() {
        checkSpecifiedProperty("typeOfClob");
        return _typeOfClob;
    }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(4000)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfClob(String typeOfClob) {
        __modifiedProperties.addPropertyName("typeOfClob");
        _typeOfClob = typeOfClob;
    }

    /**
     * [get] TYPE_OF_NCLOB: {CLOB(4000)} <br />
     * @return The value of the column 'TYPE_OF_NCLOB'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getTypeOfNclob() {
        checkSpecifiedProperty("typeOfNclob");
        return _typeOfNclob;
    }

    /**
     * [set] TYPE_OF_NCLOB: {CLOB(4000)} <br />
     * @param typeOfNclob The value of the column 'TYPE_OF_NCLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNclob(String typeOfNclob) {
        __modifiedProperties.addPropertyName("typeOfNclob");
        _typeOfNclob = typeOfNclob;
    }

    /**
     * [get] TYPE_OF_LONG: {LONG(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLong() {
        checkSpecifiedProperty("typeOfLong");
        return _typeOfLong;
    }

    /**
     * [set] TYPE_OF_LONG: {LONG(2147483647)} <br />
     * @param typeOfLong The value of the column 'TYPE_OF_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLong(String typeOfLong) {
        __modifiedProperties.addPropertyName("typeOfLong");
        _typeOfLong = typeOfLong;
    }

    /**
     * [get] TYPE_OF_INTEGER: {NUMBER(38)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfInteger() {
        checkSpecifiedProperty("typeOfInteger");
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {NUMBER(38)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(java.math.BigDecimal typeOfInteger) {
        __modifiedProperties.addPropertyName("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_NUMBER_INTEGER: {NUMBER(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumberInteger() {
        checkSpecifiedProperty("typeOfNumberInteger");
        return _typeOfNumberInteger;
    }

    /**
     * [set] TYPE_OF_NUMBER_INTEGER: {NUMBER(5)} <br />
     * @param typeOfNumberInteger The value of the column 'TYPE_OF_NUMBER_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberInteger(Integer typeOfNumberInteger) {
        __modifiedProperties.addPropertyName("typeOfNumberInteger");
        _typeOfNumberInteger = typeOfNumberInteger;
    }

    /**
     * [get] TYPE_OF_NUMBER_BIGINT: {NUMBER(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumberBigint() {
        checkSpecifiedProperty("typeOfNumberBigint");
        return _typeOfNumberBigint;
    }

    /**
     * [set] TYPE_OF_NUMBER_BIGINT: {NUMBER(12)} <br />
     * @param typeOfNumberBigint The value of the column 'TYPE_OF_NUMBER_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberBigint(Long typeOfNumberBigint) {
        __modifiedProperties.addPropertyName("typeOfNumberBigint");
        _typeOfNumberBigint = typeOfNumberBigint;
    }

    /**
     * [get] TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberDecimal() {
        checkSpecifiedProperty("typeOfNumberDecimal");
        return _typeOfNumberDecimal;
    }

    /**
     * [set] TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)} <br />
     * @param typeOfNumberDecimal The value of the column 'TYPE_OF_NUMBER_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberDecimal(java.math.BigDecimal typeOfNumberDecimal) {
        __modifiedProperties.addPropertyName("typeOfNumberDecimal");
        _typeOfNumberDecimal = typeOfNumberDecimal;
    }

    /**
     * [get] TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_INTEGER_MIN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumberIntegerMin() {
        checkSpecifiedProperty("typeOfNumberIntegerMin");
        return _typeOfNumberIntegerMin;
    }

    /**
     * [set] TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)} <br />
     * @param typeOfNumberIntegerMin The value of the column 'TYPE_OF_NUMBER_INTEGER_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberIntegerMin(Integer typeOfNumberIntegerMin) {
        __modifiedProperties.addPropertyName("typeOfNumberIntegerMin");
        _typeOfNumberIntegerMin = typeOfNumberIntegerMin;
    }

    /**
     * [get] TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_INTEGER_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumberIntegerMax() {
        checkSpecifiedProperty("typeOfNumberIntegerMax");
        return _typeOfNumberIntegerMax;
    }

    /**
     * [set] TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)} <br />
     * @param typeOfNumberIntegerMax The value of the column 'TYPE_OF_NUMBER_INTEGER_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberIntegerMax(Integer typeOfNumberIntegerMax) {
        __modifiedProperties.addPropertyName("typeOfNumberIntegerMax");
        _typeOfNumberIntegerMax = typeOfNumberIntegerMax;
    }

    /**
     * [get] TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_BIGINT_MIN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumberBigintMin() {
        checkSpecifiedProperty("typeOfNumberBigintMin");
        return _typeOfNumberBigintMin;
    }

    /**
     * [set] TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)} <br />
     * @param typeOfNumberBigintMin The value of the column 'TYPE_OF_NUMBER_BIGINT_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberBigintMin(Long typeOfNumberBigintMin) {
        __modifiedProperties.addPropertyName("typeOfNumberBigintMin");
        _typeOfNumberBigintMin = typeOfNumberBigintMin;
    }

    /**
     * [get] TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_BIGINT_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumberBigintMax() {
        checkSpecifiedProperty("typeOfNumberBigintMax");
        return _typeOfNumberBigintMax;
    }

    /**
     * [set] TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)} <br />
     * @param typeOfNumberBigintMax The value of the column 'TYPE_OF_NUMBER_BIGINT_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberBigintMax(Long typeOfNumberBigintMax) {
        __modifiedProperties.addPropertyName("typeOfNumberBigintMax");
        _typeOfNumberBigintMax = typeOfNumberBigintMax;
    }

    /**
     * [get] TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_SUPERINT_MIN'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberSuperintMin() {
        checkSpecifiedProperty("typeOfNumberSuperintMin");
        return _typeOfNumberSuperintMin;
    }

    /**
     * [set] TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)} <br />
     * @param typeOfNumberSuperintMin The value of the column 'TYPE_OF_NUMBER_SUPERINT_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberSuperintMin(java.math.BigDecimal typeOfNumberSuperintMin) {
        __modifiedProperties.addPropertyName("typeOfNumberSuperintMin");
        _typeOfNumberSuperintMin = typeOfNumberSuperintMin;
    }

    /**
     * [get] TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_SUPERINT_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberSuperintMax() {
        checkSpecifiedProperty("typeOfNumberSuperintMax");
        return _typeOfNumberSuperintMax;
    }

    /**
     * [set] TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)} <br />
     * @param typeOfNumberSuperintMax The value of the column 'TYPE_OF_NUMBER_SUPERINT_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberSuperintMax(java.math.BigDecimal typeOfNumberSuperintMax) {
        __modifiedProperties.addPropertyName("typeOfNumberSuperintMax");
        _typeOfNumberSuperintMax = typeOfNumberSuperintMax;
    }

    /**
     * [get] TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_MAXDECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberMaxdecimal() {
        checkSpecifiedProperty("typeOfNumberMaxdecimal");
        return _typeOfNumberMaxdecimal;
    }

    /**
     * [set] TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)} <br />
     * @param typeOfNumberMaxdecimal The value of the column 'TYPE_OF_NUMBER_MAXDECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberMaxdecimal(java.math.BigDecimal typeOfNumberMaxdecimal) {
        __modifiedProperties.addPropertyName("typeOfNumberMaxdecimal");
        _typeOfNumberMaxdecimal = typeOfNumberMaxdecimal;
    }

    /**
     * [get] TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br />
     * @return The value of the column 'TYPE_OF_BINARY_FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfBinaryFloat() {
        checkSpecifiedProperty("typeOfBinaryFloat");
        return _typeOfBinaryFloat;
    }

    /**
     * [set] TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br />
     * @param typeOfBinaryFloat The value of the column 'TYPE_OF_BINARY_FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinaryFloat(String typeOfBinaryFloat) {
        __modifiedProperties.addPropertyName("typeOfBinaryFloat");
        _typeOfBinaryFloat = typeOfBinaryFloat;
    }

    /**
     * [get] TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br />
     * @return The value of the column 'TYPE_OF_BINARY_DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfBinaryDouble() {
        checkSpecifiedProperty("typeOfBinaryDouble");
        return _typeOfBinaryDouble;
    }

    /**
     * [set] TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br />
     * @param typeOfBinaryDouble The value of the column 'TYPE_OF_BINARY_DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinaryDouble(String typeOfBinaryDouble) {
        __modifiedProperties.addPropertyName("typeOfBinaryDouble");
        _typeOfBinaryDouble = typeOfBinaryDouble;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(7)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        checkSpecifiedProperty("typeOfDate");
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(7)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        __modifiedProperties.addPropertyName("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(11, 6)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        checkSpecifiedProperty("typeOfTimestamp");
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(11, 6)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVALYM(2)} <br />
     * @return The value of the column 'TYPE_OF_INTERVAL_YEAR_TO_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfIntervalYearToMonth() {
        checkSpecifiedProperty("typeOfIntervalYearToMonth");
        return _typeOfIntervalYearToMonth;
    }

    /**
     * [set] TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVALYM(2)} <br />
     * @param typeOfIntervalYearToMonth The value of the column 'TYPE_OF_INTERVAL_YEAR_TO_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntervalYearToMonth(String typeOfIntervalYearToMonth) {
        __modifiedProperties.addPropertyName("typeOfIntervalYearToMonth");
        _typeOfIntervalYearToMonth = typeOfIntervalYearToMonth;
    }

    /**
     * [get] TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVALDS(2, 6)} <br />
     * @return The value of the column 'TYPE_OF_INTERVAL_DAY_TO_SECOND'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfIntervalDayToSecond() {
        checkSpecifiedProperty("typeOfIntervalDayToSecond");
        return _typeOfIntervalDayToSecond;
    }

    /**
     * [set] TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVALDS(2, 6)} <br />
     * @param typeOfIntervalDayToSecond The value of the column 'TYPE_OF_INTERVAL_DAY_TO_SECOND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntervalDayToSecond(String typeOfIntervalDayToSecond) {
        __modifiedProperties.addPropertyName("typeOfIntervalDayToSecond");
        _typeOfIntervalDayToSecond = typeOfIntervalDayToSecond;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(4000)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        checkSpecifiedProperty("typeOfBlob");
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(4000)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.addPropertyName("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_RAW: {RAW(512)} <br />
     * @return The value of the column 'TYPE_OF_RAW'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfRaw() {
        checkSpecifiedProperty("typeOfRaw");
        return _typeOfRaw;
    }

    /**
     * [set] TYPE_OF_RAW: {RAW(512)} <br />
     * @param typeOfRaw The value of the column 'TYPE_OF_RAW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfRaw(byte[] typeOfRaw) {
        __modifiedProperties.addPropertyName("typeOfRaw");
        _typeOfRaw = typeOfRaw;
    }

    /**
     * [get] TYPE_OF_BFILE: {BFILE(530)} <br />
     * @return The value of the column 'TYPE_OF_BFILE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfBfile() {
        checkSpecifiedProperty("typeOfBfile");
        return _typeOfBfile;
    }

    /**
     * [set] TYPE_OF_BFILE: {BFILE(530)} <br />
     * @param typeOfBfile The value of the column 'TYPE_OF_BFILE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBfile(String typeOfBfile) {
        __modifiedProperties.addPropertyName("typeOfBfile");
        _typeOfBfile = typeOfBfile;
    }

    /**
     * [get] TYPE_OF_ROWID: {ROWID(1)} <br />
     * @return The value of the column 'TYPE_OF_ROWID'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfRowid() {
        checkSpecifiedProperty("typeOfRowid");
        return _typeOfRowid;
    }

    /**
     * [set] TYPE_OF_ROWID: {ROWID(1)} <br />
     * @param typeOfRowid The value of the column 'TYPE_OF_ROWID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfRowid(String typeOfRowid) {
        __modifiedProperties.addPropertyName("typeOfRowid");
        _typeOfRowid = typeOfRowid;
    }
}
