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
 * The DB meta of FOO_BEAN. (Singleton)
 * @author oracleman
 */
public class FooBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FooBeanDbm _instance = new FooBeanDbm();
    private FooBeanDbm() {}
    public static FooBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFooDecimal(), "fooDecimal");
        setupEpg(_epgMap, new EpgFooDate(), "fooDate");
        setupEpg(_epgMap, new EpgFooTimestamp(), "fooTimestamp");
        setupEpg(_epgMap, new EpgFooClob(), "fooClob");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgFooId implements PropertyGateway {
        public Object read(Entity e) { return ((FooBean)e).getFooId(); }
        public void write(Entity e, Object v) { ((FooBean)e).setFooId(cti(v)); }
    }
    public static class EpgFooName implements PropertyGateway {
        public Object read(Entity e) { return ((FooBean)e).getFooName(); }
        public void write(Entity e, Object v) { ((FooBean)e).setFooName((String)v); }
    }
    public static class EpgFooDecimal implements PropertyGateway {
        public Object read(Entity e) { return ((FooBean)e).getFooDecimal(); }
        public void write(Entity e, Object v) { ((FooBean)e).setFooDecimal(ctb(v)); }
    }
    public static class EpgFooDate implements PropertyGateway {
        public Object read(Entity e) { return ((FooBean)e).getFooDate(); }
        public void write(Entity e, Object v) { ((FooBean)e).setFooDate((java.util.Date)v); }
    }
    public static class EpgFooTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((FooBean)e).getFooTimestamp(); }
        public void write(Entity e, Object v) { ((FooBean)e).setFooTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgFooClob implements PropertyGateway {
        public Object read(Entity e) { return ((FooBean)e).getFooClob(); }
        public void write(Entity e, Object v) { ((FooBean)e).setFooClob((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FOO_BEAN";
    protected final String _tablePropertyName = "fooBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("FOO_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooId = cci("FOO_ID", "FOO_ID", null, null, false, "fooId", Integer.class, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooName = cci("FOO_NAME", "FOO_NAME", null, null, false, "fooName", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooDecimal = cci("FOO_DECIMAL", "FOO_DECIMAL", null, null, false, "fooDecimal", java.math.BigDecimal.class, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooDate = cci("FOO_DATE", "FOO_DATE", null, null, false, "fooDate", java.util.Date.class, false, false, "DATE", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooTimestamp = cci("FOO_TIMESTAMP", "FOO_TIMESTAMP", null, null, false, "fooTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooClob = cci("FOO_CLOB", "FOO_CLOB", null, null, false, "fooClob", String.class, false, false, "CLOB", null, null, null, false, null, null, null, null, null);

    public ColumnInfo columnFooId() { return _columnFooId; }
    public ColumnInfo columnFooName() { return _columnFooName; }
    public ColumnInfo columnFooDecimal() { return _columnFooDecimal; }
    public ColumnInfo columnFooDate() { return _columnFooDate; }
    public ColumnInfo columnFooTimestamp() { return _columnFooTimestamp; }
    public ColumnInfo columnFooClob() { return _columnFooClob; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooId());
        ls.add(columnFooName());
        ls.add(columnFooDecimal());
        ls.add(columnFooDate());
        ls.add(columnFooTimestamp());
        ls.add(columnFooClob());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.FooBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FooBean> getEntityType() { return FooBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public FooBean newMyEntity() { return new FooBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((FooBean)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((FooBean)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
