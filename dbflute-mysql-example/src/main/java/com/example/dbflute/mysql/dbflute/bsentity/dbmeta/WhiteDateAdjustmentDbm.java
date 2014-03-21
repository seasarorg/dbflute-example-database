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
 * The DB meta of white_date_adjustment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDateAdjustmentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDateAdjustmentDbm _instance = new WhiteDateAdjustmentDbm();
    private WhiteDateAdjustmentDbm() {}
    public static WhiteDateAdjustmentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgDateAdjustmentId(), "dateAdjustmentId");
        setupEpg(_epgMap, new EpgAdjustedDate(), "adjustedDate");
        setupEpg(_epgMap, new EpgAdjustedDatetime(), "adjustedDatetime");
        setupEpg(_epgMap, new EpgAdjustedTime(), "adjustedTime");
        setupEpg(_epgMap, new EpgAdjustedInteger(), "adjustedInteger");
        setupEpg(_epgMap, new EpgAdjustedNamedStringLong(), "adjustedNamedStringLong");
        setupEpg(_epgMap, new EpgAdjustedNamedTypedLong(), "adjustedNamedTypedLong");
        setupEpg(_epgMap, new EpgAdjustedPinpointStringLong(), "adjustedPinpointStringLong");
        setupEpg(_epgMap, new EpgAdjustedPinpointTypedLong(), "adjustedPinpointTypedLong");
        setupEpg(_epgMap, new EpgAdjustedPlainLong(), "adjustedPlainLong");
        setupEpg(_epgMap, new EpgAdjustedString(), "adjustedString");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgDateAdjustmentId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getDateAdjustmentId(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setDateAdjustmentId(ctl(vl)); }
    }
    public static class EpgAdjustedDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedDate(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedDate((java.util.Date)vl); }
    }
    public static class EpgAdjustedDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedDatetime(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgAdjustedTime implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedTime(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedTime((java.sql.Time)vl); }
    }
    public static class EpgAdjustedInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedInteger(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedInteger(cti(vl)); }
    }
    public static class EpgAdjustedNamedStringLong implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedNamedStringLong(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedNamedStringLong(ctl(vl)); }
    }
    public static class EpgAdjustedNamedTypedLong implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedNamedTypedLong(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedNamedTypedLong(ctl(vl)); }
    }
    public static class EpgAdjustedPinpointStringLong implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedPinpointStringLong(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedPinpointStringLong(ctl(vl)); }
    }
    public static class EpgAdjustedPinpointTypedLong implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedPinpointTypedLong(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedPinpointTypedLong(ctl(vl)); }
    }
    public static class EpgAdjustedPlainLong implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedPlainLong(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedPlainLong(ctl(vl)); }
    }
    public static class EpgAdjustedString implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateAdjustment)et).getAdjustedString(); }
        public void write(Entity et, Object vl) { ((WhiteDateAdjustment)et).setAdjustedString((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_date_adjustment";
    protected final String _tablePropertyName = "whiteDateAdjustment";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DATE_ADJUSTMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDateAdjustmentId = cci("DATE_ADJUSTMENT_ID", "DATE_ADJUSTMENT_ID", null, null, true, "dateAdjustmentId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedDate = cci("ADJUSTED_DATE", "ADJUSTED_DATE", null, "adjusted", false, "adjustedDate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedDatetime = cci("ADJUSTED_DATETIME", "ADJUSTED_DATETIME", null, null, false, "adjustedDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedTime = cci("ADJUSTED_TIME", "ADJUSTED_TIME", null, null, false, "adjustedTime", java.sql.Time.class, false, false, "TIME", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedInteger = cci("ADJUSTED_INTEGER", "ADJUSTED_INTEGER", null, null, false, "adjustedInteger", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedNamedStringLong = cci("ADJUSTED_NAMED_STRING_LONG", "ADJUSTED_NAMED_STRING_LONG", null, "adjusted", false, "adjustedNamedStringLong", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedNamedTypedLong = cci("ADJUSTED_NAMED_TYPED_LONG", "ADJUSTED_NAMED_TYPED_LONG", null, "adjusted", false, "adjustedNamedTypedLong", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedPinpointStringLong = cci("ADJUSTED_PINPOINT_STRING_LONG", "ADJUSTED_PINPOINT_STRING_LONG", null, "adjusted", false, "adjustedPinpointStringLong", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedPinpointTypedLong = cci("ADJUSTED_PINPOINT_TYPED_LONG", "ADJUSTED_PINPOINT_TYPED_LONG", null, "adjusted", false, "adjustedPinpointTypedLong", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedPlainLong = cci("ADJUSTED_PLAIN_LONG", "ADJUSTED_PLAIN_LONG", null, null, false, "adjustedPlainLong", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdjustedString = cci("ADJUSTED_STRING", "ADJUSTED_STRING", null, null, false, "adjustedString", String.class, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnDateAdjustmentId() { return _columnDateAdjustmentId; }
    public ColumnInfo columnAdjustedDate() { return _columnAdjustedDate; }
    public ColumnInfo columnAdjustedDatetime() { return _columnAdjustedDatetime; }
    public ColumnInfo columnAdjustedTime() { return _columnAdjustedTime; }
    public ColumnInfo columnAdjustedInteger() { return _columnAdjustedInteger; }
    public ColumnInfo columnAdjustedNamedStringLong() { return _columnAdjustedNamedStringLong; }
    public ColumnInfo columnAdjustedNamedTypedLong() { return _columnAdjustedNamedTypedLong; }
    public ColumnInfo columnAdjustedPinpointStringLong() { return _columnAdjustedPinpointStringLong; }
    public ColumnInfo columnAdjustedPinpointTypedLong() { return _columnAdjustedPinpointTypedLong; }
    public ColumnInfo columnAdjustedPlainLong() { return _columnAdjustedPlainLong; }
    public ColumnInfo columnAdjustedString() { return _columnAdjustedString; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDateAdjustmentId());
        ls.add(columnAdjustedDate());
        ls.add(columnAdjustedDatetime());
        ls.add(columnAdjustedTime());
        ls.add(columnAdjustedInteger());
        ls.add(columnAdjustedNamedStringLong());
        ls.add(columnAdjustedNamedTypedLong());
        ls.add(columnAdjustedPinpointStringLong());
        ls.add(columnAdjustedPinpointTypedLong());
        ls.add(columnAdjustedPlainLong());
        ls.add(columnAdjustedString());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDateAdjustmentId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteDateAdjustment"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteDateAdjustmentCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteDateAdjustmentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDateAdjustment> getEntityType() { return WhiteDateAdjustment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteDateAdjustment newMyEntity() { return new WhiteDateAdjustment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDateAdjustment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDateAdjustment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
