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
 * The DB meta of white_variant_relation_master_qux. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterQuxDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationMasterQuxDbm _instance = new WhiteVariantRelationMasterQuxDbm();
    private WhiteVariantRelationMasterQuxDbm() {}
    public static WhiteVariantRelationMasterQuxDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMasterQuxId(), "masterQuxId");
        setupEpg(_epgMap, new EpgMasterQuxName(), "masterQuxName");
        setupEpg(_epgMap, new EpgQuxTypeCode(), "quxTypeCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMasterQuxId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterQux)et).getMasterQuxId(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterQux)et).setMasterQuxId(ctl(vl)); }
    }
    public static class EpgMasterQuxName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterQux)et).getMasterQuxName(); }
        public void write(Entity et, Object vl) { ((WhiteVariantRelationMasterQux)et).setMasterQuxName((String)vl); }
    }
    public class EpgQuxTypeCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteVariantRelationMasterQux)et).getQuxTypeCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnQuxTypeCode();
            ccls(col, vl);
            ((WhiteVariantRelationMasterQux)et).setQuxTypeCodeAsVariantRelationQuxType((CDef.VariantRelationQuxType)gcls(col, vl));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_master_qux";
    protected final String _tablePropertyName = "whiteVariantRelationMasterQux";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_MASTER_QUX", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMasterQuxId = cci("MASTER_QUX_ID", "MASTER_QUX_ID", null, null, true, "masterQuxId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMasterQuxName = cci("MASTER_QUX_NAME", "MASTER_QUX_NAME", null, null, true, "masterQuxName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQuxTypeCode = cci("QUX_TYPE_CODE", "QUX_TYPE_CODE", null, null, true, "quxTypeCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.VariantRelationQuxType);

    public ColumnInfo columnMasterQuxId() { return _columnMasterQuxId; }
    public ColumnInfo columnMasterQuxName() { return _columnMasterQuxName; }
    public ColumnInfo columnQuxTypeCode() { return _columnQuxTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMasterQuxId());
        ls.add(columnMasterQuxName());
        ls.add(columnQuxTypeCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMasterQuxId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterQux"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationMasterQuxCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterQuxBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationMasterQux> getEntityType() { return WhiteVariantRelationMasterQux.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteVariantRelationMasterQux newMyEntity() { return new WhiteVariantRelationMasterQux(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationMasterQux)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteVariantRelationMasterQux)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
