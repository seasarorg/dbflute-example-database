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
 * The DB meta of next_schema_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class NextSchemaProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextSchemaProductDbm _instance = new NextSchemaProductDbm();
    private NextSchemaProductDbm() {}
    public static NextSchemaProductDbm getInstance() { return _instance; }

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
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((NextSchemaProduct)et).getProductId(); }
        public void write(Entity et, Object vl) { ((NextSchemaProduct)et).setProductId(cti(vl)); }
    }
    public static class EpgProductName implements PropertyGateway {
        public Object read(Entity et) { return ((NextSchemaProduct)et).getProductName(); }
        public void write(Entity et, Object vl) { ((NextSchemaProduct)et).setProductName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "next_schema_product";
    protected final String _tablePropertyName = "nextSchemaProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("nextschema.next_schema_product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, Integer.class, "productId", null, true, true, true, "serial", 10, 0, "nextval('nextschema.next_schema_product_product_id_seq'::regclass)", false, null, null, null, "whiteSameNameList", null);
    protected final ColumnInfo _columnProductName = cci("product_name", "product_name", null, null, String.class, "productName", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);

    /**
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * product_name: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
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
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSameNameList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhiteSameNameDbm.getInstance().columnNextSchemaProductId());
        return cri("FK_WHITE_SAME_NAME_NEXT_SCHEMA_PRODUCT", "whiteSameNameList", this, WhiteSameNameDbm.getInstance(), mp, false, "nextSchemaProduct");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "nextschema.next_schema_product_product_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.NextSchemaProduct"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.NextSchemaProductCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.NextSchemaProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextSchemaProduct> getEntityType() { return NextSchemaProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NextSchemaProduct newMyEntity() { return new NextSchemaProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextSchemaProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextSchemaProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
