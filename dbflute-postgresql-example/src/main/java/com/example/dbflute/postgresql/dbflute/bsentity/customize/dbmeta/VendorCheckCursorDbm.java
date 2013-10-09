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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getVendorCheckId(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setVendorCheckId(ctl(v)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfChar(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfChar((String)v); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfVarchar(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfVarchar((String)v); }
    }
    public static class EpgTypeOfVcArray implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfVcArray(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfVcArray((com.example.dbflute.postgresql.mytype.MyArray)v); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfText(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfText((String)v); }
    }
    public static class EpgTypeOfNumericInteger implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfNumericInteger(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfNumericInteger(cti(v)); }
    }
    public static class EpgTypeOfNumericBigint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfNumericBigint(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfNumericBigint(ctl(v)); }
    }
    public static class EpgTypeOfNumericDecimal implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfNumericDecimal(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfNumericDecimal(ctb(v)); }
    }
    public static class EpgTypeOfDecimal implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfDecimal(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfDecimal(ctb(v)); }
    }
    public static class EpgTypeOfInt8 implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfInt8(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfInt8(ctl(v)); }
    }
    public static class EpgTypeOfIntArray implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfIntArray(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfIntArray((com.example.dbflute.postgresql.mytype.MyArray)v); }
    }
    public static class EpgTypeOfInt4 implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfInt4(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfInt4(cti(v)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfBigint(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfBigint(ctl(v)); }
    }
    public static class EpgTypeOfMoney implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfMoney(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfMoney(ctb(v)); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfDate(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfDate((java.util.Date)v); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfTimestamp(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfTime(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfTime((java.sql.Time)v); }
    }
    public static class EpgTypeOfTimetz implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfTimetz(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfTimetz((java.sql.Time)v); }
    }
    public static class EpgTypeOfInterval implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfInterval(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfInterval((String)v); }
    }
    public static class EpgTypeOfBool implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfBool(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfBool((Boolean)v); }
    }
    public static class EpgTypeOfBit implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfBit(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfBit((Boolean)v); }
    }
    public static class EpgTypeOfBytea implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfBytea(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfBytea((byte[])v); }
    }
    public static class EpgTypeOfOid implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfOid(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfOid((byte[])v); }
    }
    public static class EpgTypeOfUuid implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfUuid(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfUuid((java.util.UUID)v); }
    }
    public static class EpgTypeOfXml implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheckCursor)e).getTypeOfXml(); }
        public void write(Entity e, Object v) { ((VendorCheckCursor)e).setTypeOfXml((com.example.dbflute.postgresql.mytype.MyXML)v); }
    }

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
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, false, "vendorCheckId", Long.class, false, false, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("type_of_char", "type_of_char", null, null, false, "typeOfChar", String.class, false, false, "bpchar", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("type_of_varchar", "type_of_varchar", null, null, false, "typeOfVarchar", String.class, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVcArray = cci("type_of_vc_array", "type_of_vc_array", null, null, false, "typeOfVcArray", com.example.dbflute.postgresql.mytype.MyArray.class, false, false, "_varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("type_of_text", "type_of_text", null, null, false, "typeOfText", String.class, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("type_of_numeric_integer", "type_of_numeric_integer", null, null, false, "typeOfNumericInteger", Integer.class, false, false, "numeric", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("type_of_numeric_bigint", "type_of_numeric_bigint", null, null, false, "typeOfNumericBigint", Long.class, false, false, "numeric", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("type_of_numeric_decimal", "type_of_numeric_decimal", null, null, false, "typeOfNumericDecimal", java.math.BigDecimal.class, false, false, "numeric", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimal = cci("type_of_decimal", "type_of_decimal", null, null, false, "typeOfDecimal", java.math.BigDecimal.class, false, false, "numeric", 131089, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInt8 = cci("type_of_int8", "type_of_int8", null, null, false, "typeOfInt8", Long.class, false, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfIntArray = cci("type_of_int_array", "type_of_int_array", null, null, false, "typeOfIntArray", com.example.dbflute.postgresql.mytype.MyArray.class, false, false, "_int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInt4 = cci("type_of_int4", "type_of_int4", null, null, false, "typeOfInt4", Integer.class, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("type_of_bigint", "type_of_bigint", null, null, false, "typeOfBigint", Long.class, false, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMoney = cci("type_of_money", "type_of_money", null, null, false, "typeOfMoney", java.math.BigDecimal.class, false, false, "money", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("type_of_date", "type_of_date", null, null, false, "typeOfDate", java.util.Date.class, false, false, "date", 13, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("type_of_timestamp", "type_of_timestamp", null, null, false, "typeOfTimestamp", java.sql.Timestamp.class, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("type_of_time", "type_of_time", null, null, false, "typeOfTime", java.sql.Time.class, false, false, "time", 15, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimetz = cci("type_of_timetz", "type_of_timetz", null, null, false, "typeOfTimetz", java.sql.Time.class, false, false, "timetz", 21, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInterval = cci("type_of_interval", "type_of_interval", null, null, false, "typeOfInterval", String.class, false, false, "interval", 49, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBool = cci("type_of_bool", "type_of_bool", null, null, false, "typeOfBool", Boolean.class, false, false, "bool", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBit = cci("type_of_bit", "type_of_bit", null, null, false, "typeOfBit", Boolean.class, false, false, "bit", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBytea = cci("type_of_bytea", "type_of_bytea", null, null, false, "typeOfBytea", byte[].class, false, false, "bytea", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfOid = cci("type_of_oid", "type_of_oid", null, null, false, "typeOfOid", byte[].class, false, false, "oid", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUuid = cci("type_of_uuid", "type_of_uuid", null, null, false, "typeOfUuid", java.util.UUID.class, false, false, "uuid", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfXml = cci("type_of_xml", "type_of_xml", null, null, false, "typeOfXml", com.example.dbflute.postgresql.mytype.MyXML.class, false, false, "xml", 2147483647, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    public ColumnInfo columnTypeOfVcArray() { return _columnTypeOfVcArray; }
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    public ColumnInfo columnTypeOfDecimal() { return _columnTypeOfDecimal; }
    public ColumnInfo columnTypeOfInt8() { return _columnTypeOfInt8; }
    public ColumnInfo columnTypeOfIntArray() { return _columnTypeOfIntArray; }
    public ColumnInfo columnTypeOfInt4() { return _columnTypeOfInt4; }
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    public ColumnInfo columnTypeOfTimetz() { return _columnTypeOfTimetz; }
    public ColumnInfo columnTypeOfInterval() { return _columnTypeOfInterval; }
    public ColumnInfo columnTypeOfBool() { return _columnTypeOfBool; }
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    public ColumnInfo columnTypeOfBytea() { return _columnTypeOfBytea; }
    public ColumnInfo columnTypeOfOid() { return _columnTypeOfOid; }
    public ColumnInfo columnTypeOfUuid() { return _columnTypeOfUuid; }
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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorCheckCursor)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorCheckCursor)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
