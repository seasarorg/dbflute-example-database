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
 * The DB meta of white_delimiter. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDelimiterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDelimiterDbm _instance = new WhiteDelimiterDbm();
    private WhiteDelimiterDbm() {}
    public static WhiteDelimiterDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgDelimiterId(), "delimiterId");
        setupEpg(_epgMap, new EpgNumberNullable(), "numberNullable");
        setupEpg(_epgMap, new EpgStringConverted(), "stringConverted");
        setupEpg(_epgMap, new EpgStringNonConverted(), "stringNonConverted");
        setupEpg(_epgMap, new EpgDateDefault(), "dateDefault");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgDelimiterId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDelimiter)e).getDelimiterId(); }
        public void write(Entity e, Object v) { ((WhiteDelimiter)e).setDelimiterId(ctl(v)); }
    }
    public static class EpgNumberNullable implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDelimiter)e).getNumberNullable(); }
        public void write(Entity e, Object v) { ((WhiteDelimiter)e).setNumberNullable(cti(v)); }
    }
    public static class EpgStringConverted implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDelimiter)e).getStringConverted(); }
        public void write(Entity e, Object v) { ((WhiteDelimiter)e).setStringConverted((String)v); }
    }
    public static class EpgStringNonConverted implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDelimiter)e).getStringNonConverted(); }
        public void write(Entity e, Object v) { ((WhiteDelimiter)e).setStringNonConverted((String)v); }
    }
    public static class EpgDateDefault implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDelimiter)e).getDateDefault(); }
        public void write(Entity e, Object v) { ((WhiteDelimiter)e).setDateDefault((java.util.Date)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_delimiter";
    protected final String _tablePropertyName = "whiteDelimiter";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DELIMITER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDelimiterId = cci("DELIMITER_ID", "DELIMITER_ID", null, null, true, "delimiterId", Long.class, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumberNullable = cci("NUMBER_NULLABLE", "NUMBER_NULLABLE", null, null, false, "numberNullable", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringConverted = cci("STRING_CONVERTED", "STRING_CONVERTED", null, null, false, "stringConverted", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStringNonConverted = cci("STRING_NON_CONVERTED", "STRING_NON_CONVERTED", null, null, false, "stringNonConverted", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateDefault = cci("DATE_DEFAULT", "DATE_DEFAULT", null, null, true, "dateDefault", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnDelimiterId() { return _columnDelimiterId; }
    public ColumnInfo columnNumberNullable() { return _columnNumberNullable; }
    public ColumnInfo columnStringConverted() { return _columnStringConverted; }
    public ColumnInfo columnStringNonConverted() { return _columnStringNonConverted; }
    public ColumnInfo columnDateDefault() { return _columnDateDefault; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDelimiterId());
        ls.add(columnNumberNullable());
        ls.add(columnStringConverted());
        ls.add(columnStringNonConverted());
        ls.add(columnDateDefault());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDelimiterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteDelimiter"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteDelimiterCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteDelimiterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDelimiter> getEntityType() { return WhiteDelimiter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteDelimiter newMyEntity() { return new WhiteDelimiter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteDelimiter)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteDelimiter)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
