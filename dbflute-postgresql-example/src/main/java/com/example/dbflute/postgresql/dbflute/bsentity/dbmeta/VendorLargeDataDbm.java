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
 * The DB meta of vendor_large_data. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorLargeDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeDataDbm _instance = new VendorLargeDataDbm();
    private VendorLargeDataDbm() {}
    public static VendorLargeDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgLargeDataId(), "largeDataId");
        setupEpg(_epgMap, new EpgStringIndex(), "stringIndex");
        setupEpg(_epgMap, new EpgStringNoIndex(), "stringNoIndex");
        setupEpg(_epgMap, new EpgStringUniqueIndex(), "stringUniqueIndex");
        setupEpg(_epgMap, new EpgIntflgIndex(), "intflgIndex");
        setupEpg(_epgMap, new EpgNumericIntegerIndex(), "numericIntegerIndex");
        setupEpg(_epgMap, new EpgNumericIntegerNoIndex(), "numericIntegerNoIndex");
    }
    public static class EpgLargeDataId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getLargeDataId(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setLargeDataId(ctl(vl)); }
    }
    public static class EpgStringIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getStringIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setStringIndex((String)vl); }
    }
    public static class EpgStringNoIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getStringNoIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setStringNoIndex((String)vl); }
    }
    public static class EpgStringUniqueIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getStringUniqueIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setStringUniqueIndex((String)vl); }
    }
    public static class EpgIntflgIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getIntflgIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setIntflgIndex(cti(vl)); }
    }
    public static class EpgNumericIntegerIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getNumericIntegerIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setNumericIntegerIndex(cti(vl)); }
    }
    public static class EpgNumericIntegerNoIndex implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeData)et).getNumericIntegerNoIndex(); }
        public void write(Entity et, Object vl) { ((VendorLargeData)et).setNumericIntegerNoIndex(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_large_data";
    protected final String _tablePropertyName = "vendorLargeData";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_large_data", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataId = cci("large_data_id", "large_data_id", null, null, Long.class, "largeDataId", null, true, false, true, "int8", 19, 0, null, false, null, null, null, "vendorLargeDataRefList", null);
    protected final ColumnInfo _columnStringIndex = cci("string_index", "string_index", null, null, String.class, "stringIndex", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringNoIndex = cci("string_no_index", "string_no_index", null, null, String.class, "stringNoIndex", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringUniqueIndex = cci("string_unique_index", "string_unique_index", null, null, String.class, "stringUniqueIndex", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIntflgIndex = cci("intflg_index", "intflg_index", null, null, Integer.class, "intflgIndex", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumericIntegerIndex = cci("numeric_integer_index", "numeric_integer_index", null, null, Integer.class, "numericIntegerIndex", null, false, false, true, "numeric", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumericIntegerNoIndex = cci("numeric_integer_no_index", "numeric_integer_no_index", null, null, Integer.class, "numericIntegerNoIndex", null, false, false, true, "numeric", 8, 0, null, false, null, null, null, null, null);

    /**
     * large_data_id: {PK, NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * string_index: {IX, NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringIndex() { return _columnStringIndex; }
    /**
     * string_no_index: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringNoIndex() { return _columnStringNoIndex; }
    /**
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringUniqueIndex() { return _columnStringUniqueIndex; }
    /**
     * intflg_index: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntflgIndex() { return _columnIntflgIndex; }
    /**
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumericIntegerIndex() { return _columnNumericIntegerIndex; }
    /**
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumericIntegerNoIndex() { return _columnNumericIntegerNoIndex; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLargeDataId());
        ls.add(columnStringIndex());
        ls.add(columnStringNoIndex());
        ls.add(columnStringUniqueIndex());
        ls.add(columnIntflgIndex());
        ls.add(columnNumericIntegerIndex());
        ls.add(columnNumericIntegerNoIndex());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLargeDataId()); }
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
    /**
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataRefDbm.getInstance().columnLargeDataId());
        return cri("fk_vendor_large_data_ref_data", "vendorLargeDataRefList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeData");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorLargeData"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorLargeDataCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorLargeDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeData> getEntityType() { return VendorLargeData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeData newEntity() { return new VendorLargeData(); }
    public VendorLargeData newMyEntity() { return new VendorLargeData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
