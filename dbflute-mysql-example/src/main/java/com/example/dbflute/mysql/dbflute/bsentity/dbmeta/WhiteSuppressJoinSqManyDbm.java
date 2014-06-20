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
 * The DB meta of white_suppress_join_sq_many. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqManyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqManyDbm _instance = new WhiteSuppressJoinSqManyDbm();
    private WhiteSuppressJoinSqManyDbm() {}
    public static WhiteSuppressJoinSqManyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgManyId(), "manyId");
        setupEpg(_epgMap, new EpgManyName(), "manyName");
        setupEpg(_epgMap, new EpgSuppressJoinSqId(), "suppressJoinSqId");
        setupEpg(_epgMap, new EpgManyOneId(), "manyOneId");
    }
    public static class EpgManyId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqMany)et).getManyId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqMany)et).setManyId(cti(vl)); }
    }
    public static class EpgManyName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqMany)et).getManyName(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqMany)et).setManyName((String)vl); }
    }
    public static class EpgSuppressJoinSqId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqMany)et).getSuppressJoinSqId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqMany)et).setSuppressJoinSqId(cti(vl)); }
    }
    public static class EpgManyOneId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqMany)et).getManyOneId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqMany)et).setManyOneId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSuppressJoinSqManyOne(), "whiteSuppressJoinSqManyOne");
        setupEfpg(_efpgMap, new EfpgWhiteSuppressJoinSq(), "whiteSuppressJoinSq");
    }
    public class EfpgWhiteSuppressJoinSqManyOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqMany)et).getWhiteSuppressJoinSqManyOne(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqMany)et).setWhiteSuppressJoinSqManyOne((WhiteSuppressJoinSqManyOne)vl); }
    }
    public class EfpgWhiteSuppressJoinSq implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqMany)et).getWhiteSuppressJoinSq(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqMany)et).setWhiteSuppressJoinSq((WhiteSuppressJoinSq)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_many";
    protected final String _tablePropertyName = "whiteSuppressJoinSqMany";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_MANY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnManyId = cci("MANY_ID", "MANY_ID", null, null, Integer.class, "manyId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnManyName = cci("MANY_NAME", "MANY_NAME", null, null, String.class, "manyName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSuppressJoinSqId = cci("SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", null, null, Integer.class, "suppressJoinSqId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSq", null, null);
    protected final ColumnInfo _columnManyOneId = cci("MANY_ONE_ID", "MANY_ONE_ID", null, null, Integer.class, "manyOneId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSqManyOne", null, null);

    /**
     * MANY_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyId() { return _columnManyId; }
    /**
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyName() { return _columnManyName; }
    /**
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqId() { return _columnSuppressJoinSqId; }
    /**
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneId() { return _columnManyOneId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnManyId());
        ls.add(columnManyName());
        ls.add(columnSuppressJoinSqId());
        ls.add(columnManyOneId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnManyId()); }
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
     * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqManyOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnManyOneId(), WhiteSuppressJoinSqManyOneDbm.getInstance().columnManyOneId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE", "whiteSuppressJoinSqManyOne", this, WhiteSuppressJoinSqManyOneDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteSuppressJoinSqManyList");
    }
    /**
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSq() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqDbm.getInstance().columnSuppressJoinSqId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_MANY", "whiteSuppressJoinSq", this, WhiteSuppressJoinSqDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "whiteSuppressJoinSqManyList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqMany"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqManyCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqMany> getEntityType() { return WhiteSuppressJoinSqMany.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqMany newEntity() { return new WhiteSuppressJoinSqMany(); }
    public WhiteSuppressJoinSqMany newMyEntity() { return new WhiteSuppressJoinSqMany(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqMany)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqMany)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
