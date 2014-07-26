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
 * The DB meta of vendor_inherit_neko. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorInheritNekoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorInheritNekoDbm _instance = new VendorInheritNekoDbm();
    private VendorInheritNekoDbm() {}
    public static VendorInheritNekoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgInuId(), "inuId");
        setupEpg(_epgMap, new EpgInuName(), "inuName");
        setupEpg(_epgMap, new EpgInuDate(), "inuDate");
        setupEpg(_epgMap, new EpgNekoId(), "nekoId");
        setupEpg(_epgMap, new EpgNekoName(), "nekoName");
        setupEpg(_epgMap, new EpgNekoDate(), "nekoDate");
    }
    public static class EpgInuId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorInheritNeko)et).getInuId(); }
        public void write(Entity et, Object vl) { ((VendorInheritNeko)et).setInuId(cti(vl)); }
    }
    public static class EpgInuName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorInheritNeko)et).getInuName(); }
        public void write(Entity et, Object vl) { ((VendorInheritNeko)et).setInuName((String)vl); }
    }
    public static class EpgInuDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorInheritNeko)et).getInuDate(); }
        public void write(Entity et, Object vl) { ((VendorInheritNeko)et).setInuDate((java.util.Date)vl); }
    }
    public static class EpgNekoId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorInheritNeko)et).getNekoId(); }
        public void write(Entity et, Object vl) { ((VendorInheritNeko)et).setNekoId(cti(vl)); }
    }
    public static class EpgNekoName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorInheritNeko)et).getNekoName(); }
        public void write(Entity et, Object vl) { ((VendorInheritNeko)et).setNekoName((String)vl); }
    }
    public static class EpgNekoDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorInheritNeko)et).getNekoDate(); }
        public void write(Entity et, Object vl) { ((VendorInheritNeko)et).setNekoDate((java.util.Date)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_inherit_neko";
    protected final String _tablePropertyName = "vendorInheritNeko";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_inherit_neko", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInuId = cci("inu_id", "inu_id", null, null, Integer.class, "inuId", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInuName = cci("inu_name", "inu_name", null, null, String.class, "inuName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInuDate = cci("inu_date", "inu_date", null, null, java.util.Date.class, "inuDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNekoId = cci("neko_id", "neko_id", null, null, Integer.class, "nekoId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNekoName = cci("neko_name", "neko_name", null, null, String.class, "nekoName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNekoDate = cci("neko_date", "neko_date", null, null, java.util.Date.class, "nekoDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null);

    /**
     * inu_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuId() { return _columnInuId; }
    /**
     * inu_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuName() { return _columnInuName; }
    /**
     * inu_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuDate() { return _columnInuDate; }
    /**
     * neko_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNekoId() { return _columnNekoId; }
    /**
     * neko_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNekoName() { return _columnNekoName; }
    /**
     * neko_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNekoDate() { return _columnNekoDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInuId());
        ls.add(columnInuName());
        ls.add(columnInuDate());
        ls.add(columnNekoId());
        ls.add(columnNekoName());
        ls.add(columnNekoDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNekoId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorInheritNeko"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorInheritNekoCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorInheritNekoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorInheritNeko> getEntityType() { return VendorInheritNeko.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorInheritNeko newEntity() { return new VendorInheritNeko(); }
    public VendorInheritNeko newMyEntity() { return new VendorInheritNeko(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorInheritNeko)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorInheritNeko)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
