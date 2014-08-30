package com.example.dbflute.firebird.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;

import com.example.dbflute.firebird.dbflute.allcommon.*;
import com.example.dbflute.firebird.dbflute.exentity.*;

/**
 * The DB meta of PRODUCT_STATUS. (Singleton)
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
    }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((ProductStatus)et).getProductStatusCode(); }
        public void write(Entity et, Object vl) { ((ProductStatus)et).setProductStatusCode((String)vl); }
    }
    public static class EpgProductStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((ProductStatus)et).getProductStatusName(); }
        public void write(Entity et, Object vl) { ((ProductStatus)et).setProductStatusName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PRODUCT_STATUS";
    protected final String _tablePropertyName = "productStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, true, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, "productList,summaryProductList", null);
    protected final ColumnInfo _columnProductStatusName = cci("PRODUCT_STATUS_NAME", "PRODUCT_STATUS_NAME", null, null, String.class, "productStatusName", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);

    /**
     * PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusName() { return _columnProductStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductStatusCode());
        ls.add(columnProductStatusName());
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_PRODUCT_PRODUCT_STATUS_CODE_PRODUCT_STATUS", "productList", this, ProductDbm.getInstance(), mp, false, "productStatus");
    }
    /**
     * SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSummaryProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), SummaryProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_SUMMARY_PRODUCT_PRODUCT_STATUS", "summaryProductList", this, SummaryProductDbm.getInstance(), mp, false, "productStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.ProductStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.ProductStatusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.ProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ProductStatus> getEntityType() { return ProductStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ProductStatus newEntity() { return new ProductStatus(); }
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
