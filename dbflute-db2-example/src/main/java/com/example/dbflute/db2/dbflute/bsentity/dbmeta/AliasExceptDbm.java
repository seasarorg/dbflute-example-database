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
 * The DB meta of ALIAS_EXCEPT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AliasExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AliasExceptDbm _instance = new AliasExceptDbm();
    private AliasExceptDbm() {}
    public static AliasExceptDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgExceptId(), "exceptId");
        setupEpg(_epgMap, new EpgExceptName(), "exceptName");
    }
    public static class EpgExceptId implements PropertyGateway {
        public Object read(Entity et) { return ((AliasExcept)et).getExceptId(); }
        public void write(Entity et, Object vl) { ((AliasExcept)et).setExceptId(ctl(vl)); }
    }
    public static class EpgExceptName implements PropertyGateway {
        public Object read(Entity et) { return ((AliasExcept)et).getExceptName(); }
        public void write(Entity et, Object vl) { ((AliasExcept)et).setExceptName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ALIAS_EXCEPT";
    protected final String _tablePropertyName = "aliasExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("ALIAS_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, Long.class, "exceptId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, "aliasRefExceptList", null);
    protected final ColumnInfo _columnExceptName = cci("EXCEPT_NAME", "EXCEPT_NAME", null, null, String.class, "exceptName", null, false, false, false, "VARCHAR", 256, 0, null, false, null, null, null, null, null);

    /**
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptId() { return _columnExceptId; }
    /**
     * EXCEPT_NAME: {VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptName() { return _columnExceptName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnExceptId());
        ls.add(columnExceptName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnExceptId()); }
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
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerAliasRefExceptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnExceptId(), AliasRefExceptDbm.getInstance().columnExceptId());
        return cri("FK_WHITE_REF_EXCEPT", "aliasRefExceptList", this, AliasRefExceptDbm.getInstance(), mp, false, "aliasExcept");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.AliasExcept"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.AliasExceptCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.AliasExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AliasExcept> getEntityType() { return AliasExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public AliasExcept newMyEntity() { return new AliasExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AliasExcept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AliasExcept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
