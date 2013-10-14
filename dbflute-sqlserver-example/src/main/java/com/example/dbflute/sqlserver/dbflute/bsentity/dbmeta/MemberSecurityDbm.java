package com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_SECURITY. (Singleton)
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
        public Object read(Entity e) { return ((MemberSecurity)e).getMemberId(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setMemberId(cti(v)); }
    }
    public static class EpgLoginPassword implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getLoginPassword(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setLoginPassword((String)v); }
    }
    public static class EpgReminderQuestion implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getReminderQuestion(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setReminderQuestion((String)v); }
    }
    public static class EpgReminderAnswer implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getReminderAnswer(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setReminderAnswer((String)v); }
    }
    public static class EpgReminderUseCount implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getReminderUseCount(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setReminderUseCount(cti(v)); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setRegisterDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getRegisterProcess(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setRegisterProcess((String)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setRegisterUser((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getUpdateProcess(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setUpdateProcess((String)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setUpdateUser((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((MemberSecurity)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((MemberSecurity)e).setVersionNo(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_SECURITY";
    protected final String _tablePropertyName = "memberSecurity";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_SECURITY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, true, false, "int", 10, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnLoginPassword = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, null, true, "loginPassword", String.class, false, false, "nvarchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReminderQuestion = cci("REMINDER_QUESTION", "REMINDER_QUESTION", null, null, true, "reminderQuestion", String.class, false, false, "nvarchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReminderAnswer = cci("REMINDER_ANSWER", "REMINDER_ANSWER", null, null, true, "reminderAnswer", String.class, false, false, "nvarchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReminderUseCount = cci("REMINDER_USE_COUNT", "REMINDER_USE_COUNT", null, null, true, "reminderUseCount", Integer.class, false, false, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, true, "registerProcess", String.class, false, false, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, true, "updateProcess", String.class, false, false, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Long.class, false, false, "bigint", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

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
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "member", this, MemberDbm.getInstance(), map, 0, true, false, false, false, null, null, false, "memberSecurityAsOne");
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
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.MemberSecurity"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.sqlserver.dbflute.cbean.MemberSecurityCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.sqlserver.dbflute.exbhv.MemberSecurityBhv"; }

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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((MemberSecurity)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((MemberSecurity)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
