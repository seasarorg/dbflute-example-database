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
 * The DB meta of SYNONYM_NEXT_SECRET_AUTH. (Singleton)
 * @author oracleman
 */
public class SynonymNextSecretAuthDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymNextSecretAuthDbm _instance = new SynonymNextSecretAuthDbm();
    private SynonymNextSecretAuthDbm() {}
    public static SynonymNextSecretAuthDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSecretAuthCode(), "secretAuthCode");
        setupEpg(_epgMap, new EpgSecretAuthName(), "secretAuthName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSecretAuthCode implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextSecretAuth)et).getSecretAuthCode(); }
        public void write(Entity et, Object vl) { ((SynonymNextSecretAuth)et).setSecretAuthCode((String)vl); }
    }
    public static class EpgSecretAuthName implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextSecretAuth)et).getSecretAuthName(); }
        public void write(Entity et, Object vl) { ((SynonymNextSecretAuth)et).setSecretAuthName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_NEXT_SECRET_AUTH";
    protected final String _tablePropertyName = "synonymNextSecretAuth";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_NEXT_SECRET_AUTH", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "隣の秘密で権限あり";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "シノニムで見えてOK。まあ権限あるから結局直接見えるけど";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSecretAuthCode = cci("SECRET_AUTH_CODE", "SECRET_AUTH_CODE", null, "隣の秘密２コード", true, "secretAuthCode", String.class, true, false, "CHAR", 3, 0, null, false, null, "隣の商品を秘密するかもしれない", null, null, null);
    protected final ColumnInfo _columnSecretAuthName = cci("SECRET_AUTH_NAME", "SECRET_AUTH_NAME", null, "隣の秘密２名称", true, "secretAuthName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSecretAuthCode() { return _columnSecretAuthCode; }
    public ColumnInfo columnSecretAuthName() { return _columnSecretAuthName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSecretAuthCode());
        ls.add(columnSecretAuthName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSecretAuthCode()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymNextSecretAuth"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymNextSecretAuthCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymNextSecretAuthBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymNextSecretAuth> getEntityType() { return SynonymNextSecretAuth.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SynonymNextSecretAuth newMyEntity() { return new SynonymNextSecretAuth(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymNextSecretAuth)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymNextSecretAuth)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
