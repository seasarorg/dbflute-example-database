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
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVarchar(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVarchar((String)v); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfText(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfText((String)v); }
    }
    public static class EpgTypeOfTinytext implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfTinytext(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfTinytext((String)v); }
    }
    public static class EpgTypeOfMediumtext implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfMediumtext(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfMediumtext((String)v); }
    }
    public static class EpgTypeOfLongtext implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfLongtext(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfLongtext((String)v); }
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
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDate(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDate((java.util.Date)v); }
    }
    public static class EpgTypeOfDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfDatetime(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfTimestamp(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfTime(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfTime((java.sql.Time)v); }
    }
    public static class EpgTypeOfYear implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfYear(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfYear((java.util.Date)v); }
    }
    public class EpgTypeOfBoolean implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBoolean(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnTypeOfBoolean();
            ccls(col, v);
            ((VendorCheck)e).setTypeOfBooleanAsBooleanFlg((CDef.BooleanFlg)gcls(col, v));
        }
    }
    public static class EpgTypeOfBlob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBlob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBlob((byte[])v); }
    }
    public static class EpgTypeOfTinyblob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfTinyblob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfTinyblob((byte[])v); }
    }
    public static class EpgTypeOfMediumblob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfMediumblob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfMediumblob((byte[])v); }
    }
    public static class EpgTypeOfLongblob implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfLongblob(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfLongblob((byte[])v); }
    }
    public static class EpgTypeOfBinary implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBinary(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBinary((byte[])v); }
    }
    public static class EpgTypeOfVarbinary implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfVarbinary(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfVarbinary((byte[])v); }
    }
    public static class EpgTypeOfEnum implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfEnum(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfEnum((String)v); }
    }
    public static class EpgTypeOfSet implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfSet(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfSet((String)v); }
    }

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
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, true, "vendorCheckId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, false, "typeOfChar", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, false, "typeOfVarchar", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, false, "typeOfText", String.class, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTinytext = cci("TYPE_OF_TINYTEXT", "TYPE_OF_TINYTEXT", null, null, false, "typeOfTinytext", String.class, false, false, "TINYTEXT", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMediumtext = cci("TYPE_OF_MEDIUMTEXT", "TYPE_OF_MEDIUMTEXT", null, null, false, "typeOfMediumtext", String.class, false, false, "MEDIUMTEXT", 16777215, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongtext = cci("TYPE_OF_LONGTEXT", "TYPE_OF_LONGTEXT", null, null, false, "typeOfLongtext", String.class, false, false, "LONGTEXT", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, false, "typeOfNumericDecimal", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, false, "typeOfNumericInteger", Integer.class, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, false, "typeOfNumericBigint", Long.class, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalDecimal = cci("TYPE_OF_DECIMAL_DECIMAL", "TYPE_OF_DECIMAL_DECIMAL", null, null, false, "typeOfDecimalDecimal", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalInteger = cci("TYPE_OF_DECIMAL_INTEGER", "TYPE_OF_DECIMAL_INTEGER", null, null, false, "typeOfDecimalInteger", Integer.class, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalBigint = cci("TYPE_OF_DECIMAL_BIGINT", "TYPE_OF_DECIMAL_BIGINT", null, null, false, "typeOfDecimalBigint", Long.class, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, false, "typeOfInteger", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, false, "typeOfBigint", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfFloat = cci("TYPE_OF_FLOAT", "TYPE_OF_FLOAT", null, null, false, "typeOfFloat", java.math.BigDecimal.class, false, false, "FLOAT", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDouble = cci("TYPE_OF_DOUBLE", "TYPE_OF_DOUBLE", null, null, false, "typeOfDouble", java.math.BigDecimal.class, false, false, "DOUBLE", 22, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, false, "typeOfDate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDatetime = cci("TYPE_OF_DATETIME", "TYPE_OF_DATETIME", null, null, false, "typeOfDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, true, "typeOfTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, false, "typeOfTime", java.sql.Time.class, false, false, "TIME", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfYear = cci("TYPE_OF_YEAR", "TYPE_OF_YEAR", null, null, false, "typeOfYear", java.util.Date.class, false, false, "YEAR", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBoolean = cci("TYPE_OF_BOOLEAN", "TYPE_OF_BOOLEAN", null, null, false, "typeOfBoolean", Boolean.class, false, false, "BIT", null, null, null, false, null, null, null, null, CDef.DefMeta.BooleanFlg);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, false, "typeOfBlob", byte[].class, false, false, "BLOB", 65535, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTinyblob = cci("TYPE_OF_TINYBLOB", "TYPE_OF_TINYBLOB", null, null, false, "typeOfTinyblob", byte[].class, false, false, "TINYBLOB", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfMediumblob = cci("TYPE_OF_MEDIUMBLOB", "TYPE_OF_MEDIUMBLOB", null, null, false, "typeOfMediumblob", byte[].class, false, false, "MEDIUMBLOB", 16777215, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongblob = cci("TYPE_OF_LONGBLOB", "TYPE_OF_LONGBLOB", null, null, false, "typeOfLongblob", byte[].class, false, false, "LONGBLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinary = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, false, "typeOfBinary", byte[].class, false, false, "BINARY", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarbinary = cci("TYPE_OF_VARBINARY", "TYPE_OF_VARBINARY", null, null, false, "typeOfVarbinary", byte[].class, false, false, "VARBINARY", 1000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfEnum = cci("TYPE_OF_ENUM", "TYPE_OF_ENUM", null, null, false, "typeOfEnum", String.class, false, false, "ENUM", 6, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfSet = cci("TYPE_OF_SET", "TYPE_OF_SET", null, null, false, "typeOfSet", String.class, false, false, "SET", 15, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    public ColumnInfo columnTypeOfTinytext() { return _columnTypeOfTinytext; }
    public ColumnInfo columnTypeOfMediumtext() { return _columnTypeOfMediumtext; }
    public ColumnInfo columnTypeOfLongtext() { return _columnTypeOfLongtext; }
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    public ColumnInfo columnTypeOfDecimalDecimal() { return _columnTypeOfDecimalDecimal; }
    public ColumnInfo columnTypeOfDecimalInteger() { return _columnTypeOfDecimalInteger; }
    public ColumnInfo columnTypeOfDecimalBigint() { return _columnTypeOfDecimalBigint; }
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    public ColumnInfo columnTypeOfFloat() { return _columnTypeOfFloat; }
    public ColumnInfo columnTypeOfDouble() { return _columnTypeOfDouble; }
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    public ColumnInfo columnTypeOfDatetime() { return _columnTypeOfDatetime; }
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    public ColumnInfo columnTypeOfYear() { return _columnTypeOfYear; }
    public ColumnInfo columnTypeOfBoolean() { return _columnTypeOfBoolean; }
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    public ColumnInfo columnTypeOfTinyblob() { return _columnTypeOfTinyblob; }
    public ColumnInfo columnTypeOfMediumblob() { return _columnTypeOfMediumblob; }
    public ColumnInfo columnTypeOfLongblob() { return _columnTypeOfLongblob; }
    public ColumnInfo columnTypeOfBinary() { return _columnTypeOfBinary; }
    public ColumnInfo columnTypeOfVarbinary() { return _columnTypeOfVarbinary; }
    public ColumnInfo columnTypeOfEnum() { return _columnTypeOfEnum; }
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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
