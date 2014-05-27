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
 * The DB meta of white_same_name. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSameNameDbm _instance = new WhiteSameNameDbm();
    private WhiteSameNameDbm() {}
    public static WhiteSameNameDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
        setupEpg(_epgMap, new EpgSameNameName(), "sameNameName");
        setupEpg(_epgMap, new EpgSameNameInteger(), "sameNameInteger");
        setupEpg(_epgMap, new EpgNextSchemaProductId(), "nextSchemaProductId");
    }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameName)et).getSameNameId(); }
        public void write(Entity et, Object vl) { ((WhiteSameName)et).setSameNameId(ctl(vl)); }
    }
    public static class EpgSameNameName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameName)et).getSameNameName(); }
        public void write(Entity et, Object vl) { ((WhiteSameName)et).setSameNameName((String)vl); }
    }
    public static class EpgSameNameInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameName)et).getSameNameInteger(); }
        public void write(Entity et, Object vl) { ((WhiteSameName)et).setSameNameInteger(cti(vl)); }
    }
    public static class EpgNextSchemaProductId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameName)et).getNextSchemaProductId(); }
        public void write(Entity et, Object vl) { ((WhiteSameName)et).setNextSchemaProductId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgNextSchemaProduct(), "nextSchemaProduct");
    }
    public class EfpgNextSchemaProduct implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameName)et).getNextSchemaProduct(); }
        public void write(Entity et, Object vl) { ((WhiteSameName)et).setNextSchemaProduct((NextSchemaProduct)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_same_name";
    protected final String _tablePropertyName = "whiteSameName";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_same_name", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, Long.class, "sameNameId", null, true, false, true, "int8", 19, 0, null, false, null, null, null, "whiteSameNameRefList", null);
    protected final ColumnInfo _columnSameNameName = cci("same_name_name", "same_name_name", null, null, String.class, "sameNameName", null, false, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameInteger = cci("same_name_integer", "same_name_integer", null, null, Integer.class, "sameNameInteger", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNextSchemaProductId = cci("next_schema_product_id", "next_schema_product_id", null, null, Integer.class, "nextSchemaProductId", null, false, false, false, "int4", 10, 0, null, false, null, null, "nextSchemaProduct", null, null);

    /**
     * same_name_id: {PK, NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    /**
     * same_name_name: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameName() { return _columnSameNameName; }
    /**
     * same_name_integer: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameInteger() { return _columnSameNameInteger; }
    /**
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextSchemaProductId() { return _columnNextSchemaProductId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameId());
        ls.add(columnSameNameName());
        ls.add(columnSameNameInteger());
        ls.add(columnNextSchemaProductId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameId()); }
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
    /**
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignNextSchemaProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextSchemaProductId(), NextSchemaProductDbm.getInstance().columnProductId());
        return cfi("FK_WHITE_SAME_NAME_NEXT_SCHEMA_PRODUCT", "nextSchemaProduct", this, NextSchemaProductDbm.getInstance(), mp, 0, null, false, false, false, true, null, null, false, "whiteSameNameList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSameNameRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSameNameId(), WhiteSameNameRefDbm.getInstance().columnSameNameId());
        return cri("fk_white_same_name_ref", "whiteSameNameRefList", this, WhiteSameNameRefDbm.getInstance(), mp, false, "whiteSameName");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.WhiteSameName"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.WhiteSameNameCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.WhiteSameNameBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSameName> getEntityType() { return WhiteSameName.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSameName newMyEntity() { return new WhiteSameName(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSameName)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSameName)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
