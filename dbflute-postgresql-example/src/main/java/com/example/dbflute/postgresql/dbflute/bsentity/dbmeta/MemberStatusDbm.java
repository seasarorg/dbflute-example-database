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
 * The DB meta of member_status. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberStatusDbm _instance = new MemberStatusDbm();
    private MemberStatusDbm() {}
    public static MemberStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getMemberStatusCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnMemberStatusCode();
            ((MemberStatus)et).setMemberStatusCodeAsMemberStatus((CDef.MemberStatus)gcls(col, vl));
        }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((MemberStatus)et).setMemberStatusName((String)vl); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getDescription(); }
        public void write(Entity et, Object vl) { ((MemberStatus)et).setDescription((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((MemberStatus)et).setDisplayOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_status";
    protected final String _tablePropertyName = "memberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_status", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員ステータス";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のステータスを示す固定的なマスタテーブル。\n業務で増えることはなく、増減するときは実装もともなうレベルの業務変更と考えられる。\n\nこういった固定的なマスタテーブルには、更新日時などの共通カラムは定義していないが、業務上そういった情報を管理する必要性が低いという理由に加え、ExampleDBとして共通カラムでER図が埋め尽くされてしまい見づらくなるという\nところで割り切っている。実業務では統一的に定義することもある。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("member_status_code", "member_status_code", null, "会員ステータスコード", String.class, "memberStatusCode", null, true, false, true, "bpchar", 3, 0, null, false, null, "会員ステータスを識別するコード。\n固定的なデータなので、連番とか番号にはせず、\nデータを直接見たときも人が直感的にわかるように、\nこのような３桁のコード形式にしている。", null, "memberList,memberLoginList", CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("member_status_name", "member_status_name", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, "説明", String.class, "description", null, false, false, true, "varchar", 200, 0, null, false, null, "会員ステータスそれぞれの説明。\n気の利いた説明があるとディベロッパーがとても助かる。", null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, "表示順", Integer.class, "displayOrder", null, false, false, true, "int4", 10, 0, null, false, null, "UI上のステータスの表示順を示すNO。\n並べるときは、このカラムに対して昇順のソート条件にする。", null, null, null);

    /**
     * (会員ステータスコード)member_status_code: {PK, NotNull, bpchar(3), classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (会員ステータス名称)member_status_name: {NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * (説明)description: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberStatusCode()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員)member by member_status_code, named 'memberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberDbm.getInstance().columnMemberStatusCode());
        return cri("fk_member_member_status", "memberList", this, MemberDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員ログイン)member_login by login_member_status_code, named 'memberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberLoginDbm.getInstance().columnLoginMemberStatusCode());
        return cri("fk_member_login_member_status", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "memberStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.MemberStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.MemberStatusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.MemberStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberStatus> getEntityType() { return MemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberStatus newEntity() { return new MemberStatus(); }
    public MemberStatus newMyEntity() { return new MemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
