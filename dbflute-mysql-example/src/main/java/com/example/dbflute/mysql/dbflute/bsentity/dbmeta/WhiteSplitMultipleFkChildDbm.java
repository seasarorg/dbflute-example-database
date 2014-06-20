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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgChildId(), "childId");
        setupEpg(_epgMap, new EpgBaseId(), "baseId");
        setupEpg(_epgMap, new EpgChildName(), "childName");
    }
    public static class EpgChildId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkChild)et).getChildId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkChild)et).setChildId(ctl(vl)); }
    }
    public static class EpgBaseId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkChild)et).getBaseId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkChild)et).setBaseId(ctl(vl)); }
    }
    public static class EpgChildName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkChild)et).getChildName(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkChild)et).setChildName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSplitMultipleFkBase(), "whiteSplitMultipleFkBase");
    }
    public class EfpgWhiteSplitMultipleFkBase implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkChild)et).getWhiteSplitMultipleFkBase(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkChild)et).setWhiteSplitMultipleFkBase((WhiteSplitMultipleFkBase)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnChildId = cci("CHILD_ID", "CHILD_ID", null, null, Long.class, "childId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Long.class, "baseId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteSplitMultipleFkBase", null, null);
    protected final ColumnInfo _columnChildName = cci("CHILD_NAME", "CHILD_NAME", null, null, String.class, "childName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChildId() { return _columnChildId; }
    /**
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }
    /**
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSplitMultipleFkBase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteSplitMultipleFkBaseDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_SPLIT_MULTIPLE_FK_BASE", "whiteSplitMultipleFkBase", this, WhiteSplitMultipleFkBaseDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteSplitMultipleFkChildList");
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
    public WhiteSplitMultipleFkChild newEntity() { return new WhiteSplitMultipleFkChild(); }
    public WhiteSplitMultipleFkChild newMyEntity() { return new WhiteSplitMultipleFkChild(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSplitMultipleFkChild)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSplitMultipleFkChild)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
