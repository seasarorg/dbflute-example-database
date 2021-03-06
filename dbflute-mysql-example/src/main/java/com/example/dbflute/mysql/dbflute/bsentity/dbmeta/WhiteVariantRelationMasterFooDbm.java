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
 * The DB meta of white_variant_relation_master_foo. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterFooDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationMasterFooDbm _instance = new WhiteVariantRelationMasterFooDbm();
    private WhiteVariantRelationMasterFooDbm() {}
    public static WhiteVariantRelationMasterFooDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMasterFooId(), "masterFooId");
        setupEpg(_epgMap, new EpgMasterFooName(), "masterFooName");
    }
    public static class EpgMasterFooId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterFoo)et).getMasterFooId(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterFoo)et).setMasterFooId(ctl(vl)); }
    }
    public static class EpgMasterFooName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterFoo)et).getMasterFooName(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterFoo)et).setMasterFooName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(), "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne");
    }
    public class EfpgWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterFoo)et).getWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterFoo)et).setWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne((WhiteVariantRelationReferrer)vl); }
    }
    {
        setupEfpg(_efpgMap, new EfpgWhiteVariantRelationLocalPkReferrerAsOne(), "whiteVariantRelationLocalPkReferrerAsOne");
    }
    public class EfpgWhiteVariantRelationLocalPkReferrerAsOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterFoo)et).getWhiteVariantRelationLocalPkReferrerAsOne(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterFoo)et).setWhiteVariantRelationLocalPkReferrerAsOne((WhiteVariantRelationLocalPkReferrer)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_master_foo";
    protected final String _tablePropertyName = "whiteVariantRelationMasterFoo";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_MASTER_FOO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMasterFooId = cci("MASTER_FOO_ID", "MASTER_FOO_ID", null, null, Long.class, "masterFooId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne,whiteVariantRelationLocalPkReferrerAsOne", "whiteVariantRelationReferrerAsVariantList", null);
    protected final ColumnInfo _columnMasterFooName = cci("MASTER_FOO_NAME", "MASTER_FOO_NAME", null, null, String.class, "masterFooName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMasterFooId() { return _columnMasterFooId; }
    /**
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMasterFooName() { return _columnMasterFooName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMasterFooId());
        ls.add(columnMasterFooName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMasterFooId()); }
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
     * white_variant_relation_referrer by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMasterFooId(), WhiteVariantRelationReferrerDbm.getInstance().columnVariantMasterId());
        return cfi("FK_WHITE_VARIANT_RELATION_BIZ_ONE_TO_ONE_FOR_BIZ_MANY_TO_ONE", "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne", this, WhiteVariantRelationReferrerDbm.getInstance(), mp, 0, null, true, true, false, true, "$$foreignAlias$$.MASTER_TYPE_CODE = 'FOO'", null, false, null);
    }
    /**
     * white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationLocalPkReferrerAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMasterFooId(), WhiteVariantRelationLocalPkReferrerDbm.getInstance().columnReversefkSuppressedId());
        return cfi("FK_WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER", "whiteVariantRelationLocalPkReferrerAsOne", this, WhiteVariantRelationLocalPkReferrerDbm.getInstance(), mp, 1, null, true, true, true, true, "$$localAlias$$.MASTER_TYPE_CODE = 'FOO'", null, false, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteVariantRelationReferrerAsVariantList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMasterFooId(), WhiteVariantRelationReferrerDbm.getInstance().columnVariantMasterId());
        return cri("FK_WHITE_VARIANT_RELATION_FOO", "whiteVariantRelationReferrerAsVariantList", this, WhiteVariantRelationReferrerDbm.getInstance(), mp, false, "whiteVariantRelationMasterFooAsVariant");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterFoo"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationMasterFooCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterFooBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationMasterFoo> getEntityType() { return WhiteVariantRelationMasterFoo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteVariantRelationMasterFoo newEntity() { return new WhiteVariantRelationMasterFoo(); }
    public WhiteVariantRelationMasterFoo newMyEntity() { return new WhiteVariantRelationMasterFoo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationMasterFoo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteVariantRelationMasterFoo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
