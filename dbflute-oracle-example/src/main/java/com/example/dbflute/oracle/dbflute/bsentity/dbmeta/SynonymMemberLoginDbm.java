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
 * The DB meta of SYNONYM_MEMBER_LOGIN. (Singleton)
 * @author oracleman
 */
public class SynonymMemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymMemberLoginDbm _instance = new SynonymMemberLoginDbm();
    private SynonymMemberLoginDbm() {}
    public static SynonymMemberLoginDbm getInstance() { return _instance; }

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
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getMemberLoginId(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setMemberLoginId(ctl(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setMemberId(ctl(vl)); }
    }
    public static class EpgLoginDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getLoginDatetime(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setLoginDatetime((java.util.Date)vl); }
    }
    public static class EpgMobileLoginFlg implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getMobileLoginFlg(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setMobileLoginFlg(cti(vl)); }
    }
    public static class EpgLoginMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getLoginMemberStatusCode(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setLoginMemberStatusCode((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_MEMBER_LOGIN";
    protected final String _tablePropertyName = "synonymMemberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_MEMBER_LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員ログイン";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "ログインの度にInsertされる";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, null, true, "memberLoginId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, "memberVendorSynonym,synonymMember,vendorSynonymMember", null, null);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, null, true, "loginDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, null, true, "mobileLoginFlg", Integer.class, false, false, "NUMBER", 1, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, null, true, "loginMemberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);

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
    public ForeignInfo foreignMemberVendorSynonym() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberVendorSynonymDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM1", "memberVendorSynonym", this, MemberVendorSynonymDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "synonymMemberLoginList");
    }
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "synonymMemberLoginList");
    }
    public ForeignInfo foreignSynonymMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), SynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM2", "synonymMember", this, SynonymMemberDbm.getInstance(), mp, 2, false, false, false, false, null, null, false, "synonymMemberLoginList");
    }
    public ForeignInfo foreignVendorSynonymMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), VendorSynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM3", "vendorSynonymMember", this, VendorSynonymMemberDbm.getInstance(), mp, 3, false, false, false, false, null, null, false, "synonymMemberLoginList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymMemberLogin"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymMemberLoginCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymMemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymMemberLogin> getEntityType() { return SynonymMemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SynonymMemberLogin newMyEntity() { return new SynonymMemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymMemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymMemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
