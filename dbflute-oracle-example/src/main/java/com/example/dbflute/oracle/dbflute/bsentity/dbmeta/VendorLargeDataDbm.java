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
 * The DB meta of VENDOR_LARGE_DATA. (Singleton)
 * @author oracleman
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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgLargeDataId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getLargeDataId(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setLargeDataId(ctl(v)); }
    }
    public static class EpgStringIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getStringIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setStringIndex((String)v); }
    }
    public static class EpgStringNoIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getStringNoIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setStringNoIndex((String)v); }
    }
    public static class EpgStringUniqueIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getStringUniqueIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setStringUniqueIndex((String)v); }
    }
    public static class EpgIntflgIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getIntflgIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setIntflgIndex(cti(v)); }
    }
    public static class EpgNumericIntegerIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getNumericIntegerIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setNumericIntegerIndex(cti(v)); }
    }
    public static class EpgNumericIntegerNoIndex implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeData)e).getNumericIntegerNoIndex(); }
        public void write(Entity e, Object v) { ((VendorLargeData)e).setNumericIntegerNoIndex(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_DATA";
    protected final String _tablePropertyName = "vendorLargeData";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, true, "largeDataId", Long.class, true, false, "NUMBER", 12, 0, null, false, null, null, null, "vendorLargeDataRefList", null);
    protected final ColumnInfo _columnStringIndex = cci("STRING_INDEX", "STRING_INDEX", null, null, true, "stringIndex", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringNoIndex = cci("STRING_NO_INDEX", "STRING_NO_INDEX", null, null, true, "stringNoIndex", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringUniqueIndex = cci("STRING_UNIQUE_INDEX", "STRING_UNIQUE_INDEX", null, null, true, "stringUniqueIndex", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIntflgIndex = cci("INTFLG_INDEX", "INTFLG_INDEX", null, null, true, "intflgIndex", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumericIntegerIndex = cci("NUMERIC_INTEGER_INDEX", "NUMERIC_INTEGER_INDEX", null, null, true, "numericIntegerIndex", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumericIntegerNoIndex = cci("NUMERIC_INTEGER_NO_INDEX", "NUMERIC_INTEGER_NO_INDEX", null, null, true, "numericIntegerNoIndex", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    public ColumnInfo columnStringIndex() { return _columnStringIndex; }
    public ColumnInfo columnStringNoIndex() { return _columnStringNoIndex; }
    public ColumnInfo columnStringUniqueIndex() { return _columnStringUniqueIndex; }
    public ColumnInfo columnIntflgIndex() { return _columnIntflgIndex; }
    public ColumnInfo columnNumericIntegerIndex() { return _columnNumericIntegerIndex; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerVendorLargeDataRefList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLargeDataId(), VendorLargeDataRefDbm.getInstance().columnLargeDataId());
        return cri("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeDataRefList", this, VendorLargeDataRefDbm.getInstance(), map, false, "vendorLargeData");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.VendorLargeData"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.VendorLargeDataCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.VendorLargeDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeData> getEntityType() { return VendorLargeData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorLargeData newMyEntity() { return new VendorLargeData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorLargeData)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorLargeData)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
