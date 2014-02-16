package com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of SpResultSetParameterMoreCurMemberStatus. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpResultSetParameterMoreCurMemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpResultSetParameterMoreCurMemberStatusDbm _instance = new SpResultSetParameterMoreCurMemberStatusDbm();
    private SpResultSetParameterMoreCurMemberStatusDbm() {}
    public static SpResultSetParameterMoreCurMemberStatusDbm getInstance() { return _instance; }

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
        public Object read(Entity et) { return ((SpResultSetParameterMoreCurMemberStatus)et).getMemberStatusCode(); }
        public void write(Entity et, Object vl) { ((SpResultSetParameterMoreCurMemberStatus)et).setMemberStatusCode((String)vl); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((SpResultSetParameterMoreCurMemberStatus)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((SpResultSetParameterMoreCurMemberStatus)et).setMemberStatusName((String)vl); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity et) { return ((SpResultSetParameterMoreCurMemberStatus)et).getDescription(); }
        public void write(Entity et, Object vl) { ((SpResultSetParameterMoreCurMemberStatus)et).setDescription((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((SpResultSetParameterMoreCurMemberStatus)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((SpResultSetParameterMoreCurMemberStatus)et).setDisplayOrder(cti(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpResultSetParameterMoreCurMemberStatus";
    protected final String _tablePropertyName = "spResultSetParameterMoreCurMemberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpResultSetParameterMoreCurMemberStatus", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("member_status_code", "member_status_code", null, null, false, "memberStatusCode", String.class, false, false, "bpchar", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("member_status_name", "member_status_name", null, null, false, "memberStatusName", String.class, false, false, "varchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, false, "description", String.class, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, null, false, "displayOrder", Integer.class, false, false, "int4", 10, 0, null, false, null, null, null, null, null);

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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.SpResultSetParameterMoreCurMemberStatus"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpResultSetParameterMoreCurMemberStatus> getEntityType() { return SpResultSetParameterMoreCurMemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SpResultSetParameterMoreCurMemberStatus newMyEntity() { return new SpResultSetParameterMoreCurMemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpResultSetParameterMoreCurMemberStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpResultSetParameterMoreCurMemberStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
