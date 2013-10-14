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
        public Object read(Entity e) { return ((VendorCheck)e).getVendorCheckId(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setVendorCheckId(ctl(v)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfChar(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfChar((String)v); }
    }
    public static class EpgTypeOfCharForBitData implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfCharForBitData(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfCharForBitData((byte[])v); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVarchar(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVarchar((String)v); }
    }
    public static class EpgTypeOfVarcharForBitData implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVarcharForBitData(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVarcharForBitData((byte[])v); }
    }
    public static class EpgTypeOfClob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfClob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfClob((String)v); }
    }
    public static class EpgTypeOfDbclob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDbclob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDbclob((String)v); }
    }
    public static class EpgTypeOfDecimalDecimal implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDecimalDecimal(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDecimalDecimal(ctb(v)); }
    }
    public static class EpgTypeOfDecimalInteger implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDecimalInteger(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDecimalInteger(cti(v)); }
    }
    public static class EpgTypeOfDecimalBigint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDecimalBigint(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDecimalBigint(ctl(v)); }
    }
    public static class EpgTypeOfSmallint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfSmallint(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfSmallint(cti(v)); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfInteger(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfInteger(cti(v)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBigint(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBigint(ctl(v)); }
    }
    public static class EpgTypeOfFloat implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfFloat(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfFloat(ctb(v)); }
    }
    public static class EpgTypeOfDouble implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDouble(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDouble(ctb(v)); }
    }
    public static class EpgTypeOfReal implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfReal(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfReal(ctb(v)); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDate(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDate((java.util.Date)v); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfTime(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfTime((java.sql.Time)v); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfTimestamp(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgTypeOfBlob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBlob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBlob((byte[])v); }
    }
    public static class EpgTypeOfGraphic implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfGraphic(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfGraphic((String)v); }
    }
    public static class EpgTypeOfVargraphic implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVargraphic(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVargraphic((String)v); }
    }
    public static class EpgTypeOfLongVargraphic implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfLongVargraphic(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfLongVargraphic((String)v); }
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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
