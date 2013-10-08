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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSecretCode(), "secretCode");
        setupEpg(_epgMap, new EpgSecretName(), "secretName");
        setupEpg(_epgMap, new EpgSecretAuthCode(), "secretAuthCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSecretCode implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymNextLinkSecret)e).getSecretCode(); }
        public void write(Entity e, Object v) { ((SynonymNextLinkSecret)e).setSecretCode((String)v); }
    }
    public static class EpgSecretName implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymNextLinkSecret)e).getSecretName(); }
        public void write(Entity e, Object v) { ((SynonymNextLinkSecret)e).setSecretName((String)v); }
    }
    public static class EpgSecretAuthCode implements PropertyGateway {
        public Object read(Entity e) { return ((SynonymNextLinkSecret)e).getSecretAuthCode(); }
        public void write(Entity e, Object v) { ((SynonymNextLinkSecret)e).setSecretAuthCode((String)v); }
    }

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
    protected final ColumnInfo _columnSecretCode = cci("SECRET_CODE", "SECRET_CODE", null, null, true, "secretCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSecretName = cci("SECRET_NAME", "SECRET_NAME", null, null, true, "secretName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSecretAuthCode = cci("SECRET_AUTH_CODE", "SECRET_AUTH_CODE", null, null, false, "secretAuthCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSecretCode() { return _columnSecretCode; }
    public ColumnInfo columnSecretName() { return _columnSecretName; }
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
    public Entity newEntity() { return newMyEntity(); }
    public SynonymNextLinkSecret newMyEntity() { return new SynonymNextLinkSecret(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SynonymNextLinkSecret)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SynonymNextLinkSecret)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
