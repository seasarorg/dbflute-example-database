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
 * The DB meta of white_split_multiple_fk_base. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkBaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSplitMultipleFkBaseDbm _instance = new WhiteSplitMultipleFkBaseDbm();
    private WhiteSplitMultipleFkBaseDbm() {}
    public static WhiteSplitMultipleFkBaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgBaseId(), "baseId");
        setupEpg(_epgMap, new EpgFirstId(), "firstId");
        setupEpg(_epgMap, new EpgNextId(), "nextId");
        setupEpg(_epgMap, new EpgSplitName(), "splitName");
    }
    public static class EpgBaseId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkBase)et).getBaseId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkBase)et).setBaseId(ctl(vl)); }
    }
    public static class EpgFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkBase)et).getFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkBase)et).setFirstId(cti(vl)); }
    }
    public static class EpgNextId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkBase)et).getNextId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkBase)et).setNextId(ctl(vl)); }
    }
    public static class EpgSplitName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkBase)et).getSplitName(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkBase)et).setSplitName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSplitMultipleFkNext(), "whiteSplitMultipleFkNext");
        setupEfpg(_efpgMap, new EfpgWhiteSplitMultipleFkRefAsSplitMultipleFkTest(), "whiteSplitMultipleFkRefAsSplitMultipleFkTest");
    }
    public class EfpgWhiteSplitMultipleFkNext implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkBase)et).getWhiteSplitMultipleFkNext(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkBase)et).setWhiteSplitMultipleFkNext((WhiteSplitMultipleFkNext)vl); }
    }
    public class EfpgWhiteSplitMultipleFkRefAsSplitMultipleFkTest implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkBase)et).getWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkBase)et).setWhiteSplitMultipleFkRefAsSplitMultipleFkTest((WhiteSplitMultipleFkRef)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_split_multiple_fk_base";
    protected final String _tablePropertyName = "whiteSplitMultipleFkBase";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SPLIT_MULTIPLE_FK_BASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Long.class, "baseId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, "whiteSplitMultipleFkChildList", null);
    protected final ColumnInfo _columnFirstId = cci("FIRST_ID", "FIRST_ID", null, null, Integer.class, "firstId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSplitMultipleFkRefAsSplitMultipleFkTest", null, null);
    protected final ColumnInfo _columnNextId = cci("NEXT_ID", "NEXT_ID", null, null, Long.class, "nextId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteSplitMultipleFkNext", null, null);
    protected final ColumnInfo _columnSplitName = cci("SPLIT_NAME", "SPLIT_NAME", null, null, String.class, "splitName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }
    /**
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstId() { return _columnFirstId; }
    /**
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextId() { return _columnNextId; }
    /**
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplitName() { return _columnSplitName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBaseId());
        ls.add(columnFirstId());
        ls.add(columnNextId());
        ls.add(columnSplitName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSplitMultipleFkNext() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextId(), WhiteSplitMultipleFkNextDbm.getInstance().columnNextId());
        return cfi("FK_WHITE_SPLIT_MULTIPLE_FK_NEXT", "whiteSplitMultipleFkNext", this, WhiteSplitMultipleFkNextDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteSplitMultipleFkBaseList");
    }
    /**
     * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFirstId(), WhiteSplitMultipleFkRefDbm.getInstance().columnFirstId());
        return cfi("FK_WHITE_SPLIT_MULTIPLE_FK", "whiteSplitMultipleFkRefAsSplitMultipleFkTest", this, WhiteSplitMultipleFkRefDbm.getInstance(), mp, 1, null, false, false, false, true, "$$over($localTable.whiteSplitMultipleFkNext)$$.SECOND_CODE = $$foreignAlias$$.SECOND_CODE", null, false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSplitMultipleFkChildList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteSplitMultipleFkChildDbm.getInstance().columnBaseId());
        return cri("FK_WHITE_SPLIT_MULTIPLE_FK_BASE", "whiteSplitMultipleFkChildList", this, WhiteSplitMultipleFkChildDbm.getInstance(), mp, false, "whiteSplitMultipleFkBase");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkBase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSplitMultipleFkBaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkBaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSplitMultipleFkBase> getEntityType() { return WhiteSplitMultipleFkBase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteSplitMultipleFkBase newMyEntity() { return new WhiteSplitMultipleFkBase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSplitMultipleFkBase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSplitMultipleFkBase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
