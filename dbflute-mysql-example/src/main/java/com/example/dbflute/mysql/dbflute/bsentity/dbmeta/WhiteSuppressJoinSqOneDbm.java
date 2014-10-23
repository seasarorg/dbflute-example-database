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
 * The DB meta of white_suppress_join_sq_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqOneDbm _instance = new WhiteSuppressJoinSqOneDbm();
    private WhiteSuppressJoinSqOneDbm() {}
    public static WhiteSuppressJoinSqOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgOneId(), "oneId");
        setupEpg(_epgMap, new EpgOneName(), "oneName");
        setupEpg(_epgMap, new EpgSuppressJoinSqId(), "suppressJoinSqId");
        setupEpg(_epgMap, new EpgOneAddiId(), "oneAddiId");
    }
    public static class EpgOneId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOne)et).getOneId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOne)et).setOneId(cti(vl)); }
    }
    public static class EpgOneName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOne)et).getOneName(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOne)et).setOneName((String)vl); }
    }
    public static class EpgSuppressJoinSqId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOne)et).getSuppressJoinSqId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOne)et).setSuppressJoinSqId(cti(vl)); }
    }
    public static class EpgOneAddiId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOne)et).getOneAddiId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOne)et).setOneAddiId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSuppressJoinSq(), "whiteSuppressJoinSq");
        setupEfpg(_efpgMap, new EfpgWhiteSuppressJoinSqOneAddi(), "whiteSuppressJoinSqOneAddi");
    }
    public class EfpgWhiteSuppressJoinSq implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOne)et).getWhiteSuppressJoinSq(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOne)et).setWhiteSuppressJoinSq((WhiteSuppressJoinSq)vl); }
    }
    public class EfpgWhiteSuppressJoinSqOneAddi implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOne)et).getWhiteSuppressJoinSqOneAddi(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOne)et).setWhiteSuppressJoinSqOneAddi((WhiteSuppressJoinSqOneAddi)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_one";
    protected final String _tablePropertyName = "whiteSuppressJoinSqOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOneId = cci("ONE_ID", "ONE_ID", null, null, Integer.class, "oneId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOneName = cci("ONE_NAME", "ONE_NAME", null, null, String.class, "oneName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSuppressJoinSqId = cci("SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", null, null, Integer.class, "suppressJoinSqId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSq", null, null);
    protected final ColumnInfo _columnOneAddiId = cci("ONE_ADDI_ID", "ONE_ADDI_ID", null, null, Integer.class, "oneAddiId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSqOneAddi", null, null);

    /**
     * ONE_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneId() { return _columnOneId; }
    /**
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneName() { return _columnOneName; }
    /**
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqId() { return _columnSuppressJoinSqId; }
    /**
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneAddiId() { return _columnOneAddiId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnOneId());
        ls.add(columnOneName());
        ls.add(columnSuppressJoinSqId());
        ls.add(columnOneAddiId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnOneId()); }
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
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSq() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqDbm.getInstance().columnSuppressJoinSqId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_ONE", "whiteSuppressJoinSq", this, WhiteSuppressJoinSqDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "whiteSuppressJoinSqOneAsOne");
    }
    /**
     * white_suppress_join_sq_one_addi by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqOneAddi() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOneAddiId(), WhiteSuppressJoinSqOneAddiDbm.getInstance().columnOneAddiId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI_TEST", "whiteSuppressJoinSqOneAddi", this, WhiteSuppressJoinSqOneAddiDbm.getInstance(), mp, 1, null, false, false, false, true, null, null, false, "whiteSuppressJoinSqOneList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqOne"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqOneCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqOne> getEntityType() { return WhiteSuppressJoinSqOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqOne newEntity() { return new WhiteSuppressJoinSqOne(); }
    public WhiteSuppressJoinSqOne newMyEntity() { return new WhiteSuppressJoinSqOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqOne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqOne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
