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
 * The DB meta of white_variant_relation_referrer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationReferrerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationReferrerDbm _instance = new WhiteVariantRelationReferrerDbm();
    private WhiteVariantRelationReferrerDbm() {}
    public static WhiteVariantRelationReferrerDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgReferrerId(), "referrerId");
        setupEpg(_epgMap, new EpgVariantMasterId(), "variantMasterId");
        setupEpg(_epgMap, new EpgMasterTypeCode(), "masterTypeCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgReferrerId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationReferrer)e).getReferrerId(); }
        public void write(Entity e, Object v) { ((WhiteVariantRelationReferrer)e).setReferrerId(ctl(v)); }
    }
    public static class EpgVariantMasterId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationReferrer)e).getVariantMasterId(); }
        public void write(Entity e, Object v) { ((WhiteVariantRelationReferrer)e).setVariantMasterId(ctl(v)); }
    }
    public class EpgMasterTypeCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationReferrer)e).getMasterTypeCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnMasterTypeCode();
            ccls(col, v);
            ((WhiteVariantRelationReferrer)e).setMasterTypeCodeAsVariantRelationMasterType((CDef.VariantRelationMasterType)gcls(col, v));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_referrer";
    protected final String _tablePropertyName = "whiteVariantRelationReferrer";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_REFERRER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReferrerId = cci("REFERRER_ID", "REFERRER_ID", null, null, true, "referrerId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVariantMasterId = cci("VARIANT_MASTER_ID", "VARIANT_MASTER_ID", null, null, true, "variantMasterId", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, "whiteVariantRelationMasterFooAsVariant,whiteVariantRelationMasterBarAsVariant,whiteVariantRelationMasterQuxAsVariantByQue,whiteVariantRelationMasterCorgeAsVariantByQuxType", null, null);
    protected final ColumnInfo _columnMasterTypeCode = cci("MASTER_TYPE_CODE", "MASTER_TYPE_CODE", null, null, true, "masterTypeCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.VariantRelationMasterType);

    public ColumnInfo columnReferrerId() { return _columnReferrerId; }
    public ColumnInfo columnVariantMasterId() { return _columnVariantMasterId; }
    public ColumnInfo columnMasterTypeCode() { return _columnMasterTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReferrerId());
        ls.add(columnVariantMasterId());
        ls.add(columnMasterTypeCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnReferrerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteVariantRelationMasterFooAsVariant() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterFooDbm.getInstance().columnMasterFooId());
        return cfi("FK_WHITE_VARIANT_RELATION_FOO", "whiteVariantRelationMasterFooAsVariant", this, WhiteVariantRelationMasterFooDbm.getInstance(), map, 0, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'FOO'", null, false, "whiteVariantRelationReferrerAsVariantList");
    }
    public ForeignInfo foreignWhiteVariantRelationMasterBarAsVariant() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterBarDbm.getInstance().columnMasterBarId());
        return cfi("FK_WHITE_VARIANT_RELATION_BAR", "whiteVariantRelationMasterBarAsVariant", this, WhiteVariantRelationMasterBarDbm.getInstance(), map, 1, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'BAR'", null, false, "whiteVariantRelationReferrerAsVariantList");
    }
    public ForeignInfo foreignWhiteVariantRelationMasterQuxAsVariantByQue() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterQuxDbm.getInstance().columnMasterQuxId());
        return cfi("FK_WHITE_VARIANT_RELATION_QUX", "whiteVariantRelationMasterQuxAsVariantByQue", this, WhiteVariantRelationMasterQuxDbm.getInstance(), map, 2, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'QUX'\n     and $$foreignAlias$$.QUX_TYPE_CODE = 'Que'", null, false, null);
    }
    public ForeignInfo foreignWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterCorgeDbm.getInstance().columnMasterCorgeId());
        return cfi("FK_WHITE_VARIANT_RELATION_CORGE", "whiteVariantRelationMasterCorgeAsVariantByQuxType", this, WhiteVariantRelationMasterCorgeDbm.getInstance(), map, 3, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'CORGE'\n     and $$foreignAlias$$.CORGE_TYPE_CODE = /*$$locationBase$$.parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType.quxType*/null", newArrayList("quxType"), false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationReferrer"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationReferrerCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationReferrerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationReferrer> getEntityType() { return WhiteVariantRelationReferrer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteVariantRelationReferrer newMyEntity() { return new WhiteVariantRelationReferrer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationReferrer)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteVariantRelationReferrer)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
