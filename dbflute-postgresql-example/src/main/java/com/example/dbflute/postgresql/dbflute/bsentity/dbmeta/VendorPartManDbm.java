package com.example.dbflute.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The DB meta of vendor_part_man. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorPartManDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorPartManDbm _instance = new VendorPartManDbm();
    private VendorPartManDbm() {}
    public static VendorPartManDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgPartManId(), "partManId");
        setupEpg(_epgMap, new EpgPartManName(), "partManName");
        setupEpg(_epgMap, new EpgPartManPoint(), "partManPoint");
        setupEpg(_epgMap, new EpgPartManDate(), "partManDate");
    }
    public static class EpgPartManId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorPartMan)et).getPartManId(); }
        public void write(Entity et, Object vl) { ((VendorPartMan)et).setPartManId(cti(vl)); }
    }
    public static class EpgPartManName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorPartMan)et).getPartManName(); }
        public void write(Entity et, Object vl) { ((VendorPartMan)et).setPartManName((String)vl); }
    }
    public static class EpgPartManPoint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorPartMan)et).getPartManPoint(); }
        public void write(Entity et, Object vl) { ((VendorPartMan)et).setPartManPoint(cti(vl)); }
    }
    public static class EpgPartManDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorPartMan)et).getPartManDate(); }
        public void write(Entity et, Object vl) { ((VendorPartMan)et).setPartManDate((java.util.Date)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_part_man";
    protected final String _tablePropertyName = "vendorPartMan";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_part_man", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPartManId = cci("part_man_id", "part_man_id", null, null, Integer.class, "partManId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPartManName = cci("part_man_name", "part_man_name", null, null, String.class, "partManName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPartManPoint = cci("part_man_point", "part_man_point", null, null, Integer.class, "partManPoint", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPartManDate = cci("part_man_date", "part_man_date", null, null, java.util.Date.class, "partManDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null);

    /**
     * part_man_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartManId() { return _columnPartManId; }
    /**
     * part_man_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartManName() { return _columnPartManName; }
    /**
     * part_man_point: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartManPoint() { return _columnPartManPoint; }
    /**
     * part_man_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartManDate() { return _columnPartManDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPartManId());
        ls.add(columnPartManName());
        ls.add(columnPartManPoint());
        ls.add(columnPartManDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPartManId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorPartMan"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorPartManCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorPartManBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorPartMan> getEntityType() { return VendorPartMan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorPartMan newEntity() { return new VendorPartMan(); }
    public VendorPartMan newMyEntity() { return new VendorPartMan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorPartMan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorPartMan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
