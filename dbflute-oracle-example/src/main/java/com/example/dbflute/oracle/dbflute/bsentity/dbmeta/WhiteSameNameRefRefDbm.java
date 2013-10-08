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
 * The DB meta of WHITE_SAME_NAME_REF_REF. (Singleton)
 * @author oracleman
 */
public class WhiteSameNameRefRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSameNameRefRefDbm _instance = new WhiteSameNameRefRefDbm();
    private WhiteSameNameRefRefDbm() {}
    public static WhiteSameNameRefRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgRefRefId(), "refRefId");
        setupEpg(_epgMap, new EpgRefRefName(), "refRefName");
        setupEpg(_epgMap, new EpgRefRefDate(), "refRefDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgRefRefId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameNameRefRef)e).getRefRefId(); }
        public void write(Entity e, Object v) { ((WhiteSameNameRefRef)e).setRefRefId(ctl(v)); }
    }
    public static class EpgRefRefName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameNameRefRef)e).getRefRefName(); }
        public void write(Entity e, Object v) { ((WhiteSameNameRefRef)e).setRefRefName((String)v); }
    }
    public static class EpgRefRefDate implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameNameRefRef)e).getRefRefDate(); }
        public void write(Entity e, Object v) { ((WhiteSameNameRefRef)e).setRefRefDate((java.util.Date)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_SAME_NAME_REF_REF";
    protected final String _tablePropertyName = "whiteSameNameRefRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SAME_NAME_REF_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefRefId = cci("REF_REF_ID", "REF_REF_ID", null, null, true, "refRefId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefRefName = cci("REF_REF_NAME", "REF_REF_NAME", null, null, true, "refRefName", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefRefDate = cci("REF_REF_DATE", "REF_REF_DATE", null, null, true, "refRefDate", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnRefRefId() { return _columnRefRefId; }
    public ColumnInfo columnRefRefName() { return _columnRefRefName; }
    public ColumnInfo columnRefRefDate() { return _columnRefRefDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefRefId());
        ls.add(columnRefRefName());
        ls.add(columnRefRefDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefRefId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteSameNameRefRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteSameNameRefRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteSameNameRefRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSameNameRefRef> getEntityType() { return WhiteSameNameRefRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSameNameRefRef newMyEntity() { return new WhiteSameNameRefRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteSameNameRefRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteSameNameRefRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
