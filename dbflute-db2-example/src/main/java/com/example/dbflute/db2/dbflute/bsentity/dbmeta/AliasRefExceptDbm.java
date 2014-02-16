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
 * The DB meta of ALIAS_REF_EXCEPT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AliasRefExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AliasRefExceptDbm _instance = new AliasRefExceptDbm();
    private AliasRefExceptDbm() {}
    public static AliasRefExceptDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgRefExceptId(), "refExceptId");
        setupEpg(_epgMap, new EpgExceptId(), "exceptId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgRefExceptId implements PropertyGateway {
        public Object read(Entity et) { return ((AliasRefExcept)et).getRefExceptId(); }
        public void write(Entity et, Object vl) { ((AliasRefExcept)et).setRefExceptId(ctl(vl)); }
    }
    public static class EpgExceptId implements PropertyGateway {
        public Object read(Entity et) { return ((AliasRefExcept)et).getExceptId(); }
        public void write(Entity et, Object vl) { ((AliasRefExcept)et).setExceptId(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ALIAS_REF_EXCEPT";
    protected final String _tablePropertyName = "aliasRefExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("ALIAS_REF_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefExceptId = cci("REF_EXCEPT_ID", "REF_EXCEPT_ID", null, null, true, "refExceptId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, true, "exceptId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, "aliasExcept", null, null);

    public ColumnInfo columnRefExceptId() { return _columnRefExceptId; }
    public ColumnInfo columnExceptId() { return _columnExceptId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefExceptId());
        ls.add(columnExceptId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefExceptId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignAliasExcept() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnExceptId(), AliasExceptDbm.getInstance().columnExceptId());
        return cfi("FK_WHITE_REF_EXCEPT", "aliasExcept", this, AliasExceptDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "aliasRefExceptList");
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
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.AliasRefExcept"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.AliasRefExceptCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.AliasRefExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AliasRefExcept> getEntityType() { return AliasRefExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public AliasRefExcept newMyEntity() { return new AliasRefExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AliasRefExcept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AliasRefExcept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
