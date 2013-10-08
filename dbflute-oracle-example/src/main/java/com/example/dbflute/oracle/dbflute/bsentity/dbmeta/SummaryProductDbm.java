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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgProductName(), "productName");
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgLatestPurchaseDatetime(), "latestPurchaseDatetime");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryProduct)e).getProductId(); }
        public void write(Entity e, Object v) { ((SummaryProduct)e).setProductId(ctl(v)); }
    }
    public static class EpgProductName implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryProduct)e).getProductName(); }
        public void write(Entity e, Object v) { ((SummaryProduct)e).setProductName((String)v); }
    }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryProduct)e).getProductStatusCode(); }
        public void write(Entity e, Object v) { ((SummaryProduct)e).setProductStatusCode((String)v); }
    }
    public static class EpgLatestPurchaseDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryProduct)e).getLatestPurchaseDatetime(); }
        public void write(Entity e, Object v) { ((SummaryProduct)e).setLatestPurchaseDatetime((java.sql.Timestamp)v); }
    }

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
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, true, "productId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, null, true, "productName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, true, "productStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "productStatus", null, null);
    protected final ColumnInfo _columnLatestPurchaseDatetime = cci("LATEST_PURCHASE_DATETIME", "LATEST_PURCHASE_DATETIME", null, null, false, "latestPurchaseDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP(3)", 11, 3, null, false, null, null, null, null, null);

    public ColumnInfo columnProductId() { return _columnProductId; }
    public ColumnInfo columnProductName() { return _columnProductName; }
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
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
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignProductStatus() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnProductStatusCode(), ProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("FK_SUMMARY_PRODUCT_PRODUCT_STATUS", "productStatus", this, ProductStatusDbm.getInstance(), map, 0, false, false, false, true, null, null, false, "summaryProductList");
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
    public Entity newEntity() { return newMyEntity(); }
    public SummaryProduct newMyEntity() { return new SummaryProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SummaryProduct)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SummaryProduct)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
