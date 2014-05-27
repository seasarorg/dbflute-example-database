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
 * The DB meta of withdrawal_reason. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WithdrawalReasonDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WithdrawalReasonDbm _instance = new WithdrawalReasonDbm();
    private WithdrawalReasonDbm() {}
    public static WithdrawalReasonDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonText(), "withdrawalReasonText");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public static class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity et) { return ((WithdrawalReason)et).getWithdrawalReasonCode(); }
        public void write(Entity et, Object vl) { ((WithdrawalReason)et).setWithdrawalReasonCode((String)vl); }
    }
    public static class EpgWithdrawalReasonText implements PropertyGateway {
        public Object read(Entity et) { return ((WithdrawalReason)et).getWithdrawalReasonText(); }
        public void write(Entity et, Object vl) { ((WithdrawalReason)et).setWithdrawalReasonText((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((WithdrawalReason)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((WithdrawalReason)et).setDisplayOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "withdrawal_reason";
    protected final String _tablePropertyName = "withdrawalReason";
    protected final TableSqlName _tableSqlName = new TableSqlName("withdrawal_reason", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "退会理由";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員に選ばせる定型的な退会理由のマスタ。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("withdrawal_reason_code", "withdrawal_reason_code", null, "退会理由コード", String.class, "withdrawalReasonCode", null, true, false, true, "bpchar", 3, 0, null, false, null, null, null, "memberWithdrawalList", null);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("withdrawal_reason_text", "withdrawal_reason_text", null, "退会理由テキスト", String.class, "withdrawalReasonText", null, false, false, true, "text", 2147483647, 0, null, false, null, "退会理由の内容。テキスト形式なので目いっぱい書けるが、\nそうするとUI側できれいに見せるのが大変でしょうね。", null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, null, Integer.class, "displayOrder", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null);

    /**
     * (退会理由コード)withdrawal_reason_code: {PK, NotNull, bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * (退会理由テキスト)withdrawal_reason_text: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    /**
     * display_order: {UQ, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
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
    protected UniqueInfo cpui() { return hpcpui(columnWithdrawalReasonCode()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員退会情報)member_withdrawal by withdrawal_reason_code, named 'memberWithdrawalList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberWithdrawalList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), MemberWithdrawalDbm.getInstance().columnWithdrawalReasonCode());
        return cri("fk_member_withdrawal_info_withdrawal_reason", "memberWithdrawalList", this, MemberWithdrawalDbm.getInstance(), mp, false, "withdrawalReason");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.WithdrawalReason"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.WithdrawalReasonCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.WithdrawalReasonBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WithdrawalReason> getEntityType() { return WithdrawalReason.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WithdrawalReason newMyEntity() { return new WithdrawalReason(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WithdrawalReason)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WithdrawalReason)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
