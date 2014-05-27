package com.example.dbflute.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The DB meta of purchase. (Singleton)
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
    public class EpgPaymentCompleteFlg implements PropertyGateway {
        public Object read(Entity et) { return ((Purchase)et).getPaymentCompleteFlg(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnPaymentCompleteFlg();
            ((Purchase)et).setPaymentCompleteFlgAsFlg((CDef.Flg)gcls(col, vl));
        }
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
    protected final String _tableDbName = "purchase";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("purchase", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "一つの商品に対する購入を表現する。\n実業務であれば購入詳細というテーブルを作り、「購入という行為」と「その中身（詳細）」を違う粒度のデータとしてそれぞれ管理するのが一般的と言えるでしょう。というか、注文とか請求とかそういうことを考え始めたらもっと複雑になるはずですが、ExampleDBということで割り切っています。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("purchase_id", "purchase_id", null, null, Long.class, "purchaseId", null, true, true, true, "bigserial", 19, 0, "nextval('purchase_purchase_id_seq'::regclass)", false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, true, "int4", 10, 0, null, false, null, "会員を参照するID。\n購入を識別する自然キー（複合ユニーク制約）の筆頭要素。", "member", null, null);
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, "商品ID", Integer.class, "productId", null, false, false, true, "int4", 10, 0, null, false, null, "商品を参照するID。", "product", null, null);
    protected final ColumnInfo _columnPurchaseDatetime = cci("purchase_datetime", "purchase_datetime", null, "購入日時", java.sql.Timestamp.class, "purchaseDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, "購入した瞬間の日時。", null, null, null);
    protected final ColumnInfo _columnPurchaseCount = cci("purchase_count", "purchase_count", null, "購入数量", Integer.class, "purchaseCount", null, false, false, true, "int4", 10, 0, null, false, null, "購入した商品の（一回の購入における）数量。", null, null, null);
    protected final ColumnInfo _columnPurchasePrice = cci("purchase_price", "purchase_price", null, "購入価格", Integer.class, "purchasePrice", null, false, false, true, "int4", 10, 0, null, false, null, "購入によって実際に会員が支払った（支払う予定の）価格。\n基本は商品の定価に購入数量を掛けたものになるが、\nポイント利用や割引があったりと必ずしもそうはならない。", null, null, null);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("payment_complete_flg", "payment_complete_flg", null, "支払完了フラグ", Integer.class, "paymentCompleteFlg", null, false, false, true, "int4", 10, 0, null, false, null, "この購入に関しての支払いが完了しているか否か。", null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Long.class, "versionNo", null, false, false, true, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (商品ID)product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * (購入日時)purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * (購入数量)purchase_count: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * (購入価格)purchase_price: {IX, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * register_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * update_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * version_no: {NotNull, int8(19)}
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
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員)member by my member_id, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_purchase_member", "member", this, MemberDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "purchaseList");
    }
    /**
     * (商品)product by my product_id, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("fk_purchase_product", "product", this, ProductDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "purchaseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_PURCHASE"; }
    public Integer getSequenceIncrementSize() { return 6; }
    public Integer getSequenceCacheSize() { return 6; }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.Purchase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.PurchaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.PurchaseBhv"; }

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
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Purchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Purchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
