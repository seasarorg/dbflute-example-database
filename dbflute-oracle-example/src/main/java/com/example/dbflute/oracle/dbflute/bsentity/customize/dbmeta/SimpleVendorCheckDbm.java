package com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The DB meta of SimpleVendorCheck. (Singleton)
 * @author oracleman
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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgTypeOfChar(), "typeOfChar");
        setupEpg(_epgMap, new EpgTypeOfNchar(), "typeOfNchar");
        setupEpg(_epgMap, new EpgTypeOfVarchar2(), "typeOfVarchar2");
        setupEpg(_epgMap, new EpgTypeOfVarchar2Max(), "typeOfVarchar2Max");
        setupEpg(_epgMap, new EpgTypeOfNvarchar2(), "typeOfNvarchar2");
        setupEpg(_epgMap, new EpgTypeOfClob(), "typeOfClob");
        setupEpg(_epgMap, new EpgTypeOfNclob(), "typeOfNclob");
        setupEpg(_epgMap, new EpgTypeOfLong(), "typeOfLong");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfNumberInteger(), "typeOfNumberInteger");
        setupEpg(_epgMap, new EpgTypeOfNumberBigint(), "typeOfNumberBigint");
        setupEpg(_epgMap, new EpgTypeOfNumberDecimal(), "typeOfNumberDecimal");
        setupEpg(_epgMap, new EpgTypeOfNumberIntegerMin(), "typeOfNumberIntegerMin");
        setupEpg(_epgMap, new EpgTypeOfNumberIntegerMax(), "typeOfNumberIntegerMax");
        setupEpg(_epgMap, new EpgTypeOfNumberBigintMin(), "typeOfNumberBigintMin");
        setupEpg(_epgMap, new EpgTypeOfNumberBigintMax(), "typeOfNumberBigintMax");
        setupEpg(_epgMap, new EpgTypeOfNumberSuperintMin(), "typeOfNumberSuperintMin");
        setupEpg(_epgMap, new EpgTypeOfNumberSuperintMax(), "typeOfNumberSuperintMax");
        setupEpg(_epgMap, new EpgTypeOfNumberMaxdecimal(), "typeOfNumberMaxdecimal");
        setupEpg(_epgMap, new EpgTypeOfBinaryFloat(), "typeOfBinaryFloat");
        setupEpg(_epgMap, new EpgTypeOfBinaryDouble(), "typeOfBinaryDouble");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfIntervalYearToMonth(), "typeOfIntervalYearToMonth");
        setupEpg(_epgMap, new EpgTypeOfIntervalDayToSecond(), "typeOfIntervalDayToSecond");
        setupEpg(_epgMap, new EpgTypeOfBlob(), "typeOfBlob");
        setupEpg(_epgMap, new EpgTypeOfRaw(), "typeOfRaw");
        setupEpg(_epgMap, new EpgTypeOfBfile(), "typeOfBfile");
        setupEpg(_epgMap, new EpgTypeOfRowid(), "typeOfRowid");
    }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfChar(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfChar((String)vl); }
    }
    public static class EpgTypeOfNchar implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNchar(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNchar((String)vl); }
    }
    public static class EpgTypeOfVarchar2 implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfVarchar2(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfVarchar2((String)vl); }
    }
    public static class EpgTypeOfVarchar2Max implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfVarchar2Max(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfVarchar2Max((String)vl); }
    }
    public static class EpgTypeOfNvarchar2 implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNvarchar2(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNvarchar2((String)vl); }
    }
    public static class EpgTypeOfClob implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfClob(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfClob((String)vl); }
    }
    public static class EpgTypeOfNclob implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNclob(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNclob((String)vl); }
    }
    public static class EpgTypeOfLong implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfLong(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfLong((String)vl); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfInteger(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfInteger(ctb(vl)); }
    }
    public static class EpgTypeOfNumberInteger implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberInteger(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberInteger(cti(vl)); }
    }
    public static class EpgTypeOfNumberBigint implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberBigint(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberBigint(ctl(vl)); }
    }
    public static class EpgTypeOfNumberDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberDecimal(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfNumberIntegerMin implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberIntegerMin(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberIntegerMin(cti(vl)); }
    }
    public static class EpgTypeOfNumberIntegerMax implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberIntegerMax(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberIntegerMax(cti(vl)); }
    }
    public static class EpgTypeOfNumberBigintMin implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberBigintMin(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberBigintMin(ctl(vl)); }
    }
    public static class EpgTypeOfNumberBigintMax implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberBigintMax(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberBigintMax(ctl(vl)); }
    }
    public static class EpgTypeOfNumberSuperintMin implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberSuperintMin(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberSuperintMin(ctb(vl)); }
    }
    public static class EpgTypeOfNumberSuperintMax implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberSuperintMax(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberSuperintMax(ctb(vl)); }
    }
    public static class EpgTypeOfNumberMaxdecimal implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfNumberMaxdecimal(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfNumberMaxdecimal(ctb(vl)); }
    }
    public static class EpgTypeOfBinaryFloat implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfBinaryFloat(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfBinaryFloat((String)vl); }
    }
    public static class EpgTypeOfBinaryDouble implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfBinaryDouble(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfBinaryDouble((String)vl); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfDate(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfDate((java.util.Date)vl); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfTimestamp(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfIntervalYearToMonth implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfIntervalYearToMonth(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfIntervalYearToMonth((String)vl); }
    }
    public static class EpgTypeOfIntervalDayToSecond implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfIntervalDayToSecond(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfIntervalDayToSecond((String)vl); }
    }
    public static class EpgTypeOfBlob implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfBlob(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfBlob((byte[])vl); }
    }
    public static class EpgTypeOfRaw implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfRaw(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfRaw((byte[])vl); }
    }
    public static class EpgTypeOfBfile implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfBfile(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfBfile((String)vl); }
    }
    public static class EpgTypeOfRowid implements PropertyGateway {
        public Object read(Entity et) { return ((SimpleVendorCheck)et).getTypeOfRowid(); }
        public void write(Entity et, Object vl) { ((SimpleVendorCheck)et).setTypeOfRowid((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Long.class, "vendorCheckId", null, false, false, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, String.class, "typeOfChar", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNchar = cci("TYPE_OF_NCHAR", "TYPE_OF_NCHAR", null, null, String.class, "typeOfNchar", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar2 = cci("TYPE_OF_VARCHAR2", "TYPE_OF_VARCHAR2", null, null, String.class, "typeOfVarchar2", null, false, false, false, "VARCHAR2", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar2Max = cci("TYPE_OF_VARCHAR2_MAX", "TYPE_OF_VARCHAR2_MAX", null, null, String.class, "typeOfVarchar2Max", null, false, false, false, "VARCHAR2", 4000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNvarchar2 = cci("TYPE_OF_NVARCHAR2", "TYPE_OF_NVARCHAR2", null, null, String.class, "typeOfNvarchar2", null, false, false, false, "VARCHAR2", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfClob = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, String.class, "typeOfClob", null, false, false, false, "CLOB", 4000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNclob = cci("TYPE_OF_NCLOB", "TYPE_OF_NCLOB", null, null, String.class, "typeOfNclob", null, false, false, false, "CLOB", 4000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLong = cci("TYPE_OF_LONG", "TYPE_OF_LONG", null, null, String.class, "typeOfLong", null, false, false, false, "LONG", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, java.math.BigDecimal.class, "typeOfInteger", null, false, false, false, "NUMBER", 38, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberInteger = cci("TYPE_OF_NUMBER_INTEGER", "TYPE_OF_NUMBER_INTEGER", null, null, Integer.class, "typeOfNumberInteger", null, false, false, false, "NUMBER", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberBigint = cci("TYPE_OF_NUMBER_BIGINT", "TYPE_OF_NUMBER_BIGINT", null, null, Long.class, "typeOfNumberBigint", null, false, false, false, "NUMBER", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberDecimal = cci("TYPE_OF_NUMBER_DECIMAL", "TYPE_OF_NUMBER_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumberDecimal", null, false, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberIntegerMin = cci("TYPE_OF_NUMBER_INTEGER_MIN", "TYPE_OF_NUMBER_INTEGER_MIN", null, null, Integer.class, "typeOfNumberIntegerMin", null, false, false, false, "NUMBER", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberIntegerMax = cci("TYPE_OF_NUMBER_INTEGER_MAX", "TYPE_OF_NUMBER_INTEGER_MAX", null, null, Integer.class, "typeOfNumberIntegerMax", null, false, false, false, "NUMBER", 9, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberBigintMin = cci("TYPE_OF_NUMBER_BIGINT_MIN", "TYPE_OF_NUMBER_BIGINT_MIN", null, null, Long.class, "typeOfNumberBigintMin", null, false, false, false, "NUMBER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberBigintMax = cci("TYPE_OF_NUMBER_BIGINT_MAX", "TYPE_OF_NUMBER_BIGINT_MAX", null, null, Long.class, "typeOfNumberBigintMax", null, false, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberSuperintMin = cci("TYPE_OF_NUMBER_SUPERINT_MIN", "TYPE_OF_NUMBER_SUPERINT_MIN", null, null, java.math.BigDecimal.class, "typeOfNumberSuperintMin", null, false, false, false, "NUMBER", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberSuperintMax = cci("TYPE_OF_NUMBER_SUPERINT_MAX", "TYPE_OF_NUMBER_SUPERINT_MAX", null, null, java.math.BigDecimal.class, "typeOfNumberSuperintMax", null, false, false, false, "NUMBER", 38, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumberMaxdecimal = cci("TYPE_OF_NUMBER_MAXDECIMAL", "TYPE_OF_NUMBER_MAXDECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumberMaxdecimal", null, false, false, false, "NUMBER", 38, 127, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinaryFloat = cci("TYPE_OF_BINARY_FLOAT", "TYPE_OF_BINARY_FLOAT", null, null, String.class, "typeOfBinaryFloat", null, false, false, false, "BINARY_FLOAT", 4, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinaryDouble = cci("TYPE_OF_BINARY_DOUBLE", "TYPE_OF_BINARY_DOUBLE", null, null, String.class, "typeOfBinaryDouble", null, false, false, false, "BINARY_DOUBLE", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, java.util.Date.class, "typeOfDate", null, false, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, java.sql.Timestamp.class, "typeOfTimestamp", null, false, false, false, "TIMESTAMP", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfIntervalYearToMonth = cci("TYPE_OF_INTERVAL_YEAR_TO_MONTH", "TYPE_OF_INTERVAL_YEAR_TO_MONTH", null, null, String.class, "typeOfIntervalYearToMonth", null, false, false, false, "INTERVALYM", 2, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfIntervalDayToSecond = cci("TYPE_OF_INTERVAL_DAY_TO_SECOND", "TYPE_OF_INTERVAL_DAY_TO_SECOND", null, null, String.class, "typeOfIntervalDayToSecond", null, false, false, false, "INTERVALDS", 2, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, byte[].class, "typeOfBlob", null, false, false, false, "BLOB", 4000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfRaw = cci("TYPE_OF_RAW", "TYPE_OF_RAW", null, null, byte[].class, "typeOfRaw", null, false, false, false, "RAW", 512, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBfile = cci("TYPE_OF_BFILE", "TYPE_OF_BFILE", null, null, String.class, "typeOfBfile", null, false, false, false, "BFILE", 530, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfRowid = cci("TYPE_OF_ROWID", "TYPE_OF_ROWID", null, null, String.class, "typeOfRowid", null, false, false, false, "ROWID", 1, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_CHECK_ID: {NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    /**
     * TYPE_OF_NCHAR: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNchar() { return _columnTypeOfNchar; }
    /**
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar2() { return _columnTypeOfVarchar2; }
    /**
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar2Max() { return _columnTypeOfVarchar2Max; }
    /**
     * TYPE_OF_NVARCHAR2: {VARCHAR2(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNvarchar2() { return _columnTypeOfNvarchar2; }
    /**
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfClob() { return _columnTypeOfClob; }
    /**
     * TYPE_OF_NCLOB: {CLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNclob() { return _columnTypeOfNclob; }
    /**
     * TYPE_OF_LONG: {LONG(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfLong() { return _columnTypeOfLong; }
    /**
     * TYPE_OF_INTEGER: {NUMBER(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberInteger() { return _columnTypeOfNumberInteger; }
    /**
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberBigint() { return _columnTypeOfNumberBigint; }
    /**
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberDecimal() { return _columnTypeOfNumberDecimal; }
    /**
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberIntegerMin() { return _columnTypeOfNumberIntegerMin; }
    /**
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberIntegerMax() { return _columnTypeOfNumberIntegerMax; }
    /**
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberBigintMin() { return _columnTypeOfNumberBigintMin; }
    /**
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberBigintMax() { return _columnTypeOfNumberBigintMax; }
    /**
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberSuperintMin() { return _columnTypeOfNumberSuperintMin; }
    /**
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberSuperintMax() { return _columnTypeOfNumberSuperintMax; }
    /**
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberMaxdecimal() { return _columnTypeOfNumberMaxdecimal; }
    /**
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinaryFloat() { return _columnTypeOfBinaryFloat; }
    /**
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinaryDouble() { return _columnTypeOfBinaryDouble; }
    /**
     * TYPE_OF_DATE: {DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(11, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVALYM(2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntervalYearToMonth() { return _columnTypeOfIntervalYearToMonth; }
    /**
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVALDS(2, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntervalDayToSecond() { return _columnTypeOfIntervalDayToSecond; }
    /**
     * TYPE_OF_BLOB: {BLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    /**
     * TYPE_OF_RAW: {RAW(512)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfRaw() { return _columnTypeOfRaw; }
    /**
     * TYPE_OF_BFILE: {BFILE(530)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBfile() { return _columnTypeOfBfile; }
    /**
     * TYPE_OF_ROWID: {ROWID(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfRowid() { return _columnTypeOfRowid; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfNchar());
        ls.add(columnTypeOfVarchar2());
        ls.add(columnTypeOfVarchar2Max());
        ls.add(columnTypeOfNvarchar2());
        ls.add(columnTypeOfClob());
        ls.add(columnTypeOfNclob());
        ls.add(columnTypeOfLong());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfNumberInteger());
        ls.add(columnTypeOfNumberBigint());
        ls.add(columnTypeOfNumberDecimal());
        ls.add(columnTypeOfNumberIntegerMin());
        ls.add(columnTypeOfNumberIntegerMax());
        ls.add(columnTypeOfNumberBigintMin());
        ls.add(columnTypeOfNumberBigintMax());
        ls.add(columnTypeOfNumberSuperintMin());
        ls.add(columnTypeOfNumberSuperintMax());
        ls.add(columnTypeOfNumberMaxdecimal());
        ls.add(columnTypeOfBinaryFloat());
        ls.add(columnTypeOfBinaryDouble());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfIntervalYearToMonth());
        ls.add(columnTypeOfIntervalDayToSecond());
        ls.add(columnTypeOfBlob());
        ls.add(columnTypeOfRaw());
        ls.add(columnTypeOfBfile());
        ls.add(columnTypeOfRowid());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.SimpleVendorCheck"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SimpleVendorCheck> getEntityType() { return SimpleVendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SimpleVendorCheck newEntity() { return new SimpleVendorCheck(); }
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
