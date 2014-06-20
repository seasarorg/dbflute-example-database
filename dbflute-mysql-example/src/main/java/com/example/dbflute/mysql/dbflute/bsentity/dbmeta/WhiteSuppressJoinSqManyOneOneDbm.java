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
 * The DB meta of white_suppress_join_sq_many_one_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqManyOneOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqManyOneOneDbm _instance = new WhiteSuppressJoinSqManyOneOneDbm();
    private WhiteSuppressJoinSqManyOneOneDbm() {}
    public static WhiteSuppressJoinSqManyOneOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgManyOneOneId(), "manyOneOneId");
        setupEpg(_epgMap, new EpgManyOneOneName(), "manyOneOneName");
    }
    public static class EpgManyOneOneId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqManyOneOne)et).getManyOneOneId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqManyOneOne)et).setManyOneOneId(cti(vl)); }
    }
    public static class EpgManyOneOneName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqManyOneOne)et).getManyOneOneName(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqManyOneOne)et).setManyOneOneName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_many_one_one";
    protected final String _tablePropertyName = "whiteSuppressJoinSqManyOneOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnManyOneOneId = cci("MANY_ONE_ONE_ID", "MANY_ONE_ONE_ID", null, null, Integer.class, "manyOneOneId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteSuppressJoinSqManyOneList", null);
    protected final ColumnInfo _columnManyOneOneName = cci("MANY_ONE_ONE_NAME", "MANY_ONE_ONE_NAME", null, null, String.class, "manyOneOneName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneOneId() { return _columnManyOneOneId; }
    /**
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneOneName() { return _columnManyOneOneName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnManyOneOneId());
        ls.add(columnManyOneOneName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnManyOneOneId()); }
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
     * white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSuppressJoinSqManyOneList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnManyOneOneId(), WhiteSuppressJoinSqManyOneDbm.getInstance().columnManyOneOneId());
        return cri("FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE", "whiteSuppressJoinSqManyOneList", this, WhiteSuppressJoinSqManyOneDbm.getInstance(), mp, false, "whiteSuppressJoinSqManyOneOne");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqManyOneOne"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneOneCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyOneOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqManyOneOne> getEntityType() { return WhiteSuppressJoinSqManyOneOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqManyOneOne newEntity() { return new WhiteSuppressJoinSqManyOneOne(); }
    public WhiteSuppressJoinSqManyOneOne newMyEntity() { return new WhiteSuppressJoinSqManyOneOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqManyOneOne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqManyOneOne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
