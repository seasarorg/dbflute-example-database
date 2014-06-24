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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public static class EpgPurchaseId implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseId(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseId(cti(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setMemberId(cti(vl)); }
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getProductId(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setProductId(cti(vl)); }
    }
    public static class EpgPurchaseDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseDatetime(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgPurchaseCount implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseCount(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseCount(cti(vl)); }
    }
    public static class EpgPurchasePrice implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchasePrice(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchasePrice(cti(vl)); }
    }
    public static class EpgPaymentCompleteFlg implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPaymentCompleteFlg(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPaymentCompleteFlg(cti(vl)); }
    }
    public static class EpgPurchaseRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgPurchaseRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseRegisterUser(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseRegisterUser((String)vl); }
    }
    public static class EpgPurchaseRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseRegisterProcess(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseRegisterProcess((String)vl); }
    }
    public static class EpgPurchaseUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgPurchaseUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseUpdateUser(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseUpdateUser((String)vl); }
    }
    public static class EpgPurchaseUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseUpdateProcess(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseUpdateProcess((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setVersionNo(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgProduct(), "product");
        setupEfpg(_efpgMap, new EfpgSummaryProduct(), "summaryProduct");
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getMember(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setMember((Member)vl); }
    }
    public class EfpgProduct implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getProduct(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setProduct((Product)vl); }
    }
    public class EfpgSummaryProduct implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getSummaryProduct(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setSummaryProduct((SummaryProduct)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, Integer.class, "purchaseId", null, true, true, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Integer.class, "productId", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, "product,summaryProduct", null, null);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, java.sql.Timestamp.class, "purchaseDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, Integer.class, "purchaseCount", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, Integer.class, "purchasePrice", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, Integer.class, "paymentCompleteFlg", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnPurchaseRegisterDatetime = cci("PURCHASE_REGISTER_DATETIME", "PURCHASE_REGISTER_DATETIME", null, null, java.sql.Timestamp.class, "purchaseRegisterDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseRegisterUser = cci("PURCHASE_REGISTER_USER", "PURCHASE_REGISTER_USER", null, null, String.class, "purchaseRegisterUser", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseRegisterProcess = cci("PURCHASE_REGISTER_PROCESS", "PURCHASE_REGISTER_PROCESS", null, null, String.class, "purchaseRegisterProcess", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseUpdateDatetime = cci("PURCHASE_UPDATE_DATETIME", "PURCHASE_UPDATE_DATETIME", null, null, java.sql.Timestamp.class, "purchaseUpdateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseUpdateUser = cci("PURCHASE_UPDATE_USER", "PURCHASE_UPDATE_USER", null, null, String.class, "purchaseUpdateUser", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseUpdateProcess = cci("PURCHASE_UPDATE_PROCESS", "PURCHASE_UPDATE_PROCESS", null, null, String.class, "purchaseUpdateProcess", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    /**
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseRegisterDatetime() { return _columnPurchaseRegisterDatetime; }
    /**
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseRegisterUser() { return _columnPurchaseRegisterUser; }
    /**
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseRegisterProcess() { return _columnPurchaseRegisterProcess; }
    /**
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseUpdateDatetime() { return _columnPurchaseUpdateDatetime; }
    /**
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseUpdateUser() { return _columnPurchaseUpdateUser; }
    /**
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseUpdateProcess() { return _columnPurchaseUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER_ID_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "purchaseList");
    }
    /**
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT_ID_PRODUCT", "product", this, ProductDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "purchaseList");
    }
    /**
     * SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSummaryProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), SummaryProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_SUMMARY_PRODUCT", "summaryProduct", this, SummaryProductDbm.getInstance(), mp, 2, null, false, false, false, true, null, null, false, "purchaseList");
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
    public Purchase newEntity() { return new Purchase(); }
    public Purchase newMyEntity() { return new Purchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Purchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Purchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
