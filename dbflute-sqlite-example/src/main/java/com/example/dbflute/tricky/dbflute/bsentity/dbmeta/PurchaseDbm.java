package com.example.dbflute.tricky.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.tricky.dbflute.allcommon.*;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The DB meta of PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseDbm _instance = new PurchaseDbm();
    private PurchaseDbm() {}
    public static PurchaseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPurchaseId(), "purchaseId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgPurchaseDatetime(), "purchaseDatetime");
        setupEpg(_epgMap, new EpgPurchaseCount(), "purchaseCount");
        setupEpg(_epgMap, new EpgPurchasePrice(), "purchasePrice");
        setupEpg(_epgMap, new EpgPaymentCompleteFlg(), "paymentCompleteFlg");
        setupEpg(_epgMap, new EpgPurchaseRegisterDatetime(), "purchaseRegisterDatetime");
        setupEpg(_epgMap, new EpgPurchaseRegisterUser(), "purchaseRegisterUser");
        setupEpg(_epgMap, new EpgPurchaseRegisterProcess(), "purchaseRegisterProcess");
        setupEpg(_epgMap, new EpgPurchaseUpdateDatetime(), "purchaseUpdateDatetime");
        setupEpg(_epgMap, new EpgPurchaseUpdateUser(), "purchaseUpdateUser");
        setupEpg(_epgMap, new EpgPurchaseUpdateProcess(), "purchaseUpdateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPurchaseId implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseId(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseId(cti(v)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getMemberId(); }
        public void write(Entity e, Object v) { ((Purchase)e).setMemberId(cti(v)); }
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getProductId(); }
        public void write(Entity e, Object v) { ((Purchase)e).setProductId(cti(v)); }
    }
    public static class EpgPurchaseDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseDatetime(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgPurchaseCount implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseCount(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseCount(cti(v)); }
    }
    public static class EpgPurchasePrice implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchasePrice(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchasePrice(cti(v)); }
    }
    public static class EpgPaymentCompleteFlg implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPaymentCompleteFlg(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPaymentCompleteFlg(cti(v)); }
    }
    public static class EpgPurchaseRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseRegisterDatetime(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseRegisterDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgPurchaseRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseRegisterUser(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseRegisterUser((String)v); }
    }
    public static class EpgPurchaseRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseRegisterProcess(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseRegisterProcess((String)v); }
    }
    public static class EpgPurchaseUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseUpdateDatetime(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgPurchaseUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseUpdateUser(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseUpdateUser((String)v); }
    }
    public static class EpgPurchaseUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getPurchaseUpdateProcess(); }
        public void write(Entity e, Object v) { ((Purchase)e).setPurchaseUpdateProcess((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((Purchase)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((Purchase)e).setVersionNo(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, true, "purchaseId", Integer.class, true, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, true, "productId", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, null, null, "product,summaryProduct", null, null);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, true, "purchaseDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, true, "purchaseCount", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, true, "purchasePrice", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, true, "paymentCompleteFlg", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnPurchaseRegisterDatetime = cci("PURCHASE_REGISTER_DATETIME", "PURCHASE_REGISTER_DATETIME", null, null, true, "purchaseRegisterDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseRegisterUser = cci("PURCHASE_REGISTER_USER", "PURCHASE_REGISTER_USER", null, null, true, "purchaseRegisterUser", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseRegisterProcess = cci("PURCHASE_REGISTER_PROCESS", "PURCHASE_REGISTER_PROCESS", null, null, true, "purchaseRegisterProcess", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseUpdateDatetime = cci("PURCHASE_UPDATE_DATETIME", "PURCHASE_UPDATE_DATETIME", null, null, true, "purchaseUpdateDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseUpdateUser = cci("PURCHASE_UPDATE_USER", "PURCHASE_UPDATE_USER", null, null, true, "purchaseUpdateUser", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseUpdateProcess = cci("PURCHASE_UPDATE_PROCESS", "PURCHASE_UPDATE_PROCESS", null, null, true, "purchaseUpdateProcess", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnProductId() { return _columnProductId; }
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    public ColumnInfo columnPurchaseRegisterDatetime() { return _columnPurchaseRegisterDatetime; }
    public ColumnInfo columnPurchaseRegisterUser() { return _columnPurchaseRegisterUser; }
    public ColumnInfo columnPurchaseRegisterProcess() { return _columnPurchaseRegisterProcess; }
    public ColumnInfo columnPurchaseUpdateDatetime() { return _columnPurchaseUpdateDatetime; }
    public ColumnInfo columnPurchaseUpdateUser() { return _columnPurchaseUpdateUser; }
    public ColumnInfo columnPurchaseUpdateProcess() { return _columnPurchaseUpdateProcess; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
        ls.add(columnPurchaseRegisterDatetime());
        ls.add(columnPurchaseRegisterUser());
        ls.add(columnPurchaseRegisterProcess());
        ls.add(columnPurchaseUpdateDatetime());
        ls.add(columnPurchaseUpdateUser());
        ls.add(columnPurchaseUpdateProcess());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER_ID_MEMBER", "member", this, MemberDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "purchaseList");
    }
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT_ID_PRODUCT", "product", this, ProductDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "purchaseList");
    }
    public ForeignInfo foreignSummaryProduct() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnProductId(), SummaryProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_SUMMARY_PRODUCT", "summaryProduct", this, SummaryProductDbm.getInstance(), map, 2, false, false, false, true, null, null, false, "purchaseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnPurchaseRegisterDatetime(), columnPurchaseRegisterUser(), columnPurchaseRegisterProcess(), columnPurchaseUpdateDatetime(), columnPurchaseUpdateUser(), columnPurchaseUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnPurchaseRegisterDatetime(), columnPurchaseRegisterUser(), columnPurchaseRegisterProcess(), columnPurchaseUpdateDatetime(), columnPurchaseUpdateUser(), columnPurchaseUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnPurchaseUpdateDatetime(), columnPurchaseUpdateUser(), columnPurchaseUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.Purchase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.PurchaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.PurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Purchase> getEntityType() { return Purchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Purchase newMyEntity() { return new Purchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Purchase)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Purchase)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
