/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of vendor_check. (Singleton)
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
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfTinytext(), "typeOfTinytext");
        setupEpg(_epgMap, new EpgTypeOfMediumtext(), "typeOfMediumtext");
        setupEpg(_epgMap, new EpgTypeOfLongtext(), "typeOfLongtext");
        setupEpg(_epgMap, new EpgTypeOfNumericDecimal(), "typeOfNumericDecimal");
        setupEpg(_epgMap, new EpgTypeOfNumericInteger(), "typeOfNumericInteger");
        setupEpg(_epgMap, new EpgTypeOfNumericBigint(), "typeOfNumericBigint");
        setupEpg(_epgMap, new EpgTypeOfDecimalDecimal(), "typeOfDecimalDecimal");
        setupEpg(_epgMap, new EpgTypeOfDecimalInteger(), "typeOfDecimalInteger");
        setupEpg(_epgMap, new EpgTypeOfDecimalBigint(), "typeOfDecimalBigint");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfFloat(), "typeOfFloat");
        setupEpg(_epgMap, new EpgTypeOfDouble(), "typeOfDouble");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfDatetime(), "typeOfDatetime");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfTime(), "typeOfTime");
        setupEpg(_epgMap, new EpgTypeOfYear(), "typeOfYear");
        setupEpg(_epgMap, new EpgTypeOfBoolean(), "typeOfBoolean");
        setupEpg(_epgMap, new EpgTypeOfBlob(), "typeOfBlob");
        setupEpg(_epgMap, new EpgTypeOfTinyblob(), "typeOfTinyblob");
        setupEpg(_epgMap, new EpgTypeOfMediumblob(), "typeOfMediumblob");
        setupEpg(_epgMap, new EpgTypeOfLongblob(), "typeOfLongblob");
        setupEpg(_epgMap, new EpgTypeOfBinary(), "typeOfBinary");
        setupEpg(_epgMap, new EpgTypeOfVarbinary(), "typeOfVarbinary");
        setupEpg(_epgMap, new EpgTypeOfEnum(), "typeOfEnum");
        setupEpg(_epgMap, new EpgTypeOfSet(), "typeOfSet");
    }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfChar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfChar((String)vl); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarchar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarchar((String)vl); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfText(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfText((String)vl); }
    }
    public static class EpgTypeOfTinytext implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTinytext(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTinytext((String)vl); }
    }
    public static class EpgTypeOfMediumtext implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfMediumtext(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfMediumtext((String)vl); }
    }
    public static class EpgTypeOfLongtext implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfLongtext(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfLongtext((String)vl); }
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
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDate(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDate((java.util.Date)vl); }
    }
    public static class EpgTypeOfDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDatetime(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTimestamp(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTime(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTime((java.sql.Time)vl); }
    }
    public static class EpgTypeOfYear implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfYear(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfYear((java.util.Date)vl); }
    }
    public class EpgTypeOfBoolean implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBoolean(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnTypeOfBoolean();
            ccls(col, vl);
            ((VendorCheck)et).setTypeOfBooleanAsBooleanFlg((CDef.BooleanFlg)gcls(col, vl));
        }
    }
    public static class EpgTypeOfBlob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBlob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBlob((byte[])vl); }
    }
    public static class EpgTypeOfTinyblob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTinyblob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTinyblob((byte[])vl); }
    }
    public static class EpgTypeOfMediumblob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfMediumblob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfMediumblob((byte[])vl); }
    }
    public static class EpgTypeOfLongblob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfLongblob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfLongblob((byte[])vl); }
    }
    public static class EpgTypeOfBinary implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBinary(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBinary((byte[])vl); }
    }
    public static class EpgTypeOfVarbinary implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarbinary(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarbinary((byte[])vl); }
    }
    public static class EpgTypeOfEnum implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfEnum(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfEnum((String)vl); }
    }
    public static class EpgTypeOfSet implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfSet(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfSet((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_check";
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
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, String.class, "typeOfVarchar", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, String.class, "typeOfText", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTinytext = cci("TYPE_OF_TINYTEXT", "TYPE_OF_TINYTEXT", null, null, String.class, "typeOfTinytext", null, false, false, false, "TINYTEXT", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMediumtext = cci("TYPE_OF_MEDIUMTEXT", "TYPE_OF_MEDIUMTEXT", null, null, String.class, "typeOfMediumtext", null, false, false, false, "MEDIUMTEXT", 16777215, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongtext = cci("TYPE_OF_LONGTEXT", "TYPE_OF_LONGTEXT", null, null, String.class, "typeOfLongtext", null, false, false, false, "LONGTEXT", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalDecimal = cci("TYPE_OF_DECIMAL_DECIMAL", "TYPE_OF_DECIMAL_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfDecimalDecimal", null, false, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalInteger = cci("TYPE_OF_DECIMAL_INTEGER", "TYPE_OF_DECIMAL_INTEGER", null, null, Integer.class, "typeOfDecimalInteger", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalBigint = cci("TYPE_OF_DECIMAL_BIGINT", "TYPE_OF_DECIMAL_BIGINT", null, null, Long.class, "typeOfDecimalBigint", null, false, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, Integer.class, "typeOfInteger", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, Long.class, "typeOfBigint", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfFloat = cci("TYPE_OF_FLOAT", "TYPE_OF_FLOAT", null, null, java.math.BigDecimal.class, "typeOfFloat", null, false, false, false, "FLOAT", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDouble = cci("TYPE_OF_DOUBLE", "TYPE_OF_DOUBLE", null, null, java.math.BigDecimal.class, "typeOfDouble", null, false, false, false, "DOUBLE", 22, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, java.util.Date.class, "typeOfDate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDatetime = cci("TYPE_OF_DATETIME", "TYPE_OF_DATETIME", null, null, java.sql.Timestamp.class, "typeOfDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, java.sql.Timestamp.class, "typeOfTimestamp", null, false, false, true, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, java.sql.Time.class, "typeOfTime", null, false, false, false, "TIME", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfYear = cci("TYPE_OF_YEAR", "TYPE_OF_YEAR", null, null, java.util.Date.class, "typeOfYear", null, false, false, false, "YEAR", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBoolean = cci("TYPE_OF_BOOLEAN", "TYPE_OF_BOOLEAN", null, null, Boolean.class, "typeOfBoolean", null, false, false, false, "BIT", null, null, null, false, null, null, null, null, CDef.DefMeta.BooleanFlg);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, byte[].class, "typeOfBlob", null, false, false, false, "BLOB", 65535, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTinyblob = cci("TYPE_OF_TINYBLOB", "TYPE_OF_TINYBLOB", null, null, byte[].class, "typeOfTinyblob", null, false, false, false, "TINYBLOB", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMediumblob = cci("TYPE_OF_MEDIUMBLOB", "TYPE_OF_MEDIUMBLOB", null, null, byte[].class, "typeOfMediumblob", null, false, false, false, "MEDIUMBLOB", 16777215, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongblob = cci("TYPE_OF_LONGBLOB", "TYPE_OF_LONGBLOB", null, null, byte[].class, "typeOfLongblob", null, false, false, false, "LONGBLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinary = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, byte[].class, "typeOfBinary", null, false, false, false, "BINARY", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarbinary = cci("TYPE_OF_VARBINARY", "TYPE_OF_VARBINARY", null, null, byte[].class, "typeOfVarbinary", null, false, false, false, "VARBINARY", 1000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfEnum = cci("TYPE_OF_ENUM", "TYPE_OF_ENUM", null, null, String.class, "typeOfEnum", null, false, false, false, "ENUM", 6, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSet = cci("TYPE_OF_SET", "TYPE_OF_SET", null, null, String.class, "typeOfSet", null, false, false, false, "SET", 15, 0, null, false, null, null, null, null, null);

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
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTinytext() { return _columnTypeOfTinytext; }
    /**
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMediumtext() { return _columnTypeOfMediumtext; }
    /**
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfLongtext() { return _columnTypeOfLongtext; }
    /**
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
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
     * TYPE_OF_INTEGER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfFloat() { return _columnTypeOfFloat; }
    /**
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDouble() { return _columnTypeOfDouble; }
    /**
     * TYPE_OF_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDatetime() { return _columnTypeOfDatetime; }
    /**
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * TYPE_OF_TIME: {TIME(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    /**
     * TYPE_OF_YEAR: {YEAR}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfYear() { return _columnTypeOfYear; }
    /**
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBoolean() { return _columnTypeOfBoolean; }
    /**
     * TYPE_OF_BLOB: {BLOB(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    /**
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTinyblob() { return _columnTypeOfTinyblob; }
    /**
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMediumblob() { return _columnTypeOfMediumblob; }
    /**
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfLongblob() { return _columnTypeOfLongblob; }
    /**
     * TYPE_OF_BINARY: {BINARY(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinary() { return _columnTypeOfBinary; }
    /**
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarbinary() { return _columnTypeOfVarbinary; }
    /**
     * TYPE_OF_ENUM: {ENUM(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfEnum() { return _columnTypeOfEnum; }
    /**
     * TYPE_OF_SET: {SET(15)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfSet() { return _columnTypeOfSet; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfTinytext());
        ls.add(columnTypeOfMediumtext());
        ls.add(columnTypeOfLongtext());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfDecimalDecimal());
        ls.add(columnTypeOfDecimalInteger());
        ls.add(columnTypeOfDecimalBigint());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfFloat());
        ls.add(columnTypeOfDouble());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfDatetime());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfYear());
        ls.add(columnTypeOfBoolean());
        ls.add(columnTypeOfBlob());
        ls.add(columnTypeOfTinyblob());
        ls.add(columnTypeOfMediumblob());
        ls.add(columnTypeOfLongblob());
        ls.add(columnTypeOfBinary());
        ls.add(columnTypeOfVarbinary());
        ls.add(columnTypeOfEnum());
        ls.add(columnTypeOfSet());
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.VendorCheckBhv"; }

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
