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
 * The DB meta of summary_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryProductDbm _instance = new SummaryProductDbm();
    private SummaryProductDbm() {}
    public static SummaryProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgProductName(), "productName");
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgLatestPurchaseDatetime(), "latestPurchaseDatetime");
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryProduct)et).getProductId(); }
        public void write(Entity et, Object vl) { ((SummaryProduct)et).setProductId(cti(vl)); }
    }
    public static class EpgProductName implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryProduct)et).getProductName(); }
        public void write(Entity et, Object vl) { ((SummaryProduct)et).setProductName((String)vl); }
    }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryProduct)et).getProductStatusCode(); }
        public void write(Entity et, Object vl) { ((SummaryProduct)et).setProductStatusCode((String)vl); }
    }
    public static class EpgLatestPurchaseDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryProduct)et).getLatestPurchaseDatetime(); }
        public void write(Entity et, Object vl) { ((SummaryProduct)et).setLatestPurchaseDatetime((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "summary_product";
    protected final String _tablePropertyName = "summaryProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("summary_product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, Integer.class, "productId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductName = cci("product_name", "product_name", null, null, String.class, "productName", null, false, false, false, "varchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductStatusCode = cci("product_status_code", "product_status_code", null, null, String.class, "productStatusCode", null, false, false, false, "bpchar", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnLatestPurchaseDatetime = cci("latest_purchase_datetime", "latest_purchase_datetime", null, null, java.sql.Timestamp.class, "latestPurchaseDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null);

    /**
     * product_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * product_name: {varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * product_status_code: {bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * latest_purchase_datetime: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLatestPurchaseDatetime() { return _columnLatestPurchaseDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductStatusCode());
        ls.add(columnLatestPurchaseDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.SummaryProduct"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.SummaryProductCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.SummaryProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryProduct> getEntityType() { return SummaryProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SummaryProduct newEntity() { return new SummaryProduct(); }
    public SummaryProduct newMyEntity() { return new SummaryProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SummaryProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SummaryProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
