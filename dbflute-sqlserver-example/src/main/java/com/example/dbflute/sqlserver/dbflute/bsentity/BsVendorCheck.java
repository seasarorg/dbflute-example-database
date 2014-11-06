package com.example.dbflute.sqlserver.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.sqlserver.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The entity of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_VARCHAR, TYPE_OF_NVARCHAR, TYPE_OF_TEXT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_SMALLINTEGER, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_MONEY, TYPE_OF_SMALLMONEY, TYPE_OF_DATETIME, TYPE_OF_SMALLDATETIME, TYPE_OF_BIT, TYPE_OF_BINARY, TYPE_OF_VARBINARY, TYPE_OF_UNIQUEIDENTIFIER, TYPE_OF_XML
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
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * String typeOfNvarchar = entity.getTypeOfNvarchar();
 * String typeOfText = entity.getTypeOfText();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * Integer typeOfSmallinteger = entity.getTypeOfSmallinteger();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * java.math.BigDecimal typeOfMoney = entity.getTypeOfMoney();
 * java.math.BigDecimal typeOfSmallmoney = entity.getTypeOfSmallmoney();
 * java.sql.Timestamp typeOfDatetime = entity.getTypeOfDatetime();
 * java.sql.Timestamp typeOfSmalldatetime = entity.getTypeOfSmalldatetime();
 * Boolean typeOfBit = entity.getTypeOfBit();
 * byte[] typeOfBinary = entity.getTypeOfBinary();
 * byte[] typeOfVarbinary = entity.getTypeOfVarbinary();
 * java.util.UUID typeOfUniqueidentifier = entity.getTypeOfUniqueidentifier();
 * String typeOfXml = entity.getTypeOfXml();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfNvarchar(typeOfNvarchar);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfSmallinteger(typeOfSmallinteger);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfMoney(typeOfMoney);
 * entity.setTypeOfSmallmoney(typeOfSmallmoney);
 * entity.setTypeOfDatetime(typeOfDatetime);
 * entity.setTypeOfSmalldatetime(typeOfSmalldatetime);
 * entity.setTypeOfBit(typeOfBit);
 * entity.setTypeOfBinary(typeOfBinary);
 * entity.setTypeOfVarbinary(typeOfVarbinary);
 * entity.setTypeOfUniqueidentifier(typeOfUniqueidentifier);
 * entity.setTypeOfXml(typeOfXml);
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
    /** VENDOR_CHECK_ID: {PK, NotNull, numeric(16)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_VARCHAR: {varchar(32)} */
    protected String _typeOfVarchar;

    /** TYPE_OF_NVARCHAR: {nvarchar(32)} */
    protected String _typeOfNvarchar;

    /** TYPE_OF_TEXT: {text(2147483647)} */
    protected String _typeOfText;

    /** TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER: {numeric(5)} */
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {numeric(12)} */
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_SMALLINTEGER: {smallint(5)} */
    protected Integer _typeOfSmallinteger;

    /** TYPE_OF_INTEGER: {int(10)} */
    protected Integer _typeOfInteger;

    /** TYPE_OF_BIGINT: {bigint(19)} */
    protected Long _typeOfBigint;

    /** TYPE_OF_MONEY: {money(19, 4)} */
    protected java.math.BigDecimal _typeOfMoney;

    /** TYPE_OF_SMALLMONEY: {smallmoney(10, 4)} */
    protected java.math.BigDecimal _typeOfSmallmoney;

    /** TYPE_OF_DATETIME: {datetime(23, 3)} */
    protected java.sql.Timestamp _typeOfDatetime;

    /** TYPE_OF_SMALLDATETIME: {smalldatetime(16)} */
    protected java.sql.Timestamp _typeOfSmalldatetime;

    /** TYPE_OF_BIT: {bit(1)} */
    protected Boolean _typeOfBit;

    /** TYPE_OF_BINARY: {binary(3000)} */
    protected byte[] _typeOfBinary;

    /** TYPE_OF_VARBINARY: {varbinary(3000)} */
    protected byte[] _typeOfVarbinary;

    /** TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} */
    protected java.util.UUID _typeOfUniqueidentifier;

    /** TYPE_OF_XML: {xml(2147483647)} */
    protected String _typeOfXml;

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
        sb.append(dm).append(xfND(_typeOfVarchar));
        sb.append(dm).append(xfND(_typeOfNvarchar));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfNumericDecimal));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
        sb.append(dm).append(xfND(_typeOfNumericBigint));
        sb.append(dm).append(xfND(_typeOfSmallinteger));
        sb.append(dm).append(xfND(_typeOfInteger));
        sb.append(dm).append(xfND(_typeOfBigint));
        sb.append(dm).append(xfND(_typeOfMoney));
        sb.append(dm).append(xfND(_typeOfSmallmoney));
        sb.append(dm).append(xfND(_typeOfDatetime));
        sb.append(dm).append(xfND(_typeOfSmalldatetime));
        sb.append(dm).append(xfND(_typeOfBit));
        sb.append(dm).append(xfBA(_typeOfBinary));
        sb.append(dm).append(xfBA(_typeOfVarbinary));
        sb.append(dm).append(xfND(_typeOfUniqueidentifier));
        sb.append(dm).append(xfND(_typeOfXml));
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
     * [get] VENDOR_CHECK_ID: {PK, NotNull, numeric(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, numeric(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {varchar(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {varchar(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_NVARCHAR: {nvarchar(32)} <br />
     * @return The value of the column 'TYPE_OF_NVARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNvarchar() {
        checkSpecifiedProperty("typeOfNvarchar");
        return _typeOfNvarchar;
    }

    /**
     * [set] TYPE_OF_NVARCHAR: {nvarchar(32)} <br />
     * @param typeOfNvarchar The value of the column 'TYPE_OF_NVARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNvarchar(String typeOfNvarchar) {
        registerModifiedProperty("typeOfNvarchar");
        _typeOfNvarchar = typeOfNvarchar;
    }

    /**
     * [get] TYPE_OF_TEXT: {text(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {text(2147483647)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {numeric(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {numeric(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {numeric(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {numeric(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_SMALLINTEGER: {smallint(5)} <br />
     * @return The value of the column 'TYPE_OF_SMALLINTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfSmallinteger() {
        checkSpecifiedProperty("typeOfSmallinteger");
        return _typeOfSmallinteger;
    }

    /**
     * [set] TYPE_OF_SMALLINTEGER: {smallint(5)} <br />
     * @param typeOfSmallinteger The value of the column 'TYPE_OF_SMALLINTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmallinteger(Integer typeOfSmallinteger) {
        registerModifiedProperty("typeOfSmallinteger");
        _typeOfSmallinteger = typeOfSmallinteger;
    }

    /**
     * [get] TYPE_OF_INTEGER: {int(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        checkSpecifiedProperty("typeOfInteger");
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {int(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        registerModifiedProperty("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {bigint(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        checkSpecifiedProperty("typeOfBigint");
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {bigint(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        registerModifiedProperty("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_MONEY: {money(19, 4)} <br />
     * @return The value of the column 'TYPE_OF_MONEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfMoney() {
        checkSpecifiedProperty("typeOfMoney");
        return _typeOfMoney;
    }

    /**
     * [set] TYPE_OF_MONEY: {money(19, 4)} <br />
     * @param typeOfMoney The value of the column 'TYPE_OF_MONEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMoney(java.math.BigDecimal typeOfMoney) {
        registerModifiedProperty("typeOfMoney");
        _typeOfMoney = typeOfMoney;
    }

    /**
     * [get] TYPE_OF_SMALLMONEY: {smallmoney(10, 4)} <br />
     * @return The value of the column 'TYPE_OF_SMALLMONEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfSmallmoney() {
        checkSpecifiedProperty("typeOfSmallmoney");
        return _typeOfSmallmoney;
    }

    /**
     * [set] TYPE_OF_SMALLMONEY: {smallmoney(10, 4)} <br />
     * @param typeOfSmallmoney The value of the column 'TYPE_OF_SMALLMONEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmallmoney(java.math.BigDecimal typeOfSmallmoney) {
        registerModifiedProperty("typeOfSmallmoney");
        _typeOfSmallmoney = typeOfSmallmoney;
    }

    /**
     * [get] TYPE_OF_DATETIME: {datetime(23, 3)} <br />
     * @return The value of the column 'TYPE_OF_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfDatetime() {
        checkSpecifiedProperty("typeOfDatetime");
        return _typeOfDatetime;
    }

    /**
     * [set] TYPE_OF_DATETIME: {datetime(23, 3)} <br />
     * @param typeOfDatetime The value of the column 'TYPE_OF_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime(java.sql.Timestamp typeOfDatetime) {
        registerModifiedProperty("typeOfDatetime");
        _typeOfDatetime = typeOfDatetime;
    }

    /**
     * [get] TYPE_OF_SMALLDATETIME: {smalldatetime(16)} <br />
     * @return The value of the column 'TYPE_OF_SMALLDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfSmalldatetime() {
        checkSpecifiedProperty("typeOfSmalldatetime");
        return _typeOfSmalldatetime;
    }

    /**
     * [set] TYPE_OF_SMALLDATETIME: {smalldatetime(16)} <br />
     * @param typeOfSmalldatetime The value of the column 'TYPE_OF_SMALLDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmalldatetime(java.sql.Timestamp typeOfSmalldatetime) {
        registerModifiedProperty("typeOfSmalldatetime");
        _typeOfSmalldatetime = typeOfSmalldatetime;
    }

    /**
     * [get] TYPE_OF_BIT: {bit(1)} <br />
     * @return The value of the column 'TYPE_OF_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBit() {
        checkSpecifiedProperty("typeOfBit");
        return _typeOfBit;
    }

    /**
     * [set] TYPE_OF_BIT: {bit(1)} <br />
     * @param typeOfBit The value of the column 'TYPE_OF_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBit(Boolean typeOfBit) {
        registerModifiedProperty("typeOfBit");
        _typeOfBit = typeOfBit;
    }

    /**
     * [get] TYPE_OF_BINARY: {binary(3000)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBinary() {
        checkSpecifiedProperty("typeOfBinary");
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {binary(3000)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinary(byte[] typeOfBinary) {
        registerModifiedProperty("typeOfBinary");
        _typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_VARBINARY: {varbinary(3000)} <br />
     * @return The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfVarbinary() {
        checkSpecifiedProperty("typeOfVarbinary");
        return _typeOfVarbinary;
    }

    /**
     * [set] TYPE_OF_VARBINARY: {varbinary(3000)} <br />
     * @param typeOfVarbinary The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarbinary(byte[] typeOfVarbinary) {
        registerModifiedProperty("typeOfVarbinary");
        _typeOfVarbinary = typeOfVarbinary;
    }

    /**
     * [get] TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} <br />
     * @return The value of the column 'TYPE_OF_UNIQUEIDENTIFIER'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.UUID getTypeOfUniqueidentifier() {
        checkSpecifiedProperty("typeOfUniqueidentifier");
        return _typeOfUniqueidentifier;
    }

    /**
     * [set] TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} <br />
     * @param typeOfUniqueidentifier The value of the column 'TYPE_OF_UNIQUEIDENTIFIER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfUniqueidentifier(java.util.UUID typeOfUniqueidentifier) {
        registerModifiedProperty("typeOfUniqueidentifier");
        _typeOfUniqueidentifier = typeOfUniqueidentifier;
    }

    /**
     * [get] TYPE_OF_XML: {xml(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_XML'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfXml() {
        checkSpecifiedProperty("typeOfXml");
        return _typeOfXml;
    }

    /**
     * [set] TYPE_OF_XML: {xml(2147483647)} <br />
     * @param typeOfXml The value of the column 'TYPE_OF_XML'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfXml(String typeOfXml) {
        registerModifiedProperty("typeOfXml");
        _typeOfXml = typeOfXml;
    }
}
