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
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPurchaseReferrerId(), "purchaseReferrerId");
        setupEpg(_epgMap, new EpgPurchaseReferrerName(), "purchaseReferrerName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPurchaseReferrerId implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePurchaseReferrer)e).getPurchaseReferrerId(); }
        public void write(Entity e, Object v) { ((WhitePurchaseReferrer)e).setPurchaseReferrerId(ctl(v)); }
    }
    public static class EpgPurchaseReferrerName implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePurchaseReferrer)e).getPurchaseReferrerName(); }
        public void write(Entity e, Object v) { ((WhitePurchaseReferrer)e).setPurchaseReferrerName((String)v); }
    }

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
    protected final ColumnInfo _columnPurchaseReferrerId = cci("PURCHASE_REFERRER_ID", "PURCHASE_REFERRER_ID", null, null, true, "purchaseReferrerId", Long.class, true, true, "BIGINT", 19, 0, null, false, null, null, "purchase", null, null);
    protected final ColumnInfo _columnPurchaseReferrerName = cci("PURCHASE_REFERRER_NAME", "PURCHASE_REFERRER_NAME", null, null, true, "purchaseReferrerName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnPurchaseReferrerId() { return _columnPurchaseReferrerId; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnPurchaseReferrerId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_WHITE_PURCHASE_REFERRER", "purchase", this, PurchaseDbm.getInstance(), map, 0, true, false, false, false, null, null, false, "whitePurchaseReferrerAsOne");
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
    public Entity newEntity() { return newMyEntity(); }
    public WhitePurchaseReferrer newMyEntity() { return new WhitePurchaseReferrer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhitePurchaseReferrer)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhitePurchaseReferrer)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
