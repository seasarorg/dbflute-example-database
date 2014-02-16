package com.example.dbflute.tricky.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgPurchaseMaxPrice(), "purchaseMaxPrice");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
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
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, false, "memberId", Integer.class, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, false, "memberName", String.class, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseMaxPrice = cci("PURCHASE_MAX_PRICE", "PURCHASE_MAX_PRICE", null, null, false, "purchaseMaxPrice", Long.class, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, false, "memberStatusName", String.class, false, false, "null", 2147483647, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnPurchaseMaxPrice() { return _columnPurchaseMaxPrice; }
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
    public Entity newEntity() { return newMyEntity(); }
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
