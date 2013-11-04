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
 * The DB meta of white_uq_reference_without_pk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqReferenceWithoutPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqReferenceWithoutPkRefDbm _instance = new WhiteUqReferenceWithoutPkRefDbm();
    private WhiteUqReferenceWithoutPkRefDbm() {}
    public static WhiteUqReferenceWithoutPkRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqReferenceRefId(), "uqReferenceRefId");
        setupEpg(_epgMap, new EpgUqReferenceCode(), "uqReferenceCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqReferenceRefId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceWithoutPkRef)e).getUqReferenceRefId(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceWithoutPkRef)e).setUqReferenceRefId(ctl(v)); }
    }
    public static class EpgUqReferenceCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceWithoutPkRef)e).getUqReferenceCode(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceWithoutPkRef)e).setUqReferenceCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_reference_without_pk_ref";
    protected final String _tablePropertyName = "whiteUqReferenceWithoutPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_REFERENCE_WITHOUT_PK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqReferenceRefId = cci("UQ_REFERENCE_REF_ID", "UQ_REFERENCE_REF_ID", null, null, true, "uqReferenceRefId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUqReferenceCode = cci("UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", null, null, true, "uqReferenceCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqReferenceWithoutPk", null, null);

    public ColumnInfo columnUqReferenceRefId() { return _columnUqReferenceRefId; }
    public ColumnInfo columnUqReferenceCode() { return _columnUqReferenceCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqReferenceRefId());
        ls.add(columnUqReferenceCode());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteUqReferenceWithoutPk() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUqReferenceCode(), WhiteUqReferenceWithoutPkDbm.getInstance().columnUqReferenceCode());
        return cfi("FK_WHITE_UQ_REFERENCE_WITHOUT_PK_REF", "whiteUqReferenceWithoutPk", this, WhiteUqReferenceWithoutPkDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteUqReferenceWithoutPkRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteUqReferenceWithoutPkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceWithoutPkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceWithoutPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqReferenceWithoutPkRef> getEntityType() { return WhiteUqReferenceWithoutPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqReferenceWithoutPkRef newMyEntity() { return new WhiteUqReferenceWithoutPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteUqReferenceWithoutPkRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteUqReferenceWithoutPkRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
