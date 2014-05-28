package com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The DB meta of WHITE_DELIMITER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDelimiterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDelimiterDbm _instance = new WhiteDelimiterDbm();
    private WhiteDelimiterDbm() {}
    public static WhiteDelimiterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgDelimiterId(), "delimiterId");
        setupEpg(_epgMap, new EpgNumberNullable(), "numberNullable");
        setupEpg(_epgMap, new EpgStringConverted(), "stringConverted");
        setupEpg(_epgMap, new EpgStringNonConverted(), "stringNonConverted");
        setupEpg(_epgMap, new EpgDateDefault(), "dateDefault");
    }
    public static class EpgDelimiterId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDelimiter)et).getDelimiterId(); }
        public void write(Entity et, Object vl) { ((WhiteDelimiter)et).setDelimiterId(ctl(vl)); }
    }
    public static class EpgNumberNullable implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDelimiter)et).getNumberNullable(); }
        public void write(Entity et, Object vl) { ((WhiteDelimiter)et).setNumberNullable(cti(vl)); }
    }
    public static class EpgStringConverted implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDelimiter)et).getStringConverted(); }
        public void write(Entity et, Object vl) { ((WhiteDelimiter)et).setStringConverted((String)vl); }
    }
    public static class EpgStringNonConverted implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDelimiter)et).getStringNonConverted(); }
        public void write(Entity et, Object vl) { ((WhiteDelimiter)et).setStringNonConverted((String)vl); }
    }
    public static class EpgDateDefault implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDelimiter)et).getDateDefault(); }
        public void write(Entity et, Object vl) { ((WhiteDelimiter)et).setDateDefault((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DELIMITER";
    protected final String _tablePropertyName = "whiteDelimiter";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DELIMITER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDelimiterId = cci("DELIMITER_ID", "DELIMITER_ID", null, null, Long.class, "delimiterId", null, true, true, true, "bigint identity", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumberNullable = cci("NUMBER_NULLABLE", "NUMBER_NULLABLE", null, null, Integer.class, "numberNullable", null, false, false, false, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringConverted = cci("STRING_CONVERTED", "STRING_CONVERTED", null, null, String.class, "stringConverted", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringNonConverted = cci("STRING_NON_CONVERTED", "STRING_NON_CONVERTED", null, null, String.class, "stringNonConverted", null, false, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateDefault = cci("DATE_DEFAULT", "DATE_DEFAULT", null, null, java.sql.Timestamp.class, "dateDefault", null, false, false, true, "datetime", 23, 3, null, false, null, null, null, null, null);

    /**
     * DELIMITER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelimiterId() { return _columnDelimiterId; }
    /**
     * NUMBER_NULLABLE: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberNullable() { return _columnNumberNullable; }
    /**
     * STRING_CONVERTED: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringConverted() { return _columnStringConverted; }
    /**
     * STRING_NON_CONVERTED: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringNonConverted() { return _columnStringNonConverted; }
    /**
     * DATE_DEFAULT: {NotNull, datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateDefault() { return _columnDateDefault; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDelimiterId());
        ls.add(columnNumberNullable());
        ls.add(columnStringConverted());
        ls.add(columnStringNonConverted());
        ls.add(columnDateDefault());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDelimiterId()); }
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
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.WhiteDelimiter"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.sqlserver.dbflute.cbean.WhiteDelimiterCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.sqlserver.dbflute.exbhv.WhiteDelimiterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDelimiter> getEntityType() { return WhiteDelimiter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteDelimiter newMyEntity() { return new WhiteDelimiter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDelimiter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDelimiter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
