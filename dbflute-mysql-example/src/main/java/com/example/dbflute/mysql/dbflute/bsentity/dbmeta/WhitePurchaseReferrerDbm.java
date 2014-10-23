/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of white_purchase_referrer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePurchaseReferrerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePurchaseReferrerDbm _instance = new WhitePurchaseReferrerDbm();
    private WhitePurchaseReferrerDbm() {}
    public static WhitePurchaseReferrerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgPurchaseReferrerId(), "purchaseReferrerId");
        setupEpg(_epgMap, new EpgPurchaseReferrerName(), "purchaseReferrerName");
    }
    public static class EpgPurchaseReferrerId implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePurchaseReferrer)et).getPurchaseReferrerId(); }
        public void write(Entity et, Object vl) { ((WhitePurchaseReferrer)et).setPurchaseReferrerId(ctl(vl)); }
    }
    public static class EpgPurchaseReferrerName implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePurchaseReferrer)et).getPurchaseReferrerName(); }
        public void write(Entity et, Object vl) { ((WhitePurchaseReferrer)et).setPurchaseReferrerName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgPurchase(), "purchase");
    }
    public class EfpgPurchase implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePurchaseReferrer)et).getPurchase(); }
        public void write(Entity et, Object vl) { ((WhitePurchaseReferrer)et).setPurchase((Purchase)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_purchase_referrer";
    protected final String _tablePropertyName = "whitePurchaseReferrer";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PURCHASE_REFERRER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseReferrerId = cci("PURCHASE_REFERRER_ID", "PURCHASE_REFERRER_ID", null, null, Long.class, "purchaseReferrerId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, "purchase", null, null);
    protected final ColumnInfo _columnPurchaseReferrerName = cci("PURCHASE_REFERRER_NAME", "PURCHASE_REFERRER_NAME", null, null, String.class, "purchaseReferrerName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseReferrerId() { return _columnPurchaseReferrerId; }
    /**
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseReferrerName() { return _columnPurchaseReferrerName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseReferrerId());
        ls.add(columnPurchaseReferrerName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseReferrerId()); }
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
    /**
     * (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseReferrerId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_WHITE_PURCHASE_REFERRER", "purchase", this, PurchaseDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "whitePurchaseReferrerAsOne");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhitePurchaseReferrer"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhitePurchaseReferrerCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhitePurchaseReferrerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePurchaseReferrer> getEntityType() { return WhitePurchaseReferrer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePurchaseReferrer newEntity() { return new WhitePurchaseReferrer(); }
    public WhitePurchaseReferrer newMyEntity() { return new WhitePurchaseReferrer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePurchaseReferrer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePurchaseReferrer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
