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
 * The DB meta of MEMBER_WITHDRAWAL. (Singleton)
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
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
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
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setVersionNo(cti(vl)); }
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
    protected final String _tableDbName = "MEMBER_WITHDRAWAL";
    protected final String _tablePropertyName = "memberWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, false, true, "INTEGER", 2000000000, 10, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, String.class, "withdrawalReasonCode", null, false, false, false, "TEXT", 2000000000, 10, null, false, null, null, "withdrawalReason", null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, String.class, "withdrawalReasonInputText", null, false, false, false, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, java.sql.Timestamp.class, "withdrawalDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * MEMBER_ID: {PK, NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * WITHDRAWAL_REASON_CODE: {TEXT(2000000000, 10), FK to WITHDRAWAL_REASON}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * WITHDRAWAL_REASON_INPUT_TEXT: {TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    /**
     * WITHDRAWAL_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

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
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_ID_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "memberWithdrawalAsOne");
    }
    /**
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWithdrawalReason() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), WithdrawalReasonDbm.getInstance().columnWithdrawalReasonCode());
        return cfi("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON_CODE_WITHDRAWAL_REASON", "withdrawalReason", this, WithdrawalReasonDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "memberWithdrawalList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.MemberWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.MemberWithdrawalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.MemberWithdrawalBhv"; }

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
