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
 * The DB meta of white_split_multiple_fk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSplitMultipleFkRefDbm _instance = new WhiteSplitMultipleFkRefDbm();
    private WhiteSplitMultipleFkRefDbm() {}
    public static WhiteSplitMultipleFkRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFirstId(), "firstId");
        setupEpg(_epgMap, new EpgSecondCode(), "secondCode");
        setupEpg(_epgMap, new EpgRefName(), "refName");
    }
    public static class EpgFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkRef)et).getFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkRef)et).setFirstId(cti(vl)); }
    }
    public static class EpgSecondCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkRef)et).getSecondCode(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkRef)et).setSecondCode((String)vl); }
    }
    public static class EpgRefName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSplitMultipleFkRef)et).getRefName(); }
        public void write(Entity et, Object vl) { ((WhiteSplitMultipleFkRef)et).setRefName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_split_multiple_fk_ref";
    protected final String _tablePropertyName = "whiteSplitMultipleFkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SPLIT_MULTIPLE_FK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFirstId = cci("FIRST_ID", "FIRST_ID", null, null, Integer.class, "firstId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSecondCode = cci("SECOND_CODE", "SECOND_CODE", null, null, String.class, "secondCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefName = cci("REF_NAME", "REF_NAME", null, null, String.class, "refName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstId() { return _columnFirstId; }
    /**
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecondCode() { return _columnSecondCode; }
    /**
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefName() { return _columnRefName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFirstId());
        ls.add(columnSecondCode());
        ls.add(columnRefName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFirstId());
        ls.add(columnSecondCode());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSplitMultipleFkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSplitMultipleFkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSplitMultipleFkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSplitMultipleFkRef> getEntityType() { return WhiteSplitMultipleFkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSplitMultipleFkRef newEntity() { return new WhiteSplitMultipleFkRef(); }
    public WhiteSplitMultipleFkRef newMyEntity() { return new WhiteSplitMultipleFkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSplitMultipleFkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSplitMultipleFkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
