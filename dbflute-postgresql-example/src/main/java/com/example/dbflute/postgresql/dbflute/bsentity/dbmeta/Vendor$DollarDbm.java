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
 * The DB meta of vendor_$_dollar. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class Vendor$DollarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final Vendor$DollarDbm _instance = new Vendor$DollarDbm();
    private Vendor$DollarDbm() {}
    public static Vendor$DollarDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendor$DollarId(), "vendor$DollarId");
        setupEpg(_epgMap, new EpgVendor$DollarName(), "vendor$DollarName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendor$DollarId implements PropertyGateway {
        public Object read(Entity et) { return ((Vendor$Dollar)et).getVendor$DollarId(); }
        public void write(Entity et, Object vl) { ((Vendor$Dollar)et).setVendor$DollarId(cti(vl)); }
    }
    public static class EpgVendor$DollarName implements PropertyGateway {
        public Object read(Entity et) { return ((Vendor$Dollar)et).getVendor$DollarName(); }
        public void write(Entity et, Object vl) { ((Vendor$Dollar)et).setVendor$DollarName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_$_dollar";
    protected final String _tablePropertyName = "vendor$Dollar";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_$_dollar", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendor$DollarId = cci("vendor_$_dollar_id", "vendor_$_dollar_id", null, null, true, "vendor$DollarId", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendor$DollarName = cci("vendor_$_dollar_name", "vendor_$_dollar_name", null, null, false, "vendor$DollarName", String.class, false, false, "varchar", 64, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendor$DollarId() { return _columnVendor$DollarId; }
    public ColumnInfo columnVendor$DollarName() { return _columnVendor$DollarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendor$DollarId());
        ls.add(columnVendor$DollarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendor$DollarId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.Vendor$Dollar"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.Vendor$DollarCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.Vendor$DollarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Vendor$Dollar> getEntityType() { return Vendor$Dollar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Vendor$Dollar newMyEntity() { return new Vendor$Dollar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Vendor$Dollar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Vendor$Dollar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
