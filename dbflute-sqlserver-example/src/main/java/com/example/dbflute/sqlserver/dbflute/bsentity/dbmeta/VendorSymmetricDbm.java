package com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_SYMMETRIC. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorSymmetricDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorSymmetricDbm _instance = new VendorSymmetricDbm();
    private VendorSymmetricDbm() {}
    public static VendorSymmetricDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorSymmetricId(), "vendorSymmetricId");
        setupEpg(_epgMap, new EpgPlainText(), "plainText");
        setupEpg(_epgMap, new EpgEncryptedData(), "encryptedData");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorSymmetricId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorSymmetric)et).getVendorSymmetricId(); }
        public void write(Entity et, Object vl) { ((VendorSymmetric)et).setVendorSymmetricId(ctl(vl)); }
    }
    public static class EpgPlainText implements PropertyGateway {
        public Object read(Entity et) { return ((VendorSymmetric)et).getPlainText(); }
        public void write(Entity et, Object vl) { ((VendorSymmetric)et).setPlainText((String)vl); }
    }
    public static class EpgEncryptedData implements PropertyGateway {
        public Object read(Entity et) { return ((VendorSymmetric)et).getEncryptedData(); }
        public void write(Entity et, Object vl) { ((VendorSymmetric)et).setEncryptedData((byte[])vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_SYMMETRIC";
    protected final String _tablePropertyName = "vendorSymmetric";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_SYMMETRIC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorSymmetricId = cci("VENDOR_SYMMETRIC_ID", "VENDOR_SYMMETRIC_ID", null, null, true, "vendorSymmetricId", Long.class, true, false, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPlainText = cci("PLAIN_TEXT", "PLAIN_TEXT", null, null, false, "plainText", String.class, false, false, "nvarchar", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnEncryptedData = cci("ENCRYPTED_DATA", "ENCRYPTED_DATA", null, null, false, "encryptedData", byte[].class, false, false, "image", 2147483647, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorSymmetricId() { return _columnVendorSymmetricId; }
    public ColumnInfo columnPlainText() { return _columnPlainText; }
    public ColumnInfo columnEncryptedData() { return _columnEncryptedData; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorSymmetricId());
        ls.add(columnPlainText());
        ls.add(columnEncryptedData());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorSymmetricId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.VendorSymmetric"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.sqlserver.dbflute.cbean.VendorSymmetricCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.sqlserver.dbflute.exbhv.VendorSymmetricBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorSymmetric> getEntityType() { return VendorSymmetric.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorSymmetric newMyEntity() { return new VendorSymmetric(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorSymmetric)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorSymmetric)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
