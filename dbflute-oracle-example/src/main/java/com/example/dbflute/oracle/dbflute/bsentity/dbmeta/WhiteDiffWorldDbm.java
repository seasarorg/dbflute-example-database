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
 * The DB meta of WHITE_DIFF_WORLD. (Singleton)
 * @author oracleman
 */
public class WhiteDiffWorldDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDiffWorldDbm _instance = new WhiteDiffWorldDbm();
    private WhiteDiffWorldDbm() {}
    public static WhiteDiffWorldDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgDiffWorldId(), "diffWorldId");
        setupEpg(_epgMap, new EpgDiffWorldName(), "diffWorldName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgDiffWorldId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDiffWorld)e).getDiffWorldId(); }
        public void write(Entity e, Object v) { ((WhiteDiffWorld)e).setDiffWorldId(ctl(v)); }
    }
    public static class EpgDiffWorldName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDiffWorld)e).getDiffWorldName(); }
        public void write(Entity e, Object v) { ((WhiteDiffWorld)e).setDiffWorldName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DIFF_WORLD";
    protected final String _tablePropertyName = "whiteDiffWorld";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DIFF_WORLD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDiffWorldId = cci("DIFF_WORLD_ID", "DIFF_WORLD_ID", null, null, true, "diffWorldId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDiffWorldName = cci("DIFF_WORLD_NAME", "DIFF_WORLD_NAME", null, null, true, "diffWorldName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnDiffWorldId() { return _columnDiffWorldId; }
    public ColumnInfo columnDiffWorldName() { return _columnDiffWorldName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDiffWorldId());
        ls.add(columnDiffWorldName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDiffWorldId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteDiffWorld"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteDiffWorldCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteDiffWorldBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDiffWorld> getEntityType() { return WhiteDiffWorld.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteDiffWorld newMyEntity() { return new WhiteDiffWorld(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteDiffWorld)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteDiffWorld)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
