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
 * The DB meta of white_compound_pk_ref_nest. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefNestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefNestDbm _instance = new WhiteCompoundPkRefNestDbm();
    private WhiteCompoundPkRefNestDbm() {}
    public static WhiteCompoundPkRefNestDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgCompoundPkRefNestId(), "compoundPkRefNestId");
        setupEpg(_epgMap, new EpgFooMultipleId(), "fooMultipleId");
        setupEpg(_epgMap, new EpgBarMultipleId(), "barMultipleId");
        setupEpg(_epgMap, new EpgQuxMultipleId(), "quxMultipleId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgCompoundPkRefNestId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRefNest)e).getCompoundPkRefNestId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRefNest)e).setCompoundPkRefNestId(cti(v)); }
    }
    public static class EpgFooMultipleId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRefNest)e).getFooMultipleId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRefNest)e).setFooMultipleId(cti(v)); }
    }
    public static class EpgBarMultipleId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRefNest)e).getBarMultipleId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRefNest)e).setBarMultipleId(cti(v)); }
    }
    public static class EpgQuxMultipleId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRefNest)e).getQuxMultipleId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRefNest)e).setQuxMultipleId(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_ref_nest";
    protected final String _tablePropertyName = "whiteCompoundPkRefNest";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK_REF_NEST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCompoundPkRefNestId = cci("COMPOUND_PK_REF_NEST_ID", "COMPOUND_PK_REF_NEST_ID", null, null, true, "compoundPkRefNestId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooMultipleId = cci("FOO_MULTIPLE_ID", "FOO_MULTIPLE_ID", null, null, true, "fooMultipleId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefByFooMultipleId", null, null);
    protected final ColumnInfo _columnBarMultipleId = cci("BAR_MULTIPLE_ID", "BAR_MULTIPLE_ID", null, null, true, "barMultipleId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefByQuxMultipleId,whiteCompoundPkRefByFooMultipleId", null, null);
    protected final ColumnInfo _columnQuxMultipleId = cci("QUX_MULTIPLE_ID", "QUX_MULTIPLE_ID", null, null, true, "quxMultipleId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefByQuxMultipleId", null, null);

    public ColumnInfo columnCompoundPkRefNestId() { return _columnCompoundPkRefNestId; }
    public ColumnInfo columnFooMultipleId() { return _columnFooMultipleId; }
    public ColumnInfo columnBarMultipleId() { return _columnBarMultipleId; }
    public ColumnInfo columnQuxMultipleId() { return _columnQuxMultipleId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCompoundPkRefNestId());
        ls.add(columnFooMultipleId());
        ls.add(columnBarMultipleId());
        ls.add(columnQuxMultipleId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCompoundPkRefNestId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteCompoundPkRefByQuxMultipleId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnBarMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleFirstId());
        map.put(columnQuxMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_NEST_BAR_QUX", "whiteCompoundPkRefByQuxMultipleId", this, WhiteCompoundPkRefDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteCompoundPkRefNestByQuxMultipleIdList");
    }
    public ForeignInfo foreignWhiteCompoundPkRefByFooMultipleId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnFooMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleFirstId());
        map.put(columnBarMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_NEST_FOO_BAR", "whiteCompoundPkRefByFooMultipleId", this, WhiteCompoundPkRefDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "whiteCompoundPkRefNestByFooMultipleIdList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkRefNest"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkRefNestCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkRefNestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRefNest> getEntityType() { return WhiteCompoundPkRefNest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteCompoundPkRefNest newMyEntity() { return new WhiteCompoundPkRefNest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRefNest)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteCompoundPkRefNest)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
