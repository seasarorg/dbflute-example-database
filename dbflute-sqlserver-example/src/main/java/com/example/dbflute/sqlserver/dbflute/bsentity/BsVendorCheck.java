package com.example.dbflute.sqlserver.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
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
        if (obj == null || !(obj instanceof BsVendorCheck)) { return false; }
        BsVendorCheck other = (BsVendorCheck)obj;
        if (!xSV(getVendorCheckId(), other.getVendorCheckId())) { return false; }
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
        hs = xCH(hs, getVendorCheckId());
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
        sb.append(dm).append(getVendorCheckId());
        sb.append(dm).append(getTypeOfVarchar());
        sb.append(dm).append(getTypeOfNvarchar());
        sb.append(dm).append(getTypeOfText());
        sb.append(dm).append(getTypeOfNumericDecimal());
        sb.append(dm).append(getTypeOfNumericInteger());
        sb.append(dm).append(getTypeOfNumericBigint());
        sb.append(dm).append(getTypeOfSmallinteger());
        sb.append(dm).append(getTypeOfInteger());
        sb.append(dm).append(getTypeOfBigint());
        sb.append(dm).append(getTypeOfMoney());
        sb.append(dm).append(getTypeOfSmallmoney());
        sb.append(dm).append(getTypeOfDatetime());
        sb.append(dm).append(getTypeOfSmalldatetime());
        sb.append(dm).append(getTypeOfBit());
        sb.append(dm).append(xfBA(getTypeOfBinary()));
        sb.append(dm).append(xfBA(getTypeOfVarbinary()));
        sb.append(dm).append(getTypeOfUniqueidentifier());
        sb.append(dm).append(getTypeOfXml());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
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
     * [get] VENDOR_CHECK_ID: {PK, NotNull, numeric(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, numeric(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {varchar(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {varchar(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        __modifiedProperties.addPropertyName("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_NVARCHAR: {nvarchar(32)} <br />
     * @return The value of the column 'TYPE_OF_NVARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfNvarchar() {
        return _typeOfNvarchar;
    }

    /**
     * [set] TYPE_OF_NVARCHAR: {nvarchar(32)} <br />
     * @param typeOfNvarchar The value of the column 'TYPE_OF_NVARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNvarchar(String typeOfNvarchar) {
        __modifiedProperties.addPropertyName("typeOfNvarchar");
        _typeOfNvarchar = typeOfNvarchar;
    }

    /**
     * [get] TYPE_OF_TEXT: {text(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {text(2147483647)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.addPropertyName("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        __modifiedProperties.addPropertyName("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {numeric(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {numeric(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        __modifiedProperties.addPropertyName("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {numeric(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {numeric(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        __modifiedProperties.addPropertyName("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_SMALLINTEGER: {smallint(5)} <br />
     * @return The value of the column 'TYPE_OF_SMALLINTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfSmallinteger() {
        return _typeOfSmallinteger;
    }

    /**
     * [set] TYPE_OF_SMALLINTEGER: {smallint(5)} <br />
     * @param typeOfSmallinteger The value of the column 'TYPE_OF_SMALLINTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmallinteger(Integer typeOfSmallinteger) {
        __modifiedProperties.addPropertyName("typeOfSmallinteger");
        _typeOfSmallinteger = typeOfSmallinteger;
    }

    /**
     * [get] TYPE_OF_INTEGER: {int(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {int(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        __modifiedProperties.addPropertyName("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {bigint(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {bigint(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        __modifiedProperties.addPropertyName("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_MONEY: {money(19, 4)} <br />
     * @return The value of the column 'TYPE_OF_MONEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfMoney() {
        return _typeOfMoney;
    }

    /**
     * [set] TYPE_OF_MONEY: {money(19, 4)} <br />
     * @param typeOfMoney The value of the column 'TYPE_OF_MONEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMoney(java.math.BigDecimal typeOfMoney) {
        __modifiedProperties.addPropertyName("typeOfMoney");
        _typeOfMoney = typeOfMoney;
    }

    /**
     * [get] TYPE_OF_SMALLMONEY: {smallmoney(10, 4)} <br />
     * @return The value of the column 'TYPE_OF_SMALLMONEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfSmallmoney() {
        return _typeOfSmallmoney;
    }

    /**
     * [set] TYPE_OF_SMALLMONEY: {smallmoney(10, 4)} <br />
     * @param typeOfSmallmoney The value of the column 'TYPE_OF_SMALLMONEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmallmoney(java.math.BigDecimal typeOfSmallmoney) {
        __modifiedProperties.addPropertyName("typeOfSmallmoney");
        _typeOfSmallmoney = typeOfSmallmoney;
    }

    /**
     * [get] TYPE_OF_DATETIME: {datetime(23, 3)} <br />
     * @return The value of the column 'TYPE_OF_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfDatetime() {
        return _typeOfDatetime;
    }

    /**
     * [set] TYPE_OF_DATETIME: {datetime(23, 3)} <br />
     * @param typeOfDatetime The value of the column 'TYPE_OF_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime(java.sql.Timestamp typeOfDatetime) {
        __modifiedProperties.addPropertyName("typeOfDatetime");
        _typeOfDatetime = typeOfDatetime;
    }

    /**
     * [get] TYPE_OF_SMALLDATETIME: {smalldatetime(16)} <br />
     * @return The value of the column 'TYPE_OF_SMALLDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfSmalldatetime() {
        return _typeOfSmalldatetime;
    }

    /**
     * [set] TYPE_OF_SMALLDATETIME: {smalldatetime(16)} <br />
     * @param typeOfSmalldatetime The value of the column 'TYPE_OF_SMALLDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmalldatetime(java.sql.Timestamp typeOfSmalldatetime) {
        __modifiedProperties.addPropertyName("typeOfSmalldatetime");
        _typeOfSmalldatetime = typeOfSmalldatetime;
    }

    /**
     * [get] TYPE_OF_BIT: {bit(1)} <br />
     * @return The value of the column 'TYPE_OF_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBit() {
        return _typeOfBit;
    }

    /**
     * [set] TYPE_OF_BIT: {bit(1)} <br />
     * @param typeOfBit The value of the column 'TYPE_OF_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBit(Boolean typeOfBit) {
        __modifiedProperties.addPropertyName("typeOfBit");
        _typeOfBit = typeOfBit;
    }

    /**
     * [get] TYPE_OF_BINARY: {binary(3000)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBinary() {
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {binary(3000)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinary(byte[] typeOfBinary) {
        __modifiedProperties.addPropertyName("typeOfBinary");
        _typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_VARBINARY: {varbinary(3000)} <br />
     * @return The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfVarbinary() {
        return _typeOfVarbinary;
    }

    /**
     * [set] TYPE_OF_VARBINARY: {varbinary(3000)} <br />
     * @param typeOfVarbinary The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarbinary(byte[] typeOfVarbinary) {
        __modifiedProperties.addPropertyName("typeOfVarbinary");
        _typeOfVarbinary = typeOfVarbinary;
    }

    /**
     * [get] TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} <br />
     * @return The value of the column 'TYPE_OF_UNIQUEIDENTIFIER'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.UUID getTypeOfUniqueidentifier() {
        return _typeOfUniqueidentifier;
    }

    /**
     * [set] TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} <br />
     * @param typeOfUniqueidentifier The value of the column 'TYPE_OF_UNIQUEIDENTIFIER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfUniqueidentifier(java.util.UUID typeOfUniqueidentifier) {
        __modifiedProperties.addPropertyName("typeOfUniqueidentifier");
        _typeOfUniqueidentifier = typeOfUniqueidentifier;
    }

    /**
     * [get] TYPE_OF_XML: {xml(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_XML'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfXml() {
        return _typeOfXml;
    }

    /**
     * [set] TYPE_OF_XML: {xml(2147483647)} <br />
     * @param typeOfXml The value of the column 'TYPE_OF_XML'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfXml(String typeOfXml) {
        __modifiedProperties.addPropertyName("typeOfXml");
        _typeOfXml = typeOfXml;
    }
}
