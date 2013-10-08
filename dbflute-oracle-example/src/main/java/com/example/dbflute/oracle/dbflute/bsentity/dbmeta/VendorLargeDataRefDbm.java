package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_LARGE_DATA_REF. (Singleton)
 * @author oracleman
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
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getLargeDataRefId(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setLargeDataRefId(ctl(v)); }
    }
    public static class EpgLargeDataId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getLargeDataId(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setLargeDataId(ctl(v)); }
    }
    public static class EpgDateIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getDateIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setDateIndex((java.util.Date)v); }
    }
    public static class EpgDateNoIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getDateNoIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setDateNoIndex((java.util.Date)v); }
    }
    public static class EpgTimestampIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getTimestampIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setTimestampIndex((java.sql.Timestamp)v); }
    }
    public static class EpgTimestampNoIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getTimestampNoIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setTimestampNoIndex((java.sql.Timestamp)v); }
    }
    public static class EpgNullableDecimalIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getNullableDecimalIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setNullableDecimalIndex(ctb(v)); }
    }
    public static class EpgNullableDecimalNoIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getNullableDecimalNoIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setNullableDecimalNoIndex(ctb(v)); }
    }
    public static class EpgSelfParentId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeDataRef)e).getSelfParentId(); }
        public void write(Entity e, Object v) { ((VendorLargeDataRef)e).setSelfParentId(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_DATA_REF";
    protected final String _tablePropertyName = "vendorLargeDataRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_DATA_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", null, null, true, "largeDataRefId", Long.class, true, false, "NUMBER", 12, 0, null, false, null, null, null, "vendorLargeDataRefSelfList", null);
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, true, "largeDataId", Long.class, false, false, "NUMBER", 12, 0, null, false, null, null, "vendorLargeData", null, null);
    protected final ColumnInfo _columnDateIndex = cci("DATE_INDEX", "DATE_INDEX", null, null, true, "dateIndex", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateNoIndex = cci("DATE_NO_INDEX", "DATE_NO_INDEX", null, null, true, "dateNoIndex", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampIndex = cci("TIMESTAMP_INDEX", "TIMESTAMP_INDEX", null, null, true, "timestampIndex", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampNoIndex = cci("TIMESTAMP_NO_INDEX", "TIMESTAMP_NO_INDEX", null, null, true, "timestampNoIndex", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("NULLABLE_DECIMAL_INDEX", "NULLABLE_DECIMAL_INDEX", null, null, false, "nullableDecimalIndex", java.math.BigDecimal.class, false, false, "NUMBER", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("NULLABLE_DECIMAL_NO_INDEX", "NULLABLE_DECIMAL_NO_INDEX", null, null, false, "nullableDecimalNoIndex", java.math.BigDecimal.class, false, false, "NUMBER", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, null, false, "selfParentId", Long.class, false, false, "NUMBER", 12, 0, null, false, null, null, "vendorLargeDataRefSelf", null, null);

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
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "vendorLargeDataRefList");
    }
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerVendorLargeDataRefSelfList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLargeDataRefId(), VendorLargeDataRefDbm.getInstance().columnSelfParentId());
        return cri("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelfList", this, VendorLargeDataRefDbm.getInstance(), map, false, "vendorLargeDataRefSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.VendorLargeDataRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.VendorLargeDataRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.VendorLargeDataRefBhv"; }

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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorLargeDataRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorLargeDataRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
