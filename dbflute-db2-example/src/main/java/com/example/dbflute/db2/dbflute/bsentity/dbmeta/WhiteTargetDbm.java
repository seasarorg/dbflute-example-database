package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The DB meta of WHITE_TARGET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteTargetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTargetDbm _instance = new WhiteTargetDbm();
    private WhiteTargetDbm() {}
    public static WhiteTargetDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgTargetId(), "targetId");
        setupEpg(_epgMap, new EpgTargetName(), "targetName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgTargetId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTarget)e).getTargetId(); }
        public void write(Entity e, Object v) { ((WhiteTarget)e).setTargetId(ctl(v)); }
    }
    public static class EpgTargetName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTarget)e).getTargetName(); }
        public void write(Entity e, Object v) { ((WhiteTarget)e).setTargetName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_TARGET";
    protected final String _tablePropertyName = "whiteTarget";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_TARGET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTargetId = cci("TARGET_ID", "TARGET_ID", null, null, true, "targetId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, "whiteRefTargetList", null);
    protected final ColumnInfo _columnTargetName = cci("TARGET_NAME", "TARGET_NAME", null, null, false, "targetName", String.class, false, false, "VARCHAR", 256, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnTargetId() { return _columnTargetId; }
    public ColumnInfo columnTargetName() { return _columnTargetName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTargetId());
        ls.add(columnTargetName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTargetId()); }
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
    public ReferrerInfo referrerWhiteRefTargetList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnTargetId(), WhiteRefTargetDbm.getInstance().columnTargetId());
        return cri("FK_WHITE_REF_TARGET", "whiteRefTargetList", this, WhiteRefTargetDbm.getInstance(), map, false, "whiteTarget");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.WhiteTarget"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.WhiteTargetCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.WhiteTargetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTarget> getEntityType() { return WhiteTarget.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteTarget newMyEntity() { return new WhiteTarget(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteTarget)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteTarget)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
