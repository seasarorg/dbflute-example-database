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
 * The DB meta of MEMBER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberRegisterDatetime(), "memberRegisterDatetime");
        setupEpg(_epgMap, new EpgMemberRegisterUser(), "memberRegisterUser");
        setupEpg(_epgMap, new EpgMemberRegisterProcess(), "memberRegisterProcess");
        setupEpg(_epgMap, new EpgMemberUpdateDatetime(), "memberUpdateDatetime");
        setupEpg(_epgMap, new EpgMemberUpdateUser(), "memberUpdateUser");
        setupEpg(_epgMap, new EpgMemberUpdateProcess(), "memberUpdateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberId(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberId(cti(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberName(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberName((String)v); }
    }
    public static class EpgMemberAccount implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberAccount(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberAccount((String)v); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberStatusCode((String)v); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getBirthdate(); }
        public void write(Entity e, Object v) { ((Member)e).setBirthdate((java.util.Date)v); }
    }
    public static class EpgMemberRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberRegisterDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberRegisterDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgMemberRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberRegisterUser(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberRegisterUser((String)v); }
    }
    public static class EpgMemberRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberRegisterProcess(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberRegisterProcess((String)v); }
    }
    public static class EpgMemberUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberUpdateDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgMemberUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberUpdateUser(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberUpdateUser((String)v); }
    }
    public static class EpgMemberUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberUpdateProcess(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberUpdateProcess((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((Member)e).setVersionNo(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, true, true, "INTEGER", 2000000000, 10, null, false, null, null, "memberAddressAsValid,memberSecurityAsOne,memberWithdrawalAsOne", "memberAddressList,memberLoginList,memberServiceList,purchaseList", null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, true, "memberName", String.class, false, false, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, null, true, "memberAccount", String.class, false, false, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, true, "memberStatusCode", String.class, false, false, "TEXT", 2000000000, 10, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, false, "birthdate", java.util.Date.class, false, false, "DATE", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberRegisterDatetime = cci("MEMBER_REGISTER_DATETIME", "MEMBER_REGISTER_DATETIME", null, null, true, "memberRegisterDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnMemberRegisterUser = cci("MEMBER_REGISTER_USER", "MEMBER_REGISTER_USER", null, null, true, "memberRegisterUser", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnMemberRegisterProcess = cci("MEMBER_REGISTER_PROCESS", "MEMBER_REGISTER_PROCESS", null, null, true, "memberRegisterProcess", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnMemberUpdateDatetime = cci("MEMBER_UPDATE_DATETIME", "MEMBER_UPDATE_DATETIME", null, null, true, "memberUpdateDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnMemberUpdateUser = cci("MEMBER_UPDATE_USER", "MEMBER_UPDATE_USER", null, null, true, "memberUpdateUser", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnMemberUpdateProcess = cci("MEMBER_UPDATE_PROCESS", "MEMBER_UPDATE_PROCESS", null, null, true, "memberUpdateProcess", String.class, false, false, "TEXT", 2000000000, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Integer.class, false, false, "INTEGER", 2000000000, 10, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    public ColumnInfo columnMemberRegisterDatetime() { return _columnMemberRegisterDatetime; }
    public ColumnInfo columnMemberRegisterUser() { return _columnMemberRegisterUser; }
    public ColumnInfo columnMemberRegisterProcess() { return _columnMemberRegisterProcess; }
    public ColumnInfo columnMemberUpdateDatetime() { return _columnMemberUpdateDatetime; }
    public ColumnInfo columnMemberUpdateUser() { return _columnMemberUpdateUser; }
    public ColumnInfo columnMemberUpdateProcess() { return _columnMemberUpdateProcess; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
        ls.add(columnMemberRegisterDatetime());
        ls.add(columnMemberRegisterUser());
        ls.add(columnMemberRegisterProcess());
        ls.add(columnMemberUpdateDatetime());
        ls.add(columnMemberUpdateUser());
        ls.add(columnMemberUpdateProcess());
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
        return cfi("FK_MEMBER_MEMBER_STATUS_CODE_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "memberList");
    }
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), map, 1, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER_ID_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), map, 2, true, false, true, false, null, null, false, "member");
    }
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_ID_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), map, 3, true, false, true, false, null, null, false, "member");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER_ID_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER_ID_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberServiceDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_SERVICE_MEMBER_ID_MEMBER", "memberServiceList", this, MemberServiceDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER_ID_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), map, false, "member");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnMemberRegisterDatetime(), columnMemberRegisterUser(), columnMemberRegisterProcess(), columnMemberUpdateDatetime(), columnMemberUpdateUser(), columnMemberUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnMemberRegisterDatetime(), columnMemberRegisterUser(), columnMemberRegisterProcess(), columnMemberUpdateDatetime(), columnMemberUpdateUser(), columnMemberUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnMemberUpdateDatetime(), columnMemberUpdateUser(), columnMemberUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Member newMyEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Member)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Member)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
