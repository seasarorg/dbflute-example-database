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
 * The DB meta of UnpaidSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UnpaidSummaryMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UnpaidSummaryMemberDbm _instance = new UnpaidSummaryMemberDbm();
    private UnpaidSummaryMemberDbm() {}
    public static UnpaidSummaryMemberDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUnpaidManId(), "unpaidManId");
        setupEpg(_epgMap, new EpgUnpaidManName(), "unpaidManName");
        setupEpg(_epgMap, new EpgUnpaidPriceSummary(), "unpaidPriceSummary");
        setupEpg(_epgMap, new EpgStatusName(), "statusName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUnpaidManId implements PropertyGateway {
        public Object read(Entity e) { return ((UnpaidSummaryMember)e).getUnpaidManId(); }
        public void write(Entity e, Object v) { ((UnpaidSummaryMember)e).setUnpaidManId(cti(v)); }
    }
    public static class EpgUnpaidManName implements PropertyGateway {
        public Object read(Entity e) { return ((UnpaidSummaryMember)e).getUnpaidManName(); }
        public void write(Entity e, Object v) { ((UnpaidSummaryMember)e).setUnpaidManName((String)v); }
    }
    public static class EpgUnpaidPriceSummary implements PropertyGateway {
        public Object read(Entity e) { return ((UnpaidSummaryMember)e).getUnpaidPriceSummary(); }
        public void write(Entity e, Object v) { ((UnpaidSummaryMember)e).setUnpaidPriceSummary(ctl(v)); }
    }
    public static class EpgStatusName implements PropertyGateway {
        public Object read(Entity e) { return ((UnpaidSummaryMember)e).getStatusName(); }
        public void write(Entity e, Object v) { ((UnpaidSummaryMember)e).setStatusName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "UnpaidSummaryMember";
    protected final String _tablePropertyName = "unpaidSummaryMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("UnpaidSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUnpaidManId = cci("unpaid_man_id", "unpaid_man_id", null, null, false, "unpaidManId", Integer.class, true, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUnpaidManName = cci("unpaid_man_name", "unpaid_man_name", null, null, false, "unpaidManName", String.class, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUnpaidPriceSummary = cci("unpaid_price_summary", "unpaid_price_summary", null, null, false, "unpaidPriceSummary", Long.class, false, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStatusName = cci("status_name", "status_name", null, null, false, "statusName", String.class, false, false, "varchar", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnUnpaidManId() { return _columnUnpaidManId; }
    public ColumnInfo columnUnpaidManName() { return _columnUnpaidManName; }
    public ColumnInfo columnUnpaidPriceSummary() { return _columnUnpaidPriceSummary; }
    public ColumnInfo columnStatusName() { return _columnStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUnpaidManId());
        ls.add(columnUnpaidManName());
        ls.add(columnUnpaidPriceSummary());
        ls.add(columnStatusName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUnpaidManId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.UnpaidSummaryMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UnpaidSummaryMember> getEntityType() { return UnpaidSummaryMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public UnpaidSummaryMember newMyEntity() { return new UnpaidSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((UnpaidSummaryMember)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((UnpaidSummaryMember)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
