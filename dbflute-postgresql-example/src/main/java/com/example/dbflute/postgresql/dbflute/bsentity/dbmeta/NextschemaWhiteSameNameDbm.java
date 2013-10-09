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
 * The DB meta of nextschema.white_same_name. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class NextschemaWhiteSameNameDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextschemaWhiteSameNameDbm _instance = new NextschemaWhiteSameNameDbm();
    private NextschemaWhiteSameNameDbm() {}
    public static NextschemaWhiteSameNameDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
        setupEpg(_epgMap, new EpgSameNameName(), "sameNameName");
        setupEpg(_epgMap, new EpgSameNameLong(), "sameNameLong");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity e) { return ((NextschemaWhiteSameName)e).getSameNameId(); }
        public void write(Entity e, Object v) { ((NextschemaWhiteSameName)e).setSameNameId(cti(v)); }
    }
    public static class EpgSameNameName implements PropertyGateway {
        public Object read(Entity e) { return ((NextschemaWhiteSameName)e).getSameNameName(); }
        public void write(Entity e, Object v) { ((NextschemaWhiteSameName)e).setSameNameName((String)v); }
    }
    public static class EpgSameNameLong implements PropertyGateway {
        public Object read(Entity e) { return ((NextschemaWhiteSameName)e).getSameNameLong(); }
        public void write(Entity e, Object v) { ((NextschemaWhiteSameName)e).setSameNameLong(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "nextschema.white_same_name";
    protected final String _tablePropertyName = "whiteSameName";
    protected final TableSqlName _tableSqlName = new TableSqlName("nextschema.white_same_name", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, true, "sameNameId", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, "whiteSameNameRefList", null);
    protected final ColumnInfo _columnSameNameName = cci("same_name_name", "same_name_name", null, null, false, "sameNameName", String.class, false, false, "varchar", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameLong = cci("same_name_long", "same_name_long", null, null, false, "sameNameLong", Long.class, false, false, "int8", 19, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    public ColumnInfo columnSameNameName() { return _columnSameNameName; }
    public ColumnInfo columnSameNameLong() { return _columnSameNameLong; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameId());
        ls.add(columnSameNameName());
        ls.add(columnSameNameLong());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameId()); }
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
    public ReferrerInfo referrerWhiteSameNameRefList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSameNameId(), NextschemaWhiteSameNameRefDbm.getInstance().columnSameNameId());
        return cri("fk_white_same_name_ref", "whiteSameNameRefList", this, NextschemaWhiteSameNameRefDbm.getInstance(), map, false, "whiteSameName");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.NextschemaWhiteSameName"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.NextschemaWhiteSameNameCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.NextschemaWhiteSameNameBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextschemaWhiteSameName> getEntityType() { return NextschemaWhiteSameName.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NextschemaWhiteSameName newMyEntity() { return new NextschemaWhiteSameName(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((NextschemaWhiteSameName)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((NextschemaWhiteSameName)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
