package com.example.dbflute.postgresql.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of VendorCheckCursor. <br />
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCursorCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of vendor_check_id. */
    public static final String DB_NAME_vendor_check_id = "vendor_check_id";

    /** DB name of type_of_char. */
    public static final String DB_NAME_type_of_char = "type_of_char";

    /** DB name of type_of_varchar. */
    public static final String DB_NAME_type_of_varchar = "type_of_varchar";

    /** DB name of type_of_vc_array. */
    public static final String DB_NAME_type_of_vc_array = "type_of_vc_array";

    /** DB name of type_of_text. */
    public static final String DB_NAME_type_of_text = "type_of_text";

    /** DB name of type_of_numeric_integer. */
    public static final String DB_NAME_type_of_numeric_integer = "type_of_numeric_integer";

    /** DB name of type_of_numeric_bigint. */
    public static final String DB_NAME_type_of_numeric_bigint = "type_of_numeric_bigint";

    /** DB name of type_of_numeric_decimal. */
    public static final String DB_NAME_type_of_numeric_decimal = "type_of_numeric_decimal";

    /** DB name of type_of_decimal. */
    public static final String DB_NAME_type_of_decimal = "type_of_decimal";

    /** DB name of type_of_int8. */
    public static final String DB_NAME_type_of_int8 = "type_of_int8";

    /** DB name of type_of_int_array. */
    public static final String DB_NAME_type_of_int_array = "type_of_int_array";

    /** DB name of type_of_int4. */
    public static final String DB_NAME_type_of_int4 = "type_of_int4";

    /** DB name of type_of_bigint. */
    public static final String DB_NAME_type_of_bigint = "type_of_bigint";

    /** DB name of type_of_money. */
    public static final String DB_NAME_type_of_money = "type_of_money";

    /** DB name of type_of_date. */
    public static final String DB_NAME_type_of_date = "type_of_date";

    /** DB name of type_of_timestamp. */
    public static final String DB_NAME_type_of_timestamp = "type_of_timestamp";

    /** DB name of type_of_time. */
    public static final String DB_NAME_type_of_time = "type_of_time";

    /** DB name of type_of_timetz. */
    public static final String DB_NAME_type_of_timetz = "type_of_timetz";

    /** DB name of type_of_interval. */
    public static final String DB_NAME_type_of_interval = "type_of_interval";

    /** DB name of type_of_bool. */
    public static final String DB_NAME_type_of_bool = "type_of_bool";

    /** DB name of type_of_bit. */
    public static final String DB_NAME_type_of_bit = "type_of_bit";

    /** DB name of type_of_bytea. */
    public static final String DB_NAME_type_of_bytea = "type_of_bytea";

    /** DB name of type_of_oid. */
    public static final String DB_NAME_type_of_oid = "type_of_oid";

    /** DB name of type_of_uuid. */
    public static final String DB_NAME_type_of_uuid = "type_of_uuid";

    /** DB name of type_of_xml. */
    public static final String DB_NAME_type_of_xml = "type_of_xml";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtVendorCheckId = vt(Long.class);
    protected ValueType _vtTypeOfChar = vt(String.class);
    protected ValueType _vtTypeOfVarchar = vt(String.class);
    protected ValueType _vtTypeOfVcArray = vt(com.example.dbflute.postgresql.mytype.MyArray.class);
    protected ValueType _vtTypeOfText = vt(String.class);
    protected ValueType _vtTypeOfNumericInteger = vt(Integer.class);
    protected ValueType _vtTypeOfNumericBigint = vt(Long.class);
    protected ValueType _vtTypeOfNumericDecimal = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfDecimal = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfInt8 = vt(Long.class);
    protected ValueType _vtTypeOfIntArray = vt(com.example.dbflute.postgresql.mytype.MyArray.class);
    protected ValueType _vtTypeOfInt4 = vt(Integer.class);
    protected ValueType _vtTypeOfBigint = vt(Long.class);
    protected ValueType _vtTypeOfMoney = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfDate = vt(java.util.Date.class);
    protected ValueType _vtTypeOfTimestamp = vt(java.sql.Timestamp.class);
    protected ValueType _vtTypeOfTime = vt(java.sql.Time.class);
    protected ValueType _vtTypeOfTimetz = vt(java.sql.Time.class);
    protected ValueType _vtTypeOfInterval = vt(String.class);
    protected ValueType _vtTypeOfBool = vt(Boolean.class);
    protected ValueType _vtTypeOfBit = vt(Boolean.class);
    protected ValueType _vtTypeOfBytea = vt(byte[].class);
    protected ValueType _vtTypeOfOid = vt(byte[].class, "bytesOidType");
    protected ValueType _vtTypeOfUuid = vt(java.util.UUID.class);
    protected ValueType _vtTypeOfXml = vt(com.example.dbflute.postgresql.mytype.MyXML.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCursorCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException
     */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] vendor_check_id: {numeric(16)} <br />
     * @return The value of vendorCheckId. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getVendorCheckId() throws SQLException {
        return (Long)_vtVendorCheckId.getValue(_rs, DB_NAME_vendor_check_id);
    }

    /**
     * [get] type_of_char: {bpchar(3)} <br />
     * @return The value of typeOfChar. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getTypeOfChar() throws SQLException {
        return (String)_vtTypeOfChar.getValue(_rs, DB_NAME_type_of_char);
    }

    /**
     * [get] type_of_varchar: {varchar(2147483647)} <br />
     * @return The value of typeOfVarchar. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getTypeOfVarchar() throws SQLException {
        return (String)_vtTypeOfVarchar.getValue(_rs, DB_NAME_type_of_varchar);
    }

    /**
     * [get] type_of_vc_array: {_varchar(2147483647)} <br />
     * @return The value of typeOfVcArray. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public com.example.dbflute.postgresql.mytype.MyArray getTypeOfVcArray() throws SQLException {
        return (com.example.dbflute.postgresql.mytype.MyArray)_vtTypeOfVcArray.getValue(_rs, DB_NAME_type_of_vc_array);
    }

    /**
     * [get] type_of_text: {text(2147483647)} <br />
     * @return The value of typeOfText. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getTypeOfText() throws SQLException {
        return (String)_vtTypeOfText.getValue(_rs, DB_NAME_type_of_text);
    }

    /**
     * [get] type_of_numeric_integer: {numeric(5)} <br />
     * @return The value of typeOfNumericInteger. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Integer getTypeOfNumericInteger() throws SQLException {
        return (Integer)_vtTypeOfNumericInteger.getValue(_rs, DB_NAME_type_of_numeric_integer);
    }

    /**
     * [get] type_of_numeric_bigint: {numeric(12)} <br />
     * @return The value of typeOfNumericBigint. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getTypeOfNumericBigint() throws SQLException {
        return (Long)_vtTypeOfNumericBigint.getValue(_rs, DB_NAME_type_of_numeric_bigint);
    }

    /**
     * [get] type_of_numeric_decimal: {numeric(5, 3)} <br />
     * @return The value of typeOfNumericDecimal. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfNumericDecimal.getValue(_rs, DB_NAME_type_of_numeric_decimal);
    }

    /**
     * [get] type_of_decimal: {numeric(131089)} <br />
     * @return The value of typeOfDecimal. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.math.BigDecimal getTypeOfDecimal() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfDecimal.getValue(_rs, DB_NAME_type_of_decimal);
    }

    /**
     * [get] type_of_int8: {int8(19)} <br />
     * @return The value of typeOfInt8. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getTypeOfInt8() throws SQLException {
        return (Long)_vtTypeOfInt8.getValue(_rs, DB_NAME_type_of_int8);
    }

    /**
     * [get] type_of_int_array: {_int8(19)} <br />
     * @return The value of typeOfIntArray. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public com.example.dbflute.postgresql.mytype.MyArray getTypeOfIntArray() throws SQLException {
        return (com.example.dbflute.postgresql.mytype.MyArray)_vtTypeOfIntArray.getValue(_rs, DB_NAME_type_of_int_array);
    }

    /**
     * [get] type_of_int4: {int4(10)} <br />
     * @return The value of typeOfInt4. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Integer getTypeOfInt4() throws SQLException {
        return (Integer)_vtTypeOfInt4.getValue(_rs, DB_NAME_type_of_int4);
    }

    /**
     * [get] type_of_bigint: {int8(19)} <br />
     * @return The value of typeOfBigint. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getTypeOfBigint() throws SQLException {
        return (Long)_vtTypeOfBigint.getValue(_rs, DB_NAME_type_of_bigint);
    }

    /**
     * [get] type_of_money: {money(2147483647)} <br />
     * @return The value of typeOfMoney. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.math.BigDecimal getTypeOfMoney() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfMoney.getValue(_rs, DB_NAME_type_of_money);
    }

    /**
     * [get] type_of_date: {date(13)} <br />
     * @return The value of typeOfDate. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.util.Date getTypeOfDate() throws SQLException {
        return (java.util.Date)_vtTypeOfDate.getValue(_rs, DB_NAME_type_of_date);
    }

    /**
     * [get] type_of_timestamp: {timestamp(29, 6)} <br />
     * @return The value of typeOfTimestamp. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.sql.Timestamp getTypeOfTimestamp() throws SQLException {
        return (java.sql.Timestamp)_vtTypeOfTimestamp.getValue(_rs, DB_NAME_type_of_timestamp);
    }

    /**
     * [get] type_of_time: {time(15, 6)} <br />
     * @return The value of typeOfTime. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.sql.Time getTypeOfTime() throws SQLException {
        return (java.sql.Time)_vtTypeOfTime.getValue(_rs, DB_NAME_type_of_time);
    }

    /**
     * [get] type_of_timetz: {timetz(21, 6)} <br />
     * @return The value of typeOfTimetz. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.sql.Time getTypeOfTimetz() throws SQLException {
        return (java.sql.Time)_vtTypeOfTimetz.getValue(_rs, DB_NAME_type_of_timetz);
    }

    /**
     * [get] type_of_interval: {interval(49, 6)} <br />
     * @return The value of typeOfInterval. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getTypeOfInterval() throws SQLException {
        return (String)_vtTypeOfInterval.getValue(_rs, DB_NAME_type_of_interval);
    }

    /**
     * [get] type_of_bool: {bool(1)} <br />
     * @return The value of typeOfBool. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Boolean getTypeOfBool() throws SQLException {
        return (Boolean)_vtTypeOfBool.getValue(_rs, DB_NAME_type_of_bool);
    }

    /**
     * [get] type_of_bit: {bit(1)} <br />
     * @return The value of typeOfBit. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Boolean getTypeOfBit() throws SQLException {
        return (Boolean)_vtTypeOfBit.getValue(_rs, DB_NAME_type_of_bit);
    }

    /**
     * [get] type_of_bytea: {bytea(2147483647)} <br />
     * @return The value of typeOfBytea. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public byte[] getTypeOfBytea() throws SQLException {
        return (byte[])_vtTypeOfBytea.getValue(_rs, DB_NAME_type_of_bytea);
    }

    /**
     * [get] type_of_oid: {oid(10)} <br />
     * @return The value of typeOfOid. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public byte[] getTypeOfOid() throws SQLException {
        return (byte[])_vtTypeOfOid.getValue(_rs, DB_NAME_type_of_oid);
    }

    /**
     * [get] type_of_uuid: {uuid(2147483647)} <br />
     * @return The value of typeOfUuid. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.util.UUID getTypeOfUuid() throws SQLException {
        return (java.util.UUID)_vtTypeOfUuid.getValue(_rs, DB_NAME_type_of_uuid);
    }

    /**
     * [get] type_of_xml: {xml(2147483647)} <br />
     * @return The value of typeOfXml. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public com.example.dbflute.postgresql.mytype.MyXML getTypeOfXml() throws SQLException {
        return (com.example.dbflute.postgresql.mytype.MyXML)_vtTypeOfXml.getValue(_rs, DB_NAME_type_of_xml);
    }

}
