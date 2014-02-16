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
 * The DB meta of member_service. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberServiceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberServiceDbm _instance = new MemberServiceDbm();
    private MemberServiceDbm() {}
    public static MemberServiceDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberServiceId(), "memberServiceId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgServicePointCount(), "servicePointCount");
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
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
    public static class EpgMemberServiceId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getMemberServiceId(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setMemberServiceId(cti(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setMemberId(cti(vl)); }
    }
    public static class EpgServicePointCount implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getServicePointCount(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setServicePointCount(cti(vl)); }
    }
    public static class EpgServiceRankCode implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getServiceRankCode(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setServiceRankCode((String)vl); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setRegisterProcess((String)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setUpdateProcess((String)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setUpdateUser((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setVersionNo(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_service";
    protected final String _tablePropertyName = "memberService";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_service", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員サービス";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のサービス情報（ポイントサービスなど）。\nExampleDBとして、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberServiceId = cci("member_service_id", "member_service_id", null, "会員サービスID", true, "memberServiceId", Integer.class, true, true, "serial", 10, 0, "nextval('member_service_member_service_id_seq'::regclass)", false, null, "独立した主キーとなるが、実質的に会員IDとは one-to-one である。", null, null, null);
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", true, "memberId", Integer.class, false, false, "int4", 10, 0, null, false, null, "会員を参照するID。ユニークなので、会員とは one-to-one の関係に。", null, null, null);
    protected final ColumnInfo _columnServicePointCount = cci("service_point_count", "service_point_count", null, "サービスポイント数", true, "servicePointCount", Integer.class, false, false, "int4", 10, 0, null, false, null, "会員が現在利用できるサービスポイントの数。\n基本的に、購入時には増えてポイントを使ったら減る。", null, null, null);
    protected final ColumnInfo _columnServiceRankCode = cci("service_rank_code", "service_rank_code", null, "サービスランクコード", true, "serviceRankCode", String.class, false, false, "bpchar", 3, 0, null, false, null, "サービスランクを参照するコード。\nどんなランクがあるのかドキドキですね。", "serviceRank", null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, true, "registerProcess", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, true, "registerUser", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, true, "updateProcess", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, true, "updateUser", String.class, false, false, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, true, "versionNo", Long.class, false, false, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnMemberServiceId() { return _columnMemberServiceId; }
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnServicePointCount() { return _columnServicePointCount; }
    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberServiceId());
        ls.add(columnMemberId());
        ls.add(columnServicePointCount());
        ls.add(columnServiceRankCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberServiceId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignServiceRank() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), ServiceRankDbm.getInstance().columnServiceRankCode());
        return cfi("fk_member_service_service_rank_code", "serviceRank", this, ServiceRankDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "memberServiceList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "member_service_member_service_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.MemberService"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.MemberServiceCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.MemberServiceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberService> getEntityType() { return MemberService.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MemberService newMyEntity() { return new MemberService(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberService)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberService)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
