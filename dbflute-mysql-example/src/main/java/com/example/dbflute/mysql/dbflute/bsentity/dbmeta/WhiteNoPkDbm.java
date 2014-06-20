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
 * The DB meta of white_no_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteNoPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteNoPkDbm _instance = new WhiteNoPkDbm();
    private WhiteNoPkDbm() {}
    public static WhiteNoPkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgNoPkId(), "noPkId");
        setupEpg(_epgMap, new EpgNoPkName(), "noPkName");
        setupEpg(_epgMap, new EpgNoPkInteger(), "noPkInteger");
    }
    public static class EpgNoPkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteNoPk)et).getNoPkId(); }
        public void write(Entity et, Object vl) { ((WhiteNoPk)et).setNoPkId(ctl(vl)); }
    }
    public static class EpgNoPkName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteNoPk)et).getNoPkName(); }
        public void write(Entity et, Object vl) { ((WhiteNoPk)et).setNoPkName((String)vl); }
    }
    public static class EpgNoPkInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteNoPk)et).getNoPkInteger(); }
        public void write(Entity et, Object vl) { ((WhiteNoPk)et).setNoPkInteger(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_no_pk";
    protected final String _tablePropertyName = "whiteNoPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_NO_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNoPkId = cci("NO_PK_ID", "NO_PK_ID", null, null, Long.class, "noPkId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNoPkName = cci("NO_PK_NAME", "NO_PK_NAME", null, null, String.class, "noPkName", null, false, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNoPkInteger = cci("NO_PK_INTEGER", "NO_PK_INTEGER", null, null, Integer.class, "noPkInteger", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null);

    /**
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoPkId() { return _columnNoPkId; }
    /**
     * NO_PK_NAME: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoPkName() { return _columnNoPkName; }
    /**
     * NO_PK_INTEGER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoPkInteger() { return _columnNoPkInteger; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNoPkId());
        ls.add(columnNoPkName());
        ls.add(columnNoPkInteger());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteNoPk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteNoPkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteNoPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteNoPk> getEntityType() { return WhiteNoPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteNoPk newEntity() { return new WhiteNoPk(); }
    public WhiteNoPk newMyEntity() { return new WhiteNoPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteNoPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteNoPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
