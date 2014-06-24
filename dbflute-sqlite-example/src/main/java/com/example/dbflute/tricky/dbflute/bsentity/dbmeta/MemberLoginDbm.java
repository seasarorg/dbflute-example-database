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
 * The DB meta of MEMBER_LOGIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberLoginDbm _instance = new MemberLoginDbm();
    private MemberLoginDbm() {}
    public static MemberLoginDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberLoginId(), "memberLoginId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgLoginDatetime(), "loginDatetime");
        setupEpg(_epgMap, new EpgMobileLoginFlg(), "mobileLoginFlg");
        setupEpg(_epgMap, new EpgLoginMemberStatusCode(), "loginMemberStatusCode");
    }
    public static class EpgMemberLoginId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getMemberLoginId(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setMemberLoginId(cti(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setMemberId(cti(vl)); }
    }
    public static class EpgLoginDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getLoginDatetime(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setLoginDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgMobileLoginFlg implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getMobileLoginFlg(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setMobileLoginFlg(cti(vl)); }
    }
    public static class EpgLoginMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getLoginMemberStatusCode(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setLoginMemberStatusCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMemberStatus(), "memberStatus");
        setupEfpg(_efpgMap, new EfpgMember(), "member");
    }
    public class EfpgMemberStatus implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getMemberStatus(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setMemberStatus((MemberStatus)vl); }
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((MemberLogin)et).getMember(); }
        public void write(Entity et, Object vl) { ((MemberLogin)et).setMember((Member)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_LOGIN";
    protected final String _tablePropertyName = "memberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, null, Integer.class, "memberLoginId", null, true, true, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, null, java.sql.Timestamp.class, "loginDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, null, Integer.class, "mobileLoginFlg", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, null, String.class, "loginMemberStatusCode", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);

    /**
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    /**
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginDatetime() { return _columnLoginDatetime; }
    /**
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobileLoginFlg() { return _columnMobileLoginFlg; }
    /**
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginMemberStatusCode() { return _columnLoginMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberLoginId());
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        ls.add(columnMobileLoginFlg());
        ls.add(columnLoginMemberStatusCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberLoginId()); }
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
     * MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_LOGIN_MEMBER_STATUS_CODE_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "memberLoginList");
    }
    /**
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_ID_MEMBER", "member", this, MemberDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "memberLoginList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.MemberLogin"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.MemberLoginCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.MemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberLogin> getEntityType() { return MemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberLogin newEntity() { return new MemberLogin(); }
    public MemberLogin newMyEntity() { return new MemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
