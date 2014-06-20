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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteCompoundPkToPK(), "whiteCompoundPkToPK");
    }
    public class EfpgWhiteCompoundPkToPK implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRefMany)et).getWhiteCompoundPkToPK(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRefMany)et).setWhiteCompoundPkToPK((WhiteCompoundPk)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnMultipleFirstId = cci("MULTIPLE_FIRST_ID", "MULTIPLE_FIRST_ID", null, null, Integer.class, "multipleFirstId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMultipleSecondId = cci("MULTIPLE_SECOND_ID", "MULTIPLE_SECOND_ID", null, null, Integer.class, "multipleSecondId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefManyFirstId = cci("REF_MANY_FIRST_ID", "REF_MANY_FIRST_ID", null, null, Integer.class, "refManyFirstId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPkToPK", null, null);
    protected final ColumnInfo _columnRefManySecondId = cci("REF_MANY_SECOND_ID", "REF_MANY_SECOND_ID", null, null, Integer.class, "refManySecondId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPkToPK", null, null);
    protected final ColumnInfo _columnRefManyCode = cci("REF_MANY_CODE", "REF_MANY_CODE", null, null, String.class, "refManyCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefManyName = cci("REF_MANY_NAME", "REF_MANY_NAME", null, null, String.class, "refManyName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRefManyDatetime = cci("REF_MANY_DATETIME", "REF_MANY_DATETIME", null, null, java.sql.Timestamp.class, "refManyDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    /**
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultipleFirstId() { return _columnMultipleFirstId; }
    /**
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultipleSecondId() { return _columnMultipleSecondId; }
    /**
     * REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefManyFirstId() { return _columnRefManyFirstId; }
    /**
     * REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefManySecondId() { return _columnRefManySecondId; }
    /**
     * REF_MANY_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefManyCode() { return _columnRefManyCode; }
    /**
     * REF_MANY_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefManyName() { return _columnRefManyName; }
    /**
     * REF_MANY_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPkToPK() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnRefManyFirstId(), WhiteCompoundPkDbm.getInstance().columnPkFirstId());
        mp.put(columnRefManySecondId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_MANY_TO_ONE_TEST", "whiteCompoundPkToPK", this, WhiteCompoundPkDbm.getInstance(), mp, 0, null, false, false, false, true, "$$localAlias$$.REF_MANY_CODE = 'TPK'", null, false, "whiteCompoundPkRefManyToPKList");
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
    public WhiteCompoundPkRefMany newEntity() { return new WhiteCompoundPkRefMany(); }
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
