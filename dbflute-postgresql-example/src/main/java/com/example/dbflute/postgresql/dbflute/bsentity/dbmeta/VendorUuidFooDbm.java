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
 * The DB meta of vendor_uuid_foo. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorUuidFooDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorUuidFooDbm _instance = new VendorUuidFooDbm();
    private VendorUuidFooDbm() {}
    public static VendorUuidFooDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgFooId(), "fooId");
        setupEpg(_epgMap, new EpgFooName(), "fooName");
        setupEpg(_epgMap, new EpgBarId(), "barId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgFooId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorUuidFoo)et).getFooId(); }
        public void write(Entity et, Object vl) { ((VendorUuidFoo)et).setFooId((java.util.UUID)vl); }
    }
    public static class EpgFooName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorUuidFoo)et).getFooName(); }
        public void write(Entity et, Object vl) { ((VendorUuidFoo)et).setFooName((String)vl); }
    }
    public static class EpgBarId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorUuidFoo)et).getBarId(); }
        public void write(Entity et, Object vl) { ((VendorUuidFoo)et).setBarId((java.util.UUID)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_uuid_foo";
    protected final String _tablePropertyName = "vendorUuidFoo";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_uuid_foo", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooId = cci("foo_id", "foo_id", null, null, true, "fooId", java.util.UUID.class, true, false, "uuid", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooName = cci("foo_name", "foo_name", null, null, true, "fooName", String.class, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarId = cci("bar_id", "bar_id", null, null, true, "barId", java.util.UUID.class, false, false, "uuid", 2147483647, 0, null, false, null, null, "vendorUuidBar", null, null);

    public ColumnInfo columnFooId() { return _columnFooId; }
    public ColumnInfo columnFooName() { return _columnFooName; }
    public ColumnInfo columnBarId() { return _columnBarId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooId());
        ls.add(columnFooName());
        ls.add(columnBarId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFooId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignVendorUuidBar() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBarId(), VendorUuidBarDbm.getInstance().columnBarId());
        return cfi("fk_vendor_uuid_foo_bar", "vendorUuidBar", this, VendorUuidBarDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "vendorUuidFooList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorUuidFoo"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorUuidFooCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorUuidFooBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorUuidFoo> getEntityType() { return VendorUuidFoo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorUuidFoo newMyEntity() { return new VendorUuidFoo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorUuidFoo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorUuidFoo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
