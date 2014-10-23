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
 * The DB meta of SYNONYM_NEXT_LINK_SYNONYM. (Singleton)
 * @author oracleman
 */
public class SynonymNextLinkSynonymDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymNextLinkSynonymDbm _instance = new SynonymNextLinkSynonymDbm();
    private SynonymNextLinkSynonymDbm() {}
    public static SynonymNextLinkSynonymDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgProductName(), "productName");
        setupEpg(_epgMap, new EpgProductHandleCode(), "productHandleCode");
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getProductId(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setProductId(ctl(vl)); }
    }
    public static class EpgProductName implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getProductName(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setProductName((String)vl); }
    }
    public static class EpgProductHandleCode implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getProductHandleCode(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setProductHandleCode((String)vl); }
    }
    public static class EpgProductStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getProductStatusCode(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setProductStatusCode((String)vl); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setRegisterDatetime((java.util.Date)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setRegisterUser((String)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setRegisterProcess((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setUpdateDatetime((java.util.Date)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setUpdateUser((String)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setUpdateProcess((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((SynonymNextLinkSynonym)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((SynonymNextLinkSynonym)et).setVersionNo(ctb(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_NEXT_LINK_SYNONYM";
    protected final String _tablePropertyName = "synonymNextLinkSynonym";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_NEXT_LINK_SYNONYM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, null, String.class, "productName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductHandleCode = cci("PRODUCT_HANDLE_CODE", "PRODUCT_HANDLE_CODE", null, null, String.class, "productHandleCode", null, false, false, true, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.util.Date.class, "registerDatetime", null, false, false, true, "DATE", null, null, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.util.Date.class, "updateDatetime", null, false, false, true, "DATE", null, null, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, java.math.BigDecimal.class, "versionNo", null, false, false, true, "NUMBER", 38, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductHandleCode() { return _columnProductHandleCode; }
    /**
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * REGISTER_DATETIME: {NotNull, DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {NotNull, DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, NUMBER(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductStatusCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.SynonymNextLinkSynonym"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.SynonymNextLinkSynonymCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.SynonymNextLinkSynonymBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymNextLinkSynonym> getEntityType() { return SynonymNextLinkSynonym.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SynonymNextLinkSynonym newEntity() { return new SynonymNextLinkSynonym(); }
    public SynonymNextLinkSynonym newMyEntity() { return new SynonymNextLinkSynonym(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymNextLinkSynonym)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymNextLinkSynonym)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
