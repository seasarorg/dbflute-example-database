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
 * The DB meta of NESTED_BAZ_BEAN. (Singleton)
 * @author oracleman
 */
public class NestedBazBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NestedBazBeanDbm _instance = new NestedBazBeanDbm();
    private NestedBazBeanDbm() {}
    public static NestedBazBeanDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBazId(), "bazId");
        setupEpg(_epgMap, new EpgBazName(), "bazName");
        setupEpg(_epgMap, new EpgBazDate(), "bazDate");
        setupEpg(_epgMap, new EpgBazList(), "bazList");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBazId implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBazBean)e).getBazId(); }
        public void write(Entity e, Object v) { ((NestedBazBean)e).setBazId(cti(v)); }
    }
    public static class EpgBazName implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBazBean)e).getBazName(); }
        public void write(Entity e, Object v) { ((NestedBazBean)e).setBazName((String)v); }
    }
    public static class EpgBazDate implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBazBean)e).getBazDate(); }
        public void write(Entity e, Object v) { ((NestedBazBean)e).setBazDate((java.util.Date)v); }
    }
    public static class EpgBazList implements PropertyGateway {
        public Object read(Entity e) { return ((NestedBazBean)e).getBazList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity e, Object v) { ((NestedBazBean)e).setBazList((List<List<BarBean>>)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NESTED_BAZ_BEAN";
    protected final String _tablePropertyName = "nestedBazBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NESTED_BAZ_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBazId = cci("BAZ_ID", "BAZ_ID", null, null, false, "bazId", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazName = cci("BAZ_NAME", "BAZ_NAME", null, null, false, "bazName", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazDate = cci("BAZ_DATE", "BAZ_DATE", null, null, false, "bazDate", java.util.Date.class, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazList = cci("BAZ_LIST", "BAZ_LIST", null, null, false, "bazList", List.class, false, false, "BAZ_TABLE", null, null, null, false, null, null, null, null, null);

    public ColumnInfo columnBazId() { return _columnBazId; }
    public ColumnInfo columnBazName() { return _columnBazName; }
    public ColumnInfo columnBazDate() { return _columnBazDate; }
    public ColumnInfo columnBazList() { return _columnBazList; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBazId());
        ls.add(columnBazName());
        ls.add(columnBazDate());
        ls.add(columnBazList());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.NestedBazBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NestedBazBean> getEntityType() { return NestedBazBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NestedBazBean newMyEntity() { return new NestedBazBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((NestedBazBean)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((NestedBazBean)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
