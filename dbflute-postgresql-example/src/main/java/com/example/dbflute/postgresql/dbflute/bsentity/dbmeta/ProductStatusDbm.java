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
 * The DB meta of product_status. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductStatusDbm _instance = new ProductStatusDbm();
    private ProductStatusDbm() {}
    public static ProductStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgProductStatusName(), "productStatusName");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((ProductStatus)et).getProductStatusCode(); }
        public void write(Entity et, Object vl) { ((ProductStatus)et).setProductStatusCode((String)vl); }
    }
    public static class EpgProductStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((ProductStatus)et).getProductStatusName(); }
        public void write(Entity et, Object vl) { ((ProductStatus)et).setProductStatusName((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((ProductStatus)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((ProductStatus)et).setDisplayOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "product_status";
    protected final String _tablePropertyName = "productStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("product_status", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "商品ステータス";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "商品のステータスを表現する固定的なマスタ。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductStatusCode = cci("product_status_code", "product_status_code", null, "商品ステータスコード", String.class, "productStatusCode", null, true, false, true, "bpchar", 3, 0, null, false, null, "商品ステータスを識別するコード。", null, "productList", null);
    protected final ColumnInfo _columnProductStatusName = cci("product_status_name", "product_status_name", null, null, String.class, "productStatusName", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, null, Integer.class, "displayOrder", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null);

    /**
     * (商品ステータスコード)product_status_code: {PK, NotNull, bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * product_status_name: {NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusName() { return _columnProductStatusName; }
    /**
     * display_order: {UQ, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductStatusCode());
        ls.add(columnProductStatusName());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (商品)product by product_status_code, named 'productList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ProductDbm.getInstance().columnProductStatusCode());
        return cri("fk_product_product_status", "productList", this, ProductDbm.getInstance(), mp, false, "productStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.ProductStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.ProductStatusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.ProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ProductStatus> getEntityType() { return ProductStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public ProductStatus newMyEntity() { return new ProductStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ProductStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ProductStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
