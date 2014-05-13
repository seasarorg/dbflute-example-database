package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
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
public abstract class BsSimpleVendorCheck implements Entity, Serializable, Cloneable {

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
        if (obj == null || !(obj instanceof BsSimpleVendorCheck)) { return false; }
        BsSimpleVendorCheck other = (BsSimpleVendorCheck)obj;
        if (!xSV(getVendorCheckId(), other.getVendorCheckId())) { return false; }
        if (!xSV(getTypeOfChar(), other.getTypeOfChar())) { return false; }
        if (!xSV(getTypeOfNchar(), other.getTypeOfNchar())) { return false; }
        if (!xSV(getTypeOfVarchar2(), other.getTypeOfVarchar2())) { return false; }
        if (!xSV(getTypeOfVarchar2Max(), other.getTypeOfVarchar2Max())) { return false; }
        if (!xSV(getTypeOfNvarchar2(), other.getTypeOfNvarchar2())) { return false; }
        if (!xSV(getTypeOfClob(), other.getTypeOfClob())) { return false; }
        if (!xSV(getTypeOfNclob(), other.getTypeOfNclob())) { return false; }
        if (!xSV(getTypeOfLong(), other.getTypeOfLong())) { return false; }
        if (!xSV(getTypeOfInteger(), other.getTypeOfInteger())) { return false; }
        if (!xSV(getTypeOfNumberInteger(), other.getTypeOfNumberInteger())) { return false; }
        if (!xSV(getTypeOfNumberBigint(), other.getTypeOfNumberBigint())) { return false; }
        if (!xSV(getTypeOfNumberDecimal(), other.getTypeOfNumberDecimal())) { return false; }
        if (!xSV(getTypeOfNumberIntegerMin(), other.getTypeOfNumberIntegerMin())) { return false; }
        if (!xSV(getTypeOfNumberIntegerMax(), other.getTypeOfNumberIntegerMax())) { return false; }
        if (!xSV(getTypeOfNumberBigintMin(), other.getTypeOfNumberBigintMin())) { return false; }
        if (!xSV(getTypeOfNumberBigintMax(), other.getTypeOfNumberBigintMax())) { return false; }
        if (!xSV(getTypeOfNumberSuperintMin(), other.getTypeOfNumberSuperintMin())) { return false; }
        if (!xSV(getTypeOfNumberSuperintMax(), other.getTypeOfNumberSuperintMax())) { return false; }
        if (!xSV(getTypeOfNumberMaxdecimal(), other.getTypeOfNumberMaxdecimal())) { return false; }
        if (!xSV(getTypeOfBinaryFloat(), other.getTypeOfBinaryFloat())) { return false; }
        if (!xSV(getTypeOfBinaryDouble(), other.getTypeOfBinaryDouble())) { return false; }
        if (!xSV(getTypeOfDate(), other.getTypeOfDate())) { return false; }
        if (!xSV(getTypeOfTimestamp(), other.getTypeOfTimestamp())) { return false; }
        if (!xSV(getTypeOfIntervalYearToMonth(), other.getTypeOfIntervalYearToMonth())) { return false; }
        if (!xSV(getTypeOfIntervalDayToSecond(), other.getTypeOfIntervalDayToSecond())) { return false; }
        if (!xSV(getTypeOfBlob(), other.getTypeOfBlob())) { return false; }
        if (!xSV(getTypeOfRaw(), other.getTypeOfRaw())) { return false; }
        if (!xSV(getTypeOfBfile(), other.getTypeOfBfile())) { return false; }
        if (!xSV(getTypeOfRowid(), other.getTypeOfRowid())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) {
        return FunCustodial.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getVendorCheckId());
        result = xCH(result, getTypeOfChar());
        result = xCH(result, getTypeOfNchar());
        result = xCH(result, getTypeOfVarchar2());
        result = xCH(result, getTypeOfVarchar2Max());
        result = xCH(result, getTypeOfNvarchar2());
        result = xCH(result, getTypeOfClob());
        result = xCH(result, getTypeOfNclob());
        result = xCH(result, getTypeOfLong());
        result = xCH(result, getTypeOfInteger());
        result = xCH(result, getTypeOfNumberInteger());
        result = xCH(result, getTypeOfNumberBigint());
        result = xCH(result, getTypeOfNumberDecimal());
        result = xCH(result, getTypeOfNumberIntegerMin());
        result = xCH(result, getTypeOfNumberIntegerMax());
        result = xCH(result, getTypeOfNumberBigintMin());
        result = xCH(result, getTypeOfNumberBigintMax());
        result = xCH(result, getTypeOfNumberSuperintMin());
        result = xCH(result, getTypeOfNumberSuperintMax());
        result = xCH(result, getTypeOfNumberMaxdecimal());
        result = xCH(result, getTypeOfBinaryFloat());
        result = xCH(result, getTypeOfBinaryDouble());
        result = xCH(result, getTypeOfDate());
        result = xCH(result, getTypeOfTimestamp());
        result = xCH(result, getTypeOfIntervalYearToMonth());
        result = xCH(result, getTypeOfIntervalDayToSecond());
        result = xCH(result, getTypeOfBlob());
        result = xCH(result, getTypeOfRaw());
        result = xCH(result, getTypeOfBfile());
        result = xCH(result, getTypeOfRowid());
        return result;
    }
    protected int xCH(int result, Object value) {
        return FunCustodial.calculateHashcode(result, value);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getVendorCheckId());
        sb.append(delimiter).append(getTypeOfChar());
        sb.append(delimiter).append(getTypeOfNchar());
        sb.append(delimiter).append(getTypeOfVarchar2());
        sb.append(delimiter).append(getTypeOfVarchar2Max());
        sb.append(delimiter).append(getTypeOfNvarchar2());
        sb.append(delimiter).append(getTypeOfClob());
        sb.append(delimiter).append(getTypeOfNclob());
        sb.append(delimiter).append(getTypeOfLong());
        sb.append(delimiter).append(getTypeOfInteger());
        sb.append(delimiter).append(getTypeOfNumberInteger());
        sb.append(delimiter).append(getTypeOfNumberBigint());
        sb.append(delimiter).append(getTypeOfNumberDecimal());
        sb.append(delimiter).append(getTypeOfNumberIntegerMin());
        sb.append(delimiter).append(getTypeOfNumberIntegerMax());
        sb.append(delimiter).append(getTypeOfNumberBigintMin());
        sb.append(delimiter).append(getTypeOfNumberBigintMax());
        sb.append(delimiter).append(getTypeOfNumberSuperintMin());
        sb.append(delimiter).append(getTypeOfNumberSuperintMax());
        sb.append(delimiter).append(getTypeOfNumberMaxdecimal());
        sb.append(delimiter).append(getTypeOfBinaryFloat());
        sb.append(delimiter).append(getTypeOfBinaryDouble());
        sb.append(delimiter).append(xfUD(getTypeOfDate()));
        sb.append(delimiter).append(getTypeOfTimestamp());
        sb.append(delimiter).append(getTypeOfIntervalYearToMonth());
        sb.append(delimiter).append(getTypeOfIntervalDayToSecond());
        sb.append(delimiter).append(xfBA(getTypeOfBlob()));
        sb.append(delimiter).append(xfBA(getTypeOfRaw()));
        sb.append(delimiter).append(getTypeOfBfile());
        sb.append(delimiter).append(getTypeOfRowid());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return FunCustodial.toString(bytes);
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public SimpleVendorCheck clone() {
        try {
            return (SimpleVendorCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {NUMBER(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {NUMBER(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
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
     * [get] TYPE_OF_NCHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_NCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNchar() {
        return _typeOfNchar;
    }

    /**
     * [set] TYPE_OF_NCHAR: {CHAR(3)} <br />
     * @param typeOfNchar The value of the column 'TYPE_OF_NCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNchar(String typeOfNchar) {
        __modifiedProperties.addPropertyName("typeOfNchar");
        this._typeOfNchar = typeOfNchar;
    }

    /**
     * [get] TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar2() {
        return _typeOfVarchar2;
    }

    /**
     * [set] TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br />
     * @param typeOfVarchar2 The value of the column 'TYPE_OF_VARCHAR2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar2(String typeOfVarchar2) {
        __modifiedProperties.addPropertyName("typeOfVarchar2");
        this._typeOfVarchar2 = typeOfVarchar2;
    }

    /**
     * [get] TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR2_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar2Max() {
        return _typeOfVarchar2Max;
    }

    /**
     * [set] TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br />
     * @param typeOfVarchar2Max The value of the column 'TYPE_OF_VARCHAR2_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar2Max(String typeOfVarchar2Max) {
        __modifiedProperties.addPropertyName("typeOfVarchar2Max");
        this._typeOfVarchar2Max = typeOfVarchar2Max;
    }

    /**
     * [get] TYPE_OF_NVARCHAR2: {VARCHAR2(32)} <br />
     * @return The value of the column 'TYPE_OF_NVARCHAR2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNvarchar2() {
        return _typeOfNvarchar2;
    }

    /**
     * [set] TYPE_OF_NVARCHAR2: {VARCHAR2(32)} <br />
     * @param typeOfNvarchar2 The value of the column 'TYPE_OF_NVARCHAR2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNvarchar2(String typeOfNvarchar2) {
        __modifiedProperties.addPropertyName("typeOfNvarchar2");
        this._typeOfNvarchar2 = typeOfNvarchar2;
    }

    /** The value type annotation. {CLOB(4000)} */
    public static final String typeOfClob_VALUE_TYPE = "stringClobType";

    /**
     * [get] TYPE_OF_CLOB: {CLOB(4000)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfClob() {
        return _typeOfClob;
    }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(4000)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfClob(String typeOfClob) {
        __modifiedProperties.addPropertyName("typeOfClob");
        this._typeOfClob = typeOfClob;
    }

    /** The value type annotation. {CLOB(4000)} */
    public static final String typeOfNclob_VALUE_TYPE = "stringClobType";

    /**
     * [get] TYPE_OF_NCLOB: {CLOB(4000)} <br />
     * @return The value of the column 'TYPE_OF_NCLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNclob() {
        return _typeOfNclob;
    }

    /**
     * [set] TYPE_OF_NCLOB: {CLOB(4000)} <br />
     * @param typeOfNclob The value of the column 'TYPE_OF_NCLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNclob(String typeOfNclob) {
        __modifiedProperties.addPropertyName("typeOfNclob");
        this._typeOfNclob = typeOfNclob;
    }

    /**
     * [get] TYPE_OF_LONG: {LONG(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLong() {
        return _typeOfLong;
    }

    /**
     * [set] TYPE_OF_LONG: {LONG(2147483647)} <br />
     * @param typeOfLong The value of the column 'TYPE_OF_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLong(String typeOfLong) {
        __modifiedProperties.addPropertyName("typeOfLong");
        this._typeOfLong = typeOfLong;
    }

    /**
     * [get] TYPE_OF_INTEGER: {NUMBER(38)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfInteger() {
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {NUMBER(38)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(java.math.BigDecimal typeOfInteger) {
        __modifiedProperties.addPropertyName("typeOfInteger");
        this._typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_NUMBER_INTEGER: {NUMBER(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumberInteger() {
        return _typeOfNumberInteger;
    }

    /**
     * [set] TYPE_OF_NUMBER_INTEGER: {NUMBER(5)} <br />
     * @param typeOfNumberInteger The value of the column 'TYPE_OF_NUMBER_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberInteger(Integer typeOfNumberInteger) {
        __modifiedProperties.addPropertyName("typeOfNumberInteger");
        this._typeOfNumberInteger = typeOfNumberInteger;
    }

    /**
     * [get] TYPE_OF_NUMBER_BIGINT: {NUMBER(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumberBigint() {
        return _typeOfNumberBigint;
    }

    /**
     * [set] TYPE_OF_NUMBER_BIGINT: {NUMBER(12)} <br />
     * @param typeOfNumberBigint The value of the column 'TYPE_OF_NUMBER_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberBigint(Long typeOfNumberBigint) {
        __modifiedProperties.addPropertyName("typeOfNumberBigint");
        this._typeOfNumberBigint = typeOfNumberBigint;
    }

    /**
     * [get] TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberDecimal() {
        return _typeOfNumberDecimal;
    }

    /**
     * [set] TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)} <br />
     * @param typeOfNumberDecimal The value of the column 'TYPE_OF_NUMBER_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberDecimal(java.math.BigDecimal typeOfNumberDecimal) {
        __modifiedProperties.addPropertyName("typeOfNumberDecimal");
        this._typeOfNumberDecimal = typeOfNumberDecimal;
    }

    /**
     * [get] TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_INTEGER_MIN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumberIntegerMin() {
        return _typeOfNumberIntegerMin;
    }

    /**
     * [set] TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)} <br />
     * @param typeOfNumberIntegerMin The value of the column 'TYPE_OF_NUMBER_INTEGER_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberIntegerMin(Integer typeOfNumberIntegerMin) {
        __modifiedProperties.addPropertyName("typeOfNumberIntegerMin");
        this._typeOfNumberIntegerMin = typeOfNumberIntegerMin;
    }

    /**
     * [get] TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_INTEGER_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumberIntegerMax() {
        return _typeOfNumberIntegerMax;
    }

    /**
     * [set] TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)} <br />
     * @param typeOfNumberIntegerMax The value of the column 'TYPE_OF_NUMBER_INTEGER_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberIntegerMax(Integer typeOfNumberIntegerMax) {
        __modifiedProperties.addPropertyName("typeOfNumberIntegerMax");
        this._typeOfNumberIntegerMax = typeOfNumberIntegerMax;
    }

    /**
     * [get] TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_BIGINT_MIN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumberBigintMin() {
        return _typeOfNumberBigintMin;
    }

    /**
     * [set] TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)} <br />
     * @param typeOfNumberBigintMin The value of the column 'TYPE_OF_NUMBER_BIGINT_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberBigintMin(Long typeOfNumberBigintMin) {
        __modifiedProperties.addPropertyName("typeOfNumberBigintMin");
        this._typeOfNumberBigintMin = typeOfNumberBigintMin;
    }

    /**
     * [get] TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_BIGINT_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumberBigintMax() {
        return _typeOfNumberBigintMax;
    }

    /**
     * [set] TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)} <br />
     * @param typeOfNumberBigintMax The value of the column 'TYPE_OF_NUMBER_BIGINT_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberBigintMax(Long typeOfNumberBigintMax) {
        __modifiedProperties.addPropertyName("typeOfNumberBigintMax");
        this._typeOfNumberBigintMax = typeOfNumberBigintMax;
    }

    /**
     * [get] TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_SUPERINT_MIN'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberSuperintMin() {
        return _typeOfNumberSuperintMin;
    }

    /**
     * [set] TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)} <br />
     * @param typeOfNumberSuperintMin The value of the column 'TYPE_OF_NUMBER_SUPERINT_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberSuperintMin(java.math.BigDecimal typeOfNumberSuperintMin) {
        __modifiedProperties.addPropertyName("typeOfNumberSuperintMin");
        this._typeOfNumberSuperintMin = typeOfNumberSuperintMin;
    }

    /**
     * [get] TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_SUPERINT_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberSuperintMax() {
        return _typeOfNumberSuperintMax;
    }

    /**
     * [set] TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)} <br />
     * @param typeOfNumberSuperintMax The value of the column 'TYPE_OF_NUMBER_SUPERINT_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberSuperintMax(java.math.BigDecimal typeOfNumberSuperintMax) {
        __modifiedProperties.addPropertyName("typeOfNumberSuperintMax");
        this._typeOfNumberSuperintMax = typeOfNumberSuperintMax;
    }

    /**
     * [get] TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)} <br />
     * @return The value of the column 'TYPE_OF_NUMBER_MAXDECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumberMaxdecimal() {
        return _typeOfNumberMaxdecimal;
    }

    /**
     * [set] TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)} <br />
     * @param typeOfNumberMaxdecimal The value of the column 'TYPE_OF_NUMBER_MAXDECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumberMaxdecimal(java.math.BigDecimal typeOfNumberMaxdecimal) {
        __modifiedProperties.addPropertyName("typeOfNumberMaxdecimal");
        this._typeOfNumberMaxdecimal = typeOfNumberMaxdecimal;
    }

    /**
     * [get] TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br />
     * @return The value of the column 'TYPE_OF_BINARY_FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfBinaryFloat() {
        return _typeOfBinaryFloat;
    }

    /**
     * [set] TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br />
     * @param typeOfBinaryFloat The value of the column 'TYPE_OF_BINARY_FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinaryFloat(String typeOfBinaryFloat) {
        __modifiedProperties.addPropertyName("typeOfBinaryFloat");
        this._typeOfBinaryFloat = typeOfBinaryFloat;
    }

    /**
     * [get] TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br />
     * @return The value of the column 'TYPE_OF_BINARY_DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfBinaryDouble() {
        return _typeOfBinaryDouble;
    }

    /**
     * [set] TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br />
     * @param typeOfBinaryDouble The value of the column 'TYPE_OF_BINARY_DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinaryDouble(String typeOfBinaryDouble) {
        __modifiedProperties.addPropertyName("typeOfBinaryDouble");
        this._typeOfBinaryDouble = typeOfBinaryDouble;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(7)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(7)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        __modifiedProperties.addPropertyName("typeOfDate");
        this._typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(11, 6)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(11, 6)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        this._typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVALYM(2)} <br />
     * @return The value of the column 'TYPE_OF_INTERVAL_YEAR_TO_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfIntervalYearToMonth() {
        return _typeOfIntervalYearToMonth;
    }

    /**
     * [set] TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVALYM(2)} <br />
     * @param typeOfIntervalYearToMonth The value of the column 'TYPE_OF_INTERVAL_YEAR_TO_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntervalYearToMonth(String typeOfIntervalYearToMonth) {
        __modifiedProperties.addPropertyName("typeOfIntervalYearToMonth");
        this._typeOfIntervalYearToMonth = typeOfIntervalYearToMonth;
    }

    /**
     * [get] TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVALDS(2, 6)} <br />
     * @return The value of the column 'TYPE_OF_INTERVAL_DAY_TO_SECOND'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfIntervalDayToSecond() {
        return _typeOfIntervalDayToSecond;
    }

    /**
     * [set] TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVALDS(2, 6)} <br />
     * @param typeOfIntervalDayToSecond The value of the column 'TYPE_OF_INTERVAL_DAY_TO_SECOND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntervalDayToSecond(String typeOfIntervalDayToSecond) {
        __modifiedProperties.addPropertyName("typeOfIntervalDayToSecond");
        this._typeOfIntervalDayToSecond = typeOfIntervalDayToSecond;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(4000)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(4000)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.addPropertyName("typeOfBlob");
        this._typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_RAW: {RAW(512)} <br />
     * @return The value of the column 'TYPE_OF_RAW'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfRaw() {
        return _typeOfRaw;
    }

    /**
     * [set] TYPE_OF_RAW: {RAW(512)} <br />
     * @param typeOfRaw The value of the column 'TYPE_OF_RAW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfRaw(byte[] typeOfRaw) {
        __modifiedProperties.addPropertyName("typeOfRaw");
        this._typeOfRaw = typeOfRaw;
    }

    /**
     * [get] TYPE_OF_BFILE: {BFILE(530)} <br />
     * @return The value of the column 'TYPE_OF_BFILE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfBfile() {
        return _typeOfBfile;
    }

    /**
     * [set] TYPE_OF_BFILE: {BFILE(530)} <br />
     * @param typeOfBfile The value of the column 'TYPE_OF_BFILE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBfile(String typeOfBfile) {
        __modifiedProperties.addPropertyName("typeOfBfile");
        this._typeOfBfile = typeOfBfile;
    }

    /**
     * [get] TYPE_OF_ROWID: {ROWID(1)} <br />
     * @return The value of the column 'TYPE_OF_ROWID'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfRowid() {
        return _typeOfRowid;
    }

    /**
     * [set] TYPE_OF_ROWID: {ROWID(1)} <br />
     * @param typeOfRowid The value of the column 'TYPE_OF_ROWID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfRowid(String typeOfRowid) {
        __modifiedProperties.addPropertyName("typeOfRowid");
        this._typeOfRowid = typeOfRowid;
    }
}
