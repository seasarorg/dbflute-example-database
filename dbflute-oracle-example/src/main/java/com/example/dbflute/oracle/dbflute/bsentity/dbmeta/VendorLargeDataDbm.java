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
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, Long.class, "largeDataId", null, true, false, true, "NUMBER", 12, 0, null, false, null, null, null, "vendorLargeDataRefList", null);
    protected final ColumnInfo _columnStringIndex = cci("STRING_INDEX", "STRING_INDEX", null, null, String.class, "stringIndex", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringNoIndex = cci("STRING_NO_INDEX", "STRING_NO_INDEX", null, null, String.class, "stringNoIndex", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringUniqueIndex = cci("STRING_UNIQUE_INDEX", "STRING_UNIQUE_INDEX", null, null, String.class, "stringUniqueIndex", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIntflgIndex = cci("INTFLG_INDEX", "INTFLG_INDEX", null, null, Integer.class, "intflgIndex", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumericIntegerIndex = cci("NUMERIC_INTEGER_INDEX", "NUMERIC_INTEGER_INDEX", null, null, Integer.class, "numericIntegerIndex", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumericIntegerNoIndex = cci("NUMERIC_INTEGER_NO_INDEX", "NUMERIC_INTEGER_NO_INDEX", null, null, Integer.class, "numericIntegerNoIndex", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null);

    /**
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringIndex() { return _columnStringIndex; }
    /**
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringNoIndex() { return _columnStringNoIndex; }
    /**
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringUniqueIndex() { return _columnStringUniqueIndex; }
    /**
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntflgIndex() { return _columnIntflgIndex; }
    /**
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumericIntegerIndex() { return _columnNumericIntegerIndex; }
    /**
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
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
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataRefDbm.getInstance().columnLargeDataId());
        return cri("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeDataRefList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeData");
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
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
