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
 * The DB meta of white_compound_pk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefDbm _instance = new WhiteCompoundPkRefDbm();
    private WhiteCompoundPkRefDbm() {}
    public static WhiteCompoundPkRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRefFirstId(), "refFirstId");
        setupEpg(_epgMap, new EpgRefSecondId(), "refSecondId");
        setupEpg(_epgMap, new EpgRefName(), "refName");
    }
    public static class EpgMultipleFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getMultipleFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setMultipleFirstId(cti(vl)); }
    }
    public static class EpgMultipleSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getMultipleSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setMultipleSecondId(cti(vl)); }
    }
    public static class EpgRefFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getRefFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setRefFirstId(cti(vl)); }
    }
    public static class EpgRefSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getRefSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setRefSecondId(cti(vl)); }
    }
    public static class EpgRefName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getRefName(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setRefName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteCompoundPk(), "whiteCompoundPk");
    }
    public class EfpgWhiteCompoundPk implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkRef)et).getWhiteCompoundPk(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkRef)et).setWhiteCompoundPk((WhiteCompoundPk)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_ref";
    protected final String _tablePropertyName = "whiteCompoundPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMultipleFirstId = cci("MULTIPLE_FIRST_ID", "MULTIPLE_FIRST_ID", null, null, Integer.class, "multipleFirstId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteCompoundPkRefNestByQuxMultipleIdList,whiteCompoundPkRefNestByFooMultipleIdList", null);
    protected final ColumnInfo _columnMultipleSecondId = cci("MULTIPLE_SECOND_ID", "MULTIPLE_SECOND_ID", null, null, Integer.class, "multipleSecondId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteCompoundPkRefNestByQuxMultipleIdList,whiteCompoundPkRefNestByFooMultipleIdList", null);
    protected final ColumnInfo _columnRefFirstId = cci("REF_FIRST_ID", "REF_FIRST_ID", null, null, Integer.class, "refFirstId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPk", null, null);
    protected final ColumnInfo _columnRefSecondId = cci("REF_SECOND_ID", "REF_SECOND_ID", null, null, Integer.class, "refSecondId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPk", null, null);
    protected final ColumnInfo _columnRefName = cci("REF_NAME", "REF_NAME", null, null, String.class, "refName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

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
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefFirstId() { return _columnRefFirstId; }
    /**
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefSecondId() { return _columnRefSecondId; }
    /**
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefName() { return _columnRefName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        ls.add(columnRefFirstId());
        ls.add(columnRefSecondId());
        ls.add(columnRefName());
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
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnRefFirstId(), WhiteCompoundPkDbm.getInstance().columnPkFirstId());
        mp.put(columnRefSecondId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF", "whiteCompoundPk", this, WhiteCompoundPkDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteCompoundPkRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefNestByQuxMultipleIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnMultipleFirstId(), WhiteCompoundPkRefNestDbm.getInstance().columnBarMultipleId());
        mp.put(columnMultipleSecondId(), WhiteCompoundPkRefNestDbm.getInstance().columnQuxMultipleId());
        return cri("FK_WHITE_COMPOUND_PK_REF_NEST_BAR_QUX", "whiteCompoundPkRefNestByQuxMultipleIdList", this, WhiteCompoundPkRefNestDbm.getInstance(), mp, false, "whiteCompoundPkRefByQuxMultipleId");
    }
    /**
     * white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefNestByFooMultipleIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnMultipleFirstId(), WhiteCompoundPkRefNestDbm.getInstance().columnFooMultipleId());
        mp.put(columnMultipleSecondId(), WhiteCompoundPkRefNestDbm.getInstance().columnBarMultipleId());
        return cri("FK_WHITE_COMPOUND_PK_REF_NEST_FOO_BAR", "whiteCompoundPkRefNestByFooMultipleIdList", this, WhiteCompoundPkRefNestDbm.getInstance(), mp, false, "whiteCompoundPkRefByFooMultipleId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRef> getEntityType() { return WhiteCompoundPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteCompoundPkRef newMyEntity() { return new WhiteCompoundPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
