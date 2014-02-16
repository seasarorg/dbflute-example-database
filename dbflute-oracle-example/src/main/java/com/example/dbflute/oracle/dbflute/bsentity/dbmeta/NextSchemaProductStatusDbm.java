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
 * The DB meta of NEXT_SCHEMA_PRODUCT_STATUS. (Singleton)
 * @author oracleman
 */
public class NextSchemaProductStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextSchemaProductStatusDbm _instance = new NextSchemaProductStatusDbm();
    private NextSchemaProductStatusDbm() {}
    public static NextSchemaProductStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgProductStatusName(), "productStatusName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((NextSchemaProductStatus)et).getProductStatusCode(); }
        public void write(Entity et, Object vl) { ((NextSchemaProductStatus)et).setProductStatusCode((String)vl); }
    }
    public static class EpgProductStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((NextSchemaProductStatus)et).getProductStatusName(); }
        public void write(Entity et, Object vl) { ((NextSchemaProductStatus)et).setProductStatusName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NEXT_SCHEMA_PRODUCT_STATUS";
    protected final String _tablePropertyName = "nextSchemaProductStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("NEXTEXAMPLEDB.NEXT_SCHEMA_PRODUCT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "隣のスキステ";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "これのみえてよい";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, true, "productStatusCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "whiteRefNextTargetList,nextSchemaProductList", null);
    protected final ColumnInfo _columnProductStatusName = cci("PRODUCT_STATUS_NAME", "PRODUCT_STATUS_NAME", null, null, true, "productStatusName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteRefNextTargetList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), WhiteRefNextTargetDbm.getInstance().columnNextTargetCode());
        return cri("FK_WHITE_REF_NEXT_TARGET", "whiteRefNextTargetList", this, WhiteRefNextTargetDbm.getInstance(), mp, false, "nextSchemaProductStatus");
    }
    public ReferrerInfo referrerNextSchemaProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), NextSchemaProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_NEXT_SCHEMA_PRODUCT", "nextSchemaProductList", this, NextSchemaProductDbm.getInstance(), mp, false, "nextSchemaProductStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.NextSchemaProductStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.NextSchemaProductStatusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.NextSchemaProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextSchemaProductStatus> getEntityType() { return NextSchemaProductStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NextSchemaProductStatus newMyEntity() { return new NextSchemaProductStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextSchemaProductStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextSchemaProductStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
