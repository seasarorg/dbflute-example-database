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
 * The DB meta of VENDOR-NON COMPILABLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class Vendor_non_compilableDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final Vendor_non_compilableDbm _instance = new Vendor_non_compilableDbm();
    private Vendor_non_compilableDbm() {}
    public static Vendor_non_compilableDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgNon_compilable_id(), "non_compilable_id");
        setupEpg(_epgMap, new EpgNon_compilable_name(), "non_compilable_name");
        setupEpg(_epgMap, new EpgParent_id(), "parent_id");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgNon_compilable_id implements PropertyGateway {
        public Object read(Entity e) { return ((Vendor_non_compilable)e).getNon_compilable_id(); }
        public void write(Entity e, Object v) { ((Vendor_non_compilable)e).setNon_compilable_id(cti(v)); }
    }
    public static class EpgNon_compilable_name implements PropertyGateway {
        public Object read(Entity e) { return ((Vendor_non_compilable)e).getNon_compilable_name(); }
        public void write(Entity e, Object v) { ((Vendor_non_compilable)e).setNon_compilable_name((String)v); }
    }
    public static class EpgParent_id implements PropertyGateway {
        public Object read(Entity e) { return ((Vendor_non_compilable)e).getParent_id(); }
        public void write(Entity e, Object v) { ((Vendor_non_compilable)e).setParent_id(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR-NON COMPILABLE";
    protected final String _tablePropertyName = "vendor_non_compilable";
    protected final TableSqlName _tableSqlName = new TableSqlName("\"VENDOR-NON COMPILABLE\"", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNon_compilable_id = cci("NON-COMPILABLE ID", "\"NON-COMPILABLE ID\"", null, null, true, "non_compilable_id", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, "vendor_non_compilableSelfList", null);
    protected final ColumnInfo _columnNon_compilable_name = cci("NON COMPILABLE-NAME", "\"NON COMPILABLE-NAME\"", null, null, false, "non_compilable_name", String.class, false, false, "varchar", 64, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParent_id = cci("PARENT-ID", "\"PARENT-ID\"", null, null, false, "parent_id", Integer.class, false, false, "int4", 10, 0, null, false, null, null, "vendor_non_compilableSelf", null, null);

    public ColumnInfo columnNon_compilable_id() { return _columnNon_compilable_id; }
    public ColumnInfo columnNon_compilable_name() { return _columnNon_compilable_name; }
    public ColumnInfo columnParent_id() { return _columnParent_id; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNon_compilable_id());
        ls.add(columnNon_compilable_name());
        ls.add(columnParent_id());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNon_compilable_id()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignVendor_non_compilableSelf() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnParent_id(), Vendor_non_compilableDbm.getInstance().columnNon_compilable_id());
        return cfi("fk_vendor_non_comppilable_self", "vendor_non_compilableSelf", this, Vendor_non_compilableDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "vendor_non_compilableSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerVendor_non_compilableSelfList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnNon_compilable_id(), Vendor_non_compilableDbm.getInstance().columnParent_id());
        return cri("fk_vendor_non_comppilable_self", "vendor_non_compilableSelfList", this, Vendor_non_compilableDbm.getInstance(), map, false, "vendor_non_compilableSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.Vendor_non_compilable"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.Vendor_non_compilableCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.Vendor_non_compilableBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Vendor_non_compilable> getEntityType() { return Vendor_non_compilable.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Vendor_non_compilable newMyEntity() { return new Vendor_non_compilable(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Vendor_non_compilable)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Vendor_non_compilable)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
