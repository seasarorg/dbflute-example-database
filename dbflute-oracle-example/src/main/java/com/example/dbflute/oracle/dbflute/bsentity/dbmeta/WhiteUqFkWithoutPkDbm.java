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
 * The DB meta of WHITE_UQ_FK_WITHOUT_PK. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkWithoutPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkWithoutPkDbm _instance = new WhiteUqFkWithoutPkDbm();
    private WhiteUqFkWithoutPkDbm() {}
    public static WhiteUqFkWithoutPkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgUqFkCode(), "uqFkCode");
        setupEpg(_epgMap, new EpgUqFkName(), "uqFkName");
    }
    public static class EpgUqFkCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPk)et).getUqFkCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPk)et).setUqFkCode((String)vl); }
    }
    public static class EpgUqFkName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPk)et).getUqFkName(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPk)et).setUqFkName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK_WITHOUT_PK";
    protected final String _tablePropertyName = "whiteUqFkWithoutPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_WITHOUT_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkCode = cci("UQ_FK_CODE", "UQ_FK_CODE", null, null, String.class, "uqFkCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkWithoutPkRefList", null);
    protected final ColumnInfo _columnUqFkName = cci("UQ_FK_NAME", "UQ_FK_NAME", null, null, String.class, "uqFkName", null, false, false, true, "VARCHAR2", 64, 0, null, false, null, null, null, null, null);

    /**
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkCode() { return _columnUqFkCode; }
    /**
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkName() { return _columnUqFkName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkCode());
        ls.add(columnUqFkName());
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteUqFkWithoutPkRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUqFkCode(), WhiteUqFkWithoutPkRefDbm.getInstance().columnFkToUqCode());
        return cri("FK_WHITE_UQ_FK_WITHOUT_PK_REF", "whiteUqFkWithoutPkRefList", this, WhiteUqFkWithoutPkRefDbm.getInstance(), mp, false, "whiteUqFkWithoutPk");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteUqFkWithoutPk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkWithoutPkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteUqFkWithoutPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkWithoutPk> getEntityType() { return WhiteUqFkWithoutPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqFkWithoutPk newMyEntity() { return new WhiteUqFkWithoutPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkWithoutPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkWithoutPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
