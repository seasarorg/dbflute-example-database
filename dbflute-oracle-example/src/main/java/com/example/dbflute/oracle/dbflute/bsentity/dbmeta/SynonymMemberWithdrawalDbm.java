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
 * The DB meta of SYNONYM_MEMBER_WITHDRAWAL. (Singleton)
 * @author oracleman
 */
public class SynonymMemberWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymMemberWithdrawalDbm _instance = new SynonymMemberWithdrawalDbm();
    private SynonymMemberWithdrawalDbm() {}
    public static SynonymMemberWithdrawalDbm getInstance() { return _instance; }

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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getMemberId(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setMemberId(ctl(v)); }
    }
    public static class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getWithdrawalReasonCode(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setWithdrawalReasonCode((String)v); }
    }
    public static class EpgWithdrawalReasonInputText implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getWithdrawalReasonInputText(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setWithdrawalReasonInputText((String)v); }
    }
    public static class EpgWithdrawalDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getWithdrawalDatetime(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setWithdrawalDatetime((java.util.Date)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setRegisterDatetime((java.util.Date)v); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getRegisterProcess(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setRegisterProcess((String)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setRegisterUser((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setUpdateDatetime((java.util.Date)v); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getUpdateProcess(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setUpdateProcess((String)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setUpdateUser((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymMemberWithdrawal)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((SynonymMemberWithdrawal)e).setVersionNo(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_MEMBER_WITHDRAWAL";
    protected final String _tablePropertyName = "synonymMemberWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_MEMBER_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableComment = "退会するとInsertされる";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, "memberVendorSynonym,synonymMember,vendorSynonymMember", null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, false, "withdrawalReasonCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "withdrawalReason", null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, false, "withdrawalReasonInputText", String.class, false, false, "CLOB", 4000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, true, "withdrawalDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, true, "registerProcess", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, true, "updateProcess", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Long.class, false, false, "NUMBER", 16, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMemberVendorSynonym() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberVendorSynonymDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_SYNONYM1", "memberVendorSynonym", this, MemberVendorSynonymDbm.getInstance(), map, 0, true, false, false, false, null, null, false, "synonymMemberWithdrawalAsOne");
    }
    public ForeignInfo foreignWithdrawalReason() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnWithdrawalReasonCode(), WithdrawalReasonDbm.getInstance().columnWithdrawalReasonCode());
        return cfi("FK_MEMBER_WITHDRAWAL_REASON", "withdrawalReason", this, WithdrawalReasonDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "synonymMemberWithdrawalList");
    }
    public ForeignInfo foreignSynonymMember() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), SynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_SYNONYM2", "synonymMember", this, SynonymMemberDbm.getInstance(), map, 2, true, false, false, false, null, null, false, "synonymMemberWithdrawalAsOne");
    }
    public ForeignInfo foreignVendorSynonymMember() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), VendorSynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_SYNONYM3", "vendorSynonymMember", this, VendorSynonymMemberDbm.getInstance(), map, 3, true, false, false, false, null, null, false, "synonymMemberWithdrawalAsOne");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymMemberWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymMemberWithdrawalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymMemberWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymMemberWithdrawal> getEntityType() { return SynonymMemberWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SynonymMemberWithdrawal newMyEntity() { return new SynonymMemberWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SynonymMemberWithdrawal)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SynonymMemberWithdrawal)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
