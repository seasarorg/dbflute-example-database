package com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_SERVICE. (Singleton)
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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberServiceId(), "memberServiceId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgServicePointCount(), "servicePointCount");
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
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
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setRegisterUser((String)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setRegisterProcess((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setUpdateUser((String)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setUpdateProcess((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setVersionNo(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgServiceRank(), "serviceRank");
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getMember(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setMember((Member)vl); }
    }
    public class EfpgServiceRank implements PropertyGateway {
        public Object read(Entity et) { return ((MemberService)et).getServiceRank(); }
        public void write(Entity et, Object vl) { ((MemberService)et).setServiceRank((ServiceRank)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_SERVICE";
    protected final String _tablePropertyName = "memberService";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_SERVICE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberServiceId = cci("MEMBER_SERVICE_ID", "MEMBER_SERVICE_ID", null, null, Integer.class, "memberServiceId", null, true, true, true, "int identity", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "int", 10, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnServicePointCount = cci("SERVICE_POINT_COUNT", "SERVICE_POINT_COUNT", null, null, Integer.class, "servicePointCount", null, false, false, true, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, null, String.class, "serviceRankCode", null, false, false, true, "char", 3, 0, null, false, null, null, "serviceRank", null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "datetime", 23, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "datetime", 23, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "nvarchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * MEMBER_SERVICE_ID: {PK, ID, NotNull, int identity(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberServiceId() { return _columnMemberServiceId; }
    /**
     * MEMBER_ID: {UQ, NotNull, int(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * SERVICE_POINT_COUNT: {NotNull, int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServicePointCount() { return _columnServicePointCount; }
    /**
     * SERVICE_RANK_CODE: {NotNull, char(3), FK to SERVICE_RANK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    /**
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberServiceId());
        ls.add(columnMemberId());
        ls.add(columnServicePointCount());
        ls.add(columnServiceRankCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberServiceId()); }
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
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SERVICE_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "memberServiceAsOne");
    }
    /**
     * SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignServiceRank() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), ServiceRankDbm.getInstance().columnServiceRankCode());
        return cfi("FK_MEMBER_SERVICE_SERVICE_RANK_CODE", "serviceRank", this, ServiceRankDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "memberServiceList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
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
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.MemberService"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.sqlserver.dbflute.cbean.MemberServiceCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.sqlserver.dbflute.exbhv.MemberServiceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberService> getEntityType() { return MemberService.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberService newEntity() { return new MemberService(); }
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
