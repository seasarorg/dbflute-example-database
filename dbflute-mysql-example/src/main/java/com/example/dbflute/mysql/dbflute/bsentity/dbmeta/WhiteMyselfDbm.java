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
 * The DB meta of white_myself. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteMyselfDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteMyselfDbm _instance = new WhiteMyselfDbm();
    private WhiteMyselfDbm() {}
    public static WhiteMyselfDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMyselfId(), "myselfId");
        setupEpg(_epgMap, new EpgMyselfName(), "myselfName");
    }
    public static class EpgMyselfId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteMyself)et).getMyselfId(); }
        public void write(Entity et, Object vl) { ((WhiteMyself)et).setMyselfId(cti(vl)); }
    }
    public static class EpgMyselfName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteMyself)et).getMyselfName(); }
        public void write(Entity et, Object vl) { ((WhiteMyself)et).setMyselfName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_myself";
    protected final String _tablePropertyName = "whiteMyself";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_MYSELF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, Integer.class, "myselfId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteMyselfCheckList", null);
    protected final ColumnInfo _columnMyselfName = cci("MYSELF_NAME", "MYSELF_NAME", null, null, String.class, "myselfName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);

    /**
     * MYSELF_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfId() { return _columnMyselfId; }
    /**
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfName() { return _columnMyselfName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMyselfId());
        ls.add(columnMyselfName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMyselfId()); }
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
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteMyselfCheckList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyselfId(), WhiteMyselfCheckDbm.getInstance().columnMyselfId());
        return cri("FK_WHITE_MYSELF_CHECK_SELF", "whiteMyselfCheckList", this, WhiteMyselfCheckDbm.getInstance(), mp, false, "whiteMyself");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteMyself"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteMyselfCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteMyselfBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteMyself> getEntityType() { return WhiteMyself.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteMyself newEntity() { return new WhiteMyself(); }
    public WhiteMyself newMyEntity() { return new WhiteMyself(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteMyself)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteMyself)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
