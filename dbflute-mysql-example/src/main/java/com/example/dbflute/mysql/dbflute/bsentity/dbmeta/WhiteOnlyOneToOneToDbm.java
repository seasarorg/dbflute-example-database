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
 * The DB meta of white_only_one_to_one_to. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOnlyOneToOneToDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteOnlyOneToOneToDbm _instance = new WhiteOnlyOneToOneToDbm();
    private WhiteOnlyOneToOneToDbm() {}
    public static WhiteOnlyOneToOneToDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgToId(), "toId");
        setupEpg(_epgMap, new EpgToName(), "toName");
        setupEpg(_epgMap, new EpgFromId(), "fromId");
    }
    public static class EpgToId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneTo)et).getToId(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneTo)et).setToId(ctl(vl)); }
    }
    public static class EpgToName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneTo)et).getToName(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneTo)et).setToName((String)vl); }
    }
    public static class EpgFromId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneTo)et).getFromId(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneTo)et).setFromId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteOnlyOneToOneFrom(), "whiteOnlyOneToOneFrom");
    }
    public class EfpgWhiteOnlyOneToOneFrom implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneTo)et).getWhiteOnlyOneToOneFrom(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneTo)et).setWhiteOnlyOneToOneFrom((WhiteOnlyOneToOneFrom)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_only_one_to_one_to";
    protected final String _tablePropertyName = "whiteOnlyOneToOneTo";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ONLY_ONE_TO_ONE_TO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnToId = cci("TO_ID", "TO_ID", null, null, Long.class, "toId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnToName = cci("TO_NAME", "TO_NAME", null, null, String.class, "toName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFromId = cci("FROM_ID", "FROM_ID", null, null, Long.class, "fromId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteOnlyOneToOneFrom", null, null);

    /**
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToId() { return _columnToId; }
    /**
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToName() { return _columnToName; }
    /**
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromId() { return _columnFromId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnToId());
        ls.add(columnToName());
        ls.add(columnFromId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnToId()); }
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
     * white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteOnlyOneToOneFrom() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFromId(), WhiteOnlyOneToOneFromDbm.getInstance().columnFromId());
        return cfi("FK_WHITE_ONLY_ONE_TO_ONE_TO_FROM", "whiteOnlyOneToOneFrom", this, WhiteOnlyOneToOneFromDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "whiteOnlyOneToOneToAsOne");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteOnlyOneToOneTo"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteOnlyOneToOneToCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteOnlyOneToOneToBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteOnlyOneToOneTo> getEntityType() { return WhiteOnlyOneToOneTo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteOnlyOneToOneTo newEntity() { return new WhiteOnlyOneToOneTo(); }
    public WhiteOnlyOneToOneTo newMyEntity() { return new WhiteOnlyOneToOneTo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteOnlyOneToOneTo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteOnlyOneToOneTo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
