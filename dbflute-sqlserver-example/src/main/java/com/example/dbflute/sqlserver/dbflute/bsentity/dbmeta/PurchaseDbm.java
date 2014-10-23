package com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

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
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public static class EpgPurchaseId implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPurchaseId(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setPurchaseId(ctl(vl)); }
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
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setRegisterUser((String)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setRegisterProcess((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setUpdateUser((String)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setUpdateProcess((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setVersionNo(ctl(vl)); }
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
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getMember(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setMember((Member)vl); }
    }
    public class EfpgProduct implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getProduct(); }
        public void write(Entity et, Object vl) { ((Purchase)et).setProduct((Product)vl); }
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
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, Long.class, "purchaseId", null, true, true, true, "bigint identity", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "int", 10, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Integer.class, "productId", null, false, false, true, "int", 10, 0, null, false, null, null, "product", null, null);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, java.sql.Timestamp.class, "purchaseDatetime", null, false, false, true, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, Integer.class, "purchaseCount", null, false, false, true, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, Integer.class, "purchasePrice", null, false, false, true, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, Integer.class, "paymentCompleteFlg", null, false, false, true, "int", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "datetime", 23, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "datetime", 23, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * PURCHASE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * MEMBER_ID: {NotNull, int(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * PRODUCT_ID: {NotNull, int(10), FK to PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PURCHASE_DATETIME: {NotNull, datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * PURCHASE_COUNT: {NotNull, int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * PURCHASE_PRICE: {NotNull, int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * PAYMENT_COMPLETE_FLG: {NotNull, int(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    /**
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, bigint(19)}
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
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
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
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "purchaseList");
    }
    /**
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT", "product", this, ProductDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "purchaseList");
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
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.Purchase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.sqlserver.dbflute.cbean.PurchaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.sqlserver.dbflute.exbhv.PurchaseBhv"; }

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
