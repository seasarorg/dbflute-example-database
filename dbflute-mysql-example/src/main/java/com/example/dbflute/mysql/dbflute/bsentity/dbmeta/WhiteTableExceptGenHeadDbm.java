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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgGenHeadId(), "genHeadId");
        setupEpg(_epgMap, new EpgGenHeadName(), "genHeadName");
        setupEpg(_epgMap, new EpgNometaId(), "nometaId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgGenHeadId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTableExceptGenHead)e).getGenHeadId(); }
        public void write(Entity e, Object v) { ((WhiteTableExceptGenHead)e).setGenHeadId(ctl(v)); }
    }
    public static class EpgGenHeadName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTableExceptGenHead)e).getGenHeadName(); }
        public void write(Entity e, Object v) { ((WhiteTableExceptGenHead)e).setGenHeadName((String)v); }
    }
    public static class EpgNometaId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTableExceptGenHead)e).getNometaId(); }
        public void write(Entity e, Object v) { ((WhiteTableExceptGenHead)e).setNometaId(ctl(v)); }
    }

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
    protected final ColumnInfo _columnGenHeadId = cci("GEN_HEAD_ID", "GEN_HEAD_ID", null, null, true, "genHeadId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGenHeadName = cci("GEN_HEAD_NAME", "GEN_HEAD_NAME", null, null, true, "genHeadName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNometaId = cci("NOMETA_ID", "NOMETA_ID", null, null, false, "nometaId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnGenHeadId() { return _columnGenHeadId; }
    public ColumnInfo columnGenHeadName() { return _columnGenHeadName; }
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
    public Entity newEntity() { return newMyEntity(); }
    public WhiteTableExceptGenHead newMyEntity() { return new WhiteTableExceptGenHead(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteTableExceptGenHead)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteTableExceptGenHead)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
