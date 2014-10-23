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
 * The DB meta of white_variant_relation_referrer_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationReferrerRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationReferrerRefDbm _instance = new WhiteVariantRelationReferrerRefDbm();
    private WhiteVariantRelationReferrerRefDbm() {}
    public static WhiteVariantRelationReferrerRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRefId(), "refId");
        setupEpg(_epgMap, new EpgReferrerId(), "referrerId");
    }
    public static class EpgRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationReferrerRef)et).getRefId(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationReferrerRef)et).setRefId(ctl(vl)); }
    }
    public static class EpgReferrerId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationReferrerRef)et).getReferrerId(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationReferrerRef)et).setReferrerId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteVariantRelationReferrer(), "whiteVariantRelationReferrer");
    }
    public class EfpgWhiteVariantRelationReferrer implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationReferrerRef)et).getWhiteVariantRelationReferrer(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationReferrerRef)et).setWhiteVariantRelationReferrer((WhiteVariantRelationReferrer)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_referrer_ref";
    protected final String _tablePropertyName = "whiteVariantRelationReferrerRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_REFERRER_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefId = cci("REF_ID", "REF_ID", null, null, Long.class, "refId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReferrerId = cci("REFERRER_ID", "REFERRER_ID", null, null, Long.class, "referrerId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteVariantRelationReferrer", null, null);

    /**
     * REF_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefId() { return _columnRefId; }
    /**
     * REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferrerId() { return _columnReferrerId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefId());
        ls.add(columnReferrerId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefId()); }
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
     * white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationReferrer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReferrerId(), WhiteVariantRelationReferrerDbm.getInstance().columnReferrerId());
        return cfi("FK_WHITE_VARIANT_RELATION_REFERRER_REF", "whiteVariantRelationReferrer", this, WhiteVariantRelationReferrerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteVariantRelationReferrerRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationReferrerRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationReferrerRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationReferrerRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationReferrerRef> getEntityType() { return WhiteVariantRelationReferrerRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteVariantRelationReferrerRef newEntity() { return new WhiteVariantRelationReferrerRef(); }
    public WhiteVariantRelationReferrerRef newMyEntity() { return new WhiteVariantRelationReferrerRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationReferrerRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteVariantRelationReferrerRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
