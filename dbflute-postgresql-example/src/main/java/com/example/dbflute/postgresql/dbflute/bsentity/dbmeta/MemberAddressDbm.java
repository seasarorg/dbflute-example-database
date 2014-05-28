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
 * The DB meta of member_address. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberAddressDbm _instance = new MemberAddressDbm();
    private MemberAddressDbm() {}
    public static MemberAddressDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberAddressId(), "memberAddressId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgValidBeginDate(), "validBeginDate");
        setupEpg(_epgMap, new EpgValidEndDate(), "validEndDate");
        setupEpg(_epgMap, new EpgAddress(), "address");
        setupEpg(_epgMap, new EpgRegionId(), "regionId");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public static class EpgMemberAddressId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getMemberAddressId(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setMemberAddressId(cti(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setMemberId(cti(vl)); }
    }
    public static class EpgValidBeginDate implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getValidBeginDate(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setValidBeginDate((java.util.Date)vl); }
    }
    public static class EpgValidEndDate implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getValidEndDate(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setValidEndDate((java.util.Date)vl); }
    }
    public static class EpgAddress implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getAddress(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setAddress((String)vl); }
    }
    public static class EpgRegionId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getRegionId(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setRegionId(cti(vl)); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setRegisterProcess((String)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setUpdateProcess((String)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setUpdateUser((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setVersionNo(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgRegion(), "region");
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getMember(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setMember((Member)vl); }
    }
    public class EfpgRegion implements PropertyGateway {
        public Object read(Entity et) { return ((MemberAddress)et).getRegion(); }
        public void write(Entity et, Object vl) { ((MemberAddress)et).setRegion((Region)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_address";
    protected final String _tablePropertyName = "memberAddress";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_address", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員住所情報";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員の住所に関する情報で、同時に有効期間ごとに履歴管理されている。\n会員を基点に考えた場合、構造的にはone-to-many だが、業務的な定型条件でone-to-one になる。このような構造を「業務的one-to-one」と呼ぶ。\n有効期間は隙間なく埋められるが、ここでは住所情報のない会員も存在し、厳密には(業務的な) \"1 : 0...1\" である。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberAddressId = cci("member_address_id", "member_address_id", null, "会員住所ID", Integer.class, "memberAddressId", null, true, true, true, "serial", 10, 0, "nextval('member_address_member_address_id_seq'::regclass)", false, null, "会員住所を識別するID。\n履歴分も含むテーブルなので、これ自体はFKではない。", null, null, null);
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, true, "int4", 10, 0, null, false, null, "会員を参照するID。\n履歴分を含むため、これだけではユニークにはならない。\n有効開始日と合わせて複合ユニーク制約となるが、\n厳密には完全な制約にはなっていない。\n有効期間の概念はRDBでは表現しきれないのである。", "member", null, null);
    protected final ColumnInfo _columnValidBeginDate = cci("valid_begin_date", "valid_begin_date", null, "有効開始日", java.util.Date.class, "validBeginDate", null, false, false, true, "date", 13, 0, null, false, null, "一つの有効期間の開始を示す日付。\n前の有効終了日の次の日の値が格納される。", null, null, null);
    protected final ColumnInfo _columnValidEndDate = cci("valid_end_date", "valid_end_date", null, "有効終了日", java.util.Date.class, "validEndDate", null, false, false, true, "date", 13, 0, null, false, null, "有効期間の終了日。\n次の有効開始日の一日前の値が格納される。\nただし、次の有効期間がない場合は 9999/12/31 となる。", null, null, null);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, "住所", String.class, "address", null, false, false, true, "varchar", 200, 0, null, false, null, "まるごと住所", null, null, null);
    protected final ColumnInfo _columnRegionId = cci("region_id", "region_id", null, "地域ID", Integer.class, "regionId", null, false, false, true, "int4", 10, 0, null, false, null, "地域を参照するID。\nここでは特に住所の内容と連動しているわけではない。\n（業務的one-to-oneの親テーブルの表現したかっ...）", "region", null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.sql.Timestamp.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Long.class, "versionNo", null, false, false, true, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * (会員住所ID)member_address_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAddressId() { return _columnMemberAddressId; }
    /**
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (有効開始日)valid_begin_date: {+UQ, NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidBeginDate() { return _columnValidBeginDate; }
    /**
     * (有効終了日)valid_end_date: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidEndDate() { return _columnValidEndDate; }
    /**
     * (住所)address: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
    /**
     * (地域ID)region_id: {NotNull, int4(10), FK to region}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * register_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * version_no: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberAddressId());
        ls.add(columnMemberId());
        ls.add(columnValidBeginDate());
        ls.add(columnValidEndDate());
        ls.add(columnAddress());
        ls.add(columnRegionId());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberAddressId()); }
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
     * (会員)member by my member_id, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_member_address_member", "member", this, MemberDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "memberAddressList");
    }
    /**
     * (地域)region by my region_id, named 'region'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRegion() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), RegionDbm.getInstance().columnRegionId());
        return cfi("fk_member_address_region", "region", this, RegionDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "memberAddressList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "member_address_member_address_id_seq"; }
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.MemberAddress"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.MemberAddressCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.MemberAddressBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberAddress> getEntityType() { return MemberAddress.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MemberAddress newMyEntity() { return new MemberAddress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberAddress)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberAddress)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
