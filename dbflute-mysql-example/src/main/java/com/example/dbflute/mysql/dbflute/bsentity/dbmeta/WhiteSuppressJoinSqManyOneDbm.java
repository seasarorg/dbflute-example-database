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
 * The DB meta of white_suppress_join_sq_many_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqManyOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqManyOneDbm _instance = new WhiteSuppressJoinSqManyOneDbm();
    private WhiteSuppressJoinSqManyOneDbm() {}
    public static WhiteSuppressJoinSqManyOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgManyOneId(), "manyOneId");
        setupEpg(_epgMap, new EpgManyOneName(), "manyOneName");
        setupEpg(_epgMap, new EpgManyOneOneId(), "manyOneOneId");
    }
    public static class EpgManyOneId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqManyOne)et).getManyOneId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqManyOne)et).setManyOneId(cti(vl)); }
    }
    public static class EpgManyOneName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqManyOne)et).getManyOneName(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqManyOne)et).setManyOneName((String)vl); }
    }
    public static class EpgManyOneOneId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqManyOne)et).getManyOneOneId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqManyOne)et).setManyOneOneId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSuppressJoinSqManyOneOne(), "whiteSuppressJoinSqManyOneOne");
    }
    public class EfpgWhiteSuppressJoinSqManyOneOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqManyOne)et).getWhiteSuppressJoinSqManyOneOne(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqManyOne)et).setWhiteSuppressJoinSqManyOneOne((WhiteSuppressJoinSqManyOneOne)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_many_one";
    protected final String _tablePropertyName = "whiteSuppressJoinSqManyOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_MANY_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnManyOneId = cci("MANY_ONE_ID", "MANY_ONE_ID", null, null, Integer.class, "manyOneId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteSuppressJoinSqManyList", null);
    protected final ColumnInfo _columnManyOneName = cci("MANY_ONE_NAME", "MANY_ONE_NAME", null, null, String.class, "manyOneName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnManyOneOneId = cci("MANY_ONE_ONE_ID", "MANY_ONE_ONE_ID", null, null, Integer.class, "manyOneOneId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSqManyOneOne", null, null);

    /**
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneId() { return _columnManyOneId; }
    /**
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneName() { return _columnManyOneName; }
    /**
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneOneId() { return _columnManyOneOneId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnManyOneId());
        ls.add(columnManyOneName());
        ls.add(columnManyOneOneId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnManyOneId()); }
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
     * white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqManyOneOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnManyOneOneId(), WhiteSuppressJoinSqManyOneOneDbm.getInstance().columnManyOneOneId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE", "whiteSuppressJoinSqManyOneOne", this, WhiteSuppressJoinSqManyOneOneDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteSuppressJoinSqManyOneList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSuppressJoinSqManyList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnManyOneId(), WhiteSuppressJoinSqManyDbm.getInstance().columnManyOneId());
        return cri("FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE", "whiteSuppressJoinSqManyList", this, WhiteSuppressJoinSqManyDbm.getInstance(), mp, false, "whiteSuppressJoinSqManyOne");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqManyOne"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqManyOne> getEntityType() { return WhiteSuppressJoinSqManyOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqManyOne newEntity() { return new WhiteSuppressJoinSqManyOne(); }
    public WhiteSuppressJoinSqManyOne newMyEntity() { return new WhiteSuppressJoinSqManyOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqManyOne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqManyOne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
