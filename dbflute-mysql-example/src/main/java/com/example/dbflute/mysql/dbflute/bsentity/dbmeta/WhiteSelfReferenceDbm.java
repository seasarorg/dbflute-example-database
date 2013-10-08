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
 * The DB meta of white_self_reference. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSelfReferenceDbm _instance = new WhiteSelfReferenceDbm();
    private WhiteSelfReferenceDbm() {}
    public static WhiteSelfReferenceDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSelfReferenceId(), "selfReferenceId");
        setupEpg(_epgMap, new EpgSelfReferenceName(), "selfReferenceName");
        setupEpg(_epgMap, new EpgParentId(), "parentId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSelfReferenceId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSelfReference)e).getSelfReferenceId(); }
        public void write(Entity e, Object v) { ((WhiteSelfReference)e).setSelfReferenceId(ctl(v)); }
    }
    public static class EpgSelfReferenceName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSelfReference)e).getSelfReferenceName(); }
        public void write(Entity e, Object v) { ((WhiteSelfReference)e).setSelfReferenceName((String)v); }
    }
    public static class EpgParentId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSelfReference)e).getParentId(); }
        public void write(Entity e, Object v) { ((WhiteSelfReference)e).setParentId(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_self_reference";
    protected final String _tablePropertyName = "whiteSelfReference";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SELF_REFERENCE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSelfReferenceId = cci("SELF_REFERENCE_ID", "SELF_REFERENCE_ID", null, null, true, "selfReferenceId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, "whiteSelfReferenceSelfList", null);
    protected final ColumnInfo _columnSelfReferenceName = cci("SELF_REFERENCE_NAME", "SELF_REFERENCE_NAME", null, null, true, "selfReferenceName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentId = cci("PARENT_ID", "PARENT_ID", null, null, false, "parentId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, "whiteSelfReferenceSelf,whiteSelfReferenceRefOneByParentId", null, null);

    public ColumnInfo columnSelfReferenceId() { return _columnSelfReferenceId; }
    public ColumnInfo columnSelfReferenceName() { return _columnSelfReferenceName; }
    public ColumnInfo columnParentId() { return _columnParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSelfReferenceId());
        ls.add(columnSelfReferenceName());
        ls.add(columnParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSelfReferenceId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteSelfReferenceSelf() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnParentId(), WhiteSelfReferenceDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_PARENT", "whiteSelfReferenceSelf", this, WhiteSelfReferenceDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteSelfReferenceSelfList");
    }
    public ForeignInfo foreignWhiteSelfReferenceRefOneByParentId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnParentId(), WhiteSelfReferenceRefOneDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_white_self_reference_white_self_reference_ref_one_IMPLICIT", "whiteSelfReferenceRefOneByParentId", this, WhiteSelfReferenceRefOneDbm.getInstance(), map, 1, false, false, false, true, null, null, false, "whiteSelfReferenceByParentIdList");
    }
    public ForeignInfo foreignWhiteSelfReferenceRefOneAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceRefOneDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE", "whiteSelfReferenceRefOneAsOne", this, WhiteSelfReferenceRefOneDbm.getInstance(), map, 2, true, false, true, false, null, null, false, "whiteSelfReference");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteSelfReferenceSelfList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnParentId());
        return cri("FK_WHITE_SELF_REFERENCE_PARENT", "whiteSelfReferenceSelfList", this, WhiteSelfReferenceDbm.getInstance(), map, false, "whiteSelfReferenceSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSelfReference"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSelfReferenceCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSelfReferenceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSelfReference> getEntityType() { return WhiteSelfReference.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSelfReference newMyEntity() { return new WhiteSelfReference(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteSelfReference)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteSelfReference)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
