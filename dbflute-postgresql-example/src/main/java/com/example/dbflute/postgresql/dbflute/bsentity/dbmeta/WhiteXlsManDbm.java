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
 * The DB meta of white_xls_man. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteXlsManDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteXlsManDbm _instance = new WhiteXlsManDbm();
    private WhiteXlsManDbm() {}
    public static WhiteXlsManDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgXlsManId(), "xlsManId");
        setupEpg(_epgMap, new EpgStringConverted(), "stringConverted");
        setupEpg(_epgMap, new EpgTimestampZeroDefaultMillis(), "timestampZeroDefaultMillis");
        setupEpg(_epgMap, new EpgTimestampZeroPrefixMillis(), "timestampZeroPrefixMillis");
        setupEpg(_epgMap, new EpgTimestampZeroSuffixMillis(), "timestampZeroSuffixMillis");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgXlsManId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteXlsMan)e).getXlsManId(); }
        public void write(Entity e, Object v) { ((WhiteXlsMan)e).setXlsManId(ctl(v)); }
    }
    public static class EpgStringConverted implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteXlsMan)e).getStringConverted(); }
        public void write(Entity e, Object v) { ((WhiteXlsMan)e).setStringConverted((String)v); }
    }
    public static class EpgTimestampZeroDefaultMillis implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteXlsMan)e).getTimestampZeroDefaultMillis(); }
        public void write(Entity e, Object v) { ((WhiteXlsMan)e).setTimestampZeroDefaultMillis((java.sql.Timestamp)v); }
    }
    public static class EpgTimestampZeroPrefixMillis implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteXlsMan)e).getTimestampZeroPrefixMillis(); }
        public void write(Entity e, Object v) { ((WhiteXlsMan)e).setTimestampZeroPrefixMillis((java.sql.Timestamp)v); }
    }
    public static class EpgTimestampZeroSuffixMillis implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteXlsMan)e).getTimestampZeroSuffixMillis(); }
        public void write(Entity e, Object v) { ((WhiteXlsMan)e).setTimestampZeroSuffixMillis((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_xls_man";
    protected final String _tablePropertyName = "whiteXlsMan";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_xls_man", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnXlsManId = cci("xls_man_id", "xls_man_id", null, null, true, "xlsManId", Long.class, true, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringConverted = cci("string_converted", "string_converted", null, null, false, "stringConverted", String.class, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampZeroDefaultMillis = cci("timestamp_zero_default_millis", "timestamp_zero_default_millis", null, null, false, "timestampZeroDefaultMillis", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampZeroPrefixMillis = cci("timestamp_zero_prefix_millis", "timestamp_zero_prefix_millis", null, null, false, "timestampZeroPrefixMillis", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampZeroSuffixMillis = cci("timestamp_zero_suffix_millis", "timestamp_zero_suffix_millis", null, null, false, "timestampZeroSuffixMillis", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, false, null, null, null, null, null);

    public ColumnInfo columnXlsManId() { return _columnXlsManId; }
    public ColumnInfo columnStringConverted() { return _columnStringConverted; }
    public ColumnInfo columnTimestampZeroDefaultMillis() { return _columnTimestampZeroDefaultMillis; }
    public ColumnInfo columnTimestampZeroPrefixMillis() { return _columnTimestampZeroPrefixMillis; }
    public ColumnInfo columnTimestampZeroSuffixMillis() { return _columnTimestampZeroSuffixMillis; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnXlsManId());
        ls.add(columnStringConverted());
        ls.add(columnTimestampZeroDefaultMillis());
        ls.add(columnTimestampZeroPrefixMillis());
        ls.add(columnTimestampZeroSuffixMillis());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnXlsManId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.WhiteXlsMan"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.WhiteXlsManCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.WhiteXlsManBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteXlsMan> getEntityType() { return WhiteXlsMan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteXlsMan newMyEntity() { return new WhiteXlsMan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteXlsMan)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteXlsMan)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
