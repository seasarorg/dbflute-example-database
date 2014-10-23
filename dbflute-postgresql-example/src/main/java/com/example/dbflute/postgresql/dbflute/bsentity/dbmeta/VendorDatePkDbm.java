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
 * The DB meta of vendor_date_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorDatePkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorDatePkDbm _instance = new VendorDatePkDbm();
    private VendorDatePkDbm() {}
    public static VendorDatePkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFooDate(), "fooDate");
        setupEpg(_epgMap, new EpgFooName(), "fooName");
    }
    public static class EpgFooDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDatePk)et).getFooDate(); }
        public void write(Entity et, Object vl) { ((VendorDatePk)et).setFooDate((java.util.Date)vl); }
    }
    public static class EpgFooName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDatePk)et).getFooName(); }
        public void write(Entity et, Object vl) { ((VendorDatePk)et).setFooName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_date_pk";
    protected final String _tablePropertyName = "vendorDatePk";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_date_pk", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooDate = cci("foo_date", "foo_date", null, null, java.util.Date.class, "fooDate", null, true, false, true, "date", 13, 0, null, false, null, null, null, "vendorDateFkList", null);
    protected final ColumnInfo _columnFooName = cci("foo_name", "foo_name", null, null, String.class, "fooName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null);

    /**
     * foo_date: {PK, NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooDate() { return _columnFooDate; }
    /**
     * foo_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooName() { return _columnFooName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooDate());
        ls.add(columnFooName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFooDate()); }
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
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorDateFkList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFooDate(), VendorDateFkDbm.getInstance().columnBarDate());
        return cri("fk_vendor_date_fk_pk", "vendorDateFkList", this, VendorDateFkDbm.getInstance(), mp, false, "vendorDatePk");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.VendorDatePk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.VendorDatePkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.VendorDatePkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorDatePk> getEntityType() { return VendorDatePk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorDatePk newEntity() { return new VendorDatePk(); }
    public VendorDatePk newMyEntity() { return new VendorDatePk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorDatePk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorDatePk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
