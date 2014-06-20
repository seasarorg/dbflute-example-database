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
 * The DB meta of PurchaseSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseSummaryMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseSummaryMemberDbm _instance = new PurchaseSummaryMemberDbm();
    private PurchaseSummaryMemberDbm() {}
    public static PurchaseSummaryMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgPurchaseSummary(), "purchaseSummary");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setMemberName((String)vl); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getBirthdate(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setBirthdate((java.util.Date)vl); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getFormalizedDatetime(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setFormalizedDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgPurchaseSummary implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getPurchaseSummary(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setPurchaseSummary(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PurchaseSummaryMember";
    protected final String _tablePropertyName = "purchaseSummaryMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("PurchaseSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, null, Integer.class, "memberId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("member_name", "member_name", null, null, String.class, "memberName", null, false, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("birthdate", "birthdate", null, null, java.util.Date.class, "birthdate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFormalizedDatetime = cci("formalized_datetime", "formalized_datetime", null, null, java.sql.Timestamp.class, "formalizedDatetime", null, false, false, false, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseSummary = cci("purchase_summary", "purchase_summary", null, null, Long.class, "purchaseSummary", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null);

    /**
     * member_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * member_name: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * birthdate: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * formalized_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * purchase_summary: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseSummary() { return _columnPurchaseSummary; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnPurchaseSummary());
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.PurchaseSummaryMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchaseSummaryMember> getEntityType() { return PurchaseSummaryMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchaseSummaryMember newEntity() { return new PurchaseSummaryMember(); }
    public PurchaseSummaryMember newMyEntity() { return new PurchaseSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchaseSummaryMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchaseSummaryMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
