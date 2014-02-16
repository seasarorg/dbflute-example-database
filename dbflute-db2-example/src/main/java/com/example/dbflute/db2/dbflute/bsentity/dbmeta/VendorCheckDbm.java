package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.exentity.*;

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
        setupEpg(_epgMap, new EpgTypeOfChar(), "typeOfChar");
        setupEpg(_epgMap, new EpgTypeOfCharForBitData(), "typeOfCharForBitData");
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfVarcharForBitData(), "typeOfVarcharForBitData");
        setupEpg(_epgMap, new EpgTypeOfClob(), "typeOfClob");
        setupEpg(_epgMap, new EpgTypeOfDbclob(), "typeOfDbclob");
        setupEpg(_epgMap, new EpgTypeOfDecimalDecimal(), "typeOfDecimalDecimal");
        setupEpg(_epgMap, new EpgTypeOfDecimalInteger(), "typeOfDecimalInteger");
        setupEpg(_epgMap, new EpgTypeOfDecimalBigint(), "typeOfDecimalBigint");
        setupEpg(_epgMap, new EpgTypeOfSmallint(), "typeOfSmallint");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfFloat(), "typeOfFloat");
        setupEpg(_epgMap, new EpgTypeOfDouble(), "typeOfDouble");
        setupEpg(_epgMap, new EpgTypeOfReal(), "typeOfReal");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfTime(), "typeOfTime");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfBlob(), "typeOfBlob");
        setupEpg(_epgMap, new EpgTypeOfGraphic(), "typeOfGraphic");
        setupEpg(_epgMap, new EpgTypeOfVargraphic(), "typeOfVargraphic");
        setupEpg(_epgMap, new EpgTypeOfLongVargraphic(), "typeOfLongVargraphic");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfChar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfChar((String)vl); }
    }
    public static class EpgTypeOfCharForBitData implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfCharForBitData(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfCharForBitData((byte[])vl); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarchar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarchar((String)vl); }
    }
    public static class EpgTypeOfVarcharForBitData implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarcharForBitData(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarcharForBitData((byte[])vl); }
    }
    public static class EpgTypeOfClob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfClob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfClob((String)vl); }
    }
    public static class EpgTypeOfDbclob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDbclob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDbclob((String)vl); }
    }
    public static class EpgTypeOfDecimalDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDecimalDecimal(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDecimalDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfDecimalInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDecimalInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDecimalInteger(cti(vl)); }
    }
    public static class EpgTypeOfDecimalBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDecimalBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDecimalBigint(ctl(vl)); }
    }
    public static class EpgTypeOfSmallint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfSmallint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfSmallint(cti(vl)); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfInteger(cti(vl)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBigint(ctl(vl)); }
    }
    public static class EpgTypeOfFloat implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfFloat(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfFloat(ctb(vl)); }
    }
    public static class EpgTypeOfDouble implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDouble(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDouble(ctb(vl)); }
    }
    public static class EpgTypeOfReal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfReal(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfReal(ctb(vl)); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDate(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDate((java.util.Date)vl); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTime(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTime((java.sql.Time)vl); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTimestamp(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfBlob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBlob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBlob((byte[])vl); }
    }
    public static class EpgTypeOfGraphic implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfGraphic(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfGraphic((String)vl); }
    }
    public static class EpgTypeOfVargraphic implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVargraphic(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVargraphic((String)vl); }
    }
    public static class EpgTypeOfLongVargraphic implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfLongVargraphic(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfLongVargraphic((String)vl); }
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
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, true, "vendorCheckId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, false, "typeOfChar", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfCharForBitData = cci("TYPE_OF_CHAR_FOR_BIT_DATA", "TYPE_OF_CHAR_FOR_BIT_DATA", null, null, false, "typeOfCharForBitData", byte[].class, false, false, "CHAR () FOR BIT DATA", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, false, "typeOfVarchar", String.class, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarcharForBitData = cci("TYPE_OF_VARCHAR_FOR_BIT_DATA", "TYPE_OF_VARCHAR_FOR_BIT_DATA", null, null, false, "typeOfVarcharForBitData", byte[].class, false, false, "VARCHAR () FOR BIT DATA", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfClob = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, false, "typeOfClob", String.class, false, false, "CLOB", 1048576, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDbclob = cci("TYPE_OF_DBCLOB", "TYPE_OF_DBCLOB", null, null, false, "typeOfDbclob", String.class, false, false, "DBCLOB", 2097152, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalDecimal = cci("TYPE_OF_DECIMAL_DECIMAL", "TYPE_OF_DECIMAL_DECIMAL", null, null, false, "typeOfDecimalDecimal", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalInteger = cci("TYPE_OF_DECIMAL_INTEGER", "TYPE_OF_DECIMAL_INTEGER", null, null, false, "typeOfDecimalInteger", Integer.class, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalBigint = cci("TYPE_OF_DECIMAL_BIGINT", "TYPE_OF_DECIMAL_BIGINT", null, null, false, "typeOfDecimalBigint", Long.class, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallint = cci("TYPE_OF_SMALLINT", "TYPE_OF_SMALLINT", null, null, false, "typeOfSmallint", Integer.class, false, false, "SMALLINT", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, false, "typeOfInteger", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, false, "typeOfBigint", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfFloat = cci("TYPE_OF_FLOAT", "TYPE_OF_FLOAT", null, null, false, "typeOfFloat", java.math.BigDecimal.class, false, false, "DOUBLE", 53, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDouble = cci("TYPE_OF_DOUBLE", "TYPE_OF_DOUBLE", null, null, false, "typeOfDouble", java.math.BigDecimal.class, false, false, "DOUBLE", 53, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfReal = cci("TYPE_OF_REAL", "TYPE_OF_REAL", null, null, false, "typeOfReal", java.math.BigDecimal.class, false, false, "REAL", 24, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, false, "typeOfDate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, false, "typeOfTime", java.sql.Time.class, false, false, "TIME", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, false, "typeOfTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, false, "typeOfBlob", byte[].class, false, false, "BLOB", 1048576, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfGraphic = cci("TYPE_OF_GRAPHIC", "TYPE_OF_GRAPHIC", null, null, false, "typeOfGraphic", String.class, false, false, "GRAPHIC", 2, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVargraphic = cci("TYPE_OF_VARGRAPHIC", "TYPE_OF_VARGRAPHIC", null, null, false, "typeOfVargraphic", String.class, false, false, "VARGRAPHIC", 64, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongVargraphic = cci("TYPE_OF_LONG_VARGRAPHIC", "TYPE_OF_LONG_VARGRAPHIC", null, null, false, "typeOfLongVargraphic", String.class, false, false, "LONG VARGRAPHIC", 32700, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    public ColumnInfo columnTypeOfCharForBitData() { return _columnTypeOfCharForBitData; }
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    public ColumnInfo columnTypeOfVarcharForBitData() { return _columnTypeOfVarcharForBitData; }
    public ColumnInfo columnTypeOfClob() { return _columnTypeOfClob; }
    public ColumnInfo columnTypeOfDbclob() { return _columnTypeOfDbclob; }
    public ColumnInfo columnTypeOfDecimalDecimal() { return _columnTypeOfDecimalDecimal; }
    public ColumnInfo columnTypeOfDecimalInteger() { return _columnTypeOfDecimalInteger; }
    public ColumnInfo columnTypeOfDecimalBigint() { return _columnTypeOfDecimalBigint; }
    public ColumnInfo columnTypeOfSmallint() { return _columnTypeOfSmallint; }
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    public ColumnInfo columnTypeOfFloat() { return _columnTypeOfFloat; }
    public ColumnInfo columnTypeOfDouble() { return _columnTypeOfDouble; }
    public ColumnInfo columnTypeOfReal() { return _columnTypeOfReal; }
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    public ColumnInfo columnTypeOfGraphic() { return _columnTypeOfGraphic; }
    public ColumnInfo columnTypeOfVargraphic() { return _columnTypeOfVargraphic; }
    public ColumnInfo columnTypeOfLongVargraphic() { return _columnTypeOfLongVargraphic; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfCharForBitData());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfVarcharForBitData());
        ls.add(columnTypeOfClob());
        ls.add(columnTypeOfDbclob());
        ls.add(columnTypeOfDecimalDecimal());
        ls.add(columnTypeOfDecimalInteger());
        ls.add(columnTypeOfDecimalBigint());
        ls.add(columnTypeOfSmallint());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfFloat());
        ls.add(columnTypeOfDouble());
        ls.add(columnTypeOfReal());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfBlob());
        ls.add(columnTypeOfGraphic());
        ls.add(columnTypeOfVargraphic());
        ls.add(columnTypeOfLongVargraphic());
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
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.VendorCheckBhv"; }

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
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
