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
 * The DB meta of white_split_multiple_fk_child. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkChildDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSplitMultipleFkChildDbm _instance = new WhiteSplitMultipleFkChildDbm();
    private WhiteSplitMultipleFkChildDbm() {}
    public static WhiteSplitMultipleFkChildDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgChildId(), "childId");
        setupEpg(_epgMap, new EpgBaseId(), "baseId");
        setupEpg(_epgMap, new EpgChildName(), "childName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgChildId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSplitMultipleFkChild)e).getChildId(); }
        public void write(Entity e, Object v) { ((WhiteSplitMultipleFkChild)e).setChildId(ctl(v)); }
    }
    public static class EpgBaseId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSplitMultipleFkChild)e).getBaseId(); }
        public void write(Entity e, Object v) { ((WhiteSplitMultipleFkChild)e).setBaseId(ctl(v)); }
    }
    public static class EpgChildName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteSplitMultipleFkChild)e).getChildName(); }
        public void write(Entity e, Object v) { ((WhiteSplitMultipleFkChild)e).setChildName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_split_multiple_fk_child";
    protected final String _tablePropertyName = "whiteSplitMultipleFkChild";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SPLIT_MULTIPLE_FK_CHILD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnChildId = cci("CHILD_ID", "CHILD_ID", null, null, true, "childId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, true, "baseId", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, "whiteSplitMultipleFkBase", null, null);
    protected final ColumnInfo _columnChildName = cci("CHILD_NAME", "CHILD_NAME", null, null, true, "childName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnChildId() { return _columnChildId; }
    public ColumnInfo columnBaseId() { return _columnBaseId; }
    public ColumnInfo columnChildName() { return _columnChildName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnChildId());
        ls.add(columnBaseId());
        ls.add(columnChildName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnChildId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteSplitMultipleFkBase() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBaseId(), WhiteSplitMultipleFkBaseDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_SPLIT_MULTIPLE_FK_BASE", "whiteSplitMultipleFkBase", this, WhiteSplitMultipleFkBaseDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteSplitMultipleFkChildList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkChild"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSplitMultipleFkChildCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkChildBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSplitMultipleFkChild> getEntityType() { return WhiteSplitMultipleFkChild.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSplitMultipleFkChild newMyEntity() { return new WhiteSplitMultipleFkChild(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteSplitMultipleFkChild)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteSplitMultipleFkChild)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
