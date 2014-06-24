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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgRefRefId(), "refRefId");
        setupEpg(_epgMap, new EpgRefRefName(), "refRefName");
        setupEpg(_epgMap, new EpgRefRefDate(), "refRefDate");
    }
    public static class EpgRefRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRefRef)et).getRefRefId(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRefRef)et).setRefRefId(ctl(vl)); }
    }
    public static class EpgRefRefName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRefRef)et).getRefRefName(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRefRef)et).setRefRefName((String)vl); }
    }
    public static class EpgRefRefDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRefRef)et).getRefRefDate(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRefRef)et).setRefRefDate((java.util.Date)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnRefRefId = cci("REF_REF_ID", "REF_REF_ID", null, null, Long.class, "refRefId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefRefName = cci("REF_REF_NAME", "REF_REF_NAME", null, null, String.class, "refRefName", null, false, false, true, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefRefDate = cci("REF_REF_DATE", "REF_REF_DATE", null, null, java.util.Date.class, "refRefDate", null, false, false, true, "DATE", 7, 0, null, false, null, null, null, null, null);

    /**
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefRefId() { return _columnRefRefId; }
    /**
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefRefName() { return _columnRefRefName; }
    /**
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
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
    public WhiteSameNameRefRef newEntity() { return new WhiteSameNameRefRef(); }
    public WhiteSameNameRefRef newMyEntity() { return new WhiteSameNameRefRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSameNameRefRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSameNameRefRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
