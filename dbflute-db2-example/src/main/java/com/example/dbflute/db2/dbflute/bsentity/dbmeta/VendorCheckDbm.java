package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Long.class, "vendorCheckId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, String.class, "typeOfChar", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfCharForBitData = cci("TYPE_OF_CHAR_FOR_BIT_DATA", "TYPE_OF_CHAR_FOR_BIT_DATA", null, null, byte[].class, "typeOfCharForBitData", null, false, false, false, "CHAR () FOR BIT DATA", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, String.class, "typeOfVarchar", null, false, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarcharForBitData = cci("TYPE_OF_VARCHAR_FOR_BIT_DATA", "TYPE_OF_VARCHAR_FOR_BIT_DATA", null, null, byte[].class, "typeOfVarcharForBitData", null, false, false, false, "VARCHAR () FOR BIT DATA", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfClob = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, String.class, "typeOfClob", null, false, false, false, "CLOB", 1048576, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDbclob = cci("TYPE_OF_DBCLOB", "TYPE_OF_DBCLOB", null, null, String.class, "typeOfDbclob", null, false, false, false, "DBCLOB", 2097152, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalDecimal = cci("TYPE_OF_DECIMAL_DECIMAL", "TYPE_OF_DECIMAL_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfDecimalDecimal", null, false, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalInteger = cci("TYPE_OF_DECIMAL_INTEGER", "TYPE_OF_DECIMAL_INTEGER", null, null, Integer.class, "typeOfDecimalInteger", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalBigint = cci("TYPE_OF_DECIMAL_BIGINT", "TYPE_OF_DECIMAL_BIGINT", null, null, Long.class, "typeOfDecimalBigint", null, false, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSmallint = cci("TYPE_OF_SMALLINT", "TYPE_OF_SMALLINT", null, null, Integer.class, "typeOfSmallint", null, false, false, false, "SMALLINT", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, Integer.class, "typeOfInteger", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, Long.class, "typeOfBigint", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfFloat = cci("TYPE_OF_FLOAT", "TYPE_OF_FLOAT", null, null, java.math.BigDecimal.class, "typeOfFloat", null, false, false, false, "DOUBLE", 53, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDouble = cci("TYPE_OF_DOUBLE", "TYPE_OF_DOUBLE", null, null, java.math.BigDecimal.class, "typeOfDouble", null, false, false, false, "DOUBLE", 53, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfReal = cci("TYPE_OF_REAL", "TYPE_OF_REAL", null, null, java.math.BigDecimal.class, "typeOfReal", null, false, false, false, "REAL", 24, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, java.util.Date.class, "typeOfDate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, java.sql.Time.class, "typeOfTime", null, false, false, false, "TIME", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, java.sql.Timestamp.class, "typeOfTimestamp", null, false, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, byte[].class, "typeOfBlob", null, false, false, false, "BLOB", 1048576, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfGraphic = cci("TYPE_OF_GRAPHIC", "TYPE_OF_GRAPHIC", null, null, String.class, "typeOfGraphic", null, false, false, false, "GRAPHIC", 2, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVargraphic = cci("TYPE_OF_VARGRAPHIC", "TYPE_OF_VARGRAPHIC", null, null, String.class, "typeOfVargraphic", null, false, false, false, "VARGRAPHIC", 64, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongVargraphic = cci("TYPE_OF_LONG_VARGRAPHIC", "TYPE_OF_LONG_VARGRAPHIC", null, null, String.class, "typeOfLongVargraphic", null, false, false, false, "LONG VARGRAPHIC", 32700, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    /**
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfCharForBitData() { return _columnTypeOfCharForBitData; }
    /**
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarcharForBitData() { return _columnTypeOfVarcharForBitData; }
    /**
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfClob() { return _columnTypeOfClob; }
    /**
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDbclob() { return _columnTypeOfDbclob; }
    /**
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDecimalDecimal() { return _columnTypeOfDecimalDecimal; }
    /**
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDecimalInteger() { return _columnTypeOfDecimalInteger; }
    /**
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDecimalBigint() { return _columnTypeOfDecimalBigint; }
    /**
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSmallint() { return _columnTypeOfSmallint; }
    /**
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfFloat() { return _columnTypeOfFloat; }
    /**
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDouble() { return _columnTypeOfDouble; }
    /**
     * TYPE_OF_REAL: {REAL(24)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfReal() { return _columnTypeOfReal; }
    /**
     * TYPE_OF_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * TYPE_OF_TIME: {TIME(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    /**
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * TYPE_OF_BLOB: {BLOB(1048576)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    /**
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfGraphic() { return _columnTypeOfGraphic; }
    /**
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVargraphic() { return _columnTypeOfVargraphic; }
    /**
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @return The information object of specified column. (NotNull)
     */
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
