package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_DEFAULT_VALUE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorDefaultValueDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorDefaultValueDbm _instance = new VendorDefaultValueDbm();
    private VendorDefaultValueDbm() {}
    public static VendorDefaultValueDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgDefaultValueId(), "defaultValueId");
        setupEpg(_epgMap, new EpgDefaultTimestamp(), "defaultTimestamp");
    }
    public static class EpgDefaultValueId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDefaultValue)et).getDefaultValueId(); }
        public void write(Entity et, Object vl) { ((VendorDefaultValue)et).setDefaultValueId(ctl(vl)); }
    }
    public static class EpgDefaultTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDefaultValue)et).getDefaultTimestamp(); }
        public void write(Entity et, Object vl) { ((VendorDefaultValue)et).setDefaultTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_DEFAULT_VALUE";
    protected final String _tablePropertyName = "vendorDefaultValue";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_DEFAULT_VALUE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDefaultValueId = cci("DEFAULT_VALUE_ID", "DEFAULT_VALUE_ID", null, null, Long.class, "defaultValueId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDefaultTimestamp = cci("DEFAULT_TIMESTAMP", "DEFAULT_TIMESTAMP", null, null, java.sql.Timestamp.class, "defaultTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "9999-12-31-23.59.59.999999", false, null, null, null, null, null);

    /**
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultValueId() { return _columnDefaultValueId; }
    /**
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultTimestamp() { return _columnDefaultTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDefaultValueId());
        ls.add(columnDefaultTimestamp());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDefaultValueId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.VendorDefaultValue"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.VendorDefaultValueCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.VendorDefaultValueBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorDefaultValue> getEntityType() { return VendorDefaultValue.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorDefaultValue newEntity() { return new VendorDefaultValue(); }
    public VendorDefaultValue newMyEntity() { return new VendorDefaultValue(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorDefaultValue)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorDefaultValue)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
