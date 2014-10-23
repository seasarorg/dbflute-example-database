package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_LARGE_NAME_901234567890. (Singleton)
 * @author oracleman
 */
public class VendorLargeName901234567890Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeName901234567890Dbm _instance = new VendorLargeName901234567890Dbm();
    private VendorLargeName901234567890Dbm() {}
    public static VendorLargeName901234567890Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgVendorLargeName901234567Id(), "vendorLargeName901234567Id");
        setupEpg(_epgMap, new EpgVendorLargeName9012345Name(), "vendorLargeName9012345Name");
    }
    public static class EpgVendorLargeName901234567Id implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeName901234567890)et).getVendorLargeName901234567Id(); }
        public void write(Entity et, Object vl) { ((VendorLargeName901234567890)et).setVendorLargeName901234567Id(ctl(vl)); }
    }
    public static class EpgVendorLargeName9012345Name implements PropertyGateway {
        public Object read(Entity et) { return ((VendorLargeName901234567890)et).getVendorLargeName9012345Name(); }
        public void write(Entity et, Object vl) { ((VendorLargeName901234567890)et).setVendorLargeName9012345Name((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_NAME_901234567890";
    protected final String _tablePropertyName = "vendorLargeName901234567890";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_NAME_901234567890", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorLargeName901234567Id = cci("VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", null, null, Long.class, "vendorLargeName901234567Id", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, "vendorLargeName90123456RefList", null);
    protected final ColumnInfo _columnVendorLargeName9012345Name = cci("VENDOR_LARGE_NAME_9012345_NAME", "VENDOR_LARGE_NAME_9012345_NAME", null, null, String.class, "vendorLargeName9012345Name", null, false, false, true, "VARCHAR2", 32, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorLargeName901234567Id() { return _columnVendorLargeName901234567Id; }
    /**
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorLargeName9012345Name() { return _columnVendorLargeName9012345Name; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorLargeName901234567Id());
        ls.add(columnVendorLargeName9012345Name());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorLargeName901234567Id()); }
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
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeName90123456RefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVendorLargeName901234567Id(), VendorLargeName90123456RefDbm.getInstance().columnVendorLargeName901234567Id());
        return cri("FK_VENDOR_LARGE_NAME_$$$_REF", "vendorLargeName90123456RefList", this, VendorLargeName90123456RefDbm.getInstance(), mp, false, "vendorLargeName901234567890");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.VendorLargeName901234567890"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.VendorLargeName901234567890CB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.VendorLargeName901234567890Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeName901234567890> getEntityType() { return VendorLargeName901234567890.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeName901234567890 newEntity() { return new VendorLargeName901234567890(); }
    public VendorLargeName901234567890 newMyEntity() { return new VendorLargeName901234567890(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeName901234567890)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeName901234567890)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
