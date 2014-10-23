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
 * The DB meta of white_table_except_gen_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteTableExceptGenRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTableExceptGenRefDbm _instance = new WhiteTableExceptGenRefDbm();
    private WhiteTableExceptGenRefDbm() {}
    public static WhiteTableExceptGenRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgGenRefId(), "genRefId");
        setupEpg(_epgMap, new EpgGenRefName(), "genRefName");
        setupEpg(_epgMap, new EpgGenOnlyId(), "genOnlyId");
    }
    public static class EpgGenRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTableExceptGenRef)et).getGenRefId(); }
        public void write(Entity et, Object vl) { ((WhiteTableExceptGenRef)et).setGenRefId(ctl(vl)); }
    }
    public static class EpgGenRefName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTableExceptGenRef)et).getGenRefName(); }
        public void write(Entity et, Object vl) { ((WhiteTableExceptGenRef)et).setGenRefName((String)vl); }
    }
    public static class EpgGenOnlyId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTableExceptGenRef)et).getGenOnlyId(); }
        public void write(Entity et, Object vl) { ((WhiteTableExceptGenRef)et).setGenOnlyId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_table_except_gen_ref";
    protected final String _tablePropertyName = "whiteTableExceptGenRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_TABLE_EXCEPT_GEN_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGenRefId = cci("GEN_REF_ID", "GEN_REF_ID", null, null, Long.class, "genRefId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGenRefName = cci("GEN_REF_NAME", "GEN_REF_NAME", null, null, String.class, "genRefName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGenOnlyId = cci("GEN_ONLY_ID", "GEN_ONLY_ID", null, null, Long.class, "genOnlyId", null, false, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);

    /**
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenRefId() { return _columnGenRefId; }
    /**
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenRefName() { return _columnGenRefName; }
    /**
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenOnlyId() { return _columnGenOnlyId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGenRefId());
        ls.add(columnGenRefName());
        ls.add(columnGenOnlyId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGenRefId()); }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteTableExceptGenRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteTableExceptGenRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteTableExceptGenRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTableExceptGenRef> getEntityType() { return WhiteTableExceptGenRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteTableExceptGenRef newEntity() { return new WhiteTableExceptGenRef(); }
    public WhiteTableExceptGenRef newMyEntity() { return new WhiteTableExceptGenRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteTableExceptGenRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteTableExceptGenRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
