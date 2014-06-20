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
 * The DB meta of member_withdrawal. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberWithdrawalDbm _instance = new MemberWithdrawalDbm();
    private MemberWithdrawalDbm() {}
    public static MemberWithdrawalDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonInputText(), "withdrawalReasonInputText");
        setupEpg(_epgMap, new EpgWithdrawalDatetime(), "withdrawalDatetime");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setMemberId(cti(vl)); }
    }
    public static class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalReasonCode(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalReasonCode((String)vl); }
    }
    public static class EpgWithdrawalReasonInputText implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalReasonInputText(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalReasonInputText((String)vl); }
    }
    public static class EpgWithdrawalDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalDatetime(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setRegisterProcess((String)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setUpdateProcess((String)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setUpdateUser((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgWithdrawalReason(), "withdrawalReason");
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getMember(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setMember((Member)vl); }
    }
    public class EfpgWithdrawalReason implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalReason(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalReason((WithdrawalReason)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_withdrawal";
    protected final String _tablePropertyName = "memberWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_withdrawal", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員退会情報";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "退会会員の退会に関する詳細な情報。\n退会会員のみデータが存在する。（\"1 : 0...1\" のパターンの one-to-one）\n共通カラムがあってバージョンNOがないパターン。基本的に更新が入ることはないが、登録ユーザを保持したいのと、重要なデータなので更新系の情報も。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, null, Integer.class, "memberId", null, true, false, true, "int4", 10, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("withdrawal_reason_code", "withdrawal_reason_code", null, "退会理由コード", String.class, "withdrawalReasonCode", null, false, false, false, "bpchar", 3, 0, null, false, null, "退会した定型理由を参照するコード。\n何も言わずに退会する会員もいるので必須項目ではない。", "withdrawalReason", null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("withdrawal_reason_input_text", "withdrawal_reason_input_text", null, "退会理由入力テキスト", String.class, "withdrawalReasonInputText", null, false, false, false, "text", 2147483647, 0, null, false, null, "会員がフリーテキストで入力できる退会理由。\nもう言いたいこと言ってもらう感じ。\nサイト運営側としては真摯に受け止めて改善していきたい。", null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("withdrawal_datetime", "withdrawal_datetime", null, "退会日時", java.sql.Timestamp.class, "withdrawalDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, "退会した瞬間の日時。\n正式会員日時と違い、こっちはone-to-oneの別テーブルで。", null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);

    /**
     * member_id: {PK, NotNull, int4(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    /**
     * (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
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
     * update_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterProcess());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateProcess());
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
    /**
     * (会員)member by my member_id, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_member_withdrawal_info_member", "member", this, MemberDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "memberWithdrawalAsOne");
    }
    /**
     * (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWithdrawalReason() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), WithdrawalReasonDbm.getInstance().columnWithdrawalReasonCode());
        return cfi("fk_member_withdrawal_info_withdrawal_reason", "withdrawalReason", this, WithdrawalReasonDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "memberWithdrawalList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.MemberWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.MemberWithdrawalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.MemberWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberWithdrawal> getEntityType() { return MemberWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberWithdrawal newEntity() { return new MemberWithdrawal(); }
    public MemberWithdrawal newMyEntity() { return new MemberWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberWithdrawal)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberWithdrawal)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
