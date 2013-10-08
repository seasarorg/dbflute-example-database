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
 * The DB meta of white_self_reference_ref_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceRefOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSelfReferenceRefOneDbm _instance = new WhiteSelfReferenceRefOneDbm();
    private WhiteSelfReferenceRefOneDbm() {}
    public static WhiteSelfReferenceRefOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSelfReferenceRefOneName(), "selfReferenceRefOneName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSelfReferenceId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSelfReferenceRefOne)e).getSelfReferenceId(); }
        public void write(Entity e, Object v) { ((WhiteSelfReferenceRefOne)e).setSelfReferenceId(ctl(v)); }
    }
    public static class EpgSelfReferenceRefOneName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSelfReferenceRefOne)e).getSelfReferenceRefOneName(); }
        public void write(Entity e, Object v) { ((WhiteSelfReferenceRefOne)e).setSelfReferenceRefOneName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_self_reference_ref_one";
    protected final String _tablePropertyName = "whiteSelfReferenceRefOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SELF_REFERENCE_REF_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSelfReferenceId = cci("SELF_REFERENCE_ID", "SELF_REFERENCE_ID", null, null, true, "selfReferenceId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, "whiteSelfReference,whiteSelfReferenceAsDirectParent", "whiteSelfReferenceByParentIdList", null);
    protected final ColumnInfo _columnSelfReferenceRefOneName = cci("SELF_REFERENCE_REF_ONE_NAME", "SELF_REFERENCE_REF_ONE_NAME", null, null, true, "selfReferenceRefOneName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSelfReferenceId() { return _columnSelfReferenceId; }
    public ColumnInfo columnSelfReferenceRefOneName() { return _columnSelfReferenceRefOneName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSelfReferenceId());
        ls.add(columnSelfReferenceRefOneName());
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
    public ForeignInfo foreignWhiteSelfReference() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE", "whiteSelfReference", this, WhiteSelfReferenceDbm.getInstance(), map, 0, true, false, false, false, null, null, false, "whiteSelfReferenceRefOneAsOne");
    }
    public ForeignInfo foreignWhiteSelfReferenceAsDirectParent() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnParentId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT", "whiteSelfReferenceAsDirectParent", this, WhiteSelfReferenceDbm.getInstance(), map, 1, true, true, false, true, "1=1", null, false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteSelfReferenceByParentIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnParentId());
        return cri("FK_white_self_reference_white_self_reference_ref_one_IMPLICIT", "whiteSelfReferenceByParentIdList", this, WhiteSelfReferenceDbm.getInstance(), map, false, "whiteSelfReferenceRefOneByParentId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSelfReferenceRefOne"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSelfReferenceRefOneCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSelfReferenceRefOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSelfReferenceRefOne> getEntityType() { return WhiteSelfReferenceRefOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSelfReferenceRefOne newMyEntity() { return new WhiteSelfReferenceRefOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteSelfReferenceRefOne)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteSelfReferenceRefOne)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
