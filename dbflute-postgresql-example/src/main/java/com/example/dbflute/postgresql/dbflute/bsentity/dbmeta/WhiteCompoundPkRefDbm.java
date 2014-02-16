package com.example.dbflute.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The DB meta of white_compound_pk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefDbm _instance = new WhiteCompoundPkRefDbm();
    private WhiteCompoundPkRefDbm() {}
    public static WhiteCompoundPkRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMultipleFirstId(), "multipleFirstId");
        setupEpg(_epgMap, new EpgMultipleSecondId(), "multipleSecondId");
        setupEpg(_epgMap, new EpgRefFirstId(), "refFirstId");
        setupEpg(_epgMap, new EpgRefSecondId(), "refSecondId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMultipleFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getMultipleFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setMultipleFirstId(cti(vl)); }
    }
    public static class EpgMultipleSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getMultipleSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setMultipleSecondId(cti(vl)); }
    }
    public static class EpgRefFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getRefFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setRefFirstId(cti(vl)); }
    }
    public static class EpgRefSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getRefSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setRefSecondId(cti(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_ref";
    protected final String _tablePropertyName = "whiteCompoundPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_compound_pk_ref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMultipleFirstId = cci("multiple_first_id", "multiple_first_id", null, null, true, "multipleFirstId", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMultipleSecondId = cci("multiple_second_id", "multiple_second_id", null, null, true, "multipleSecondId", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefFirstId = cci("ref_first_id", "ref_first_id", null, null, true, "refFirstId", Integer.class, false, false, "int4", 10, 0, null, false, null, null, "whiteCompoundPk", null, null);
    protected final ColumnInfo _columnRefSecondId = cci("ref_second_id", "ref_second_id", null, null, true, "refSecondId", Integer.class, false, false, "int4", 10, 0, null, false, null, null, "whiteCompoundPk", null, null);

    public ColumnInfo columnMultipleFirstId() { return _columnMultipleFirstId; }
    public ColumnInfo columnMultipleSecondId() { return _columnMultipleSecondId; }
    public ColumnInfo columnRefFirstId() { return _columnRefFirstId; }
    public ColumnInfo columnRefSecondId() { return _columnRefSecondId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        ls.add(columnRefFirstId());
        ls.add(columnRefSecondId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteCompoundPk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnRefFirstId(), WhiteCompoundPkDbm.getInstance().columnPkFirstId());
        mp.put(columnRefSecondId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cfi("fk_white_compound_pk_ref", "whiteCompoundPk", this, WhiteCompoundPkDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "whiteCompoundPkRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.WhiteCompoundPkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.WhiteCompoundPkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.WhiteCompoundPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRef> getEntityType() { return WhiteCompoundPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteCompoundPkRef newMyEntity() { return new WhiteCompoundPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
