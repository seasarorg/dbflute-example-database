package com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfNvarchar(), "typeOfNvarchar");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfNumericDecimal(), "typeOfNumericDecimal");
        setupEpg(_epgMap, new EpgTypeOfNumericInteger(), "typeOfNumericInteger");
        setupEpg(_epgMap, new EpgTypeOfNumericBigint(), "typeOfNumericBigint");
        setupEpg(_epgMap, new EpgTypeOfSmallinteger(), "typeOfSmallinteger");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfMoney(), "typeOfMoney");
        setupEpg(_epgMap, new EpgTypeOfSmallmoney(), "typeOfSmallmoney");
        setupEpg(_epgMap, new EpgTypeOfDatetime(), "typeOfDatetime");
        setupEpg(_epgMap, new EpgTypeOfSmalldatetime(), "typeOfSmalldatetime");
        setupEpg(_epgMap, new EpgTypeOfBit(), "typeOfBit");
        setupEpg(_epgMap, new EpgTypeOfBinary(), "typeOfBinary");
        setupEpg(_epgMap, new EpgTypeOfVarbinary(), "typeOfVarbinary");
        setupEpg(_epgMap, new EpgTypeOfUniqueidentifier(), "typeOfUniqueidentifier");
        setupEpg(_epgMap, new EpgTypeOfXml(), "typeOfXml");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getVendorCheckId(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setVendorCheckId(ctl(v)); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVarchar(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVarchar((String)v); }
    }
    public static class EpgTypeOfNvarchar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfNvarchar(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfNvarchar((String)v); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfText(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfText((String)v); }
    }
    public static class EpgTypeOfNumericDecimal implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfNumericDecimal(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfNumericDecimal(ctb(v)); }
    }
    public static class EpgTypeOfNumericInteger implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfNumericInteger(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfNumericInteger(cti(v)); }
    }
    public static class EpgTypeOfNumericBigint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfNumericBigint(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfNumericBigint(ctl(v)); }
    }
    public static class EpgTypeOfSmallinteger implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfSmallinteger(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfSmallinteger(cti(v)); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfInteger(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfInteger(cti(v)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBigint(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBigint(ctl(v)); }
    }
    public static class EpgTypeOfMoney implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfMoney(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfMoney(ctb(v)); }
    }
    public static class EpgTypeOfSmallmoney implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfSmallmoney(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfSmallmoney(ctb(v)); }
    }
    public static class EpgTypeOfDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDatetime(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgTypeOfSmalldatetime implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfSmalldatetime(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfSmalldatetime((java.sql.Timestamp)v); }
    }
    public static class EpgTypeOfBit implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBit(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBit((Boolean)v); }
    }
    public static class EpgTypeOfBinary implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBinary(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBinary((byte[])v); }
    }
    public static class EpgTypeOfVarbinary implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVarbinary(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVarbinary((byte[])v); }
    }
    public static class EpgTypeOfUniqueidentifier implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfUniqueidentifier(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfUniqueidentifier((java.util.UUID)v); }
    }
    public static class EpgTypeOfXml implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfXml(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfXml((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, true, "vendorCheckId", Long.class, true, false, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, false, "typeOfVarchar", String.class, false, false, "varchar", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNvarchar = cci("TYPE_OF_NVARCHAR", "TYPE_OF_NVARCHAR", null, null, false, "typeOfNvarchar", String.class, false, false, "nvarchar", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, false, "typeOfText", String.class, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, false, "typeOfNumericDecimal", java.math.BigDecimal.class, false, false, "numeric", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, false, "typeOfNumericInteger", Integer.class, false, false, "numeric", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, false, "typeOfNumericBigint", Long.class, false, false, "numeric", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallinteger = cci("TYPE_OF_SMALLINTEGER", "TYPE_OF_SMALLINTEGER", null, null, false, "typeOfSmallinteger", Integer.class, false, false, "smallint", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, false, "typeOfInteger", Integer.class, false, false, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, false, "typeOfBigint", Long.class, false, false, "bigint", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMoney = cci("TYPE_OF_MONEY", "TYPE_OF_MONEY", null, null, false, "typeOfMoney", java.math.BigDecimal.class, false, false, "money", 19, 4, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallmoney = cci("TYPE_OF_SMALLMONEY", "TYPE_OF_SMALLMONEY", null, null, false, "typeOfSmallmoney", java.math.BigDecimal.class, false, false, "smallmoney", 10, 4, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDatetime = cci("TYPE_OF_DATETIME", "TYPE_OF_DATETIME", null, null, false, "typeOfDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmalldatetime = cci("TYPE_OF_SMALLDATETIME", "TYPE_OF_SMALLDATETIME", null, null, false, "typeOfSmalldatetime", java.sql.Timestamp.class, false, false, "smalldatetime", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBit = cci("TYPE_OF_BIT", "TYPE_OF_BIT", null, null, false, "typeOfBit", Boolean.class, false, false, "bit", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinary = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, false, "typeOfBinary", byte[].class, false, false, "binary", 2000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarbinary = cci("TYPE_OF_VARBINARY", "TYPE_OF_VARBINARY", null, null, false, "typeOfVarbinary", byte[].class, false, false, "varbinary", 2000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUniqueidentifier = cci("TYPE_OF_UNIQUEIDENTIFIER", "TYPE_OF_UNIQUEIDENTIFIER", null, null, false, "typeOfUniqueidentifier", java.util.UUID.class, false, false, "uniqueidentifier", 36, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfXml = cci("TYPE_OF_XML", "TYPE_OF_XML", null, null, false, "typeOfXml", String.class, false, false, "xml", 1073741823, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    public ColumnInfo columnTypeOfNvarchar() { return _columnTypeOfNvarchar; }
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    public ColumnInfo columnTypeOfSmallinteger() { return _columnTypeOfSmallinteger; }
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    public ColumnInfo columnTypeOfSmallmoney() { return _columnTypeOfSmallmoney; }
    public ColumnInfo columnTypeOfDatetime() { return _columnTypeOfDatetime; }
    public ColumnInfo columnTypeOfSmalldatetime() { return _columnTypeOfSmalldatetime; }
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    public ColumnInfo columnTypeOfBinary() { return _columnTypeOfBinary; }
    public ColumnInfo columnTypeOfVarbinary() { return _columnTypeOfVarbinary; }
    public ColumnInfo columnTypeOfUniqueidentifier() { return _columnTypeOfUniqueidentifier; }
    public ColumnInfo columnTypeOfXml() { return _columnTypeOfXml; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfNvarchar());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfSmallinteger());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfMoney());
        ls.add(columnTypeOfSmallmoney());
        ls.add(columnTypeOfDatetime());
        ls.add(columnTypeOfSmalldatetime());
        ls.add(columnTypeOfBit());
        ls.add(columnTypeOfBinary());
        ls.add(columnTypeOfVarbinary());
        ls.add(columnTypeOfUniqueidentifier());
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
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.sqlserver.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.sqlserver.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorCheck newMyEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
