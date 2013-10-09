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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSameNameRefId(), "sameNameRefId");
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
        setupEpg(_epgMap, new EpgNextSameNameId(), "nextSameNameId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSameNameRefId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameNameRef)e).getSameNameRefId(); }
        public void write(Entity e, Object v) { ((WhiteSameNameRef)e).setSameNameRefId(cti(v)); }
    }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameNameRef)e).getSameNameId(); }
        public void write(Entity e, Object v) { ((WhiteSameNameRef)e).setSameNameId(ctl(v)); }
    }
    public static class EpgNextSameNameId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSameNameRef)e).getNextSameNameId(); }
        public void write(Entity e, Object v) { ((WhiteSameNameRef)e).setNextSameNameId(ctl(v)); }
    }

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
    protected final ColumnInfo _columnSameNameRefId = cci("same_name_ref_id", "same_name_ref_id", null, null, true, "sameNameRefId", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, true, "sameNameId", Long.class, false, false, "int8", 19, 0, null, false, null, null, "whiteSameName", null, null);
    protected final ColumnInfo _columnNextSameNameId = cci("next_same_name_id", "next_same_name_id", null, null, true, "nextSameNameId", Long.class, false, false, "int8", 19, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSameNameRefId() { return _columnSameNameRefId; }
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteSameName() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSameNameId(), WhiteSameNameDbm.getInstance().columnSameNameId());
        return cfi("fk_white_same_name_ref", "whiteSameName", this, WhiteSameNameDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteSameNameRefList");
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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteSameNameRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteSameNameRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
