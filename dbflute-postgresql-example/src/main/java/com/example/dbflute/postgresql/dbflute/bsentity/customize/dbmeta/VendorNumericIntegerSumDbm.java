package com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of VendorNumericIntegerSum. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorNumericIntegerSumDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorNumericIntegerSumDbm _instance = new VendorNumericIntegerSumDbm();
    private VendorNumericIntegerSumDbm() {}
    public static VendorNumericIntegerSumDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgIntegerNonDigitSum(), "integerNonDigitSum");
    }
    public static class EpgIntegerNonDigitSum implements PropertyGateway {
        public Object read(Entity et) { return ((VendorNumericIntegerSum)et).getIntegerNonDigitSum(); }
        public void write(Entity et, Object vl) { ((VendorNumericIntegerSum)et).setIntegerNonDigitSum(ctb(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VendorNumericIntegerSum";
    protected final String _tablePropertyName = "vendorNumericIntegerSum";
    protected final TableSqlName _tableSqlName = new TableSqlName("VendorNumericIntegerSum", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnIntegerNonDigitSum = cci("integer_non_digit_sum", "integer_non_digit_sum", null, null, java.math.BigDecimal.class, "integerNonDigitSum", null, false, false, false, "numeric", 131089, 0, null, false, null, null, null, null, null);

    /**
     * integer_non_digit_sum: {numeric(131089)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntegerNonDigitSum() { return _columnIntegerNonDigitSum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnIntegerNonDigitSum());
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.VendorNumericIntegerSum"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorNumericIntegerSum> getEntityType() { return VendorNumericIntegerSum.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorNumericIntegerSum newEntity() { return new VendorNumericIntegerSum(); }
    public VendorNumericIntegerSum newMyEntity() { return new VendorNumericIntegerSum(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorNumericIntegerSum)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorNumericIntegerSum)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
