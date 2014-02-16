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
        public Object read(Entity et) { return ((Member)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberName((String)vl); }
    }
    public static class EpgMemberAccount implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberAccount(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberAccount((String)vl); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberStatusCode(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberStatusCode((String)vl); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getFormalizedDatetime(); }
        public void write(Entity et, Object vl) { ((Member)et).setFormalizedDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getBirthdate(); }
        public void write(Entity et, Object vl) { ((Member)et).setBirthdate((java.util.Date)vl); }
    }
    public static class EpgMemberRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgMemberRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberRegisterUser(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberRegisterUser((String)vl); }
    }
    public static class EpgMemberRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberRegisterProcess(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberRegisterProcess((String)vl); }
    }
    public static class EpgMemberUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgMemberUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberUpdateUser(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberUpdateUser((String)vl); }
    }
    public static class EpgMemberUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getMemberUpdateProcess(); }
        public void write(Entity et, Object vl) { ((Member)et).setMemberUpdateProcess((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((Member)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((Member)et).setVersionNo(cti(vl)); }
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
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS_CODE_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "memberList");
    }
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), mp, 1, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER_ID_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), mp, 2, true, false, true, false, null, null, false, "member");
    }
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_ID_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), mp, 3, true, false, true, false, null, null, false, "member");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER_ID_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), mp, false, "member");
    }
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER_ID_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "member");
    }
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberServiceDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_SERVICE_MEMBER_ID_MEMBER", "memberServiceList", this, MemberServiceDbm.getInstance(), mp, false, "member");
    }
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER_ID_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "member");
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
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Member)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Member)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
