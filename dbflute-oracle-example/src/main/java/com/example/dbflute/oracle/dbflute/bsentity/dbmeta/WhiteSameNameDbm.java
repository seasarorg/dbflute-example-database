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
 * The DB meta of WHITE_SAME_NAME. (Singleton)
 * @author oracleman
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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
        setupEpg(_epgMap, new EpgSameNameName(), "sameNameName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameName)e).getSameNameId(); }
        public void write(Entity e, Object v) { ((WhiteSameName)e).setSameNameId(ctl(v)); }
    }
    public static class EpgSameNameName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameName)e).getSameNameName(); }
        public void write(Entity e, Object v) { ((WhiteSameName)e).setSameNameName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_SAME_NAME";
    protected final String _tablePropertyName = "whiteSameName";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SAME_NAME", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameId = cci("SAME_NAME_ID", "SAME_NAME_ID", null, null, true, "sameNameId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameName = cci("SAME_NAME_NAME", "SAME_NAME_NAME", null, null, true, "sameNameName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    public ColumnInfo columnSameNameName() { return _columnSameNameName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameId());
        ls.add(columnSameNameName());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteSameName"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteSameNameCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteSameNameBhv"; }

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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteSameName)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteSameName)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
