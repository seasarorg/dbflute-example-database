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
 * The DB meta of white_not_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteNotPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteNotPkDbm _instance = new WhiteNotPkDbm();
    private WhiteNotPkDbm() {}
    public static WhiteNotPkDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgNotPkId(), "notPkId");
        setupEpg(_epgMap, new EpgNotPkName(), "notPkName");
        setupEpg(_epgMap, new EpgNotPkInteger(), "notPkInteger");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgNotPkId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteNotPk)e).getNotPkId(); }
        public void write(Entity e, Object v) { ((WhiteNotPk)e).setNotPkId(ctl(v)); }
    }
    public static class EpgNotPkName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteNotPk)e).getNotPkName(); }
        public void write(Entity e, Object v) { ((WhiteNotPk)e).setNotPkName((String)v); }
    }
    public static class EpgNotPkInteger implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteNotPk)e).getNotPkInteger(); }
        public void write(Entity e, Object v) { ((WhiteNotPk)e).setNotPkInteger(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_not_pk";
    protected final String _tablePropertyName = "whiteNotPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_not_pk", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNotPkId = cci("not_pk_id", "not_pk_id", null, null, true, "notPkId", Long.class, false, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNotPkName = cci("not_pk_name", "not_pk_name", null, null, false, "notPkName", String.class, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNotPkInteger = cci("not_pk_integer", "not_pk_integer", null, null, false, "notPkInteger", Integer.class, false, false, "int4", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnNotPkId() { return _columnNotPkId; }
    public ColumnInfo columnNotPkName() { return _columnNotPkName; }
    public ColumnInfo columnNotPkInteger() { return _columnNotPkInteger; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNotPkId());
        ls.add(columnNotPkName());
        ls.add(columnNotPkInteger());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.WhiteNotPk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.WhiteNotPkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.WhiteNotPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteNotPk> getEntityType() { return WhiteNotPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteNotPk newMyEntity() { return new WhiteNotPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteNotPk)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteNotPk)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
