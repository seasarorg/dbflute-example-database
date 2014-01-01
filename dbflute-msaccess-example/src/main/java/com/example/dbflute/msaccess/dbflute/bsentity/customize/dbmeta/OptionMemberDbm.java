package com.example.dbflute.msaccess.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.msaccess.dbflute.allcommon.*;
import com.example.dbflute.msaccess.dbflute.exentity.customize.*;

/**
 * The DB meta of OptionMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OptionMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OptionMemberDbm _instance = new OptionMemberDbm();
    private OptionMemberDbm() {}
    public static OptionMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberBirthday(), "memberBirthday");
        setupEpg(_epgMap, new EpgMemberFormalizedDatetime(), "memberFormalizedDatetime");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgStatusDisplayOrder(), "statusDisplayOrder");
        setupEpg(_epgMap, new EpgDummyFlg(), "dummyFlg");
        setupEpg(_epgMap, new EpgDummyNoflg(), "dummyNoflg");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getMemberId(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setMemberId(cti(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getMemberName(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setMemberName((String)v); }
    }
    public static class EpgMemberBirthday implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getMemberBirthday(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setMemberBirthday((java.sql.Timestamp)v); }
    }
    public static class EpgMemberFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getMemberFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setMemberFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setMemberStatusCode((String)v); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getMemberStatusName(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setMemberStatusName((String)v); }
    }
    public static class EpgStatusDisplayOrder implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getStatusDisplayOrder(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setStatusDisplayOrder((String)v); }
    }
    public static class EpgDummyFlg implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getDummyFlg(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setDummyFlg(cti(v)); }
    }
    public static class EpgDummyNoflg implements PropertyGateway {
        public Object read(Entity e) { return ((OptionMember)e).getDummyNoflg(); }
        public void write(Entity e, Object v) { ((OptionMember)e).setDummyNoflg(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "OptionMember";
    protected final String _tablePropertyName = "optionMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("OptionMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, false, "memberId", Integer.class, false, false, "COUNTER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, false, "memberName", String.class, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberBirthday = cci("MEMBER_BIRTHDAY", "MEMBER_BIRTHDAY", null, null, false, "memberBirthday", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberFormalizedDatetime = cci("MEMBER_FORMALIZED_DATETIME", "MEMBER_FORMALIZED_DATETIME", null, null, false, "memberFormalizedDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, false, "memberStatusCode", String.class, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, false, "memberStatusName", String.class, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStatusDisplayOrder = cci("STATUS_DISPLAY_ORDER", "STATUS_DISPLAY_ORDER", null, null, false, "statusDisplayOrder", String.class, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDummyFlg = cci("DUMMY_FLG", "DUMMY_FLG", null, null, false, "dummyFlg", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnDummyNoflg = cci("DUMMY_NOFLG", "DUMMY_NOFLG", null, null, false, "dummyNoflg", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnMemberBirthday() { return _columnMemberBirthday; }
    public ColumnInfo columnMemberFormalizedDatetime() { return _columnMemberFormalizedDatetime; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    public ColumnInfo columnStatusDisplayOrder() { return _columnStatusDisplayOrder; }
    public ColumnInfo columnDummyFlg() { return _columnDummyFlg; }
    public ColumnInfo columnDummyNoflg() { return _columnDummyNoflg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberBirthday());
        ls.add(columnMemberFormalizedDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnStatusDisplayOrder());
        ls.add(columnDummyFlg());
        ls.add(columnDummyNoflg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.msaccess.dbflute.exentity.customize.OptionMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OptionMember> getEntityType() { return OptionMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public OptionMember newMyEntity() { return new OptionMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((OptionMember)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((OptionMember)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
