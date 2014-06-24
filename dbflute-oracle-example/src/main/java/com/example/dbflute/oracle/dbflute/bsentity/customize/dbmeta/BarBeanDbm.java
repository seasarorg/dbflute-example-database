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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBarId(), "barId");
        setupEpg(_epgMap, new EpgBarName(), "barName");
        setupEpg(_epgMap, new EpgBarDecimal(), "barDecimal");
        setupEpg(_epgMap, new EpgBarDate(), "barDate");
        setupEpg(_epgMap, new EpgBarTimestamp(), "barTimestamp");
        setupEpg(_epgMap, new EpgBarClob(), "barClob");
    }
    public static class EpgBarId implements PropertyGateway {
        public Object read(Entity et) { return ((BarBean)et).getBarId(); }
        public void write(Entity et, Object vl) { ((BarBean)et).setBarId(cti(vl)); }
    }
    public static class EpgBarName implements PropertyGateway {
        public Object read(Entity et) { return ((BarBean)et).getBarName(); }
        public void write(Entity et, Object vl) { ((BarBean)et).setBarName((String)vl); }
    }
    public static class EpgBarDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((BarBean)et).getBarDecimal(); }
        public void write(Entity et, Object vl) { ((BarBean)et).setBarDecimal(ctb(vl)); }
    }
    public static class EpgBarDate implements PropertyGateway {
        public Object read(Entity et) { return ((BarBean)et).getBarDate(); }
        public void write(Entity et, Object vl) { ((BarBean)et).setBarDate((java.util.Date)vl); }
    }
    public static class EpgBarTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((BarBean)et).getBarTimestamp(); }
        public void write(Entity et, Object vl) { ((BarBean)et).setBarTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgBarClob implements PropertyGateway {
        public Object read(Entity et) { return ((BarBean)et).getBarClob(); }
        public void write(Entity et, Object vl) { ((BarBean)et).setBarClob((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnBarId = cci("BAR_ID", "BAR_ID", null, null, Integer.class, "barId", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarName = cci("BAR_NAME", "BAR_NAME", null, null, String.class, "barName", null, false, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDecimal = cci("BAR_DECIMAL", "BAR_DECIMAL", null, null, java.math.BigDecimal.class, "barDecimal", null, false, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDate = cci("BAR_DATE", "BAR_DATE", null, null, java.util.Date.class, "barDate", null, false, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarTimestamp = cci("BAR_TIMESTAMP", "BAR_TIMESTAMP", null, null, java.sql.Timestamp.class, "barTimestamp", null, false, false, false, "TIMESTAMP", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarClob = cci("BAR_CLOB", "BAR_CLOB", null, null, String.class, "barClob", null, false, false, false, "CLOB", null, null, null, false, null, null, null, null, null);

    /**
     * BAR_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarId() { return _columnBarId; }
    /**
     * BAR_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarName() { return _columnBarName; }
    /**
     * BAR_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarDecimal() { return _columnBarDecimal; }
    /**
     * BAR_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarDate() { return _columnBarDate; }
    /**
     * BAR_TIMESTAMP: {TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarTimestamp() { return _columnBarTimestamp; }
    /**
     * BAR_CLOB: {CLOB}
     * @return The information object of specified column. (NotNull)
     */
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
    public BarBean newEntity() { return new BarBean(); }
    public BarBean newMyEntity() { return new BarBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BarBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BarBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
