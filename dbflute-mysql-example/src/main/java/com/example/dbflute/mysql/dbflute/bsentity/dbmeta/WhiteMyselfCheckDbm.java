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
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of white_myself_check. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteMyselfCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteMyselfCheckDbm _instance = new WhiteMyselfCheckDbm();
    private WhiteMyselfCheckDbm() {}
    public static WhiteMyselfCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMyselfCheckId(), "myselfCheckId");
        setupEpg(_epgMap, new EpgMyselfCheckName(), "myselfCheckName");
        setupEpg(_epgMap, new EpgMyselfId(), "myselfId");
    }
    public static class EpgMyselfCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteMyselfCheck)et).getMyselfCheckId(); }
        public void write(Entity et, Object vl) { ((WhiteMyselfCheck)et).setMyselfCheckId(cti(vl)); }
    }
    public static class EpgMyselfCheckName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteMyselfCheck)et).getMyselfCheckName(); }
        public void write(Entity et, Object vl) { ((WhiteMyselfCheck)et).setMyselfCheckName((String)vl); }
    }
    public static class EpgMyselfId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteMyselfCheck)et).getMyselfId(); }
        public void write(Entity et, Object vl) { ((WhiteMyselfCheck)et).setMyselfId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteMyself(), "whiteMyself");
    }
    public class EfpgWhiteMyself implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteMyselfCheck)et).getWhiteMyself(); }
        public void write(Entity et, Object vl) { ((WhiteMyselfCheck)et).setWhiteMyself((WhiteMyself)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_myself_check";
    protected final String _tablePropertyName = "whiteMyselfCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_MYSELF_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMyselfCheckId = cci("MYSELF_CHECK_ID", "MYSELF_CHECK_ID", null, null, Integer.class, "myselfCheckId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfCheckName = cci("MYSELF_CHECK_NAME", "MYSELF_CHECK_NAME", null, null, String.class, "myselfCheckName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, Integer.class, "myselfId", null, false, false, false, "INT", 10, 0, null, false, null, null, "whiteMyself", null, null);

    /**
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfCheckId() { return _columnMyselfCheckId; }
    /**
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfCheckName() { return _columnMyselfCheckName; }
    /**
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfId() { return _columnMyselfId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMyselfCheckId());
        ls.add(columnMyselfCheckName());
        ls.add(columnMyselfId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMyselfCheckId()); }
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
     * white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteMyself() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyselfId(), WhiteMyselfDbm.getInstance().columnMyselfId());
        return cfi("FK_WHITE_MYSELF_CHECK_SELF", "whiteMyself", this, WhiteMyselfDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteMyselfCheckList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteMyselfCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteMyselfCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteMyselfCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteMyselfCheck> getEntityType() { return WhiteMyselfCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteMyselfCheck newEntity() { return new WhiteMyselfCheck(); }
    public WhiteMyselfCheck newMyEntity() { return new WhiteMyselfCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteMyselfCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteMyselfCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
