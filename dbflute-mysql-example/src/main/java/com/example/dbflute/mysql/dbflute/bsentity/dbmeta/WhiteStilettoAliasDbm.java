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
 * The DB meta of white_stiletto_alias. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteStilettoAliasDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteStilettoAliasDbm _instance = new WhiteStilettoAliasDbm();
    private WhiteStilettoAliasDbm() {}
    public static WhiteStilettoAliasDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgStilettoAliasId(), "stilettoAliasId");
        setupEpg(_epgMap, new EpgFoo(), "foo");
        setupEpg(_epgMap, new EpgFoo1(), "foo1");
        setupEpg(_epgMap, new EpgFoo2(), "foo2");
        setupEpg(_epgMap, new EpgFoo3(), "foo3");
        setupEpg(_epgMap, new EpgFoo4(), "foo4");
    }
    public static class EpgStilettoAliasId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAlias)et).getStilettoAliasId(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAlias)et).setStilettoAliasId(cti(vl)); }
    }
    public static class EpgFoo implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAlias)et).getFoo(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAlias)et).setFoo((String)vl); }
    }
    public static class EpgFoo1 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAlias)et).getFoo1(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAlias)et).setFoo1((String)vl); }
    }
    public static class EpgFoo2 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAlias)et).getFoo2(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAlias)et).setFoo2((String)vl); }
    }
    public static class EpgFoo3 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAlias)et).getFoo3(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAlias)et).setFoo3((String)vl); }
    }
    public static class EpgFoo4 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAlias)et).getFoo4(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAlias)et).setFoo4((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_stiletto_alias";
    protected final String _tablePropertyName = "whiteStilettoAlias";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_STILETTO_ALIAS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStilettoAliasId = cci("STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", null, null, Integer.class, "stilettoAliasId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteStilettoAliasRefList", null);
    protected final ColumnInfo _columnFoo = cci("FOO", "FOO", null, null, String.class, "foo", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo1 = cci("FOO_1", "FOO_1", null, null, String.class, "foo1", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo2 = cci("FOO2", "FOO2", null, null, String.class, "foo2", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo3 = cci("FOO_3", "FOO_3", null, null, String.class, "foo3", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo4 = cci("FOO4", "FOO4", null, null, String.class, "foo4", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStilettoAliasId() { return _columnStilettoAliasId; }
    /**
     * FOO: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo() { return _columnFoo; }
    /**
     * FOO_1: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo1() { return _columnFoo1; }
    /**
     * FOO2: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo2() { return _columnFoo2; }
    /**
     * FOO_3: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo3() { return _columnFoo3; }
    /**
     * FOO4: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo4() { return _columnFoo4; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnStilettoAliasId());
        ls.add(columnFoo());
        ls.add(columnFoo1());
        ls.add(columnFoo2());
        ls.add(columnFoo3());
        ls.add(columnFoo4());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnStilettoAliasId()); }
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
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteStilettoAliasRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStilettoAliasId(), WhiteStilettoAliasRefDbm.getInstance().columnStilettoAliasId());
        return cri("FK_WHITE_STILETTO_ALIAS_REF", "whiteStilettoAliasRefList", this, WhiteStilettoAliasRefDbm.getInstance(), mp, false, "whiteStilettoAlias");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteStilettoAlias"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteStilettoAliasCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteStilettoAliasBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteStilettoAlias> getEntityType() { return WhiteStilettoAlias.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteStilettoAlias newEntity() { return new WhiteStilettoAlias(); }
    public WhiteStilettoAlias newMyEntity() { return new WhiteStilettoAlias(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteStilettoAlias)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteStilettoAlias)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
