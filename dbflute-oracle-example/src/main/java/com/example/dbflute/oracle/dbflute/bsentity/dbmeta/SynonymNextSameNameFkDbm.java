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
 * The DB meta of SYNONYM_NEXT_SAME_NAME_FK. (Singleton)
 * @author oracleman
 */
public class SynonymNextSameNameFkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymNextSameNameFkDbm _instance = new SynonymNextSameNameFkDbm();
    private SynonymNextSameNameFkDbm() {}
    public static SynonymNextSameNameFkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRefId(), "refId");
        setupEpg(_epgMap, new EpgRefName(), "refName");
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
    }
    public static class EpgRefId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextSameNameFk)et).getRefId(); }
        public void write(Entity et, Object vl) { ((SynonymNextSameNameFk)et).setRefId(ctl(vl)); }
    }
    public static class EpgRefName implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextSameNameFk)et).getRefName(); }
        public void write(Entity et, Object vl) { ((SynonymNextSameNameFk)et).setRefName((String)vl); }
    }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextSameNameFk)et).getSameNameId(); }
        public void write(Entity et, Object vl) { ((SynonymNextSameNameFk)et).setSameNameId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_NEXT_SAME_NAME_FK";
    protected final String _tablePropertyName = "synonymNextSameNameFk";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_NEXT_SAME_NAME_FK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefId = cci("REF_ID", "REF_ID", null, null, Long.class, "refId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefName = cci("REF_NAME", "REF_NAME", null, null, String.class, "refName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameId = cci("SAME_NAME_ID", "SAME_NAME_ID", null, null, Long.class, "sameNameId", null, false, false, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);

    /**
     * REF_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefId() { return _columnRefId; }
    /**
     * REF_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefName() { return _columnRefName; }
    /**
     * SAME_NAME_ID: {NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefId());
        ls.add(columnRefName());
        ls.add(columnSameNameId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymNextSameNameFk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymNextSameNameFkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymNextSameNameFkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymNextSameNameFk> getEntityType() { return SynonymNextSameNameFk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SynonymNextSameNameFk newMyEntity() { return new SynonymNextSameNameFk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymNextSameNameFk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymNextSameNameFk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
