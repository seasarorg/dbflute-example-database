package com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The DB meta of BAR_BEAN. (Singleton)
 * @author oracleman
 */
public class BarBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BarBeanDbm _instance = new BarBeanDbm();
    private BarBeanDbm() {}
    public static BarBeanDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBarId(), "barId");
        setupEpg(_epgMap, new EpgBarName(), "barName");
        setupEpg(_epgMap, new EpgBarDecimal(), "barDecimal");
        setupEpg(_epgMap, new EpgBarDate(), "barDate");
        setupEpg(_epgMap, new EpgBarTimestamp(), "barTimestamp");
        setupEpg(_epgMap, new EpgBarClob(), "barClob");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBarId implements PropertyGateway {
        public Object read(Entity e) { return ((BarBean)e).getBarId(); }
        public void write(Entity e, Object v) { ((BarBean)e).setBarId(cti(v)); }
    }
    public static class EpgBarName implements PropertyGateway {
        public Object read(Entity e) { return ((BarBean)e).getBarName(); }
        public void write(Entity e, Object v) { ((BarBean)e).setBarName((String)v); }
    }
    public static class EpgBarDecimal implements PropertyGateway {
        public Object read(Entity e) { return ((BarBean)e).getBarDecimal(); }
        public void write(Entity e, Object v) { ((BarBean)e).setBarDecimal(ctb(v)); }
    }
    public static class EpgBarDate implements PropertyGateway {
        public Object read(Entity e) { return ((BarBean)e).getBarDate(); }
        public void write(Entity e, Object v) { ((BarBean)e).setBarDate((java.util.Date)v); }
    }
    public static class EpgBarTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((BarBean)e).getBarTimestamp(); }
        public void write(Entity e, Object v) { ((BarBean)e).setBarTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgBarClob implements PropertyGateway {
        public Object read(Entity e) { return ((BarBean)e).getBarClob(); }
        public void write(Entity e, Object v) { ((BarBean)e).setBarClob((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BAR_BEAN";
    protected final String _tablePropertyName = "barBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("BAR_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBarId = cci("BAR_ID", "BAR_ID", null, null, false, "barId", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarName = cci("BAR_NAME", "BAR_NAME", null, null, false, "barName", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDecimal = cci("BAR_DECIMAL", "BAR_DECIMAL", null, null, false, "barDecimal", java.math.BigDecimal.class, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDate = cci("BAR_DATE", "BAR_DATE", null, null, false, "barDate", java.util.Date.class, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarTimestamp = cci("BAR_TIMESTAMP", "BAR_TIMESTAMP", null, null, false, "barTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarClob = cci("BAR_CLOB", "BAR_CLOB", null, null, false, "barClob", String.class, false, false, "CLOB", null, null, null, false, null, null, null, null, null);

    public ColumnInfo columnBarId() { return _columnBarId; }
    public ColumnInfo columnBarName() { return _columnBarName; }
    public ColumnInfo columnBarDecimal() { return _columnBarDecimal; }
    public ColumnInfo columnBarDate() { return _columnBarDate; }
    public ColumnInfo columnBarTimestamp() { return _columnBarTimestamp; }
    public ColumnInfo columnBarClob() { return _columnBarClob; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBarId());
        ls.add(columnBarName());
        ls.add(columnBarDecimal());
        ls.add(columnBarDate());
        ls.add(columnBarTimestamp());
        ls.add(columnBarClob());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.BarBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BarBean> getEntityType() { return BarBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BarBean newMyEntity() { return new BarBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BarBean)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BarBean)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
