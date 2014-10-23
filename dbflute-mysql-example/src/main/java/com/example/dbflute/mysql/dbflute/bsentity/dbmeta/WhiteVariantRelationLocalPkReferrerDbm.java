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
 * The DB meta of white_variant_relation_local_pk_referrer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationLocalPkReferrerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationLocalPkReferrerDbm _instance = new WhiteVariantRelationLocalPkReferrerDbm();
    private WhiteVariantRelationLocalPkReferrerDbm() {}
    public static WhiteVariantRelationLocalPkReferrerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgReversefkSuppressedId(), "reversefkSuppressedId");
        setupEpg(_epgMap, new EpgMasterTypeCode(), "masterTypeCode");
    }
    public static class EpgReversefkSuppressedId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationLocalPkReferrer)et).getReversefkSuppressedId(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationLocalPkReferrer)et).setReversefkSuppressedId(ctl(vl)); }
    }
    public static class EpgMasterTypeCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationLocalPkReferrer)et).getMasterTypeCode(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationLocalPkReferrer)et).setMasterTypeCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(), "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne");
    }
    public class EfpgWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationLocalPkReferrer)et).getWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationLocalPkReferrer)et).setWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne((WhiteVariantRelationMasterFoo)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_local_pk_referrer";
    protected final String _tablePropertyName = "whiteVariantRelationLocalPkReferrer";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReversefkSuppressedId = cci("REVERSEFK_SUPPRESSED_ID", "REVERSEFK_SUPPRESSED_ID", null, null, Long.class, "reversefkSuppressedId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne", null, null);
    protected final ColumnInfo _columnMasterTypeCode = cci("MASTER_TYPE_CODE", "MASTER_TYPE_CODE", null, null, String.class, "masterTypeCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);

    /**
     * REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReversefkSuppressedId() { return _columnReversefkSuppressedId; }
    /**
     * MASTER_TYPE_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMasterTypeCode() { return _columnMasterTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReversefkSuppressedId());
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
    protected UniqueInfo cpui() { return hpcpui(columnReversefkSuppressedId()); }
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
     * white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReversefkSuppressedId(), WhiteVariantRelationMasterFooDbm.getInstance().columnMasterFooId());
        return cfi("FK_WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER", "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne", this, WhiteVariantRelationMasterFooDbm.getInstance(), mp, 0, null, true, true, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'FOO'", null, false, "whiteVariantRelationLocalPkReferrerAsOne");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationLocalPkReferrer"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationLocalPkReferrerCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationLocalPkReferrerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationLocalPkReferrer> getEntityType() { return WhiteVariantRelationLocalPkReferrer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteVariantRelationLocalPkReferrer newEntity() { return new WhiteVariantRelationLocalPkReferrer(); }
    public WhiteVariantRelationLocalPkReferrer newMyEntity() { return new WhiteVariantRelationLocalPkReferrer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationLocalPkReferrer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteVariantRelationLocalPkReferrer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
