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
 * The DB meta of SYNONYM_REF_EXCEPT. (Singleton)
 * @author oracleman
 */
public class SynonymRefExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymRefExceptDbm _instance = new SynonymRefExceptDbm();
    private SynonymRefExceptDbm() {}
    public static SynonymRefExceptDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgRefExceptId(), "refExceptId");
        setupEpg(_epgMap, new EpgExceptId(), "exceptId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgRefExceptId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymRefExcept)et).getRefExceptId(); }
        public void write(Entity et, Object vl) { ((SynonymRefExcept)et).setRefExceptId(ctl(vl)); }
    }
    public static class EpgExceptId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymRefExcept)et).getExceptId(); }
        public void write(Entity et, Object vl) { ((SynonymRefExcept)et).setExceptId(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_REF_EXCEPT";
    protected final String _tablePropertyName = "synonymRefExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_REF_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefExceptId = cci("REF_EXCEPT_ID", "REF_EXCEPT_ID", null, null, true, "refExceptId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, true, "exceptId", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, "synonymExcept", null, null);

    public ColumnInfo columnRefExceptId() { return _columnRefExceptId; }
    public ColumnInfo columnExceptId() { return _columnExceptId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefExceptId());
        ls.add(columnExceptId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefExceptId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignSynonymExcept() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnExceptId(), SynonymExceptDbm.getInstance().columnExceptId());
        return cfi("FK_WHITE_REF_EXCEPT_SYNONYM1", "synonymExcept", this, SynonymExceptDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "synonymRefExceptList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymRefExcept"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymRefExceptCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymRefExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymRefExcept> getEntityType() { return SynonymRefExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SynonymRefExcept newMyEntity() { return new SynonymRefExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymRefExcept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymRefExcept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
