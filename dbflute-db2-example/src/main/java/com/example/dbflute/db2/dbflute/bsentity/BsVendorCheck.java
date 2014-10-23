package com.example.dbflute.db2.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.db2.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The entity of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_CHAR_FOR_BIT_DATA, TYPE_OF_VARCHAR, TYPE_OF_VARCHAR_FOR_BIT_DATA, TYPE_OF_CLOB, TYPE_OF_DBCLOB, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_SMALLINT, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_FLOAT, TYPE_OF_DOUBLE, TYPE_OF_REAL, TYPE_OF_DATE, TYPE_OF_TIME, TYPE_OF_TIMESTAMP, TYPE_OF_BLOB, TYPE_OF_GRAPHIC, TYPE_OF_VARGRAPHIC, TYPE_OF_LONG_VARGRAPHIC
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
 * byte[] typeOfCharForBitData = entity.getTypeOfCharForBitData();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * byte[] typeOfVarcharForBitData = entity.getTypeOfVarcharForBitData();
 * String typeOfClob = entity.getTypeOfClob();
 * String typeOfDbclob = entity.getTypeOfDbclob();
 * java.math.BigDecimal typeOfDecimalDecimal = entity.getTypeOfDecimalDecimal();
 * Integer typeOfDecimalInteger = entity.getTypeOfDecimalInteger();
 * Long typeOfDecimalBigint = entity.getTypeOfDecimalBigint();
 * Integer typeOfSmallint = entity.getTypeOfSmallint();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * java.math.BigDecimal typeOfFloat = entity.getTypeOfFloat();
 * java.math.BigDecimal typeOfDouble = entity.getTypeOfDouble();
 * java.math.BigDecimal typeOfReal = entity.getTypeOfReal();
 * java.util.Date typeOfDate = entity.getTypeOfDate();
 * java.sql.Time typeOfTime = entity.getTypeOfTime();
 * java.sql.Timestamp typeOfTimestamp = entity.getTypeOfTimestamp();
 * byte[] typeOfBlob = entity.getTypeOfBlob();
 * String typeOfGraphic = entity.getTypeOfGraphic();
 * String typeOfVargraphic = entity.getTypeOfVargraphic();
 * String typeOfLongVargraphic = entity.getTypeOfLongVargraphic();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfCharForBitData(typeOfCharForBitData);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfVarcharForBitData(typeOfVarcharForBitData);
 * entity.setTypeOfClob(typeOfClob);
 * entity.setTypeOfDbclob(typeOfDbclob);
 * entity.setTypeOfDecimalDecimal(typeOfDecimalDecimal);
 * entity.setTypeOfDecimalInteger(typeOfDecimalInteger);
 * entity.setTypeOfDecimalBigint(typeOfDecimalBigint);
 * entity.setTypeOfSmallint(typeOfSmallint);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfFloat(typeOfFloat);
 * entity.setTypeOfDouble(typeOfDouble);
 * entity.setTypeOfReal(typeOfReal);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfTime(typeOfTime);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfBlob(typeOfBlob);
 * entity.setTypeOfGraphic(typeOfGraphic);
 * entity.setTypeOfVargraphic(typeOfVargraphic);
 * entity.setTypeOfLongVargraphic(typeOfLongVargraphic);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheck extends AbstractEntity {

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

    /** TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)} */
    protected byte[] _typeOfCharForBitData;

    /** TYPE_OF_VARCHAR: {VARCHAR(32)} */
    protected String _typeOfVarchar;

    /** TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)} */
    protected byte[] _typeOfVarcharForBitData;

    /** TYPE_OF_CLOB: {CLOB(1048576)} */
    protected String _typeOfClob;

    /** TYPE_OF_DBCLOB: {DBCLOB(2097152)} */
    protected String _typeOfDbclob;

    /** TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfDecimalDecimal;

    /** TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} */
    protected Integer _typeOfDecimalInteger;

    /** TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} */
    protected Long _typeOfDecimalBigint;

    /** TYPE_OF_SMALLINT: {SMALLINT(5)} */
    protected Integer _typeOfSmallint;

    /** TYPE_OF_INTEGER: {INTEGER(10)} */
    protected Integer _typeOfInteger;

    /** TYPE_OF_BIGINT: {BIGINT(19)} */
    protected Long _typeOfBigint;

    /** TYPE_OF_FLOAT: {DOUBLE(53)} */
    protected java.math.BigDecimal _typeOfFloat;

    /** TYPE_OF_DOUBLE: {DOUBLE(53)} */
    protected java.math.BigDecimal _typeOfDouble;

    /** TYPE_OF_REAL: {REAL(24)} */
    protected java.math.BigDecimal _typeOfReal;

    /** TYPE_OF_DATE: {DATE(10)} */
    protected java.util.Date _typeOfDate;

    /** TYPE_OF_TIME: {TIME(8)} */
    protected java.sql.Time _typeOfTime;

    /** TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _typeOfTimestamp;

    /** TYPE_OF_BLOB: {BLOB(1048576)} */
    protected byte[] _typeOfBlob;

    /** TYPE_OF_GRAPHIC: {GRAPHIC(2)} */
    protected String _typeOfGraphic;

    /** TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)} */
    protected String _typeOfVargraphic;

    /** TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)} */
    protected String _typeOfLongVargraphic;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_CHECK";
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
        sb.append(dm).append(xfBA(_typeOfCharForBitData));
        sb.append(dm).append(xfND(_typeOfVarchar));
        sb.append(dm).append(xfBA(_typeOfVarcharForBitData));
        sb.append(dm).append(xfND(_typeOfClob));
        sb.append(dm).append(xfND(_typeOfDbclob));
        sb.append(dm).append(xfND(_typeOfDecimalDecimal));
        sb.append(dm).append(xfND(_typeOfDecimalInteger));
        sb.append(dm).append(xfND(_typeOfDecimalBigint));
        sb.append(dm).append(xfND(_typeOfSmallint));
        sb.append(dm).append(xfND(_typeOfInteger));
        sb.append(dm).append(xfND(_typeOfBigint));
        sb.append(dm).append(xfND(_typeOfFloat));
        sb.append(dm).append(xfND(_typeOfDouble));
        sb.append(dm).append(xfND(_typeOfReal));
        sb.append(dm).append(xfUD(_typeOfDate));
        sb.append(dm).append(xfND(_typeOfTime));
        sb.append(dm).append(xfND(_typeOfTimestamp));
        sb.append(dm).append(xfBA(_typeOfBlob));
        sb.append(dm).append(xfND(_typeOfGraphic));
        sb.append(dm).append(xfND(_typeOfVargraphic));
        sb.append(dm).append(xfND(_typeOfLongVargraphic));
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
     * [get] TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR_FOR_BIT_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfCharForBitData() {
        checkSpecifiedProperty("typeOfCharForBitData");
        return _typeOfCharForBitData;
    }

    /**
     * [set] TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)} <br />
     * @param typeOfCharForBitData The value of the column 'TYPE_OF_CHAR_FOR_BIT_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfCharForBitData(byte[] typeOfCharForBitData) {
        __modifiedProperties.addPropertyName("typeOfCharForBitData");
        _typeOfCharForBitData = typeOfCharForBitData;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        __modifiedProperties.addPropertyName("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR_FOR_BIT_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfVarcharForBitData() {
        checkSpecifiedProperty("typeOfVarcharForBitData");
        return _typeOfVarcharForBitData;
    }

    /**
     * [set] TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)} <br />
     * @param typeOfVarcharForBitData The value of the column 'TYPE_OF_VARCHAR_FOR_BIT_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarcharForBitData(byte[] typeOfVarcharForBitData) {
        __modifiedProperties.addPropertyName("typeOfVarcharForBitData");
        _typeOfVarcharForBitData = typeOfVarcharForBitData;
    }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(1048576)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfClob() {
        checkSpecifiedProperty("typeOfClob");
        return _typeOfClob;
    }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(1048576)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfClob(String typeOfClob) {
        __modifiedProperties.addPropertyName("typeOfClob");
        _typeOfClob = typeOfClob;
    }

    /**
     * [get] TYPE_OF_DBCLOB: {DBCLOB(2097152)} <br />
     * @return The value of the column 'TYPE_OF_DBCLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfDbclob() {
        checkSpecifiedProperty("typeOfDbclob");
        return _typeOfDbclob;
    }

    /**
     * [set] TYPE_OF_DBCLOB: {DBCLOB(2097152)} <br />
     * @param typeOfDbclob The value of the column 'TYPE_OF_DBCLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDbclob(String typeOfDbclob) {
        __modifiedProperties.addPropertyName("typeOfDbclob");
        _typeOfDbclob = typeOfDbclob;
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
        __modifiedProperties.addPropertyName("typeOfDecimalDecimal");
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
        __modifiedProperties.addPropertyName("typeOfDecimalInteger");
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
        __modifiedProperties.addPropertyName("typeOfDecimalBigint");
        _typeOfDecimalBigint = typeOfDecimalBigint;
    }

    /**
     * [get] TYPE_OF_SMALLINT: {SMALLINT(5)} <br />
     * @return The value of the column 'TYPE_OF_SMALLINT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfSmallint() {
        checkSpecifiedProperty("typeOfSmallint");
        return _typeOfSmallint;
    }

    /**
     * [set] TYPE_OF_SMALLINT: {SMALLINT(5)} <br />
     * @param typeOfSmallint The value of the column 'TYPE_OF_SMALLINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmallint(Integer typeOfSmallint) {
        __modifiedProperties.addPropertyName("typeOfSmallint");
        _typeOfSmallint = typeOfSmallint;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        checkSpecifiedProperty("typeOfInteger");
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        __modifiedProperties.addPropertyName("typeOfInteger");
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
        __modifiedProperties.addPropertyName("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_FLOAT: {DOUBLE(53)} <br />
     * @return The value of the column 'TYPE_OF_FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        checkSpecifiedProperty("typeOfFloat");
        return _typeOfFloat;
    }

    /**
     * [set] TYPE_OF_FLOAT: {DOUBLE(53)} <br />
     * @param typeOfFloat The value of the column 'TYPE_OF_FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        __modifiedProperties.addPropertyName("typeOfFloat");
        _typeOfFloat = typeOfFloat;
    }

    /**
     * [get] TYPE_OF_DOUBLE: {DOUBLE(53)} <br />
     * @return The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDouble() {
        checkSpecifiedProperty("typeOfDouble");
        return _typeOfDouble;
    }

    /**
     * [set] TYPE_OF_DOUBLE: {DOUBLE(53)} <br />
     * @param typeOfDouble The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDouble(java.math.BigDecimal typeOfDouble) {
        __modifiedProperties.addPropertyName("typeOfDouble");
        _typeOfDouble = typeOfDouble;
    }

    /**
     * [get] TYPE_OF_REAL: {REAL(24)} <br />
     * @return The value of the column 'TYPE_OF_REAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfReal() {
        checkSpecifiedProperty("typeOfReal");
        return _typeOfReal;
    }

    /**
     * [set] TYPE_OF_REAL: {REAL(24)} <br />
     * @param typeOfReal The value of the column 'TYPE_OF_REAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfReal(java.math.BigDecimal typeOfReal) {
        __modifiedProperties.addPropertyName("typeOfReal");
        _typeOfReal = typeOfReal;
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
        __modifiedProperties.addPropertyName("typeOfDate");
        _typeOfDate = typeOfDate;
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
        __modifiedProperties.addPropertyName("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        checkSpecifiedProperty("typeOfTimestamp");
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(1048576)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        checkSpecifiedProperty("typeOfBlob");
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(1048576)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.addPropertyName("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_GRAPHIC: {GRAPHIC(2)} <br />
     * @return The value of the column 'TYPE_OF_GRAPHIC'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfGraphic() {
        checkSpecifiedProperty("typeOfGraphic");
        return _typeOfGraphic;
    }

    /**
     * [set] TYPE_OF_GRAPHIC: {GRAPHIC(2)} <br />
     * @param typeOfGraphic The value of the column 'TYPE_OF_GRAPHIC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfGraphic(String typeOfGraphic) {
        __modifiedProperties.addPropertyName("typeOfGraphic");
        _typeOfGraphic = typeOfGraphic;
    }

    /**
     * [get] TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)} <br />
     * @return The value of the column 'TYPE_OF_VARGRAPHIC'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVargraphic() {
        checkSpecifiedProperty("typeOfVargraphic");
        return _typeOfVargraphic;
    }

    /**
     * [set] TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)} <br />
     * @param typeOfVargraphic The value of the column 'TYPE_OF_VARGRAPHIC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVargraphic(String typeOfVargraphic) {
        __modifiedProperties.addPropertyName("typeOfVargraphic");
        _typeOfVargraphic = typeOfVargraphic;
    }

    /**
     * [get] TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)} <br />
     * @return The value of the column 'TYPE_OF_LONG_VARGRAPHIC'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLongVargraphic() {
        checkSpecifiedProperty("typeOfLongVargraphic");
        return _typeOfLongVargraphic;
    }

    /**
     * [set] TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)} <br />
     * @param typeOfLongVargraphic The value of the column 'TYPE_OF_LONG_VARGRAPHIC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongVargraphic(String typeOfLongVargraphic) {
        __modifiedProperties.addPropertyName("typeOfLongVargraphic");
        _typeOfLongVargraphic = typeOfLongVargraphic;
    }
}
