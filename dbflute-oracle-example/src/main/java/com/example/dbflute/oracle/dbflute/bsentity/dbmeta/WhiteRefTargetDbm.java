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
 * The DB meta of WHITE_REF_TARGET. (Singleton)
 * @author oracleman
 */
public class WhiteRefTargetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteRefTargetDbm _instance = new WhiteRefTargetDbm();
    private WhiteRefTargetDbm() {}
    public static WhiteRefTargetDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgRefTargetId(), "refTargetId");
        setupEpg(_epgMap, new EpgTargetId(), "targetId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgRefTargetId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteRefTarget)e).getRefTargetId(); }
        public void write(Entity e, Object v) { ((WhiteRefTarget)e).setRefTargetId(ctl(v)); }
    }
    public static class EpgTargetId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteRefTarget)e).getTargetId(); }
        public void write(Entity e, Object v) { ((WhiteRefTarget)e).setTargetId(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_REF_TARGET";
    protected final String _tablePropertyName = "whiteRefTarget";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_REF_TARGET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefTargetId = cci("REF_TARGET_ID", "REF_TARGET_ID", null, null, true, "refTargetId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTargetId = cci("TARGET_ID", "TARGET_ID", null, null, true, "targetId", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, "whiteTarget", null, null);

    public ColumnInfo columnRefTargetId() { return _columnRefTargetId; }
    public ColumnInfo columnTargetId() { return _columnTargetId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefTargetId());
        ls.add(columnTargetId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefTargetId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteTarget() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnTargetId(), WhiteTargetDbm.getInstance().columnTargetId());
        return cfi("FK_WHITE_REF_TARGET", "whiteTarget", this, WhiteTargetDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteRefTargetList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteRefTarget"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteRefTargetCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteRefTargetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteRefTarget> getEntityType() { return WhiteRefTarget.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteRefTarget newMyEntity() { return new WhiteRefTarget(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteRefTarget)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteRefTarget)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
