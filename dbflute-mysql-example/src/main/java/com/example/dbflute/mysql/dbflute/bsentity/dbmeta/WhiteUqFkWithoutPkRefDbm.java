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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqFkRefId(), "uqFkRefId");
        setupEpg(_epgMap, new EpgFkToUqCode(), "fkToUqCode");
    }
    public static class EpgUqFkRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPkRef)et).getUqFkRefId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPkRef)et).setUqFkRefId(ctl(vl)); }
    }
    public static class EpgFkToUqCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPkRef)et).getFkToUqCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPkRef)et).setFkToUqCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteUqFkWithoutPk(), "whiteUqFkWithoutPk");
    }
    public class EfpgWhiteUqFkWithoutPk implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkWithoutPkRef)et).getWhiteUqFkWithoutPk(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkWithoutPkRef)et).setWhiteUqFkWithoutPk((WhiteUqFkWithoutPk)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, Long.class, "uqFkRefId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, String.class, "fkToUqCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "whiteUqFkWithoutPk", null, null);

    /**
     * UQ_FK_REF_ID: {NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    /**
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk_without_pk}
     * @return The information object of specified column. (NotNull)
     */
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_uq_fk_without_pk by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkWithoutPk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkWithoutPkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_WITHOUT_PK_REF", "whiteUqFkWithoutPk", this, WhiteUqFkWithoutPkDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteUqFkWithoutPkRefList");
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
    public WhiteUqFkWithoutPkRef newEntity() { return new WhiteUqFkWithoutPkRef(); }
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
