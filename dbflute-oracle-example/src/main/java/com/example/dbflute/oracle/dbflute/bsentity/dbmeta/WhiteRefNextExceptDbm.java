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
 * The DB meta of WHITE_REF_NEXT_EXCEPT. (Singleton)
 * @author oracleman
 */
public class WhiteRefNextExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteRefNextExceptDbm _instance = new WhiteRefNextExceptDbm();
    private WhiteRefNextExceptDbm() {}
    public static WhiteRefNextExceptDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgRefNextExceptId(), "refNextExceptId");
        setupEpg(_epgMap, new EpgNextExceptCode(), "nextExceptCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgRefNextExceptId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteRefNextExcept)e).getRefNextExceptId(); }
        public void write(Entity e, Object v) { ((WhiteRefNextExcept)e).setRefNextExceptId(ctl(v)); }
    }
    public static class EpgNextExceptCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteRefNextExcept)e).getNextExceptCode(); }
        public void write(Entity e, Object v) { ((WhiteRefNextExcept)e).setNextExceptCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_REF_NEXT_EXCEPT";
    protected final String _tablePropertyName = "whiteRefNextExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_REF_NEXT_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefNextExceptId = cci("REF_NEXT_EXCEPT_ID", "REF_NEXT_EXCEPT_ID", null, null, true, "refNextExceptId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNextExceptCode = cci("NEXT_EXCEPT_CODE", "NEXT_EXCEPT_CODE", null, null, true, "nextExceptCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnRefNextExceptId() { return _columnRefNextExceptId; }
    public ColumnInfo columnNextExceptCode() { return _columnNextExceptCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefNextExceptId());
        ls.add(columnNextExceptCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefNextExceptId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteRefNextExcept"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteRefNextExceptCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteRefNextExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteRefNextExcept> getEntityType() { return WhiteRefNextExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteRefNextExcept newMyEntity() { return new WhiteRefNextExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteRefNextExcept)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteRefNextExcept)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
