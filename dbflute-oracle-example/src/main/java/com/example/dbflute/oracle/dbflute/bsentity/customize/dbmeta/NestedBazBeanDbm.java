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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBazId(), "bazId");
        setupEpg(_epgMap, new EpgBazName(), "bazName");
        setupEpg(_epgMap, new EpgBazDate(), "bazDate");
        setupEpg(_epgMap, new EpgBazList(), "bazList");
    }
    public static class EpgBazId implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBazBean)et).getBazId(); }
        public void write(Entity et, Object vl) { ((NestedBazBean)et).setBazId(cti(vl)); }
    }
    public static class EpgBazName implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBazBean)et).getBazName(); }
        public void write(Entity et, Object vl) { ((NestedBazBean)et).setBazName((String)vl); }
    }
    public static class EpgBazDate implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBazBean)et).getBazDate(); }
        public void write(Entity et, Object vl) { ((NestedBazBean)et).setBazDate((java.util.Date)vl); }
    }
    public static class EpgBazList implements PropertyGateway {
        public Object read(Entity et) { return ((NestedBazBean)et).getBazList(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((NestedBazBean)et).setBazList((List<List<BarBean>>)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnBazId = cci("BAZ_ID", "BAZ_ID", null, null, Integer.class, "bazId", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazName = cci("BAZ_NAME", "BAZ_NAME", null, null, String.class, "bazName", null, false, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazDate = cci("BAZ_DATE", "BAZ_DATE", null, null, java.util.Date.class, "bazDate", null, false, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBazList = cci("BAZ_LIST", "BAZ_LIST", null, null, List.class, "bazList", null, false, false, false, "BAZ_TABLE", null, null, null, false, null, null, null, null, null);

    /**
     * BAZ_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazId() { return _columnBazId; }
    /**
     * BAZ_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazName() { return _columnBazName; }
    /**
     * BAZ_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazDate() { return _columnBazDate; }
    /**
     * BAZ_LIST: {BAZ_TABLE}
     * @return The information object of specified column. (NotNull)
     */
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
    public NestedBazBean newEntity() { return new NestedBazBean(); }
    public NestedBazBean newMyEntity() { return new NestedBazBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NestedBazBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NestedBazBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
