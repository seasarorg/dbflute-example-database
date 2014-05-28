package com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of VendorCheckCursor. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCursorDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckCursorDbm _instance = new VendorCheckCursorDbm();
    private VendorCheckCursorDbm() {}
    public static VendorCheckCursorDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgTypeOfChar(), "typeOfChar");
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfVcArray(), "typeOfVcArray");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfNumericInteger(), "typeOfNumericInteger");
        setupEpg(_epgMap, new EpgTypeOfNumericBigint(), "typeOfNumericBigint");
        setupEpg(_epgMap, new EpgTypeOfNumericDecimal(), "typeOfNumericDecimal");
        setupEpg(_epgMap, new EpgTypeOfDecimal(), "typeOfDecimal");
        setupEpg(_epgMap, new EpgTypeOfInt8(), "typeOfInt8");
        setupEpg(_epgMap, new EpgTypeOfIntArray(), "typeOfIntArray");
        setupEpg(_epgMap, new EpgTypeOfInt4(), "typeOfInt4");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfReal(), "typeOfReal");
        setupEpg(_epgMap, new EpgTypeOfFloat(), "typeOfFloat");
        setupEpg(_epgMap, new EpgTypeOfMoney(), "typeOfMoney");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfTime(), "typeOfTime");
        setupEpg(_epgMap, new EpgTypeOfTimetz(), "typeOfTimetz");
        setupEpg(_epgMap, new EpgTypeOfInterval(), "typeOfInterval");
        setupEpg(_epgMap, new EpgTypeOfBool(), "typeOfBool");
        setupEpg(_epgMap, new EpgTypeOfBit(), "typeOfBit");
        setupEpg(_epgMap, new EpgTypeOfBytea(), "typeOfBytea");
        setupEpg(_epgMap, new EpgTypeOfOid(), "typeOfOid");
        setupEpg(_epgMap, new EpgTypeOfUuid(), "typeOfUuid");
        setupEpg(_epgMap, new EpgTypeOfXml(), "typeOfXml");
    }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfChar(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfChar((String)vl); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfVarchar(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfVarchar((String)vl); }
    }
    public static class EpgTypeOfVcArray implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfVcArray(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfVcArray((com.example.dbflute.postgresql.mytype.MyArray)vl); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfText(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfText((String)vl); }
    }
    public static class EpgTypeOfNumericInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfNumericInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfNumericInteger(cti(vl)); }
    }
    public static class EpgTypeOfNumericBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfNumericBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfNumericBigint(ctl(vl)); }
    }
    public static class EpgTypeOfNumericDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfNumericDecimal(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfNumericDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfDecimal(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfInt8 implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfInt8(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfInt8(ctl(vl)); }
    }
    public static class EpgTypeOfIntArray implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfIntArray(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfIntArray((com.example.dbflute.postgresql.mytype.MyArray)vl); }
    }
    public static class EpgTypeOfInt4 implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfInt4(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfInt4(cti(vl)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfBigint(ctl(vl)); }
    }
    public static class EpgTypeOfReal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfReal(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfReal(ctb(vl)); }
    }
    public static class EpgTypeOfFloat implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfFloat(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfFloat(ctb(vl)); }
    }
    public static class EpgTypeOfMoney implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfMoney(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfMoney(ctb(vl)); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfDate(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfDate((java.util.Date)vl); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfTimestamp(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfTime(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfTime((java.sql.Time)vl); }
    }
    public static class EpgTypeOfTimetz implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfTimetz(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfTimetz((java.sql.Time)vl); }
    }
    public static class EpgTypeOfInterval implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfInterval(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfInterval((String)vl); }
    }
    public static class EpgTypeOfBool implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfBool(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfBool((Boolean)vl); }
    }
    public static class EpgTypeOfBit implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfBit(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfBit((Boolean)vl); }
    }
    public static class EpgTypeOfBytea implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfBytea(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfBytea((byte[])vl); }
    }
    public static class EpgTypeOfOid implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfOid(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfOid((byte[])vl); }
    }
    public static class EpgTypeOfUuid implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfUuid(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfUuid((java.util.UUID)vl); }
    }
    public static class EpgTypeOfXml implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheckCursor)et).getTypeOfXml(); }
        public void write(Entity et, Object vl) { ((VendorCheckCursor)et).setTypeOfXml((com.example.dbflute.postgresql.mytype.MyXML)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VendorCheckCursor";
    protected final String _tablePropertyName = "vendorCheckCursor";
    protected final TableSqlName _tableSqlName = new TableSqlName("VendorCheckCursor", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, Long.class, "vendorCheckId", null, false, false, false, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("type_of_char", "type_of_char", null, null, String.class, "typeOfChar", null, false, false, false, "bpchar", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("type_of_varchar", "type_of_varchar", null, null, String.class, "typeOfVarchar", null, false, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVcArray = cci("type_of_vc_array", "type_of_vc_array", null, null, com.example.dbflute.postgresql.mytype.MyArray.class, "typeOfVcArray", null, false, false, false, "_varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("type_of_text", "type_of_text", null, null, String.class, "typeOfText", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("type_of_numeric_integer", "type_of_numeric_integer", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "numeric", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("type_of_numeric_bigint", "type_of_numeric_bigint", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "numeric", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("type_of_numeric_decimal", "type_of_numeric_decimal", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "numeric", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimal = cci("type_of_decimal", "type_of_decimal", null, null, java.math.BigDecimal.class, "typeOfDecimal", null, false, false, false, "numeric", 131089, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInt8 = cci("type_of_int8", "type_of_int8", null, null, Long.class, "typeOfInt8", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfIntArray = cci("type_of_int_array", "type_of_int_array", null, null, com.example.dbflute.postgresql.mytype.MyArray.class, "typeOfIntArray", null, false, false, false, "_int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInt4 = cci("type_of_int4", "type_of_int4", null, null, Integer.class, "typeOfInt4", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("type_of_bigint", "type_of_bigint", null, null, Long.class, "typeOfBigint", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfReal = cci("type_of_real", "type_of_real", null, null, java.math.BigDecimal.class, "typeOfReal", null, false, false, false, "float4", 8, 8, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfFloat = cci("type_of_float", "type_of_float", null, null, java.math.BigDecimal.class, "typeOfFloat", null, false, false, false, "float8", 17, 17, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMoney = cci("type_of_money", "type_of_money", null, null, java.math.BigDecimal.class, "typeOfMoney", null, false, false, false, "money", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("type_of_date", "type_of_date", null, null, java.util.Date.class, "typeOfDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("type_of_timestamp", "type_of_timestamp", null, null, java.sql.Timestamp.class, "typeOfTimestamp", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("type_of_time", "type_of_time", null, null, java.sql.Time.class, "typeOfTime", null, false, false, false, "time", 15, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimetz = cci("type_of_timetz", "type_of_timetz", null, null, java.sql.Time.class, "typeOfTimetz", null, false, false, false, "timetz", 21, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInterval = cci("type_of_interval", "type_of_interval", null, null, String.class, "typeOfInterval", null, false, false, false, "interval", 49, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBool = cci("type_of_bool", "type_of_bool", null, null, Boolean.class, "typeOfBool", null, false, false, false, "bool", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBit = cci("type_of_bit", "type_of_bit", null, null, Boolean.class, "typeOfBit", null, false, false, false, "bit", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBytea = cci("type_of_bytea", "type_of_bytea", null, null, byte[].class, "typeOfBytea", null, false, false, false, "bytea", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfOid = cci("type_of_oid", "type_of_oid", null, null, byte[].class, "typeOfOid", null, false, false, false, "oid", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUuid = cci("type_of_uuid", "type_of_uuid", null, null, java.util.UUID.class, "typeOfUuid", null, false, false, false, "uuid", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfXml = cci("type_of_xml", "type_of_xml", null, null, com.example.dbflute.postgresql.mytype.MyXML.class, "typeOfXml", null, false, false, false, "xml", 2147483647, 0, null, false, null, null, null, null, null);

    /**
     * vendor_check_id: {numeric(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * type_of_char: {bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    /**
     * type_of_varchar: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * type_of_vc_array: {_varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVcArray() { return _columnTypeOfVcArray; }
    /**
     * type_of_text: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * type_of_numeric_integer: {numeric(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * type_of_numeric_bigint: {numeric(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    /**
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * type_of_decimal: {numeric(131089)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDecimal() { return _columnTypeOfDecimal; }
    /**
     * type_of_int8: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt8() { return _columnTypeOfInt8; }
    /**
     * type_of_int_array: {_int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntArray() { return _columnTypeOfIntArray; }
    /**
     * type_of_int4: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt4() { return _columnTypeOfInt4; }
    /**
     * type_of_bigint: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * type_of_real: {float4(8, 8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfReal() { return _columnTypeOfReal; }
    /**
     * type_of_float: {float8(17, 17)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfFloat() { return _columnTypeOfFloat; }
    /**
     * type_of_money: {money(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    /**
     * type_of_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * type_of_timestamp: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * type_of_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    /**
     * type_of_timetz: {timetz(21, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimetz() { return _columnTypeOfTimetz; }
    /**
     * type_of_interval: {interval(49, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInterval() { return _columnTypeOfInterval; }
    /**
     * type_of_bool: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBool() { return _columnTypeOfBool; }
    /**
     * type_of_bit: {bit(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    /**
     * type_of_bytea: {bytea(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBytea() { return _columnTypeOfBytea; }
    /**
     * type_of_oid: {oid(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfOid() { return _columnTypeOfOid; }
    /**
     * type_of_uuid: {uuid(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfUuid() { return _columnTypeOfUuid; }
    /**
     * type_of_xml: {xml(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfXml() { return _columnTypeOfXml; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfVcArray());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfDecimal());
        ls.add(columnTypeOfInt8());
        ls.add(columnTypeOfIntArray());
        ls.add(columnTypeOfInt4());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfReal());
        ls.add(columnTypeOfFloat());
        ls.add(columnTypeOfMoney());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfTimetz());
        ls.add(columnTypeOfInterval());
        ls.add(columnTypeOfBool());
        ls.add(columnTypeOfBit());
        ls.add(columnTypeOfBytea());
        ls.add(columnTypeOfOid());
        ls.add(columnTypeOfUuid());
        ls.add(columnTypeOfXml());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.VendorCheckCursor"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheckCursor> getEntityType() { return VendorCheckCursor.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorCheckCursor newMyEntity() { return new VendorCheckCursor(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheckCursor)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheckCursor)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
