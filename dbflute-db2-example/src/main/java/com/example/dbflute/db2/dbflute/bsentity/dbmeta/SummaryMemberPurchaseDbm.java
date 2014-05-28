package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The DB meta of SUMMARY_MEMBER_PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryMemberPurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryMemberPurchaseDbm _instance = new SummaryMemberPurchaseDbm();
    private SummaryMemberPurchaseDbm() {}
    public static SummaryMemberPurchaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgAllsumPurchasePrice(), "allsumPurchasePrice");
        setupEpg(_epgMap, new EpgLatestPurchaseDatetime(), "latestPurchaseDatetime");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryMemberPurchase)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((SummaryMemberPurchase)et).setMemberId(cti(vl)); }
    }
    public static class EpgAllsumPurchasePrice implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryMemberPurchase)et).getAllsumPurchasePrice(); }
        public void write(Entity et, Object vl) { ((SummaryMemberPurchase)et).setAllsumPurchasePrice(cti(vl)); }
    }
    public static class EpgLatestPurchaseDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryMemberPurchase)et).getLatestPurchaseDatetime(); }
        public void write(Entity et, Object vl) { ((SummaryMemberPurchase)et).setLatestPurchaseDatetime((java.util.Date)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SUMMARY_MEMBER_PURCHASE";
    protected final String _tablePropertyName = "summaryMemberPurchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUMMARY_MEMBER_PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, true, true, "UnknownType", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAllsumPurchasePrice = cci("ALLSUM_PURCHASE_PRICE", "ALLSUM_PURCHASE_PRICE", null, null, Integer.class, "allsumPurchasePrice", null, false, false, false, "UnknownType", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnLatestPurchaseDatetime = cci("LATEST_PURCHASE_DATETIME", "LATEST_PURCHASE_DATETIME", null, null, java.util.Date.class, "latestPurchaseDatetime", null, false, false, false, "UnknownType", null, null, null, false, null, null, null, null, null);

    /**
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllsumPurchasePrice() { return _columnAllsumPurchasePrice; }
    /**
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLatestPurchaseDatetime() { return _columnLatestPurchaseDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnAllsumPurchasePrice());
        ls.add(columnLatestPurchaseDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.SummaryMemberPurchase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.SummaryMemberPurchaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.SummaryMemberPurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryMemberPurchase> getEntityType() { return SummaryMemberPurchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SummaryMemberPurchase newMyEntity() { return new SummaryMemberPurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SummaryMemberPurchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SummaryMemberPurchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
