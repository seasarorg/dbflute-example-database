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
 * The DB meta of member_security. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberSecurityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberSecurityDbm _instance = new MemberSecurityDbm();
    private MemberSecurityDbm() {}
    public static MemberSecurityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgLoginPassword(), "loginPassword");
        setupEpg(_epgMap, new EpgReminderQuestion(), "reminderQuestion");
        setupEpg(_epgMap, new EpgReminderAnswer(), "reminderAnswer");
        setupEpg(_epgMap, new EpgReminderUseCount(), "reminderUseCount");
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
        public Object read(Entity et) { return ((MemberSecurity)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setMemberId(cti(vl)); }
    }
    public static class EpgLoginPassword implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getLoginPassword(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setLoginPassword((String)vl); }
    }
    public static class EpgReminderQuestion implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getReminderQuestion(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setReminderQuestion((String)vl); }
    }
    public static class EpgReminderAnswer implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getReminderAnswer(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setReminderAnswer((String)vl); }
    }
    public static class EpgReminderUseCount implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getReminderUseCount(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setReminderUseCount(cti(vl)); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setRegisterProcess((String)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setUpdateProcess((String)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setUpdateUser((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MemberSecurity)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MemberSecurity)et).setVersionNo(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_security";
    protected final String _tablePropertyName = "memberSecurity";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_security", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員セキュリティ情報";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員とは one-to-one で、会員一人につき必ず一つのセキュリティ情報がある";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", true, "memberId", Integer.class, true, false, "int4", 10, 0, null, false, null, "そのまま one-to-one を構成するためのFKとなる。", "member", null, null);
    protected final ColumnInfo _columnLoginPassword = cci("login_password", "login_password", null, "ログインパスワード", true, "loginPassword", String.class, false, false, "varchar", 50, 0, null, false, null, "ログイン時に利用するパスワード。\n本当は良くないが、Exampleなのでひとまず暗号化していない。", null, null, null);
    protected final ColumnInfo _columnReminderQuestion = cci("reminder_question", "reminder_question", null, "リマインダ質問", true, "reminderQuestion", String.class, false, false, "varchar", 50, 0, null, false, null, "パスワードを忘れた際のリマインダ機能における質問の内容。", null, null, null);
    protected final ColumnInfo _columnReminderAnswer = cci("reminder_answer", "reminder_answer", null, "リマインダ回答", true, "reminderAnswer", String.class, false, false, "varchar", 50, 0, null, false, null, "パスワードを忘れた際のリマインダ機能における質問の答え。", null, null, null);
    protected final ColumnInfo _columnReminderUseCount = cci("reminder_use_count", "reminder_use_count", null, "リマインダ利用回数", true, "reminderUseCount", Integer.class, false, false, "int4", 10, 0, null, false, null, "リマインダを利用した回数。\n多いと忘れっぽい会員と言えるが、\nそんなことを知ってもしょうがない。", null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, true, "registerProcess", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, true, "registerUser", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, true, "updateProcess", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, true, "updateUser", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, true, "versionNo", Long.class, false, false, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnLoginPassword() { return _columnLoginPassword; }
    public ColumnInfo columnReminderQuestion() { return _columnReminderQuestion; }
    public ColumnInfo columnReminderAnswer() { return _columnReminderAnswer; }
    public ColumnInfo columnReminderUseCount() { return _columnReminderUseCount; }
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
        ls.add(columnLoginPassword());
        ls.add(columnReminderQuestion());
        ls.add(columnReminderAnswer());
        ls.add(columnReminderUseCount());
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
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_member_sc_info_member", "member", this, MemberDbm.getInstance(), mp, 0, true, false, false, false, null, null, false, "memberSecurityAsOne");
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.MemberSecurity"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.MemberSecurityCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.MemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberSecurity> getEntityType() { return MemberSecurity.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MemberSecurity newMyEntity() { return new MemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberSecurity)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberSecurity)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
