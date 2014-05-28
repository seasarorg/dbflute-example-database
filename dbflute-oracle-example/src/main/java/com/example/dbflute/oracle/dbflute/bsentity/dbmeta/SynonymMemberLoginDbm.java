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
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMemberStatus(), "memberStatus");
        setupEfpg(_efpgMap, new EfpgMemberVendorSynonym(), "memberVendorSynonym");
        setupEfpg(_efpgMap, new EfpgSynonymMember(), "synonymMember");
        setupEfpg(_efpgMap, new EfpgVendorSynonymMember(), "vendorSynonymMember");
    }
    public class EfpgMemberStatus implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getMemberStatus(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setMemberStatus((MemberStatus)vl); }
    }
    public class EfpgMemberVendorSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getMemberVendorSynonym(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setMemberVendorSynonym((MemberVendorSynonym)vl); }
    }
    public class EfpgSynonymMember implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getSynonymMember(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setSynonymMember((SynonymMember)vl); }
    }
    public class EfpgVendorSynonymMember implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymMemberLogin)et).getVendorSynonymMember(); }
        public void write(Entity et, Object vl) { ((SynonymMemberLogin)et).setVendorSynonymMember((VendorSynonymMember)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, null, Long.class, "memberLoginId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Long.class, "memberId", null, false, false, true, "NUMBER", 16, 0, null, false, null, null, "memberVendorSynonym,synonymMember,vendorSynonymMember", null, null);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, null, java.util.Date.class, "loginDatetime", null, false, false, true, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, null, Integer.class, "mobileLoginFlg", null, false, false, true, "NUMBER", 1, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, null, String.class, "loginMemberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);

    /**
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    /**
     * MEMBER_ID: {UQ+, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * LOGIN_DATETIME: {+UQ, IX, NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginDatetime() { return _columnLoginDatetime; }
    /**
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobileLoginFlg() { return _columnMobileLoginFlg; }
    /**
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
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
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "synonymMemberLoginList");
    }
    /**
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberVendorSynonym() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberVendorSynonymDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM1", "memberVendorSynonym", this, MemberVendorSynonymDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "synonymMemberLoginList");
    }
    /**
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSynonymMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), SynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM2", "synonymMember", this, SynonymMemberDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "synonymMemberLoginList");
    }
    /**
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorSynonymMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), VendorSynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM3", "vendorSynonymMember", this, VendorSynonymMemberDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "synonymMemberLoginList");
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
