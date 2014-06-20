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
 * The DB meta of purchase_payment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchasePaymentDbm _instance = new PurchasePaymentDbm();
    private PurchasePaymentDbm() {}
    public static PurchasePaymentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgPurchasePaymentId(), "purchasePaymentId");
        setupEpg(_epgMap, new EpgPurchaseId(), "purchaseId");
        setupEpg(_epgMap, new EpgPaymentAmount(), "paymentAmount");
        setupEpg(_epgMap, new EpgPaymentDatetime(), "paymentDatetime");
        setupEpg(_epgMap, new EpgPaymentMethodCode(), "paymentMethodCode");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
    }
    public static class EpgPurchasePaymentId implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getPurchasePaymentId(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setPurchasePaymentId(ctl(vl)); }
    }
    public static class EpgPurchaseId implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getPurchaseId(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setPurchaseId(ctl(vl)); }
    }
    public static class EpgPaymentAmount implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getPaymentAmount(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setPaymentAmount(ctb(vl)); }
    }
    public static class EpgPaymentDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getPaymentDatetime(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setPaymentDatetime((java.sql.Timestamp)vl); }
    }
    public class EpgPaymentMethodCode implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getPaymentMethodCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnPaymentMethodCode();
            ((PurchasePayment)et).setPaymentMethodCodeAsPaymentMethod((CDef.PaymentMethod)gcls(col, vl));
        }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setUpdateUser((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgPurchase(), "purchase");
    }
    public class EfpgPurchase implements PropertyGateway {
        public Object read(Entity et) { return ((PurchasePayment)et).getPurchase(); }
        public void write(Entity et, Object vl) { ((PurchasePayment)et).setPurchase((Purchase)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "purchase_payment";
    protected final String _tablePropertyName = "purchasePayment";
    protected final TableSqlName _tableSqlName = new TableSqlName("purchase_payment", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入支払";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "購入に対する支払。\n分割払いもできるのでmanyとなり、会員からの孫テーブルのテストができてうれしい。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchasePaymentId = cci("purchase_payment_id", "purchase_payment_id", null, "購入支払ID", Long.class, "purchasePaymentId", null, true, true, true, "bigserial", 19, 0, "nextval('purchase_payment_purchase_payment_id_seq'::regclass)", false, null, "連番", null, null, null);
    protected final ColumnInfo _columnPurchaseId = cci("purchase_id", "purchase_id", null, "購入ID", Long.class, "purchaseId", null, false, false, true, "int8", 19, 0, null, false, null, "支払い対象の購入へのID", "purchase", null, null);
    protected final ColumnInfo _columnPaymentAmount = cci("payment_amount", "payment_amount", null, "支払金額", java.math.BigDecimal.class, "paymentAmount", null, false, false, true, "numeric", 10, 2, null, false, null, "支払った金額。さて、小数点なのはなぜでしょう？", null, null, null);
    protected final ColumnInfo _columnPaymentDatetime = cci("payment_datetime", "payment_datetime", null, "支払日時", java.sql.Timestamp.class, "paymentDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, "支払ったときの日時", null, null, null);
    protected final ColumnInfo _columnPaymentMethodCode = cci("payment_method_code", "payment_method_code", null, "支払方法コード", String.class, "paymentMethodCode", null, false, false, true, "bpchar", 3, 0, null, false, null, "手渡しや銀行振込など", null, null, CDef.DefMeta.PaymentMethod);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null);

    /**
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePaymentId() { return _columnPurchasePaymentId; }
    /**
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentAmount() { return _columnPaymentAmount; }
    /**
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentDatetime() { return _columnPaymentDatetime; }
    /**
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethodCode() { return _columnPaymentMethodCode; }
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
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchasePaymentId());
        ls.add(columnPurchaseId());
        ls.add(columnPaymentAmount());
        ls.add(columnPaymentDatetime());
        ls.add(columnPaymentMethodCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchasePaymentId()); }
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
     * (購入)purchase by my purchase_id, named 'purchase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("fk_purchase_payment_purchase", "purchase", this, PurchaseDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "purchasePaymentList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "purchase_payment_purchase_payment_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.PurchasePayment"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.PurchasePaymentCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.PurchasePaymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchasePayment> getEntityType() { return PurchasePayment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchasePayment newEntity() { return new PurchasePayment(); }
    public PurchasePayment newMyEntity() { return new PurchasePayment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchasePayment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchasePayment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
