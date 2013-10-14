package com.example.dbflute.sqlserver.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.*;

/**
 * The DB meta of SpReturnResultSetWithNotParamResult1. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpReturnResultSetWithNotParamResult1Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpReturnResultSetWithNotParamResult1Dbm _instance = new SpReturnResultSetWithNotParamResult1Dbm();
    private SpReturnResultSetWithNotParamResult1Dbm() {}
    public static SpReturnResultSetWithNotParamResult1Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getMemberId(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setMemberId(cti(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getMemberName(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setMemberName((String)v); }
    }
    public static class EpgMemberAccount implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getMemberAccount(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setMemberAccount((String)v); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setMemberStatusCode((String)v); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getBirthdate(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setBirthdate((java.sql.Timestamp)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setRegisterDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setRegisterUser((String)v); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getRegisterProcess(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setRegisterProcess((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setUpdateUser((String)v); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getUpdateProcess(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setUpdateProcess((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetWithNotParamResult1)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetWithNotParamResult1)e).setVersionNo(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpReturnResultSetWithNotParamResult1";
    protected final String _tablePropertyName = "spReturnResultSetWithNotParamResult1";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpReturnResultSetWithNotParamResult1", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, false, "memberId", Integer.class, false, false, "int", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, false, "memberName", String.class, false, false, "nvarchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, null, false, "memberAccount", String.class, false, false, "nvarchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, false, "memberStatusCode", String.class, false, false, "char", 3, 0, null, false, null, null, null, null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, false, "birthdate", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, false, "registerDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, false, "registerUser", String.class, false, false, "nvarchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, false, "registerProcess", String.class, false, false, "nvarchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, false, "updateDatetime", java.sql.Timestamp.class, false, false, "datetime", 23, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, false, "updateUser", String.class, false, false, "nvarchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, false, "updateProcess", String.class, false, false, "nvarchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, false, "versionNo", Long.class, false, false, "bigint", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.sqlserver.dbflute.exentity.customize.SpReturnResultSetWithNotParamResult1"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpReturnResultSetWithNotParamResult1> getEntityType() { return SpReturnResultSetWithNotParamResult1.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SpReturnResultSetWithNotParamResult1 newMyEntity() { return new SpReturnResultSetWithNotParamResult1(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SpReturnResultSetWithNotParamResult1)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SpReturnResultSetWithNotParamResult1)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
