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
 * The DB meta of white_xls_man. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteXlsManDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteXlsManDbm _instance = new WhiteXlsManDbm();
    private WhiteXlsManDbm() {}
    public static WhiteXlsManDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgXlsManId(), "xlsManId");
        setupEpg(_epgMap, new EpgStringConverted(), "stringConverted");
        setupEpg(_epgMap, new EpgTimestampConverted(), "timestampConverted");
    }
    public static class EpgXlsManId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteXlsMan)et).getXlsManId(); }
        public void write(Entity et, Object vl) { ((WhiteXlsMan)et).setXlsManId(ctl(vl)); }
    }
    public static class EpgStringConverted implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteXlsMan)et).getStringConverted(); }
        public void write(Entity et, Object vl) { ((WhiteXlsMan)et).setStringConverted((String)vl); }
    }
    public static class EpgTimestampConverted implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteXlsMan)et).getTimestampConverted(); }
        public void write(Entity et, Object vl) { ((WhiteXlsMan)et).setTimestampConverted((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_xls_man";
    protected final String _tablePropertyName = "whiteXlsMan";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_XLS_MAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnXlsManId = cci("XLS_MAN_ID", "XLS_MAN_ID", null, null, Long.class, "xlsManId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringConverted = cci("STRING_CONVERTED", "STRING_CONVERTED", null, null, String.class, "stringConverted", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampConverted = cci("TIMESTAMP_CONVERTED", "TIMESTAMP_CONVERTED", null, null, java.sql.Timestamp.class, "timestampConverted", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    /**
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnXlsManId() { return _columnXlsManId; }
    /**
     * STRING_CONVERTED: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringConverted() { return _columnStringConverted; }
    /**
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampConverted() { return _columnTimestampConverted; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnXlsManId());
        ls.add(columnStringConverted());
        ls.add(columnTimestampConverted());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnXlsManId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteXlsMan"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteXlsManCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteXlsManBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteXlsMan> getEntityType() { return WhiteXlsMan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteXlsMan newMyEntity() { return new WhiteXlsMan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteXlsMan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteXlsMan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
