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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgExceptId(), "exceptId");
        setupEpg(_epgMap, new EpgExceptName(), "exceptName");
    }
    public static class EpgExceptId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymExcept)et).getExceptId(); }
        public void write(Entity et, Object vl) { ((SynonymExcept)et).setExceptId(ctl(vl)); }
    }
    public static class EpgExceptName implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymExcept)et).getExceptName(); }
        public void write(Entity et, Object vl) { ((SynonymExcept)et).setExceptName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, Long.class, "exceptId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, "synonymRefExceptList", null);
    protected final ColumnInfo _columnExceptName = cci("EXCEPT_NAME", "EXCEPT_NAME", null, null, String.class, "exceptName", null, false, false, false, "VARCHAR2", 256, 0, null, false, null, null, null, null, null);

    /**
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptId() { return _columnExceptId; }
    /**
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @return The information object of specified column. (NotNull)
     */
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSynonymRefExceptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnExceptId(), SynonymRefExceptDbm.getInstance().columnExceptId());
        return cri("FK_WHITE_REF_EXCEPT_SYNONYM1", "synonymRefExceptList", this, SynonymRefExceptDbm.getInstance(), mp, false, "synonymExcept");
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
    public SynonymExcept newEntity() { return new SynonymExcept(); }
    public SynonymExcept newMyEntity() { return new SynonymExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymExcept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymExcept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
