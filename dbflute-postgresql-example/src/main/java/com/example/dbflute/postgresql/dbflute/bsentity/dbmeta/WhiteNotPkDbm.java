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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgNotPkId(), "notPkId");
        setupEpg(_epgMap, new EpgNotPkName(), "notPkName");
        setupEpg(_epgMap, new EpgNotPkInteger(), "notPkInteger");
    }
    public static class EpgNotPkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteNotPk)et).getNotPkId(); }
        public void write(Entity et, Object vl) { ((WhiteNotPk)et).setNotPkId(ctl(vl)); }
    }
    public static class EpgNotPkName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteNotPk)et).getNotPkName(); }
        public void write(Entity et, Object vl) { ((WhiteNotPk)et).setNotPkName((String)vl); }
    }
    public static class EpgNotPkInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteNotPk)et).getNotPkInteger(); }
        public void write(Entity et, Object vl) { ((WhiteNotPk)et).setNotPkInteger(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnNotPkId = cci("not_pk_id", "not_pk_id", null, null, Long.class, "notPkId", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNotPkName = cci("not_pk_name", "not_pk_name", null, null, String.class, "notPkName", null, false, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNotPkInteger = cci("not_pk_integer", "not_pk_integer", null, null, Integer.class, "notPkInteger", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null);

    /**
     * not_pk_id: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotPkId() { return _columnNotPkId; }
    /**
     * not_pk_name: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotPkName() { return _columnNotPkName; }
    /**
     * not_pk_integer: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
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
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteNotPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteNotPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
