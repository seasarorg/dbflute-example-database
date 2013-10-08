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
 * The DB meta of white_uq_reference_ref_nest. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqReferenceRefNestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqReferenceRefNestDbm _instance = new WhiteUqReferenceRefNestDbm();
    private WhiteUqReferenceRefNestDbm() {}
    public static WhiteUqReferenceRefNestDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqReferenceRefNestId(), "uqReferenceRefNestId");
        setupEpg(_epgMap, new EpgCompoundUqFirstCode(), "compoundUqFirstCode");
        setupEpg(_epgMap, new EpgCompoundUqSecondCode(), "compoundUqSecondCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqReferenceRefNestId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceRefNest)e).getUqReferenceRefNestId(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceRefNest)e).setUqReferenceRefNestId(ctl(v)); }
    }
    public static class EpgCompoundUqFirstCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceRefNest)e).getCompoundUqFirstCode(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceRefNest)e).setCompoundUqFirstCode((String)v); }
    }
    public static class EpgCompoundUqSecondCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceRefNest)e).getCompoundUqSecondCode(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceRefNest)e).setCompoundUqSecondCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_reference_ref_nest";
    protected final String _tablePropertyName = "whiteUqReferenceRefNest";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_REFERENCE_REF_NEST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqReferenceRefNestId = cci("UQ_REFERENCE_REF_NEST_ID", "UQ_REFERENCE_REF_NEST_ID", null, null, true, "uqReferenceRefNestId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, true, "compoundUqFirstCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqReferenceRef", null, null);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, true, "compoundUqSecondCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqReferenceRef", null, null);

    public ColumnInfo columnUqReferenceRefNestId() { return _columnUqReferenceRefNestId; }
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
    public ColumnInfo columnCompoundUqSecondCode() { return _columnCompoundUqSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqReferenceRefNestId());
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
    protected UniqueInfo cpui() { return hpcpui(columnUqReferenceRefNestId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteUqReferenceRef() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnCompoundUqFirstCode(), WhiteUqReferenceRefDbm.getInstance().columnCompoundUqFirstCode());
        map.put(columnCompoundUqSecondCode(), WhiteUqReferenceRefDbm.getInstance().columnCompoundUqSecondCode());
        return cfi("FK_WHITE_UQ_REFERENCE_REF_NEST_UQ", "whiteUqReferenceRef", this, WhiteUqReferenceRefDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteUqReferenceRefNestList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteUqReferenceRefNest"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceRefNestCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceRefNestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqReferenceRefNest> getEntityType() { return WhiteUqReferenceRefNest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqReferenceRefNest newMyEntity() { return new WhiteUqReferenceRefNest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteUqReferenceRefNest)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteUqReferenceRefNest)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
