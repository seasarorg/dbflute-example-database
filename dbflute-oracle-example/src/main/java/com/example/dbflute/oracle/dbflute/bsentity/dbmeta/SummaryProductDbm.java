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
 * The DB meta of SUMMARY_PRODUCT. (Singleton)
 * @author oracleman
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
        public void write(Entity et, Object vl) { ((SummaryProduct)et).setProductId(ctl(vl)); }
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

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgProductStatus(), "productStatus");
    }
    public class EfpgProductStatus implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryProduct)et).getProductStatus(); }
        public void write(Entity et, Object vl) { ((SummaryProduct)et).setProductStatus((ProductStatus)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SUMMARY_PRODUCT";
    protected final String _tablePropertyName = "summaryProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUMMARY_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "商品のさまりびゅー";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "VIEWのコメントもtableでやるんだって";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, null, String.class, "productName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "productStatus", null, null);
    protected final ColumnInfo _columnLatestPurchaseDatetime = cci("LATEST_PURCHASE_DATETIME", "LATEST_PURCHASE_DATETIME", null, null, java.sql.Timestamp.class, "latestPurchaseDatetime", null, false, false, false, "TIMESTAMP(3)", 11, 3, null, false, null, null, null, null, null);

    /**
     * PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to PRODUCT_STATUS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
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
    /**
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("FK_SUMMARY_PRODUCT_PRODUCT_STATUS", "productStatus", this, ProductStatusDbm.getInstance(), mp, 0, null, false, false, false, true, null, null, false, "summaryProductList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SummaryProduct"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SummaryProductCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SummaryProductBhv"; }

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
