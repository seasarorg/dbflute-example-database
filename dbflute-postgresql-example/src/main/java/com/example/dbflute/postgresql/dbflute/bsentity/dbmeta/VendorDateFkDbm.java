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
 * The DB meta of vendor_date_fk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorDateFkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorDateFkDbm _instance = new VendorDateFkDbm();
    private VendorDateFkDbm() {}
    public static VendorDateFkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgBarId(), "barId");
        setupEpg(_epgMap, new EpgBarDate(), "barDate");
    }
    public static class EpgBarId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDateFk)et).getBarId(); }
        public void write(Entity et, Object vl) { ((VendorDateFk)et).setBarId(cti(vl)); }
    }
    public static class EpgBarDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDateFk)et).getBarDate(); }
        public void write(Entity et, Object vl) { ((VendorDateFk)et).setBarDate((java.util.Date)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgVendorDatePk(), "vendorDatePk");
    }
    public class EfpgVendorDatePk implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDateFk)et).getVendorDatePk(); }
        public void write(Entity et, Object vl) { ((VendorDateFk)et).setVendorDatePk((VendorDatePk)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_date_fk";
    protected final String _tablePropertyName = "vendorDateFk";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_date_fk", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBarId = cci("bar_id", "bar_id", null, null, Integer.class, "barId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDate = cci("bar_date", "bar_date", null, null, java.util.Date.class, "barDate", null, false, false, true, "date", 13, 0, null, false, null, null, "vendorDatePk", null, null);

    /**
     * bar_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarId() { return _columnBarId; }
    /**
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarDate() { return _columnBarDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBarId());
        ls.add(columnBarDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBarId()); }
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
    /**
     * vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorDatePk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBarDate(), VendorDatePkDbm.getInstance().columnFooDate());
        return cfi("fk_vendor_date_fk_pk", "vendorDatePk", this, VendorDatePkDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "vendorDateFkList");
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorDateFk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorDateFkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorDateFkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorDateFk> getEntityType() { return VendorDateFk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorDateFk newMyEntity() { return new VendorDateFk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorDateFk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorDateFk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
