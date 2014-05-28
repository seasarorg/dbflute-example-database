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
 * The DB meta of white_only_one_to_one_from. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOnlyOneToOneFromDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteOnlyOneToOneFromDbm _instance = new WhiteOnlyOneToOneFromDbm();
    private WhiteOnlyOneToOneFromDbm() {}
    public static WhiteOnlyOneToOneFromDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFromId(), "fromId");
        setupEpg(_epgMap, new EpgFromName(), "fromName");
    }
    public static class EpgFromId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneFrom)et).getFromId(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneFrom)et).setFromId(ctl(vl)); }
    }
    public static class EpgFromName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneFrom)et).getFromName(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneFrom)et).setFromName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteOnlyOneToOneToAsOne(), "whiteOnlyOneToOneToAsOne");
    }
    public class EfpgWhiteOnlyOneToOneToAsOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteOnlyOneToOneFrom)et).getWhiteOnlyOneToOneToAsOne(); }
        public void write(Entity et, Object vl) { ((WhiteOnlyOneToOneFrom)et).setWhiteOnlyOneToOneToAsOne((WhiteOnlyOneToOneTo)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_only_one_to_one_from";
    protected final String _tablePropertyName = "whiteOnlyOneToOneFrom";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ONLY_ONE_TO_ONE_FROM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFromId = cci("FROM_ID", "FROM_ID", null, null, Long.class, "fromId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "", null);
    protected final ColumnInfo _columnFromName = cci("FROM_NAME", "FROM_NAME", null, null, String.class, "fromName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromId() { return _columnFromId; }
    /**
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromName() { return _columnFromName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFromId());
        ls.add(columnFromName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFromId()); }
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
     * white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteOnlyOneToOneToAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFromId(), WhiteOnlyOneToOneToDbm.getInstance().columnFromId());
        return cfi("FK_WHITE_ONLY_ONE_TO_ONE_TO_FROM", "whiteOnlyOneToOneToAsOne", this, WhiteOnlyOneToOneToDbm.getInstance(), mp, 0, null, true, false, true, false, null, null, false, "whiteOnlyOneToOneFrom");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteOnlyOneToOneFrom"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteOnlyOneToOneFromCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteOnlyOneToOneFromBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteOnlyOneToOneFrom> getEntityType() { return WhiteOnlyOneToOneFrom.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteOnlyOneToOneFrom newMyEntity() { return new WhiteOnlyOneToOneFrom(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteOnlyOneToOneFrom)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteOnlyOneToOneFrom)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
