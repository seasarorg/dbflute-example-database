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
 * The DB meta of white_uq_fk_without_pk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqFkWithoutPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkWithoutPkRefDbm _instance = new WhiteUqFkWithoutPkRefDbm();
    private WhiteUqFkWithoutPkRefDbm() {}
    public static WhiteUqFkWithoutPkRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFkToUqCode(), "fkToUqCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqFkRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPkRef)et).getUqFkRefId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPkRef)et).setUqFkRefId(ctl(vl)); }
    }
    public static class EpgFkToUqCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPkRef)et).getFkToUqCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPkRef)et).setFkToUqCode((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_fk_without_pk_ref";
    protected final String _tablePropertyName = "whiteUqFkWithoutPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_WITHOUT_PK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, true, "uqFkRefId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, true, "fkToUqCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqFkWithoutPk", null, null);

    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    public ColumnInfo columnFkToUqCode() { return _columnFkToUqCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefId());
        ls.add(columnFkToUqCode());
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
    public ForeignInfo foreignWhiteUqFkWithoutPk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkWithoutPkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_WITHOUT_PK_REF", "whiteUqFkWithoutPk", this, WhiteUqFkWithoutPkDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "whiteUqFkWithoutPkRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteUqFkWithoutPkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteUqFkWithoutPkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteUqFkWithoutPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkWithoutPkRef> getEntityType() { return WhiteUqFkWithoutPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqFkWithoutPkRef newMyEntity() { return new WhiteUqFkWithoutPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkWithoutPkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkWithoutPkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
