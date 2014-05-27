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
 * The DB meta of white_same_name_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSameNameRefDbm _instance = new WhiteSameNameRefDbm();
    private WhiteSameNameRefDbm() {}
    public static WhiteSameNameRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSameNameRefId(), "sameNameRefId");
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
        setupEpg(_epgMap, new EpgNextSameNameId(), "nextSameNameId");
    }
    public static class EpgSameNameRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRef)et).getSameNameRefId(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRef)et).setSameNameRefId(cti(vl)); }
    }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRef)et).getSameNameId(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRef)et).setSameNameId(ctl(vl)); }
    }
    public static class EpgNextSameNameId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRef)et).getNextSameNameId(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRef)et).setNextSameNameId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSameName(), "whiteSameName");
    }
    public class EfpgWhiteSameName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSameNameRef)et).getWhiteSameName(); }
        public void write(Entity et, Object vl) { ((WhiteSameNameRef)et).setWhiteSameName((WhiteSameName)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_same_name_ref";
    protected final String _tablePropertyName = "whiteSameNameRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_same_name_ref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameRefId = cci("same_name_ref_id", "same_name_ref_id", null, null, Integer.class, "sameNameRefId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, Long.class, "sameNameId", null, false, false, true, "int8", 19, 0, null, false, null, null, "whiteSameName", null, null);
    protected final ColumnInfo _columnNextSameNameId = cci("next_same_name_id", "next_same_name_id", null, null, Long.class, "nextSameNameId", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null);

    /**
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameRefId() { return _columnSameNameRefId; }
    /**
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    /**
     * next_same_name_id: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextSameNameId() { return _columnNextSameNameId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameRefId());
        ls.add(columnSameNameId());
        ls.add(columnNextSameNameId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSameName() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSameNameId(), WhiteSameNameDbm.getInstance().columnSameNameId());
        return cfi("fk_white_same_name_ref", "whiteSameName", this, WhiteSameNameDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteSameNameRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.WhiteSameNameRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.WhiteSameNameRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.WhiteSameNameRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSameNameRef> getEntityType() { return WhiteSameNameRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSameNameRef newMyEntity() { return new WhiteSameNameRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSameNameRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSameNameRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
