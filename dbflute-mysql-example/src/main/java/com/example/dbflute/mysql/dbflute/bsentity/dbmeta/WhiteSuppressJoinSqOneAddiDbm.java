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
 * The DB meta of white_suppress_join_sq_one_addi. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqOneAddiDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqOneAddiDbm _instance = new WhiteSuppressJoinSqOneAddiDbm();
    private WhiteSuppressJoinSqOneAddiDbm() {}
    public static WhiteSuppressJoinSqOneAddiDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgOneAddiId(), "oneAddiId");
        setupEpg(_epgMap, new EpgOneAddiName(), "oneAddiName");
    }
    public static class EpgOneAddiId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOneAddi)et).getOneAddiId(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOneAddi)et).setOneAddiId(cti(vl)); }
    }
    public static class EpgOneAddiName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSuppressJoinSqOneAddi)et).getOneAddiName(); }
        public void write(Entity et, Object vl) { ((WhiteSuppressJoinSqOneAddi)et).setOneAddiName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_one_addi";
    protected final String _tablePropertyName = "whiteSuppressJoinSqOneAddi";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOneAddiId = cci("ONE_ADDI_ID", "ONE_ADDI_ID", null, null, Integer.class, "oneAddiId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteSuppressJoinSqOneList", null);
    protected final ColumnInfo _columnOneAddiName = cci("ONE_ADDI_NAME", "ONE_ADDI_NAME", null, null, String.class, "oneAddiName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneAddiId() { return _columnOneAddiId; }
    /**
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneAddiName() { return _columnOneAddiName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnOneAddiId());
        ls.add(columnOneAddiName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnOneAddiId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_suppress_join_sq_one by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSuppressJoinSqOneList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOneAddiId(), WhiteSuppressJoinSqOneDbm.getInstance().columnOneAddiId());
        return cri("FK_WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI_TEST", "whiteSuppressJoinSqOneList", this, WhiteSuppressJoinSqOneDbm.getInstance(), mp, false, "whiteSuppressJoinSqOneAddi");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqOneAddi"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqOneAddiCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqOneAddiBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqOneAddi> getEntityType() { return WhiteSuppressJoinSqOneAddi.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqOneAddi newEntity() { return new WhiteSuppressJoinSqOneAddi(); }
    public WhiteSuppressJoinSqOneAddi newMyEntity() { return new WhiteSuppressJoinSqOneAddi(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqOneAddi)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqOneAddi)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
