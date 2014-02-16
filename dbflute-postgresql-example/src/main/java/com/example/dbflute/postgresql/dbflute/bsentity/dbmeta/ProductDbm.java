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
 * The DB meta of product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductDbm _instance = new ProductDbm();
    private ProductDbm() {}
    public static ProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductHandleCode(), "productHandleCode");
        setupEpg(_epgMap, new EpgProductCategoryCode(), "productCategoryCode");
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgRegularPrice(), "regularPrice");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getProductId(); }
        public void write(Entity et, Object vl) { ((Product)et).setProductId(cti(vl)); }
    }
    public static class EpgProductName implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getProductName(); }
        public void write(Entity et, Object vl) { ((Product)et).setProductName((String)vl); }
    }
    public static class EpgProductHandleCode implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getProductHandleCode(); }
        public void write(Entity et, Object vl) { ((Product)et).setProductHandleCode((String)vl); }
    }
    public static class EpgProductCategoryCode implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getProductCategoryCode(); }
        public void write(Entity et, Object vl) { ((Product)et).setProductCategoryCode((String)vl); }
    }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getProductStatusCode(); }
        public void write(Entity et, Object vl) { ((Product)et).setProductStatusCode((String)vl); }
    }
    public static class EpgRegularPrice implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getRegularPrice(); }
        public void write(Entity et, Object vl) { ((Product)et).setRegularPrice(cti(vl)); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((Product)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((Product)et).setRegisterUser((String)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((Product)et).setRegisterProcess((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((Product)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((Product)et).setUpdateUser((String)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((Product)et).setUpdateProcess((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((Product)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((Product)et).setVersionNo(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "product";
    protected final String _tablePropertyName = "product";
    protected final TableSqlName _tableSqlName = new TableSqlName("product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "商品";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, true, "productId", Integer.class, true, true, "serial", 10, 0, "nextval('product_product_id_seq'::regclass)", false, null, null, null, "purchaseList", null);
    protected final ColumnInfo _columnProductName = cci("product_name", "product_name", null, "商品名称", true, "productName", String.class, false, false, "varchar", 50, 0, null, false, null, "ExampleDBとして、コメントの少ないケースを表現するため、\nあえてコメントを控えている。実業務ではしっかりとコメントを\n入れることが強く強く推奨される。", null, null, null);
    protected final ColumnInfo _columnProductHandleCode = cci("product_handle_code", "product_handle_code", null, "商品ハンドルコード", true, "productHandleCode", String.class, false, false, "varchar", 100, 0, null, false, null, "商品を識別する業務上のコード。", null, null, null);
    protected final ColumnInfo _columnProductCategoryCode = cci("product_category_code", "product_category_code", null, null, true, "productCategoryCode", String.class, false, false, "bpchar", 3, 0, null, false, null, null, "productCategory", null, null);
    protected final ColumnInfo _columnProductStatusCode = cci("product_status_code", "product_status_code", null, null, true, "productStatusCode", String.class, false, false, "bpchar", 3, 0, null, false, null, null, "productStatus", null, null);
    protected final ColumnInfo _columnRegularPrice = cci("regular_price", "regular_price", null, null, true, "regularPrice", Integer.class, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, true, "registerUser", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, true, "registerProcess", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, true, "updateUser", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, true, "updateProcess", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, true, "versionNo", Long.class, false, false, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnProductId() { return _columnProductId; }
    public ColumnInfo columnProductName() { return _columnProductName; }
    public ColumnInfo columnProductHandleCode() { return _columnProductHandleCode; }
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    public ColumnInfo columnRegularPrice() { return _columnRegularPrice; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductCategoryCode());
        ls.add(columnProductStatusCode());
        ls.add(columnRegularPrice());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
        ls.add(columnVersionNo());
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
    public ForeignInfo foreignProductCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("fk_product_product_category", "productCategory", this, ProductCategoryDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "productList");
    }
    public ForeignInfo foreignProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("fk_product_product_status", "productStatus", this, ProductStatusDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "productList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), PurchaseDbm.getInstance().columnProductId());
        return cri("fk_purchase_product", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "product");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "product_product_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.Product"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.ProductCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.ProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Product> getEntityType() { return Product.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Product newMyEntity() { return new Product(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Product)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Product)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
