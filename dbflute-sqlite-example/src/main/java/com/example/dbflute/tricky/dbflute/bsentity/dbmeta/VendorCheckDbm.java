package com.example.dbflute.tricky.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.tricky.dbflute.allcommon.*;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfReal(), "typeOfReal");
    }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setVendorCheckId(cti(vl)); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfText(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfText((String)vl); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfInteger(cti(vl)); }
    }
    public static class EpgTypeOfReal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfReal(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfReal((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Integer.class, "vendorCheckId", null, true, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, String.class, "typeOfText", null, false, false, false, "TEXT", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, Integer.class, "typeOfInteger", null, false, false, false, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfReal = cci("TYPE_OF_REAL", "TYPE_OF_REAL", null, null, String.class, "typeOfReal", null, false, false, false, "REAL", 2000000000, 10, null, false, null, null, null, null, null);

    /**
     * VENDOR_CHECK_ID: {PK, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_TEXT: {TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * TYPE_OF_INTEGER: {INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_REAL: {REAL(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfReal() { return _columnTypeOfReal; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfReal());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.tricky.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.tricky.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorCheck newEntity() { return new VendorCheck(); }
    public VendorCheck newMyEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
