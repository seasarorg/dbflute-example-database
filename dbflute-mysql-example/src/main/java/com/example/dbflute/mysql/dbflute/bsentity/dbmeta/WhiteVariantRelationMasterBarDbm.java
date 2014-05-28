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
 * The DB meta of white_variant_relation_master_bar. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterBarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationMasterBarDbm _instance = new WhiteVariantRelationMasterBarDbm();
    private WhiteVariantRelationMasterBarDbm() {}
    public static WhiteVariantRelationMasterBarDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMasterBarId(), "masterBarId");
        setupEpg(_epgMap, new EpgMasterBarName(), "masterBarName");
    }
    public static class EpgMasterBarId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterBar)et).getMasterBarId(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterBar)et).setMasterBarId(ctl(vl)); }
    }
    public static class EpgMasterBarName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterBar)et).getMasterBarName(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterBar)et).setMasterBarName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_master_bar";
    protected final String _tablePropertyName = "whiteVariantRelationMasterBar";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_MASTER_BAR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMasterBarId = cci("MASTER_BAR_ID", "MASTER_BAR_ID", null, null, Long.class, "masterBarId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, "whiteVariantRelationReferrerAsVariantList", null);
    protected final ColumnInfo _columnMasterBarName = cci("MASTER_BAR_NAME", "MASTER_BAR_NAME", null, null, String.class, "masterBarName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMasterBarId() { return _columnMasterBarId; }
    /**
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMasterBarName() { return _columnMasterBarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMasterBarId());
        ls.add(columnMasterBarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMasterBarId()); }
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
    /**
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteVariantRelationReferrerAsVariantList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMasterBarId(), WhiteVariantRelationReferrerDbm.getInstance().columnVariantMasterId());
        return cri("FK_WHITE_VARIANT_RELATION_BAR", "whiteVariantRelationReferrerAsVariantList", this, WhiteVariantRelationReferrerDbm.getInstance(), mp, false, "whiteVariantRelationMasterBarAsVariant");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterBar"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationMasterBarCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterBarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationMasterBar> getEntityType() { return WhiteVariantRelationMasterBar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteVariantRelationMasterBar newMyEntity() { return new WhiteVariantRelationMasterBar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationMasterBar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteVariantRelationMasterBar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
