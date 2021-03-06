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
 * The DB meta of WHITE_REF_NEXT_TARGET. (Singleton)
 * @author oracleman
 */
public class WhiteRefNextTargetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteRefNextTargetDbm _instance = new WhiteRefNextTargetDbm();
    private WhiteRefNextTargetDbm() {}
    public static WhiteRefNextTargetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRefNextTargetId(), "refNextTargetId");
        setupEpg(_epgMap, new EpgNextTargetCode(), "nextTargetCode");
    }
    public static class EpgRefNextTargetId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteRefNextTarget)et).getRefNextTargetId(); }
        public void write(Entity et, Object vl) { ((WhiteRefNextTarget)et).setRefNextTargetId(ctl(vl)); }
    }
    public static class EpgNextTargetCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteRefNextTarget)et).getNextTargetCode(); }
        public void write(Entity et, Object vl) { ((WhiteRefNextTarget)et).setNextTargetCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgNextSchemaProductStatus(), "nextSchemaProductStatus");
    }
    public class EfpgNextSchemaProductStatus implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteRefNextTarget)et).getNextSchemaProductStatus(); }
        public void write(Entity et, Object vl) { ((WhiteRefNextTarget)et).setNextSchemaProductStatus((NextSchemaProductStatus)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_REF_NEXT_TARGET";
    protected final String _tablePropertyName = "whiteRefNextTarget";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_REF_NEXT_TARGET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefNextTargetId = cci("REF_NEXT_TARGET_ID", "REF_NEXT_TARGET_ID", null, null, Long.class, "refNextTargetId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNextTargetCode = cci("NEXT_TARGET_CODE", "NEXT_TARGET_CODE", null, null, String.class, "nextTargetCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "nextSchemaProductStatus", null, null);

    /**
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefNextTargetId() { return _columnRefNextTargetId; }
    /**
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextTargetCode() { return _columnNextTargetCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefNextTargetId());
        ls.add(columnNextTargetCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefNextTargetId()); }
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
    /**
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignNextSchemaProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextTargetCode(), NextSchemaProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("FK_WHITE_REF_NEXT_TARGET", "nextSchemaProductStatus", this, NextSchemaProductStatusDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteRefNextTargetList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteRefNextTarget"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteRefNextTargetCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteRefNextTargetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteRefNextTarget> getEntityType() { return WhiteRefNextTarget.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteRefNextTarget newEntity() { return new WhiteRefNextTarget(); }
    public WhiteRefNextTarget newMyEntity() { return new WhiteRefNextTarget(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteRefNextTarget)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteRefNextTarget)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
