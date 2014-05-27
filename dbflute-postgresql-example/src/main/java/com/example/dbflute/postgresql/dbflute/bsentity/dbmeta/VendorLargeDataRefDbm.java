package com.example.dbflute.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgVendorLargeData(), "vendorLargeData");
        setupEfpg(_efpgMap, new EfpgVendorLargeDataRefSelf(), "vendorLargeDataRefSelf");
    }
    public class EfpgVendorLargeData implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getVendorLargeData(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setVendorLargeData((VendorLargeData)vl); }
    }
    public class EfpgVendorLargeDataRefSelf implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeDataRef)et).getVendorLargeDataRefSelf(); }
        public void write(Entity et, Object vl) { ((VendorLargeDataRef)et).setVendorLargeDataRefSelf((VendorLargeDataRef)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_large_data_ref";
    protected final String _tablePropertyName = "vendorLargeDataRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_large_data_ref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("large_data_ref_id", "large_data_ref_id", null, null, Long.class, "largeDataRefId", null, true, false, true, "int8", 19, 0, null, false, null, null, null, "vendorLargeDataRefSelfList", null);
    protected final ColumnInfo _columnLargeDataId = cci("large_data_id", "large_data_id", null, null, Long.class, "largeDataId", null, false, false, true, "int8", 19, 0, null, false, null, null, "vendorLargeData", null, null);
    protected final ColumnInfo _columnDateIndex = cci("date_index", "date_index", null, null, java.util.Date.class, "dateIndex", null, false, false, true, "date", 13, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateNoIndex = cci("date_no_index", "date_no_index", null, null, java.util.Date.class, "dateNoIndex", null, false, false, true, "date", 13, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampIndex = cci("timestamp_index", "timestamp_index", null, null, java.sql.Timestamp.class, "timestampIndex", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampNoIndex = cci("timestamp_no_index", "timestamp_no_index", null, null, java.sql.Timestamp.class, "timestampNoIndex", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("nullable_decimal_index", "nullable_decimal_index", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "numeric", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("nullable_decimal_no_index", "nullable_decimal_no_index", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "numeric", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSelfParentId = cci("self_parent_id", "self_parent_id", null, null, Long.class, "selfParentId", null, false, false, false, "int8", 19, 0, null, false, null, null, "vendorLargeDataRefSelf", null, null);

    /**
     * large_data_ref_id: {PK, NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * large_data_id: {NotNull, int8(19), FK to vendor_large_data}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * date_index: {IX, NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * date_no_index: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * timestamp_index: {IX, NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * timestamp_no_index: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * nullable_decimal_index: {IX, numeric(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * nullable_decimal_no_index: {numeric(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * self_parent_id: {int8(19), FK to vendor_large_data_ref}
     * @return The information object of specified column. (NotNull)
     */
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
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeData() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("fk_vendor_large_data_ref_data", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "vendorLargeDataRefList");
    }
    /**
     * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("fk_vendor_large_data_ref_self", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataRefId(), VendorLargeDataRefDbm.getInstance().columnSelfParentId());
        return cri("fk_vendor_large_data_ref_self", "vendorLargeDataRefSelfList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeDataRefSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorLargeDataRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorLargeDataRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorLargeDataRefBhv"; }

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
