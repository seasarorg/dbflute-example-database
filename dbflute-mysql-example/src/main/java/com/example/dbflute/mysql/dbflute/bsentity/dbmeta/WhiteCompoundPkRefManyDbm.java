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
 * The DB meta of white_compound_pk_ref_many. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefManyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefManyDbm _instance = new WhiteCompoundPkRefManyDbm();
    private WhiteCompoundPkRefManyDbm() {}
    public static WhiteCompoundPkRefManyDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMultipleFirstId(), "multipleFirstId");
        setupEpg(_epgMap, new EpgMultipleSecondId(), "multipleSecondId");
        setupEpg(_epgMap, new EpgRefManyFirstId(), "refManyFirstId");
        setupEpg(_epgMap, new EpgRefManySecondId(), "refManySecondId");
        setupEpg(_epgMap, new EpgRefManyCode(), "refManyCode");
        setupEpg(_epgMap, new EpgRefManyName(), "refManyName");
        setupEpg(_epgMap, new EpgRefManyDatetime(), "refManyDatetime");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMultipleFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getMultipleFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setMultipleFirstId(cti(vl)); }
    }
    public static class EpgMultipleSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getMultipleSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setMultipleSecondId(cti(vl)); }
    }
    public static class EpgRefManyFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getRefManyFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setRefManyFirstId(cti(vl)); }
    }
    public static class EpgRefManySecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getRefManySecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setRefManySecondId(cti(vl)); }
    }
    public static class EpgRefManyCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getRefManyCode(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setRefManyCode((String)vl); }
    }
    public static class EpgRefManyName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getRefManyName(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setRefManyName((String)vl); }
    }
    public static class EpgRefManyDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getRefManyDatetime(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setRefManyDatetime((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_ref_many";
    protected final String _tablePropertyName = "whiteCompoundPkRefMany";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK_REF_MANY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMultipleFirstId = cci("MULTIPLE_FIRST_ID", "MULTIPLE_FIRST_ID", null, null, true, "multipleFirstId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMultipleSecondId = cci("MULTIPLE_SECOND_ID", "MULTIPLE_SECOND_ID", null, null, true, "multipleSecondId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefManyFirstId = cci("REF_MANY_FIRST_ID", "REF_MANY_FIRST_ID", null, null, true, "refManyFirstId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPkToPK", null, null);
    protected final ColumnInfo _columnRefManySecondId = cci("REF_MANY_SECOND_ID", "REF_MANY_SECOND_ID", null, null, true, "refManySecondId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPkToPK", null, null);
    protected final ColumnInfo _columnRefManyCode = cci("REF_MANY_CODE", "REF_MANY_CODE", null, null, true, "refManyCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefManyName = cci("REF_MANY_NAME", "REF_MANY_NAME", null, null, true, "refManyName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefManyDatetime = cci("REF_MANY_DATETIME", "REF_MANY_DATETIME", null, null, true, "refManyDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMultipleFirstId() { return _columnMultipleFirstId; }
    public ColumnInfo columnMultipleSecondId() { return _columnMultipleSecondId; }
    public ColumnInfo columnRefManyFirstId() { return _columnRefManyFirstId; }
    public ColumnInfo columnRefManySecondId() { return _columnRefManySecondId; }
    public ColumnInfo columnRefManyCode() { return _columnRefManyCode; }
    public ColumnInfo columnRefManyName() { return _columnRefManyName; }
    public ColumnInfo columnRefManyDatetime() { return _columnRefManyDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        ls.add(columnRefManyFirstId());
        ls.add(columnRefManySecondId());
        ls.add(columnRefManyCode());
        ls.add(columnRefManyName());
        ls.add(columnRefManyDatetime());
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
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteCompoundPkToPK() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnRefManyFirstId(), WhiteCompoundPkDbm.getInstance().columnPkFirstId());
        mp.put(columnRefManySecondId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_MANY_TO_ONE_TEST", "whiteCompoundPkToPK", this, WhiteCompoundPkDbm.getInstance(), mp, 0, false, false, false, true, "$$localAlias$$.REF_MANY_CODE = 'TPK'", null, false, "whiteCompoundPkRefManyToPKList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkRefMany"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkRefManyCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkRefManyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRefMany> getEntityType() { return WhiteCompoundPkRefMany.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteCompoundPkRefMany newMyEntity() { return new WhiteCompoundPkRefMany(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRefMany)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkRefMany)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
