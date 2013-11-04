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
 * The DB meta of WHITE_UQ_FK. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkDbm _instance = new WhiteUqFkDbm();
    private WhiteUqFkDbm() {}
    public static WhiteUqFkDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqFkId(), "uqFkId");
        setupEpg(_epgMap, new EpgUqFkCode(), "uqFkCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqFkId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFk)e).getUqFkId(); }
        public void write(Entity e, Object v) { ((WhiteUqFk)e).setUqFkId(ctl(v)); }
    }
    public static class EpgUqFkCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFk)e).getUqFkCode(); }
        public void write(Entity e, Object v) { ((WhiteUqFk)e).setUqFkCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK";
    protected final String _tablePropertyName = "whiteUqFk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkId = cci("UQ_FK_ID", "UQ_FK_ID", null, null, true, "uqFkId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, "whiteUqFkRefByFkToPkIdList", null);
    protected final ColumnInfo _columnUqFkCode = cci("UQ_FK_CODE", "UQ_FK_CODE", null, null, true, "uqFkCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefByFkToUqCodeList", null);

    public ColumnInfo columnUqFkId() { return _columnUqFkId; }
    public ColumnInfo columnUqFkCode() { return _columnUqFkCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkId());
        ls.add(columnUqFkCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqFkId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public ReferrerInfo referrerWhiteUqFkRefByFkToPkIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUqFkId(), WhiteUqFkRefDbm.getInstance().columnFkToPkId());
        return cri("FK_WHITE_UQ_FK_REF_PK", "whiteUqFkRefByFkToPkIdList", this, WhiteUqFkRefDbm.getInstance(), map, false, "whiteUqFkByFkToPkId");
    }
    public ReferrerInfo referrerWhiteUqFkRefByFkToUqCodeList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUqFkCode(), WhiteUqFkRefDbm.getInstance().columnFkToUqCode());
        return cri("FK_WHITE_UQ_FK_REF_UQ", "whiteUqFkRefByFkToUqCodeList", this, WhiteUqFkRefDbm.getInstance(), map, false, "whiteUqFkByFkToUqCode");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteUqFk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteUqFkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFk> getEntityType() { return WhiteUqFk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqFk newMyEntity() { return new WhiteUqFk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteUqFk)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteUqFk)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
