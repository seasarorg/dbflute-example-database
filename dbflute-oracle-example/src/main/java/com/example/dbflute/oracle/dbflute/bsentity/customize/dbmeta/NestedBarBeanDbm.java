package com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The DB meta of NESTED_BAR_BEAN. (Singleton)
 * @author oracleman
 */
public class NestedBarBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NestedBarBeanDbm _instance = new NestedBarBeanDbm();
    private NestedBarBeanDbm() {}
    public static NestedBarBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgBarDate(), "barDate");
        setupEpg(_epgMap, new EpgBarList(), "barList");
        setupEpg(_epgMap, new EpgBazBean1(), "bazBean1");
        setupEpg(_epgMap, new EpgBazBean2(), "bazBean2");
        setupEpg(_epgMap, new EpgQuxList(), "quxList");
        setupEpg(_epgMap, new EpgQuuxList(), "quuxList");
    }
    public static class EpgBarId implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getBarId(); }
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setBarId(cti(vl)); }
    }
    public static class EpgBarName implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getBarName(); }
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setBarName((String)vl); }
    }
    public static class EpgBarDate implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getBarDate(); }
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setBarDate((java.util.Date)vl); }
    }
    public static class EpgBarList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getBarList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setBarList((List<BarBean>)vl); }
    }
    public static class EpgBazBean1 implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getBazBean1(); }
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setBazBean1((NestedBazBean)vl); }
    }
    public static class EpgBazBean2 implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getBazBean2(); }
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setBazBean2((NestedBazBean)vl); }
    }
    public static class EpgQuxList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getQuxList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setQuxList((List<java.math.BigDecimal>)vl); }
    }
    public static class EpgQuuxList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBarBean)et).getQuuxList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedBarBean)et).setQuuxList((List<java.math.BigDecimal>)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NESTED_BAR_BEAN";
    protected final String _tablePropertyName = "nestedBarBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NESTED_BAR_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBarId = cci("BAR_ID", "BAR_ID", null, null, Integer.class, "barId", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarName = cci("BAR_NAME", "BAR_NAME", null, null, String.class, "barName", null, false, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDate = cci("BAR_DATE", "BAR_DATE", null, null, java.util.Date.class, "barDate", null, false, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarList = cci("BAR_LIST", "BAR_LIST", null, null, List.class, "barList", null, false, false, false, "BAR_TABLE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazBean1 = cci("BAZ_BEAN1", "BAZ_BEAN1", null, null, NestedBazBean.class, "bazBean1", null, false, false, false, "NESTED_BAZ_BEAN", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazBean2 = cci("BAZ_BEAN2", "BAZ_BEAN2", null, null, NestedBazBean.class, "bazBean2", null, false, false, false, "NESTED_BAZ_BEAN", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuxList = cci("QUX_LIST", "QUX_LIST", null, null, List.class, "quxList", null, false, false, false, "QUX_TABLE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuuxList = cci("QUUX_LIST", "QUUX_LIST", null, null, List.class, "quuxList", null, false, false, false, "QUUX_TABLE", null, null, null, false, null, null, null, null, null);

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
     * BAR_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarDate() { return _columnBarDate; }
    /**
     * BAR_LIST: {BAR_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarList() { return _columnBarList; }
    /**
     * BAZ_BEAN1: {NESTED_BAZ_BEAN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazBean1() { return _columnBazBean1; }
    /**
     * BAZ_BEAN2: {NESTED_BAZ_BEAN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazBean2() { return _columnBazBean2; }
    /**
     * QUX_LIST: {QUX_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuxList() { return _columnQuxList; }
    /**
     * QUUX_LIST: {QUUX_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuuxList() { return _columnQuuxList; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBarId());
        ls.add(columnBarName());
        ls.add(columnBarDate());
        ls.add(columnBarList());
        ls.add(columnBazBean1());
        ls.add(columnBazBean2());
        ls.add(columnQuxList());
        ls.add(columnQuuxList());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.NestedBarBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NestedBarBean> getEntityType() { return NestedBarBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NestedBarBean newEntity() { return new NestedBarBean(); }
    public NestedBarBean newMyEntity() { return new NestedBarBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NestedBarBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NestedBarBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
