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
 * The DB meta of white_split_multiple_fk_next. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkNextDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSplitMultipleFkNextDbm _instance = new WhiteSplitMultipleFkNextDbm();
    private WhiteSplitMultipleFkNextDbm() {}
    public static WhiteSplitMultipleFkNextDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgNextId(), "nextId");
        setupEpg(_epgMap, new EpgSecondCode(), "secondCode");
    }
    public static class EpgNextId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkNext)et).getNextId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkNext)et).setNextId(ctl(vl)); }
    }
    public static class EpgSecondCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkNext)et).getSecondCode(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkNext)et).setSecondCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_split_multiple_fk_next";
    protected final String _tablePropertyName = "whiteSplitMultipleFkNext";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SPLIT_MULTIPLE_FK_NEXT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNextId = cci("NEXT_ID", "NEXT_ID", null, null, Long.class, "nextId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, "whiteSplitMultipleFkBaseList", null);
    protected final ColumnInfo _columnSecondCode = cci("SECOND_CODE", "SECOND_CODE", null, null, String.class, "secondCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);

    /**
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextId() { return _columnNextId; }
    /**
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecondCode() { return _columnSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNextId());
        ls.add(columnSecondCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNextId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSplitMultipleFkBaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextId(), WhiteSplitMultipleFkBaseDbm.getInstance().columnNextId());
        return cri("FK_WHITE_SPLIT_MULTIPLE_FK_NEXT", "whiteSplitMultipleFkBaseList", this, WhiteSplitMultipleFkBaseDbm.getInstance(), mp, false, "whiteSplitMultipleFkNext");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkNext"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSplitMultipleFkNextCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkNextBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSplitMultipleFkNext> getEntityType() { return WhiteSplitMultipleFkNext.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSplitMultipleFkNext newEntity() { return new WhiteSplitMultipleFkNext(); }
    public WhiteSplitMultipleFkNext newMyEntity() { return new WhiteSplitMultipleFkNext(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSplitMultipleFkNext)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSplitMultipleFkNext)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
