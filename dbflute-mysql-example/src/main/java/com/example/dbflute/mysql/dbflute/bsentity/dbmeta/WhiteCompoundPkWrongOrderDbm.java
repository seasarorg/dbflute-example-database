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
 * The DB meta of white_compound_pk_wrong_order. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkWrongOrderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkWrongOrderDbm _instance = new WhiteCompoundPkWrongOrderDbm();
    private WhiteCompoundPkWrongOrderDbm() {}
    public static WhiteCompoundPkWrongOrderDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFirstId(), "firstId");
        setupEpg(_epgMap, new EpgSecondId(), "secondId");
        setupEpg(_epgMap, new EpgThirdId(), "thirdId");
        setupEpg(_epgMap, new EpgWrongName(), "wrongName");
    }
    public static class EpgFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkWrongOrder)et).getFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkWrongOrder)et).setFirstId(cti(vl)); }
    }
    public static class EpgSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkWrongOrder)et).getSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkWrongOrder)et).setSecondId(cti(vl)); }
    }
    public static class EpgThirdId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkWrongOrder)et).getThirdId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkWrongOrder)et).setThirdId(cti(vl)); }
    }
    public static class EpgWrongName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPkWrongOrder)et).getWrongName(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPkWrongOrder)et).setWrongName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_wrong_order";
    protected final String _tablePropertyName = "whiteCompoundPkWrongOrder";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK_WRONG_ORDER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFirstId = cci("FIRST_ID", "FIRST_ID", null, null, Integer.class, "firstId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSecondId = cci("SECOND_ID", "SECOND_ID", null, null, Integer.class, "secondId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnThirdId = cci("THIRD_ID", "THIRD_ID", null, null, Integer.class, "thirdId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWrongName = cci("WRONG_NAME", "WRONG_NAME", null, null, String.class, "wrongName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstId() { return _columnFirstId; }
    /**
     * SECOND_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecondId() { return _columnSecondId; }
    /**
     * THIRD_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnThirdId() { return _columnThirdId; }
    /**
     * WRONG_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrongName() { return _columnWrongName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFirstId());
        ls.add(columnSecondId());
        ls.add(columnThirdId());
        ls.add(columnWrongName());
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
        ls.add(columnSecondId());
        ls.add(columnThirdId());
        ls.add(columnFirstId());
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkWrongOrder"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkWrongOrderCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkWrongOrderBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkWrongOrder> getEntityType() { return WhiteCompoundPkWrongOrder.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPkWrongOrder newEntity() { return new WhiteCompoundPkWrongOrder(); }
    public WhiteCompoundPkWrongOrder newMyEntity() { return new WhiteCompoundPkWrongOrder(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkWrongOrder)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkWrongOrder)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
