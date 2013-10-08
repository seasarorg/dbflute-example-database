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
 * The DB meta of VENDOR_LARGE_NAME_90123456_REF. (Singleton)
 * @author oracleman
 */
public class VendorLargeName90123456RefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeName90123456RefDbm _instance = new VendorLargeName90123456RefDbm();
    private VendorLargeName90123456RefDbm() {}
    public static VendorLargeName90123456RefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorLargeName90123RefId(), "vendorLargeName90123RefId");
        setupEpg(_epgMap, new EpgVendorLargeName901RefName(), "vendorLargeName901RefName");
        setupEpg(_epgMap, new EpgVendorLargeName901234567Id(), "vendorLargeName901234567Id");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorLargeName90123RefId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeName90123456Ref)e).getVendorLargeName90123RefId(); }
        public void write(Entity e, Object v) { ((VendorLargeName90123456Ref)e).setVendorLargeName90123RefId(ctl(v)); }
    }
    public static class EpgVendorLargeName901RefName implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeName90123456Ref)e).getVendorLargeName901RefName(); }
        public void write(Entity e, Object v) { ((VendorLargeName90123456Ref)e).setVendorLargeName901RefName((String)v); }
    }
    public static class EpgVendorLargeName901234567Id implements PropertyGateway {
        public Object read(Entity e) { return ((VendorLargeName90123456Ref)e).getVendorLargeName901234567Id(); }
        public void write(Entity e, Object v) { ((VendorLargeName90123456Ref)e).setVendorLargeName901234567Id(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_NAME_90123456_REF";
    protected final String _tablePropertyName = "vendorLargeName90123456Ref";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_NAME_90123456_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorLargeName90123RefId = cci("VENDOR_LARGE_NAME_90123_REF_ID", "VENDOR_LARGE_NAME_90123_REF_ID", null, null, true, "vendorLargeName90123RefId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendorLargeName901RefName = cci("VENDOR_LARGE_NAME_901_REF_NAME", "VENDOR_LARGE_NAME_901_REF_NAME", null, null, true, "vendorLargeName901RefName", String.class, false, false, "VARCHAR2", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendorLargeName901234567Id = cci("VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", null, null, false, "vendorLargeName901234567Id", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, "vendorLargeName901234567890", null, null);

    public ColumnInfo columnVendorLargeName90123RefId() { return _columnVendorLargeName90123RefId; }
    public ColumnInfo columnVendorLargeName901RefName() { return _columnVendorLargeName901RefName; }
    public ColumnInfo columnVendorLargeName901234567Id() { return _columnVendorLargeName901234567Id; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorLargeName90123RefId());
        ls.add(columnVendorLargeName901RefName());
        ls.add(columnVendorLargeName901234567Id());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorLargeName90123RefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignVendorLargeName901234567890() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnVendorLargeName901234567Id(), VendorLargeName901234567890Dbm.getInstance().columnVendorLargeName901234567Id());
        return cfi("FK_VENDOR_LARGE_NAME_$$$_REF", "vendorLargeName901234567890", this, VendorLargeName901234567890Dbm.getInstance(), map, 0, false, false, false, false, null, null, false, "vendorLargeName90123456RefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.VendorLargeName90123456Ref"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.VendorLargeName90123456RefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.VendorLargeName90123456RefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeName90123456Ref> getEntityType() { return VendorLargeName90123456Ref.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorLargeName90123456Ref newMyEntity() { return new VendorLargeName90123456Ref(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorLargeName90123456Ref)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorLargeName90123456Ref)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
