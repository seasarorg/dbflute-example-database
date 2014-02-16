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
 * The DB meta of vendor_large_data_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorLargeDataRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeDataRefDbm _instance = new VendorLargeDataRefDbm();
    private VendorLargeDataRefDbm() {}
    public static VendorLargeDataRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgLargeDataRefId(), "largeDataRefId");
        setupEpg(_epgMap, new EpgLargeDataId(), "largeDataId");
        setupEpg(_epgMap, new EpgDateIndex(), "dateIndex");
        setupEpg(_epgMap, new EpgDateNoIndex(), "dateNoIndex");
        setupEpg(_epgMap, new EpgTimestampIndex(), "timestampIndex");
        setupEpg(_epgMap, new EpgTimestampNoIndex(), "timestampNoIndex");
        setupEpg(_epgMap, new EpgNullableDecimalIndex(), "nullableDecimalIndex");
        setupEpg(_epgMap, new EpgNullableDecimalNoIndex(), "nullableDecimalNoIndex");
        setupEpg(_epgMap, new EpgSelfParentId(), "selfParentId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgLargeDataRefId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getLargeDataRefId(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setLargeDataRefId(ctl(vl)); }
    }
    public static class EpgLargeDataId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getLargeDataId(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setLargeDataId(ctl(vl)); }
    }
    public static class EpgDateIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getDateIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setDateIndex((java.util.Date)vl); }
    }
    public static class EpgDateNoIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getDateNoIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setDateNoIndex((java.util.Date)vl); }
    }
    public static class EpgTimestampIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getTimestampIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setTimestampIndex((java.sql.Timestamp)vl); }
    }
    public static class EpgTimestampNoIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getTimestampNoIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setTimestampNoIndex((java.sql.Timestamp)vl); }
    }
    public static class EpgNullableDecimalIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getNullableDecimalIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setNullableDecimalIndex(ctb(vl)); }
    }
    public static class EpgNullableDecimalNoIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getNullableDecimalNoIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setNullableDecimalNoIndex(ctb(vl)); }
    }
    public static class EpgSelfParentId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getSelfParentId(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setSelfParentId(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_large_data_ref";
    protected final String _tablePropertyName = "vendorLargeDataRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_DATA_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", null, null, true, "largeDataRefId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, "vendorLargeDataRefSelfList", null);
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, true, "largeDataId", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, "vendorLargeData", null, null);
    protected final ColumnInfo _columnDateIndex = cci("DATE_INDEX", "DATE_INDEX", null, null, true, "dateIndex", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateNoIndex = cci("DATE_NO_INDEX", "DATE_NO_INDEX", null, null, true, "dateNoIndex", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampIndex = cci("TIMESTAMP_INDEX", "TIMESTAMP_INDEX", null, null, true, "timestampIndex", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampNoIndex = cci("TIMESTAMP_NO_INDEX", "TIMESTAMP_NO_INDEX", null, null, true, "timestampNoIndex", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("NULLABLE_DECIMAL_INDEX", "NULLABLE_DECIMAL_INDEX", null, null, false, "nullableDecimalIndex", java.math.BigDecimal.class, false, false, "DECIMAL", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("NULLABLE_DECIMAL_NO_INDEX", "NULLABLE_DECIMAL_NO_INDEX", null, null, false, "nullableDecimalNoIndex", java.math.BigDecimal.class, false, false, "DECIMAL", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, null, false, "selfParentId", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, "vendorLargeDataRefSelf", null, null);

    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    public ColumnInfo columnSelfParentId() { return _columnSelfParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLargeDataRefId());
        ls.add(columnLargeDataId());
        ls.add(columnDateIndex());
        ls.add(columnDateNoIndex());
        ls.add(columnTimestampIndex());
        ls.add(columnTimestampNoIndex());
        ls.add(columnNullableDecimalIndex());
        ls.add(columnNullableDecimalNoIndex());
        ls.add(columnSelfParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLargeDataRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignVendorLargeData() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "vendorLargeDataRefList");
    }
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerVendorLargeDataRefSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataRefId(), VendorLargeDataRefDbm.getInstance().columnSelfParentId());
        return cri("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelfList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeDataRefSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.VendorLargeDataRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.VendorLargeDataRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.VendorLargeDataRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeDataRef> getEntityType() { return VendorLargeDataRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorLargeDataRef newMyEntity() { return new VendorLargeDataRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeDataRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeDataRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
