package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The DB meta of ALIAS_MEMBER_LOGIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AliasMemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AliasMemberLoginDbm _instance = new AliasMemberLoginDbm();
    private AliasMemberLoginDbm() {}
    public static AliasMemberLoginDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberLoginId(), "memberLoginId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgLoginDatetime(), "loginDatetime");
        setupEpg(_epgMap, new EpgMobileLoginFlg(), "mobileLoginFlg");
        setupEpg(_epgMap, new EpgLoginMemberStatusCode(), "loginMemberStatusCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberLoginId implements PropertyGateway {
        public Object read(Entity et) { return ((AliasMemberLogin)et).getMemberLoginId(); }
        public void write(Entity et, Object vl) { ((AliasMemberLogin)et).setMemberLoginId(ctl(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((AliasMemberLogin)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((AliasMemberLogin)et).setMemberId(cti(vl)); }
    }
    public static class EpgLoginDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((AliasMemberLogin)et).getLoginDatetime(); }
        public void write(Entity et, Object vl) { ((AliasMemberLogin)et).setLoginDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgMobileLoginFlg implements PropertyGateway {
        public Object read(Entity et) { return ((AliasMemberLogin)et).getMobileLoginFlg(); }
        public void write(Entity et, Object vl) { ((AliasMemberLogin)et).setMobileLoginFlg(cti(vl)); }
    }
    public static class EpgLoginMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((AliasMemberLogin)et).getLoginMemberStatusCode(); }
        public void write(Entity et, Object vl) { ((AliasMemberLogin)et).setLoginMemberStatusCode((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ALIAS_MEMBER_LOGIN";
    protected final String _tablePropertyName = "aliasMemberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("ALIAS_MEMBER_LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, "会員ログインID", true, "memberLoginId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", true, "memberId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "aliasMember", null, null);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, "ログイン日時", true, "loginDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, "モバイルログインフラグ", true, "mobileLoginFlg", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, "ログイン時会員ステータスコード", true, "loginMemberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);

    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnLoginDatetime() { return _columnLoginDatetime; }
    public ColumnInfo columnMobileLoginFlg() { return _columnMobileLoginFlg; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignAliasMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), AliasMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER", "aliasMember", this, AliasMemberDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "aliasMemberLoginList");
    }
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "aliasMemberLoginList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.AliasMemberLogin"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.AliasMemberLoginCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.AliasMemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AliasMemberLogin> getEntityType() { return AliasMemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public AliasMemberLogin newMyEntity() { return new AliasMemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AliasMemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AliasMemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
