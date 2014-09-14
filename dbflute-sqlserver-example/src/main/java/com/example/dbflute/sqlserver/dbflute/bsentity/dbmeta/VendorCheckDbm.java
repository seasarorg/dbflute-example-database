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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarchar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarchar((String)vl); }
    }
    public static class EpgTypeOfNvarchar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNvarchar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNvarchar((String)vl); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfText(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfText((String)vl); }
    }
    public static class EpgTypeOfNumericDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericDecimal(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfNumericInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericInteger(cti(vl)); }
    }
    public static class EpgTypeOfNumericBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericBigint(ctl(vl)); }
    }
    public static class EpgTypeOfSmallinteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfSmallinteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfSmallinteger(cti(vl)); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfInteger(cti(vl)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBigint(ctl(vl)); }
    }
    public static class EpgTypeOfMoney implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfMoney(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfMoney(ctb(vl)); }
    }
    public static class EpgTypeOfSmallmoney implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfSmallmoney(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfSmallmoney(ctb(vl)); }
    }
    public static class EpgTypeOfDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDatetime(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfSmalldatetime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfSmalldatetime(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfSmalldatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfBit implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBit(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBit((Boolean)vl); }
    }
    public static class EpgTypeOfBinary implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBinary(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBinary((byte[])vl); }
    }
    public static class EpgTypeOfVarbinary implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarbinary(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarbinary((byte[])vl); }
    }
    public static class EpgTypeOfUniqueidentifier implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfUniqueidentifier(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfUniqueidentifier((java.util.UUID)vl); }
    }
    public static class EpgTypeOfXml implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfXml(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfXml((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Long.class, "vendorCheckId", null, true, false, true, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, String.class, "typeOfVarchar", null, false, false, false, "varchar", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNvarchar = cci("TYPE_OF_NVARCHAR", "TYPE_OF_NVARCHAR", null, null, String.class, "typeOfNvarchar", null, false, false, false, "nvarchar", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, String.class, "typeOfText", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "numeric", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "numeric", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "numeric", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallinteger = cci("TYPE_OF_SMALLINTEGER", "TYPE_OF_SMALLINTEGER", null, null, Integer.class, "typeOfSmallinteger", null, false, false, false, "smallint", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, Integer.class, "typeOfInteger", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, Long.class, "typeOfBigint", null, false, false, false, "bigint", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMoney = cci("TYPE_OF_MONEY", "TYPE_OF_MONEY", null, null, java.math.BigDecimal.class, "typeOfMoney", null, false, false, false, "money", 19, 4, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallmoney = cci("TYPE_OF_SMALLMONEY", "TYPE_OF_SMALLMONEY", null, null, java.math.BigDecimal.class, "typeOfSmallmoney", null, false, false, false, "smallmoney", 10, 4, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDatetime = cci("TYPE_OF_DATETIME", "TYPE_OF_DATETIME", null, null, java.sql.Timestamp.class, "typeOfDatetime", null, false, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmalldatetime = cci("TYPE_OF_SMALLDATETIME", "TYPE_OF_SMALLDATETIME", null, null, java.sql.Timestamp.class, "typeOfSmalldatetime", null, false, false, false, "smalldatetime", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBit = cci("TYPE_OF_BIT", "TYPE_OF_BIT", null, null, Boolean.class, "typeOfBit", null, false, false, false, "bit", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinary = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, byte[].class, "typeOfBinary", null, false, false, false, "binary", 3000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarbinary = cci("TYPE_OF_VARBINARY", "TYPE_OF_VARBINARY", null, null, byte[].class, "typeOfVarbinary", null, false, false, false, "varbinary", 3000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUniqueidentifier = cci("TYPE_OF_UNIQUEIDENTIFIER", "TYPE_OF_UNIQUEIDENTIFIER", null, null, java.util.UUID.class, "typeOfUniqueidentifier", null, false, false, false, "uniqueidentifier", 36, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfXml = cci("TYPE_OF_XML", "TYPE_OF_XML", null, null, String.class, "typeOfXml", null, false, false, false, "xml", 2147483647, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_CHECK_ID: {PK, NotNull, numeric(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_VARCHAR: {varchar(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * TYPE_OF_NVARCHAR: {nvarchar(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNvarchar() { return _columnTypeOfNvarchar; }
    /**
     * TYPE_OF_TEXT: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * TYPE_OF_NUMERIC_INTEGER: {numeric(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * TYPE_OF_NUMERIC_BIGINT: {numeric(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    /**
     * TYPE_OF_SMALLINTEGER: {smallint(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmallinteger() { return _columnTypeOfSmallinteger; }
    /**
     * TYPE_OF_INTEGER: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_BIGINT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * TYPE_OF_MONEY: {money(19, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    /**
     * TYPE_OF_SMALLMONEY: {smallmoney(10, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmallmoney() { return _columnTypeOfSmallmoney; }
    /**
     * TYPE_OF_DATETIME: {datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDatetime() { return _columnTypeOfDatetime; }
    /**
     * TYPE_OF_SMALLDATETIME: {smalldatetime(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmalldatetime() { return _columnTypeOfSmalldatetime; }
    /**
     * TYPE_OF_BIT: {bit(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    /**
     * TYPE_OF_BINARY: {binary(3000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinary() { return _columnTypeOfBinary; }
    /**
     * TYPE_OF_VARBINARY: {varbinary(3000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarbinary() { return _columnTypeOfVarbinary; }
    /**
     * TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfUniqueidentifier() { return _columnTypeOfUniqueidentifier; }
    /**
     * TYPE_OF_XML: {xml(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
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
    public VendorCheck newEntity() { return new VendorCheck(); }
    public VendorCheck newMyEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
