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
    protected final ColumnInfo _columnLargeDataRefId = cci("LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", null, null, Long.class, "largeDataRefId", null, true, false, true, "NUMBER", 12, 0, null, false, null, null, null, "vendorLargeDataRefSelfList", null);
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, Long.class, "largeDataId", null, false, false, true, "NUMBER", 12, 0, null, false, null, null, "vendorLargeData", null, null);
    protected final ColumnInfo _columnDateIndex = cci("DATE_INDEX", "DATE_INDEX", null, null, java.util.Date.class, "dateIndex", null, false, false, true, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateNoIndex = cci("DATE_NO_INDEX", "DATE_NO_INDEX", null, null, java.util.Date.class, "dateNoIndex", null, false, false, true, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampIndex = cci("TIMESTAMP_INDEX", "TIMESTAMP_INDEX", null, null, java.sql.Timestamp.class, "timestampIndex", null, false, false, true, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampNoIndex = cci("TIMESTAMP_NO_INDEX", "TIMESTAMP_NO_INDEX", null, null, java.sql.Timestamp.class, "timestampNoIndex", null, false, false, true, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("NULLABLE_DECIMAL_INDEX", "NULLABLE_DECIMAL_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "NUMBER", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("NULLABLE_DECIMAL_NO_INDEX", "NULLABLE_DECIMAL_NO_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "NUMBER", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, null, Long.class, "selfParentId", null, false, false, false, "NUMBER", 12, 0, null, false, null, null, "vendorLargeDataRefSelf", null, null);

    /**
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeData() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "vendorLargeDataRefList");
    }
    /**
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
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
    public VendorLargeDataRef newEntity() { return new VendorLargeDataRef(); }
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
