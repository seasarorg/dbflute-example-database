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
 * The DB meta of CORGE_BEAN. (Singleton)
 * @author oracleman
 */
public class CorgeBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CorgeBeanDbm _instance = new CorgeBeanDbm();
    private CorgeBeanDbm() {}
    public static CorgeBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgCorgeId(), "corgeId");
        setupEpg(_epgMap, new EpgCorgeName(), "corgeName");
        setupEpg(_epgMap, new EpgCorgeDecimal(), "corgeDecimal");
        setupEpg(_epgMap, new EpgCorgeDate(), "corgeDate");
        setupEpg(_epgMap, new EpgCorgeTimestamp(), "corgeTimestamp");
        setupEpg(_epgMap, new EpgCorgeClob(), "corgeClob");
    }
    public static class EpgCorgeId implements PropertyGateway {
        public Object read(Entity et) { return ((CorgeBean)et).getCorgeId(); }
        public void write(Entity et, Object vl) { ((CorgeBean)et).setCorgeId(cti(vl)); }
    }
    public static class EpgCorgeName implements PropertyGateway {
        public Object read(Entity et) { return ((CorgeBean)et).getCorgeName(); }
        public void write(Entity et, Object vl) { ((CorgeBean)et).setCorgeName((String)vl); }
    }
    public static class EpgCorgeDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((CorgeBean)et).getCorgeDecimal(); }
        public void write(Entity et, Object vl) { ((CorgeBean)et).setCorgeDecimal(ctb(vl)); }
    }
    public static class EpgCorgeDate implements PropertyGateway {
        public Object read(Entity et) { return ((CorgeBean)et).getCorgeDate(); }
        public void write(Entity et, Object vl) { ((CorgeBean)et).setCorgeDate((java.util.Date)vl); }
    }
    public static class EpgCorgeTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((CorgeBean)et).getCorgeTimestamp(); }
        public void write(Entity et, Object vl) { ((CorgeBean)et).setCorgeTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgCorgeClob implements PropertyGateway {
        public Object read(Entity et) { return ((CorgeBean)et).getCorgeClob(); }
        public void write(Entity et, Object vl) { ((CorgeBean)et).setCorgeClob((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CORGE_BEAN";
    protected final String _tablePropertyName = "corgeBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("CORGE_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCorgeId = cci("CORGE_ID", "CORGE_ID", null, null, Integer.class, "corgeId", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeName = cci("CORGE_NAME", "CORGE_NAME", null, null, String.class, "corgeName", null, false, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeDecimal = cci("CORGE_DECIMAL", "CORGE_DECIMAL", null, null, java.math.BigDecimal.class, "corgeDecimal", null, false, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeDate = cci("CORGE_DATE", "CORGE_DATE", null, null, java.util.Date.class, "corgeDate", null, false, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeTimestamp = cci("CORGE_TIMESTAMP", "CORGE_TIMESTAMP", null, null, java.sql.Timestamp.class, "corgeTimestamp", null, false, false, false, "TIMESTAMP", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeClob = cci("CORGE_CLOB", "CORGE_CLOB", null, null, String.class, "corgeClob", null, false, false, false, "CLOB", null, null, null, false, null, null, null, null, null);

    /**
     * CORGE_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeId() { return _columnCorgeId; }
    /**
     * CORGE_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeName() { return _columnCorgeName; }
    /**
     * CORGE_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeDecimal() { return _columnCorgeDecimal; }
    /**
     * CORGE_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeDate() { return _columnCorgeDate; }
    /**
     * CORGE_TIMESTAMP: {TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeTimestamp() { return _columnCorgeTimestamp; }
    /**
     * CORGE_CLOB: {CLOB}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeClob() { return _columnCorgeClob; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCorgeId());
        ls.add(columnCorgeName());
        ls.add(columnCorgeDecimal());
        ls.add(columnCorgeDate());
        ls.add(columnCorgeTimestamp());
        ls.add(columnCorgeClob());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.CorgeBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CorgeBean> getEntityType() { return CorgeBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CorgeBean newEntity() { return new CorgeBean(); }
    public CorgeBean newMyEntity() { return new CorgeBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CorgeBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CorgeBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
