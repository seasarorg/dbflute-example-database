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
 * The DB meta of SYNONYM_EXCEPT. (Singleton)
 * @author oracleman
 */
public class SynonymExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymExceptDbm _instance = new SynonymExceptDbm();
    private SynonymExceptDbm() {}
    public static SynonymExceptDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgExceptId(), "exceptId");
        setupEpg(_epgMap, new EpgExceptName(), "exceptName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgExceptId implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymExcept)e).getExceptId(); }
        public void write(Entity e, Object v) { ((SynonymExcept)e).setExceptId(ctl(v)); }
    }
    public static class EpgExceptName implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymExcept)e).getExceptName(); }
        public void write(Entity e, Object v) { ((SynonymExcept)e).setExceptName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_EXCEPT";
    protected final String _tablePropertyName = "synonymExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, true, "exceptId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, "synonymRefExceptList", null);
    protected final ColumnInfo _columnExceptName = cci("EXCEPT_NAME", "EXCEPT_NAME", null, null, false, "exceptName", String.class, false, false, "VARCHAR2", 256, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnExceptId() { return _columnExceptId; }
    public ColumnInfo columnExceptName() { return _columnExceptName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnExceptId());
        ls.add(columnExceptName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnExceptId()); }
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
    public ReferrerInfo referrerSynonymRefExceptList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnExceptId(), SynonymRefExceptDbm.getInstance().columnExceptId());
        return cri("FK_WHITE_REF_EXCEPT_SYNONYM1", "synonymRefExceptList", this, SynonymRefExceptDbm.getInstance(), map, false, "synonymExcept");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymExcept"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymExceptCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymExcept> getEntityType() { return SynonymExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SynonymExcept newMyEntity() { return new SynonymExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SynonymExcept)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SynonymExcept)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
