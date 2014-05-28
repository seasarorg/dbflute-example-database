package com.example.dbflute.tricky.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.tricky.dbflute.allcommon.*;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The DB meta of PRODUCT_CATEGORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductCategoryDbm _instance = new ProductCategoryDbm();
    private ProductCategoryDbm() {}
    public static ProductCategoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductCategoryCode(), "productCategoryCode");
        setupEpg(_epgMap, new EpgProductCategoryName(), "productCategoryName");
        setupEpg(_epgMap, new EpgParentCategoryCode(), "parentCategoryCode");
    }
    public static class EpgProductCategoryCode implements PropertyGateway {
        public Object read(Entity et) { return ((ProductCategory)et).getProductCategoryCode(); }
        public void write(Entity et, Object vl) { ((ProductCategory)et).setProductCategoryCode((String)vl); }
    }
    public static class EpgProductCategoryName implements PropertyGateway {
        public Object read(Entity et) { return ((ProductCategory)et).getProductCategoryName(); }
        public void write(Entity et, Object vl) { ((ProductCategory)et).setProductCategoryName((String)vl); }
    }
    public static class EpgParentCategoryCode implements PropertyGateway {
        public Object read(Entity et) { return ((ProductCategory)et).getParentCategoryCode(); }
        public void write(Entity et, Object vl) { ((ProductCategory)et).setParentCategoryCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PRODUCT_CATEGORY";
    protected final String _tablePropertyName = "productCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCategoryCode = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, null, String.class, "productCategoryCode", null, true, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductCategoryName = cci("PRODUCT_CATEGORY_NAME", "PRODUCT_CATEGORY_NAME", null, null, String.class, "productCategoryName", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentCategoryCode = cci("PARENT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", null, null, String.class, "parentCategoryCode", null, false, false, false, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);

    /**
     * PRODUCT_CATEGORY_CODE: {PK, NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    /**
     * PRODUCT_CATEGORY_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryName() { return _columnProductCategoryName; }
    /**
     * PARENT_CATEGORY_CODE: {TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentCategoryCode() { return _columnParentCategoryCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCategoryCode());
        ls.add(columnProductCategoryName());
        ls.add(columnParentCategoryCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductCategoryCode()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.ProductCategory"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.ProductCategoryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.ProductCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ProductCategory> getEntityType() { return ProductCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public ProductCategory newMyEntity() { return new ProductCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ProductCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ProductCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
