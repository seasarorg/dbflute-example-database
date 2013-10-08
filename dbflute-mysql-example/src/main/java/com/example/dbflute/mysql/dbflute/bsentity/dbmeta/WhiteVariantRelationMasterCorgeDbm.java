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
 * The DB meta of white_variant_relation_master_corge. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterCorgeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationMasterCorgeDbm _instance = new WhiteVariantRelationMasterCorgeDbm();
    private WhiteVariantRelationMasterCorgeDbm() {}
    public static WhiteVariantRelationMasterCorgeDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMasterCorgeId(), "masterCorgeId");
        setupEpg(_epgMap, new EpgMasterCorgeName(), "masterCorgeName");
        setupEpg(_epgMap, new EpgCorgeTypeCode(), "corgeTypeCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMasterCorgeId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationMasterCorge)e).getMasterCorgeId(); }
        public void write(Entity e, Object v) { ((WhiteVariantRelationMasterCorge)e).setMasterCorgeId(ctl(v)); }
    }
    public static class EpgMasterCorgeName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationMasterCorge)e).getMasterCorgeName(); }
        public void write(Entity e, Object v) { ((WhiteVariantRelationMasterCorge)e).setMasterCorgeName((String)v); }
    }
    public class EpgCorgeTypeCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationMasterCorge)e).getCorgeTypeCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnCorgeTypeCode();
            ccls(col, v);
            ((WhiteVariantRelationMasterCorge)e).setCorgeTypeCodeAsVariantRelationQuxType((CDef.VariantRelationQuxType)gcls(col, v));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_master_corge";
    protected final String _tablePropertyName = "whiteVariantRelationMasterCorge";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_MASTER_CORGE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMasterCorgeId = cci("MASTER_CORGE_ID", "MASTER_CORGE_ID", null, null, true, "masterCorgeId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMasterCorgeName = cci("MASTER_CORGE_NAME", "MASTER_CORGE_NAME", null, null, true, "masterCorgeName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCorgeTypeCode = cci("CORGE_TYPE_CODE", "CORGE_TYPE_CODE", null, null, true, "corgeTypeCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.VariantRelationQuxType);

    public ColumnInfo columnMasterCorgeId() { return _columnMasterCorgeId; }
    public ColumnInfo columnMasterCorgeName() { return _columnMasterCorgeName; }
    public ColumnInfo columnCorgeTypeCode() { return _columnCorgeTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMasterCorgeId());
        ls.add(columnMasterCorgeName());
        ls.add(columnCorgeTypeCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMasterCorgeId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterCorge"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationMasterCorgeCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterCorgeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationMasterCorge> getEntityType() { return WhiteVariantRelationMasterCorge.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteVariantRelationMasterCorge newMyEntity() { return new WhiteVariantRelationMasterCorge(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationMasterCorge)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteVariantRelationMasterCorge)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
