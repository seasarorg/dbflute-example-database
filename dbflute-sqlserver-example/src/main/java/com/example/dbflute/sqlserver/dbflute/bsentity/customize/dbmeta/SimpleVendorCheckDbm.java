package com.example.dbflute.sqlserver.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.*;

/**
 * The DB meta of SimpleVendorCheck. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SimpleVendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SimpleVendorCheckDbm _instance = new SimpleVendorCheckDbm();
    private SimpleVendorCheckDbm() {}
    public static SimpleVendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgTypeOfNumericDecimal(), "typeOfNumericDecimal");
        setupEpg(_epgMap, new EpgTypeOfNumericInteger(), "typeOfNumericInteger");
        setupEpg(_epgMap, new EpgTypeOfNumericBigint(), "typeOfNumericBigint");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfDatetime(), "typeOfDatetime");
        setupEpg(_epgMap, new EpgTypeOfSmalldatetime(), "typeOfSmalldatetime");
        setupEpg(_epgMap, new EpgTypeOfBit(), "typeOfBit");
        setupEpg(_epgMap, new EpgTypeOfUniqueidentifier(), "typeOfUniqueidentifier");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfNumericDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumericDecimal(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumericDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfNumericInteger implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumericInteger(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumericInteger(cti(vl)); }
    }
    public static class EpgTypeOfNumericBigint implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumericBigint(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumericBigint(ctl(vl)); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfText(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfText((String)vl); }
    }
    public static class EpgTypeOfDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfDatetime(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfSmalldatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfSmalldatetime(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfSmalldatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfBit implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfBit(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfBit((Boolean)vl); }
    }
    public static class EpgTypeOfUniqueidentifier implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfUniqueidentifier(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfUniqueidentifier((java.util.UUID)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SimpleVendorCheck";
    protected final String _tablePropertyName = "simpleVendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("SimpleVendorCheck", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, false, "vendorCheckId", Long.class, false, false, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, false, "typeOfNumericDecimal", java.math.BigDecimal.class, false, false, "numeric", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, false, "typeOfNumericInteger", Integer.class, false, false, "numeric", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, false, "typeOfNumericBigint", Long.class, false, false, "numeric", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, false, "typeOfText", String.class, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDatetime = cci("TYPE_OF_DATETIME", "TYPE_OF_DATETIME", null, null, false, "typeOfDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmalldatetime = cci("TYPE_OF_SMALLDATETIME", "TYPE_OF_SMALLDATETIME", null, null, false, "typeOfSmalldatetime", java.sql.Timestamp.class, false, false, "smalldatetime", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBit = cci("TYPE_OF_BIT", "TYPE_OF_BIT", null, null, false, "typeOfBit", Boolean.class, false, false, "bit", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUniqueidentifier = cci("TYPE_OF_UNIQUEIDENTIFIER", "TYPE_OF_UNIQUEIDENTIFIER", null, null, false, "typeOfUniqueidentifier", java.util.UUID.class, false, false, "uniqueidentifier", 36, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    public ColumnInfo columnTypeOfDatetime() { return _columnTypeOfDatetime; }
    public ColumnInfo columnTypeOfSmalldatetime() { return _columnTypeOfSmalldatetime; }
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    public ColumnInfo columnTypeOfUniqueidentifier() { return _columnTypeOfUniqueidentifier; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfDatetime());
        ls.add(columnTypeOfSmalldatetime());
        ls.add(columnTypeOfBit());
        ls.add(columnTypeOfUniqueidentifier());
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
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.customize.SimpleVendorCheck"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SimpleVendorCheck> getEntityType() { return SimpleVendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SimpleVendorCheck newMyEntity() { return new SimpleVendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SimpleVendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SimpleVendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
