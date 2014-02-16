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
 * The DB meta of NESTED_FOO_BEAN. (Singleton)
 * @author oracleman
 */
public class NestedFooBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NestedFooBeanDbm _instance = new NestedFooBeanDbm();
    private NestedFooBeanDbm() {}
    public static NestedFooBeanDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgFooId(), "fooId");
        setupEpg(_epgMap, new EpgFooName(), "fooName");
        setupEpg(_epgMap, new EpgFooDate(), "fooDate");
        setupEpg(_epgMap, new EpgBarBean(), "barBean");
        setupEpg(_epgMap, new EpgQuxList(), "quxList");
        setupEpg(_epgMap, new EpgQuuxList(), "quuxList");
        setupEpg(_epgMap, new EpgCorgeList(), "corgeList");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgFooId implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getFooId(); }
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setFooId(cti(vl)); }
    }
    public static class EpgFooName implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getFooName(); }
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setFooName((String)vl); }
    }
    public static class EpgFooDate implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getFooDate(); }
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setFooDate((java.util.Date)vl); }
    }
    public static class EpgBarBean implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getBarBean(); }
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setBarBean((NestedBarBean)vl); }
    }
    public static class EpgQuxList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getQuxList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setQuxList((List<java.math.BigDecimal>)vl); }
    }
    public static class EpgQuuxList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getQuuxList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setQuuxList((List<java.math.BigDecimal>)vl); }
    }
    public static class EpgCorgeList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedFooBean)et).getCorgeList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedFooBean)et).setCorgeList((List<CorgeBean>)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NESTED_FOO_BEAN";
    protected final String _tablePropertyName = "nestedFooBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NESTED_FOO_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooId = cci("FOO_ID", "FOO_ID", null, null, false, "fooId", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooName = cci("FOO_NAME", "FOO_NAME", null, null, false, "fooName", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooDate = cci("FOO_DATE", "FOO_DATE", null, null, false, "fooDate", java.util.Date.class, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBarBean = cci("BAR_BEAN", "BAR_BEAN", null, null, false, "barBean", NestedBarBean.class, false, false, "NESTED_BAR_BEAN", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuxList = cci("QUX_LIST", "QUX_LIST", null, null, false, "quxList", List.class, false, false, "QUX_TABLE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuuxList = cci("QUUX_LIST", "QUUX_LIST", null, null, false, "quuxList", List.class, false, false, "QUUX_TABLE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeList = cci("CORGE_LIST", "CORGE_LIST", null, null, false, "corgeList", List.class, false, false, "CORGE_TABLE", null, null, null, false, null, null, null, null, null);

    public ColumnInfo columnFooId() { return _columnFooId; }
    public ColumnInfo columnFooName() { return _columnFooName; }
    public ColumnInfo columnFooDate() { return _columnFooDate; }
    public ColumnInfo columnBarBean() { return _columnBarBean; }
    public ColumnInfo columnQuxList() { return _columnQuxList; }
    public ColumnInfo columnQuuxList() { return _columnQuuxList; }
    public ColumnInfo columnCorgeList() { return _columnCorgeList; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooId());
        ls.add(columnFooName());
        ls.add(columnFooDate());
        ls.add(columnBarBean());
        ls.add(columnQuxList());
        ls.add(columnQuuxList());
        ls.add(columnCorgeList());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.NestedFooBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NestedFooBean> getEntityType() { return NestedFooBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NestedFooBean newMyEntity() { return new NestedFooBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NestedFooBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NestedFooBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
