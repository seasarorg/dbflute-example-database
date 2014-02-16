package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of SUMMARY_MEMBER_PURCHASE. (Singleton)
 * @author oracleman
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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgAllsumPurchasePrice(), "allsumPurchasePrice");
        setupEpg(_epgMap, new EpgLatestPurchaseDatetime(), "latestPurchaseDatetime");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryMemberPurchase)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((SummaryMemberPurchase)et).setMemberId(ctl(vl)); }
    }
    public static class EpgAllsumPurchasePrice implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryMemberPurchase)et).getAllsumPurchasePrice(); }
        public void write(Entity et, Object vl) { ((SummaryMemberPurchase)et).setAllsumPurchasePrice(ctb(vl)); }
    }
    public static class EpgLatestPurchaseDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryMemberPurchase)et).getLatestPurchaseDatetime(); }
        public void write(Entity et, Object vl) { ((SummaryMemberPurchase)et).setLatestPurchaseDatetime((java.sql.Timestamp)vl); }
    }

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
    protected final String _tableAlias = "会員購入さまりまてびゅー";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "まてびゅーのコメントはALL_MVIEW_COMMENTSだって";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAllsumPurchasePrice = cci("ALLSUM_PURCHASE_PRICE", "ALLSUM_PURCHASE_PRICE", null, null, false, "allsumPurchasePrice", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnLatestPurchaseDatetime = cci("LATEST_PURCHASE_DATETIME", "LATEST_PURCHASE_DATETIME", null, null, false, "latestPurchaseDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP(3)", 11, 3, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnAllsumPurchasePrice() { return _columnAllsumPurchasePrice; }
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SummaryMemberPurchase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SummaryMemberPurchaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SummaryMemberPurchaseBhv"; }

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
