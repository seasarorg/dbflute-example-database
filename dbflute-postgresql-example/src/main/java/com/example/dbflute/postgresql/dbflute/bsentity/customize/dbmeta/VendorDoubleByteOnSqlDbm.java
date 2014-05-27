package com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of VendorDoubleByteOnSql. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorDoubleByteOnSqlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorDoubleByteOnSqlDbm _instance = new VendorDoubleByteOnSqlDbm();
    private VendorDoubleByteOnSqlDbm() {}
    public static VendorDoubleByteOnSqlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberNameWithSpace(), "memberNameWithSpace");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDoubleByteOnSql)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((VendorDoubleByteOnSql)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberNameWithSpace implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDoubleByteOnSql)et).getMemberNameWithSpace(); }
        public void write(Entity et, Object vl) { ((VendorDoubleByteOnSql)et).setMemberNameWithSpace((String)vl); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorDoubleByteOnSql)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((VendorDoubleByteOnSql)et).setMemberStatusName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VendorDoubleByteOnSql";
    protected final String _tablePropertyName = "vendorDoubleByteOnSql";
    protected final TableSqlName _tableSqlName = new TableSqlName("VendorDoubleByteOnSql", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, null, Integer.class, "memberId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberNameWithSpace = cci("member_name_with_space", "member_name_with_space", null, null, String.class, "memberNameWithSpace", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("member_status_name", "member_status_name", null, null, String.class, "memberStatusName", null, false, false, false, "varchar", 50, 0, null, false, null, null, null, null, null);

    /**
     * member_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * member_name_with_space: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberNameWithSpace() { return _columnMemberNameWithSpace; }
    /**
     * member_status_name: {varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberNameWithSpace());
        ls.add(columnMemberStatusName());
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
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.VendorDoubleByteOnSql"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorDoubleByteOnSql> getEntityType() { return VendorDoubleByteOnSql.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorDoubleByteOnSql newMyEntity() { return new VendorDoubleByteOnSql(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorDoubleByteOnSql)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorDoubleByteOnSql)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
