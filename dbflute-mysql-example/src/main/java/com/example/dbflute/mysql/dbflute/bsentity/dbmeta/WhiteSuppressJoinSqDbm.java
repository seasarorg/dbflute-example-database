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
 * The DB meta of white_suppress_join_sq. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqDbm _instance = new WhiteSuppressJoinSqDbm();
    private WhiteSuppressJoinSqDbm() {}
    public static WhiteSuppressJoinSqDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSuppressJoinSqId(), "suppressJoinSqId");
        setupEpg(_epgMap, new EpgSuppressJoinSqName(), "suppressJoinSqName");
    }
    public static class EpgSuppressJoinSqId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSq)et).getSuppressJoinSqId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSq)et).setSuppressJoinSqId(cti(vl)); }
    }
    public static class EpgSuppressJoinSqName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSq)et).getSuppressJoinSqName(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSq)et).setSuppressJoinSqName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSuppressJoinSqOneAsOne(), "whiteSuppressJoinSqOneAsOne");
    }
    public class EfpgWhiteSuppressJoinSqOneAsOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSq)et).getWhiteSuppressJoinSqOneAsOne(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSq)et).setWhiteSuppressJoinSqOneAsOne((WhiteSuppressJoinSqOne)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq";
    protected final String _tablePropertyName = "whiteSuppressJoinSq";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSuppressJoinSqId = cci("SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", null, null, Integer.class, "suppressJoinSqId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteSuppressJoinSqManyList", null);
    protected final ColumnInfo _columnSuppressJoinSqName = cci("SUPPRESS_JOIN_SQ_NAME", "SUPPRESS_JOIN_SQ_NAME", null, null, String.class, "suppressJoinSqName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqId() { return _columnSuppressJoinSqId; }
    /**
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqName() { return _columnSuppressJoinSqName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSuppressJoinSqId());
        ls.add(columnSuppressJoinSqName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSuppressJoinSqId()); }
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
     * white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqOneAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqOneDbm.getInstance().columnSuppressJoinSqId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_ONE", "whiteSuppressJoinSqOneAsOne", this, WhiteSuppressJoinSqOneDbm.getInstance(), mp, 0, null, true, false, true, false, null, null, false, "whiteSuppressJoinSq");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSuppressJoinSqManyList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqManyDbm.getInstance().columnSuppressJoinSqId());
        return cri("FK_WHITE_SUPPRESS_JOIN_SQ_MANY", "whiteSuppressJoinSqManyList", this, WhiteSuppressJoinSqManyDbm.getInstance(), mp, false, "whiteSuppressJoinSq");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSq"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSq> getEntityType() { return WhiteSuppressJoinSq.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSq newEntity() { return new WhiteSuppressJoinSq(); }
    public WhiteSuppressJoinSq newMyEntity() { return new WhiteSuppressJoinSq(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSq)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSq)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
