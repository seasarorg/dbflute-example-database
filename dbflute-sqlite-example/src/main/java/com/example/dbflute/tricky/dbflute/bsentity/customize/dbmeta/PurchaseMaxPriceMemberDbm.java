package com.example.dbflute.tricky.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.tricky.dbflute.allcommon.*;
import com.example.dbflute.tricky.dbflute.exentity.customize.*;

/**
 * The DB meta of PurchaseMaxPriceMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseMaxPriceMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseMaxPriceMemberDbm _instance = new PurchaseMaxPriceMemberDbm();
    private PurchaseMaxPriceMemberDbm() {}
    public static PurchaseMaxPriceMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgPurchaseMaxPrice(), "purchaseMaxPrice");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setMemberName((String)vl); }
    }
    public static class EpgPurchaseMaxPrice implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getPurchaseMaxPrice(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setPurchaseMaxPrice(ctl(vl)); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setMemberStatusName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PurchaseMaxPriceMember";
    protected final String _tablePropertyName = "purchaseMaxPriceMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("PurchaseMaxPriceMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseMaxPrice = cci("PURCHASE_MAX_PRICE", "PURCHASE_MAX_PRICE", null, null, Long.class, "purchaseMaxPrice", null, false, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);

    /**
     * MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * PURCHASE_MAX_PRICE: {null(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseMaxPrice() { return _columnPurchaseMaxPrice; }
    /**
     * MEMBER_STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS.MEMBER_STATUS_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnPurchaseMaxPrice());
        ls.add(columnMemberStatusName());
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
    public String getEntityTypeName() { return "com.example.dbflute.tricky.dbflute.exentity.customize.PurchaseMaxPriceMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchaseMaxPriceMember> getEntityType() { return PurchaseMaxPriceMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchaseMaxPriceMember newEntity() { return new PurchaseMaxPriceMember(); }
    public PurchaseMaxPriceMember newMyEntity() { return new PurchaseMaxPriceMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchaseMaxPriceMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchaseMaxPriceMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
