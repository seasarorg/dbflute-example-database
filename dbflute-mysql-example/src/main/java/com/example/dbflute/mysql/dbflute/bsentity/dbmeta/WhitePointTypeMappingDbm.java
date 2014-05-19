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
 * The DB meta of white_point_type_mapping. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePointTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePointTypeMappingDbm _instance = new WhitePointTypeMappingDbm();
    private WhitePointTypeMappingDbm() {}
    public static WhitePointTypeMappingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPointTypeMappingId(), "pointTypeMappingId");
        setupEpg(_epgMap, new EpgPointTypeMappingMemberName(), "pointTypeMappingMemberName");
        setupEpg(_epgMap, new EpgPointTypeMappingPriceCount(), "pointTypeMappingPriceCount");
        setupEpg(_epgMap, new EpgPointTypeMappingSaleDate(), "pointTypeMappingSaleDate");
        setupEpg(_epgMap, new EpgPointTypeMappingWantedDatetime(), "pointTypeMappingWantedDatetime");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPointTypeMappingId implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePointTypeMapping)et).getPointTypeMappingId(); }
        public void write(Entity et, Object vl) { ((WhitePointTypeMapping)et).setPointTypeMappingId(ctl(vl)); }
    }
    public static class EpgPointTypeMappingMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePointTypeMapping)et).getPointTypeMappingMemberName(); }
        public void write(Entity et, Object vl) { ((WhitePointTypeMapping)et).setPointTypeMappingMemberName((com.example.dbflute.mysql.mytype.MyMemberName)vl); }
    }
    public static class EpgPointTypeMappingPriceCount implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePointTypeMapping)et).getPointTypeMappingPriceCount(); }
        public void write(Entity et, Object vl) { ((WhitePointTypeMapping)et).setPointTypeMappingPriceCount((com.example.dbflute.mysql.mytype.MyPriceCount)vl); }
    }
    public static class EpgPointTypeMappingSaleDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePointTypeMapping)et).getPointTypeMappingSaleDate(); }
        public void write(Entity et, Object vl) { ((WhitePointTypeMapping)et).setPointTypeMappingSaleDate((com.example.dbflute.mysql.mytype.MySaleDate)vl); }
    }
    public static class EpgPointTypeMappingWantedDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePointTypeMapping)et).getPointTypeMappingWantedDatetime(); }
        public void write(Entity et, Object vl) { ((WhitePointTypeMapping)et).setPointTypeMappingWantedDatetime((java.util.Date)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_point_type_mapping";
    protected final String _tablePropertyName = "whitePointTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_POINT_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPointTypeMappingId = cci("POINT_TYPE_MAPPING_ID", "POINT_TYPE_MAPPING_ID", null, null, true, "pointTypeMappingId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPointTypeMappingMemberName = cci("POINT_TYPE_MAPPING_MEMBER_NAME", "POINT_TYPE_MAPPING_MEMBER_NAME", null, null, false, "pointTypeMappingMemberName", com.example.dbflute.mysql.mytype.MyMemberName.class, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPointTypeMappingPriceCount = cci("POINT_TYPE_MAPPING_PRICE_COUNT", "POINT_TYPE_MAPPING_PRICE_COUNT", null, null, false, "pointTypeMappingPriceCount", com.example.dbflute.mysql.mytype.MyPriceCount.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPointTypeMappingSaleDate = cci("POINT_TYPE_MAPPING_SALE_DATE", "POINT_TYPE_MAPPING_SALE_DATE", null, null, false, "pointTypeMappingSaleDate", com.example.dbflute.mysql.mytype.MySaleDate.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPointTypeMappingWantedDatetime = cci("POINT_TYPE_MAPPING_WANTED_DATETIME", "POINT_TYPE_MAPPING_WANTED_DATETIME", null, null, false, "pointTypeMappingWantedDatetime", java.util.Date.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    /**
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingId() { return _columnPointTypeMappingId; }
    /**
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingMemberName() { return _columnPointTypeMappingMemberName; }
    /**
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingPriceCount() { return _columnPointTypeMappingPriceCount; }
    /**
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingSaleDate() { return _columnPointTypeMappingSaleDate; }
    /**
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingWantedDatetime() { return _columnPointTypeMappingWantedDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPointTypeMappingId());
        ls.add(columnPointTypeMappingMemberName());
        ls.add(columnPointTypeMappingPriceCount());
        ls.add(columnPointTypeMappingSaleDate());
        ls.add(columnPointTypeMappingWantedDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPointTypeMappingId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhitePointTypeMapping"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhitePointTypeMappingCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhitePointTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePointTypeMapping> getEntityType() { return WhitePointTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhitePointTypeMapping newMyEntity() { return new WhitePointTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePointTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePointTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
