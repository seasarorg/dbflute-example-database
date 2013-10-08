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
 * The DB meta of SpResultSetParameterWithCurMemberStatus. (Singleton)
 * @author oracleman
 */
public class SpResultSetParameterWithCurMemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpResultSetParameterWithCurMemberStatusDbm _instance = new SpResultSetParameterWithCurMemberStatusDbm();
    private SpResultSetParameterWithCurMemberStatusDbm() {}
    public static SpResultSetParameterWithCurMemberStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMemberStatus)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMemberStatus)e).setMemberStatusCode((String)v); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMemberStatus)e).getMemberStatusName(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMemberStatus)e).setMemberStatusName((String)v); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMemberStatus)e).getDescription(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMemberStatus)e).setDescription((String)v); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMemberStatus)e).getDisplayOrder(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMemberStatus)e).setDisplayOrder(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpResultSetParameterWithCurMemberStatus";
    protected final String _tablePropertyName = "spResultSetParameterWithCurMemberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpResultSetParameterWithCurMemberStatus", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, false, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, false, "memberStatusName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, false, "description", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, false, "displayOrder", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterWithCurMemberStatus"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpResultSetParameterWithCurMemberStatus> getEntityType() { return SpResultSetParameterWithCurMemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SpResultSetParameterWithCurMemberStatus newMyEntity() { return new SpResultSetParameterWithCurMemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SpResultSetParameterWithCurMemberStatus)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SpResultSetParameterWithCurMemberStatus)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
