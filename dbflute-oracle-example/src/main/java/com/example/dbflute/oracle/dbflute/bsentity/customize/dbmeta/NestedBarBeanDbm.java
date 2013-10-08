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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBarId implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getBarId(); }
        public void write(Entity e, Object v) { ((NestedBarBean)e).setBarId(cti(v)); }
    }
    public static class EpgBarName implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getBarName(); }
        public void write(Entity e, Object v) { ((NestedBarBean)e).setBarName((String)v); }
    }
    public static class EpgBarDate implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getBarDate(); }
        public void write(Entity e, Object v) { ((NestedBarBean)e).setBarDate((java.util.Date)v); }
    }
    public static class EpgBarList implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getBarList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity e, Object v) { ((NestedBarBean)e).setBarList((List<BarBean>)v); }
    }
    public static class EpgBazBean1 implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getBazBean1(); }
        public void write(Entity e, Object v) { ((NestedBarBean)e).setBazBean1((NestedBazBean)v); }
    }
    public static class EpgBazBean2 implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getBazBean2(); }
        public void write(Entity e, Object v) { ((NestedBarBean)e).setBazBean2((NestedBazBean)v); }
    }
    public static class EpgQuxList implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getQuxList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity e, Object v) { ((NestedBarBean)e).setQuxList((List<java.math.BigDecimal>)v); }
    }
    public static class EpgQuuxList implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBarBean)e).getQuuxList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity e, Object v) { ((NestedBarBean)e).setQuuxList((List<java.math.BigDecimal>)v); }
    }

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
    protected final ColumnInfo _columnBarId = cci("BAR_ID", "BAR_ID", null, null, false, "barId", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarName = cci("BAR_NAME", "BAR_NAME", null, null, false, "barName", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarDate = cci("BAR_DATE", "BAR_DATE", null, null, false, "barDate", java.util.Date.class, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarList = cci("BAR_LIST", "BAR_LIST", null, null, false, "barList", List.class, false, false, "BAR_TABLE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazBean1 = cci("BAZ_BEAN1", "BAZ_BEAN1", null, null, false, "bazBean1", NestedBazBean.class, false, false, "NESTED_BAZ_BEAN", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazBean2 = cci("BAZ_BEAN2", "BAZ_BEAN2", null, null, false, "bazBean2", NestedBazBean.class, false, false, "NESTED_BAZ_BEAN", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuxList = cci("QUX_LIST", "QUX_LIST", null, null, false, "quxList", List.class, false, false, "QUX_TABLE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuuxList = cci("QUUX_LIST", "QUUX_LIST", null, null, false, "quuxList", List.class, false, false, "QUUX_TABLE", null, null, null, false, null, null, null, null, null);

    public ColumnInfo columnBarId() { return _columnBarId; }
    public ColumnInfo columnBarName() { return _columnBarName; }
    public ColumnInfo columnBarDate() { return _columnBarDate; }
    public ColumnInfo columnBarList() { return _columnBarList; }
    public ColumnInfo columnBazBean1() { return _columnBazBean1; }
    public ColumnInfo columnBazBean2() { return _columnBazBean2; }
    public ColumnInfo columnQuxList() { return _columnQuxList; }
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
    public Entity newEntity() { return newMyEntity(); }
    public NestedBarBean newMyEntity() { return new NestedBarBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((NestedBarBean)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((NestedBarBean)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
