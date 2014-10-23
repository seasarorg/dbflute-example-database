package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of SYNONYM_NEXT_LINK_SECRET. (Singleton)
 * @author oracleman
 */
public class SynonymNextLinkSecretDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymNextLinkSecretDbm _instance = new SynonymNextLinkSecretDbm();
    private SynonymNextLinkSecretDbm() {}
    public static SynonymNextLinkSecretDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSecretCode(), "secretCode");
        setupEpg(_epgMap, new EpgSecretName(), "secretName");
        setupEpg(_epgMap, new EpgSecretAuthCode(), "secretAuthCode");
    }
    public static class EpgSecretCode implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSecret)et).getSecretCode(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSecret)et).setSecretCode((String)vl); }
    }
    public static class EpgSecretName implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSecret)et).getSecretName(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSecret)et).setSecretName((String)vl); }
    }
    public static class EpgSecretAuthCode implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSecret)et).getSecretAuthCode(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSecret)et).setSecretAuthCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_NEXT_LINK_SECRET";
    protected final String _tablePropertyName = "synonymNextLinkSecret";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_NEXT_LINK_SECRET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSecretCode = cci("SECRET_CODE", "SECRET_CODE", null, null, String.class, "secretCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSecretName = cci("SECRET_NAME", "SECRET_NAME", null, null, String.class, "secretName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSecretAuthCode = cci("SECRET_AUTH_CODE", "SECRET_AUTH_CODE", null, null, String.class, "secretAuthCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);

    /**
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecretCode() { return _columnSecretCode; }
    /**
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecretName() { return _columnSecretName; }
    /**
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecretAuthCode() { return _columnSecretAuthCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSecretCode());
        ls.add(columnSecretName());
        ls.add(columnSecretAuthCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSecretCode()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymNextLinkSecret"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymNextLinkSecretCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymNextLinkSecretBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymNextLinkSecret> getEntityType() { return SynonymNextLinkSecret.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SynonymNextLinkSecret newEntity() { return new SynonymNextLinkSecret(); }
    public SynonymNextLinkSecret newMyEntity() { return new SynonymNextLinkSecret(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymNextLinkSecret)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymNextLinkSecret)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
