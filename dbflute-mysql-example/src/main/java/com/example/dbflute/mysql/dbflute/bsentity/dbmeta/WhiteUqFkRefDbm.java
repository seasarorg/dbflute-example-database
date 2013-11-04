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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqFkRefId(), "uqFkRefId");
        setupEpg(_epgMap, new EpgFkToPkId(), "fkToPkId");
        setupEpg(_epgMap, new EpgFkToUqCode(), "fkToUqCode");
        setupEpg(_epgMap, new EpgCompoundUqFirstCode(), "compoundUqFirstCode");
        setupEpg(_epgMap, new EpgCompoundUqSecondCode(), "compoundUqSecondCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqFkRefId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFkRef)e).getUqFkRefId(); }
        public void write(Entity e, Object v) { ((WhiteUqFkRef)e).setUqFkRefId(ctl(v)); }
    }
    public static class EpgFkToPkId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFkRef)e).getFkToPkId(); }
        public void write(Entity e, Object v) { ((WhiteUqFkRef)e).setFkToPkId(ctl(v)); }
    }
    public static class EpgFkToUqCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFkRef)e).getFkToUqCode(); }
        public void write(Entity e, Object v) { ((WhiteUqFkRef)e).setFkToUqCode((String)v); }
    }
    public static class EpgCompoundUqFirstCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFkRef)e).getCompoundUqFirstCode(); }
        public void write(Entity e, Object v) { ((WhiteUqFkRef)e).setCompoundUqFirstCode((String)v); }
    }
    public static class EpgCompoundUqSecondCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqFkRef)e).getCompoundUqSecondCode(); }
        public void write(Entity e, Object v) { ((WhiteUqFkRef)e).setCompoundUqSecondCode((String)v); }
    }

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
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, true, "uqFkRefId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFkToPkId = cci("FK_TO_PK_ID", "FK_TO_PK_ID", null, null, true, "fkToPkId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, "whiteUqFkByFkToPkId", null, null);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, true, "fkToUqCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqFkByFkToUqCode", null, null);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, true, "compoundUqFirstCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefNestList", null);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, true, "compoundUqSecondCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefNestList", null);

    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    public ColumnInfo columnFkToPkId() { return _columnFkToPkId; }
    public ColumnInfo columnFkToUqCode() { return _columnFkToUqCode; }
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteUqFkByFkToPkId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnFkToPkId(), WhiteUqFkDbm.getInstance().columnUqFkId());
        return cfi("FK_WHITE_UQ_FK_REF_PK", "whiteUqFkByFkToPkId", this, WhiteUqFkDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteUqFkRefByFkToPkIdList");
    }
    public ForeignInfo foreignWhiteUqFkByFkToUqCode() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_REF_UQ", "whiteUqFkByFkToUqCode", this, WhiteUqFkDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "whiteUqFkRefByFkToUqCodeList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteUqFkRefNestList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnCompoundUqFirstCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqFirstCode());
        map.put(columnCompoundUqSecondCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqSecondCode());
        return cri("FK_WHITE_UQ_FK_REF_NEST_UQ", "whiteUqFkRefNestList", this, WhiteUqFkRefNestDbm.getInstance(), map, false, "whiteUqFkRef");
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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteUqFkRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteUqFkRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
