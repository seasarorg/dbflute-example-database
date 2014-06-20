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
 * The DB meta of white_table_except_gen_head. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteTableExceptGenHeadDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTableExceptGenHeadDbm _instance = new WhiteTableExceptGenHeadDbm();
    private WhiteTableExceptGenHeadDbm() {}
    public static WhiteTableExceptGenHeadDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgGenHeadId(), "genHeadId");
        setupEpg(_epgMap, new EpgGenHeadName(), "genHeadName");
        setupEpg(_epgMap, new EpgNometaId(), "nometaId");
    }
    public static class EpgGenHeadId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTableExceptGenHead)et).getGenHeadId(); }
        public void write(Entity et, Object vl) { ((WhiteTableExceptGenHead)et).setGenHeadId(ctl(vl)); }
    }
    public static class EpgGenHeadName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTableExceptGenHead)et).getGenHeadName(); }
        public void write(Entity et, Object vl) { ((WhiteTableExceptGenHead)et).setGenHeadName((String)vl); }
    }
    public static class EpgNometaId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTableExceptGenHead)et).getNometaId(); }
        public void write(Entity et, Object vl) { ((WhiteTableExceptGenHead)et).setNometaId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_table_except_gen_head";
    protected final String _tablePropertyName = "whiteTableExceptGenHead";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_TABLE_EXCEPT_GEN_HEAD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGenHeadId = cci("GEN_HEAD_ID", "GEN_HEAD_ID", null, null, Long.class, "genHeadId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGenHeadName = cci("GEN_HEAD_NAME", "GEN_HEAD_NAME", null, null, String.class, "genHeadName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNometaId = cci("NOMETA_ID", "NOMETA_ID", null, null, Long.class, "nometaId", null, false, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);

    /**
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenHeadId() { return _columnGenHeadId; }
    /**
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenHeadName() { return _columnGenHeadName; }
    /**
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNometaId() { return _columnNometaId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGenHeadId());
        ls.add(columnGenHeadName());
        ls.add(columnNometaId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGenHeadId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteTableExceptGenHead"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteTableExceptGenHeadCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteTableExceptGenHeadBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTableExceptGenHead> getEntityType() { return WhiteTableExceptGenHead.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteTableExceptGenHead newEntity() { return new WhiteTableExceptGenHead(); }
    public WhiteTableExceptGenHead newMyEntity() { return new WhiteTableExceptGenHead(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteTableExceptGenHead)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteTableExceptGenHead)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
