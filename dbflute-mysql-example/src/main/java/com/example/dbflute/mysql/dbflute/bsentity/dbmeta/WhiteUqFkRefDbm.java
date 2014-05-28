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
 * The DB meta of white_uq_fk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqFkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkRefDbm _instance = new WhiteUqFkRefDbm();
    private WhiteUqFkRefDbm() {}
    public static WhiteUqFkRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgUqFkRefId(), "uqFkRefId");
        setupEpg(_epgMap, new EpgFkToPkId(), "fkToPkId");
        setupEpg(_epgMap, new EpgFkToUqCode(), "fkToUqCode");
        setupEpg(_epgMap, new EpgCompoundUqFirstCode(), "compoundUqFirstCode");
        setupEpg(_epgMap, new EpgCompoundUqSecondCode(), "compoundUqSecondCode");
    }
    public static class EpgUqFkRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getUqFkRefId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setUqFkRefId(ctl(vl)); }
    }
    public static class EpgFkToPkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getFkToPkId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setFkToPkId(ctl(vl)); }
    }
    public static class EpgFkToUqCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getFkToUqCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setFkToUqCode((String)vl); }
    }
    public static class EpgCompoundUqFirstCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getCompoundUqFirstCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setCompoundUqFirstCode((String)vl); }
    }
    public static class EpgCompoundUqSecondCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getCompoundUqSecondCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setCompoundUqSecondCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteUqFkByFkToPkId(), "whiteUqFkByFkToPkId");
        setupEfpg(_efpgMap, new EfpgWhiteUqFkByFkToUqCode(), "whiteUqFkByFkToUqCode");
    }
    public class EfpgWhiteUqFkByFkToPkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getWhiteUqFkByFkToPkId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setWhiteUqFkByFkToPkId((WhiteUqFk)vl); }
    }
    public class EfpgWhiteUqFkByFkToUqCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getWhiteUqFkByFkToUqCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setWhiteUqFkByFkToUqCode((WhiteUqFk)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_fk_ref";
    protected final String _tablePropertyName = "whiteUqFkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, Long.class, "uqFkRefId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFkToPkId = cci("FK_TO_PK_ID", "FK_TO_PK_ID", null, null, Long.class, "fkToPkId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, "whiteUqFkByFkToPkId", null, null);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, String.class, "fkToUqCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "whiteUqFkByFkToUqCode", null, null);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, String.class, "compoundUqFirstCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefNestList", null);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, String.class, "compoundUqSecondCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefNestList", null);

    /**
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    /**
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFkToPkId() { return _columnFkToPkId; }
    /**
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFkToUqCode() { return _columnFkToUqCode; }
    /**
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
    /**
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundUqSecondCode() { return _columnCompoundUqSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefId());
        ls.add(columnFkToPkId());
        ls.add(columnFkToUqCode());
        ls.add(columnCompoundUqFirstCode());
        ls.add(columnCompoundUqSecondCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqFkRefId()); }
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
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkByFkToPkId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToPkId(), WhiteUqFkDbm.getInstance().columnUqFkId());
        return cfi("FK_WHITE_UQ_FK_REF_PK", "whiteUqFkByFkToPkId", this, WhiteUqFkDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteUqFkRefByFkToPkIdList");
    }
    /**
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkByFkToUqCode() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_REF_UQ", "whiteUqFkByFkToUqCode", this, WhiteUqFkDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "whiteUqFkRefByFkToUqCodeList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteUqFkRefNestList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCompoundUqFirstCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqFirstCode());
        mp.put(columnCompoundUqSecondCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqSecondCode());
        return cri("FK_WHITE_UQ_FK_REF_NEST_UQ", "whiteUqFkRefNestList", this, WhiteUqFkRefNestDbm.getInstance(), mp, false, "whiteUqFkRef");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteUqFkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteUqFkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkRef> getEntityType() { return WhiteUqFkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqFkRef newMyEntity() { return new WhiteUqFkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
