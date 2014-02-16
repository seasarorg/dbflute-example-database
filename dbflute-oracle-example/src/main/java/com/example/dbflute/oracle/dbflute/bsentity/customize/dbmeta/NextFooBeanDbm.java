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
 * The DB meta of NEXT_FOO_BEAN. (Singleton)
 * @author oracleman
 */
public class NextFooBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextFooBeanDbm _instance = new NextFooBeanDbm();
    private NextFooBeanDbm() {}
    public static NextFooBeanDbm getInstance() { return _instance; }

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
        public Object read(Entity et) { return ((NextFooBean)et).getFooId(); }
        public void write(Entity et, Object vl) { ((NextFooBean)et).setFooId(cti(vl)); }
    }
    public static class EpgFooName implements PropertyGateway {
        public Object read(Entity et) { return ((NextFooBean)et).getFooName(); }
        public void write(Entity et, Object vl) { ((NextFooBean)et).setFooName((String)vl); }
    }
    public static class EpgFooDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((NextFooBean)et).getFooDecimal(); }
        public void write(Entity et, Object vl) { ((NextFooBean)et).setFooDecimal(ctb(vl)); }
    }
    public static class EpgFooDate implements PropertyGateway {
        public Object read(Entity et) { return ((NextFooBean)et).getFooDate(); }
        public void write(Entity et, Object vl) { ((NextFooBean)et).setFooDate((java.util.Date)vl); }
    }
    public static class EpgFooTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((NextFooBean)et).getFooTimestamp(); }
        public void write(Entity et, Object vl) { ((NextFooBean)et).setFooTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgFooClob implements PropertyGateway {
        public Object read(Entity et) { return ((NextFooBean)et).getFooClob(); }
        public void write(Entity et, Object vl) { ((NextFooBean)et).setFooClob((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NEXT_FOO_BEAN";
    protected final String _tablePropertyName = "nextFooBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NEXTEXAMPLEDB.NEXT_FOO_BEAN", _tableDbName);
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.NextFooBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextFooBean> getEntityType() { return NextFooBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NextFooBean newMyEntity() { return new NextFooBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextFooBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextFooBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
