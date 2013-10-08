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
 * The DB meta of MEMBER_VENDOR_SYNONYM. (Singleton)
 * @author oracleman
 */
public class MemberVendorSynonymDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberVendorSynonymDbm _instance = new MemberVendorSynonymDbm();
    private MemberVendorSynonymDbm() {}
    public static MemberVendorSynonymDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgMemberAccount(), "memberAccount");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getMemberId(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setMemberId(ctl(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getMemberName(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setMemberName((String)v); }
    }
    public static class EpgMemberAccount implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getMemberAccount(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setMemberAccount((String)v); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setMemberStatusCode((String)v); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getBirthdate(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setBirthdate((java.util.Date)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setRegisterDatetime((java.util.Date)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setRegisterUser((String)v); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getRegisterProcess(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setRegisterProcess((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setUpdateDatetime((java.util.Date)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setUpdateUser((String)v); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getUpdateProcess(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setUpdateProcess((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((MemberVendorSynonym)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((MemberVendorSynonym)e).setVersionNo(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_VENDOR_SYNONYM";
    protected final String _tablePropertyName = "memberVendorSynonym";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_VENDOR_SYNONYM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員登録時にInsertされる。\n物理削除されることはない";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", true, "memberId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, "連番", null, "synonymMemberLoginList", null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", true, "memberName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, "会員検索の条件となる。", null, null, null);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, "会員アカウント", true, "memberAccount", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, "ログインに利用。\n完全にユニークである", null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", true, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP(3)", 11, 3, null, false, null, "正式会員になったら値が格納される", null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", false, "birthdate", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, "わからない場合はnull", null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", true, "registerDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザ", true, "registerUser", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, "登録プロセス", true, "registerProcess", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", true, "updateDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", true, "updateUser", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, "更新プロセス", true, "updateProcess", String.class, false, false, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョンNO", true, "versionNo", Long.class, false, false, "NUMBER", 16, 0, null, false, OptimisticLockType.VERSION_NO, "排他制御に利用される", null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "memberVendorSynonymList");
    }
    public ForeignInfo foreignSynonymMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), SynonymMemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_SYNONYM1", "synonymMemberWithdrawalAsOne", this, SynonymMemberWithdrawalDbm.getInstance(), map, 1, true, false, true, false, null, null, false, "memberVendorSynonym");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerSynonymMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), SynonymMemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER_SYNONYM1", "synonymMemberLoginList", this, SynonymMemberLoginDbm.getInstance(), map, false, "memberVendorSynonym");
    }

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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.MemberVendorSynonym"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.MemberVendorSynonymCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.MemberVendorSynonymBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberVendorSynonym> getEntityType() { return MemberVendorSynonym.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MemberVendorSynonym newMyEntity() { return new MemberVendorSynonym(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((MemberVendorSynonym)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((MemberVendorSynonym)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
